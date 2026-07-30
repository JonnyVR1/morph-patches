package p149l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class b850 implements sqf {

    /* JADX INFO: renamed from: d */
    public static final xqf f74065d = new xqf() { // from class: l.a850
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return b850.m100753c();
        }
    };

    /* JADX INFO: renamed from: a */
    public uqf f74066a;

    /* JADX INFO: renamed from: b */
    public ozf0 f74067b;

    /* JADX INFO: renamed from: c */
    public boolean f74068c;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m100753c() {
        return new sqf[]{new b850()};
    }

    /* JADX INFO: renamed from: d */
    public static d860 m100754d(d860 d860Var) {
        d860Var.m110292U(0);
        return d860Var;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        ozf0 ozf0Var = this.f74067b;
        if (ozf0Var != null) {
            ozf0Var.m166770m(j, j2);
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f74066a = uqfVar;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: e */
    public final boolean m100755e(tqf tqfVar) throws IOException {
        e850 e850Var = new e850();
        if (e850Var.m115239a(tqfVar, true) && (e850Var.f89795b & 2) == 2) {
            int iMin = Math.min(e850Var.f89802i, 8);
            d860 d860Var = new d860(iMin);
            tqfVar.mo150655f(d860Var.m110299e(), 0, iMin);
            if (zoi.m219561p(m100754d(d860Var))) {
                this.f74067b = new zoi();
            } else if (xdp0.m208422r(m100754d(d860Var))) {
                this.f74067b = new xdp0();
            } else if (qx50.m176944o(m100754d(d860Var))) {
                this.f74067b = new qx50();
            }
            return true;
        }
        return false;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        try {
            return m100755e(tqfVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        p11.m167015i(this.f74066a);
        if (this.f74067b == null) {
            if (!m100755e(tqfVar)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            tqfVar.mo150657h();
        }
        if (!this.f74068c) {
            m6j0 m6j0VarMo11362b = this.f74066a.mo11362b(0, 1);
            this.f74066a.mo11371l();
            this.f74067b.m166761d(this.f74066a, m6j0VarMo11362b);
            this.f74068c = true;
        }
        return this.f74067b.m166764g(tqfVar, fd80Var);
    }

    @Override // p149l.sqf
    public void release() {
    }
}
