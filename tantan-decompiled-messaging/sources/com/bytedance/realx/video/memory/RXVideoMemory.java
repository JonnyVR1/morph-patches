package com.bytedance.realx.video.memory;

import com.bytedance.realx.video.memory.RXVideoMemory;

/* JADX INFO: loaded from: classes.dex */
public abstract class RXVideoMemory implements RXVideoMemoryInterface {
    protected long nativeHandle;
    RefObject refCounted = new RefObject(new Runnable() { // from class: l.rbc0
        @Override // java.lang.Runnable
        public final void run() {
            RXVideoMemory.m5727a(this.f158596a);
        }
    });

    public RXVideoMemory(long j) {
        this.nativeHandle = j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5727a(RXVideoMemory rXVideoMemory) {
        long j = rXVideoMemory.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoMemory(j);
            rXVideoMemory.nativeHandle = 0L;
        }
    }

    private static native void nativeReleaseVideoMemory(long j);

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public boolean isNullPointer() {
        return this.nativeHandle == 0;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }
}
