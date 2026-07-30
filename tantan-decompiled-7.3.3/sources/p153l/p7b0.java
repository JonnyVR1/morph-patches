package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class p7b0 extends ey2 {

    /* JADX INFO: renamed from: l.p7b0$b */
    public static final class C19312b implements ey2.InterfaceC16862f {

        /* JADX INFO: renamed from: a */
        public final h0j0 f150910a;

        /* JADX INFO: renamed from: b */
        public final ig60 f150911b;

        public C19312b(h0j0 h0j0Var) {
            this.f150910a = h0j0Var;
            this.f150911b = new ig60();
        }

        /* JADX INFO: renamed from: d */
        public static void m171099d(ig60 ig60Var) {
            int iM171098k;
            int iM139817g = ig60Var.m139817g();
            if (ig60Var.m139811a() < 10) {
                ig60Var.m139808U(iM139817g);
                return;
            }
            ig60Var.m139809V(9);
            int iM139795H = ig60Var.m139795H() & 7;
            if (ig60Var.m139811a() < iM139795H) {
                ig60Var.m139808U(iM139817g);
                return;
            }
            ig60Var.m139809V(iM139795H);
            if (ig60Var.m139811a() < 4) {
                ig60Var.m139808U(iM139817g);
                return;
            }
            if (p7b0.m171098k(ig60Var.m139815e(), ig60Var.m139816f()) == 443) {
                ig60Var.m139809V(4);
                int iM139801N = ig60Var.m139801N();
                if (ig60Var.m139811a() < iM139801N) {
                    ig60Var.m139808U(iM139817g);
                    return;
                }
                ig60Var.m139809V(iM139801N);
            }
            while (ig60Var.m139811a() >= 4 && (iM171098k = p7b0.m171098k(ig60Var.m139815e(), ig60Var.m139816f())) != 442 && iM171098k != 441 && (iM171098k >>> 8) == 1) {
                ig60Var.m139809V(4);
                if (ig60Var.m139811a() < 2) {
                    ig60Var.m139808U(iM139817g);
                    return;
                }
                ig60Var.m139808U(Math.min(ig60Var.m139817g(), ig60Var.m139816f() + ig60Var.m139801N()));
            }
        }

        @Override // p153l.ey2.InterfaceC16862f
        /* JADX INFO: renamed from: a */
        public ey2.C16861e mo123166a(asf asfVar, long j) throws IOException {
            long position = asfVar.getPosition();
            int iMin = (int) Math.min(20000L, asfVar.getLength() - position);
            this.f150911b.m139804Q(iMin);
            asfVar.mo99900f(this.f150911b.m139815e(), 0, iMin);
            return m171100c(this.f150911b, j, position);
        }

        @Override // p153l.ey2.InterfaceC16862f
        /* JADX INFO: renamed from: b */
        public void mo123167b() {
            this.f150911b.m139805R(bmk0.f77318f);
        }

        /* JADX INFO: renamed from: c */
        public final ey2.C16861e m171100c(ig60 ig60Var, long j, long j2) {
            int iM139816f = -1;
            int iM139816f2 = -1;
            long j3 = -9223372036854775807L;
            while (ig60Var.m139811a() >= 4) {
                if (p7b0.m171098k(ig60Var.m139815e(), ig60Var.m139816f()) != 442) {
                    ig60Var.m139809V(1);
                } else {
                    ig60Var.m139809V(4);
                    long jM175641l = q7b0.m175641l(ig60Var);
                    if (jM175641l != -9223372036854775807L) {
                        long jM133174b = this.f150910a.m133174b(jM175641l);
                        if (jM133174b > j) {
                            return j3 == -9223372036854775807L ? ey2.C16861e.m123163d(jM133174b, j2) : ey2.C16861e.m123164e(j2 + ((long) iM139816f2));
                        }
                        if (100000 + jM133174b > j) {
                            return ey2.C16861e.m123164e(j2 + ((long) ig60Var.m139816f()));
                        }
                        iM139816f2 = ig60Var.m139816f();
                        j3 = jM133174b;
                    }
                    m171099d(ig60Var);
                    iM139816f = ig60Var.m139816f();
                }
            }
            return j3 != -9223372036854775807L ? ey2.C16861e.m123165f(j3, j2 + ((long) iM139816f)) : ey2.C16861e.f96387d;
        }
    }

    public p7b0(h0j0 h0j0Var, long j, long j2) {
        super(new ey2.C16858b(), new C19312b(h0j0Var), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: renamed from: k */
    public static int m171098k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
