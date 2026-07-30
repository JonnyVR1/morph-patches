package org.fourthline.cling.support.messagebox.parser;

import javax.xml.xpath.XPath;
import org.seamless.xml.DOM;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes3.dex */
public class MessageDOM extends DOM {
    public static final String NAMESPACE_URI = "urn:samsung-com:messagebox-1-0";

    public MessageDOM(Document document) {
        super(document);
    }

    @Override // org.seamless.xml.DOM
    public MessageDOM copy() {
        return new MessageDOM((Document) getW3CDocument().cloneNode(true));
    }

    public MessageElement createRoot(XPath xPath, String str) {
        super.createRoot(str);
        return getRoot(xPath);
    }

    @Override // org.seamless.xml.DOM
    public MessageElement getRoot(XPath xPath) {
        return new MessageElement(xPath, getW3CDocument().getDocumentElement());
    }

    @Override // org.seamless.xml.DOM
    public String getRootElementNamespace() {
        return NAMESPACE_URI;
    }
}
