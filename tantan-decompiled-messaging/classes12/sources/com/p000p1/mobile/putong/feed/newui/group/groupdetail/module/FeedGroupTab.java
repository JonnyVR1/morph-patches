package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module;

import com.p000p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public enum FeedGroupTab {
    GROUP_RECOMMEND("recommend"),
    GROUP_NEWEST("new"),
    GROUP_FRIEND("friends"),
    GROUP_TOPIC(SchemeKey.topic),
    GROUP_CHAT("group");

    private String value;

    FeedGroupTab(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
