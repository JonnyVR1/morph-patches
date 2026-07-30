package io.agora.rtc2.video;

import android.content.Intent;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class VideoCaptureFactory {
    private static final String TAG = "VideoCaptureFactory";
    private static boolean enableCamera2BlackList = true;
    private static final List<String> TEXTURE_EXCEPTION_MODELS = Arrays.asList("LG-H848", "Pixel 4a", "SM-A7000", "MI MAX");
    private static final List<String> TEMPLATETYPE_EXCEPTION_MODELS = Arrays.asList("PRA-AL00X");

    public @interface CAMERA_MODULE_SELECTED {
        public static final int ANDROID_CAMERA1 = 0;
        public static final int ANDROID_CAMERA2 = 1;
        public static final int ANDROID_CAMERA_AUTO = -1;
    }

    public static class ChromiumCameraInfo {
        private static boolean enableCameraCacheNumbers = true;
        private static int sNumberOfSystemCameras = -1;

        public static boolean getCameraCacheNumbers() {
            return enableCameraCacheNumbers;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getNumberOfCameras() {
            if (sNumberOfSystemCameras == -1 || !enableCameraCacheNumbers) {
                if (ContextUtils.getApplicationContext() == null) {
                    return sNumberOfSystemCameras;
                }
                if (VideoCaptureFactory.isLReleaseOrLater()) {
                    sNumberOfSystemCameras = VideoCaptureCamera2.getNumberOfCameras();
                } else {
                    sNumberOfSystemCameras = VideoCaptureCamera1.getNumberOfCameras();
                }
                Logging.m88097d(VideoCaptureFactory.TAG, "getMaxNumberOfCameras: " + sNumberOfSystemCameras + " availableOfCameras: " + VideoCaptureCamera1.getNumberOfCameras());
            }
            return sNumberOfSystemCameras;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void setCacheCameraNumbers(boolean z) {
            Logging.m88102w(VideoCaptureFactory.TAG, "setCacheCameraNumbers: " + z);
            enableCameraCacheNumbers = z;
        }
    }

    public static IVideoCapture createCameraCapture(int i, long j, boolean z, boolean z2, int i2, boolean z3, int i3, EglBase.Context context, int i4, int i5, int i6, int i7, boolean z4, boolean z5, int i8, int i9, boolean z6, boolean z7, int i10, int i11, boolean z8) {
        boolean z9;
        String camera2SupportedLevel = getCamera2SupportedLevel(i);
        String str = Build.MODEL;
        if ("RMX3231".equalsIgnoreCase(str) && getDeviceName(i).contains("front")) {
            Logging.m88102w(TAG, "Not support for " + str);
            z9 = true;
        } else {
            z9 = false;
        }
        StringBuilder sb = new StringBuilder("createVideoCapture() ");
        sb.append(i);
        sb.append(", captureToTexture: ");
        boolean z10 = z;
        sb.append(z10);
        sb.append(", camera_selected: ");
        sb.append(i4);
        sb.append(", camera_selected_level: ");
        sb.append(i5);
        sb.append(", enableTextureCopy: ");
        sb.append(z2);
        sb.append(", captureTextureBufferCount: ");
        sb.append(i2);
        sb.append(", pqFirst: ");
        sb.append(z3);
        sb.append(", templateType: ");
        int i12 = i6;
        sb.append(i12);
        sb.append(", noiseReduction: ");
        sb.append(i7);
        sb.append(", autoFaceDetect: ");
        sb.append(z4);
        sb.append(", extraSurface: ");
        sb.append(z5);
        sb.append(", autoWhiteBalance: ");
        sb.append(z6);
        sb.append(", hardware level: ");
        sb.append(camera2SupportedLevel);
        sb.append(" focalLengthType: ");
        sb.append(i10);
        sb.append(" physicalId: ");
        sb.append(i11);
        Logging.m88102w(TAG, sb.toString());
        if (TEXTURE_EXCEPTION_MODELS.contains(str)) {
            Logging.m88102w(TAG, "Not support for " + str);
            z10 = false;
        }
        if (TEMPLATETYPE_EXCEPTION_MODELS.contains(str)) {
            Logging.m88102w(TAG, "templateType use preview, model: " + str);
            i12 = 0;
        }
        if (isLegacyOrDeprecatedDevice(i) || i4 == 0 || isLessSelectedLevel(i, i5) || z9) {
            return new VideoCaptureCamera1(i, j, z10, z2, i2, z3, i3, context, i12, i7, i8, z4, z5, z6, z7, i10, i11, z8);
        }
        boolean z11 = z10;
        int i13 = i12;
        return createFallbackWrapper(new VideoCaptureCamera2(i, j, z11, z2, i2, z3, i3, context, i13, i7, i9, z4, z5, z6, z7, i10, i11, z8), i, j, z11, z2, i2, z3, i3, context, i13, i7, i9, z4, z5, z6, z7, i10, -1, z8);
    }

    public static IVideoCaptureCamera createFallbackWrapper(IVideoCaptureCamera iVideoCaptureCamera, final int i, final long j, final boolean z, final boolean z2, final int i2, final boolean z3, final int i3, final EglBase.Context context, final int i4, final int i5, final int i6, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final int i7, final int i8, final boolean z8) {
        return new VideoCaptureCameraFallbackWrapper(iVideoCaptureCamera, new VideoCaptureCameraFallbackWrapper.OnCameraFallbackListener() { // from class: io.agora.rtc2.video.VideoCaptureFactory.1
            @Override // io.agora.rtc2.video.VideoCaptureCameraFallbackWrapper.OnCameraFallbackListener
            public IVideoCaptureCamera createFallbackCamera() {
                return new VideoCaptureCamera1(i, j, z, z2, i2, z3, i3, context, i4, i5, i6, z4, z5, z6, z7, i7, i8, z8);
            }
        });
    }

    @CalledByNative
    public static VideoCapture createScreenCapture(long j, EglBase.Context context, Intent intent) {
        return new VideoCaptureScreen(j, context, intent);
    }

    @CalledByNative
    public static void enableCamera2BlackList(boolean z) {
        enableCamera2BlackList = z;
        Logging.m88102w(TAG, "enableCamera2BlackList: " + z);
    }

    @CalledByNative
    public static String getCamera2SupportedLevel(int i) {
        if (isLegacyOrDeprecatedDevice(i)) {
            return "legacy";
        }
        int camera2SupportedLevel = VideoCaptureCamera2.getCamera2SupportedLevel(i);
        if (camera2SupportedLevel == 0) {
            return "limited";
        }
        if (camera2SupportedLevel == 1) {
            return "full";
        }
        if (camera2SupportedLevel == 3) {
            return "level_3";
        }
        return camera2SupportedLevel == 4 ? "external" : "legacy";
    }

    @CalledByNative
    public static int getCaptureApiType(int i) {
        return isLegacyOrDeprecatedDevice(i) ? VideoCaptureCamera1.getCaptureApiType(i) : VideoCaptureCamera2.getCaptureApiType(i);
    }

    @Nullable
    @CalledByNative
    public static String getDeviceId(int i) {
        return isLegacyOrDeprecatedDevice(i) ? VideoCaptureCamera1.getDeviceId(i) : VideoCaptureCamera2.getDeviceId(i);
    }

    @Nullable
    @CalledByNative
    public static String getDeviceName(int i) {
        return isLegacyOrDeprecatedDevice(i) ? VideoCaptureCamera1.getName(i) : VideoCaptureCamera2.getName(i);
    }

    @Nullable
    @CalledByNative
    public static List<VideoCaptureFormat> getDeviceSupportedFormats(int i) {
        return isLegacyOrDeprecatedDevice(i) ? VideoCaptureCamera1.getDeviceSupportedFormats(i) : VideoCaptureCamera2.getDeviceSupportedFormats(i);
    }

    @CalledByNative
    public static int getFacingMode(int i) {
        return isLegacyOrDeprecatedDevice(i) ? VideoCaptureCamera1.getFacingMode(i) : VideoCaptureCamera2.getFacingMode(i);
    }

    @CalledByNative
    public static int getNumberOfCameras() {
        return ChromiumCameraInfo.getNumberOfCameras();
    }

    public static boolean isInCamera2BlackList() {
        if (!enableCamera2BlackList) {
            return false;
        }
        String str = Build.DEVICE;
        if ("ocean".equalsIgnoreCase(str) && "oe106".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("trident".equalsIgnoreCase(str) && "de106".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if (("shark".equalsIgnoreCase(str) && "skr-a0".equalsIgnoreCase(Build.MODEL)) || "hnnem-h".equalsIgnoreCase(str)) {
            return true;
        }
        if ((!"on7xelte".equals(str) || !"SM-G610F".equals(Build.MODEL)) && !"m2c".equals(str)) {
            String str2 = Build.MODEL;
            if (!"M578CA".equals(str2)) {
                String str3 = Build.MANUFACTURER;
                return ("samsung".equalsIgnoreCase(str3) && str2 != null && (str2.contains("SM-G930") || str2.contains("SM-G935") || str2.contains("SM-G950") || str2.contains("SM-G955") || "SC-02H".equals(str2) || "SCV33".equals(str2) || "SC-02J".equals(str2) || "SCV36".equals(str2) || "SM-G892A".equals(str2) || "SM-G892U".equals(str2) || "SC-03J".equals(str2) || "SCV35".equals(str2))) || "oneplus".equalsIgnoreCase(str3) || "PCAM00".equalsIgnoreCase(str2) || "h8296".equalsIgnoreCase(str2);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLReleaseOrLater() {
        return true;
    }

    @CalledByNative
    public static boolean isLegacyOrDeprecatedDevice(int i) {
        return !isLReleaseOrLater() || VideoCaptureCamera2.isLegacyDevice(i) || isInCamera2BlackList();
    }

    public static boolean isLessSelectedLevel(int i, int i2) {
        int camera2SupportedLevel = VideoCaptureCamera2.getCamera2SupportedLevel(i);
        if (camera2SupportedLevel == Integer.MIN_VALUE) {
            return true;
        }
        SparseIntArray sparseIntArray = VideoCaptureCamera2.ANDROID_CAMERA_HARDWARE_LEVEL_MAP;
        return sparseIntArray.get(camera2SupportedLevel) <= sparseIntArray.get(i2, 1);
    }

    @Nullable
    @CalledByNative
    public static List<FocalLengthInfo> queryCameraFocalLengthCapability(int i, boolean z) {
        return (!isLReleaseOrLater() || isInCamera2BlackList() || i == 0) ? VideoCaptureCamera1.queryCameraFocalLengthCapability() : VideoCaptureCamera2.queryCameraFocalLengthCapability(z);
    }

    @CalledByNative
    public static void setCacheCameraNumbers(boolean z) {
        ChromiumCameraInfo.setCacheCameraNumbers(z);
    }

    @CalledByNative
    public static void setCameraSkipCaptureHeight(int i) {
        VideoCaptureCamera.setCameraSkipCapturHeight(i);
    }

    @CalledByNative
    public static void setCameraSkipCaptureWidth(int i) {
        VideoCaptureCamera.setCameraSkipCaptureWidth(i);
    }

    @CalledByNative
    public static IVideoCapture createCameraCapture(int i, long j, boolean z, boolean z2, int i2, boolean z3, int i3, EglBase.Context context, VideoCaptureParameter videoCaptureParameter) {
        return createCameraCapture(i, j, z, z2, i2, z3, i3, context, videoCaptureParameter.lowCameraSelected, videoCaptureParameter.hardwareLevelSelected, videoCaptureParameter.templateType, videoCaptureParameter.noiseReduce, videoCaptureParameter.faceFocusing, videoCaptureParameter.extraSurface, videoCaptureParameter.camera1FocusMode, videoCaptureParameter.camera2FocusMode, videoCaptureParameter.autoWhiteBalance, videoCaptureParameter.camera1FpsRange, videoCaptureParameter.focalLengthType, videoCaptureParameter.physicalId, videoCaptureParameter.enableRefocus);
    }
}
