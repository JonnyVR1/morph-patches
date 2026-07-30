package com.momo.rtcbase;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
