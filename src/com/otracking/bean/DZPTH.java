/**
 * DZPTH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.otracking.bean;

public class DZPTH  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String dms_id;

    private java.lang.String headingline;

    private int order_id;

    private int sequence;

    public DZPTH() {
    }

    public DZPTH(
           java.lang.String description,
           java.lang.String dms_id,
           java.lang.String headingline,
           int order_id,
           int sequence) {
           this.description = description;
           this.dms_id = dms_id;
           this.headingline = headingline;
           this.order_id = order_id;
           this.sequence = sequence;
    }


    /**
     * Gets the description value for this DZPTH.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DZPTH.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dms_id value for this DZPTH.
     * 
     * @return dms_id
     */
    public java.lang.String getDms_id() {
        return dms_id;
    }


    /**
     * Sets the dms_id value for this DZPTH.
     * 
     * @param dms_id
     */
    public void setDms_id(java.lang.String dms_id) {
        this.dms_id = dms_id;
    }


    /**
     * Gets the headingline value for this DZPTH.
     * 
     * @return headingline
     */
    public java.lang.String getHeadingline() {
        return headingline;
    }


    /**
     * Sets the headingline value for this DZPTH.
     * 
     * @param headingline
     */
    public void setHeadingline(java.lang.String headingline) {
        this.headingline = headingline;
    }


    /**
     * Gets the order_id value for this DZPTH.
     * 
     * @return order_id
     */
    public int getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this DZPTH.
     * 
     * @param order_id
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the sequence value for this DZPTH.
     * 
     * @return sequence
     */
    public int getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this DZPTH.
     * 
     * @param sequence
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DZPTH)) return false;
        DZPTH other = (DZPTH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dms_id==null && other.getDms_id()==null) || 
             (this.dms_id!=null &&
              this.dms_id.equals(other.getDms_id()))) &&
            ((this.headingline==null && other.getHeadingline()==null) || 
             (this.headingline!=null &&
              this.headingline.equals(other.getHeadingline()))) &&
            this.order_id == other.getOrder_id() &&
            this.sequence == other.getSequence();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDms_id() != null) {
            _hashCode += getDms_id().hashCode();
        }
        if (getHeadingline() != null) {
            _hashCode += getHeadingline().hashCode();
        }
        _hashCode += getOrder_id();
        _hashCode += getSequence();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DZPTH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.otracking.com", "DZPTH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dms_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "dms_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headingline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "headingline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
