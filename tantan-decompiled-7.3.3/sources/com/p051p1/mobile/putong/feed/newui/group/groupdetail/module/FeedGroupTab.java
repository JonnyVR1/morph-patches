package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module;

import com.tantanapp.media.ttmediautils.tinker.ShareConstants;

/* JADX INFO: loaded from: classes13.dex */
public enum FeedGroupTab {
    GROUP_RECOMMEND("recommend"),
    GROUP_NEWEST(ShareConstants.NEW_VERSION),
    GROUP_FRIEND("friends"),
    GROUP_TOPIC("topic"),
    GROUP_CHAT("group");

    private String value;

    FeedGroupTab(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
