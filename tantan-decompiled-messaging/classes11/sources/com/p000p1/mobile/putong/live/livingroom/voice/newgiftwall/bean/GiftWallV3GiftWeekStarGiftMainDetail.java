package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.gson.annotations.SerializedName;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GiftWallV3GiftWeekStarGiftMainDetail extends BaseLiveBean {

    @SerializedName("gift")
    public GiftBean gift;

    @SerializedName("grabRankGiftNum")
    public int grabRankGiftNum;

    @SerializedName("grabRankPrice")
    public int grabRankPrice;

    @SerializedName("leaderboardThreshold")
    public int leaderboardThreshold;

    @SerializedName("leaderboards")
    public List<WeekStarLeaderboard> leaderboards;

    @SerializedName("meUser")
    public UserBean meUser;

    @SerializedName("myLeaderboard")
    public WeekStarLeaderboard myLeaderboard;

    @SerializedName("top1Rewards")
    public List<Top1Reward> top1Rewards;

    @SerializedName("user")
    public UserBean user;

    public static class Top1Reward {

        @SerializedName("icon")
        public String icon;

        @SerializedName("name")
        public String name;
    }
}
