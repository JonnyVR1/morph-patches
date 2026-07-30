package org.spongycastle.asn1.isismtt.ocsp;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Certificate;
import p153l.pvb;
import p153l.wg3;
import p153l.xtq0;

/* JADX INFO: loaded from: classes3.dex */
public class RequestedCertificate extends ASN1Object implements ASN1Choice {
    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;
    private byte[] attributeCert;
    private Certificate cert;
    private byte[] publicKeyCert;

    private RequestedCertificate(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.publicKeyCert = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else if (aSN1TaggedObject.getTagNo() == 1) {
            this.attributeCert = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else {
            pvb.m173939a("unknown tag number: ", aSN1TaggedObject.getTagNo());
            throw null;
        }
    }

    public static RequestedCertificate getInstance(Object obj) {
        if (obj == null || (obj instanceof RequestedCertificate)) {
            return (RequestedCertificate) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RequestedCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            return new RequestedCertificate((ASN1TaggedObject) obj);
        }
        wg3.m206174a("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public byte[] getCertificateBytes() {
        Certificate certificate2 = this.cert;
        if (certificate2 == null) {
            byte[] bArr = this.publicKeyCert;
            return bArr != null ? bArr : this.attributeCert;
        }
        try {
            return certificate2.getEncoded();
        } catch (IOException e) {
            xtq0.m213103a("can't decode certificate: ", e);
            return null;
        }
    }

    public int getType() {
        if (this.cert != null) {
            return -1;
        }
        return this.publicKeyCert != null ? 0 : 1;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        if (this.publicKeyCert != null) {
            return new DERTaggedObject(0, new DEROctetString(this.publicKeyCert));
        }
        return this.attributeCert != null ? new DERTaggedObject(1, new DEROctetString(this.attributeCert)) : this.cert.toASN1Primitive();
    }

    public RequestedCertificate(Certificate certificate2) {
        this.cert = certificate2;
    }

    public RequestedCertificate(int i, byte[] bArr) {
        this(new DERTaggedObject(i, new DEROctetString(bArr)));
    }

    public static RequestedCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        wg3.m206174a("choice item must be explicitly tagged");
        return null;
    }
}
