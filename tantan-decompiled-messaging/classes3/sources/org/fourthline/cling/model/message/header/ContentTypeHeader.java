package org.fourthline.cling.model.message.header;

import org.eclipse.jetty.http.MimeTypes;
import org.seamless.util.MimeType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ContentTypeHeader extends UpnpHeader<MimeType> {
    public static final MimeType DEFAULT_CONTENT_TYPE = MimeType.valueOf(MimeTypes.TEXT_XML);
    public static final MimeType DEFAULT_CONTENT_TYPE_UTF8 = MimeType.valueOf("text/xml;charset=\"utf-8\"");

    public ContentTypeHeader() {
        setValue(DEFAULT_CONTENT_TYPE);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    public boolean isText() {
        return getValue() != null && getValue().getType().equals(DEFAULT_CONTENT_TYPE.getType());
    }

    public boolean isUDACompliantXML() {
        return isText() && getValue().getSubtype().equals(DEFAULT_CONTENT_TYPE.getSubtype());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        setValue(MimeType.valueOf(str));
    }

    public ContentTypeHeader(MimeType mimeType) {
        setValue(mimeType);
    }

    public ContentTypeHeader(String str) throws InvalidHeaderException {
        setString(str);
    }
}
