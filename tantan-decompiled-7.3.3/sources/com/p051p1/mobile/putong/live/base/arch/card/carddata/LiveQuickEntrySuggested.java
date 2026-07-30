package com.p051p1.mobile.putong.live.base.arch.card.carddata;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseListItemBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class LiveQuickEntrySuggested extends BaseListItemBean implements Serializable {

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("liveId")
    private String liveId;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    public LiveGoAction getGoAction() {
        return this.goAction;
    }

    public String getLiveId() {
        return this.liveId;
    }

    public LiveCardTrackData getTrackData() {
        return this.trackData;
    }

    public void setGoAction(LiveGoAction liveGoAction) {
        this.goAction = liveGoAction;
    }

    public void setLiveId(String str) {
        this.liveId = str;
    }

    public void setTrackData(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }
}
