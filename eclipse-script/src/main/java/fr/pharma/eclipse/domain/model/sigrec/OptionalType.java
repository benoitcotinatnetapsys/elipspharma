//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.11.08 at 10:05:49 AM CET
//

package fr.pharma.eclipse.domain.model.sigrec;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for optional_type complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="optional_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="na">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="1"/>
 *             &lt;enumeration value=""/>
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optional_type", propOrder =
{"value" })
@XmlSeeAlso(
{fr.pharma.eclipse.domain.model.sigrec.DeclarationType.VersionProtocoleNumber.class,
 fr.pharma.eclipse.domain.model.sigrec.DeclarationType.AdmissibilityDate.class,
 fr.pharma.eclipse.domain.model.sigrec.EthicsCommitteeDeclarationType.AdmissibilityDate.class,
 fr.pharma.eclipse.domain.model.sigrec.CompetentAuthorityDeclarationType.AdmissibilityDate.class })
public class OptionalType
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    protected String value;
    @XmlAttribute
    protected String na;

    /**
     * Gets the value of the value property.
     * @return possible object is {@link String }
     */
    public String getValue()
    {
        return this.value;
    }

    /**
     * Sets the value of the value property.
     * @param value allowed object is {@link String }
     */
    public void setValue(final String value)
    {
        this.value = value;
    }

    /**
     * Gets the value of the na property.
     * @return possible object is {@link String }
     */
    public String getNa()
    {
        return this.na;
    }

    /**
     * Sets the value of the na property.
     * @param value allowed object is {@link String }
     */
    public void setNa(final String value)
    {
        this.na = value;
    }

}