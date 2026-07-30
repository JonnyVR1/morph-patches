package p153l;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xor implements sp1 {

    /* JADX INFO: renamed from: a */
    public final ImmutableList<sp1> f195595a;

    /* JADX INFO: renamed from: b */
    public final int f195596b;

    public xor(int i, ImmutableList<sp1> immutableList) {
        this.f195596b = i;
        this.f195595a = immutableList;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static sp1 m212480a(int i, int i2, ig60 ig60Var) {
        switch (i) {
            case 1718776947:
                return l7g0.m153121d(i2, ig60Var);
            case 1751742049:
                return up1.m197035b(ig60Var);
            case 1752331379:
                return vp1.m202184c(ig60Var);
            case 1852994675:
                return p7g0.m171132a(ig60Var);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static xor m212481c(int i, ig60 ig60Var) {
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        int iM139817g = ig60Var.m139817g();
        int iM202186b = -2;
        while (ig60Var.m139811a() > 8) {
            int iM139831u = ig60Var.m139831u();
            int iM139816f = ig60Var.m139816f() + ig60Var.m139831u();
            ig60Var.m139807T(iM139816f);
            sp1 sp1VarM212481c = iM139831u == 1414744396 ? m212481c(ig60Var.m139831u(), ig60Var) : m212480a(iM139831u, iM202186b, ig60Var);
            if (sp1VarM212481c != null) {
                if (sp1VarM212481c.getType() == 1752331379) {
                    iM202186b = ((vp1) sp1VarM212481c).m202186b();
                }
                c2804a.mo15737a(sp1VarM212481c);
            }
            ig60Var.m139808U(iM139816f);
            ig60Var.m139807T(iM139817g);
        }
        return new xor(i, c2804a.m15756m());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public <T extends sp1> T m212482b(Class<T> cls) {
        gyj0<sp1> it = this.f195595a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // p153l.sp1
    public int getType() {
        return this.f195596b;
    }
}
