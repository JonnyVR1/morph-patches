package p149l;

import java.io.IOException;

/* JADX INFO: renamed from: l.c9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C16095c9 implements sqf {

    /* JADX INFO: renamed from: d */
    public static final xqf f79833d = new xqf() { // from class: l.b9
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return C16095c9.m105825c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final C16314d9 f79834a = new C16314d9();

    /* JADX INFO: renamed from: b */
    public final d860 f79835b = new d860(2786);

    /* JADX INFO: renamed from: c */
    public boolean f79836c;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m105825c() {
        return new sqf[]{new C16095c9()};
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f79836c = false;
        this.f79834a.mo95481b();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f79834a.mo95484e(uqfVar, new fbj0.C16793d(0, 1));
        uqfVar.mo11371l();
        uqfVar.mo11370k(new hce0.C17275b(-9223372036854775807L));
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        d860 d860Var = new d860(10);
        int i = 0;
        while (true) {
            tqfVar.mo150655f(d860Var.m110299e(), 0, 10);
            d860Var.m110292U(0);
            if (d860Var.m110282K() != 4801587) {
                break;
            }
            d860Var.m110293V(3);
            int iM110278G = d860Var.m110278G();
            i += iM110278G + 10;
            tqfVar.mo150660m(iM110278G);
        }
        tqfVar.mo150657h();
        tqfVar.mo150660m(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            tqfVar.mo150655f(d860Var.m110299e(), 0, 6);
            d860Var.m110292U(0);
            if (d860Var.m110285N() != 2935) {
                tqfVar.mo150657h();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                tqfVar.mo150660m(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM115325g = C16561e9.m115325g(d860Var.m110299e());
                if (iM115325g == -1) {
                    return false;
                }
                tqfVar.mo150660m(iM115325g - 6);
            }
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        int i = tqfVar.read(this.f79835b.m110299e(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f79835b.m110292U(0);
        this.f79835b.m110291T(i);
        if (!this.f79836c) {
            this.f79834a.mo95483d(0L, 4);
            this.f79836c = true;
        }
        this.f79834a.mo95480a(this.f79835b);
        return 0;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
