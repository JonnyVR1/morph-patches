package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.c9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C16211c9 implements hte {

    /* JADX INFO: renamed from: a */
    public final hg60 f80264a;

    /* JADX INFO: renamed from: b */
    public final ig60 f80265b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f80266c;

    /* JADX INFO: renamed from: d */
    public String f80267d;

    /* JADX INFO: renamed from: e */
    public qfj0 f80268e;

    /* JADX INFO: renamed from: f */
    public int f80269f;

    /* JADX INFO: renamed from: g */
    public int f80270g;

    /* JADX INFO: renamed from: h */
    public boolean f80271h;

    /* JADX INFO: renamed from: i */
    public boolean f80272i;

    /* JADX INFO: renamed from: j */
    public long f80273j;

    /* JADX INFO: renamed from: k */
    public C1894k f80274k;

    /* JADX INFO: renamed from: l */
    public int f80275l;

    /* JADX INFO: renamed from: m */
    public long f80276m;

    public C16211c9(@Nullable String str) {
        hg60 hg60Var = new hg60(new byte[16]);
        this.f80264a = hg60Var;
        this.f80265b = new ig60(hg60Var.f109369a);
        this.f80269f = 0;
        this.f80270g = 0;
        this.f80271h = false;
        this.f80272i = false;
        this.f80276m = -9223372036854775807L;
        this.f80266c = str;
    }

    /* JADX INFO: renamed from: f */
    private boolean m108396f(ig60 ig60Var, byte[] bArr, int i) {
        int iMin = Math.min(ig60Var.m139811a(), i - this.f80270g);
        ig60Var.m139822l(bArr, this.f80270g, iMin);
        int i2 = this.f80270g + iMin;
        this.f80270g = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    private void m108397g() {
        this.f80264a.m134913p(0);
        C16484d9.b bVarM114991d = C16484d9.m114991d(this.f80264a);
        C1894k c1894k = this.f80274k;
        if (c1894k == null || bVarM114991d.f85697c != c1894k.f7798y || bVarM114991d.f85696b != c1894k.f7799z || !"audio/ac4".equals(c1894k.f7785l)) {
            C1894k c1894kM10374G = new C1894k.b().m10388U(this.f80267d).m10400g0("audio/ac4").m10377J(bVarM114991d.f85697c).m10401h0(bVarM114991d.f85696b).m10391X(this.f80266c).m10374G();
            this.f80274k = c1894kM10374G;
            this.f80268e.mo11164b(c1894kM10374G);
        }
        this.f80275l = bVarM114991d.f85698d;
        this.f80273j = (((long) bVarM114991d.f85699e) * 1000000) / ((long) this.f80274k.f7799z);
    }

    /* JADX INFO: renamed from: h */
    private boolean m108398h(ig60 ig60Var) {
        while (true) {
            if (ig60Var.m139811a() <= 0) {
                return false;
            }
            if (this.f80271h) {
                int iM139795H = ig60Var.m139795H();
                this.f80271h = iM139795H == 172;
                if (iM139795H == 64 || iM139795H == 65) {
                    this.f80272i = iM139795H == 65;
                    return true;
                }
            } else {
                this.f80271h = ig60Var.m139795H() == 172;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        w11.m204373i(this.f80268e);
        while (ig60Var.m139811a() > 0) {
            int i = this.f80269f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(ig60Var.m139811a(), this.f80275l - this.f80270g);
                        this.f80268e.m176370d(ig60Var, iMin);
                        int i2 = this.f80270g + iMin;
                        this.f80270g = i2;
                        int i3 = this.f80275l;
                        if (i2 == i3) {
                            long j = this.f80276m;
                            if (j != -9223372036854775807L) {
                                this.f80268e.mo11163a(j, 1, i3, 0, null);
                                this.f80276m += this.f80273j;
                            }
                            this.f80269f = 0;
                        }
                    }
                } else if (m108396f(ig60Var, this.f80265b.m139815e(), 16)) {
                    m108397g();
                    this.f80265b.m139808U(0);
                    this.f80268e.m176370d(this.f80265b, 16);
                    this.f80269f = 2;
                }
            } else if (m108398h(ig60Var)) {
                this.f80269f = 1;
                this.f80265b.m139815e()[0] = -84;
                this.f80265b.m139815e()[1] = (byte) (this.f80272i ? 65 : 64);
                this.f80270g = 2;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f80269f = 0;
        this.f80270g = 0;
        this.f80271h = false;
        this.f80272i = false;
        this.f80276m = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f80276m = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f80267d = c17969d.m145855b();
        this.f80268e = bsfVar.mo11416b(c17969d.m145856c(), 1);
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }

    public C16211c9() {
        this(null);
    }
}
