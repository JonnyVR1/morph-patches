package org.spongycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import l.ig3;
import org.spongycastle.util.Arrays;
import p003l.C0637x1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ASN1Integer extends ASN1Primitive {
    private final byte[] bytes;

    public ASN1Integer(long j) {
        this.bytes = BigInteger.valueOf(j).toByteArray();
    }

    public static ASN1Integer getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (ASN1Integer) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C0637x1.m8688a("encoding error in getInstance: ", e);
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.bytes, ((ASN1Integer) aSN1Primitive).bytes);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(2, this.bytes);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.bytes.length) + 1 + this.bytes.length;
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.bytes;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getValue().toString();
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Integer(byte[] bArr, boolean z) {
        this.bytes = z ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1Integer)) {
            return new ASN1Integer(ASN1OctetString.getInstance(aSN1TaggedObject.getObject()).getOctets());
        }
        return getInstance(object);
    }
}
