package com.momo.mcamera.mask;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class StickerFacePosition {

    @SerializedName("angle")
    private int angle;

    @SerializedName("facex")
    private int facex;

    @SerializedName("facey")
    private int facey;

    @SerializedName(Constants.KEY_RADIUS)
    private int radius;

    public int getAngle() {
        return this.angle;
    }

    public int getFacex() {
        return this.facex;
    }

    public int getFacey() {
        return this.facey;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setAngle(int i) {
        this.angle = i;
    }

    public void setFacex(int i) {
        this.facex = i;
    }

    public void setFacey(int i) {
        this.facey = i;
    }

    public void setRadius(int i) {
        this.radius = i;
    }
}
