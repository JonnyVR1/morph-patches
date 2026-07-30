package com.p074ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum KTVErrorCode {
    OK(0),
    APPID_INVALID(-3000),
    PARAS_INVALID(-3001),
    GET_MUSIC_FAILED(-3002),
    GET_LYRIC_FAILED(-3003),
    MUSIC_TAKEDOWN(-3004),
    MUSIC_DOWNLOAD(-3005),
    MIDI_DOWNLOAD_FAILED(-3006),
    SYSTEM_BUSY(-3007),
    NETWORK(-3008),
    NOT_JOIN_ROOM(-3009),
    PARSE_DATA(-3010),
    DOWNLOAD(-3011),
    DOWNLOADING(-3012),
    INTERNAL_DOMAIN(-3013),
    INSUFFICIENT_DISK_SPACE(-3014),
    MUSIC_DECRYPTION_FAILED(-3015),
    FILE_RENAME_FAILED(-3016),
    DOWNLOAD_TIMEOUT(-3017),
    CLEAR_CACHE_FAILED(-3018),
    DOWNLOAD_CANCELED(-3019);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.KTVErrorCode$1 */
    public static /* synthetic */ class C136311 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode;

        static {
            int[] iArr = new int[KTVErrorCode.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode = iArr;
            try {
                iArr[KTVErrorCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.APPID_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.PARAS_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.GET_MUSIC_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.GET_LYRIC_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.MUSIC_TAKEDOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.MUSIC_DOWNLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.MIDI_DOWNLOAD_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.SYSTEM_BUSY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.NETWORK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.NOT_JOIN_ROOM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.PARSE_DATA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.DOWNLOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.DOWNLOADING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.INTERNAL_DOMAIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.INSUFFICIENT_DISK_SPACE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.MUSIC_DECRYPTION_FAILED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.FILE_RENAME_FAILED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.DOWNLOAD_TIMEOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.CLEAR_CACHE_FAILED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[KTVErrorCode.DOWNLOAD_CANCELED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    KTVErrorCode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static KTVErrorCode fromId(int i) {
        for (KTVErrorCode kTVErrorCode : values()) {
            if (kTVErrorCode.value() == i) {
                return kTVErrorCode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C136311.$SwitchMap$com$ss$bytertc$ktv$data$KTVErrorCode[ordinal()]) {
            case 1:
                return "KTV_ERROR_CODE_OK";
            case 2:
                return "KTV_ERROR_CODE_APPID_INVALID";
            case 3:
                return "KTV_ERROR_CODE_PARAS_INVALID";
            case 4:
                return "KTV_ERROR_CODE_GET_MUSIC_FAILED";
            case 5:
                return "KTV_ERROR_CODE_GET_LYRIC_FAILED";
            case 6:
                return "KTV_ERROR_CODE_MUSIC_TAKEDOWN";
            case 7:
                return "KTV_ERROR_CODE_MUSIC_DOWNLOAD";
            case 8:
                return "KTV_ERROR_CODE_MIDI_DOWNLOAD_FAILED";
            case 9:
                return "ERROR_CODE_KTV_SYSTEM_BUSY";
            case 10:
                return "KTV_ERROR_CODE_NETWORK";
            case 11:
                return "KTV_ERROR_CODE_NOT_JOIN_ROOM";
            case 12:
                return "KTV_ERROR_CODE_PARSE_DATA";
            case 13:
                return "KTV_ERROR_CODE_DOWNLOAD";
            case 14:
                return "KTV_ERROR_CODE_DOWNLOADING";
            case 15:
                return "KTV_ERROR_CODE_INTERNAL_DOMAIN";
            case 16:
                return "KTV_ERROR_CODE_INSUFFICIENT_DISK_SPACE";
            case 17:
                return "KTV_ERROR_CODE_MUSIC_DECRYPTION_FAILED";
            case 18:
                return "KTV_ERROR_CODE_FILE_RENAME_FAILED";
            case 19:
                return "KTV_ERROR_CODE_DOWNLOAD_TIMEOUT";
            case 20:
                return "KTV_ERROR_CODE_CLEAR_CACHE_FAILED";
            case 21:
                return "KTV_ERROR_CODE_DOWNLOAD_CANCELED";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
