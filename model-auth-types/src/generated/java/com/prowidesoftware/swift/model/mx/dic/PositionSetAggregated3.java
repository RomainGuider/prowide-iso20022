
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of position sets calculated to represent the exposures between a pair of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetAggregated3", propOrder = {
    "refDt",
    "posSet",
    "ccyPosSet",
    "collPosSet",
    "ccyCollPosSet"
})
public class PositionSetAggregated3 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "PosSet")
    protected List<PositionSet5> posSet;
    @XmlElement(name = "CcyPosSet")
    protected List<PositionSet5> ccyPosSet;
    @XmlElement(name = "CollPosSet")
    protected List<PositionSet4> collPosSet;
    @XmlElement(name = "CcyCollPosSet")
    protected List<PositionSet4> ccyCollPosSet;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetAggregated3 setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the posSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet5 }
     * 
     * 
     */
    public List<PositionSet5> getPosSet() {
        if (posSet == null) {
            posSet = new ArrayList<PositionSet5>();
        }
        return this.posSet;
    }

    /**
     * Gets the value of the ccyPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet5 }
     * 
     * 
     */
    public List<PositionSet5> getCcyPosSet() {
        if (ccyPosSet == null) {
            ccyPosSet = new ArrayList<PositionSet5>();
        }
        return this.ccyPosSet;
    }

    /**
     * Gets the value of the collPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet4 }
     * 
     * 
     */
    public List<PositionSet4> getCollPosSet() {
        if (collPosSet == null) {
            collPosSet = new ArrayList<PositionSet4>();
        }
        return this.collPosSet;
    }

    /**
     * Gets the value of the ccyCollPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyCollPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyCollPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet4 }
     * 
     * 
     */
    public List<PositionSet4> getCcyCollPosSet() {
        if (ccyCollPosSet == null) {
            ccyCollPosSet = new ArrayList<PositionSet4>();
        }
        return this.ccyCollPosSet;
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
     * Adds a new item to the posSet list.
     * @see #getPosSet()
     * 
     */
    public PositionSetAggregated3 addPosSet(PositionSet5 posSet) {
        getPosSet().add(posSet);
        return this;
    }

    /**
     * Adds a new item to the ccyPosSet list.
     * @see #getCcyPosSet()
     * 
     */
    public PositionSetAggregated3 addCcyPosSet(PositionSet5 ccyPosSet) {
        getCcyPosSet().add(ccyPosSet);
        return this;
    }

    /**
     * Adds a new item to the collPosSet list.
     * @see #getCollPosSet()
     * 
     */
    public PositionSetAggregated3 addCollPosSet(PositionSet4 collPosSet) {
        getCollPosSet().add(collPosSet);
        return this;
    }

    /**
     * Adds a new item to the ccyCollPosSet list.
     * @see #getCcyCollPosSet()
     * 
     */
    public PositionSetAggregated3 addCcyCollPosSet(PositionSet4 ccyCollPosSet) {
        getCcyCollPosSet().add(ccyCollPosSet);
        return this;
    }

}
