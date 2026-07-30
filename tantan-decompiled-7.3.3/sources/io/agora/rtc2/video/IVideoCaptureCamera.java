package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IVideoCaptureCamera extends IVideoCapture {
    @CalledByNative
    float getMaxZoom();

    @CalledByNative
    boolean isAutoFaceFocusSupported();

    @CalledByNative
    boolean isCameraExposureSupported();

    @CalledByNative
    boolean isExposureSupported();

    @CalledByNative
    boolean isFaceDetectSupported();

    @CalledByNative
    boolean isFocusSupported();

    @CalledByNative
    boolean isTorchSupported();

    @CalledByNative
    boolean isZoomSupported();

    boolean needFallback();

    @CalledByNative
    int setAntiBandingMode(int i);

    @CalledByNative
    int setAutoFaceFocus(boolean z);

    @CalledByNative
    int setEdgeEnhanceMode(int i);

    @CalledByNative
    int setExposure(float f, float f2);

    @CalledByNative
    int setExposureCompensation(int i);

    @CalledByNative
    int setFaceDetection(boolean z);

    @CalledByNative
    int setFocus(float f, float f2);

    @CalledByNative
    int setNoiseReductionMode(int i);

    @CalledByNative
    void setPreviewInfo(Object obj, boolean z, int i);

    @CalledByNative
    int setTorchMode(boolean z);

    @CalledByNative
    int setVideoEdgeMode(int i);

    @CalledByNative
    int setVideoStabilityMode(int i);

    @CalledByNative
    int setZoom(float f);
}
