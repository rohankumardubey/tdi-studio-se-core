package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IMatchResult  {

      /**
       * element : errors of type {urn:partner.soap.sforce.com}Error
       * java type: com.sforce.soap.partner.Error[]
       */

      public com.sforce.soap.partner.IError[] getErrors();

      public void setErrors(com.sforce.soap.partner.IError[] errors);

      /**
       * element : entityType of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getEntityType();

      public void setEntityType(java.lang.String entityType);

      /**
       * element : matchEngine of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getMatchEngine();

      public void setMatchEngine(java.lang.String matchEngine);

      /**
       * element : matchRecords of type {urn:partner.soap.sforce.com}MatchRecord
       * java type: com.sforce.soap.partner.MatchRecord[]
       */

      public com.sforce.soap.partner.IMatchRecord[] getMatchRecords();

      public void setMatchRecords(com.sforce.soap.partner.IMatchRecord[] matchRecords);

      /**
       * element : rule of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getRule();

      public void setRule(java.lang.String rule);

      /**
       * element : size of type {http://www.w3.org/2001/XMLSchema}int
       * java type: int
       */

      public int getSize();

      public void setSize(int size);

      /**
       * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getSuccess();

      public boolean isSuccess();

      public void setSuccess(boolean success);


}
