package org.spongycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
public class ComputeInField {

    /* JADX INFO: renamed from: A */
    private short[][] f206996A;

    /* JADX INFO: renamed from: x */
    short[] f206997x;

    private void computeZerosAbove() throws RuntimeException {
        for (int length = this.f206996A.length - 1; length > 0; length--) {
            for (int i = length - 1; i >= 0; i--) {
                short[][] sArr = this.f206996A;
                short s = sArr[i][length];
                short sInvElem = GF2Field.invElem(sArr[length][length]);
                if (sInvElem == 0) {
                    upk0.m194883a("The matrix is not invertible");
                    return;
                }
                int i2 = length;
                while (true) {
                    short[][] sArr2 = this.f206996A;
                    if (i2 < sArr2.length * 2) {
                        short sMultElem = GF2Field.multElem(s, GF2Field.multElem(sArr2[length][i2], sInvElem));
                        short[] sArr3 = this.f206996A[i];
                        sArr3[i2] = GF2Field.addElem(sArr3[i2], sMultElem);
                        i2++;
                    }
                }
            }
        }
    }

    private void computeZerosUnder(boolean z) throws RuntimeException {
        short[][] sArr = this.f206996A;
        int length = z ? sArr.length * 2 : sArr.length + 1;
        int i = 0;
        while (i < this.f206996A.length - 1) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                short[][] sArr2 = this.f206996A;
                if (i3 < sArr2.length) {
                    short s = sArr2[i3][i];
                    short sInvElem = GF2Field.invElem(sArr2[i][i]);
                    if (sInvElem == 0) {
                        upk0.m194883a("Matrix not invertible! We have to choose another one!");
                        return;
                    }
                    for (int i4 = i; i4 < length; i4++) {
                        short sMultElem = GF2Field.multElem(s, GF2Field.multElem(this.f206996A[i][i4], sInvElem));
                        short[] sArr3 = this.f206996A[i3];
                        sArr3[i4] = GF2Field.addElem(sArr3[i4], sMultElem);
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    private void substitute() throws RuntimeException {
        short[][] sArr;
        short[][] sArr2 = this.f206996A;
        short sInvElem = GF2Field.invElem(sArr2[sArr2.length - 1][sArr2.length - 1]);
        if (sInvElem == 0) {
            upk0.m194883a("The equation system is not solvable");
            return;
        }
        short[] sArr3 = this.f206997x;
        short[][] sArr4 = this.f206996A;
        sArr3[sArr4.length - 1] = GF2Field.multElem(sArr4[sArr4.length - 1][sArr4.length], sInvElem);
        for (int length = this.f206996A.length - 2; length >= 0; length--) {
            short[][] sArr5 = this.f206996A;
            short sAddElem = sArr5[length][sArr5.length];
            int length2 = sArr5.length;
            while (true) {
                length2--;
                sArr = this.f206996A;
                if (length2 <= length) {
                    break;
                } else {
                    sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(sArr[length][length2], this.f206997x[length2]));
                }
            }
            short sInvElem2 = GF2Field.invElem(sArr[length][length]);
            if (sInvElem2 == 0) {
                upk0.m194883a("Not solvable equation system");
                return;
            }
            this.f206997x[length] = GF2Field.multElem(sAddElem, sInvElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            upk0.m194883a("Addition is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = GF2Field.addElem(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            upk0.m194883a("Multiplication is not possible!");
            return null;
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr3[i] = GF2Field.addElem(sArr[i], sArr2[i]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        short[][] sArr2;
        Class cls = Short.TYPE;
        try {
            int i = 0;
            this.f206996A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i2 = 0; i2 < sArr.length; i2++) {
                for (int i3 = 0; i3 < sArr.length; i3++) {
                    this.f206996A[i2][i3] = sArr[i2][i3];
                }
                int length = sArr.length;
                while (true) {
                    int length2 = sArr.length * 2;
                    sArr2 = this.f206996A;
                    if (length < length2) {
                        sArr2[i2][length] = 0;
                        length++;
                    }
                }
                sArr2[i2][sArr2.length + i2] = 1;
            }
            computeZerosUnder(true);
            int i4 = 0;
            while (true) {
                short[][] sArr3 = this.f206996A;
                if (i4 >= sArr3.length) {
                    break;
                }
                short sInvElem = GF2Field.invElem(sArr3[i4][i4]);
                int i5 = i4;
                while (true) {
                    short[][] sArr4 = this.f206996A;
                    if (i5 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i4];
                        sArr5[i5] = GF2Field.multElem(sArr5[i5], sInvElem);
                        i5++;
                    }
                }
                i4++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.f206996A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.f206996A;
                if (i >= sArr8.length) {
                    return sArr7;
                }
                int length3 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.f206996A;
                    if (length3 < sArr9.length * 2) {
                        sArr7[i][length3 - sArr9.length] = sArr9[i][length3];
                        length3++;
                    }
                }
                i++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = GF2Field.multElem(s, sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr2[i] = GF2Field.multElem(s, sArr[i]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            upk0.m194883a("Multiplication is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = GF2Field.multElem(sArr[i], sArr2[i2]);
            }
        }
        return sArr3;
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            upk0.m194883a("Multiplication is not possible!");
            return null;
        }
        this.f206996A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short sMultElem = GF2Field.multElem(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr3 = this.f206996A[i];
                    sArr3[i3] = GF2Field.addElem(sArr3[i3], sMultElem);
                }
            }
        }
        return this.f206996A;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        try {
            if (sArr.length != sArr2.length) {
                throw new RuntimeException("The equation system is not solvable");
            }
            this.f206996A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f206997x = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr[0].length; i2++) {
                    this.f206996A[i][i2] = sArr[i][i2];
                }
            }
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                short[] sArr3 = this.f206996A[i3];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i3], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f206997x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length == sArr2.length) {
            short[] sArr3 = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr2.length; i2++) {
                    sArr3[i] = GF2Field.addElem(sArr3[i], GF2Field.multElem(sArr[i][i2], sArr2[i2]));
                }
            }
            return sArr3;
        }
        upk0.m194883a("Multiplication is not possible!");
        return null;
    }
}
