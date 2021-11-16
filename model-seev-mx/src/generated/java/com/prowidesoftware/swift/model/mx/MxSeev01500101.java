
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
 * Class for seev.015.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAElctnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.015.001.01")
public class MxSeev01500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAElctnStsAdvc", required = true)
    protected AgentCAElectionStatusAdviceV01 agtCAElctnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCAElectionStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, CorporateActionAmendmentProcessingStatus1 .class, CorporateActionAmendmentRejectionStatus1 .class, CorporateActionCancellationProcessingStatus1 .class, CorporateActionCancellationRejectionStatus1 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionInstructionProcessingStatus1 .class, CorporateActionInstructionRejectionStatus1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, DocumentIdentification8 .class, ElectionAdviceStatus1Choice.class, ElectionAmendmentStatus1Choice.class, ElectionCancellationStatus1Choice.class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeev01500101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ProcessedStatus3Code.class, ProcessedStatus3FormatChoice.class, ProcessedStatus5Code.class, ProcessedStatus5FormatChoice.class, RejectionReason18Code.class, RejectionReason18FormatChoice.class, RejectionReason8Code.class, RejectionReason8FormatChoice.class, RejectionReason9Code.class, RejectionReason9FormatChoice.class, SecurityIdentification7 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.015.001.01";

    public MxSeev01500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01500101(final String xml) {
        this();
        MxSeev01500101 tmp = parse(xml);
        agtCAElctnStsAdvc = tmp.getAgtCAElctnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAElctnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAElectionStatusAdviceV01 }
     *     
     */
    public AgentCAElectionStatusAdviceV01 getAgtCAElctnStsAdvc() {
        return agtCAElctnStsAdvc;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAElectionStatusAdviceV01 }
     *     
     */
    public MxSeev01500101 setAgtCAElctnStsAdvc(AgentCAElectionStatusAdviceV01 value) {
        this.agtCAElctnStsAdvc = value;
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
    public static MxSeev01500101 parse(String xml) {
        return ((MxSeev01500101) MxReadImpl.parse(MxSeev01500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01500101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01500101) parserImpl.read(MxSeev01500101 .class, xml, _classes));
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
     * Creates an MxSeev01500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01500101 message
     * @return
     *     a new instance of MxSeev01500101
     */
    public final static MxSeev01500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01500101 .class);
    }

}
