package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xqt0 {

    /* JADX INFO: renamed from: a */
    public static final xqt0 f194042a = new mkt0();

    /* JADX INFO: renamed from: b */
    public static final String f194043b = Integer.toString(0, 36);

    /* JADX INFO: renamed from: c */
    public static final String f194044c = Integer.toString(1, 36);

    /* JADX INFO: renamed from: d */
    public static final String f194045d = Integer.toString(2, 36);

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final g8y0 f194046e = new g8y0() { // from class: l.fjt0
    };

    /* JADX INFO: renamed from: a */
    public abstract int mo112550a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract int mo113617b();

    /* JADX INFO: renamed from: c */
    public abstract int mo113618c();

    /* JADX INFO: renamed from: d */
    public abstract bnt0 mo112551d(int i, bnt0 bnt0Var, boolean z);

    /* JADX INFO: renamed from: e */
    public abstract qpt0 mo112552e(int i, qpt0 qpt0Var, long j);

    public final boolean equals(@Nullable Object obj) {
        int iMo112555h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqt0)) {
            return false;
        }
        xqt0 xqt0Var = (xqt0) obj;
        if (xqt0Var.mo113618c() == mo113618c() && xqt0Var.mo113617b() == mo113617b()) {
            qpt0 qpt0Var = new qpt0();
            bnt0 bnt0Var = new bnt0();
            qpt0 qpt0Var2 = new qpt0();
            bnt0 bnt0Var2 = new bnt0();
            for (int i = 0; i < mo113618c(); i++) {
                if (!mo112552e(i, qpt0Var, 0L).equals(xqt0Var.mo112552e(i, qpt0Var2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo113617b(); i2++) {
                if (!mo112551d(i2, bnt0Var, true).equals(xqt0Var.mo112551d(i2, bnt0Var2, true))) {
                    return false;
                }
            }
            int iMo112554g = mo112554g(true);
            if (iMo112554g == xqt0Var.mo112554g(true) && (iMo112555h = mo112555h(true)) == xqt0Var.mo112555h(true)) {
                while (iMo112554g != iMo112555h) {
                    int iMo112556j = mo112556j(iMo112554g, 0, true);
                    if (iMo112556j != xqt0Var.mo112556j(iMo112554g, 0, true)) {
                        return false;
                    }
                    iMo112554g = iMo112556j;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo112553f(int i);

    /* JADX INFO: renamed from: g */
    public int mo112554g(boolean z) {
        return m210615o() ? -1 : 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo112555h(boolean z) {
        if (m210615o()) {
            return -1;
        }
        return mo113618c() - 1;
    }

    public final int hashCode() {
        int i;
        qpt0 qpt0Var = new qpt0();
        bnt0 bnt0Var = new bnt0();
        int iMo113618c = mo113618c() + 217;
        int i2 = 0;
        while (true) {
            i = iMo113618c * 31;
            if (i2 >= mo113618c()) {
                break;
            }
            iMo113618c = i + mo112552e(i2, qpt0Var, 0L).hashCode();
            i2++;
        }
        int iMo113617b = i + mo113617b();
        for (int i3 = 0; i3 < mo113617b(); i3++) {
            iMo113617b = (iMo113617b * 31) + mo112551d(i3, bnt0Var, true).hashCode();
        }
        int iMo112554g = mo112554g(true);
        while (iMo112554g != -1) {
            iMo113617b = (iMo113617b * 31) + iMo112554g;
            iMo112554g = mo112556j(iMo112554g, 0, true);
        }
        return iMo113617b;
    }

    /* JADX INFO: renamed from: i */
    public final int m210612i(int i, bnt0 bnt0Var, qpt0 qpt0Var, int i2, boolean z) {
        int i3 = mo112551d(i, bnt0Var, false).f76445c;
        if (mo112552e(i3, qpt0Var, 0L).f155828o != i) {
            return i + 1;
        }
        int iMo112556j = mo112556j(i3, i2, z);
        if (iMo112556j == -1) {
            return -1;
        }
        return mo112552e(iMo112556j, qpt0Var, 0L).f155827n;
    }

    /* JADX INFO: renamed from: j */
    public int mo112556j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo112555h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo112555h(z) ? mo112554g(z) : i + 1;
        }
        ohg0.m164364a();
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int mo112557k(int i, int i2, boolean z) {
        if (i == mo112554g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* JADX INFO: renamed from: l */
    public final Pair m210613l(qpt0 qpt0Var, bnt0 bnt0Var, int i, long j) {
        Pair pairM210614m = m210614m(qpt0Var, bnt0Var, i, j, 0L);
        pairM210614m.getClass();
        return pairM210614m;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Pair m210614m(qpt0 qpt0Var, bnt0 bnt0Var, int i, long j, long j2) {
        f5v0.m119530a(i, 0, mo113618c());
        mo112552e(i, qpt0Var, j2);
        if (j == -9223372036854775807L) {
            long j3 = qpt0Var.f155825l;
            j = 0;
        }
        int i2 = qpt0Var.f155827n;
        mo112551d(i2, bnt0Var, false);
        while (i2 < qpt0Var.f155828o) {
            long j4 = bnt0Var.f76447e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = mo112551d(i3, bnt0Var, false).f76447e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        mo112551d(i2, bnt0Var, true);
        long j6 = bnt0Var.f76447e;
        long j7 = bnt0Var.f76446d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = bnt0Var.f76444b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: n */
    public bnt0 mo112558n(Object obj, bnt0 bnt0Var) {
        return mo112551d(mo112550a(obj), bnt0Var, true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m210615o() {
        return mo113618c() == 0;
    }
}
