package com.momo.rtcbase;

import android.graphics.Matrix;
import android.os.Handler;
import com.momo.rtcbase.TextureBufferImpl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* JADX INFO: renamed from: id */
    private final int f15268id;
    private final RefCountDelegate refCountDelegate;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.type = type;
        this.f15268id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, i3, i4, this.type, this.f15268id, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: l.bti0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78358a.release();
            }
        });
    }

    @Override // com.momo.rtcbase.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(i / this.width, (i7 - (i2 + i4)) / i7);
        matrix.preScale(i3 / this.width, i4 / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    @Override // com.momo.rtcbase.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.momo.rtcbase.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f15268id;
    }

    @Override // com.momo.rtcbase.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.momo.rtcbase.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // com.momo.rtcbase.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.momo.rtcbase.VideoFrame.Buffer, com.momo.rtcbase.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.momo.rtcbase.VideoFrame.Buffer, com.momo.rtcbase.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.momo.rtcbase.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: l.zsi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TextureBufferImpl textureBufferImpl = this.f205881a;
                return textureBufferImpl.yuvConverter.convert(textureBufferImpl);
            }
        });
    }

    private TextureBufferImpl(int i, int i2, int i3, int i4, VideoFrame.TextureBuffer.Type type, int i5, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type;
        this.f15268id = i5;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }
}
