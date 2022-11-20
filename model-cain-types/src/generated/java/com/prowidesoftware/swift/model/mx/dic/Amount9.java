
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Describes each adjustment made to the original price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount9", propOrder = {
    "tp",
    "othrTp",
    "amt",
    "cdtInd",
    "cstmrNtfdInd"
})
public class Amount9 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CarRentalServiceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "CdtInd")
    protected Boolean cdtInd;
    @XmlElement(name = "CstmrNtfdInd")
    protected Boolean cstmrNtfdInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalServiceType2Code }
     *     
     */
    public CarRentalServiceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalServiceType2Code }
     *     
     */
    public Amount9 setTp(CarRentalServiceType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amount9 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Amount9 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtInd() {
        return cdtInd;
    }

    /**
     * Sets the value of the cdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Amount9 setCdtInd(Boolean value) {
        this.cdtInd = value;
        return this;
    }

    /**
     * Gets the value of the cstmrNtfdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrNtfdInd() {
        return cstmrNtfdInd;
    }

    /**
     * Sets the value of the cstmrNtfdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Amount9 setCstmrNtfdInd(Boolean value) {
        this.cstmrNtfdInd = value;
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
