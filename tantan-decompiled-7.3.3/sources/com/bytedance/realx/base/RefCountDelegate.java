package com.bytedance.realx.base;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @Nullable
    private final Runnable releaseCallback;

    public RefCountDelegate(@Nullable Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }
}
