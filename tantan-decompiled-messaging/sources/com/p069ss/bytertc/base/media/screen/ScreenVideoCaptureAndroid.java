package com.p069ss.bytertc.base.media.screen;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoFrame;
import com.p069ss.bytertc.base.media.CapturerObserver;
import com.p069ss.bytertc.base.media.VideoCapturer;
import com.p069ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ScreenVideoCaptureAndroid {
    private static final int ScreenCaptureModelMediaProjection = 0;
    private static final int ScreenCaptureModelMediaProjectionWithForegroundService = 1;
    private static final String TAG = "ScreenVideoCaptureAndroid";
    private long mNativeCaptureObserver;
    private EglBase.Context sharedEglGroup;
    private VideoCapturer mVideoCapturer = null;
    private boolean mIsVideoCaptureInited = false;
    private boolean mIsVideoCaptureWorking = false;
    private EglBase cameraEglBase = null;
    private Intent mCaptureScreenIntent = null;
    private CapturerObserver localCapturerObserver = new CapturerObserver() { // from class: com.ss.bytertc.base.media.screen.ScreenVideoCaptureAndroid.1
        @Override // com.p069ss.bytertc.base.media.CapturerObserver
        public void onCapturerError(String str) {
            RTCScreenVideoNativeFunctions.nativeOnCapturerError(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver, 0, str);
        }

        @Override // com.p069ss.bytertc.base.media.CapturerObserver
        public void onCapturerFormatSelected(int i, int i2, int i3, int i4, int i5) {
        }

        @Override // com.p069ss.bytertc.base.media.CapturerObserver
        public void onCapturerStarted(boolean z) {
            ScreenVideoCaptureAndroid screenVideoCaptureAndroid = ScreenVideoCaptureAndroid.this;
            if (z) {
                RTCScreenVideoNativeFunctions.nativeOnCapturerStarted(screenVideoCaptureAndroid.mNativeCaptureObserver);
            } else {
                RTCScreenVideoNativeFunctions.nativeOnCapturerError(screenVideoCaptureAndroid.mNativeCaptureObserver, 0, "start error");
            }
        }

        @Override // com.p069ss.bytertc.base.media.CapturerObserver
        public void onCapturerStopped() {
            RTCScreenVideoNativeFunctions.nativeOnCapturerStopped(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver);
        }

        @Override // com.p069ss.bytertc.base.media.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            RTCScreenVideoNativeFunctions.nativeOnFrameCaptured(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
        }
    };

    @CalledByNative
    public ScreenVideoCaptureAndroid(long j, EglBase.Context context) {
        this.sharedEglGroup = null;
        this.mNativeCaptureObserver = j;
        this.sharedEglGroup = context;
    }

    private VideoCapturer createVideoCapturer(Intent intent) {
        try {
            return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() { // from class: com.ss.bytertc.base.media.screen.ScreenVideoCaptureAndroid.2
                @Override // android.media.projection.MediaProjection.Callback
                public void onStop() {
                    LogUtil.m80901e(ScreenVideoCaptureAndroid.TAG, "User revoked permission to capture the screen.");
                    if (ScreenVideoCaptureAndroid.this.mVideoCapturer == null || !ScreenVideoCaptureAndroid.this.mIsVideoCaptureInited || !ScreenVideoCaptureAndroid.this.mIsVideoCaptureWorking || ScreenVideoCaptureAndroid.this.localCapturerObserver == null) {
                        return;
                    }
                    ScreenVideoCaptureAndroid.this.localCapturerObserver.onCapturerError("media projection unexpected exit when capture screen video");
                }
            });
        } catch (IllegalArgumentException e) {
            LogUtil.m80901e(TAG, "Create VideoCapture fail : " + e.getMessage());
            return null;
        }
    }

    private void startVideoCapture(int i, int i2, int i3) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                LogUtil.m80901e(TAG, "VideoCapture startCapture fail : " + e.getMessage());
            }
        }
    }

    @CalledByNative
    public void changeCaptureFormat(int i, int i2, int i3) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            videoCapturer.changeCaptureFormat(i, i2, i3);
        }
    }

    @CalledByNative
    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        EglBase eglBase = this.cameraEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.cameraEglBase = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    @CalledByNative
    public void startCapture(int i, int i2, int i3, Intent intent) {
        if (intent == null) {
            LogUtil.m80901e(TAG, "startCapture failed, intent is null");
            return;
        }
        this.mCaptureScreenIntent = intent;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        RTCScreenVideoNativeFunctions.nativeOnCapturerSetType(this.mNativeCaptureObserver, Build.VERSION.SDK_INT > 28 ? 1 : 0);
        this.mVideoCapturer = createVideoCapturer(this.mCaptureScreenIntent);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = EglBase.create(this.sharedEglGroup);
        }
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 == null) {
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        } else {
            ((ScreenCapturerAndroid) videoCapturer2).initialize(this.cameraEglBase.getEglBaseContext(), ContextUtils.getApplicationContext(), this.localCapturerObserver);
            this.mIsVideoCaptureInited = true;
            startVideoCapture(i, i2, i3);
        }
    }

    @CalledByNative
    public void stopCapture() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                videoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
