package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.TextureBufferImpl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* JADX INFO: renamed from: id */
    private final int f4734id;
    private final RefCountDelegate refCountDelegate;
    private FilterType scaleFilter;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    private TextureBufferImpl(int i, int i2, int i3, int i4, VideoFrame.TextureBuffer.Type type, int i5, FilterType filterType, Matrix matrix, Handler handler, YuvConverter yuvConverter, @Nullable Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type;
        this.f4734id = i5;
        this.scaleFilter = filterType;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, i3, i4, this.type, this.f4734id, this.scaleFilter, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: l.cki0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81339a.release();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ TextureBufferImpl m5721e(final TextureBufferImpl textureBufferImpl) {
        final int iDequeueTexture = textureBufferImpl.yuvConverter.dequeueTexture(textureBufferImpl.width, textureBufferImpl.height);
        if (iDequeueTexture == 0) {
            return null;
        }
        textureBufferImpl.yuvConverter.drawTexture(textureBufferImpl.type == VideoFrame.TextureBuffer.Type.OES ? 11 : 10, textureBufferImpl.f4734id, iDequeueTexture, textureBufferImpl.width, textureBufferImpl.height);
        return new TextureBufferImpl(textureBufferImpl.width, textureBufferImpl.height, VideoFrame.TextureBuffer.Type.RGB, iDequeueTexture, textureBufferImpl.transformMatrix, textureBufferImpl.toI420Handler, textureBufferImpl.yuvConverter, new Runnable() { // from class: l.dki0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86662a.yuvConverter.queueTexture(iDequeueTexture);
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return (VideoFrame.Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: l.eki0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureBufferImpl.m5721e(this.f91985a);
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(i / this.width, (i7 - (i2 + i4)) / i7);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.Origin;
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        int i8 = this.height;
        matrix.preTranslate(i / this.width, (i8 - (i2 + i4)) / i8);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.fromValue(i7);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        Handler handler = this.toI420Handler;
        if (handler == null) {
            return null;
        }
        return (EGLContext) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: l.aki0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EGL14.eglGetCurrentContext();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EGLContext eglContext = getEglContext();
        if (eglContext == null) {
            return 0L;
        }
        return eglContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return this.scaleFilter;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f4734id;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        int iMin = Math.min(i, (getWidth() * i2) / getHeight());
        int iMin2 = Math.min(i2, (getHeight() * i) / getWidth());
        matrix.preScale(iMin / getWidth(), iMin2 / getHeight());
        matrix.preTranslate(i3 / i, (i2 - (i4 + iMin2)) / i2);
        return applyTransformMatrix(matrix, i, i2);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        FilterType filterType = this.scaleFilter;
        return (filterType == null || filterType == FilterType.Origin) ? (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: l.fki0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TextureBufferImpl textureBufferImpl = this.f98077a;
                return textureBufferImpl.yuvConverter.convert(textureBufferImpl);
            }
        }) : (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: l.gki0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TextureBufferImpl textureBufferImpl = this.f103197a;
                return textureBufferImpl.yuvConverter.convert(textureBufferImpl, textureBufferImpl.scaleFilter, textureBufferImpl.unscaledWidth, textureBufferImpl.unscaledHeight);
            }
        });
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, @Nullable Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.type = type;
        this.f4734id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }
}
