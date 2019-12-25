/**
 * GetDZPInfoByAOPServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.otracking.webservice;

public class GetDZPInfoByAOPServiceServiceLocator extends org.apache.axis.client.Service implements com.otracking.webservice.GetDZPInfoByAOPServiceService {

    public GetDZPInfoByAOPServiceServiceLocator() {
    }


    public GetDZPInfoByAOPServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetDZPInfoByAOPServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetDZPInfoByAOPService
    private java.lang.String GetDZPInfoByAOPService_address = "http://localhost:8080/Otracking/services/GetDZPInfoByAOPService";

    public java.lang.String getGetDZPInfoByAOPServiceAddress() {
        return GetDZPInfoByAOPService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetDZPInfoByAOPServiceWSDDServiceName = "GetDZPInfoByAOPService";

    public java.lang.String getGetDZPInfoByAOPServiceWSDDServiceName() {
        return GetDZPInfoByAOPServiceWSDDServiceName;
    }

    public void setGetDZPInfoByAOPServiceWSDDServiceName(java.lang.String name) {
        GetDZPInfoByAOPServiceWSDDServiceName = name;
    }

    public com.otracking.webservice.GetDZPInfoByAOPService getGetDZPInfoByAOPService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetDZPInfoByAOPService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetDZPInfoByAOPService(endpoint);
    }

    public com.otracking.webservice.GetDZPInfoByAOPService getGetDZPInfoByAOPService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.otracking.webservice.GetDZPInfoByAOPServiceSoapBindingStub _stub = new com.otracking.webservice.GetDZPInfoByAOPServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetDZPInfoByAOPServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetDZPInfoByAOPServiceEndpointAddress(java.lang.String address) {
        GetDZPInfoByAOPService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.otracking.webservice.GetDZPInfoByAOPService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.otracking.webservice.GetDZPInfoByAOPServiceSoapBindingStub _stub = new com.otracking.webservice.GetDZPInfoByAOPServiceSoapBindingStub(new java.net.URL(GetDZPInfoByAOPService_address), this);
                _stub.setPortName(getGetDZPInfoByAOPServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetDZPInfoByAOPService".equals(inputPortName)) {
            return getGetDZPInfoByAOPService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.otracking.com", "GetDZPInfoByAOPServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.otracking.com", "GetDZPInfoByAOPService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetDZPInfoByAOPService".equals(portName)) {
            setGetDZPInfoByAOPServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
