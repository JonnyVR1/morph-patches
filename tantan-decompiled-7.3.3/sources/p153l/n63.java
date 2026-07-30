package p153l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n63 {

    /* JADX INFO: renamed from: a */
    public final Act f140423a;

    /* JADX INFO: renamed from: b */
    public final sa3 f140424b;

    /* JADX INFO: renamed from: c */
    public pcj<Boolean> f140425c;

    /* JADX INFO: renamed from: d */
    public na3 f140426d;

    public n63(@NonNull Act act, @NonNull sa3 sa3Var) {
        this.f140424b = sa3Var;
        this.f140423a = act;
        m161753g(act);
        mo119978e();
    }

    /* JADX INFO: renamed from: c */
    public void m161752c(na3 na3Var) {
        this.f140426d = na3Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo119977d();

    /* JADX INFO: renamed from: e */
    public abstract void mo119978e();

    /* JADX INFO: renamed from: f */
    public abstract void mo119979f();

    /* JADX INFO: renamed from: g */
    public final void m161753g(final Act act) {
        l51.m152887G(new Runnable() { // from class: l.l63
            @Override // java.lang.Runnable
            public final void run() {
                this.f130223a.m161755i(act);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m161754h(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            mo119979f();
        } else if (c4470c == C4470c.f16268j) {
            mo119977d();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m161755i(Act act) {
        act.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.m63
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134964a.m161754h((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public boolean m161756j() {
        if (NullChecker.m82486a(this.f140425c)) {
            return this.f140425c.call().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo119980k(pcj<String> pcjVar);

    /* JADX INFO: renamed from: l */
    public void m161757l(pcj<Boolean> pcjVar) {
        this.f140425c = pcjVar;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo119981m(FrameLayout frameLayout, View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo119982n(Act act, x20 x20Var, pcj<Boolean> pcjVar);

    /* JADX INFO: renamed from: o */
    public abstract void mo119983o(BoostViewContainer boostViewContainer);

    /* JADX INFO: renamed from: p */
    public abstract void mo119984p(boolean z);
}
