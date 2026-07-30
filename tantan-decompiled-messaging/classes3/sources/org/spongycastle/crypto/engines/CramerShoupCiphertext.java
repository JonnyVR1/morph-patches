package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: e */
    BigInteger f10168e;

    /* JADX INFO: renamed from: u1 */
    BigInteger f10169u1;

    /* JADX INFO: renamed from: u2 */
    BigInteger f10170u2;

    /* JADX INFO: renamed from: v */
    BigInteger f10171v;

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i = 4 + iBigEndianToInt;
        this.f10169u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i));
        int i2 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i) + i2;
        this.f10170u2 = new BigInteger(Arrays.copyOfRange(bArr, i2, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i3 = iBigEndianToInt2 + 4;
        int i4 = iBigEndianToInt3 + i3;
        this.f10168e = new BigInteger(Arrays.copyOfRange(bArr, i3, i4));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i4);
        int i5 = i4 + 4;
        this.f10171v = new BigInteger(Arrays.copyOfRange(bArr, i5, iBigEndianToInt4 + i5));
    }

    public BigInteger getE() {
        return this.f10168e;
    }

    public BigInteger getU1() {
        return this.f10169u1;
    }

    public BigInteger getU2() {
        return this.f10170u2;
    }

    public BigInteger getV() {
        return this.f10171v;
    }

    public void setE(BigInteger bigInteger) {
        this.f10168e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f10169u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f10170u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f10171v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f10169u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f10170u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f10168e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f10171v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i, length2);
        int i2 = i + length2;
        Pack.intToBigEndian(length3, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(byteArray3, 0, bArr, i3, length3);
        int i4 = i3 + length3;
        Pack.intToBigEndian(length4, bArr, i4);
        System.arraycopy(byteArray4, 0, bArr, i4 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.f10169u1.toString());
        stringBuffer.append("\nu2: " + this.f10170u2.toString());
        stringBuffer.append("\ne: " + this.f10168e.toString());
        stringBuffer.append("\nv: " + this.f10171v.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f10169u1 = bigInteger;
        this.f10170u2 = bigInteger2;
        this.f10168e = bigInteger3;
        this.f10171v = bigInteger4;
    }

    public CramerShoupCiphertext() {
    }
}
