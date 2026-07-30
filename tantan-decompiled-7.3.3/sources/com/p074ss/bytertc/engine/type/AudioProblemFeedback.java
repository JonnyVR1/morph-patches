package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioProblemFeedback {
    NONE(0),
    OTHER_MESSAGE(1),
    DISCONNECTED(2),
    EAR_BACK_DELAY(4),
    LOCAL_NOISE(1024),
    LOCAL_AUDIO_LAGGING(2048),
    LOCAL_NO_AUDIO(4096),
    LOCAL_AUDIO_STRENGTH(8192),
    LOCAL_ECHO(16384),
    LOCAL_VIDEO_FUZZY(16777216),
    LOCAL_NOT_SYNC(33554432),
    LOCAL_VIDEO_LAGGING(67108864),
    LOCAL_NO_VIDEO(134217728),
    REMOTE_NOISE(137438953472L),
    REMOTE_AUDIO_LAGGING(274877906944L),
    REMOTE_NO_AUDIO(549755813888L),
    REMOTE_AUDIO_STRENGTH(1099511627776L),
    REMOTE_ECHO(2199023255552L),
    REMOTE_VIDEO_FUZZY(2251799813685248L),
    REMOTE_NOT_SYNC(4503599627370496L),
    REMOTE_VIDEO_LAGGING(9007199254740992L),
    REMOTE_NO_VIDEO(18014398509481984L);

    public final long value;

    AudioProblemFeedback(long j) {
        this.value = j;
    }

    public static AudioProblemFeedback fromId(int i) {
        for (AudioProblemFeedback audioProblemFeedback : values()) {
            if (audioProblemFeedback.value == i) {
                return audioProblemFeedback;
            }
        }
        return NONE;
    }
}
