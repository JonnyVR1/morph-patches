package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;
import p153l.olk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class GF2nPolynomialField extends GF2nField {
    private boolean isPentanomial;
    private boolean isTrinomial;

    /* JADX INFO: renamed from: pc */
    private int[] f207921pc;
    GF2Polynomial[] squaringMatrix;

    /* JADX INFO: renamed from: tc */
    private int f207922tc;

    public GF2nPolynomialField(int i, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) throws RuntimeException {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f207921pc = new int[3];
        if (i < 3) {
            wg3.m206174a("degree must be at least 3");
            throw null;
        }
        if (gF2Polynomial.getLength() != i + 1) {
            olk0.m168132a();
            throw null;
        }
        if (!gF2Polynomial.isIrreducible()) {
            olk0.m168132a();
            throw null;
        }
        this.mDegree = i;
        this.fieldPolynomial = gF2Polynomial;
        computeSquaringMatrix();
        int i2 = 2;
        for (int i3 = 1; i3 < this.fieldPolynomial.getLength() - 1; i3++) {
            if (this.fieldPolynomial.testBit(i3)) {
                int i4 = i2 + 1;
                if (i4 == 3) {
                    this.f207922tc = i3;
                }
                if (i4 <= 5) {
                    this.f207921pc[i2 - 2] = i3;
                }
                i2 = i4;
            }
        }
        if (i2 == 3) {
            this.isTrinomial = true;
        }
        if (i2 == 5) {
            this.isPentanomial = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeSquaringMatrix() {
        int i = this.mDegree;
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i - 1];
        this.squaringMatrix = new GF2Polynomial[i];
        int i2 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.squaringMatrix;
            if (i2 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i2] = new GF2Polynomial(this.mDegree, "ZERO");
            i2++;
        }
        for (int i3 = 0; i3 < this.mDegree - 1; i3++) {
            gF2PolynomialArr[i3] = new GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i3).remainder(this.fieldPolynomial);
        }
        for (int i4 = 1; i4 <= Math.abs(this.mDegree >> 1); i4++) {
            int i5 = 1;
            while (true) {
                int i6 = this.mDegree;
                if (i5 <= i6) {
                    if (gF2PolynomialArr[i6 - (i4 << 1)].testBit(i6 - i5)) {
                        this.squaringMatrix[i5 - 1].setBit(this.mDegree - i4);
                    }
                    i5++;
                }
            }
        }
        int iAbs = Math.abs(this.mDegree >> 1) + 1;
        while (true) {
            int i7 = this.mDegree;
            if (iAbs > i7) {
                return;
            }
            this.squaringMatrix[((iAbs << 1) - i7) - 1].setBit(i7 - iAbs);
            iAbs++;
        }
    }

    private boolean testPentanomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean zIsIrreducible = false;
        int i = 1;
        while (i <= this.mDegree - 3 && !zIsIrreducible) {
            this.fieldPolynomial.setBit(i);
            int i2 = i + 1;
            int i3 = i2;
            while (i3 <= this.mDegree - 2 && !zIsIrreducible) {
                this.fieldPolynomial.setBit(i3);
                int i4 = i3 + 1;
                for (int i5 = i4; i5 <= this.mDegree - 1 && !zIsIrreducible; i5++) {
                    this.fieldPolynomial.setBit(i5);
                    if (((((this.mDegree & 1) != 0) | ((i & 1) != 0) | ((i3 & 1) != 0)) || ((i5 & 1) != 0)) && (zIsIrreducible = this.fieldPolynomial.isIrreducible())) {
                        this.isPentanomial = true;
                        int[] iArr = this.f207921pc;
                        iArr[0] = i;
                        iArr[1] = i3;
                        iArr[2] = i5;
                        return zIsIrreducible;
                    }
                    this.fieldPolynomial.resetBit(i5);
                }
                this.fieldPolynomial.resetBit(i3);
                i3 = i4;
            }
            this.fieldPolynomial.resetBit(i);
            i = i2;
        }
        return zIsIrreducible;
    }

    private boolean testRandom() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        boolean zIsIrreducible = false;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i = 1; i < this.mDegree && !zIsIrreducible; i++) {
            this.fieldPolynomial.setBit(i);
            boolean zIsIrreducible2 = this.fieldPolynomial.isIrreducible();
            if (zIsIrreducible2) {
                this.isTrinomial = true;
                this.f207922tc = i;
                return zIsIrreducible2;
            }
            this.fieldPolynomial.resetBit(i);
            zIsIrreducible = this.fieldPolynomial.isIrreducible();
        }
        return zIsIrreducible;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        int i = this.mDegree;
        if (i != gF2nField.mDegree) {
            wg3.m206174a("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
            return;
        }
        boolean z = gF2nField instanceof GF2nONBField;
        if (z) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i];
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            gF2PolynomialArr[i2] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        boolean z2 = randomRoot instanceof GF2nONBElement;
        int i3 = this.mDegree;
        if (z2) {
            gF2nElementArr = new GF2nONBElement[i3];
            gF2nElementArr[i3 - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            gF2nElementArr = new GF2nPolynomialElement[i3];
            gF2nElementArr[i3 - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        int i4 = this.mDegree;
        gF2nElementArr[i4 - 2] = randomRoot;
        for (int i5 = i4 - 3; i5 >= 0; i5--) {
            gF2nElementArr[i5] = (GF2nElement) gF2nElementArr[i5 + 1].multiply(randomRoot);
        }
        if (z) {
            for (int i6 = 0; i6 < this.mDegree; i6++) {
                int i7 = 0;
                while (true) {
                    int i8 = this.mDegree;
                    if (i7 < i8) {
                        if (gF2nElementArr[i6].testBit((i8 - i7) - 1)) {
                            int i9 = this.mDegree;
                            gF2PolynomialArr[(i9 - i7) - 1].setBit((i9 - i6) - 1);
                        }
                        i7++;
                    }
                }
            }
        } else {
            for (int i10 = 0; i10 < this.mDegree; i10++) {
                for (int i11 = 0; i11 < this.mDegree; i11++) {
                    if (gF2nElementArr[i10].testBit(i11)) {
                        int i12 = this.mDegree;
                        gF2PolynomialArr[(i12 - i11) - 1].setBit((i12 - i10) - 1);
                    }
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    public void computeFieldPolynomial() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public void computeFieldPolynomial2() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public int[] getPc() throws RuntimeException {
        if (!this.isPentanomial) {
            olk0.m168132a();
            return null;
        }
        int[] iArr = new int[3];
        System.arraycopy(this.f207921pc, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        int degree3 = gF2nPolynomial.getDegree();
        while (degree3 > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i = 1; i <= this.mDegree - 1; i++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gF2nPolynomialGcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gF2nPolynomialGcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gF2nPolynomialGcd) : new GF2nPolynomial(gF2nPolynomialGcd);
            degree3 = gF2nPolynomial.getDegree();
        }
        return gF2nPolynomial.m222478at(0);
    }

    public GF2Polynomial getSquaringVector(int i) {
        return new GF2Polynomial(this.squaringMatrix[i]);
    }

    public int getTc() throws RuntimeException {
        if (this.isTrinomial) {
            return this.f207922tc;
        }
        olk0.m168132a();
        return 0;
    }

    public boolean isPentanomial() {
        return this.isPentanomial;
    }

    public boolean isTrinomial() {
        return this.isTrinomial;
    }

    public GF2nPolynomialField(int i, SecureRandom secureRandom, boolean z) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f207921pc = new int[3];
        if (i >= 3) {
            this.mDegree = i;
            if (z) {
                computeFieldPolynomial();
            } else {
                computeFieldPolynomial2();
            }
            computeSquaringMatrix();
            this.fields = new java.util.Vector();
            this.matrices = new java.util.Vector();
            return;
        }
        wg3.m206174a("k must be at least 3");
        throw null;
    }

    public GF2nPolynomialField(int i, SecureRandom secureRandom) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f207921pc = new int[3];
        if (i >= 3) {
            this.mDegree = i;
            computeFieldPolynomial();
            computeSquaringMatrix();
            this.fields = new java.util.Vector();
            this.matrices = new java.util.Vector();
            return;
        }
        wg3.m206174a("k must be at least 3");
        throw null;
    }
}
