//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 01:12:14 PM CET 
//


package com.kodilla.courses.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for technology.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="technology"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JAVA"/&gt;
 *     &lt;enumeration value="JAVASCRIPT"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "technology")
@XmlEnum
public enum Technology {

    JAVA,
    JAVASCRIPT,
    HTML;

    public String value() {
        return name();
    }

    public static Technology fromValue(String v) {
        return valueOf(v);
    }

}
