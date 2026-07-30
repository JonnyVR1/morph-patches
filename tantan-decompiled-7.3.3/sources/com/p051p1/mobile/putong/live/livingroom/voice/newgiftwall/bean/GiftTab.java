package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class GiftTab {

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    public String name;

    @SerializedName("sortRules")
    public List<SortRule> sortRules;

    @SerializedName("type")
    public String type;

    public static class SortRule {

        @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
        public String name;

        @SerializedName("type")
        public String type;
    }
}
