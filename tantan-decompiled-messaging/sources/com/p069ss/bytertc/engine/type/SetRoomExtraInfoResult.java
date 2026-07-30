package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;

/* JADX INFO: loaded from: classes13.dex */
public enum SetRoomExtraInfoResult {
    SUCCESS(0),
    NOT_JOIN_ROOM(-1),
    KEY_IS_NULL(-2),
    VALUE_IS_NULL(-3),
    UNKNOW(-99),
    KEY_IS_EMPTY(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL),
    TOO_OFTEN(-406),
    SILENT_USER(-412),
    KEY_TOO_LONG(-413),
    VALUE_TOO_LONG(-414),
    SERVER_ERROR(-500);

    private final int value;

    SetRoomExtraInfoResult() {
        this.value = 0;
    }

    public static SetRoomExtraInfoResult fromId(int i) {
        for (SetRoomExtraInfoResult setRoomExtraInfoResult : values()) {
            if (setRoomExtraInfoResult.value() == i) {
                return setRoomExtraInfoResult;
            }
        }
        return UNKNOW;
    }

    public int value() {
        return this.value;
    }

    SetRoomExtraInfoResult(int i) {
        this.value = i;
    }
}
