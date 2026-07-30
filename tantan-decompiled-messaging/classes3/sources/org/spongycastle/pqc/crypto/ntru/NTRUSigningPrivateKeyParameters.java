package org.spongycastle.pqc.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUSigningPrivateKeyParameters extends AsymmetricKeyParameter {
    private List<Basis> bases;
    private NTRUSigningPublicKeyParameters publicKey;

    public NTRUSigningPrivateKeyParameters(InputStream inputStream, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) throws IOException {
        super(true);
        this.bases = new ArrayList();
        int i = 0;
        while (i <= nTRUSigningKeyGenerationParameters.f10588B) {
            add(new Basis(inputStream, nTRUSigningKeyGenerationParameters, i != 0));
            i++;
        }
        this.publicKey = new NTRUSigningPublicKeyParameters(inputStream, nTRUSigningKeyGenerationParameters.getSigningParameters());
    }

    private void add(Basis basis) {
        this.bases.add(basis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = (NTRUSigningPrivateKeyParameters) obj;
        List<Basis> list = this.bases;
        if ((list == null) != (nTRUSigningPrivateKeyParameters.bases == null)) {
            return false;
        }
        if (list == null) {
            return true;
        }
        if (list.size() != nTRUSigningPrivateKeyParameters.bases.size()) {
            return false;
        }
        for (int i = 0; i < this.bases.size(); i++) {
            Basis basis = this.bases.get(i);
            Basis basis2 = nTRUSigningPrivateKeyParameters.bases.get(i);
            if (!basis.f10604f.equals(basis2.f10604f) || !basis.fPrime.equals(basis2.fPrime)) {
                return false;
            }
            if ((i != 0 && !basis.f10605h.equals(basis2.f10605h)) || !basis.params.equals(basis2.params)) {
                return false;
            }
        }
        return true;
    }

    public Basis getBasis(int i) {
        return this.bases.get(i);
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < this.bases.size()) {
            this.bases.get(i).encode(byteArrayOutputStream, i != 0);
            i++;
        }
        byteArrayOutputStream.write(this.publicKey.getEncoded());
        return byteArrayOutputStream.toByteArray();
    }

    public NTRUSigningPublicKeyParameters getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        List<Basis> list = this.bases;
        if (list == null) {
            return 31;
        }
        int iHashCode = 31 + list.hashCode();
        Iterator<Basis> it = this.bases.iterator();
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUSigningPrivateKeyParameters(byte[] bArr, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) throws IOException {
        this(new ByteArrayInputStream(bArr), nTRUSigningKeyGenerationParameters);
    }

    public NTRUSigningPrivateKeyParameters(List<Basis> list, NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters) {
        super(true);
        this.bases = new ArrayList(list);
        this.publicKey = nTRUSigningPublicKeyParameters;
    }

    public static class Basis {

        /* JADX INFO: renamed from: f */
        public Polynomial f10604f;
        public Polynomial fPrime;

        /* JADX INFO: renamed from: h */
        public IntegerPolynomial f10605h;
        NTRUSigningKeyGenerationParameters params;

        public Basis(InputStream inputStream, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters, boolean z) throws IOException {
            int i;
            InputStream inputStream2;
            InputStream inputStream3;
            int i2;
            int i3 = nTRUSigningKeyGenerationParameters.f10589N;
            int i4 = nTRUSigningKeyGenerationParameters.f10594q;
            int i5 = nTRUSigningKeyGenerationParameters.f10591d1;
            int i6 = nTRUSigningKeyGenerationParameters.f10592d2;
            int i7 = nTRUSigningKeyGenerationParameters.f10593d3;
            boolean z2 = nTRUSigningKeyGenerationParameters.sparse;
            this.params = nTRUSigningKeyGenerationParameters;
            if (nTRUSigningKeyGenerationParameters.polyType == 1) {
                ProductFormPolynomial productFormPolynomialFromBinary = ProductFormPolynomial.fromBinary(inputStream, i3, i5, i6, i7 + 1, i7);
                i = i3;
                inputStream2 = inputStream;
                this.f10604f = productFormPolynomialFromBinary;
            } else {
                i = i3;
                inputStream2 = inputStream;
                IntegerPolynomial integerPolynomialFromBinary3Tight = IntegerPolynomial.fromBinary3Tight(inputStream2, i);
                this.f10604f = z2 ? new SparseTernaryPolynomial(integerPolynomialFromBinary3Tight) : new DenseTernaryPolynomial(integerPolynomialFromBinary3Tight);
            }
            if (nTRUSigningKeyGenerationParameters.basisType == 0) {
                IntegerPolynomial integerPolynomialFromBinary = IntegerPolynomial.fromBinary(inputStream2, i, i4);
                int i8 = 0;
                while (true) {
                    int[] iArr = integerPolynomialFromBinary.coeffs;
                    if (i8 >= iArr.length) {
                        break;
                    }
                    iArr[i8] = iArr[i8] - (i4 / 2);
                    i8++;
                }
                this.fPrime = integerPolynomialFromBinary;
                inputStream3 = inputStream2;
                i2 = i;
            } else if (nTRUSigningKeyGenerationParameters.polyType == 1) {
                inputStream3 = inputStream2;
                i2 = i;
                this.fPrime = ProductFormPolynomial.fromBinary(inputStream3, i2, i5, i6, i7 + 1, i7);
            } else {
                inputStream3 = inputStream2;
                i2 = i;
                this.fPrime = IntegerPolynomial.fromBinary3Tight(inputStream3, i2);
            }
            if (z) {
                this.f10605h = IntegerPolynomial.fromBinary(inputStream3, i2, i4);
            }
        }

        private byte[] getEncoded(Polynomial polynomial) {
            return polynomial instanceof ProductFormPolynomial ? ((ProductFormPolynomial) polynomial).toBinary() : polynomial.toIntegerPolynomial().toBinary3Tight();
        }

        public void encode(OutputStream outputStream, boolean z) throws IOException {
            int i = this.params.f10594q;
            outputStream.write(getEncoded(this.f10604f));
            int i2 = this.params.basisType;
            Polynomial polynomial = this.fPrime;
            if (i2 == 0) {
                IntegerPolynomial integerPolynomial = polynomial.toIntegerPolynomial();
                int i3 = 0;
                while (true) {
                    int[] iArr = integerPolynomial.coeffs;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    iArr[i3] = iArr[i3] + (i / 2);
                    i3++;
                }
                outputStream.write(integerPolynomial.toBinary(i));
            } else {
                outputStream.write(getEncoded(polynomial));
            }
            if (z) {
                outputStream.write(this.f10605h.toBinary(i));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Basis)) {
                return false;
            }
            Basis basis = (Basis) obj;
            Polynomial polynomial = this.f10604f;
            Polynomial polynomial2 = basis.f10604f;
            if (polynomial == null) {
                if (polynomial2 != null) {
                    return false;
                }
            } else if (!polynomial.equals(polynomial2)) {
                return false;
            }
            Polynomial polynomial3 = this.fPrime;
            Polynomial polynomial4 = basis.fPrime;
            if (polynomial3 == null) {
                if (polynomial4 != null) {
                    return false;
                }
            } else if (!polynomial3.equals(polynomial4)) {
                return false;
            }
            IntegerPolynomial integerPolynomial = this.f10605h;
            IntegerPolynomial integerPolynomial2 = basis.f10605h;
            if (integerPolynomial == null) {
                if (integerPolynomial2 != null) {
                    return false;
                }
            } else if (!integerPolynomial.equals(integerPolynomial2)) {
                return false;
            }
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters2 = basis.params;
            if (nTRUSigningKeyGenerationParameters == null) {
                if (nTRUSigningKeyGenerationParameters2 != null) {
                    return false;
                }
            } else if (!nTRUSigningKeyGenerationParameters.equals(nTRUSigningKeyGenerationParameters2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Polynomial polynomial = this.f10604f;
            int iHashCode = ((polynomial == null ? 0 : polynomial.hashCode()) + 31) * 31;
            Polynomial polynomial2 = this.fPrime;
            int iHashCode2 = (iHashCode + (polynomial2 == null ? 0 : polynomial2.hashCode())) * 31;
            IntegerPolynomial integerPolynomial = this.f10605h;
            int iHashCode3 = (iHashCode2 + (integerPolynomial == null ? 0 : integerPolynomial.hashCode())) * 31;
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            return iHashCode3 + (nTRUSigningKeyGenerationParameters != null ? nTRUSigningKeyGenerationParameters.hashCode() : 0);
        }

        public Basis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            this.f10604f = polynomial;
            this.fPrime = polynomial2;
            this.f10605h = integerPolynomial;
            this.params = nTRUSigningKeyGenerationParameters;
        }
    }
}
