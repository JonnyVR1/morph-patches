package com.bytedance.realx.video;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
