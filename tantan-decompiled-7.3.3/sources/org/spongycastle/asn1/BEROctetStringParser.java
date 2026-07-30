package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.p136io.Streams;
import p153l.C20716v1;

/* JADX INFO: loaded from: classes3.dex */
public class BEROctetStringParser implements ASN1OctetStringParser {
    private ASN1StreamParser _parser;

    public BEROctetStringParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new BEROctetString(Streams.readAll(getOctetStream()));
    }

    @Override // org.spongycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return new ConstructedOctetStream(this._parser);
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            C20716v1.m198963a("IOException converting stream to byte array: ", e.getMessage(), e);
            return null;
        }
    }
}
