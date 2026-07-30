package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum SubtitleErrorCode {
    SUBTITLE_ERROR_CODE_UNKNOW(-1),
    SUBTITLE_ERROR_CODE_SUCCESS(0),
    SUBTITLE_ERROR_CODE_POST_PROCESS_ERROR(1),
    SUBTITLE_ERROR_CODE_ASR_CONNECTION_ERROR(2),
    SUBTITLE_ERROR_CODE_ASR_SERVICE_ERROR(3),
    SUBTITLE_ERROR_CODE_BEFORE_JOIN_ROOM(4),
    SUBTITLE_ERROR_CODE_ALREADY_ON(5),
    SUBTITLE_ERROR_CODE_UNSUPPORTED_LANGUAGE(6),
    SUBTITLE_ERROR_CODE_POST_PROCESS_TIMEOUT(7);

    private int value;

    SubtitleErrorCode(int i) {
        this.value = i;
    }

    public static SubtitleErrorCode fromId(int i) {
        for (SubtitleErrorCode subtitleErrorCode : values()) {
            if (subtitleErrorCode.value() == i) {
                return subtitleErrorCode;
            }
        }
        return SUBTITLE_ERROR_CODE_UNKNOW;
    }

    public int value() {
        return this.value;
    }
}
