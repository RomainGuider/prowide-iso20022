
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.019.002.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.019.002.10")
public class MxSemt01900210
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtRpt", required = true)
    protected SecuritiesSettlementTransactionAllegementReport002V10 sctiesSttlmTxAllgmtRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AllegementStatus1Code.class, AllegementStatus4Choice.class, AlternatePartyIdentification9 .class, AmountAndDirection59 .class, AmountAndDirection72 .class, AmountAndDirection92 .class, BeneficialOwnership5Choice.class, BlockChainAddressWallet7 .class, CashAccountIdentification6Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, ClassificationType33Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode32Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, EventFrequency4Code.class, FinancialInstrumentAttributes122 .class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency26Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, LegalFramework1Code.class, LegalFramework4Choice.class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MxSemt01900210 .class, NameAndAddress12 .class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OtherAmounts36 .class, OtherIdentification2 .class, OtherParties37 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification162 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentificationAndAccount206 .class, PartyTextInformation3 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, Price11 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType12Code.class, PriceValueType1Code.class, QuantityAndAccount107 .class, QuantityBreakdown69 .class, Rate2 .class, RateName2 .class, RateType1Code.class, RateType67Choice.class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration1Code.class, RepurchaseType17Choice.class, RepurchaseType6Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesFinancingTransactionDetails50 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesSettlementTransactionAllegementReport002V10 .class, SecuritiesTradeDetails140 .class, SecuritiesTransactionType24Code.class, SecuritiesTransactionType49Choice.class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails174 .class, SettlementParties105 .class, SettlementTransactionCondition26Choice.class, SettlementTransactionCondition4Code.class, SettlementTransactionCondition5Code.class, Statement69 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TerminationDate7Choice.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class, YieldedOrValueType2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.019.002.10";

    public MxSemt01900210() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01900210(final String xml) {
        this();
        MxSemt01900210 tmp = parse(xml);
        sctiesSttlmTxAllgmtRpt = tmp.getSctiesSttlmTxAllgmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01900210(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementReport002V10 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementReport002V10 getSctiesSttlmTxAllgmtRpt() {
        return sctiesSttlmTxAllgmtRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementReport002V10 }
     *     
     */
    public MxSemt01900210 setSctiesSttlmTxAllgmtRpt(SecuritiesSettlementTransactionAllegementReport002V10 value) {
        this.sctiesSttlmTxAllgmtRpt = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSemt01900210 parse(String xml) {
        return ((MxSemt01900210) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01900210 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01900210 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01900210) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01900210 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01900210 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01900210) parserImpl.read(MxSemt01900210 .class, xml, _classes));
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
     * Creates an MxSemt01900210 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01900210 message
     * @return
     *     a new instance of MxSemt01900210
     */
    public final static MxSemt01900210 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01900210 .class);
    }

}
