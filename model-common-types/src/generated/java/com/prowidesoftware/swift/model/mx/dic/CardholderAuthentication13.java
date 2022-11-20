
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
 * Data related to the authentication of the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication13", propOrder = {
    "authntcnMtd",
    "authntcnXmptn",
    "authntcnVal",
    "prtctdAuthntcnVal",
    "crdhldrOnLinePIN",
    "crdhldrId",
    "adrVrfctn",
    "authntcnTp",
    "authntcnLvl",
    "authntcnRslt",
    "authntcnAddtlInf"
})
public class CardholderAuthentication13 {

    @XmlElement(name = "AuthntcnMtd")
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod8Code authntcnMtd;
    @XmlElement(name = "AuthntcnXmptn")
    @XmlSchemaType(name = "string")
    protected Exemption1Code authntcnXmptn;
    @XmlElement(name = "AuthntcnVal")
    protected byte[] authntcnVal;
    @XmlElement(name = "PrtctdAuthntcnVal")
    protected ContentInformationType22 prtctdAuthntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN7 crdhldrOnLinePIN;
    @XmlElement(name = "CrdhldrId")
    protected PersonIdentification15 crdhldrId;
    @XmlElement(name = "AdrVrfctn")
    protected AddressVerification1 adrVrfctn;
    @XmlElement(name = "AuthntcnTp")
    protected String authntcnTp;
    @XmlElement(name = "AuthntcnLvl")
    protected String authntcnLvl;
    @XmlElement(name = "AuthntcnRslt")
    @XmlSchemaType(name = "string")
    protected AuthenticationResult1Code authntcnRslt;
    @XmlElement(name = "AuthntcnAddtlInf")
    protected ExternallyDefinedData1 authntcnAddtlInf;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod8Code }
     *     
     */
    public AuthenticationMethod8Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod8Code }
     *     
     */
    public CardholderAuthentication13 setAuthntcnMtd(AuthenticationMethod8Code value) {
        this.authntcnMtd = value;
        return this;
    }

    /**
     * Gets the value of the authntcnXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link Exemption1Code }
     *     
     */
    public Exemption1Code getAuthntcnXmptn() {
        return authntcnXmptn;
    }

    /**
     * Sets the value of the authntcnXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemption1Code }
     *     
     */
    public CardholderAuthentication13 setAuthntcnXmptn(Exemption1Code value) {
        this.authntcnXmptn = value;
        return this;
    }

    /**
     * Gets the value of the authntcnVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthntcnVal() {
        return authntcnVal;
    }

    /**
     * Sets the value of the authntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardholderAuthentication13 setAuthntcnVal(byte[] value) {
        this.authntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the prtctdAuthntcnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType22 }
     *     
     */
    public ContentInformationType22 getPrtctdAuthntcnVal() {
        return prtctdAuthntcnVal;
    }

    /**
     * Sets the value of the prtctdAuthntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType22 }
     *     
     */
    public CardholderAuthentication13 setPrtctdAuthntcnVal(ContentInformationType22 value) {
        this.prtctdAuthntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrOnLinePIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN7 }
     *     
     */
    public OnLinePIN7 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Sets the value of the crdhldrOnLinePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN7 }
     *     
     */
    public CardholderAuthentication13 setCrdhldrOnLinePIN(OnLinePIN7 value) {
        this.crdhldrOnLinePIN = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification15 }
     *     
     */
    public PersonIdentification15 getCrdhldrId() {
        return crdhldrId;
    }

    /**
     * Sets the value of the crdhldrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification15 }
     *     
     */
    public CardholderAuthentication13 setCrdhldrId(PersonIdentification15 value) {
        this.crdhldrId = value;
        return this;
    }

    /**
     * Gets the value of the adrVrfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AddressVerification1 }
     *     
     */
    public AddressVerification1 getAdrVrfctn() {
        return adrVrfctn;
    }

    /**
     * Sets the value of the adrVrfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressVerification1 }
     *     
     */
    public CardholderAuthentication13 setAdrVrfctn(AddressVerification1 value) {
        this.adrVrfctn = value;
        return this;
    }

    /**
     * Gets the value of the authntcnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTp() {
        return authntcnTp;
    }

    /**
     * Sets the value of the authntcnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderAuthentication13 setAuthntcnTp(String value) {
        this.authntcnTp = value;
        return this;
    }

    /**
     * Gets the value of the authntcnLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnLvl() {
        return authntcnLvl;
    }

    /**
     * Sets the value of the authntcnLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderAuthentication13 setAuthntcnLvl(String value) {
        this.authntcnLvl = value;
        return this;
    }

    /**
     * Gets the value of the authntcnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult1Code }
     *     
     */
    public AuthenticationResult1Code getAuthntcnRslt() {
        return authntcnRslt;
    }

    /**
     * Sets the value of the authntcnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult1Code }
     *     
     */
    public CardholderAuthentication13 setAuthntcnRslt(AuthenticationResult1Code value) {
        this.authntcnRslt = value;
        return this;
    }

    /**
     * Gets the value of the authntcnAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExternallyDefinedData1 }
     *     
     */
    public ExternallyDefinedData1 getAuthntcnAddtlInf() {
        return authntcnAddtlInf;
    }

    /**
     * Sets the value of the authntcnAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternallyDefinedData1 }
     *     
     */
    public CardholderAuthentication13 setAuthntcnAddtlInf(ExternallyDefinedData1 value) {
        this.authntcnAddtlInf = value;
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
