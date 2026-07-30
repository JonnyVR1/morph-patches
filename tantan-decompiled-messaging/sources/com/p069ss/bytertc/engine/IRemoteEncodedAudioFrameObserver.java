package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.utils.EncodedAudioFrameData;

/* JADX INFO: loaded from: classes13.dex */
public interface IRemoteEncodedAudioFrameObserver {
    @CalledByNative
    void onRemoteEncodedAudioFrame(RemoteStreamKey remoteStreamKey, EncodedAudioFrameData encodedAudioFrameData);
}
