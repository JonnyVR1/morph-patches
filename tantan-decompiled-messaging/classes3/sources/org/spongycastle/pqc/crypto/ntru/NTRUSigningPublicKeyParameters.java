package org.spongycastle.pqc.crypto.ntru;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUSigningPublicKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: h */
    public IntegerPolynomial f10606h;
    private NTRUSigningParameters params;

    public NTRUSigningPublicKeyParameters(byte[] bArr, NTRUSigningParameters nTRUSigningParameters) {
        super(false);
        this.f10606h = IntegerPolynomial.fromBinary(bArr, nTRUSigningParameters.f10598N, nTRUSigningParameters.f10603q);
        this.params = nTRUSigningParameters;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = (NTRUSigningPublicKeyParameters) obj;
        IntegerPolynomial integerPolynomial = this.f10606h;
        IntegerPolynomial integerPolynomial2 = nTRUSigningPublicKeyParameters.f10606h;
        if (integerPolynomial == null) {
            if (integerPolynomial2 != null) {
                return false;
            }
        } else if (!integerPolynomial.equals(integerPolynomial2)) {
            return false;
        }
        NTRUSigningParameters nTRUSigningParameters = this.params;
        NTRUSigningParameters nTRUSigningParameters2 = nTRUSigningPublicKeyParameters.params;
        if (nTRUSigningParameters == null) {
            if (nTRUSigningParameters2 != null) {
                return false;
            }
        } else if (!nTRUSigningParameters.equals(nTRUSigningParameters2)) {
            return false;
        }
        return true;
    }

    public byte[] getEncoded() {
        return this.f10606h.toBinary(this.params.f10603q);
    }

    public int hashCode() {
        IntegerPolynomial integerPolynomial = this.f10606h;
        int iHashCode = ((integerPolynomial == null ? 0 : integerPolynomial.hashCode()) + 31) * 31;
        NTRUSigningParameters nTRUSigningParameters = this.params;
        return iHashCode + (nTRUSigningParameters != null ? nTRUSigningParameters.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUSigningPublicKeyParameters(IntegerPolynomial integerPolynomial, NTRUSigningParameters nTRUSigningParameters) {
        super(false);
        this.f10606h = integerPolynomial;
        this.params = nTRUSigningParameters;
    }

    public NTRUSigningPublicKeyParameters(InputStream inputStream, NTRUSigningParameters nTRUSigningParameters) throws IOException {
        super(false);
        this.f10606h = IntegerPolynomial.fromBinary(inputStream, nTRUSigningParameters.f10598N, nTRUSigningParameters.f10603q);
        this.params = nTRUSigningParameters;
    }
}
