package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.IMediaPlayerCustomSourceProvider;
import com.p074ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence;
import com.p074ss.bytertc.engine.data.ReturnStatus;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class RTCMediaPlayerCustomSourceProvider {
    private IMediaPlayerCustomSourceProvider mCustomSourceProvider;

    @CalledByNative
    public int onReadData(ByteBuffer byteBuffer, int i) {
        IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider = this.mCustomSourceProvider;
        return iMediaPlayerCustomSourceProvider != null ? iMediaPlayerCustomSourceProvider.onReadData(byteBuffer, i) : ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @CalledByNative
    public long onSeek(long j, int i) {
        IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider = this.mCustomSourceProvider;
        return iMediaPlayerCustomSourceProvider != null ? iMediaPlayerCustomSourceProvider.onSeek(j, MediaPlayerCustomSourceSeekWhence.fromId(i)) : ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    public void setCustomSourceProvider(IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider) {
        this.mCustomSourceProvider = iMediaPlayerCustomSourceProvider;
    }
}
