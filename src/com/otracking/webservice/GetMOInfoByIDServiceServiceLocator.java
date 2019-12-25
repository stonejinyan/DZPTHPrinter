/**
 * GetMOInfoByIDServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.otracking.webservice;

public class GetMOInfoByIDServiceServiceLocator extends org.apache.axis.client.Service implements com.otracking.webservice.GetMOInfoByIDServiceService {

    public GetMOInfoByIDServiceServiceLocator() {
    }


    public GetMOInfoByIDServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetMOInfoByIDServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetMOInfoByIDService
    private java.lang.String GetMOInfoByIDService_address = "http://localhost:8080/Otracking/services/GetMOInfoByIDService";

    public java.lang.String getGetMOInfoByIDServiceAddress() {
        return GetMOInfoByIDService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetMOInfoByIDServiceWSDDServiceName = "GetMOInfoByIDService";

    public java.lang.String getGetMOInfoByIDServiceWSDDServiceName() {
        return GetMOInfoByIDServiceWSDDServiceName;
    }

    public void setGetMOInfoByIDServiceWSDDServiceName(java.lang.String name) {
        GetMOInfoByIDServiceWSDDServiceName = name;
    }

    public com.otracking.webservice.GetMOInfoByIDService getGetMOInfoByIDService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetMOInfoByIDService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetMOInfoByIDService(endpoint);
    }

    public com.otracking.webservice.GetMOInfoByIDService getGetMOInfoByIDService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.otracking.webservice.GetMOInfoByIDServiceSoapBindingStub _stub = new com.otracking.webservice.GetMOInfoByIDServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetMOInfoByIDServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetMOInfoByIDServiceEndpointAddress(java.lang.String address) {
        GetMOInfoByIDService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.otracking.webservice.GetMOInfoByIDService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.otracking.webservice.GetMOInfoByIDServiceSoapBindingStub _stub = new com.otracking.webservice.GetMOInfoByIDServiceSoapBindingStub(new java.net.URL(GetMOInfoByIDService_address), this);
                _stub.setPortName(getGetMOInfoByIDServiceWSDDServiceName());
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
        if ("GetMOInfoByIDService".equals(inputPortName)) {
            return getGetMOInfoByIDService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.otracking.com", "GetMOInfoByIDServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.otracking.com", "GetMOInfoByIDService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetMOInfoByIDService".equals(portName)) {
            setGetMOInfoByIDServiceEndpointAddress(address);
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
