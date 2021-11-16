
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
 * Class for seev.020.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAMvmntCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.020.001.01")
public class MxSeev02000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAMvmntCxlReq", required = true)
    protected AgentCAMovementCancellationRequestV01 agtCAMvmntCxlReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAMovementCancellationRequestV01 .class, AlternateSecurityIdentification3 .class, CashAccount19 .class, CashMovement2 .class, CashProceeds1 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionMovement1 .class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, CreditDebitCode.class, DistributionInstructionType1Code.class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, ForeignExchangeTerms9 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification13 .class, MovementInstruction1 .class, MxSeev02000101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceValue1 .class, ProceedsMovement1 .class, SecuritiesAccount10 .class, SecuritiesAccount8 .class, SecuritiesBalanceType10Code.class, SecuritiesBalanceType10FormatChoice.class, SecuritiesBalanceType9Code.class, SecuritiesBalanceType9FormatChoice.class, SecuritiesProceeds1 .class, SecurityIdentification7 .class, StampDutyType1Code.class, StampDutyType1FormatChoice.class, TaxVoucher1 .class, UnderlyingSecurityMovement1 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.020.001.01";

    public MxSeev02000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev02000101(final String xml) {
        this();
        MxSeev02000101 tmp = parse(xml);
        agtCAMvmntCxlReq = tmp.getAgtCAMvmntCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev02000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAMvmntCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAMovementCancellationRequestV01 }
     *     
     */
    public AgentCAMovementCancellationRequestV01 getAgtCAMvmntCxlReq() {
        return agtCAMvmntCxlReq;
    }

    /**
     * Sets the value of the agtCAMvmntCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAMovementCancellationRequestV01 }
     *     
     */
    public MxSeev02000101 setAgtCAMvmntCxlReq(AgentCAMovementCancellationRequestV01 value) {
        this.agtCAMvmntCxlReq = value;
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
    public static MxSeev02000101 parse(String xml) {
        return ((MxSeev02000101) MxReadImpl.parse(MxSeev02000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev02000101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev02000101) parserImpl.read(MxSeev02000101 .class, xml, _classes));
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
     * Creates an MxSeev02000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev02000101 message
     * @return
     *     a new instance of MxSeev02000101
     */
    public final static MxSeev02000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev02000101 .class);
    }

}
