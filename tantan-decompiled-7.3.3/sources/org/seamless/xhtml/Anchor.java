package org.seamless.xhtml;

import javax.xml.xpath.XPath;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class Anchor extends XHTMLElement {
    public Anchor(XPath xPath, Element element) {
        super(xPath, element);
    }

    public Href getHref() {
        return Href.fromString(getAttribute(XHTML.ATTR.href));
    }

    public String getType() {
        return getAttribute(XHTML.ATTR.type);
    }

    public Anchor setHref(String str) {
        setAttribute(XHTML.ATTR.href, str);
        return this;
    }

    public Anchor setType(String str) {
        setAttribute(XHTML.ATTR.type, str);
        return this;
    }

    @Override // org.seamless.xml.DOMElement
    public String toString() {
        return "(Anchor) " + getAttribute(XHTML.ATTR.href);
    }
}
