package p149l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes9.dex */
public class hb0 {
    /* JADX INFO: renamed from: a */
    public static void m130254a(SwipeDirection swipeDirection, OMSAdCardInfo oMSAdCardInfo) {
        if (le7.m149485g() && oMSAdCardInfo.identifier.contains("guideNewUserCompleteMaterial")) {
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                CoreModule.f17545c.f19639e0.f149247Q1.put(Long.valueOf(mqi0.m155944o() + (((long) (le7.m149480b() * MMKV.ExpireInDay)) * 1000)));
                if (!TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.action.deeplink)) {
                    CoreModule.f17545c.f19642f0.f19905V0.put(oMSAdCardInfo.content.omsCard.action.deeplink);
                }
                if (!TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.title) && oMSAdCardInfo.content.omsCard.title.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) && !TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.title.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0])) {
                    CoreModule.f17545c.f19642f0.f19899T0.put(oMSAdCardInfo.content.omsCard.title.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0]);
                }
                if (vwb.m200296J(oMSAdCardInfo.content.omsCard.icons) || TextUtils.isEmpty(oMSAdCardInfo.content.omsCard.icons.get(0))) {
                    return;
                }
                CoreModule.f17545c.f19642f0.f19896S0.put(oMSAdCardInfo.content.omsCard.icons.get(0));
            }
        }
    }
}
