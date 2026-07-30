package com.p074ss.bytertc.base.media.screen;

import android.content.Context;
import android.os.Build;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import p153l.j26;

/* JADX INFO: loaded from: classes11.dex */
public class ScreenAudioCaptureAndroid implements ScreenAudioCaptureObserver {
    private static final String TAG = "ScreenAudioCaptureAndroid";
    private Context mContext;
    private boolean mIsAudioCaptureWorking = false;
    private long mNativeCaptureObserver;

    @CalledByNative
    public ScreenAudioCaptureAndroid(long j) {
        this.mNativeCaptureObserver = j;
    }

    @Override // com.p074ss.bytertc.base.media.screen.ScreenAudioCaptureObserver
    public void onAudioFrameCapture(byte[] bArr, int i, int i2, int i3) {
        RTCScreenAudioNativeFunctions.nativeOnAuidoFrameCaptured(this.mNativeCaptureObserver, bArr, i, i2, i3);
    }

    @Override // com.p074ss.bytertc.base.media.screen.ScreenAudioCaptureObserver
    public void onCapturerStarted() {
        RTCScreenAudioNativeFunctions.nativeOnCapturerStarted(this.mNativeCaptureObserver);
    }

    @Override // com.p074ss.bytertc.base.media.screen.ScreenAudioCaptureObserver
    public void onCapturerStopped() {
        RTCScreenAudioNativeFunctions.nativeOnCapturerStopped(this.mNativeCaptureObserver);
    }

    @CalledByNative
    public void release() {
        stopCapture();
        try {
            if (this.mContext == null || Build.VERSION.SDK_INT <= 28 || !RXScreenCaptureService.serviceStarted.get()) {
                return;
            }
            Context context = this.mContext;
            context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 8, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CalledByNative
    public void startCapture() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            this.mContext = applicationContext;
            if (Build.VERSION.SDK_INT > 28 && j26.m143188a(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
                ScreenAudioCaptureAndroidManager.INSTANCE().initialize(this.mContext, this);
                if (RXScreenCaptureService.serviceStarted.get()) {
                    Context context = this.mContext;
                    context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 6, null));
                }
                this.mIsAudioCaptureWorking = true;
                return;
            }
            RTCScreenAudioNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CalledByNative
    public void stopCapture() {
        if (this.mIsAudioCaptureWorking) {
            try {
                if (Build.VERSION.SDK_INT > 28 && RXScreenCaptureService.serviceStarted.get()) {
                    Context context = this.mContext;
                    context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 7, null));
                }
                this.mIsAudioCaptureWorking = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
