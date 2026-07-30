package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
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

        @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
        public String name;
    }
}
