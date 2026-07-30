package org.spongycastle.asn1.cms;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1SequenceParser;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1SetParser;
import org.spongycastle.asn1.ASN1TaggedObjectParser;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public class SignedDataParser {
    private boolean _certsCalled;
    private boolean _crlsCalled;
    private Object _nextObject;
    private ASN1SequenceParser _seq;
    private ASN1Integer _version;

    private SignedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this._seq = aSN1SequenceParser;
        this._version = (ASN1Integer) aSN1SequenceParser.readObject();
    }

    public static SignedDataParser getInstance(Object obj) throws IOException {
        if (obj instanceof ASN1Sequence) {
            return new SignedDataParser(((ASN1Sequence) obj).parser());
        }
        if (obj instanceof ASN1SequenceParser) {
            return new SignedDataParser((ASN1SequenceParser) obj);
        }
        zpg0.m220844a("unknown object encountered: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1SetParser getCertificates() throws IOException {
        this._certsCalled = true;
        ASN1Encodable object = this._seq.readObject();
        this._nextObject = object;
        if (!(object instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) object).getTagNo() != 0) {
            return null;
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) ((ASN1TaggedObjectParser) this._nextObject).getObjectParser(17, false);
        this._nextObject = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getCrls() throws IOException {
        if (!this._certsCalled) {
            zpg0.m220844a("getCerts() has not been called.");
            return null;
        }
        this._crlsCalled = true;
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        Object obj = this._nextObject;
        if (!(obj instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) obj).getTagNo() != 1) {
            return null;
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) ((ASN1TaggedObjectParser) this._nextObject).getObjectParser(17, false);
        this._nextObject = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getDigestAlgorithms() throws IOException {
        ASN1Encodable object = this._seq.readObject();
        return object instanceof ASN1Set ? ((ASN1Set) object).parser() : (ASN1SetParser) object;
    }

    public ContentInfoParser getEncapContentInfo() throws IOException {
        return new ContentInfoParser((ASN1SequenceParser) this._seq.readObject());
    }

    public ASN1SetParser getSignerInfos() throws IOException {
        if (!this._certsCalled || !this._crlsCalled) {
            zpg0.m220844a("getCerts() and/or getCrls() has not been called.");
            return null;
        }
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        return (ASN1SetParser) this._nextObject;
    }

    public ASN1Integer getVersion() {
        return this._version;
    }
}
