package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zoi extends ozf0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public bpi f204115n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public C21742a f204116o;

    /* JADX INFO: renamed from: l.zoi$a */
    public static final class C21742a implements f850 {

        /* JADX INFO: renamed from: a */
        public bpi f204117a;

        /* JADX INFO: renamed from: b */
        public bpi.C15925a f204118b;

        /* JADX INFO: renamed from: c */
        public long f204119c = -1;

        /* JADX INFO: renamed from: d */
        public long f204120d = -1;

        public C21742a(bpi bpiVar, bpi.C15925a c15925a) {
            this.f204117a = bpiVar;
            this.f204118b = c15925a;
        }

        @Override // p149l.f850
        /* JADX INFO: renamed from: a */
        public long mo119869a(tqf tqfVar) {
            long j = this.f204120d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f204120d = -1L;
            return j2;
        }

        @Override // p149l.f850
        /* JADX INFO: renamed from: b */
        public hce0 mo119870b() {
            p11.m167013g(this.f204119c != -1);
            return new api(this.f204117a, this.f204119c);
        }

        @Override // p149l.f850
        /* JADX INFO: renamed from: c */
        public void mo119871c(long j) {
            long[] jArr = this.f204118b.f76640a;
            this.f204120d = jArr[vck0.m197863i(jArr, j, true, true)];
        }

        /* JADX INFO: renamed from: d */
        public void m219563d(long j) {
            this.f204119c = j;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m219560o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m219561p(d860 d860Var) {
        return d860Var.m110295a() >= 5 && d860Var.m110279H() == 127 && d860Var.m110281J() == 1179402563;
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: f */
    public long mo166763f(d860 d860Var) {
        if (m219560o(d860Var.m110299e())) {
            return m219562n(d860Var);
        }
        return -1L;
    }

    @Override // p149l.ozf0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public boolean mo166766i(d860 d860Var, long j, ozf0.C19085b c19085b) {
        byte[] bArrM110299e = d860Var.m110299e();
        bpi bpiVar = this.f204115n;
        if (bpiVar == null) {
            bpi bpiVar2 = new bpi(bArrM110299e, 17);
            this.f204115n = bpiVar2;
            c19085b.f146435a = bpiVar2.m103064g(Arrays.copyOfRange(bArrM110299e, 9, d860Var.m110301g()), null);
            return true;
        }
        if ((bArrM110299e[0] & 127) == 3) {
            bpi.C15925a c15925aM215509g = yoi.m215509g(d860Var);
            bpi bpiVarM103060b = bpiVar.m103060b(c15925aM215509g);
            this.f204115n = bpiVarM103060b;
            this.f204116o = new C21742a(bpiVarM103060b, c15925aM215509g);
            return true;
        }
        if (!m219560o(bArrM110299e)) {
            return true;
        }
        C21742a c21742a = this.f204116o;
        if (c21742a != null) {
            c21742a.m219563d(j);
            c19085b.f146436b = this.f204116o;
        }
        p11.m167011e(c19085b.f146435a);
        return false;
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: l */
    public void mo166769l(boolean z) {
        super.mo166769l(z);
        if (z) {
            this.f204115n = null;
            this.f204116o = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m219562n(d860 d860Var) {
        int i = (d860Var.m110299e()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            d860Var.m110293V(4);
            d860Var.m110286O();
        }
        int iM210428j = xoi.m210428j(d860Var, i);
        d860Var.m110292U(0);
        return iM210428j;
    }
}
