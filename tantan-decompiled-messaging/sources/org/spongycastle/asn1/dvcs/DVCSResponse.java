package org.spongycastle.asn1.dvcs;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import p149l.ig3;
import p149l.kg3;

/* JADX INFO: loaded from: classes3.dex */
public class DVCSResponse extends ASN1Object implements ASN1Choice {
    private DVCSCertInfo dvCertInfo;
    private DVCSErrorNotice dvErrorNote;

    public DVCSResponse(DVCSCertInfo dVCSCertInfo) {
        this.dvCertInfo = dVCSCertInfo;
    }

    public static DVCSResponse getInstance(Object obj) {
        if (obj == null || (obj instanceof DVCSResponse)) {
            return (DVCSResponse) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e) {
                kg3.m145878a("failed to construct sequence from byte[]: ", e.getMessage());
                return null;
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new DVCSResponse(DVCSCertInfo.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            return new DVCSResponse(DVCSErrorNotice.getInstance(ASN1TaggedObject.getInstance(obj), false));
        }
        ig3.m135964a("Couldn't convert from object to DVCSResponse: ".concat(obj.getClass().getName()));
        return null;
    }

    public DVCSCertInfo getCertInfo() {
        return this.dvCertInfo;
    }

    public DVCSErrorNotice getErrorNotice() {
        return this.dvErrorNote;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DVCSCertInfo dVCSCertInfo = this.dvCertInfo;
        return dVCSCertInfo != null ? dVCSCertInfo.toASN1Primitive() : new DERTaggedObject(false, 0, this.dvErrorNote);
    }

    public String toString() {
        if (this.dvCertInfo != null) {
            return "DVCSResponse {\ndvCertInfo: " + this.dvCertInfo.toString() + "}\n";
        }
        return "DVCSResponse {\ndvErrorNote: " + this.dvErrorNote.toString() + "}\n";
    }

    public DVCSResponse(DVCSErrorNotice dVCSErrorNotice) {
        this.dvErrorNote = dVCSErrorNotice;
    }

    public static DVCSResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
