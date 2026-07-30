package p153l;

import android.app.Application;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;

/* JADX INFO: loaded from: classes9.dex */
public class ui80 {

    /* JADX INFO: renamed from: a */
    public int f179083a = -1;

    /* JADX INFO: renamed from: b */
    public Runnable f179084b = new RunnableC20576a();

    /* JADX INFO: renamed from: l.ui80$a */
    public class RunnableC20576a implements Runnable {
        public RunnableC20576a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4883c c4883c;
            if (ui80.this.f179083a <= 0 || (c4883c = CoreModule.f18264c) == null) {
                return;
            }
            c4883c.f20384f0.m33653Fo();
            Application application = CoreModule.f18263b;
            ui80 ui80Var = ui80.this;
            l51.m152888H(application, ui80Var.f179084b, ui80Var.f179083a);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m196146f(String str, boolean z) {
        if (this.f179083a == -2) {
            return;
        }
        if (z) {
            if (str != null) {
                this.f179083a = 30000;
            } else {
                this.f179083a = -1;
            }
        } else if (str != null) {
            this.f179083a = 10000;
        } else {
            this.f179083a = 600000;
        }
        l51.m152890J(this.f179084b);
        int i = this.f179083a;
        if (i >= 0) {
            l51.m152888H(CoreModule.f18263b, this.f179084b, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m196147g(pf60 pf60Var) {
        m196146f((String) pf60Var.f152156a, ((Boolean) pf60Var.f152157b).booleanValue());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m196148h(kcg0 kcg0Var) {
        this.f179083a = -2;
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: i */
    public kcg0 m196149i() {
        final kcg0 kcg0VarSubscribe = psd0.m173625r(Act.foreground().map(new qcj() { // from class: l.qi80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gta.m132210e().m132214d().mo34904ph((Act.C4450r) obj);
            }
        }).distinctUntilChanged(), TantanApp.f17899c.m111146s(), new rcj() { // from class: l.ri80
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((String) obj, (Boolean) obj2);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.si80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168805a.m196147g((pf60) obj);
            }
        }));
        m196146f(null, true);
        return pcg0.m171648a(new x20() { // from class: l.ti80
            @Override // p153l.x20
            public final void call() {
                this.f174450a.m196148h(kcg0VarSubscribe);
            }
        });
    }
}
