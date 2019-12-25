package com.otracking.webservice;

public class GetMOInfoByIDServiceProxy implements com.otracking.webservice.GetMOInfoByIDService {
  private String _endpoint = null;
  private com.otracking.webservice.GetMOInfoByIDService getMOInfoByIDService = null;
  
  public GetMOInfoByIDServiceProxy() {
    _initGetMOInfoByIDServiceProxy();
  }
  
  public GetMOInfoByIDServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetMOInfoByIDServiceProxy();
  }
  
  private void _initGetMOInfoByIDServiceProxy() {
    try {
      getMOInfoByIDService = (new com.otracking.webservice.GetMOInfoByIDServiceServiceLocator()).getGetMOInfoByIDService();
      if (getMOInfoByIDService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getMOInfoByIDService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getMOInfoByIDService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getMOInfoByIDService != null)
      ((javax.xml.rpc.Stub)getMOInfoByIDService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.otracking.webservice.GetMOInfoByIDService getGetMOInfoByIDService() {
    if (getMOInfoByIDService == null)
      _initGetMOInfoByIDServiceProxy();
    return getMOInfoByIDService;
  }
  
  public com.otracking.bean.MOTable getMOByID(int id) throws java.rmi.RemoteException{
    if (getMOInfoByIDService == null)
      _initGetMOInfoByIDServiceProxy();
    return getMOInfoByIDService.getMOByID(id);
  }
  
  
}