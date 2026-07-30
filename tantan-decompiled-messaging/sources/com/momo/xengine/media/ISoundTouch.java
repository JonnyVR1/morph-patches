package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioFormat;
import com.momo.xengine.media.types.AudioFrame;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface ISoundTouch {
    void clear();

    void flush();

    void init(@NotNull AudioFormat audioFormat);

    void putSamples(@NotNull byte[] bArr, int i);

    AudioFrame receiveSamples(int i);

    void release();

    void setPitchSemiTones(int i);

    void setRate(double d);

    void setSetting(int i, int i2);

    void setSpeed(double d);
}
