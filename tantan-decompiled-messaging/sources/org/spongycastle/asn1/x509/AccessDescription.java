package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class AccessDescription extends ASN1Object {
    public static final ASN1ObjectIdentifier id_ad_caIssuers = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final ASN1ObjectIdentifier id_ad_ocsp = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");
    GeneralName accessLocation;
    ASN1ObjectIdentifier accessMethod;

    private AccessDescription(ASN1Sequence aSN1Sequence) {
        this.accessMethod = null;
        this.accessLocation = null;
        if (aSN1Sequence.size() != 2) {
            ig3.m135964a("wrong number of elements in sequence");
            throw null;
        }
        this.accessMethod = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.accessLocation = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static AccessDescription getInstance(Object obj) {
        if (obj instanceof AccessDescription) {
            return (AccessDescription) obj;
        }
        if (obj != null) {
            return new AccessDescription(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName getAccessLocation() {
        return this.accessLocation;
    }

    public ASN1ObjectIdentifier getAccessMethod() {
        return this.accessMethod;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.accessMethod);
        aSN1EncodableVector.add(this.accessLocation);
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return "AccessDescription: Oid(" + this.accessMethod.getId() + ")";
    }

    public AccessDescription(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName generalName) {
        this.accessMethod = aSN1ObjectIdentifier;
        this.accessLocation = generalName;
    }
}
