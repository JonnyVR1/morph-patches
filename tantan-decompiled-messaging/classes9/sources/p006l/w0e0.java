package p006l;

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
public class w0e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m26087e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m26088f(Throwable th) {
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("shareId");
        String str2 = w2e0Var.m26160f().get("momentId");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strReplaceAll = str.replaceAll(" ", "+");
        String strReplaceAll2 = str2.replaceAll(" ", "+");
        if (CoreModule.m1850H().signedIn_()) {
            Act actD = xdl0.D(w2e0Var.m26156b());
            zvf0.D("e_suggest_users_home_view_share_h5", "p_suggest_users_home_view", new j760[]{vwb.Y("from_outside_type", "moment")});
            if (actD instanceof Act) {
                actD.duringCreated(CoreModule.f1534c.f3594S1.m26056F3(strReplaceAll, strReplaceAll2)).subscribe(mkd0.H(new e30() { // from class: l.s0e0
                    public final void call(Object obj) {
                        this.f20969a.m26091i(w2e0Var, (ShareId) obj);
                    }
                }, new e30() { // from class: l.t0e0
                    public final void call(Object obj) {
                        w0e0.m26088f((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f1534c.f3594S1.m26056F3(strReplaceAll, strReplaceAll2).subscribe(mkd0.H(new e30() { // from class: l.u0e0
                    public final void call(Object obj) {
                        this.f22413a.m26092j(w2e0Var, (ShareId) obj);
                    }
                }, new e30() { // from class: l.v0e0
                    public final void call(Object obj) {
                        w0e0.m26087e((Throwable) obj);
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
    public final /* synthetic */ void m26091i(w2e0 w2e0Var, ShareId shareId) {
        if (!NullChecker.a(shareId) || TextUtils.isEmpty(shareId.userId) || TextUtils.isEmpty(shareId.momentId)) {
            return;
        }
        m26093k(w2e0Var, shareId);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m26092j(w2e0 w2e0Var, ShareId shareId) {
        if (!NullChecker.a(shareId) || TextUtils.isEmpty(shareId.userId) || TextUtils.isEmpty(shareId.momentId)) {
            return;
        }
        m26093k(w2e0Var, shareId);
    }

    /* JADX INFO: renamed from: k */
    public final void m26093k(w2e0 w2e0Var, ShareId shareId) {
        Intent intentArgsToMomentDetailAct = CoreModule.m1853N().argsToMomentDetailAct(w2e0Var.m26156b(), "scheme", shareId.momentId, shareId.userId);
        if (intentArgsToMomentDetailAct == null) {
            return;
        }
        w2e0Var.m26156b().startActivity(intentArgsToMomentDetailAct);
    }
}
