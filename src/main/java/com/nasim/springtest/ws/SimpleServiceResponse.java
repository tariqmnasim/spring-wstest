
package com.nasim.springtest.ws;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Output" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "output"
})
@XmlRootElement(name = "SimpleServiceResponse", namespace = "http://nasim.blogspot.com/spring-wstest")
public class SimpleServiceResponse {

    @XmlElement(name = "Output", namespace = "http://nasim.blogspot.com/spring-wstest", required = true)
    protected String output;

    /**
     * Gets the value of the output property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutput(String value) {
        this.output = value;
    }

}
