
package generated.ageservice;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "getAge", targetNamespace = "http://ageservice/", wsdlLocation = "https://raw.githubusercontent.com/henriSedjame/topdownwebserviceexample/master/src/main/resources/age.wsdl")
public class GetAge_Service
    extends Service
{

    private final static URL GETAGE_WSDL_LOCATION;
    private final static WebServiceException GETAGE_EXCEPTION;
    private final static QName GETAGE_QNAME = new QName("http://ageservice/", "getAge");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://raw.githubusercontent.com/henriSedjame/topdownwebserviceexample/master/src/main/resources/age.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETAGE_WSDL_LOCATION = url;
        GETAGE_EXCEPTION = e;
    }

    public GetAge_Service() {
        super(__getWsdlLocation(), GETAGE_QNAME);
    }

    public GetAge_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETAGE_QNAME, features);
    }

    public GetAge_Service(URL wsdlLocation) {
        super(wsdlLocation, GETAGE_QNAME);
    }

    public GetAge_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETAGE_QNAME, features);
    }

    public GetAge_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetAge_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AgeService
     */
    @WebEndpoint(name = "AgeServicePort")
    public AgeService getAgeServicePort() {
        return super.getPort(new QName("http://ageservice/", "AgeServicePort"), AgeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AgeService
     */
    @WebEndpoint(name = "AgeServicePort")
    public AgeService getAgeServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ageservice/", "AgeServicePort"), AgeService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETAGE_EXCEPTION!= null) {
            throw GETAGE_EXCEPTION;
        }
        return GETAGE_WSDL_LOCATION;
    }

}
