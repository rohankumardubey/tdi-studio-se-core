package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ProcessResult implements com.sforce.ws.bind.XMLizable , IProcessResult{

    /**
     * Constructor
     */
    public ProcessResult() {}

    /**
     * element : actorIds of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo actorIds__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","actorIds","urn:partner.soap.sforce.com","ID",0,-1,true);

    private boolean actorIds__is_set = false;

    private java.lang.String[] actorIds = new java.lang.String[0];

    @Override
    public java.lang.String[] getActorIds() {
      return actorIds;
    }

    @Override
    public void setActorIds(java.lang.String[] actorIds) {
      this.actorIds = castArray(java.lang.String.class, actorIds);
      actorIds__is_set = true;
    }

    protected void setActorIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, actorIds__typeInfo)) {
        setActorIds((java.lang.String[])__typeMapper.readObject(__in, actorIds__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : entityId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo entityId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","entityId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean entityId__is_set = false;

    private java.lang.String entityId;

    @Override
    public java.lang.String getEntityId() {
      return entityId;
    }

    @Override
    public void setEntityId(java.lang.String entityId) {
      this.entityId = entityId;
      entityId__is_set = true;
    }

    protected void setEntityId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, entityId__typeInfo)) {
        setEntityId(__typeMapper.readString(__in, entityId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : errors of type {urn:partner.soap.sforce.com}Error
     * java type: com.sforce.soap.partner.Error[]
     */
    private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","errors","urn:partner.soap.sforce.com","Error",0,-1,true);

    private boolean errors__is_set = false;

    private com.sforce.soap.partner.Error[] errors = new com.sforce.soap.partner.Error[0];

    @Override
    public com.sforce.soap.partner.Error[] getErrors() {
      return errors;
    }

    @Override
    public void setErrors(com.sforce.soap.partner.IError[] errors) {
      this.errors = castArray(com.sforce.soap.partner.Error.class, errors);
      errors__is_set = true;
    }

    protected void setErrors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, errors__typeInfo)) {
        setErrors((com.sforce.soap.partner.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.partner.Error[].class));
      }
    }

    /**
     * element : instanceId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo instanceId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","instanceId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean instanceId__is_set = false;

    private java.lang.String instanceId;

    @Override
    public java.lang.String getInstanceId() {
      return instanceId;
    }

    @Override
    public void setInstanceId(java.lang.String instanceId) {
      this.instanceId = instanceId;
      instanceId__is_set = true;
    }

    protected void setInstanceId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, instanceId__typeInfo)) {
        setInstanceId(__typeMapper.readString(__in, instanceId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : instanceStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo instanceStatus__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","instanceStatus","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean instanceStatus__is_set = false;

    private java.lang.String instanceStatus;

    @Override
    public java.lang.String getInstanceStatus() {
      return instanceStatus;
    }

    @Override
    public void setInstanceStatus(java.lang.String instanceStatus) {
      this.instanceStatus = instanceStatus;
      instanceStatus__is_set = true;
    }

    protected void setInstanceStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, instanceStatus__typeInfo)) {
        setInstanceStatus(__typeMapper.readString(__in, instanceStatus__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : newWorkitemIds of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo newWorkitemIds__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","newWorkitemIds","urn:partner.soap.sforce.com","ID",0,-1,true);

    private boolean newWorkitemIds__is_set = false;

    private java.lang.String[] newWorkitemIds = new java.lang.String[0];

    @Override
    public java.lang.String[] getNewWorkitemIds() {
      return newWorkitemIds;
    }

    @Override
    public void setNewWorkitemIds(java.lang.String[] newWorkitemIds) {
      this.newWorkitemIds = castArray(java.lang.String.class, newWorkitemIds);
      newWorkitemIds__is_set = true;
    }

    protected void setNewWorkitemIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, newWorkitemIds__typeInfo)) {
        setNewWorkitemIds((java.lang.String[])__typeMapper.readObject(__in, newWorkitemIds__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean success__is_set = false;

    private boolean success;

    @Override
    public boolean getSuccess() {
      return success;
    }

    @Override
    public boolean isSuccess() {
      return success;
    }

    @Override
    public void setSuccess(boolean success) {
      this.success = success;
      success__is_set = true;
    }

    protected void setSuccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, success__typeInfo)) {
        setSuccess(__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       __typeMapper.writeObject(__out, actorIds__typeInfo, actorIds, actorIds__is_set);
       __typeMapper.writeString(__out, entityId__typeInfo, entityId, entityId__is_set);
       __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
       __typeMapper.writeString(__out, instanceId__typeInfo, instanceId, instanceId__is_set);
       __typeMapper.writeString(__out, instanceStatus__typeInfo, instanceStatus, instanceStatus__is_set);
       __typeMapper.writeObject(__out, newWorkitemIds__typeInfo, newWorkitemIds, newWorkitemIds__is_set);
       __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        setActorIds(__in, __typeMapper);
        setEntityId(__in, __typeMapper);
        setErrors(__in, __typeMapper);
        setInstanceId(__in, __typeMapper);
        setInstanceStatus(__in, __typeMapper);
        setNewWorkitemIds(__in, __typeMapper);
        setSuccess(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ProcessResult ");
      sb.append(" actorIds='").append(com.sforce.ws.util.Verbose.toString(actorIds)).append("'\n");
      sb.append(" entityId='").append(com.sforce.ws.util.Verbose.toString(entityId)).append("'\n");
      sb.append(" errors='").append(com.sforce.ws.util.Verbose.toString(errors)).append("'\n");
      sb.append(" instanceId='").append(com.sforce.ws.util.Verbose.toString(instanceId)).append("'\n");
      sb.append(" instanceStatus='").append(com.sforce.ws.util.Verbose.toString(instanceStatus)).append("'\n");
      sb.append(" newWorkitemIds='").append(com.sforce.ws.util.Verbose.toString(newWorkitemIds)).append("'\n");
      sb.append(" success='").append(com.sforce.ws.util.Verbose.toString(success)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private <T,U> T[] castArray(Class<T> clazz, U[] array) {
        if (array == null) {
            return null;
        }
        T[] retVal = (T[]) java.lang.reflect.Array.newInstance(clazz, array.length);
        for (int i=0; i < array.length; i++) {
            retVal[i] = (T)array[i];
        }

        return retVal;
	}
}
