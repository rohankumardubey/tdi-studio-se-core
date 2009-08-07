// ============================================================================
//
// Copyright (C) 2006-2009 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.actions.metadata;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.ui.image.ImageProvider;
import org.talend.core.model.properties.XmlFileConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.RepositoryManager;
import org.talend.core.ui.images.ECoreImage;
import org.talend.core.ui.images.OverlayImageProvider;
import org.talend.repository.ProjectManager;
import org.talend.repository.i18n.Messages;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.ProxyRepositoryFactory;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNode.EProperties;
import org.talend.repository.ui.wizards.metadata.connection.files.xml.XmlFileWizard;

/**
 * DOC cantoine class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class CreateFileXmlAction extends AbstractCreateAction {

    private static final String EDIT_LABEL = Messages.getString("CreateFileXmlAction.action.editTitle"); //$NON-NLS-1$

    private static final String OPEN_LABEL = Messages.getString("CreateFileXmlAction.action.openTitle"); //$NON-NLS-1$

    private static final String CREATE_LABEL = Messages.getString("CreateFileXmlAction.action.createTitle"); //$NON-NLS-1$

    protected static final int WIZARD_WIDTH = 800;

    protected static final int WIZARD_HEIGHT = 600;

    private boolean creation = false;

    ImageDescriptor defaultImage = ImageProvider.getImageDesc(ECoreImage.METADATA_FILE_XML_ICON);

    ImageDescriptor createImage = OverlayImageProvider.getImageWithNew(ImageProvider.getImage(ECoreImage.METADATA_FILE_XML_ICON));

    /**
     * DOC cantoine CreateFileXmlAction constructor comment.
     * 
     * @param viewer
     */
    public CreateFileXmlAction() {
        super();

        this.setText(CREATE_LABEL);
        this.setToolTipText(CREATE_LABEL);
        this.setImageDescriptor(defaultImage);
    }

    public CreateFileXmlAction(boolean isToolbar) {
        super();
        setToolbar(isToolbar);
        this.setText(CREATE_LABEL);
        this.setToolTipText(CREATE_LABEL);
        this.setImageDescriptor(defaultImage);
    }

    protected void doRun() {
        // RepositoryNode metadataNode = getViewPart().getRoot().getChildren().get(6);
        // RepositoryNode fileXMLNode = metadataNode.getChildren().get(4);
        RepositoryNode fileXMLNode = getCurrentRepositoryNode();

        if (isToolbar()) {
            if (fileXMLNode != null && fileXMLNode.getContentType() != ERepositoryObjectType.METADATA_FILE_XML) {
                fileXMLNode = null;
            }
            if (fileXMLNode == null) {
                fileXMLNode = getRepositoryNodeForDefault(ERepositoryObjectType.METADATA_FILE_XML);
            }
        }
        ISelection selection = null;
        WizardDialog wizardDialog;
        if (isToolbar()) {
            init(fileXMLNode);
            XmlFileWizard xmlFileWizard = new XmlFileWizard(PlatformUI.getWorkbench(), creation, fileXMLNode, getExistingNames());
            xmlFileWizard.setToolbar(true);
            wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), xmlFileWizard);
        } else {
            selection = getSelection();
            wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), new XmlFileWizard(PlatformUI.getWorkbench(),
                    creation, selection, getExistingNames()));
        }

        //        
        wizardDialog.setPageSize(WIZARD_WIDTH, WIZARD_HEIGHT);
        wizardDialog.create();
        wizardDialog.open();
        RepositoryManager.refreshCreatedNode(ERepositoryObjectType.METADATA_FILE_XML);

    }

    public Class getClassForDoubleClick() {
        return XmlFileConnectionItem.class;
    }

    protected void init(RepositoryNode node) {
        ERepositoryObjectType nodeType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (!ERepositoryObjectType.METADATA_FILE_XML.equals(nodeType)) {
            return;
        }

        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        switch (node.getType()) {
        case SIMPLE_FOLDER:
        case SYSTEM_FOLDER:
            if (factory.isUserReadOnlyOnCurrentProject() || !ProjectManager.getInstance().isInCurrentMainProject(node)) {
                setEnabled(false);
                return;
            }
            this.setText(CREATE_LABEL);
            collectChildNames(node);
            creation = true;
            this.setImageDescriptor(createImage);
            break;
        case REPOSITORY_ELEMENT:
            if (factory.isPotentiallyEditable(node.getObject())) {
                this.setText(EDIT_LABEL);
                this.setImageDescriptor(defaultImage);
                collectSiblingNames(node);
            } else {
                this.setText(OPEN_LABEL);
                this.setImageDescriptor(defaultImage);
            }
            collectSiblingNames(node);
            creation = false;
            break;
        }
        setEnabled(true);
    }
}
