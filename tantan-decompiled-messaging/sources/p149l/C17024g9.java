package p149l;

import java.io.IOException;

/* JADX INFO: renamed from: l.g9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C17024g9 implements sqf {

    /* JADX INFO: renamed from: d */
    public static final xqf f101533d = new xqf() { // from class: l.f9
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return C17024g9.m124775c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final C17247h9 f101534a = new C17247h9();

    /* JADX INFO: renamed from: b */
    public final d860 f101535b = new d860(16384);

    /* JADX INFO: renamed from: c */
    public boolean f101536c;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m124775c() {
        return new sqf[]{new C17024g9()};
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f101536c = false;
        this.f101534a.mo95481b();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f101534a.mo95484e(uqfVar, new fbj0.C16793d(0, 1));
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
            tqfVar.mo150655f(d860Var.m110299e(), 0, 7);
            d860Var.m110292U(0);
            int iM110285N = d860Var.m110285N();
            if (iM110285N == 44096 || iM110285N == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM134997e = C17507i9.m134997e(d860Var.m110299e(), iM110285N);
                if (iM134997e == -1) {
                    return false;
                }
                tqfVar.mo150660m(iM134997e - 7);
            } else {
                tqfVar.mo150657h();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                tqfVar.mo150660m(i3);
                i2 = 0;
            }
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        int i = tqfVar.read(this.f101535b.m110299e(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f101535b.m110292U(0);
        this.f101535b.m110291T(i);
        if (!this.f101536c) {
            this.f101534a.mo95483d(0L, 4);
            this.f101536c = true;
        }
        this.f101534a.mo95480a(this.f101535b);
        return 0;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
