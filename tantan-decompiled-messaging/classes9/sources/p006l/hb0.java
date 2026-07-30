package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import l.le7;
import l.mqi0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hb0 {
    /* JADX INFO: renamed from: a */
    public static void m16141a(SwipeDirection swipeDirection, OMSAdCardInfo oMSAdCardInfo) {
        if (le7.g() && oMSAdCardInfo.identifier.contains("guideNewUserCompleteMaterial")) {
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                CoreModule.f1534c.f3628e0.f18859Q1.put(Long.valueOf(mqi0.o() + (((long) (le7.b() * 86400)) * 1000)));
                if (!TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.action.deeplink)) {
                    CoreModule.f1534c.f3631f0.f3894V0.put(oMSAdCardInfo.content.omsCard.action.deeplink);
                }
                if (!TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.title) && oMSAdCardInfo.content.omsCard.title.contains(" ") && !TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.title.split(" ")[0])) {
                    CoreModule.f1534c.f3631f0.f3888T0.put(oMSAdCardInfo.content.omsCard.title.split(" ")[0]);
                }
                if (vwb.J(oMSAdCardInfo.content.omsCard.icons) || TextUtils.isEmpty((CharSequence) oMSAdCardInfo.content.omsCard.icons.get(0))) {
                    return;
                }
                CoreModule.f1534c.f3631f0.f3885S0.put((String) oMSAdCardInfo.content.omsCard.icons.get(0));
            }
        }
    }
}
