package com.p069ss.bytertc.base.media;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i, int i2, int i3);

    void disableDoOrientation();

    void dispose();

    int enableFollowGravity(boolean z);

    float getCameraZoomMaxRatio();

    int getDeviceOrientation();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isCameraTorchSupported();

    boolean isCameraZoomSupported();

    boolean isScreencast();

    int setCameraZoomRatio(float f);

    void startCapture(int i, int i2, int i3);

    void startCapture(int i, int i2, int i3, int i4);

    void stopCapture() throws InterruptedException;

    void turnOffFlashLight();

    void turnOnFlashLight();
}
