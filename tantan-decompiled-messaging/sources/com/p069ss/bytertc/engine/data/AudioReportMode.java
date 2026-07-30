package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioReportMode {
    AUDIO_REPORT_MODE_NORMAL(0),
    AUDIO_REPORT_MODE_DISCONNECT(1),
    AUDIO_REPORT_MODE_RESET(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioReportMode$1 */
    public static /* synthetic */ class C134171 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode;

        static {
            int[] iArr = new int[AudioReportMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode = iArr;
            try {
                iArr[AudioReportMode.AUDIO_REPORT_MODE_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[AudioReportMode.AUDIO_REPORT_MODE_DISCONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[AudioReportMode.AUDIO_REPORT_MODE_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioReportMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioReportMode fromId(int i) {
        for (AudioReportMode audioReportMode : values()) {
            if (audioReportMode.value() == i) {
                return audioReportMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134171.$SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[ordinal()];
        if (i == 1) {
            return "AUDIO_REPORT_MODE_NORMAL";
        }
        if (i != 2) {
            return i != 3 ? "" : "AUDIO_REPORT_MODE_RESET";
        }
        return "AUDIO_REPORT_MODE_DISCONNECT";
    }

    public int value() {
        return this.value;
    }
}
