package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum EarMonitorAudioFilter {
    NONE(1),
    REUSE_AUDIO_PROCESSING(32768);

    private int value;

    EarMonitorAudioFilter(int i) {
        this.value = i;
    }

    @CalledByNative
    public static EarMonitorAudioFilter fromId(int i) {
        for (EarMonitorAudioFilter earMonitorAudioFilter : values()) {
            if (earMonitorAudioFilter.value() == i) {
                return earMonitorAudioFilter;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == NONE ? "kEarMonitorAudioFilterNone" : "kEarMonitorAudioFilterReuseAudioProcessing";
    }

    public int value() {
        return this.value;
    }
}
