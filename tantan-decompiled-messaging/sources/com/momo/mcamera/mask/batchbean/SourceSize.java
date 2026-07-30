package com.momo.mcamera.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class SourceSize implements Serializable {

    @SerializedName("h")
    private int imageSizeHeight;

    @SerializedName("w")
    private int imageSizeWidth;

    public int getImageSizeHeight() {
        return this.imageSizeHeight;
    }

    public int getImageSizeWidth() {
        return this.imageSizeWidth;
    }

    public void setImageSizeHeight(int i) {
        this.imageSizeHeight = i;
    }

    public void setImageSizeWidth(int i) {
        this.imageSizeWidth = i;
    }
}
