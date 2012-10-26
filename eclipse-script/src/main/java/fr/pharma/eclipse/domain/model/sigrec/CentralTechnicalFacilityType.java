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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for central-technical-facilityType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="central-technical-facilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="organisation-name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="organisation-department-name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contact-details" type="{http://sigrec.ClinicalTrialApplication.xsd}ContactDetailsType" minOccurs="0"/>
 *         &lt;element name="duty-routine-clinical-pathology" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-clinical-chemistry" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-clinical-haematology" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-clinical-microbiology" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-histopathology" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-serology-endocrinology" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-analytical-chemistry" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-ecg-analysis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-medical-image-analysis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-endpoint-test" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-other-duties" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="duty-other-duties-descriptions" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="node-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "central-technical-facilityType", propOrder =
{

})
public class CentralTechnicalFacilityType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "organisation-name")
    protected String organisationName;
    @XmlElement(name = "organisation-department-name")
    protected String organisationDepartmentName;
    @XmlElement(name = "contact-details")
    protected ContactDetailsType contactDetails;
    @XmlElement(name = "duty-routine-clinical-pathology")
    protected String dutyRoutineClinicalPathology;
    @XmlElement(name = "duty-clinical-chemistry")
    protected String dutyClinicalChemistry;
    @XmlElement(name = "duty-clinical-haematology")
    protected String dutyClinicalHaematology;
    @XmlElement(name = "duty-clinical-microbiology")
    protected String dutyClinicalMicrobiology;
    @XmlElement(name = "duty-histopathology")
    protected String dutyHistopathology;
    @XmlElement(name = "duty-serology-endocrinology")
    protected String dutySerologyEndocrinology;
    @XmlElement(name = "duty-analytical-chemistry")
    protected String dutyAnalyticalChemistry;
    @XmlElement(name = "duty-ecg-analysis")
    protected String dutyEcgAnalysis;
    @XmlElement(name = "duty-medical-image-analysis")
    protected String dutyMedicalImageAnalysis;
    @XmlElement(name = "duty-endpoint-test")
    protected String dutyEndpointTest;
    @XmlElement(name = "duty-other-duties")
    protected String dutyOtherDuties;
    @XmlElement(name = "duty-other-duties-descriptions")
    protected String dutyOtherDutiesDescriptions;
    @XmlAttribute(name = "node-id")
    protected String nodeId;

    /**
     * Gets the value of the organisationName property.
     * @return possible object is {@link String }
     */
    public String getOrganisationName()
    {
        return this.organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * @param value allowed object is {@link String }
     */
    public void setOrganisationName(final String value)
    {
        this.organisationName = value;
    }

    /**
     * Gets the value of the organisationDepartmentName property.
     * @return possible object is {@link String }
     */
    public String getOrganisationDepartmentName()
    {
        return this.organisationDepartmentName;
    }

    /**
     * Sets the value of the organisationDepartmentName property.
     * @param value allowed object is {@link String }
     */
    public void setOrganisationDepartmentName(final String value)
    {
        this.organisationDepartmentName = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * @return possible object is {@link ContactDetailsType }
     */
    public ContactDetailsType getContactDetails()
    {
        return this.contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * @param value allowed object is {@link ContactDetailsType }
     */
    public void setContactDetails(final ContactDetailsType value)
    {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the dutyRoutineClinicalPathology property.
     * @return possible object is {@link String }
     */
    public String getDutyRoutineClinicalPathology()
    {
        return this.dutyRoutineClinicalPathology;
    }

    /**
     * Sets the value of the dutyRoutineClinicalPathology property.
     * @param value allowed object is {@link String }
     */
    public void setDutyRoutineClinicalPathology(final String value)
    {
        this.dutyRoutineClinicalPathology = value;
    }

    /**
     * Gets the value of the dutyClinicalChemistry property.
     * @return possible object is {@link String }
     */
    public String getDutyClinicalChemistry()
    {
        return this.dutyClinicalChemistry;
    }

    /**
     * Sets the value of the dutyClinicalChemistry property.
     * @param value allowed object is {@link String }
     */
    public void setDutyClinicalChemistry(final String value)
    {
        this.dutyClinicalChemistry = value;
    }

    /**
     * Gets the value of the dutyClinicalHaematology property.
     * @return possible object is {@link String }
     */
    public String getDutyClinicalHaematology()
    {
        return this.dutyClinicalHaematology;
    }

    /**
     * Sets the value of the dutyClinicalHaematology property.
     * @param value allowed object is {@link String }
     */
    public void setDutyClinicalHaematology(final String value)
    {
        this.dutyClinicalHaematology = value;
    }

    /**
     * Gets the value of the dutyClinicalMicrobiology property.
     * @return possible object is {@link String }
     */
    public String getDutyClinicalMicrobiology()
    {
        return this.dutyClinicalMicrobiology;
    }

    /**
     * Sets the value of the dutyClinicalMicrobiology property.
     * @param value allowed object is {@link String }
     */
    public void setDutyClinicalMicrobiology(final String value)
    {
        this.dutyClinicalMicrobiology = value;
    }

    /**
     * Gets the value of the dutyHistopathology property.
     * @return possible object is {@link String }
     */
    public String getDutyHistopathology()
    {
        return this.dutyHistopathology;
    }

    /**
     * Sets the value of the dutyHistopathology property.
     * @param value allowed object is {@link String }
     */
    public void setDutyHistopathology(final String value)
    {
        this.dutyHistopathology = value;
    }

    /**
     * Gets the value of the dutySerologyEndocrinology property.
     * @return possible object is {@link String }
     */
    public String getDutySerologyEndocrinology()
    {
        return this.dutySerologyEndocrinology;
    }

    /**
     * Sets the value of the dutySerologyEndocrinology property.
     * @param value allowed object is {@link String }
     */
    public void setDutySerologyEndocrinology(final String value)
    {
        this.dutySerologyEndocrinology = value;
    }

    /**
     * Gets the value of the dutyAnalyticalChemistry property.
     * @return possible object is {@link String }
     */
    public String getDutyAnalyticalChemistry()
    {
        return this.dutyAnalyticalChemistry;
    }

    /**
     * Sets the value of the dutyAnalyticalChemistry property.
     * @param value allowed object is {@link String }
     */
    public void setDutyAnalyticalChemistry(final String value)
    {
        this.dutyAnalyticalChemistry = value;
    }

    /**
     * Gets the value of the dutyEcgAnalysis property.
     * @return possible object is {@link String }
     */
    public String getDutyEcgAnalysis()
    {
        return this.dutyEcgAnalysis;
    }

    /**
     * Sets the value of the dutyEcgAnalysis property.
     * @param value allowed object is {@link String }
     */
    public void setDutyEcgAnalysis(final String value)
    {
        this.dutyEcgAnalysis = value;
    }

    /**
     * Gets the value of the dutyMedicalImageAnalysis property.
     * @return possible object is {@link String }
     */
    public String getDutyMedicalImageAnalysis()
    {
        return this.dutyMedicalImageAnalysis;
    }

    /**
     * Sets the value of the dutyMedicalImageAnalysis property.
     * @param value allowed object is {@link String }
     */
    public void setDutyMedicalImageAnalysis(final String value)
    {
        this.dutyMedicalImageAnalysis = value;
    }

    /**
     * Gets the value of the dutyEndpointTest property.
     * @return possible object is {@link String }
     */
    public String getDutyEndpointTest()
    {
        return this.dutyEndpointTest;
    }

    /**
     * Sets the value of the dutyEndpointTest property.
     * @param value allowed object is {@link String }
     */
    public void setDutyEndpointTest(final String value)
    {
        this.dutyEndpointTest = value;
    }

    /**
     * Gets the value of the dutyOtherDuties property.
     * @return possible object is {@link String }
     */
    public String getDutyOtherDuties()
    {
        return this.dutyOtherDuties;
    }

    /**
     * Sets the value of the dutyOtherDuties property.
     * @param value allowed object is {@link String }
     */
    public void setDutyOtherDuties(final String value)
    {
        this.dutyOtherDuties = value;
    }

    /**
     * Gets the value of the dutyOtherDutiesDescriptions property.
     * @return possible object is {@link String }
     */
    public String getDutyOtherDutiesDescriptions()
    {
        return this.dutyOtherDutiesDescriptions;
    }

    /**
     * Sets the value of the dutyOtherDutiesDescriptions property.
     * @param value allowed object is {@link String }
     */
    public void setDutyOtherDutiesDescriptions(final String value)
    {
        this.dutyOtherDutiesDescriptions = value;
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

}