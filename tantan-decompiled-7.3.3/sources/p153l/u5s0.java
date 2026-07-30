package p153l;

import android.view.View;
import com.google.android.gms.internal.ads.C2215m;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class u5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final View f177670i;

    public u5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, View view) {
        super(b4s0Var, "a1Na7bntM+sktGxZBhUnqailj8ITQ7piLQZ5OyqVU2HU4R0rOCZ63N/fUHG081A+", "eISRjanjhAfdgJ9+lE3tGViJFRMvsuX1oVbmo+9k2XU=", fzr0Var, i, 57);
        this.f177670i = view;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (this.f177670i != null) {
            Boolean bool = (Boolean) jas0.m144075c().m176505a(sgs0.f168361k3);
            Boolean bool2 = (Boolean) jas0.m144075c().m176505a(sgs0.f168496ua);
            f4s0 f4s0Var = new f4s0((String) this.f192523f.invoke(null, this.f177670i, this.f192519b.m102517b().getResources().getDisplayMetrics(), bool, bool2));
            d0s0 d0s0VarM12940L = C2215m.m12940L();
            d0s0VarM12940L.m113436r(f4s0Var.f97135a.longValue());
            d0s0VarM12940L.m113438t(f4s0Var.f97136b.longValue());
            d0s0VarM12940L.m113439u(f4s0Var.f97137c.longValue());
            if (bool2.booleanValue()) {
                d0s0VarM12940L.m113437s(f4s0Var.f97139e.longValue());
            }
            if (bool.booleanValue()) {
                d0s0VarM12940L.m113435q(f4s0Var.f97138d.longValue());
            }
            this.f192522e.m128291S((C2215m) d0s0VarM12940L.m185950m());
        }
    }
}
