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
 * <p>Java class for PersonnavnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonnavnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fornavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="etternavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "PersonnavnType", propOrder = {
    "fornavn",
    "etternavn"
})
@XmlRootElement(name = "Personnavn")
public class Personnavn {

    @XmlElement(required = true)
    protected String fornavn;
    @XmlElement(required = true)
    protected String etternavn;

    /**
     * Gets the value of the fornavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * Sets the value of the fornavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornavn(String value) {
        this.fornavn = value;
    }

    /**
     * Gets the value of the etternavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtternavn() {
        return etternavn;
    }

    /**
     * Sets the value of the etternavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtternavn(String value) {
        this.etternavn = value;
    }

}