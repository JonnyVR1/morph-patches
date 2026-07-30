package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.y8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C21540y8 implements hte {

    /* JADX INFO: renamed from: a */
    public final hg60 f197909a;

    /* JADX INFO: renamed from: b */
    public final ig60 f197910b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f197911c;

    /* JADX INFO: renamed from: d */
    public String f197912d;

    /* JADX INFO: renamed from: e */
    public qfj0 f197913e;

    /* JADX INFO: renamed from: f */
    public int f197914f;

    /* JADX INFO: renamed from: g */
    public int f197915g;

    /* JADX INFO: renamed from: h */
    public boolean f197916h;

    /* JADX INFO: renamed from: i */
    public long f197917i;

    /* JADX INFO: renamed from: j */
    public C1894k f197918j;

    /* JADX INFO: renamed from: k */
    public int f197919k;

    /* JADX INFO: renamed from: l */
    public long f197920l;

    public C21540y8(@Nullable String str) {
        hg60 hg60Var = new hg60(new byte[128]);
        this.f197909a = hg60Var;
        this.f197910b = new ig60(hg60Var.f109369a);
        this.f197914f = 0;
        this.f197920l = -9223372036854775807L;
        this.f197911c = str;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        w11.m204373i(this.f197913e);
        while (ig60Var.m139811a() > 0) {
            int i = this.f197914f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(ig60Var.m139811a(), this.f197919k - this.f197915g);
                        this.f197913e.m176370d(ig60Var, iMin);
                        int i2 = this.f197915g + iMin;
                        this.f197915g = i2;
                        int i3 = this.f197919k;
                        if (i2 == i3) {
                            long j = this.f197920l;
                            if (j != -9223372036854775807L) {
                                this.f197913e.mo11163a(j, 1, i3, 0, null);
                                this.f197920l += this.f197917i;
                            }
                            this.f197914f = 0;
                        }
                    }
                } else if (m214707f(ig60Var, this.f197910b.m139815e(), 128)) {
                    m214708g();
                    this.f197910b.m139808U(0);
                    this.f197913e.m176370d(this.f197910b, 128);
                    this.f197914f = 2;
                }
            } else if (m214709h(ig60Var)) {
                this.f197914f = 1;
                this.f197910b.m139815e()[0] = 11;
                this.f197910b.m139815e()[1] = 119;
                this.f197915g = 2;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f197914f = 0;
        this.f197915g = 0;
        this.f197916h = false;
        this.f197920l = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f197920l = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f197912d = c17969d.m145855b();
        this.f197913e = bsfVar.mo11416b(c17969d.m145856c(), 1);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m214707f(ig60 ig60Var, byte[] bArr, int i) {
        int iMin = Math.min(ig60Var.m139811a(), i - this.f197915g);
        ig60Var.m139822l(bArr, this.f197915g, iMin);
        int i2 = this.f197915g + iMin;
        this.f197915g = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    public final void m214708g() {
        this.f197909a.m134913p(0);
        C21775z8.b bVarM218932f = C21775z8.m218932f(this.f197909a);
        C1894k c1894k = this.f197918j;
        if (c1894k == null || bVarM218932f.f203293d != c1894k.f7798y || bVarM218932f.f203292c != c1894k.f7799z || !bmk0.m105123c(bVarM218932f.f203290a, c1894k.f7785l)) {
            C1894k.b bVarM10395b0 = new C1894k.b().m10388U(this.f197912d).m10400g0(bVarM218932f.f203290a).m10377J(bVarM218932f.f203293d).m10401h0(bVarM218932f.f203292c).m10391X(this.f197911c).m10395b0(bVarM218932f.f203296g);
            if ("audio/ac3".equals(bVarM218932f.f203290a)) {
                bVarM10395b0.m10376I(bVarM218932f.f203296g);
            }
            C1894k c1894kM10374G = bVarM10395b0.m10374G();
            this.f197918j = c1894kM10374G;
            this.f197913e.mo11164b(c1894kM10374G);
        }
        this.f197919k = bVarM218932f.f203294e;
        this.f197917i = (((long) bVarM218932f.f203295f) * 1000000) / ((long) this.f197918j.f7799z);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m214709h(ig60 ig60Var) {
        while (true) {
            if (ig60Var.m139811a() <= 0) {
                return false;
            }
            if (this.f197916h) {
                int iM139795H = ig60Var.m139795H();
                if (iM139795H == 119) {
                    this.f197916h = false;
                    return true;
                }
                this.f197916h = iM139795H == 11;
            } else {
                this.f197916h = ig60Var.m139795H() == 11;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }

    public C21540y8() {
        this(null);
    }
}
