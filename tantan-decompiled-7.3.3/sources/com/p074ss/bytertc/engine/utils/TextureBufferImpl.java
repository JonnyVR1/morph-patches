package com.p074ss.bytertc.engine.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.p074ss.bytertc.engine.video.ITextureBuffer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer, EglContextCarrier, ITextureBuffer {
    private final int height;

    /* JADX INFO: renamed from: id */
    private final int f56488id;
    private EglBase.Context mEglBaseContext;
    private int refCount;
    private final Object refCountLock;
    private final Runnable releaseCallback;
    private FilterType scaleFilter;
    private final TextureHelper textureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private YuvImage yuvImage;

    @CalledByNative
    public TextureBufferImpl(int i, int i2, int i3, final int i4, final TextureHelper textureHelper) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.OES;
        if (i3 == type.getGlTarget()) {
            this.type = type;
        } else {
            this.type = VideoFrame.TextureBuffer.Type.RGB;
        }
        this.f56488id = i4;
        Matrix matrix = new Matrix();
        this.transformMatrix = matrix;
        matrix.reset();
        this.textureHelper = textureHelper;
        this.releaseCallback = new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.1
            @Override // java.lang.Runnable
            public void run() {
                textureHelper.releaseTextureID(i4);
            }
        };
        this.refCount = 1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    @CalledByNative
    public VideoFrame.Buffer copyData() {
        int i;
        final int iDequeueTexture = this.textureHelper.dequeueTexture();
        if (iDequeueTexture == 0) {
            return null;
        }
        VideoFrame.TextureBuffer.Type type = this.type;
        if (type == VideoFrame.TextureBuffer.Type.RGB) {
            i = 10;
        } else {
            if (type != VideoFrame.TextureBuffer.Type.OES) {
                return null;
            }
            i = 11;
        }
        this.textureHelper.drawTexture(i, this.f56488id, iDequeueTexture);
        return new TextureBufferImpl(this.width, this.height, this.type, this.f56488id, this.transformMatrix, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.2
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.textureHelper.queueTexture(iDequeueTexture);
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    @CalledByNative
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(i / this.width, (i7 - (i2 + i4)) / i7);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = null;
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i5, i6, this.type, this.f56488id, matrix2, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        int i8 = this.height;
        matrix.preTranslate(i / this.width, (i8 - (i2 + i4)) / i8);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.fromValue(i7);
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i5, i6, this.type, this.f56488id, matrix2, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // com.p074ss.bytertc.engine.utils.EglContextCarrier
    public EglBase.Context getEglBaseContext() {
        return this.mEglBaseContext;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        TextureHelper textureHelper = this.textureHelper;
        if (textureHelper != null) {
            return textureHelper.getEglBaseContext().getEgl14Context();
        }
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public long getNativeEglContext() {
        TextureHelper textureHelper = this.textureHelper;
        if (textureHelper != null) {
            return textureHelper.getNativeEglContext();
        }
        return 0L;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    @CalledByNative
    public TextureHelper getTextureHelper() {
        return this.textureHelper;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getTextureId() {
        return this.f56488id;
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
    @CalledByNative
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getUnscaledHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getUnscaledWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void release() {
        Runnable runnable;
        synchronized (this.refCountLock) {
            try {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public void saveMyBitmap(String str, byte[] bArr, int i, int i2) {
        FileOutputStream fileOutputStream;
        LogUtil.m82086i("texturebuffer", "saveMyBitmap");
        File file = new File(str);
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileOutputStream = null;
        }
        try {
            new YuvImage(bArr, 17, this.width, this.height, null).compressToJpeg(new Rect(0, 0, this.width, this.height), 50, fileOutputStream);
        } catch (Exception unused2) {
        }
        try {
            fileOutputStream.flush();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        int iMin = Math.min(i, (getWidth() * i2) / getHeight());
        int iMin2 = Math.min(i2, (getHeight() * i) / getWidth());
        matrix.preScale(iMin / getWidth(), iMin2 / getHeight());
        matrix.preTranslate(i3 / i, (i2 - (i4 + iMin2)) / i2);
        return new TextureBufferImpl(i, i2, this.type, this.f56488id, matrix, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.5
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // com.p074ss.bytertc.engine.utils.EglContextCarrier
    public void setEglBaseContext(EglBase.Context context) {
        this.mEglBaseContext = context;
    }

    @CalledByNative
    public void setTransFormMatrix(float[] fArr) {
        RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.textureHelper.textureToYuv(this);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, TextureHelper textureHelper, Runnable runnable) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type;
        this.f56488id = i3;
        this.transformMatrix = matrix;
        this.textureHelper = textureHelper;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }
}
