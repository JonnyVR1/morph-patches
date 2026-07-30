package com.p069ss.bytertc.engine.video;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes13.dex */
public class WebrtcTextureBufferWrapper implements ITextureBuffer, VideoFrame.TextureBuffer {
    TextureBufferImpl webrtcTextureBuffer;

    public WebrtcTextureBufferWrapper(TextureBufferImpl textureBufferImpl) {
        this.webrtcTextureBuffer = textureBufferImpl;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.copyData();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.getEglContext();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getHeight();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0L;
        }
        return textureBufferImpl.getNativeEglContext();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    @Override // com.p069ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getTextureId() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getTextureId();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        return textureBufferImpl == null ? new Matrix() : textureBufferImpl.getTransformMatrix();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        return textureBufferImpl == null ? VideoFrame.TextureBuffer.Type.OES : textureBufferImpl.getType();
    }

    @Override // com.p069ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getType().getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getUnscaledHeight();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getUnscaledWidth();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getWidth();
    }

    @Override // com.p069ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public float[] nativeGetTransFormMatrix() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        return textureBufferImpl == null ? new float[]{0.0f} : RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBufferImpl.getTransformMatrix());
    }

    @Override // com.p069ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return;
        }
        textureBufferImpl.release();
    }

    @Override // com.p069ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return;
        }
        textureBufferImpl.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.scaleAndFill(i, i2, i3, i4);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.toI420();
    }
}
