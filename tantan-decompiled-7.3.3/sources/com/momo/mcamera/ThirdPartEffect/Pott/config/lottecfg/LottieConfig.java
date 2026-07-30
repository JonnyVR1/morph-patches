package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class LottieConfig {

    @SerializedName("assets")
    List<AssetValue> assetValues;

    @SerializedName("h")
    int height;

    @SerializedName("layers")
    List<Layers> layers;

    @SerializedName(Constants.NOTIF_MSG)
    String name;

    @SerializedName("w")
    int width;

    public List<AssetValue> getAssetValues() {
        return this.assetValues;
    }

    public int getHeight() {
        return this.height;
    }

    public List<Layers> getLayers() {
        return this.layers;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAssetValues(List<AssetValue> list) {
        this.assetValues = list;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLayers(List<Layers> list) {
        this.layers = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
