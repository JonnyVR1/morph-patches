package com.p000p1.mobile.putong.core.newui.home.card.expanded.base;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum ExpandedTouchType {
    TOUCH_DOWN("开始触摸"),
    TOUCH_START_SCROLL("触摸触发滑动"),
    TOUCH_SCROLLING("触摸进行中"),
    TOUCH_FINISH("触摸结束");

    String desc;

    ExpandedTouchType(String str) {
        this.desc = str;
    }
}
