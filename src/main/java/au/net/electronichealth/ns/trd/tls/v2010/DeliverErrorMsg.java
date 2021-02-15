
package au.net.electronichealth.ns.trd.tls.v2010;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "deliverError", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/TransportResponseDelivery/2010")
public class DeliverErrorMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DeliverErrorType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DeliverErrorMsg(String message, DeliverErrorType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DeliverErrorMsg(String message, DeliverErrorType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.net.electronichealth.ns.trd.tls.v2010.DeliverErrorType
     */
    public DeliverErrorType getFaultInfo() {
        return faultInfo;
    }

}