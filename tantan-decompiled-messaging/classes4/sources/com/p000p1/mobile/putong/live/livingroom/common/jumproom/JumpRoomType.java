package com.p000p1.mobile.putong.live.livingroom.common.jumproom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public enum JumpRoomType {
    DEFAULT(false),
    CHANGE_SOURCE_NO_BACK(true),
    CHANGE_SOURCE_WITH_BACK(true),
    USER_SWIPE(false),
    END_SUGGEST(false);

    private final boolean needChangeSource;

    JumpRoomType(boolean z) {
        this.needChangeSource = z;
    }

    public boolean needChangeSource() {
        return this.needChangeSource;
    }
}
