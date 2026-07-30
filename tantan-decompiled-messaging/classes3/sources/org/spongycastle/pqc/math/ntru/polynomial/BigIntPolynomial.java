package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import l.ig3;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BigIntPolynomial {
    private static final double LOG_10_2 = Math.log10(2.0d);
    BigInteger[] coeffs;

    public BigIntPolynomial(IntegerPolynomial integerPolynomial) {
        this.coeffs = new BigInteger[integerPolynomial.coeffs.length];
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i] = BigInteger.valueOf(integerPolynomial.coeffs[i]);
            i++;
        }
    }

    public static BigIntPolynomial generateRandomSmall(int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(Constants.BIGINT_ONE);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            arrayList.add(BigInteger.valueOf(-1L));
        }
        while (arrayList.size() < i) {
            arrayList.add(Constants.BIGINT_ZERO);
        }
        Collections.shuffle(arrayList, new SecureRandom());
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(i);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            bigIntPolynomial.coeffs[i6] = (BigInteger) arrayList.get(i6);
        }
        return bigIntPolynomial;
    }

    private BigInteger maxCoeffAbs() {
        BigInteger bigIntegerAbs = this.coeffs[0].abs();
        int i = 1;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i >= bigIntegerArr.length) {
                return bigIntegerAbs;
            }
            BigInteger bigIntegerAbs2 = bigIntegerArr[i].abs();
            if (bigIntegerAbs2.compareTo(bigIntegerAbs) > 0) {
                bigIntegerAbs = bigIntegerAbs2;
            }
            i++;
        }
    }

    private BigIntPolynomial multRecursive(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = this.coeffs;
        BigInteger[] bigIntegerArr2 = bigIntPolynomial.coeffs;
        int length = bigIntegerArr2.length;
        int i = 0;
        if (length <= 1) {
            BigInteger[] bigIntegerArrClone = Arrays.clone(bigIntegerArr);
            for (int i2 = 0; i2 < this.coeffs.length; i2++) {
                bigIntegerArrClone[i2] = bigIntegerArrClone[i2].multiply(bigIntPolynomial.coeffs[0]);
            }
            return new BigIntPolynomial(bigIntegerArrClone);
        }
        int i3 = length / 2;
        BigIntPolynomial bigIntPolynomial2 = new BigIntPolynomial(Arrays.copyOf(bigIntegerArr, i3));
        BigIntPolynomial bigIntPolynomial3 = new BigIntPolynomial(Arrays.copyOfRange(bigIntegerArr, i3, length));
        BigIntPolynomial bigIntPolynomial4 = new BigIntPolynomial(Arrays.copyOf(bigIntegerArr2, i3));
        BigIntPolynomial bigIntPolynomial5 = new BigIntPolynomial(Arrays.copyOfRange(bigIntegerArr2, i3, length));
        BigIntPolynomial bigIntPolynomial6 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial6.add(bigIntPolynomial3);
        BigIntPolynomial bigIntPolynomial7 = (BigIntPolynomial) bigIntPolynomial4.clone();
        bigIntPolynomial7.add(bigIntPolynomial5);
        BigIntPolynomial bigIntPolynomialMultRecursive = bigIntPolynomial2.multRecursive(bigIntPolynomial4);
        BigIntPolynomial bigIntPolynomialMultRecursive2 = bigIntPolynomial3.multRecursive(bigIntPolynomial5);
        BigIntPolynomial bigIntPolynomialMultRecursive3 = bigIntPolynomial6.multRecursive(bigIntPolynomial7);
        bigIntPolynomialMultRecursive3.sub(bigIntPolynomialMultRecursive);
        bigIntPolynomialMultRecursive3.sub(bigIntPolynomialMultRecursive2);
        BigIntPolynomial bigIntPolynomial8 = new BigIntPolynomial((length * 2) - 1);
        int i4 = 0;
        while (true) {
            BigInteger[] bigIntegerArr3 = bigIntPolynomialMultRecursive.coeffs;
            if (i4 >= bigIntegerArr3.length) {
                break;
            }
            bigIntPolynomial8.coeffs[i4] = bigIntegerArr3[i4];
            i4++;
        }
        int i5 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomialMultRecursive3.coeffs;
            if (i5 >= bigIntegerArr4.length) {
                break;
            }
            BigInteger[] bigIntegerArr5 = bigIntPolynomial8.coeffs;
            int i6 = i3 + i5;
            bigIntegerArr5[i6] = bigIntegerArr5[i6].add(bigIntegerArr4[i5]);
            i5++;
        }
        while (true) {
            BigInteger[] bigIntegerArr6 = bigIntPolynomialMultRecursive2.coeffs;
            if (i >= bigIntegerArr6.length) {
                return bigIntPolynomial8;
            }
            BigInteger[] bigIntegerArr7 = bigIntPolynomial8.coeffs;
            int i7 = (i3 * 2) + i;
            bigIntegerArr7[i7] = bigIntegerArr7[i7].add(bigIntegerArr6[i]);
            i++;
        }
    }

    public void add(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        BigInteger[] bigIntegerArr2 = this.coeffs;
        if (length > bigIntegerArr2.length) {
            int length2 = bigIntegerArr2.length;
            this.coeffs = Arrays.copyOf(bigIntegerArr2, bigIntegerArr.length);
            while (true) {
                BigInteger[] bigIntegerArr3 = this.coeffs;
                if (length2 >= bigIntegerArr3.length) {
                    break;
                }
                bigIntegerArr3[length2] = Constants.BIGINT_ZERO;
                length2++;
            }
        }
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomial.coeffs;
            if (i >= bigIntegerArr4.length) {
                return;
            }
            BigInteger[] bigIntegerArr5 = this.coeffs;
            bigIntegerArr5[i] = bigIntegerArr5[i].add(bigIntegerArr4[i]);
            i++;
        }
    }

    public Object clone() {
        return new BigIntPolynomial((BigInteger[]) this.coeffs.clone());
    }

    public void div(BigInteger bigInteger) {
        BigInteger bigIntegerDivide = bigInteger.add(Constants.BIGINT_ONE).divide(BigInteger.valueOf(2L));
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i >= bigIntegerArr.length) {
                return;
            }
            int iCompareTo = bigIntegerArr[i].compareTo(Constants.BIGINT_ZERO);
            BigInteger[] bigIntegerArr2 = this.coeffs;
            bigIntegerArr[i] = iCompareTo > 0 ? bigIntegerArr2[i].add(bigIntegerDivide) : bigIntegerArr2[i].add(bigIntegerDivide.negate());
            BigInteger[] bigIntegerArr3 = this.coeffs;
            bigIntegerArr3[i] = bigIntegerArr3[i].divide(bigInteger);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.areEqual(this.coeffs, ((BigIntPolynomial) obj).coeffs);
    }

    public BigInteger[] getCoeffs() {
        return Arrays.clone(this.coeffs);
    }

    public int getMaxCoeffLength() {
        return ((int) (((double) maxCoeffAbs().bitLength()) * LOG_10_2)) + 1;
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(this.coeffs);
    }

    public void mod(BigInteger bigInteger) {
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i] = bigIntegerArr[i].mod(bigInteger);
            i++;
        }
    }

    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr;
        int length = this.coeffs.length;
        if (bigIntPolynomial.coeffs.length != length) {
            ig3.a("Number of coefficients must be the same");
            return null;
        }
        BigIntPolynomial bigIntPolynomialMultRecursive = multRecursive(bigIntPolynomial);
        if (bigIntPolynomialMultRecursive.coeffs.length > length) {
            int i = length;
            while (true) {
                bigIntegerArr = bigIntPolynomialMultRecursive.coeffs;
                if (i >= bigIntegerArr.length) {
                    break;
                }
                int i2 = i - length;
                bigIntegerArr[i2] = bigIntegerArr[i2].add(bigIntegerArr[i]);
                i++;
            }
            bigIntPolynomialMultRecursive.coeffs = Arrays.copyOf(bigIntegerArr, length);
        }
        return bigIntPolynomialMultRecursive;
    }

    public void sub(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        BigInteger[] bigIntegerArr2 = this.coeffs;
        if (length > bigIntegerArr2.length) {
            int length2 = bigIntegerArr2.length;
            this.coeffs = Arrays.copyOf(bigIntegerArr2, bigIntegerArr.length);
            while (true) {
                BigInteger[] bigIntegerArr3 = this.coeffs;
                if (length2 >= bigIntegerArr3.length) {
                    break;
                }
                bigIntegerArr3[length2] = Constants.BIGINT_ZERO;
                length2++;
            }
        }
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomial.coeffs;
            if (i >= bigIntegerArr4.length) {
                return;
            }
            BigInteger[] bigIntegerArr5 = this.coeffs;
            bigIntegerArr5[i] = bigIntegerArr5[i].subtract(bigIntegerArr4[i]);
            i++;
        }
    }

    public BigInteger sumCoeffs() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i >= bigIntegerArr.length) {
                return bigIntegerAdd;
            }
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerArr[i]);
            i++;
        }
    }

    public BigIntPolynomial(BigInteger[] bigIntegerArr) {
        this.coeffs = bigIntegerArr;
    }

    public BigIntPolynomial(int i) {
        this.coeffs = new BigInteger[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.coeffs[i2] = Constants.BIGINT_ZERO;
        }
    }

    public void add(BigIntPolynomial bigIntPolynomial, BigInteger bigInteger) {
        add(bigIntPolynomial);
        mod(bigInteger);
    }

    public void mult(BigInteger bigInteger) {
        int i = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i] = bigIntegerArr[i].multiply(bigInteger);
            i++;
        }
    }

    public void mult(int i) {
        mult(BigInteger.valueOf(i));
    }

    public BigDecimalPolynomial div(BigDecimal bigDecimal, int i) {
        BigDecimal bigDecimalDivide = Constants.BIGDEC_ONE.divide(bigDecimal, ((int) (((double) maxCoeffAbs().bitLength()) * LOG_10_2)) + 1 + i + 1, 6);
        BigDecimalPolynomial bigDecimalPolynomial = new BigDecimalPolynomial(this.coeffs.length);
        for (int i2 = 0; i2 < this.coeffs.length; i2++) {
            bigDecimalPolynomial.coeffs[i2] = new BigDecimal(this.coeffs[i2]).multiply(bigDecimalDivide).setScale(i, 6);
        }
        return bigDecimalPolynomial;
    }
}
