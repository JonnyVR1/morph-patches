package com.p074ss.bytertc.base.media.camera;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.NV21Buffer;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p074ss.bytertc.base.media.Size;
import com.p074ss.bytertc.base.media.SurfaceTextureHelper;
import com.p074ss.bytertc.base.media.VideoSink;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
class Camera1Session implements CameraSession, Camera.FaceDetectionListener {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private static int sMinFramerate;
    private final Context applicationContext;
    private final Camera camera;
    private final int cameraId;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private final Sensor gravitySensor;
    private final Camera.CameraInfo info;
    private boolean isDesktopMode;
    private int mDisplayRotationCheckCounter;
    private boolean mEnableFaceAE;
    private boolean mEnableFollowGravity;
    private boolean mFaceDetectStarted;
    private int mLastDisplayRotation;
    private int mLastValidDisplayRotation;
    private final int scaleHeight;
    private final int scaleWidth;
    private final SensorManager sensorManager;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private int gravityOrientation = 0;
    private final SensorEventListener gravityEventListener = new SensorEventListener() { // from class: com.ss.bytertc.base.media.camera.Camera1Session.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            if (Math.abs(fAbs - fAbs2) < 4.0d) {
                return;
            }
            if (fAbs >= fAbs2) {
                Camera1Session camera1Session = Camera1Session.this;
                if (f >= 0.0f) {
                    camera1Session.gravityOrientation = CameraSession.UIDeviceOrientation.LandscapeRight.value();
                    return;
                } else {
                    camera1Session.gravityOrientation = CameraSession.UIDeviceOrientation.LandscapeLeft.value();
                    return;
                }
            }
            Camera1Session camera1Session2 = Camera1Session.this;
            if (f2 >= 0.0f) {
                camera1Session2.gravityOrientation = CameraSession.UIDeviceOrientation.Portrait.value();
            } else {
                camera1Session2.gravityOrientation = CameraSession.UIDeviceOrientation.PortraitUpsideDown.value();
            }
        }
    };
    private CameraVideoCapturer.ORIENTATION_MODE mOrientation = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;

    /* JADX INFO: renamed from: com.ss.bytertc.base.media.camera.Camera1Session$3 */
    public class C135243 implements Camera.PreviewCallback {
        public C135243() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m82040a(C135243 c135243, byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, Camera camera) {
            int frameOrientation;
            Camera1Session.this.checkIsOnCameraThread();
            if (camera != Camera1Session.this.camera) {
                RXLogging.m5742e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
                return;
            }
            if (Camera1Session.this.state != SessionState.RUNNING) {
                RXLogging.m5746w(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            if (!Camera1Session.this.firstFrameReported) {
                System.nanoTime();
                long unused = Camera1Session.this.constructionTimeNs;
                Camera1Session.this.firstFrameReported = true;
            }
            NV21Buffer nV21Buffer = new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Runnable() { // from class: com.ss.bytertc.base.media.camera.c
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Session.C135243 c135243 = this.f56434a;
                    Camera1Session.this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera1Session.C135243.m82040a(this.f56432a, bArr);
                        }
                    });
                }
            });
            boolean z = Camera1Session.this.mEnableFollowGravity;
            Camera1Session camera1Session = Camera1Session.this;
            if (z) {
                frameOrientation = camera1Session.getGravityOrientation();
            } else {
                frameOrientation = camera1Session.getFrameOrientation();
                Camera1Session camera1Session2 = Camera1Session.this;
                camera1Session2.gravityOrientation = CameraSession.getDeviceUIOrientation(camera1Session2.applicationContext);
            }
            VideoFrame videoFrame = new VideoFrame(nV21Buffer, frameOrientation, nanos, Camera1Session.this.info.facing == 1);
            Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j, int i2, int i3, boolean z3, boolean z4) {
        this.mEnableFollowGravity = false;
        RXLogging.m5746w(TAG, "Create new camera1 session on camera " + i);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z;
        this.isDesktopMode = z2;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j;
        this.scaleWidth = i2;
        this.scaleHeight = i3;
        this.mEnableFaceAE = z3;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.gravitySensor = sensorManager.getDefaultSensor(9);
        this.mEnableFollowGravity = z4;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82039a(Camera1Session camera1Session, VideoFrame videoFrame) {
        VideoFrame.Buffer bufferCropAndScale;
        int frameOrientation;
        int i;
        CameraEnumerationAndroid.CaptureFormat captureFormat;
        int i2;
        camera1Session.checkIsOnCameraThread();
        if (camera1Session.state != SessionState.RUNNING) {
            RXLogging.m5746w(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!camera1Session.firstFrameReported) {
            System.nanoTime();
            camera1Session.firstFrameReported = true;
        }
        int i3 = camera1Session.scaleWidth;
        if (i3 == 0 || (i = camera1Session.scaleHeight) == 0 || ((i2 = (captureFormat = camera1Session.captureFormat).width) == i3 && captureFormat.height == i)) {
            if (camera1Session.scaleHeight == 0) {
                RXLogging.m5742e(TAG, "scaleHeight is 0");
                return;
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int i4 = camera1Session.scaleWidth;
            int i5 = camera1Session.scaleHeight;
            int i6 = camera1Session.captureFormat.height;
            bufferCropAndScale = buffer.cropAndScale(0, 0, (int) ((i4 / i5) * i6), i6, i4, i5);
        } else if (i2 / captureFormat.height > i3 / i) {
            VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = camera1Session.captureFormat;
            float f = captureFormat2.width;
            int i7 = camera1Session.scaleWidth;
            int i8 = camera1Session.scaleHeight;
            int i9 = captureFormat2.height;
            float f2 = (i7 / i8) * i9;
            bufferCropAndScale = buffer2.cropAndScale(((int) (f - f2)) / 2, 0, (int) f2, i9, i7, i8);
        } else {
            VideoFrame.Buffer buffer3 = videoFrame.getBuffer();
            CameraEnumerationAndroid.CaptureFormat captureFormat3 = camera1Session.captureFormat;
            float f3 = captureFormat3.height;
            int i10 = camera1Session.scaleHeight;
            int i11 = camera1Session.scaleWidth;
            int i12 = captureFormat3.width;
            float f4 = (i10 / i11) * i12;
            bufferCropAndScale = buffer3.cropAndScale(0, ((int) (f3 - f4)) / 2, i12, (int) f4, i11, i10);
        }
        if (bufferCropAndScale == null) {
            RXLogging.m5742e(TAG, "cropandscale return null buffer");
            return;
        }
        if (camera1Session.mEnableFollowGravity) {
            frameOrientation = camera1Session.getGravityOrientation();
        } else {
            frameOrientation = camera1Session.getFrameOrientation();
            camera1Session.gravityOrientation = CameraSession.getDeviceUIOrientation(camera1Session.applicationContext);
        }
        VideoFrame videoFrame2 = new VideoFrame((VideoFrame.Buffer) CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) bufferCropAndScale, false, 0), frameOrientation, videoFrame.getTimestampNs(), false);
        bufferCropAndScale.release();
        camera1Session.events.onFrameCaptured(camera1Session, videoFrame2);
        videoFrame2.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        wtq0.m207906a("Wrong thread");
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, int i2, int i3, int i4, boolean z3, boolean z4) {
        long jNanoTime = System.nanoTime();
        RXLogging.m5746w(TAG, "Open camera " + i + " brand:" + Build.BRAND + ", modle:" + Build.MODEL + ", width:" + i2 + ", height:" + i3 + ", framerate:" + i4 + ", faceae:" + z3 + ", followGravity:" + z4 + ", captureToTexture:" + z);
        events.onCameraOpening();
        try {
            Camera cameraOpen = Camera.open(i);
            if (cameraOpen == null) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "android.hardware.Camera.open returned null for camera id = " + i);
                return;
            }
            try {
                cameraOpen.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                try {
                    Camera.Parameters parameters = cameraOpen.getParameters();
                    CameraEnumerationAndroid.CaptureFormat captureFormatFindClosestCaptureFormat = findClosestCaptureFormat(parameters, i2, i3, i4);
                    Size sizeFindClosestPictureSize = findClosestPictureSize(parameters, i2, i3);
                    events.onCameraConfig(sizeFindClosestPictureSize.width, sizeFindClosestPictureSize.height, captureFormatFindClosestCaptureFormat.framerate);
                    sMinFramerate = captureFormatFindClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(cameraOpen, parameters, captureFormatFindClosestCaptureFormat, sizeFindClosestPictureSize, z);
                    if (!z) {
                        int iFrameSize = captureFormatFindClosestCaptureFormat.frameSize();
                        for (int i5 = 0; i5 < 3; i5++) {
                            cameraOpen.addCallbackBuffer(ByteBuffer.allocateDirect(iFrameSize).array());
                        }
                    }
                    try {
                        cameraOpen.setDisplayOrientation(0);
                    } catch (RuntimeException unused) {
                    }
                    createSessionCallback.onDone(new Camera1Session(events, z, z2, context, surfaceTextureHelper, i, cameraOpen, cameraInfo, captureFormatFindClosestCaptureFormat, jNanoTime, i2, i3, z3, z4));
                } catch (RuntimeException e) {
                    cameraOpen.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                }
            } catch (IOException | RuntimeException e2) {
                cameraOpen.release();
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
        }
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange;
        if (parameters.getSupportedPreviewFpsRange() == null) {
            RXLogging.m5742e(TAG, "camera parameters is null!");
            return null;
        }
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        RXLogging.m5746w(TAG, "Available fps ranges: " + listConvertFramerates);
        if (Build.MODEL.equalsIgnoreCase("PEGM00") && i3 == 15) {
            closestSupportedFramerateRange = new CameraEnumerationAndroid.CaptureFormat.FramerateRange(NetWorkParam.DEFAULT_CONNECT_TIME_OUT, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
            RXLogging.m5746w(TAG, "unsupported framerate for special device found, hardcode framerange to:" + closestSupportedFramerateRange.toString());
        } else {
            closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, i3);
        }
        RXLogging.m5746w(TAG, "selected fps range :" + closestSupportedFramerateRange.toString());
        List<Size> listConvertSizes = Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes());
        RXLogging.m5746w(TAG, "Available supportedPreviewSizes : " + listConvertSizes.toString());
        Size upClosestSupportedSize = CameraEnumerationAndroid.getUpClosestSupportedSize(listConvertSizes, i, i2);
        RXLogging.m5746w(TAG, "selected preview size" + upClosestSupportedSize.toString());
        return new CameraEnumerationAndroid.CaptureFormat(upClosestSupportedSize.width, upClosestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        if (parameters != null && parameters.getSupportedPictureSizes() != null) {
            return CameraEnumerationAndroid.getUpClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
        }
        RXLogging.m5742e(TAG, "camera parameters is null!");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceUIOrientation = CameraSession.getDeviceUIOrientation(this.applicationContext);
        int i = this.mLastValidDisplayRotation;
        int i2 = this.mDisplayRotationCheckCounter;
        if (i2 > 0) {
            this.mDisplayRotationCheckCounter = i2 - 1;
        } else if (i2 == 0) {
            i = !isInForeground(this.applicationContext) ? this.mLastValidDisplayRotation : deviceUIOrientation;
            this.mDisplayRotationCheckCounter = -1;
        } else if (deviceUIOrientation != this.mLastDisplayRotation) {
            int i3 = sMinFramerate;
            if (i3 > 0) {
                this.mDisplayRotationCheckCounter = i3;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = deviceUIOrientation;
        this.mLastValidDisplayRotation = i;
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing != 0) {
            i = 360 - i;
        }
        return (cameraInfo.orientation + i) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getGravityOrientation() {
        int i = this.gravityOrientation;
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 1) {
            i = 360 - i;
        }
        return (cameraInfo.orientation + i) % 360;
    }

    private static boolean isInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if ((runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) || runningAppProcessInfo.importance == 125) {
                return true;
            }
        }
        return false;
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new C135243());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new VideoSink() { // from class: com.ss.bytertc.base.media.camera.a
            @Override // com.p074ss.bytertc.base.media.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                Camera1Session.m82039a(this.f56431a, videoFrame);
            }
        });
    }

    private void startCapturing() {
        RXLogging.m5746w(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: com.ss.bytertc.base.media.camera.Camera1Session.2
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i, Camera camera) {
                String str;
                if (i == 100) {
                    str = "CAMERA_ERROR_SERVER_DIED";
                } else if (i == 2) {
                    str = "CAMERA_ERROR_EVICTED";
                } else if (i == 1) {
                    str = "CAMERA_ERROR_UNKNOWN";
                } else {
                    str = "Camera error: " + i;
                }
                RXLogging.m5742e(Camera1Session.TAG, str);
                Camera1Session.this.stopInternal();
                Camera1Session.this.events.onCameraError(Camera1Session.this, str);
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
            int maxNumDetectedFaces = this.camera.getParameters().getMaxNumDetectedFaces();
            RXLogging.m5744i(TAG, "supportedFaces is " + maxNumDetectedFaces);
            boolean z = maxNumDetectedFaces > 0;
            if (this.mEnableFaceAE && z) {
                this.camera.setFaceDetectionListener(this);
                this.camera.startFaceDetection();
                this.mFaceDetectStarted = true;
            }
            if (this.mEnableFaceAE && !z) {
                RXLogging.m5746w(TAG, "mEnableFaceAE is ture but camera not support faceae");
            }
            if (this.mEnableFollowGravity) {
                enableFollowGravity(true);
            }
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        RXLogging.m5746w(TAG, "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            RXLogging.m5746w(TAG, "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        try {
            if (this.mFaceDetectStarted) {
                this.camera.stopFaceDetection();
            }
            this.camera.stopPreview();
            if (this.mEnableFollowGravity) {
                enableFollowGravity(false);
            }
            if (this.captureToTexture) {
                this.camera.setPreviewTexture(null);
            }
            this.camera.release();
            this.events.onCameraClosed(this);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        RXLogging.m5746w(TAG, "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        String str = Build.MODEL;
        if (!str.equalsIgnoreCase("PEGM00") && !str.equalsIgnoreCase("PEGT00")) {
            parameters.setPictureSize(size.width, size.height);
        }
        if (!z) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        RXLogging.m5746w(TAG, "support FOCUS_MODE list: ");
        for (int i = 0; i < supportedFocusModes.size(); i++) {
            RXLogging.m5746w(TAG, i + " : " + supportedFocusModes.get(i));
        }
        RXLogging.m5746w(TAG, "start set FOCUS_MODE_CONTINUOUS_VIDEO");
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            RXLogging.m5746w(TAG, "FOCUS_MODE_CONTINUOUS_VIDEO support and set success");
        }
        camera.setParameters(parameters);
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public int enableFollowGravity(boolean z) {
        SensorManager sensorManager;
        Sensor sensor = this.gravitySensor;
        if (sensor == null || (sensorManager = this.sensorManager) == null) {
            return -1;
        }
        try {
            if (z) {
                sensorManager.registerListener(this.gravityEventListener, sensor, 2);
                this.mEnableFollowGravity = true;
            } else {
                sensorManager.unregisterListener(this.gravityEventListener);
                this.mEnableFollowGravity = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public float getCameraZoomMaxRatio() {
        RXLogging.m5746w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED || !isCameraZoomSupported()) {
            return 1.0f;
        }
        return this.camera.getParameters().getMaxZoom();
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public int getDeviceOrientation() {
        return !this.mEnableFollowGravity ? CameraSession.getDeviceUIOrientation(ContextUtils.getApplicationContext()) : this.gravityOrientation;
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public boolean isCameraTorchSupported() {
        checkIsOnCameraThread();
        Context context = this.applicationContext;
        if (context != null) {
            return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        }
        return false;
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public boolean isCameraZoomSupported() {
        RXLogging.m5746w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            return false;
        }
        Camera.Parameters parameters = this.camera.getParameters();
        return parameters.isZoomSupported() || parameters.isSmoothZoomSupported();
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        int length = faceArr.length;
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public int setCameraZoomRatio(float f) {
        RXLogging.m5746w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            return -1;
        }
        Camera.Parameters parameters = this.camera.getParameters();
        if (!isCameraZoomSupported()) {
            return -1;
        }
        int iMin = (int) Math.min(parameters.getMaxZoom(), f);
        if (parameters.isSmoothZoomSupported()) {
            this.camera.startSmoothZoom(iMin);
            return 0;
        }
        parameters.setZoom(iMin);
        this.camera.setParameters(parameters);
        return 0;
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public void stop() {
        RXLogging.m5746w(TAG, "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            System.nanoTime();
            stopInternal();
            System.nanoTime();
        }
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public void turnOffFlashLight() {
        RXLogging.m5746w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.info.facing == 1) {
            RXLogging.m5746w(TAG, "front camera not support flash light");
        } else if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode(BLiveOperationTitleShowType.off);
            this.camera.setParameters(parameters);
        }
    }

    @Override // com.p074ss.bytertc.base.media.camera.CameraSession
    public void turnOnFlashLight() {
        RXLogging.m5746w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.info.facing == 1) {
            RXLogging.m5746w(TAG, "front camera not support flash light");
        } else if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode("torch");
            this.camera.setParameters(parameters);
        }
    }
}
