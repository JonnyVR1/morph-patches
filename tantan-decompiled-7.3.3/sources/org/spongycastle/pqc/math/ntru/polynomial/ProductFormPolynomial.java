package org.spongycastle.pqc.math.ntru.polynomial;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ProductFormPolynomial implements Polynomial {

    /* JADX INFO: renamed from: f1 */
    private SparseTernaryPolynomial f207933f1;

    /* JADX INFO: renamed from: f2 */
    private SparseTernaryPolynomial f207934f2;

    /* JADX INFO: renamed from: f3 */
    private SparseTernaryPolynomial f207935f3;

    public ProductFormPolynomial(SparseTernaryPolynomial sparseTernaryPolynomial, SparseTernaryPolynomial sparseTernaryPolynomial2, SparseTernaryPolynomial sparseTernaryPolynomial3) {
        this.f207933f1 = sparseTernaryPolynomial;
        this.f207934f2 = sparseTernaryPolynomial2;
        this.f207935f3 = sparseTernaryPolynomial3;
    }

    public static ProductFormPolynomial fromBinary(InputStream inputStream, int i, int i2, int i3, int i4, int i5) throws IOException {
        return new ProductFormPolynomial(SparseTernaryPolynomial.fromBinary(inputStream, i, i2, i2), SparseTernaryPolynomial.fromBinary(inputStream, i, i3, i3), SparseTernaryPolynomial.fromBinary(inputStream, i, i4, i5));
    }

    public static ProductFormPolynomial generateRandom(int i, int i2, int i3, int i4, int i5, SecureRandom secureRandom) {
        return new ProductFormPolynomial(SparseTernaryPolynomial.generateRandom(i, i2, i2, secureRandom), SparseTernaryPolynomial.generateRandom(i, i3, i3, secureRandom), SparseTernaryPolynomial.generateRandom(i, i4, i5, secureRandom));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductFormPolynomial productFormPolynomial = (ProductFormPolynomial) obj;
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f207933f1;
        SparseTernaryPolynomial sparseTernaryPolynomial2 = productFormPolynomial.f207933f1;
        if (sparseTernaryPolynomial == null) {
            if (sparseTernaryPolynomial2 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial.equals(sparseTernaryPolynomial2)) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f207934f2;
        SparseTernaryPolynomial sparseTernaryPolynomial4 = productFormPolynomial.f207934f2;
        if (sparseTernaryPolynomial3 == null) {
            if (sparseTernaryPolynomial4 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial3.equals(sparseTernaryPolynomial4)) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial5 = this.f207935f3;
        SparseTernaryPolynomial sparseTernaryPolynomial6 = productFormPolynomial.f207935f3;
        if (sparseTernaryPolynomial5 == null) {
            if (sparseTernaryPolynomial6 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial5.equals(sparseTernaryPolynomial6)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f207933f1;
        int iHashCode = ((sparseTernaryPolynomial == null ? 0 : sparseTernaryPolynomial.hashCode()) + 31) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f207934f2;
        int iHashCode2 = (iHashCode + (sparseTernaryPolynomial2 == null ? 0 : sparseTernaryPolynomial2.hashCode())) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f207935f3;
        return iHashCode2 + (sparseTernaryPolynomial3 != null ? sparseTernaryPolynomial3.hashCode() : 0);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        IntegerPolynomial integerPolynomialMult = this.f207934f2.mult(this.f207933f1.mult(integerPolynomial));
        integerPolynomialMult.add(this.f207935f3.mult(integerPolynomial));
        return integerPolynomialMult;
    }

    public byte[] toBinary() {
        byte[] binary = this.f207933f1.toBinary();
        byte[] binary2 = this.f207934f2.toBinary();
        byte[] binary3 = this.f207935f3.toBinary();
        byte[] bArrCopyOf = Arrays.copyOf(binary, binary.length + binary2.length + binary3.length);
        System.arraycopy(binary2, 0, bArrCopyOf, binary.length, binary2.length);
        System.arraycopy(binary3, 0, bArrCopyOf, binary.length + binary2.length, binary3.length);
        return bArrCopyOf;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        IntegerPolynomial integerPolynomialMult = this.f207933f1.mult(this.f207934f2.toIntegerPolynomial());
        integerPolynomialMult.add(this.f207935f3.toIntegerPolynomial());
        return integerPolynomialMult;
    }

    public static ProductFormPolynomial fromBinary(byte[] bArr, int i, int i2, int i3, int i4, int i5) throws IOException {
        return fromBinary(new ByteArrayInputStream(bArr), i, i2, i3, i4, i5);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigIntPolynomial bigIntPolynomialMult = this.f207934f2.mult(this.f207933f1.mult(bigIntPolynomial));
        bigIntPolynomialMult.add(this.f207935f3.mult(bigIntPolynomial));
        return bigIntPolynomialMult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i);
        return integerPolynomialMult;
    }
}
