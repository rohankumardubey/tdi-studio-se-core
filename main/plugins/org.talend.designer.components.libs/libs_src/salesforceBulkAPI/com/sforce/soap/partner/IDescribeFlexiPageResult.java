package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeFlexiPageResult  {

      /**
       * element : id of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String
       */

      public java.lang.String getId();

      public void setId(java.lang.String id);

      /**
       * element : label of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getLabel();

      public void setLabel(java.lang.String label);

      /**
       * element : name of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getName();

      public void setName(java.lang.String name);

      /**
       * element : quickActionList of type {urn:partner.soap.sforce.com}DescribeQuickActionListResult
       * java type: com.sforce.soap.partner.DescribeQuickActionListResult
       */

      public com.sforce.soap.partner.IDescribeQuickActionListResult getQuickActionList();

      public void setQuickActionList(com.sforce.soap.partner.IDescribeQuickActionListResult quickActionList);

      /**
       * element : regions of type {urn:partner.soap.sforce.com}DescribeFlexiPageRegion
       * java type: com.sforce.soap.partner.DescribeFlexiPageRegion[]
       */

      public com.sforce.soap.partner.IDescribeFlexiPageRegion[] getRegions();

      public void setRegions(com.sforce.soap.partner.IDescribeFlexiPageRegion[] regions);

      /**
       * element : sobjectType of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getSobjectType();

      public void setSobjectType(java.lang.String sobjectType);

      /**
       * element : template of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getTemplate();

      public void setTemplate(java.lang.String template);

      /**
       * element : type of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getType();

      public void setType(java.lang.String type);


}
