package org.fourthline.cling.transport.impl;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import org.fourthline.cling.model.Constants;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.XMLUtil;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.gena.IncomingEventRequestMessage;
import org.fourthline.cling.model.message.gena.OutgoingEventRequestMessage;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.state.StateVariableValue;
import org.fourthline.cling.transport.spi.GENAEventProcessor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import p153l.azk0;
import p153l.h8c;

/* JADX INFO: loaded from: classes3.dex */
public class GENAEventProcessorImpl implements GENAEventProcessor, ErrorHandler {
    private static Logger log = Logger.getLogger(GENAEventProcessor.class.getName());

    public DocumentBuilderFactory createDocumentBuilderFactory() throws FactoryConfigurationError {
        return DocumentBuilderFactory.newInstance();
    }

    public String getMessageBody(UpnpMessage upnpMessage) throws UnsupportedDataException {
        if (upnpMessage.isBodyNonEmptyString()) {
            return upnpMessage.getBodyString().trim();
        }
        h8c.m133929a("Can't transform null or non-string/zero-length body of: ", upnpMessage);
        return null;
    }

    public String getUnprefixedNodeName(Node node) {
        return node.getPrefix() != null ? node.getNodeName().substring(node.getPrefix().length() + 1) : node.getNodeName();
    }

    @Override // org.fourthline.cling.transport.spi.GENAEventProcessor
    public void readBody(IncomingEventRequestMessage incomingEventRequestMessage) throws UnsupportedDataException {
        log.fine("Reading body of: " + incomingEventRequestMessage);
        if (log.isLoggable(Level.FINER)) {
            log.finer("===================================== GENA BODY BEGIN ============================================");
            log.finer(incomingEventRequestMessage.getBody() != null ? incomingEventRequestMessage.getBody().toString() : "null");
            log.finer("-===================================== GENA BODY END ============================================");
        }
        String messageBody = getMessageBody(incomingEventRequestMessage);
        try {
            DocumentBuilderFactory documentBuilderFactoryCreateDocumentBuilderFactory = createDocumentBuilderFactory();
            documentBuilderFactoryCreateDocumentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryCreateDocumentBuilderFactory.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            readProperties(readPropertysetElement(documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(messageBody)))), incomingEventRequestMessage);
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e.getMessage(), e, messageBody);
        }
    }

    public void readProperties(Element element, IncomingEventRequestMessage incomingEventRequestMessage) {
        NodeList childNodes = element.getChildNodes();
        StateVariable<RemoteService>[] stateVariables = incomingEventRequestMessage.getService().getStateVariables();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && getUnprefixedNodeName(nodeItem).equals("property")) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node nodeItem2 = childNodes2.item(i2);
                    if (nodeItem2.getNodeType() == 1) {
                        String unprefixedNodeName = getUnprefixedNodeName(nodeItem2);
                        for (StateVariable<RemoteService> stateVariable : stateVariables) {
                            if (stateVariable.getName().equals(unprefixedNodeName)) {
                                log.fine("Reading state variable value: " + unprefixedNodeName);
                                incomingEventRequestMessage.getStateVariableValues().add(new StateVariableValue(stateVariable, XMLUtil.getTextContent(nodeItem2)));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public Element readPropertysetElement(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null && getUnprefixedNodeName(documentElement).equals("propertyset")) {
            return documentElement;
        }
        azk0.m101074a("Root element was not 'propertyset'");
        return null;
    }

    public String toString(Document document) throws Exception {
        String strDocumentToString = XMLUtil.documentToString(document);
        while (true) {
            if (!strDocumentToString.endsWith(SignParameters.NEW_LINE) && !strDocumentToString.endsWith("\r")) {
                return strDocumentToString;
            }
            strDocumentToString = strDocumentToString.substring(0, strDocumentToString.length() - 1);
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        log.warning(sAXParseException.toString());
    }

    @Override // org.fourthline.cling.transport.spi.GENAEventProcessor
    public void writeBody(OutgoingEventRequestMessage outgoingEventRequestMessage) throws UnsupportedDataException {
        log.fine("Writing body of: " + outgoingEventRequestMessage);
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            writeProperties(documentNewDocument, writePropertysetElement(documentNewDocument), outgoingEventRequestMessage);
            outgoingEventRequestMessage.setBody(UpnpMessage.BodyType.STRING, toString(documentNewDocument));
            if (log.isLoggable(Level.FINER)) {
                log.finer("===================================== GENA BODY BEGIN ============================================");
                log.finer(outgoingEventRequestMessage.getBody().toString());
                log.finer("====================================== GENA BODY END =============================================");
            }
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e.getMessage(), e);
        }
    }

    public void writeProperties(Document document, Element element, OutgoingEventRequestMessage outgoingEventRequestMessage) {
        for (StateVariableValue stateVariableValue : outgoingEventRequestMessage.getStateVariableValues()) {
            Element elementCreateElementNS = document.createElementNS(Constants.NS_UPNP_EVENT_10, "e:property");
            element.appendChild(elementCreateElementNS);
            XMLUtil.appendNewElement(document, elementCreateElementNS, stateVariableValue.getStateVariable().getName(), stateVariableValue.toString());
        }
    }

    public Element writePropertysetElement(Document document) {
        Element elementCreateElementNS = document.createElementNS(Constants.NS_UPNP_EVENT_10, "e:propertyset");
        document.appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }
}
