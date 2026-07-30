package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUSigningKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public static final int BASIS_TYPE_STANDARD = 0;
    public static final int BASIS_TYPE_TRANSPOSE = 1;
    public static final int KEY_GEN_ALG_FLOAT = 1;
    public static final int KEY_GEN_ALG_RESULTANT = 0;

    /* JADX INFO: renamed from: B */
    public int f10588B;

    /* JADX INFO: renamed from: N */
    public int f10589N;
    public int basisType;
    double beta;
    public double betaSq;
    int bitsF;

    /* JADX INFO: renamed from: d */
    public int f10590d;

    /* JADX INFO: renamed from: d1 */
    public int f10591d1;

    /* JADX INFO: renamed from: d2 */
    public int f10592d2;

    /* JADX INFO: renamed from: d3 */
    public int f10593d3;
    public Digest hashAlg;
    public int keyGenAlg;
    double keyNormBound;
    public double keyNormBoundSq;
    double normBound;
    public double normBoundSq;
    public int polyType;
    public boolean primeCheck;

    /* JADX INFO: renamed from: q */
    public int f10594q;
    public int signFailTolerance;
    public boolean sparse;
    public static final NTRUSigningKeyGenerationParameters APR2011_439 = new NTRUSigningKeyGenerationParameters(439, PKIFailureInfo.wrongIntegrity, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_439_PROD = new NTRUSigningKeyGenerationParameters(439, PKIFailureInfo.wrongIntegrity, 9, 8, 5, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743 = new NTRUSigningKeyGenerationParameters(743, PKIFailureInfo.wrongIntegrity, 248, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743_PROD = new NTRUSigningKeyGenerationParameters(743, PKIFailureInfo.wrongIntegrity, 11, 11, 15, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157 = new NTRUSigningKeyGenerationParameters(CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 256, 29, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157_PROD = new NTRUSigningKeyGenerationParameters(CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 256, 5, 5, 8, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());

    public NTRUSigningKeyGenerationParameters(InputStream inputStream) throws IOException {
        super(new SecureRandom(), 0);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10589N = dataInputStream.readInt();
        this.f10594q = dataInputStream.readInt();
        this.f10590d = dataInputStream.readInt();
        this.f10591d1 = dataInputStream.readInt();
        this.f10592d2 = dataInputStream.readInt();
        this.f10593d3 = dataInputStream.readInt();
        this.f10588B = dataInputStream.readInt();
        this.basisType = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.keyNormBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.primeCheck = dataInputStream.readBoolean();
        this.sparse = dataInputStream.readBoolean();
        this.bitsF = dataInputStream.readInt();
        this.keyGenAlg = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        if ("SHA-512".equals(utf)) {
            this.hashAlg = new SHA512Digest();
        } else if ("SHA-256".equals(utf)) {
            this.hashAlg = new SHA256Digest();
        }
        this.polyType = dataInputStream.read();
        init();
    }

    private void init() {
        double d = this.beta;
        this.betaSq = d * d;
        double d2 = this.normBound;
        this.normBoundSq = d2 * d2;
        double d3 = this.keyNormBound;
        this.keyNormBoundSq = d3 * d3;
    }

    public NTRUSigningKeyGenerationParameters clone() {
        int i = this.polyType;
        int i2 = this.f10589N;
        return i == 0 ? new NTRUSigningKeyGenerationParameters(i2, this.f10594q, this.f10590d, this.f10588B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg) : new NTRUSigningKeyGenerationParameters(i2, this.f10594q, this.f10591d1, this.f10592d2, this.f10593d3, this.f10588B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUSigningKeyGenerationParameters)) {
            return false;
        }
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = (NTRUSigningKeyGenerationParameters) obj;
        if (this.f10588B != nTRUSigningKeyGenerationParameters.f10588B || this.f10589N != nTRUSigningKeyGenerationParameters.f10589N || this.basisType != nTRUSigningKeyGenerationParameters.basisType || Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.beta) || Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.betaSq) || this.bitsF != nTRUSigningKeyGenerationParameters.bitsF || this.f10590d != nTRUSigningKeyGenerationParameters.f10590d || this.f10591d1 != nTRUSigningKeyGenerationParameters.f10591d1 || this.f10592d2 != nTRUSigningKeyGenerationParameters.f10592d2 || this.f10593d3 != nTRUSigningKeyGenerationParameters.f10593d3) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUSigningKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUSigningKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.keyGenAlg == nTRUSigningKeyGenerationParameters.keyGenAlg && Double.doubleToLongBits(this.keyNormBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBound) && Double.doubleToLongBits(this.keyNormBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBoundSq) && Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBoundSq) && this.polyType == nTRUSigningKeyGenerationParameters.polyType && this.primeCheck == nTRUSigningKeyGenerationParameters.primeCheck && this.f10594q == nTRUSigningKeyGenerationParameters.f10594q && this.signFailTolerance == nTRUSigningKeyGenerationParameters.signFailTolerance && this.sparse == nTRUSigningKeyGenerationParameters.sparse;
    }

    public NTRUSigningParameters getSigningParameters() {
        return new NTRUSigningParameters(this.f10589N, this.f10594q, this.f10590d, this.f10588B, this.beta, this.normBound, this.hashAlg);
    }

    public int hashCode() {
        int i = ((((this.f10588B + 31) * 31) + this.f10589N) * 31) + this.basisType;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beta);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i3 = ((((((((((((i2 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f10590d) * 31) + this.f10591d1) * 31) + this.f10592d2) * 31) + this.f10593d3) * 31;
        Digest digest = this.hashAlg;
        int iHashCode = ((i3 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + this.keyGenAlg;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.keyNormBound);
        int i4 = (iHashCode * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.keyNormBoundSq);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.normBound);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.normBoundSq);
        return (((((((((((i6 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31) + this.polyType) * 31) + (this.primeCheck ? 1231 : 1237)) * 31) + this.f10594q) * 31) + this.signFailTolerance) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder("SignatureParameters(N=" + this.f10589N + " q=" + this.f10594q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE d=" + this.f10590d);
        } else {
            sb.append(" polyType=PRODUCT d1=" + this.f10591d1 + " d2=" + this.f10592d2 + " d3=" + this.f10593d3);
        }
        sb.append(" B=" + this.f10588B + " basisType=" + this.basisType + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " keyNormBound=" + decimalFormat.format(this.keyNormBound) + " prime=" + this.primeCheck + " sparse=" + this.sparse + " keyGenAlg=" + this.keyGenAlg + " hashAlg=" + this.hashAlg + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.f10589N);
        dataOutputStream.writeInt(this.f10594q);
        dataOutputStream.writeInt(this.f10590d);
        dataOutputStream.writeInt(this.f10591d1);
        dataOutputStream.writeInt(this.f10592d2);
        dataOutputStream.writeInt(this.f10593d3);
        dataOutputStream.writeInt(this.f10588B);
        dataOutputStream.writeInt(this.basisType);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeDouble(this.keyNormBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeBoolean(this.primeCheck);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.write(this.keyGenAlg);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
        dataOutputStream.write(this.polyType);
    }

    public NTRUSigningKeyGenerationParameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, double d2, double d3, boolean z, boolean z2, int i8, Digest digest) {
        super(new SecureRandom(), i);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.f10589N = i;
        this.f10594q = i2;
        this.f10591d1 = i3;
        this.f10592d2 = i4;
        this.f10593d3 = i5;
        this.f10588B = i6;
        this.basisType = i7;
        this.beta = d;
        this.normBound = d2;
        this.keyNormBound = d3;
        this.primeCheck = z;
        this.sparse = z2;
        this.keyGenAlg = i8;
        this.hashAlg = digest;
        this.polyType = 1;
        init();
    }

    public NTRUSigningKeyGenerationParameters(int i, int i2, int i3, int i4, int i5, double d, double d2, double d3, boolean z, boolean z2, int i6, Digest digest) {
        super(new SecureRandom(), i);
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.f10589N = i;
        this.f10594q = i2;
        this.f10590d = i3;
        this.f10588B = i4;
        this.basisType = i5;
        this.beta = d;
        this.normBound = d2;
        this.keyNormBound = d3;
        this.primeCheck = z;
        this.sparse = z2;
        this.keyGenAlg = i6;
        this.hashAlg = digest;
        this.polyType = 0;
        init();
    }
}
