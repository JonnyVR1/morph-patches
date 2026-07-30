package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioProcessorMethod {
    AUDIO_FRAME_PROCESSOR_RECORD(0),
    AUDIO_FRAME_PROCESSOR_PLAYBACK(1),
    AUDIO_FRAME_PROCESSOR_REMOTE_USER(2),
    AUDIO_FRAME_PROCESSOR_EAR_MONITOR(3),
    AUDIO_FRAME_PROCESSOR_SCREEN(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioProcessorMethod$1 */
    public static /* synthetic */ class C135771 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod;

        static {
            int[] iArr = new int[AudioProcessorMethod.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod = iArr;
            try {
                iArr[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_REMOTE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_EAR_MONITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    AudioProcessorMethod(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioProcessorMethod fromId(int i) {
        for (AudioProcessorMethod audioProcessorMethod : values()) {
            if (audioProcessorMethod.value() == i) {
                return audioProcessorMethod;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135771.$SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[ordinal()];
        if (i == 1) {
            return "AUDIO_FRAME_PROCESSOR_RECORD";
        }
        if (i == 2) {
            return "AUDIO_FRAME_PROCESSOR_PLAYBACK";
        }
        if (i == 3) {
            return "AUDIO_FRAME_PROCESSOR_REMOTE_USER";
        }
        if (i != 4) {
            return i != 5 ? "" : "AUDIO_FRAME_PROCESSOR_SCREEN";
        }
        return "AUDIO_FRAME_PROCESSOR_EAR_MONITOR";
    }

    public int value() {
        return this.value;
    }
}
