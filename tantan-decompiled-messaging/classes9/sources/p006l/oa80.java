package p006l;

import android.app.Application;
import com.p000p1.mobile.putong.app.TantanApp;
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
public class oa80 {

    /* JADX INFO: renamed from: a */
    public int f18094a = -1;

    /* JADX INFO: renamed from: b */
    public Runnable f18095b = new RunnableC1078a();

    /* JADX INFO: renamed from: l.oa80$a */
    public class RunnableC1078a implements Runnable {
        public RunnableC1078a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0158c c0158c;
            if (oa80.this.f18094a <= 0 || (c0158c = CoreModule.f1534c) == null) {
                return;
            }
            c0158c.f3631f0.m4580Fo();
            Application application = CoreModule.f1533b;
            oa80 oa80Var = oa80.this;
            e51.H(application, oa80Var.f18095b, oa80Var.f18094a);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m20446f(String str, boolean z) {
        if (this.f18094a == -2) {
            return;
        }
        if (z) {
            if (str != null) {
                this.f18094a = 30000;
            } else {
                this.f18094a = -1;
            }
        } else if (str != null) {
            this.f18094a = 10000;
        } else {
            this.f18094a = 600000;
        }
        e51.J(this.f18095b);
        int i = this.f18094a;
        if (i >= 0) {
            e51.H(CoreModule.f1533b, this.f18095b, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m20447g(j760 j760Var) {
        m20446f((String) j760Var.a, ((Boolean) j760Var.b).booleanValue());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m20448h(c4g0 c4g0Var) {
        this.f18094a = -2;
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: i */
    public c4g0 m20449i() {
        final c4g0 c4g0VarSubscribe = mkd0.r(Act.foreground().map(new w9j() { // from class: l.ka80
            public final Object call(Object obj) {
                return ura.m25555e().m25559d().m5838ph((Act.r) obj);
            }
        }).distinctUntilChanged(), TantanApp.f1169c.m28215s(), new x9j() { // from class: l.la80
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((String) obj, (Boolean) obj2);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ma80
            public final void call(Object obj) {
                this.f16881a.m20447g((j760) obj);
            }
        }));
        m20446f(null, true);
        return h4g0.a(new d30() { // from class: l.na80
            public final void call() {
                this.f17554a.m20448h(c4g0VarSubscribe);
            }
        });
    }
}
