package com.bytedance.realx.video.memory;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCounted;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.memory.RTCVideoMemory;

/* JADX INFO: loaded from: classes.dex */
public abstract class RTCVideoMemory implements RefCounted {
    private Runnable releaseCallback = null;
    RefObject refCounted = new RefObject(new Runnable() { // from class: l.kjc0
        @Override // java.lang.Runnable
        public final void run() {
            RTCVideoMemory.m5780a(this.f127088a);
        }
    });

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5780a(RTCVideoMemory rTCVideoMemory) {
        Runnable runnable = rTCVideoMemory.releaseCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    @CalledByNative
    public abstract int getHeight();

    @CalledByNative
    public abstract RXVideoMemoryType getMemoryType();

    @CalledByNative
    public abstract RXVideoRotation getRotation();

    @CalledByNative
    public abstract int getWidth();

    public synchronized boolean hasReleaseCallback() {
        return this.releaseCallback != null;
    }

    @Override // com.bytedance.realx.base.RefCounted
    @CalledByNative
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    @CalledByNative
    public synchronized void retain() {
        this.refCounted.retain();
    }

    public synchronized void setReleaseCallback(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
