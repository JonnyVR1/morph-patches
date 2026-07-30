package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class LandMarksEntity {

    @SerializedName("landmarks")
    private float[] landmarks;

    public float[] getLandmarks() {
        return this.landmarks;
    }

    public void setLandmarks(float[] fArr) {
        this.landmarks = fArr;
    }
}
