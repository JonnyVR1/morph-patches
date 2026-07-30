package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GiftWallV3MainDetail extends BaseLiveBean {

    @SerializedName("currentTime")
    public long currentTime;

    @SerializedName(FirebaseAnalytics.Param.LEVEL)
    public UserLevel level;

    @SerializedName("ownedGiftCount")
    public int ownedGiftCount;

    @SerializedName("rulePageSchema")
    public String rulePageSchema;

    @SerializedName("showWeekStarHale")
    public boolean showWeekStarHale;

    @SerializedName("tabs")
    public List<GiftTab> tabs;

    @SerializedName("title")
    public String title;

    @SerializedName("totalGiftCount")
    public int totalGiftCount;

    @SerializedName("user")
    public UserBean user;

    @SerializedName("weekStarGiftTab")
    public WeekStarGiftTab weekStarGiftTab;
}
