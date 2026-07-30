package org.spongycastle.asn1.tsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Accuracy extends ASN1Object {
    protected static final int MAX_MICROS = 999;
    protected static final int MAX_MILLIS = 999;
    protected static final int MIN_MICROS = 1;
    protected static final int MIN_MILLIS = 1;
    ASN1Integer micros;
    ASN1Integer millis;
    ASN1Integer seconds;

    private Accuracy(ASN1Sequence aSN1Sequence) {
        this.seconds = null;
        this.millis = null;
        this.micros = null;
        for (int i = 0; i < aSN1Sequence.size(); i++) {
            if (aSN1Sequence.getObjectAt(i) instanceof ASN1Integer) {
                this.seconds = (ASN1Integer) aSN1Sequence.getObjectAt(i);
            } else if (aSN1Sequence.getObjectAt(i) instanceof DERTaggedObject) {
                DERTaggedObject dERTaggedObject = (DERTaggedObject) aSN1Sequence.getObjectAt(i);
                int tagNo = dERTaggedObject.getTagNo();
                if (tagNo == 0) {
                    ASN1Integer aSN1Integer = ASN1Integer.getInstance(dERTaggedObject, false);
                    this.millis = aSN1Integer;
                    if (aSN1Integer.getValue().intValue() < 1 || this.millis.getValue().intValue() > 999) {
                        wg3.m206174a("Invalid millis field : not in (1..999).");
                        throw null;
                    }
                } else {
                    if (tagNo != 1) {
                        wg3.m206174a("Invalig tag number");
                        throw null;
                    }
                    ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(dERTaggedObject, false);
                    this.micros = aSN1Integer2;
                    if (aSN1Integer2.getValue().intValue() < 1 || this.micros.getValue().intValue() > 999) {
                        wg3.m206174a("Invalid micros field : not in (1..999).");
                        throw null;
                    }
                }
            } else {
                continue;
            }
        }
    }

    public static Accuracy getInstance(Object obj) {
        if (obj instanceof Accuracy) {
            return (Accuracy) obj;
        }
        if (obj != null) {
            return new Accuracy(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer getMicros() {
        return this.micros;
    }

    public ASN1Integer getMillis() {
        return this.millis;
    }

    public ASN1Integer getSeconds() {
        return this.seconds;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Integer aSN1Integer = this.seconds;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        if (this.millis != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.millis));
        }
        if (this.micros != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.micros));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Accuracy(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3) {
        this.seconds = aSN1Integer;
        if (aSN1Integer2 != null && (aSN1Integer2.getValue().intValue() < 1 || aSN1Integer2.getValue().intValue() > 999)) {
            wg3.m206174a("Invalid millis field : not in (1..999)");
            throw null;
        }
        this.millis = aSN1Integer2;
        if (aSN1Integer3 != null && (aSN1Integer3.getValue().intValue() < 1 || aSN1Integer3.getValue().intValue() > 999)) {
            wg3.m206174a("Invalid micros field : not in (1..999)");
            throw null;
        }
        this.micros = aSN1Integer3;
    }

    public Accuracy() {
    }
}
