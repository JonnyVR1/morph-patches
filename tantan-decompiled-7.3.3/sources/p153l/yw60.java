package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yw60 implements jkj0 {

    /* JADX INFO: renamed from: a */
    public final hte f201790a;

    /* JADX INFO: renamed from: b */
    public final hg60 f201791b = new hg60(new byte[10]);

    /* JADX INFO: renamed from: c */
    public int f201792c = 0;

    /* JADX INFO: renamed from: d */
    public int f201793d;

    /* JADX INFO: renamed from: e */
    public h0j0 f201794e;

    /* JADX INFO: renamed from: f */
    public boolean f201795f;

    /* JADX INFO: renamed from: g */
    public boolean f201796g;

    /* JADX INFO: renamed from: h */
    public boolean f201797h;

    /* JADX INFO: renamed from: i */
    public int f201798i;

    /* JADX INFO: renamed from: j */
    public int f201799j;

    /* JADX INFO: renamed from: k */
    public boolean f201800k;

    /* JADX INFO: renamed from: l */
    public long f201801l;

    public yw60(hte hteVar) {
        this.f201790a = hteVar;
    }

    @Override // p153l.jkj0
    /* JADX INFO: renamed from: a */
    public final void mo145849a(ig60 ig60Var, int i) throws ParserException {
        w11.m204373i(this.f201794e);
        if ((i & 1) != 0) {
            int i2 = this.f201792c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    kyv.m152151i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        wpg0.m207458a();
                        return;
                    }
                    if (this.f201799j != -1) {
                        kyv.m152151i("PesReader", "Unexpected start indicator: expected " + this.f201799j + " more bytes");
                    }
                    this.f201790a.mo108401c();
                }
            }
            m217584g(1);
        }
        while (ig60Var.m139811a() > 0) {
            int i3 = this.f201792c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m217581d(ig60Var, this.f201791b.f109369a, Math.min(10, this.f201798i)) && m217581d(ig60Var, null, this.f201798i)) {
                            m217583f();
                            i |= this.f201800k ? 4 : 0;
                            this.f201790a.mo108402d(this.f201801l, i);
                            m217584g(3);
                        }
                    } else {
                        if (i3 != 3) {
                            wpg0.m207458a();
                            return;
                        }
                        int iM139811a = ig60Var.m139811a();
                        int i4 = this.f201799j;
                        int i5 = i4 != -1 ? iM139811a - i4 : 0;
                        if (i5 > 0) {
                            iM139811a -= i5;
                            ig60Var.m139807T(ig60Var.m139816f() + iM139811a);
                        }
                        this.f201790a.mo108399a(ig60Var);
                        int i6 = this.f201799j;
                        if (i6 != -1) {
                            int i7 = i6 - iM139811a;
                            this.f201799j = i7;
                            if (i7 == 0) {
                                this.f201790a.mo108401c();
                                m217584g(1);
                            }
                        }
                    }
                } else if (m217581d(ig60Var, this.f201791b.f109369a, 9)) {
                    m217584g(m217582e() ? 2 : 0);
                }
            } else {
                ig60Var.m139809V(ig60Var.m139811a());
            }
        }
    }

    @Override // p153l.jkj0
    /* JADX INFO: renamed from: b */
    public final void mo145850b() {
        this.f201792c = 0;
        this.f201793d = 0;
        this.f201797h = false;
        this.f201790a.mo108400b();
    }

    @Override // p153l.jkj0
    /* JADX INFO: renamed from: c */
    public void mo145851c(h0j0 h0j0Var, bsf bsfVar, jkj0.C17969d c17969d) {
        this.f201794e = h0j0Var;
        this.f201790a.mo108403e(bsfVar, c17969d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m217581d(ig60 ig60Var, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(ig60Var.m139811a(), i - this.f201793d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            ig60Var.m139809V(iMin);
        } else {
            ig60Var.m139822l(bArr, this.f201793d, iMin);
        }
        int i2 = this.f201793d + iMin;
        this.f201793d = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m217582e() {
        this.f201791b.m134913p(0);
        int iM134905h = this.f201791b.m134905h(24);
        if (iM134905h != 1) {
            kyv.m152151i("PesReader", "Unexpected start code prefix: " + iM134905h);
            this.f201799j = -1;
            return false;
        }
        this.f201791b.m134915r(8);
        int iM134905h2 = this.f201791b.m134905h(16);
        this.f201791b.m134915r(5);
        this.f201800k = this.f201791b.m134904g();
        this.f201791b.m134915r(2);
        this.f201795f = this.f201791b.m134904g();
        this.f201796g = this.f201791b.m134904g();
        this.f201791b.m134915r(6);
        int iM134905h3 = this.f201791b.m134905h(8);
        this.f201798i = iM134905h3;
        if (iM134905h2 == 0) {
            this.f201799j = -1;
        } else {
            int i = (iM134905h2 - 3) - iM134905h3;
            this.f201799j = i;
            if (i < 0) {
                kyv.m152151i("PesReader", "Found negative packet payload size: " + this.f201799j);
                this.f201799j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* JADX INFO: renamed from: f */
    public final void m217583f() {
        this.f201791b.m134913p(0);
        this.f201801l = -9223372036854775807L;
        if (this.f201795f) {
            this.f201791b.m134915r(4);
            long jM134905h = ((long) this.f201791b.m134905h(3)) << 30;
            this.f201791b.m134915r(1);
            long jM134905h2 = jM134905h | ((long) (this.f201791b.m134905h(15) << 15));
            this.f201791b.m134915r(1);
            long jM134905h3 = jM134905h2 | ((long) this.f201791b.m134905h(15));
            this.f201791b.m134915r(1);
            if (!this.f201797h && this.f201796g) {
                this.f201791b.m134915r(4);
                long jM134905h4 = ((long) this.f201791b.m134905h(3)) << 30;
                this.f201791b.m134915r(1);
                long jM134905h5 = jM134905h4 | ((long) (this.f201791b.m134905h(15) << 15));
                this.f201791b.m134915r(1);
                long jM134905h6 = jM134905h5 | ((long) this.f201791b.m134905h(15));
                this.f201791b.m134915r(1);
                this.f201794e.m133174b(jM134905h6);
                this.f201797h = true;
            }
            this.f201801l = this.f201794e.m133174b(jM134905h3);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m217584g(int i) {
        this.f201792c = i;
        this.f201793d = 0;
    }
}
