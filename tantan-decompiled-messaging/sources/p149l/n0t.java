package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSwipeLiveCardConfig;

/* JADX INFO: loaded from: classes13.dex */
public class n0t implements m0t {
    @Override // p149l.m0t
    /* JADX INFO: renamed from: a */
    public boolean mo152520a() {
        BLiveConfig bLiveConfig;
        BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig;
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (bLiveSwipeLiveCardConfig = bLiveConfig.swipeLiveCardConfig) == null) {
            return true;
        }
        return bLiveSwipeLiveCardConfig.swipeEnable;
    }
}
