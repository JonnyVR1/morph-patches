package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes13.dex */
public enum ReturnStatus {
    RETURN_STATUS_SUCCESS(0),
    RETURN_STATUS_FAILURE(-1),
    RETURN_STATUS_PARAMETER_ERR(-2),
    RETURN_STATUS_WRONG_STATE(-3),
    RETURN_STATUS_HAS_IN_ROOM(-4),
    RETURN_STATUS_HAS_IN_LOGIN(-5),
    RETURN_STATUS_HAS_IN_ECHO_TEST(-6),
    RETURN_STATUS_NEITHER_VIDEO_NOR_AUDIO(-7),
    RETURN_STATUS_ROOMID_IN_USE(-8),
    RETURN_STATUS_SCREEN_NOT_SUPPORT(-9),
    RETURN_STATUS_NOT_SUPPORT(-10),
    RETURN_STATUS_RESOURCE_OVERFLOW(-11),
    RETURN_STATUS_VIDEO_NOT_SUPPORT(-12),
    RETURN_STATUS_AUDIO_NO_FRAME(-101),
    RETURN_STATUS_AUDIO_NOT_IMPLEMENTED(-102),
    RETURN_STATUS_AUDIO_NO_PERMISSION(-103),
    RETURN_STATUS_AUDIO_DEVICE_NOT_EXISTS(TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION),
    RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT),
    RETURN_STATUS_AUDIO_DEVICE_NO_DEVICE(TXEAudioDef.TXE_AUDIO_RECORD_ERR_CUR_RECORDER_INVALID),
    RETURN_STATUS_AUDIO_DEVICE_CAN_NOT_USE(-107),
    RETURN_STATUS_AUDIO_DEVICE_INIT_FAILED(-108),
    RETURN_STATUS_AUDIO_DEVICE_START_FAILED(-109),
    RETURN_STATUS_AUDIO_DEVICE_PROCESS_NOT_EXIST(-110),
    RETURN_STATUS_NATIVE_IN_VALID(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_IS_NOT_NULL),
    RETURN_STATUS_VIDEO_TIMESTAMP_WARNING(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_ILLEGAL_ARGUMENTS),
    RETURN_STATUS_AEC_SCENE_WARNING(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_ILLEGAL_STATE),
    RETURN_STATUS_AEC_TYPE_WARNING(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE),
    RETURN_STATUS_ROOM_IS_DESTROY(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL);

    private int value;

    ReturnStatus(int i) {
        this.value = i;
    }

    @CalledByNative
    public static ReturnStatus fromId(int i) {
        for (ReturnStatus returnStatus : values()) {
            if (returnStatus.value() == i) {
                return returnStatus;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
