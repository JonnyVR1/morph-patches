package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class KeyFrameInfo2 {

    /* JADX INFO: renamed from: a */
    @SerializedName("a")
    int f14958a;

    /* JADX INFO: renamed from: ix */
    @SerializedName("ix")
    int f14959ix;

    @SerializedName("k")
    List<Float> keyValues;

    public int getA() {
        return this.f14958a;
    }

    public int getIx() {
        return this.f14959ix;
    }

    public List<Float> getKeyValues() {
        return this.keyValues;
    }

    public void setA(int i) {
        this.f14958a = i;
    }

    public void setIx(int i) {
        this.f14959ix = i;
    }

    public void setKeyValues(List<Float> list) {
        this.keyValues = list;
    }
}
