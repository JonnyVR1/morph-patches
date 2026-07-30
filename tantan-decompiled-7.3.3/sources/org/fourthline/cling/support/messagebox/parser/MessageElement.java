package org.fourthline.cling.support.messagebox.parser;

import javax.xml.xpath.XPath;
import org.seamless.xml.DOMElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class MessageElement extends DOMElement<MessageElement, MessageElement> {
    public static final String XPATH_PREFIX = "m";

    public MessageElement(XPath xPath, Element element) {
        super(xPath, element);
    }

    @Override // org.seamless.xml.DOMElement
    public DOMElement<MessageElement, MessageElement>.ArrayBuilder<MessageElement> createChildBuilder(DOMElement dOMElement) {
        return new DOMElement<MessageElement, MessageElement>.ArrayBuilder<MessageElement>(dOMElement) { // from class: org.fourthline.cling.support.messagebox.parser.MessageElement.2
            @Override // org.seamless.xml.DOMElement.Builder
            public MessageElement build(Element element) {
                return new MessageElement(MessageElement.this.getXpath(), element);
            }

            @Override // org.seamless.xml.DOMElement.ArrayBuilder
            public MessageElement[] newChildrenArray(int i) {
                return new MessageElement[i];
            }
        };
    }

    @Override // org.seamless.xml.DOMElement
    public DOMElement<MessageElement, MessageElement>.Builder<MessageElement> createParentBuilder(DOMElement dOMElement) {
        return new DOMElement<MessageElement, MessageElement>.Builder<MessageElement>(dOMElement) { // from class: org.fourthline.cling.support.messagebox.parser.MessageElement.1
            @Override // org.seamless.xml.DOMElement.Builder
            public MessageElement build(Element element) {
                return new MessageElement(MessageElement.this.getXpath(), element);
            }
        };
    }

    @Override // org.seamless.xml.DOMElement
    public String prefix(String str) {
        return "m:" + str;
    }
}
