package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Permutation {
    private int[] perm;

    public Permutation(byte[] bArr) {
        int[] iArr;
        if (bArr.length <= 4) {
            ig3.a("invalid encoding");
            throw null;
        }
        int i = 0;
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int iCeilLog256 = IntegerFunctions.ceilLog256(iOS2IP - 1);
        if (bArr.length != (iOS2IP * iCeilLog256) + 4) {
            ig3.a("invalid encoding");
            throw null;
        }
        this.perm = new int[iOS2IP];
        while (true) {
            iArr = this.perm;
            if (i >= iOS2IP) {
                break;
            }
            iArr[i] = LittleEndianConversions.OS2IP(bArr, (i * iCeilLog256) + 4, iCeilLog256);
            i++;
        }
        if (isPermutation(iArr)) {
            return;
        }
        ig3.a("invalid encoding");
        throw null;
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int iCeilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * iCeilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            LittleEndianConversions.I2OSP(this.perm[i], bArr, (i * iCeilLog256) + 4, iCeilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return this.perm.hashCode();
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            ig3.a("length mismatch");
            return null;
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String str = "[" + this.perm[0];
        for (int i = 1; i < this.perm.length; i++) {
            str = str + ", " + this.perm[i];
        }
        return str.concat("]");
    }

    public Permutation(int[] iArr) {
        if (isPermutation(iArr)) {
            this.perm = IntUtils.clone(iArr);
        } else {
            ig3.a("array is not a permutation vector");
            throw null;
        }
    }

    public Permutation(int i) {
        if (i > 0) {
            this.perm = new int[i];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                this.perm[i2] = i2;
            }
            return;
        }
        ig3.a("invalid length");
        throw null;
    }

    public Permutation(int i, SecureRandom secureRandom) {
        if (i > 0) {
            this.perm = new int[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = i2;
            }
            int i3 = i;
            for (int i4 = 0; i4 < i; i4++) {
                int iNextInt = RandUtils.nextInt(secureRandom, i3);
                i3--;
                this.perm[i4] = iArr[iNextInt];
                iArr[iNextInt] = iArr[i3];
            }
            return;
        }
        ig3.a("invalid length");
        throw null;
    }
}
