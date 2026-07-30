package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk;

/* JADX INFO: loaded from: classes5.dex */
public enum PkAction {
    ACTION_SEEK,
    ACTION_CANCEL_SEEK,
    ACTION_RETRY_SEEK,
    ACTION_PK_ONCE_MORE,
    ACTION_PK_EXIT,
    ACTION_FOLLOW_USER,
    ACTION_REMOTE_MUTE,
    ACTION_OTHER_EXIT,
    ACTION_OTHER_ADD,
    ACTION_TIME_OUT,
    ACTION_ENTER_ROOM,
    ACTION_SHOW_FRIEND,
    ACTION_ACCEPT_INVITE,
    ACTION_INVITE_REJECT,
    ACTION_SHOW_USER_CARD,
    ACTION_CTYP_NORMAL_TO_PK,
    ACTION_CTYP_UNKNOWN_TO_PK,
    ACTION_OTHER_LEAVE,
    ACTION_CTYP_TO_NORMAL,
    ACTION_INVITE_FRIEND,
    PK_CRETE_INVITE_SUCCESS,
    ACTIOIN_DECLINE_SETTING,
    ACTION_CANCEL_INVITE;

    private String extra;

    PkAction(String str) {
        this.extra = str;
    }

    public String getExtra() {
        return this.extra;
    }

    public PkAction setExtra(String str) {
        this.extra = str;
        return this;
    }
}
