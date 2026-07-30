package org.fourthline.cling.support.model;

import java.net.URI;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public class DescMeta<M> {

    /* JADX INFO: renamed from: id */
    protected String f205945id;
    protected M metadata;
    protected URI nameSpace;
    protected String type;

    public DescMeta(String str, String str2, URI uri, M m) {
        this.f205945id = str;
        this.type = str2;
        this.nameSpace = uri;
        this.metadata = m;
    }

    public Document createMetadataDocument() {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            documentNewDocument.appendChild(documentNewDocument.createElementNS(DIDLContent.DESC_WRAPPER_NAMESPACE_URI, "desc-wrapper"));
            return documentNewDocument;
        } catch (Exception e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public String getId() {
        return this.f205945id;
    }

    public M getMetadata() {
        return this.metadata;
    }

    public URI getNameSpace() {
        return this.nameSpace;
    }

    public String getType() {
        return this.type;
    }

    public void setId(String str) {
        this.f205945id = str;
    }

    public void setMetadata(M m) {
        this.metadata = m;
    }

    public void setNameSpace(URI uri) {
        this.nameSpace = uri;
    }

    public void setType(String str) {
        this.type = str;
    }

    public DescMeta() {
    }
}
