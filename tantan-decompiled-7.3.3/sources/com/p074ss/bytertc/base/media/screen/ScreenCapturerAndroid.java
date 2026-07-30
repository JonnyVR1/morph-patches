package com.p074ss.bytertc.base.media.screen;

import android.annotation.TargetApi;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoFrame;
import com.p074ss.bytertc.base.media.CapturerObserver;
import com.p074ss.bytertc.base.media.SurfaceTextureHelper;
import com.p074ss.bytertc.base.media.VideoCapturer;
import com.p074ss.bytertc.base.media.VideoSink;
import com.p074ss.bytertc.base.media.camera.CameraSession;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private static final String TAG = "ScreenCaptureAndroid";
    private CapturerObserver capturerObserver;
    private Context mContext;
    private CountDownLatch mCountDownLatch;
    private boolean needStartService;

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback, boolean z) {
        this.mCountDownLatch = new CountDownLatch(1);
        this.needStartService = true;
        this.capturerObserver = null;
        ScreenCaptureAndroidManager.INSTANCE().addLock(this.mCountDownLatch.hashCode(), this.mCountDownLatch);
        ScreenCaptureAndroidManager.INSTANCE().setData(intent, callback);
        this.needStartService = z;
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        try {
            if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
                ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i, i2, i3);
            } else {
                Intent intent = new Intent();
                intent.putExtra("w", i);
                intent.putExtra("h", i2);
                intent.putExtra(RXScreenCaptureService.KEY_IFRAMERATE, i3);
                try {
                    if (RXScreenCaptureService.serviceStarted.get()) {
                        Context context = this.mContext;
                        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 3, intent));
                    }
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    CapturerObserver capturerObserver = this.capturerObserver;
                    if (capturerObserver != null) {
                        capturerObserver.onCapturerError("Start foreground service failed.");
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public void disableDoOrientation() {
        ScreenCaptureAndroidManager.INSTANCE().disableDoOrientation();
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public synchronized void dispose() {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().dispose();
        } else {
            Intent intent = new Intent();
            intent.putExtra(RXScreenCaptureService.KEY_HASHCODE, this.mCountDownLatch.hashCode());
            try {
                if (RXScreenCaptureService.serviceStarted.get()) {
                    Context context = this.mContext;
                    context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 5, intent));
                }
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
            try {
                this.mCountDownLatch.await(1500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public int enableFollowGravity(boolean z) {
        return -1;
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public int getDeviceOrientation() {
        return CameraSession.getDeviceUIOrientation(ContextUtils.getApplicationContext());
    }

    public MediaProjection getMediaProjection() {
        return ScreenCaptureAndroidManager.INSTANCE().getMediaProjection();
    }

    public synchronized void initialize(EglBase.Context context, Context context2, CapturerObserver capturerObserver) {
        this.mContext = context2;
        this.capturerObserver = capturerObserver;
        ScreenCaptureAndroidManager.INSTANCE().initialize(context, context2, capturerObserver);
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // com.p074ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().onFrame(videoFrame);
            return;
        }
        int iAddFrame = ScreenCaptureAndroidManager.INSTANCE().addFrame(videoFrame);
        Intent intent = new Intent();
        intent.putExtra(RXScreenCaptureService.KEY_INDEX, iAddFrame);
        try {
            if (RXScreenCaptureService.serviceStarted.get()) {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 4, intent));
            }
        } catch (ForegroundServiceStartNotAllowedException unused) {
            CapturerObserver capturerObserver = this.capturerObserver;
            if (capturerObserver != null) {
                capturerObserver.onCapturerError("Start foreground service failed.");
            }
        }
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public int setCameraZoomRatio(float f) {
        return 0;
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().startCapture(i, i2, i3, i4);
        } else {
            Intent intent = new Intent();
            intent.putExtra("w", i);
            intent.putExtra("h", i2);
            intent.putExtra(RXScreenCaptureService.KEY_IFRAMERATE, i3);
            if (i4 <= 0) {
                i4 = 4;
            }
            intent.putExtra(RXScreenCaptureService.KEY_MIN_FRAMERATE, i4);
            int i5 = 3;
            while (!RXScreenCaptureService.serviceStarted.get()) {
                try {
                    int i6 = i5 - 1;
                    if (i5 <= 0) {
                        i5 = i6;
                        break;
                    }
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e) {
                        RXLogging.m5746w(TAG, "[ScreenCapture] sleep exception");
                        e.printStackTrace();
                    }
                    i5 = i6;
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    CapturerObserver capturerObserver = this.capturerObserver;
                    if (capturerObserver != null) {
                        capturerObserver.onCapturerError("Start foreground service failed.");
                    }
                }
            }
            if (i5 > 0) {
                RXLogging.m5746w(TAG, String.format("[ScreenCapture]  call RXScreenCaptureService.COMMAND_START success, wait times:%d ms", Integer.valueOf((3 - i5) * 50)));
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 1, intent));
            } else {
                RXLogging.m5746w(TAG, String.format("[ScreenCapture] wait start service timeout", new Object[0]));
            }
        }
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public synchronized void stopCapture() {
        try {
            if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
                ScreenCaptureAndroidManager.INSTANCE().stopCapture();
            } else {
                try {
                    if (RXScreenCaptureService.serviceStarted.get()) {
                        Context context = this.mContext;
                        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 2, null));
                    }
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    CapturerObserver capturerObserver = this.capturerObserver;
                    if (capturerObserver != null) {
                        capturerObserver.onCapturerError("Start foreground service failed.");
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public void turnOffFlashLight() {
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public void turnOnFlashLight() {
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.mContext = context;
        this.capturerObserver = capturerObserver;
        ScreenCaptureAndroidManager.INSTANCE().initialize(surfaceTextureHelper, context, capturerObserver);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this(intent, callback, true);
    }

    @Override // com.p074ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        startCapture(i, i2, i3, 4);
    }
}
