package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: classes11.dex */
public class UserLevel {

    @SerializedName("bgImage")
    public String bgImage;

    @SerializedName("image")
    public String image;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    public String name;

    @SerializedName("nextLevelGiftCount")
    public int nextLevelGiftCount;

    @SerializedName("ownedGiftCount")
    public int ownedGiftCount;

    @SerializedName("progressBgColor")
    public String progressBgColor;

    @SerializedName(WBConstants.TRANS_PROGRESS_COLOR)
    public String progressColor;

    @SerializedName(FirebaseAnalytics.Param.SCORE)
    public long score;

    @SerializedName("smallBgImage")
    public String smallBgImage;
}
