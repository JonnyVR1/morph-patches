package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERTaggedObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class CertStatus extends ASN1Object implements ASN1Choice {
    private int tagNo;
    private ASN1Encodable value;

    public CertStatus(ASN1TaggedObject aSN1TaggedObject) {
        this.tagNo = aSN1TaggedObject.getTagNo();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.value = DERNull.INSTANCE;
        } else if (tagNo == 1) {
            this.value = RevokedInfo.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2) {
                return;
            }
            this.value = DERNull.INSTANCE;
        }
    }

    public static CertStatus getInstance(Object obj) {
        if (obj == null || (obj instanceof CertStatus)) {
            return (CertStatus) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new CertStatus((ASN1TaggedObject) obj);
        }
        ig3.m135964a("unknown object in factory: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Encodable getStatus() {
        return this.value;
    }

    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.value);
    }

    public CertStatus(RevokedInfo revokedInfo) {
        this.tagNo = 1;
        this.value = revokedInfo;
    }

    public static CertStatus getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public CertStatus(int i, ASN1Encodable aSN1Encodable) {
        this.tagNo = i;
        this.value = aSN1Encodable;
    }

    public CertStatus() {
        this.tagNo = 0;
        this.value = DERNull.INSTANCE;
    }
}
