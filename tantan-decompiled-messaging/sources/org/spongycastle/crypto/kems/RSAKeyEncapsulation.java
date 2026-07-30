package org.spongycastle.crypto.kems;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.KeyEncapsulation;
import org.spongycastle.crypto.params.KDFParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.BigIntegers;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyEncapsulation implements KeyEncapsulation {
    private DerivationFunction kdf;
    private RSAKeyParameters key;
    private SecureRandom rnd;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    public RSAKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
    }

    @Override // org.spongycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i, int i2, int i3) throws IllegalArgumentException {
        if (!this.key.isPrivate()) {
            ig3.m135964a("Private key required for decryption");
            return null;
        }
        BigInteger modulus = this.key.getModulus();
        BigInteger exponent = this.key.getExponent();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return generateKey(modulus, new BigInteger(1, bArr2).modPow(exponent, modulus), i3);
    }

    @Override // org.spongycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i, int i2) throws IllegalArgumentException {
        if (this.key.isPrivate()) {
            ig3.m135964a("Public key required for encryption");
            return null;
        }
        BigInteger modulus = this.key.getModulus();
        BigInteger exponent = this.key.getExponent();
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(ZERO, modulus.subtract(ONE), this.rnd);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray((modulus.bitLength() + 7) / 8, bigIntegerCreateRandomInRange.modPow(exponent, modulus));
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr, i, bArrAsUnsignedByteArray.length);
        return generateKey(modulus, bigIntegerCreateRandomInRange, i2);
    }

    public KeyParameter generateKey(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.kdf.init(new KDFParameters(BigIntegers.asUnsignedByteArray((bigInteger.bitLength() + 7) / 8, bigInteger2), null));
        byte[] bArr = new byte[i];
        this.kdf.generateBytes(bArr, 0, i);
        return new KeyParameter(bArr);
    }

    @Override // org.spongycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (cipherParameters instanceof RSAKeyParameters) {
            this.key = (RSAKeyParameters) cipherParameters;
        } else {
            ig3.m135964a("RSA key required");
        }
    }

    public CipherParameters decrypt(byte[] bArr, int i) {
        return decrypt(bArr, 0, bArr.length, i);
    }

    public CipherParameters encrypt(byte[] bArr, int i) {
        return encrypt(bArr, 0, i);
    }
}
