package com.p003p1.mobile.android.p005ui.poplevel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum PopLifecycleEvent {
    PENDING("准备中"),
    ACTIVE("活跃状态"),
    STOP("页面暂停"),
    DESTROY("页面销毁");

    private String desc;

    PopLifecycleEvent(String str) {
        this.desc = str;
    }
}
