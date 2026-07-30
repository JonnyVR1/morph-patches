package org.spongycastle.asn1.eac;

import java.io.IOException;
import l.hjl;
import l.qkq0;
import l.rhg0;
import org.spongycastle.asn1.ASN1ApplicationSpecific;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.util.Arrays;
import p003l.C0591v1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CVCertificate extends ASN1Object {
    private static int bodyValid = 1;
    private static int signValid = 2;
    private CertificateBody certificateBody;
    private byte[] signature;
    private int valid;

    public CVCertificate(CertificateBody certificateBody, byte[] bArr) throws IOException {
        this.certificateBody = certificateBody;
        this.signature = bArr;
        this.valid = this.valid | bodyValid | signValid;
    }

    public static CVCertificate getInstance(Object obj) {
        if (obj instanceof CVCertificate) {
            return (CVCertificate) obj;
        }
        if (obj != null) {
            try {
                return new CVCertificate(ASN1ApplicationSpecific.getInstance(obj));
            } catch (IOException e) {
                C0591v1.m8269a("unable to parse data: ", e.getMessage(), e);
            }
        }
        return null;
    }

    private void initFrom(ASN1InputStream aSN1InputStream) throws IOException {
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                return;
            }
            if (!(object instanceof DERApplicationSpecific)) {
                rhg0.a("Invalid Input Stream for creating an Iso7816CertificateStructure");
                return;
            }
            setPrivateData((DERApplicationSpecific) object);
        }
    }

    private void setPrivateData(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        this.valid = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            hjl.a("not a CARDHOLDER_CERTIFICATE :", aSN1ApplicationSpecific.getApplicationTag());
            return;
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                if (this.valid == (signValid | bodyValid)) {
                    return;
                }
                hjl.a("invalid CARDHOLDER_CERTIFICATE :", aSN1ApplicationSpecific.getApplicationTag());
                return;
            } else {
                if (!(object instanceof DERApplicationSpecific)) {
                    rhg0.a("Invalid Object, not an Iso7816CertificateStructure");
                    return;
                }
                DERApplicationSpecific dERApplicationSpecific = (DERApplicationSpecific) object;
                int applicationTag = dERApplicationSpecific.getApplicationTag();
                if (applicationTag == 55) {
                    this.signature = dERApplicationSpecific.getContents();
                    this.valid |= signValid;
                } else if (applicationTag != 78) {
                    hjl.a("Invalid tag, not an Iso7816CertificateStructure :", dERApplicationSpecific.getApplicationTag());
                    return;
                } else {
                    this.certificateBody = CertificateBody.getInstance(dERApplicationSpecific);
                    this.valid |= bodyValid;
                }
            }
        }
    }

    public CertificationAuthorityReference getAuthorityReference() throws IOException {
        return this.certificateBody.getCertificationAuthorityReference();
    }

    public CertificateBody getBody() {
        return this.certificateBody;
    }

    public int getCertificateType() {
        return this.certificateBody.getCertificateType();
    }

    public PackedDate getEffectiveDate() throws IOException {
        return this.certificateBody.getCertificateEffectiveDate();
    }

    public PackedDate getExpirationDate() throws IOException {
        return this.certificateBody.getCertificateExpirationDate();
    }

    public ASN1ObjectIdentifier getHolderAuthorization() throws IOException {
        return this.certificateBody.getCertificateHolderAuthorization().getOid();
    }

    public Flags getHolderAuthorizationRights() throws IOException {
        return new Flags(this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 31);
    }

    public int getHolderAuthorizationRole() throws IOException {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 192;
    }

    public CertificateHolderReference getHolderReference() throws IOException {
        return this.certificateBody.getCertificateHolderReference();
    }

    public int getRole() throws IOException {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights();
    }

    public byte[] getSignature() {
        return Arrays.clone(this.signature);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certificateBody);
        try {
            aSN1EncodableVector.add(new DERApplicationSpecific(false, 55, (ASN1Encodable) new DEROctetString(this.signature)));
            return new DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (IOException unused) {
            qkq0.a("unable to convert signature!");
            return null;
        }
    }

    private CVCertificate(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        setPrivateData(aSN1ApplicationSpecific);
    }

    public CVCertificate(ASN1InputStream aSN1InputStream) throws IOException {
        initFrom(aSN1InputStream);
    }
}
