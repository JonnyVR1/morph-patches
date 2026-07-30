package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSwipeLiveCardConfig;

/* JADX INFO: loaded from: classes9.dex */
public class o2t implements n2t {
    @Override // p153l.n2t
    /* JADX INFO: renamed from: a */
    public boolean mo161253a() {
        BLiveConfig bLiveConfig;
        BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig;
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (bLiveSwipeLiveCardConfig = bLiveConfig.swipeLiveCardConfig) == null) {
            return true;
        }
        return bLiveSwipeLiveCardConfig.swipeEnable;
    }
}
