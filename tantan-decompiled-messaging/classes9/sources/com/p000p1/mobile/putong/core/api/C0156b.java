package com.p000p1.mobile.putong.core.api;

import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0156b {
    /* JADX INFO: renamed from: a */
    public static boolean m3337a(CoreSuggested.UserInfo userInfo) {
        return NullChecker.a(userInfo) && NullChecker.a(userInfo.active);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3338b(VirtualCardType virtualCardType) {
        return virtualCardType == VirtualCardType.NativeAdViewCard || virtualCardType == VirtualCardType.IntlSeeCard || virtualCardType == VirtualCardType.IntlVipCard || virtualCardType == VirtualCardType.LiveActiveCard || virtualCardType == VirtualCardType.MinBoostCard || virtualCardType == VirtualCardType.IntlFreeSpotlightCard || virtualCardType == VirtualCardType.IntlTextBuzzActiveCard || virtualCardType == VirtualCardType.IntlVoiceBuzzActiveCard || virtualCardType == VirtualCardType.IntlVideoBuzzActiveCard;
    }
}
