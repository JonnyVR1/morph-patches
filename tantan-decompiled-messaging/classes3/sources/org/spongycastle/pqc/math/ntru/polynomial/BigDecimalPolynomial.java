package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigDecimal;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BigDecimalPolynomial {
    BigDecimal[] coeffs;
    private static final BigDecimal ZERO = new BigDecimal("0");
    private static final BigDecimal ONE_HALF = new BigDecimal("0.5");

    public BigDecimalPolynomial(BigIntPolynomial bigIntPolynomial) {
        int length = bigIntPolynomial.coeffs.length;
        this.coeffs = new BigDecimal[length];
        for (int i = 0; i < length; i++) {
            this.coeffs[i] = new BigDecimal(bigIntPolynomial.coeffs[i]);
        }
    }

    private BigDecimal[] copyOf(BigDecimal[] bigDecimalArr, int i) {
        BigDecimal[] bigDecimalArr2 = new BigDecimal[i];
        if (bigDecimalArr.length < i) {
            i = bigDecimalArr.length;
        }
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, i);
        return bigDecimalArr2;
    }

    private BigDecimal[] copyOfRange(BigDecimal[] bigDecimalArr, int i, int i2) {
        int length = i2 - i;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[length];
        if (bigDecimalArr.length - i < length) {
            length = bigDecimalArr.length - i;
        }
        System.arraycopy(bigDecimalArr, i, bigDecimalArr2, 0, length);
        return bigDecimalArr2;
    }

    private BigDecimalPolynomial multRecursive(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr2.length;
        int i = 0;
        if (length <= 1) {
            BigDecimal[] bigDecimalArr3 = (BigDecimal[]) bigDecimalArr.clone();
            for (int i2 = 0; i2 < this.coeffs.length; i2++) {
                bigDecimalArr3[i2] = bigDecimalArr3[i2].multiply(bigDecimalPolynomial.coeffs[0]);
            }
            return new BigDecimalPolynomial(bigDecimalArr3);
        }
        int i3 = length / 2;
        BigDecimalPolynomial bigDecimalPolynomial2 = new BigDecimalPolynomial(copyOf(bigDecimalArr, i3));
        BigDecimalPolynomial bigDecimalPolynomial3 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr, i3, length));
        BigDecimalPolynomial bigDecimalPolynomial4 = new BigDecimalPolynomial(copyOf(bigDecimalArr2, i3));
        BigDecimalPolynomial bigDecimalPolynomial5 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr2, i3, length));
        BigDecimalPolynomial bigDecimalPolynomial6 = (BigDecimalPolynomial) bigDecimalPolynomial2.clone();
        bigDecimalPolynomial6.add(bigDecimalPolynomial3);
        BigDecimalPolynomial bigDecimalPolynomial7 = (BigDecimalPolynomial) bigDecimalPolynomial4.clone();
        bigDecimalPolynomial7.add(bigDecimalPolynomial5);
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive = bigDecimalPolynomial2.multRecursive(bigDecimalPolynomial4);
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive2 = bigDecimalPolynomial3.multRecursive(bigDecimalPolynomial5);
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive3 = bigDecimalPolynomial6.multRecursive(bigDecimalPolynomial7);
        bigDecimalPolynomialMultRecursive3.sub(bigDecimalPolynomialMultRecursive);
        bigDecimalPolynomialMultRecursive3.sub(bigDecimalPolynomialMultRecursive2);
        BigDecimalPolynomial bigDecimalPolynomial8 = new BigDecimalPolynomial((length * 2) - 1);
        int i4 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomialMultRecursive.coeffs;
            if (i4 >= bigDecimalArr4.length) {
                break;
            }
            bigDecimalPolynomial8.coeffs[i4] = bigDecimalArr4[i4];
            i4++;
        }
        int i5 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr5 = bigDecimalPolynomialMultRecursive3.coeffs;
            if (i5 >= bigDecimalArr5.length) {
                break;
            }
            BigDecimal[] bigDecimalArr6 = bigDecimalPolynomial8.coeffs;
            int i6 = i3 + i5;
            bigDecimalArr6[i6] = bigDecimalArr6[i6].add(bigDecimalArr5[i5]);
            i5++;
        }
        while (true) {
            BigDecimal[] bigDecimalArr7 = bigDecimalPolynomialMultRecursive2.coeffs;
            if (i >= bigDecimalArr7.length) {
                return bigDecimalPolynomial8;
            }
            BigDecimal[] bigDecimalArr8 = bigDecimalPolynomial8.coeffs;
            int i7 = (i3 * 2) + i;
            bigDecimalArr8[i7] = bigDecimalArr8[i7].add(bigDecimalArr7[i]);
            i++;
        }
    }

    public void add(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr.length;
        BigDecimal[] bigDecimalArr2 = this.coeffs;
        if (length > bigDecimalArr2.length) {
            int length2 = bigDecimalArr2.length;
            this.coeffs = copyOf(bigDecimalArr2, bigDecimalArr.length);
            while (true) {
                BigDecimal[] bigDecimalArr3 = this.coeffs;
                if (length2 >= bigDecimalArr3.length) {
                    break;
                }
                bigDecimalArr3[length2] = ZERO;
                length2++;
            }
        }
        int i = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomial.coeffs;
            if (i >= bigDecimalArr4.length) {
                return;
            }
            BigDecimal[] bigDecimalArr5 = this.coeffs;
            bigDecimalArr5[i] = bigDecimalArr5[i].add(bigDecimalArr4[i]);
            i++;
        }
    }

    public Object clone() {
        return new BigDecimalPolynomial((BigDecimal[]) this.coeffs.clone());
    }

    public BigDecimal[] getCoeffs() {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[bigDecimalArr.length];
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, bigDecimalArr.length);
        return bigDecimalArr2;
    }

    public void halve() {
        int i = 0;
        while (true) {
            BigDecimal[] bigDecimalArr = this.coeffs;
            if (i >= bigDecimalArr.length) {
                return;
            }
            bigDecimalArr[i] = bigDecimalArr[i].multiply(ONE_HALF);
            i++;
        }
    }

    public BigDecimalPolynomial mult(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr;
        int length = this.coeffs.length;
        if (bigDecimalPolynomial.coeffs.length != length) {
            ig3.a("Number of coefficients must be the same");
            return null;
        }
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive = multRecursive(bigDecimalPolynomial);
        if (bigDecimalPolynomialMultRecursive.coeffs.length > length) {
            int i = length;
            while (true) {
                bigDecimalArr = bigDecimalPolynomialMultRecursive.coeffs;
                if (i >= bigDecimalArr.length) {
                    break;
                }
                int i2 = i - length;
                bigDecimalArr[i2] = bigDecimalArr[i2].add(bigDecimalArr[i]);
                i++;
            }
            bigDecimalPolynomialMultRecursive.coeffs = copyOf(bigDecimalArr, length);
        }
        return bigDecimalPolynomialMultRecursive;
    }

    public BigIntPolynomial round() {
        int length = this.coeffs.length;
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(length);
        for (int i = 0; i < length; i++) {
            bigIntPolynomial.coeffs[i] = this.coeffs[i].setScale(0, 6).toBigInteger();
        }
        return bigIntPolynomial;
    }

    public void sub(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr.length;
        BigDecimal[] bigDecimalArr2 = this.coeffs;
        if (length > bigDecimalArr2.length) {
            int length2 = bigDecimalArr2.length;
            this.coeffs = copyOf(bigDecimalArr2, bigDecimalArr.length);
            while (true) {
                BigDecimal[] bigDecimalArr3 = this.coeffs;
                if (length2 >= bigDecimalArr3.length) {
                    break;
                }
                bigDecimalArr3[length2] = ZERO;
                length2++;
            }
        }
        int i = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomial.coeffs;
            if (i >= bigDecimalArr4.length) {
                return;
            }
            BigDecimal[] bigDecimalArr5 = this.coeffs;
            bigDecimalArr5[i] = bigDecimalArr5[i].subtract(bigDecimalArr4[i]);
            i++;
        }
    }

    public BigDecimalPolynomial(BigDecimal[] bigDecimalArr) {
        this.coeffs = bigDecimalArr;
    }

    public BigDecimalPolynomial(int i) {
        this.coeffs = new BigDecimal[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.coeffs[i2] = ZERO;
        }
    }

    public BigDecimalPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        return mult(new BigDecimalPolynomial(bigIntPolynomial));
    }
}
