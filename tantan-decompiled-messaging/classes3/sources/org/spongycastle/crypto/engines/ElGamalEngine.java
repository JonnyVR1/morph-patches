package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ElGamalKeyParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.BigIntegers;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ElGamalEngine implements AsymmetricBlockCipher {
    private int bitSize;
    private boolean forEncryption;
    private ElGamalKeyParameters key;
    private SecureRandom random;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        boolean z = this.forEncryption;
        int i = this.bitSize;
        return z ? (i - 1) / 8 : ((i + 7) / 8) * 2;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        boolean z = this.forEncryption;
        int i = this.bitSize;
        return z ? ((i + 7) / 8) * 2 : (i - 1) / 8;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (ElGamalKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            this.key = (ElGamalKeyParameters) cipherParameters;
            this.random = new SecureRandom();
        }
        this.forEncryption = z;
        this.bitSize = this.key.getParameters().getP().bitLength();
        ElGamalKeyParameters elGamalKeyParameters = this.key;
        if (z) {
            if (elGamalKeyParameters instanceof ElGamalPublicKeyParameters) {
                return;
            }
            ig3.a("ElGamalPublicKeyParameters are required for encryption.");
        } else {
            if (elGamalKeyParameters instanceof ElGamalPrivateKeyParameters) {
                return;
            }
            ig3.a("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        if (this.key == null) {
            qkq0.a("ElGamal engine not initialised");
            return null;
        }
        if (i2 > (this.forEncryption ? (this.bitSize + 6) / 8 : getInputBlockSize())) {
            npk0.m6558a("input too large for ElGamal cipher.\n");
            return null;
        }
        BigInteger p = this.key.getParameters().getP();
        if (this.key instanceof ElGamalPrivateKeyParameters) {
            int i3 = i2 / 2;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            System.arraycopy(bArr, i + i3, bArr3, 0, i3);
            return BigIntegers.asUnsignedByteArray(new BigInteger(1, bArr2).modPow(p.subtract(ONE).subtract(((ElGamalPrivateKeyParameters) this.key).getX()), p).multiply(new BigInteger(1, bArr3)).mod(p));
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p) >= 0) {
            npk0.m6558a("input too large for ElGamal cipher.\n");
            return null;
        }
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) this.key;
        int iBitLength = p.bitLength();
        BigInteger bigInteger2 = new BigInteger(iBitLength, this.random);
        while (true) {
            if (!bigInteger2.equals(ZERO) && bigInteger2.compareTo(p.subtract(TWO)) <= 0) {
                break;
            }
            bigInteger2 = new BigInteger(iBitLength, this.random);
        }
        BigInteger bigIntegerModPow = this.key.getParameters().getG().modPow(bigInteger2, p);
        BigInteger bigIntegerMod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(bigInteger2, p)).mod(p);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i4 = outputBlockSize / 2;
        if (byteArray.length > i4) {
            System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i4) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        return bArr5;
    }
}
