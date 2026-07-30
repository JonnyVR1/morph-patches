package p149l;

import com.google.android.exoplayer2.C1871k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class uee implements dse {

    /* JADX INFO: renamed from: a */
    public final List<fbj0.C16790a> f176026a;

    /* JADX INFO: renamed from: b */
    public final m6j0[] f176027b;

    /* JADX INFO: renamed from: c */
    public boolean f176028c;

    /* JADX INFO: renamed from: d */
    public int f176029d;

    /* JADX INFO: renamed from: e */
    public int f176030e;

    /* JADX INFO: renamed from: f */
    public long f176031f = -9223372036854775807L;

    public uee(List<fbj0.C16790a> list) {
        this.f176026a = list;
        this.f176027b = new m6j0[list.size()];
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        if (this.f176028c) {
            if (this.f176029d != 2 || m193242f(d860Var, 32)) {
                if (this.f176029d != 1 || m193242f(d860Var, 0)) {
                    int iM110300f = d860Var.m110300f();
                    int iM110295a = d860Var.m110295a();
                    for (m6j0 m6j0Var : this.f176027b) {
                        d860Var.m110292U(iM110300f);
                        m6j0Var.m153238d(d860Var, iM110295a);
                    }
                    this.f176030e += iM110295a;
                }
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f176028c = false;
        this.f176031f = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
        if (this.f176028c) {
            if (this.f176031f != -9223372036854775807L) {
                for (m6j0 m6j0Var : this.f176027b) {
                    m6j0Var.mo11109a(this.f176031f, 1, this.f176030e, 0, null);
                }
            }
            this.f176028c = false;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f176028c = true;
        if (j != -9223372036854775807L) {
            this.f176031f = j;
        }
        this.f176030e = 0;
        this.f176029d = 2;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        for (int i = 0; i < this.f176027b.length; i++) {
            fbj0.C16790a c16790a = this.f176026a.get(i);
            c16793d.m120357a();
            m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 3);
            m6j0VarMo11362b.mo11110b(new C1871k.b().m10334U(c16793d.m120358b()).m10346g0("application/dvbsubs").m10335V(Collections.singletonList(c16790a.f96724c)).m10337X(c16790a.f96722a).m10320G());
            this.f176027b[i] = m6j0VarMo11362b;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m193242f(d860 d860Var, int i) {
        if (d860Var.m110295a() == 0) {
            return false;
        }
        if (d860Var.m110279H() != i) {
            this.f176028c = false;
        }
        this.f176029d--;
        return this.f176028c;
    }
}
