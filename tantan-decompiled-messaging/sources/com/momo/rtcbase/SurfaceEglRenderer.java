package com.momo.rtcbase;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.concurrent.CountDownLatch;
import p149l.t1h0;

/* JADX INFO: loaded from: classes8.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private static final String TAG = "SurfaceEglRenderer";
    private float cut_height_f;
    private float cut_width_f;
    private float cut_x_f;
    private float cut_y_f;
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    public SurfaceEglRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
        this.cut_x_f = 0.0f;
        this.cut_y_f = 0.0f;
        this.cut_width_f = 0.0f;
        this.cut_height_f = 0.0f;
    }

    private void logD(String str) {
        Logging.m20197d(TAG, this.name + ": " + str);
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            try {
                if (this.isRenderingPaused) {
                    return;
                }
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                    logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + BaseSei.f13930X + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                    this.frameRotation = videoFrame.getRotation();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.rtcbase.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // com.momo.rtcbase.EglRenderer, com.momo.rtcbase.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.cut_x_f == 0.0f && this.cut_y_f == 0.0f && this.cut_width_f == 0.0f && this.cut_height_f == 0.0f) {
            updateFrameDimensionsAndReportEvents(videoFrame);
            super.onFrame(videoFrame);
        } else {
            VideoFrame videoFrame2 = new VideoFrame(videoFrame.getBuffer().cropAndScale((int) (this.cut_x_f * videoFrame.getBuffer().getWidth()), (int) (this.cut_y_f * videoFrame.getBuffer().getHeight()), (int) (this.cut_width_f == 0.0f ? videoFrame.getBuffer().getWidth() : videoFrame.getBuffer().getWidth() * this.cut_width_f), (int) (this.cut_height_f == 0.0f ? videoFrame.getBuffer().getHeight() : videoFrame.getBuffer().getHeight() * this.cut_height_f), (int) (this.cut_width_f == 0.0f ? videoFrame.getBuffer().getWidth() : videoFrame.getBuffer().getWidth() * this.cut_width_f), (int) (this.cut_height_f == 0.0f ? videoFrame.getBuffer().getHeight() : videoFrame.getBuffer().getHeight() * this.cut_height_f)), 0, videoFrame.getTimestampNs());
            updateFrameDimensionsAndReportEvents(videoFrame2);
            super.onFrame(videoFrame2);
            videoFrame2.release();
        }
    }

    @Override // com.momo.rtcbase.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    public void setCutPosition(float f, float f2, float f3, float f4) {
        this.cut_x_f = f;
        this.cut_y_f = f2;
        this.cut_width_f = f3;
        this.cut_height_f = f4;
    }

    @Override // com.momo.rtcbase.EglRenderer
    public void setFpsReduction(float f) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = f == 0.0f;
        }
        super.setFpsReduction(f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i + " size: " + i2 + BaseSei.f13930X + i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new t1h0(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public void surfaceTextureCreated(SurfaceTexture surfaceTexture) {
        createEglSurface(surfaceTexture);
    }

    public void surfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new t1h0(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // com.momo.rtcbase.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
