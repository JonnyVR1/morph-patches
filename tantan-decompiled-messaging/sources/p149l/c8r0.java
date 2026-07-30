package p149l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class c8r0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f79782a;

    /* JADX INFO: renamed from: b */
    public final int f79783b;

    /* JADX INFO: renamed from: c */
    public final int f79784c;

    /* JADX INFO: renamed from: d */
    public final long f79785d;

    /* JADX INFO: renamed from: e */
    public final int f79786e;

    /* JADX INFO: renamed from: f */
    public int f79787f;

    /* JADX INFO: renamed from: g */
    public int f79788g;

    /* JADX INFO: renamed from: h */
    public int f79789h;

    /* JADX INFO: renamed from: i */
    public int f79790i;

    /* JADX INFO: renamed from: j */
    public int f79791j;

    /* JADX INFO: renamed from: k */
    public long[] f79792k;

    /* JADX INFO: renamed from: l */
    public int[] f79793l;

    public c8r0(int i, int i2, long j, int i3, m7r0 m7r0Var) {
        i2 = i2 != 1 ? 2 : i2;
        this.f79785d = j;
        this.f79786e = i3;
        this.f79782a = m7r0Var;
        this.f79783b = m105801i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f79784c = i2 == 2 ? m105801i(i, 1650720768) : -1;
        this.f79792k = new long[512];
        this.f79793l = new int[512];
    }

    /* JADX INFO: renamed from: i */
    public static int m105801i(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* JADX INFO: renamed from: a */
    public final t6r0 m105802a(long j) {
        int iM105810j = (int) (j / m105810j(1));
        int iM126075q = ggw0.m126075q(this.f79793l, iM105810j, true, true);
        if (this.f79793l[iM126075q] == iM105810j) {
            w6r0 w6r0VarM105811k = m105811k(iM126075q);
            return new t6r0(w6r0VarM105811k, w6r0VarM105811k);
        }
        w6r0 w6r0VarM105811k2 = m105811k(iM126075q);
        int i = iM126075q + 1;
        return i < this.f79792k.length ? new t6r0(w6r0VarM105811k2, m105811k(i)) : new t6r0(w6r0VarM105811k2, w6r0VarM105811k2);
    }

    /* JADX INFO: renamed from: b */
    public final void m105803b(long j) {
        if (this.f79791j == this.f79793l.length) {
            long[] jArr = this.f79792k;
            this.f79792k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f79793l;
            this.f79793l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f79792k;
        int i = this.f79791j;
        jArr2[i] = j;
        this.f79793l[i] = this.f79790i;
        this.f79791j = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m105804c() {
        this.f79792k = Arrays.copyOf(this.f79792k, this.f79791j);
        this.f79793l = Arrays.copyOf(this.f79793l, this.f79791j);
    }

    /* JADX INFO: renamed from: d */
    public final void m105805d() {
        this.f79790i++;
    }

    /* JADX INFO: renamed from: e */
    public final void m105806e(int i) {
        this.f79787f = i;
        this.f79788g = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m105807f(long j) {
        if (this.f79791j == 0) {
            this.f79789h = 0;
        } else {
            this.f79789h = this.f79793l[ggw0.m126076r(this.f79792k, j, true, true)];
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m105808g(int i) {
        return this.f79783b == i || this.f79784c == i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m105809h(k5r0 k5r0Var) throws IOException {
        int i = this.f79788g;
        int iMo134532e = i - this.f79782a.mo134532e(k5r0Var, i, false);
        this.f79788g = iMo134532e;
        boolean z = iMo134532e == 0;
        if (z) {
            if (this.f79787f > 0) {
                this.f79782a.mo134530c(m105810j(this.f79789h), Arrays.binarySearch(this.f79793l, this.f79789h) >= 0 ? 1 : 0, this.f79787f, 0, null);
            }
            this.f79789h++;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final long m105810j(int i) {
        return (this.f79785d * ((long) i)) / ((long) this.f79786e);
    }

    /* JADX INFO: renamed from: k */
    public final w6r0 m105811k(int i) {
        return new w6r0(((long) this.f79793l[i]) * m105810j(1), this.f79792k[i]);
    }
}
