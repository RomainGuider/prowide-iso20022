
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.003.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgEntitlmntNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.003.001.07")
public class MxSeev00300107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgEntitlmntNtfctn", required = true)
    protected MeetingEntitlementNotificationV07 mtgEntitlmntNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndPlaceOfBirth2 .class, EligibilityDates1 .class, EligiblePosition10 .class, FinancialInstrumentQuantity18Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldingBalance9 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, MeetingEntitlementNotificationV07 .class, MeetingReference10 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00300107 .class, NameAndAddress5 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NotificationType2Code.class, OrganisationIdentification5 .class, OtherIdentification1 .class, PartyAdditionalIdentification2Choice.class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification224 .class, PartyIdentification231Choice.class, PartyIdentification232Choice.class, PartyIdentification233Choice.class, PartyIdentification238 .class, PartyIdentification239 .class, PartyIdentification240 .class, PartyIdentification241 .class, PersonName2 .class, PersonName3 .class, PostalAddress1 .class, PostalAddress26 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesEntryType2Code.class, SecurityIdentification19 .class, SecurityPosition13 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.003.001.07";

    public MxSeev00300107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00300107(final String xml) {
        this();
        MxSeev00300107 tmp = parse(xml);
        mtgEntitlmntNtfctn = tmp.getMtgEntitlmntNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00300107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgEntitlmntNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingEntitlementNotificationV07 }
     *     
     */
    public MeetingEntitlementNotificationV07 getMtgEntitlmntNtfctn() {
        return mtgEntitlmntNtfctn;
    }

    /**
     * Sets the value of the mtgEntitlmntNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingEntitlementNotificationV07 }
     *     
     */
    public MxSeev00300107 setMtgEntitlmntNtfctn(MeetingEntitlementNotificationV07 value) {
        this.mtgEntitlmntNtfctn = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev00300107 parse(String xml) {
        return ((MxSeev00300107) MxReadImpl.parse(MxSeev00300107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00300107 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00300107) parserImpl.read(MxSeev00300107 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSeev00300107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00300107 message
     * @return
     *     a new instance of MxSeev00300107
     */
    public final static MxSeev00300107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00300107 .class);
    }

}
