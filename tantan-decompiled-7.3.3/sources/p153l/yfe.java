package p153l;

import com.google.android.exoplayer2.C1894k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yfe implements hte {

    /* JADX INFO: renamed from: a */
    public final List<jkj0.C17966a> f199493a;

    /* JADX INFO: renamed from: b */
    public final qfj0[] f199494b;

    /* JADX INFO: renamed from: c */
    public boolean f199495c;

    /* JADX INFO: renamed from: d */
    public int f199496d;

    /* JADX INFO: renamed from: e */
    public int f199497e;

    /* JADX INFO: renamed from: f */
    public long f199498f = -9223372036854775807L;

    public yfe(List<jkj0.C17966a> list) {
        this.f199493a = list;
        this.f199494b = new qfj0[list.size()];
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        if (this.f199495c) {
            if (this.f199496d != 2 || m215559f(ig60Var, 32)) {
                if (this.f199496d != 1 || m215559f(ig60Var, 0)) {
                    int iM139816f = ig60Var.m139816f();
                    int iM139811a = ig60Var.m139811a();
                    for (qfj0 qfj0Var : this.f199494b) {
                        ig60Var.m139808U(iM139816f);
                        qfj0Var.m176370d(ig60Var, iM139811a);
                    }
                    this.f199497e += iM139811a;
                }
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f199495c = false;
        this.f199498f = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
        if (this.f199495c) {
            if (this.f199498f != -9223372036854775807L) {
                for (qfj0 qfj0Var : this.f199494b) {
                    qfj0Var.mo11163a(this.f199498f, 1, this.f199497e, 0, null);
                }
            }
            this.f199495c = false;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f199495c = true;
        if (j != -9223372036854775807L) {
            this.f199498f = j;
        }
        this.f199497e = 0;
        this.f199496d = 2;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        for (int i = 0; i < this.f199494b.length; i++) {
            jkj0.C17966a c17966a = this.f199493a.get(i);
            c17969d.m145854a();
            qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 3);
            qfj0VarMo11416b.mo11164b(new C1894k.b().m10388U(c17969d.m145855b()).m10400g0("application/dvbsubs").m10389V(Collections.singletonList(c17966a.f121412c)).m10391X(c17966a.f121410a).m10374G());
            this.f199494b[i] = qfj0VarMo11416b;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m215559f(ig60 ig60Var, int i) {
        if (ig60Var.m139811a() == 0) {
            return false;
        }
        if (ig60Var.m139795H() != i) {
            this.f199495c = false;
        }
        this.f199496d--;
        return this.f199495c;
    }
}
