
package au.net.electronichealth.ns.trd.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliverErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliverErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknownSenderOrganisation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliverErrorCodeType")
@XmlEnum
public enum DeliverErrorCodeType {

    @XmlEnumValue("unknownSenderOrganisation")
    UNKNOWN_SENDER_ORGANISATION("unknownSenderOrganisation");
    private final String value;

    DeliverErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliverErrorCodeType fromValue(String v) {
        for (DeliverErrorCodeType c: DeliverErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
