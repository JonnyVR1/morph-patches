package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ShareId;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class a9e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m96559e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m96560f(Throwable th) {
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("shareId");
        String str2 = abe0Var.m96743f().get("momentId");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strReplaceAll = str.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER);
        String strReplaceAll2 = str2.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER);
        if (CoreModule.m30929H().signedIn_()) {
            Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
            i4g0.m138495D("e_suggest_users_home_view_share_h5", "p_suggest_users_home_view", jyb.m147494Y("from_outside_type", "moment"));
            if (activityM105506D instanceof Act) {
                ((Act) activityM105506D).duringCreated(CoreModule.f18264c.f20347S1.m113539F3(strReplaceAll, strReplaceAll2)).subscribe(psd0.m173597H(new y20() { // from class: l.w8e0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f187848a.m96563i(abe0Var, (ShareId) obj);
                    }
                }, new y20() { // from class: l.x8e0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        a9e0.m96560f((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f18264c.f20347S1.m113539F3(strReplaceAll, strReplaceAll2).subscribe(psd0.m173597H(new y20() { // from class: l.y8e0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f197998a.m96564j(abe0Var, (ShareId) obj);
                    }
                }, new y20() { // from class: l.z8e0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        a9e0.m96559e((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m96563i(abe0 abe0Var, ShareId shareId) {
        if (!NullChecker.m82486a(shareId) || TextUtils.isEmpty(shareId.userId) || TextUtils.isEmpty(shareId.momentId)) {
            return;
        }
        m96565k(abe0Var, shareId);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m96564j(abe0 abe0Var, ShareId shareId) {
        if (!NullChecker.m82486a(shareId) || TextUtils.isEmpty(shareId.userId) || TextUtils.isEmpty(shareId.momentId)) {
            return;
        }
        m96565k(abe0Var, shareId);
    }

    /* JADX INFO: renamed from: k */
    public final void m96565k(abe0 abe0Var, ShareId shareId) {
        Intent intentArgsToMomentDetailAct = CoreModule.m30932N().argsToMomentDetailAct(abe0Var.m96739b(), BLiveOperationClickAction.scheme, shareId.momentId, shareId.userId);
        if (intentArgsToMomentDetailAct == null) {
            return;
        }
        abe0Var.m96739b().startActivity(intentArgsToMomentDetailAct);
    }
}
