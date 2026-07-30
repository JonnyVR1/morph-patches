package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecTextureBufferHelper {
    private ReleaseOutPutBuffer mReleaseFunc;
    private boolean render = false;
    private SurfaceTextureHelper mSurfaceTextureHelper = null;

    @FunctionalInterface
    public interface ReleaseOutPutBuffer {
        int release(boolean z);
    }

    public MediaCodecTextureBufferHelper(ReleaseOutPutBuffer releaseOutPutBuffer) {
        this.mReleaseFunc = releaseOutPutBuffer;
    }

    @CalledByNative
    public float[] getMatrix() {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return null;
        }
        return surfaceTextureHelper.getTexMatrix();
    }

    @CalledByNative
    public boolean isAvaliable() {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return false;
        }
        return surfaceTextureHelper.isAvaliable();
    }

    @CalledByNative
    public void releaseOutputBuffer(boolean z) {
        runTask(z);
    }

    public int runTask(boolean z) {
        return this.mReleaseFunc.release(z);
    }

    public void setRender(boolean z) {
        this.render = z;
    }

    public void setSurfaceTextureHelper(SurfaceTextureHelper surfaceTextureHelper) {
        this.mSurfaceTextureHelper = surfaceTextureHelper;
    }

    @CalledByNative
    public boolean updateTextureImage() {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return false;
        }
        surfaceTextureHelper.updateTexImage();
        return true;
    }

    @CalledByNative
    public boolean updateTextureImageAndWait(int i) {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return false;
        }
        return surfaceTextureHelper.updateTexImageAndWait(i);
    }
}
