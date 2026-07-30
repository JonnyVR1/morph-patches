package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class h710 implements hte {

    /* JADX INFO: renamed from: a */
    public final ig60 f108077a;

    /* JADX INFO: renamed from: b */
    public final i710.C17660a f108078b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f108079c;

    /* JADX INFO: renamed from: d */
    public qfj0 f108080d;

    /* JADX INFO: renamed from: e */
    public String f108081e;

    /* JADX INFO: renamed from: f */
    public int f108082f;

    /* JADX INFO: renamed from: g */
    public int f108083g;

    /* JADX INFO: renamed from: h */
    public boolean f108084h;

    /* JADX INFO: renamed from: i */
    public boolean f108085i;

    /* JADX INFO: renamed from: j */
    public long f108086j;

    /* JADX INFO: renamed from: k */
    public int f108087k;

    /* JADX INFO: renamed from: l */
    public long f108088l;

    public h710(@Nullable String str) {
        this.f108082f = 0;
        ig60 ig60Var = new ig60(4);
        this.f108077a = ig60Var;
        ig60Var.m139815e()[0] = -1;
        this.f108078b = new i710.C17660a();
        this.f108088l = -9223372036854775807L;
        this.f108079c = str;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        w11.m204373i(this.f108080d);
        while (ig60Var.m139811a() > 0) {
            int i = this.f108082f;
            if (i == 0) {
                m133757f(ig60Var);
            } else if (i == 1) {
                m133759h(ig60Var);
            } else {
                if (i != 2) {
                    wpg0.m207458a();
                    return;
                }
                m133758g(ig60Var);
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f108082f = 0;
        this.f108083g = 0;
        this.f108085i = false;
        this.f108088l = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f108088l = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f108081e = c17969d.m145855b();
        this.f108080d = bsfVar.mo11416b(c17969d.m145856c(), 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m133757f(ig60 ig60Var) {
        byte[] bArrM139815e = ig60Var.m139815e();
        int iM139817g = ig60Var.m139817g();
        for (int iM139816f = ig60Var.m139816f(); iM139816f < iM139817g; iM139816f++) {
            byte b = bArrM139815e[iM139816f];
            boolean z = (b & 255) == 255;
            boolean z2 = this.f108085i && (b & 224) == 224;
            this.f108085i = z;
            if (z2) {
                ig60Var.m139808U(iM139816f + 1);
                this.f108085i = false;
                this.f108077a.m139815e()[1] = bArrM139815e[iM139816f];
                this.f108083g = 2;
                this.f108082f = 1;
                return;
            }
        }
        ig60Var.m139808U(iM139817g);
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    public final void m133758g(ig60 ig60Var) {
        int iMin = Math.min(ig60Var.m139811a(), this.f108087k - this.f108083g);
        this.f108080d.m176370d(ig60Var, iMin);
        int i = this.f108083g + iMin;
        this.f108083g = i;
        int i2 = this.f108087k;
        if (i < i2) {
            return;
        }
        long j = this.f108088l;
        if (j != -9223372036854775807L) {
            this.f108080d.mo11163a(j, 1, i2, 0, null);
            this.f108088l += this.f108086j;
        }
        this.f108083g = 0;
        this.f108082f = 0;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: h */
    public final void m133759h(ig60 ig60Var) {
        int iMin = Math.min(ig60Var.m139811a(), 4 - this.f108083g);
        ig60Var.m139822l(this.f108077a.m139815e(), this.f108083g, iMin);
        int i = this.f108083g + iMin;
        this.f108083g = i;
        if (i < 4) {
            return;
        }
        this.f108077a.m139808U(0);
        if (!this.f108078b.m138914a(this.f108077a.m139827q())) {
            this.f108083g = 0;
            this.f108082f = 1;
            return;
        }
        i710.C17660a c17660a = this.f108078b;
        this.f108087k = c17660a.f113228c;
        if (!this.f108084h) {
            this.f108086j = (((long) c17660a.f113232g) * 1000000) / ((long) c17660a.f113229d);
            this.f108080d.mo11164b(new C1894k.b().m10388U(this.f108081e).m10400g0(this.f108078b.f113227b).m10392Y(4096).m10377J(this.f108078b.f113230e).m10401h0(this.f108078b.f113229d).m10391X(this.f108079c).m10374G());
            this.f108084h = true;
        }
        this.f108077a.m139808U(0);
        this.f108080d.m176370d(this.f108077a, 4);
        this.f108082f = 2;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }

    public h710() {
        this(null);
    }
}
