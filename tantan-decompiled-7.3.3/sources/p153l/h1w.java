package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class h1w {

    /* JADX INFO: renamed from: a */
    public int f107490a;

    /* JADX INFO: renamed from: b */
    public long[] f107491b;

    public h1w(int i) {
        this.f107491b = new long[i];
    }

    /* JADX INFO: renamed from: a */
    public void m133353a(long j) {
        int i = this.f107490a;
        long[] jArr = this.f107491b;
        if (i == jArr.length) {
            this.f107491b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f107491b;
        int i2 = this.f107490a;
        this.f107490a = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: b */
    public long m133354b(int i) {
        if (i >= 0 && i < this.f107490a) {
            return this.f107491b[i];
        }
        nvc0.m164869a("Invalid index ", i, ", size is ", this.f107490a);
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public int m133355c() {
        return this.f107490a;
    }

    /* JADX INFO: renamed from: d */
    public long[] m133356d() {
        return Arrays.copyOf(this.f107491b, this.f107490a);
    }

    public h1w() {
        this(32);
    }
}
