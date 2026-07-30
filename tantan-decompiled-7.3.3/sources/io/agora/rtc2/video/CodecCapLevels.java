package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class CodecCapLevels {
    public int hwDecodingLevel;
    public int swDecodingLevel;

    public CodecCapLevels() {
        this.hwDecodingLevel = -1;
        this.swDecodingLevel = -1;
    }

    @CalledByNative
    public CodecCapLevels(int i, int i2) {
        this.hwDecodingLevel = i;
        this.swDecodingLevel = i2;
    }
}
