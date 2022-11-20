
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyHandling1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyHandling1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLO"/&gt;
 *     &lt;enumeration value="DENY"/&gt;
 *     &lt;enumeration value="PRCS"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoyaltyHandling1Code")
@XmlEnum
public enum LoyaltyHandling1Code {


    /**
     * The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). 
     * 
     */
    ALLO,

    /**
     * No loyalty card to read and loyalty transaction to process. 	Any attempt to enter a pure loyalty card is rejected.
     * 
     */
    DENY,

    /**
     * The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.
     * 
     */
    PRCS,

    /**
     * The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.
     * 
     */
    PROP,

    /**
     * The loyalty is required, and the POI refuses the processing 	of the message request if the cardholder does not enter a loyalty card.
     * 
     */
    REQU;

    public String value() {
        return name();
    }

    public static LoyaltyHandling1Code fromValue(String v) {
        return valueOf(v);
    }

}
