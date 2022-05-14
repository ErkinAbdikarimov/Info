
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="iin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="address_code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", namespace = "http://example.com/spring-boot-soap-example", propOrder = {
    "id",
    "iin",
    "addressCode",
    "fio"
})
public class User {

    protected long id;
    protected long iin;
    @XmlElement(name = "address_code")
    protected long addressCode;
    @XmlElement(required = true)
    protected String fio;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the iin property.
     * 
     */
    public long getIin() {
        return iin;
    }

    /**
     * Sets the value of the iin property.
     * 
     */
    public void setIin(long value) {
        this.iin = value;
    }

    /**
     * Gets the value of the addressCode property.
     * 
     */
    public long getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     */
    public void setAddressCode(long value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFio(String value) {
        this.fio = value;
    }

}
