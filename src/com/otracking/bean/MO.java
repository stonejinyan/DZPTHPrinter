/**
 * MO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.otracking.bean;

public class MO  implements java.io.Serializable {
    private java.util.Calendar actual_endtime;

    private java.util.Calendar actual_starttime;

    private int batch_id;

    private java.lang.String customID;

    private java.lang.String description;

    private java.lang.String dms_id;

    private int id;

    private java.lang.String name;

    private int no;

    private int product_type_id;

    private double quantity;

    private java.util.Calendar schedule_endtime;

    private java.util.Calendar schedule_starttime;

    private int scheduling;

    private java.lang.String securityCode;

    public MO() {
    }

    public MO(
           java.util.Calendar actual_endtime,
           java.util.Calendar actual_starttime,
           int batch_id,
           java.lang.String customID,
           java.lang.String description,
           java.lang.String dms_id,
           int id,
           java.lang.String name,
           int no,
           int product_type_id,
           double quantity,
           java.util.Calendar schedule_endtime,
           java.util.Calendar schedule_starttime,
           int scheduling,
           java.lang.String securityCode) {
           this.actual_endtime = actual_endtime;
           this.actual_starttime = actual_starttime;
           this.batch_id = batch_id;
           this.customID = customID;
           this.description = description;
           this.dms_id = dms_id;
           this.id = id;
           this.name = name;
           this.no = no;
           this.product_type_id = product_type_id;
           this.quantity = quantity;
           this.schedule_endtime = schedule_endtime;
           this.schedule_starttime = schedule_starttime;
           this.scheduling = scheduling;
           this.securityCode = securityCode;
    }


    /**
     * Gets the actual_endtime value for this MO.
     * 
     * @return actual_endtime
     */
    public java.util.Calendar getActual_endtime() {
        return actual_endtime;
    }


    /**
     * Sets the actual_endtime value for this MO.
     * 
     * @param actual_endtime
     */
    public void setActual_endtime(java.util.Calendar actual_endtime) {
        this.actual_endtime = actual_endtime;
    }


    /**
     * Gets the actual_starttime value for this MO.
     * 
     * @return actual_starttime
     */
    public java.util.Calendar getActual_starttime() {
        return actual_starttime;
    }


    /**
     * Sets the actual_starttime value for this MO.
     * 
     * @param actual_starttime
     */
    public void setActual_starttime(java.util.Calendar actual_starttime) {
        this.actual_starttime = actual_starttime;
    }


    /**
     * Gets the batch_id value for this MO.
     * 
     * @return batch_id
     */
    public int getBatch_id() {
        return batch_id;
    }


    /**
     * Sets the batch_id value for this MO.
     * 
     * @param batch_id
     */
    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }


    /**
     * Gets the customID value for this MO.
     * 
     * @return customID
     */
    public java.lang.String getCustomID() {
        return customID;
    }


    /**
     * Sets the customID value for this MO.
     * 
     * @param customID
     */
    public void setCustomID(java.lang.String customID) {
        this.customID = customID;
    }


    /**
     * Gets the description value for this MO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dms_id value for this MO.
     * 
     * @return dms_id
     */
    public java.lang.String getDms_id() {
        return dms_id;
    }


    /**
     * Sets the dms_id value for this MO.
     * 
     * @param dms_id
     */
    public void setDms_id(java.lang.String dms_id) {
        this.dms_id = dms_id;
    }


    /**
     * Gets the id value for this MO.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this MO.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this MO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the no value for this MO.
     * 
     * @return no
     */
    public int getNo() {
        return no;
    }


    /**
     * Sets the no value for this MO.
     * 
     * @param no
     */
    public void setNo(int no) {
        this.no = no;
    }


    /**
     * Gets the product_type_id value for this MO.
     * 
     * @return product_type_id
     */
    public int getProduct_type_id() {
        return product_type_id;
    }


    /**
     * Sets the product_type_id value for this MO.
     * 
     * @param product_type_id
     */
    public void setProduct_type_id(int product_type_id) {
        this.product_type_id = product_type_id;
    }


    /**
     * Gets the quantity value for this MO.
     * 
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this MO.
     * 
     * @param quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the schedule_endtime value for this MO.
     * 
     * @return schedule_endtime
     */
    public java.util.Calendar getSchedule_endtime() {
        return schedule_endtime;
    }


    /**
     * Sets the schedule_endtime value for this MO.
     * 
     * @param schedule_endtime
     */
    public void setSchedule_endtime(java.util.Calendar schedule_endtime) {
        this.schedule_endtime = schedule_endtime;
    }


    /**
     * Gets the schedule_starttime value for this MO.
     * 
     * @return schedule_starttime
     */
    public java.util.Calendar getSchedule_starttime() {
        return schedule_starttime;
    }


    /**
     * Sets the schedule_starttime value for this MO.
     * 
     * @param schedule_starttime
     */
    public void setSchedule_starttime(java.util.Calendar schedule_starttime) {
        this.schedule_starttime = schedule_starttime;
    }


    /**
     * Gets the scheduling value for this MO.
     * 
     * @return scheduling
     */
    public int getScheduling() {
        return scheduling;
    }


    /**
     * Sets the scheduling value for this MO.
     * 
     * @param scheduling
     */
    public void setScheduling(int scheduling) {
        this.scheduling = scheduling;
    }


    /**
     * Gets the securityCode value for this MO.
     * 
     * @return securityCode
     */
    public java.lang.String getSecurityCode() {
        return securityCode;
    }


    /**
     * Sets the securityCode value for this MO.
     * 
     * @param securityCode
     */
    public void setSecurityCode(java.lang.String securityCode) {
        this.securityCode = securityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MO)) return false;
        MO other = (MO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actual_endtime==null && other.getActual_endtime()==null) || 
             (this.actual_endtime!=null &&
              this.actual_endtime.equals(other.getActual_endtime()))) &&
            ((this.actual_starttime==null && other.getActual_starttime()==null) || 
             (this.actual_starttime!=null &&
              this.actual_starttime.equals(other.getActual_starttime()))) &&
            this.batch_id == other.getBatch_id() &&
            ((this.customID==null && other.getCustomID()==null) || 
             (this.customID!=null &&
              this.customID.equals(other.getCustomID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dms_id==null && other.getDms_id()==null) || 
             (this.dms_id!=null &&
              this.dms_id.equals(other.getDms_id()))) &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.no == other.getNo() &&
            this.product_type_id == other.getProduct_type_id() &&
            this.quantity == other.getQuantity() &&
            ((this.schedule_endtime==null && other.getSchedule_endtime()==null) || 
             (this.schedule_endtime!=null &&
              this.schedule_endtime.equals(other.getSchedule_endtime()))) &&
            ((this.schedule_starttime==null && other.getSchedule_starttime()==null) || 
             (this.schedule_starttime!=null &&
              this.schedule_starttime.equals(other.getSchedule_starttime()))) &&
            this.scheduling == other.getScheduling() &&
            ((this.securityCode==null && other.getSecurityCode()==null) || 
             (this.securityCode!=null &&
              this.securityCode.equals(other.getSecurityCode())));
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
        if (getActual_endtime() != null) {
            _hashCode += getActual_endtime().hashCode();
        }
        if (getActual_starttime() != null) {
            _hashCode += getActual_starttime().hashCode();
        }
        _hashCode += getBatch_id();
        if (getCustomID() != null) {
            _hashCode += getCustomID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDms_id() != null) {
            _hashCode += getDms_id().hashCode();
        }
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getNo();
        _hashCode += getProduct_type_id();
        _hashCode += new Double(getQuantity()).hashCode();
        if (getSchedule_endtime() != null) {
            _hashCode += getSchedule_endtime().hashCode();
        }
        if (getSchedule_starttime() != null) {
            _hashCode += getSchedule_starttime().hashCode();
        }
        _hashCode += getScheduling();
        if (getSecurityCode() != null) {
            _hashCode += getSecurityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.otracking.com", "MO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_endtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "actual_endtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_starttime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "actual_starttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "batch_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "customID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "product_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule_endtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "schedule_endtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule_starttime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "schedule_starttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "scheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.otracking.com", "securityCode"));
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
