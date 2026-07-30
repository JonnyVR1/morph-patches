package com.p046p1.mobile.putong.core.data;

/* JADX INFO: loaded from: classes10.dex */
public enum ReportFrom {
    CHAT_GROUP("group_chat"),
    IDENTIFY_FAKE("identify_fake"),
    PROFILE("profile"),
    CHAT("chat"),
    GROUPPROFILE("groupProfile"),
    GROUPCHAT("groupChat");

    String from_type;

    ReportFrom(String str) {
        this.from_type = str;
    }

    public String getFrom() {
        return this.from_type;
    }
}
