
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * This message is sent by the central counterparty (CCP) to a Clearing member to report all trades that have been executed by the trading platform.
 * This message may be either sent:
 * - during the day (to report trades execution by batch) or
 * - as an end of day report.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegStatementV01", propOrder = {
    "id",
    "pgntn",
    "stmtParams",
    "clrMmb",
    "clrAcct",
    "stmtDtls",
    "splmtryData"
})
public class TradeLegStatementV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtParams", required = true)
    protected Statement31 stmtParams;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "StmtDtls", required = true)
    protected List<TradeLegStatement1> stmtDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public TradeLegStatementV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public TradeLegStatementV01 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtParams property.
     * 
     * @return
     *     possible object is
     *     {@link Statement31 }
     *     
     */
    public Statement31 getStmtParams() {
        return stmtParams;
    }

    /**
     * Sets the value of the stmtParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement31 }
     *     
     */
    public TradeLegStatementV01 setStmtParams(Statement31 value) {
        this.stmtParams = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public TradeLegStatementV01 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public TradeLegStatementV01 setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLegStatement1 }
     * 
     * 
     */
    public List<TradeLegStatement1> getStmtDtls() {
        if (stmtDtls == null) {
            stmtDtls = new ArrayList<TradeLegStatement1>();
        }
        return this.stmtDtls;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the stmtDtls list.
     * @see #getStmtDtls()
     * 
     */
    public TradeLegStatementV01 addStmtDtls(TradeLegStatement1 stmtDtls) {
        getStmtDtls().add(stmtDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeLegStatementV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
