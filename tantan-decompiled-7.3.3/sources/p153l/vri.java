package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vri extends v7g0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public xri f185479n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public C20913a f185480o;

    /* JADX INFO: renamed from: l.vri$a */
    public static final class C20913a implements mg50 {

        /* JADX INFO: renamed from: a */
        public xri f185481a;

        /* JADX INFO: renamed from: b */
        public xri.C21431a f185482b;

        /* JADX INFO: renamed from: c */
        public long f185483c = -1;

        /* JADX INFO: renamed from: d */
        public long f185484d = -1;

        public C20913a(xri xriVar, xri.C21431a c21431a) {
            this.f185481a = xriVar;
            this.f185482b = c21431a;
        }

        @Override // p153l.mg50
        /* JADX INFO: renamed from: a */
        public long mo158186a(asf asfVar) {
            long j = this.f185484d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f185484d = -1L;
            return j2;
        }

        @Override // p153l.mg50
        /* JADX INFO: renamed from: b */
        public mke0 mo158187b() {
            w11.m204371g(this.f185483c != -1);
            return new wri(this.f185481a, this.f185483c);
        }

        @Override // p153l.mg50
        /* JADX INFO: renamed from: c */
        public void mo158188c(long j) {
            long[] jArr = this.f185482b.f195924a;
            this.f185484d = jArr[bmk0.m105141i(jArr, j, true, true)];
        }

        /* JADX INFO: renamed from: d */
        public void m202503d(long j) {
            this.f185483c = j;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m202500o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m202501p(ig60 ig60Var) {
        return ig60Var.m139811a() >= 5 && ig60Var.m139795H() == 127 && ig60Var.m139797J() == 1179402563;
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: f */
    public long mo105604f(ig60 ig60Var) {
        if (m202500o(ig60Var.m139815e())) {
            return m202502n(ig60Var);
        }
        return -1L;
    }

    @Override // p153l.v7g0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public boolean mo105605i(ig60 ig60Var, long j, v7g0.C20782b c20782b) {
        byte[] bArrM139815e = ig60Var.m139815e();
        xri xriVar = this.f185479n;
        if (xriVar == null) {
            xri xriVar2 = new xri(bArrM139815e, 17);
            this.f185479n = xriVar2;
            c20782b.f182771a = xriVar2.m212834g(Arrays.copyOfRange(bArrM139815e, 9, ig60Var.m139817g()), null);
            return true;
        }
        if ((bArrM139815e[0] & 127) == 3) {
            xri.C21431a c21431aM197608g = uri.m197608g(ig60Var);
            xri xriVarM212830b = xriVar.m212830b(c21431aM197608g);
            this.f185479n = xriVarM212830b;
            this.f185480o = new C20913a(xriVarM212830b, c21431aM197608g);
            return true;
        }
        if (!m202500o(bArrM139815e)) {
            return true;
        }
        C20913a c20913a = this.f185480o;
        if (c20913a != null) {
            c20913a.m202503d(j);
            c20782b.f182772b = this.f185480o;
        }
        w11.m204369e(c20782b.f182771a);
        return false;
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: l */
    public void mo105606l(boolean z) {
        super.mo105606l(z);
        if (z) {
            this.f185479n = null;
            this.f185480o = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m202502n(ig60 ig60Var) {
        int i = (ig60Var.m139815e()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            ig60Var.m139809V(4);
            ig60Var.m139802O();
        }
        int iM192510j = tri.m192510j(ig60Var, i);
        ig60Var.m139808U(0);
        return iM192510j;
    }
}
