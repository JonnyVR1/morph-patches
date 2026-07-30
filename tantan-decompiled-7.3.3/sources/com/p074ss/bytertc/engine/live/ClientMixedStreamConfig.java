package com.p074ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class ClientMixedStreamConfig {
    public boolean useAudioMixer = true;
    public MixedStreamClientMixVideoFormat videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;

    @CalledByNative
    public boolean getClientMixedStreamConfigUseAudioMixer() {
        return this.useAudioMixer;
    }

    @CalledByNative
    public int getClientMixedStreamConfigVideoFormat() {
        return this.videoFormat.getValue();
    }
}
