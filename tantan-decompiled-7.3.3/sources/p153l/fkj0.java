package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fkj0 extends ey2 {

    /* JADX INFO: renamed from: l.fkj0$a */
    public static final class C16999a implements ey2.InterfaceC16862f {

        /* JADX INFO: renamed from: a */
        public final h0j0 f99517a;

        /* JADX INFO: renamed from: b */
        public final ig60 f99518b = new ig60();

        /* JADX INFO: renamed from: c */
        public final int f99519c;

        /* JADX INFO: renamed from: d */
        public final int f99520d;

        public C16999a(int i, h0j0 h0j0Var, int i2) {
            this.f99519c = i;
            this.f99517a = h0j0Var;
            this.f99520d = i2;
        }

        @Override // p153l.ey2.InterfaceC16862f
        /* JADX INFO: renamed from: a */
        public ey2.C16861e mo123166a(asf asfVar, long j) throws IOException {
            long position = asfVar.getPosition();
            int iMin = (int) Math.min(this.f99520d, asfVar.getLength() - position);
            this.f99518b.m139804Q(iMin);
            asfVar.mo99900f(this.f99518b.m139815e(), 0, iMin);
            return m126007c(this.f99518b, j, position);
        }

        @Override // p153l.ey2.InterfaceC16862f
        /* JADX INFO: renamed from: b */
        public void mo123167b() {
            this.f99518b.m139805R(bmk0.f77318f);
        }

        /* JADX INFO: renamed from: c */
        public final ey2.C16861e m126007c(ig60 ig60Var, long j, long j2) {
            int iM150105a;
            int iM150105a2;
            int iM139817g = ig60Var.m139817g();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (ig60Var.m139811a() >= 188 && (iM150105a2 = (iM150105a = kkj0.m150105a(ig60Var.m139815e(), ig60Var.m139816f(), iM139817g)) + 188) <= iM139817g) {
                long jM150107c = kkj0.m150107c(ig60Var, iM150105a, this.f99519c);
                if (jM150107c != -9223372036854775807L) {
                    long jM133174b = this.f99517a.m133174b(jM150107c);
                    if (jM133174b > j) {
                        return j5 == -9223372036854775807L ? ey2.C16861e.m123163d(jM133174b, j2) : ey2.C16861e.m123164e(j2 + j4);
                    }
                    if (100000 + jM133174b > j) {
                        return ey2.C16861e.m123164e(((long) iM150105a) + j2);
                    }
                    j4 = iM150105a;
                    j5 = jM133174b;
                }
                ig60Var.m139808U(iM150105a2);
                j3 = iM150105a2;
            }
            return j5 != -9223372036854775807L ? ey2.C16861e.m123165f(j5, j2 + j3) : ey2.C16861e.f96387d;
        }
    }

    public fkj0(h0j0 h0j0Var, long j, long j2, int i, int i2) {
        super(new ey2.C16858b(), new C16999a(i, h0j0Var, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
