
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
 * Class for camt.029.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rsltnOfInvstgtn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.04")
public class MxCamt02900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RsltnOfInvstgtn", required = true)
    protected ResolutionOfInvestigationV04 rsltnOfInvstgtn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails8 .class, AmountType3Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancellationIndividualStatus1Code.class, CancellationStatusReason2 .class, CancellationStatusReason2Choice.class, Case3 .class, CaseAssignment3 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges3 .class, ChargesRecord1 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CorrectiveGroupInformation1 .class, CorrectiveInterbankTransaction1 .class, CorrectivePaymentInitiation1 .class, CorrectiveTransaction1Choice.class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency6Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupCancellationStatus1Code.class, InvestigationExecutionConfirmation3Code.class, InvestigationStatus3Choice.class, LocalInstrument2Choice.class, MandateRelatedInformation8 .class, ModificationRejection2Code.class, MxCamt02900104 .class, NamePrefix1Code.class, NumberOfCancellationsPerStatus1 .class, NumberOfTransactionsPerStatus1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader5 .class, OriginalGroupInformation3 .class, OriginalPaymentInstruction3 .class, OriginalTransactionReference16 .class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PaymentCancellationRejection2Code.class, PaymentMethod4Code.class, PaymentTransaction39 .class, PaymentTransaction40 .class, PaymentTypeInformation25 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount2 .class, RemittanceInformation7 .class, ResolutionInformation1 .class, ResolutionOfInvestigationV04 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction4 .class, SettlementMethod1Code.class, StatementResolutionEntry2 .class, StructuredRemittanceInformation9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxCharges2 .class, TransactionIndividualStatus1Code.class, UnderlyingTransaction4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.04";

    public MxCamt02900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02900104(final String xml) {
        this();
        MxCamt02900104 tmp = parse(xml);
        rsltnOfInvstgtn = tmp.getRsltnOfInvstgtn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rsltnOfInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionOfInvestigationV04 }
     *     
     */
    public ResolutionOfInvestigationV04 getRsltnOfInvstgtn() {
        return rsltnOfInvstgtn;
    }

    /**
     * Sets the value of the rsltnOfInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionOfInvestigationV04 }
     *     
     */
    public MxCamt02900104 setRsltnOfInvstgtn(ResolutionOfInvestigationV04 value) {
        this.rsltnOfInvstgtn = value;
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
    public static MxCamt02900104 parse(String xml) {
        return ((MxCamt02900104) MxReadImpl.parse(MxCamt02900104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02900104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02900104) parserImpl.read(MxCamt02900104 .class, xml, _classes));
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
     * Creates an MxCamt02900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02900104 message
     * @return
     *     a new instance of MxCamt02900104
     */
    public final static MxCamt02900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02900104 .class);
    }

}
