package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes.dex */
public class ErrorCode {
    public static final int AUDIOPLAYER_PREAPARE_FAILED = 6001;
    public static final int AUDIOPLAYER_RELEASE_FAILED = 6003;
    public static final int AUDIOPLAYER_RESUME_FAILED = 6002;
    public static final int AUDIOPLAYER_RUNNING_FAILED = 6004;
    public static final int AUDIO_RECODER_OPEN_FAILED = 2001;
    public static final int AUDIO_RECODING_FAILED = 2004;
    public static final int AUDIO_STARTRECODE_FAILED = 2002;
    public static final int AUDIO_STOPRECODE_FAILED = 2003;
    public static final int BGMIX_INIT_AUDIOSOURCE_FAILED = 8004;
    public static final int BGMIX_INIT_FAILED = 8001;
    public static final int BGMIX_INIT_VIDEOSOURCE_FAILED = 8003;
    public static final int BGMIX_RUNNING_FAILED = 8005;
    public static final int BGMIX_SETOUTPATH_FAILED = 8002;
    public static final int CAMEAR_GET_STATUS_FAILED = 4007;
    public static final int CAMERA_CONFIG_FAILED = 4005;
    public static final int CAMERA_OPEN_FAILED = 4004;
    public static final int CAMERA_PREPARE_FAILED = 4001;
    public static final int CAMERA_SELECT_COLORFORMAT_FAILED = 4006;
    public static final int CAMERA_STARTPREVIEW_FAILED = 4002;
    public static final int CAMERA_STOPPREVIEW_FAILED = 4003;
    public static final int CAMERA_SWITCH_FAILED = 4008;
    public static final int CAMERA_TAKE_PHOTO_FAILED = 4009;
    public static final int DECODE_AUDIO_CODEC_FAILED = 9003;
    public static final int DECODE_AUDIO_DECODE_FAILED = 9006;
    public static final int DECODE_AUDIO_INIT_MUXER_FAILED = 9001;
    public static final int DECODE_DEMUXER_FORMAT_FAILED = 9007;
    public static final int DECODE_DEMUXER_SELECT_AUDIO_FAILED = 9008;
    public static final int DECODE_DEMUXER_SELECT_VIDEO_FAILED = 9009;
    public static final int DECODE_VIDEO_CODEC_FAILED = 9004;
    public static final int DECODE_VIDEO_DECODE_FAILED = 9005;
    public static final int DECODE_VIDEO_INIT_MUXER_FAILED = 9002;
    public static final int EDIT_AUDIOMIX_FAILED = 5004;
    public static final int EDIT_MAKEVIDEO_FAILED = 5002;
    public static final int EDIT_PREPARE_FAILED = 5001;
    public static final int EDIT_PREVIEW_FAILED = 5003;
    public static final int EDIT_RESUME_FAILED = 5009;
    public static final int EDIT_STARTPREVIEW_FAILED = 5008;
    public static final int EDIT_UPDATEEFFECT_FAILED = 5007;
    public static final int EDIT_VOICECHANGE_FAILED = 5006;
    public static final int EDIT_VOICECHANGE_INIT_FAILED = 5005;
    public static final int ENCODER_AUDIO_PARAMETER_FAILED = 3000;
    public static final int ENCODER_VIDEO_PARAMETER_FAILED = 3001;
    public static final int ENCODE_AUDIO_CODEC_CREATE_FAILED = 3004;
    public static final int ENCODE_AUDIO_CODEC_STATUS_ERROR = 3006;
    public static final int ENCODE_MUXER_CREATE_FAILED = 3002;
    public static final int ENCODE_RUNNING_ERROR = 3008;
    public static final int ENCODE_SETPARAMES_EXCEPTION = 3009;
    public static final int ENCODE_STOP_ENCODE_FAILED = 3007;
    public static final int ENCODE_VIDEO_CODEC_CREATE_FAILED = 3003;
    public static final int ENCODE_VIDEO_CODEC_STATUS_ERROR = 3005;
    public static final int PLAYAUDIO_FILE_NOTFOUND = 6002;
    public static final int PLAYAUDIO_INIT_FAILED = 6001;
    public static final int RECIODE_RESET_CAMERA_FAILED = 1019;
    public static final int RECODER_CANCEL_FAILED = 1001;
    public static final int RECODER_ENCODER_INIT_FAILED = 1017;
    public static final int RECODER_GET_AUDIO_STATUS = 1018;
    public static final int RECODER_LOAD_BARENESS_MODE_FAILED = 1015;
    public static final int RECODER_LOAD_BODYLAND_MODE_FAILED = 1014;
    public static final int RECODER_LOAD_DATARECYLE_MODE_FAILED = 1016;
    public static final int RECODER_LOAD_FACE_MODE_ALWAYS_FAILED = 1010;
    public static final int RECODER_LOAD_FACE_MODE_FAILED = 1009;
    public static final int RECODER_LOAD_GESTURE_MODE_FAILED = 1011;
    public static final int RECODER_LOAD_HANDGESTURE_MODE_FAILED = 1012;
    public static final int RECODER_LOAD_SEGMENT_MODE_FAILED = 1013;
    public static final int RECODER_SAVE_FRAGMENT_FAILED = 1007;
    public static final int RECODER_SELECT_RES_FAILED = 1008;
    public static final int RECODER_SPLICE_FAILED = 1002;
    public static final int RECODER_SPLICE_FILE_PATH_EMPTY = 1003;
    public static final int RECODER_SPLICE_INIT = 1004;
    public static final int RECODER_SPLICE_RELEASE_FAILED = 1006;
    public static final int RECODER_SPLICE_RUNNING_FAILED = 1005;
    public static final int RENDER_ADDTARGET_FAILED = 7001;
    public static final int RENDER_TARGET_FAILED = 7002;
    private static final String TAG = "errorCode";

    public static String getAutoJumpLogInfos() {
        String[] strArr = {"", ""};
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 5) {
            MDLog.m7445e(TAG, "Stack is too shallow!!!");
            return null;
        }
        strArr[0] = stackTrace[4].getMethodName() + "()";
        String str = "(" + stackTrace[4].getClassName() + ".java:" + stackTrace[4].getLineNumber() + " --- " + strArr[0] + ")";
        strArr[1] = str;
        return str;
    }
}
