package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum PlayerError {
    OK(0),
    FORMAT_NOT_SUPPORT(1),
    INVALID_PATH(2),
    INVALID_STATE(3),
    INVALID_POSITION(4),
    INVALID_VOLUME(5),
    INVALID_PITCH(6),
    INVALID_AUDIO_TRACK_INDEX(7),
    INVALID_PLAYBACK_SPEED(8),
    INVALID_EFFECT_ID(9),
    ERROR_CURRENTLY_PLAYING(10);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.PlayerError$1 */
    public static /* synthetic */ class C135911 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$PlayerError;

        static {
            int[] iArr = new int[PlayerError.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$PlayerError = iArr;
            try {
                iArr[PlayerError.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.FORMAT_NOT_SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_VOLUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_PITCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_AUDIO_TRACK_INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_PLAYBACK_SPEED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.INVALID_EFFECT_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerError[PlayerError.ERROR_CURRENTLY_PLAYING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    PlayerError(int i) {
        this.value = i;
    }

    @CalledByNative
    public static PlayerError fromId(int i) {
        for (PlayerError playerError : values()) {
            if (playerError.value() == i) {
                return playerError;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C135911.$SwitchMap$com$ss$bytertc$engine$data$PlayerError[ordinal()]) {
            case 1:
                return "OK";
            case 2:
                return "FORMAT_NOT_SUPPORT";
            case 3:
                return "INVALID_PATH";
            case 4:
                return "INVALID_STATE";
            case 5:
                return "INVALID_POSITION";
            case 6:
                return "INVALID_VOLUME";
            case 7:
                return "INVALID_PITCH";
            case 8:
                return "INVALID_AUDIO_TRACK_INDEX";
            case 9:
                return "INVALID_PLAYBACK_SPEED";
            case 10:
                return "INVALID_EFFECT_ID";
            case 11:
                return "ERROR_CURRENTLY_PLAYING";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
