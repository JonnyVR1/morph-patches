package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUSigningParameters implements Cloneable {

    /* JADX INFO: renamed from: B */
    public int f10597B;

    /* JADX INFO: renamed from: N */
    public int f10598N;
    double beta;
    public double betaSq;
    int bitsF;

    /* JADX INFO: renamed from: d */
    public int f10599d;

    /* JADX INFO: renamed from: d1 */
    public int f10600d1;

    /* JADX INFO: renamed from: d2 */
    public int f10601d2;

    /* JADX INFO: renamed from: d3 */
    public int f10602d3;
    public Digest hashAlg;
    double normBound;
    public double normBoundSq;

    /* JADX INFO: renamed from: q */
    public int f10603q;
    public int signFailTolerance;

    public NTRUSigningParameters(InputStream inputStream) throws IOException {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10598N = dataInputStream.readInt();
        this.f10603q = dataInputStream.readInt();
        this.f10599d = dataInputStream.readInt();
        this.f10600d1 = dataInputStream.readInt();
        this.f10601d2 = dataInputStream.readInt();
        this.f10602d3 = dataInputStream.readInt();
        this.f10597B = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.bitsF = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if ("SHA-512".equals(utf)) {
            this.hashAlg = new SHA512Digest();
        } else if ("SHA-256".equals(utf)) {
            this.hashAlg = new SHA256Digest();
        }
        init();
    }

    private void init() {
        double d = this.beta;
        this.betaSq = d * d;
        double d2 = this.normBound;
        this.normBoundSq = d2 * d2;
    }

    public NTRUSigningParameters clone() {
        return new NTRUSigningParameters(this.f10598N, this.f10603q, this.f10599d, this.f10597B, this.beta, this.normBound, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUSigningParameters)) {
            return false;
        }
        NTRUSigningParameters nTRUSigningParameters = (NTRUSigningParameters) obj;
        if (this.f10597B != nTRUSigningParameters.f10597B || this.f10598N != nTRUSigningParameters.f10598N || Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningParameters.beta) || Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningParameters.betaSq) || this.bitsF != nTRUSigningParameters.bitsF || this.f10599d != nTRUSigningParameters.f10599d || this.f10600d1 != nTRUSigningParameters.f10600d1 || this.f10601d2 != nTRUSigningParameters.f10601d2 || this.f10602d3 != nTRUSigningParameters.f10602d3) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUSigningParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUSigningParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningParameters.normBoundSq) && this.f10603q == nTRUSigningParameters.f10603q && this.signFailTolerance == nTRUSigningParameters.signFailTolerance;
    }

    public int hashCode() {
        int i = ((this.f10597B + 31) * 31) + this.f10598N;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beta);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i3 = ((((((((((((i2 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f10599d) * 31) + this.f10600d1) * 31) + this.f10601d2) * 31) + this.f10602d3) * 31;
        Digest digest = this.hashAlg;
        int iHashCode = i3 + (digest == null ? 0 : digest.getAlgorithmName().hashCode());
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.normBound);
        int i4 = (iHashCode * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.normBoundSq);
        return (((((i4 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.f10603q) * 31) + this.signFailTolerance;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return ("SignatureParameters(N=" + this.f10598N + " q=" + this.f10603q).concat(" B=" + this.f10597B + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " hashAlg=" + this.hashAlg + ")");
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.f10598N);
        dataOutputStream.writeInt(this.f10603q);
        dataOutputStream.writeInt(this.f10599d);
        dataOutputStream.writeInt(this.f10600d1);
        dataOutputStream.writeInt(this.f10601d2);
        dataOutputStream.writeInt(this.f10602d3);
        dataOutputStream.writeInt(this.f10597B);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUSigningParameters(int i, int i2, int i3, int i4, int i5, int i6, double d, double d2, double d3, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.f10598N = i;
        this.f10603q = i2;
        this.f10600d1 = i3;
        this.f10601d2 = i4;
        this.f10602d3 = i5;
        this.f10597B = i6;
        this.beta = d;
        this.normBound = d2;
        this.hashAlg = digest;
        init();
    }

    public NTRUSigningParameters(int i, int i2, int i3, int i4, double d, double d2, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.f10598N = i;
        this.f10603q = i2;
        this.f10599d = i3;
        this.f10597B = i4;
        this.beta = d;
        this.normBound = d2;
        this.hashAlg = digest;
        init();
    }
}
