
package au.net.electronichealth.ns.trd.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliverStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliverStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliverStatusType")
@XmlEnum
public enum DeliverStatusType {

    @XmlEnumValue("ok")
    OK("ok");
    private final String value;

    DeliverStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliverStatusType fromValue(String v) {
        for (DeliverStatusType c: DeliverStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
