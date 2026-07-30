package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class Layers {

    @SerializedName("parent")
    int bindParent;

    @SerializedName("ks")
    KeyStatus keyStatus;

    @SerializedName("ind")
    int layerIndex;

    @SerializedName(Constants.NOTIF_MSG)
    String layerName;

    @SerializedName("refId")
    String refImageId;

    public int getBindParent() {
        return this.bindParent;
    }

    public KeyStatus getKeyStatus() {
        return this.keyStatus;
    }

    public int getLayerIndex() {
        return this.layerIndex;
    }

    public String getLayerName() {
        return this.layerName;
    }

    public String getRefImageId() {
        return this.refImageId;
    }

    public void setBindParent(int i) {
        this.bindParent = i;
    }

    public void setKeyStatus(KeyStatus keyStatus) {
        this.keyStatus = keyStatus;
    }

    public void setLayerIndex(int i) {
        this.layerIndex = i;
    }

    public void setLayerName(String str) {
        this.layerName = str;
    }

    public void setRefImageId(String str) {
        this.refImageId = str;
    }
}
