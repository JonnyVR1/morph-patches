package com.momo.rtcbase;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import l.qhg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator(boolean z) {
        this.captureToTexture = z;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i) {
        int i2;
        Logging.m468d(TAG, "Get supported formats for camera index " + i + "");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Camera cameraOpen = null;
        try {
            try {
                Logging.m468d(TAG, "Opening camera with index " + i);
                cameraOpen = Camera.open(i);
                Camera.Parameters parameters = cameraOpen.getParameters();
                cameraOpen.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i3 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i3 = iArr[0];
                        i2 = iArr[1];
                    } else {
                        i2 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i3, i2));
                    }
                } catch (Exception e) {
                    Logging.m470e(TAG, "getSupportedFormats() failed on camera index " + i, e);
                }
                Logging.m468d(TAG, "Get supported formats for camera index " + i + " done. Time spent: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException e2) {
                Logging.m470e(TAG, "Open camera failed on camera index " + i, e2);
                ArrayList arrayList2 = new ArrayList();
                if (cameraOpen != null) {
                    cameraOpen.release();
                }
                return arrayList2;
            }
        } catch (Throwable th) {
            if (cameraOpen != null) {
                cameraOpen.release();
            }
            throw th;
        }
    }

    public static int getCameraIndex(String str) {
        Logging.m468d(TAG, "getCameraIndex: " + str);
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        qhg0.a("No such camera: ", str);
        return 0;
    }

    private static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            Logging.m470e(TAG, "getCameraInfo failed on index " + i, e);
            return null;
        }
    }

    public static String getDeviceName(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        return "Camera " + i + ", Facing " + (cameraInfo.facing == 1 ? "front" : "back") + ", Orientation " + cameraInfo.orientation;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i) {
        try {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                    cachedSupportedFormats.add(enumerateFormats(i2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return cachedSupportedFormats.get(i);
    }

    @Override // com.momo.rtcbase.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    @Override // com.momo.rtcbase.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.m468d(TAG, "Index: " + i + " " + deviceName);
            } else {
                Logging.m469e(TAG, "Index: " + i + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.momo.rtcbase.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // com.momo.rtcbase.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator() {
        this(true);
    }

    @Override // com.momo.rtcbase.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }
}
