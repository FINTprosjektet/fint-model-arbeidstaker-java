//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.10 at 11:13:32 AM CET 
//


package no.fk.fint.felles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstraktPersonListe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstraktPersonListe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abstraktperson" type="{http://fk.no/fint/felles/1.0}AbstraktPersonType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AbstraktPersonListe", propOrder = {
    "abstraktpersons"
})
public class AbstraktPersonListe {

    @XmlElement(name = "abstraktperson")
    protected List<AbstraktPersonType> abstraktpersons;

    /**
     * Gets the value of the abstraktpersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstraktpersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstraktpersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstraktPersonType }
     * 
     * 
     */
    public List<AbstraktPersonType> getAbstraktpersons() {
        if (abstraktpersons == null) {
            abstraktpersons = new ArrayList<AbstraktPersonType>();
        }
        return this.abstraktpersons;
    }

}