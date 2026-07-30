package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ShareId;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class r0e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m177382e(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m177385h(Throwable th) {
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("shareId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplaceAll = str.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER);
        if (CoreModule.m29931H().signedIn_()) {
            final Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
            zvf0.m220371D("e_suggest_users_home_view_share_h5", "p_suggest_users_home_view", vwb.m200311Y("from_outside_type", "profile"));
            if (activityM208326D instanceof Act) {
                ((Act) activityM208326D).duringCreated(CoreModule.f17545c.f19605S1.m200715F3(strReplaceAll, "")).subscribe(mkd0.m154956H(new e30() { // from class: l.n0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f136538a.m177386i(w2e0Var, activityM208326D, (ShareId) obj);
                    }
                }, new e30() { // from class: l.o0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        r0e0.m177385h((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f17545c.f19605S1.m200715F3(strReplaceAll, "").subscribe(mkd0.m154956H(new e30() { // from class: l.p0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f146589a.m177387j(w2e0Var, activityM208326D, (ShareId) obj);
                    }
                }, new e30() { // from class: l.q0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        r0e0.m177382e((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m177386i(w2e0 w2e0Var, Activity activity, ShareId shareId) {
        if (!NullChecker.m81303a(shareId) || TextUtils.isEmpty(shareId.userId)) {
            return;
        }
        m177388k(w2e0Var, activity, shareId);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m177387j(w2e0 w2e0Var, Activity activity, ShareId shareId) {
        if (!NullChecker.m81303a(shareId) || TextUtils.isEmpty(shareId.userId)) {
            return;
        }
        m177388k(w2e0Var, activity, shareId);
    }

    /* JADX INFO: renamed from: k */
    public final void m177388k(w2e0 w2e0Var, Activity activity, ShareId shareId) {
        w2e0Var.m201094b().startActivity(lva.m151852h(activity, "tantanapp://userCard?uid=" + shareId.userId));
    }
}
