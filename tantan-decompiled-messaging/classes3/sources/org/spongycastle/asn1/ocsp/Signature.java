package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Signature extends ASN1Object {
    ASN1Sequence certs;
    DERBitString signature;
    AlgorithmIdentifier signatureAlgorithm;

    private Signature(ASN1Sequence aSN1Sequence) {
        this.signatureAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.signature = (DERBitString) aSN1Sequence.getObjectAt(1);
        if (aSN1Sequence.size() == 3) {
            this.certs = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true);
        }
    }

    public static Signature getInstance(Object obj) {
        if (obj instanceof Signature) {
            return (Signature) obj;
        }
        if (obj != null) {
            return new Signature(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Sequence getCerts() {
        return this.certs;
    }

    public DERBitString getSignature() {
        return this.signature;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.signatureAlgorithm);
        aSN1EncodableVector.add(this.signature);
        if (this.certs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.certs));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static Signature getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public Signature(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString, ASN1Sequence aSN1Sequence) {
        this.signatureAlgorithm = algorithmIdentifier;
        this.signature = dERBitString;
        this.certs = aSN1Sequence;
    }

    public Signature(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
        this.signatureAlgorithm = algorithmIdentifier;
        this.signature = dERBitString;
    }
}
