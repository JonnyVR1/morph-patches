package com.p006ss.bytertc.base.media.camera;

import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    int getDeviceOrientation(String str);

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
