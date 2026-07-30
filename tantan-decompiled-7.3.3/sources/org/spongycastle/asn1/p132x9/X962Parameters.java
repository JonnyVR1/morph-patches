package org.spongycastle.asn1.p132x9;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import p153l.wg3;
import p153l.yg3;

/* JADX INFO: loaded from: classes3.dex */
public class X962Parameters extends ASN1Object implements ASN1Choice {
    private ASN1Primitive params;

    public X962Parameters(X9ECParameters x9ECParameters) {
        this.params = null;
        this.params = x9ECParameters.toASN1Primitive();
    }

    public static X962Parameters getInstance(Object obj) {
        if (obj == null || (obj instanceof X962Parameters)) {
            return (X962Parameters) obj;
        }
        if (obj instanceof ASN1Primitive) {
            return new X962Parameters((ASN1Primitive) obj);
        }
        if (!(obj instanceof byte[])) {
            wg3.m206174a("unknown object in getInstance()");
            return null;
        }
        try {
            return new X962Parameters(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e) {
            yg3.m215829a("unable to parse encoded data: ", e.getMessage());
            return null;
        }
    }

    public ASN1Primitive getParameters() {
        return this.params;
    }

    public boolean isImplicitlyCA() {
        return this.params instanceof ASN1Null;
    }

    public boolean isNamedCurve() {
        return this.params instanceof ASN1ObjectIdentifier;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.params;
    }

    public X962Parameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.params = aSN1ObjectIdentifier;
    }

    public X962Parameters(ASN1Null aSN1Null) {
        this.params = aSN1Null;
    }

    public X962Parameters(ASN1Primitive aSN1Primitive) {
        this.params = aSN1Primitive;
    }

    public static X962Parameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
