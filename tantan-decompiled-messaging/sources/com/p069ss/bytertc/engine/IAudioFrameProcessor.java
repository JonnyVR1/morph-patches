package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes13.dex */
public interface IAudioFrameProcessor {
    @CalledByNative
    int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessRecordAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessScreenAudioFrame(IAudioFrame iAudioFrame);
}
