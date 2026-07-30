package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ShareId;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class w0e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m200852e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m200853f(Throwable th) {
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("shareId");
        String str2 = w2e0Var.m201098f().get("momentId");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strReplaceAll = str.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER);
        String strReplaceAll2 = str2.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER);
        if (CoreModule.m29931H().signedIn_()) {
            Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
            zvf0.m220371D("e_suggest_users_home_view_share_h5", "p_suggest_users_home_view", vwb.m200311Y("from_outside_type", "moment"));
            if (activityM208326D instanceof Act) {
                ((Act) activityM208326D).duringCreated(CoreModule.f17545c.f19605S1.m200715F3(strReplaceAll, strReplaceAll2)).subscribe(mkd0.m154956H(new e30() { // from class: l.s0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f161768a.m200856i(w2e0Var, (ShareId) obj);
                    }
                }, new e30() { // from class: l.t0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        w0e0.m200853f((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f17545c.f19605S1.m200715F3(strReplaceAll, strReplaceAll2).subscribe(mkd0.m154956H(new e30() { // from class: l.u0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f172900a.m200857j(w2e0Var, (ShareId) obj);
                    }
                }, new e30() { // from class: l.v0e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        w0e0.m200852e((Throwable) obj);
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
    public final /* synthetic */ void m200856i(w2e0 w2e0Var, ShareId shareId) {
        if (!NullChecker.m81303a(shareId) || TextUtils.isEmpty(shareId.userId) || TextUtils.isEmpty(shareId.momentId)) {
            return;
        }
        m200858k(w2e0Var, shareId);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m200857j(w2e0 w2e0Var, ShareId shareId) {
        if (!NullChecker.m81303a(shareId) || TextUtils.isEmpty(shareId.userId) || TextUtils.isEmpty(shareId.momentId)) {
            return;
        }
        m200858k(w2e0Var, shareId);
    }

    /* JADX INFO: renamed from: k */
    public final void m200858k(w2e0 w2e0Var, ShareId shareId) {
        Intent intentArgsToMomentDetailAct = CoreModule.m29934N().argsToMomentDetailAct(w2e0Var.m201094b(), BLiveOperationClickAction.scheme, shareId.momentId, shareId.userId);
        if (intentArgsToMomentDetailAct == null) {
            return;
        }
        w2e0Var.m201094b().startActivity(intentArgsToMomentDetailAct);
    }
}
