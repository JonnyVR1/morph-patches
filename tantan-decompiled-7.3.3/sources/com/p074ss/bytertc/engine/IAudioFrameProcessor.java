package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes11.dex */
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
