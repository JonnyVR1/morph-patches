package com.p051p1.mobile.putong.core.newui.home.card.expanded.base;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public enum ScrollState {
    IDLE("空闲状态"),
    DRAGGING("拖动中"),
    SCROLL_ANIM("动画滑动中");

    private String desc;

    ScrollState(String str) {
        this.desc = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.desc;
    }
}
