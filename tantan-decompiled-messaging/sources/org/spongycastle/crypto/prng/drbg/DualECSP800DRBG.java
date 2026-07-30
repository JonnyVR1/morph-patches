package org.spongycastle.crypto.prng.drbg;

import java.math.BigInteger;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECMultiplier;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.math.p131ec.FixedPointCombMultiplier;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import p149l.ctq0;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class DualECSP800DRBG implements SP80090DRBG {
    private static final int MAX_ADDITIONAL_INPUT = 4096;
    private static final int MAX_ENTROPY_LENGTH = 4096;
    private static final int MAX_PERSONALIZATION_STRING = 4096;
    private static final long RESEED_MAX = 2147483648L;
    private static final DualECPoints[] nistPoints;
    private static final BigInteger p256_Px;
    private static final BigInteger p256_Py;
    private static final BigInteger p256_Qx;
    private static final BigInteger p256_Qy;
    private static final BigInteger p384_Px;
    private static final BigInteger p384_Py;
    private static final BigInteger p384_Qx;
    private static final BigInteger p384_Qy;
    private static final BigInteger p521_Px;
    private static final BigInteger p521_Py;
    private static final BigInteger p521_Qx;
    private static final BigInteger p521_Qy;

    /* JADX INFO: renamed from: _P */
    private ECPoint f206754_P;

    /* JADX INFO: renamed from: _Q */
    private ECPoint f206755_Q;
    private ECCurve.C22280Fp _curve;
    private Digest _digest;
    private EntropySource _entropySource;
    private ECMultiplier _fixedPointMultiplier;
    private int _outlen;
    private long _reseedCounter;

    /* JADX INFO: renamed from: _s */
    private byte[] f206756_s;
    private int _sLength;
    private int _securityStrength;
    private int _seedlen;

    static {
        BigInteger bigInteger = new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16);
        p256_Px = bigInteger;
        BigInteger bigInteger2 = new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16);
        p256_Py = bigInteger2;
        BigInteger bigInteger3 = new BigInteger("c97445f45cdef9f0d3e05e1e585fc297235b82b5be8ff3efca67c59852018192", 16);
        p256_Qx = bigInteger3;
        BigInteger bigInteger4 = new BigInteger("b28ef557ba31dfcbdd21ac46e2a91e3c304f44cb87058ada2cb815151e610046", 16);
        p256_Qy = bigInteger4;
        BigInteger bigInteger5 = new BigInteger("aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", 16);
        p384_Px = bigInteger5;
        BigInteger bigInteger6 = new BigInteger("3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f", 16);
        p384_Py = bigInteger6;
        BigInteger bigInteger7 = new BigInteger("8e722de3125bddb05580164bfe20b8b432216a62926c57502ceede31c47816edd1e89769124179d0b695106428815065", 16);
        p384_Qx = bigInteger7;
        BigInteger bigInteger8 = new BigInteger("023b1660dd701d0839fd45eec36f9ee7b32e13b315dc02610aa1b636e346df671f790f84c5e09b05674dbb7e45c803dd", 16);
        p384_Qy = bigInteger8;
        BigInteger bigInteger9 = new BigInteger("c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", 16);
        p521_Px = bigInteger9;
        BigInteger bigInteger10 = new BigInteger("11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650", 16);
        p521_Py = bigInteger10;
        BigInteger bigInteger11 = new BigInteger("1b9fa3e518d683c6b65763694ac8efbaec6fab44f2276171a42726507dd08add4c3b3f4c1ebc5b1222ddba077f722943b24c3edfa0f85fe24d0c8c01591f0be6f63", 16);
        p521_Qx = bigInteger11;
        BigInteger bigInteger12 = new BigInteger("1f3bdba585295d9a1110d1df1f9430ef8442c5018976ff3437ef91b81dc0b8132c8d5c39c32d0e004a3092b7d327c0e7a4d26d2c7b69b58f9066652911e457779de", 16);
        p521_Qy = bigInteger12;
        nistPoints = new DualECPoints[]{new DualECPoints(128, c22280Fp.createPoint(bigInteger, bigInteger2), c22280Fp.createPoint(bigInteger3, bigInteger4), 1), new DualECPoints(192, c22280Fp.createPoint(bigInteger5, bigInteger6), c22280Fp.createPoint(bigInteger7, bigInteger8), 1), new DualECPoints(256, c22280Fp.createPoint(bigInteger9, bigInteger10), c22280Fp.createPoint(bigInteger11, bigInteger12), 1)};
        ECCurve.C22280Fp c22280Fp = (ECCurve.C22280Fp) NISTNamedCurves.getByName("P-256").getCurve();
        ECCurve.C22280Fp c22280Fp2 = (ECCurve.C22280Fp) NISTNamedCurves.getByName("P-384").getCurve();
        ECCurve.C22280Fp c22280Fp3 = (ECCurve.C22280Fp) NISTNamedCurves.getByName("P-521").getCurve();
    }

    public DualECSP800DRBG(DualECPoints[] dualECPointsArr, Digest digest, int i, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._fixedPointMultiplier = new FixedPointCombMultiplier();
        this._digest = digest;
        this._entropySource = entropySource;
        this._securityStrength = i;
        if (Utils.isTooLarge(bArr, 512)) {
            ig3.m135964a("Personalization string too large");
            throw null;
        }
        if (entropySource.entropySize() < i || entropySource.entropySize() > 4096) {
            ctq0.m108694a("EntropySource must provide between ", i, " and 4096 bits");
            throw null;
        }
        byte[] bArrConcatenate = Arrays.concatenate(getEntropy(), bArr2, bArr);
        for (int i2 = 0; i2 != dualECPointsArr.length; i2++) {
            if (i <= dualECPointsArr[i2].getSecurityStrength()) {
                if (Utils.getMaxSecurityStrength(digest) < dualECPointsArr[i2].getSecurityStrength()) {
                    ig3.m135964a("Requested security strength is not supported by digest");
                    throw null;
                }
                this._seedlen = dualECPointsArr[i2].getSeedLen();
                this._outlen = dualECPointsArr[i2].getMaxOutlen() / 8;
                this.f206754_P = dualECPointsArr[i2].getP();
                this.f206755_Q = dualECPointsArr[i2].getQ();
                break;
            }
        }
        if (this.f206754_P == null) {
            ig3.m135964a("security strength cannot be greater than 256 bits");
            throw null;
        }
        byte[] bArrHash_df = Utils.hash_df(this._digest, bArrConcatenate, this._seedlen);
        this.f206756_s = bArrHash_df;
        this._sLength = bArrHash_df.length;
        this._reseedCounter = 0L;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        qkq0.m175383a("Insufficient entropy provided by entropy source");
        return null;
    }

    private BigInteger getScalarMultipleXCoord(ECPoint eCPoint, BigInteger bigInteger) {
        return this._fixedPointMultiplier.multiply(eCPoint, bigInteger).normalize().getAffineXCoord().toBigInteger();
    }

    private byte[] pad8(byte[] bArr, int i) {
        int i2 = i % 8;
        if (i2 == 0) {
            return bArr;
        }
        int i3 = 8 - i2;
        int length = bArr.length - 1;
        int i4 = 0;
        while (length >= 0) {
            int i5 = bArr[length] & 255;
            bArr[length] = (byte) ((i4 >> (8 - i3)) | (i5 << i3));
            length--;
            i4 = i5;
        }
        return bArr;
    }

    private byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        int length2 = bArr.length / this._outlen;
        if (Utils.isTooLarge(bArr2, 512)) {
            ig3.m135964a("Additional input too large");
            return 0;
        }
        if (this._reseedCounter + ((long) length2) > 2147483648L) {
            return -1;
        }
        if (z) {
            reseed(bArr2);
            bArr2 = null;
        }
        BigInteger bigInteger = bArr2 != null ? new BigInteger(1, xor(this.f206756_s, Utils.hash_df(this._digest, bArr2, this._seedlen))) : new BigInteger(1, this.f206756_s);
        Arrays.fill(bArr, (byte) 0);
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            bigInteger = getScalarMultipleXCoord(this.f206754_P, bigInteger);
            byte[] byteArray = getScalarMultipleXCoord(this.f206755_Q, bigInteger).toByteArray();
            int length3 = byteArray.length;
            int i3 = this._outlen;
            if (length3 > i3) {
                System.arraycopy(byteArray, byteArray.length - i3, bArr, i, i3);
            } else {
                System.arraycopy(byteArray, 0, bArr, (i3 - byteArray.length) + i, byteArray.length);
            }
            i += this._outlen;
            this._reseedCounter++;
        }
        if (i < bArr.length) {
            bigInteger = getScalarMultipleXCoord(this.f206754_P, bigInteger);
            byte[] byteArray2 = getScalarMultipleXCoord(this.f206755_Q, bigInteger).toByteArray();
            int length4 = bArr.length - i;
            int length5 = byteArray2.length;
            int i4 = this._outlen;
            if (length5 > i4) {
                System.arraycopy(byteArray2, byteArray2.length - i4, bArr, i, length4);
            } else {
                System.arraycopy(byteArray2, 0, bArr, i + (i4 - byteArray2.length), length4);
            }
            this._reseedCounter++;
        }
        this.f206756_s = BigIntegers.asUnsignedByteArray(this._sLength, getScalarMultipleXCoord(this.f206754_P, bigInteger));
        return length;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._outlen * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        if (Utils.isTooLarge(bArr, 512)) {
            ig3.m135964a("Additional input string too large");
            return;
        }
        this.f206756_s = Utils.hash_df(this._digest, Arrays.concatenate(pad8(this.f206756_s, this._seedlen), getEntropy(), bArr), this._seedlen);
        this._reseedCounter = 0L;
    }

    public DualECSP800DRBG(Digest digest, int i, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this(nistPoints, digest, i, entropySource, bArr, bArr2);
    }
}
