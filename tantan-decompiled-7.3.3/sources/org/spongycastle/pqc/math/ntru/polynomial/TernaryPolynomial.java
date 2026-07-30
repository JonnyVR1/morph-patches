package org.spongycastle.pqc.math.ntru.polynomial;

/* JADX INFO: loaded from: classes3.dex */
public interface TernaryPolynomial extends Polynomial {
    void clear();

    int[] getNegOnes();

    int[] getOnes();

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    IntegerPolynomial mult(IntegerPolynomial integerPolynomial);

    int size();
}
