package com.bytedance.realx.video;

import android.opengl.EGLContext;
import androidx.annotation.NonNull;
import com.bytedance.realx.video.RXVideoFrameHelper;
import com.bytedance.realx.video.memory.RefObject;

/* JADX INFO: loaded from: classes.dex */
public class RXVideoFrameHelper implements RXVideoFrameHelperInterface {
    protected long nativeHandle;
    RefObject refCounted = new RefObject(new Runnable() { // from class: l.xjc0
        @Override // java.lang.Runnable
        public final void run() {
            RXVideoFrameHelper.m5762a(this.f194548a);
        }
    });

    private RXVideoFrameHelper(long j) {
        this.nativeHandle = j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5762a(RXVideoFrameHelper rXVideoFrameHelper) {
        long j = rXVideoFrameHelper.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoFrameHelper(j);
            rXVideoFrameHelper.nativeHandle = 0L;
        }
    }

    @NonNull
    public static RXVideoFrameHelperInterface createRXVideoFrameHelperOpenGL(EGLContext eGLContext) {
        return new RXVideoFrameHelper(nativeCreateRXVideoFrameHelperOpenGL(EglBaseUtils.getNativeEGLContext(eGLContext)));
    }

    private static native long nativeCreateRXVideoFrameHelperOpenGL(long j);

    private static native void nativeReleaseVideoFrameHelper(long j);

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }
}
