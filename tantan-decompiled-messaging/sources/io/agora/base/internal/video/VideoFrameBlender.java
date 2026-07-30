package io.agora.base.internal.video;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ATrace;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class VideoFrameBlender {
    private static final boolean DEBUG = false;
    private static final int MAX_INVOKE_TIME_MS = 2000;
    private static final String TAG = "AndroidVideoFrameBlender";
    private final YuvConverter yuvConverter = new YuvConverter();
    private Handler mBlenderHandler = null;
    private EglBase mEglBase = null;
    private ArrayList<VideoSourceLayout> mVideoSourceLayouts = new ArrayList<>();
    private HashMap<String, VideoFrame> mVideoSources = new HashMap<>();
    private final Object mSourceLock = new Object();
    private final VideoFrameDrawer mFrameDrawer = new VideoFrameDrawer();
    private RendererCommon.GlDrawer mDrawer = new GlRectDrawer();
    private final Matrix drawMatrix = new Matrix();
    private String mCanvasId = "_agora_canvas_";
    private int mVideoBufferId = 0;
    private int mFramebuffer = 0;
    private int mCanvasWidth = 0;
    private int mCanvasHeight = 0;
    private boolean isBlenderRelased = false;

    @CalledByNative
    public VideoFrameBlender() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkIfNeedAlphaRender() {
        Iterator<VideoSourceLayout> it = this.mVideoSourceLayouts.iterator();
        while (it.hasNext()) {
            if (this.mVideoSources.get(it.next().getSourceId()).getAlphaBuffer() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean createAndBindTextureBuffer(final int i, final int i2) {
        return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<Boolean>() { // from class: io.agora.base.internal.video.VideoFrameBlender.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                Logging.m87208d(VideoFrameBlender.TAG, "into createAndBindTextureBuffer width:" + i + " ,height:" + i2);
                try {
                    VideoFrameBlender.this.mEglBase.makeCurrent();
                    VideoFrameBlender.this.releaseTextureBuffer();
                    VideoFrameBlender.this.mVideoBufferId = GlUtil.generateTexture(3553);
                    if (VideoFrameBlender.this.mVideoBufferId <= 0) {
                        Logging.m87209e(VideoFrameBlender.TAG, "generateTexture failed");
                        return Boolean.FALSE;
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, VideoFrameBlender.this.mVideoBufferId);
                    ATrace.beginSection("glTexImage2D");
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                    ATrace.endSection();
                    GlUtil.checkNoGLES2Error("TextureBufferPool.glTexImage2D");
                    GLES20.glBindTexture(3553, 0);
                    int[] iArr = new int[1];
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    GlUtil.checkNoGLES2Error("glGenFramebuffers");
                    VideoFrameBlender.this.mFramebuffer = iArr[0];
                    GLES20.glBindFramebuffer(36160, VideoFrameBlender.this.mFramebuffer);
                    GlUtil.checkNoGLES2Error("glBindFramebuffer " + VideoFrameBlender.this.mFramebuffer);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, VideoFrameBlender.this.mVideoBufferId, 0);
                    GlUtil.checkNoGLES2Error("glFramebufferTexture2D");
                    int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (iGlCheckFramebufferStatus != 36053) {
                        Logging.m87213w(VideoFrameBlender.TAG, "Framebuffer not complete, status: " + iGlCheckFramebufferStatus);
                        return Boolean.FALSE;
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    Logging.m87208d(VideoFrameBlender.TAG, "createAndBindTextureBuffer success width:" + i + " ,height:" + i2);
                    return Boolean.TRUE;
                } catch (RuntimeException unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue();
    }

    public static int createImageTexture(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        GlUtil.checkNoGLES2Error("glGenTextures");
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GlUtil.checkNoGLES2Error("loadImageTexture");
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, byteBuffer);
        GlUtil.checkNoGLES2Error("loadImageTexture");
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doBlenderSource(VideoSourceLayout videoSourceLayout, VideoFrame videoFrame, boolean z) {
        this.mDrawer.setTextureCropCoord(GlUtil.createFloatBuffer(EglRenderer.DoConvertRectFromAndroidGraphicsRect(new Rect(videoSourceLayout.getCroppedX(), videoSourceLayout.getCroppedY(), videoSourceLayout.getCroppedX() + videoSourceLayout.getCroppedWidth(), videoSourceLayout.getCroppedY() + videoSourceLayout.getCroppedHeight()), videoFrame, videoSourceLayout.isMirrorY())));
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        if (videoSourceLayout.isMirrorY()) {
            this.drawMatrix.preScale(-1.0f, 1.0f);
        }
        if (videoSourceLayout.getVideoSourceType() != VideoSourceLayout.VideoSourceType.STREAM) {
            this.drawMatrix.preScale(1.0f, -1.0f);
        }
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        int positionX = videoSourceLayout.getPositionX();
        int positionY = videoSourceLayout.getPositionY();
        if (!videoSourceLayout.getSourceId().equals(this.mCanvasId)) {
            positionX = videoSourceLayout.getPositionX();
            positionY = (this.mCanvasHeight - videoSourceLayout.getPositionY()) - videoSourceLayout.getDestHeight();
        }
        int i = positionX;
        int i2 = positionY;
        this.mFrameDrawer.disableNegativeAlphaData();
        this.mFrameDrawer.drawFrame(videoFrame, this.mDrawer, this.drawMatrix, i, i2, videoSourceLayout.getDestWidth(), videoSourceLayout.getDestHeight(), z && videoFrame.getAlphaBuffer() != null);
    }

    public static Bitmap getTexture2DImage(int i, int i2, int i3) {
        try {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr));
            int[] iArr2 = new int[1];
            GLES20.glGenFramebuffers(1, iArr2, 0);
            int i4 = iArr2[0];
            GLES20.glBindFramebuffer(36160, i4);
            int[] iArr3 = new int[1];
            GLES20.glGenRenderbuffers(1, iArr3, 0);
            int i5 = iArr3[0];
            GLES20.glBindRenderbuffer(36161, i5);
            GLES20.glRenderbufferStorage(36161, 33189, i2, i3);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, i5);
            if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                Logging.m87209e(TAG, "Framebuffer error");
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
            byteBufferAllocateDirect.position(0);
            GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocateDirect);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
            GLES20.glDeleteRenderbuffers(1, IntBuffer.wrap(iArr2));
            GLES20.glDeleteFramebuffers(1, IntBuffer.allocate(i4));
            GLES20.glBindFramebuffer(36160, iArr[0]);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            Logging.m87209e(TAG, e.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseTextureBuffer() {
        int[] iArr = new int[1];
        int i = this.mVideoBufferId;
        if (i > 0) {
            iArr[0] = i;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.mVideoBufferId = -1;
        }
        int i2 = this.mFramebuffer;
        if (i2 > 0) {
            iArr[0] = i2;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.mFramebuffer = -1;
        }
    }

    private void removeSourceLayoutIfNeed(String str) {
        for (int size = this.mVideoSourceLayouts.size() - 1; size >= 0; size--) {
            if (this.mVideoSourceLayouts.get(size).getSourceId().equals(str)) {
                this.mVideoSourceLayouts.remove(size);
            }
        }
    }

    private VideoFrame.TextureBuffer uploadImageSourceToTexture(final VideoFrame videoFrame) {
        try {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.VideoFrameBlender.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() throws Exception {
                    if (videoFrame.getBuffer() == null || !(videoFrame.getBuffer() instanceof VideoFrame.RgbaBuffer)) {
                        return null;
                    }
                    VideoFrameBlender.this.mEglBase.makeCurrent();
                    final int iCreateImageTexture = VideoFrameBlender.createImageTexture(((VideoFrame.RgbaBuffer) videoFrame.getBuffer()).getData(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), 6408);
                    GLES20.glFlush();
                    return new TextureBuffer(VideoFrameBlender.this.mEglBase.getEglBaseContext(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), VideoFrame.TextureBuffer.Type.RGB, iCreateImageTexture, RendererCommon.convertMatrixToAndroidGraphicsMatrix(GlUtil.IDENTITY_MATRIX), VideoFrameBlender.this.mBlenderHandler, VideoFrameBlender.this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            VideoFrameBlender.this.mBlenderHandler.post(new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.5.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    GLES20.glDeleteTextures(1, new int[]{iCreateImageTexture}, 0);
                                }
                            });
                        }
                    });
                }
            });
        } catch (Exception e) {
            Logging.m87209e(TAG, "uploadImageSourceToTexture faild for " + e.toString());
            return null;
        }
    }

    @CalledByNative
    public VideoFrame.Buffer blenderSourceList() {
        String str;
        if (this.isBlenderRelased) {
            str = "blenderSourceList failed for BlenderRelased";
        } else {
            if (this.mCanvasWidth != 0 && this.mCanvasHeight != 0) {
                try {
                    return (VideoFrame.Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<VideoFrame.Buffer>() { // from class: io.agora.base.internal.video.VideoFrameBlender.3
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public VideoFrame.Buffer call() throws Exception {
                            synchronized (VideoFrameBlender.this.mSourceLock) {
                                try {
                                    if (VideoFrameBlender.this.mVideoBufferId <= 0) {
                                        Logging.m87213w(VideoFrameBlender.TAG, "blenderSourceList failed for  mVideoBufferId is:" + VideoFrameBlender.this.mVideoBufferId);
                                        return null;
                                    }
                                    VideoFrameBlender.this.mEglBase.makeCurrent();
                                    GLES20.glBindFramebuffer(36160, VideoFrameBlender.this.mFramebuffer);
                                    GlUtil.checkNoGLES2Error("glBindFramebuffer mFramebuffer");
                                    boolean zCheckIfNeedAlphaRender = VideoFrameBlender.this.checkIfNeedAlphaRender();
                                    if (zCheckIfNeedAlphaRender) {
                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                        GLES20.glEnable(3042);
                                        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
                                    } else {
                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                    }
                                    GlUtil.checkNoGLES2Error("glClearColor");
                                    GLES20.glClear(16384);
                                    GlUtil.checkNoGLES2Error("glClear");
                                    for (VideoSourceLayout videoSourceLayout : VideoFrameBlender.this.mVideoSourceLayouts) {
                                        if (VideoFrameBlender.this.mVideoSources.get(videoSourceLayout.getSourceId()) != null) {
                                            VideoFrameBlender videoFrameBlender = VideoFrameBlender.this;
                                            videoFrameBlender.doBlenderSource(videoSourceLayout, (VideoFrame) videoFrameBlender.mVideoSources.get(videoSourceLayout.getSourceId()), zCheckIfNeedAlphaRender);
                                        }
                                    }
                                    if (zCheckIfNeedAlphaRender) {
                                        GLES20.glDisable(3042);
                                    }
                                    GLES20.glBindFramebuffer(36160, 0);
                                    GlUtil.checkNoGLES2Error("glBindFramebuffer 0");
                                    GLES20.glUseProgram(0);
                                    GlUtil.checkNoGLES2Error("glUseProgram");
                                    GLES20.glFlush();
                                    GlUtil.checkNoGLES2Error("glFlush");
                                    return new TextureBuffer(VideoFrameBlender.this.mEglBase.getEglBaseContext(), VideoFrameBlender.this.mCanvasWidth, VideoFrameBlender.this.mCanvasHeight, VideoFrame.TextureBuffer.Type.RGB, VideoFrameBlender.this.mVideoBufferId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(GlUtil.IDENTITY_MATRIX), VideoFrameBlender.this.mBlenderHandler, VideoFrameBlender.this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.3.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            VideoFrameBlender.this.mBlenderHandler.post(new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.3.1.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                }
                                            });
                                        }
                                    });
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            str = "blenderSourceList failed for mCanvasWidth:" + this.mCanvasWidth + ", mCanvasHeight:" + this.mCanvasHeight;
        }
        Logging.m87213w(TAG, str);
        return null;
    }

    @CalledByNative
    public boolean initBlender(String str, final EglBase.Context context) {
        HandlerThread handlerThread = new HandlerThread(str + "VideoFameBlender");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mBlenderHandler = handler;
        try {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, 2000L, new Callable<Boolean>() { // from class: io.agora.base.internal.video.VideoFrameBlender.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    EglBase.Context context2 = context;
                    if (context2 == null) {
                        Logging.m87209e(VideoFrameBlender.TAG, "initBlender failed for sharedContext is null");
                        return Boolean.FALSE;
                    }
                    VideoFrameBlender.this.mEglBase = EglBaseFactory.create(context2, EglBase.CONFIG_RGBA);
                    if (VideoFrameBlender.this.mEglBase == null) {
                        Logging.m87209e(VideoFrameBlender.TAG, "initBlender failed for mEglBase is null");
                        return Boolean.FALSE;
                    }
                    try {
                        VideoFrameBlender.this.mEglBase.createDummyPbufferSurface();
                        VideoFrameBlender.this.mEglBase.makeCurrent();
                        GLES20.glPixelStorei(3317, 1);
                        VideoFrameBlender.this.isBlenderRelased = false;
                        return Boolean.TRUE;
                    } catch (RuntimeException unused) {
                        VideoFrameBlender.this.mEglBase.release();
                        return Boolean.FALSE;
                    }
                }
            })).booleanValue();
        } catch (Exception unused) {
            Logging.m87209e(TAG, "initBlender faild for EglBaseFactory failed");
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    @CalledByNative
    public void releaseBlender() {
        if (this.mBlenderHandler == null) {
            return;
        }
        this.isBlenderRelased = true;
        releaseBlenderResource();
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<Void>() { // from class: io.agora.base.internal.video.VideoFrameBlender.6
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    Logging.m87208d(VideoFrameBlender.TAG, "release egl resources on render thread");
                    if (VideoFrameBlender.this.mEglBase != null) {
                        try {
                            VideoFrameBlender.this.mEglBase.makeCurrent();
                        } catch (RuntimeException unused) {
                            Logging.m87208d(VideoFrameBlender.TAG, "releaseBlender failed to make current");
                        }
                    }
                    VideoFrameBlender.this.yuvConverter.release();
                    Logging.m87208d(VideoFrameBlender.TAG, "release texture resources on render thread");
                    VideoFrameBlender.this.releaseTextureBuffer();
                    VideoFrameBlender.this.mDrawer.release();
                    VideoFrameBlender.this.mFrameDrawer.release();
                    synchronized (EglBase.lock) {
                        GLES20.glUseProgram(0);
                    }
                    if (VideoFrameBlender.this.mEglBase != null) {
                        Logging.m87208d(VideoFrameBlender.TAG, "releaseBlender detachCurrent");
                        VideoFrameBlender.this.mEglBase.detachCurrent();
                        VideoFrameBlender.this.mEglBase.release();
                        VideoFrameBlender.this.mEglBase = null;
                    }
                    return null;
                }
            });
        } catch (Exception e) {
            Logging.m87208d(TAG, "releaseBlender faild for " + e.toString());
        }
        this.mBlenderHandler.getLooper().quitSafely();
    }

    @CalledByNative
    public void releaseBlenderResource() {
        synchronized (this.mSourceLock) {
            try {
                this.mVideoSourceLayouts.clear();
                Iterator<Map.Entry<String, VideoFrame>> it = this.mVideoSources.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().release();
                }
                this.mVideoSources.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    public void updateSourceContent(String str, VideoFrame videoFrame) {
        if (this.isBlenderRelased) {
            Logging.m87213w(TAG, "updateSourceContent failed for BlenderRelased");
            return;
        }
        synchronized (this.mSourceLock) {
            try {
                if (this.mVideoSources.get(str) != null) {
                    this.mVideoSources.get(str).release();
                    this.mVideoSources.remove(str);
                }
                if (videoFrame.getBuffer() instanceof VideoFrame.RgbaBuffer) {
                    VideoFrame.TextureBuffer textureBufferUploadImageSourceToTexture = uploadImageSourceToTexture(videoFrame);
                    if (textureBufferUploadImageSourceToTexture != null) {
                        VideoFrame videoFrame2 = new VideoFrame(textureBufferUploadImageSourceToTexture, videoFrame.getRotation(), videoFrame.getTimestampNs());
                        if (videoFrame.getAlphaBuffer() != null) {
                            videoFrame2.fillAlphaData(videoFrame.getAlphaBuffer());
                        }
                        this.mVideoSources.put(str, videoFrame2);
                    }
                } else {
                    videoFrame.retain();
                    this.mVideoSources.put(str, videoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    public void updateVideoSourceLayout(VideoSourceLayout videoSourceLayout) {
        if (this.isBlenderRelased) {
            Logging.m87213w(TAG, "updateSourceLayout failed for BlenderRelased");
            return;
        }
        synchronized (this.mSourceLock) {
            try {
                removeSourceLayoutIfNeed(videoSourceLayout.getSourceId());
                if (videoSourceLayout.getSourceId().equals(this.mCanvasId)) {
                    this.mCanvasWidth = videoSourceLayout.getDestWidth();
                    int destHeight = videoSourceLayout.getDestHeight();
                    this.mCanvasHeight = destHeight;
                    createAndBindTextureBuffer(this.mCanvasWidth, destHeight);
                }
                this.mVideoSourceLayouts.add(videoSourceLayout);
                Collections.sort(this.mVideoSourceLayouts, new Comparator<VideoSourceLayout>() { // from class: io.agora.base.internal.video.VideoFrameBlender.4
                    @Override // java.util.Comparator
                    public int compare(VideoSourceLayout videoSourceLayout2, VideoSourceLayout videoSourceLayout3) {
                        return videoSourceLayout2.getZorder() - videoSourceLayout3.getZorder();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
