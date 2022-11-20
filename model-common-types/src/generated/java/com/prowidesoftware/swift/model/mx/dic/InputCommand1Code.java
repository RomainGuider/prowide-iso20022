
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputCommand1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InputCommand1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DCSG"/&gt;
 *     &lt;enumeration value="DGSG"/&gt;
 *     &lt;enumeration value="GAKY"/&gt;
 *     &lt;enumeration value="GCNF"/&gt;
 *     &lt;enumeration value="GFKY"/&gt;
 *     &lt;enumeration value="GMNE"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="SITE"/&gt;
 *     &lt;enumeration value="TXSG"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InputCommand1Code")
@XmlEnum
public enum InputCommand1Code {


    /**
     * Wait for a string of digit characters with a decimal point, the length range could be specified.
     * 
     */
    DCSG,

    /**
     * Wait for a string of digit characters.
     * 
     */
    DGSG,

    /**
     * Wait for a key pressed on the Terminal, to be able to read the message displayed on the Terminal.
     * 
     */
    GAKY,

    /**
     * Wait for a confirmation Yes (Y) or No (N) on the Sale System. Wait for a confirmation (Valid or Cancel button) on the POI Terminal. The result of the command is a Boolean: True or False.
     * 
     */
    GCNF,

    /**
     * Wait for a function key pressed on the Terminal: From POI, Valid, Clear, Correct, Generic Function key number. From Sale, Generic Function key.
     * 
     */
    GFKY,

    /**
     * To choose an entry among a list of entries (all of them are not necessary selectable). The OutputFormat has to be MenuEntry.
     * 
     */
    GMNE,

    /**
     * Request to enter a password with masked characters while typing the password.
     * 
     */
    PSWD,

    /**
     * Wait for a confirmation Yes (Y) or No (N) of the Site Manager on the Sale System.
     * 
     */
    SITE,

    /**
     * Wait for a string of alphanumeric characters.
     * 
     */
    TXSG,

    /**
     * Wait for a XHTML data.
     * 
     */
    HTML,

    /**
     * Request to wait for signature.
     * 
     */
    SIGN;

    public String value() {
        return name();
    }

    public static InputCommand1Code fromValue(String v) {
        return valueOf(v);
    }

}
