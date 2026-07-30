package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class KeyFrameInfo {

    @SerializedName("k")
    List<KeyValue> keyValues;

    public List<KeyValue> getKeyValues() {
        return this.keyValues;
    }

    public void setKeyValues(List<KeyValue> list) {
        this.keyValues = list;
    }
}
