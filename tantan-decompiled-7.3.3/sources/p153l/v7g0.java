package p153l;

import com.google.android.exoplayer2.C1894k;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class v7g0 {

    /* JADX INFO: renamed from: b */
    public qfj0 f182759b;

    /* JADX INFO: renamed from: c */
    public bsf f182760c;

    /* JADX INFO: renamed from: d */
    public mg50 f182761d;

    /* JADX INFO: renamed from: e */
    public long f182762e;

    /* JADX INFO: renamed from: f */
    public long f182763f;

    /* JADX INFO: renamed from: g */
    public long f182764g;

    /* JADX INFO: renamed from: h */
    public int f182765h;

    /* JADX INFO: renamed from: i */
    public int f182766i;

    /* JADX INFO: renamed from: k */
    public long f182768k;

    /* JADX INFO: renamed from: l */
    public boolean f182769l;

    /* JADX INFO: renamed from: m */
    public boolean f182770m;

    /* JADX INFO: renamed from: a */
    public final kg50 f182758a = new kg50();

    /* JADX INFO: renamed from: j */
    public C20782b f182767j = new C20782b();

    /* JADX INFO: renamed from: l.v7g0$b */
    public static class C20782b {

        /* JADX INFO: renamed from: a */
        public C1894k f182771a;

        /* JADX INFO: renamed from: b */
        public mg50 f182772b;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* JADX INFO: renamed from: a */
    public final void m200194a() {
        w11.m204373i(this.f182759b);
        bmk0.m105144j(this.f182760c);
    }

    /* JADX INFO: renamed from: b */
    public long m200195b(long j) {
        return (j * 1000000) / ((long) this.f182766i);
    }

    /* JADX INFO: renamed from: c */
    public long m200196c(long j) {
        return (((long) this.f182766i) * j) / 1000000;
    }

    /* JADX INFO: renamed from: d */
    public void m200197d(bsf bsfVar, qfj0 qfj0Var) {
        this.f182760c = bsfVar;
        this.f182759b = qfj0Var;
        mo105606l(true);
    }

    /* JADX INFO: renamed from: e */
    public void mo105603e(long j) {
        this.f182764g = j;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo105604f(ig60 ig60Var);

    /* JADX INFO: renamed from: g */
    public final int m200198g(asf asfVar, ll80 ll80Var) throws IOException {
        m200194a();
        int i = this.f182765h;
        if (i == 0) {
            return m200200j(asfVar);
        }
        if (i == 1) {
            asfVar.mo99905o((int) this.f182763f);
            this.f182765h = 2;
            return 0;
        }
        if (i == 2) {
            bmk0.m105144j(this.f182761d);
            return m200201k(asfVar, ll80Var);
        }
        if (i == 3) {
            return -1;
        }
        wpg0.m207458a();
        return 0;
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* JADX INFO: renamed from: h */
    public final boolean m200199h(asf asfVar) throws IOException {
        while (this.f182758a.m149739d(asfVar)) {
            this.f182768k = asfVar.getPosition() - this.f182763f;
            if (!mo105605i(this.f182758a.m149738c(), this.f182763f, this.f182767j)) {
                return true;
            }
            this.f182763f = asfVar.getPosition();
        }
        this.f182765h = 3;
        return false;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public abstract boolean mo105605i(ig60 ig60Var, long j, C20782b c20782b) throws IOException;

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: j */
    public final int m200200j(asf asfVar) throws IOException {
        if (!m200199h(asfVar)) {
            return -1;
        }
        C1894k c1894k = this.f182767j.f182771a;
        this.f182766i = c1894k.f7799z;
        if (!this.f182770m) {
            this.f182759b.mo11164b(c1894k);
            this.f182770m = true;
        }
        mg50 mg50Var = this.f182767j.f182772b;
        if (mg50Var != null) {
            this.f182761d = mg50Var;
        } else if (asfVar.getLength() == -1) {
            this.f182761d = new C20783c();
        } else {
            lg50 lg50VarM149737b = this.f182758a.m149737b();
            this.f182761d = new qqd(this, this.f182763f, asfVar.getLength(), lg50VarM149737b.f131938h + lg50VarM149737b.f131939i, lg50VarM149737b.f131933c, (lg50VarM149737b.f131932b & 4) != 0);
        }
        this.f182765h = 2;
        this.f182758a.m149741f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /* JADX INFO: renamed from: k */
    public final int m200201k(asf asfVar, ll80 ll80Var) throws IOException {
        long jMo158186a = this.f182761d.mo158186a(asfVar);
        if (jMo158186a >= 0) {
            ll80Var.f132534a = jMo158186a;
            return 1;
        }
        if (jMo158186a < -1) {
            mo105603e(-(jMo158186a + 2));
        }
        if (!this.f182769l) {
            this.f182760c.mo11424k((mke0) w11.m204373i(this.f182761d.mo158187b()));
            this.f182769l = true;
        }
        if (this.f182768k <= 0 && !this.f182758a.m149739d(asfVar)) {
            this.f182765h = 3;
            return -1;
        }
        this.f182768k = 0L;
        ig60 ig60VarM149738c = this.f182758a.m149738c();
        long jMo105604f = mo105604f(ig60VarM149738c);
        if (jMo105604f >= 0) {
            long j = this.f182764g;
            if (j + jMo105604f >= this.f182762e) {
                long jM200195b = m200195b(j);
                this.f182759b.m176370d(ig60VarM149738c, ig60VarM149738c.m139817g());
                this.f182759b.mo11163a(jM200195b, 1, ig60VarM149738c.m139817g(), 0, null);
                this.f182762e = -1L;
            }
        }
        this.f182764g += jMo105604f;
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void mo105606l(boolean z) {
        if (z) {
            this.f182767j = new C20782b();
            this.f182763f = 0L;
            this.f182765h = 0;
        } else {
            this.f182765h = 1;
        }
        this.f182762e = -1L;
        this.f182764g = 0L;
    }

    /* JADX INFO: renamed from: m */
    public final void m200202m(long j, long j2) {
        this.f182758a.m149740e();
        if (j == 0) {
            mo105606l(!this.f182769l);
        } else if (this.f182765h != 0) {
            this.f182762e = m200196c(j2);
            ((mg50) bmk0.m105144j(this.f182761d)).mo158188c(this.f182762e);
            this.f182765h = 2;
        }
    }

    /* JADX INFO: renamed from: l.v7g0$c */
    public static final class C20783c implements mg50 {
        public C20783c() {
        }

        @Override // p153l.mg50
        /* JADX INFO: renamed from: a */
        public long mo158186a(asf asfVar) {
            return -1L;
        }

        @Override // p153l.mg50
        /* JADX INFO: renamed from: b */
        public mke0 mo158187b() {
            return new mke0.C18641b(-9223372036854775807L);
        }

        @Override // p153l.mg50
        /* JADX INFO: renamed from: c */
        public void mo158188c(long j) {
        }
    }
}
