package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class twv0 {

    /* JADX INFO: renamed from: a */
    public int f172431a;

    /* JADX INFO: renamed from: b */
    public long[] f172432b;

    public twv0(int i) {
        this.f172432b = new long[32];
    }

    /* JADX INFO: renamed from: a */
    public final int m190909a() {
        return this.f172431a;
    }

    /* JADX INFO: renamed from: b */
    public final long m190910b(int i) {
        if (i >= 0 && i < this.f172431a) {
            return this.f172432b[i];
        }
        inc0.m137129a("Invalid index ", i, ", size is ", this.f172431a);
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m190911c(long j) {
        int i = this.f172431a;
        long[] jArr = this.f172432b;
        if (i == jArr.length) {
            this.f172432b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f172432b;
        int i2 = this.f172431a;
        this.f172431a = i2 + 1;
        jArr2[i2] = j;
    }

    public twv0() {
        this(32);
    }
}
