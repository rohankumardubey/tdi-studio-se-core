// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.designer.core.ui.views.modules;

import org.eclipse.swt.graphics.Image;
import org.talend.commons.ui.swt.tableviewer.behavior.IColumnImageProvider;
import org.talend.core.ui.ImageProvider;
import org.talend.core.ui.ImageProvider.EImage;
import org.talend.designer.core.model.components.ComponentImportNeeds;

/**
 * DOC smallet class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class StatusImageProvider implements IColumnImageProvider {

    public Image getImage(Object bean) {
        ComponentImportNeeds componentImportNeeds = (ComponentImportNeeds) bean;
        switch (componentImportNeeds.getStatus()) {
        case ComponentImportNeeds.INSTALLED:
            return ImageProvider.getImage(EImage.MODULE_INSTALLED_ICON);
        case ComponentImportNeeds.NOT_INSTALLED:
            if (componentImportNeeds.isRequired()) {
                return ImageProvider.getImage(EImage.MODULE_ERROR_ICON);
            } else {
                return ImageProvider.getImage(EImage.MODULE_WARNING_ICON);
            }
        default:
            return ImageProvider.getImage(EImage.MODULE_UNKNOWN_ICON);
        }
    }

}
