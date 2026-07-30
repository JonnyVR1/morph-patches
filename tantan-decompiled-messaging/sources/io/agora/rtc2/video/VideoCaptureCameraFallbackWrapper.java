package io.agora.rtc2.video;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.agora.base.internal.Logging;

/* JADX INFO: loaded from: classes2.dex */
public class VideoCaptureCameraFallbackWrapper implements IVideoCaptureCamera {
    private static final String TAG = "VideoCaptureCameraFallbackWrapper";

    @NonNull
    private IVideoCaptureCamera captuer;

    @VisibleForTesting
    private IVideoCapture.Events events;

    @NonNull
    private OnCameraFallbackListener fallbackListener;
    private VideoCaptureFormat format;

    public interface OnCameraFallbackListener {
        IVideoCaptureCamera createFallbackCamera();
    }

    public VideoCaptureCameraFallbackWrapper(@NonNull IVideoCaptureCamera iVideoCaptureCamera, @NonNull OnCameraFallbackListener onCameraFallbackListener) {
        this.captuer = iVideoCaptureCamera;
        this.fallbackListener = onCameraFallbackListener;
    }

    private boolean createFallbackCamera() {
        if (!this.captuer.needFallback()) {
            return false;
        }
        Logging.m87213w(TAG, "capture fallback to low level camera. ");
        IVideoCaptureCamera iVideoCaptureCameraCreateFallbackCamera = this.fallbackListener.createFallbackCamera();
        this.captuer = iVideoCaptureCameraCreateFallbackCamera;
        iVideoCaptureCameraCreateFallbackCamera.setEventsCallback(this.events);
        return true;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        this.format = videoCaptureFormat;
        if (this.captuer.allocate(videoCaptureFormat)) {
            return true;
        }
        this.captuer.stopCaptureAndBlockUntilStopped();
        this.captuer.deallocate();
        this.captuer.dispose();
        if (createFallbackCamera()) {
            return this.captuer.allocate(videoCaptureFormat);
        }
        return true;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        this.captuer.deallocate();
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void dispose() {
        this.captuer.dispose();
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public VideoCaptureFormat getCaptureFormat() {
        return this.captuer.getCaptureFormat();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public float getMaxZoom() {
        return this.captuer.getMaxZoom();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isAutoFaceFocusSupported() {
        return this.captuer.isAutoFaceFocusSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isCameraExposureSupported() {
        return this.captuer.isExposureSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isExposureSupported() {
        return this.captuer.isExposureSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFaceDetectSupported() {
        return this.captuer.isFaceDetectSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFocusSupported() {
        return this.captuer.isFocusSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isTorchSupported() {
        return this.captuer.isTorchSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isZoomSupported() {
        return this.captuer.isZoomSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean needFallback() {
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAntiBandingMode(int i) {
        return this.captuer.setAntiBandingMode(i);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAutoFaceFocus(boolean z) {
        return this.captuer.setAutoFaceFocus(z);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setEdgeEnhanceMode(int i) {
        return this.captuer.setEdgeEnhanceMode(i);
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    @VisibleForTesting
    public void setEventsCallback(IVideoCapture.Events events) {
        this.events = events;
        this.captuer.setEventsCallback(events);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposure(float f, float f2) {
        return this.captuer.setExposure(f, f2);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposureCompensation(int i) {
        return this.captuer.setExposureCompensation(i);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFaceDetection(boolean z) {
        return this.captuer.setFaceDetection(z);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFocus(float f, float f2) {
        return this.captuer.setFocus(f, f2);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setNoiseReductionMode(int i) {
        return this.captuer.setNoiseReductionMode(i);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public void setPreviewInfo(Object obj, boolean z, int i) {
        this.captuer.setPreviewInfo(obj, z, i);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setTorchMode(boolean z) {
        return this.captuer.setTorchMode(z);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoEdgeMode(int i) {
        return this.captuer.setVideoEdgeMode(i);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoStabilityMode(int i) {
        return this.captuer.setVideoStabilityMode(i);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setZoom(float f) {
        return this.captuer.setZoom(f);
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        if (!this.captuer.startCaptureMaybeAsync()) {
            this.captuer.stopCaptureAndBlockUntilStopped();
            this.captuer.deallocate();
            this.captuer.dispose();
            if (createFallbackCamera()) {
                return this.captuer.allocate(this.format) && this.captuer.startCaptureMaybeAsync();
            }
        }
        return true;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        this.captuer.stopCaptureAndBlockUntilStopped();
    }
}
