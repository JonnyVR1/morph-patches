package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.RoomDatabase;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import io.agora.base.NV21Buffer;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.ISurfaceTextureHelper;
import io.agora.base.internal.video.SurfaceTextureHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(15)
public class VideoCaptureCamera1 extends VideoCaptureCamera {
    private static final int CAMERA_ERROR_DISABLED = 3;
    private static final SparseArray<String> COLOR_TEMPERATURES_MAP;
    private static final boolean DEBUG = false;
    private static final int GL_TEXTURE_EXTERNAL_OES = 36197;
    private static int IMAGE_FORMAT = 0;
    private static final int NUM_CAPTURE_BUFFERS = 3;
    private static final String TAG = "VideoCaptureCamera1";
    private static final Object mFocalLengthLock;
    private boolean isFirstFrameCaptured;
    private Camera.Area mAreaOfInterest;

    @Nullable
    private Camera mCamera;
    private volatile boolean mCameraErrorTrigger;
    private int mExpectedFrameSize;
    private boolean mIsRunning;
    private final Object mObjectLock;
    private int mPhysicalId;
    private ReentrantLock mPreviewBufferLock;
    private Camera.Parameters mPreviewParameters;

    @Nullable
    private VideoCaptureFormat mVideoCaptureFormat;
    private boolean physicalCameraInVaild;

    public static class BuggyDeviceHack {
        private static final String[] COLORSPACE_BUGGY_DEVICE_LIST = {"SAMSUNG-SGH-I747", "ODROID-U2", "XT1092", "XT1095", "XT1096", "XT1097"};

        private BuggyDeviceHack() {
        }

        public static int getImageFormat() {
            return isBuggyDevice() ? 17 : 842094169;
        }

        public static boolean isBuggyDevice() {
            for (String str : COLORSPACE_BUGGY_DEVICE_LIST) {
                if (str.contentEquals(Build.MODEL)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class CameraLengthTask implements Runnable {
        static int length;
        final CountDownLatch countDown = new CountDownLatch(1);

        public int getCameraIdLength() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.countDown, 2000L)) {
                Logging.m87209e(VideoCaptureCamera1.TAG, "getNumberOfCameras timeout");
            }
            return length;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    length = Camera.getNumberOfCameras();
                } catch (Exception e) {
                    Logging.m87209e(VideoCaptureCamera1.TAG, "getNumberOfCameras: " + e.toString());
                }
            } finally {
                this.countDown.countDown();
            }
        }
    }

    public class CrErrorCallback implements Camera.ErrorCallback {
        public CrErrorCallback() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            Logging.m87209e(VideoCaptureCamera1.TAG, "Camera ErrorCallback id: " + i);
            int i2 = 3;
            if (i == 2 || i == 100 || i == 1 || i == 3) {
                if (i == 2) {
                    VideoCaptureCamera1.this.mCameraErrorTrigger = true;
                    i2 = 6;
                } else if (i == 100) {
                    VideoCaptureCamera1.this.deallocate();
                    i2 = 5;
                } else {
                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                    if (i == 3) {
                        videoCaptureCamera1.mCameraErrorTrigger = true;
                    } else {
                        videoCaptureCamera1.deallocate();
                        i2 = 901;
                    }
                }
                VideoCaptureCamera1.this.onError(i2, "Camera ErrorCallback id: " + i);
            }
        }
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        COLOR_TEMPERATURES_MAP = sparseArray;
        sparseArray.append(2850, "incandescent");
        sparseArray.append(2950, "warm-fluorescent");
        sparseArray.append(4250, "fluorescent");
        sparseArray.append(4600, "twilight");
        sparseArray.append(5500, "daylight");
        sparseArray.append(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED, "cloudy-daylight");
        sparseArray.append(PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED, "shade");
        IMAGE_FORMAT = 17;
        mFocalLengthLock = new Object();
    }

    public VideoCaptureCamera1(int i, long j, boolean z, boolean z2, int i2, boolean z3, int i3, EglBase.Context context, int i4, int i5, int i6, boolean z4, boolean z5, boolean z6, boolean z7, int i7, int i8, boolean z8) {
        super(i, j, z, z2, i2, z3, i3, context, i4, i5, i6, z4, z5, z6, z7, i7, i8, z8);
        this.mPhysicalId = -1;
        this.mPreviewBufferLock = new ReentrantLock();
        this.physicalCameraInVaild = false;
        this.mCameraErrorTrigger = false;
        this.mObjectLock = new Object();
        this.isFirstFrameCaptured = false;
        if (i8 >= 0) {
            this.mPhysicalId = i8;
        }
    }

    @Nullable
    private static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (RuntimeException e) {
            Logging.m87209e(TAG, "getCameraInfo: Camera.getCameraInfo: " + e.getMessage());
            return null;
        }
    }

    public static int getCaptureApiType(int i) {
        return getCameraInfo(i) == null ? 11 : 6;
    }

    @Nullable
    private String getClosestWhiteBalance(int i, List<String> list) {
        int iAbs;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        String strValueAt = null;
        int i3 = 0;
        while (true) {
            SparseArray<String> sparseArray = COLOR_TEMPERATURES_MAP;
            if (i3 >= sparseArray.size()) {
                return strValueAt;
            }
            if (list.contains(sparseArray.valueAt(i3)) && (iAbs = Math.abs(i - sparseArray.keyAt(i3))) < i2) {
                strValueAt = sparseArray.valueAt(i3);
                i2 = iAbs;
            }
            i3++;
        }
    }

    @Nullable
    public static String getDeviceId(int i) {
        return Integer.toString(i);
    }

    @Nullable
    public static List<VideoCaptureFormat> getDeviceSupportedFormats(int i) {
        Logging.m87211i(TAG, "getDeviceSupportedFormats() " + i);
        synchronized (mFocalLengthLock) {
            Camera.Parameters parameters = null;
            try {
                Camera cameraOpen = Camera.open(i);
                if (cameraOpen == null) {
                    return null;
                }
                try {
                    parameters = cameraOpen.getParameters();
                } catch (RuntimeException e) {
                    Logging.m87210e(TAG, "Failed to get camera parameters " + i, e);
                }
                List<VideoCaptureFormat> formatsFromParemeters = getFormatsFromParemeters(parameters, IMAGE_FORMAT);
                try {
                    cameraOpen.release();
                } catch (Exception e2) {
                    Logging.m87210e(TAG, "Failed to release camera: " + i, e2);
                }
                return formatsFromParemeters;
            } catch (RuntimeException e3) {
                Logging.m87209e(TAG, "Camera.open: " + e3.getMessage());
                return null;
            }
        }
    }

    public static int getFacingMode(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return 0;
        }
        int i2 = cameraInfo.facing;
        if (i2 != 0) {
            return i2 != 1 ? 0 : 1;
        }
        return 2;
    }

    public static float getFocalLength(Camera.Parameters parameters) {
        if (parameters == null) {
            Logging.m87209e(TAG, "failed get focalLength");
            return -1.0f;
        }
        float focalLength = parameters.getFocalLength();
        Logging.m87208d(TAG, "getCameraParameters: Camera.focalLength: " + focalLength);
        return focalLength;
    }

    public static boolean getFocalLengthInfo(int i, int i2, boolean z, FocalLengthInfo[] focalLengthInfoArr) {
        synchronized (mFocalLengthLock) {
            boolean z2 = false;
            int i3 = 0;
            int i4 = 0;
            z2 = false;
            try {
                Camera cameraOpen = Camera.open(i2);
                if (cameraOpen == null) {
                    return false;
                }
                try {
                    float focalLength = getFocalLength(cameraOpen.getParameters());
                    String str = TAG;
                    StringBuilder sb = new StringBuilder("The ");
                    sb.append(z ? "front Camera " : "rear Camera ");
                    sb.append("minimum supported value is: ");
                    sb.append(10.0f * focalLength);
                    sb.append("mm");
                    Logging.m87208d(str, sb.toString());
                    int i5 = (i - 1) * 6;
                    int i6 = (z ? 0 : 3) + i5;
                    focalLengthInfoArr[i6] = new FocalLengthInfo(z ? 1 : 0, i6, i2, 0);
                    try {
                        if (focalLength < 2.4f || focalLength >= 3.5f) {
                            if (focalLength >= 2.4f || focalLength <= 0.1d) {
                                cameraOpen.release();
                                return z2;
                            }
                            if (!z) {
                                i4 = 3;
                            }
                            int i7 = i5 + i4 + 2;
                            Logging.m87208d(str, "getFocalLengthInfo cameraDirection " + (z ? 1 : 0) + " index: " + i7 + " id: " + i2 + " focalLengthType: 2 front: " + z);
                            focalLengthInfoArr[i7] = new FocalLengthInfo(z ? 1 : 0, i7, i2, 2);
                            throw th;
                        }
                        if (!z) {
                            i3 = 3;
                        }
                        int i8 = i5 + i3 + 1;
                        Logging.m87208d(str, "getFocalLengthInfo cameraDirection " + (z ? 1 : 0) + " index: " + i8 + " id: " + i2 + " focalLengthType: 1 front: " + z);
                        focalLengthInfoArr[i8] = new FocalLengthInfo(z ? 1 : 0, i8, i2, 1);
                        cameraOpen.release();
                    } catch (Exception e) {
                        Logging.m87210e(TAG, "Failed to release camera: " + i2, e);
                    }
                    z2 = true;
                    return z2;
                } catch (RuntimeException e2) {
                    Logging.m87210e(TAG, "Failed to get camera parameters " + i2, e2);
                    return false;
                }
            } catch (RuntimeException e3) {
                Logging.m87209e(TAG, "Camera.open: " + e3.getMessage());
                return false;
            }
        }
    }

    @NonNull
    private static List<VideoCaptureFormat> getFormatsFromParemeters(@Nullable Camera.Parameters parameters, int i) {
        List<int[]> arrayList;
        String str = TAG;
        Logging.m87211i(str, "getFormatsFromParemeters() ");
        ArrayList arrayList2 = new ArrayList();
        if (parameters != null) {
            List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
            if (supportedPreviewFormats == null || supportedPreviewFormats.isEmpty()) {
                Logging.m87211i(str, "failed to getFormatsFromParemeters, preview formats null or empty");
                return arrayList2;
            }
            Iterator<Integer> it = supportedPreviewFormats.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == i) {
                    try {
                        arrayList = parameters.getSupportedPreviewFpsRange();
                    } catch (StringIndexOutOfBoundsException e) {
                        Logging.m87209e(TAG, "Camera.Parameters.getSupportedPreviewFpsRange: " + e.getMessage());
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    int i2 = 0;
                    if (arrayList.size() == 0) {
                        arrayList.add(new int[]{0, 0});
                    }
                    Iterator<int[]> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int i3 = (it2.next()[1] + RoomDatabase.MAX_BIND_PARAMETER_CNT) / 1000;
                        if (i2 < i3) {
                            i2 = i3;
                        }
                    }
                    List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
                        for (Camera.Size size : supportedPreviewSizes) {
                            if (!VideoCaptureCamera.shouldExcludeSize(size.width, size.height)) {
                                arrayList2.add(new VideoCaptureFormat(size.width, size.height, i2, 17));
                            }
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    @Nullable
    public static String getName(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo != null) {
            StringBuilder sb = new StringBuilder("camera ");
            sb.append(i);
            sb.append(", facing ");
            sb.append(cameraInfo.facing == 1 ? "front" : "back");
            return sb.toString();
        }
        Logging.m87209e(TAG, "getName: " + i + " , failed to getCameraInfo.");
        return null;
    }

    public static int getNumberOfCameras() {
        return new CameraLengthTask().getCameraIdLength();
    }

    private List<Integer> getZoomRatios() {
        if (this.mCamera == null) {
            return null;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (isZoomSupported(cameraParameters)) {
            return cameraParameters.getZoomRatios();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSupported(String str, List<String> list) {
        return list != null && list.indexOf(str) >= 0;
    }

    private boolean isZoomSupported(Camera.Parameters parameters) {
        if (parameters != null) {
            if (parameters.isZoomSupported()) {
                return true;
            }
            Logging.m87213w(TAG, "camera zoom is not supported!");
        }
        return false;
    }

    private void listenForBytebufferFrames() {
        this.mCamera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.13
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(final byte[] bArr, final Camera camera) {
                VideoCaptureCamera1.this.mPreviewBufferLock.lock();
                if (!VideoCaptureCamera1.this.mIsRunning) {
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    return;
                }
                if (bArr.length == VideoCaptureCamera1.this.mExpectedFrameSize) {
                    VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, VideoCaptureCamera1.this.mCaptureFormat.getWidth(), VideoCaptureCamera1.this.mCaptureFormat.getHeight(), new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.13.1
                        @Override // java.lang.Runnable
                        public void run() {
                            VideoCaptureCamera1.this.mPreviewBufferLock.lock();
                            boolean z = VideoCaptureCamera1.this.mIsRunning;
                            C1506713 c1506713 = C1506713.this;
                            if (!z) {
                                VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                                return;
                            }
                            VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                            if (camera != null) {
                                VideoCaptureCamera1.this.mCamera.addCallbackBuffer(bArr);
                            }
                        }
                    }), VideoCaptureCamera1.this.getCameraRotation(), TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
                    VideoCaptureCamera1.this.attachPerFrameMetaInfos(videoFrame);
                    VideoCaptureCamera1.this.onFrameCaptured(videoFrame);
                    videoFrame.release();
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                } else {
                    VideoCaptureCamera1.this.onFrameDropped(8);
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    if (camera != null) {
                        camera.addCallbackBuffer(bArr);
                    }
                }
                if (VideoCaptureCamera1.this.isFirstFrameCaptured) {
                    return;
                }
                Logging.m87211i(VideoCaptureCamera1.TAG, "first frame captured.");
                VideoCaptureCamera1.this.isFirstFrameCaptured = true;
                VideoCaptureCamera1.this.onFirstFrameCaptured();
            }
        });
    }

    private void listenForTextureFrames() {
        ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
        if (iSurfaceTextureHelper == null) {
            return;
        }
        iSurfaceTextureHelper.startListening(new SurfaceTextureHelper.IVideoCapture() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.12
            @Override // io.agora.base.internal.video.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                VideoCaptureCamera1.this.mPreviewBufferLock.lock();
                try {
                    if (!VideoCaptureCamera1.this.mIsRunning) {
                        VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                        return;
                    }
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                    if (videoCaptureCamera1.mEnableTextureCopy) {
                        buffer = ((SurfaceTextureHelper) videoCaptureCamera1.mSurfaceTextureHelper).textureCopy((VideoFrame.TextureBuffer) videoFrame.getBuffer());
                    }
                    if (buffer == null) {
                        onFrameDropped(9);
                        Logging.m87211i(VideoCaptureCamera1.TAG, "TextureVideoSinkListener copy frame error");
                        VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                        return;
                    }
                    VideoFrame videoFrame2 = new VideoFrame(VideoCapture.createTextureBufferWithModifiedTransformMatrix((TextureBuffer) buffer, !VideoCaptureCamera1.this.mInvertDeviceOrientationReadings, 0), VideoCaptureCamera1.this.getCameraRotation(), videoFrame.getTimestampNs());
                    VideoCaptureCamera1.this.attachPerFrameMetaInfos(videoFrame2);
                    VideoCaptureCamera1.this.onFrameCaptured(videoFrame2);
                    if (VideoCaptureCamera1.this.mEnableTextureCopy) {
                        buffer.release();
                    }
                    videoFrame2.release();
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    if (VideoCaptureCamera1.this.isFirstFrameCaptured) {
                        return;
                    }
                    Logging.m87211i(VideoCaptureCamera1.TAG, "first frame captured.");
                    VideoCaptureCamera1.this.isFirstFrameCaptured = true;
                    VideoCaptureCamera1.this.onFirstFrameCaptured();
                } catch (Throwable th) {
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    throw th;
                }
            }

            @Override // io.agora.base.internal.video.SurfaceTextureHelper.IVideoCapture
            public void onFrameDropped(int i) {
                VideoCaptureCamera1.super.onFrameDropped(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFaceDetection(Camera.Face[] faceArr) {
        double dPow;
        double d;
        ArrayList<RectF> arrayList = new ArrayList<>();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        Camera.Parameters cameraParameters = getCameraParameters();
        this.mPreviewParameters = cameraParameters;
        if (cameraParameters == null || cameraParameters.getPreviewSize() == null) {
            return;
        }
        for (Camera.Face face2 : faceArr) {
            RectF rectFCameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(face2.rect));
            if (rectFCameraToNormalized != null) {
                if (this.mId == 1) {
                    dPow = Math.pow(rectFCameraToNormalized.width(), -0.958d);
                    d = 11.237d;
                } else {
                    dPow = Math.pow(rectFCameraToNormalized.height(), -0.971d);
                    d = 14.719d;
                }
                arrayList2.add(Double.valueOf(dPow * d));
                int width = this.mRenderView.getWidth();
                int height = this.mRenderView.getHeight();
                int i = this.mPreviewParameters.getPreviewSize().width;
                int i2 = this.mPreviewParameters.getPreviewSize().height;
                int i3 = this.mId;
                RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFCameraToNormalized, width, height, i, i2, i3 == 1, getCameraRotation() * (i3 == 1 ? 1 : -1), this.mRenderMode);
                if (rectFNormalizedToView == null) {
                    arrayList2.remove(arrayList2.size() - 1);
                } else {
                    arrayList.add(rectFNormalizedToView);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        notifyFaceDetection(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), arrayList, arrayList2);
    }

    private void onFaceDetectionRequestChanged() {
        if (this.mEnableAutoFaceFocus) {
            Logging.m87211i(TAG, "startFaceDetection for auto focus enabled");
            Camera.FaceDetectionListener faceDetectionListener = new Camera.FaceDetectionListener() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.3
                private long mLastFocusedTs;

                @Override // android.hardware.Camera.FaceDetectionListener
                public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                    if (videoCaptureCamera1.mEnableFaceDetection) {
                        videoCaptureCamera1.notifyFaceDetection(faceArr);
                    }
                    if (faceArr == null || faceArr.length == 0 || camera == null || !VideoCaptureCamera1.this.mEnableAutoFaceFocus) {
                        return;
                    }
                    if (System.currentTimeMillis() - this.mLastFocusedTs < 3000) {
                        Camera.Face face2 = faceArr[0];
                        if (face2.score > 20) {
                            Rect rect = face2.rect;
                            if (rect != null && !rect.equals(VideoCaptureCamera1.this.lastFocusAreaRect)) {
                                VideoCaptureCamera1.this.notifyCameraFocusAreaChanged(faceArr[0].rect);
                            }
                            VideoCaptureCamera1.this.lastFocusAreaRect = faceArr[0].rect;
                            return;
                        }
                        return;
                    }
                    if (faceArr[0].score <= 50) {
                        Logging.m87208d(VideoCaptureCamera1.TAG, "face score = " + faceArr[0].score);
                        this.mLastFocusedTs = System.currentTimeMillis();
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(faceArr[0].rect, 1000));
                        if (camera.getParameters().getMaxNumFocusAreas() > 0) {
                            camera.getParameters().setFocusAreas(arrayList);
                        }
                        if (camera.getParameters().getMaxNumMeteringAreas() > 0) {
                            camera.getParameters().setMeteringAreas(arrayList);
                        }
                        VideoCaptureCamera1.this.notifyCameraFocusAreaChanged(faceArr[0].rect);
                        if (VideoCaptureCamera1.this.isAutoFaceFocusSupported()) {
                            camera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.3.1
                                @Override // android.hardware.Camera.AutoFocusCallback
                                public void onAutoFocus(boolean z, Camera camera2) {
                                    Logging.m87208d(VideoCaptureCamera1.TAG, "auto face focus called api1 every 3 seconds");
                                    if (camera2 != null) {
                                        try {
                                            camera2.cancelAutoFocus();
                                        } catch (RuntimeException e) {
                                            Logging.m87213w(VideoCaptureCamera1.TAG, "Exception in cancelAutoFocus: " + Log.getStackTraceString(e));
                                        }
                                    }
                                }
                            });
                        }
                        this.mLastFocusedTs = System.currentTimeMillis();
                    } catch (RuntimeException e) {
                        Logging.m87213w(VideoCaptureCamera1.TAG, "Exception in onFaceDetection callback: " + Log.getStackTraceString(e));
                    }
                }
            };
            if (isFaceDetectSupported()) {
                safetyStarFaceDetection(faceDetectionListener);
                return;
            }
            return;
        }
        if (!this.mEnableFaceDetection || !isFaceDetectSupported()) {
            safetyStopFaceDetection();
            return;
        }
        Camera.FaceDetectionListener faceDetectionListener2 = new Camera.FaceDetectionListener() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.4
            @Override // android.hardware.Camera.FaceDetectionListener
            public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                if (videoCaptureCamera1.mEnableFaceDetection) {
                    videoCaptureCamera1.notifyFaceDetection(faceArr);
                }
            }
        };
        Logging.m87211i(TAG, "startFaceDetection for face dectect enabled");
        safetyStarFaceDetection(faceDetectionListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstFrameCaptured() {
        if (this.mIsmCameraExposureStarted) {
            return;
        }
        float[] fArr = this.mCameraExposurePositions;
        float f = fArr[0];
        if (f > 0.0f) {
            float f2 = fArr[1];
            if (f2 > 0.0f) {
                setExposure(f, f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean physicalFallback() {
        synchronized (mFocalLengthLock) {
            try {
                try {
                    this.mCamera = Camera.open(this.mId);
                } catch (RuntimeException e) {
                    Logging.m87209e(TAG, "allocate: Camera.open: " + e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @NonNull
    public static List<FocalLengthInfo> queryCameraFocalLengthCapability() {
        int numberOfCameras = getNumberOfCameras();
        if (numberOfCameras <= 0) {
            return null;
        }
        FocalLengthInfo[] focalLengthInfoArr = new FocalLengthInfo[12];
        boolean z = false;
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            int iMax = Math.max(1, 0);
            int i2 = cameraInfo.facing;
            if (i <= iMax) {
                if (getFocalLengthInfo(1, i, i2 == 1, focalLengthInfoArr)) {
                    z = true;
                }
            } else if (getFocalLengthInfo(2, i, i2 == 1, focalLengthInfoArr)) {
                z = true;
            }
        }
        if (z) {
            Logging.m87208d(TAG, "Logical Camera, FocalLengths available.");
        } else {
            Logging.m87213w(TAG, "Logical Camera, FocalLengths empty!");
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 12; i3++) {
            FocalLengthInfo focalLengthInfo = focalLengthInfoArr[i3];
            if (!arrayList.contains(focalLengthInfo)) {
                arrayList.add(focalLengthInfo);
            }
        }
        return arrayList;
    }

    private void releaseCamera() {
        Handler handler = this.mProxyThreadHandler;
        if (handler == null) {
            Logging.m87213w(TAG, "proxyThread unavailable");
            return;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, 2000L, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.11
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    try {
                        if (VideoCaptureCamera1.this.mCamera != null) {
                            VideoCaptureCamera1.this.mCamera.release();
                            VideoCaptureCamera1.this.mCamera = null;
                            Logging.m87211i(VideoCaptureCamera1.TAG, "releaseCamera done!");
                        }
                    } catch (Exception e) {
                        Logging.m87209e(VideoCaptureCamera1.TAG, "releaseCamera: failed to release camera, " + e.getMessage());
                    }
                    return null;
                }
            });
        } catch (Exception e) {
            Logging.m87209e(TAG, "releaseCamera: failed to release camera, " + e.getMessage());
        }
    }

    private void safetyStarFaceDetection(Camera.FaceDetectionListener faceDetectionListener) {
        Logging.m87211i(TAG, "facedetect: " + this.mEnableFaceDetection);
        try {
            Camera camera = this.mCamera;
            if (camera != null) {
                if (this.mIsFaceDetectionStarted) {
                    camera.stopFaceDetection();
                }
                this.mCamera.setFaceDetectionListener(faceDetectionListener);
                this.mCamera.startFaceDetection();
                this.mIsFaceDetectionStarted = true;
            }
        } catch (Exception e) {
            Logging.m87210e(TAG, "Failed to stop face detection", e);
            Camera camera2 = this.mCamera;
            if (camera2 != null) {
                camera2.stopFaceDetection();
                this.mCamera.setFaceDetectionListener(null);
                this.mIsFaceDetectionStarted = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safetyStopFaceDetection() {
        Logging.m87211i(TAG, "stopFaceDetection()");
        try {
            if (this.mIsFaceDetectionStarted) {
                Camera camera = this.mCamera;
                if (camera != null) {
                    camera.stopFaceDetection();
                }
                this.mIsFaceDetectionStarted = false;
                this.mPerFrameFaceDetectionInfoQueue.clear();
            }
        } catch (RuntimeException e) {
            Logging.m87210e(TAG, "Failed to stop face detection", e);
        } finally {
            Camera camera2 = this.mCamera;
            if (camera2 != null) {
                camera2.setFaceDetectionListener(null);
            }
        }
    }

    private void setPreviewFrameRateMode(Camera.Parameters parameters, int i, boolean z) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() == 0) {
            Logging.m87213w(TAG, "allocate: camera don't supported fps first.");
            parameters.setPreviewFrameRate(i);
            return;
        }
        int i2 = supportedPreviewFpsRange.get(0)[0] > 1000 ? 1 : 1000;
        ArrayList arrayList = new ArrayList(supportedPreviewFpsRange.size());
        for (int[] iArr : supportedPreviewFpsRange) {
            arrayList.add(new VideoCapture.FramerateRange(iArr[0] * i2, iArr[1] * i2));
        }
        VideoCapture.FramerateRange framerateRangeFindBestFrameRateRange = VideoCaptureCamera.findBestFrameRateRange(arrayList, i * 1000, z);
        if (framerateRangeFindBestFrameRateRange != null) {
            parameters.setPreviewFpsRange(framerateRangeFindBestFrameRateRange.min / i2, framerateRangeFindBestFrameRateRange.max / i2);
        }
    }

    private void setPreviewFrameRateModePQ(Camera.Parameters parameters, int i) {
        List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.size() == 0) {
            Logging.m87213w(TAG, "allocate: camera don't supported PQ first.");
            setPreviewFrameRateMode(parameters, i, false);
            return;
        }
        int iAbs = Math.abs(supportedPreviewFrameRates.get(0).intValue() - i);
        int iIntValue = supportedPreviewFrameRates.get(0).intValue();
        for (Integer num : supportedPreviewFrameRates) {
            int iAbs2 = Math.abs(num.intValue() - i);
            if (iAbs2 < iAbs) {
                iIntValue = num.intValue();
                iAbs = iAbs2;
            }
        }
        parameters.setPreviewFrameRate(iIntValue);
        Logging.m87211i(TAG, String.format(Locale.US, "allocate: matched (%d x %d) @%d -set- @%d, PQ first", Integer.valueOf(this.mCaptureFormat.mWidth), Integer.valueOf(this.mCaptureFormat.mHeight), Integer.valueOf(i), Integer.valueOf(iIntValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toCamera1ABMode(int i) {
        if (i == 0) {
            return BLiveOperationTitleShowType.off;
        }
        if (i != 1) {
            return i != 2 ? "auto" : "60hz";
        }
        return "50hz";
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        Camera.Parameters parameters;
        int i;
        int i2;
        String str = TAG;
        Locale locale = Locale.US;
        Logging.m87211i(str, String.format(locale, "allocate: requested (%d x %d) @%dfps", Integer.valueOf(videoCaptureFormat.getWidth()), Integer.valueOf(videoCaptureFormat.getHeight()), Integer.valueOf(videoCaptureFormat.getFramerate())));
        if (this.mSurfaceTextureHelper == null) {
            Logging.m87209e(str, "surfaceTextureHelper null");
            return false;
        }
        if (this.mProxyThreadHandler == null) {
            Logging.m87213w(str, "proxyThread unavailable");
            return false;
        }
        Camera.CameraInfo cameraInfo = getCameraInfo(this.mId);
        if (cameraInfo == null) {
            Logging.m87209e(str, "failed to get camera info for " + this.mId);
            releaseCamera();
            return false;
        }
        this.physicalCameraInVaild = false;
        try {
            Boolean bool = (Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Boolean>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    Logging.m87211i(VideoCaptureCamera1.TAG, "allocate openCamera camera name:" + VideoCaptureCamera1.this.mPhysicalId);
                    if (VideoCaptureCamera1.this.mPhysicalId >= 0) {
                        synchronized (VideoCaptureCamera1.mFocalLengthLock) {
                            try {
                                Logging.m87211i(VideoCaptureCamera1.TAG, "allocate openCamera start");
                                VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                                videoCaptureCamera1.mCamera = Camera.open(videoCaptureCamera1.mPhysicalId);
                                Logging.m87211i(VideoCaptureCamera1.TAG, "allocate openCamera done");
                            } catch (RuntimeException e) {
                                Logging.m87209e(VideoCaptureCamera1.TAG, "allocate: Camera.open: " + e.getMessage());
                                VideoCaptureCamera1.this.physicalCameraInVaild = true;
                            }
                        }
                        if (!VideoCaptureCamera1.this.physicalCameraInVaild) {
                            VideoCaptureCamera1 videoCaptureCamera2 = VideoCaptureCamera1.this;
                            videoCaptureCamera2.mId = videoCaptureCamera2.mPhysicalId;
                        }
                    } else {
                        synchronized (VideoCaptureCamera1.mFocalLengthLock) {
                            try {
                                Logging.m87211i(VideoCaptureCamera1.TAG, "allocate openCamera start");
                                VideoCaptureCamera1 videoCaptureCamera3 = VideoCaptureCamera1.this;
                                videoCaptureCamera3.mCamera = Camera.open(videoCaptureCamera3.mId);
                                Logging.m87211i(VideoCaptureCamera1.TAG, "allocate openCamera done");
                            } catch (RuntimeException e2) {
                                Logging.m87209e(VideoCaptureCamera1.TAG, "allocate: Camera.open: " + e2.getMessage());
                                return Boolean.FALSE;
                            }
                        }
                    }
                    return (!VideoCaptureCamera1.this.physicalCameraInVaild || VideoCaptureCamera1.this.physicalFallback()) ? Boolean.TRUE : Boolean.FALSE;
                }
            });
            Logging.m87211i(str, "allocate openCamera result:" + bool);
            if (bool != null && bool.booleanValue()) {
                this.mVideoCaptureFormat = videoCaptureFormat;
                this.mCameraNativeOrientation = cameraInfo.orientation;
                this.mInvertDeviceOrientationReadings = cameraInfo.facing == 0;
                Logging.m87211i(str, String.format(locale, "allocate: Rotation dev=%d, cam=%d, facing back? %s", Integer.valueOf(getDeviceRotation()), Integer.valueOf(this.mCameraNativeOrientation), Boolean.valueOf(this.mInvertDeviceOrientationReadings)));
                try {
                    parameters = this.mCamera.getParameters();
                } catch (RuntimeException e) {
                    Logging.m87210e(TAG, "failed to get camera parameters for " + this.mId, e);
                    parameters = null;
                }
                if (parameters == null) {
                    Logging.m87209e(TAG, "failed to get camera parameters");
                    releaseCamera();
                    return false;
                }
                List<VideoCaptureFormat> formatsFromParemeters = getFormatsFromParemeters(parameters, IMAGE_FORMAT);
                if (formatsFromParemeters == null) {
                    return false;
                }
                String str2 = TAG;
                Logging.m87211i(str2, "format list: " + Arrays.toString(formatsFromParemeters.toArray()));
                VideoCaptureFormat videoCaptureFormatFindBestMatchedCapability = VideoCapture.FindBestMatchedCapability(formatsFromParemeters, videoCaptureFormat);
                this.mCaptureFormat = videoCaptureFormatFindBestMatchedCapability;
                if (videoCaptureFormatFindBestMatchedCapability == null) {
                    Logging.m87209e(str2, "failed to match capability");
                    releaseCamera();
                    return false;
                }
                int i3 = videoCaptureFormatFindBestMatchedCapability.mFramerate;
                if (this.mCameraFpsRangeEnable || !this.mPQFirst) {
                    setPreviewFrameRateMode(parameters, i3, this.mPQFirst);
                } else {
                    setPreviewFrameRateModePQ(parameters, i3);
                }
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes != null && this.mCameraFocusMode != 0) {
                    Logging.m87211i(str2, "supported focusModes: " + Arrays.toString(supportedFocusModes.toArray()));
                    if (supportedFocusModes.contains("continuous-video") && ((i2 = this.mCameraFocusMode) == 2 || i2 == 1)) {
                        parameters.setFocusMode("continuous-video");
                        Logging.m87211i(str2, "Continuous focus mode continuous video.");
                    } else if (supportedFocusModes.contains("continuous-picture") && ((i = this.mCameraFocusMode) == 3 || i == 1)) {
                        parameters.setFocusMode("continuous-picture");
                        Logging.m87211i(str2, "Continuous focus mode continuous picture.");
                    } else if (supportedFocusModes.contains("auto") && this.mCameraFocusMode == 1) {
                        parameters.setFocusMode("auto");
                        Logging.m87211i(str2, "Continuous focus mode auto.");
                    } else {
                        Logging.m87211i(str2, "Continuous focus mode not supported.");
                    }
                }
                if (this.mSkipControl == 1 || !parameters.getSupportedFocusModes().contains("continuous-video")) {
                    Logging.m87211i(str2, "Continuous focus mode not supported.");
                } else {
                    parameters.setFocusMode("continuous-video");
                }
                List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
                if (supportedWhiteBalance != null) {
                    Logging.m87211i(str2, "Camera " + this.mId + "supports white balance: " + Arrays.toString(supportedWhiteBalance.toArray()));
                    if (this.mCameraAutoWhiteBalance && supportedWhiteBalance.contains("auto")) {
                        parameters.setWhiteBalance("auto");
                    }
                }
                VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
                parameters.setPreviewSize(videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight);
                parameters.setPreviewFormat(this.mCaptureFormat.mPixelFormat);
                try {
                    this.mCamera.setParameters(parameters);
                    try {
                        ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
                        VideoCaptureFormat videoCaptureFormat3 = this.mCaptureFormat;
                        iSurfaceTextureHelper.setTextureSize(videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight);
                        this.mCamera.setPreviewTexture(this.mSurfaceTextureHelper.getSurfaceTexture());
                        CrErrorCallback crErrorCallback = new CrErrorCallback();
                        notifyInjector(crErrorCallback);
                        this.mCamera.setErrorCallback(crErrorCallback);
                        if (!this.mCaptureToTexture) {
                            VideoCaptureFormat videoCaptureFormat4 = this.mCaptureFormat;
                            this.mExpectedFrameSize = ((videoCaptureFormat4.mWidth * videoCaptureFormat4.mHeight) * ImageFormat.getBitsPerPixel(videoCaptureFormat4.mPixelFormat)) / 8;
                            for (int i4 = 0; i4 < 3; i4++) {
                                this.mCamera.addCallbackBuffer(new byte[this.mExpectedFrameSize]);
                            }
                        }
                        this.mCamera.setDisplayOrientation(0);
                        return true;
                    } catch (IOException e2) {
                        Logging.m87209e(TAG, "allocate: " + e2.getMessage());
                        releaseCamera();
                        return false;
                    } catch (Exception e3) {
                        Logging.m87209e(TAG, "allocate: " + e3.getMessage());
                        releaseCamera();
                        return false;
                    }
                } catch (Exception e4) {
                    Logging.m87209e(TAG, "setParameters: " + e4.getMessage());
                    releaseCamera();
                }
            }
            return false;
        } catch (Exception e5) {
            Logging.m87209e(TAG, "allocate: " + e5.getMessage());
            return false;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        String str = TAG;
        Logging.m87211i(str, "deallocate()");
        stopCaptureAndBlockUntilStopped();
        Handler handler = this.mProxyThreadHandler;
        if (handler == null) {
            Logging.m87213w(str, "proxyThread unavailable");
        } else {
            handler.post(new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (VideoCaptureCamera1.this.mCamera != null) {
                            VideoCaptureCamera1.this.mCamera.setPreviewTexture(null);
                        }
                    } catch (Exception e) {
                        Logging.m87209e(VideoCaptureCamera1.TAG, "deallocate: failed to setPreviewTexture " + e.getMessage());
                    }
                    VideoCaptureCamera1.this.mCaptureFormat = null;
                }
            });
            releaseCamera();
        }
    }

    public Camera.Parameters getCameraParameters() {
        try {
            return this.mCamera.getParameters();
        } catch (RuntimeException e) {
            Logging.m87210e(TAG, "getCameraParameters: Camera.getParameters: ", e);
            if (this.mCamera == null) {
                return null;
            }
            safetyStopFaceDetection();
            releaseCamera();
            return null;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public float getMaxZoom() {
        if (this.mCamera == null) {
            return -1.0f;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        int maxZoom = isZoomSupported(cameraParameters) ? cameraParameters.getMaxZoom() : 0;
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null || zoomRatios.size() <= maxZoom) {
            return -1.0f;
        }
        return zoomRatios.get(maxZoom).intValue() / 100.0f;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isAutoFaceFocusSupported() {
        Camera.Parameters cameraParameters;
        return this.mCamera != null && (cameraParameters = getCameraParameters()) != null && cameraParameters.getMaxNumDetectedFaces() > 0 && cameraParameters.getMaxNumFocusAreas() > 0 && isSupported("auto", cameraParameters.getSupportedFocusModes());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isCameraExposureSupported() {
        Camera.Parameters cameraParameters;
        if (this.mCamera != null && (cameraParameters = getCameraParameters()) != null) {
            int minExposureCompensation = cameraParameters.getMinExposureCompensation();
            int maxExposureCompensation = cameraParameters.getMaxExposureCompensation();
            Logging.m87211i(TAG, "isCameraExposureSupported compensation min: " + minExposureCompensation + " max: " + maxExposureCompensation);
            if (minExposureCompensation < 0 && maxExposureCompensation > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isExposureSupported() {
        Camera.Parameters cameraParameters;
        return (this.mCamera == null || (cameraParameters = getCameraParameters()) == null || cameraParameters.getMaxNumMeteringAreas() <= 0) ? false : true;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFaceDetectSupported() {
        Camera.Parameters cameraParameters;
        if (this.mCamera != null && (cameraParameters = getCameraParameters()) != null) {
            Logging.m87211i(TAG, "face dedect, numDetectedFaces: " + cameraParameters.getMaxNumDetectedFaces());
            if (cameraParameters.getMaxNumDetectedFaces() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFocusSupported() {
        Camera.Parameters cameraParameters;
        return this.mCamera != null && (cameraParameters = getCameraParameters()) != null && cameraParameters.getMaxNumFocusAreas() > 0 && isSupported("auto", cameraParameters.getSupportedFocusModes());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isTorchSupported() {
        Camera.Parameters cameraParameters;
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return false;
        }
        return isSupported("torch", cameraParameters.getSupportedFlashModes());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean needFallback() {
        return false;
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraAvailable(String str) {
        if (str.equals(Integer.toString(this.mId))) {
            if (getCameraInfo(this.mId) == null) {
                Logging.m87209e(TAG, "failed to get camera info for " + this.mId);
                return;
            }
            this.mPreviewBufferLock.lock();
            try {
                if (this.mIsRunning && this.mCameraErrorTrigger) {
                    this.mPreviewBufferLock.unlock();
                    onAvailable(0);
                    return;
                }
                Logging.m87211i(TAG, "onCameraAvailable, Wrong state, mIsRunning: " + this.mIsRunning + " cameraError: " + this.mCameraErrorTrigger);
                this.mPreviewBufferLock.unlock();
            } catch (Throwable th) {
                this.mPreviewBufferLock.unlock();
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraUnavailable(String str) {
        if (str.equals(Integer.toString(this.mId))) {
            if (getCameraInfo(this.mId) == null) {
                Logging.m87209e(TAG, "failed to get camera info for " + this.mId);
                return;
            }
            this.mPreviewBufferLock.lock();
            try {
                if (this.mIsRunning && this.mCameraErrorTrigger) {
                    this.mPreviewBufferLock.unlock();
                    onAvailable(1);
                    return;
                }
                Logging.m87211i(TAG, "onCameraUnavailable, Wrong state, mIsRunning: " + this.mIsRunning + " cameraError: " + this.mCameraErrorTrigger);
                this.mPreviewBufferLock.unlock();
            } catch (Throwable th) {
                this.mPreviewBufferLock.unlock();
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAntiBandingMode(final int i) {
        Integer num;
        Handler handler = this.mProxyThreadHandler;
        if (handler == null || (num = (Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() {
                Camera.Parameters parameters;
                Logging.m87211i(VideoCaptureCamera1.TAG, "setAntiBandingMode:" + i);
                String camera1ABMode = VideoCaptureCamera1.this.toCamera1ABMode(i);
                if (VideoCaptureCamera1.this.mCamera == null || (parameters = VideoCaptureCamera1.this.mCamera.getParameters()) == null) {
                    return -1;
                }
                if (!VideoCaptureCamera1.isSupported(camera1ABMode, parameters.getSupportedAntibanding())) {
                    Logging.m87209e(VideoCaptureCamera1.TAG, "not supported anti-banding = " + camera1ABMode);
                    return -1;
                }
                Logging.m87211i(VideoCaptureCamera1.TAG, "AgoraVideo set anti-banding = " + camera1ABMode);
                parameters.setAntibanding(camera1ABMode);
                try {
                    VideoCaptureCamera1.this.mCamera.setParameters(parameters);
                } catch (Exception e) {
                    Logging.m87209e(VideoCaptureCamera1.TAG, "anti banding got exception:" + e);
                }
                return 0;
            }
        })) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAutoFaceFocus(boolean z) {
        if (this.mEnableAutoFaceFocus == z) {
            return 0;
        }
        this.mEnableAutoFaceFocus = z;
        onFaceDetectionRequestChanged();
        return 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setEdgeEnhanceMode(int i) {
        Logging.m87209e(TAG, "EdgeEnhancement not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposure(float f, float f2) {
        if (this.mCamera == null || this.mRenderView.getWidth() == 0 || this.mRenderView.getHeight() == 0) {
            float[] fArr = this.mCameraExposurePositions;
            fArr[0] = f;
            fArr[1] = f2;
            return 0;
        }
        if (this.mIsmCameraExposureStarted && Math.abs(this.mCameraExposurePositions[0] - f) < 0.1d && Math.abs(this.mCameraExposurePositions[1] - f2) < 0.1d) {
            return 0;
        }
        float[] fArr2 = this.mCameraExposurePositions;
        fArr2[0] = f;
        fArr2[1] = f2;
        String str = TAG;
        Logging.m87211i(str, "setExposure called camera api1 x = " + f + " y = " + f2);
        if (f < 0.0f || f > this.mRenderView.getWidth() || f2 < 0.0f || f2 > this.mRenderView.getHeight()) {
            Logging.m87211i(str, "setExposure unreasonable inputs!");
            return -1;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        this.mPreviewParameters = cameraParameters;
        if (cameraParameters == null || cameraParameters.getPreviewSize() == null) {
            return -1;
        }
        RectF rectF = new RectF(f, f2, f, f2);
        int width = this.mRenderView.getWidth();
        int height = this.mRenderView.getHeight();
        int i = this.mPreviewParameters.getPreviewSize().width;
        int i2 = this.mPreviewParameters.getPreviewSize().height;
        int i3 = this.mId;
        RectF rectFViewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i, i2, i3 == 1, (i3 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
        if (rectFViewToNormalized == null) {
            Logging.m87213w(str, "Failed to translate input coordinate");
            return -1;
        }
        Rect rectCalculateFocusArea = CoordinatesTransform.calculateFocusArea(rectFViewToNormalized.left, rectFViewToNormalized.top, 1.5f);
        if (this.mCamera != null) {
            Camera.Parameters cameraParameters2 = getCameraParameters();
            if (cameraParameters2 == null) {
                Logging.m87208d(str, "getCameraParameters null");
                return -1;
            }
            if (cameraParameters2.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(rectCalculateFocusArea, 800));
                cameraParameters2.setMeteringAreas(arrayList);
            } else {
                Logging.m87211i(str, "metering areas not supported");
            }
            try {
                this.mCamera.setParameters(cameraParameters2);
                this.mIsmCameraExposureStarted = true;
            } catch (Exception e) {
                Logging.m87211i(TAG, "setExposure failed, " + e);
                return -1;
            }
        }
        RectF rectFCameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(rectCalculateFocusArea));
        if (rectFCameraToNormalized == null) {
            Logging.m87209e(str, "Failed to translate input coordinate");
            return -1;
        }
        VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
        int i4 = videoCaptureFormat.mWidth;
        int i5 = videoCaptureFormat.mHeight;
        RectF rectFNormalizedToSensor = CoordinatesTransform.normalizedToSensor(rectFCameraToNormalized, i4, i5, i4, i5, 0, false);
        if (rectFNormalizedToSensor == null) {
            Logging.m87209e(str, "Failed to translate input coordinate");
            return -1;
        }
        rectFNormalizedToSensor.round(rectCalculateFocusArea);
        Rect rect = new Rect();
        RectF rectF2 = new RectF(rectCalculateFocusArea);
        int width2 = this.mCaptureFormat.getWidth();
        int height2 = this.mCaptureFormat.getHeight();
        VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
        RectF rectFSensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF2, width2, height2, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, false);
        int width3 = this.mRenderView.getWidth();
        int height3 = this.mRenderView.getHeight();
        int width4 = this.mCaptureFormat.getWidth();
        int height4 = this.mCaptureFormat.getHeight();
        int i6 = this.mId;
        RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFSensorToNormalized, width3, height3, width4, height4, i6 == 1, (i6 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
        if (rectFNormalizedToView == null) {
            Logging.m87213w(str, "failed to translate coordinate from normalized to view!");
            return -1;
        }
        rectFNormalizedToView.round(rect);
        notifyCameraExposureAreaChanged(rect);
        return 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposureCompensation(int i) {
        if (this.mCamera == null) {
            this.mCameraExposureCompensation = i;
            return 0;
        }
        if (this.mIsExposureCompensationStarted && this.mCameraExposureCompensation == i) {
            return 0;
        }
        this.mCameraExposureCompensation = i;
        String str = TAG;
        Logging.m87211i(str, "setExposureCompensation:" + i);
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (parameters == null) {
            return -1;
        }
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        Logging.m87211i(str, "compensation step=" + exposureCompensationStep + ", min=" + minExposureCompensation + ", max=" + maxExposureCompensation + ", cur index=" + parameters.getExposureCompensation());
        if (i <= maxExposureCompensation) {
            maxExposureCompensation = i;
        }
        if (i >= minExposureCompensation) {
            minExposureCompensation = maxExposureCompensation;
        }
        parameters.setExposureCompensation(minExposureCompensation);
        try {
            this.mIsExposureCompensationStarted = true;
            this.mCamera.setParameters(parameters);
            int exposureCompensation = parameters.getExposureCompensation();
            Logging.m87211i(str, "cur index=" + exposureCompensation + ", ev=" + (exposureCompensationStep * exposureCompensation));
            return 0;
        } catch (Exception e) {
            Logging.m87209e(TAG, "exposure compensation got exception:" + e);
            return -1;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFaceDetection(boolean z) {
        if (this.mEnableFaceDetection == z) {
            return 0;
        }
        this.mEnableFaceDetection = z;
        onFaceDetectionRequestChanged();
        return 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFocus(float f, float f2) {
        if (this.mCamera == null || this.mRenderView.getWidth() == 0 || this.mRenderView.getHeight() == 0) {
            float[] fArr = this.mCameraFocusPositions;
            fArr[0] = f;
            fArr[1] = f2;
            return 0;
        }
        if (this.mIsmCameraFocusStarted && Math.abs(this.mCameraFocusPositions[0] - f) < 0.1d && Math.abs(this.mCameraFocusPositions[1] - f2) < 0.1d) {
            return 0;
        }
        float[] fArr2 = this.mCameraFocusPositions;
        fArr2[0] = f;
        fArr2[1] = f2;
        String str = TAG;
        Logging.m87211i(str, "setFocus " + f + " - " + f2);
        if (f < 0.0f || f > this.mRenderView.getWidth() || f2 < 0.0f || f2 > this.mRenderView.getHeight()) {
            Logging.m87209e(str, "set focus unreasonable inputs");
            return -1;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        this.mPreviewParameters = cameraParameters;
        if (cameraParameters != null && cameraParameters.getPreviewSize() != null) {
            RectF rectF = new RectF(f, f2, f, f2);
            int width = this.mRenderView.getWidth();
            int height = this.mRenderView.getHeight();
            int i = this.mPreviewParameters.getPreviewSize().width;
            int i2 = this.mPreviewParameters.getPreviewSize().height;
            int i3 = this.mId;
            RectF rectFViewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i, i2, i3 == 1, (i3 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
            if (rectFViewToNormalized == null) {
                Logging.m87209e(str, "Failed to translate input coordinate");
                return -1;
            }
            float f3 = rectFViewToNormalized.left;
            float f4 = rectFViewToNormalized.top;
            Rect rectCalculateFocusArea = CoordinatesTransform.calculateFocusArea(f3, f4, 1.0f);
            Rect rectCalculateFocusArea2 = CoordinatesTransform.calculateFocusArea(f3, f4, 1.5f);
            Objects.toString(rectCalculateFocusArea);
            Objects.toString(rectCalculateFocusArea2);
            try {
                this.mCamera.cancelAutoFocus();
            } catch (RuntimeException e) {
                Logging.m87213w(TAG, "Failed to cancle AutoFocus" + e);
            }
            Camera.Parameters cameraParameters2 = getCameraParameters();
            if (cameraParameters2 == null) {
                return -1;
            }
            if (cameraParameters2.getMaxNumFocusAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(rectCalculateFocusArea, 800));
                cameraParameters2.setFocusAreas(arrayList);
            } else {
                Logging.m87213w(TAG, "focus areas not supported");
            }
            if (cameraParameters2.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Camera.Area(rectCalculateFocusArea2, 800));
                cameraParameters2.setMeteringAreas(arrayList2);
            } else {
                Logging.m87213w(TAG, "metering areas not supported");
            }
            RectF rectFNormalizedToSensor = CoordinatesTransform.normalizedToSensor(CoordinatesTransform.cameraToNormalized(new RectF(rectCalculateFocusArea2)), this.mPreviewParameters.getPreviewSize().width, this.mPreviewParameters.getPreviewSize().height, this.mPreviewParameters.getPreviewSize().width, this.mPreviewParameters.getPreviewSize().height, 0, false);
            if (rectFNormalizedToSensor == null) {
                Logging.m87209e(TAG, "Failed to translate input coordinate");
                return -1;
            }
            rectFNormalizedToSensor.round(rectCalculateFocusArea2);
            final String focusMode = cameraParameters2.getFocusMode();
            if (isSupported("macro", cameraParameters2.getSupportedFocusModes())) {
                cameraParameters2.setFocusMode("macro");
                synchronized (this.mObjectLock) {
                    try {
                        this.mCamera.setParameters(cameraParameters2);
                    } catch (Exception e2) {
                        Logging.m87213w(TAG, "mCamera.setParameters Exception: " + e2);
                    }
                }
            } else {
                Logging.m87213w("focus", "FOCUS_MODE_MACRO is not supported");
            }
            try {
                this.mIsmCameraFocusStarted = true;
                this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.8
                    @Override // android.hardware.Camera.AutoFocusCallback
                    public void onAutoFocus(boolean z, Camera camera) {
                        if (VideoCaptureCamera1.this.mCamera == null || VideoCaptureCamera.shouldSkipRefocus()) {
                            return;
                        }
                        Camera.Parameters parameters = camera.getParameters();
                        parameters.setFocusMode(focusMode);
                        synchronized (VideoCaptureCamera1.this.mObjectLock) {
                            try {
                                camera.setParameters(parameters);
                            } catch (Exception e3) {
                                Logging.m87213w(VideoCaptureCamera1.TAG, "mCamera setParameters Exception: " + e3);
                            }
                        }
                    }
                });
                Rect rect = new Rect();
                RectF rectF2 = new RectF(rectCalculateFocusArea2);
                int width2 = this.mCaptureFormat.getWidth();
                int height2 = this.mCaptureFormat.getHeight();
                VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
                RectF rectFSensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF2, width2, height2, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, false);
                int width3 = this.mRenderView.getWidth();
                int height3 = this.mRenderView.getHeight();
                int width4 = this.mCaptureFormat.getWidth();
                int height4 = this.mCaptureFormat.getHeight();
                int i4 = this.mId;
                RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFSensorToNormalized, width3, height3, width4, height4, i4 == 1, (i4 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
                if (rectFNormalizedToView == null) {
                    Logging.m87213w(TAG, "failed to translate coordinate from normalized to view!");
                    return -1;
                }
                rectFNormalizedToView.round(rect);
                notifyCameraExposureAreaChanged(rect);
                RectF rectFCameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(rectCalculateFocusArea));
                int width5 = this.mRenderView.getWidth();
                int height5 = this.mRenderView.getHeight();
                int width6 = this.mCaptureFormat.getWidth();
                int height6 = this.mCaptureFormat.getHeight();
                int i5 = this.mId;
                RectF rectFNormalizedToView2 = CoordinatesTransform.normalizedToView(rectFCameraToNormalized, width5, height5, width6, height6, i5 == 1, (i5 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
                if (rectFNormalizedToView2 == null) {
                    Logging.m87213w(TAG, "failed to translate coordinate from normalized to view!");
                    return -1;
                }
                rectFNormalizedToView2.round(rect);
                notifyCameraFocusAreaChanged(rect);
                return 0;
            } catch (Exception e3) {
                Logging.m87213w(TAG, "mCamera.autoFocus Exception: " + e3);
            }
        }
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setNoiseReductionMode(int i) {
        Logging.m87209e(TAG, "NoiseReduction not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setTorchMode(boolean z) {
        int i = z ? 1 : -1;
        if (this.mCamera == null) {
            this.mTorchMode = z ? 1 : -1;
            return 0;
        }
        if (this.mIsCameraTorchStarted && this.mTorchMode == i) {
            return 0;
        }
        this.mTorchMode = i;
        String str = TAG;
        Logging.m87211i(str, "setTorchMode isOn: " + z);
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters == null) {
            return -2;
        }
        List<String> supportedFlashModes = cameraParameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            if (supportedFlashModes.contains("torch")) {
                Logging.m87213w(str, "setTorchMode isFlashSupported: true");
                if (z) {
                    cameraParameters.setFlashMode("torch");
                } else {
                    cameraParameters.setFlashMode(BLiveOperationTitleShowType.off);
                }
                try {
                    this.mIsCameraTorchStarted = true;
                    this.mCamera.setParameters(cameraParameters);
                    return 0;
                } catch (Exception e) {
                    String str2 = TAG;
                    StringBuilder sb = new StringBuilder("setTorchMode failed, mode: ");
                    sb.append(z ? "torch" : BLiveOperationTitleShowType.off);
                    sb.append(", ");
                    sb.append(e);
                    Logging.m87213w(str2, sb.toString());
                    return -1;
                }
            }
        }
        Logging.m87213w(str, "setTorchMode isFlashSupported: false");
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoEdgeMode(int i) {
        Logging.m87213w(TAG, "setVideoEdgeMode failure: " + i);
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoStabilityMode(int i) {
        Camera.Parameters cameraParameters;
        String str = TAG;
        Logging.m87213w(str, "setVideoStabilityMode: " + i);
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return -1;
        }
        if (!cameraParameters.isVideoStabilizationSupported()) {
            Logging.m87209e(str, "not supported VideoStability Mode = " + i);
            return -1;
        }
        if (i == 1) {
            cameraParameters.setVideoStabilization(true);
        } else if (i == 0) {
            cameraParameters.setVideoStabilization(false);
        }
        try {
            this.mCamera.setParameters(cameraParameters);
            return 0;
        } catch (Exception e) {
            Logging.m87213w(TAG, "setVideoStabilityMode failed, mode: " + i + ", " + e);
            return -1;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setZoom(float f) {
        if (this.mCamera == null) {
            this.mCameraZoomFactor = f;
            return 0;
        }
        if (this.mIsmCameraZoomStarted && Math.abs(this.mCameraZoomFactor - f) < 0.1d) {
            return 0;
        }
        this.mCameraZoomFactor = f;
        Logging.m87211i(TAG, "setCameraZoom api1 called zoomValue =" + f);
        if (f < 0.0f) {
            return -1;
        }
        int i = (int) ((f * 100.0f) + 0.5f);
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= zoomRatios.size()) {
                i2 = 0;
                break;
            }
            if (i <= zoomRatios.get(i2).intValue()) {
                break;
            }
            i2++;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (!isZoomSupported(cameraParameters)) {
            return -1;
        }
        if (i2 > cameraParameters.getMaxZoom()) {
            Logging.m87213w(TAG, "zoom value is larger than maxZoom value");
            return -1;
        }
        cameraParameters.setZoom(i2);
        try {
            this.mIsmCameraZoomStarted = true;
            this.mCamera.setParameters(cameraParameters);
            return 0;
        } catch (Exception e) {
            Logging.m87213w(TAG, "setParameters failed, zoomLevel: " + i2 + ", " + e);
            return -1;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        int i;
        int i2;
        String str = TAG;
        Logging.m87211i(str, "startCaptureMaybeAsync, use Texture: " + this.mCaptureToTexture);
        if (this.mCamera == null) {
            Logging.m87209e(str, "startCaptureAsync: mCamera is null");
            return false;
        }
        if (this.mProxyThreadHandler == null) {
            Logging.m87213w(str, "proxyThread unavailable");
            return false;
        }
        this.mPreviewBufferLock.lock();
        try {
            boolean z = this.mIsRunning;
            ReentrantLock reentrantLock = this.mPreviewBufferLock;
            if (z) {
                reentrantLock.unlock();
                return true;
            }
            reentrantLock.unlock();
            if (this.mCaptureToTexture) {
                listenForTextureFrames();
            } else {
                listenForBytebufferFrames();
            }
            try {
                Boolean bool = (Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Boolean>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public Boolean call() throws Exception {
                        try {
                            VideoCaptureCamera1.this.mCamera.startPreview();
                            Logging.m87211i(VideoCaptureCamera1.TAG, "startCaptureMaybeAsync done.");
                            return Boolean.TRUE;
                        } catch (Exception e) {
                            Logging.m87209e(VideoCaptureCamera1.TAG, "startCaptureAsync: Camera.startPreview: " + e.getMessage());
                            return Boolean.FALSE;
                        }
                    }
                });
                if (bool != null && bool.booleanValue()) {
                    if (!this.mIsCameraTorchStarted && (i2 = this.mTorchMode) != 0) {
                        setTorchMode(i2 == 1);
                    }
                    if (!this.mIsmCameraExposureStarted) {
                        float[] fArr = this.mCameraExposurePositions;
                        float f = fArr[0];
                        if (f > 0.0f) {
                            float f2 = fArr[1];
                            if (f2 > 0.0f) {
                                setExposure(f, f2);
                            }
                        }
                    }
                    if (!this.mIsmCameraFocusStarted) {
                        float[] fArr2 = this.mCameraFocusPositions;
                        float f3 = fArr2[0];
                        if (f3 > 0.0f) {
                            float f4 = fArr2[1];
                            if (f4 > 0.0f) {
                                setFocus(f3, f4);
                            }
                        }
                    }
                    if (!this.mIsmCameraZoomStarted) {
                        float f5 = this.mCameraZoomFactor;
                        if (f5 > 0.0f) {
                            setZoom(f5);
                        }
                    }
                    if (!this.mIsExposureCompensationStarted && (i = this.mCameraExposureCompensation) != 0) {
                        setExposureCompensation(i);
                    }
                    boolean z2 = this.mCameraAutoFaceFocus;
                    if (z2) {
                        setAutoFaceFocus(z2);
                    }
                    onFaceDetectionRequestChanged();
                    this.mPreviewBufferLock.lock();
                    try {
                        onStarted();
                        this.mIsRunning = true;
                        this.mPreviewBufferLock.unlock();
                        if (ContextUtils.getApplicationContext() == null || this.mProxyThreadHandler == null) {
                            Logging.m87213w(str, "context or proxyThread unavailable");
                            return true;
                        }
                        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
                        if (cameraManager != null) {
                            registerCameraAvailableCallback(cameraManager);
                        }
                        return true;
                    } catch (Throwable th) {
                        this.mPreviewBufferLock.unlock();
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            this.mPreviewBufferLock.unlock();
            throw th2;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        String str = TAG;
        Logging.m87211i(str, "stopCaptureAndBlockUntilStopped()");
        unRegisterAvailabilityCallback();
        if (this.mProxyThreadHandler == null) {
            Logging.m87213w(str, "proxyThread unavailable");
            return;
        }
        this.mPreviewBufferLock.lock();
        try {
            if (!this.mIsRunning) {
                this.mPreviewBufferLock.unlock();
                ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.5
                    @Override // java.util.concurrent.Callable
                    public Void call() throws Exception {
                        ISurfaceTextureHelper iSurfaceTextureHelper = VideoCaptureCamera1.this.mSurfaceTextureHelper;
                        if (iSurfaceTextureHelper != null) {
                            iSurfaceTextureHelper.stopListening();
                            VideoCaptureCamera1.this.mSurfaceTextureHelper.dispose();
                            VideoCaptureCamera1.this.mSurfaceTextureHelper = null;
                        }
                        return null;
                    }
                });
                if (this.mSurfaceTextureHelper != null) {
                    Logging.m87209e(str, "waiting camera proxy thread disposing timeout after 2000ms");
                    this.mSurfaceTextureHelper.stopListening();
                    this.mSurfaceTextureHelper.dispose();
                    this.mSurfaceTextureHelper = null;
                    return;
                }
                return;
            }
            this.mIsRunning = false;
            this.mPreviewBufferLock.unlock();
            ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.5
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    ISurfaceTextureHelper iSurfaceTextureHelper = VideoCaptureCamera1.this.mSurfaceTextureHelper;
                    if (iSurfaceTextureHelper != null) {
                        iSurfaceTextureHelper.stopListening();
                        VideoCaptureCamera1.this.mSurfaceTextureHelper.dispose();
                        VideoCaptureCamera1.this.mSurfaceTextureHelper = null;
                    }
                    return null;
                }
            });
            if (this.mSurfaceTextureHelper != null) {
                Logging.m87209e(str, "waiting camera proxy thread disposing timeout after 2000ms");
                this.mSurfaceTextureHelper.stopListening();
                this.mSurfaceTextureHelper.dispose();
                this.mSurfaceTextureHelper = null;
            }
            this.mIsCameraTorchStarted = false;
            this.mIsmCameraExposureStarted = false;
            this.mIsmCameraFocusStarted = false;
            this.mIsmCameraZoomStarted = false;
            this.mIsExposureCompensationStarted = false;
            this.mProxyThreadHandler.post(new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.6
                @Override // java.lang.Runnable
                public void run() {
                    VideoCaptureCamera1.this.safetyStopFaceDetection();
                }
            });
            try {
                ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.7
                    @Override // java.util.concurrent.Callable
                    public Void call() throws Exception {
                        VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                        if (!videoCaptureCamera1.mCaptureToTexture) {
                            videoCaptureCamera1.mCamera.setPreviewCallbackWithBuffer(null);
                        }
                        try {
                            VideoCaptureCamera1.this.mCamera.stopPreview();
                            Logging.m87211i(VideoCaptureCamera1.TAG, "stopPreview done!");
                        } catch (Exception e) {
                            Logging.m87209e(VideoCaptureCamera1.TAG, "stopPreview got exception:" + e.toString());
                        }
                        return null;
                    }
                });
            } catch (Exception e) {
                Logging.m87209e(TAG, "stopPreview got exception:" + e.toString());
            }
        } catch (Throwable th) {
            this.mPreviewBufferLock.unlock();
            ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.5
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    ISurfaceTextureHelper iSurfaceTextureHelper = VideoCaptureCamera1.this.mSurfaceTextureHelper;
                    if (iSurfaceTextureHelper != null) {
                        iSurfaceTextureHelper.stopListening();
                        VideoCaptureCamera1.this.mSurfaceTextureHelper.dispose();
                        VideoCaptureCamera1.this.mSurfaceTextureHelper = null;
                    }
                    return null;
                }
            });
            if (this.mSurfaceTextureHelper != null) {
                Logging.m87209e(TAG, "waiting camera proxy thread disposing timeout after 2000ms");
                this.mSurfaceTextureHelper.stopListening();
                this.mSurfaceTextureHelper.dispose();
                this.mSurfaceTextureHelper = null;
            }
            throw th;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isZoomSupported() {
        if (this.mCamera != null) {
            return isZoomSupported(getCameraParameters());
        }
        return false;
    }
}
