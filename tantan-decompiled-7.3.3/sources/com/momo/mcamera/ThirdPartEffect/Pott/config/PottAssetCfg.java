package com.momo.mcamera.ThirdPartEffect.Pott.config;

import com.google.gson.annotations.SerializedName;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PottAssetCfg {

    @SerializedName("asset")
    List<MVSegmentCfg> assets;

    @SerializedName(WBConstants.AUTH_PARAMS_VERSION)
    String version;

    public List<MVSegmentCfg> getAssets() {
        return this.assets;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAssets(List<MVSegmentCfg> list) {
        this.assets = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
