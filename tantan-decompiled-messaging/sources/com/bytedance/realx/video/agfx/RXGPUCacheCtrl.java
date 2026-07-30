package com.bytedance.realx.video.agfx;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public class RXGPUCacheCtrl {
    private static RXGPUCacheCtrl instance;
    private long nativeHandle;

    @CalledByNative
    private RXGPUCacheCtrl(long j) {
        this.nativeHandle = j;
    }

    public static RXGPUCacheCtrl getInstance() {
        RXGPUCacheCtrl rXGPUCacheCtrlNativeGetInstance = nativeGetInstance();
        instance = rXGPUCacheCtrlNativeGetInstance;
        return rXGPUCacheCtrlNativeGetInstance;
    }

    private static native void nativeBind(long j);

    private static native RXGPUCacheCtrl nativeGetInstance();

    private static native void nativeUnBind(long j);

    public void bind() {
        nativeBind(this.nativeHandle);
    }

    public void unbind() {
        nativeUnBind(this.nativeHandle);
    }
}
