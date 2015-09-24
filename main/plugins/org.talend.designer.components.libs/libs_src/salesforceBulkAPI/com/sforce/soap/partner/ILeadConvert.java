package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface ILeadConvert  {

      /**
       * element : accountId of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String
       */

      public java.lang.String getAccountId();

      public void setAccountId(java.lang.String accountId);

      /**
       * element : contactId of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String
       */

      public java.lang.String getContactId();

      public void setContactId(java.lang.String contactId);

      /**
       * element : convertedStatus of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getConvertedStatus();

      public void setConvertedStatus(java.lang.String convertedStatus);

      /**
       * element : doNotCreateOpportunity of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getDoNotCreateOpportunity();

      public boolean isDoNotCreateOpportunity();

      public void setDoNotCreateOpportunity(boolean doNotCreateOpportunity);

      /**
       * element : leadId of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String
       */

      public java.lang.String getLeadId();

      public void setLeadId(java.lang.String leadId);

      /**
       * element : opportunityName of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getOpportunityName();

      public void setOpportunityName(java.lang.String opportunityName);

      /**
       * element : overwriteLeadSource of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getOverwriteLeadSource();

      public boolean isOverwriteLeadSource();

      public void setOverwriteLeadSource(boolean overwriteLeadSource);

      /**
       * element : ownerId of type {urn:partner.soap.sforce.com}ID
       * java type: java.lang.String
       */

      public java.lang.String getOwnerId();

      public void setOwnerId(java.lang.String ownerId);

      /**
       * element : sendNotificationEmail of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getSendNotificationEmail();

      public boolean isSendNotificationEmail();

      public void setSendNotificationEmail(boolean sendNotificationEmail);


}
