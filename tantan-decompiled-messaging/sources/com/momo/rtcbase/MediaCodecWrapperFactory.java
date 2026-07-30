package com.momo.rtcbase;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
