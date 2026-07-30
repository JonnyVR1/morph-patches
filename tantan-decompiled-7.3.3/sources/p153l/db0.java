package p153l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes9.dex */
public class db0 {
    /* JADX INFO: renamed from: a */
    public static void m115156a(SwipeDirection swipeDirection, OMSAdCardInfo oMSAdCardInfo) {
        if (pf7.m172092g() && oMSAdCardInfo.identifier.contains("guideNewUserCompleteMaterial")) {
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                CoreModule.f18264c.f20381e0.f89104Q1.put(Long.valueOf(pzi0.m174454o() + (((long) (pf7.m172087b() * MMKV.ExpireInDay)) * 1000)));
                if (!TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.action.deeplink)) {
                    CoreModule.f18264c.f20384f0.f20647V0.put(oMSAdCardInfo.content.omsCard.action.deeplink);
                }
                if (!TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.title) && oMSAdCardInfo.content.omsCard.title.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) && !TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.title.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0])) {
                    CoreModule.f18264c.f20384f0.f20641T0.put(oMSAdCardInfo.content.omsCard.title.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0]);
                }
                if (jyb.m147479J(oMSAdCardInfo.content.omsCard.icons) || TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.icons.get(0))) {
                    return;
                }
                CoreModule.f18264c.f20384f0.f20638S0.put(oMSAdCardInfo.content.omsCard.icons.get(0));
            }
        }
    }
}
