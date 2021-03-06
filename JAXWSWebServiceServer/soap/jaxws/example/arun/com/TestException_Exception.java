
package soap.jaxws.example.arun.com;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TestException", targetNamespace = "com.arun.example.jaxws.soap")
public class TestException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TestException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TestException_Exception(String message, TestException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TestException_Exception(String message, TestException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: soap.jaxws.example.arun.com.TestException
     */
    public TestException getFaultInfo() {
        return faultInfo;
    }

}
