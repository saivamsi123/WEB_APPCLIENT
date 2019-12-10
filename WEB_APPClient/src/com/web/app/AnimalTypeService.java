/**
 * AnimalTypeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.app;

public interface AnimalTypeService extends javax.xml.rpc.Service {
    public java.lang.String getAnimalTypeAddress();

    public com.web.app.AnimalType getAnimalType() throws javax.xml.rpc.ServiceException;

    public com.web.app.AnimalType getAnimalType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
