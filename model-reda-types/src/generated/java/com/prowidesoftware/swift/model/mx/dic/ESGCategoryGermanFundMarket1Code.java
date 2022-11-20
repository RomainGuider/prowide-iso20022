
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESGCategoryGermanFundMarket1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ESGCategoryGermanFundMarket1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEUT"/&gt;
 *     &lt;enumeration value="IMPF"/&gt;
 *     &lt;enumeration value="ESGF"/&gt;
 *     &lt;enumeration value="BASF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ESGCategoryGermanFundMarket1Code")
@XmlEnum
public enum ESGCategoryGermanFundMarket1Code {


    /**
     * Neutral or has no impact.
     * 
     */
    NEUT,

    /**
     * Product with impact-related investment (pursuant to Article 9 Disclosure Regulation):
     * - No serious breach of the United Nations Global Compact (UNGC);
     * - Relevant for both individual products and those in a portfolio/basket (shares/bonds);
     * - Product manager follows a recognised industry standard (UN PRI).
     * 
     */
    IMPF,

    /**
     * Product with a dedicated environmental, social and corporate governance (ESG) strategy (pursuant to Article 8 Disclosure Regulation).
     * 
     */
    ESGF,

    /**
     * Product having environmental, social and corporate governance (ESG) characteristics, opportunities or risks according to the "ESG integration enhanced" criteria.
     * Product integration approach is disclosed and the product manager follows a recognised industry standard (UN PRI).
     * 
     */
    BASF;

    public String value() {
        return name();
    }

    public static ESGCategoryGermanFundMarket1Code fromValue(String v) {
        return valueOf(v);
    }

}
