package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c */
    private int f207645c;

    /* JADX INFO: renamed from: cL */
    private long f207646cL;

    /* JADX INFO: renamed from: x0 */
    private int f207647x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f207647x0 = i;
        this.f207645c = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f207645c == this.f207645c && gOST3410ValidationParameters.f207647x0 == this.f207647x0 && gOST3410ValidationParameters.f207646cL == this.f207646cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f207645c;
    }

    public long getCL() {
        return this.f207646cL;
    }

    public int getX0() {
        return this.f207647x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f207647x0 ^ this.f207645c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f207646cL;
        return (((int) j2) ^ i2) ^ ((int) (j2 >> 32));
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f207646cL = j2;
    }
}
