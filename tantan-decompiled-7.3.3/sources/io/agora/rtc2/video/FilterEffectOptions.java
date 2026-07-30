package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class FilterEffectOptions {
    public String path;
    public float strength;

    public FilterEffectOptions() {
        this.path = "";
        this.strength = 0.5f;
    }

    @CalledByNative
    public FilterEffectOptions(String str, float f) {
        this.path = str;
        this.strength = f;
    }
}
