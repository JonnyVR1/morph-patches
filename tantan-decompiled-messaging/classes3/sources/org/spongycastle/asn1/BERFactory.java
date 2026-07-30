package org.spongycastle.asn1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class BERFactory {
    static final BERSequence EMPTY_SEQUENCE = new BERSequence();
    static final BERSet EMPTY_SET = new BERSet();

    public static BERSequence createSequence(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() < 1 ? EMPTY_SEQUENCE : new BERSequence(aSN1EncodableVector);
    }

    public static BERSet createSet(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() < 1 ? EMPTY_SET : new BERSet(aSN1EncodableVector);
    }
}
