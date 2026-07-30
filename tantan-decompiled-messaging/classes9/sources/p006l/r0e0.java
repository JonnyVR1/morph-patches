package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ShareId;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r0e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22563e(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m22566h(Throwable th) {
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("shareId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplaceAll = str.replaceAll(" ", "+");
        if (CoreModule.m1850H().signedIn_()) {
            final Act actD = xdl0.D(w2e0Var.m26156b());
            zvf0.D("e_suggest_users_home_view_share_h5", "p_suggest_users_home_view", new j760[]{vwb.Y("from_outside_type", "profile")});
            if (actD instanceof Act) {
                actD.duringCreated(CoreModule.f1534c.f3594S1.m26056F3(strReplaceAll, "")).subscribe(mkd0.H(new e30() { // from class: l.n0e0
                    public final void call(Object obj) {
                        this.f17432a.m22567i(w2e0Var, actD, (ShareId) obj);
                    }
                }, new e30() { // from class: l.o0e0
                    public final void call(Object obj) {
                        r0e0.m22566h((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f1534c.f3594S1.m26056F3(strReplaceAll, "").subscribe(mkd0.H(new e30() { // from class: l.p0e0
                    public final void call(Object obj) {
                        this.f18540a.m22568j(w2e0Var, actD, (ShareId) obj);
                    }
                }, new e30() { // from class: l.q0e0
                    public final void call(Object obj) {
                        r0e0.m22563e((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m22567i(w2e0 w2e0Var, Activity activity, ShareId shareId) {
        if (!NullChecker.a(shareId) || TextUtils.isEmpty(shareId.userId)) {
            return;
        }
        m22569k(w2e0Var, activity, shareId);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m22568j(w2e0 w2e0Var, Activity activity, ShareId shareId) {
        if (!NullChecker.a(shareId) || TextUtils.isEmpty(shareId.userId)) {
            return;
        }
        m22569k(w2e0Var, activity, shareId);
    }

    /* JADX INFO: renamed from: k */
    public final void m22569k(w2e0 w2e0Var, Activity activity, ShareId shareId) {
        w2e0Var.m26156b().startActivity(lva.m19029h(activity, "tantanapp://userCard?uid=" + shareId.userId));
    }
}
