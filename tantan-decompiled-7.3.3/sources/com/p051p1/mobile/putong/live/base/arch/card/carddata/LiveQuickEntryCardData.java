package com.p051p1.mobile.putong.live.base.arch.card.carddata;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseListItemBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class LiveQuickEntryCardData extends BaseListItemBean implements Serializable {

    @SerializedName("bgColor")
    private String bgColor;

    @SerializedName("icon")
    private String icon;

    @SerializedName("source")
    private String source;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    public String getBgColor() {
        return this.bgColor;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getSource() {
        return this.source;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public LiveCardTrackData getTrackData() {
        return this.trackData;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackData(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }
}
