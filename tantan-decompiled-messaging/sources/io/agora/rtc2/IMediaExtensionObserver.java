package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaExtensionObserver {
    @CalledByNative
    default void onErrorWithContext(ExtensionContext extensionContext, int i, String str) {
    }

    @CalledByNative
    default void onEventWithContext(ExtensionContext extensionContext, String str, String str2) {
    }

    @CalledByNative
    default void onStartedWithContext(ExtensionContext extensionContext) {
    }

    @CalledByNative
    default void onStoppedWithContext(ExtensionContext extensionContext) {
    }
}
