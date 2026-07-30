package p149l;

import android.app.Application;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;

/* JADX INFO: loaded from: classes9.dex */
public class oa80 {

    /* JADX INFO: renamed from: a */
    public int f142784a = -1;

    /* JADX INFO: renamed from: b */
    public Runnable f142785b = new RunnableC18882a();

    /* JADX INFO: renamed from: l.oa80$a */
    public class RunnableC18882a implements Runnable {
        public RunnableC18882a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4732c c4732c;
            if (oa80.this.f142784a <= 0 || (c4732c = CoreModule.f17545c) == null) {
                return;
            }
            c4732c.f19642f0.m32650Fo();
            Application application = CoreModule.f17544b;
            oa80 oa80Var = oa80.this;
            e51.m114743H(application, oa80Var.f142785b, oa80Var.f142784a);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m163292f(String str, boolean z) {
        if (this.f142784a == -2) {
            return;
        }
        if (z) {
            if (str != null) {
                this.f142784a = 30000;
            } else {
                this.f142784a = -1;
            }
        } else if (str != null) {
            this.f142784a = 10000;
        } else {
            this.f142784a = 600000;
        }
        e51.m114745J(this.f142785b);
        int i = this.f142784a;
        if (i >= 0) {
            e51.m114743H(CoreModule.f17544b, this.f142785b, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m163293g(j760 j760Var) {
        m163292f((String) j760Var.f116564a, ((Boolean) j760Var.f116565b).booleanValue());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m163294h(c4g0 c4g0Var) {
        this.f142784a = -2;
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: i */
    public c4g0 m163295i() {
        final c4g0 c4g0VarSubscribe = mkd0.m154984r(Act.foreground().map(new w9j() { // from class: l.ka80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ura.m195053e().m195057d().mo33901ph((Act.C4299r) obj);
            }
        }).distinctUntilChanged(), TantanApp.f17180c.m214268s(), new x9j() { // from class: l.la80
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((String) obj, (Boolean) obj2);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ma80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132838a.m163293g((j760) obj);
            }
        }));
        m163292f(null, true);
        return h4g0.m129240a(new d30() { // from class: l.na80
            @Override // p149l.d30
            public final void call() {
                this.f137864a.m163294h(c4g0VarSubscribe);
            }
        });
    }
}
