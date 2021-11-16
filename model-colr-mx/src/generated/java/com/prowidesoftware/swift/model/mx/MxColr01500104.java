
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
 * Class for colr.015.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intrstPmtStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.015.001.04")
public class MxColr01500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntrstPmtStmt", required = true)
    protected InterestPaymentStatementV04 intrstPmtStmt;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, Agreement4 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AmountAndDirection20 .class, CollateralAccount2 .class, CollateralAccountIdentificationType2Choice.class, CollateralAccountType1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, ExposureType5Code.class, Frequency1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, InterestCalculation4 .class, InterestPaymentStatementV04 .class, InterestStatement4 .class, MxColr01500104 .class, NameAndAddress6 .class, Obligation4 .class, Pagination.class, PartyIdentification100Choice.class, PostalAddress2 .class, Statement32 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.015.001.04";

    public MxColr01500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01500104(final String xml) {
        this();
        MxColr01500104 tmp = parse(xml);
        intrstPmtStmt = tmp.getIntrstPmtStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intrstPmtStmt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentStatementV04 }
     *     
     */
    public InterestPaymentStatementV04 getIntrstPmtStmt() {
        return intrstPmtStmt;
    }

    /**
     * Sets the value of the intrstPmtStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentStatementV04 }
     *     
     */
    public MxColr01500104 setIntrstPmtStmt(InterestPaymentStatementV04 value) {
        this.intrstPmtStmt = value;
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
    public static MxColr01500104 parse(String xml) {
        return ((MxColr01500104) MxReadImpl.parse(MxColr01500104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01500104 parse(String xml, MxRead parserImpl) {
        return ((MxColr01500104) parserImpl.read(MxColr01500104 .class, xml, _classes));
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
     * Creates an MxColr01500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01500104 message
     * @return
     *     a new instance of MxColr01500104
     */
    public final static MxColr01500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01500104 .class);
    }

}
