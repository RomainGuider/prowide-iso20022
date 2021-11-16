
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
 * Class for sese.011.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.06")
public class MxSese01100106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInstrStsRpt", required = true)
    protected TransferInstructionStatusReportV06 trfInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference7 .class, AdditionalReference8 .class, AddressType2Code.class, CancellationPendingStatus7Choice.class, CancelledStatus13Choice.class, CancelledStatusReason3Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType5Choice.class, Extension1 .class, FailedSettlementStatus2Choice.class, Fee2 .class, GenericIdentification1 .class, GenericIdentification36 .class, GenericIdentification47 .class, InRepairStatus4Choice.class, InvestmentFundFee1Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01100106 .class, NameAndAddress5 .class, NoReasonCode.class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, PartyIdentification113 .class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PendingSettlementStatus3Choice.class, PendingSettlementStatusReason2Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, References61Choice.class, RejectedReason15Choice.class, RejectionReason32 .class, ReversedStatus2Choice.class, Tax31 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes40 .class, TransferInstructionStatus4 .class, TransferInstructionStatusReportV06 .class, TransferRejectedStatusReason2Code.class, TransferStatus2Choice.class, TransferStatus4Code.class, TransferStatusAndReason5 .class, TransferUnmatchedReason2Code.class, TransferUnmatchedStatus3Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit8 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.06";

    public MxSese01100106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100106(final String xml) {
        this();
        MxSese01100106 tmp = parse(xml);
        trfInstrStsRpt = tmp.getTrfInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV06 }
     *     
     */
    public TransferInstructionStatusReportV06 getTrfInstrStsRpt() {
        return trfInstrStsRpt;
    }

    /**
     * Sets the value of the trfInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV06 }
     *     
     */
    public MxSese01100106 setTrfInstrStsRpt(TransferInstructionStatusReportV06 value) {
        this.trfInstrStsRpt = value;
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
    public static MxSese01100106 parse(String xml) {
        return ((MxSese01100106) MxReadImpl.parse(MxSese01100106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100106 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100106) parserImpl.read(MxSese01100106 .class, xml, _classes));
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
     * Creates an MxSese01100106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100106 message
     * @return
     *     a new instance of MxSese01100106
     */
    public final static MxSese01100106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01100106 .class);
    }

}
