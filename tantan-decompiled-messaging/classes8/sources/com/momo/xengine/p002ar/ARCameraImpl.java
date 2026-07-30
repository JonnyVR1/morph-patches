package com.momo.xengine.p002ar;

import com.momo.xeengine.IXEngine;
import com.momo.xeengine.xnative.IXEngineListener;
import com.momo.xeengine.xnative.XEEngineInstanceJava;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
final class ARCameraImpl implements IXARCamera {
    private IXEngineListener engineListener;
    private long nativeCamera;

    /* JADX WARN: Multi-variable type inference failed */
    public ARCameraImpl(IXEngine iXEngine) {
        IXEngineListener iXEngineListener = new IXEngineListener() { // from class: com.momo.xengine.ar.ARCameraImpl.1
            @Override // com.momo.xeengine.xnative.IXEngineListener
            public void onEngineRelease() {
                ARCameraCache.removeARCamera(ARCameraImpl.this);
                if (ARCameraImpl.this.nativeCamera != 0) {
                    ARCameraImpl aRCameraImpl = ARCameraImpl.this;
                    aRCameraImpl.nativeRelease(aRCameraImpl.nativeCamera);
                    ARCameraImpl.this.nativeCamera = 0L;
                }
            }

            @Override // com.momo.xeengine.xnative.IXEngineListener
            public void postRender() {
            }

            @Override // com.momo.xeengine.xnative.IXEngineListener
            public void preRender() {
            }
        };
        this.engineListener = iXEngineListener;
        XEEngineInstanceJava xEEngineInstanceJava = (XEEngineInstanceJava) iXEngine;
        xEEngineInstanceJava.addEngineListener(iXEngineListener);
        long jNativeCreateCamera = nativeCreateCamera(xEEngineInstanceJava.getEngineIns());
        this.nativeCamera = jNativeCreateCamera;
        if (jNativeCreateCamera != 0) {
            return;
        }
        upk0.a("ARCameraImpl create failed");
        throw null;
    }

    private void check() {
        if (this.nativeCamera != 0) {
            return;
        }
        upk0.a("IXARCamera 已经被释放");
    }

    private native long nativeCreateCamera(long j);

    private native int nativeGetHeight(long j);

    private native int nativeGetWidth(long j);

    private native void nativePause(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRelease(long j);

    private native void nativeResume(long j);

    private native boolean nativeUpdate(long j, int i);

    @Override // com.momo.xengine.p002ar.IXARCamera
    public IXARCamera.Size getTextureSize() {
        IXARCamera.Size size = new IXARCamera.Size();
        size.width = nativeGetWidth(this.nativeCamera);
        size.height = nativeGetHeight(this.nativeCamera);
        return size;
    }

    @Override // com.momo.xengine.p002ar.IXARCamera
    public void pause() {
        check();
        nativePause(this.nativeCamera);
    }

    @Override // com.momo.xengine.p002ar.IXARCamera
    public void resume() {
        check();
        nativeResume(this.nativeCamera);
    }

    @Override // com.momo.xengine.p002ar.IXARCamera
    public boolean update(int i, IXARCamera.Size size) {
        check();
        if (size != null) {
            size.width = nativeGetWidth(this.nativeCamera);
            size.height = nativeGetHeight(this.nativeCamera);
        }
        return nativeUpdate(this.nativeCamera, i);
    }
}
