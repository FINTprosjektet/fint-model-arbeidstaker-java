//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.10 at 11:13:32 AM CET 
//


package no.fk.fint.felles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KontaktinformasjonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KontaktinformasjonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="epostadresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobiltelefonummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="websted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kontakttype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontaktinformasjonType", propOrder = {
    "epostadresse",
    "telefonnummer",
    "mobiltelefonummer",
    "websted",
    "kontakttype"
})
@XmlRootElement(name = "Kontaktinformasjon")
public class Kontaktinformasjon {

    @XmlElement(nillable = true)
    protected String epostadresse;
    @XmlElement(nillable = true)
    protected String telefonnummer;
    @XmlElement(nillable = true)
    protected String mobiltelefonummer;
    @XmlElement(nillable = true)
    protected String websted;
    @XmlElement(required = true)
    protected String kontakttype;

    /**
     * Gets the value of the epostadresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpostadresse() {
        return epostadresse;
    }

    /**
     * Sets the value of the epostadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpostadresse(String value) {
        this.epostadresse = value;
    }

    /**
     * Gets the value of the telefonnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonnummer() {
        return telefonnummer;
    }

    /**
     * Sets the value of the telefonnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonnummer(String value) {
        this.telefonnummer = value;
    }

    /**
     * Gets the value of the mobiltelefonummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobiltelefonummer() {
        return mobiltelefonummer;
    }

    /**
     * Sets the value of the mobiltelefonummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiltelefonummer(String value) {
        this.mobiltelefonummer = value;
    }

    /**
     * Gets the value of the websted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsted() {
        return websted;
    }

    /**
     * Sets the value of the websted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsted(String value) {
        this.websted = value;
    }

    /**
     * Gets the value of the kontakttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontakttype() {
        return kontakttype;
    }

    /**
     * Sets the value of the kontakttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontakttype(String value) {
        this.kontakttype = value;
    }

}
