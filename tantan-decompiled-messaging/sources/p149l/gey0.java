package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class gey0 {

    /* JADX INFO: renamed from: a */
    public final String f102312a;

    /* JADX INFO: renamed from: b */
    public int f102313b;

    /* JADX INFO: renamed from: c */
    public long f102314c;

    /* JADX INFO: renamed from: d */
    public eqy0 f102315d;

    /* JADX INFO: renamed from: e */
    public boolean f102316e;

    /* JADX INFO: renamed from: f */
    public boolean f102317f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ iey0 f102318g;

    public gey0(iey0 iey0Var, String str, @Nullable int i, eqy0 eqy0Var) {
        this.f102318g = iey0Var;
        this.f102312a = str;
        this.f102313b = i;
        this.f102314c = eqy0Var == null ? -1L : eqy0Var.f92870d;
        if (eqy0Var == null || !eqy0Var.m117807b()) {
            return;
        }
        this.f102315d = eqy0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m125868g(int i, @Nullable eqy0 eqy0Var) {
        if (this.f102314c == -1 && i == this.f102313b && eqy0Var != null) {
            iey0 iey0Var = this.f102318g;
            long j = eqy0Var.f92870d;
            if (j >= iey0Var.m135832k()) {
                this.f102314c = j;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m125869j(int i, @Nullable eqy0 eqy0Var) {
        if (eqy0Var == null) {
            return i == this.f102313b;
        }
        eqy0 eqy0Var2 = this.f102315d;
        if (eqy0Var2 == null) {
            return !eqy0Var.m117807b() && eqy0Var.f92870d == this.f102314c;
        }
        return eqy0Var.f92870d == eqy0Var2.f92870d && eqy0Var.f92868b == eqy0Var2.f92868b && eqy0Var.f92869c == eqy0Var2.f92869c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m125870k(s6y0 s6y0Var) {
        eqy0 eqy0Var = s6y0Var.f162868d;
        if (eqy0Var == null) {
            return this.f102313b != s6y0Var.f162867c;
        }
        long j = this.f102314c;
        if (j == -1) {
            return false;
        }
        if (eqy0Var.f92870d > j) {
            return true;
        }
        if (this.f102315d == null) {
            return false;
        }
        xqt0 xqt0Var = s6y0Var.f162866b;
        int iMo112550a = xqt0Var.mo112550a(eqy0Var.f92867a);
        int iMo112550a2 = xqt0Var.mo112550a(this.f102315d.f92867a);
        eqy0 eqy0Var2 = s6y0Var.f162868d;
        if (eqy0Var2.f92870d < this.f102315d.f92870d || iMo112550a < iMo112550a2) {
            return false;
        }
        if (iMo112550a > iMo112550a2) {
            return true;
        }
        boolean zM117807b = eqy0Var2.m117807b();
        eqy0 eqy0Var3 = s6y0Var.f162868d;
        if (!zM117807b) {
            int i = eqy0Var3.f92871e;
            return i == -1 || i > this.f102315d.f92868b;
        }
        int i2 = eqy0Var3.f92868b;
        int i3 = eqy0Var3.f92869c;
        eqy0 eqy0Var4 = this.f102315d;
        int i4 = eqy0Var4.f92868b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > eqy0Var4.f92869c;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m125871l(xqt0 xqt0Var, xqt0 xqt0Var2) {
        int i = this.f102313b;
        if (i < xqt0Var.mo113618c()) {
            xqt0Var.mo112552e(i, this.f102318g.f112937a, 0L);
            int i2 = this.f102318g.f112937a.f155827n;
            while (true) {
                if (i2 > this.f102318g.f112937a.f155828o) {
                    i = -1;
                    break;
                }
                int iMo112550a = xqt0Var2.mo112550a(xqt0Var.mo112553f(i2));
                if (iMo112550a != -1) {
                    i = xqt0Var2.mo112551d(iMo112550a, this.f102318g.f112938b, false).f76445c;
                    break;
                }
                i2++;
            }
        } else if (i >= xqt0Var2.mo113618c()) {
            i = -1;
            break;
        }
        this.f102313b = i;
        if (i == -1) {
            return false;
        }
        eqy0 eqy0Var = this.f102315d;
        return eqy0Var == null || xqt0Var2.mo112550a(eqy0Var.f92867a) != -1;
    }
}
