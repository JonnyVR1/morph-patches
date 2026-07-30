package org.spongycastle.pqc.crypto.ntru;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial;
import org.spongycastle.util.Arrays;
import p149l.dql;
import p149l.ig3;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class NTRUEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NTRUEncryptionParameters params;
    private NTRUEncryptionPrivateKeyParameters privKey;
    private NTRUEncryptionPublicKeyParameters pubKey;
    private SecureRandom random;

    private IntegerPolynomial MGF(byte[] bArr, int i, int i2, boolean z) {
        Digest digest = this.params.hashAlg;
        int digestSize = digest.getDigestSize();
        byte[] bArrCalcHash = new byte[i2 * digestSize];
        if (z) {
            bArr = calcHash(digest, bArr);
        }
        int i3 = 0;
        while (i3 < i2) {
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i3);
            System.arraycopy(calcHash(digest), 0, bArrCalcHash, i3 * digestSize, digestSize);
            i3++;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i);
        loop1: while (true) {
            int i4 = 0;
            for (int i5 = 0; i5 != bArrCalcHash.length; i5++) {
                int i6 = bArrCalcHash[i5] & 255;
                if (i6 < 243) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr = integerPolynomial.coeffs;
                        if (i7 >= 4) {
                            iArr[i4] = i6 - 1;
                            i4++;
                            if (i4 != i) {
                                break;
                            }
                            break loop1;
                        }
                        int i8 = i6 % 3;
                        iArr[i4] = i8 - 1;
                        i4++;
                        if (i4 == i) {
                            break loop1;
                        }
                        i6 = (i6 - i8) / 3;
                        i7++;
                    }
                }
            }
            if (i4 >= i) {
                break;
            }
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i3);
            bArrCalcHash = calcHash(digest);
            i3++;
        }
        return integerPolynomial;
    }

    private byte[] buildSData(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[bArr.length + i + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    private byte[] calcHash(Digest digest, byte[] bArr) {
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] copyOf(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (i >= bArr.length) {
            i = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    private byte[] decrypt(byte[] bArr, NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters) throws InvalidCipherTextException {
        Polynomial polynomial = nTRUEncryptionPrivateKeyParameters.f206961t;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPrivateKeyParameters.f206959fp;
        IntegerPolynomial integerPolynomial2 = nTRUEncryptionPrivateKeyParameters.f206960h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i = nTRUEncryptionParameters.f206952N;
        int i2 = nTRUEncryptionParameters.f206958q;
        int i3 = nTRUEncryptionParameters.f206954db;
        int i4 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i5 = nTRUEncryptionParameters.dm0;
        int i6 = nTRUEncryptionParameters.pkLen;
        int i7 = nTRUEncryptionParameters.minCallsMask;
        boolean z = nTRUEncryptionParameters.hashSeed;
        byte[] bArr2 = nTRUEncryptionParameters.oid;
        if (i4 > 255) {
            npk0.m160508a("maxMsgLenBytes values bigger than 255 are not supported");
            return null;
        }
        int i8 = i3 / 8;
        IntegerPolynomial integerPolynomialFromBinary = IntegerPolynomial.fromBinary(bArr, i, i2);
        IntegerPolynomial integerPolynomialDecrypt = decrypt(integerPolynomialFromBinary, polynomial, integerPolynomial);
        if (integerPolynomialDecrypt.count(-1) < i5) {
            dql.m113082a("Less than dm0 coefficients equal -1");
            return null;
        }
        if (integerPolynomialDecrypt.count(0) < i5) {
            dql.m113082a("Less than dm0 coefficients equal 0");
            return null;
        }
        if (integerPolynomialDecrypt.count(1) < i5) {
            dql.m113082a("Less than dm0 coefficients equal 1");
            return null;
        }
        IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) integerPolynomialFromBinary.clone();
        integerPolynomial3.sub(integerPolynomialDecrypt);
        integerPolynomial3.modPositive(i2);
        IntegerPolynomial integerPolynomial4 = (IntegerPolynomial) integerPolynomial3.clone();
        integerPolynomial4.modPositive(4);
        integerPolynomialDecrypt.sub(MGF(integerPolynomial4.toBinary(4), i, i7, z));
        integerPolynomialDecrypt.mod3();
        byte[] binary3Sves = integerPolynomialDecrypt.toBinary3Sves();
        byte[] bArr3 = new byte[i8];
        System.arraycopy(binary3Sves, 0, bArr3, 0, i8);
        int i9 = binary3Sves[i8] & 255;
        if (i9 > i4) {
            throw new InvalidCipherTextException("Message too long: " + i9 + ">" + i4);
        }
        byte[] bArr4 = new byte[i9];
        int i10 = i8 + 1;
        System.arraycopy(binary3Sves, i10, bArr4, 0, i9);
        int i11 = i10 + i9;
        int length = binary3Sves.length - i11;
        byte[] bArr5 = new byte[length];
        System.arraycopy(binary3Sves, i11, bArr5, 0, length);
        if (!Arrays.constantTimeAreEqual(bArr5, new byte[length])) {
            dql.m113082a("The message is not followed by zeroes");
            return null;
        }
        IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr2, bArr4, i9, bArr3, copyOf(integerPolynomial2.toBinary(i2), i6 / 8)), bArr4).mult(integerPolynomial2);
        integerPolynomialMult.modPositive(i2);
        if (integerPolynomialMult.equals(integerPolynomial3)) {
            return bArr4;
        }
        dql.m113082a("Invalid message encoding");
        return null;
    }

    private byte[] encrypt(byte[] bArr, NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters) {
        byte[] bArr2 = bArr;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPublicKeyParameters.f206962h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i = nTRUEncryptionParameters.f206952N;
        int i2 = nTRUEncryptionParameters.f206958q;
        int i3 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i4 = nTRUEncryptionParameters.f206954db;
        int i5 = nTRUEncryptionParameters.bufferLenBits;
        int i6 = nTRUEncryptionParameters.dm0;
        int i7 = nTRUEncryptionParameters.pkLen;
        int i8 = nTRUEncryptionParameters.minCallsMask;
        boolean z = nTRUEncryptionParameters.hashSeed;
        byte[] bArr3 = nTRUEncryptionParameters.oid;
        int length = bArr2.length;
        if (i3 > 255) {
            ig3.m135964a("llen values bigger than 1 are not supported");
            return null;
        }
        if (length > i3) {
            throw new DataLengthException("Message too long: " + length + ">" + i3);
        }
        while (true) {
            int i9 = i4 / 8;
            byte[] bArr4 = new byte[i9];
            byte[] bArr5 = bArr3;
            this.random.nextBytes(bArr4);
            int i10 = (i3 + 1) - length;
            int i11 = i4;
            int i12 = i5;
            byte[] bArr6 = new byte[i12 / 8];
            int i13 = i7;
            System.arraycopy(bArr4, 0, bArr6, 0, i9);
            bArr6[i9] = (byte) length;
            int i14 = i9 + 1;
            System.arraycopy(bArr2, 0, bArr6, i14, bArr2.length);
            System.arraycopy(new byte[i10], 0, bArr6, i14 + bArr2.length, i10);
            IntegerPolynomial integerPolynomialFromBinary3Sves = IntegerPolynomial.fromBinary3Sves(bArr6, i);
            length = length;
            bArr3 = bArr5;
            IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr3, bArr2, length, bArr4, copyOf(integerPolynomial.toBinary(i2), i13 / 8)), bArr6).mult(integerPolynomial, i2);
            IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) integerPolynomialMult.clone();
            integerPolynomial2.modPositive(4);
            integerPolynomialFromBinary3Sves.add(MGF(integerPolynomial2.toBinary(4), i, i8, z));
            integerPolynomialFromBinary3Sves.mod3();
            if (integerPolynomialFromBinary3Sves.count(-1) >= i6 && integerPolynomialFromBinary3Sves.count(0) >= i6 && integerPolynomialFromBinary3Sves.count(1) >= i6) {
                integerPolynomialMult.add(integerPolynomialFromBinary3Sves, i2);
                integerPolynomialMult.ensurePositive(i2);
                return integerPolynomialMult.toBinary(i2);
            }
            bArr2 = bArr;
            i4 = i11;
            i5 = i12;
            i7 = i13;
        }
    }

    private int[] generateBlindingCoeffs(IndexGenerator indexGenerator, int i) {
        int[] iArr = new int[this.params.f206952N];
        for (int i2 = -1; i2 <= 1; i2 += 2) {
            int i3 = 0;
            while (i3 < i) {
                int iNextIndex = indexGenerator.nextIndex();
                if (iArr[iNextIndex] == 0) {
                    iArr[iNextIndex] = i2;
                    i3++;
                }
            }
        }
        return iArr;
    }

    private Polynomial generateBlindingPoly(byte[] bArr, byte[] bArr2) {
        IndexGenerator indexGenerator = new IndexGenerator(bArr, this.params);
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.polyType == 1) {
            return new ProductFormPolynomial(new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, nTRUEncryptionParameters.dr1)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr2)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr3)));
        }
        int i = nTRUEncryptionParameters.f206957dr;
        boolean z = nTRUEncryptionParameters.sparse;
        int[] iArrGenerateBlindingCoeffs = generateBlindingCoeffs(indexGenerator, i);
        return z ? new SparseTernaryPolynomial(iArrGenerateBlindingCoeffs) : new DenseTernaryPolynomial(iArrGenerateBlindingCoeffs);
    }

    private int log2(int i) {
        if (i == 2048) {
            return 11;
        }
        qkq0.m175383a("log2 not fully implemented");
        return 0;
    }

    private void putInt(Digest digest, int i) {
        digest.update((byte) (i >> 24));
        digest.update((byte) (i >> 16));
        digest.update((byte) (i >> 8));
        digest.update((byte) i);
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.params.maxMsgLenBytes;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        return ((nTRUEncryptionParameters.f206952N * log2(nTRUEncryptionParameters.f206958q)) + 7) / 8;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        if (!z) {
            NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) cipherParameters;
            this.privKey = nTRUEncryptionPrivateKeyParameters;
            this.params = nTRUEncryptionPrivateKeyParameters.getParameters();
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.pubKey = (NTRUEncryptionPublicKeyParameters) parametersWithRandom.getParameters();
        } else {
            this.random = new SecureRandom();
            this.pubKey = (NTRUEncryptionPublicKeyParameters) cipherParameters;
        }
        this.params = this.pubKey.getParameters();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return this.forEncryption ? encrypt(bArr2, this.pubKey) : decrypt(bArr2, this.privKey);
    }

    private byte[] calcHash(Digest digest) {
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public IntegerPolynomial encrypt(IntegerPolynomial integerPolynomial, TernaryPolynomial ternaryPolynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult = ternaryPolynomial.mult(integerPolynomial2, this.params.f206958q);
        integerPolynomialMult.add(integerPolynomial, this.params.f206958q);
        integerPolynomialMult.ensurePositive(this.params.f206958q);
        return integerPolynomialMult;
    }

    public IntegerPolynomial decrypt(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.fastFp) {
            integerPolynomialMult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f206958q);
            integerPolynomialMult.mult(3);
            integerPolynomialMult.add(integerPolynomial);
        } else {
            integerPolynomialMult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f206958q);
        }
        integerPolynomialMult.center0(this.params.f206958q);
        integerPolynomialMult.mod3();
        if (!this.params.fastFp) {
            integerPolynomialMult = new DenseTernaryPolynomial(integerPolynomialMult).mult(integerPolynomial2, 3);
        }
        integerPolynomialMult.center0(3);
        return integerPolynomialMult;
    }
}
