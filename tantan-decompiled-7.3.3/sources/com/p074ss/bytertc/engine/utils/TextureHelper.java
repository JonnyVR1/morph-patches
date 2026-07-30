package com.p074ss.bytertc.engine.utils;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.realx.video.YuvHelper;
import com.p074ss.bytertc.engine.utils.TextureHelper;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;
import p153l.mce;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
public class TextureHelper {
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int FORMAT_TEXTURE_OES = 11;
    private static final String TAG = "TextureHelper";
    private static final int TEXTURE_MAX_COUNT = 45;
    private static float[] TEX_MATRIX = new float[16];
    private static float[] YUV_TEX_MATRIX = new float[16];
    private final EglBase mEglBase;
    private int mFrameBufferId;
    private final Handler mHandler;
    private int mHeight;
    private boolean mIsQuitting;
    private boolean mIsRelease;
    private boolean mIsTextureInUse;
    private GlRectDrawer mTextureDrawer;
    private int mWidth;
    private YuvConverter mYuvConverter;
    private YuvUploader mYuvUploader;
    private int mTextureCnt = 0;
    private List<Integer> mTextureFreeQueue = new LinkedList();
    private List<Integer> mTextureUsedQueue = new LinkedList();

    public static class YuvUploader {

        @Nullable
        private ByteBuffer copyBuffer;

        @Nullable
        private int[] yuvTextures;

        @Nullable
        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        @Nullable
        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        @Nullable
        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = i / 2;
            int[] iArr2 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr3 = {i2, i4, i4};
            int iMax = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i5];
                if (i6 > i7) {
                    iMax = Math.max(iMax, i7 * iArr3[i5]);
                }
            }
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i8 = 0; i8 < 3; i8++) {
                    this.yuvTextures[i8] = GlUtil.generateTexture(3553);
                }
            }
            for (int i9 = 0; i9 < 3; i9++) {
                GLES20.glPixelStorei(3317, 1);
                GLES20.glActiveTexture(33984 + i9);
                GLES20.glBindTexture(3553, this.yuvTextures[i9]);
                int i10 = iArr[i9];
                int i11 = iArr2[i9];
                if (i10 == i11) {
                    byteBuffer = byteBufferArr[i9];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i9], i10, this.copyBuffer, i11, i11, iArr3[i9]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i9], iArr3[i9], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }
    }

    private TextureHelper(Object obj, Handler handler, int i, int i2) {
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            wtq0.m207906a("TextureHelper must be created on the handler thread");
            throw null;
        }
        this.mWidth = i;
        this.mHeight = i2;
        this.mHandler = handler;
        Matrix.setIdentityM(TEX_MATRIX, 0);
        Matrix.setIdentityM(YUV_TEX_MATRIX, 0);
        Matrix.translateM(YUV_TEX_MATRIX, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(YUV_TEX_MATRIX, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(YUV_TEX_MATRIX, 0, -0.5f, -0.5f, 0.0f);
        if (obj instanceof EGLContext) {
            this.mEglBase = EglBase.createEgl10((EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mEglBase = EglBase.createEgl14((android.opengl.EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
        } else {
            if (!(obj instanceof EglBase.Context)) {
                mce.m157919a("unknown shareContext:", obj);
                throw null;
            }
            this.mEglBase = EglBase.create((EglBase.Context) obj);
        }
        try {
            this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
            this.mEglBase.makeCurrent();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFrameBufferId = iArr[0];
            this.mTextureDrawer = new GlRectDrawer();
            this.mYuvUploader = new YuvUploader();
            GlUtil.checkNoGLES2Error("TextureHelper construct");
        } catch (RuntimeException e) {
            this.mEglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TextureHelper m82089a(android.opengl.EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m82085e(TAG, str + " create failure", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TextureHelper m82090b(EglBase.Context context, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(context, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m82085e(TAG, str + " create failure", e);
            return null;
        }
    }

    public static TextureHelper create(final String str, final EGLContext eGLContext, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: l.kti0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.m82093e(eGLContext, handler, i, i2, str);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m82092d(TextureHelper textureHelper) {
        textureHelper.mIsQuitting = true;
        if (textureHelper.mIsTextureInUse) {
            return;
        }
        textureHelper.release();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ TextureHelper m82093e(EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m82085e(TAG, str + " create failure", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Integer m82094f(TextureHelper textureHelper, int i, int i2, int i3) {
        textureHelper.getClass();
        int iGenerateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        textureHelper.mTextureCnt++;
        return Integer.valueOf(iGenerateTexture);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m82095g(TextureHelper textureHelper, int i) {
        List<Integer> list = textureHelper.mTextureUsedQueue;
        if (list == null || !list.contains(Integer.valueOf(i))) {
            return;
        }
        textureHelper.mTextureUsedQueue.remove(new Integer(i));
        List<Integer> list2 = textureHelper.mTextureFreeQueue;
        if (list2 != null) {
            list2.add(Integer.valueOf(i));
        }
    }

    private int generateTexture(final int i, final int i2, final int i3) {
        if (this.mTextureCnt == 45) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Callable() { // from class: l.nti0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.m82094f(this.f143602a, i, i2, i3);
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m82096h(TextureHelper textureHelper, int[] iArr) {
        List<Integer> list = textureHelper.mTextureFreeQueue;
        if (list != null) {
            if (list.size() != 0) {
                iArr[0] = textureHelper.mTextureFreeQueue.get(0).intValue();
                textureHelper.mTextureFreeQueue.remove(0);
                textureHelper.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
            } else {
                int iGenerateTexture = textureHelper.generateTexture(3553, textureHelper.mWidth, textureHelper.mHeight);
                iArr[0] = iGenerateTexture;
                if (iGenerateTexture > 0) {
                    textureHelper.mTextureUsedQueue.add(Integer.valueOf(iGenerateTexture));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (this.mHandler.getLooper().getThread() != Thread.currentThread()) {
            wtq0.m207906a("Wrong thread.");
            return;
        }
        if (this.mIsTextureInUse || !this.mIsQuitting) {
            wtq0.m207906a("Unexpected release.");
            return;
        }
        this.mIsRelease = true;
        YuvConverter yuvConverter = this.mYuvConverter;
        if (yuvConverter != null) {
            yuvConverter.release();
        }
        YuvUploader yuvUploader = this.mYuvUploader;
        if (yuvUploader != null) {
            yuvUploader.release();
        }
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.mTextureFreeQueue.iterator();
            while (it.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
            }
        }
        this.mTextureFreeQueue.clear();
        List<Integer> list2 = this.mTextureUsedQueue;
        if (list2 != null && list2.size() > 0) {
            Iterator<Integer> it2 = this.mTextureUsedQueue.iterator();
            while (it2.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
            }
        }
        this.mTextureUsedQueue.clear();
        GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
        this.mFrameBufferId = 0;
        this.mEglBase.release();
        this.mHandler.getLooper().quit();
    }

    public int dequeueTexture() {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: l.rti0
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.m82096h(this.f164820a, iArr);
            }
        });
        return iArr[0];
    }

    public synchronized void dispose() {
        LogUtil.m82083d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: l.lti0
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.m82092d(this.f133549a);
            }
        });
    }

    public void drawTexture(final int i, final int i2, final int i3, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                int i4 = i;
                if (i4 == 10) {
                    TextureHelper.this.mTextureDrawer.drawRgb(i2, fArr, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                } else if (i4 != 11) {
                    LogUtil.m82084e(TextureHelper.TAG, "draw texture type error");
                } else {
                    TextureHelper.this.mTextureDrawer.drawOes(i2, fArr, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }
        });
    }

    public EglBase.Context getEglBaseContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public long getNativeEglContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0L;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void queueTexture(final int i) {
        this.mHandler.post(new Runnable() { // from class: l.qti0
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.m82095g(this.f159445a, i);
            }
        });
    }

    public void releaseTextureID(final int i) {
        if (i <= 0 || this.mIsQuitting || this.mIsRelease) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: l.mti0
            @Override // java.lang.Runnable
            public final void run() {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
        });
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr;
        i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                TextureHelper.this.mIsTextureInUse = true;
                if (TextureHelper.this.mYuvConverter == null) {
                    TextureHelper.this.mYuvConverter = new YuvConverter();
                }
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper.this.mIsTextureInUse = false;
                if (TextureHelper.this.mIsQuitting) {
                    TextureHelper.this.release();
                }
            }
        });
        return i420BufferArr[0];
    }

    public void yuvToTexture(final VideoFrame.I420Buffer i420Buffer, final int i, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                if (TextureHelper.this.mTextureDrawer == null || TextureHelper.this.mYuvUploader == null) {
                    wtq0.m207906a("mTextureDrawer and mYuvUploader can not null.");
                    return;
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                TextureHelper.this.mYuvUploader.uploadFromBuffer(i420Buffer);
                TextureHelper.this.mTextureDrawer.drawYuv(TextureHelper.this.mYuvUploader.getYuvTextures(), fArr, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }
        });
    }

    public void yuvToTexture(VideoFrame.I420Buffer i420Buffer, int i) {
        yuvToTexture(i420Buffer, i, YUV_TEX_MATRIX);
    }

    public void drawTexture(int i, int i2, int i3) {
        drawTexture(i, i2, i3, TEX_MATRIX);
    }

    public static TextureHelper create(final String str, final android.opengl.EGLContext eGLContext, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: l.pti0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.m82089a(eGLContext, handler, i, i2, str);
            }
        });
    }

    public static TextureHelper create(final String str, final EglBase.Context context, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: l.oti0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.m82090b(context, handler, i, i2, str);
            }
        });
    }
}
