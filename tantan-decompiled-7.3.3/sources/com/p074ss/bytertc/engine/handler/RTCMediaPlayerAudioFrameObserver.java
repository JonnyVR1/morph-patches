package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.IMediaPlayerAudioFrameObserver;
import com.p074ss.bytertc.engine.data.AudioChannel;
import com.p074ss.bytertc.engine.data.AudioSampleRate;
import com.p074ss.bytertc.engine.utils.AudioFrameImpl;
import com.p074ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class RTCMediaPlayerAudioFrameObserver {
    private IMediaPlayerAudioFrameObserver mAudioFrameObserver;

    @CalledByNative
    private static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i, AudioSampleRate.fromId(i2), AudioChannel.fromId(i3));
    }

    @CalledByNative
    public void onFrame(int i, IAudioFrame iAudioFrame) {
        IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver = this.mAudioFrameObserver;
        if (iMediaPlayerAudioFrameObserver != null) {
            iMediaPlayerAudioFrameObserver.onFrame(i, iAudioFrame);
        }
    }

    public void setAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver) {
        this.mAudioFrameObserver = iMediaPlayerAudioFrameObserver;
    }
}
