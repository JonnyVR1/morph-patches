package p149l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x53 {

    /* JADX INFO: renamed from: a */
    public final Act f191082a;

    /* JADX INFO: renamed from: b */
    public final da3 f191083b;

    /* JADX INFO: renamed from: c */
    public v9j<Boolean> f191084c;

    /* JADX INFO: renamed from: d */
    public y93 f191085d;

    public x53(@NonNull Act act, @NonNull da3 da3Var) {
        this.f191083b = da3Var;
        this.f191082a = act;
        m207072g(act);
        mo120065e();
    }

    /* JADX INFO: renamed from: c */
    public void m207071c(y93 y93Var) {
        this.f191085d = y93Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo120064d();

    /* JADX INFO: renamed from: e */
    public abstract void mo120065e();

    /* JADX INFO: renamed from: f */
    public abstract void mo120066f();

    /* JADX INFO: renamed from: g */
    public final void m207072g(final Act act) {
        e51.m114742G(new Runnable() { // from class: l.v53
            @Override // java.lang.Runnable
            public final void run() {
                this.f179998a.m207074i(act);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m207073h(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            mo120066f();
        } else if (c4319c == C4319c.f15549j) {
            mo120064d();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m207074i(Act act) {
        act.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.w53
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184640a.m207073h((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public boolean m207075j() {
        if (NullChecker.m81303a(this.f191084c)) {
            return this.f191084c.call().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo120067k(v9j<String> v9jVar);

    /* JADX INFO: renamed from: l */
    public void m207076l(v9j<Boolean> v9jVar) {
        this.f191084c = v9jVar;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo120068m(FrameLayout frameLayout, View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo120069n(Act act, d30 d30Var, v9j<Boolean> v9jVar);

    /* JADX INFO: renamed from: o */
    public abstract void mo120070o(BoostViewContainer boostViewContainer);

    /* JADX INFO: renamed from: p */
    public abstract void mo120071p(boolean z);
}
