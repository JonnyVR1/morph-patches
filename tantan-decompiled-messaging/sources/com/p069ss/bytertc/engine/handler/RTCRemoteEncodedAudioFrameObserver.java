package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioSampleRate;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.type.AudioCodecType;
import com.p069ss.bytertc.engine.utils.EncodedAudioFrameData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class RTCRemoteEncodedAudioFrameObserver {
    @CalledByNative
    private static EncodedAudioFrameData createEncodedAudioFrameImpl(int i, ByteBuffer byteBuffer, int i2, long j, int i3, int i4, int i5, ByteBuffer byteBuffer2) {
        byteBuffer.order(ByteOrder.nativeOrder());
        if (byteBuffer2 != null) {
            byteBuffer2.order(ByteOrder.nativeOrder());
        }
        return new EncodedAudioFrameData(AudioCodecType.fromId(i), byteBuffer, i2, j, AudioSampleRate.fromId(i3), AudioChannel.fromId(i4), i5, byteBuffer2);
    }

    @CalledByNative
    private static RemoteStreamKey createRemoteStreamKey(String str, String str2, int i) {
        return new RemoteStreamKey(str, str2, StreamIndex.fromId(i));
    }
}
