package com.p051p1.mobile.putong.live.base.apibean;

import p153l.i4g0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCardTracker {
    public static void trackMc(LiveCardTrackData liveCardTrackData) {
        if (liveCardTrackData == null || !liveCardTrackData.checkPassed()) {
            return;
        }
        i4g0.m138521s(liveCardTrackData.getModuleId(), liveCardTrackData.getPageId(), liveCardTrackData);
    }

    public static void trackMv(LiveCardTrackData liveCardTrackData) {
        if (liveCardTrackData == null || !liveCardTrackData.checkPassed()) {
            return;
        }
        i4g0.m138527y(liveCardTrackData.getModuleId(), liveCardTrackData.getPageId(), liveCardTrackData);
    }
}
