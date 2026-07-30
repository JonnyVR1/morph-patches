package org.spongycastle.pqc.crypto.ntru;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;

/* JADX INFO: loaded from: classes3.dex */
public class NTRUEncryptionPublicKeyParameters extends NTRUEncryptionKeyParameters {

    /* JADX INFO: renamed from: h */
    public IntegerPolynomial f207884h;

    public NTRUEncryptionPublicKeyParameters(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(false, nTRUEncryptionParameters);
        this.f207884h = IntegerPolynomial.fromBinary(bArr, nTRUEncryptionParameters.f207874N, nTRUEncryptionParameters.f207880q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUEncryptionPublicKeyParameters)) {
            return false;
        }
        NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters = (NTRUEncryptionPublicKeyParameters) obj;
        IntegerPolynomial integerPolynomial = this.f207884h;
        IntegerPolynomial integerPolynomial2 = nTRUEncryptionPublicKeyParameters.f207884h;
        if (integerPolynomial == null) {
            if (integerPolynomial2 != null) {
                return false;
            }
        } else if (!integerPolynomial.equals(integerPolynomial2)) {
            return false;
        }
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        NTRUEncryptionParameters nTRUEncryptionParameters2 = nTRUEncryptionPublicKeyParameters.params;
        if (nTRUEncryptionParameters == null) {
            if (nTRUEncryptionParameters2 != null) {
                return false;
            }
        } else if (!nTRUEncryptionParameters.equals(nTRUEncryptionParameters2)) {
            return false;
        }
        return true;
    }

    public byte[] getEncoded() {
        return this.f207884h.toBinary(this.params.f207880q);
    }

    public int hashCode() {
        IntegerPolynomial integerPolynomial = this.f207884h;
        int iHashCode = ((integerPolynomial == null ? 0 : integerPolynomial.hashCode()) + 31) * 31;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        return iHashCode + (nTRUEncryptionParameters != null ? nTRUEncryptionParameters.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUEncryptionPublicKeyParameters(IntegerPolynomial integerPolynomial, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(false, nTRUEncryptionParameters);
        this.f207884h = integerPolynomial;
    }

    public NTRUEncryptionPublicKeyParameters(InputStream inputStream, NTRUEncryptionParameters nTRUEncryptionParameters) throws IOException {
        super(false, nTRUEncryptionParameters);
        this.f207884h = IntegerPolynomial.fromBinary(inputStream, nTRUEncryptionParameters.f207874N, nTRUEncryptionParameters.f207880q);
    }
}
