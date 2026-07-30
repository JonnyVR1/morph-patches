package io.agora.base;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.GlRectDrawer;
import io.agora.base.internal.video.GlTextureFrameBuffer;
import io.agora.base.internal.video.RendererCommon;
import io.agora.base.internal.video.YuvConverter;
import io.agora.utils2.internal.Logging;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public class TextureBufferHelper {
    private static final String TAG = "TextureBufferHelper";

    @Nullable
    private ByteBuffer alphaBuffer;
    private final EglBase eglBase;
    private final Handler handler;
    private boolean isQuitting;
    private int numOfTextureInUse;
    private GlRectDrawer textureDrawer;
    private GlTextureFrameBuffer textureFrameBuffer;
    private final YuvConverter yuvConverter;

    private TextureBufferHelper(EglBase.Context context, Handler handler) {
        this.yuvConverter = new YuvConverter();
        this.numOfTextureInUse = 0;
        this.isQuitting = false;
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("TextureBufferHelper must be created on the handler thread");
            throw null;
        }
        this.handler = handler;
        EglBase eglBase14 = (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14((EglBase14.Context) context, EglBase.CONFIG_PIXEL_BUFFER) : new EglBase10((EglBase10.Context) context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBase14;
        try {
            eglBase14.createDummyPbufferSurface();
            eglBase14.makeCurrent();
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    public static /* synthetic */ int access$210(TextureBufferHelper textureBufferHelper) {
        int i = textureBufferHelper.numOfTextureInUse;
        textureBufferHelper.numOfTextureInUse = i - 1;
        return i;
    }

    @Nullable
    public static TextureBufferHelper create(final String str, final EglBase.Context context) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        try {
            return (TextureBufferHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<TextureBufferHelper>() { // from class: io.agora.base.TextureBufferHelper.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public TextureBufferHelper call() {
                    try {
                        return new TextureBufferHelper(context, handler);
                    } catch (RuntimeException e) {
                        Logging.m87220e(TextureBufferHelper.TAG, str + " create failure", e);
                        return null;
                    }
                }
            });
        } catch (Exception e) {
            Logging.m87220e(TAG, str + " create failure", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("Wrong thread.");
            return;
        }
        if (isTextureInUse() || !this.isQuitting) {
            qkq0.m175383a("Unexpected release.");
            return;
        }
        Logging.m87216d(TAG, "release()");
        GlRectDrawer glRectDrawer = this.textureDrawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.textureDrawer = null;
        }
        GlTextureFrameBuffer glTextureFrameBuffer = this.textureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.textureFrameBuffer = null;
        }
        ByteBuffer byteBuffer = this.alphaBuffer;
        if (byteBuffer != null) {
            JniCommon.nativeFreeByteBuffer(byteBuffer);
            this.alphaBuffer = null;
        }
        this.yuvConverter.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: io.agora.base.TextureBufferHelper.4
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferHelper.access$210(TextureBufferHelper.this);
                if (!TextureBufferHelper.this.isQuitting || TextureBufferHelper.this.isTextureInUse()) {
                    return;
                }
                TextureBufferHelper.this.release();
            }
        });
    }

    public int convertToRGBA(TextureBuffer textureBuffer, int i) {
        if (textureBuffer == null) {
            return 0;
        }
        if (this.textureDrawer == null) {
            this.textureDrawer = new GlRectDrawer();
        }
        if (this.textureFrameBuffer == null) {
            this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
        }
        int i2 = i % 180;
        int width = i2 == 0 ? textureBuffer.getWidth() : textureBuffer.getHeight();
        int height = i2 == 0 ? textureBuffer.getHeight() : textureBuffer.getWidth();
        this.textureFrameBuffer.setSize(width, height);
        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
        GLES20.glClear(16384);
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        matrix.postConcat(textureBuffer.getTransformMatrix());
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        VideoFrame.TextureBuffer.Type type = textureBuffer.getType();
        VideoFrame.TextureBuffer.Type type2 = VideoFrame.TextureBuffer.Type.RGB;
        GlRectDrawer glRectDrawer = this.textureDrawer;
        int textureId = textureBuffer.getTextureId();
        if (type == type2) {
            glRectDrawer.drawRgb(textureId, 0, fArrConvertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height, 0, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            glRectDrawer.drawOes(textureId, 0, fArrConvertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height, 0, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        }
        GLES20.glBindFramebuffer(36160, 0);
        return this.textureFrameBuffer.getTextureId();
    }

    public void dispose() {
        Logging.m87216d(TAG, "dispose()");
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.TextureBufferHelper.5
                @Override // java.lang.Runnable
                public void run() {
                    TextureBufferHelper.this.isQuitting = true;
                    if (TextureBufferHelper.this.isTextureInUse()) {
                        return;
                    }
                    TextureBufferHelper.this.release();
                }
            });
        } catch (Exception e) {
            Logging.m87216d(TAG, "dispose fail: " + e.getMessage());
        }
    }

    public EglBase getEglBase() {
        return this.eglBase;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public <V> V invoke(Callable<V> callable) {
        return (V) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, callable);
    }

    public boolean isTextureInUse() {
        return this.numOfTextureInUse > 0;
    }

    public ByteBuffer parseAlphaData(TextureBuffer textureBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBufferNativeAllocateByteBuffer;
        if (textureBuffer.getType() != VideoFrame.TextureBuffer.Type.RGB) {
            return null;
        }
        int i5 = i % 180;
        int width = i5 == 0 ? textureBuffer.getWidth() : textureBuffer.getHeight();
        int height = i5 == 0 ? textureBuffer.getHeight() : textureBuffer.getWidth();
        int i6 = width % 4;
        if (i6 == 0) {
            i2 = 6408;
            i3 = width / 4;
        } else {
            i2 = 6406;
            i3 = width;
        }
        if (this.textureDrawer == null) {
            this.textureDrawer = new GlRectDrawer();
        }
        if (this.textureFrameBuffer == null) {
            this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
        }
        this.textureFrameBuffer.setSize(i3, height);
        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate(i);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preTranslate(-0.5f, -0.5f);
        matrix.postConcat(textureBuffer.getTransformMatrix());
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        GlRectDrawer glRectDrawer = this.textureDrawer;
        if (i6 == 0) {
            int i7 = i3;
            glRectDrawer.drawAlpha(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, i7, height);
            i4 = i7;
        } else {
            i4 = i3;
            glRectDrawer.drawRgb(textureBuffer.getTextureId(), 0, fArrConvertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height, 0, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
            width = width;
            height = height;
        }
        ByteBuffer byteBuffer = this.alphaBuffer;
        if (byteBuffer != null) {
            int iCapacity = byteBuffer.capacity();
            int i8 = width * height;
            ByteBuffer byteBuffer2 = this.alphaBuffer;
            if (iCapacity != i8) {
                Logging.m87224w(TAG, "fillAlphaData size is changed, alphaBuffer.capacity: " + byteBuffer2.capacity() + "  buffer.width: " + width + "  buffer.height: " + height);
                JniCommon.nativeFreeByteBuffer(this.alphaBuffer);
                byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i8);
            } else {
                byteBuffer2.clear();
            }
            GLES20.glReadPixels(0, 0, i4, height, i2, 5121, this.alphaBuffer);
            GLES20.glBindFramebuffer(36160, 0);
            return this.alphaBuffer;
        }
        byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(width * height);
        this.alphaBuffer = byteBufferNativeAllocateByteBuffer;
        GLES20.glReadPixels(0, 0, i4, height, i2, 5121, this.alphaBuffer);
        GLES20.glBindFramebuffer(36160, 0);
        return this.alphaBuffer;
    }

    public VideoFrame.TextureBuffer wrapTextureBuffer(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, long j, Matrix matrix) {
        this.numOfTextureInUse++;
        return new TextureBuffer(this.eglBase.getEglBaseContext(), i, i2, type, i3, j, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.TextureBufferHelper.3
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferHelper.this.returnTextureFrame();
            }
        });
    }

    public VideoFrame.TextureBuffer wrapTextureBuffer(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix) {
        this.numOfTextureInUse++;
        return new TextureBuffer(this.eglBase.getEglBaseContext(), i, i2, type, i3, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.TextureBufferHelper.2
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferHelper.this.returnTextureFrame();
            }
        });
    }
}
