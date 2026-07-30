package com.p051p1.mobile.putong.newui.main.base;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes10.dex */
public enum TabName {
    Card("card"),
    Msg("msg"),
    Live("live"),
    Post("post"),
    Moment("moment"),
    Me("me"),
    VoiceChat(NavigationIntent.voiceChat),
    Buzz("buzz"),
    FEATURED("featured"),
    Meet("meet");

    private final String text;

    TabName(String str) {
        this.text = str;
    }

    public static TabName transform(String str) {
        TabName tabName = Card;
        if (TextUtils.equals(tabName.toString(), str)) {
            return tabName;
        }
        TabName tabName2 = Msg;
        if (TextUtils.equals(tabName2.toString(), str)) {
            return tabName2;
        }
        TabName tabName3 = Post;
        if (TextUtils.equals(tabName3.toString(), str)) {
            return tabName3;
        }
        TabName tabName4 = Moment;
        if (TextUtils.equals(tabName4.toString(), str)) {
            return tabName4;
        }
        TabName tabName5 = Me;
        if (TextUtils.equals(tabName5.toString(), str)) {
            return tabName5;
        }
        TabName tabName6 = VoiceChat;
        if (TextUtils.equals(tabName6.toString(), str)) {
            return tabName6;
        }
        TabName tabName7 = Buzz;
        if (TextUtils.equals(tabName7.toString(), str)) {
            return tabName7;
        }
        TabName tabName8 = Live;
        if (TextUtils.equals(tabName8.toString(), str)) {
            return tabName8;
        }
        TabName tabName9 = FEATURED;
        if (TextUtils.equals(tabName9.toString(), str)) {
            return tabName9;
        }
        TabName tabName10 = Meet;
        if (TextUtils.equals(tabName10.toString(), str)) {
            return tabName10;
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
