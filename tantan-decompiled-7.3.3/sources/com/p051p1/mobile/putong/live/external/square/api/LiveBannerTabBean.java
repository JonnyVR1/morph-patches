package com.p051p1.mobile.putong.live.external.square.api;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class LiveBannerTabBean {
    private static final String TYPE_LIVE_GROUP = "liveGroup";

    @SerializedName("media")
    public LiveBannerTabImage bannerMedia;

    @SerializedName("bannerType")
    public String bannerType;

    @SerializedName("jumpUrl")
    public String jumpUrl;

    @SerializedName("title")
    public String title;

    public boolean isLiveGroupType() {
        return TYPE_LIVE_GROUP.equals(this.bannerType);
    }
}
