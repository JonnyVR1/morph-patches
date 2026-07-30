package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum MediaStreamType {
    RTC_MEDIA_STREAM_TYPE_AUDIO(1),
    RTC_MEDIA_STREAM_TYPE_VIDEO(2),
    RTC_MEDIA_STREAM_TYPE_BOTH(3);

    public final int value;

    MediaStreamType(int i) {
        this.value = i;
    }

    public static MediaStreamType valueOf(int i) {
        if (i == 1) {
            return RTC_MEDIA_STREAM_TYPE_AUDIO;
        }
        if (i == 2) {
            return RTC_MEDIA_STREAM_TYPE_VIDEO;
        }
        if (i != 3) {
            return null;
        }
        return RTC_MEDIA_STREAM_TYPE_BOTH;
    }
}
