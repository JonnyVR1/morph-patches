package org.spongycastle.pqc.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUEncryptionPrivateKeyParameters extends NTRUEncryptionKeyParameters {

    /* JADX INFO: renamed from: fp */
    public IntegerPolynomial f10584fp;

    /* JADX INFO: renamed from: h */
    public IntegerPolynomial f10585h;

    /* JADX INFO: renamed from: t */
    public Polynomial f10586t;

    public NTRUEncryptionPrivateKeyParameters(InputStream inputStream, NTRUEncryptionParameters nTRUEncryptionParameters) throws IOException {
        super(true, nTRUEncryptionParameters);
        int i = nTRUEncryptionParameters.polyType;
        int i2 = nTRUEncryptionParameters.f10577N;
        if (i == 1) {
            int i3 = nTRUEncryptionParameters.df1;
            int i4 = nTRUEncryptionParameters.df2;
            int i5 = nTRUEncryptionParameters.df3;
            int i6 = nTRUEncryptionParameters.fastFp ? i5 : i5 - 1;
            this.f10585h = IntegerPolynomial.fromBinary(inputStream, i2, nTRUEncryptionParameters.f10583q);
            this.f10586t = ProductFormPolynomial.fromBinary(inputStream, i2, i3, i4, i5, i6);
        } else {
            this.f10585h = IntegerPolynomial.fromBinary(inputStream, i2, nTRUEncryptionParameters.f10583q);
            IntegerPolynomial integerPolynomialFromBinary3Tight = IntegerPolynomial.fromBinary3Tight(inputStream, nTRUEncryptionParameters.f10577N);
            this.f10586t = nTRUEncryptionParameters.sparse ? new SparseTernaryPolynomial(integerPolynomialFromBinary3Tight) : new DenseTernaryPolynomial(integerPolynomialFromBinary3Tight);
        }
        init();
    }

    private void init() {
        if (!this.params.fastFp) {
            this.f10584fp = this.f10586t.toIntegerPolynomial().invertF3();
            return;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(this.params.f10577N);
        this.f10584fp = integerPolynomial;
        integerPolynomial.coeffs[0] = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUEncryptionPrivateKeyParameters)) {
            return false;
        }
        NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) obj;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        NTRUEncryptionParameters nTRUEncryptionParameters2 = nTRUEncryptionPrivateKeyParameters.params;
        if (nTRUEncryptionParameters == null) {
            if (nTRUEncryptionParameters2 != null) {
                return false;
            }
        } else if (!nTRUEncryptionParameters.equals(nTRUEncryptionParameters2)) {
            return false;
        }
        Polynomial polynomial = this.f10586t;
        Polynomial polynomial2 = nTRUEncryptionPrivateKeyParameters.f10586t;
        if (polynomial == null) {
            if (polynomial2 != null) {
                return false;
            }
        } else if (!polynomial.equals(polynomial2)) {
            return false;
        }
        return this.f10585h.equals(nTRUEncryptionPrivateKeyParameters.f10585h);
    }

    public byte[] getEncoded() {
        byte[] binary = this.f10585h.toBinary(this.params.f10583q);
        Polynomial polynomial = this.f10586t;
        byte[] binary2 = polynomial instanceof ProductFormPolynomial ? ((ProductFormPolynomial) polynomial).toBinary() : polynomial.toIntegerPolynomial().toBinary3Tight();
        byte[] bArr = new byte[binary.length + binary2.length];
        System.arraycopy(binary, 0, bArr, 0, binary.length);
        System.arraycopy(binary2, 0, bArr, binary.length, binary2.length);
        return bArr;
    }

    public int hashCode() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int iHashCode = ((nTRUEncryptionParameters == null ? 0 : nTRUEncryptionParameters.hashCode()) + 31) * 31;
        Polynomial polynomial = this.f10586t;
        int iHashCode2 = (iHashCode + (polynomial == null ? 0 : polynomial.hashCode())) * 31;
        IntegerPolynomial integerPolynomial = this.f10585h;
        return iHashCode2 + (integerPolynomial != null ? integerPolynomial.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUEncryptionPrivateKeyParameters(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) throws IOException {
        this(new ByteArrayInputStream(bArr), nTRUEncryptionParameters);
    }

    public NTRUEncryptionPrivateKeyParameters(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(true, nTRUEncryptionParameters);
        this.f10585h = integerPolynomial;
        this.f10586t = polynomial;
        this.f10584fp = integerPolynomial2;
    }
}
