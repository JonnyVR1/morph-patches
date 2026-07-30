package org.seamless.xhtml;

import javax.xml.xpath.XPath;
import org.seamless.xml.DOMElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class Head extends XHTMLElement {
    public Head(XPath xPath, Element element) {
        super(xPath, element);
    }

    public XHTMLElement[] getDocumentStyles() {
        return (XHTMLElement[]) this.CHILD_BUILDER.getChildElements(XHTML.ELEMENT.style.name());
    }

    public XHTMLElement getHeadTitle() {
        return (XHTMLElement) this.CHILD_BUILDER.firstChildOrNull(XHTML.ELEMENT.title.name());
    }

    public Link[] getLinks() {
        return (Link[]) new DOMElement<XHTMLElement, XHTMLElement>.ArrayBuilder<Link>(this) { // from class: org.seamless.xhtml.Head.1
            @Override // org.seamless.xml.DOMElement.Builder
            public Link build(Element element) {
                return new Link(Head.this.getXpath(), element);
            }

            @Override // org.seamless.xml.DOMElement.ArrayBuilder
            public Link[] newChildrenArray(int i) {
                return new Link[i];
            }
        }.getChildElements(XHTML.ELEMENT.link.name());
    }

    public Meta[] getMetas() {
        return (Meta[]) new DOMElement<XHTMLElement, XHTMLElement>.ArrayBuilder<Meta>(this) { // from class: org.seamless.xhtml.Head.2
            @Override // org.seamless.xml.DOMElement.Builder
            public Meta build(Element element) {
                return new Meta(Head.this.getXpath(), element);
            }

            @Override // org.seamless.xml.DOMElement.ArrayBuilder
            public Meta[] newChildrenArray(int i) {
                return new Meta[i];
            }
        }.getChildElements(XHTML.ELEMENT.meta.name());
    }

    public XHTMLElement[] getScripts() {
        return (XHTMLElement[]) this.CHILD_BUILDER.getChildElements(XHTML.ELEMENT.script.name());
    }
}
