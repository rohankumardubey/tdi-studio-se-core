package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IUpsert_element  {

      /**
       * element : externalIDFieldName of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getExternalIDFieldName();

      public void setExternalIDFieldName(java.lang.String externalIDFieldName);

      /**
       * element : sObjects of type {urn:sobject.partner.soap.sforce.com}sObject
       * java type: com.sforce.soap.partner.sobject.SObject[]
       */

      public com.sforce.soap.partner.sobject.ISObject[] getSObjects();

      public void setSObjects(com.sforce.soap.partner.sobject.ISObject[] sObjects);


}
