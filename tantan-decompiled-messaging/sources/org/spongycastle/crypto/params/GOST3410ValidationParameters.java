package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c */
    private int f206723c;

    /* JADX INFO: renamed from: cL */
    private long f206724cL;

    /* JADX INFO: renamed from: x0 */
    private int f206725x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f206725x0 = i;
        this.f206723c = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f206723c == this.f206723c && gOST3410ValidationParameters.f206725x0 == this.f206725x0 && gOST3410ValidationParameters.f206724cL == this.f206724cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f206723c;
    }

    public long getCL() {
        return this.f206724cL;
    }

    public int getX0() {
        return this.f206725x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f206725x0 ^ this.f206723c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f206724cL;
        return (((int) j2) ^ i2) ^ ((int) (j2 >> 32));
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f206724cL = j2;
    }
}
