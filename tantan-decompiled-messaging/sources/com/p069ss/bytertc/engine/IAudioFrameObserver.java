package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes13.dex */
public interface IAudioFrameObserver {
    @CalledByNative
    void onCaptureMixedAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onMixedAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onPlaybackAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onRecordAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame);
}
