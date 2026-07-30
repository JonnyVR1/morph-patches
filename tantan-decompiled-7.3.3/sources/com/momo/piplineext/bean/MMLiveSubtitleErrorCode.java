package com.momo.piplineext.bean;

/* JADX INFO: loaded from: classes8.dex */
public enum MMLiveSubtitleErrorCode {
    SUBTITLE_ERROR_CODE_UNKNOW(-1),
    SUBTITLE_ERROR_CODE_SUCCESS(0),
    SUBTITLE_ERROR_CODE_POST_PROCESS_ERROR(1),
    SUBTITLE_ERROR_CODE_ASR_CONNECTION_ERROR(2),
    SUBTITLE_ERROR_CODE_ASR_SERVICE_ERROR(3),
    SUBTITLE_ERROR_CODE_BEFORE_JOIN_ROOM(4),
    SUBTITLE_ERROR_CODE_ALREADY_ON(5),
    SUBTITLE_ERROR_CODE_UNSUPPORTED_LANGUAGE(6),
    SUBTITLE_ERROR_CODE_ERROR_PPOST_PROCESS_TIMEOUT(7),
    SUBTITLE_ERROR_CODE_ERROR_PARAMETER(8);

    private int value;

    MMLiveSubtitleErrorCode(int i) {
        this.value = i;
    }

    public static MMLiveSubtitleErrorCode fromId(int i) {
        for (MMLiveSubtitleErrorCode mMLiveSubtitleErrorCode : values()) {
            if (mMLiveSubtitleErrorCode.value() == i) {
                return mMLiveSubtitleErrorCode;
            }
        }
        return SUBTITLE_ERROR_CODE_UNKNOW;
    }

    public int value() {
        return this.value;
    }
}
