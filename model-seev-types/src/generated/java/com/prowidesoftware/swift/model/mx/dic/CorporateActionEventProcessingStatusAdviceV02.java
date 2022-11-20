
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An account servicer sends the CorporateActionEventProcessingStatusAdvice message to an account owner or its designated agent to report processing status of a corporate action event.
 * The account servicer uses this message to provide a reason as to why a corporate action event has not been completed by the announced payment dates.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 * ISO 15022 - 20022 COEXISTENCE
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventProcessingStatusAdviceV02", propOrder = {
    "ntfctnId",
    "othrDocId",
    "corpActnGnlInf",
    "evtPrcgSts",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionEventProcessingStatusAdviceV02 {

    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification9 ntfctnId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification14> othrDocId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation9 corpActnGnlInf;
    @XmlElement(name = "EvtPrcgSts", required = true)
    protected List<EventProcessingStatus1Choice> evtPrcgSts;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative10 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV02 setNtfctnId(DocumentIdentification9 value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification14 }
     * 
     * 
     */
    public List<DocumentIdentification14> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification14>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation9 }
     *     
     */
    public CorporateActionGeneralInformation9 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation9 }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV02 setCorpActnGnlInf(CorporateActionGeneralInformation9 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the evtPrcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtPrcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventProcessingStatus1Choice }
     * 
     * 
     */
    public List<EventProcessingStatus1Choice> getEvtPrcgSts() {
        if (evtPrcgSts == null) {
            evtPrcgSts = new ArrayList<EventProcessingStatus1Choice>();
        }
        return this.evtPrcgSts;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative10 }
     *     
     */
    public CorporateActionNarrative10 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative10 }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV02 setAddtlInf(CorporateActionNarrative10 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the othrDocId list.
     * @see #getOthrDocId()
     * 
     */
    public CorporateActionEventProcessingStatusAdviceV02 addOthrDocId(DocumentIdentification14 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtPrcgSts list.
     * @see #getEvtPrcgSts()
     * 
     */
    public CorporateActionEventProcessingStatusAdviceV02 addEvtPrcgSts(EventProcessingStatus1Choice evtPrcgSts) {
        getEvtPrcgSts().add(evtPrcgSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionEventProcessingStatusAdviceV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
