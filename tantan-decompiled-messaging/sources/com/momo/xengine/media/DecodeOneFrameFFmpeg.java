package com.momo.xengine.media;

import com.momo.xengine.media.types.VideoFrame;

/* JADX INFO: loaded from: classes8.dex */
public class DecodeOneFrameFFmpeg implements IDecodeOneFrameFFmpeg {
    private long pointer;
    private VideoFrame sourceVideo = new VideoFrame();

    public DecodeOneFrameFFmpeg() {
        this.pointer = 0L;
        this.pointer = nativeCreate();
        this.sourceVideo.setData(new byte[777600]);
    }

    private native long nativeCreate();

    private native boolean nativeDecodeOneFrame(long j, byte[] bArr, int i, VideoFrame videoFrame);

    private native boolean nativeInit(long j);

    private native void nativeRelease(long j);

    @Override // com.momo.xengine.media.IDecodeOneFrameFFmpeg
    public byte[] decodeOneFrameToYUV(byte[] bArr, int i) {
        long j = this.pointer;
        if (j == 0 || !nativeDecodeOneFrame(j, bArr, i, this.sourceVideo)) {
            return null;
        }
        return this.sourceVideo.getData();
    }

    @Override // com.momo.xengine.media.IDecodeOneFrameFFmpeg
    public boolean init() {
        long j = this.pointer;
        if (j != 0) {
            return nativeInit(j);
        }
        return false;
    }

    @Override // com.momo.xengine.media.IDecodeOneFrameFFmpeg
    public void release() {
        long j = this.pointer;
        if (j != 0) {
            nativeRelease(j);
            this.pointer = 0L;
        }
    }
}
