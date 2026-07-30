package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;
import com.momo.mcamera.mask.bean.TipsImagePosition;

/* JADX INFO: loaded from: classes8.dex */
public class TriggerTip {

    @SerializedName("content")
    private String content;
    private int contentDuration;
    private int frameCount;
    private String imageFolder;
    private TipsImagePosition imagePosition;
    private String imageType;
    private int loopCount;
    private int preferFrameRate;

    @SerializedName("triggerType")
    private int triggerType;

    public String getContent() {
        return this.content;
    }

    public int getContentDuration() {
        return this.contentDuration;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public String getImageFolder() {
        return this.imageFolder;
    }

    public TipsImagePosition getImagePosition() {
        return this.imagePosition;
    }

    public String getImageType() {
        return this.imageType;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public int getPreferFrameRate() {
        return this.preferFrameRate;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setContentDuration(int i) {
        this.contentDuration = i;
    }

    public void setFrameCount(int i) {
        this.frameCount = i;
    }

    public void setImageFolder(String str) {
        this.imageFolder = str;
    }

    public void setImagePosition(TipsImagePosition tipsImagePosition) {
        this.imagePosition = tipsImagePosition;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setLoopCount(int i) {
        this.loopCount = i;
    }

    public void setPreferFrameRate(int i) {
        this.preferFrameRate = i;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }
}
