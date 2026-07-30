package p153l;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class gqu0 {

    /* JADX INFO: renamed from: a */
    public final Executor f105953a;

    /* JADX INFO: renamed from: b */
    public final rvt0 f105954b;

    /* JADX INFO: renamed from: c */
    public final agu0 f105955c;

    public gqu0(Executor executor, rvt0 rvt0Var, agu0 agu0Var) {
        this.f105953a = executor;
        this.f105955c = agu0Var;
        this.f105954b = rvt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m131474a(final wit0 wit0Var) {
        if (wit0Var == null) {
            return;
        }
        this.f105955c.m97733w0(wit0Var.zzF());
        this.f105955c.m149283q0(new y6s0() { // from class: l.cqu0
            @Override // p153l.y6s0
            /* JADX INFO: renamed from: U */
            public final void mo13723U(x6s0 x6s0Var) {
                nkt0 nkt0VarZzN = wit0Var.zzN();
                Rect rect = x6s0Var.f192624d;
                nkt0VarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.f105953a);
        this.f105955c.m149283q0(new y6s0() { // from class: l.dqu0
            @Override // p153l.y6s0
            /* JADX INFO: renamed from: U */
            public final void mo13723U(x6s0 x6s0Var) {
                HashMap map = new HashMap();
                map.put("isVisible", true != x6s0Var.f192630j ? "0" : "1");
                wit0Var.mo13728Z("onAdVisibilityChanged", map);
            }
        }, this.f105953a);
        this.f105955c.m149283q0(this.f105954b, this.f105953a);
        this.f105954b.m183317u(wit0Var);
        wit0Var.mo13747j0("/trackActiveViewUnit", new bqs0() { // from class: l.equ0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f95399a.m131475b((wit0) obj, map);
            }
        });
        wit0Var.mo13747j0("/untrackActiveViewUnit", new bqs0() { // from class: l.fqu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f100339a.m131476c((wit0) obj, map);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m131475b(wit0 wit0Var, Map map) {
        this.f105954b.m183314i();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m131476c(wit0 wit0Var, Map map) {
        this.f105954b.m183313b();
    }
}
