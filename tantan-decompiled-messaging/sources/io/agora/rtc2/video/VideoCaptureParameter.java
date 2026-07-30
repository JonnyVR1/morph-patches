package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
class VideoCaptureParameter {
    final boolean autoWhiteBalance;
    final int camera1FocusMode;
    final boolean camera1FpsRange;
    final int camera2FocusMode;
    final boolean enableRefocus;
    final boolean extraSurface;
    final boolean faceFocusing;
    final int focalLengthType;
    final int hardwareLevelSelected;
    final int lowCameraSelected;
    final int noiseReduce;
    final int physicalId;
    final int templateType;

    @CalledByNative
    public VideoCaptureParameter(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, boolean z4, int i7, int i8, boolean z5) {
        this.lowCameraSelected = i;
        this.hardwareLevelSelected = i2;
        this.templateType = i3;
        this.noiseReduce = i4;
        this.faceFocusing = z;
        this.extraSurface = z2;
        this.camera1FocusMode = i5;
        this.camera2FocusMode = i6;
        this.autoWhiteBalance = z3;
        this.camera1FpsRange = z4;
        this.focalLengthType = i7;
        this.physicalId = i8;
        this.enableRefocus = z5;
    }
}
