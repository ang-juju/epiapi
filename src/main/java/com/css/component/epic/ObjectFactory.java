
package com.css.component.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.css.component.epic package. 
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

    private final static QName _EpicSingleidentityResponse_QNAME = new QName("http://ws.ss.ncs.com/", "epic_singleidentityResponse");
    private final static QName _EpicEntDoubleElementResponse_QNAME = new QName("http://ws.ss.ncs.com/", "epic_ent_double_elementResponse");
    private final static QName _EpicEntPersonRelation_QNAME = new QName("http://ws.ss.ncs.com/", "epic_ent_person_relation");
    private final static QName _EpicEntPersonRelationResponse_QNAME = new QName("http://ws.ss.ncs.com/", "epic_ent_person_relationResponse");
    private final static QName _EpicIdentityResponse_QNAME = new QName("http://ws.ss.ncs.com/", "epic_identityResponse");
    private final static QName _EpicSingleidentity_QNAME = new QName("http://ws.ss.ncs.com/", "epic_singleidentity");
    private final static QName _EpicIdentity_QNAME = new QName("http://ws.ss.ncs.com/", "epic_identity");
    private final static QName _EpicEntDoubleElement_QNAME = new QName("http://ws.ss.ncs.com/", "epic_ent_double_element");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.css.component.epic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EpicEntDoubleElement }
     * 
     */
    public EpicEntDoubleElement createEpicEntDoubleElement() {
        return new EpicEntDoubleElement();
    }

    /**
     * Create an instance of {@link EpicIdentity }
     * 
     */
    public EpicIdentity createEpicIdentity() {
        return new EpicIdentity();
    }

    /**
     * Create an instance of {@link EpicSingleidentity }
     * 
     */
    public EpicSingleidentity createEpicSingleidentity() {
        return new EpicSingleidentity();
    }

    /**
     * Create an instance of {@link EpicIdentityResponse }
     * 
     */
    public EpicIdentityResponse createEpicIdentityResponse() {
        return new EpicIdentityResponse();
    }

    /**
     * Create an instance of {@link EpicSingleidentityResponse }
     * 
     */
    public EpicSingleidentityResponse createEpicSingleidentityResponse() {
        return new EpicSingleidentityResponse();
    }

    /**
     * Create an instance of {@link EpicEntPersonRelationResponse }
     * 
     */
    public EpicEntPersonRelationResponse createEpicEntPersonRelationResponse() {
        return new EpicEntPersonRelationResponse();
    }

    /**
     * Create an instance of {@link EpicEntDoubleElementResponse }
     * 
     */
    public EpicEntDoubleElementResponse createEpicEntDoubleElementResponse() {
        return new EpicEntDoubleElementResponse();
    }

    /**
     * Create an instance of {@link EpicEntPersonRelation }
     * 
     */
    public EpicEntPersonRelation createEpicEntPersonRelation() {
        return new EpicEntPersonRelation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicSingleidentityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_singleidentityResponse")
    public JAXBElement<EpicSingleidentityResponse> createEpicSingleidentityResponse(EpicSingleidentityResponse value) {
        return new JAXBElement<EpicSingleidentityResponse>(_EpicSingleidentityResponse_QNAME, EpicSingleidentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicEntDoubleElementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_ent_double_elementResponse")
    public JAXBElement<EpicEntDoubleElementResponse> createEpicEntDoubleElementResponse(EpicEntDoubleElementResponse value) {
        return new JAXBElement<EpicEntDoubleElementResponse>(_EpicEntDoubleElementResponse_QNAME, EpicEntDoubleElementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicEntPersonRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_ent_person_relation")
    public JAXBElement<EpicEntPersonRelation> createEpicEntPersonRelation(EpicEntPersonRelation value) {
        return new JAXBElement<EpicEntPersonRelation>(_EpicEntPersonRelation_QNAME, EpicEntPersonRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicEntPersonRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_ent_person_relationResponse")
    public JAXBElement<EpicEntPersonRelationResponse> createEpicEntPersonRelationResponse(EpicEntPersonRelationResponse value) {
        return new JAXBElement<EpicEntPersonRelationResponse>(_EpicEntPersonRelationResponse_QNAME, EpicEntPersonRelationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicIdentityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_identityResponse")
    public JAXBElement<EpicIdentityResponse> createEpicIdentityResponse(EpicIdentityResponse value) {
        return new JAXBElement<EpicIdentityResponse>(_EpicIdentityResponse_QNAME, EpicIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicSingleidentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_singleidentity")
    public JAXBElement<EpicSingleidentity> createEpicSingleidentity(EpicSingleidentity value) {
        return new JAXBElement<EpicSingleidentity>(_EpicSingleidentity_QNAME, EpicSingleidentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_identity")
    public JAXBElement<EpicIdentity> createEpicIdentity(EpicIdentity value) {
        return new JAXBElement<EpicIdentity>(_EpicIdentity_QNAME, EpicIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpicEntDoubleElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ss.ncs.com/", name = "epic_ent_double_element")
    public JAXBElement<EpicEntDoubleElement> createEpicEntDoubleElement(EpicEntDoubleElement value) {
        return new JAXBElement<EpicEntDoubleElement>(_EpicEntDoubleElement_QNAME, EpicEntDoubleElement.class, null, value);
    }

}
