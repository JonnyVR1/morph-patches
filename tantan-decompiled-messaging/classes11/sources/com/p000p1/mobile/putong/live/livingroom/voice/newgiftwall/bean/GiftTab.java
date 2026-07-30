package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.gson.annotations.SerializedName;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GiftTab {

    @SerializedName("name")
    public String name;

    @SerializedName("sortRules")
    public List<SortRule> sortRules;

    @SerializedName(MiniWidgetProvider.KEY_TYPE)
    public String type;

    public static class SortRule {

        @SerializedName("name")
        public String name;

        @SerializedName(MiniWidgetProvider.KEY_TYPE)
        public String type;
    }
}
