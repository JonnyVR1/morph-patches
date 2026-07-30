package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class z5w0 {

    /* JADX INFO: renamed from: a */
    public int f203093a;

    /* JADX INFO: renamed from: b */
    public long[] f203094b;

    public z5w0(int i) {
        this.f203094b = new long[32];
    }

    /* JADX INFO: renamed from: a */
    public final int m218743a() {
        return this.f203093a;
    }

    /* JADX INFO: renamed from: b */
    public final long m218744b(int i) {
        if (i >= 0 && i < this.f203093a) {
            return this.f203094b[i];
        }
        nvc0.m164869a("Invalid index ", i, ", size is ", this.f203093a);
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m218745c(long j) {
        int i = this.f203093a;
        long[] jArr = this.f203094b;
        if (i == jArr.length) {
            this.f203094b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f203094b;
        int i2 = this.f203093a;
        this.f203093a = i2 + 1;
        jArr2[i2] = j;
    }

    public z5w0() {
        this(32);
    }
}
