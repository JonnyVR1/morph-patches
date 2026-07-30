package com.immomo.velib.anim.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class MixSetting {

    @SerializedName("a_v")
    private float[] ratio;

    public float[] getRatio() {
        return this.ratio;
    }

    public void setRatio(float[] fArr) {
        this.ratio = fArr;
    }
}
