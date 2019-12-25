package com.otracking.webservice;

public class GetDZPInfoByAOPServiceProxy implements com.otracking.webservice.GetDZPInfoByAOPService {
  private String _endpoint = null;
  private com.otracking.webservice.GetDZPInfoByAOPService getDZPInfoByAOPService = null;
  
  public GetDZPInfoByAOPServiceProxy() {
    _initGetDZPInfoByAOPServiceProxy();
  }
  
  public GetDZPInfoByAOPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetDZPInfoByAOPServiceProxy();
  }
  
  private void _initGetDZPInfoByAOPServiceProxy() {
    try {
      getDZPInfoByAOPService = (new com.otracking.webservice.GetDZPInfoByAOPServiceServiceLocator()).getGetDZPInfoByAOPService();
      if (getDZPInfoByAOPService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getDZPInfoByAOPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getDZPInfoByAOPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getDZPInfoByAOPService != null)
      ((javax.xml.rpc.Stub)getDZPInfoByAOPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.otracking.webservice.GetDZPInfoByAOPService getGetDZPInfoByAOPService() {
    if (getDZPInfoByAOPService == null)
      _initGetDZPInfoByAOPServiceProxy();
    return getDZPInfoByAOPService;
  }
  
  public com.otracking.bean.DZPTH[] getDZPInfoByAOP(java.lang.String dms_id, int order_id) throws java.rmi.RemoteException{
    if (getDZPInfoByAOPService == null)
      _initGetDZPInfoByAOPServiceProxy();
    return getDZPInfoByAOPService.getDZPInfoByAOP(dms_id, order_id);
  }
  
  
}