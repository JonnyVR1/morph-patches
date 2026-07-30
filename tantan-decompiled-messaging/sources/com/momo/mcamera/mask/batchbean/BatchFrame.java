package com.momo.mcamera.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BatchFrame implements Serializable {

    @SerializedName("h")
    private int imageHeight;

    @SerializedName("w")
    private int imageWidth;

    @SerializedName(BaseSei.f13930X)
    private int imageX;

    @SerializedName(BaseSei.f13931Y)
    private int imageY;

    public int getImageHeight() {
        return this.imageHeight;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public int getImageX() {
        return this.imageX;
    }

    public int getImageY() {
        return this.imageY;
    }

    public void setImageHeight(int i) {
        this.imageHeight = i;
    }

    public void setImageWidth(int i) {
        this.imageWidth = i;
    }

    public void setImageX(int i) {
        this.imageX = i;
    }

    public void setImageY(int i) {
        this.imageY = i;
    }
}
