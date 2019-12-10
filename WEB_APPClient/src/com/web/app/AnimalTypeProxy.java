package com.web.app;

public class AnimalTypeProxy implements com.web.app.AnimalType {
  private String _endpoint = null;
  private com.web.app.AnimalType animalType = null;
  
  public AnimalTypeProxy() {
    _initAnimalTypeProxy();
  }
  
  public AnimalTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAnimalTypeProxy();
  }
  
  private void _initAnimalTypeProxy() {
    try {
      animalType = (new com.web.app.AnimalTypeServiceLocator()).getAnimalType();
      if (animalType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)animalType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)animalType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (animalType != null)
      ((javax.xml.rpc.Stub)animalType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.web.app.AnimalType getAnimalType() {
    if (animalType == null)
      _initAnimalTypeProxy();
    return animalType;
  }
  
  public java.lang.String getAnimalType(java.lang.String animal) throws java.rmi.RemoteException{
    if (animalType == null)
      _initAnimalTypeProxy();
    return animalType.getAnimalType(animal);
  }
  
  
}