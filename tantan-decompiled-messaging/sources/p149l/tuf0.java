package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tuf0 implements uqf {

    /* JADX INFO: renamed from: a */
    public final long f172165a;

    /* JADX INFO: renamed from: b */
    public final uqf f172166b;

    /* JADX INFO: renamed from: l.tuf0$a */
    public class C20279a implements hce0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hce0 f172167a;

        public C20279a(hce0 hce0Var) {
            this.f172167a = hce0Var;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: d */
        public hce0.C17274a mo98121d(long j) {
            hce0.C17274a c17274aMo98121d = this.f172167a.mo98121d(j);
            jce0 jce0Var = c17274aMo98121d.f107040a;
            jce0 jce0Var2 = new jce0(jce0Var.f117295a, jce0Var.f117296b + tuf0.this.f172165a);
            jce0 jce0Var3 = c17274aMo98121d.f107041b;
            return new hce0.C17274a(jce0Var2, new jce0(jce0Var3.f117295a, jce0Var3.f117296b + tuf0.this.f172165a));
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: e */
        public boolean mo98122e() {
            return this.f172167a.mo98122e();
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: i */
        public long mo98123i() {
            return this.f172167a.mo98123i();
        }
    }

    public tuf0(long j, uqf uqfVar) {
        this.f172165a = j;
        this.f172166b = uqfVar;
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: b */
    public m6j0 mo11362b(int i, int i2) {
        return this.f172166b.mo11362b(i, i2);
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: k */
    public void mo11370k(hce0 hce0Var) {
        this.f172166b.mo11370k(new C20279a(hce0Var));
    }

    @Override // p149l.uqf
    /* JADX INFO: renamed from: l */
    public void mo11371l() {
        this.f172166b.mo11371l();
    }
}
