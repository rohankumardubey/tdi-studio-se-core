package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IEmailFileAttachment  {

      /**
       * element : body of type {http://www.w3.org/2001/XMLSchema}base64Binary
       * java type: byte[]
       */

      public byte[] getBody();

      public void setBody(byte[] body);

      /**
       * element : contentType of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getContentType();

      public void setContentType(java.lang.String contentType);

      /**
       * element : fileName of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getFileName();

      public void setFileName(java.lang.String fileName);

      /**
       * element : inline of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getInline();

      public boolean isInline();

      public void setInline(boolean inline);


}
