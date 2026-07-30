package io.agora.mediaplayer;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaPlayerCustomDataProvider {
    @CalledByNative
    int onReadData(ByteBuffer byteBuffer, int i);

    @CalledByNative
    long onSeek(long j, int i);
}
