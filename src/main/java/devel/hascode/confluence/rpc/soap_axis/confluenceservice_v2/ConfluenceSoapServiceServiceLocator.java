/**
 * ConfluenceSoapServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2;

public class ConfluenceSoapServiceServiceLocator extends org.apache.axis.client.Service implements devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceSoapServiceService {

    public ConfluenceSoapServiceServiceLocator() {
    }


    public ConfluenceSoapServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfluenceSoapServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfluenceserviceV2
    private java.lang.String ConfluenceserviceV2_address = "http://hascode.devel:1990/confluence/rpc/soap-axis/confluenceservice-v2";

    public java.lang.String getConfluenceserviceV2Address() {
        return ConfluenceserviceV2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfluenceserviceV2WSDDServiceName = "confluenceservice-v2";

    public java.lang.String getConfluenceserviceV2WSDDServiceName() {
        return ConfluenceserviceV2WSDDServiceName;
    }

    public void setConfluenceserviceV2WSDDServiceName(java.lang.String name) {
        ConfluenceserviceV2WSDDServiceName = name;
    }

    public devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceSoapService getConfluenceserviceV2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfluenceserviceV2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfluenceserviceV2(endpoint);
    }

    public devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceSoapService getConfluenceserviceV2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceserviceV2SoapBindingStub _stub = new devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceserviceV2SoapBindingStub(portAddress, this);
            _stub.setPortName(getConfluenceserviceV2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfluenceserviceV2EndpointAddress(java.lang.String address) {
        ConfluenceserviceV2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceSoapService.class.isAssignableFrom(serviceEndpointInterface)) {
                devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceserviceV2SoapBindingStub _stub = new devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceserviceV2SoapBindingStub(new java.net.URL(ConfluenceserviceV2_address), this);
                _stub.setPortName(getConfluenceserviceV2WSDDServiceName());
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
        if ("confluenceservice-v2".equals(inputPortName)) {
            return getConfluenceserviceV2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hascode.devel:1990/confluence/rpc/soap-axis/confluenceservice-v2", "ConfluenceSoapServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hascode.devel:1990/confluence/rpc/soap-axis/confluenceservice-v2", "confluenceservice-v2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfluenceserviceV2".equals(portName)) {
            setConfluenceserviceV2EndpointAddress(address);
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
