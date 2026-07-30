package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class AssetValue {

    @SerializedName("u")
    String folderPath;

    @SerializedName("cnt")
    int frameCount;

    @SerializedName("h")
    int height;

    @SerializedName("id")
    String imageId;

    @SerializedName("p")
    String sourceName;

    @SerializedName("w")
    int width;

    public String getFolderPath() {
        return this.folderPath;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getHeight() {
        return this.height;
    }

    public String getImageId() {
        return this.imageId;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public int getWidth() {
        return this.width;
    }

    public void setFolderPath(String str) {
        this.folderPath = str;
    }

    public void setFrameCount(int i) {
        this.frameCount = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageId(String str) {
        this.imageId = str;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
