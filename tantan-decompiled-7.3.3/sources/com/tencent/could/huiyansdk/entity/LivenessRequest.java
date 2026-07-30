package com.tencent.could.huiyansdk.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class LivenessRequest {

    @SerializedName("bestFrameImageFromTerminal")
    public String bestFrameImageFromTerminal;

    @SerializedName("LiveData")
    public String liveData;

    @SerializedName("NeedBestFrame")
    public boolean needBestFrame = false;

    @SerializedName("Video")
    public String video;

    public String getBestFrameImageFromTerminal() {
        return this.bestFrameImageFromTerminal;
    }

    public String getLiveData() {
        return this.liveData;
    }

    public String getVideo() {
        return this.video;
    }

    public boolean isNeedBestFrame() {
        return this.needBestFrame;
    }

    public void setBestFrameImageFromTerminal(String str) {
        this.bestFrameImageFromTerminal = str;
    }

    public void setLiveData(String str) {
        this.liveData = str;
    }

    public void setNeedBestFrame(boolean z) {
        this.needBestFrame = z;
    }

    public void setVideo(String str) {
        this.video = str;
    }
}
