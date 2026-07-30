package io.agora.base.internal.video;

import android.opengl.GLES20;
import com.immomo.momomediaext.sei.BaseSei;
import p153l.itq0;
import p153l.o4c;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes2.dex */
public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    public GlTextureFrameBuffer(int i) {
        if (i != 34842) {
            switch (i) {
                case 6407:
                case 6408:
                case 6409:
                    break;
                default:
                    za50.m219101a("Invalid pixel format: ", i);
                    throw null;
            }
        }
        this.pixelFormat = i;
        this.width = 0;
        this.height = 0;
    }

    public void bindTexture(int i, int i2, int i3, int i4, boolean z) {
        if (!z && i3 == this.width && i4 == this.height && this.textureId == i) {
            return;
        }
        this.textureId = i;
        this.width = i3;
        this.height = i4;
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        GLES20.glBindFramebuffer(36160, this.frameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, i2, i, 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            GLES20.glBindFramebuffer(36160, 0);
        } else {
            o4c.m165980a("Framebuffer not complete, status: ", iGlCheckFramebufferStatus);
        }
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public void setSize(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            itq0.m142074a("Invalid size: ", i, BaseSei.f14624X, i2);
            return;
        }
        if (i == this.width && i2 == this.height) {
            return;
        }
        int iGenerateTexture = this.textureId;
        if (iGenerateTexture == 0) {
            iGenerateTexture = GlUtil.generateTexture(3553);
        }
        int i5 = iGenerateTexture;
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i5);
        int i6 = this.pixelFormat;
        if (i6 != 34842) {
            i3 = i;
            i4 = i2;
            GLES20.glTexImage2D(3553, 0, i6, i3, i4, 0, i6, 5121, null);
        } else {
            if (!HdrUtil.isSupportedEGL3()) {
                wg3.m206174a("not support hdr");
                return;
            }
            i3 = i;
            i4 = i2;
            GLES20.glTexImage2D(3553, 0, 34842, i3, i4, 0, 6408, 5126, null);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer glTexImage2D GL_RGBA16F");
        }
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
        bindTexture(i5, 3553, i3, i4, false);
    }
}
