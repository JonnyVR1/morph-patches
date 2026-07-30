package org.seamless.xml;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import p153l.iig0;

/* JADX INFO: loaded from: classes3.dex */
public class SAXParser {

    /* JADX INFO: renamed from: xr */
    private final XMLReader f207152xr;
    private static final Logger log = Logger.getLogger(SAXParser.class.getName());
    public static final URI XML_SCHEMA_NAMESPACE = URI.create("http://www.w3.org/2001/xml.xsd");
    public static final URL XML_SCHEMA_RESOURCE = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    public class SimpleErrorHandler implements ErrorHandler {
        public SimpleErrorHandler() {
        }

        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
            throw new SAXException(sAXParseException);
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
            throw new SAXException(sAXParseException);
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
            throw new SAXException(sAXParseException);
        }
    }

    public SAXParser(DefaultHandler defaultHandler) {
        XMLReader xMLReaderCreate = create();
        this.f207152xr = xMLReaderCreate;
        if (defaultHandler != null) {
            xMLReaderCreate.setContentHandler(defaultHandler);
        }
    }

    public XMLReader create() {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            sAXParserFactoryNewInstance.setXIncludeAware(false);
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            if (getSchemaSources() != null) {
                sAXParserFactoryNewInstance.setSchema(createSchema(getSchemaSources()));
            }
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(getErrorHandler());
            return xMLReader;
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public Schema createSchema(Source[] sourceArr) {
        try {
            SchemaFactory schemaFactoryNewInstance = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            schemaFactoryNewInstance.setResourceResolver(new CatalogResourceResolver(new HashMap<URI, URL>() { // from class: org.seamless.xml.SAXParser.1
                {
                    put(SAXParser.XML_SCHEMA_NAMESPACE, SAXParser.XML_SCHEMA_RESOURCE);
                }
            }));
            return schemaFactoryNewInstance.newSchema(sourceArr);
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public ErrorHandler getErrorHandler() {
        return new SimpleErrorHandler();
    }

    public Source[] getSchemaSources() {
        return null;
    }

    public void parse(InputSource inputSource) throws ParserException {
        try {
            this.f207152xr.parse(inputSource);
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }

    public void setContentHandler(ContentHandler contentHandler) {
        this.f207152xr.setContentHandler(contentHandler);
    }

    public SAXParser() {
        this(null);
    }

    public static class Handler<I> extends DefaultHandler {
        protected Attributes attributes;
        protected StringBuilder characters;
        protected I instance;
        protected Handler parent;
        protected SAXParser parser;

        public Handler(I i, SAXParser sAXParser, Handler handler) {
            this.characters = new StringBuilder();
            this.instance = i;
            this.parser = sAXParser;
            this.parent = handler;
            if (sAXParser != null) {
                sAXParser.setContentHandler(this);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            this.characters.append(cArr, i, i2);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (!isLastElement(str, str2, str3)) {
                SAXParser.log.finer(getClass().getSimpleName() + " ending: " + str2);
                return;
            }
            SAXParser.log.finer(getClass().getSimpleName() + ": last element, switching to parent: " + str2);
            switchToParent();
        }

        public Attributes getAttributes() {
            return this.attributes;
        }

        public String getCharacters() {
            return this.characters.toString();
        }

        public I getInstance() {
            return this.instance;
        }

        public Handler getParent() {
            return this.parent;
        }

        public SAXParser getParser() {
            return this.parser;
        }

        public boolean isLastElement(String str, String str2, String str3) {
            return false;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.characters = new StringBuilder();
            this.attributes = new AttributesImpl(attributes);
            SAXParser.log.finer(getClass().getSimpleName() + " starting: " + str2);
        }

        public void switchToParent() {
            Handler handler;
            SAXParser sAXParser = this.parser;
            if (sAXParser == null || (handler = this.parent) == null) {
                return;
            }
            sAXParser.setContentHandler(handler);
            this.attributes = null;
        }

        public Handler(I i, SAXParser sAXParser) {
            this(i, sAXParser, null);
        }

        public Handler(I i, Handler handler) {
            this(i, handler.getParser(), handler);
        }

        public Handler(I i) {
            this(i, null, null);
        }
    }
}
