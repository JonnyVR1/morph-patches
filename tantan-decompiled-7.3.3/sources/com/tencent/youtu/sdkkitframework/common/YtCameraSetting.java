package com.tencent.youtu.sdkkitframework.common;

import android.content.Context;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.text.TextUtils;
import android.view.WindowManager;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YtCameraSetting {
    public static final String TAG = "YtCameraSetting";
    public static int customFPS = 15000;
    public static int mCameraFacing = 1;
    public static int mDesiredPreviewHeight = 480;
    public static int mDesiredPreviewWidth = 640;
    public static int mRotate;

    public static int chooseFixedPreviewFps(Camera.Parameters parameters, int i) {
        int i2;
        Iterator<int[]> it = parameters.getSupportedPreviewFpsRange().iterator();
        while (true) {
            if (!it.hasNext()) {
                int[] iArr = new int[2];
                parameters.getPreviewFpsRange(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                if (i3 != i4) {
                    if (i > i4) {
                        i = i4;
                    }
                    if (i >= i3) {
                        i3 = i;
                    }
                }
                String str = parameters.get("preview-frame-rate-values");
                if (!TextUtils.isEmpty(str)) {
                    if (!str.contains("" + (i3 / 1000))) {
                        String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
                        for (String str2 : strArrSplit) {
                            int i5 = Integer.parseInt(str2) * 1000;
                            if (i3 < i5) {
                                parameters.setPreviewFrameRate(i5 / 1000);
                                return i5;
                            }
                        }
                        if (strArrSplit.length > 0 && i3 > (i2 = Integer.parseInt(strArrSplit[strArrSplit.length - 1]) * 1000)) {
                            i3 = i2;
                        }
                    }
                }
                parameters.setPreviewFrameRate(i3 / 1000);
                return i3;
            }
            int[] next = it.next();
            String str3 = TAG;
            YtLogger.m85808d(str3, "entry: " + next[0] + " - " + next[1]);
            int i6 = next[0];
            int i7 = next[1];
            if (i6 == i7 && i6 == i) {
                parameters.setPreviewFpsRange(i6, i7);
                YtLogger.m85808d(str3, "use preview fps range: " + next[0] + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + next[1]);
                return next[0];
            }
        }
    }

    public static int getDesiredPreviewHeight() {
        return mDesiredPreviewHeight;
    }

    public static int getDesiredPreviewWidth() {
        return mDesiredPreviewWidth;
    }

    public static Camera.Size getOptimalPreviewSize(List<Camera.Size> list, int i, int i2) {
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        int iMax = Math.max(i, i2);
        int iMin = Math.min(i, i2);
        double d = ((double) iMax) / ((double) iMin);
        YtLogger.m85808d(TAG, "sizes size=" + list.size());
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= 0.001d && Math.abs(size2.height - iMin) < dAbs2) {
                dAbs2 = Math.abs(size2.height - iMin);
                size = size2;
            }
        }
        if (size == null) {
            YtLogger.m85808d(TAG, "No preview size match the aspect ratio");
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - iMin) < dAbs) {
                    dAbs = Math.abs(size3.height - iMin);
                    size = size3;
                }
            }
        }
        return size;
    }

    public static int getRotate(Context context, int i, int i2) {
        return getRotateTag(getVideoRotate(context, i), i2);
    }

    public static int getRotateTag(int i, int i2) {
        int i3;
        if (i == 90) {
            i3 = 7;
        } else if (i == 180) {
            i3 = 3;
        } else if (i == 270) {
            i3 = 5;
        } else {
            YtLogger.m85810i(TAG, "camera rotate not 90degree or 180degree, input: " + i);
            i3 = 1;
        }
        return i2 == 1 ? i3 : transBackFacingCameraRatateTag(i3);
    }

    public static int getVideoRotate(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        int i5 = i3 == 1 ? (360 - ((i4 + i2) % 360)) % 360 : ((i4 - i2) + 360) % 360;
        YtLogger.m85810i(TAG, "debug camera orientation is " + cameraInfo.orientation + " ui degrees is " + i2);
        return i5;
    }

    public static int initCamera(Context context, Camera camera, int i, int i2, boolean z) {
        CamcorderProfile camcorderProfile;
        mDesiredPreviewWidth = 640;
        mDesiredPreviewHeight = 480;
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            for (int i3 = 0; i3 < supportedFocusModes.size(); i3++) {
                YtLogger.m85812v(TAG, "suporrtedFocusModes " + i3 + " :" + supportedFocusModes.get(i3));
            }
            if (supportedFocusModes.indexOf("continuous-video") >= 0) {
                parameters.setFocusMode("continuous-video");
                YtLogger.m85808d(TAG, "set camera focus mode continuous video");
            } else if (supportedFocusModes.indexOf("auto") >= 0) {
                parameters.setFocusMode("auto");
                YtLogger.m85808d(TAG, "set camera focus mode auto");
            } else {
                YtLogger.m85808d(TAG, "NOT set camera focus mode");
            }
            try {
                try {
                    camera.setParameters(parameters);
                } catch (Throwable th) {
                    camera.getParameters();
                    throw th;
                }
            } catch (Exception e) {
                YtLogger.m85809e(TAG, "Camera.setParameters.setPreviewSize failed!!: ", e);
            }
            Camera.Parameters parameters2 = camera.getParameters();
            int videoRotate = getVideoRotate(context, i);
            camera.setDisplayOrientation(videoRotate);
            String str = TAG;
            YtLogger.m85808d(str, "videoOrietation is" + videoRotate);
            if (CamcorderProfile.hasProfile(i, i2)) {
                camcorderProfile = CamcorderProfile.get(i, i2);
                YtLogger.m85808d(str, "custom camcorderProfile:" + camcorderProfile.videoFrameWidth + BaseSei.f14624X + camcorderProfile.videoFrameHeight);
            } else if (CamcorderProfile.hasProfile(i, 4)) {
                camcorderProfile = CamcorderProfile.get(i, 4);
                YtLogger.m85808d(str, "480P camcorderProfile:" + camcorderProfile.videoFrameWidth + BaseSei.f14624X + camcorderProfile.videoFrameHeight);
            } else if (CamcorderProfile.hasProfile(i, 5)) {
                camcorderProfile = CamcorderProfile.get(i, 5);
                YtLogger.m85808d(str, "720P camcorderProfile:" + camcorderProfile.videoFrameWidth + BaseSei.f14624X + camcorderProfile.videoFrameHeight);
            } else {
                camcorderProfile = CamcorderProfile.get(i, 1);
                YtLogger.m85808d(str, "High camcorderProfile:" + camcorderProfile.videoFrameWidth + BaseSei.f14624X + camcorderProfile.videoFrameHeight);
            }
            List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            for (int i4 = 0; i4 < supportedPictureSizes.size(); i4++) {
                Camera.Size size = supportedPictureSizes.get(i4);
                YtLogger.m85808d("pictureSize", size.width + " x " + size.height);
            }
            for (int i5 = 0; i5 < supportedPreviewSizes.size(); i5++) {
                Camera.Size size2 = supportedPreviewSizes.get(i5);
                YtLogger.m85808d("previewSize", size2.width + " x " + size2.height);
            }
            setVideoSize(parameters2, camcorderProfile);
            if (z) {
                mDesiredPreviewWidth = camcorderProfile.videoFrameWidth;
                mDesiredPreviewHeight = camcorderProfile.videoFrameHeight;
            }
            YtLogger.m85808d(TAG, "mDesiredPreviewWidth: " + mDesiredPreviewWidth + ", mDesiredPreviewHeight: " + mDesiredPreviewHeight);
            parameters2.setPreviewSize(mDesiredPreviewWidth, mDesiredPreviewHeight);
            parameters2.setPreviewFormat(17);
            try {
                camera.setParameters(parameters2);
            } catch (Exception e2) {
                YtLogger.m85809e(TAG, "Camera.setParameters.setPreviewSize failed!!: ", e2);
            }
            Camera.Parameters parameters3 = camera.getParameters();
            int iChooseFixedPreviewFps = chooseFixedPreviewFps(parameters3, customFPS);
            YtLogger.m85808d(TAG, "choose camera fps is : " + iChooseFixedPreviewFps);
            try {
                camera.setParameters(parameters3);
            } catch (Exception e3) {
                YtLogger.m85809e(TAG, "Camera.setParameters.preview fps failed!!: ", e3);
            }
            Camera.Parameters parameters4 = camera.getParameters();
            int[] iArr = new int[2];
            parameters4.getPreviewFpsRange(iArr);
            int previewFrameRate = parameters4.getPreviewFrameRate();
            String str2 = TAG;
            YtLogger.m85808d(str2, "after set parameters getPreviewFpsRange=" + iArr[0] + "-" + iArr[1] + " ;after set parameter fps=" + previewFrameRate);
            Camera.Size previewSize = parameters4.getPreviewSize();
            StringBuilder sb = new StringBuilder("camera preview size is ");
            sb.append(previewSize.width);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(previewSize.height);
            YtLogger.m85808d(str2, sb.toString());
            return 0;
        } catch (Exception e4) {
            YtLogger.m85809e(TAG, "get camera parameters failed. 1. Check Camera.getParameters() interface. 2. Get logs for more detail.", e4);
            return 1;
        }
    }

    public static void setCameraFacing(int i) {
        mCameraFacing = i;
    }

    public static void setCameraRotate(int i) {
        mRotate = i;
    }

    public static void setCustomFPS(int i) {
        customFPS = i;
    }

    public static void setVideoSize(Camera.Parameters parameters, CamcorderProfile camcorderProfile) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (parameters.getSupportedVideoSizes() == null) {
            String str = TAG;
            YtLogger.m85808d(str, "video size from profile is : " + camcorderProfile.videoFrameWidth + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + camcorderProfile.videoFrameHeight);
            if (getOptimalPreviewSize(supportedPreviewSizes, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) == null) {
                YtLogger.m85808d(str, "do not find proper preview size, use default");
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            boolean z = false;
            for (int i = 0; i < supportedVideoSizes.size(); i++) {
                Camera.Size size = supportedVideoSizes.get(i);
                if (size.width == camcorderProfile.videoFrameWidth && size.height == camcorderProfile.videoFrameHeight) {
                    z = true;
                }
            }
            if (!z) {
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        YtLogger.m85808d(TAG, "select video size camcorderProfile:" + camcorderProfile.videoFrameWidth + BaseSei.f14624X + camcorderProfile.videoFrameHeight);
    }

    public static int transBackFacingCameraRatateTag(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 6) {
            return 7;
        }
        if (i == 7) {
            return 6;
        }
        if (i == 8) {
            return 5;
        }
        YtLogger.m85813w(TAG, "[YtCameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i, null);
        return 0;
    }

    public static int initCamera(Context context, Camera camera, int i, int i2) {
        return initCamera(context, camera, i, i2, false);
    }

    public static int initCamera(Context context, Camera camera, int i) {
        return initCamera(context, camera, i, 4, false);
    }
}
