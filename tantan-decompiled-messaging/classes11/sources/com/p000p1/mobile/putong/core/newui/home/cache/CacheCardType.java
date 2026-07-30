package com.p000p1.mobile.putong.core.newui.home.cache;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum CacheCardType {
    DEFAULT_CARD("普通的划卡-可切卡"),
    EXPANDED_CARD("平铺的，可上下滑动卡片"),
    TRANS_EXPANDED_CARD("平铺的，可上下滑动卡片");

    private String desc;

    CacheCardType(String str) {
        this.desc = str;
    }
}
