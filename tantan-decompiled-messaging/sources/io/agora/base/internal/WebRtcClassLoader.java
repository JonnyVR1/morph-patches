package io.agora.base.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
class WebRtcClassLoader {
    @Nullable
    @CalledByNative
    public static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
