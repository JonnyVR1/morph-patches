package org.spongycastle.pqc.math.linearalgebra;

import com.meituan.robust.Constants;
import java.security.SecureRandom;
import org.slf4j.Marker;
import p149l.ig3;
import p149l.lwm;

/* JADX INFO: loaded from: classes3.dex */
public class PolynomialGF2mSmallM {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';
    private int[] coefficients;
    private int degree;
    private GF2mField field;

    public PolynomialGF2mSmallM(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i = 8;
        int i2 = 1;
        while (gF2mField.getDegree() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            ig3.m135964a(" Error: byte array is not encoded polynomial over given finite field GF2m");
            throw null;
        }
        this.coefficients = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i3 >= iArr.length) {
                if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    computeDegree();
                    return;
                } else {
                    ig3.m135964a(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    throw null;
                }
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.coefficients;
                iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.field.isElementOfThisField(this.coefficients[i3])) {
                ig3.m135964a(" Error: byte array is not encoded polynomial over given finite field GF2m");
                throw null;
            }
            i3++;
        }
    }

    private int[] add(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.field.add(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private void computeDegree() {
        this.degree = this.coefficients.length - 1;
        while (true) {
            int i = this.degree;
            if (i < 0 || this.coefficients[i] != 0) {
                return;
            } else {
                this.degree = i - 1;
            }
        }
    }

    private int[] createRandomIrreduciblePolynomial(int i, SecureRandom secureRandom) {
        int[] iArr = new int[i + 1];
        iArr[i] = 1;
        iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
        for (int i2 = 1; i2 < i; i2++) {
            iArr[i2] = this.field.getRandomElement(secureRandom);
        }
        while (!isIrreducible(iArr)) {
            int iNextInt = RandUtils.nextInt(secureRandom, i);
            GF2mField gF2mField = this.field;
            if (iNextInt == 0) {
                iArr[0] = gF2mField.getRandomNonZeroElement(secureRandom);
            } else {
                iArr[iNextInt] = gF2mField.getRandomElement(secureRandom);
            }
        }
        return iArr;
    }

    private int[][] div(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr2);
        int iComputeDegree2 = computeDegree(iArr) + 1;
        if (iComputeDegree == -1) {
            lwm.m151979a("Division by zero.");
            return null;
        }
        int[][] iArr3 = {new int[1], new int[iComputeDegree2]};
        int iInverse = this.field.inverse(headCoefficient(iArr2));
        iArr3[0][0] = 0;
        int[] iArr4 = iArr3[1];
        System.arraycopy(iArr, 0, iArr4, 0, iArr4.length);
        while (iComputeDegree <= computeDegree(iArr3[1])) {
            int[] iArr5 = {this.field.mult(headCoefficient(iArr3[1]), iInverse)};
            int[] iArrMultWithElement = multWithElement(iArr2, iArr5[0]);
            int iComputeDegree3 = computeDegree(iArr3[1]) - iComputeDegree;
            int[] iArrMultWithMonomial = multWithMonomial(iArrMultWithElement, iComputeDegree3);
            iArr3[0] = add(multWithMonomial(iArr5, iComputeDegree3), iArr3[0]);
            iArr3[1] = add(iArrMultWithMonomial, iArr3[1]);
        }
        return iArr3;
    }

    private int[] gcd(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) == -1) {
            return iArr2;
        }
        while (computeDegree(iArr2) != -1) {
            int[] iArrMod = mod(iArr, iArr2);
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            int length2 = iArrMod.length;
            int[] iArr4 = new int[length2];
            System.arraycopy(iArrMod, 0, iArr4, 0, length2);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        return multWithElement(iArr, this.field.inverse(headCoefficient(iArr)));
    }

    private static int headCoefficient(int[] iArr) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return 0;
        }
        return iArr[iComputeDegree];
    }

    private static boolean isEqual(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree != computeDegree(iArr2)) {
            return false;
        }
        for (int i = 0; i <= iComputeDegree; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isIrreducible(int[] iArr) {
        if (iArr[0] == 0) {
            return false;
        }
        int iComputeDegree = computeDegree(iArr) >> 1;
        int[] iArrNormalForm = {0, 1};
        int[] iArr2 = {0, 1};
        int degree = this.field.getDegree();
        for (int i = 0; i < iComputeDegree; i++) {
            for (int i2 = degree - 1; i2 >= 0; i2--) {
                iArrNormalForm = modMultiply(iArrNormalForm, iArrNormalForm, iArr);
            }
            iArrNormalForm = normalForm(iArrNormalForm);
            if (computeDegree(gcd(add(iArrNormalForm, iArr2), iArr)) != 0) {
                return false;
            }
        }
        return true;
    }

    private int[] mod(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr2);
        if (iComputeDegree == -1) {
            lwm.m151979a("Division by zero");
            return null;
        }
        int length = iArr.length;
        int[] iArrAdd = new int[length];
        int iInverse = this.field.inverse(headCoefficient(iArr2));
        System.arraycopy(iArr, 0, iArrAdd, 0, length);
        while (iComputeDegree <= computeDegree(iArrAdd)) {
            iArrAdd = add(multWithElement(multWithMonomial(iArr2, computeDegree(iArrAdd) - iComputeDegree), this.field.mult(headCoefficient(iArrAdd), iInverse)), iArrAdd);
        }
        return iArrAdd;
    }

    private int[] modDiv(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrNormalForm = normalForm(iArr3);
        int[] iArrMod = mod(iArr2, iArr3);
        int[] iArrNormalForm2 = {0};
        int[] iArrMod2 = mod(iArr, iArr3);
        while (computeDegree(iArrMod) != -1) {
            int[][] iArrDiv = div(iArrNormalForm, iArrMod);
            int[] iArrNormalForm3 = normalForm(iArrMod);
            int[] iArrNormalForm4 = normalForm(iArrDiv[1]);
            int[] iArrAdd = add(iArrNormalForm2, modMultiply(iArrDiv[0], iArrMod2, iArr3));
            iArrNormalForm2 = normalForm(iArrMod2);
            iArrMod2 = normalForm(iArrAdd);
            iArrNormalForm = iArrNormalForm3;
            iArrMod = iArrNormalForm4;
        }
        return multWithElement(iArrNormalForm2, this.field.inverse(headCoefficient(iArrNormalForm)));
    }

    private int[] multWithElement(int[] iArr, int i) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[iComputeDegree + 1];
        while (iComputeDegree >= 0) {
            iArr2[iComputeDegree] = this.field.mult(iArr[iComputeDegree], i);
            iComputeDegree--;
        }
        return iArr2;
    }

    private static int[] multWithMonomial(int[] iArr, int i) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iComputeDegree + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, iComputeDegree + 1);
        return iArr2;
    }

    private int[] multiply(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) < computeDegree(iArr2)) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArrNormalForm = normalForm(iArr);
        int[] iArrNormalForm2 = normalForm(iArr2);
        if (iArrNormalForm2.length == 1) {
            return multWithElement(iArrNormalForm, iArrNormalForm2[0]);
        }
        int length = iArrNormalForm.length;
        int length2 = iArrNormalForm2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        if (length2 != length) {
            int[] iArr4 = new int[length2];
            int i = length - length2;
            int[] iArr5 = new int[i];
            System.arraycopy(iArrNormalForm, 0, iArr4, 0, length2);
            System.arraycopy(iArrNormalForm, length2, iArr5, 0, i);
            return add(multiply(iArr4, iArrNormalForm2), multWithMonomial(multiply(iArr5, iArrNormalForm2), length2));
        }
        int i2 = (length + 1) >>> 1;
        int i3 = length - i2;
        int[] iArr6 = new int[i2];
        int[] iArr7 = new int[i2];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        System.arraycopy(iArrNormalForm, 0, iArr6, 0, i2);
        System.arraycopy(iArrNormalForm, i2, iArr8, 0, i3);
        System.arraycopy(iArrNormalForm2, 0, iArr7, 0, i2);
        System.arraycopy(iArrNormalForm2, i2, iArr9, 0, i3);
        int[] iArrAdd = add(iArr6, iArr8);
        int[] iArrAdd2 = add(iArr7, iArr9);
        int[] iArrMultiply = multiply(iArr6, iArr7);
        int[] iArrMultiply2 = multiply(iArrAdd, iArrAdd2);
        int[] iArrMultiply3 = multiply(iArr8, iArr9);
        return add(multWithMonomial(add(add(add(iArrMultiply2, iArrMultiply), iArrMultiply3), multWithMonomial(iArrMultiply3, i2)), i2), iArrMultiply);
    }

    private static int[] normalForm(int[] iArr) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return new int[1];
        }
        int i = iComputeDegree + 1;
        if (iArr.length == i) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public PolynomialGF2mSmallM addMonomial(int i) {
        int[] iArr = new int[i + 1];
        iArr[i] = 1;
        return new PolynomialGF2mSmallM(this.field, add(this.coefficients, iArr));
    }

    public void addToThis(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.coefficients = add(this.coefficients, polynomialGF2mSmallM.coefficients);
        computeDegree();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PolynomialGF2mSmallM)) {
            PolynomialGF2mSmallM polynomialGF2mSmallM = (PolynomialGF2mSmallM) obj;
            if (this.field.equals(polynomialGF2mSmallM.field) && this.degree == polynomialGF2mSmallM.degree && isEqual(this.coefficients, polynomialGF2mSmallM.coefficients)) {
                return true;
            }
        }
        return false;
    }

    public int evaluateAt(int i) {
        int[] iArr = this.coefficients;
        int i2 = this.degree;
        int iMult = iArr[i2];
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            iMult = this.field.mult(iMult, i) ^ this.coefficients[i3];
        }
        return iMult;
    }

    public int getCoefficient(int i) {
        if (i < 0 || i > this.degree) {
            return 0;
        }
        return this.coefficients[i];
    }

    public int getDegree() {
        int[] iArr = this.coefficients;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] getEncoded() {
        int i = 8;
        int i2 = 1;
        while (this.field.getDegree() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.coefficients.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.coefficients.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.coefficients[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int getHeadCoefficient() {
        int i = this.degree;
        if (i == -1) {
            return 0;
        }
        return this.coefficients[i];
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i];
            i++;
        }
    }

    public PolynomialGF2mSmallM modInverse(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, modDiv(new int[]{1}, this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM modMultiply(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.field, modMultiply(this.coefficients, polynomialGF2mSmallM.coefficients, polynomialGF2mSmallM2.coefficients));
    }

    public PolynomialGF2mSmallM[] modPolynomialToFracton(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i = polynomialGF2mSmallM.degree >> 1;
        int[] iArrNormalForm = normalForm(polynomialGF2mSmallM.coefficients);
        int[] iArrMod = mod(this.coefficients, polynomialGF2mSmallM.coefficients);
        int[] iArr = {0};
        int[] iArr2 = {1};
        while (computeDegree(iArrMod) > i) {
            int[][] iArrDiv = div(iArrNormalForm, iArrMod);
            int[] iArr3 = iArrDiv[1];
            int[] iArrAdd = add(iArr, modMultiply(iArrDiv[0], iArr2, polynomialGF2mSmallM.coefficients));
            iArr = iArr2;
            iArr2 = iArrAdd;
            iArrNormalForm = iArrMod;
            iArrMod = iArr3;
        }
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(this.field, iArrMod), new PolynomialGF2mSmallM(this.field, iArr2)};
    }

    public PolynomialGF2mSmallM modSquareMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            int[] iArr3 = this.coefficients;
            if (i >= iArr3.length) {
                break;
            }
            GF2mField gF2mField = this.field;
            int i2 = iArr3[i];
            iArr2[i] = gF2mField.mult(i2, i2);
            i++;
        }
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                int[] iArr4 = polynomialGF2mSmallMArr[i4].coefficients;
                if (i3 < iArr4.length) {
                    iArr[i3] = this.field.add(iArr[i3], this.field.mult(iArr4[i3], iArr2[i4]));
                }
            }
        }
        return new PolynomialGF2mSmallM(this.field, iArr);
    }

    public PolynomialGF2mSmallM modSquareRoot(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[] iArrClone = IntUtils.clone(this.coefficients);
        int[] iArrModMultiply = modMultiply(iArrClone, iArrClone, polynomialGF2mSmallM.coefficients);
        while (!isEqual(iArrModMultiply, this.coefficients)) {
            iArrClone = normalForm(iArrModMultiply);
            iArrModMultiply = modMultiply(iArrClone, iArrClone, polynomialGF2mSmallM.coefficients);
        }
        return new PolynomialGF2mSmallM(this.field, iArrClone);
    }

    public PolynomialGF2mSmallM modSquareRootMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr2 = polynomialGF2mSmallMArr[i3].coefficients;
                if (i2 < iArr2.length) {
                    int[] iArr3 = this.coefficients;
                    if (i3 < iArr3.length) {
                        iArr[i2] = this.field.add(iArr[i2], this.field.mult(iArr2[i2], iArr3[i3]));
                    }
                }
            }
        }
        while (true) {
            GF2mField gF2mField = this.field;
            if (i >= length) {
                return new PolynomialGF2mSmallM(gF2mField, iArr);
            }
            iArr[i] = gF2mField.sqRoot(iArr[i]);
            i++;
        }
    }

    public void multThisWithElement(int i) {
        if (!this.field.isElementOfThisField(i)) {
            lwm.m151979a("Not an element of the finite field this polynomial is defined over.");
        } else {
            this.coefficients = multWithElement(this.coefficients, i);
            computeDegree();
        }
    }

    public String toString() {
        String str = " Polynomial over " + this.field.toString() + ": \n";
        for (int i = 0; i < this.coefficients.length; i++) {
            str = str + this.field.elementToStr(this.coefficients[i]) + "Y^" + i + Marker.ANY_NON_NULL_MARKER;
        }
        return str.concat(Constants.PACKNAME_END);
    }

    private int[] modMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        return mod(multiply(iArr, iArr2), iArr3);
    }

    public PolynomialGF2mSmallM multWithMonomial(int i) {
        return new PolynomialGF2mSmallM(this.field, multWithMonomial(this.coefficients, i));
    }

    private static int computeDegree(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public PolynomialGF2mSmallM multWithElement(int i) {
        if (this.field.isElementOfThisField(i)) {
            return new PolynomialGF2mSmallM(this.field, multWithElement(this.coefficients, i));
        }
        lwm.m151979a("Not an element of the finite field this polynomial is defined over.");
        return null;
    }

    public PolynomialGF2mSmallM add(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, add(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM gcd(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, gcd(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM mod(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, mod(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM modDiv(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.field, modDiv(this.coefficients, polynomialGF2mSmallM.coefficients, polynomialGF2mSmallM2.coefficients));
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i, char c, SecureRandom secureRandom) {
        this.field = gF2mField;
        if (c == 'I') {
            this.coefficients = createRandomIrreduciblePolynomial(i, secureRandom);
            computeDegree();
        } else {
            throw new IllegalArgumentException(" Error: type " + c + " is not defined for GF2smallmPolynomial");
        }
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i) {
        this.field = gF2mField;
        this.degree = i;
        int[] iArr = new int[i + 1];
        this.coefficients = iArr;
        iArr[i] = 1;
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.coefficients = normalForm(iArr);
        computeDegree();
    }

    public PolynomialGF2mSmallM[] div(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[][] iArrDiv = div(this.coefficients, polynomialGF2mSmallM.coefficients);
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(this.field, iArrDiv[0]), new PolynomialGF2mSmallM(this.field, iArrDiv[1])};
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField) {
        this.field = gF2mField;
        this.degree = -1;
        this.coefficients = new int[1];
    }

    public PolynomialGF2mSmallM(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.field = polynomialGF2mSmallM.field;
        this.degree = polynomialGF2mSmallM.degree;
        this.coefficients = IntUtils.clone(polynomialGF2mSmallM.coefficients);
    }

    public PolynomialGF2mSmallM(GF2mVector gF2mVector) {
        this(gF2mVector.getField(), gF2mVector.getIntArrayForm());
    }

    public PolynomialGF2mSmallM multiply(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, multiply(this.coefficients, polynomialGF2mSmallM.coefficients));
    }
}
