package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4730b {
    /* JADX INFO: renamed from: a */
    public static boolean m31407a(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.active);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m31408b(VirtualCardType virtualCardType) {
        return virtualCardType == VirtualCardType.NativeAdViewCard || virtualCardType == VirtualCardType.IntlSeeCard || virtualCardType == VirtualCardType.IntlVipCard || virtualCardType == VirtualCardType.LiveActiveCard || virtualCardType == VirtualCardType.MinBoostCard || virtualCardType == VirtualCardType.IntlFreeSpotlightCard || virtualCardType == VirtualCardType.IntlTextBuzzActiveCard || virtualCardType == VirtualCardType.IntlVoiceBuzzActiveCard || virtualCardType == VirtualCardType.IntlVideoBuzzActiveCard;
    }
}
