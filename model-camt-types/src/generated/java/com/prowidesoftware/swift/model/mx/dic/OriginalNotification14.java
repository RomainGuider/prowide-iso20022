
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the original notification, to which the cancellation advice refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalNotification14", propOrder = {
    "orgnlMsgId",
    "orgnlCreDtTm",
    "orgnlNtfctnId",
    "ntfctnCxl",
    "orgnlNtfctnRef"
})
public class OriginalNotification14 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlCreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgnlCreDtTm;
    @XmlElement(name = "OrgnlNtfctnId", required = true)
    protected String orgnlNtfctnId;
    @XmlElement(name = "NtfctnCxl")
    protected Boolean ntfctnCxl;
    @XmlElement(name = "OrgnlNtfctnRef")
    protected List<OriginalNotificationReference12> orgnlNtfctnRef;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification14 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OriginalNotification14 setOrgnlCreDtTm(XMLGregorianCalendar value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtfctnId() {
        return orgnlNtfctnId;
    }

    /**
     * Sets the value of the orgnlNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification14 setOrgnlNtfctnId(String value) {
        this.orgnlNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtfctnCxl() {
        return ntfctnCxl;
    }

    /**
     * Sets the value of the ntfctnCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OriginalNotification14 setNtfctnCxl(Boolean value) {
        this.ntfctnCxl = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlNtfctnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlNtfctnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalNotificationReference12 }
     * 
     * 
     */
    public List<OriginalNotificationReference12> getOrgnlNtfctnRef() {
        if (orgnlNtfctnRef == null) {
            orgnlNtfctnRef = new ArrayList<OriginalNotificationReference12>();
        }
        return this.orgnlNtfctnRef;
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

    /**
     * Adds a new item to the orgnlNtfctnRef list.
     * @see #getOrgnlNtfctnRef()
     * 
     */
    public OriginalNotification14 addOrgnlNtfctnRef(OriginalNotificationReference12 orgnlNtfctnRef) {
        getOrgnlNtfctnRef().add(orgnlNtfctnRef);
        return this;
    }

}
