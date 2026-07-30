package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioSampleRate;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.utils.AudioFrameImpl;
import com.p069ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class RTCAudioFrameObserver {
    @CalledByNative
    private static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2) {
        byteBuffer.order(ByteOrder.nativeOrder());
        if (byteBuffer2 != null) {
            byteBuffer2.order(ByteOrder.nativeOrder());
        }
        return new AudioFrameImpl(byteBuffer, i, AudioSampleRate.fromId(i2), AudioChannel.fromId(i3), byteBuffer2);
    }

    @CalledByNative
    private static RemoteStreamKey createRemoteStreamKey(String str, String str2, int i) {
        return new RemoteStreamKey(str, str2, StreamIndex.fromId(i));
    }
}
