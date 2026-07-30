package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class mny0 {

    /* JADX INFO: renamed from: a */
    public final String f137743a;

    /* JADX INFO: renamed from: b */
    public int f137744b;

    /* JADX INFO: renamed from: c */
    public long f137745c;

    /* JADX INFO: renamed from: d */
    public kzy0 f137746d;

    /* JADX INFO: renamed from: e */
    public boolean f137747e;

    /* JADX INFO: renamed from: f */
    public boolean f137748f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ony0 f137749g;

    public mny0(ony0 ony0Var, String str, @Nullable int i, kzy0 kzy0Var) {
        this.f137749g = ony0Var;
        this.f137743a = str;
        this.f137744b = i;
        this.f137745c = kzy0Var == null ? -1L : kzy0Var.f129479d;
        if (kzy0Var == null || !kzy0Var.m152240b()) {
            return;
        }
        this.f137746d = kzy0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m159215g(int i, @Nullable kzy0 kzy0Var) {
        if (this.f137745c == -1 && i == this.f137744b && kzy0Var != null) {
            ony0 ony0Var = this.f137749g;
            long j = kzy0Var.f129479d;
            if (j >= ony0Var.m168422k()) {
                this.f137745c = j;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m159216j(int i, @Nullable kzy0 kzy0Var) {
        if (kzy0Var == null) {
            return i == this.f137744b;
        }
        kzy0 kzy0Var2 = this.f137746d;
        if (kzy0Var2 == null) {
            return !kzy0Var.m152240b() && kzy0Var.f129479d == this.f137745c;
        }
        return kzy0Var.f129479d == kzy0Var2.f129479d && kzy0Var.f129477b == kzy0Var2.f129477b && kzy0Var.f129478c == kzy0Var2.f129478c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m159217k(yfy0 yfy0Var) {
        kzy0 kzy0Var = yfy0Var.f199687d;
        if (kzy0Var == null) {
            return this.f137744b != yfy0Var.f199686c;
        }
        long j = this.f137745c;
        if (j == -1) {
            return false;
        }
        if (kzy0Var.f129479d > j) {
            return true;
        }
        if (this.f137746d == null) {
            return false;
        }
        d0u0 d0u0Var = yfy0Var.f199685b;
        int iMo113457a = d0u0Var.mo113457a(kzy0Var.f129476a);
        int iMo113457a2 = d0u0Var.mo113457a(this.f137746d.f129476a);
        kzy0 kzy0Var2 = yfy0Var.f199687d;
        if (kzy0Var2.f129479d < this.f137746d.f129479d || iMo113457a < iMo113457a2) {
            return false;
        }
        if (iMo113457a > iMo113457a2) {
            return true;
        }
        boolean zM152240b = kzy0Var2.m152240b();
        kzy0 kzy0Var3 = yfy0Var.f199687d;
        if (!zM152240b) {
            int i = kzy0Var3.f129480e;
            return i == -1 || i > this.f137746d.f129477b;
        }
        int i2 = kzy0Var3.f129477b;
        int i3 = kzy0Var3.f129478c;
        kzy0 kzy0Var4 = this.f137746d;
        int i4 = kzy0Var4.f129477b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > kzy0Var4.f129478c;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m159218l(d0u0 d0u0Var, d0u0 d0u0Var2) {
        int i = this.f137744b;
        if (i < d0u0Var.mo113459c()) {
            d0u0Var.mo107663e(i, this.f137749g.f148241a, 0L);
            int i2 = this.f137749g.f148241a.f191704n;
            while (true) {
                if (i2 > this.f137749g.f148241a.f191705o) {
                    i = -1;
                    break;
                }
                int iMo113457a = d0u0Var2.mo113457a(d0u0Var.mo113460f(i2));
                if (iMo113457a != -1) {
                    i = d0u0Var2.mo107662d(iMo113457a, this.f137749g.f148242b, false).f111930c;
                    break;
                }
                i2++;
            }
        } else if (i >= d0u0Var2.mo113459c()) {
            i = -1;
            break;
        }
        this.f137744b = i;
        if (i == -1) {
            return false;
        }
        kzy0 kzy0Var = this.f137746d;
        return kzy0Var == null || d0u0Var2.mo113457a(kzy0Var.f129476a) != -1;
    }
}
