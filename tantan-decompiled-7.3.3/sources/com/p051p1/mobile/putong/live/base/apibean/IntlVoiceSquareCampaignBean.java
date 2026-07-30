package com.p051p1.mobile.putong.live.base.apibean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class IntlVoiceSquareCampaignBean extends BaseLiveBean {

    @SerializedName("currentTime")
    public long currentTime;

    @SerializedName("voiceRecommendPageCampaign")
    public IntlVoiceSquareCampaignData voiceRecommendPageCampaign;

    public static class IntlVoiceSquareCampaignData {

        @SerializedName("staySeconds")
        public int staySeconds;

        @SerializedName("url")
        public String url;
    }
}
