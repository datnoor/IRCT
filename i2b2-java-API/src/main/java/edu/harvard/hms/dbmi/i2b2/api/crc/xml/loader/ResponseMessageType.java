/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for response_messageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response_messageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message_header" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}message_headerType"/>
 *         &lt;element name="request_header" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}request_headerType" minOccurs="0"/>
 *         &lt;element name="response_header" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}response_headerType"/>
 *         &lt;element name="message_body" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}bodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_messageType", namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", propOrder = {
    "messageHeader",
    "requestHeader",
    "responseHeader",
    "messageBody"
})
public class ResponseMessageType {

    @XmlElement(name = "message_header", required = true)
    protected MessageHeaderType messageHeader;
    @XmlElement(name = "request_header")
    protected RequestHeaderType requestHeader;
    @XmlElement(name = "response_header", required = true)
    protected ResponseHeaderType responseHeader;
    @XmlElement(name = "message_body", required = true)
    protected BodyType messageBody;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderType }
     *     
     */
    public MessageHeaderType getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderType }
     *     
     */
    public void setMessageHeader(MessageHeaderType value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeaderType }
     *     
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeaderType }
     *     
     */
    public void setRequestHeader(RequestHeaderType value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeaderType }
     *     
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeaderType }
     *     
     */
    public void setResponseHeader(ResponseHeaderType value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the messageBody property.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of the messageBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setMessageBody(BodyType value) {
        this.messageBody = value;
    }

}