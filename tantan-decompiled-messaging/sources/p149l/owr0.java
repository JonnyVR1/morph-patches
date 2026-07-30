package p149l;

import android.view.View;
import com.google.android.gms.internal.ads.C2192m;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class owr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final View f146080i;

    public owr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, View view) {
        super(vur0Var, "a1Na7bntM+sktGxZBhUnqailj8ITQ7piLQZ5OyqVU2HU4R0rOCZ63N/fUHG081A+", "eISRjanjhAfdgJ9+lE3tGViJFRMvsuX1oVbmo+9k2XU=", zpr0Var, i, 57);
        this.f146080i = view;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (this.f146080i != null) {
            Boolean bool = (Boolean) d1s0.m109677c().m144697a(m7s0.f132290k3);
            Boolean bool2 = (Boolean) d1s0.m109677c().m144697a(m7s0.f132425ua);
            zur0 zur0Var = new zur0((String) this.f161372f.invoke(null, this.f146080i, this.f161368b.m200101b().getResources().getDisplayMetrics(), bool, bool2));
            xqr0 xqr0VarM12886L = C2192m.m12886L();
            xqr0VarM12886L.m210604r(zur0Var.f204880a.longValue());
            xqr0VarM12886L.m210606t(zur0Var.f204881b.longValue());
            xqr0VarM12886L.m210607u(zur0Var.f204882c.longValue());
            if (bool2.booleanValue()) {
                xqr0VarM12886L.m210605s(zur0Var.f204884e.longValue());
            }
            if (bool.booleanValue()) {
                xqr0VarM12886L.m210603q(zur0Var.f204883d.longValue());
            }
            this.f161371e.m219756S((C2192m) xqr0VarM12886L.m153521m());
        }
    }
}
