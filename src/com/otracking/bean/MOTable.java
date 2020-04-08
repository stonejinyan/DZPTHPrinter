/**
 * MOTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.otracking.bean;

public class MOTable  extends com.otracking.bean.MO  implements java.io.Serializable {
    private java.lang.String SO;

    private java.lang.String WBS;

    private java.lang.String batch_name;

    private int order_id;

    private java.lang.String order_name;

    private java.lang.String processline;

    private int processline_id;

    private java.lang.String product_bigtype_name;

    private java.lang.String product_type_name;

    public MOTable() {
    }

    public MOTable(
           java.util.Calendar actual_endtime,
           java.util.Calendar actual_starttime,
           int batch_id,
           java.lang.String customID,
           java.lang.String description,
           java.lang.String dms_id,
           int ekitting,
           int id,
           java.lang.String name,
           int no,
           int product_type_id,
           double quantity,
           java.util.Calendar schedule_endtime,
           java.util.Calendar schedule_starttime,
           int scheduling,
           java.lang.String securityCode,
           java.lang.String SO,
           java.lang.String WBS,
           java.lang.String batch_name,
           int order_id,
           java.lang.String order_name,
           java.lang.String processline,
           int processline_id,
           java.lang.String product_bigtype_name,
           java.lang.String product_type_name) {
        super(
            actual_endtime,
            actual_starttime,
            batch_id,
            customID,
            description,
            dms_id,
            ekitting,
            id,
            name,
            no,
            product_type_id,
            quantity,
            schedule_endtime,
            schedule_starttime,
            scheduling,
            securityCode);
        this.SO = SO;
        this.WBS = WBS;
        this.batch_name = batch_name;
        this.order_id = order_id;
        this.order_name = order_name;
        this.processline = processline;
        this.processline_id = processline_id;
        this.product_bigtype_name = product_bigtype_name;
        this.product_type_name = product_type_name;
    }


    /**
     * Gets the SO value for this MOTable.
     * 
     * @return SO
     */
    public java.lang.String getSO() {
        return SO;
    }


    /**
     * Sets the SO value for this MOTable.
     * 
     * @param SO
     */
    public void setSO(java.lang.String SO) {
        this.SO = SO;
    }


    /**
     * Gets the WBS value for this MOTable.
     * 
     * @return WBS
     */
    public java.lang.String getWBS() {
        return WBS;
    }


    /**
     * Sets the WBS value for this MOTable.
     * 
     * @param WBS
     */
    public void setWBS(java.lang.String WBS) {
        this.WBS = WBS;
    }


    /**
     * Gets the batch_name value for this MOTable.
     * 
     * @return batch_name
     */
    public java.lang.String getBatch_name() {
        return batch_name;
    }


    /**
     * Sets the batch_name value for this MOTable.
     * 
     * @param batch_name
     */
    public void setBatch_name(java.lang.String batch_name) {
        this.batch_name = batch_name;
    }


    /**
     * Gets the order_id value for this MOTable.
     * 
     * @return order_id
     */
    public int getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this MOTable.
     * 
     * @param order_id
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the order_name value for this MOTable.
     * 
     * @return order_name
     */
    public java.lang.String getOrder_name() {
        return order_name;
    }


    /**
     * Sets the order_name value for this MOTable.
     * 
     * @param order_name
     */
    public void setOrder_name(java.lang.String order_name) {
        this.order_name = order_name;
    }


    /**
     * Gets the processline value for this MOTable.
     * 
     * @return processline
     */
    public java.lang.String getProcessline() {
        return processline;
    }


    /**
     * Sets the processline value for this MOTable.
     * 
     * @param processline
     */
    public void setProcessline(java.lang.String processline) {
        this.processline = processline;
    }


    /**
     * Gets the processline_id value for this MOTable.
     * 
     * @return processline_id
     */
    public int getProcessline_id() {
        return processline_id;
    }


    /**
     * Sets the processline_id value for this MOTable.
     * 
     * @param processline_id
     */
    public void setProcessline_id(int processline_id) {
        this.processline_id = processline_id;
    }


    /**
     * Gets the product_bigtype_name value for this MOTable.
     * 
     * @return product_bigtype_name
     */
    public java.lang.String getProduct_bigtype_name() {
        return product_bigtype_name;
    }


    /**
     * Sets the product_bigtype_name value for this MOTable.
     * 
     * @param product_bigtype_name
     */
    public void setProduct_bigtype_name(java.lang.String product_bigtype_name) {
        this.product_bigtype_name = product_bigtype_name;
    }


    /**
     * Gets the product_type_name value for this MOTable.
     * 
     * @return product_type_name
     */
    public java.lang.String getProduct_type_name() {
        return product_type_name;
    }


    /**
     * Sets the product_type_name value for this MOTable.
     * 
     * @param product_type_name
     */
    public void setProduct_type_name(java.lang.String product_type_name) {
        this.product_type_name = product_type_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MOTable)) return false;
        MOTable other = (MOTable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SO==null && other.getSO()==null) || 
             (this.SO!=null &&
              this.SO.equals(other.getSO()))) &&
            ((this.WBS==null && other.getWBS()==null) || 
             (this.WBS!=null &&
              this.WBS.equals(other.getWBS()))) &&
            ((this.batch_name==null && other.getBatch_name()==null) || 
             (this.batch_name!=null &&
              this.batch_name.equals(other.getBatch_name()))) &&
            this.order_id == other.getOrder_id() &&
            ((this.order_name==null && other.getOrder_name()==null) || 
             (this.order_name!=null &&
              this.order_name.equals(other.getOrder_name()))) &&
            ((this.processline==null && other.getProcessline()==null) || 
             (this.processline!=null &&
              this.processline.equals(other.getProcessline()))) &&
            this.processline_id == other.getProcessline_id() &&
            ((this.product_bigtype_name==null && other.getProduct_bigtype_name()==null) || 
             (this.product_bigtype_name!=null &&
              this.product_bigtype_name.equals(other.getProduct_bigtype_name()))) &&
            ((this.product_type_name==null && other.getProduct_type_name()==null) || 
             (this.product_type_name!=null &&
              this.product_type_name.equals(other.getProduct_type_name())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSO() != null) {
            _hashCode += getSO().hashCode();
        }
        if (getWBS() != null) {
            _hashCode += getWBS().hashCode();
        }
        if (getBatch_name() != null) {
            _hashCode += getBatch_name().hashCode();
        }
        _hashCode += getOrder_id();
        if (getOrder_name() != null) {
            _hashCode += getOrder_name().hashCode();
        }
        if (getProcessline() != null) {
            _hashCode += getProcessline().hashCode();
        }
        _hashCode += getProcessline_id();
        if (getProduct_bigtype_name() != null) {
            _hashCode += getProduct_bigtype_name().hashCode();
        }
        if (getProduct_type_name() != null) {
            _hashCode += getProduct_type_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MOTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.otracking.com", "MOTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "SO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WBS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "WBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "batch_name"));
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
        elemField.setFieldName("order_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "order_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "processline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processline_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "processline_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_bigtype_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "product_bigtype_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_type_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "product_type_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
