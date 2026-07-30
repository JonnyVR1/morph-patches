package com.bytedance.realx.video.memory;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class RefObject {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @Nullable
    private final Runnable releaseCallback;

    public RefObject(@Nullable Runnable runnable) {
        this.releaseCallback = runnable;
    }

    public boolean hasReleaseCallback() {
        return this.releaseCallback != null;
    }

    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }
}
