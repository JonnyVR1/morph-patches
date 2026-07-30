package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface IAudioEncodedFrameObserver {
    @CalledByNative
    void onMixedAudioEncodedFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    @CalledByNative
    void onPlaybackAudioEncodedFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    @CalledByNative
    void onRecordAudioEncodedFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);
}
