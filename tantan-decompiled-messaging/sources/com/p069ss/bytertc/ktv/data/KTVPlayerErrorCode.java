package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum KTVPlayerErrorCode {
    OK(0),
    FILE_NOT_EXIST(-3020),
    FILE_ERROR(-3021),
    NOT_JOIN_ROOM(-3022),
    PARAM(-3023),
    START_ERROR(-3024),
    MIX_ID_ERROR(-3025),
    POSITION_ERROR(-3026),
    AUDIO_VOLUME_ERROR(-3027),
    TYPE_ERROR(-3028),
    PITCH_ERROR(-3029),
    AUDIO_TRACK_ERROR(-3030),
    STARTING_ERROR(-3031);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.KTVPlayerErrorCode$1 */
    public static /* synthetic */ class C134691 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode;

        static {
            int[] iArr = new int[KTVPlayerErrorCode.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode = iArr;
            try {
                iArr[KTVPlayerErrorCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.FILE_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.FILE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.NOT_JOIN_ROOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.PARAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.START_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.MIX_ID_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.POSITION_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.AUDIO_VOLUME_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.TYPE_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.PITCH_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.AUDIO_TRACK_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[KTVPlayerErrorCode.STARTING_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    KTVPlayerErrorCode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static KTVPlayerErrorCode fromId(int i) {
        for (KTVPlayerErrorCode kTVPlayerErrorCode : values()) {
            if (kTVPlayerErrorCode.value() == i) {
                return kTVPlayerErrorCode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C134691.$SwitchMap$com$ss$bytertc$ktv$data$KTVPlayerErrorCode[ordinal()]) {
            case 1:
                return "KTV_PLAYER_ERROR_CODE_OK";
            case 2:
                return "KTV_PLAYER_ERROR_CODE_FILE_NOT_EXIST";
            case 3:
                return "KTV_PLAYER_ERROR_CODE_FILE_ERROR";
            case 4:
                return "KTV_PLAYER_ERROR_CODE_NOT_JOIN_ROOM";
            case 5:
                return "KTV_PLAYER_ERROR_CODE_PARAM";
            case 6:
                return "KTV_PLAYER_ERROR_CODE_START_ERROR";
            case 7:
                return "KTV_PLAYER_ERROR_CODE_MIX_ID_ERROR";
            case 8:
                return "KTV_PLAYER_ERROR_CODE_POSITION_ERROR";
            case 9:
                return "KTV_PLAYER_ERROR_CODE_AUDIO_VOLUME_ERROR";
            case 10:
                return "KTV_PLAYER_ERROR_CODE_TYPE_ERROR";
            case 11:
                return "KTV_PLAYER_ERROR_CODE_PITCH_ERROR";
            case 12:
                return "KTV_PLAYER_ERROR_CODE_AUDIO_TRACK_ERROR";
            case 13:
                return "KTV_PLAYER_ERROR_CODE_STARTING_ERROR";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
