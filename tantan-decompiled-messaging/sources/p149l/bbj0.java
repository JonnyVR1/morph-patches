package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bbj0 extends px2 {

    /* JADX INFO: renamed from: l.bbj0$a */
    public static final class C15832a implements px2.InterfaceC19359f {

        /* JADX INFO: renamed from: a */
        public final eri0 f74846a;

        /* JADX INFO: renamed from: b */
        public final d860 f74847b = new d860();

        /* JADX INFO: renamed from: c */
        public final int f74848c;

        /* JADX INFO: renamed from: d */
        public final int f74849d;

        public C15832a(int i, eri0 eri0Var, int i2) {
            this.f74848c = i;
            this.f74846a = eri0Var;
            this.f74849d = i2;
        }

        @Override // p149l.px2.InterfaceC19359f
        /* JADX INFO: renamed from: a */
        public px2.C19358e mo100975a(tqf tqfVar, long j) throws IOException {
            long position = tqfVar.getPosition();
            int iMin = (int) Math.min(this.f74849d, tqfVar.getLength() - position);
            this.f74847b.m110288Q(iMin);
            tqfVar.mo150655f(this.f74847b.m110299e(), 0, iMin);
            return m100977c(this.f74847b, j, position);
        }

        @Override // p149l.px2.InterfaceC19359f
        /* JADX INFO: renamed from: b */
        public void mo100976b() {
            this.f74847b.m110289R(vck0.f180953f);
        }

        /* JADX INFO: renamed from: c */
        public final px2.C19358e m100977c(d860 d860Var, long j, long j2) {
            int iM125142a;
            int iM125142a2;
            int iM110301g = d860Var.m110301g();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (d860Var.m110295a() >= 188 && (iM125142a2 = (iM125142a = gbj0.m125142a(d860Var.m110299e(), d860Var.m110300f(), iM110301g)) + 188) <= iM110301g) {
                long jM125144c = gbj0.m125144c(d860Var, iM125142a, this.f74848c);
                if (jM125144c != -9223372036854775807L) {
                    long jM117837b = this.f74846a.m117837b(jM125144c);
                    if (jM117837b > j) {
                        return j5 == -9223372036854775807L ? px2.C19358e.m171816d(jM117837b, j2) : px2.C19358e.m171817e(j2 + j4);
                    }
                    if (100000 + jM117837b > j) {
                        return px2.C19358e.m171817e(((long) iM125142a) + j2);
                    }
                    j4 = iM125142a;
                    j5 = jM117837b;
                }
                d860Var.m110292U(iM125142a2);
                j3 = iM125142a2;
            }
            return j5 != -9223372036854775807L ? px2.C19358e.m171818f(j5, j2 + j3) : px2.C19358e.f151634d;
        }
    }

    public bbj0(eri0 eri0Var, long j, long j2, int i, int i2) {
        super(new px2.C19355b(), new C15832a(i, eri0Var, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
