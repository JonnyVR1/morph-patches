package com.p046p1.mobile.putong.core.newui.home.frag.base;

import com.p046p1.mobile.putong.data.NavigationCardIntent;

/* JADX INFO: loaded from: classes11.dex */
public enum NewTanFragTag {
    HOME("home"),
    ALREADY_AUTH("already_auth"),
    MOMENT_THEME_CARD(NavigationCardIntent.moment_theme_card),
    TOP_PICKS("TopPicks"),
    PLAY_TOGETHER("PlayTogether"),
    MARRY_MODE("MarryMode"),
    WEBVIEW_CONFIG("WebViewConfig"),
    SUPREME_PARTNER("SupremePartner"),
    YOUTH_VIP("YouthVip"),
    PRIVATE_CUSTOM("PrivateCustom"),
    UNKNOWN("unknown");

    private String tag;

    NewTanFragTag(String str) {
        this.tag = str;
    }

    public static NewTanFragTag find(String str) {
        NewTanFragTag newTanFragTag = HOME;
        if (newTanFragTag.getTag().equals(str) || ALREADY_AUTH.getTag().equals(str)) {
            return newTanFragTag;
        }
        NewTanFragTag newTanFragTag2 = MOMENT_THEME_CARD;
        if (newTanFragTag2.getTag().equals(str)) {
            return newTanFragTag2;
        }
        NewTanFragTag newTanFragTag3 = TOP_PICKS;
        if (newTanFragTag3.getTag().equals(str)) {
            return newTanFragTag3;
        }
        NewTanFragTag newTanFragTag4 = PLAY_TOGETHER;
        if (newTanFragTag4.getTag().equals(str)) {
            return newTanFragTag4;
        }
        NewTanFragTag newTanFragTag5 = WEBVIEW_CONFIG;
        if (newTanFragTag5.getTag().equals(str)) {
            return newTanFragTag5;
        }
        NewTanFragTag newTanFragTag6 = MARRY_MODE;
        if (newTanFragTag6.getTag().equals(str)) {
            return newTanFragTag6;
        }
        NewTanFragTag newTanFragTag7 = SUPREME_PARTNER;
        if (newTanFragTag7.getTag().equals(str)) {
            return newTanFragTag7;
        }
        NewTanFragTag newTanFragTag8 = YOUTH_VIP;
        if (newTanFragTag8.getTag().equals(str)) {
            return newTanFragTag8;
        }
        NewTanFragTag newTanFragTag9 = PRIVATE_CUSTOM;
        return newTanFragTag9.getTag().equals(str) ? newTanFragTag9 : UNKNOWN;
    }

    public String getTag() {
        return this.tag;
    }
}
