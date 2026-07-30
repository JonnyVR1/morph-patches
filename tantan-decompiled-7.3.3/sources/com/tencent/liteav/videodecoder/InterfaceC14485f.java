package com.tencent.liteav.videodecoder;

import com.tencent.liteav.basic.structs.TXSVideoFrame;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14485f {
    void onDecodeFailed(int i);

    void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3);

    void onVideoSizeChange(int i, int i2);
}
