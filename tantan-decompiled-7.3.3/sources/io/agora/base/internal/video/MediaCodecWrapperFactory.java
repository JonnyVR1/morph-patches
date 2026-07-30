package io.agora.base.internal.video;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
