package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BERApplicationSpecificParser implements ASN1ApplicationSpecificParser {
    private final ASN1StreamParser parser;
    private final int tag;

    public BERApplicationSpecificParser(int i, ASN1StreamParser aSN1StreamParser) {
        this.tag = i;
        this.parser = aSN1StreamParser;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new BERApplicationSpecific(this.tag, this.parser.readVector());
    }

    @Override // org.spongycastle.asn1.ASN1ApplicationSpecificParser
    public ASN1Encodable readObject() throws IOException {
        return this.parser.readObject();
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
