package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;

/* JADX INFO: loaded from: classes6.dex */
public class KeyStatus {

    @SerializedName("o")
    KeyFrameInfo alpha;

    @SerializedName("p")
    KeyFrameInfo position;

    @SerializedName("r")
    KeyFrameInfo rotation;

    @SerializedName(BLiveStormDanmakuGiftResourceType.f44446s)
    KeyFrameInfo scale;

    public KeyFrameInfo getAlpha() {
        return this.alpha;
    }

    public KeyFrameInfo getPosition() {
        return this.position;
    }

    public KeyFrameInfo getRotation() {
        return this.rotation;
    }

    public KeyFrameInfo getScale() {
        return this.scale;
    }

    public void setAlpha(KeyFrameInfo keyFrameInfo) {
        this.alpha = keyFrameInfo;
    }

    public void setPosition(KeyFrameInfo keyFrameInfo) {
        this.position = keyFrameInfo;
    }

    public void setRotation(KeyFrameInfo keyFrameInfo) {
        this.rotation = keyFrameInfo;
    }

    public void setScale(KeyFrameInfo keyFrameInfo) {
        this.scale = keyFrameInfo;
    }
}
