package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.api.Api;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import com.immomo.momomediaext.sei.BaseSei;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.ISurfaceTextureHelper;
import io.agora.base.internal.video.SurfaceTextureHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(23)
public class VideoCaptureCamera2 extends VideoCaptureCamera {
    private static final String[] AE_TARGET_FPS_RANGE_BUGGY_DEVICE_LIST = {"Pixel 3", "Pixel 3 XL", "SDM845"};
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_3 = 5;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_EXTERNAL = 2;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_FULL = 4;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_LEGACY = 1;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_LIMITED = 3;
    static final SparseIntArray ANDROID_CAMERA_HARDWARE_LEVEL_MAP;
    static final int ANDROID_CAMERA_HARDWARE_NOT_SUPPORT = Integer.MIN_VALUE;
    private static final SparseIntArray COLOR_TEMPERATURES_MAP;
    private static final float DEFAULT_VALUE = -1.0f;
    private static int IMAGE_FORMAT = 35;
    private static final String TAG = "VideoCaptureCamera2";
    private static final float ZOOM_UNSUPPORTED_DEFAULT_VALUE = 0.5f;
    static Map<Integer, CameraCharacteristics> cameraCharacteristicMaps = null;
    private static final long kNanosecondsPer100Microsecond = 100000;
    private static final double kNanosecondsPerSecond = 1.0E9d;
    private Range<Integer> mAeFpsRange;
    private CameraCaptureSession.CaptureCallback mAfCaptureCallback;
    private MeteringRectangle mAreaOfInterest;

    @Nullable
    private CameraDevice mCameraDevice;

    @Nullable
    private String mCameraId;
    private int mCameraState;
    private final Object mCameraStateLock;
    private Handler mCameraThreadHandler;
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;
    private int mColorTemperature;
    private Rect mCropRect;
    private float mCurrentFocusDistance;
    private int mExposureMode;
    private int mFaceDetectMode;
    private boolean mFaceDetectSupported;
    private int mFillLightMode;
    private int mFocusMode;
    private ImageReader mImageReader;
    private final Object mImageReaderLock;
    private int mIso;
    private long mLastExposureTimeNs;
    private float mLastZoomRatio;
    private float mMaxZoom;

    @Nullable
    private String mPhysicalId;
    private CaptureRequest.Builder mPreviewRequestBuilder;

    @Nullable
    private CameraCaptureSession mPreviewSession;
    private boolean mRedEyeReduction;
    private Rect mSensorRect;

    @Nullable
    private Surface mSurface;
    private final Object mSwitchLock;
    private ThreadUtils.ThreadChecker mThreadChecker;
    private ThreadUtils.ConditionVariable mWaitForDeviceClosedConditionVariable;
    private ImageReader xiaomiReader;

    public static class CameraIdListTask implements Runnable {
        static String[] cameraIdList;
        final CountDownLatch countDown = new CountDownLatch(1);

        public String[] getCameraIdList() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.countDown, 2000L)) {
                Logging.m88098e(VideoCaptureCamera2.TAG, "checkBackgroundSafe timeout");
            }
            return cameraIdList;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraManager cameraManager;
            try {
                try {
                    try {
                        try {
                            try {
                                if (ContextUtils.getApplicationContext() != null && (cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")) != null) {
                                    cameraIdList = cameraManager.getCameraIdList();
                                }
                            } catch (CameraAccessException e) {
                                Logging.m88098e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e.getMessage());
                            }
                        } catch (Exception e2) {
                            Logging.m88098e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e2.getMessage());
                        }
                    } catch (SecurityException e3) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e3.getMessage());
                    }
                } catch (AssertionError e4) {
                    Logging.m88098e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e4.getMessage());
                } catch (IllegalArgumentException e5) {
                    Logging.m88098e(VideoCaptureCamera2.TAG, "getSystemService(Context.CAMERA_SERVICE): " + e5.getMessage());
                }
            } finally {
                this.countDown.countDown();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CameraState {
        public static final int CONFIGURING = 1;
        public static final int EVICTED = 3;
        public static final int OPENING = 0;
        public static final int STARTED = 2;
        public static final int STOPPED = 4;
    }

    public class CrPreviewReaderListener implements ImageReader.OnImageAvailableListener {
        private CrPreviewReaderListener() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            String str;
            StringBuilder sb;
            String str2;
            StringBuilder sb2;
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            synchronized (VideoCaptureCamera2.this.mImageReaderLock) {
                Image image = null;
                try {
                    try {
                        try {
                            if (VideoCaptureCamera2.this.mImageReader == null) {
                                return;
                            }
                            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                            if (imageAcquireLatestImage == null) {
                                VideoCaptureCamera2.this.onFrameDropped(9);
                                if (imageAcquireLatestImage != null) {
                                    try {
                                        imageAcquireLatestImage.close();
                                    } catch (IllegalArgumentException e) {
                                        Logging.m88098e(VideoCaptureCamera2.TAG, "Image Close():" + e.getMessage());
                                    } catch (IllegalStateException e2) {
                                        Logging.m88098e(VideoCaptureCamera2.TAG, "Image Close():" + e2.getMessage());
                                    }
                                }
                                return;
                            }
                            if (imageAcquireLatestImage.getFormat() != 35 || imageAcquireLatestImage.getPlanes().length != 3) {
                                Logging.m88098e(VideoCaptureCamera2.TAG, "Unexpected image format: " + imageAcquireLatestImage.getFormat() + " or #planes: " + imageAcquireLatestImage.getPlanes().length);
                                throw new IllegalStateException();
                            }
                            if (imageReader.getWidth() != imageAcquireLatestImage.getWidth() || imageReader.getHeight() != imageAcquireLatestImage.getHeight()) {
                                Logging.m88098e(VideoCaptureCamera2.TAG, "ImageReader size (" + imageReader.getWidth() + BaseSei.f14624X + imageReader.getHeight() + ") did not match Image size (" + imageAcquireLatestImage.getWidth() + BaseSei.f14624X + imageAcquireLatestImage.getHeight() + ")");
                                throw new IllegalStateException();
                            }
                            VideoCaptureCamera2.this.onI420FrameAvailable(imageAcquireLatestImage.getPlanes()[0].getBuffer(), imageAcquireLatestImage.getPlanes()[0].getRowStride(), imageAcquireLatestImage.getPlanes()[1].getBuffer(), imageAcquireLatestImage.getPlanes()[2].getBuffer(), imageAcquireLatestImage.getPlanes()[1].getRowStride(), imageAcquireLatestImage.getPlanes()[1].getPixelStride(), imageAcquireLatestImage.getWidth(), imageAcquireLatestImage.getHeight(), VideoCaptureCamera2.this.getCameraRotation(), imageAcquireLatestImage.getTimestamp(), VideoCaptureCamera2.this.getPerFrameMetaInfos());
                            try {
                                imageAcquireLatestImage.close();
                            } catch (IllegalArgumentException e3) {
                                str2 = VideoCaptureCamera2.TAG;
                                sb2 = new StringBuilder("Image Close():");
                                sb2.append(e3.getMessage());
                                Logging.m88098e(str2, sb2.toString());
                            } catch (IllegalStateException e4) {
                                str = VideoCaptureCamera2.TAG;
                                sb = new StringBuilder("Image Close():");
                                sb.append(e4.getMessage());
                                Logging.m88098e(str, sb.toString());
                            }
                            return;
                            throw th;
                        } catch (IllegalArgumentException e5) {
                            Logging.m88098e(VideoCaptureCamera2.TAG, "acquireLatestImage():" + e5.getMessage());
                            if (0 != 0) {
                                try {
                                    image.close();
                                } catch (IllegalArgumentException e6) {
                                    str2 = VideoCaptureCamera2.TAG;
                                    sb2 = new StringBuilder("Image Close():");
                                    sb2.append(e6.getMessage());
                                    Logging.m88098e(str2, sb2.toString());
                                } catch (IllegalStateException e7) {
                                    str = VideoCaptureCamera2.TAG;
                                    sb = new StringBuilder("Image Close():");
                                    sb.append(e7.getMessage());
                                    Logging.m88098e(str, sb.toString());
                                }
                            }
                        }
                    } catch (IllegalStateException e8) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "acquireLatestImage():" + e8.getMessage());
                        if (0 != 0) {
                            try {
                                image.close();
                            } catch (IllegalArgumentException e9) {
                                str2 = VideoCaptureCamera2.TAG;
                                sb2 = new StringBuilder("Image Close():");
                                sb2.append(e9.getMessage());
                                Logging.m88098e(str2, sb2.toString());
                            } catch (IllegalStateException e10) {
                                str = VideoCaptureCamera2.TAG;
                                sb = new StringBuilder("Image Close():");
                                sb.append(e10.getMessage());
                                Logging.m88098e(str, sb.toString());
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (0 == 0) {
                        throw th;
                    }
                    try {
                        image.close();
                        throw th;
                    } catch (IllegalArgumentException e11) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "Image Close():" + e11.getMessage());
                        throw th;
                    } catch (IllegalStateException e12) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "Image Close():" + e12.getMessage());
                        throw th;
                    }
                }
            }
        }
    }

    public class CrPreviewSessionListener extends CameraCaptureSession.StateCallback {
        private CrPreviewSessionListener() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.m88100i(VideoCaptureCamera2.TAG, "CrPreviewSessionListener.onClosed");
            VideoCaptureCamera2.this.mPreviewSession = null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.m88100i(VideoCaptureCamera2.TAG, "CrPreviewSessionListener.onConfigureFailed");
            VideoCaptureCamera2.this.changeCameraStateAndNotify(4);
            VideoCaptureCamera2.this.mPreviewSession = null;
            VideoCaptureCamera2.this.onError(101, "Camera session configuration error");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            boolean z;
            int i;
            int i2;
            int i3;
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.m88100i(VideoCaptureCamera2.TAG, "CrPreviewSessionListener.onConfigured");
            VideoCaptureCamera2.this.mPreviewSession = cameraCaptureSession;
            try {
                if (VideoCaptureCamera2.this.mPreviewRequestBuilder != null && VideoCaptureCamera2.this.mPreviewSession != null) {
                    VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                    videoCaptureCamera2.requestFaceDetection(videoCaptureCamera2.mPreviewRequestBuilder, VideoCaptureCamera2.this.mFaceDetectMode);
                    VideoCaptureCamera2.this.mPreviewSession.setRepeatingRequest(VideoCaptureCamera2.this.mPreviewRequestBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, VideoCaptureCamera2.this.mCameraThreadHandler);
                }
                VideoCaptureCamera2 videoCaptureCamera3 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera3.mIsCameraTorchStarted && (i3 = videoCaptureCamera3.mTorchMode) != 0) {
                    videoCaptureCamera3.setTorchMode(i3 == 1);
                }
                VideoCaptureCamera2 videoCaptureCamera4 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera4.mIsmCameraExposureStarted) {
                    float[] fArr = videoCaptureCamera4.mCameraExposurePositions;
                    float f = fArr[0];
                    if (f > 0.0f) {
                        float f2 = fArr[1];
                        if (f2 > 0.0f) {
                            videoCaptureCamera4.setExposure(f, f2);
                        }
                    }
                }
                VideoCaptureCamera2 videoCaptureCamera5 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera5.mIsmCameraFocusStarted) {
                    float[] fArr2 = videoCaptureCamera5.mCameraFocusPositions;
                    float f3 = fArr2[0];
                    if (f3 > 0.0f) {
                        float f4 = fArr2[1];
                        if (f4 > 0.0f) {
                            videoCaptureCamera5.setFocus(f3, f4);
                        }
                    }
                }
                VideoCaptureCamera2 videoCaptureCamera6 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera6.mIsmCameraZoomStarted) {
                    float f5 = videoCaptureCamera6.mCameraZoomFactor;
                    if (f5 > 0.0f) {
                        videoCaptureCamera6.setZoom(f5);
                    }
                }
                VideoCaptureCamera2 videoCaptureCamera7 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera7.mIsExposureCompensationStarted && (i2 = videoCaptureCamera7.mCameraExposureCompensation) != 0) {
                    videoCaptureCamera7.setExposureCompensation(i2);
                }
                VideoCaptureCamera2 videoCaptureCamera8 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera8.mIsNoiseReducationStarted && (i = videoCaptureCamera8.mCameraNoiseReduction) != 0) {
                    videoCaptureCamera8.setNoiseReductionMode(i);
                }
                VideoCaptureCamera2 videoCaptureCamera9 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera9.mAutoFaceDetectFocusStarted && (z = videoCaptureCamera9.mCameraAutoFaceFocus)) {
                    videoCaptureCamera9.setAutoFaceFocus(z);
                }
                VideoCaptureCamera2.this.changeCameraStateAndNotify(2);
                VideoCaptureCamera2.this.onStarted();
            } catch (CameraAccessException e) {
                Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest: " + e.getMessage());
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (IllegalArgumentException e2) {
                Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest: " + e2.getMessage());
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (IllegalStateException e3) {
                Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest: " + e3.getMessage());
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (NoClassDefFoundError e4) {
                Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest: " + e4.getMessage());
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (SecurityException e5) {
                Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest: " + e5.getMessage());
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            }
        }
    }

    public class CrStateListener extends CameraDevice.StateCallback {
        public CrStateListener() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Logging.m88100i(VideoCaptureCamera2.TAG, "cameraDevice closed");
            if (VideoCaptureCamera2.this.mPreviewSession != null) {
                VideoCaptureCamera2.this.mPreviewSession = null;
            }
            VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.open();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.m88098e(VideoCaptureCamera2.TAG, "cameraDevice was closed unexpectedly");
            if (VideoCaptureCamera2.this.mCameraState == 4 || VideoCaptureCamera2.this.mCameraState == 3) {
                return;
            }
            if (VideoCaptureCamera2.this.mCameraDevice != null) {
                try {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                    VideoCaptureCamera2.this.mCameraDevice = null;
                    Logging.m88100i(VideoCaptureCamera2.TAG, "CameraDevice close done!");
                } catch (IllegalStateException e) {
                    Logging.m88099e(VideoCaptureCamera2.TAG, "cameraDevice close error", e);
                }
                VideoCaptureCamera2.this.mCameraDevice = null;
            }
            VideoCaptureCamera2.this.onError(6, "Camera disconnected");
            VideoCaptureCamera2.this.changeCameraStateAndNotify(3);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0076 A[PHI: r2
          0x0076: PHI (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:15:0x005b, B:17:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.m88098e(VideoCaptureCamera2.TAG, "cameraDevice encountered an error, code: " + i);
            int i2 = 4;
            if (VideoCaptureCamera2.this.mCameraState == 4 || VideoCaptureCamera2.this.mCameraState == 3) {
                return;
            }
            if (VideoCaptureCamera2.this.mCameraDevice != null) {
                try {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                } catch (IllegalStateException e) {
                    Logging.m88099e(VideoCaptureCamera2.TAG, "cameraDevice close error", e);
                }
                VideoCaptureCamera2.this.mCameraDevice = null;
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(3);
            String str = "Camera In Use";
            int i3 = 1;
            if (i != 1) {
                i3 = 2;
                if (i == 2) {
                    i2 = i3;
                } else if (i == 3) {
                    str = "Camera disabled";
                    i2 = 3;
                } else if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        i2 = 901;
                        str = "Camera runtime erro";
                    } else {
                        str = "Camera service error";
                    }
                } else {
                    str = "Camera device error";
                }
            } else {
                i2 = i3;
            }
            VideoCaptureCamera2.this.onError(i2, str);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.m88100i(VideoCaptureCamera2.TAG, "CameraDevice.StateCallback onOpened");
            synchronized (VideoCaptureCamera2.this.mCameraStateLock) {
                if (VideoCaptureCamera2.this.mCameraState == 4) {
                    try {
                        Logging.m88102w(VideoCaptureCamera2.TAG, "cameraDevice state error,  should manual close!");
                        cameraDevice.close();
                    } catch (IllegalStateException e) {
                        Logging.m88099e(VideoCaptureCamera2.TAG, "cameraDevice close error", e);
                    }
                    return;
                }
                VideoCaptureCamera2.this.mCameraDevice = cameraDevice;
                VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.close();
                VideoCaptureCamera2.this.changeCameraStateAndNotify(1);
                VideoCaptureCamera2.this.createPreviewObjectsAndStartPreviewOrFailWith(100);
            }
        }
    }

    public class StopCaptureTask implements Runnable {
        private StopCaptureTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            if (VideoCaptureCamera2.this.mCameraDevice == null) {
                return;
            }
            try {
                VideoCaptureCamera2.this.mCameraDevice.close();
                VideoCaptureCamera2.this.mCameraDevice = null;
            } catch (IllegalStateException e) {
                Logging.m88099e(VideoCaptureCamera2.TAG, "cameraDevice close error", e);
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(4);
            VideoCaptureCamera2.this.mCropRect = new Rect();
        }
    }

    public class TextureVideoSinkListener implements SurfaceTextureHelper.IVideoCapture {
        private TextureVideoSinkListener() {
        }

        @Override // io.agora.base.internal.video.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
            if (videoCaptureCamera2.mEnableTextureCopy) {
                buffer = ((SurfaceTextureHelper) videoCaptureCamera2.mSurfaceTextureHelper).textureCopy((VideoFrame.TextureBuffer) videoFrame.getBuffer());
            }
            if (buffer == null) {
                onFrameDropped(9);
                Logging.m88100i(VideoCaptureCamera2.TAG, "[HWS] TextureVideoSinkListener copy frame error");
                return;
            }
            VideoCaptureCamera2 videoCaptureCamera3 = VideoCaptureCamera2.this;
            VideoFrame videoFrame2 = new VideoFrame(VideoCapture.createTextureBufferWithModifiedTransformMatrix((TextureBuffer) buffer, !videoCaptureCamera3.mInvertDeviceOrientationReadings, -videoCaptureCamera3.mCameraNativeOrientation), VideoCaptureCamera2.this.getCameraRotation(), videoFrame.getTimestampNs());
            VideoCaptureCamera2.this.attachPerFrameMetaInfos(videoFrame2);
            VideoCaptureCamera2.this.onFrameCaptured(videoFrame2);
            if (VideoCaptureCamera2.this.mEnableTextureCopy) {
                buffer.release();
            }
            videoFrame2.release();
        }

        @Override // io.agora.base.internal.video.SurfaceTextureHelper.IVideoCapture
        public void onFrameDropped(int i) {
            VideoCaptureCamera2.super.onFrameDropped(i);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        COLOR_TEMPERATURES_MAP = sparseIntArray;
        sparseIntArray.append(2850, 2);
        sparseIntArray.append(2950, 4);
        sparseIntArray.append(4250, 3);
        sparseIntArray.append(4600, 7);
        sparseIntArray.append(5000, 5);
        sparseIntArray.append(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED, 6);
        sparseIntArray.append(PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED, 8);
        cameraCharacteristicMaps = new ConcurrentHashMap();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ANDROID_CAMERA_HARDWARE_LEVEL_MAP = sparseIntArray2;
        sparseIntArray2.append(2, 1);
        sparseIntArray2.append(0, 3);
        sparseIntArray2.append(1, 4);
        if (Build.VERSION.SDK_INT >= 28) {
            sparseIntArray2.append(4, 2);
        }
        sparseIntArray2.append(3, 5);
    }

    public VideoCaptureCamera2(int i, long j, boolean z, boolean z2, int i2, boolean z3, int i3, EglBase.Context context, int i4, int i5, int i6, boolean z4, boolean z5, boolean z6, boolean z7, int i7, int i8, boolean z8) {
        super(i, j, z, z2, i2, z3, i3, context, i4, i5, i6, z4, z5, z6, z7, i7, i8, z8);
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.1
            private long mLastFocusedTs;

            private void addRegionsToCaptureRequestBuilder(CaptureRequest.Builder builder, MeteringRectangle[] meteringRectangleArr) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                builder.set(key, 2);
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                builder.set(key, 0);
                builder.set(key, 1);
            }

            private void notifyCameraFocusAreaChanged(Rect rect, Rect rect2) {
                RectF rectF = new RectF(rect2);
                int iWidth = rect.width();
                int iHeight = rect.height();
                VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera2.this.mCaptureFormat;
                RectF rectFSensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF, iWidth, iHeight, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, true);
                int width = VideoCaptureCamera2.this.mRenderView.getWidth();
                int height = VideoCaptureCamera2.this.mRenderView.getHeight();
                int width2 = VideoCaptureCamera2.this.mCaptureFormat.getWidth();
                int height2 = VideoCaptureCamera2.this.mCaptureFormat.getHeight();
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                int i9 = videoCaptureCamera2.mId;
                RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFSensorToNormalized, width, height, width2, height2, i9 == 1, (i9 != 1 ? -1 : 1) * videoCaptureCamera2.getCameraRotation(), VideoCaptureCamera2.this.mRenderMode);
                if (rectFNormalizedToView == null) {
                    Logging.m88102w(VideoCaptureCamera2.TAG, "Failed to translate coordinate from normalized to view!!");
                    return;
                }
                Rect rect3 = new Rect();
                rectFNormalizedToView.round(rect3);
                VideoCaptureCamera2.this.notifyCameraFocusAreaChanged(rect3);
            }

            private void notifyFaceDetection(Rect rect, Face[] faceArr) {
                double dPow;
                double d;
                ArrayList<RectF> arrayList = new ArrayList<>();
                ArrayList<Double> arrayList2 = new ArrayList<>();
                for (Face face2 : faceArr) {
                    RectF rectF = new RectF(face2.getBounds());
                    int iWidth = rect.width();
                    int iHeight = rect.height();
                    VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera2.this.mCaptureFormat;
                    RectF rectFSensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF, iWidth, iHeight, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, true);
                    if (rectFSensorToNormalized != null) {
                        if (VideoCaptureCamera2.this.mId == 1) {
                            dPow = Math.pow(rectFSensorToNormalized.width(), -0.958d);
                            d = 11.237d;
                        } else {
                            dPow = Math.pow(rectFSensorToNormalized.height(), -0.971d);
                            d = 14.719d;
                        }
                        arrayList2.add(Double.valueOf(dPow * d));
                        int width = VideoCaptureCamera2.this.mRenderView.getWidth();
                        int height = VideoCaptureCamera2.this.mRenderView.getHeight();
                        VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                        VideoCaptureFormat videoCaptureFormat2 = videoCaptureCamera2.mCaptureFormat;
                        int i9 = videoCaptureFormat2.mWidth;
                        int i10 = videoCaptureFormat2.mHeight;
                        int i11 = videoCaptureCamera2.mId;
                        RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFSensorToNormalized, width, height, i9, i10, i11 == 1, (i11 == 1 ? 1 : -1) * videoCaptureCamera2.getCameraRotation(), VideoCaptureCamera2.this.mRenderMode);
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
                VideoCaptureCamera2 videoCaptureCamera3 = VideoCaptureCamera2.this;
                VideoCaptureFormat videoCaptureFormat3 = videoCaptureCamera3.mCaptureFormat;
                videoCaptureCamera3.notifyFaceDetection(videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight, arrayList, arrayList2);
            }

            private void process(CaptureResult captureResult) {
                Face[] faceArr = (Face[]) captureResult.get(CaptureResult.STATISTICS_FACES);
                if (faceArr == null || faceArr.length <= 0) {
                    return;
                }
                if (System.currentTimeMillis() - this.mLastFocusedTs < 3000) {
                    if (faceArr[0].getScore() > 20) {
                        Rect rect = (Rect) captureResult.get(CaptureResult.SCALER_CROP_REGION);
                        Rect bounds = faceArr[0].getBounds();
                        if (bounds != null && !bounds.equals(VideoCaptureCamera2.this.lastFocusAreaRect)) {
                            notifyCameraFocusAreaChanged(rect, bounds);
                        }
                        VideoCaptureCamera2.this.lastFocusAreaRect = bounds;
                        return;
                    }
                    return;
                }
                if (faceArr[0].getScore() <= 50) {
                    return;
                }
                Rect rectClampFace = VideoCaptureCamera2.this.clampFace(faceArr[0].getBounds());
                if (rectClampFace.width() <= 0 || rectClampFace.height() <= 0) {
                    return;
                }
                addRegionsToCaptureRequestBuilder(VideoCaptureCamera2.this.mPreviewRequestBuilder, new MeteringRectangle[]{new MeteringRectangle(rectClampFace, 1000)});
                if (VideoCaptureCamera2.this.mCameraState != 2) {
                    return;
                }
                try {
                    Rect rect2 = (Rect) captureResult.get(CaptureResult.SCALER_CROP_REGION);
                    Logging.m88097d(VideoCaptureCamera2.TAG, "cropRegion = " + rect2);
                    Logging.m88097d(VideoCaptureCamera2.TAG, "capture size wxh = " + VideoCaptureCamera2.this.mCaptureFormat.getWidth() + " x " + VideoCaptureCamera2.this.mCaptureFormat.getHeight());
                    notifyCameraFocusAreaChanged(rect2, rectClampFace);
                    VideoCaptureCamera2.this.mPreviewSession.capture(VideoCaptureCamera2.this.mPreviewRequestBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, null);
                    this.mLastFocusedTs = System.currentTimeMillis();
                } catch (Exception e) {
                    Logging.m88098e(VideoCaptureCamera2.TAG, "capture: " + e);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Long l2 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l2 != null) {
                    VideoCaptureCamera2.this.mLastExposureTimeNs = l2.longValue();
                }
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                if (videoCaptureCamera2.mEnableAutoFaceFocus && videoCaptureCamera2.isAutoFaceFocusSupported()) {
                    process(totalCaptureResult);
                }
                if (VideoCaptureCamera2.this.mEnableFaceDetection) {
                    notifyFaceDetection((Rect) totalCaptureResult.get(CaptureResult.SCALER_CROP_REGION), (Face[]) totalCaptureResult.get(CaptureResult.STATISTICS_FACES));
                }
            }
        };
        this.mAfCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.2
            private void process(CaptureResult captureResult) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return;
                }
                if (4 == num.intValue() || 5 == num.intValue()) {
                    VideoCaptureCamera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    VideoCaptureCamera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    VideoCaptureCamera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    try {
                        VideoCaptureCamera2.this.mPreviewSession.setRepeatingRequest(VideoCaptureCamera2.this.mPreviewRequestBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, VideoCaptureCamera2.this.mCameraThreadHandler);
                    } catch (CameraAccessException e) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e.getMessage());
                    } catch (IllegalArgumentException e2) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e2.getMessage());
                    } catch (IllegalStateException e3) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e3.getMessage());
                    } catch (NoClassDefFoundError e4) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e4.getMessage());
                    } catch (SecurityException e5) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e5.getMessage());
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                process(totalCaptureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                process(captureResult);
            }
        };
        this.mSwitchLock = new Object();
        this.mCameraStateLock = new Object();
        this.mImageReaderLock = new Object();
        this.mWaitForDeviceClosedConditionVariable = new ThreadUtils.ConditionVariable();
        this.mCameraState = 4;
        this.mMaxZoom = 1.0f;
        this.mCropRect = new Rect();
        this.mFocusMode = 4;
        this.mCurrentFocusDistance = 1.0f;
        this.mExposureMode = 4;
        this.mColorTemperature = -1;
        this.mFillLightMode = 1;
        this.mLastZoomRatio = DEFAULT_VALUE;
        this.mSensorRect = null;
        this.mFaceDetectSupported = false;
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera2_CameraThread");
        handlerThread.start();
        if (i8 >= 0) {
            this.mPhysicalId = i8 + "";
        }
        this.mCameraThreadHandler = new Handler(handlerThread.getLooper());
        this.mThreadChecker = new ThreadUtils.ThreadChecker(handlerThread);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i);
        if (cameraCharacteristics != null) {
            this.mMaxZoom = getMaxZoom(cameraCharacteristics);
        }
        int i9 = this.mSkipControl;
        if (i9 == 1) {
            this.mExposureMode = 1;
        }
        if (i9 == 2) {
            this.mFocusMode = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeCameraStateAndNotify(int i) {
        Logging.m88100i(TAG, "changeCameraStateAndNotify() " + i);
        synchronized (this.mCameraStateLock) {
            this.mCameraState = i;
            this.mCameraStateLock.notifyAll();
        }
    }

    private void configureCommonCaptureSettings(CaptureRequest.Builder builder) {
        int i;
        int i2;
        this.mThreadChecker.checkIsOnValidThread();
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return;
        }
        int i3 = this.mFocusMode;
        if (i3 == 4) {
            if (isSupportedFocusMode(cameraCharacteristics, 3) && ((i2 = this.mCameraFocusMode) == 2 || i2 == 1)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            } else if (isSupportedFocusMode(cameraCharacteristics, 4) && ((i = this.mCameraFocusMode) == 3 || i == 1)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            }
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        } else if (i3 == 2) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(1.0f / this.mCurrentFocusDistance));
        }
        int i4 = this.mExposureMode;
        if (i4 == 1 || i4 == 2) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 0);
            long j = this.mLastExposureTimeNs;
            if (j != 0) {
                builder.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j / kNanosecondsPer100Microsecond));
            } else {
                Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
                builder.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf((((Long) range.getLower()).longValue() + ((((Long) range.getUpper()).longValue() + ((Long) range.getLower()).longValue()) / 2)) / kNanosecondsPer100Microsecond));
            }
        } else {
            builder.set(CaptureRequest.CONTROL_MODE, 1);
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            if (!shouldSkipSettingAeTargetFpsRange()) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.mAeFpsRange);
            }
        }
        if (this.mIsCameraTorchStarted) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mExposureMode == 4 ? 1 : 0));
            builder.set(CaptureRequest.FLASH_MODE, 2);
        } else {
            int i5 = this.mFillLightMode;
            if (i5 == 1) {
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i5 == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mRedEyeReduction ? 4 : 2));
            } else if (i5 == 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                builder.set(CaptureRequest.FLASH_MODE, 1);
            }
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        }
        int i6 = this.mColorTemperature;
        if (i6 > 0) {
            int closestWhiteBalance = getClosestWhiteBalance(i6, (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES));
            Logging.m88097d(TAG, String.format(Locale.US, " Color temperature (%d ==> %d)", Integer.valueOf(this.mColorTemperature), Integer.valueOf(closestWhiteBalance)));
            if (closestWhiteBalance != -1) {
                builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(closestWhiteBalance));
            }
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null || iArr.length <= 0) {
            Logging.m88100i(TAG, "Camera " + this.mCameraId + " does not support white balance");
        } else {
            Logging.m88100i(TAG, "Camera " + this.mCameraId + " supports white balance, " + Arrays.toString(iArr));
            if (this.mCameraAutoWhiteBalance && isSupported(1, iArr)) {
                builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
            }
        }
        MeteringRectangle meteringRectangle = this.mAreaOfInterest;
        if (meteringRectangle != null) {
            MeteringRectangle[] meteringRectangleArr = {meteringRectangle};
            Logging.m88100i(TAG, String.format(Locale.US, "Area of interest %s", meteringRectangle.toString()));
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
            builder.set(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr);
        }
        if (!this.mCropRect.isEmpty()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, this.mCropRect);
        }
        int i7 = this.mIso;
        if (i7 > 0) {
            builder.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i7));
        }
    }

    @Deprecated
    private boolean createBufferPreviewObjectsAndStartPreview() {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mCameraDevice == null) {
            return false;
        }
        synchronized (this.mImageReaderLock) {
            this.mImageReader = ImageReader.newInstance(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), this.mCaptureFormat.getPixelFormat(), 2);
            try {
                this.mImageReader.setOnImageAvailableListener(new CrPreviewReaderListener(), this.mCameraThreadHandler);
            } catch (IllegalArgumentException e) {
                Logging.m88099e(TAG, "setOnImageAvailableListener error", e);
            }
        }
        return createPreviewObjectsAndStartPreview(this.mImageReader.getSurface());
    }

    private int createCaptureRequest() {
        try {
            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
            return 0;
        } catch (CameraAccessException e) {
            Logging.m88099e(TAG, "setRepeatingRequest: ", e);
            return -1;
        } catch (IllegalArgumentException e2) {
            Logging.m88099e(TAG, "setRepeatingRequest: ", e2);
            return -2;
        } catch (IllegalStateException e3) {
            Logging.m88098e(TAG, "capture:" + e3);
            return -4;
        } catch (NoClassDefFoundError unused) {
            return -1;
        } catch (SecurityException e4) {
            Logging.m88099e(TAG, "setRepeatingRequest: ", e4);
            return -3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    private boolean createPreviewObjectsAndStartPreview(Surface surface) {
        List<Surface> listAsList;
        boolean z;
        int i;
        int i2;
        int i3;
        try {
            int i4 = this.mCameraTemplateType;
            int i5 = i4 == 0 ? 1 : 3;
            String str = TAG;
            Logging.m88100i(str, "createCaptureRequest templateType: ".concat(i4 == 0 ? "preview" : "record"));
            CaptureRequest.Builder builderCreateCaptureRequest = this.mCameraDevice.createCaptureRequest(i5);
            this.mPreviewRequestBuilder = builderCreateCaptureRequest;
            if (builderCreateCaptureRequest == null) {
                Logging.m88098e(str, "mPreviewRequestBuilder error");
                return false;
            }
            builderCreateCaptureRequest.addTarget(surface);
            CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
            CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
            builder.set(key, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            configureCommonCaptureSettings(this.mPreviewRequestBuilder);
            if (this.mEnableFaceDetection || this.mCameraAutoFaceFocus) {
                this.mPreviewRequestBuilder.set(key, 2);
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
            }
            requestFaceDetection(this.mPreviewRequestBuilder, this.mFaceDetectMode);
            if (!this.mIsCameraTorchStarted && (i3 = this.mTorchMode) != 0) {
                setTorchMode(i3 == 1);
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
            if (!this.mIsExposureCompensationStarted && (i2 = this.mCameraExposureCompensation) != 0) {
                setExposureCompensation(i2);
            }
            if (!this.mIsNoiseReducationStarted && (i = this.mCameraNoiseReduction) != 0) {
                setNoiseReductionMode(i);
            }
            if (!this.mAutoFaceDetectFocusStarted && (z = this.mCameraAutoFaceFocus)) {
                setAutoFaceFocus(z);
            }
            if (this.mCameraExtraSurface) {
                synchronized (this.mImageReaderLock) {
                    ImageReader imageReaderNewInstance = ImageReader.newInstance(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), this.mCaptureFormat.getPixelFormat(), 2);
                    this.xiaomiReader = imageReaderNewInstance;
                    listAsList = Arrays.asList(surface, imageReaderNewInstance.getSurface());
                    Logging.m88098e(str, "createCaptureSession add extra surface.");
                }
            } else {
                String str2 = Build.MODEL;
                if (str2.equalsIgnoreCase("redmi note 8") || str2.equalsIgnoreCase("redmi note 8 pro")) {
                    synchronized (this.mImageReaderLock) {
                        ImageReader imageReaderNewInstance2 = ImageReader.newInstance(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), this.mCaptureFormat.getPixelFormat(), 2);
                        this.xiaomiReader = imageReaderNewInstance2;
                    }
                    listAsList = Arrays.asList(surface, imageReaderNewInstance2.getSurface());
                    Logging.m88098e(str, "createCaptureSession add extra surface.");
                } else {
                    listAsList = Collections.singletonList(surface);
                }
            }
            try {
                this.mCameraDevice.createCaptureSession(listAsList, new CrPreviewSessionListener(), null);
                return true;
            } catch (CameraAccessException e) {
                Logging.m88098e(TAG, "createCaptureSession: " + e.getMessage());
                return false;
            } catch (IllegalArgumentException e2) {
                Logging.m88098e(TAG, "createCaptureSession: " + e2.getMessage());
                return false;
            } catch (NoClassDefFoundError e3) {
                Logging.m88098e(TAG, "createCaptureSession: " + e3.getMessage());
                return false;
            } catch (SecurityException e4) {
                Logging.m88098e(TAG, "createCaptureSession: " + e4.getMessage());
                return false;
            }
        } catch (CameraAccessException e5) {
            Logging.m88098e(TAG, "createCaptureRequest: " + e5.getMessage());
            return false;
        } catch (IllegalArgumentException e6) {
            Logging.m88098e(TAG, "createCaptureRequest: " + e6.getMessage());
            return false;
        } catch (SecurityException e7) {
            Logging.m88098e(TAG, "createCaptureRequest: " + e7.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createPreviewObjectsAndStartPreviewOrFailWith(int i) {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mCaptureToTexture) {
            if (createTexturePreviewObjectsAndStartPreview()) {
                return;
            }
        } else if (createBufferPreviewObjectsAndStartPreview()) {
            return;
        }
        changeCameraStateAndNotify(4);
        onError(i, "Error starting or restarting preview");
    }

    private boolean createTexturePreviewObjectsAndStartPreview() {
        ISurfaceTextureHelper iSurfaceTextureHelper;
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mCameraDevice != null && (iSurfaceTextureHelper = this.mSurfaceTextureHelper) != null) {
            try {
                iSurfaceTextureHelper.setTextureSize(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight());
                this.mSurface = new Surface(this.mSurfaceTextureHelper.getSurfaceTexture());
                this.mSurfaceTextureHelper.startListening(new TextureVideoSinkListener());
                return createPreviewObjectsAndStartPreview(this.mSurface);
            } catch (IllegalArgumentException e) {
                Logging.m88099e(TAG, "setTextureSize:", e);
            }
        }
        return false;
    }

    private Rect cropRegionForZoom(float f) {
        int iWidth = this.mSensorRect.width() / 2;
        int iHeight = this.mSensorRect.height() / 2;
        int iWidth2 = (int) ((this.mSensorRect.width() * 0.5f) / f);
        int iHeight2 = (int) ((this.mSensorRect.height() * 0.5f) / f);
        return new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
    }

    private static int findInIntArray(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean getCamera2SupportedAutoFocus(int i) {
        int[] iArr;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i);
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) == null) {
            return false;
        }
        for (int i2 : iArr) {
            Logging.m88100i(TAG, "Auto-focus mode: " + i2);
        }
        boolean z = isSupported(3, iArr) || isSupported(4, iArr);
        if (!z) {
            Logging.m88100i(TAG, "Auto-focus is not available.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    public static int getCamera2SupportedFaceDetect(int i) {
        int i2;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i);
        boolean z = false;
        if (cameraCharacteristics == null) {
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        if (iArr != null) {
            i2 = 1;
            if (iArr.length <= 1 || num == null || num.intValue() <= 0) {
                i2 = 0;
            } else {
                int i3 = 0;
                for (int i4 : iArr) {
                    Logging.m88097d(TAG, "fdMode: " + i4);
                    i3 += i4;
                }
                if (i3 % 2 != 0) {
                    z = true;
                } else {
                    i2 = 2;
                    z = true;
                }
            }
        } else {
            i2 = 0;
        }
        Logging.m88100i(TAG, "faceDetectSupported: " + z + " ,faceDetectMode: " + i2);
        return i2;
    }

    public static int getCamera2SupportedLevel(int i) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i);
        if (cameraCharacteristics == null) {
            return 2;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        Logging.m88102w(TAG, "get camera hardware level fail!");
        return 2;
    }

    public static boolean getCamera2SupportedNoise(int i) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i));
        if (cameraCharacteristics == null) {
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
        String str = TAG;
        Logging.m88100i(str, "noise_reduction_mode_high_quality supported: " + isSupported(2, iArr));
        boolean zIsSupported = isSupported(1, iArr);
        Logging.m88100i(str, "noise_reduction_mode_fast supported: " + zIsSupported);
        return zIsSupported;
    }

    @Nullable
    private static CameraCharacteristics getCameraCharacteristics(int i) {
        CameraManager cameraManager;
        CameraCharacteristics cameraCharacteristics;
        boolean cameraCacheNumbers = VideoCaptureFactory.ChromiumCameraInfo.getCameraCacheNumbers();
        if (cameraCacheNumbers && (cameraCharacteristics = cameraCharacteristicMaps.get(Integer.valueOf(i))) != null) {
            return cameraCharacteristics;
        }
        if (ContextUtils.getApplicationContext() == null || (cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")) == null) {
            return null;
        }
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (i >= cameraIdList.length) {
                Logging.m88100i(TAG, "physical camera Index: " + i);
            }
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(cameraIdList[i]);
            if (cameraCacheNumbers) {
                cameraCharacteristicMaps.put(Integer.valueOf(i), cameraCharacteristics2);
            }
            return cameraCharacteristics2;
        } catch (CameraAccessException e) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e.getMessage());
            return null;
        } catch (AssertionError e2) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e2.getMessage());
            return null;
        } catch (IllegalArgumentException e3) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e3.getMessage());
            return null;
        } catch (Exception e4) {
            Logging.m88098e(TAG, "getNumberOfCameras: got exception: " + e4);
            return null;
        }
    }

    public static int getCaptureApiType(int i) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i));
        if (cameraCharacteristics == null) {
            return 11;
        }
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (iIntValue == 2) {
            return 7;
        }
        for (int i2 : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i2 == 0) {
                if (iIntValue != 0) {
                    return iIntValue != 1 ? 7 : 8;
                }
                return 9;
            }
        }
        return 11;
    }

    private static int getClosestWhiteBalance(int i, int[] iArr) {
        int iAbs;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = 0;
        int iValueAt = -1;
        while (true) {
            SparseIntArray sparseIntArray = COLOR_TEMPERATURES_MAP;
            if (i3 >= sparseIntArray.size()) {
                return iValueAt;
            }
            if (findInIntArray(iArr, sparseIntArray.valueAt(i3)) != -1 && (iAbs = Math.abs(i - sparseIntArray.keyAt(i3))) < i2) {
                iValueAt = sparseIntArray.valueAt(i3);
                i2 = iAbs;
            }
            i3++;
        }
    }

    @Nullable
    public static String getDeviceId(int i) {
        try {
            String[] cameraIdList = ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).getCameraIdList();
            if (i >= cameraIdList.length) {
                Logging.m88098e(TAG, "Invalid camera index: " + i);
            }
            return cameraIdList[i];
        } catch (CameraAccessException e) {
            Logging.m88098e(TAG, "manager.getCameraIdList: " + e);
            return null;
        } catch (Exception e2) {
            Logging.m88098e(TAG, "manager.getCameraIdList: " + e2);
            return null;
        }
    }

    @Nullable
    public static List<VideoCaptureFormat> getDeviceSupportedFormats(int i) {
        Logging.m88100i(TAG, "getDeviceSupportedFormats() " + i);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i));
        if (cameraCharacteristics == null) {
            return null;
        }
        return getFormatsFromParemeters(cameraCharacteristics, IMAGE_FORMAT);
    }

    public static int getFacingMode(int i) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i));
        if (cameraCharacteristics == null) {
            return 0;
        }
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue != 0) {
            return iIntValue != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static boolean getFocalLengthInfo(CameraCharacteristics cameraCharacteristics, String str, int i, FocalLengthInfo[] focalLengthInfoArr) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return false;
        }
        ?? r0 = num.intValue() == 0 ? 1 : 0;
        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        int i2 = (i - 1) * 6;
        int i3 = (r0 != 0 ? 0 : 3) + i2;
        if (focalLengthInfoArr[i3] == null) {
            Logging.m88097d(TAG, "getFocalLengthInfo cameraDirection " + ((int) r0) + " index: " + i3 + " id: " + str + " focalLengthType: 0 front: " + ((boolean) r0));
            focalLengthInfoArr[i3] = new FocalLengthInfo(r0, i3, Integer.parseInt(str), 0);
        }
        if (fArr != null && fArr.length != 0) {
            float fMin = fArr[0];
            for (float f : fArr) {
                fMin = Math.min(f, fMin);
            }
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("The ");
            sb.append(r0 != 0 ? "front Camera " : "rear Camera ");
            sb.append("minimum supported value is: ");
            sb.append(10.0f * fMin);
            sb.append("mm");
            Logging.m88097d(str2, sb.toString());
            if (fMin >= 2.4f && fMin < 3.5f) {
                int i4 = i2 + (r0 == 0 ? 3 : 0) + 1;
                Logging.m88097d(str2, "getFocalLengthInfo cameraDirection " + ((int) r0) + " index: " + i4 + " id: " + str + " focalLengthType: 1 front: " + ((boolean) r0));
                focalLengthInfoArr[i4] = new FocalLengthInfo(r0, i4, Integer.parseInt(str), 1);
                return true;
            }
            if (fMin < 2.4f && fMin > 0.1d) {
                int i5 = i2 + (r0 == 0 ? 3 : 0) + 2;
                Logging.m88097d(str2, "getFocalLengthInfo cameraDirection " + ((int) r0) + " index: " + i5 + " id: " + str + " focalLengthType: 2 front: " + ((boolean) r0));
                focalLengthInfoArr[i5] = new FocalLengthInfo(r0, i5, Integer.parseInt(str), 2);
                return true;
            }
        }
        return false;
    }

    @NonNull
    private static List<VideoCaptureFormat> getFormatsFromParemeters(@NonNull CameraCharacteristics cameraCharacteristics, int i) {
        boolean z;
        Size[] outputSizes;
        int i2;
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z = false;
                break;
            }
            z = true;
            if (iArr[i3] == 1) {
                break;
            }
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            int[] outputFormats = streamConfigurationMap.getOutputFormats();
            int length2 = outputFormats.length;
            int i4 = 0;
            while (i4 < length2) {
                int i5 = outputFormats[i4];
                if (i5 == i && (outputSizes = streamConfigurationMap.getOutputSizes(i5)) != null) {
                    int length3 = outputSizes.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        Size size = outputSizes[i6];
                        if (VideoCaptureCamera.shouldExcludeSize(size.getWidth(), size.getHeight())) {
                            i2 = length2;
                        } else {
                            double d = 30.0d;
                            if (z) {
                                i2 = length2;
                                long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(i5, size);
                                if (outputMinFrameDuration != 0) {
                                    d = kNanosecondsPerSecond / outputMinFrameDuration;
                                }
                            } else {
                                i2 = length2;
                            }
                            arrayList.add(new VideoCaptureFormat(size.getWidth(), size.getHeight(), (int) d, i5));
                        }
                        i6++;
                        length2 = i2;
                    }
                }
                i4++;
                length2 = length2;
            }
            return arrayList;
        } catch (Exception e) {
            Logging.m88099e(TAG, "Unable to catch device supported video formats: ", e);
            return arrayList;
        }
    }

    private static float getMaxZoom(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return DEFAULT_VALUE;
        }
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null) {
            return f.floatValue();
        }
        Logging.m88102w(TAG, "warning get max zoom return null");
        return DEFAULT_VALUE;
    }

    @Nullable
    public static String getName(int i) {
        String str;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i));
        if (cameraCharacteristics == null) {
            Logging.m88098e(TAG, "getName: " + i + " , failed to getCameraCharacteristics.");
            return null;
        }
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue != 0) {
            str = "back";
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    Logging.m88098e(TAG, "Invalid camera facing value, and fallback to back: " + iIntValue);
                } else {
                    str = "extra";
                }
            }
        } else {
            str = "front";
        }
        return "camera2 " + i + ", facing " + str;
    }

    public static int getNumberOfCameras() {
        CameraIdListTask cameraIdListTask = new CameraIdListTask();
        if (cameraIdListTask.getCameraIdList() == null) {
            return 0;
        }
        return cameraIdListTask.getCameraIdList().length;
    }

    private static Range<Float> getZoomRationRange(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
        }
        return null;
    }

    private static String indexConvertCameraId(int i) {
        try {
            String[] cameraIdList = ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).getCameraIdList();
            if (i >= cameraIdList.length) {
                Logging.m88097d(TAG, "physical camera Index: " + i);
            }
            return cameraIdList[i];
        } catch (CameraAccessException e) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e.getMessage());
            return null;
        } catch (AssertionError e2) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e2.getMessage());
            return null;
        } catch (IllegalArgumentException e3) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e3.getMessage());
            return null;
        } catch (Exception e4) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e4.getMessage());
            return null;
        }
    }

    public static boolean isLegacyDevice(int i) {
        return getCameraCharacteristics(indexConvertCameraId(i)) != null && getCamera2SupportedLevel(i) == 2;
    }

    private static boolean isSupported(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedFocusMode(CameraCharacteristics cameraCharacteristics, int i) {
        int[] iArr;
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) == null) {
            return false;
        }
        for (int i2 : iArr) {
            Logging.m88100i(TAG, "availableFocusModes: " + i2);
            if (i2 == i) {
                return true;
            }
        }
        Logging.m88100i(TAG, "Auto-focus is not available.");
        return false;
    }

    private boolean isSupportedStability(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean physicalFallback(CameraManager cameraManager, CrStateListener crStateListener) {
        try {
            this.mPhysicalId = null;
            String str = TAG;
            Logging.m88097d(str, "allocate physical camera failure, try logical camera.");
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (this.mId >= cameraIdList.length) {
                Logging.m88098e(str, "Invalid camera Id: " + this.mId);
                return false;
            }
            Logging.m88097d(str, "allocate open logicalCamera: " + this.mId + " camera name:" + cameraIdList[this.mId]);
            cameraManager.openCamera(cameraIdList[this.mId], crStateListener, this.mCameraThreadHandler);
            this.mCameraId = cameraIdList[this.mId];
            return true;
        } catch (CameraAccessException e) {
            Logging.m88098e(TAG, "allocate: manager.openCamera: " + e.getMessage());
            return false;
        } catch (IllegalArgumentException e2) {
            Logging.m88098e(TAG, "allocate: manager.openCamera: " + e2.getMessage());
            return false;
        } catch (SecurityException e3) {
            Logging.m88098e(TAG, "allocate: manager.openCamera: " + e3.getMessage());
            return false;
        }
    }

    @Nullable
    public static List<FocalLengthInfo> queryCameraFocalLengthCapability(boolean z) {
        CameraManager cameraManager;
        CameraCharacteristics cameraCharacteristics;
        boolean zQueryPhysicalFocalLengths;
        CameraCharacteristics cameraCharacteristics2 = null;
        if (ContextUtils.getApplicationContext() == null || (cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")) == null) {
            return null;
        }
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            FocalLengthInfo[] focalLengthInfoArr = new FocalLengthInfo[18];
            if (queryLogicalFocalLengths(cameraManager, cameraIdList, focalLengthInfoArr)) {
                Logging.m88097d(TAG, "Logical Camera, FocalLengths available.");
            } else {
                Logging.m88102w(TAG, "Logical Camera, FocalLengths empty!");
            }
            try {
                cameraCharacteristics = cameraManager.getCameraCharacteristics("0");
                try {
                    cameraCharacteristics2 = cameraManager.getCameraCharacteristics("1");
                } catch (CameraAccessException e) {
                    e = e;
                    ThrowableExtension.printStackTrace(e);
                } catch (Exception e2) {
                    e = e2;
                    ThrowableExtension.printStackTrace(e);
                }
            } catch (CameraAccessException e3) {
                e = e3;
                cameraCharacteristics = null;
            } catch (Exception e4) {
                e = e4;
                cameraCharacteristics = null;
            }
            if (z) {
                Logging.m88102w(TAG, "Skip find physical camera focalLength capability.");
                zQueryPhysicalFocalLengths = false;
            } else {
                zQueryPhysicalFocalLengths = queryPhysicalFocalLengths(cameraManager, cameraCharacteristics, cameraIdList, focalLengthInfoArr);
                if (queryPhysicalFocalLengths(cameraManager, cameraCharacteristics2, cameraIdList, focalLengthInfoArr)) {
                    zQueryPhysicalFocalLengths = true;
                }
            }
            if (zQueryPhysicalFocalLengths) {
                Logging.m88097d(TAG, "Physical Camera, FocalLengths available.");
            } else {
                Logging.m88102w(TAG, "Physical Camera, FocalLengths empty!");
            }
            if ((cameraCharacteristics2 == null || !queryZoomFocalLengths(cameraCharacteristics2, "1", focalLengthInfoArr)) ? cameraCharacteristics != null && queryZoomFocalLengths(cameraCharacteristics, "0", focalLengthInfoArr) : true) {
                Logging.m88097d(TAG, "Supports scaling of less than 1.0 magnification, FocalLengths available.");
            } else {
                Logging.m88102w(TAG, "Scaling less than 1.0 magnification is not supported.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 18; i++) {
                FocalLengthInfo focalLengthInfo = focalLengthInfoArr[i];
                if (!arrayList.contains(focalLengthInfo)) {
                    arrayList.add(focalLengthInfo);
                }
            }
            return arrayList;
        } catch (CameraAccessException e5) {
            ThrowableExtension.printStackTrace(e5);
            return null;
        }
    }

    public static boolean queryLogicalFocalLengths(CameraManager cameraManager, String[] strArr, FocalLengthInfo[] focalLengthInfoArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (String str : strArr) {
            try {
                if (getFocalLengthInfo(cameraManager.getCameraCharacteristics(str), str, 1, focalLengthInfoArr)) {
                    z = true;
                }
            } catch (CameraAccessException e) {
                ThrowableExtension.printStackTrace(e);
            }
        }
        return z;
    }

    private static boolean queryPhysicalFocalLengths(CameraManager cameraManager, CameraCharacteristics cameraCharacteristics, String[] strArr, FocalLengthInfo[] focalLengthInfoArr) {
        boolean z;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (strArr != null && strArr.length != 0 && cameraCharacteristics != null) {
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr == null) {
                z = false;
                break;
            }
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (iArr[i] == 11) {
                    z = true;
                    break;
                }
                i++;
            }
            Logging.m88097d(TAG, "physicalCamera Available: " + z);
            if (!z) {
                return false;
            }
            Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
            if (physicalCameraIds.isEmpty()) {
                return false;
            }
            for (String str : physicalCameraIds) {
                try {
                    if (getFocalLengthInfo(cameraManager.getCameraCharacteristics(str), str, 2, focalLengthInfoArr)) {
                        z2 = true;
                    }
                } catch (CameraAccessException e) {
                    ThrowableExtension.printStackTrace(e);
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static boolean queryZoomFocalLengths(CameraCharacteristics cameraCharacteristics, String str, FocalLengthInfo[] focalLengthInfoArr) {
        if (cameraCharacteristics == null) {
            return false;
        }
        Range<Float> zoomRationRange = getZoomRationRange(cameraCharacteristics);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return false;
        }
        ?? r2 = num.intValue() == 0 ? 1 : 0;
        int i = (r2 != 0 ? 0 : 3) + 12;
        if (focalLengthInfoArr[i] == null) {
            Logging.m88097d(TAG, "Zoom FocalLengthInfo cameraDirection " + ((int) r2) + " index: " + i + " id: " + str + " focalLengthType: 0 front: " + ((boolean) r2));
            focalLengthInfoArr[i] = new FocalLengthInfo(r2, i, Integer.parseInt(str), 0);
        }
        if (zoomRationRange == null || ((Float) zoomRationRange.getLower()).floatValue() >= 1.0f) {
            return false;
        }
        if (!getFocalLengthInfo(cameraCharacteristics, str, 3, focalLengthInfoArr)) {
            int i2 = (r2 == 0 ? 3 : 0) + 13;
            Logging.m88097d(TAG, "Zoom FocalLengthInfo cameraDirection " + ((int) r2) + " index: " + i2 + " id: " + str + " focalLengthType: 1 front: " + ((boolean) r2));
            focalLengthInfoArr[i2] = new FocalLengthInfo(r2, i2, Integer.parseInt(str), 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestFaceDetection(CaptureRequest.Builder builder, int i) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (builder == null) {
                        Logging.m88098e(TAG, "face detect requestBuilder error");
                        return;
                    }
                    if (!this.mFaceDetectSupported) {
                        Logging.m88102w(TAG, "face detect not supported");
                        return;
                    }
                    if (this.mEnableAutoFaceFocus || this.mEnableFaceDetection) {
                        if (i == 0 || this.mIsFaceDetectionStarted) {
                            if (i == 0) {
                                this.mIsFaceDetectionStarted = false;
                                Logging.m88100i(TAG, "requestFaceDetection = 0");
                                this.mPreviewRequestBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                                this.mPerFrameFaceDetectionInfoQueue.clear();
                                return;
                            }
                            return;
                        }
                        this.mIsFaceDetectionStarted = true;
                        Logging.m88100i(TAG, "requestFaceDetection = " + i);
                        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                Logging.m88102w(TAG, "face detect not ready");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean shouldSkipSettingAeTargetFpsRange() {
        for (String str : AE_TARGET_FPS_RANGE_BUGGY_DEVICE_LIST) {
            if (Build.MODEL.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private int toCamera2EdgeEnhanceMode(int i) {
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    private int toCamera2VideoStabilityMode(int i) {
        if (i < 0 || i > 1) {
            return 0;
        }
        return i;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        float fMin;
        String str = TAG;
        Logging.m88100i(str, String.format(Locale.US, "allocate: requested (%d x %d) @%dfps", Integer.valueOf(videoCaptureFormat.getWidth()), Integer.valueOf(videoCaptureFormat.getHeight()), Integer.valueOf(videoCaptureFormat.getFramerate())));
        synchronized (this.mCameraStateLock) {
            int i = this.mCameraState;
            if (i != 0 && i != 1) {
                String str2 = this.mPhysicalId;
                CameraCharacteristics cameraCharacteristics = str2 != null ? getCameraCharacteristics(str2) : getCameraCharacteristics(this.mId);
                if (cameraCharacteristics == null) {
                    Logging.m88098e(str, "failed to getCameraCharacteristics.");
                    return false;
                }
                List<VideoCaptureFormat> formatsFromParemeters = getFormatsFromParemeters(cameraCharacteristics, IMAGE_FORMAT);
                Logging.m88100i(str, "format list: " + Arrays.toString(formatsFromParemeters.toArray()));
                VideoCaptureFormat videoCaptureFormatFindBestMatchedCapability = VideoCapture.FindBestMatchedCapability(formatsFromParemeters, videoCaptureFormat);
                this.mCaptureFormat = videoCaptureFormatFindBestMatchedCapability;
                if (videoCaptureFormatFindBestMatchedCapability == null) {
                    Logging.m88098e(str, "failed to match capability");
                    return false;
                }
                List<Range> listAsList = Arrays.asList((Object[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                Logging.m88100i(str, "fpsRanges: " + Arrays.toString(listAsList.toArray()));
                if (listAsList.isEmpty()) {
                    Logging.m88098e(str, "No supported framerate ranges.");
                    return false;
                }
                ArrayList arrayList = new ArrayList(listAsList.size());
                int i2 = ((Integer) ((Range) listAsList.get(0)).getUpper()).intValue() > 1000 ? 1 : 1000;
                for (Range range : listAsList) {
                    arrayList.add(new VideoCapture.FramerateRange(((Integer) range.getLower()).intValue() * i2, ((Integer) range.getUpper()).intValue() * i2));
                }
                VideoCapture.FramerateRange framerateRangeFindBestFrameRateRange = VideoCaptureCamera.findBestFrameRateRange(arrayList, this.mCaptureFormat.getFramerate() * 1000, this.mPQFirst);
                if (framerateRangeFindBestFrameRateRange == null) {
                    Logging.m88098e(TAG, "No matched framerate ranges.");
                    return false;
                }
                float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr == null || fArr.length <= 0) {
                    fMin = 0.0f;
                } else {
                    fMin = fArr[0];
                    for (float f : fArr) {
                        fMin = Math.min(f, fMin);
                    }
                }
                this.mAeFpsRange = new Range<>(Integer.valueOf(framerateRangeFindBestFrameRateRange.min / i2), Integer.valueOf(framerateRangeFindBestFrameRateRange.max / i2));
                Logging.m88100i(TAG, String.format(Locale.US, "allocate: matched (%d x %d) @[%d - %d], %dmm", Integer.valueOf(this.mCaptureFormat.mWidth), Integer.valueOf(this.mCaptureFormat.mHeight), this.mAeFpsRange.getLower(), this.mAeFpsRange.getUpper(), Integer.valueOf((int) (fMin * 10.0f))));
                this.mCameraNativeOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                this.mInvertDeviceOrientationReadings = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
                if (iArr != null && iArr.length > 1 && num != null && num.intValue() > 0) {
                    this.mFaceDetectSupported = true;
                    int i3 = 0;
                    for (int i4 : iArr) {
                        i3 += i4;
                    }
                    if (i3 % 2 != 0) {
                        this.mFaceDetectMode = 1;
                    } else {
                        this.mFaceDetectMode = 2;
                    }
                }
                Logging.m88100i(TAG, "allocate() face detection: " + this.mFaceDetectMode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + num + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mFaceDetectSupported);
                return true;
            }
            Logging.m88098e(str, "allocate() invoked while Camera is busy opening/configuring.");
            return false;
        }
    }

    public Rect clampFace(Rect rect) {
        int iClamp = CoordinatesTransform.clamp(rect.left, 0, rect.right);
        int iClamp2 = CoordinatesTransform.clamp(rect.top, 0, rect.bottom);
        int i = rect.right;
        int iClamp3 = CoordinatesTransform.clamp(i, 0, i);
        int i2 = rect.bottom;
        return new Rect(iClamp, iClamp2, iClamp3, CoordinatesTransform.clamp(i2, 0, i2));
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        Logging.m88100i(TAG, "deallocate()");
    }

    public void finalize() {
        Handler handler = this.mCameraThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mCameraThreadHandler.getLooper().quitSafely();
            this.mCameraThreadHandler = null;
        }
    }

    @VisibleForTesting
    public Handler getCameraThreadHandler() {
        return this.mCameraThreadHandler;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isAutoFaceFocusSupported() {
        if (!isFocusSupported()) {
            return false;
        }
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        return num != null && num.intValue() > 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isCameraExposureSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range != null && rational != null) {
            int iIntValue = ((Integer) range.getUpper()).intValue();
            int iIntValue2 = ((Integer) range.getLower()).intValue();
            Logging.m88100i(TAG, "isCameraExposureSupported compensation min: " + iIntValue2 + " max: " + iIntValue);
            if (iIntValue2 < 0 && iIntValue > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isExposureSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                Logging.m88100i(TAG, "isExposureSupported AE mode = " + iArr[i]);
                if (1 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFaceDetectSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        int iIntValue = num == null ? 0 : num.intValue();
        Logging.m88100i(TAG, "face dedect, numDetectedFaces: " + iIntValue);
        return iIntValue > 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFocusSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                if (1 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isTorchSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.m88102w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isZoomSupported() {
        if (this.mMaxZoom > 1.0f) {
            return true;
        }
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics != null) {
            this.mMaxZoom = getMaxZoom(cameraCharacteristics);
        }
        return this.mMaxZoom > 1.0f;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean needFallback() {
        return true;
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraAvailable(String str) {
        String str2 = TAG;
        Logging.m88100i(str2, "onCameraAvailable " + str + " mCameraId: " + this.mCameraId);
        if (str.equals(this.mCameraId)) {
            synchronized (this.mCameraStateLock) {
                try {
                    if (this.mCameraState == 3) {
                        onAvailable(0);
                        return;
                    }
                    Logging.m88100i(str2, "onCameraAvailable, Wrong state " + this.mCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraUnavailable(String str) {
        if (str.equals(this.mCameraId)) {
            synchronized (this.mCameraStateLock) {
                try {
                    if (this.mCameraState == 3) {
                        onAvailable(1);
                        return;
                    }
                    Logging.m88100i(TAG, "onCameraUnavailable, Wrong state " + this.mCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAntiBandingMode(int i) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsAntiBandingStarted && this.mCameraAntiBandingMode == i) {
                        return 0;
                    }
                    this.mCameraAntiBandingMode = i;
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (i < 0 || i > 3) {
                        i = 3;
                    }
                    int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
                    if (iArr != null && iArr.length > 0) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                if (this.mPreviewSession != null) {
                                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(i));
                                    try {
                                        Logging.m88100i(TAG, "setAntiBandingMode = " + i);
                                        this.mIsAntiBandingStarted = true;
                                        this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                                        return 0;
                                    } catch (CameraAccessException e) {
                                        ThrowableExtension.printStackTrace(e);
                                    } catch (IllegalArgumentException e2) {
                                        ThrowableExtension.printStackTrace(e2);
                                    } catch (IllegalStateException e3) {
                                        ThrowableExtension.printStackTrace(e3);
                                    }
                                }
                                Logging.m88100i(TAG, "AgoraVideo set anti-banding = " + i);
                                return -1;
                            }
                        }
                    }
                    Logging.m88098e(TAG, "not supported anti-banding = " + i);
                    return -1;
                }
                this.mCameraAntiBandingMode = i;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAutoFaceFocus(boolean z) {
        CaptureRequest.Builder builder;
        synchronized (this.mSwitchLock) {
            try {
                if (this.mEnableAutoFaceFocus == z) {
                    Logging.m88102w(TAG, "face detect no change");
                    return 0;
                }
                this.mEnableAutoFaceFocus = z;
                if (!this.mFaceDetectSupported) {
                    Logging.m88102w(TAG, "face detect not supported");
                    return 0;
                }
                if (this.mPreviewSession != null && this.mCameraThreadHandler != null && (builder = this.mPreviewRequestBuilder) != null) {
                    if (z) {
                        if (!this.mIsFaceDetectionStarted) {
                            this.mIsFaceDetectionStarted = true;
                            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.mFaceDetectMode));
                        }
                    } else {
                        if (this.mEnableFaceDetection) {
                            Logging.m88102w(TAG, "face detect did not turn off due to faceDistance on");
                            return 0;
                        }
                        this.mIsFaceDetectionStarted = false;
                        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                        this.mPerFrameFaceDetectionInfoQueue.clear();
                    }
                    CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                    if (cameraCaptureSession != null) {
                        try {
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e) {
                            ThrowableExtension.printStackTrace(e);
                        } catch (IllegalArgumentException e2) {
                            ThrowableExtension.printStackTrace(e2);
                        } catch (IllegalStateException e3) {
                            ThrowableExtension.printStackTrace(e3);
                        }
                    }
                    return 0;
                }
                Logging.m88102w(TAG, "face detect not ready");
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public void setCameraThreadHandler() {
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera2_CameraThread");
        handlerThread.start();
        this.mCameraThreadHandler = new Handler(handlerThread.getLooper());
        this.mThreadChecker = new ThreadUtils.ThreadChecker(handlerThread);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setEdgeEnhanceMode(int i) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsEdgeEnhanceStarted && this.mCamerEdgeEnhanceMode == i) {
                        return 0;
                    }
                    this.mCamerEdgeEnhanceMode = i;
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (i < 0 || i > 3) {
                        i = 0;
                    }
                    if (isSupported(i, (int[]) cameraCharacteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES)) && this.mPreviewSession != null) {
                        this.mPreviewRequestBuilder.set(CaptureRequest.EDGE_MODE, Integer.valueOf(i));
                        try {
                            Logging.m88100i(TAG, "setEdgeEnhanceMode = " + i);
                            this.mIsEdgeEnhanceStarted = true;
                            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e) {
                            ThrowableExtension.printStackTrace(e);
                        } catch (IllegalArgumentException e2) {
                            ThrowableExtension.printStackTrace(e2);
                        } catch (IllegalStateException e3) {
                            ThrowableExtension.printStackTrace(e3);
                        }
                    }
                    Logging.m88098e(TAG, "not supported EdgeEnhance Mode = " + i);
                    return -1;
                }
                this.mCamerEdgeEnhanceMode = i;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposure(float f, float f2) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null && this.mRenderView.getWidth() != 0 && this.mRenderView.getHeight() != 0) {
                    if (this.mIsmCameraExposureStarted && Math.abs(this.mCameraExposurePositions[0] - f) < 0.1d && Math.abs(this.mCameraExposurePositions[1] - f2) < 0.1d) {
                        return 0;
                    }
                    float[] fArr = this.mCameraExposurePositions;
                    fArr[0] = f;
                    fArr[1] = f2;
                    String str = TAG;
                    Logging.m88100i(str, "setExposure called camera api2 " + f + BaseSei.f14624X + f2);
                    if (f < 0.0f || f > this.mRenderView.getWidth() || f2 < 0.0f || f2 > this.mRenderView.getHeight()) {
                        Logging.m88098e(str, "set exposure unreasonable inputs");
                        return -1;
                    }
                    Rect rect = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        return -1;
                    }
                    RectF rectF = new RectF(f, f2, f, f2);
                    int width = this.mRenderView.getWidth();
                    int height = this.mRenderView.getHeight();
                    VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
                    int i = videoCaptureFormat.mWidth;
                    int i2 = videoCaptureFormat.mHeight;
                    int i3 = this.mId;
                    RectF rectFViewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i, i2, i3 == 1, (i3 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
                    if (rectFViewToNormalized == null) {
                        Logging.m88100i(str, "setExposure coordinate " + f + " - " + f2 + " out of image bounds!!");
                        return -1;
                    }
                    float f3 = rectFViewToNormalized.left;
                    float f4 = rectFViewToNormalized.top;
                    RectF rectF2 = new RectF();
                    rectF2.left = CoordinatesTransform.clamp(f3 - 0.05f, 0.0f, 1.0f);
                    rectF2.right = CoordinatesTransform.clamp(f3 + 0.05f, 0.0f, 1.0f);
                    rectF2.top = CoordinatesTransform.clamp(f4 - 0.05f, 0.0f, 1.0f);
                    rectF2.bottom = CoordinatesTransform.clamp(f4 + 0.05f, 0.0f, 1.0f);
                    VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
                    RectF rectFNormalizedToSensor = CoordinatesTransform.normalizedToSensor(rectF2, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, rect.width(), rect.height(), (this.mId == 1 ? 1 : -1) * getCameraRotation(), true);
                    if (rectFNormalizedToSensor == null) {
                        Logging.m88102w(str, "Failed to translate input coordinate");
                        return -1;
                    }
                    Rect rect2 = new Rect();
                    if (rectFNormalizedToSensor.width() == 0.0f || rectFNormalizedToSensor.height() == 0.0f) {
                        rect2 = new Rect(0, 0, 0, 0);
                    } else {
                        rectFNormalizedToSensor.round(rect2);
                    }
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                    if (cameraCaptureSession != null) {
                        try {
                            this.mIsmCameraExposureStarted = true;
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), null, this.mCameraThreadHandler);
                        } catch (CameraAccessException e) {
                            ThrowableExtension.printStackTrace(e);
                            return -1;
                        } catch (IllegalArgumentException e2) {
                            ThrowableExtension.printStackTrace(e2);
                            return -1;
                        } catch (IllegalStateException e3) {
                            ThrowableExtension.printStackTrace(e3);
                            return -1;
                        } catch (NoClassDefFoundError e4) {
                            ThrowableExtension.printStackTrace(e4);
                            return -1;
                        }
                    }
                    RectF rectF3 = new RectF(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    int iWidth = rect.width();
                    int iHeight = rect.height();
                    VideoCaptureFormat videoCaptureFormat3 = this.mCaptureFormat;
                    RectF rectFSensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF3, iWidth, iHeight, videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight, true);
                    int width2 = this.mRenderView.getWidth();
                    int height2 = this.mRenderView.getHeight();
                    int width3 = this.mCaptureFormat.getWidth();
                    int height3 = this.mCaptureFormat.getHeight();
                    int i4 = this.mId;
                    RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFSensorToNormalized, width2, height2, width3, height3, i4 == 1, (i4 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
                    if (rectFNormalizedToView == null) {
                        Logging.m88102w(str, "Failed to translate coordinate from normalized to view!!");
                        return -1;
                    }
                    rectFNormalizedToView.round(rect2);
                    notifyCameraExposureAreaChanged(rect2);
                    return 0;
                }
                float[] fArr2 = this.mCameraExposurePositions;
                fArr2[0] = f;
                fArr2[1] = f2;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposureCompensation(int i) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsExposureCompensationStarted && this.mCameraExposureCompensation == i) {
                        return 0;
                    }
                    this.mCameraExposureCompensation = i;
                    String str = TAG;
                    Logging.m88100i(str, "setExposureCompensation:" + i);
                    String str2 = this.mPhysicalId;
                    CameraCharacteristics cameraCharacteristics = str2 != null ? getCameraCharacteristics(str2) : getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
                    Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                    if (range != null && rational != null) {
                        int iIntValue = ((Integer) range.getUpper()).intValue();
                        int iIntValue2 = ((Integer) range.getLower()).intValue();
                        Logging.m88100i(str, "compensation step=" + rational + ", min=" + iIntValue2 + ", max=" + iIntValue);
                        if (i > iIntValue) {
                            i = iIntValue;
                        }
                        if (i >= iIntValue2) {
                            iIntValue2 = i;
                        }
                        if (this.mPreviewSession != null) {
                            try {
                                this.mIsExposureCompensationStarted = true;
                                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(iIntValue2));
                                this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                                return 0;
                            } catch (CameraAccessException e) {
                                ThrowableExtension.printStackTrace(e);
                            } catch (IllegalArgumentException e2) {
                                ThrowableExtension.printStackTrace(e2);
                            } catch (IllegalStateException e3) {
                                ThrowableExtension.printStackTrace(e3);
                            } catch (NoClassDefFoundError e4) {
                                ThrowableExtension.printStackTrace(e4);
                            }
                        }
                    }
                    return -1;
                }
                this.mCameraExposureCompensation = i;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFaceDetection(boolean z) {
        CaptureRequest.Builder builder;
        CaptureRequest.Builder builder2;
        CameraCaptureSession cameraCaptureSession;
        synchronized (this.mSwitchLock) {
            try {
                if (this.mEnableFaceDetection == z) {
                    Logging.m88102w(TAG, "face detect no change");
                    return 0;
                }
                this.mEnableFaceDetection = z;
                if (!this.mFaceDetectSupported) {
                    Logging.m88102w(TAG, "face detect not supported");
                    return 0;
                }
                if (this.mPreviewSession != null && this.mCameraThreadHandler != null && (builder = this.mPreviewRequestBuilder) != null) {
                    if (z) {
                        if (!this.mIsFaceDetectionStarted) {
                            this.mIsFaceDetectionStarted = true;
                            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.mFaceDetectMode));
                        }
                    } else {
                        if (this.mEnableAutoFaceFocus) {
                            Logging.m88102w(TAG, "face detect did not turn off due to autoFocus on");
                            return 0;
                        }
                        this.mIsFaceDetectionStarted = false;
                        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                        this.mPerFrameFaceDetectionInfoQueue.clear();
                    }
                    if (this.mCameraThreadHandler != null && (builder2 = this.mPreviewRequestBuilder) != null && (cameraCaptureSession = this.mPreviewSession) != null) {
                        try {
                            cameraCaptureSession.setRepeatingRequest(builder2.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                        } catch (CameraAccessException e) {
                            ThrowableExtension.printStackTrace(e);
                        } catch (IllegalArgumentException e2) {
                            ThrowableExtension.printStackTrace(e2);
                        } catch (IllegalStateException e3) {
                            ThrowableExtension.printStackTrace(e3);
                        } catch (NoClassDefFoundError e4) {
                            ThrowableExtension.printStackTrace(e4);
                        }
                    }
                    return 0;
                }
                Logging.m88102w(TAG, "face detect not ready");
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFocus(float f, float f2) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null && this.mRenderView.getWidth() != 0 && this.mRenderView.getHeight() != 0) {
                    if (this.mIsmCameraFocusStarted && Math.abs(this.mCameraFocusPositions[0] - f) < 0.1d && Math.abs(this.mCameraFocusPositions[1] - f2) < 0.1d) {
                        return 0;
                    }
                    float[] fArr = this.mCameraFocusPositions;
                    fArr[0] = f;
                    fArr[1] = f2;
                    String str = TAG;
                    Logging.m88100i(str, "setFocus " + f + " - " + f2);
                    if (f < 0.0f || f > this.mRenderView.getWidth() || f2 < 0.0f || f2 > this.mRenderView.getHeight()) {
                        Logging.m88098e(str, "set focus unreasonable inputs");
                        return -1;
                    }
                    Rect rect = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        return -1;
                    }
                    int iWidth = rect.width();
                    int iHeight = rect.height();
                    RectF rectF = new RectF(f, f2, f, f2);
                    int width = this.mRenderView.getWidth();
                    int height = this.mRenderView.getHeight();
                    VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
                    int i = videoCaptureFormat.mWidth;
                    int i2 = videoCaptureFormat.mHeight;
                    int i3 = this.mId;
                    RectF rectFViewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i, i2, i3 == 1, (i3 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
                    if (rectFViewToNormalized == null) {
                        Logging.m88100i(str, "setFocus coordinate " + f + " - " + f2 + " out of image bounds!!");
                        return -1;
                    }
                    float f3 = rectFViewToNormalized.left;
                    float f4 = rectFViewToNormalized.top;
                    RectF rectF2 = new RectF();
                    rectF2.left = CoordinatesTransform.clamp(f3 - 0.05f, 0.0f, 1.0f);
                    rectF2.right = CoordinatesTransform.clamp(f3 + 0.05f, 0.0f, 1.0f);
                    rectF2.top = CoordinatesTransform.clamp(f4 - 0.05f, 0.0f, 1.0f);
                    rectF2.bottom = CoordinatesTransform.clamp(f4 + 0.05f, 0.0f, 1.0f);
                    VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
                    RectF rectFNormalizedToSensor = CoordinatesTransform.normalizedToSensor(rectF2, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, iWidth, iHeight, (this.mId == 1 ? 1 : -1) * getCameraRotation(), true);
                    if (rectFNormalizedToSensor == null) {
                        Logging.m88102w(str, "Failed to translate input coordinate");
                        return -1;
                    }
                    Rect rect2 = new Rect();
                    if (rectFNormalizedToSensor.width() == 0.0f || rectFNormalizedToSensor.height() == 0.0f) {
                        rect2 = new Rect(0, 0, 0, 0);
                    } else {
                        rectFNormalizedToSensor.round(rect2);
                    }
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    if (this.mCameraThreadHandler != null) {
                        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                        if (cameraCaptureSession != null) {
                            try {
                                this.mIsmCameraFocusStarted = true;
                                cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), VideoCaptureCamera.shouldSkipRefocus() ? null : this.mAfCaptureCallback, this.mCameraThreadHandler);
                            } catch (CameraAccessException e) {
                                ThrowableExtension.printStackTrace(e);
                                return -1;
                            } catch (IllegalArgumentException e2) {
                                ThrowableExtension.printStackTrace(e2);
                                return -1;
                            } catch (IllegalStateException e3) {
                                ThrowableExtension.printStackTrace(e3);
                                return -1;
                            }
                        }
                        VideoCaptureFormat videoCaptureFormat3 = this.mCaptureFormat;
                        RectF rectFSensorToNormalized = CoordinatesTransform.sensorToNormalized(rectFNormalizedToSensor, iWidth, iHeight, videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight, true);
                        int width2 = this.mRenderView.getWidth();
                        int height2 = this.mRenderView.getHeight();
                        int width3 = this.mCaptureFormat.getWidth();
                        int height3 = this.mCaptureFormat.getHeight();
                        int i4 = this.mId;
                        RectF rectFNormalizedToView = CoordinatesTransform.normalizedToView(rectFSensorToNormalized, width2, height2, width3, height3, i4 == 1, (i4 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
                        if (rectFNormalizedToView == null) {
                            Logging.m88102w(str, "Failed to translate coordinate from normalized to view!!");
                            return -1;
                        }
                        rectFNormalizedToView.round(rect2);
                        notifyCameraFocusAreaChanged(rect2);
                    }
                    return 0;
                }
                float[] fArr2 = this.mCameraFocusPositions;
                fArr2[0] = f;
                fArr2[1] = f2;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setNoiseReductionMode(int i) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsNoiseReducationStarted && this.mCameraNoiseReduction == i) {
                        return -1;
                    }
                    this.mCameraNoiseReductionMode = i;
                    this.mCameraNoiseReduction = i;
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (i < 0 || i > 4) {
                        i = 0;
                    }
                    int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
                    if (isSupported(i, iArr)) {
                        if (this.mPreviewSession != null) {
                            try {
                                Logging.m88100i(TAG, "setNoiseReductionMode = " + i);
                                this.mIsNoiseReducationStarted = true;
                                this.mPreviewRequestBuilder.set(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(i));
                                this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                                return 0;
                            } catch (CameraAccessException e) {
                                ThrowableExtension.printStackTrace(e);
                            } catch (IllegalArgumentException e2) {
                                ThrowableExtension.printStackTrace(e2);
                            } catch (IllegalStateException e3) {
                                ThrowableExtension.printStackTrace(e3);
                            }
                        }
                    } else if (i == 2 && isSupported(1, iArr) && this.mPreviewSession != null) {
                        try {
                            this.mCameraNoiseReduction = 1;
                            Logging.m88100i(TAG, "setNoiseReductionMode = " + i + " ,by fallback.");
                            this.mIsNoiseReducationStarted = true;
                            this.mPreviewRequestBuilder.set(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(this.mCameraNoiseReduction));
                            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e4) {
                            ThrowableExtension.printStackTrace(e4);
                        } catch (IllegalArgumentException e5) {
                            ThrowableExtension.printStackTrace(e5);
                        } catch (IllegalStateException e6) {
                            ThrowableExtension.printStackTrace(e6);
                        }
                    }
                    return -1;
                }
                this.mCameraNoiseReductionMode = i;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setTorchMode(boolean z) {
        synchronized (this.mSwitchLock) {
            int i = z ? 1 : -1;
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsCameraTorchStarted && this.mTorchMode == i) {
                        return 0;
                    }
                    this.mTorchMode = i;
                    String str = TAG;
                    Logging.m88100i(str, "setTorchMode called camera api2, isOn: " + z);
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        Logging.m88102w(str, "warning cameraCharacteristics is null");
                        return -1;
                    }
                    Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    boolean zBooleanValue = bool == null ? false : bool.booleanValue();
                    Logging.m88102w(str, "setTorchMode isFlashSupported: ".concat(zBooleanValue ? "true" : "false"));
                    if (zBooleanValue) {
                        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
                        if (z) {
                            builder.set(CaptureRequest.FLASH_MODE, 2);
                        } else {
                            builder.set(CaptureRequest.FLASH_MODE, 0);
                        }
                        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                        if (cameraCaptureSession != null) {
                            try {
                                cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), null, this.mCameraThreadHandler);
                                this.mIsCameraTorchStarted = true;
                                return 0;
                            } catch (CameraAccessException e) {
                                ThrowableExtension.printStackTrace(e);
                            } catch (IllegalArgumentException e2) {
                                ThrowableExtension.printStackTrace(e2);
                            } catch (IllegalStateException e3) {
                                ThrowableExtension.printStackTrace(e3);
                            } catch (NoClassDefFoundError e4) {
                                ThrowableExtension.printStackTrace(e4);
                            }
                        }
                    } else {
                        Logging.m88102w(str, "flash is not supported");
                    }
                    return -1;
                }
                this.mTorchMode = i;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoEdgeMode(int i) {
        if (this.mPreviewRequestBuilder == null) {
            Logging.m88100i(TAG, "setVideoEdgeMode mPreviewRequestBuilder return.");
            return -1;
        }
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            return -1;
        }
        if (isSupported(toCamera2EdgeEnhanceMode(i), (int[]) cameraCharacteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES)) && this.mPreviewSession != null) {
            try {
                Logging.m88100i(TAG, "setVideoEdgeMode = " + i);
                this.mPreviewRequestBuilder.set(CaptureRequest.EDGE_MODE, Integer.valueOf(i));
                this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                return 0;
            } catch (CameraAccessException e) {
                ThrowableExtension.printStackTrace(e);
            } catch (IllegalStateException e2) {
                ThrowableExtension.printStackTrace(e2);
            }
        }
        Logging.m88098e(TAG, "not supported VideoEdge Mode = " + i);
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoStabilityMode(int i) {
        CaptureRequest.Builder builder;
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && (builder = this.mPreviewRequestBuilder) != null) {
                    if (this.mIsStabilityStarted && this.mCameraVideoStabilityMode == i) {
                        return 0;
                    }
                    this.mCameraVideoStabilityMode = i;
                    if (builder == null) {
                        Logging.m88100i(TAG, "setVideoStabilityMode mPreviewRequestBuilder return.");
                        return -1;
                    }
                    int camera2VideoStabilityMode = toCamera2VideoStabilityMode(i);
                    String str = this.mPhysicalId;
                    CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (isSupportedStability(camera2VideoStabilityMode, (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) && this.mPreviewSession != null) {
                        try {
                            Logging.m88100i(TAG, "setVideoStabilityMode = " + i);
                            this.mIsStabilityStarted = true;
                            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(camera2VideoStabilityMode));
                            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e) {
                            ThrowableExtension.printStackTrace(e);
                        } catch (IllegalArgumentException e2) {
                            ThrowableExtension.printStackTrace(e2);
                        } catch (IllegalStateException e3) {
                            ThrowableExtension.printStackTrace(e3);
                        }
                    }
                    Logging.m88098e(TAG, "not supported VideoStability Mode = " + i);
                    return -1;
                }
                this.mCameraVideoStabilityMode = i;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setZoom(float f) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsmCameraZoomStarted && Math.abs(this.mCameraZoomFactor - f) < 0.1d) {
                        return 0;
                    }
                    this.mCameraZoomFactor = f;
                    String str = TAG;
                    Logging.m88100i(str, "setCameraZoom api2 called zoomValue =" + f);
                    if (f <= 0.0f) {
                        return -1;
                    }
                    if (this.mSensorRect == null) {
                        String str2 = this.mPhysicalId;
                        CameraCharacteristics cameraCharacteristics = str2 != null ? getCameraCharacteristics(str2) : getCameraCharacteristics(this.mId);
                        if (cameraCharacteristics == null) {
                            Logging.m88102w(str, "warning cameraCharacteristics is null");
                            return -1;
                        }
                        this.mSensorRect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        this.mMaxZoom = getMaxZoom(cameraCharacteristics);
                    }
                    if (Math.abs(this.mMaxZoom - 0.5f) < 0.001f) {
                        Logging.m88098e(str, "Camera " + this.mId + " does not support camera zoom");
                        return -1;
                    }
                    if (f < 0.5f || f > this.mMaxZoom || f == this.mLastZoomRatio) {
                        Logging.m88098e(str, "needZoom! ");
                        return -2;
                    }
                    this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, cropRegionForZoom(f));
                    this.mLastZoomRatio = f;
                    CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                    if (cameraCaptureSession != null) {
                        try {
                            this.mIsmCameraZoomStarted = true;
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                        } catch (CameraAccessException e) {
                            ThrowableExtension.printStackTrace(e);
                            return -3;
                        } catch (IllegalArgumentException e2) {
                            ThrowableExtension.printStackTrace(e2);
                            return -4;
                        } catch (IllegalStateException e3) {
                            ThrowableExtension.printStackTrace(e3);
                            return -4;
                        }
                    }
                    Logging.m88100i(str, "setCameraZoom api2 called success!");
                    return 0;
                }
                this.mCameraZoomFactor = f;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        String str = TAG;
        Logging.m88100i(str, "startCaptureMaybeAsync, use Texture: " + this.mCaptureToTexture);
        changeCameraStateAndNotify(0);
        if (ContextUtils.getApplicationContext() == null || this.mProxyThreadHandler == null) {
            Logging.m88102w(str, "context or proxyThread unavailable");
            return false;
        }
        final CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        if (cameraManager == null) {
            return false;
        }
        final CrStateListener crStateListener = new CrStateListener();
        notifyInjector(crStateListener);
        try {
            Boolean bool = (Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, 2000L, new Callable<Boolean>() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.3
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Code duplicated, block: B:32:0x0128  */
                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    try {
                        String[] cameraIdList = cameraManager.getCameraIdList();
                        if (VideoCaptureCamera2.this.mPhysicalId != null) {
                            Logging.m88100i(VideoCaptureCamera2.TAG, "allocate openCamera camera name:" + VideoCaptureCamera2.this.mPhysicalId);
                            cameraManager.openCamera(VideoCaptureCamera2.this.mPhysicalId, crStateListener, VideoCaptureCamera2.this.mCameraThreadHandler);
                            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                            videoCaptureCamera2.mCameraId = videoCaptureCamera2.mPhysicalId;
                        } else {
                            if (VideoCaptureCamera2.this.mId >= cameraIdList.length) {
                                Logging.m88098e(VideoCaptureCamera2.TAG, "Invalid camera Id: " + VideoCaptureCamera2.this.mId);
                                return Boolean.FALSE;
                            }
                            Logging.m88100i(VideoCaptureCamera2.TAG, "allocate openCamera: " + VideoCaptureCamera2.this.mId + " camera name:" + cameraIdList[VideoCaptureCamera2.this.mId]);
                            CameraManager cameraManager2 = cameraManager;
                            VideoCaptureCamera2 videoCaptureCamera3 = VideoCaptureCamera2.this;
                            cameraManager2.openCamera(cameraIdList[videoCaptureCamera3.mId], crStateListener, videoCaptureCamera3.mCameraThreadHandler);
                            VideoCaptureCamera2 videoCaptureCamera4 = VideoCaptureCamera2.this;
                            videoCaptureCamera4.mCameraId = cameraIdList[videoCaptureCamera4.mId];
                        }
                    } catch (CameraAccessException e) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "allocate: manager.openCamera: " + e.getMessage());
                        if (VideoCaptureCamera2.this.mPhysicalId == null) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera2.this.physicalFallback(cameraManager, crStateListener)) {
                            return Boolean.FALSE;
                        }
                    } catch (IllegalArgumentException e2) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "allocate: manager.openCamera: " + e2.getMessage());
                        if (VideoCaptureCamera2.this.mPhysicalId == null) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera2.this.physicalFallback(cameraManager, crStateListener)) {
                            return Boolean.FALSE;
                        }
                    } catch (SecurityException e3) {
                        Logging.m88098e(VideoCaptureCamera2.TAG, "allocate: manager.openCamera: " + e3.getMessage());
                        if (VideoCaptureCamera2.this.mPhysicalId == null) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera2.this.physicalFallback(cameraManager, crStateListener)) {
                            return Boolean.FALSE;
                        }
                    }
                    return Boolean.TRUE;
                }
            });
            if (bool != null && bool.booleanValue()) {
                registerCameraAvailableCallback(cameraManager);
                return bool.booleanValue();
            }
            changeCameraStateAndNotify(4);
            return false;
        } catch (Exception unused) {
            changeCameraStateAndNotify(4);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        ImageReader imageReader;
        String str = TAG;
        Logging.m88100i(str, "stopCaptureAndBlockUntilStopped()");
        unRegisterAvailabilityCallback();
        Handler handler = this.mProxyThreadHandler;
        if (handler == null) {
            Logging.m88102w(str, "proxyThread unavailable");
            return;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, 2000L, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.4
                /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[PHI: r0
                  0x00a4: PHI (r0v6 io.agora.base.internal.video.ISurfaceTextureHelper) = (r0v4 io.agora.base.internal.video.ISurfaceTextureHelper), (r0v17 io.agora.base.internal.video.ISurfaceTextureHelper) binds: [B:37:0x00cf, B:31:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    ISurfaceTextureHelper iSurfaceTextureHelper;
                    ISurfaceTextureHelper iSurfaceTextureHelper2;
                    synchronized (VideoCaptureCamera2.this.mCameraStateLock) {
                        while (VideoCaptureCamera2.this.mCameraState != 2 && VideoCaptureCamera2.this.mCameraState != 4 && VideoCaptureCamera2.this.mCameraState != 3) {
                            try {
                                try {
                                    VideoCaptureCamera2.this.mCameraStateLock.wait();
                                } catch (InterruptedException e) {
                                    Logging.m88098e(VideoCaptureCamera2.TAG, "CaptureStartedEvent: " + e.getMessage());
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        iSurfaceTextureHelper = null;
                        Object[] objArr = 0;
                        if (VideoCaptureCamera2.this.mCameraState != 4 && VideoCaptureCamera2.this.mCameraState != 3) {
                            try {
                                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                                videoCaptureCamera2.requestFaceDetection(videoCaptureCamera2.mPreviewRequestBuilder, 0);
                                VideoCaptureCamera2.this.mCameraThreadHandler.postAtFrontOfQueue(new StopCaptureTask());
                                if (!VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.opened()) {
                                    VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.block();
                                }
                                Logging.m88100i(VideoCaptureCamera2.TAG, "releaseCamera done!");
                                iSurfaceTextureHelper2 = VideoCaptureCamera2.this.mSurfaceTextureHelper;
                                if (iSurfaceTextureHelper2 != null) {
                                    iSurfaceTextureHelper2.stopListening();
                                }
                            } catch (Exception e2) {
                                VideoCaptureCamera2.this.mCameraDevice.close();
                                VideoCaptureCamera2.this.mCameraDevice = null;
                            } catch (Exception unused) {
                                Logging.m88099e(VideoCaptureCamera2.TAG, "cameraDevice close error", e2);
                            } finally {
                                ISurfaceTextureHelper iSurfaceTextureHelper3 = VideoCaptureCamera2.this.mSurfaceTextureHelper;
                                if (iSurfaceTextureHelper3 != null) {
                                    iSurfaceTextureHelper3.stopListening();
                                    VideoCaptureCamera2.this.mSurfaceTextureHelper.dispose();
                                    VideoCaptureCamera2.this.mSurfaceTextureHelper = null;
                                }
                            }
                            return null;
                        }
                        ISurfaceTextureHelper iSurfaceTextureHelper4 = VideoCaptureCamera2.this.mSurfaceTextureHelper;
                        if (iSurfaceTextureHelper4 != null) {
                            iSurfaceTextureHelper4.stopListening();
                            VideoCaptureCamera2.this.mSurfaceTextureHelper.dispose();
                            VideoCaptureCamera2.this.mSurfaceTextureHelper = null;
                        }
                        return null;
                    }
                    iSurfaceTextureHelper2 = VideoCaptureCamera2.this.mSurfaceTextureHelper;
                    if (iSurfaceTextureHelper2 != null) {
                        iSurfaceTextureHelper2.stopListening();
                    }
                    return null;
                }
            });
        } catch (Exception e) {
            Logging.m88098e(TAG, "stopCaptureAndBlockUntilStopped fail: " + e.getMessage());
        }
        synchronized (this.mImageReaderLock) {
            ImageReader imageReader2 = this.mImageReader;
            if (imageReader2 != null) {
                try {
                    try {
                        imageReader2.setOnImageAvailableListener(null, null);
                        this.mImageReader.close();
                    } catch (IllegalArgumentException e2) {
                        Logging.m88098e(TAG, "ImageReader Close():" + e2.getMessage());
                    }
                } catch (IllegalStateException e3) {
                    Logging.m88098e(TAG, "ImageReader Close():" + e3.getMessage());
                }
                this.mImageReader = null;
                imageReader = this.xiaomiReader;
                if (imageReader != null) {
                    try {
                        try {
                            imageReader.setOnImageAvailableListener(null, null);
                            this.xiaomiReader.close();
                        } catch (IllegalStateException e4) {
                            Logging.m88098e(TAG, "ImageReader Close():" + e4.getMessage());
                        }
                    } catch (IllegalArgumentException e5) {
                        Logging.m88098e(TAG, "ImageReader Close():" + e5.getMessage());
                    }
                    this.xiaomiReader = null;
                }
            } else {
                imageReader = this.xiaomiReader;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(null, null);
                    this.xiaomiReader.close();
                    this.xiaomiReader = null;
                }
            }
            throw th;
        }
        Handler handler2 = this.mCameraThreadHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.mCameraThreadHandler.getLooper().quitSafely();
            this.mCameraThreadHandler = null;
        }
        if (this.mSurfaceTextureHelper != null) {
            Logging.m88097d(TAG, "waiting camera device close failed after 2000ms");
            this.mSurfaceTextureHelper.stopListening();
            this.mSurfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        this.mIsFaceDetectionStarted = false;
        this.mIsCameraTorchStarted = false;
        this.mIsmCameraExposureStarted = false;
        this.mIsmCameraFocusStarted = false;
        this.mIsmCameraZoomStarted = false;
        this.mIsExposureCompensationStarted = false;
        this.mIsAntiBandingStarted = false;
        this.mIsEdgeEnhanceStarted = false;
        this.mIsStabilityStarted = false;
        this.mIsNoiseReducationStarted = false;
        this.mAutoFaceDetectFocusStarted = false;
        this.mPerFrameFaceDetectionInfoQueue.clear();
        Logging.m88100i(TAG, "stopCaptureAndBlockUntilStopped done.");
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public float getMaxZoom() {
        CameraCharacteristics cameraCharacteristics;
        if (this.mMaxZoom <= 1.0f) {
            String str = this.mPhysicalId;
            if (str != null) {
                cameraCharacteristics = getCameraCharacteristics(str);
            } else {
                cameraCharacteristics = getCameraCharacteristics(this.mId);
            }
            if (cameraCharacteristics != null) {
                this.mMaxZoom = getMaxZoom(cameraCharacteristics);
            }
        }
        return this.mMaxZoom;
    }

    @Nullable
    private static CameraCharacteristics getCameraCharacteristics(String str) {
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length == 0) {
                return null;
            }
            for (String str2 : cameraIdList) {
                if (str2.contains(str)) {
                    return cameraManager.getCameraCharacteristics(str);
                }
            }
            Logging.m88100i(TAG, "physical cameraId: " + str);
            return cameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e.getMessage());
            return null;
        } catch (AssertionError e2) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e2.getMessage());
            return null;
        } catch (IllegalArgumentException e3) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e3.getMessage());
            return null;
        } catch (Exception e4) {
            Logging.m88098e(TAG, "getCameraCharacteristics: " + e4.getMessage());
            return null;
        }
    }
}
