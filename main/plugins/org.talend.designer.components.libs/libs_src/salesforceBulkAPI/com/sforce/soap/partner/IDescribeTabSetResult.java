package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeTabSetResult  {

      /**
       * element : label of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getLabel();

      public void setLabel(java.lang.String label);

      /**
       * element : logoUrl of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getLogoUrl();

      public void setLogoUrl(java.lang.String logoUrl);

      /**
       * element : namespace of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getNamespace();

      public void setNamespace(java.lang.String namespace);

      /**
       * element : selected of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getSelected();

      public boolean isSelected();

      public void setSelected(boolean selected);

      /**
       * element : tabSetId of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getTabSetId();

      public void setTabSetId(java.lang.String tabSetId);

      /**
       * element : tabs of type {urn:partner.soap.sforce.com}DescribeTab
       * java type: com.sforce.soap.partner.DescribeTab[]
       */

      public com.sforce.soap.partner.IDescribeTab[] getTabs();

      public void setTabs(com.sforce.soap.partner.IDescribeTab[] tabs);


}
