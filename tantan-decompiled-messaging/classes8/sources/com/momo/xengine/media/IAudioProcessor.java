package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioFormat;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IAudioProcessor {
    boolean apply();

    List<AudioTrack> getTracks();

    void init(AudioFormat audioFormat);

    long next(byte[] bArr);

    void release();

    void seek(long j);
}
