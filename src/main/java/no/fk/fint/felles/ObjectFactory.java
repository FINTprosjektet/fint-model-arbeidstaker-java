//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.10 at 11:13:32 AM CET 
//


package no.fk.fint.felles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.fk.fint.felles package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbstraktAktoer_QNAME = new QName("http://fk.no/fint/felles/1.0", "AbstraktAktoer");
    private final static QName _AbstraktPerson_QNAME = new QName("http://fk.no/fint/felles/1.0", "AbstraktPerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.fk.fint.felles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Personnavn }
     * 
     */
    public Personnavn createPersonnavn() {
        return new Personnavn();
    }

    /**
     * Create an instance of {@link Landkode }
     * 
     */
    public Landkode createLandkode() {
        return new Landkode();
    }

    /**
     * Create an instance of {@link Periode }
     * 
     */
    public Periode createPeriode() {
        return new Periode();
    }

    /**
     * Create an instance of {@link Spraak }
     * 
     */
    public Spraak createSpraak() {
        return new Spraak();
    }

    /**
     * Create an instance of {@link Kontaktinformasjon }
     * 
     */
    public Kontaktinformasjon createKontaktinformasjon() {
        return new Kontaktinformasjon();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link Identifikator }
     * 
     */
    public Identifikator createIdentifikator() {
        return new Identifikator();
    }

    /**
     * Create an instance of {@link PeriodeListe }
     * 
     */
    public PeriodeListe createPeriodeListe() {
        return new PeriodeListe();
    }

    /**
     * Create an instance of {@link AbstraktAktoerListe }
     * 
     */
    public AbstraktAktoerListe createAbstraktAktoerListe() {
        return new AbstraktAktoerListe();
    }

    /**
     * Create an instance of {@link AbstraktEnhetListe }
     * 
     */
    public AbstraktEnhetListe createAbstraktEnhetListe() {
        return new AbstraktEnhetListe();
    }

    /**
     * Create an instance of {@link AbstraktPersonListe }
     * 
     */
    public AbstraktPersonListe createAbstraktPersonListe() {
        return new AbstraktPersonListe();
    }

    /**
     * Create an instance of {@link PersonnavnListe }
     * 
     */
    public PersonnavnListe createPersonnavnListe() {
        return new PersonnavnListe();
    }

    /**
     * Create an instance of {@link KjoennListe }
     * 
     */
    public KjoennListe createKjoennListe() {
        return new KjoennListe();
    }

    /**
     * Create an instance of {@link SivilstandListe }
     * 
     */
    public SivilstandListe createSivilstandListe() {
        return new SivilstandListe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstraktAktoerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fk.no/fint/felles/1.0", name = "AbstraktAktoer")
    public JAXBElement<AbstraktAktoerType> createAbstraktAktoer(AbstraktAktoerType value) {
        return new JAXBElement<AbstraktAktoerType>(_AbstraktAktoer_QNAME, AbstraktAktoerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstraktPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fk.no/fint/felles/1.0", name = "AbstraktPerson")
    public JAXBElement<AbstraktPersonType> createAbstraktPerson(AbstraktPersonType value) {
        return new JAXBElement<AbstraktPersonType>(_AbstraktPerson_QNAME, AbstraktPersonType.class, null, value);
    }

}
