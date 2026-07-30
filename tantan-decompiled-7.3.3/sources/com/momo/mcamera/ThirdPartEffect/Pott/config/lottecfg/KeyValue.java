package com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class KeyValue {

    @SerializedName(Constants.KEY_T)
    public int frameNo;

    @SerializedName(BLiveStormDanmakuGiftResourceType.f45294s)
    public List<Float> valueArray;

    public int getFrameNo() {
        return this.frameNo;
    }

    public List<Float> getValueArray() {
        return this.valueArray;
    }

    public void setFrameNo(int i) {
        this.frameNo = i;
    }

    public void setValueArray(List<Float> list) {
        this.valueArray = list;
    }
}
