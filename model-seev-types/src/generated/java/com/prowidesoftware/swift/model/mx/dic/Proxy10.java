
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of a proxy appointed to represent a party authorised to vote at a shareholders meeting and proxy vote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy10", propOrder = {
    "prxyTp",
    "prsnDtls"
})
public class Proxy10 {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProxyType2Code prxyTp;
    @XmlElement(name = "PrsnDtls")
    protected IndividualPerson42 prsnDtls;

    /**
     * Gets the value of the prxyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyType2Code }
     *     
     */
    public ProxyType2Code getPrxyTp() {
        return prxyTp;
    }

    /**
     * Sets the value of the prxyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyType2Code }
     *     
     */
    public Proxy10 setPrxyTp(ProxyType2Code value) {
        this.prxyTp = value;
        return this;
    }

    /**
     * Gets the value of the prsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson42 }
     *     
     */
    public IndividualPerson42 getPrsnDtls() {
        return prsnDtls;
    }

    /**
     * Sets the value of the prsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson42 }
     *     
     */
    public Proxy10 setPrsnDtls(IndividualPerson42 value) {
        this.prsnDtls = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
