package p153l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ihr0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f115000a;

    /* JADX INFO: renamed from: b */
    public final int f115001b;

    /* JADX INFO: renamed from: c */
    public final int f115002c;

    /* JADX INFO: renamed from: d */
    public final long f115003d;

    /* JADX INFO: renamed from: e */
    public final int f115004e;

    /* JADX INFO: renamed from: f */
    public int f115005f;

    /* JADX INFO: renamed from: g */
    public int f115006g;

    /* JADX INFO: renamed from: h */
    public int f115007h;

    /* JADX INFO: renamed from: i */
    public int f115008i;

    /* JADX INFO: renamed from: j */
    public int f115009j;

    /* JADX INFO: renamed from: k */
    public long[] f115010k;

    /* JADX INFO: renamed from: l */
    public int[] f115011l;

    public ihr0(int i, int i2, long j, int i3, sgr0 sgr0Var) {
        i2 = i2 != 1 ? 2 : i2;
        this.f115003d = j;
        this.f115004e = i3;
        this.f115000a = sgr0Var;
        this.f115001b = m140021i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f115002c = i2 == 2 ? m140021i(i, 1650720768) : -1;
        this.f115010k = new long[512];
        this.f115011l = new int[512];
    }

    /* JADX INFO: renamed from: i */
    public static int m140021i(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* JADX INFO: renamed from: a */
    public final zfr0 m140022a(long j) {
        int iM140030j = (int) (j / m140030j(1));
        int iM159419q = mpw0.m159419q(this.f115011l, iM140030j, true, true);
        if (this.f115011l[iM159419q] == iM140030j) {
            cgr0 cgr0VarM140031k = m140031k(iM159419q);
            return new zfr0(cgr0VarM140031k, cgr0VarM140031k);
        }
        cgr0 cgr0VarM140031k2 = m140031k(iM159419q);
        int i = iM159419q + 1;
        return i < this.f115010k.length ? new zfr0(cgr0VarM140031k2, m140031k(i)) : new zfr0(cgr0VarM140031k2, cgr0VarM140031k2);
    }

    /* JADX INFO: renamed from: b */
    public final void m140023b(long j) {
        if (this.f115009j == this.f115011l.length) {
            long[] jArr = this.f115010k;
            this.f115010k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f115011l;
            this.f115011l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f115010k;
        int i = this.f115009j;
        jArr2[i] = j;
        this.f115011l[i] = this.f115008i;
        this.f115009j = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m140024c() {
        this.f115010k = Arrays.copyOf(this.f115010k, this.f115009j);
        this.f115011l = Arrays.copyOf(this.f115011l, this.f115009j);
    }

    /* JADX INFO: renamed from: d */
    public final void m140025d() {
        this.f115008i++;
    }

    /* JADX INFO: renamed from: e */
    public final void m140026e(int i) {
        this.f115005f = i;
        this.f115006g = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m140027f(long j) {
        if (this.f115009j == 0) {
            this.f115007h = 0;
        } else {
            this.f115007h = this.f115011l[mpw0.m159420r(this.f115010k, j, true, true)];
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m140028g(int i) {
        return this.f115001b == i || this.f115002c == i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m140029h(qer0 qer0Var) throws IOException {
        int i = this.f115006g;
        int iMo99374e = i - this.f115000a.mo99374e(qer0Var, i, false);
        this.f115006g = iMo99374e;
        boolean z = iMo99374e == 0;
        if (z) {
            if (this.f115005f > 0) {
                this.f115000a.mo99372c(m140030j(this.f115007h), Arrays.binarySearch(this.f115011l, this.f115007h) >= 0 ? 1 : 0, this.f115005f, 0, null);
            }
            this.f115007h++;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final long m140030j(int i) {
        return (this.f115003d * ((long) i)) / ((long) this.f115004e);
    }

    /* JADX INFO: renamed from: k */
    public final cgr0 m140031k(int i) {
        return new cgr0(((long) this.f115011l[i]) * m140030j(1), this.f115010k[i]);
    }
}
