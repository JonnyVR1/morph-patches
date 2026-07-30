package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class GoppaCode {

    public static class MaMaPe {

        /* JADX INFO: renamed from: h */
        private GF2Matrix f207001h;

        /* JADX INFO: renamed from: p */
        private Permutation f207002p;

        /* JADX INFO: renamed from: s */
        private GF2Matrix f207003s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f207003s = gF2Matrix;
            this.f207001h = gF2Matrix2;
            this.f207002p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f207003s;
        }

        public Permutation getPermutation() {
            return this.f207002p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f207001h;
        }
    }

    public static class MatrixSet {

        /* JADX INFO: renamed from: g */
        private GF2Matrix f207004g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f207004g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f207004g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        GF2Matrix gF2Matrix2;
        boolean z;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        while (true) {
            Permutation permutation = new Permutation(numColumns, secureRandom);
            GF2Matrix gF2Matrix4 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (GF2Matrix) leftSubMatrix.computeInverse();
                z = true;
            } catch (ArithmeticException unused) {
                gF2Matrix2 = gF2Matrix3;
                z = false;
            }
            if (z) {
                return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i = 1;
        int i2 = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int i3 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, degree2, i2);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, degree2, i2);
        for (int i4 = 0; i4 < i2; i4++) {
            iArr2[0][i4] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i4));
        }
        for (int i5 = 1; i5 < degree2; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                iArr2[i5][i6] = gF2mField.mult(iArr2[i5 - 1][i6], i6);
            }
        }
        for (int i7 = 0; i7 < degree2; i7++) {
            for (int i8 = i3; i8 < i2; i8++) {
                int i9 = i3;
                while (i9 <= i7) {
                    int[] iArr3 = iArr[i7];
                    iArr3[i8] = gF2mField.add(iArr3[i8], gF2mField.mult(iArr2[i9][i8], polynomialGF2mSmallM.getCoefficient((degree2 + i9) - i7)));
                    i9++;
                    i = i;
                    i3 = i3;
                }
            }
        }
        int i10 = i;
        int i11 = i3;
        int[] iArr4 = new int[2];
        iArr4[i10] = (i2 + 31) >>> 5;
        iArr4[i11] = degree2 * degree;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iArr4);
        for (int i12 = i11; i12 < i2; i12++) {
            int i13 = i12 >>> 5;
            int i14 = i10 << (i12 & 31);
            for (int i15 = i11; i15 < degree2; i15++) {
                int i16 = iArr[i15][i12];
                for (int i17 = i11; i17 < degree; i17++) {
                    if (((i16 >>> i17) & 1) != 0) {
                        int[] iArr6 = iArr5[(((i15 + 1) * degree) - i17) - 1];
                        iArr6[i13] = iArr6[i13] ^ i14;
                    }
                }
            }
        }
        return new GF2Matrix(i2, iArr5);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] polynomialGF2mSmallMArrModPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallMArrModPolynomialToFracton[0];
            PolynomialGF2mSmallM polynomialGF2mSmallMMultiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            PolynomialGF2mSmallM polynomialGF2mSmallM3 = polynomialGF2mSmallMArrModPolynomialToFracton[1];
            PolynomialGF2mSmallM polynomialGF2mSmallMAdd = polynomialGF2mSmallMMultiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement = polynomialGF2mSmallMAdd.multWithElement(gF2mField.inverse(polynomialGF2mSmallMAdd.getHeadCoefficient()));
            for (int i = 0; i < degree; i++) {
                if (polynomialGF2mSmallMMultWithElement.evaluateAt(i) == 0) {
                    gF2Vector2.setBit(i);
                }
            }
        }
        return gF2Vector2;
    }
}
