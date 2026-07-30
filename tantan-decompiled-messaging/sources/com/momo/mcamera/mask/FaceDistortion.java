package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class FaceDistortion {

    @SerializedName("strength")
    private float strength;

    @SerializedName("triggerType")
    private int triggerType;

    @SerializedName("type")
    private String type;

    public float getStrength() {
        return this.strength;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public String getType() {
        return this.type;
    }

    public void setStrength(float f) {
        this.strength = f;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }

    public void setType(String str) {
        this.type = str;
    }
}
