package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioSampleRate {
    AUDIO_SAMPLE_RATE_AUTO(-1),
    AUDIO_SAMPLE_RATE_8000(TXRecordCommon.AUDIO_SAMPLERATE_8000),
    AUDIO_SAMPLE_RATE_11025(11025),
    AUDIO_SAMPLE_RATE_16000(16000),
    AUDIO_SAMPLE_RATE_22050(22050),
    AUDIO_SAMPLE_RATE_24000(24000),
    AUDIO_SAMPLE_RATE_32000(32000),
    AUDIO_SAMPLE_RATE_44100(44100),
    AUDIO_SAMPLE_RATE_48000(48000);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioSampleRate$1 */
    public static /* synthetic */ class C135821 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate;

        static {
            int[] iArr = new int[AudioSampleRate.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate = iArr;
            try {
                iArr[AudioSampleRate.AUDIO_SAMPLE_RATE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_8000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_11025.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_16000.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_22050.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_24000.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_32000.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_44100.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[AudioSampleRate.AUDIO_SAMPLE_RATE_48000.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    AudioSampleRate(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioSampleRate fromId(int i) {
        for (AudioSampleRate audioSampleRate : values()) {
            if (audioSampleRate.value() == i) {
                return audioSampleRate;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C135821.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[ordinal()]) {
            case 1:
                return "kAudioSampleRateAuto";
            case 2:
                return "kAudioSampleRate8000";
            case 3:
                return "kAudioSampleRate11025";
            case 4:
                return "kAudioSampleRate16000";
            case 5:
                return "kAudioSampleRate22050";
            case 6:
                return "kAudioSampleRate24000";
            case 7:
                return "kAudioSampleRate32000";
            case 8:
                return "kAudioSampleRate44100";
            case 9:
                return "kAudioSampleRate48000";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
