package org.spongycastle.asn1.p009x9;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class KeySpecificInfo extends ASN1Object {
    private ASN1ObjectIdentifier algorithm;
    private ASN1OctetString counter;

    private KeySpecificInfo(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.algorithm = (ASN1ObjectIdentifier) objects.nextElement();
        this.counter = (ASN1OctetString) objects.nextElement();
    }

    public static KeySpecificInfo getInstance(Object obj) {
        if (obj instanceof KeySpecificInfo) {
            return (KeySpecificInfo) obj;
        }
        if (obj != null) {
            return new KeySpecificInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public ASN1OctetString getCounter() {
        return this.counter;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.algorithm);
        aSN1EncodableVector.add(this.counter);
        return new DERSequence(aSN1EncodableVector);
    }

    public KeySpecificInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1OctetString aSN1OctetString) {
        this.algorithm = aSN1ObjectIdentifier;
        this.counter = aSN1OctetString;
    }
}
