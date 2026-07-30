package com.momo.xeengine.egl;

import android.opengl.GLES20;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public final class GLFrameBuffer {
    private final int[] currentFBO;
    private final int[] depthRenderBuffer;
    private final int[] frameBuffer;
    private int mHeight;
    private int mWidth;
    private final int[] texture_out;
    private boolean useDepthBuffer;

    public GLFrameBuffer(boolean z) {
        this.frameBuffer = new int[]{-1};
        this.texture_out = new int[]{-1};
        this.depthRenderBuffer = new int[]{-1};
        this.currentFBO = new int[1];
        this.mWidth = 0;
        this.mHeight = 0;
        this.useDepthBuffer = z;
    }

    public void bind() {
        GLES20.glGetIntegerv(36006, this.currentFBO, 0);
        GLES20.glBindFramebuffer(36160, this.frameBuffer[0]);
    }

    public int getColorTexture() {
        return this.texture_out[0];
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void release() {
        int[] iArr = this.frameBuffer;
        if (iArr[0] > 0) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.frameBuffer[0] = -1;
        }
        int[] iArr2 = this.texture_out;
        if (iArr2[0] > 0) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.texture_out[0] = -1;
        }
        int[] iArr3 = this.depthRenderBuffer;
        if (iArr3[0] > 0) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.depthRenderBuffer[0] = -1;
        }
    }

    public void resize(int i, int i2) {
        if (this.mWidth == i && this.mHeight == i2) {
            return;
        }
        release();
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        GLES20.glGenFramebuffers(1, this.frameBuffer, 0);
        GLES20.glGenTextures(1, this.texture_out, 0);
        GLES20.glBindFramebuffer(36160, this.frameBuffer[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_out[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture_out[0], 0);
        if (this.useDepthBuffer) {
            GLES20.glGenRenderbuffers(1, this.depthRenderBuffer, 0);
            GLES20.glBindRenderbuffer(36161, this.depthRenderBuffer[0]);
            GLES20.glRenderbufferStorage(36161, 33189, i, i2);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.depthRenderBuffer[0]);
        }
        GLES20.glBindFramebuffer(36160, iArr[0]);
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void unbind() {
        GLES20.glBindFramebuffer(36160, this.currentFBO[0]);
    }

    public GLFrameBuffer() {
        this(true);
    }
}
