/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message_body" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pdoheader"/>
 *                   &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}request"/>
 *                   &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}response"/>
 *                   &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}sql"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageBody"
})
@XmlRootElement(name = "examples")
public class Examples {

    @XmlElement(name = "message_body", required = true)
    protected List<Examples.MessageBody> messageBody;

    /**
     * Gets the value of the messageBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Examples.MessageBody }
     * 
     * 
     */
    public List<Examples.MessageBody> getMessageBody() {
        if (messageBody == null) {
            messageBody = new ArrayList<Examples.MessageBody>();
        }
        return this.messageBody;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pdoheader"/>
     *         &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}request"/>
     *         &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}response"/>
     *         &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}sql"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pdoheader",
        "request",
        "response",
        "sql"
    })
    public static class MessageBody {

        @XmlElement(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", required = true)
        protected PdoQryHeaderType pdoheader;
        @XmlElement(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", required = true)
        protected RequestType request;
        @XmlElementRef(name = "response", namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", type = CRCResponse.class)
        protected CRCResponse response;
        @XmlElement(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", required = true)
        protected String sql;

        /**
         * Gets the value of the pdoheader property.
         * 
         * @return
         *     possible object is
         *     {@link PdoQryHeaderType }
         *     
         */
        public PdoQryHeaderType getPdoheader() {
            return pdoheader;
        }

        /**
         * Sets the value of the pdoheader property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdoQryHeaderType }
         *     
         */
        public void setPdoheader(PdoQryHeaderType value) {
            this.pdoheader = value;
        }

        /**
         * Gets the value of the request property.
         * 
         * @return
         *     possible object is
         *     {@link RequestType }
         *     
         */
        public RequestType getRequest() {
            return request;
        }

        /**
         * Sets the value of the request property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestType }
         *     
         */
        public void setRequest(RequestType value) {
            this.request = value;
        }

        /**
         * Gets the value of the response property.
         * 
         * @return
         *     possible object is
         *     {@link CRCResponse }
         *     
         */
        public CRCResponse getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         * 
         * @param value
         *     allowed object is
         *     {@link CRCResponse }
         *     
         */
        public void setResponse(CRCResponse value) {
            this.response = value;
        }

        /**
         * Gets the value of the sql property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSql() {
            return sql;
        }

        /**
         * Sets the value of the sql property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSql(String value) {
            this.sql = value;
        }

    }

}