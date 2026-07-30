package com.p006ss.bytertc.base.media.camera;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.VideoFrame;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p006ss.bytertc.base.media.CapturerObserver;
import com.p006ss.bytertc.base.media.SurfaceTextureHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.all;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;

    @Nullable
    private CameraVideoCapturer.CameraStatistics cameraStatistics;

    @Nullable
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;

    @Nullable
    private CameraSession currentSession;

    @Nullable
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private boolean sessionOpening;

    @Nullable
    private SurfaceTextureHelper surfaceHelper;

    @Nullable
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final Handler uiThreadHandler;
    private int width;
    private CameraVideoCapturer.ORIENTATION_MODE mOrientationMode = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;

    @Nullable
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.1
        @Override // com.ss.bytertc.base.media.camera.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    RXLogging.w(CameraCapturer.TAG, "Create session done. Switch state: " + CameraCapturer.this.switchState);
                    if (cameraSession != null) {
                        cameraSession.setOrientationMode(CameraCapturer.this.mOrientationMode);
                    }
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.currentSession = cameraSession;
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                    CameraCapturer.this.firstFrameObserved = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    SwitchState switchState = CameraCapturer.this.switchState;
                    SwitchState switchState2 = SwitchState.IN_PROGRESS;
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    if (switchState == switchState2) {
                        cameraCapturer2.switchState = SwitchState.IDLE;
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                    } else if (cameraCapturer2.switchState == SwitchState.PENDING) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        CameraCapturer cameraCapturer3 = CameraCapturer.this;
                        cameraCapturer3.switchCameraInternal(cameraCapturer3.switchEventsHandler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer.access$1710(CameraCapturer.this);
                    if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                        RXLogging.e(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        SwitchState switchState = CameraCapturer.this.switchState;
                        SwitchState switchState2 = SwitchState.IDLE;
                        if (switchState != switchState2) {
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                            CameraCapturer.this.switchState = switchState2;
                        }
                        CameraSession.FailureType failureType2 = CameraSession.FailureType.DISCONNECTED;
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        if (failureType == failureType2) {
                            cameraCapturer.eventsHandler.onCameraDisconnected();
                        } else {
                            cameraCapturer.eventsHandler.onCameraError(str);
                        }
                    } else {
                        RXLogging.e(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                        CameraCapturer.this.createSessionInternal(CameraCapturer.OPEN_CAMERA_DELAY_MS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    @Nullable
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.2
        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                    } else {
                        RXLogging.e(CameraCapturer.TAG, "onCameraClosed from another session.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.eventsHandler.onCameraConfig(i, i2, framerateRange);
                CameraCapturer.this.capturerObserver.onCapturerFormatSelected(i, i2, framerateRange.min / MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, framerateRange.max / MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, RXPixelFormat.kUnknown.value());
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        RXLogging.e(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.capturerObserver.onCapturerError("CameraDisconnected");
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        RXLogging.e(CameraCapturer.TAG, "onCameraError from another session: " + str);
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                        CameraCapturer.this.capturerObserver.onCapturerError(str);
                        CameraCapturer.this.stopCapture();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        RXLogging.e(CameraCapturer.TAG, "onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        RXLogging.e(CameraCapturer.TAG, "onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    if (CameraCapturer.this.cameraStatistics != null) {
                        CameraCapturer.this.cameraStatistics.addFrame();
                    }
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;
    private String nativeLibraryName = "bytertc";
    protected boolean mEnableFollowGravity = false;

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, @Nullable CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.4
            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onCameraClosed");
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onCameraClosed");
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
                RXLogging.e(CameraCapturer.TAG, "CameraEventsHandler onCameraDisconnected");
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
                RXLogging.e(CameraCapturer.TAG, "CameraEventsHandler onCameraError: " + str2);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
                RXLogging.e(CameraCapturer.TAG, "CameraEventsHandler onCameraFreezed: " + str2);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onCameraOpening" + str2);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onFirstFrameAvailable");
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length == 0) {
            upk0.a("No cameras attached.");
            throw null;
        }
        if (Arrays.asList(deviceNames).contains(this.cameraName)) {
            return;
        }
        all.a("Camera name ", this.cameraName, " does not match any known camera device.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8367a(CameraCapturer cameraCapturer, AtomicBoolean atomicBoolean) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            atomicBoolean.set(cameraSession.isCameraTorchSupported());
        }
    }

    public static /* synthetic */ int access$1710(CameraCapturer cameraCapturer) {
        int i = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8368b(CameraCapturer cameraCapturer, boolean z, AtomicInteger atomicInteger) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            atomicInteger.set(cameraSession.enableFollowGravity(z));
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8369c(CameraCapturer cameraCapturer, float f, AtomicInteger atomicInteger) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            cameraSession.setCameraZoomRatio(f);
            atomicInteger.set(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (this.cameraThreadHandler == null || Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            RXLogging.e(TAG, "Check is on camera thread failed.");
            upk0.a("Not on camera thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + OPEN_CAMERA_TIMEOUT);
        Handler handler = this.cameraThreadHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (CameraCapturer.this.stateLock) {
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
                    }
                } catch (IllegalArgumentException e) {
                    if (CameraCapturer.this.capturerObserver != null) {
                        CameraCapturer.this.capturerObserver.onCapturerError("Create VideoCapture Session fail : " + e.getMessage());
                    }
                    synchronized (CameraCapturer.this.stateLock) {
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.stateLock.notifyAll();
                    }
                }
            }
        }, i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8370d(CameraCapturer cameraCapturer, AtomicInteger atomicInteger) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            atomicInteger.set(cameraSession.getDeviceOrientation());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8371e(CameraCapturer cameraCapturer) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            cameraSession.turnOffFlashLight();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m8372f(CameraCapturer cameraCapturer, AtomicBoolean atomicBoolean) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            atomicBoolean.set(cameraSession.isCameraZoomSupported());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8373g(CameraCapturer cameraCapturer, AtomicReference atomicReference) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            atomicReference.set(Float.valueOf(cameraSession.getCameraZoomMaxRatio()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8374h(CameraCapturer cameraCapturer) {
        CameraSession cameraSession = cameraCapturer.currentSession;
        if (cameraSession != null) {
            cameraSession.turnOnFlashLight();
        }
    }

    private void reportCameraSwitchError(String str, @Nullable CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCameraInternal(@Nullable CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w(TAG, "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length < 2) {
            if (cameraSwitchHandler != null) {
                cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
                return;
            }
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z = this.sessionOpening;
                if (!z && this.currentSession == null) {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z) {
                    this.switchState = SwitchState.PENDING;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                RXLogging.w(TAG, "switchCamera: Stopping session");
                CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
                if (cameraStatistics != null) {
                    cameraStatistics.release();
                    this.cameraStatistics = null;
                }
                final CameraSession cameraSession = this.currentSession;
                Handler handler = this.cameraThreadHandler;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.8
                        @Override // java.lang.Runnable
                        public void run() {
                            cameraSession.stop();
                        }
                    });
                }
                this.currentSession = null;
                this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0);
                RXLogging.w(TAG, "switchCamera done");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        RXLogging.w(TAG, "changeCaptureFormat: " + i + "x" + i2 + "@" + i3);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void disableDoOrientation() {
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void dispose() {
        RXLogging.w(TAG, "dispose");
        stopCapture();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public int enableFollowGravity(final boolean z) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.i
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8368b(this.f5531a, z, atomicInteger);
            }
        });
        int i = atomicInteger.get();
        if (i == 0) {
            this.mEnableFollowGravity = z;
        }
        return i;
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public float getCameraZoomMaxRatio() {
        final AtomicReference atomicReference = new AtomicReference(Float.valueOf(1.0f));
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.f
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8373g(this.f5526a, atomicReference);
            }
        });
        return ((Float) atomicReference.get()).floatValue();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public int getDeviceOrientation() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.e
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8370d(this.f5524a, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void initialize(@Nullable SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        synchronized (this.stateLock) {
            this.capturerObserver = capturerObserver;
        }
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper == null ? null : surfaceTextureHelper.getHandler();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public boolean isCameraTorchSupported() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.k
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8367a(this.f5537a, atomicBoolean);
            }
        });
        return atomicBoolean.get();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public boolean isCameraZoomSupported() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.h
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8372f(this.f5529a, atomicBoolean);
            }
        });
        return atomicBoolean.get();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                RXLogging.w(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    RXLogging.w(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public int setCameraZoomRatio(final float f) {
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.j
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8369c(this.f5534a, f, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraVideoCapturer
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        RXLogging.w(TAG, "startCapture: " + i + "x" + i2 + "@" + i3);
        if (this.applicationContext == null) {
            upk0.a("CameraCapturer must be initialized before calling startCapture.");
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i;
                    this.height = i2;
                    this.framerate = i3;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0);
                    return;
                }
                RXLogging.w(TAG, "Session already open");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void stopCapture() {
        RXLogging.w(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                RXLogging.w(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    RXLogging.e(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                RXLogging.w(TAG, "Stop capture: Nulling session");
                CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
                if (cameraStatistics != null) {
                    cameraStatistics.release();
                    this.cameraStatistics = null;
                }
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                RXLogging.w(TAG, "Stop capture: No session open");
            }
        }
        RXLogging.w(TAG, "Stop capture done");
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w(TAG, "switchCamera");
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.7
                @Override // java.lang.Runnable
                public void run() {
                    CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
                }
            });
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void turnOffFlashLight() {
        this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.l
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8371e(this.f5539a);
            }
        });
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void turnOnFlashLight() {
        this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.g
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.m8374h(this.f5528a);
            }
        });
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        startCapture(i, i2, i3);
    }
}
