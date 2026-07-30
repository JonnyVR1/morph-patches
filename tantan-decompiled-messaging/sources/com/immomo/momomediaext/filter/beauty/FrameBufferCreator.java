package com.immomo.momomediaext.filter.beauty;

import android.opengl.GLES20;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class FrameBufferCreator {
    static boolean isUsedFloat = false;
    public boolean isLocked;
    private int mHeight;
    private int mWidth;
    private Object countLock = new Object();
    private boolean isInited = false;
    private boolean reInit = false;
    public int reuseCount = 0;
    private boolean isFloat = false;
    protected int[] frameBuffer = new int[1];
    protected int[] texture_out = new int[1];
    protected int[] depthRenderBuffer = new int[1];
    public int framebufferReferenceCount = 0;

    public FrameBufferCreator(int i, int i2) {
    }

    public void activityDepthFrameBuffer(int i, int i2) {
        if (this.isInited) {
            return;
        }
        if (this.frameBuffer == null) {
            this.frameBuffer = new int[1];
            this.texture_out = new int[1];
            this.depthRenderBuffer = new int[1];
            this.framebufferReferenceCount = 0;
        }
        this.mWidth = i;
        this.mHeight = i2;
        GLES20.glGenFramebuffers(1, this.frameBuffer, 0);
        GLES20.glGenRenderbuffers(1, this.depthRenderBuffer, 0);
        GLES20.glGenTextures(1, this.texture_out, 0);
        GLES20.glBindFramebuffer(36160, this.frameBuffer[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_out[0]);
        if (this.isFloat) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        Log.e("GLFrameBuffer", "frameBufferNumber" + this.texture_out[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture_out[0], 0);
        GLES20.glBindRenderbuffer(36161, this.depthRenderBuffer[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.depthRenderBuffer[0]);
        this.isInited = true;
    }

    public void activityFrameBuffer(int i, int i2) {
        if (this.reInit) {
            destoryBuffer();
        }
        if (this.isInited) {
            return;
        }
        if (this.frameBuffer == null) {
            this.frameBuffer = new int[1];
            this.texture_out = new int[1];
            this.framebufferReferenceCount = 0;
        }
        this.mWidth = i;
        this.mHeight = i2;
        GLES20.glGenFramebuffers(1, this.frameBuffer, 0);
        GLES20.glGenTextures(1, this.texture_out, 0);
        GLES20.glBindFramebuffer(36160, this.frameBuffer[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_out[0]);
        if (this.isFloat) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture_out[0], 0);
        this.isInited = true;
    }

    public void destoryBuffer() {
        int[] iArr = this.frameBuffer;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.frameBuffer = null;
        }
        int[] iArr2 = this.texture_out;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.texture_out = null;
        }
        int[] iArr3 = this.depthRenderBuffer;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.depthRenderBuffer = null;
        }
        unlock();
        this.isInited = false;
    }

    public int getBufferHigh() {
        return this.mHeight;
    }

    public int getBufferWidth() {
        return this.mWidth;
    }

    public int[] getDepthRenderBuffer() {
        return this.depthRenderBuffer;
    }

    public int[] getFrameBuffer() {
        return this.frameBuffer;
    }

    public int[] getTexture_out() {
        return this.texture_out;
    }

    public boolean isReInit() {
        return this.reInit;
    }

    public void lock() {
        synchronized (this.countLock) {
            this.isLocked = true;
        }
    }

    public void reInit() {
        this.reInit = true;
    }

    public void setFloat(boolean z) {
        String strGlGetString = GLES20.glGetString(7939);
        if (strGlGetString == null || !strGlGetString.contains("GL_OES_texture_half_float")) {
            return;
        }
        this.isFloat = z;
    }

    public void unlock() {
        synchronized (this.countLock) {
            this.isLocked = false;
        }
    }
}
