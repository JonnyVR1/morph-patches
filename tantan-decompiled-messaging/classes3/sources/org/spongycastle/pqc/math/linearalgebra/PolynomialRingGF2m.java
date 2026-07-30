package org.spongycastle.pqc.math.linearalgebra;

import l.lwm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PolynomialRingGF2m {
    private GF2mField field;

    /* JADX INFO: renamed from: p */
    private PolynomialGF2mSmallM f10631p;
    protected PolynomialGF2mSmallM[] sqMatrix;
    protected PolynomialGF2mSmallM[] sqRootMatrix;

    public PolynomialRingGF2m(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.field = gF2mField;
        this.f10631p = polynomialGF2mSmallM;
        computeSquaringMatrix();
        computeSquareRootMatrix();
    }

    private void computeSquareRootMatrix() {
        int coefficient;
        int degree = this.f10631p.getDegree();
        PolynomialGF2mSmallM[] polynomialGF2mSmallMArr = new PolynomialGF2mSmallM[degree];
        int i = degree - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            polynomialGF2mSmallMArr[i2] = new PolynomialGF2mSmallM(this.sqMatrix[i2]);
        }
        this.sqRootMatrix = new PolynomialGF2mSmallM[degree];
        while (i >= 0) {
            this.sqRootMatrix[i] = new PolynomialGF2mSmallM(this.field, i);
            i--;
        }
        for (int i3 = 0; i3 < degree; i3++) {
            if (polynomialGF2mSmallMArr[i3].getCoefficient(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < degree) {
                    if (polynomialGF2mSmallMArr[i4].getCoefficient(i3) != 0) {
                        swapColumns(polynomialGF2mSmallMArr, i3, i4);
                        swapColumns(this.sqRootMatrix, i3, i4);
                        i4 = degree;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    lwm.a("Squaring matrix is not invertible.");
                    return;
                }
            }
            int iInverse = this.field.inverse(polynomialGF2mSmallMArr[i3].getCoefficient(i3));
            polynomialGF2mSmallMArr[i3].multThisWithElement(iInverse);
            this.sqRootMatrix[i3].multThisWithElement(iInverse);
            for (int i5 = 0; i5 < degree; i5++) {
                if (i5 != i3 && (coefficient = polynomialGF2mSmallMArr[i5].getCoefficient(i3)) != 0) {
                    PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement = polynomialGF2mSmallMArr[i3].multWithElement(coefficient);
                    PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement2 = this.sqRootMatrix[i3].multWithElement(coefficient);
                    polynomialGF2mSmallMArr[i5].addToThis(polynomialGF2mSmallMMultWithElement);
                    this.sqRootMatrix[i5].addToThis(polynomialGF2mSmallMMultWithElement2);
                }
            }
        }
    }

    private void computeSquaringMatrix() {
        int i;
        int degree = this.f10631p.getDegree();
        this.sqMatrix = new PolynomialGF2mSmallM[degree];
        int i2 = 0;
        while (true) {
            i = degree >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.sqMatrix[i2] = new PolynomialGF2mSmallM(this.field, iArr);
            i2++;
        }
        while (i < degree) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.sqMatrix[i] = new PolynomialGF2mSmallM(this.field, iArr2).mod(this.f10631p);
            i++;
        }
    }

    private static void swapColumns(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr, int i, int i2) {
        PolynomialGF2mSmallM polynomialGF2mSmallM = polynomialGF2mSmallMArr[i];
        polynomialGF2mSmallMArr[i] = polynomialGF2mSmallMArr[i2];
        polynomialGF2mSmallMArr[i2] = polynomialGF2mSmallM;
    }

    public PolynomialGF2mSmallM[] getSquareRootMatrix() {
        return this.sqRootMatrix;
    }

    public PolynomialGF2mSmallM[] getSquaringMatrix() {
        return this.sqMatrix;
    }
}
