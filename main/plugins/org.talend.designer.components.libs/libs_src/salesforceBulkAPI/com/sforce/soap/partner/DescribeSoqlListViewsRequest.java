package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DescribeSoqlListViewsRequest implements com.sforce.ws.bind.XMLizable , IDescribeSoqlListViewsRequest{

    /**
     * Constructor
     */
    public DescribeSoqlListViewsRequest() {}

    /**
     * element : listViewParams of type {urn:partner.soap.sforce.com}DescribeSoqlListViewParams
     * java type: com.sforce.soap.partner.DescribeSoqlListViewParams[]
     */
    private static final com.sforce.ws.bind.TypeInfo listViewParams__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","listViewParams","urn:partner.soap.sforce.com","DescribeSoqlListViewParams",1,-1,true);

    private boolean listViewParams__is_set = false;

    private com.sforce.soap.partner.DescribeSoqlListViewParams[] listViewParams = new com.sforce.soap.partner.DescribeSoqlListViewParams[0];

    @Override
    public com.sforce.soap.partner.DescribeSoqlListViewParams[] getListViewParams() {
      return listViewParams;
    }

    @Override
    public void setListViewParams(com.sforce.soap.partner.IDescribeSoqlListViewParams[] listViewParams) {
      this.listViewParams = castArray(com.sforce.soap.partner.DescribeSoqlListViewParams.class, listViewParams);
      listViewParams__is_set = true;
    }

    protected void setListViewParams(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, listViewParams__typeInfo)) {
        setListViewParams((com.sforce.soap.partner.DescribeSoqlListViewParams[])__typeMapper.readObject(__in, listViewParams__typeInfo, com.sforce.soap.partner.DescribeSoqlListViewParams[].class));
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
       __typeMapper.writeObject(__out, listViewParams__typeInfo, listViewParams, listViewParams__is_set);
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
        setListViewParams(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DescribeSoqlListViewsRequest ");
      sb.append(" listViewParams='").append(com.sforce.ws.util.Verbose.toString(listViewParams)).append("'\n");
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
