package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.p132io.Streams;
import p149l.C20558v1;
import p149l.ig3;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] data;
    protected final int padBits;

    public ASN1BitString(byte[] bArr, int i) {
        if (bArr == null) {
            jfd0.m141176a("data cannot be null");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            ig3.m135964a("zero length data with non-zero pad bits");
            throw null;
        }
        if (i > 7 || i < 0) {
            ig3.m135964a("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        this.data = Arrays.clone(bArr);
        this.padBits = i;
    }

    public static byte[] derForm(byte[] bArr, int i) {
        byte[] bArrClone = Arrays.clone(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrClone[length] = (byte) ((255 << i) & bArrClone[length]);
        }
        return bArrClone;
    }

    public static ASN1BitString fromInputStream(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            ig3.m135964a("truncated BIT STRING detected");
            return null;
        }
        int i2 = inputStream.read();
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            if (Streams.readFully(inputStream, bArr) != i3) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (i2 > 0 && i2 < 8) {
                byte b = bArr[i - 2];
                if (b != ((byte) ((255 << i2) & b))) {
                    return new DLBitString(bArr, i2);
                }
            }
        }
        return new DERBitString(bArr, i2);
    }

    public static byte[] getBytes(int i) {
        if (i == 0) {
            return new byte[0];
        }
        int i2 = 4;
        for (int i3 = 3; i3 >= 1 && ((255 << (i3 * 8)) & i) == 0; i3--) {
            i2--;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    public static int getPadBits(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                int i4 = i >> (i3 * 8);
                if (i4 != 0) {
                    i2 = i4 & 255;
                    break;
                }
                i3--;
            } else {
                if (i != 0) {
                    i2 = i & 255;
                    break;
                }
                i3--;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i5;
            }
            i5++;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
        return this.padBits == aSN1BitString.padBits && Arrays.areEqual(getBytes(), aSN1BitString.getBytes());
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    public byte[] getOctets() {
        if (this.padBits == 0) {
            return Arrays.clone(this.data);
        }
        qkq0.m175383a("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1String
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = table;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            C20558v1.m196534a("Internal error encoding BitString: ", e.getMessage(), e);
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(getBytes()) ^ this.padBits;
    }

    public int intValue() {
        byte[] bArrDerForm = this.data;
        int i = this.padBits;
        if (i > 0 && bArrDerForm.length <= 4) {
            bArrDerForm = derForm(bArrDerForm, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 != bArrDerForm.length && i3 != 4; i3++) {
            i2 |= (bArrDerForm[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERBitString(this.data, this.padBits);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLBitString(this.data, this.padBits);
    }

    public String toString() {
        return getString();
    }

    public int getPadBits() {
        return this.padBits;
    }

    public byte[] getBytes() {
        return derForm(this.data, this.padBits);
    }
}
