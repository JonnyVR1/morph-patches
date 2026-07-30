package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.utils.EncodedAudioFrameData;

/* JADX INFO: loaded from: classes11.dex */
public interface IRemoteEncodedAudioFrameObserver {
    @CalledByNative
    void onRemoteEncodedAudioFrame(RemoteStreamKey remoteStreamKey, EncodedAudioFrameData encodedAudioFrameData);
}
