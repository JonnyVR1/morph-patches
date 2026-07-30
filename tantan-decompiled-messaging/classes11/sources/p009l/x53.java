package p009l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.mkd0;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class x53 {

    /* JADX INFO: renamed from: a */
    public final Act f22435a;

    /* JADX INFO: renamed from: b */
    public final da3 f22436b;

    /* JADX INFO: renamed from: c */
    public v9j<Boolean> f22437c;

    /* JADX INFO: renamed from: d */
    public y93 f22438d;

    public x53(@NonNull Act act, @NonNull da3 da3Var) {
        this.f22436b = da3Var;
        this.f22435a = act;
        m24723g(act);
        mo14323e();
    }

    /* JADX INFO: renamed from: c */
    public void m24722c(y93 y93Var) {
        this.f22438d = y93Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo14322d();

    /* JADX INFO: renamed from: e */
    public abstract void mo14323e();

    /* JADX INFO: renamed from: f */
    public abstract void mo14324f();

    /* JADX INFO: renamed from: g */
    public final void m24723g(final Act act) {
        e51.G(new Runnable() { // from class: l.v53
            @Override // java.lang.Runnable
            public final void run() {
                this.f21452a.m24725i(act);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m24724h(c cVar) {
        if (cVar == c.i) {
            mo14324f();
        } else if (cVar == c.j) {
            mo14322d();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m24725i(Act act) {
        act.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.w53
            public final void call(Object obj) {
                this.f21895a.m24724h((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public boolean m24726j() {
        if (NullChecker.a(this.f22437c)) {
            return ((Boolean) this.f22437c.call()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo14325k(v9j<String> v9jVar);

    /* JADX INFO: renamed from: l */
    public void m24727l(v9j<Boolean> v9jVar) {
        this.f22437c = v9jVar;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo14326m(FrameLayout frameLayout, View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo14327n(Act act, d30 d30Var, v9j<Boolean> v9jVar);

    /* JADX INFO: renamed from: o */
    public abstract void mo14328o(BoostViewContainer boostViewContainer);

    /* JADX INFO: renamed from: p */
    public abstract void mo14329p(boolean z);
}
