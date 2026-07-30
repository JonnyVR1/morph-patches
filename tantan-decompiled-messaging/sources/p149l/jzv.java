package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jzv {

    /* JADX INFO: renamed from: a */
    public int f120420a;

    /* JADX INFO: renamed from: b */
    public long[] f120421b;

    public jzv(int i) {
        this.f120421b = new long[i];
    }

    /* JADX INFO: renamed from: a */
    public void m143948a(long j) {
        int i = this.f120420a;
        long[] jArr = this.f120421b;
        if (i == jArr.length) {
            this.f120421b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f120421b;
        int i2 = this.f120420a;
        this.f120420a = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: b */
    public long m143949b(int i) {
        if (i >= 0 && i < this.f120420a) {
            return this.f120421b[i];
        }
        inc0.m137129a("Invalid index ", i, ", size is ", this.f120420a);
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public int m143950c() {
        return this.f120420a;
    }

    /* JADX INFO: renamed from: d */
    public long[] m143951d() {
        return Arrays.copyOf(this.f120421b, this.f120420a);
    }

    public jzv() {
        this(32);
    }
}
