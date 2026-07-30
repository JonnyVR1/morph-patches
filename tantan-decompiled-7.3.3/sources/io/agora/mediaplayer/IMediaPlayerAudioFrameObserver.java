package io.agora.mediaplayer;

import io.agora.base.AudioFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaPlayerAudioFrameObserver {
    @CalledByNative
    AudioFrame onFrame(AudioFrame audioFrame);
}
