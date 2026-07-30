package org.seamless.xhtml;

import java.util.HashSet;
import javax.xml.xpath.XPath;
import l.rkq0;
import org.seamless.xml.DOMParser;
import org.seamless.xml.NamespaceContextMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class XHTMLParser extends DOMParser<XHTML> {
    public XHTMLParser() {
        super(XHTML.createSchemaSources());
    }

    public void checkDuplicateIdentifiers(XHTML xhtml) throws IllegalStateException {
        final HashSet hashSet = new HashSet();
        DOMParser.accept(xhtml.getW3CDocument().getDocumentElement(), new DOMParser.NodeVisitor((short) 1) { // from class: org.seamless.xhtml.XHTMLParser.1
            @Override // org.seamless.xml.DOMParser.NodeVisitor
            public void visit(Node node) {
                String attribute = ((Element) node).getAttribute(XHTML.ATTR.id.name());
                if ("".equals(attribute)) {
                    return;
                }
                if (hashSet.contains(attribute)) {
                    rkq0.a("Duplicate identifier, override/change value: ", attribute);
                } else {
                    hashSet.add(attribute);
                }
            }
        });
    }

    @Override // org.seamless.xml.DOMParser
    public XHTML createDOM(Document document) {
        if (document != null) {
            return new XHTML(document);
        }
        return null;
    }

    public NamespaceContextMap createDefaultNamespaceContext(String... strArr) {
        NamespaceContextMap namespaceContextMap = new NamespaceContextMap() { // from class: org.seamless.xhtml.XHTMLParser.2
            @Override // org.seamless.xml.NamespaceContextMap
            public String getDefaultNamespaceURI() {
                return XHTML.NAMESPACE_URI;
            }
        };
        for (String str : strArr) {
            namespaceContextMap.put(str, XHTML.NAMESPACE_URI);
        }
        return namespaceContextMap;
    }

    public XPath createXPath() {
        return super.createXPath(createDefaultNamespaceContext(XHTMLElement.XPATH_PREFIX));
    }
}
