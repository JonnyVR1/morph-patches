package com.p051p1.mobile.putong.core.p058ui.lovebuzz.media;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "", "<init>", "(Ljava/lang/String;I)V", "UN_INIT_STATE", "INIT_STATE", "JOINING_STATE", "PREPARE_JOINING_STATE", "LOCAL_JOINED_STATE", "PEER_JOINED_STATE", "PEER_VIDEO_JOIN", "PEER_VIDEO_REMOVE", "RECEIVE_PEER_VIDEO_FIRST", "CALLING_STATE", "LEAVE_STATE", "MEMBER_LEAVE", "JOIN_FAIL", "CONNECTION_LOST", "RECEIVE_PHONE_CALL", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public enum BuzzCallState {
    UN_INIT_STATE,
    INIT_STATE,
    JOINING_STATE,
    PREPARE_JOINING_STATE,
    LOCAL_JOINED_STATE,
    PEER_JOINED_STATE,
    PEER_VIDEO_JOIN,
    PEER_VIDEO_REMOVE,
    RECEIVE_PEER_VIDEO_FIRST,
    CALLING_STATE,
    LEAVE_STATE,
    MEMBER_LEAVE,
    JOIN_FAIL,
    CONNECTION_LOST,
    RECEIVE_PHONE_CALL;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    public static EnumEntries<BuzzCallState> getEntries() {
        return $ENTRIES;
    }
}
