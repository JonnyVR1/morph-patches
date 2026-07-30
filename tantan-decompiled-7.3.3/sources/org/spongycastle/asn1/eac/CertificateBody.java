package org.spongycastle.asn1.eac;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ApplicationSpecific;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.asn1.DEROctetString;
import p153l.pvb;
import p153l.wg3;
import p153l.yg3;
import p153l.yll;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateBody extends ASN1Object {
    private static final int CAR = 2;
    private static final int CEfD = 32;
    private static final int CExD = 64;
    private static final int CHA = 16;
    private static final int CHR = 8;
    private static final int CPI = 1;

    /* JADX INFO: renamed from: PK */
    private static final int f207170PK = 4;
    public static final int profileType = 127;
    public static final int requestType = 13;
    private DERApplicationSpecific certificateEffectiveDate;
    private DERApplicationSpecific certificateExpirationDate;
    private CertificateHolderAuthorization certificateHolderAuthorization;
    private DERApplicationSpecific certificateHolderReference;
    private DERApplicationSpecific certificateProfileIdentifier;
    private int certificateType = 0;
    private DERApplicationSpecific certificationAuthorityReference;
    private PublicKeyDataObject publicKey;
    ASN1InputStream seq;

    public CertificateBody(DERApplicationSpecific dERApplicationSpecific, CertificationAuthorityReference certificationAuthorityReference, PublicKeyDataObject publicKeyDataObject, CertificateHolderReference certificateHolderReference, CertificateHolderAuthorization certificateHolderAuthorization, PackedDate packedDate, PackedDate packedDate2) {
        setCertificateProfileIdentifier(dERApplicationSpecific);
        setCertificationAuthorityReference(new DERApplicationSpecific(2, certificationAuthorityReference.getEncoded()));
        setPublicKey(publicKeyDataObject);
        setCertificateHolderReference(new DERApplicationSpecific(32, certificateHolderReference.getEncoded()));
        setCertificateHolderAuthorization(certificateHolderAuthorization);
        try {
            setCertificateEffectiveDate(new DERApplicationSpecific(false, 37, (ASN1Encodable) new DEROctetString(packedDate.getEncoding())));
            setCertificateExpirationDate(new DERApplicationSpecific(false, 36, (ASN1Encodable) new DEROctetString(packedDate2.getEncoding())));
        } catch (IOException e) {
            yg3.m215829a("unable to encode dates: ", e.getMessage());
            throw null;
        }
    }

    public static CertificateBody getInstance(Object obj) throws IOException {
        if (obj instanceof CertificateBody) {
            return (CertificateBody) obj;
        }
        if (obj != null) {
            return new CertificateBody(ASN1ApplicationSpecific.getInstance(obj));
        }
        return null;
    }

    private ASN1Primitive profileToASN1Object() throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certificateProfileIdentifier);
        aSN1EncodableVector.add(this.certificationAuthorityReference);
        aSN1EncodableVector.add(new DERApplicationSpecific(false, 73, (ASN1Encodable) this.publicKey));
        aSN1EncodableVector.add(this.certificateHolderReference);
        aSN1EncodableVector.add(this.certificateHolderAuthorization);
        aSN1EncodableVector.add(this.certificateEffectiveDate);
        aSN1EncodableVector.add(this.certificateExpirationDate);
        return new DERApplicationSpecific(78, aSN1EncodableVector);
    }

    private ASN1Primitive requestToASN1Object() throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certificateProfileIdentifier);
        aSN1EncodableVector.add(new DERApplicationSpecific(false, 73, (ASN1Encodable) this.publicKey));
        aSN1EncodableVector.add(this.certificateHolderReference);
        return new DERApplicationSpecific(78, aSN1EncodableVector);
    }

    private void setCertificateEffectiveDate(DERApplicationSpecific dERApplicationSpecific) throws IllegalArgumentException {
        if (dERApplicationSpecific.getApplicationTag() != 37) {
            pvb.m173939a("Not an Iso7816Tags.APPLICATION_EFFECTIVE_DATE tag :", EACTags.encodeTag(dERApplicationSpecific));
        } else {
            this.certificateEffectiveDate = dERApplicationSpecific;
            this.certificateType |= 32;
        }
    }

    private void setCertificateExpirationDate(DERApplicationSpecific dERApplicationSpecific) throws IllegalArgumentException {
        if (dERApplicationSpecific.getApplicationTag() != 36) {
            wg3.m206174a("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
        } else {
            this.certificateExpirationDate = dERApplicationSpecific;
            this.certificateType |= 64;
        }
    }

    private void setCertificateHolderAuthorization(CertificateHolderAuthorization certificateHolderAuthorization) {
        this.certificateHolderAuthorization = certificateHolderAuthorization;
        this.certificateType |= 16;
    }

    private void setCertificateHolderReference(DERApplicationSpecific dERApplicationSpecific) throws IllegalArgumentException {
        if (dERApplicationSpecific.getApplicationTag() != 32) {
            wg3.m206174a("Not an Iso7816Tags.CARDHOLDER_NAME tag");
        } else {
            this.certificateHolderReference = dERApplicationSpecific;
            this.certificateType |= 8;
        }
    }

    private void setCertificateProfileIdentifier(DERApplicationSpecific dERApplicationSpecific) throws IllegalArgumentException {
        if (dERApplicationSpecific.getApplicationTag() != 41) {
            pvb.m173939a("Not an Iso7816Tags.INTERCHANGE_PROFILE tag :", EACTags.encodeTag(dERApplicationSpecific));
        } else {
            this.certificateProfileIdentifier = dERApplicationSpecific;
            this.certificateType |= 1;
        }
    }

    private void setCertificationAuthorityReference(DERApplicationSpecific dERApplicationSpecific) throws IllegalArgumentException {
        if (dERApplicationSpecific.getApplicationTag() != 2) {
            wg3.m206174a("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
        } else {
            this.certificationAuthorityReference = dERApplicationSpecific;
            this.certificateType |= 2;
        }
    }

    private void setIso7816CertificateBody(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 78) {
            zpg0.m220844a("Bad tag : not an iso7816 CERTIFICATE_CONTENT_TEMPLATE");
            return;
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                return;
            }
            if (!(object instanceof DERApplicationSpecific)) {
                throw new IOException("Not a valid iso7816 content : not a DERApplicationSpecific Object :" + EACTags.encodeTag(aSN1ApplicationSpecific) + object.getClass());
            }
            DERApplicationSpecific dERApplicationSpecific = (DERApplicationSpecific) object;
            int applicationTag = dERApplicationSpecific.getApplicationTag();
            if (applicationTag == 2) {
                setCertificationAuthorityReference(dERApplicationSpecific);
            } else if (applicationTag == 32) {
                setCertificateHolderReference(dERApplicationSpecific);
            } else if (applicationTag == 41) {
                setCertificateProfileIdentifier(dERApplicationSpecific);
            } else if (applicationTag == 73) {
                setPublicKey(PublicKeyDataObject.getInstance(dERApplicationSpecific.getObject(16)));
            } else if (applicationTag == 76) {
                setCertificateHolderAuthorization(new CertificateHolderAuthorization(dERApplicationSpecific));
            } else if (applicationTag == 36) {
                setCertificateExpirationDate(dERApplicationSpecific);
            } else {
                if (applicationTag != 37) {
                    this.certificateType = 0;
                    yll.m216601a("Not a valid iso7816 DERApplicationSpecific tag ", dERApplicationSpecific.getApplicationTag());
                    return;
                }
                setCertificateEffectiveDate(dERApplicationSpecific);
            }
        }
    }

    private void setPublicKey(PublicKeyDataObject publicKeyDataObject) {
        this.publicKey = PublicKeyDataObject.getInstance(publicKeyDataObject);
        this.certificateType |= 4;
    }

    public PackedDate getCertificateEffectiveDate() {
        if ((this.certificateType & 32) == 32) {
            return new PackedDate(this.certificateEffectiveDate.getContents());
        }
        return null;
    }

    public PackedDate getCertificateExpirationDate() throws IOException {
        if ((this.certificateType & 64) == 64) {
            return new PackedDate(this.certificateExpirationDate.getContents());
        }
        zpg0.m220844a("certificate Expiration Date not set");
        return null;
    }

    public CertificateHolderAuthorization getCertificateHolderAuthorization() throws IOException {
        if ((this.certificateType & 16) == 16) {
            return this.certificateHolderAuthorization;
        }
        zpg0.m220844a("Certificate Holder Authorisation not set");
        return null;
    }

    public CertificateHolderReference getCertificateHolderReference() {
        return new CertificateHolderReference(this.certificateHolderReference.getContents());
    }

    public DERApplicationSpecific getCertificateProfileIdentifier() {
        return this.certificateProfileIdentifier;
    }

    public int getCertificateType() {
        return this.certificateType;
    }

    public CertificationAuthorityReference getCertificationAuthorityReference() throws IOException {
        if ((this.certificateType & 2) == 2) {
            return new CertificationAuthorityReference(this.certificationAuthorityReference.getContents());
        }
        zpg0.m220844a("Certification authority reference not set");
        return null;
    }

    public PublicKeyDataObject getPublicKey() {
        return this.publicKey;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            int i = this.certificateType;
            if (i == 127) {
                return profileToASN1Object();
            }
            if (i == 13) {
                return requestToASN1Object();
            }
            return null;
        } catch (IOException unused) {
        }
    }

    private CertificateBody(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        setIso7816CertificateBody(aSN1ApplicationSpecific);
    }
}
