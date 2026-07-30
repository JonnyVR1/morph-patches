package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import io.agora.base.FaceDetectionInfo;
import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(17)
public abstract class VideoCaptureCamera extends VideoCapture implements IVideoCaptureCamera {
    static final int ANDROID_CAMERA_SKIP_CONTROL_AE = 1;
    static final int ANDROID_CAMERA_SKIP_CONTROL_AF = 2;
    static final int ANDROID_CAMERA_SKIP_CONTROL_DEFAULT = 0;
    protected static final int CAMERA_TEMPLATE_PREVIEW = 0;
    protected static final int CAMERA_TEMPLATE_RECORD = 1;
    protected static final int CAMERA_TORCH_DEFAULT = 0;
    protected static final int CAMERA_TORCH_DISENABLE = -1;
    protected static final int CAMERA_TORCH_ENABLE = 1;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_AUTO = 1;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_NONE = 0;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_PICTURE = 3;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_VIDEO = 2;
    protected static final int CONTROL_VIDEO_STABILIZATION_MODE_OFF = 0;
    protected static final int CONTROL_VIDEO_STABILIZATION_MODE_ON = 1;
    protected static final int FOCAL_LENGTH_STEP = 6;
    protected static final int FOCAL_LENGTH_TYPE_SUPPORTED_OF_LOGICAL = 1;
    protected static final int FOCAL_LENGTH_TYPE_SUPPORTED_OF_PHYSICAL = 2;
    protected static final int FOCAL_LENGTH_TYPE_SUPPORTED_OF_ZOOM = 3;
    protected static final float FOCAL_LENGTH_ULTRA_WIDE_ANGLE_UPPER_LIMIT = 3.5f;
    protected static final float FOCAL_LENGTH_WIDE_ANGLE_UPPER_LIMIT = 2.4f;
    protected static final int MAX_CAMERA_TIME_MS = 2000;
    protected static final int SIZE_HEIGHT_OF_2K = 1440;
    protected static final int SIZE_WIDTH_OF_2K = 2560;
    private static final String TAG = "VideoCaptureCamera";
    private static int cameraSkipCapturHeight = 0;
    private static int cameraSkipCaptureWidth = 0;
    protected static boolean mEnableRefocus = true;
    boolean isMirror;
    protected Rect lastFocusAreaRect;
    protected boolean mAutoFaceDetectFocusStarted;
    protected int mCamerEdgeEnhanceMode;
    protected int mCameraAntiBandingMode;
    protected final boolean mCameraAutoFaceFocus;
    protected final boolean mCameraAutoWhiteBalance;

    @Nullable
    protected CameraManager.AvailabilityCallback mCameraAvailableListener;
    protected int mCameraExposureCompensation;
    protected float[] mCameraExposurePositions;
    protected boolean mCameraExtraSurface;
    protected final int mCameraFocusMode;
    protected float[] mCameraFocusPositions;
    protected final boolean mCameraFpsRangeEnable;
    protected int mCameraNoiseReduction;
    protected int mCameraNoiseReductionMode;
    protected final int mCameraTemplateType;
    protected int mCameraVideoStabilityMode;
    protected float mCameraZoomFactor;
    protected final boolean mCaptureToTexture;
    protected boolean mEnableAutoFaceFocus;
    protected boolean mEnableFaceDetection;
    protected final boolean mEnableTextureCopy;
    protected final int mFocalLengthType;
    protected int mId;
    protected boolean mIsAntiBandingStarted;
    protected boolean mIsCameraTorchStarted;
    protected boolean mIsEdgeEnhanceStarted;
    protected boolean mIsExposureCompensationStarted;
    protected boolean mIsFaceDetectionStarted;
    protected boolean mIsNoiseReducationStarted;
    protected boolean mIsStabilityStarted;
    protected boolean mIsmCameraExposureStarted;
    protected boolean mIsmCameraFocusStarted;
    protected boolean mIsmCameraZoomStarted;
    protected LinkedBlockingQueue<List<FaceDetectionInfo>> mPerFrameFaceDetectionInfoQueue;
    int mRenderMode;
    CaptureViewWeakRef mRenderView;
    protected final int mSkipControl;
    protected int mTorchMode;
    private static final String[] SIZE_HEIGHT_GT_720_BUGGY_DEVICE_LIST = {"Lenovo K520"};
    private static final String[] SIZE_HEIGHT_1440_BUGGY_DEVICE_LIST = {"PDBM00"};
    static final String[] REFOCUS_BUGGY_DEVICE_LIST = {"noh-al00"};

    @RequiresApi(21)
    public class CameraAvailabilityCallback extends CameraManager.AvailabilityCallback {
        public CameraAvailabilityCallback() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
            Logging.m87213w(VideoCaptureCamera.TAG, "Camera Access Priorities Changed");
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public synchronized void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            Logging.m87211i(VideoCaptureCamera.TAG, "onCameraAvailable: " + str);
            VideoCaptureCamera.this.onCameraAvailable(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public synchronized void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            Logging.m87213w(VideoCaptureCamera.TAG, "onCameraUnavailable: " + str);
            VideoCaptureCamera.this.onCameraUnavailable(str);
        }
    }

    public class CaptureViewWeakRef<V> extends WeakReference<View> {
        public CaptureViewWeakRef(View view) {
            super(view);
        }

        public int getHeight() {
            VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera.this.mCaptureFormat;
            return get() == null ? videoCaptureFormat == null ? 0 : videoCaptureFormat.mHeight : get().getHeight();
        }

        public int getWidth() {
            VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera.this.mCaptureFormat;
            return get() == null ? videoCaptureFormat == null ? 0 : videoCaptureFormat.mWidth : get().getWidth();
        }
    }

    public VideoCaptureCamera(int i, long j, boolean z, boolean z2, int i2, boolean z3, int i3, EglBase.Context context, int i4, int i5, int i6, boolean z4, boolean z5, boolean z6, boolean z7, int i7, int i8, boolean z8) {
        super(j, context, i2);
        boolean z9 = false;
        this.mEnableAutoFaceFocus = false;
        this.mEnableFaceDetection = false;
        this.mIsFaceDetectionStarted = false;
        this.mTorchMode = 0;
        this.mIsmCameraExposureStarted = false;
        this.mCameraExposurePositions = new float[]{-1.0f, -1.0f};
        this.mIsmCameraFocusStarted = false;
        this.mCameraFocusPositions = new float[]{-1.0f, -1.0f};
        this.mIsmCameraZoomStarted = false;
        this.mCameraZoomFactor = -1.0f;
        this.mCameraExposureCompensation = 0;
        this.mCameraNoiseReductionMode = 0;
        this.mCameraAntiBandingMode = 0;
        this.mCameraVideoStabilityMode = 0;
        this.mCamerEdgeEnhanceMode = 0;
        this.mIsExposureCompensationStarted = false;
        this.mIsAntiBandingStarted = false;
        this.mIsEdgeEnhanceStarted = false;
        this.mIsStabilityStarted = false;
        this.mIsNoiseReducationStarted = false;
        this.mAutoFaceDetectFocusStarted = false;
        this.mPerFrameFaceDetectionInfoQueue = new LinkedBlockingQueue<>();
        this.mRenderView = new CaptureViewWeakRef(null);
        this.isMirror = false;
        this.mId = i;
        this.mPQFirst = z3;
        this.mFocalLengthType = i7;
        this.mSkipControl = i3;
        this.mCameraTemplateType = i4;
        this.mCameraExtraSurface = z5;
        this.mCameraNoiseReduction = i5;
        this.mCameraFocusMode = i6;
        this.mCameraAutoFaceFocus = z4;
        this.mCameraAutoWhiteBalance = z6;
        this.mCameraFpsRangeEnable = z7;
        boolean z10 = z && this.mSurfaceTextureHelper != null;
        this.mCaptureToTexture = z10;
        if (z10 && z2) {
            z9 = true;
        }
        this.mEnableTextureCopy = z9;
        mEnableRefocus = z8;
        Logging.m87211i(TAG, "VideoCaptureCamera info ,mId:" + this.mId + ",mPQFirst:" + this.mPQFirst + ",mCaptureToTexture:" + z10 + ",mCaptureTextureBufferCount:" + i2 + ",mEnableTextureCopy:" + z9 + " ,autoFaceDetect:" + z4);
    }

    @Nullable
    public static VideoCapture.FramerateRange findBestFrameRateRange(@NonNull List<VideoCapture.FramerateRange> list, int i, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        String str = TAG;
        Logging.m87211i(str, "findBestFrameRateRange " + list.toString());
        VideoCapture.FramerateRange framerateRangeFindBestFrameRateRangePreferPQ = z ? findBestFrameRateRangePreferPQ(list, i) : findBestFrameRateRangePreferFPS(list, i);
        if (framerateRangeFindBestFrameRateRangePreferPQ != null) {
            return framerateRangeFindBestFrameRateRangePreferPQ;
        }
        StringBuilder sb = new StringBuilder("Failed to find match fps in ");
        sb.append(z ? "PQ" : " FPS");
        sb.append(" first mode, try closest.");
        Logging.m87209e(str, sb.toString());
        return getClosestFramerateRange(list, i);
    }

    @Nullable
    private static VideoCapture.FramerateRange findBestFrameRateRangePreferFPS(@NonNull List<VideoCapture.FramerateRange> list, int i) {
        Collections.sort(list, new Comparator<VideoCapture.FramerateRange>() { // from class: io.agora.rtc2.video.VideoCaptureCamera.2
            @Override // java.util.Comparator
            public int compare(VideoCapture.FramerateRange framerateRange, VideoCapture.FramerateRange framerateRange2) {
                int i2 = framerateRange.min - framerateRange2.min;
                return i2 == 0 ? framerateRange.max - framerateRange2.max : i2;
            }
        });
        Logging.m87211i(TAG, "sorted fps Ranges List order by min first:" + list.toString());
        for (VideoCapture.FramerateRange framerateRange : list) {
            if (framerateRange.min >= i) {
                Logging.m87211i(TAG, "set fps : " + framerateRange.toString() + " to camera in fps first mode, request:" + i);
                return framerateRange;
            }
        }
        return null;
    }

    @Nullable
    private static VideoCapture.FramerateRange findBestFrameRateRangePreferPQ(@NonNull List<VideoCapture.FramerateRange> list, int i) {
        Collections.sort(list, new Comparator<VideoCapture.FramerateRange>() { // from class: io.agora.rtc2.video.VideoCaptureCamera.3
            @Override // java.util.Comparator
            public int compare(VideoCapture.FramerateRange framerateRange, VideoCapture.FramerateRange framerateRange2) {
                int i2 = framerateRange.max - framerateRange2.max;
                return i2 == 0 ? framerateRange.min - framerateRange2.min : i2;
            }
        });
        Logging.m87211i(TAG, "sorted fps Ranges List order by max first:" + list.toString());
        for (VideoCapture.FramerateRange framerateRange : list) {
            if (framerateRange.max >= i) {
                Logging.m87211i(TAG, "set fps : " + framerateRange.toString() + " to camera in PQ first mode, request:" + i);
                return framerateRange;
            }
        }
        return null;
    }

    public static VideoCapture.FramerateRange getClosestFramerateRange(List<VideoCapture.FramerateRange> list, final int i) {
        return (VideoCapture.FramerateRange) Collections.min(list, new Comparator<VideoCapture.FramerateRange>() { // from class: io.agora.rtc2.video.VideoCaptureCamera.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                return i2 < i3 ? i2 * i4 : (i4 * i3) + ((i2 - i3) * i5);
            }

            @Override // java.util.Comparator
            public int compare(VideoCapture.FramerateRange framerateRange, VideoCapture.FramerateRange framerateRange2) {
                return diff(framerateRange) - diff(framerateRange2);
            }

            public int diff(VideoCapture.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, 8000, 1, 4) + progressivePenalty(Math.abs(i - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static void setCameraSkipCapturHeight(int i) {
        cameraSkipCapturHeight = i;
    }

    public static void setCameraSkipCaptureWidth(int i) {
        cameraSkipCaptureWidth = i;
    }

    public static boolean shouldExcludeSize(int i, int i2) {
        if (i == cameraSkipCaptureWidth) {
            Logging.m87213w(TAG, "camera capture skip width: " + i);
            return true;
        }
        if (i2 == cameraSkipCapturHeight) {
            Logging.m87213w(TAG, "camera capture skip height: " + i);
            return true;
        }
        if (i2 > 720) {
            for (String str : SIZE_HEIGHT_GT_720_BUGGY_DEVICE_LIST) {
                if (str.contentEquals(Build.MODEL)) {
                    return true;
                }
            }
        }
        if (i > SIZE_WIDTH_OF_2K || i2 > SIZE_HEIGHT_OF_2K || i * i2 > 3686400) {
            for (String str2 : SIZE_HEIGHT_1440_BUGGY_DEVICE_LIST) {
                if (Build.MODEL.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean shouldSkipRefocus() {
        for (String str : REFOCUS_BUGGY_DEVICE_LIST) {
            if (Build.MODEL.toLowerCase().contains(str)) {
                return true;
            }
        }
        return !mEnableRefocus;
    }

    public void attachPerFrameMetaInfos(VideoFrame videoFrame) {
        ArrayList<FaceDetectionInfo> arrayList;
        if (this.mPerFrameFaceDetectionInfoQueue.isEmpty() || (arrayList = (ArrayList) this.mPerFrameFaceDetectionInfoQueue.poll()) == null) {
            return;
        }
        for (FaceDetectionInfo faceDetectionInfo : arrayList) {
            videoFrame.getMetaInfo().getCustomMetaInfo(FaceDetectionInfo.class.getSimpleName()).put(faceDetectionInfo.getId(), faceDetectionInfo);
        }
    }

    public VideoFrameMetaInfo getPerFrameMetaInfos() {
        ArrayList<FaceDetectionInfo> arrayList;
        VideoFrameMetaInfo videoFrameMetaInfo = new VideoFrameMetaInfo();
        if (!this.mPerFrameFaceDetectionInfoQueue.isEmpty() && (arrayList = (ArrayList) this.mPerFrameFaceDetectionInfoQueue.poll()) != null) {
            for (FaceDetectionInfo faceDetectionInfo : arrayList) {
                videoFrameMetaInfo.getCustomMetaInfo(FaceDetectionInfo.class.getSimpleName()).put(faceDetectionInfo.getId(), faceDetectionInfo);
            }
        }
        return videoFrameMetaInfo;
    }

    @VisibleForTesting
    public boolean isEnableAutoFaceFocus() {
        return this.mEnableAutoFaceFocus;
    }

    @VisibleForTesting
    public boolean isEnableFaceDetection() {
        return this.mEnableFaceDetection;
    }

    @VisibleForTesting
    public boolean isFaceDetectionStarted() {
        return this.mIsFaceDetectionStarted;
    }

    public native void nativeNotifyCameraExposureAreaChanged(long j, int i, int i2, int i3, int i4);

    public native void nativeNotifyCameraFocusAreaChanged(long j, int i, int i2, int i3, int i4);

    public void notifyCameraExposureAreaChanged(Rect rect) {
        long j = this.mNativeVideoCaptureAndroid;
        if (j != 0) {
            VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
            nativeNotifyCameraExposureAreaChanged(j, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, rect.left, rect.top);
        }
    }

    public void notifyCameraFocusAreaChanged(Rect rect) {
        long j = this.mNativeVideoCaptureAndroid;
        if (j != 0) {
            nativeNotifyCameraFocusAreaChanged(j, rect.width(), rect.height(), rect.left, rect.top);
        }
    }

    public void notifyFaceDetection(int i, int i2, ArrayList<RectF> arrayList, ArrayList<Double> arrayList2) {
        int size = arrayList.size();
        if (this.mNativeVideoCaptureAndroid == 0 || size <= 0) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 <= size - 1; i3++) {
            Rect rect = new Rect();
            arrayList.get(i3).round(rect);
            arrayList3.add(new FaceDetectionInfo(i3, rect, arrayList2.get(i3).doubleValue()));
        }
        this.mPerFrameFaceDetectionInfoQueue.offer(arrayList3);
    }

    public abstract void onCameraAvailable(String str);

    public abstract void onCameraUnavailable(String str);

    @RequiresApi(21)
    public void registerCameraAvailableCallback(CameraManager cameraManager) {
        if (ContextUtils.getApplicationContext() == null) {
            return;
        }
        if (cameraManager == null) {
            cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        }
        if (cameraManager != null && this.mCameraAvailableListener == null) {
            try {
                this.mCameraAvailableListener = new CameraAvailabilityCallback();
                Logging.m87211i(TAG, "register CameraAvailablyCallback");
                cameraManager.registerAvailabilityCallback(this.mCameraAvailableListener, this.mProxyThreadHandler);
            } catch (RuntimeException e) {
                Logging.m87213w(TAG, "registerAvailabilityCallback error " + e.getMessage());
            }
        }
    }

    @VisibleForTesting
    public void setCameraProxyHandler() {
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera_ProxyThread");
        handlerThread.start();
        this.mProxyThreadHandler = new Handler(handlerThread.getLooper());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public void setPreviewInfo(Object obj, boolean z, int i) {
        this.isMirror = z;
        this.mRenderMode = i;
        if (obj instanceof View) {
            this.mRenderView = new CaptureViewWeakRef((View) obj);
            Logging.m87211i(TAG, "setPreviewInfo " + this.mRenderView.getWidth() + " x " + this.mRenderView.getHeight());
        } else {
            Logging.m87211i(TAG, "setPreviewInfo ");
        }
        if (!this.mIsmCameraFocusStarted) {
            float[] fArr = this.mCameraFocusPositions;
            float f = fArr[0];
            if (f > 0.0f) {
                float f2 = fArr[1];
                if (f2 > 0.0f) {
                    setFocus(f, f2);
                }
            }
        }
        if (this.mIsmCameraExposureStarted) {
            return;
        }
        float[] fArr2 = this.mCameraExposurePositions;
        float f3 = fArr2[0];
        if (f3 > 0.0f) {
            float f4 = fArr2[1];
            if (f4 > 0.0f) {
                setExposure(f3, f4);
            }
        }
    }

    public void unRegisterAvailabilityCallback() {
        if (this.mCameraAvailableListener == null || ContextUtils.getApplicationContext() == null) {
            return;
        }
        try {
            CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
            if (cameraManager == null) {
                cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
            }
            if (cameraManager == null) {
                return;
            }
            cameraManager.unregisterAvailabilityCallback(this.mCameraAvailableListener);
            this.mCameraAvailableListener = null;
            Logging.m87211i(TAG, "unregister Camera AvailabilityCallback done.");
        } catch (RuntimeException e) {
            Logging.m87213w(TAG, "unregisterAvailabilityCallback error " + e.getMessage());
        }
    }
}
