
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails59", propOrder = {
    "hldInd",
    "sttlmTxCond",
    "sttlgCpcty",
    "stmpDtyTaxBsis",
    "sctiesRTGS",
    "bnfclOwnrsh",
    "cshClrSys",
    "taxCpcty",
    "mktClntSd",
    "blckTrad",
    "lglRstrctns",
    "sttlmSysMtd",
    "netgElgblty",
    "ccpElgblty",
    "prtlSttlmInd",
    "elgblForColl"
})
public class SettlementDetails59 {

    @XmlElement(name = "HldInd")
    protected Boolean hldInd;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition8Choice> sttlmTxCond;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity2Choice sttlgCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification25 stmpDtyTaxBsis;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS2Choice sctiesRTGS;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership2Choice bnfclOwnrsh;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem2Choice cshClrSys;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty2Choice taxCpcty;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide2Choice mktClntSd;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade2Choice blckTrad;
    @XmlElement(name = "LglRstrctns")
    protected Restriction2Choice lglRstrctns;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod2Choice sttlmSysMtd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility2Choice netgElgblty;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility2Choice ccpElgblty;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails59 setHldInd(Boolean value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition8Choice }
     * 
     * 
     */
    public List<SettlementTransactionCondition8Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<SettlementTransactionCondition8Choice>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the sttlgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity2Choice }
     *     
     */
    public SettlingCapacity2Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Sets the value of the sttlgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity2Choice }
     *     
     */
    public SettlementDetails59 setSttlgCpcty(SettlingCapacity2Choice value) {
        this.sttlgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyTaxBsis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification25 }
     *     
     */
    public GenericIdentification25 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Sets the value of the stmpDtyTaxBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification25 }
     *     
     */
    public SettlementDetails59 setStmpDtyTaxBsis(GenericIdentification25 value) {
        this.stmpDtyTaxBsis = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS2Choice }
     *     
     */
    public SecuritiesRTGS2Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS2Choice }
     *     
     */
    public SettlementDetails59 setSctiesRTGS(SecuritiesRTGS2Choice value) {
        this.sctiesRTGS = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialOwnership2Choice }
     *     
     */
    public BeneficialOwnership2Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Sets the value of the bnfclOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership2Choice }
     *     
     */
    public SettlementDetails59 setBnfclOwnrsh(BeneficialOwnership2Choice value) {
        this.bnfclOwnrsh = value;
        return this;
    }

    /**
     * Gets the value of the cshClrSys property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem2Choice }
     *     
     */
    public CashSettlementSystem2Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Sets the value of the cshClrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem2Choice }
     *     
     */
    public SettlementDetails59 setCshClrSys(CashSettlementSystem2Choice value) {
        this.cshClrSys = value;
        return this;
    }

    /**
     * Gets the value of the taxCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty2Choice }
     *     
     */
    public TaxCapacityParty2Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Sets the value of the taxCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty2Choice }
     *     
     */
    public SettlementDetails59 setTaxCpcty(TaxCapacityParty2Choice value) {
        this.taxCpcty = value;
        return this;
    }

    /**
     * Gets the value of the mktClntSd property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide2Choice }
     *     
     */
    public MarketClientSide2Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Sets the value of the mktClntSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide2Choice }
     *     
     */
    public SettlementDetails59 setMktClntSd(MarketClientSide2Choice value) {
        this.mktClntSd = value;
        return this;
    }

    /**
     * Gets the value of the blckTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade2Choice }
     *     
     */
    public BlockTrade2Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Sets the value of the blckTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade2Choice }
     *     
     */
    public SettlementDetails59 setBlckTrad(BlockTrade2Choice value) {
        this.blckTrad = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction2Choice }
     *     
     */
    public Restriction2Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction2Choice }
     *     
     */
    public SettlementDetails59 setLglRstrctns(Restriction2Choice value) {
        this.lglRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSysMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod2Choice }
     *     
     */
    public SettlementSystemMethod2Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Sets the value of the sttlmSysMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod2Choice }
     *     
     */
    public SettlementDetails59 setSttlmSysMtd(SettlementSystemMethod2Choice value) {
        this.sttlmSysMtd = value;
        return this;
    }

    /**
     * Gets the value of the netgElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility2Choice }
     *     
     */
    public NettingEligibility2Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Sets the value of the netgElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility2Choice }
     *     
     */
    public SettlementDetails59 setNetgElgblty(NettingEligibility2Choice value) {
        this.netgElgblty = value;
        return this;
    }

    /**
     * Gets the value of the ccpElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility2Choice }
     *     
     */
    public CentralCounterPartyEligibility2Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Sets the value of the ccpElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility2Choice }
     *     
     */
    public SettlementDetails59 setCCPElgblty(CentralCounterPartyEligibility2Choice value) {
        this.ccpElgblty = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementDetails59 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the elgblForColl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblForColl() {
        return elgblForColl;
    }

    /**
     * Sets the value of the elgblForColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails59 setElgblForColl(Boolean value) {
        this.elgblForColl = value;
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

    /**
     * Adds a new item to the sttlmTxCond list.
     * @see #getSttlmTxCond()
     * 
     */
    public SettlementDetails59 addSttlmTxCond(SettlementTransactionCondition8Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
