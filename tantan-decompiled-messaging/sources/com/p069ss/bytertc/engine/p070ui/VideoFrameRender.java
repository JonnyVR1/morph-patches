package com.p069ss.bytertc.engine.p070ui;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p069ss.bytertc.base.media.EglRenderer;
import com.p069ss.bytertc.engine.adapter.VideoFrameConverter;
import com.p069ss.bytertc.engine.data.VideoBufferType;
import com.p069ss.bytertc.engine.data.VideoPixelFormat;
import com.p069ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.p069ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.p069ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.p069ss.bytertc.engine.p070ui.VideoFrameRender;
import com.p069ss.bytertc.engine.utils.ByteBufferUtils;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.engine.video.IVideoFrame;
import com.p069ss.bytertc.engine.video.converter.WebRTCConverter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.qkq0;

/* JADX INFO: loaded from: classes13.dex */
public class VideoFrameRender implements View.OnLayoutChangeListener, RendererCommon.RendererEvents, EglRenderer.FirstVideoFrameRenderListener {
    private static final String TAG = "VideoFrameRender";
    private boolean enableFixedSize;
    private volatile EglRenderer mEglRenderer;
    private final String mRenderName;
    private volatile Surface mSurface;
    private volatile SurfaceView mSurfaceView;
    private Looper mTextureProcessLooper;
    private volatile TextureView mTextureView;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private long mReceiveFirstTimeStampMs = 0;
    private boolean mHasReceivedFirstFrame = false;
    private final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    private final AtomicBoolean mHasRenderViewAtomic = new AtomicBoolean(false);
    private final AtomicBoolean mEglSurfaceCreatedAtomic = new AtomicBoolean(false);
    private final Object mRenderLock = new Object();
    private final Object mTextureProcessLock = new Object();
    private final Object mFirstFrameListenerLock = new Object();
    private final ArrayList<FirstVideoFrameRenderListener> mFirstVideoFrameListeners = new ArrayList<>();
    private final VideoFrameConverter frameConverter = new VideoFrameConverter(true);
    private final SurfaceLifecycleCallback mSurfaceLifecycleCallbackCallback = new SurfaceLifecycleCallback() { // from class: com.ss.bytertc.engine.ui.VideoFrameRender.1
        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onCreated() {
            if (VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(false, true)) {
                return;
            }
            LogUtil.m80901e(VideoFrameRender.TAG, "Already has an another surface created.");
        }

        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onDestroy() {
            boolean z = VideoFrameRender.this.mHasInitAtomic.get();
            VideoFrameRender videoFrameRender = VideoFrameRender.this;
            if (!z) {
                videoFrameRender.mEglSurfaceCreatedAtomic.set(false);
            } else {
                if (videoFrameRender.mEglSurfaceCreatedAtomic.compareAndSet(true, false)) {
                    return;
                }
                LogUtil.m80901e(VideoFrameRender.TAG, "Already has an another surface destroyed.");
            }
        }
    };

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender(int i);
    }

    public interface SurfaceLifecycleCallback {
        void onCreated();

        void onDestroy();
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80894a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80895b() {
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length != 0) {
            int i3 = (i + 1) / 2;
            int i4 = i * i2;
            int i5 = ((i2 + 1) / 2) * i3;
            final ByteBuffer byteBufferNativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i4);
            final ByteBuffer byteBufferNativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i5);
            final ByteBuffer byteBufferNativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i5);
            if (byteBufferNativeAllocateBuffer != null && byteBufferNativeAllocateBuffer2 != null && byteBufferNativeAllocateBuffer3 != null) {
                byteBufferNativeAllocateBuffer.put(bArr, 0, i4);
                byteBufferNativeAllocateBuffer2.put(bArr, i4, i5);
                byteBufferNativeAllocateBuffer3.put(bArr, i4 + i5, i5);
                byteBufferNativeAllocateBuffer.position(0);
                byteBufferNativeAllocateBuffer2.position(0);
                byteBufferNativeAllocateBuffer3.position(0);
                return this.mEglRenderer instanceof TextureEglRenderer ? CountDownLatchI420Buffer.wrap(i, i2, byteBufferNativeAllocateBuffer, i, byteBufferNativeAllocateBuffer2, i3, byteBufferNativeAllocateBuffer3, i3, new Runnable() { // from class: l.l5l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameRender.m80897d(byteBufferNativeAllocateBuffer, byteBufferNativeAllocateBuffer2, byteBufferNativeAllocateBuffer3);
                    }
                }) : JavaI420Buffer.wrap(i, i2, byteBufferNativeAllocateBuffer, i, byteBufferNativeAllocateBuffer2, i3, byteBufferNativeAllocateBuffer3, i3, new Runnable() { // from class: l.m5l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameRender.m80894a(byteBufferNativeAllocateBuffer, byteBufferNativeAllocateBuffer2, byteBufferNativeAllocateBuffer3);
                    }
                });
            }
            if (byteBufferNativeAllocateBuffer != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer);
            }
            if (byteBufferNativeAllocateBuffer2 != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer2);
            }
            if (byteBufferNativeAllocateBuffer3 != null) {
                ByteBufferUtils.nativeReleaseBuffer(byteBufferNativeAllocateBuffer3);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80897d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m80898e(VideoFrameRender videoFrameRender, int i, int i2) {
        videoFrameRender.rotatedFrameWidth = i;
        videoFrameRender.rotatedFrameHeight = i2;
    }

    private void initSurfaceView() {
        if (this.mSurfaceView == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof SurfaceEglRender) {
                    ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
                    this.mSurfaceView.addOnLayoutChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initTextureView() {
        if (this.mTextureView == null || this.mEglRenderer == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof TextureEglRenderer) {
                    TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
                    textureEglRenderer.bind(this.mTextureView, this.mSurfaceLifecycleCallbackCallback);
                    if (this.mTextureView.isShown()) {
                        textureEglRenderer.setLayoutAspectRatio(this.mTextureView.getMeasuredWidth() / this.mTextureView.getMeasuredHeight());
                    }
                    this.mTextureView.addOnLayoutChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyFristRenderCallback() {
        synchronized (this.mFirstFrameListenerLock) {
            try {
                if (this.mFirstVideoFrameListeners.isEmpty()) {
                    return;
                }
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.mReceiveFirstTimeStampMs);
                Iterator<FirstVideoFrameRenderListener> it = this.mFirstVideoFrameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFirstVideoFrameRender(iCurrentTimeMillis);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglSurfaceCreatedAtomic.get() && this.mEglRenderer != null) {
                    if (!this.mHasReceivedFirstFrame) {
                        this.mReceiveFirstTimeStampMs = System.currentTimeMillis();
                        this.mHasReceivedFirstFrame = true;
                    }
                    this.mEglRenderer.onFrame(videoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void renderI420Frame(byte[] bArr, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        if (bArr == null || bArr.length <= 0 || (videoFrameConverter = this.frameConverter) == null) {
            return;
        }
        VideoFrame.I420Buffer i420BufferConvertToJavaI420Buffer = this.mEglRenderer instanceof TextureEglRenderer ? videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, true) : videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, false);
        if (i420BufferConvertToJavaI420Buffer != null) {
            VideoFrame videoFrame = new VideoFrame(i420BufferConvertToJavaI420Buffer, i3, j);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    private void renderTextureFrame(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4, long j, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i3, type, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), new Runnable() { // from class: l.n5l0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameRender.m80895b();
            }
        }), i4, j);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = this.mSurfaceView.getWidth() / this.mSurfaceView.getHeight();
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        if (i / i2 > width) {
            i = (int) (i2 * width);
        } else {
            i2 = (int) (i / width);
        }
        int iMin = Math.min(this.mSurfaceView.getWidth(), i);
        int iMin2 = Math.min(this.mSurfaceView.getHeight(), i2);
        LogUtil.m80900d(TAG, "updateSurfaceSize. Layout size: " + this.mSurfaceView.getWidth() + BaseSei.f13930X + this.mSurfaceView.getHeight() + ", frame size: " + this.rotatedFrameWidth + BaseSei.f13930X + this.rotatedFrameHeight + ", requested surface size: " + iMin + BaseSei.f13930X + iMin2 + ", old surface size: " + this.surfaceWidth + BaseSei.f13930X + this.surfaceHeight);
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        this.mSurfaceView.getHolder().setFixedSize(iMin, iMin2);
    }

    public void consumeByteArrayFrame(byte[] bArr, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (i != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(bArr, i2, i3, i4, j);
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, @Nullable ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (i != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(byteBuffer, i2, i3, i4, j);
    }

    public void consumeTextureFrame(int i, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (i2 != VideoPixelFormat.I420.value()) {
            return;
        }
        synchronized (this.mTextureProcessLock) {
            try {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(i, VideoFrame.TextureBuffer.Type.RGB, i3, i4, i5, j, fArr, this.mTextureProcessLooper);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void consumeVideoFrame(IVideoFrame iVideoFrame) {
        VideoFrame videoFrameConvertByteRGBAFrame2WebrtcI420Frame;
        if (iVideoFrame.bufferType() == VideoBufferType.GL_TEXTURE) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteTexFrame2WebrtcTexFrame(iVideoFrame, this.mTextureProcessLooper);
        } else if (iVideoFrame.pixelFormat() == VideoPixelFormat.I420) {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteI420Frame2WebrtcI420Frame(iVideoFrame);
        } else {
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame = iVideoFrame.pixelFormat() == VideoPixelFormat.RGBA ? WebRTCConverter.convertByteRGBAFrame2WebrtcI420Frame(iVideoFrame) : null;
        }
        if (videoFrameConvertByteRGBAFrame2WebrtcI420Frame != null) {
            onVideoFrame(videoFrameConvertByteRGBAFrame2WebrtcI420Frame);
            videoFrameConvertByteRGBAFrame2WebrtcI420Frame.release();
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, @Nullable ByteBuffer byteBuffer) {
        renderI420Frame(this.frameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i, i2, i3, i4, i5), i4, i5, i6, j);
    }

    public void disableFpsReduction() {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.disableFpsReduction();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void init(final EglBase.Context context) {
        if (!this.mHasInitAtomic.compareAndSet(false, true)) {
            qkq0.m175383a("Already initialized");
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mSurfaceView == null && this.mSurface == null && this.mTextureView == null && this.mEglRenderer == null) {
                    return;
                }
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                if (this.mEglRenderer instanceof SurfaceEglRender) {
                    ThreadUtils.invokeAtFrontUninterruptibly(new Handler(Looper.getMainLooper()), new Runnable() { // from class: l.k5l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f121211a.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
                        }
                    });
                } else {
                    this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onDispose() {
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            qkq0.m175383a("Try to dispose an not initialized VideoFrameRender");
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.release();
                    this.mEglRenderer.createEglSurface((Surface) null);
                }
                if (this.mSurfaceView != null) {
                    this.mSurfaceView.removeOnLayoutChangeListener(this);
                } else if (this.mTextureView != null) {
                    this.mTextureView.setSurfaceTextureListener(null);
                    this.mTextureView.removeOnLayoutChangeListener(this);
                }
                this.mEglSurfaceCreatedAtomic.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.mFirstFrameListenerLock) {
            this.mFirstVideoFrameListeners.clear();
        }
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    @Override // com.ss.bytertc.base.media.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
        notifyFristRenderCallback();
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int i, int i2, int i3) {
        final int i4 = (i3 == 0 || i3 == 180) ? i : i2;
        if (i3 == 0 || i3 == 180) {
            i = i2;
        }
        postOrRun(new Runnable() { // from class: l.j5l0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameRender.m80898e(this.f116329a, i4, i);
            }
        });
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
                }
                if (this.mSurfaceView != null) {
                    updateSurfaceSize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onStart() {
        if (this.mHasRenderViewAtomic.get() && this.mHasInitAtomic.get()) {
            if (this.mTextureView != null) {
                initTextureView();
            } else if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    public void release() {
        onDispose();
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    public void setFpsReduction(float f) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setFpsReduction(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setFristVideoFrameRenderListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.mFirstFrameListenerLock) {
            this.mFirstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public void setMirror(boolean z) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setMirror(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        synchronized (this.mTextureProcessLock) {
            this.mTextureProcessLooper = looper;
        }
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        if (this.mEglSurfaceCreatedAtomic.get() || surfaceView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        this.mSurfaceView = surfaceView;
        synchronized (this.mRenderLock) {
            SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
            surfaceEglRender.setSurfaceHolderCallback(callback);
            surfaceEglRender.setSurfaceLifecycleLisenter(this.mSurfaceLifecycleCallbackCallback);
            this.mEglRenderer = surfaceEglRender;
            this.mEglRenderer.addFristFrameListener(this);
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setRenderModel(scalingType);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer i420BufferConvertToJavaI420Buffer;
        if (byteBuffer == null || (videoFrameConverter = this.frameConverter) == null) {
            return;
        }
        if (this.mEglRenderer instanceof TextureEglRenderer) {
            i420BufferConvertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, true);
        } else {
            i420BufferConvertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, false);
        }
        if (i420BufferConvertToJavaI420Buffer != null) {
            VideoFrame videoFrame = new VideoFrame(i420BufferConvertToJavaI420Buffer, i3, j);
            onVideoFrame(videoFrame);
            videoFrame.release();
        }
    }

    public void setRenderView(Surface surface) {
        if (this.mEglSurfaceCreatedAtomic.get() || surface == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.mRenderLock) {
            this.mSurface = surface;
            new EglRenderer(this.mRenderName).createEglSurface(surface);
        }
        this.mEglSurfaceCreatedAtomic.compareAndSet(false, true);
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.mEglSurfaceCreatedAtomic.get() || textureView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.mRenderLock) {
            this.mTextureView = textureView;
            TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
            textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
            this.mEglRenderer = textureEglRenderer;
            this.mEglRenderer.addFristFrameListener(this);
        }
    }
}
