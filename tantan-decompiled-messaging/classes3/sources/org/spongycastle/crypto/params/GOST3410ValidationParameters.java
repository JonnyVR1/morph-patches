package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c */
    private int f10348c;

    /* JADX INFO: renamed from: cL */
    private long f10349cL;

    /* JADX INFO: renamed from: x0 */
    private int f10350x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f10350x0 = i;
        this.f10348c = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f10348c == this.f10348c && gOST3410ValidationParameters.f10350x0 == this.f10350x0 && gOST3410ValidationParameters.f10349cL == this.f10349cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f10348c;
    }

    public long getCL() {
        return this.f10349cL;
    }

    public int getX0() {
        return this.f10350x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f10350x0 ^ this.f10348c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f10349cL;
        return (((int) j2) ^ i2) ^ ((int) (j2 >> 32));
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f10349cL = j2;
    }
}
