package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.audio.AudioParams;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface IAudioFrameObserver {
    @CalledByNative
    AudioParams getEarMonitoringAudioParams();

    @CalledByNative
    AudioParams getMixedAudioParams();

    @CalledByNative
    int getObservedAudioFramePosition();

    @CalledByNative
    AudioParams getPlaybackAudioParams();

    @CalledByNative
    AudioParams getRecordAudioParams();

    @CalledByNative
    boolean onEarMonitoringAudioFrame(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6);

    @CalledByNative
    boolean onMixedAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6);

    @CalledByNative
    boolean onPlaybackAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6);

    @CalledByNative
    boolean onPlaybackAudioFrameBeforeMixing(String str, int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, long j, int i7, int i8, long j2);

    @CalledByNative
    boolean onRecordAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6);
}
