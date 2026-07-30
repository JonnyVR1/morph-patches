package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public interface IMediaPlayerCustomSourceProvider {
    int onReadData(ByteBuffer byteBuffer, int i);

    long onSeek(long j, MediaPlayerCustomSourceSeekWhence mediaPlayerCustomSourceSeekWhence);
}
