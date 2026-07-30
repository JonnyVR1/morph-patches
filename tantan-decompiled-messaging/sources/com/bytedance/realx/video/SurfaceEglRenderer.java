package com.bytedance.realx.video;

import android.view.SurfaceHolder;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.concurrent.CountDownLatch;
import p149l.t1h0;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private static final String TAG = "SurfaceEglRenderer";
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
    }

    private void logD(String str) {
        RXLogging.m5690i(TAG, this.name + ": " + str);
    }

    private void updateFrameDimensionsAndReportEvents(RXVideoFrameInterface rXVideoFrameInterface) {
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
                if (this.rotatedFrameWidth != rXVideoFrameInterface.getRotatedWidth() || this.rotatedFrameHeight != rXVideoFrameInterface.getRotatedHeight() || this.frameRotation != rXVideoFrameInterface.getRotation().value()) {
                    logD("Reporting frame resolution changed to " + rXVideoFrameInterface.getRotatedWidth() + BaseSei.f13930X + rXVideoFrameInterface.getHeight() + " with rotation " + rXVideoFrameInterface.getRotation());
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(rXVideoFrameInterface.getWidth(), rXVideoFrameInterface.getHeight(), rXVideoFrameInterface.getRotation().value());
                    }
                    this.rotatedFrameWidth = rXVideoFrameInterface.getRotatedWidth();
                    this.rotatedFrameHeight = rXVideoFrameInterface.getRotatedHeight();
                    this.frameRotation = rXVideoFrameInterface.getRotation().value();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            this.rendererEvents = rendererEvents;
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // com.bytedance.realx.video.EglRenderer, com.bytedance.realx.video.VideoSink
    public void onFrame(RXVideoFrameInterface rXVideoFrameInterface) {
        updateFrameDimensionsAndReportEvents(rXVideoFrameInterface);
        super.onFrame(rXVideoFrameInterface);
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void release() {
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new t1h0(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // com.bytedance.realx.video.EglRenderer
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

    @Override // com.bytedance.realx.video.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
