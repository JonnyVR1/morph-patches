package org.fourthline.cling.support.messagebox.parser;

import javax.xml.xpath.XPath;
import org.seamless.xml.DOMParser;
import org.seamless.xml.NamespaceContextMap;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageDOMParser extends DOMParser<MessageDOM> {
    @Override // org.seamless.xml.DOMParser
    public MessageDOM createDOM(Document document) {
        return new MessageDOM(document);
    }

    public NamespaceContextMap createDefaultNamespaceContext(String... strArr) {
        NamespaceContextMap namespaceContextMap = new NamespaceContextMap() { // from class: org.fourthline.cling.support.messagebox.parser.MessageDOMParser.1
            @Override // org.seamless.xml.NamespaceContextMap
            public String getDefaultNamespaceURI() {
                return MessageDOM.NAMESPACE_URI;
            }
        };
        for (String str : strArr) {
            namespaceContextMap.put(str, MessageDOM.NAMESPACE_URI);
        }
        return namespaceContextMap;
    }

    public XPath createXPath() {
        return super.createXPath(createDefaultNamespaceContext(MessageElement.XPATH_PREFIX));
    }
}
