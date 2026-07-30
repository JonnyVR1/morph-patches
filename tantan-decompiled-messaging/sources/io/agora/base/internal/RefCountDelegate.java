package io.agora.base.internal;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @Nullable
    private final Runnable releaseCallback;

    public RefCountDelegate(@Nullable Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // io.agora.base.internal.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // io.agora.base.internal.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }
}
