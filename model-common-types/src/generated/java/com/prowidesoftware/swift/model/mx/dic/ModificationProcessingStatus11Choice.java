
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of format for the processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationProcessingStatus11Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "dnd",
    "rjctd",
    "rprd",
    "modfd",
    "prtry"
})
public class ModificationProcessingStatus11Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus30Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus16Choice pdgPrcg;
    @XmlElement(name = "Dnd")
    protected DeniedStatus19Choice dnd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus42Choice rjctd;
    @XmlElement(name = "Rprd")
    protected RepairStatus17Choice rprd;
    @XmlElement(name = "Modfd")
    protected ModificationStatus5Choice modfd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus30Choice }
     *     
     */
    public AcknowledgedAcceptedStatus30Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus30Choice }
     *     
     */
    public ModificationProcessingStatus11Choice setAckdAccptd(AcknowledgedAcceptedStatus30Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus16Choice }
     *     
     */
    public PendingProcessingStatus16Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus16Choice }
     *     
     */
    public ModificationProcessingStatus11Choice setPdgPrcg(PendingProcessingStatus16Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus19Choice }
     *     
     */
    public DeniedStatus19Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus19Choice }
     *     
     */
    public ModificationProcessingStatus11Choice setDnd(DeniedStatus19Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus42Choice }
     *     
     */
    public RejectionStatus42Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus42Choice }
     *     
     */
    public ModificationProcessingStatus11Choice setRjctd(RejectionStatus42Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rprd property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus17Choice }
     *     
     */
    public RepairStatus17Choice getRprd() {
        return rprd;
    }

    /**
     * Sets the value of the rprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus17Choice }
     *     
     */
    public ModificationProcessingStatus11Choice setRprd(RepairStatus17Choice value) {
        this.rprd = value;
        return this;
    }

    /**
     * Gets the value of the modfd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationStatus5Choice }
     *     
     */
    public ModificationStatus5Choice getModfd() {
        return modfd;
    }

    /**
     * Sets the value of the modfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationStatus5Choice }
     *     
     */
    public ModificationProcessingStatus11Choice setModfd(ModificationStatus5Choice value) {
        this.modfd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ModificationProcessingStatus11Choice setPrtry(ProprietaryStatusAndReason7 value) {
        this.prtry = value;
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
