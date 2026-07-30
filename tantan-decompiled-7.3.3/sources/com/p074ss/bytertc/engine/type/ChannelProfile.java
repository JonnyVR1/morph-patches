package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum ChannelProfile {
    CHANNEL_PROFILE_COMMUNICATION(0),
    CHANNEL_PROFILE_GAME(2),
    CHANNEL_PROFILE_CLOUD_GAME(3),
    CHANNEL_PROFILE_LOW_LATENCY(4),
    CHANNEL_PROFILE_CHAT_ROOM(6),
    CHANNEL_PROFILE_INTERACTIVE_PODCAST(10),
    CHANNEL_PROFILE_CHORUS(12),
    CHANNEL_PROFILE_GAME_STREAMING(14),
    CHANNEL_PROFIEL_MEETING(16),
    CHANNEL_PROFILE_MEETING_ROOM(17),
    CHANNEL_PROFILE_CLASSROOM(18),
    CHANNEL_PROFILE_CALL(19),
    CHANNEL_PROFILE_LIVE(20);

    private final int value;

    ChannelProfile(int i) {
        this.value = i;
    }

    public static ChannelProfile fromId(int i) {
        for (ChannelProfile channelProfile : values()) {
            if (channelProfile.value() == i) {
                return channelProfile;
            }
        }
        return CHANNEL_PROFILE_COMMUNICATION;
    }

    public int value() {
        return this.value;
    }
}
