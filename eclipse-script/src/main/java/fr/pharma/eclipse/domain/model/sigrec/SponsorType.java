//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.11.08 at 10:05:49 AM CET
//

package fr.pharma.eclipse.domain.model.sigrec;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import fr.pharma.eclipse.domain.model.sigrec.common.BeanSigrec;
import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for sponsorType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sponsorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ev-sponsor-sender-id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sponsor-status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="is-lead-sponsor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sponsor-type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type-id">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sponsor-category" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="cat-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sponsor-contact-details" type="{http://sigrec.ClinicalTrialApplication.xsd}ContactDetailsType" minOccurs="0"/>
 *         &lt;element name="sponsor-intervenants" type="{http://sigrec.ClinicalTrialApplication.xsd}IntervenantsType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="node-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sponsorType", propOrder =
{

})
public class SponsorType
    extends BeanSigrec
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ev-sponsor-sender-id")
    protected String evSponsorSenderId;
    @XmlElement(name = "sponsor-status")
    protected String sponsorStatus;
    @XmlElement(name = "is-lead-sponsor", defaultValue = "Y")
    protected String isLeadSponsor;
    @XmlElement(name = "sponsor-type")
    protected SponsorType.SponsorSsType ssponsorType;
    @XmlElement(name = "sponsor-category")
    protected SponsorType.SponsorCategory sponsorCategory;
    @XmlElement(name = "sponsor-contact-details")
    protected ContactDetailsType sponsorContactDetails;
    @XmlElement(name = "sponsor-intervenants")
    protected IntervenantsType sponsorIntervenants;
    @XmlAttribute(name = "node-id")
    protected String nodeId;

    /**
     * Gets the value of the evSponsorSenderId property.
     * @return possible object is {@link String }
     */
    public String getEvSponsorSenderId()
    {
        return this.evSponsorSenderId;
    }

    /**
     * Sets the value of the evSponsorSenderId property.
     * @param value allowed object is {@link String }
     */
    public void setEvSponsorSenderId(final String value)
    {
        this.evSponsorSenderId = value;
    }

    /**
     * Gets the value of the sponsorStatus property.
     * @return possible object is {@link String }
     */
    public String getSponsorStatus()
    {
        return this.sponsorStatus;
    }

    /**
     * Sets the value of the sponsorStatus property.
     * @param value allowed object is {@link String }
     */
    public void setSponsorStatus(final String value)
    {
        this.sponsorStatus = value;
    }

    /**
     * Gets the value of the isLeadSponsor property.
     * @return possible object is {@link String }
     */
    public String getIsLeadSponsor()
    {
        return this.isLeadSponsor;
    }

    /**
     * Sets the value of the isLeadSponsor property.
     * @param value allowed object is {@link String }
     */
    public void setIsLeadSponsor(final String value)
    {
        this.isLeadSponsor = value;
    }

    /**
     * Gets the value of the sponsorType property.
     * @return possible object is {@link SponsorType.SponsorType }
     */
    public SponsorType.SponsorSsType getSponsorType()
    {
        return this.ssponsorType;
    }

    /**
     * Sets the value of the sponsorType property.
     * @param value allowed object is {@link SponsorType.SponsorType }
     */
    public void setSponsorType(final SponsorType.SponsorSsType value)
    {
        this.ssponsorType = value;
    }

    /**
     * Gets the value of the sponsorCategory property.
     * @return possible object is {@link SponsorType.SponsorCategory }
     */
    public SponsorType.SponsorCategory getSponsorCategory()
    {
        return this.sponsorCategory;
    }

    /**
     * Sets the value of the sponsorCategory property.
     * @param value allowed object is {@link SponsorType.SponsorCategory }
     */
    public void setSponsorCategory(final SponsorType.SponsorCategory value)
    {
        this.sponsorCategory = value;
    }

    /**
     * Gets the value of the sponsorContactDetails property.
     * @return possible object is {@link ContactDetailsType }
     */
    public ContactDetailsType getSponsorContactDetails()
    {
        return this.sponsorContactDetails;
    }

    /**
     * Sets the value of the sponsorContactDetails property.
     * @param value allowed object is {@link ContactDetailsType }
     */
    public void setSponsorContactDetails(final ContactDetailsType value)
    {
        this.sponsorContactDetails = value;
    }

    /**
     * Gets the value of the sponsorIntervenants property.
     * @return possible object is {@link IntervenantsType }
     */
    public IntervenantsType getSponsorIntervenants()
    {
        return this.sponsorIntervenants;
    }

    /**
     * Sets the value of the sponsorIntervenants property.
     * @param value allowed object is {@link IntervenantsType }
     */
    public void setSponsorIntervenants(final IntervenantsType value)
    {
        this.sponsorIntervenants = value;
    }

    /**
     * Gets the value of the nodeId property.
     * @return possible object is {@link String }
     */
    public String getNodeId()
    {
        return this.nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * @param value allowed object is {@link String }
     */
    public void setNodeId(final String value)
    {
        this.nodeId = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="cat-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
    {"value" })
    public static class SponsorCategory
        implements Serializable, SigrecElement
    {

        private final static long serialVersionUID = 100L;
        @XmlValue
        protected String value;
        @XmlAttribute(name = "cat-id")
        protected String catId;

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
         * Gets the value of the catId property.
         * @return possible object is {@link String }
         */
        public String getCatId()
        {
            return this.catId;
        }

        /**
         * Sets the value of the catId property.
         * @param value allowed object is {@link String }
         */
        public void setCatId(final String value)
        {
            this.catId = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="type-id">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "sponsor-type", propOrder =
    {"value" })
    public static class SponsorSsType
        implements Serializable, SigrecElement
    {

        private final static long serialVersionUID = 100L;
        @XmlValue
        protected String value;
        @XmlAttribute(name = "type-id")
        protected BigInteger typeId;

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
         * Gets the value of the typeId property.
         * @return possible object is {@link BigInteger }
         */
        public BigInteger getTypeId()
        {
            return this.typeId;
        }

        /**
         * Sets the value of the typeId property.
         * @param value allowed object is {@link BigInteger }
         */
        public void setTypeId(final BigInteger value)
        {
            this.typeId = value;
        }

    }

}