
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEFRARules1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TEFRARules1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RULC"/&gt;
 *     &lt;enumeration value="RULD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TEFRARules1Code")
@XmlEnum
public enum TEFRARules1Code {


    /**
     * Indicates that the security is issued under the TEFRA rule C.
     * 
     */
    RULC,

    /**
     * Indicates that the security is issued under the TEFRA rule D.
     * 
     */
    RULD;

    public String value() {
        return name();
    }

    public static TEFRARules1Code fromValue(String v) {
        return valueOf(v);
    }

}
