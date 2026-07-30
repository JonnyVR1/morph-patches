package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class UserBean {

    @SerializedName("avatar")
    public String avatar;

    /* JADX INFO: renamed from: id */
    @SerializedName("id")
    public String f53754id;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    public String name;

    @SerializedName("sendGiftCount")
    public int sendGiftCount;
}
