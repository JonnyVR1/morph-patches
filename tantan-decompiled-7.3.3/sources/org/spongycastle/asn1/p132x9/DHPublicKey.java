package org.spongycastle.asn1.p132x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DHPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: y */
    private ASN1Integer f207239y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.f207239y = new ASN1Integer(bigInteger);
        } else {
            wg3.m206174a("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj);
        }
        wg3.m206174a("Invalid DHPublicKey: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getY() {
        return this.f207239y.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f207239y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            this.f207239y = aSN1Integer;
        } else {
            wg3.m206174a("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z));
    }
}
