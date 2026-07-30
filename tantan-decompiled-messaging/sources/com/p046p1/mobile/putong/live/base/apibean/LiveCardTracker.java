package com.p046p1.mobile.putong.live.base.apibean;

import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCardTracker {
    public static void trackMc(LiveCardTrackData liveCardTrackData) {
        if (liveCardTrackData == null || !liveCardTrackData.checkPassed()) {
            return;
        }
        zvf0.m220397s(liveCardTrackData.getModuleId(), liveCardTrackData.getPageId(), liveCardTrackData);
    }

    public static void trackMv(LiveCardTrackData liveCardTrackData) {
        if (liveCardTrackData == null || !liveCardTrackData.checkPassed()) {
            return;
        }
        zvf0.m220403y(liveCardTrackData.getModuleId(), liveCardTrackData.getPageId(), liveCardTrackData);
    }
}
