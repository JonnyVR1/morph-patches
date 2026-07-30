package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CommitmentTypeIndication extends ASN1Object {
    private ASN1ObjectIdentifier commitmentTypeId;
    private ASN1Sequence commitmentTypeQualifier;

    private CommitmentTypeIndication(ASN1Sequence aSN1Sequence) {
        this.commitmentTypeId = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            this.commitmentTypeQualifier = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        }
    }

    public static CommitmentTypeIndication getInstance(Object obj) {
        return (obj == null || (obj instanceof CommitmentTypeIndication)) ? (CommitmentTypeIndication) obj : new CommitmentTypeIndication(ASN1Sequence.getInstance(obj));
    }

    public ASN1ObjectIdentifier getCommitmentTypeId() {
        return this.commitmentTypeId;
    }

    public ASN1Sequence getCommitmentTypeQualifier() {
        return this.commitmentTypeQualifier;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.commitmentTypeId);
        ASN1Sequence aSN1Sequence = this.commitmentTypeQualifier;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CommitmentTypeIndication(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.commitmentTypeId = aSN1ObjectIdentifier;
    }

    public CommitmentTypeIndication(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Sequence aSN1Sequence) {
        this.commitmentTypeId = aSN1ObjectIdentifier;
        this.commitmentTypeQualifier = aSN1Sequence;
    }
}
