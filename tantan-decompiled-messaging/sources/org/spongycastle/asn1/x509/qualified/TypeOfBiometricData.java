package org.spongycastle.asn1.x509.qualified;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import p149l.ig3;
import p149l.k250;

/* JADX INFO: loaded from: classes3.dex */
public class TypeOfBiometricData extends ASN1Object implements ASN1Choice {
    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;
    ASN1Encodable obj;

    public TypeOfBiometricData(int i) {
        if (i == 0 || i == 1) {
            this.obj = new ASN1Integer(i);
        } else {
            k250.m144273a("unknow PredefinedBiometricType : ", i);
            throw null;
        }
    }

    public static TypeOfBiometricData getInstance(Object obj) {
        if (obj == null || (obj instanceof TypeOfBiometricData)) {
            return (TypeOfBiometricData) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new TypeOfBiometricData(ASN1Integer.getInstance(obj).getValue().intValue());
        }
        if (obj instanceof ASN1ObjectIdentifier) {
            return new TypeOfBiometricData(ASN1ObjectIdentifier.getInstance(obj));
        }
        ig3.m135964a("unknown object in getInstance");
        return null;
    }

    public ASN1ObjectIdentifier getBiometricDataOid() {
        return (ASN1ObjectIdentifier) this.obj;
    }

    public int getPredefinedBiometricType() {
        return ((ASN1Integer) this.obj).getValue().intValue();
    }

    public boolean isPredefined() {
        return this.obj instanceof ASN1Integer;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.obj.toASN1Primitive();
    }

    public TypeOfBiometricData(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.obj = aSN1ObjectIdentifier;
    }
}
