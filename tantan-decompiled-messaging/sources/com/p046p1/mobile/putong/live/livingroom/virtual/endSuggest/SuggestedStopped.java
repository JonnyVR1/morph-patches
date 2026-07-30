package com.p046p1.mobile.putong.live.livingroom.virtual.endSuggest;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes5.dex */
public class SuggestedStopped extends BaseLiveBean {

    @SerializedName("buttonText")
    private String buttonText;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("image")
    private String iamge;

    @SerializedName("imageText")
    private String imageText;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("timeTpl")
    private String timeTpl;

    @SerializedName("times")
    private int times;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    public String getButtonText() {
        return this.buttonText;
    }

    public LiveGoAction getGoAction() {
        return this.goAction;
    }

    public String getIamge() {
        return this.iamge;
    }

    public String getImageText() {
        return this.imageText;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTimeTpl() {
        return this.timeTpl;
    }

    public int getTimes() {
        return this.times;
    }

    public String getTitle() {
        return this.title;
    }

    public LiveCardTrackData getTrackData() {
        return this.trackData;
    }
}
