package org.spongycastle.asn1;

import java.io.IOException;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class DERSequenceParser implements ASN1SequenceParser {
    private ASN1StreamParser _parser;

    public DERSequenceParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new DERSequence(this._parser.readVector());
    }

    @Override // org.spongycastle.asn1.ASN1SequenceParser
    public ASN1Encodable readObject() throws IOException {
        return this._parser.readObject();
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            wtq0.m207906a(e.getMessage());
            return null;
        }
    }
}
