
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
 * Class for cain.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "nqryInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.016.001.01")
public class MxCain01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NqryInitn", required = true)
    protected InquiryInitiationV01 nqryInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails2 .class, Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AdditionalAction1 .class, AdditionalAmounts2 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, AdditionalRiskData1 .class, AdditionalService1 .class, AdditionalServiceType1Code.class, Address1 .class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount14 .class, Amount4 .class, Amount5 .class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationMethod11Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities1 .class, CardData1 .class, CardDataReading7Code.class, CardDataWriting1Code.class, CardProgramme1 .class, CardProgrammeMode1 .class, CardProgrammeMode2 .class, Cardholder15 .class, CardholderName1 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, CommunicationCharacteristics3 .class, Contact1 .class, Content1 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context5 .class, Credentials1 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CustomerDevice2 .class, CustomerDeviceType1Code.class, DetailAmount2Code.class, DetailedAmount20 .class, Device1 .class, DigestedData5 .class, DisplayCapabilities6 .class, ECommerceData1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment12 .class, FeeAmount2 .class, GenericIdentification172 .class, GenericIdentification48 .class, GenericInformation1 .class, GeographicCoordinates1 .class, Header39 .class, Identification2Code.class, InquiryInitiation1 .class, InquiryInitiationV01 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, MACData1 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction17Code.class, MxCain01600101 .class, OnLineCapability2Code.class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification197 .class, PartyIdentification200 .class, PartyIdentification203 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType28Code.class, PartyType7Code.class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PointOfServiceContext1 .class, Priority3Code.class, ProcessingResult5 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData1 .class, RiskAssessment1 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext1 .class, RiskInputData1 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService1 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SignedData5 .class, Signer4 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal1 .class, TerminalIdentification1 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token1 .class, Traceability7 .class, Track2Data1Choice.class, Transaction105 .class, TransactionContext1 .class, TransactionIdentification11 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class, TypeOfAmount17Code.class, UserInterface1Code.class, UserInterface6Code.class, Verification1 .class, Verification2Code.class, VerificationEntity1Code.class, VerificationInformation1 .class, VerificationResult1 .class, VerificationValue1Choice.class, Wallet1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.016.001.01";

    public MxCain01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01600101(final String xml) {
        this();
        MxCain01600101 tmp = parse(xml);
        nqryInitn = tmp.getNqryInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the nqryInitn property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryInitiationV01 }
     *     
     */
    public InquiryInitiationV01 getNqryInitn() {
        return nqryInitn;
    }

    /**
     * Sets the value of the nqryInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryInitiationV01 }
     *     
     */
    public MxCain01600101 setNqryInitn(InquiryInitiationV01 value) {
        this.nqryInitn = value;
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
    public static MxCain01600101 parse(String xml) {
        return ((MxCain01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01600101 parse(String xml, MxRead parserImpl) {
        return ((MxCain01600101) parserImpl.read(MxCain01600101 .class, xml, _classes));
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
     * Creates an MxCain01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01600101 message
     * @return
     *     a new instance of MxCain01600101
     */
    public final static MxCain01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01600101 .class);
    }

}
