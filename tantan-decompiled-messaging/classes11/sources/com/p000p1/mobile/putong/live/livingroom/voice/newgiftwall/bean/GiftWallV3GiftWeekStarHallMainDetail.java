package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.gson.annotations.SerializedName;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GiftWallV3GiftWeekStarHallMainDetail extends BaseLiveBean {

    @SerializedName("bubbleText")
    public String bubbleText;

    @SerializedName("lastWeekLeaderboards")
    public List<WeekStarLeaderboard> lastWeekLeaderboards;

    @SerializedName("leaderboards")
    public List<WeekStarLeaderboard> leaderboards;

    @SerializedName("myLeaderboard")
    public WeekStarLeaderboard myLeaderboard;

    @SerializedName("title")
    public String title;

    @SerializedName("unrankedLeaderboardCount")
    public int unrankedLeaderboardCount;
}
