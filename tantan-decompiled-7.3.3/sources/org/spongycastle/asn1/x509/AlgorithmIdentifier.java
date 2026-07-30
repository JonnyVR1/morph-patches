package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p153l.pvb;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmIdentifier extends ASN1Object {
    private ASN1ObjectIdentifier algorithm;
    private ASN1Encodable parameters;

    private AlgorithmIdentifier(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        this.algorithm = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.parameters = aSN1Sequence.getObjectAt(1);
        } else {
            this.parameters = null;
        }
    }

    public static AlgorithmIdentifier getInstance(Object obj) {
        if (obj instanceof AlgorithmIdentifier) {
            return (AlgorithmIdentifier) obj;
        }
        if (obj != null) {
            return new AlgorithmIdentifier(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public ASN1Encodable getParameters() {
        return this.parameters;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.algorithm);
        ASN1Encodable aSN1Encodable = this.parameters;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static AlgorithmIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.algorithm = aSN1ObjectIdentifier;
        this.parameters = aSN1Encodable;
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algorithm = aSN1ObjectIdentifier;
    }
}
