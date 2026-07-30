package com.p051p1.mobile.putong.live.base.apibean;

import com.p051p1.mobile.putong.live.base.data.BLiveQuitPopup;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class LiveRoomSuggestBean {
    private final BLiveQuitPopup liveQuitPopup;
    private final List<BLiveSuggestLive> suggestedLives;

    public LiveRoomSuggestBean(List<BLiveSuggestLive> list, BLiveQuitPopup bLiveQuitPopup) {
        this.liveQuitPopup = bLiveQuitPopup;
        this.suggestedLives = list;
    }

    public BLiveQuitPopup getLiveQuitPopup() {
        return this.liveQuitPopup;
    }

    public List<BLiveSuggestLive> getSuggestedLives() {
        return this.suggestedLives;
    }
}
