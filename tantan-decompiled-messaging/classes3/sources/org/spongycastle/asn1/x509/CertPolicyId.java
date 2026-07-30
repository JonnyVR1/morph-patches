package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CertPolicyId extends ASN1Object {

    /* JADX INFO: renamed from: id */
    private ASN1ObjectIdentifier f9922id;

    private CertPolicyId(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f9922id = aSN1ObjectIdentifier;
    }

    public static CertPolicyId getInstance(Object obj) {
        if (obj instanceof CertPolicyId) {
            return (CertPolicyId) obj;
        }
        if (obj != null) {
            return new CertPolicyId(ASN1ObjectIdentifier.getInstance(obj));
        }
        return null;
    }

    public String getId() {
        return this.f9922id.getId();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f9922id;
    }
}
