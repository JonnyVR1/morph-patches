package org.spongycastle.asn1.p128x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DHPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: y */
    private ASN1Integer f206317y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.f206317y = new ASN1Integer(bigInteger);
        } else {
            ig3.m135964a("'y' cannot be null");
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
        ig3.m135964a("Invalid DHPublicKey: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getY() {
        return this.f206317y.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f206317y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            this.f206317y = aSN1Integer;
        } else {
            ig3.m135964a("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z));
    }
}
