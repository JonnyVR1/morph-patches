package org.seamless.xml;

import java.net.URI;
import javax.xml.xpath.XPath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class DOM {
    public static final String CDATA_BEGIN = "<![CDATA[";
    public static final String CDATA_END = "]]>";
    public static final URI XML_SCHEMA_NAMESPACE = URI.create("http://www.w3.org/2001/xml.xsd");
    private Document dom;

    public DOM(Document document) {
        this.dom = document;
    }

    public abstract DOM copy();

    public Element createRoot(String str) {
        Element elementCreateElementNS = getW3CDocument().createElementNS(getRootElementNamespace(), str);
        getW3CDocument().appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    public abstract DOMElement getRoot(XPath xPath);

    public abstract String getRootElementNamespace();

    public Document getW3CDocument() {
        return this.dom;
    }
}
