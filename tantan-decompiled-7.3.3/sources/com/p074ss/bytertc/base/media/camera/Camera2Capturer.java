package com.p074ss.bytertc.base.media.camera;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.annotation.Nullable;
import com.p074ss.bytertc.base.media.CapturerObserver;
import com.p074ss.bytertc.base.media.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class Camera2Capturer extends CameraCapturer {

    @Nullable
    private final CameraManager cameraManager;
    private final Context context;

    public Camera2Capturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context));
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i, int i2, int i3) {
        super.changeCaptureFormat(i, i2, i3);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void disableDoOrientation() {
        super.disableDoOrientation();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int enableFollowGravity(boolean z) {
        return super.enableFollowGravity(z);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ float getCameraZoomMaxRatio() {
        return super.getCameraZoomMaxRatio();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int getDeviceOrientation() {
        return super.getDeviceOrientation();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(@Nullable SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraTorchSupported() {
        return super.isCameraTorchSupported();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraZoomSupported() {
        return super.isCameraZoomSupported();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int setCameraZoomRatio(float f) {
        return super.setCameraZoomRatio(f);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        super.setOrientationMode(orientation_mode);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3) {
        super.startCapture(i, i2, i3);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOffFlashLight() {
        super.turnOffFlashLight();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOnFlashLight() {
        super.turnOnFlashLight();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraCapturer, com.p074ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3, int i4) {
        super.startCapture(i, i2, i3, i4);
    }
}
