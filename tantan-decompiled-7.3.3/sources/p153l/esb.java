package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;

/* JADX INFO: loaded from: classes9.dex */
public class esb {

    /* JADX INFO: renamed from: a */
    public Runnable f95581a = new RunnableC16824a();

    /* JADX INFO: renamed from: l.esb$a */
    public class RunnableC16824a implements Runnable {
        public RunnableC16824a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c != null) {
                c4883c.f20381e0.m116470H9();
                l51.m152888H(CoreModule.f18263b, esb.this.f95581a, CoreModule.f18265d.m217941A());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m122306a(pf60 pf60Var) {
        return (Boolean) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m122311f(kcg0 kcg0Var) {
        l51.m152890J(this.f95581a);
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: g */
    public final void m122312g(boolean z) {
        Runnable runnable = this.f95581a;
        if (!z) {
            l51.m152890J(runnable);
        } else {
            l51.m152890J(runnable);
            l51.m152887G(this.f95581a);
        }
    }

    /* JADX INFO: renamed from: h */
    public kcg0 m122313h() {
        final kcg0 kcg0VarSubscribe = psd0.m173625r(CoreModule.m30929H().signedIn(), Act.foreground(), new zrb()).filter(new qcj() { // from class: l.asb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return esb.m122306a((pf60) obj);
            }
        }).map(new qcj() { // from class: l.bsb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj).f152157b != 0);
            }
        }).distinctUntilChanged().subscribe(new y20() { // from class: l.csb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83450a.m122312g(((Boolean) obj).booleanValue());
            }
        });
        return pcg0.m171648a(new x20() { // from class: l.dsb
            @Override // p153l.x20
            public final void call() {
                this.f90469a.m122311f(kcg0VarSubscribe);
            }
        });
    }
}
