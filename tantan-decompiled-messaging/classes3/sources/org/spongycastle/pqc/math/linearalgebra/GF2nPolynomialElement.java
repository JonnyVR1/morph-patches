package org.spongycastle.pqc.math.linearalgebra;

import java.math.BigInteger;
import java.util.Random;
import l.ick0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GF2nPolynomialElement extends GF2nElement {
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, PKIFailureInfo.wrongIntegrity, PKIFailureInfo.certConfirmed, 8192, 16384, 32768, PKIFailureInfo.notAuthorized, PKIFailureInfo.unsupportedVersion, PKIFailureInfo.transactionIdInUse, PKIFailureInfo.signerNotTrusted, PKIFailureInfo.badCertTemplate, PKIFailureInfo.badSenderNonce, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, PKIFailureInfo.systemUnavail, 0};
    private GF2Polynomial polynomial;

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, byte[] bArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, bArr);
        this.polynomial = gF2Polynomial;
        gF2Polynomial.expandN(this.mDegree);
    }

    public static GF2nPolynomialElement ONE(GF2nPolynomialField gF2nPolynomialField) {
        return new GF2nPolynomialElement(gF2nPolynomialField, new GF2Polynomial(gF2nPolynomialField.getDegree(), new int[]{1}));
    }

    public static GF2nPolynomialElement ZERO(GF2nPolynomialField gF2nPolynomialField) {
        return new GF2nPolynomialElement(gF2nPolynomialField, new GF2Polynomial(gF2nPolynomialField.getDegree()));
    }

    private GF2Polynomial getGF2Polynomial() {
        return new GF2Polynomial(this.polynomial);
    }

    private GF2nPolynomialElement halfTrace() throws RuntimeException {
        if ((this.mDegree & 1) == 0) {
            ick0.a();
            return null;
        }
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        for (int i = 1; i <= ((this.mDegree - 1) >> 1); i++) {
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.addToThis(this);
        }
        return gF2nPolynomialElement;
    }

    private void randomize(Random random) {
        this.polynomial.expandN(this.mDegree);
        this.polynomial.randomize(random);
    }

    private void reducePentanomialBitwise(int[] iArr) {
        int i = this.mDegree;
        int i2 = i - iArr[2];
        int i3 = i - iArr[1];
        int i4 = i - iArr[0];
        int length = this.polynomial.getLength() - 1;
        while (true) {
            int i5 = this.mDegree;
            GF2Polynomial gF2Polynomial = this.polynomial;
            if (length < i5) {
                gF2Polynomial.reduceN();
                this.polynomial.expandN(this.mDegree);
                return;
            }
            if (gF2Polynomial.testBit(length)) {
                this.polynomial.xorBit(length);
                this.polynomial.xorBit(length - i2);
                this.polynomial.xorBit(length - i3);
                this.polynomial.xorBit(length - i4);
                this.polynomial.xorBit(length - this.mDegree);
            }
            length--;
        }
    }

    private void reduceThis() {
        if (this.polynomial.getLength() <= this.mDegree) {
            int length = this.polynomial.getLength();
            int i = this.mDegree;
            if (length < i) {
                this.polynomial.expandN(i);
                return;
            }
            return;
        }
        boolean zIsTrinomial = ((GF2nPolynomialField) this.mField).isTrinomial();
        GF2nField gF2nField = this.mField;
        if (zIsTrinomial) {
            try {
                int tc = ((GF2nPolynomialField) gF2nField).getTc();
                if (this.mDegree - tc > 32) {
                    int length2 = this.polynomial.getLength();
                    int i2 = this.mDegree;
                    if (length2 <= (i2 << 1)) {
                        this.polynomial.reduceTrinomial(i2, tc);
                        return;
                    }
                }
                reduceTrinomialBitwise(tc);
                return;
            } catch (RuntimeException unused) {
                upk0.m8197a("GF2nPolynomialElement.reduce: the field polynomial is not a trinomial");
                return;
            }
        }
        if (!((GF2nPolynomialField) gF2nField).isPentanomial()) {
            GF2Polynomial gF2PolynomialRemainder = this.polynomial.remainder(this.mField.getFieldPolynomial());
            this.polynomial = gF2PolynomialRemainder;
            gF2PolynomialRemainder.expandN(this.mDegree);
            return;
        }
        try {
            int[] pc = ((GF2nPolynomialField) this.mField).getPc();
            if (this.mDegree - pc[2] > 32) {
                int length3 = this.polynomial.getLength();
                int i3 = this.mDegree;
                if (length3 <= (i3 << 1)) {
                    this.polynomial.reducePentanomial(i3, pc);
                    return;
                }
            }
            reducePentanomialBitwise(pc);
        } catch (RuntimeException unused2) {
            upk0.m8197a("GF2nPolynomialElement.reduce: the field polynomial is not a pentanomial");
        }
    }

    private void reduceTrinomialBitwise(int i) {
        int i2 = this.mDegree - i;
        int length = this.polynomial.getLength();
        while (true) {
            length--;
            int i3 = this.mDegree;
            GF2Polynomial gF2Polynomial = this.polynomial;
            if (length < i3) {
                gF2Polynomial.reduceN();
                this.polynomial.expandN(this.mDegree);
                return;
            } else if (gF2Polynomial.testBit(length)) {
                this.polynomial.xorBit(length);
                this.polynomial.xorBit(length - i2);
                this.polynomial.xorBit(length - this.mDegree);
            }
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.addToThis(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nPolynomialElement)) {
            ick0.a();
            return;
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) gFElement;
        if (this.mField.equals(gF2nPolynomialElement.mField)) {
            this.polynomial.addToThis(gF2nPolynomialElement.polynomial);
        } else {
            ick0.a();
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void assignOne() {
        this.polynomial.assignOne();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.polynomial.assignZero();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement, org.spongycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nPolynomialElement(this);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nPolynomialElement)) {
            return false;
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) obj;
        GF2nField gF2nField = this.mField;
        if (gF2nField == gF2nPolynomialElement.mField || gF2nField.getFieldPolynomial().equals(gF2nPolynomialElement.mField.getFieldPolynomial())) {
            return this.polynomial.equals(gF2nPolynomialElement.polynomial);
        }
        return false;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.mField.hashCode() + this.polynomial.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.increaseThis();
        return gF2nPolynomialElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        this.polynomial.increaseThis();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        return invertMAIA();
    }

    public GF2nPolynomialElement invertEEA() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 32, "ONE");
        gF2Polynomial.reduceN();
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 32);
        gF2Polynomial2.reduceN();
        GF2Polynomial gF2Polynomial3 = getGF2Polynomial();
        GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        gF2Polynomial3.reduceN();
        while (!gF2Polynomial3.isOne()) {
            gF2Polynomial3.reduceN();
            fieldPolynomial.reduceN();
            int length = gF2Polynomial3.getLength() - fieldPolynomial.getLength();
            if (length < 0) {
                length = -length;
                gF2Polynomial.reduceN();
                GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                gF2Polynomial2 = gF2Polynomial;
                gF2Polynomial = gF2Polynomial4;
                GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                fieldPolynomial = gF2Polynomial3;
                gF2Polynomial3 = gF2Polynomial5;
            }
            gF2Polynomial3.shiftLeftAddThis(fieldPolynomial, length);
            gF2Polynomial.shiftLeftAddThis(gF2Polynomial2, length);
        }
        gF2Polynomial.reduceN();
        return new GF2nPolynomialElement((GF2nPolynomialField) this.mField, gF2Polynomial);
    }

    public GF2nPolynomialElement invertMAIA() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, "ONE");
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
        GF2Polynomial gF2Polynomial3 = getGF2Polynomial();
        GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        while (true) {
            if (!gF2Polynomial3.testBit(0)) {
                gF2Polynomial3.shiftRightThis();
                if (gF2Polynomial.testBit(0)) {
                    gF2Polynomial.addToThis(this.mField.getFieldPolynomial());
                    gF2Polynomial.shiftRightThis();
                } else {
                    gF2Polynomial.shiftRightThis();
                }
            } else {
                if (gF2Polynomial3.isOne()) {
                    return new GF2nPolynomialElement((GF2nPolynomialField) this.mField, gF2Polynomial);
                }
                gF2Polynomial3.reduceN();
                fieldPolynomial.reduceN();
                if (gF2Polynomial3.getLength() < fieldPolynomial.getLength()) {
                    GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                    gF2Polynomial2 = gF2Polynomial;
                    gF2Polynomial = gF2Polynomial4;
                    GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                    fieldPolynomial = gF2Polynomial3;
                    gF2Polynomial3 = gF2Polynomial5;
                }
                gF2Polynomial3.addToThis(fieldPolynomial);
                gF2Polynomial.addToThis(gF2Polynomial2);
            }
        }
    }

    public GF2nPolynomialElement invertSquare() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int degree = this.mField.getDegree() - 1;
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.polynomial.expandN((this.mDegree << 1) + 32);
        gF2nPolynomialElement.polynomial.reduceN();
        int i = 1;
        for (int iFloorLog = IntegerFunctions.floorLog(degree) - 1; iFloorLog >= 0; iFloorLog--) {
            GF2nPolynomialElement gF2nPolynomialElement2 = new GF2nPolynomialElement(gF2nPolynomialElement);
            for (int i2 = 1; i2 <= i; i2++) {
                gF2nPolynomialElement2.squareThisPreCalc();
            }
            gF2nPolynomialElement.multiplyThisBy(gF2nPolynomialElement2);
            i <<= 1;
            if ((bitMask[iFloorLog] & degree) != 0) {
                gF2nPolynomialElement.squareThisPreCalc();
                gF2nPolynomialElement.multiplyThisBy(this);
                i++;
            }
        }
        gF2nPolynomialElement.squareThisPreCalc();
        return gF2nPolynomialElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        return this.polynomial.isOne();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        return this.polynomial.isZero();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.multiplyThisBy(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nPolynomialElement)) {
            ick0.a();
            return;
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            ick0.a();
        } else if (equals(gFElement)) {
            squareThis();
        } else {
            this.polynomial = this.polynomial.multiply(gF2nPolynomialElement.polynomial);
            reduceThis();
        }
    }

    public GF2nPolynomialElement power(int i) {
        if (i == 1) {
            return new GF2nPolynomialElement(this);
        }
        GF2nPolynomialElement gF2nPolynomialElementONE = ONE((GF2nPolynomialField) this.mField);
        if (i != 0) {
            GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
            gF2nPolynomialElement.polynomial.expandN((gF2nPolynomialElement.mDegree << 1) + 32);
            gF2nPolynomialElement.polynomial.reduceN();
            for (int i2 = 0; i2 < this.mDegree; i2++) {
                if (((1 << i2) & i) != 0) {
                    gF2nPolynomialElementONE.multiplyThisBy(gF2nPolynomialElement);
                }
                gF2nPolynomialElement.square();
            }
        }
        return gF2nPolynomialElementONE;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        GF2nPolynomialElement gF2nPolynomialElementZERO;
        GF2nPolynomialElement gF2nPolynomialElement;
        if (isZero()) {
            return ZERO((GF2nPolynomialField) this.mField);
        }
        if ((this.mDegree & 1) == 1) {
            return halfTrace();
        }
        do {
            GF2nPolynomialElement gF2nPolynomialElement2 = new GF2nPolynomialElement((GF2nPolynomialField) this.mField, new Random());
            gF2nPolynomialElementZERO = ZERO((GF2nPolynomialField) this.mField);
            gF2nPolynomialElement = (GF2nPolynomialElement) gF2nPolynomialElement2.clone();
            for (int i = 1; i < this.mDegree; i++) {
                gF2nPolynomialElementZERO.squareThis();
                gF2nPolynomialElement.squareThis();
                gF2nPolynomialElementZERO.addToThis(gF2nPolynomialElement.multiply(this));
                gF2nPolynomialElement.addToThis(gF2nPolynomialElement2);
            }
        } while (gF2nPolynomialElement.isZero());
        if (equals(gF2nPolynomialElementZERO.square().add(gF2nPolynomialElementZERO))) {
            return gF2nPolynomialElementZERO;
        }
        ick0.a();
        return null;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        return squarePreCalc();
    }

    public GF2nPolynomialElement squareBitwise() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisBitwise();
        gF2nPolynomialElement.reduceThis();
        return gF2nPolynomialElement;
    }

    public GF2nPolynomialElement squareMatrix() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisMatrix();
        gF2nPolynomialElement.reduceThis();
        return gF2nPolynomialElement;
    }

    public GF2nPolynomialElement squarePreCalc() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisPreCalc();
        gF2nPolynomialElement.reduceThis();
        return gF2nPolynomialElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareRootThis();
        return gF2nPolynomialElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        this.polynomial.expandN((this.mDegree << 1) + 32);
        this.polynomial.reduceN();
        for (int i = 0; i < this.mField.getDegree() - 1; i++) {
            squareThis();
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        squareThisPreCalc();
    }

    public void squareThisBitwise() {
        this.polynomial.squareThisBitwise();
        reduceThis();
    }

    public void squareThisMatrix() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
        int i = 0;
        while (true) {
            int i2 = this.mDegree;
            if (i >= i2) {
                this.polynomial = gF2Polynomial;
                return;
            } else {
                if (this.polynomial.vectorMult(((GF2nPolynomialField) this.mField).squaringMatrix[(i2 - i) - 1])) {
                    gF2Polynomial.setBit(i);
                }
                i++;
            }
        }
    }

    public void squareThisPreCalc() {
        this.polynomial.squareThisPreCalc();
        reduceThis();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testBit(int i) {
        return this.polynomial.testBit(i);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return this.polynomial.testBit(0);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        return this.polynomial.toByteArray();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return this.polynomial.toFlexiBigInt();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return this.polynomial.toString(16);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        for (int i = 1; i < this.mDegree; i++) {
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.addToThis(this);
        }
        return gF2nPolynomialElement.isOne() ? 1 : 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i) {
        return this.polynomial.toString(i);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, GF2Polynomial gF2Polynomial) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
        this.polynomial = gF2Polynomial2;
        gF2Polynomial2.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, Random random) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        this.polynomial = new GF2Polynomial(this.mDegree);
        randomize(random);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, int[] iArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, iArr);
        this.polynomial = gF2Polynomial;
        gF2Polynomial.expandN(gF2nPolynomialField.mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialElement gF2nPolynomialElement) {
        this.mField = gF2nPolynomialElement.mField;
        this.mDegree = gF2nPolynomialElement.mDegree;
        this.polynomial = new GF2Polynomial(gF2nPolynomialElement.polynomial);
    }
}
