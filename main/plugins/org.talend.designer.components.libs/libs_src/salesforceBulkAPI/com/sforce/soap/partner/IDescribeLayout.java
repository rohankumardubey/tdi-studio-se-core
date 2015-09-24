package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeLayout  {

      /**
       * element : buttonLayoutSection of type {urn:partner.soap.sforce.com}DescribeLayoutButtonSection
       * java type: com.sforce.soap.partner.DescribeLayoutButtonSection
       */

      public com.sforce.soap.partner.IDescribeLayoutButtonSection getButtonLayoutSection();

      public void setButtonLayoutSection(com.sforce.soap.partner.IDescribeLayoutButtonSection buttonLayoutSection);

      /**
       * element : detailLayoutSections of type {urn:partner.soap.sforce.com}DescribeLayoutSection
       * java type: com.sforce.soap.partner.DescribeLayoutSection[]
       */

      public com.sforce.soap.partner.IDescribeLayoutSection[] getDetailLayoutSections();

      public void setDetailLayoutSections(com.sforce.soap.partner.IDescribeLayoutSection[] detailLayoutSections);

      /**
       * element : editLayoutSections of type {urn:partner.soap.sforce.com}DescribeLayoutSection
       * java type: com.sforce.soap.partner.DescribeLayoutSection[]
       */

      public com.sforce.soap.partner.IDescribeLayoutSection[] getEditLayoutSections();

      public void setEditLayoutSections(com.sforce.soap.partner.IDescribeLayoutSection[] editLayoutSections);

      /**
       * element : feedView of type {urn:partner.soap.sforce.com}DescribeLayoutFeedView
       * java type: com.sforce.soap.partner.DescribeLayoutFeedView
       */

      public com.sforce.soap.partner.IDescribeLayoutFeedView getFeedView();

      public void setFeedView(com.sforce.soap.partner.IDescribeLayoutFeedView feedView);

      /**
       * element : highlightsPanelLayoutSection of type {urn:partner.soap.sforce.com}DescribeLayoutSection
       * java type: com.sforce.soap.partner.DescribeLayoutSection
       */

      public com.sforce.soap.partner.IDescribeLayoutSection getHighlightsPanelLayoutSection();

      public void setHighlightsPanelLayoutSection(com.sforce.soap.partner.IDescribeLayoutSection highlightsPanelLayoutSection);

      /**
       * element : id of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String
       */

      public java.lang.String getId();

      public void setId(java.lang.String id);

      /**
       * element : quickActionList of type {urn:partner.soap.sforce.com}DescribeQuickActionListResult
       * java type: com.sforce.soap.partner.DescribeQuickActionListResult
       */

      public com.sforce.soap.partner.IDescribeQuickActionListResult getQuickActionList();

      public void setQuickActionList(com.sforce.soap.partner.IDescribeQuickActionListResult quickActionList);

      /**
       * element : relatedContent of type {urn:partner.soap.sforce.com}RelatedContent
       * java type: com.sforce.soap.partner.RelatedContent
       */

      public com.sforce.soap.partner.IRelatedContent getRelatedContent();

      public void setRelatedContent(com.sforce.soap.partner.IRelatedContent relatedContent);

      /**
       * element : relatedLists of type {urn:partner.soap.sforce.com}RelatedList
       * java type: com.sforce.soap.partner.RelatedList[]
       */

      public com.sforce.soap.partner.IRelatedList[] getRelatedLists();

      public void setRelatedLists(com.sforce.soap.partner.IRelatedList[] relatedLists);


}
