package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class RC2CBCParameter extends ASN1Object {

    /* JADX INFO: renamed from: iv */
    ASN1OctetString f206268iv;
    ASN1Integer version;

    private RC2CBCParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 1) {
            this.version = null;
            this.f206268iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        } else {
            this.version = (ASN1Integer) aSN1Sequence.getObjectAt(0);
            this.f206268iv = (ASN1OctetString) aSN1Sequence.getObjectAt(1);
        }
    }

    public static RC2CBCParameter getInstance(Object obj) {
        if (obj instanceof RC2CBCParameter) {
            return (RC2CBCParameter) obj;
        }
        if (obj != null) {
            return new RC2CBCParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getIV() {
        return this.f206268iv.getOctets();
    }

    public BigInteger getRC2ParameterVersion() {
        ASN1Integer aSN1Integer = this.version;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Integer aSN1Integer = this.version;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.f206268iv);
        return new DERSequence(aSN1EncodableVector);
    }

    public RC2CBCParameter(int i, byte[] bArr) {
        this.version = new ASN1Integer(i);
        this.f206268iv = new DEROctetString(bArr);
    }

    public RC2CBCParameter(byte[] bArr) {
        this.version = null;
        this.f206268iv = new DEROctetString(bArr);
    }
}
