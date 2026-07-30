package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lza0 extends px2 {

    /* JADX INFO: renamed from: l.lza0$b */
    public static final class C18359b implements px2.InterfaceC19359f {

        /* JADX INFO: renamed from: a */
        public final eri0 f130645a;

        /* JADX INFO: renamed from: b */
        public final d860 f130646b;

        public C18359b(eri0 eri0Var) {
            this.f130645a = eri0Var;
            this.f130646b = new d860();
        }

        /* JADX INFO: renamed from: d */
        public static void m152341d(d860 d860Var) {
            int iM152340k;
            int iM110301g = d860Var.m110301g();
            if (d860Var.m110295a() < 10) {
                d860Var.m110292U(iM110301g);
                return;
            }
            d860Var.m110293V(9);
            int iM110279H = d860Var.m110279H() & 7;
            if (d860Var.m110295a() < iM110279H) {
                d860Var.m110292U(iM110301g);
                return;
            }
            d860Var.m110293V(iM110279H);
            if (d860Var.m110295a() < 4) {
                d860Var.m110292U(iM110301g);
                return;
            }
            if (lza0.m152340k(d860Var.m110299e(), d860Var.m110300f()) == 443) {
                d860Var.m110293V(4);
                int iM110285N = d860Var.m110285N();
                if (d860Var.m110295a() < iM110285N) {
                    d860Var.m110292U(iM110301g);
                    return;
                }
                d860Var.m110293V(iM110285N);
            }
            while (d860Var.m110295a() >= 4 && (iM152340k = lza0.m152340k(d860Var.m110299e(), d860Var.m110300f())) != 442 && iM152340k != 441 && (iM152340k >>> 8) == 1) {
                d860Var.m110293V(4);
                if (d860Var.m110295a() < 2) {
                    d860Var.m110292U(iM110301g);
                    return;
                }
                d860Var.m110292U(Math.min(d860Var.m110301g(), d860Var.m110300f() + d860Var.m110285N()));
            }
        }

        @Override // p149l.px2.InterfaceC19359f
        /* JADX INFO: renamed from: a */
        public px2.C19358e mo100975a(tqf tqfVar, long j) throws IOException {
            long position = tqfVar.getPosition();
            int iMin = (int) Math.min(20000L, tqfVar.getLength() - position);
            this.f130646b.m110288Q(iMin);
            tqfVar.mo150655f(this.f130646b.m110299e(), 0, iMin);
            return m152342c(this.f130646b, j, position);
        }

        @Override // p149l.px2.InterfaceC19359f
        /* JADX INFO: renamed from: b */
        public void mo100976b() {
            this.f130646b.m110289R(vck0.f180953f);
        }

        /* JADX INFO: renamed from: c */
        public final px2.C19358e m152342c(d860 d860Var, long j, long j2) {
            int iM110300f = -1;
            int iM110300f2 = -1;
            long j3 = -9223372036854775807L;
            while (d860Var.m110295a() >= 4) {
                if (lza0.m152340k(d860Var.m110299e(), d860Var.m110300f()) != 442) {
                    d860Var.m110293V(1);
                } else {
                    d860Var.m110293V(4);
                    long jM157107l = mza0.m157107l(d860Var);
                    if (jM157107l != -9223372036854775807L) {
                        long jM117837b = this.f130645a.m117837b(jM157107l);
                        if (jM117837b > j) {
                            return j3 == -9223372036854775807L ? px2.C19358e.m171816d(jM117837b, j2) : px2.C19358e.m171817e(j2 + ((long) iM110300f2));
                        }
                        if (100000 + jM117837b > j) {
                            return px2.C19358e.m171817e(j2 + ((long) d860Var.m110300f()));
                        }
                        iM110300f2 = d860Var.m110300f();
                        j3 = jM117837b;
                    }
                    m152341d(d860Var);
                    iM110300f = d860Var.m110300f();
                }
            }
            return j3 != -9223372036854775807L ? px2.C19358e.m171818f(j3, j2 + ((long) iM110300f)) : px2.C19358e.f151634d;
        }
    }

    public lza0(eri0 eri0Var, long j, long j2) {
        super(new px2.C19355b(), new C18359b(eri0Var), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: renamed from: k */
    public static int m152340k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
