
package com.italk2learn.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ITalk2LearnService", targetNamespace = "http://ITalk2Learn/ITalk2LearnWS", wsdlLocation = "http://localhost:8080/sequencer/services/ITalk2LearnWS?wsdl")
public class ITalk2LearnService
    extends Service
{

    private final static URL ITALK2LEARNSERVICE_WSDL_LOCATION;
    private final static WebServiceException ITALK2LEARNSERVICE_EXCEPTION;
    private final static QName ITALK2LEARNSERVICE_QNAME = new QName("http://ITalk2Learn/ITalk2LearnWS", "ITalk2LearnService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/sequencer/services/ITalk2LearnWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ITALK2LEARNSERVICE_WSDL_LOCATION = url;
        ITALK2LEARNSERVICE_EXCEPTION = e;
    }

    public ITalk2LearnService() {
        super(__getWsdlLocation(), ITALK2LEARNSERVICE_QNAME);
    }

    public ITalk2LearnService(URL wsdlLocation) {
        super(wsdlLocation, ITALK2LEARNSERVICE_QNAME);
    }

    public ITalk2LearnService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }


    /**
     * 
     * @return
     *     returns NextLesson
     */
    @WebEndpoint(name = "ITalk2LearnWS")
    public NextLesson getITalk2LearnWS() {
        return super.getPort(new QName("http://ITalk2Learn/ITalk2LearnWS", "ITalk2LearnWS"), NextLesson.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NextLesson
     */
    @WebEndpoint(name = "ITalk2LearnWS")
    public NextLesson getITalk2LearnWS(WebServiceFeature... features) {
        return super.getPort(new QName("http://ITalk2Learn/ITalk2LearnWS", "ITalk2LearnWS"), NextLesson.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ITALK2LEARNSERVICE_EXCEPTION!= null) {
            throw ITALK2LEARNSERVICE_EXCEPTION;
        }
        return ITALK2LEARNSERVICE_WSDL_LOCATION;
    }

}
