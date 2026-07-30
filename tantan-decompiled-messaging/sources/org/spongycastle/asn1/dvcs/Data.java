package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.DigestInfo;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class Data extends ASN1Object implements ASN1Choice {
    private ASN1Sequence certs;
    private ASN1OctetString message;
    private DigestInfo messageImprint;

    public Data(byte[] bArr) {
        this.message = new DEROctetString(bArr);
    }

    public static Data getInstance(Object obj) {
        if (obj instanceof Data) {
            return (Data) obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new Data((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Sequence) {
            return new Data(DigestInfo.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            return new Data(ASN1Sequence.getInstance((ASN1TaggedObject) obj, false));
        }
        ig3.m135964a("Unknown object submitted to getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public TargetEtcChain[] getCerts() {
        ASN1Sequence aSN1Sequence = this.certs;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        TargetEtcChain[] targetEtcChainArr = new TargetEtcChain[size];
        for (int i = 0; i != size; i++) {
            targetEtcChainArr[i] = TargetEtcChain.getInstance(this.certs.getObjectAt(i));
        }
        return targetEtcChainArr;
    }

    public ASN1OctetString getMessage() {
        return this.message;
    }

    public DigestInfo getMessageImprint() {
        return this.messageImprint;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1OctetString aSN1OctetString = this.message;
        if (aSN1OctetString != null) {
            return aSN1OctetString.toASN1Primitive();
        }
        DigestInfo digestInfo = this.messageImprint;
        return digestInfo != null ? digestInfo.toASN1Primitive() : new DERTaggedObject(false, 0, this.certs);
    }

    public String toString() {
        if (this.message != null) {
            return "Data {\n" + this.message + "}\n";
        }
        if (this.messageImprint != null) {
            return "Data {\n" + this.messageImprint + "}\n";
        }
        return "Data {\n" + this.certs + "}\n";
    }

    public Data(ASN1OctetString aSN1OctetString) {
        this.message = aSN1OctetString;
    }

    public Data(DigestInfo digestInfo) {
        this.messageImprint = digestInfo;
    }

    public Data(TargetEtcChain targetEtcChain) {
        this.certs = new DERSequence(targetEtcChain);
    }

    public Data(TargetEtcChain[] targetEtcChainArr) {
        this.certs = new DERSequence(targetEtcChainArr);
    }

    private Data(ASN1Sequence aSN1Sequence) {
        this.certs = aSN1Sequence;
    }

    public static Data getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
