
package generated.ageservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AgeService", targetNamespace = "http://ageservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AgeService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAge", targetNamespace = "http://ageservice/", className = "generated.ageservice.GetAge")
    @ResponseWrapper(localName = "getAgeResponse", targetNamespace = "http://ageservice/", className = "generated.ageservice.GetAgeResponse")
    public String getAge(@WebParam(name = "arg0", targetNamespace = "") Integer arg0);

}
