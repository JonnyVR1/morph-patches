package org.spongycastle.asn1.eac;

import java.io.IOException;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1ApplicationSpecific;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.asn1.DEROctetString;
import p153l.C20716v1;
import p153l.wtq0;
import p153l.yll;

/* JADX INFO: loaded from: classes3.dex */
public class CVCertificateRequest extends ASN1Object {
    public static byte[] ZeroArray = {0};
    private static int bodyValid = 1;
    private static int signValid = 2;
    int ProfileId;
    private CertificateBody certificateBody;
    byte[] encoded;
    byte[] encodedAuthorityReference;
    private byte[] outerSignature;
    String strCertificateHolderReference;
    private int valid;
    private byte[] innerSignature = null;
    ASN1ObjectIdentifier signOid = null;
    ASN1ObjectIdentifier keyOid = null;
    byte[] certificate = null;
    protected String overSignerReference = null;
    PublicKeyDataObject iso7816PubKey = null;

    private CVCertificateRequest(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        this.outerSignature = null;
        if (aSN1ApplicationSpecific.getApplicationTag() != 103) {
            initCertBody(aSN1ApplicationSpecific);
            return;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16));
        initCertBody(ASN1ApplicationSpecific.getInstance(aSN1Sequence.getObjectAt(0)));
        this.outerSignature = ASN1ApplicationSpecific.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)).getContents();
    }

    public static CVCertificateRequest getInstance(Object obj) {
        if (obj instanceof CVCertificateRequest) {
            return (CVCertificateRequest) obj;
        }
        if (obj != null) {
            try {
                return new CVCertificateRequest(ASN1ApplicationSpecific.getInstance(obj));
            } catch (IOException e) {
                C20716v1.m198963a("unable to parse data: ", e.getMessage(), e);
            }
        }
        return null;
    }

    private void initCertBody(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            yll.m216601a("not a CARDHOLDER_CERTIFICATE in request:", aSN1ApplicationSpecific.getApplicationTag());
            return;
        }
        Enumeration objects = ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16)).getObjects();
        while (objects.hasMoreElements()) {
            ASN1ApplicationSpecific aSN1ApplicationSpecific2 = ASN1ApplicationSpecific.getInstance(objects.nextElement());
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.innerSignature = aSN1ApplicationSpecific2.getContents();
                this.valid |= signValid;
            } else if (applicationTag != 78) {
                yll.m216601a("Invalid tag, not an CV Certificate Request element:", aSN1ApplicationSpecific2.getApplicationTag());
                return;
            } else {
                this.certificateBody = CertificateBody.getInstance(aSN1ApplicationSpecific2);
                this.valid |= bodyValid;
            }
        }
    }

    public CertificateBody getCertificateBody() {
        return this.certificateBody;
    }

    public byte[] getInnerSignature() {
        return this.innerSignature;
    }

    public byte[] getOuterSignature() {
        return this.outerSignature;
    }

    public PublicKeyDataObject getPublicKey() {
        return this.certificateBody.getPublicKey();
    }

    public boolean hasOuterSignature() {
        return this.outerSignature != null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certificateBody);
        try {
            aSN1EncodableVector.add(new DERApplicationSpecific(false, 55, (ASN1Encodable) new DEROctetString(this.innerSignature)));
            return new DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (IOException unused) {
            wtq0.m207906a("unable to convert signature!");
            return null;
        }
    }
}
