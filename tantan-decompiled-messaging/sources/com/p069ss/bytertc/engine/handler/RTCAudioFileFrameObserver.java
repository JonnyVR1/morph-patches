package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.IAudioFileFrameObserver;
import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioSampleRate;
import com.p069ss.bytertc.engine.utils.AudioFrameImpl;
import com.p069ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class RTCAudioFileFrameObserver {
    private IAudioFileFrameObserver mAudioFileFrameObserver;

    @CalledByNative
    private static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i, AudioSampleRate.fromId(i2), AudioChannel.fromId(i3));
    }

    @CalledByNative
    public void onAudioFileFrame(int i, IAudioFrame iAudioFrame) {
        IAudioFileFrameObserver iAudioFileFrameObserver = this.mAudioFileFrameObserver;
        if (iAudioFileFrameObserver != null) {
            iAudioFileFrameObserver.onAudioFileFrame(i, iAudioFrame);
        }
    }

    public void setAudioFileFrameObserver(IAudioFileFrameObserver iAudioFileFrameObserver) {
        this.mAudioFileFrameObserver = iAudioFileFrameObserver;
    }
}
