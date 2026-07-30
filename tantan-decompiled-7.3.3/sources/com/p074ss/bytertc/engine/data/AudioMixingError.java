package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioMixingError {
    AUDIO_MIXING_ERROR_OK(0),
    AUDIO_MIXING_ERROR_PRELOAD_FAILED(1),
    AUDIO_MIXING_ERROR_START_FAILED(2),
    AUDIO_MIXING_ERROR_ID_NOT_FOUND(3),
    AUDIO_MIXING_ERROR_SET_POSITION_FAILED(4),
    AUDIO_MIXING_ERROR_INVALID_VOLUME(5),
    AUDIO_MIXING_ERROR_LOAD_CONFLICT(6),
    AUDIO_MIXING_ERROR_ID_TYPE_NOT_MATCH(7),
    AUDIO_MIXING_ERROR_ID_TYPE_INVALID_PITCH(8),
    AUDIO_MIXING_ERROR_INVALID_AUDIO_TRACK(9),
    AUDIO_MIXING_ERROR_IS_STARTING(10),
    AUDIO_MIXING_ERROR_INVALID_PLAYBACK_SPEED(11);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioMixingError$1 */
    public static /* synthetic */ class C135731 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError;

        static {
            int[] iArr = new int[AudioMixingError.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError = iArr;
            try {
                iArr[AudioMixingError.AUDIO_MIXING_ERROR_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_PRELOAD_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_START_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_ID_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_SET_POSITION_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_INVALID_VOLUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_LOAD_CONFLICT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_ID_TYPE_NOT_MATCH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_ID_TYPE_INVALID_PITCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_INVALID_AUDIO_TRACK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_IS_STARTING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[AudioMixingError.AUDIO_MIXING_ERROR_INVALID_PLAYBACK_SPEED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    AudioMixingError(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioMixingError fromId(int i) {
        for (AudioMixingError audioMixingError : values()) {
            if (audioMixingError.value() == i) {
                return audioMixingError;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C135731.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[ordinal()]) {
            case 1:
                return "AUDIO_MIXING_ERROR_OK";
            case 2:
                return "AUDIO_MIXING_ERROR_PRELOAD_FAILED";
            case 3:
                return "AUDIO_MIXING_ERROR_START_FAILED";
            case 4:
                return "AUDIO_MIXING_ERROR_ID_NOT_FOUND";
            case 5:
                return "AUDIO_MIXING_ERROR_SET_POSITION_FAILED";
            case 6:
                return "AUDIO_MIXING_ERROR_INVALID_VOLUME";
            case 7:
                return "AUDIO_MIXING_ERROR_LOAD_CONFLICT";
            case 8:
                return "AUDIO_MIXING_ERROR_ID_TYPE_NOT_MATCH";
            case 9:
                return "AUDIO_MIXING_ERROR_ID_TYPE_INVALID_PITCH";
            case 10:
                return "AUDIO_MIXING_ERROR_INVALID_AUDIO_TRACK";
            case 11:
                return "AUDIO_MIXING_ERROR_IS_STARTING";
            case 12:
                return "AUDIO_MIXING_ERROR_INVALID_PLAYBACK_SPEED";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
