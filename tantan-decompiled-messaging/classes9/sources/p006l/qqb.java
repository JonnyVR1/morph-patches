package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.Act;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.h4g0;
import l.j760;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qqb {

    /* JADX INFO: renamed from: a */
    public Runnable f19976a = new RunnableC1186a();

    /* JADX INFO: renamed from: l.qqb$a */
    public class RunnableC1186a implements Runnable {
        public RunnableC1186a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0158c c0158c = CoreModule.f1534c;
            if (c0158c != null) {
                c0158c.f3628e0.m21360H9();
                e51.H(CoreModule.f1533b, qqb.this.f19976a, CoreModule.f1535d.m25974A());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m22323a(j760 j760Var) {
        return (Boolean) j760Var.a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m22328f(c4g0 c4g0Var) {
        e51.J(this.f19976a);
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: g */
    public final void m22329g(boolean z) {
        Runnable runnable = this.f19976a;
        if (!z) {
            e51.J(runnable);
        } else {
            e51.J(runnable);
            e51.G(this.f19976a);
        }
    }

    /* JADX INFO: renamed from: h */
    public c4g0 m22330h() {
        final c4g0 c4g0VarSubscribe = mkd0.r(CoreModule.m1850H().signedIn(), Act.foreground(), new x9j() { // from class: l.lqb
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Boolean) obj, (Act.r) obj2);
            }
        }).filter(new w9j() { // from class: l.mqb
            public final Object call(Object obj) {
                return qqb.m22323a((j760) obj);
            }
        }).map(new w9j() { // from class: l.nqb
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).b != null);
            }
        }).distinctUntilChanged().subscribe(new e30() { // from class: l.oqb
            public final void call(Object obj) {
                this.f18328a.m22329g(((Boolean) obj).booleanValue());
            }
        });
        return h4g0.a(new d30() { // from class: l.pqb
            public final void call() {
                this.f19264a.m22328f(c4g0VarSubscribe);
            }
        });
    }
}
