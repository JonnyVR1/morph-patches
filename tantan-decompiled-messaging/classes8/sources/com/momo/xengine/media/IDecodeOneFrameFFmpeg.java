package com.momo.xengine.media;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IDecodeOneFrameFFmpeg {
    byte[] decodeOneFrameToYUV(byte[] bArr, int i);

    boolean init();

    void release();
}
