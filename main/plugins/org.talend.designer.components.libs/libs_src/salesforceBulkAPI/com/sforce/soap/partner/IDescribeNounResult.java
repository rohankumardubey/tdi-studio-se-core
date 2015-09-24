package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeNounResult  {

      /**
       * element : caseValues of type {urn:partner.soap.sforce.com}NameCaseValue
       * java type: com.sforce.soap.partner.NameCaseValue[]
       */

      public com.sforce.soap.partner.INameCaseValue[] getCaseValues();

      public void setCaseValues(com.sforce.soap.partner.INameCaseValue[] caseValues);

      /**
       * element : developerName of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getDeveloperName();

      public void setDeveloperName(java.lang.String developerName);

      /**
       * element : gender of type {urn:partner.soap.sforce.com}Gender
       * java type: com.sforce.soap.partner.Gender
       */

      public com.sforce.soap.partner.Gender getGender();

      public void setGender(com.sforce.soap.partner.Gender gender);

      /**
       * element : name of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getName();

      public void setName(java.lang.String name);

      /**
       * element : pluralAlias of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getPluralAlias();

      public void setPluralAlias(java.lang.String pluralAlias);

      /**
       * element : startsWith of type {urn:partner.soap.sforce.com}StartsWith
       * java type: com.sforce.soap.partner.StartsWith
       */

      public com.sforce.soap.partner.StartsWith getStartsWith();

      public void setStartsWith(com.sforce.soap.partner.StartsWith startsWith);


}
