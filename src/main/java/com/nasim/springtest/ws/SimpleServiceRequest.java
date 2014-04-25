
package com.nasim.springtest.ws;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


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
 *         &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "input"
})
@XmlRootElement(name = "SimpleServiceRequest", namespace = "http://nasim.blogspot.com/spring-wstest")
public class SimpleServiceRequest {

    @XmlElement(name = "Input", namespace = "http://nasim.blogspot.com/spring-wstest", required = true)
    protected BigInteger input;

    /**
     * Gets the value of the input property.
     *
     * @return possible object is
     * {@link java.math.BigInteger }
     */
    public BigInteger getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     *
     * @param value allowed object is
     *              {@link java.math.BigInteger }
     */
    public void setInput(BigInteger value) {
        this.input = value;
    }

}
