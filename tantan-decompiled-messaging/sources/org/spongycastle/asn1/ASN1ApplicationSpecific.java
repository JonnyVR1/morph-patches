package org.spongycastle.asn1;

import java.io.IOException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.util.Arrays;
import p149l.f3c;
import p149l.ig3;
import p149l.kg3;
import p149l.rhg0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1ApplicationSpecific extends ASN1Primitive {
    protected final boolean isConstructed;
    protected final byte[] octets;
    protected final int tag;

    public ASN1ApplicationSpecific(boolean z, int i, byte[] bArr) {
        this.isConstructed = z;
        this.tag = i;
        this.octets = bArr;
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.m135964a("unknown object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e) {
            kg3.m145878a("Failed to construct object from byte[]: ", e.getMessage());
            return null;
        }
    }

    public static int getLengthOfHeader(byte[] bArr) {
        byte b = bArr[1];
        int i = b & 255;
        if (i == 128 || i <= 127) {
            return 2;
        }
        int i2 = b & 127;
        if (i2 <= 4) {
            return i2 + 2;
        }
        f3c.m119257a("DER length more than 4 bytes: ", i2);
        return 0;
    }

    private byte[] replaceTagNumber(int i, byte[] bArr) throws IOException {
        int i2;
        if ((bArr[0] & 31) == 31) {
            byte b = bArr[1];
            int i3 = b & 255;
            if ((b & 127) == 0) {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            i2 = 2;
            while (i3 >= 0 && (i3 & 128) != 0) {
                i3 = bArr[i2] & 255;
                i2++;
            }
        } else {
            i2 = 1;
        }
        int length = bArr.length - i2;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i2, bArr2, 1, length);
        bArr2[0] = (byte) i;
        return bArr2;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1ApplicationSpecific)) {
            return false;
        }
        ASN1ApplicationSpecific aSN1ApplicationSpecific = (ASN1ApplicationSpecific) aSN1Primitive;
        return this.isConstructed == aSN1ApplicationSpecific.isConstructed && this.tag == aSN1ApplicationSpecific.tag && Arrays.areEqual(this.octets, aSN1ApplicationSpecific.octets);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public byte[] getContents() {
        return this.octets;
    }

    public ASN1Primitive getObject(int i) throws IOException {
        if (i >= 31) {
            rhg0.m179353a("unsupported tag number");
            return null;
        }
        byte[] encoded = getEncoded();
        byte[] bArrReplaceTagNumber = replaceTagNumber(i, encoded);
        if ((encoded[0] & HttpTokens.SPACE) != 0) {
            bArrReplaceTagNumber[0] = (byte) (bArrReplaceTagNumber[0] | HttpTokens.SPACE);
        }
        return new ASN1InputStream(bArrReplaceTagNumber).readObject();
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        boolean z = this.isConstructed;
        return Arrays.hashCode(this.octets) ^ ((z ? 1 : 0) ^ this.tag);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.isConstructed;
    }

    public ASN1Primitive getObject() throws IOException {
        return new ASN1InputStream(getContents()).readObject();
    }
}
