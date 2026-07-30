package com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module;

/* JADX INFO: loaded from: classes13.dex */
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
