package com.p006ss.bytertc.base.media.camera;

import android.content.Context;
import androidx.annotation.Nullable;
import com.p006ss.bytertc.base.media.CapturerObserver;
import com.p006ss.bytertc.base.media.SurfaceTextureHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;
    private final boolean isDesktopMode;
    protected boolean mEnableFaceAE;

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z, boolean z2) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z, z2));
        this.captureToTexture = z;
        this.isDesktopMode = z2;
        this.mEnableFaceAE = false;
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i, int i2, int i3) {
        super.changeCaptureFormat(i, i2, i3);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, this.isDesktopMode, context, surfaceTextureHelper, Camera1Enumerator.getCameraIndex(str), i, i2, i3, this.mEnableFaceAE, this.mEnableFollowGravity);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void disableDoOrientation() {
        super.disableDoOrientation();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    public void enableFaceAE(boolean z) {
        this.mEnableFaceAE = z;
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int enableFollowGravity(boolean z) {
        return super.enableFollowGravity(z);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ float getCameraZoomMaxRatio() {
        return super.getCameraZoomMaxRatio();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int getDeviceOrientation() {
        return super.getDeviceOrientation();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(@Nullable SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraTorchSupported() {
        return super.isCameraTorchSupported();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraZoomSupported() {
        return super.isCameraZoomSupported();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int setCameraZoomRatio(float f) {
        return super.setCameraZoomRatio(f);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        super.setOrientationMode(orientation_mode);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3) {
        super.startCapture(i, i2, i3);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOffFlashLight() {
        super.turnOffFlashLight();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOnFlashLight() {
        super.turnOnFlashLight();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraCapturer, com.p006ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3, int i4) {
        super.startCapture(i, i2, i3, i4);
    }
}
