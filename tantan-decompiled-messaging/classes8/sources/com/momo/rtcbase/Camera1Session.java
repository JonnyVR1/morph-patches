package com.momo.rtcbase;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class Camera1Session implements CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private final Context applicationContext;
    private final Camera camera;
    private final int cameraId;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private final Camera.CameraInfo info;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    /* JADX INFO: renamed from: com.momo.rtcbase.Camera1Session$2 */
    public class C00272 implements Camera.PreviewCallback {
        public C00272() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m455b(C00272 c00272, byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, Camera camera) {
            Camera1Session.this.checkIsOnCameraThread();
            if (camera != Camera1Session.this.camera) {
                Logging.m469e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
                return;
            }
            if (Camera1Session.this.state != SessionState.RUNNING) {
                Logging.m468d(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            if (!Camera1Session.this.firstFrameReported) {
                Camera1Session.camera1StartTimeMsHistogram.addSample((int) ((System.nanoTime() - Camera1Session.this.constructionTimeNs) / 1000000));
                Camera1Session.this.firstFrameReported = true;
            }
            VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Runnable() { // from class: com.momo.rtcbase.c
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Session.C00272 c00272 = this.f256a;
                    Camera1Session.this.cameraThreadHandler.post(new Runnable() { // from class: com.momo.rtcbase.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera1Session.C00272.m455b(this.f254a, bArr);
                        }
                    });
                }
            }), Camera1Session.this.getFrameOrientation(), nanos);
            Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j) {
        Logging.m468d(TAG, "Create new camera1 session on camera " + i);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m453a(Camera1Session camera1Session, VideoFrame videoFrame) {
        camera1Session.checkIsOnCameraThread();
        if (camera1Session.state != SessionState.RUNNING) {
            Logging.m468d(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!camera1Session.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) ((System.nanoTime() - camera1Session.constructionTimeNs) / 1000000));
            camera1Session.firstFrameReported = true;
        }
        VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), camera1Session.info.facing == 1, 0), camera1Session.getFrameOrientation(), videoFrame.getTimestampNs());
        camera1Session.events.onFrameCaptured(camera1Session, videoFrame2);
        videoFrame2.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        qkq0.a("Wrong thread");
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, int i2, int i3, int i4) {
        long jNanoTime = System.nanoTime();
        Logging.m468d(TAG, "Open camera " + i);
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
                    updateCameraParameters(cameraOpen, parameters, captureFormatFindClosestCaptureFormat, findClosestPictureSize(parameters, i2, i3), z);
                    if (!z) {
                        int iFrameSize = captureFormatFindClosestCaptureFormat.frameSize();
                        for (int i5 = 0; i5 < 3; i5++) {
                            cameraOpen.addCallbackBuffer(ByteBuffer.allocateDirect(iFrameSize).array());
                        }
                    }
                    cameraOpen.setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events, z, context, surfaceTextureHelper, i, cameraOpen, cameraInfo, captureFormatFindClosestCaptureFormat, jNanoTime));
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
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.m468d(TAG, "Available fps ranges: " + listConvertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, i3);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo.orientation + deviceOrientation) % 360;
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new C00272());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new VideoSink() { // from class: com.momo.rtcbase.a
            @Override // com.momo.rtcbase.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                Camera1Session.m453a(this.f252a, videoFrame);
            }
        });
    }

    private void startCapturing() {
        Logging.m468d(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: com.momo.rtcbase.Camera1Session.1
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i, Camera camera) {
                String str;
                if (i == 100) {
                    str = "Camera server died!";
                } else {
                    str = "Camera error: " + i;
                }
                Logging.m469e(Camera1Session.TAG, str);
                Camera1Session.this.stopInternal();
                Camera1Session camera1Session = Camera1Session.this;
                if (i == 2) {
                    camera1Session.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    camera1Session.events.onCameraError(Camera1Session.this, str);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        Logging.m468d(TAG, "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            Logging.m468d(TAG, "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        this.camera.stopPreview();
        this.camera.release();
        this.events.onCameraClosed(this);
        Logging.m468d(TAG, "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    @Override // com.momo.rtcbase.CameraSession
    public void stop() {
        Logging.m468d(TAG, "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long jNanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) ((System.nanoTime() - jNanoTime) / 1000000));
        }
    }
}
