package org.spongycastle.asn1.cmp;

import java.io.IOException;
import l.ig3;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AttributeCertificate;
import org.spongycastle.asn1.x509.Certificate;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CMPCertificate extends ASN1Object implements ASN1Choice {
    private ASN1Object otherCert;
    private int otherTagValue;
    private Certificate x509v3PKCert;

    public CMPCertificate(Certificate certificate) {
        if (certificate.getVersionNumber() == 3) {
            this.x509v3PKCert = certificate;
        } else {
            ig3.a("only version 3 certificates allowed");
            throw null;
        }
    }

    public static CMPCertificate getInstance(Object obj) {
        if (obj == null || (obj instanceof CMPCertificate)) {
            return (CMPCertificate) obj;
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                ig3.a("Invalid encoding in CMPCertificate");
                return null;
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new CMPCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
            return new CMPCertificate(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
        }
        ig3.a("Invalid object: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Object getOtherCert() {
        return this.otherCert;
    }

    public int getOtherCertTag() {
        return this.otherTagValue;
    }

    public AttributeCertificate getX509v2AttrCert() {
        return AttributeCertificate.getInstance(this.otherCert);
    }

    public Certificate getX509v3PKCert() {
        return this.x509v3PKCert;
    }

    public boolean isX509v3PKCert() {
        return this.x509v3PKCert != null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.otherCert != null ? new DERTaggedObject(true, this.otherTagValue, this.otherCert) : this.x509v3PKCert.toASN1Primitive();
    }

    public CMPCertificate(int i, ASN1Object aSN1Object) {
        this.otherTagValue = i;
        this.otherCert = aSN1Object;
    }

    public CMPCertificate(AttributeCertificate attributeCertificate) {
        this(1, attributeCertificate);
    }
}
