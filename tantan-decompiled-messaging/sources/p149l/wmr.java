package p149l;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wmr implements lp1 {

    /* JADX INFO: renamed from: a */
    public final ImmutableList<lp1> f187156a;

    /* JADX INFO: renamed from: b */
    public final int f187157b;

    public wmr(int i, ImmutableList<lp1> immutableList) {
        this.f187157b = i;
        this.f187156a = immutableList;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static lp1 m204050a(int i, int i2, d860 d860Var) {
        switch (i) {
            case 1718776947:
                return ezf0.m118948d(i2, d860Var);
            case 1751742049:
                return np1.m160440b(d860Var);
            case 1752331379:
                return op1.m165288c(d860Var);
            case 1852994675:
                return izf0.m139064a(d860Var);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static wmr m204051c(int i, d860 d860Var) {
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        int iM110301g = d860Var.m110301g();
        int iM165290b = -2;
        while (d860Var.m110295a() > 8) {
            int iM110315u = d860Var.m110315u();
            int iM110300f = d860Var.m110300f() + d860Var.m110315u();
            d860Var.m110291T(iM110300f);
            lp1 lp1VarM204051c = iM110315u == 1414744396 ? m204051c(d860Var.m110315u(), d860Var) : m204050a(iM110315u, iM165290b, d860Var);
            if (lp1VarM204051c != null) {
                if (lp1VarM204051c.getType() == 1752331379) {
                    iM165290b = ((op1) lp1VarM204051c).m165290b();
                }
                c2781a.mo15683a(lp1VarM204051c);
            }
            d860Var.m110292U(iM110300f);
            d860Var.m110291T(iM110301g);
        }
        return new wmr(i, c2781a.m15702m());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public <T extends lp1> T m204052b(Class<T> cls) {
        dpj0<lp1> it = this.f187156a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // p149l.lp1
    public int getType() {
        return this.f187157b;
    }
}
