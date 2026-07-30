package org.spongycastle.pqc.crypto.ntru;

import java.nio.ByteBuffer;
import l.qkq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUSigner {
    private Digest hashAlg;
    private NTRUSigningParameters params;
    private NTRUSigningPrivateKeyParameters signingKeyPair;
    private NTRUSigningPublicKeyParameters verificationKey;

    public NTRUSigner(NTRUSigningParameters nTRUSigningParameters) {
        this.params = nTRUSigningParameters;
    }

    private IntegerPolynomial sign(IntegerPolynomial integerPolynomial, NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i = nTRUSigningParameters.f10598N;
        int i2 = nTRUSigningParameters.f10603q;
        NTRUSigningPublicKeyParameters publicKey = nTRUSigningPrivateKeyParameters.getPublicKey();
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i);
        for (int i3 = nTRUSigningParameters.f10597B; i3 >= 1; i3--) {
            Polynomial polynomial = nTRUSigningPrivateKeyParameters.getBasis(i3).f10604f;
            Polynomial polynomial2 = nTRUSigningPrivateKeyParameters.getBasis(i3).fPrime;
            IntegerPolynomial integerPolynomialMult = polynomial.mult(integerPolynomial);
            integerPolynomialMult.div(i2);
            IntegerPolynomial integerPolynomialMult2 = polynomial2.mult(integerPolynomialMult);
            IntegerPolynomial integerPolynomialMult3 = polynomial2.mult(integerPolynomial);
            integerPolynomialMult3.div(i2);
            integerPolynomialMult2.sub(polynomial.mult(integerPolynomialMult3));
            integerPolynomial2.add(integerPolynomialMult2);
            IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) nTRUSigningPrivateKeyParameters.getBasis(i3).f10605h.clone();
            if (i3 > 1) {
                integerPolynomial3.sub(nTRUSigningPrivateKeyParameters.getBasis(i3 - 1).f10605h);
            } else {
                integerPolynomial3.sub(publicKey.f10606h);
            }
            integerPolynomial = integerPolynomialMult2.mult(integerPolynomial3, i2);
        }
        Polynomial polynomial3 = nTRUSigningPrivateKeyParameters.getBasis(0).f10604f;
        Polynomial polynomial4 = nTRUSigningPrivateKeyParameters.getBasis(0).fPrime;
        IntegerPolynomial integerPolynomialMult4 = polynomial3.mult(integerPolynomial);
        integerPolynomialMult4.div(i2);
        IntegerPolynomial integerPolynomialMult5 = polynomial4.mult(integerPolynomialMult4);
        IntegerPolynomial integerPolynomialMult6 = polynomial4.mult(integerPolynomial);
        integerPolynomialMult6.div(i2);
        integerPolynomialMult5.sub(polynomial3.mult(integerPolynomialMult6));
        integerPolynomial2.add(integerPolynomialMult5);
        integerPolynomial2.modPositive(i2);
        return integerPolynomial2;
    }

    private byte[] signHash(byte[] bArr, NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters) {
        IntegerPolynomial integerPolynomialCreateMsgRep;
        IntegerPolynomial integerPolynomialSign;
        NTRUSigningPublicKeyParameters publicKey = nTRUSigningPrivateKeyParameters.getPublicKey();
        int i = 0;
        do {
            i++;
            if (i > this.params.signFailTolerance) {
                throw new IllegalStateException("Signing failed: too many retries (max=" + this.params.signFailTolerance + ")");
            }
            integerPolynomialCreateMsgRep = createMsgRep(bArr, i);
            integerPolynomialSign = sign(integerPolynomialCreateMsgRep, nTRUSigningPrivateKeyParameters);
        } while (!verify(integerPolynomialCreateMsgRep, integerPolynomialSign, publicKey.f10606h));
        byte[] binary = integerPolynomialSign.toBinary(this.params.f10603q);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(binary.length + 4);
        byteBufferAllocate.put(binary);
        byteBufferAllocate.putInt(i);
        return byteBufferAllocate.array();
    }

    private boolean verify(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i = nTRUSigningParameters.f10603q;
        double d = nTRUSigningParameters.normBoundSq;
        double d2 = nTRUSigningParameters.betaSq;
        IntegerPolynomial integerPolynomialMult = integerPolynomial3.mult(integerPolynomial2, i);
        integerPolynomialMult.sub(integerPolynomial);
        return ((double) ((long) (((double) integerPolynomial2.centeredNormSq(i)) + (d2 * ((double) integerPolynomialMult.centeredNormSq(i)))))) <= d;
    }

    private boolean verifyHash(byte[] bArr, byte[] bArr2, NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byte[] bArr3 = new byte[bArr2.length - 4];
        byteBufferWrap.get(bArr3);
        NTRUSigningParameters nTRUSigningParameters = this.params;
        return verify(createMsgRep(bArr, byteBufferWrap.getInt()), IntegerPolynomial.fromBinary(bArr3, nTRUSigningParameters.f10598N, nTRUSigningParameters.f10603q), nTRUSigningPublicKeyParameters.f10606h);
    }

    public IntegerPolynomial createMsgRep(byte[] bArr, int i) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i2 = nTRUSigningParameters.f10598N;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(nTRUSigningParameters.f10603q);
        int i3 = 31 - iNumberOfLeadingZeros;
        int i4 = (38 - iNumberOfLeadingZeros) / 8;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 4);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.putInt(i);
        NTRUSignerPrng nTRUSignerPrng = new NTRUSignerPrng(byteBufferAllocate.array(), this.params.hashAlg);
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArrNextBytes = nTRUSignerPrng.nextBytes(i4);
            int i6 = (i4 * 8) - i3;
            bArrNextBytes[bArrNextBytes.length - 1] = (byte) ((bArrNextBytes[bArrNextBytes.length - 1] >> i6) << i6);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.put(bArrNextBytes);
            byteBufferAllocate2.rewind();
            integerPolynomial.coeffs[i5] = Integer.reverseBytes(byteBufferAllocate2.getInt());
        }
        return integerPolynomial;
    }

    public byte[] generateSignature() {
        Digest digest = this.hashAlg;
        if (digest == null || this.signingKeyPair == null) {
            qkq0.a("Call initSign first!");
            return null;
        }
        byte[] bArr = new byte[digest.getDigestSize()];
        this.hashAlg.doFinal(bArr, 0);
        return signHash(bArr, this.signingKeyPair);
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (z) {
            this.signingKeyPair = (NTRUSigningPrivateKeyParameters) cipherParameters;
        } else {
            this.verificationKey = (NTRUSigningPublicKeyParameters) cipherParameters;
        }
        Digest digest = this.params.hashAlg;
        this.hashAlg = digest;
        digest.reset();
    }

    public void update(byte b) {
        Digest digest = this.hashAlg;
        if (digest != null) {
            digest.update(b);
        } else {
            qkq0.a("Call initSign or initVerify first!");
        }
    }

    public boolean verifySignature(byte[] bArr) {
        Digest digest = this.hashAlg;
        if (digest == null || this.verificationKey == null) {
            qkq0.a("Call initVerify first!");
            return false;
        }
        byte[] bArr2 = new byte[digest.getDigestSize()];
        this.hashAlg.doFinal(bArr2, 0);
        return verifyHash(bArr2, bArr, this.verificationKey);
    }

    public void update(byte[] bArr, int i, int i2) {
        Digest digest = this.hashAlg;
        if (digest != null) {
            digest.update(bArr, i, i2);
        } else {
            qkq0.a("Call initSign or initVerify first!");
        }
    }
}
