package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;

/* JADX INFO: loaded from: classes10.dex */
public class WeekStarLeaderboard {

    @SerializedName("gapScore")
    public int gapScore;

    @SerializedName(BLivePkCategory.rank)
    public int rank;

    @SerializedName(FirebaseAnalytics.Param.SCORE)
    public int score;

    @SerializedName("user")
    public UserBean user;
}
