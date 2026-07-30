package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareSingleEntryBean extends BaseLiveBean {

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    public LiveGoAction getGoAction() {
        return this.goAction;
    }

    public LiveCardTrackData getTrackData() {
        return this.trackData;
    }

    public void setGoAction(LiveGoAction liveGoAction) {
        this.goAction = liveGoAction;
    }

    public void setTrackData(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }
}
