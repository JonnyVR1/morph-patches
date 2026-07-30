package org.spongycastle.asn1.cmp;

import l.ig3;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PKIConfirmContent extends ASN1Object {
    private ASN1Null val;

    public PKIConfirmContent() {
        this.val = DERNull.INSTANCE;
    }

    public static PKIConfirmContent getInstance(Object obj) {
        if (obj == null || (obj instanceof PKIConfirmContent)) {
            return (PKIConfirmContent) obj;
        }
        if (obj instanceof ASN1Null) {
            return new PKIConfirmContent((ASN1Null) obj);
        }
        ig3.a("Invalid object: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.val;
    }

    private PKIConfirmContent(ASN1Null aSN1Null) {
        this.val = aSN1Null;
    }
}
