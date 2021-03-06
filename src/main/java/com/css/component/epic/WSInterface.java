
package com.css.component.epic;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSInterface", targetNamespace = "http://ws.ss.ncs.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param random
     * @param loginName
     * @param content
     * @param contentHash
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "epic_ent_person_relation")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "epic_ent_person_relation", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicEntPersonRelation")
    @ResponseWrapper(localName = "epic_ent_person_relationResponse", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicEntPersonRelationResponse")
    public String epicEntPersonRelation(
            @WebParam(name = "random", targetNamespace = "")
                    String random,
            @WebParam(name = "content", targetNamespace = "")
                    String content,
            @WebParam(name = "contentHash", targetNamespace = "")
                    String contentHash,
            @WebParam(name = "loginName", targetNamespace = "")
                    String loginName);

    /**
     * 
     * @param random
     * @param loginName
     * @param content
     * @param contentHash
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "epic_singleidentity")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "epic_singleidentity", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicSingleidentity")
    @ResponseWrapper(localName = "epic_singleidentityResponse", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicSingleidentityResponse")
    public String epicSingleidentity(
            @WebParam(name = "random", targetNamespace = "")
                    String random,
            @WebParam(name = "content", targetNamespace = "")
                    String content,
            @WebParam(name = "contentHash", targetNamespace = "")
                    String contentHash,
            @WebParam(name = "loginName", targetNamespace = "")
                    String loginName);

    /**
     * 
     * @param random
     * @param loginName
     * @param content
     * @param contentHash
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "epic_identity")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "epic_identity", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicIdentity")
    @ResponseWrapper(localName = "epic_identityResponse", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicIdentityResponse")
    public String epicIdentity(
            @WebParam(name = "random", targetNamespace = "")
                    String random,
            @WebParam(name = "content", targetNamespace = "")
                    String content,
            @WebParam(name = "contentHash", targetNamespace = "")
                    String contentHash,
            @WebParam(name = "loginName", targetNamespace = "")
                    String loginName);

    /**
     * 
     * @param random
     * @param loginName
     * @param content
     * @param contentHash
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "epic_ent_double_element")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "epic_ent_double_element", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicEntDoubleElement")
    @ResponseWrapper(localName = "epic_ent_double_elementResponse", targetNamespace = "http://ws.ss.ncs.com/", className = "com.css.component.epic.EpicEntDoubleElementResponse")
    public String epicEntDoubleElement(
            @WebParam(name = "random", targetNamespace = "")
                    String random,
            @WebParam(name = "content", targetNamespace = "")
                    String content,
            @WebParam(name = "contentHash", targetNamespace = "")
                    String contentHash,
            @WebParam(name = "loginName", targetNamespace = "")
                    String loginName);

}
