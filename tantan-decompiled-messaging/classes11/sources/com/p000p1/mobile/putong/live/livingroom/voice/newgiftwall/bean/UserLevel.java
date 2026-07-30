package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.gson.annotations.SerializedName;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserLevel {

    @SerializedName("bgImage")
    public String bgImage;

    @SerializedName("image")
    public String image;

    @SerializedName("name")
    public String name;

    @SerializedName("nextLevelGiftCount")
    public int nextLevelGiftCount;

    @SerializedName("ownedGiftCount")
    public int ownedGiftCount;

    @SerializedName("progressBgColor")
    public String progressBgColor;

    @SerializedName(WBConstants.TRANS_PROGRESS_COLOR)
    public String progressColor;

    @SerializedName("score")
    public long score;

    @SerializedName("smallBgImage")
    public String smallBgImage;
}
