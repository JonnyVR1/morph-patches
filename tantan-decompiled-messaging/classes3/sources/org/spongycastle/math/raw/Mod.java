package org.spongycastle.math.raw;

import java.util.Random;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class Mod {
    public static void add(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.add(length, iArr2, iArr3, iArr4) != 0) {
            Nat.subFrom(length, iArr, iArr4);
        }
    }

    private static int getTrailingZeroes(int i) {
        int i2 = 0;
        while ((i & 1) == 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    private static void inversionResult(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            Nat.add(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    private static int inversionStep(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            Nat.shiftDownWord(i, iArr2, 0);
            i4 += 32;
        }
        int trailingZeroes = getTrailingZeroes(i3);
        if (trailingZeroes > 0) {
            Nat.shiftDownBits(i, iArr2, trailingZeroes, 0);
            i4 += trailingZeroes;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if ((iArr3[0] & 1) != 0) {
                i2 += i2 < 0 ? Nat.addTo(length, iArr, iArr3) : Nat.subFrom(length, iArr, iArr3);
            }
            Nat.shiftDownBit(length, iArr3, i2);
        }
        return i2;
    }

    public static void invert(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (Nat.isZero(length, iArr2)) {
            ig3.a("'x' cannot be 0");
            return;
        }
        int iInversionStep = 0;
        if (Nat.isOne(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrCopy = Nat.copy(length, iArr2);
        int[] iArrCreate = Nat.create(length);
        iArrCreate[0] = 1;
        int iInversionStep2 = (1 & iArrCopy[0]) == 0 ? inversionStep(iArr, iArrCopy, length, iArrCreate, 0) : 0;
        if (Nat.isOne(length, iArrCopy)) {
            inversionResult(iArr, iInversionStep2, iArrCreate, iArr3);
            return;
        }
        int[] iArrCopy2 = Nat.copy(length, iArr);
        int[] iArrCreate2 = Nat.create(length);
        int i = length;
        while (true) {
            int i2 = i - 1;
            if (iArrCopy[i2] == 0 && iArrCopy2[i2] == 0) {
                i--;
            } else if (Nat.gte(i, iArrCopy, iArrCopy2)) {
                Nat.subFrom(i, iArrCopy2, iArrCopy);
                iInversionStep2 = inversionStep(iArr, iArrCopy, i, iArrCreate, iInversionStep2 + (Nat.subFrom(length, iArrCreate2, iArrCreate) - iInversionStep));
                if (Nat.isOne(i, iArrCopy)) {
                    inversionResult(iArr, iInversionStep2, iArrCreate, iArr3);
                    return;
                }
            } else {
                Nat.subFrom(i, iArrCopy, iArrCopy2);
                iInversionStep = inversionStep(iArr, iArrCopy2, i, iArrCreate2, iInversionStep + (Nat.subFrom(length, iArrCreate, iArrCreate2) - iInversionStep2));
                if (Nat.isOne(i, iArrCopy2)) {
                    inversionResult(iArr, iInversionStep, iArrCreate2, iArr3);
                    return;
                }
            }
        }
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                iArrCreate[i8] = random.nextInt();
            }
            iArrCreate[i] = iArrCreate[i] & i7;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.sub(length, iArr2, iArr3, iArr4) != 0) {
            Nat.addTo(length, iArr, iArr4);
        }
    }
}
