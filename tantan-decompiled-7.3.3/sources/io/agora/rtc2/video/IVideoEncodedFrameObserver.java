package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface IVideoEncodedFrameObserver {
    @CalledByNative
    boolean onEncodedVideoFrameReceived(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo);
}
