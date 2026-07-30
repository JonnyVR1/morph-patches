package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d0u0 {

    /* JADX INFO: renamed from: a */
    public static final d0u0 f84608a = new stt0();

    /* JADX INFO: renamed from: b */
    public static final String f84609b = Integer.toString(0, 36);

    /* JADX INFO: renamed from: c */
    public static final String f84610c = Integer.toString(1, 36);

    /* JADX INFO: renamed from: d */
    public static final String f84611d = Integer.toString(2, 36);

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final mhy0 f84612e = new mhy0() { // from class: l.lst0
    };

    /* JADX INFO: renamed from: a */
    public abstract int mo113457a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract int mo113458b();

    /* JADX INFO: renamed from: c */
    public abstract int mo113459c();

    /* JADX INFO: renamed from: d */
    public abstract hwt0 mo107662d(int i, hwt0 hwt0Var, boolean z);

    /* JADX INFO: renamed from: e */
    public abstract wyt0 mo107663e(int i, wyt0 wyt0Var, long j);

    public final boolean equals(@Nullable Object obj) {
        int iMo113462h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0u0)) {
            return false;
        }
        d0u0 d0u0Var = (d0u0) obj;
        if (d0u0Var.mo113459c() == mo113459c() && d0u0Var.mo113458b() == mo113458b()) {
            wyt0 wyt0Var = new wyt0();
            hwt0 hwt0Var = new hwt0();
            wyt0 wyt0Var2 = new wyt0();
            hwt0 hwt0Var2 = new hwt0();
            for (int i = 0; i < mo113459c(); i++) {
                if (!mo107663e(i, wyt0Var, 0L).equals(d0u0Var.mo107663e(i, wyt0Var2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo113458b(); i2++) {
                if (!mo107662d(i2, hwt0Var, true).equals(d0u0Var.mo107662d(i2, hwt0Var2, true))) {
                    return false;
                }
            }
            int iMo113461g = mo113461g(true);
            if (iMo113461g == d0u0Var.mo113461g(true) && (iMo113462h = mo113462h(true)) == d0u0Var.mo113462h(true)) {
                while (iMo113461g != iMo113462h) {
                    int iMo113464j = mo113464j(iMo113461g, 0, true);
                    if (iMo113464j != d0u0Var.mo113464j(iMo113461g, 0, true)) {
                        return false;
                    }
                    iMo113461g = iMo113464j;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo113460f(int i);

    /* JADX INFO: renamed from: g */
    public int mo113461g(boolean z) {
        return m113469o() ? -1 : 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo113462h(boolean z) {
        if (m113469o()) {
            return -1;
        }
        return mo113459c() - 1;
    }

    public final int hashCode() {
        int i;
        wyt0 wyt0Var = new wyt0();
        hwt0 hwt0Var = new hwt0();
        int iMo113459c = mo113459c() + 217;
        int i2 = 0;
        while (true) {
            i = iMo113459c * 31;
            if (i2 >= mo113459c()) {
                break;
            }
            iMo113459c = i + mo107663e(i2, wyt0Var, 0L).hashCode();
            i2++;
        }
        int iMo113458b = i + mo113458b();
        for (int i3 = 0; i3 < mo113458b(); i3++) {
            iMo113458b = (iMo113458b * 31) + mo107662d(i3, hwt0Var, true).hashCode();
        }
        int iMo113461g = mo113461g(true);
        while (iMo113461g != -1) {
            iMo113458b = (iMo113458b * 31) + iMo113461g;
            iMo113461g = mo113464j(iMo113461g, 0, true);
        }
        return iMo113458b;
    }

    /* JADX INFO: renamed from: i */
    public final int m113463i(int i, hwt0 hwt0Var, wyt0 wyt0Var, int i2, boolean z) {
        int i3 = mo107662d(i, hwt0Var, false).f111930c;
        if (mo107663e(i3, wyt0Var, 0L).f191705o != i) {
            return i + 1;
        }
        int iMo113464j = mo113464j(i3, i2, z);
        if (iMo113464j == -1) {
            return -1;
        }
        return mo107663e(iMo113464j, wyt0Var, 0L).f191704n;
    }

    /* JADX INFO: renamed from: j */
    public int mo113464j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo113462h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo113462h(z) ? mo113461g(z) : i + 1;
        }
        wpg0.m207458a();
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int mo113465k(int i, int i2, boolean z) {
        if (i == mo113461g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* JADX INFO: renamed from: l */
    public final Pair m113466l(wyt0 wyt0Var, hwt0 hwt0Var, int i, long j) {
        Pair pairM113467m = m113467m(wyt0Var, hwt0Var, i, j, 0L);
        pairM113467m.getClass();
        return pairM113467m;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Pair m113467m(wyt0 wyt0Var, hwt0 hwt0Var, int i, long j, long j2) {
        lev0.m153953a(i, 0, mo113459c());
        mo107663e(i, wyt0Var, j2);
        if (j == -9223372036854775807L) {
            long j3 = wyt0Var.f191702l;
            j = 0;
        }
        int i2 = wyt0Var.f191704n;
        mo107662d(i2, hwt0Var, false);
        while (i2 < wyt0Var.f191705o) {
            long j4 = hwt0Var.f111932e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = mo107662d(i3, hwt0Var, false).f111932e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        mo107662d(i2, hwt0Var, true);
        long j6 = hwt0Var.f111932e;
        long j7 = hwt0Var.f111931d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = hwt0Var.f111929b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: n */
    public hwt0 mo113468n(Object obj, hwt0 hwt0Var) {
        return mo107662d(mo113457a(obj), hwt0Var, true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m113469o() {
        return mo113459c() == 0;
    }
}
