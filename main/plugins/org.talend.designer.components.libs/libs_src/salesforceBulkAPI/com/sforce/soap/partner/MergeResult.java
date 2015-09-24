package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class MergeResult implements com.sforce.ws.bind.XMLizable , IMergeResult{

    /**
     * Constructor
     */
    public MergeResult() {}

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
     * element : id of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","id","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean id__is_set = false;

    private java.lang.String id;

    @Override
    public java.lang.String getId() {
      return id;
    }

    @Override
    public void setId(java.lang.String id) {
      this.id = id;
      id__is_set = true;
    }

    protected void setId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, id__typeInfo)) {
        setId(__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : mergedRecordIds of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo mergedRecordIds__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","mergedRecordIds","urn:partner.soap.sforce.com","ID",0,-1,true);

    private boolean mergedRecordIds__is_set = false;

    private java.lang.String[] mergedRecordIds = new java.lang.String[0];

    @Override
    public java.lang.String[] getMergedRecordIds() {
      return mergedRecordIds;
    }

    @Override
    public void setMergedRecordIds(java.lang.String[] mergedRecordIds) {
      this.mergedRecordIds = castArray(java.lang.String.class, mergedRecordIds);
      mergedRecordIds__is_set = true;
    }

    protected void setMergedRecordIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, mergedRecordIds__typeInfo)) {
        setMergedRecordIds((java.lang.String[])__typeMapper.readObject(__in, mergedRecordIds__typeInfo, java.lang.String[].class));
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
     * element : updatedRelatedIds of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo updatedRelatedIds__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","updatedRelatedIds","urn:partner.soap.sforce.com","ID",0,-1,true);

    private boolean updatedRelatedIds__is_set = false;

    private java.lang.String[] updatedRelatedIds = new java.lang.String[0];

    @Override
    public java.lang.String[] getUpdatedRelatedIds() {
      return updatedRelatedIds;
    }

    @Override
    public void setUpdatedRelatedIds(java.lang.String[] updatedRelatedIds) {
      this.updatedRelatedIds = castArray(java.lang.String.class, updatedRelatedIds);
      updatedRelatedIds__is_set = true;
    }

    protected void setUpdatedRelatedIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, updatedRelatedIds__typeInfo)) {
        setUpdatedRelatedIds((java.lang.String[])__typeMapper.readObject(__in, updatedRelatedIds__typeInfo, java.lang.String[].class));
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
       __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
       __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
       __typeMapper.writeObject(__out, mergedRecordIds__typeInfo, mergedRecordIds, mergedRecordIds__is_set);
       __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
       __typeMapper.writeObject(__out, updatedRelatedIds__typeInfo, updatedRelatedIds, updatedRelatedIds__is_set);
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
        setErrors(__in, __typeMapper);
        setId(__in, __typeMapper);
        setMergedRecordIds(__in, __typeMapper);
        setSuccess(__in, __typeMapper);
        setUpdatedRelatedIds(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[MergeResult ");
      sb.append(" errors='").append(com.sforce.ws.util.Verbose.toString(errors)).append("'\n");
      sb.append(" id='").append(com.sforce.ws.util.Verbose.toString(id)).append("'\n");
      sb.append(" mergedRecordIds='").append(com.sforce.ws.util.Verbose.toString(mergedRecordIds)).append("'\n");
      sb.append(" success='").append(com.sforce.ws.util.Verbose.toString(success)).append("'\n");
      sb.append(" updatedRelatedIds='").append(com.sforce.ws.util.Verbose.toString(updatedRelatedIds)).append("'\n");
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
