package com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module;

/* JADX INFO: loaded from: classes12.dex */
public enum FeedInteractionTab {
    Like("like"),
    Comment("comment"),
    Attention("follow");

    private String value;

    FeedInteractionTab(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
