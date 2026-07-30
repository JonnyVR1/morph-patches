package p149l;

import com.google.android.exoplayer2.C1871k;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ozf0 {

    /* JADX INFO: renamed from: b */
    public m6j0 f146423b;

    /* JADX INFO: renamed from: c */
    public uqf f146424c;

    /* JADX INFO: renamed from: d */
    public f850 f146425d;

    /* JADX INFO: renamed from: e */
    public long f146426e;

    /* JADX INFO: renamed from: f */
    public long f146427f;

    /* JADX INFO: renamed from: g */
    public long f146428g;

    /* JADX INFO: renamed from: h */
    public int f146429h;

    /* JADX INFO: renamed from: i */
    public int f146430i;

    /* JADX INFO: renamed from: k */
    public long f146432k;

    /* JADX INFO: renamed from: l */
    public boolean f146433l;

    /* JADX INFO: renamed from: m */
    public boolean f146434m;

    /* JADX INFO: renamed from: a */
    public final d850 f146422a = new d850();

    /* JADX INFO: renamed from: j */
    public C19085b f146431j = new C19085b();

    /* JADX INFO: renamed from: l.ozf0$b */
    public static class C19085b {

        /* JADX INFO: renamed from: a */
        public C1871k f146435a;

        /* JADX INFO: renamed from: b */
        public f850 f146436b;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* JADX INFO: renamed from: a */
    public final void m166758a() {
        p11.m167015i(this.f146423b);
        vck0.m197866j(this.f146424c);
    }

    /* JADX INFO: renamed from: b */
    public long m166759b(long j) {
        return (j * 1000000) / ((long) this.f146430i);
    }

    /* JADX INFO: renamed from: c */
    public long m166760c(long j) {
        return (((long) this.f146430i) * j) / 1000000;
    }

    /* JADX INFO: renamed from: d */
    public void m166761d(uqf uqfVar, m6j0 m6j0Var) {
        this.f146424c = uqfVar;
        this.f146423b = m6j0Var;
        mo166769l(true);
    }

    /* JADX INFO: renamed from: e */
    public void mo166762e(long j) {
        this.f146428g = j;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo166763f(d860 d860Var);

    /* JADX INFO: renamed from: g */
    public final int m166764g(tqf tqfVar, fd80 fd80Var) throws IOException {
        m166758a();
        int i = this.f146429h;
        if (i == 0) {
            return m166767j(tqfVar);
        }
        if (i == 1) {
            tqfVar.mo150661o((int) this.f146427f);
            this.f146429h = 2;
            return 0;
        }
        if (i == 2) {
            vck0.m197866j(this.f146425d);
            return m166768k(tqfVar, fd80Var);
        }
        if (i == 3) {
            return -1;
        }
        ohg0.m164364a();
        return 0;
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* JADX INFO: renamed from: h */
    public final boolean m166765h(tqf tqfVar) throws IOException {
        while (this.f146422a.m110268d(tqfVar)) {
            this.f146432k = tqfVar.getPosition() - this.f146427f;
            if (!mo166766i(this.f146422a.m110267c(), this.f146427f, this.f146431j)) {
                return true;
            }
            this.f146427f = tqfVar.getPosition();
        }
        this.f146429h = 3;
        return false;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public abstract boolean mo166766i(d860 d860Var, long j, C19085b c19085b) throws IOException;

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: j */
    public final int m166767j(tqf tqfVar) throws IOException {
        if (!m166765h(tqfVar)) {
            return -1;
        }
        C1871k c1871k = this.f146431j.f146435a;
        this.f146430i = c1871k.f7762z;
        if (!this.f146434m) {
            this.f146423b.mo11110b(c1871k);
            this.f146434m = true;
        }
        f850 f850Var = this.f146431j.f146436b;
        if (f850Var != null) {
            this.f146425d = f850Var;
        } else if (tqfVar.getLength() == -1) {
            this.f146425d = new C19086c();
        } else {
            e850 e850VarM110266b = this.f146422a.m110266b();
            this.f146425d = new lpd(this, this.f146427f, tqfVar.getLength(), e850VarM110266b.f89801h + e850VarM110266b.f89802i, e850VarM110266b.f89796c, (e850VarM110266b.f89795b & 4) != 0);
        }
        this.f146429h = 2;
        this.f146422a.m110270f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /* JADX INFO: renamed from: k */
    public final int m166768k(tqf tqfVar, fd80 fd80Var) throws IOException {
        long jMo119869a = this.f146425d.mo119869a(tqfVar);
        if (jMo119869a >= 0) {
            fd80Var.f97018a = jMo119869a;
            return 1;
        }
        if (jMo119869a < -1) {
            mo166762e(-(jMo119869a + 2));
        }
        if (!this.f146433l) {
            this.f146424c.mo11370k((hce0) p11.m167015i(this.f146425d.mo119870b()));
            this.f146433l = true;
        }
        if (this.f146432k <= 0 && !this.f146422a.m110268d(tqfVar)) {
            this.f146429h = 3;
            return -1;
        }
        this.f146432k = 0L;
        d860 d860VarM110267c = this.f146422a.m110267c();
        long jMo166763f = mo166763f(d860VarM110267c);
        if (jMo166763f >= 0) {
            long j = this.f146428g;
            if (j + jMo166763f >= this.f146426e) {
                long jM166759b = m166759b(j);
                this.f146423b.m153238d(d860VarM110267c, d860VarM110267c.m110301g());
                this.f146423b.mo11109a(jM166759b, 1, d860VarM110267c.m110301g(), 0, null);
                this.f146426e = -1L;
            }
        }
        this.f146428g += jMo166763f;
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void mo166769l(boolean z) {
        if (z) {
            this.f146431j = new C19085b();
            this.f146427f = 0L;
            this.f146429h = 0;
        } else {
            this.f146429h = 1;
        }
        this.f146426e = -1L;
        this.f146428g = 0L;
    }

    /* JADX INFO: renamed from: m */
    public final void m166770m(long j, long j2) {
        this.f146422a.m110269e();
        if (j == 0) {
            mo166769l(!this.f146433l);
        } else if (this.f146429h != 0) {
            this.f146426e = m166760c(j2);
            ((f850) vck0.m197866j(this.f146425d)).mo119871c(this.f146426e);
            this.f146429h = 2;
        }
    }

    /* JADX INFO: renamed from: l.ozf0$c */
    public static final class C19086c implements f850 {
        public C19086c() {
        }

        @Override // p149l.f850
        /* JADX INFO: renamed from: a */
        public long mo119869a(tqf tqfVar) {
            return -1L;
        }

        @Override // p149l.f850
        /* JADX INFO: renamed from: b */
        public hce0 mo119870b() {
            return new hce0.C17275b(-9223372036854775807L);
        }

        @Override // p149l.f850
        /* JADX INFO: renamed from: c */
        public void mo119871c(long j) {
        }
    }
}
