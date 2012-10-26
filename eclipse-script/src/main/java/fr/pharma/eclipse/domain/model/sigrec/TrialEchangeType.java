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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import fr.pharma.eclipse.domain.model.sigrec.common.SigrecElement;

/**
 * <p>
 * Java class for trial_echangeType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trial_echangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trial-sigrec-identification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trial-investigator-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="echange-date-envoi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="destinataire-institution-idnat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinataire-sir-idnat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objet-echange">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="invitation"/>
 *               &lt;enumeration value="modification"/>
 *               &lt;enumeration value="reponse_invitation"/>
 *               &lt;enumeration value="inclusion"/>
 *               &lt;enumeration value="ExportDHOSEligible"/>
 *               &lt;enumeration value="ExportDHOSNonEligible"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emetteur-institution-idnat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emetteur-sir-idnat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="node-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trial_echangeType", propOrder =
{"trialSigrecIdentification", "trialInvestigatorId", "echangeDateEnvoi",
 "destinataireInstitutionIdnat", "destinataireSirIdnat", "objetEchange",
 "emetteurInstitutionIdnat", "emetteurSirIdnat" })
public class TrialEchangeType
    
    implements Serializable, SigrecElement
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "trial-sigrec-identification", required = true)
    protected String trialSigrecIdentification;
    @XmlElement(name = "trial-investigator-id")
    protected String trialInvestigatorId;
    @XmlElement(name = "echange-date-envoi", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar echangeDateEnvoi;
    @XmlElement(name = "destinataire-institution-idnat", required = true)
    protected String destinataireInstitutionIdnat;
    @XmlElement(name = "destinataire-sir-idnat", required = true)
    protected String destinataireSirIdnat;
    @XmlElement(name = "objet-echange", required = true)
    protected String objetEchange;
    @XmlElement(name = "emetteur-institution-idnat", required = true)
    protected String emetteurInstitutionIdnat;
    @XmlElement(name = "emetteur-sir-idnat", required = true)
    protected String emetteurSirIdnat;
    @XmlAttribute(name = "node-id")
    protected String nodeId;

    /**
     * Gets the value of the trialSigrecIdentification property.
     * @return possible object is {@link String }
     */
    public String getTrialSigrecIdentification()
    {
        return this.trialSigrecIdentification;
    }

    /**
     * Sets the value of the trialSigrecIdentification property.
     * @param value allowed object is {@link String }
     */
    public void setTrialSigrecIdentification(final String value)
    {
        this.trialSigrecIdentification = value;
    }

    /**
     * Gets the value of the trialInvestigatorId property.
     * @return possible object is {@link String }
     */
    public String getTrialInvestigatorId()
    {
        return this.trialInvestigatorId;
    }

    /**
     * Sets the value of the trialInvestigatorId property.
     * @param value allowed object is {@link String }
     */
    public void setTrialInvestigatorId(final String value)
    {
        this.trialInvestigatorId = value;
    }

    /**
     * Gets the value of the echangeDateEnvoi property.
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEchangeDateEnvoi()
    {
        return this.echangeDateEnvoi;
    }

    /**
     * Sets the value of the echangeDateEnvoi property.
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setEchangeDateEnvoi(final XMLGregorianCalendar value)
    {
        this.echangeDateEnvoi = value;
    }

    /**
     * Gets the value of the destinataireInstitutionIdnat property.
     * @return possible object is {@link String }
     */
    public String getDestinataireInstitutionIdnat()
    {
        return this.destinataireInstitutionIdnat;
    }

    /**
     * Sets the value of the destinataireInstitutionIdnat property.
     * @param value allowed object is {@link String }
     */
    public void setDestinataireInstitutionIdnat(final String value)
    {
        this.destinataireInstitutionIdnat = value;
    }

    /**
     * Gets the value of the destinataireSirIdnat property.
     * @return possible object is {@link String }
     */
    public String getDestinataireSirIdnat()
    {
        return this.destinataireSirIdnat;
    }

    /**
     * Sets the value of the destinataireSirIdnat property.
     * @param value allowed object is {@link String }
     */
    public void setDestinataireSirIdnat(final String value)
    {
        this.destinataireSirIdnat = value;
    }

    /**
     * Gets the value of the objetEchange property.
     * @return possible object is {@link String }
     */
    public String getObjetEchange()
    {
        return this.objetEchange;
    }

    /**
     * Sets the value of the objetEchange property.
     * @param value allowed object is {@link String }
     */
    public void setObjetEchange(final String value)
    {
        this.objetEchange = value;
    }

    /**
     * Gets the value of the emetteurInstitutionIdnat property.
     * @return possible object is {@link String }
     */
    public String getEmetteurInstitutionIdnat()
    {
        return this.emetteurInstitutionIdnat;
    }

    /**
     * Sets the value of the emetteurInstitutionIdnat property.
     * @param value allowed object is {@link String }
     */
    public void setEmetteurInstitutionIdnat(final String value)
    {
        this.emetteurInstitutionIdnat = value;
    }

    /**
     * Gets the value of the emetteurSirIdnat property.
     * @return possible object is {@link String }
     */
    public String getEmetteurSirIdnat()
    {
        return this.emetteurSirIdnat;
    }

    /**
     * Sets the value of the emetteurSirIdnat property.
     * @param value allowed object is {@link String }
     */
    public void setEmetteurSirIdnat(final String value)
    {
        this.emetteurSirIdnat = value;
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