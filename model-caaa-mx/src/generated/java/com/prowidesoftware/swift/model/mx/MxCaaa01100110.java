
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
 * Class for caaa.011.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.10")
public class MxCaaa01100110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrf", required = true)
    protected AcceptorBatchTransferV10 accptrBtchTrf;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorBatchTransferV10 .class, AccountChoiceMethod1Code.class, AccountIdentification39Choice.class, Acquirer10 .class, Action11 .class, ActionMessage8 .class, ActionType9Code.class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData7 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult14 .class, AuthorisationResult15 .class, AuthorisationResult16 .class, BarcodeType1Code.class, BytePadding1Code.class, CardAccount15 .class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentBatchTransfer9 .class, CardPaymentContext28 .class, CardPaymentDataSet26 .class, CardPaymentDataSetTransaction34 .class, CardPaymentDataSetTransaction35 .class, CardPaymentDataSetTransaction36 .class, CardPaymentDataSetTransaction37 .class, CardPaymentDataSetTransaction9Choice.class, CardPaymentEnvironment77 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType9Code.class, CardPaymentTransaction103 .class, CardPaymentTransaction104 .class, CardPaymentTransaction106 .class, CardPaymentTransaction107 .class, CardPaymentTransaction109 .class, CardPaymentTransaction111 .class, CardPaymentTransactionDetails34 .class, CardPaymentTransactionDetails49 .class, CardPaymentTransactionResult4 .class, CardProductType1Code.class, Cardholder17 .class, CardholderAuthentication14 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommonData10 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType25 .class, ContentInformationType26 .class, ContentInformationType27 .class, ContentInformationType28 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey15 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion20 .class, CurrencyConversion21 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, DataSetCategory8Code.class, DataSetIdentification5 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData8 .class, Exemption1Code.class, ExternallyDefinedData2 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification1 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header56 .class, InformationQualify1Code.class, InstalmentPlan1Code.class, IssuerAndSerialNumber2 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport7 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount2 .class, LoyaltyHandling1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken1 .class, MobileData3 .class, MxCaaa01100110 .class, NameAndAddress3 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN8 .class, OnLineReason1Code.class, Organisation26 .class, Organisation41 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType2 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification177Choice.class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard31 .class, PaymentContext27 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction11 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent11 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics7 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress22 .class, Product4 .class, Product5 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient10Choice.class, Recipient9Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response9Code.class, ResponseType10 .class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData6 .class, Signer5 .class, SimpleIdentificationInformation4 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, TokenRequestComponent1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals12 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, TypeTransactionTotals2Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.10";

    public MxCaaa01100110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01100110(final String xml) {
        this();
        MxCaaa01100110 tmp = parse(xml);
        accptrBtchTrf = tmp.getAccptrBtchTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01100110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferV10 }
     *     
     */
    public AcceptorBatchTransferV10 getAccptrBtchTrf() {
        return accptrBtchTrf;
    }

    /**
     * Sets the value of the accptrBtchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferV10 }
     *     
     */
    public MxCaaa01100110 setAccptrBtchTrf(AcceptorBatchTransferV10 value) {
        this.accptrBtchTrf = value;
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
    public static MxCaaa01100110 parse(String xml) {
        return ((MxCaaa01100110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01100110 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01100110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01100110 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01100110) parserImpl.read(MxCaaa01100110 .class, xml, _classes));
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
     * Creates an MxCaaa01100110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01100110 message
     * @return
     *     a new instance of MxCaaa01100110
     */
    public final static MxCaaa01100110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01100110 .class);
    }

}
