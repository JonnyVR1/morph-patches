package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ATrace;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGL10;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class TextureBufferPool {
    private static final String TAG = "TextureBufferPool";
    private static final boolean VERBOSE = false;
    private final GlRectDrawer drawer;
    private int dropCount;
    private final EglBase eglBase;
    private final EglBase.Context eglContext;
    private final int glPixelFormat;
    private final Handler handler;
    private boolean isQuitting;
    private final int keepBufferCnt;
    private final int maxBufferCnt;
    private final String name;
    private final boolean ownGlThread;
    private Runnable poolBufferReleaseCallback;
    private boolean shrinkPool;
    private final ArrayList<TextureInfo> textureInfoList;
    private final YuvConverter yuvConverter;
    private final YuvConverter yuvConverterInternal;
    private static final AtomicInteger nextSeq = new AtomicInteger(0);
    private static int MAX_SYNC_OUT_TIME = 10000000;
    private static List<String> glFlushBuggyDevices = Arrays.asList("Pixel 7", "Redmi 4A", "Redmi 5A", "V2231A");
    private static boolean forceGlFinish = false;
    private static boolean useGlFence = true;
    public static AtomicInteger fenceCount = new AtomicInteger(0);

    /* JADX INFO: renamed from: io.agora.base.internal.video.TextureBufferPool$7 */
    public static /* synthetic */ class C150017 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class TextureInfo {
        int frameBufferId;
        int textureId;
        boolean inUse = false;
        boolean specified = false;
        int width = 0;
        int height = 0;
        long fenceObject = 0;

        public TextureInfo(int i, int i2) {
            this.textureId = i;
            this.frameBufferId = i2;
        }

        public String toString() {
            return "TextureInfo{textureId=" + this.textureId + ", frameBufferId=" + this.frameBufferId + ", inUse=" + this.inUse + ", specified=" + this.specified + ", width=" + this.width + ", height=" + this.height + ", fenceObject=" + this.fenceObject + '}';
        }
    }

    private TextureBufferPool(String str, int i, int i2, Handler handler, boolean z, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter, boolean z2) {
        YuvConverter yuvConverter2 = new YuvConverter();
        this.yuvConverterInternal = yuvConverter2;
        this.shrinkPool = true;
        this.textureInfoList = new ArrayList<>();
        this.poolBufferReleaseCallback = null;
        this.isQuitting = false;
        this.dropCount = 0;
        this.name = str;
        int iMax = Math.max(i, 1);
        this.maxBufferCnt = iMax;
        this.shrinkPool = z2;
        this.keepBufferCnt = z2 ? Math.min(iMax, 3) : iMax;
        this.glPixelFormat = i2;
        this.handler = handler;
        this.ownGlThread = z;
        this.eglBase = eglBase;
        this.yuvConverter = yuvConverter == null ? yuvConverter2 : yuvConverter;
        context = context == null ? eglBase.getEglBaseContext() : context;
        this.eglContext = context;
        this.drawer = new GlRectDrawer();
        Logging.m87211i(TAG, str + " init buffer pool, ownGlThread: " + z + " cnt: " + i + " sharedContext: " + context + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this);
    }

    private TextureInfo acquireTextureFramebuffer() {
        TextureInfo next;
        Iterator<TextureInfo> it = this.textureInfoList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.inUse);
        if (next == null) {
            if (this.textureInfoList.size() >= this.maxBufferCnt) {
                int i = this.dropCount + 1;
                this.dropCount = i;
                ATrace.traceCounter("Drop@TexPool", i);
                return null;
            }
            int iGenerateTexture = GlUtil.generateTexture(3553);
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            TextureInfo textureInfo = new TextureInfo(iGenerateTexture, iArr[0]);
            this.textureInfoList.add(textureInfo);
            next = textureInfo;
        }
        next.inUse = true;
        return next;
    }

    @CalledByNative
    public static TextureBufferPool create(String str, final EglBase.Context context, final int i) {
        final String str2;
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        final TextureBufferPool[] textureBufferPoolArr = {null};
        try {
            str2 = str;
            try {
                ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            textureBufferPoolArr[0] = new TextureBufferPool(str2, i, 6408, handler, true, TextureBufferPool.createEglAndMakeCurrent(context), context, (YuvConverter) null);
                        } catch (RuntimeException e) {
                            Logging.m87210e(TextureBufferPool.TAG, str2 + " failed to initialize egl", e);
                            handler.getLooper().quit();
                        }
                    }
                });
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                Logging.m87210e(TAG, str2 + " failed to initialize egl", exc);
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
        return textureBufferPoolArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EglBase createEglAndMakeCurrent(EglBase.Context context) {
        EglBase eglBaseCreate = EglBaseFactory.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        try {
            eglBaseCreate.createDummyPbufferSurface();
            eglBaseCreate.makeCurrent();
            return eglBaseCreate;
        } catch (RuntimeException e) {
            eglBaseCreate.release();
            throw e;
        }
    }

    public static TextureBufferPool createWithinGlThread(String str, int i, int i2, Handler handler, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter, boolean z) {
        return new TextureBufferPool(str, i, i2, handler, false, eglBase, context, yuvConverter, z);
    }

    public static void deleteFenceObject(long j, String str) {
        if (j != 0) {
            synchronized (EglBase.lock) {
                try {
                    if (GLES30.glIsSync(j)) {
                        GLES30.glDeleteSync(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoFrame.TextureBuffer doTextureCopy(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4, Matrix matrix, long j, final Runnable runnable) {
        EglBase.Context context = this.eglContext;
        if ((context instanceof EglBase10.Context) && ((EglBase10.Context) context).getEglContext().equals(EGL10.EGL_NO_CONTEXT)) {
            return null;
        }
        EglBase.Context context2 = this.eglContext;
        if ((context2 instanceof EglBase14.Context) && ((EglBase14.Context) context2).getEglContext().equals(EGL14.EGL_NO_CONTEXT)) {
            return null;
        }
        if (j != 0) {
            waitFenceSignal2(j, this.name);
        }
        final TextureInfo textureInfoAcquireTextureFramebuffer = acquireTextureFramebuffer();
        if (textureInfoAcquireTextureFramebuffer == null) {
            Logging.m87213w(TAG, this.name + "acquireTextureFramebuffer failed!");
            return null;
        }
        ATrace.beginSection("setupTextureFrameBuffer");
        boolean z = setupTextureFrameBuffer(textureInfoAcquireTextureFramebuffer, i2, i3, i4);
        ATrace.endSection();
        if (!z) {
            Logging.m87213w(TAG, this.name + "setupTextureFrameBuffer failed!");
            releaseTextureFramebuffer(textureInfoAcquireTextureFramebuffer);
            return null;
        }
        GLES20.glBindFramebuffer(36160, textureInfoAcquireTextureFramebuffer.frameBufferId);
        ATrace.beginSection("drawTexture");
        drawTexture(i, type, i2, i3, i4);
        ATrace.endSection();
        ATrace.beginSection("flush");
        GLES20.glBindFramebuffer(36160, 0);
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        long gLFenceObject = useGlFence ? getGLFenceObject() : 0L;
        if (gLFenceObject == 0) {
            GLES20.glFlush();
        }
        textureInfoAcquireTextureFramebuffer.fenceObject = gLFenceObject;
        if (isGlFlushBuggyDevice()) {
            GLES20.glFinish();
        }
        ATrace.endSection();
        TextureBuffer textureBuffer = new TextureBuffer(this.eglContext, i2, i3, VideoFrame.TextureBuffer.Type.RGB, textureInfoAcquireTextureFramebuffer.textureId, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.6
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferPool.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC150006 runnableC150006 = RunnableC150006.this;
                        TextureBufferPool.this.releaseTextureFramebuffer(textureInfoAcquireTextureFramebuffer);
                        if (TextureBufferPool.this.isQuitting && !TextureBufferPool.this.anyTextureInUse()) {
                            Logging.m87211i(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no buffer in flight");
                            TextureBufferPool.this.release();
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (TextureBufferPool.this.poolBufferReleaseCallback != null) {
                            TextureBufferPool.this.poolBufferReleaseCallback.run();
                        }
                    }
                });
            }
        }, this, gLFenceObject, nextSeq.getAndIncrement(), HdrUtil.is10BitLumaDepth(i4));
        final TextureBuffer[] textureBufferArr = {textureBuffer};
        return textureBuffer;
    }

    private void drawTexture(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4) {
        GLES20.glClear(16384);
        int i5 = C150017.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i5 == 1) {
            this.drawer.drawOes(i, 0, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3, i4, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            if (i5 != 2) {
                ig3.m135964a("Unknown texture type.");
                return;
            }
            this.drawer.drawRgb(i, 0, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3, i4, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        }
        GlUtil.checkNoGLES2Error("TextureBufferPool.drawFrameBuffer");
    }

    public static long getGLFenceObject() {
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        if (jGlFenceSync != 0) {
            GLES20.glFlush();
        }
        return jGlFenceSync;
    }

    @CalledByNative
    public static boolean isGlFlushBuggyDevice() {
        Iterator<String> it = glFlushBuggyDevices.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(Build.MODEL)) {
                return true;
            }
        }
        return forceGlFinish;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        Logging.m87211i(TAG, this.name + " release()");
        if (!this.textureInfoList.isEmpty()) {
            int size = this.textureInfoList.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                TextureInfo textureInfo = this.textureInfoList.get(i);
                iArr[i] = textureInfo.textureId;
                iArr2[i] = textureInfo.frameBufferId;
                deleteFenceObject(textureInfo.fenceObject, this.name);
            }
            Logging.m87211i(TAG, this.name + ": delete textures " + Arrays.toString(iArr) + " framebuffers:" + Arrays.toString(iArr2));
            GLES20.glDeleteTextures(size, iArr, 0);
            GLES20.glDeleteFramebuffers(size, iArr2, 0);
            this.textureInfoList.clear();
        }
        this.yuvConverterInternal.release();
        this.drawer.release();
        if (this.ownGlThread) {
            EglBase eglBase = this.eglBase;
            if (eglBase != null) {
                eglBase.release();
            }
            this.handler.getLooper().quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseTextureFramebuffer(TextureInfo textureInfo) {
        textureInfo.inUse = false;
        if (this.shrinkPool) {
            int iIndexOf = this.textureInfoList.indexOf(textureInfo);
            if (iIndexOf < 0) {
                Logging.m87209e(TAG, (Thread.currentThread().getName() + " texture info not found!").concat(" texInfo.textureId: ") + textureInfo.textureId);
            } else if (iIndexOf >= this.keepBufferCnt) {
                GLES20.glDeleteTextures(1, new int[]{textureInfo.textureId}, 0);
                GLES20.glDeleteFramebuffers(1, new int[]{textureInfo.frameBufferId}, 0);
                this.textureInfoList.remove(iIndexOf);
            }
        }
        deleteFenceObject(textureInfo.fenceObject, this.name);
    }

    @CalledByNative
    public static void setForceGlFinish(boolean z) {
        Logging.m87211i(TAG, "setForceGlFinish " + z);
        forceGlFinish = z;
    }

    @CalledByNative
    public static void setUseGlFence(boolean z) {
        Logging.m87211i(TAG, "setUseGlFence " + z);
        useGlFence = z;
    }

    private boolean setupTextureFrameBuffer(TextureInfo textureInfo, int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            Logging.m87213w(TAG, "Invalid size: " + i + BaseSei.f13930X + i2);
            return false;
        }
        if (textureInfo.specified && textureInfo.width == i && textureInfo.height == i2) {
            return true;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, textureInfo.textureId);
        ATrace.beginSection("glTexImage2D");
        if (HdrUtil.is10BitLumaDepth(i3) && HdrUtil.isSupportedEGL3()) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 5131, null);
        } else {
            int i4 = this.glPixelFormat;
            GLES20.glTexImage2D(3553, 0, i4, i, i2, 0, i4, 5121, null);
        }
        ATrace.endSection();
        GlUtil.checkNoGLES2Error("TextureBufferPool.glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, textureInfo.frameBufferId);
        ATrace.beginSection("glFramebufferTexture2D");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureId, 0);
        ATrace.endSection();
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        GLES20.glBindFramebuffer(36160, 0);
        if (iGlCheckFramebufferStatus == 36053) {
            textureInfo.specified = true;
            textureInfo.width = i;
            textureInfo.height = i2;
            return true;
        }
        Logging.m87213w(TAG, "Framebuffer not complete, status: " + iGlCheckFramebufferStatus);
        return false;
    }

    public static boolean waitFenceSignal(long j, String str) {
        System.currentTimeMillis();
        if (j != 0 && GLES30.glIsSync(j)) {
            switch (GLES30.glClientWaitSync(j, 1, MAX_SYNC_OUT_TIME)) {
                case 37146:
                case 37148:
                    return true;
                case 37147:
                default:
                    return false;
                case 37149:
                    int iEglGetError = EGL14.eglGetError();
                    Logging.m87209e(TAG, "waitFenceSignal error:" + iEglGetError);
                    break;
            }
        }
        return false;
    }

    public static boolean waitFenceSignal2(long j, String str) {
        System.currentTimeMillis();
        if (j == 0) {
            return false;
        }
        synchronized (EglBase.lock) {
            try {
                if (GLES30.glIsSync(j)) {
                    GLES30.glWaitSync(j, 0, -1L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean anyTextureInUse() {
        Iterator<TextureInfo> it = this.textureInfoList.iterator();
        while (it.hasNext()) {
            if (it.next().inUse) {
                return true;
            }
        }
        return false;
    }

    @CalledByNative
    public void deleteGlFenceIfNeeded(final long j) {
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.TextureBufferPool.5
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    TextureBufferPool.deleteFenceObject(j, TextureBufferPool.this.name);
                    return null;
                }
            });
        } catch (Exception unused) {
        }
    }

    @CalledByNative
    public void dispose() {
        Logging.m87211i(TAG, this.name + " dispose()");
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.3
                @Override // java.lang.Runnable
                public void run() {
                    TextureBufferPool.this.isQuitting = true;
                    if (TextureBufferPool.this.anyTextureInUse()) {
                        return;
                    }
                    Logging.m87211i(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no more buffer in flight");
                    TextureBufferPool.this.release();
                }
            });
        } catch (Exception e) {
            Logging.m87211i(TAG, this.name + " dispose fail: " + e.getMessage());
        }
    }

    public void setPoolBufferReleaseCallback(Runnable runnable) {
        this.poolBufferReleaseCallback = runnable;
    }

    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer, int i, Runnable runnable) {
        if (textureBuffer != null) {
            return textureCopy(textureBuffer.getTextureId(), textureBuffer.getType(), textureBuffer.getWidth(), textureBuffer.getHeight(), textureBuffer.getTransformMatrix(), textureBuffer.getFenceObject(), i, runnable);
        }
        Logging.m87213w(TAG, "textureCopy: " + this.name + " textureBuffer null");
        return null;
    }

    @CalledByNative
    public void waitGlFenceIfNeeded(final long j) {
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.TextureBufferPool.4
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    TextureBufferPool.waitFenceSignal2(j, TextureBufferPool.this.name);
                    return null;
                }
            });
        } catch (Exception unused) {
        }
    }

    public static TextureBufferPool createWithinGlThread(String str, int i, int i2, Handler handler, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter) {
        return new TextureBufferPool(str, i, i2, handler, false, eglBase, context, yuvConverter);
    }

    @CalledByNative
    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer, Runnable runnable) {
        return textureCopy(textureBuffer, 0, runnable);
    }

    @Nullable
    public VideoFrame.TextureBuffer textureCopy(final int i, final VideoFrame.TextureBuffer.Type type, final int i2, final int i3, final Matrix matrix, final long j, final int i4, final Runnable runnable) {
        try {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.TextureBufferPool.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() throws Exception {
                    return TextureBufferPool.this.doTextureCopy(i, type, i2, i3, i4, matrix, j, runnable);
                }
            });
        } catch (Exception e) {
            Logging.m87213w(TAG, "textureCopy faile: " + e.getMessage());
            return null;
        }
    }

    private TextureBufferPool(String str, int i, int i2, Handler handler, boolean z, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter) {
        this(str, i, i2, handler, z, eglBase, context, yuvConverter, true);
    }
}
