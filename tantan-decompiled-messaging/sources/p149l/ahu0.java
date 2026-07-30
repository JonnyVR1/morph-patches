package p149l;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ahu0 {

    /* JADX INFO: renamed from: a */
    public final Executor f69926a;

    /* JADX INFO: renamed from: b */
    public final lmt0 f69927b;

    /* JADX INFO: renamed from: c */
    public final u6u0 f69928c;

    public ahu0(Executor executor, lmt0 lmt0Var, u6u0 u6u0Var) {
        this.f69926a = executor;
        this.f69928c = u6u0Var;
        this.f69927b = lmt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m96735a(final q9t0 q9t0Var) {
        if (q9t0Var == null) {
            return;
        }
        this.f69928c.m192029w0(q9t0Var.zzF());
        this.f69928c.m114710q0(new sxr0() { // from class: l.wgu0
            @Override // p149l.sxr0
            /* JADX INFO: renamed from: U */
            public final void mo13669U(rxr0 rxr0Var) {
                hbt0 hbt0VarZzN = q9t0Var.zzN();
                Rect rect = rxr0Var.f161498d;
                hbt0VarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.f69926a);
        this.f69928c.m114710q0(new sxr0() { // from class: l.xgu0
            @Override // p149l.sxr0
            /* JADX INFO: renamed from: U */
            public final void mo13669U(rxr0 rxr0Var) {
                HashMap map = new HashMap();
                map.put("isVisible", true != rxr0Var.f161504j ? "0" : "1");
                q9t0Var.mo13674Z("onAdVisibilityChanged", map);
            }
        }, this.f69926a);
        this.f69928c.m114710q0(this.f69927b, this.f69926a);
        this.f69927b.m150617u(q9t0Var);
        q9t0Var.mo13693j0("/trackActiveViewUnit", new vgs0() { // from class: l.ygu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f198247a.m96736b((q9t0) obj, map);
            }
        });
        q9t0Var.mo13693j0("/untrackActiveViewUnit", new vgs0() { // from class: l.zgu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f203098a.m96737c((q9t0) obj, map);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m96736b(q9t0 q9t0Var, Map map) {
        this.f69927b.m150614i();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m96737c(q9t0 q9t0Var, Map map) {
        this.f69927b.m150613b();
    }
}
