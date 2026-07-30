package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            wg3.m206174a("byte array is not an encoded finite field");
            throw null;
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = iOS2IP;
        if (PolynomialRingGF2.isIrreducible(iOS2IP)) {
            this.degree = PolynomialRingGF2.degree(this.polynomial);
        } else {
            wg3.m206174a("byte array is not an encoded finite field");
            throw null;
        }
    }

    private static String polyToString(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    public int add(int i, int i2) {
        return i ^ i2;
    }

    public String elementToStr(int i) {
        String strConcat = "";
        for (int i2 = 0; i2 < this.degree; i2++) {
            strConcat = (((byte) i) & 1) == 0 ? "0".concat(strConcat) : "1".concat(strConcat);
            i >>>= 1;
        }
        return strConcat;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = inverse(i);
            i2 = -i2;
        }
        int iMult = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                iMult = mult(iMult, i);
            }
            i = mult(i, i);
            i2 >>>= 1;
        }
        return iMult;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i = 0;
        while (iNextInt == 0 && i < 1048576) {
            iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i++;
        }
        if (i == 1048576) {
            return 1;
        }
        return iNextInt;
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i) {
        return exp(i, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i) {
        int i2 = this.degree;
        if (i2 == 31) {
            return i >= 0;
        }
        return i >= 0 && i < (1 << i2);
    }

    public int mult(int i, int i2) {
        return PolynomialRingGF2.modMultiply(i, i2, this.polynomial);
    }

    public int sqRoot(int i) {
        for (int i2 = 1; i2 < this.degree; i2++) {
            i = mult(i, i);
        }
        return i;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.degree + ") = GF(2)[X]/<" + polyToString(this.polynomial) + "> ";
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(new SecureRandom());
    }

    public GF2mField(int i, int i2) {
        this.degree = 0;
        if (i == PolynomialRingGF2.degree(i2)) {
            if (PolynomialRingGF2.isIrreducible(i2)) {
                this.degree = i;
                this.polynomial = i2;
                return;
            } else {
                wg3.m206174a(" Error: given polynomial is reducible");
                throw null;
            }
        }
        wg3.m206174a(" Error: the degree is not correct");
        throw null;
    }

    public GF2mField(int i) {
        this.degree = 0;
        if (i >= 32) {
            wg3.m206174a(" Error: the degree of field is too large ");
            throw null;
        }
        if (i >= 1) {
            this.degree = i;
            this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i);
        } else {
            wg3.m206174a(" Error: the degree of field is non-positive ");
            throw null;
        }
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }
}
