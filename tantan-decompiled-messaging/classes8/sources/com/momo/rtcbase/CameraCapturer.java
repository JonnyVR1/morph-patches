package com.momo.rtcbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import l.all;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;
    private CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;
    private CameraSession currentSession;
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private boolean sessionOpening;
    private SurfaceTextureHelper surfaceHelper;
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final Handler uiThreadHandler;
    private int width;
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: com.momo.rtcbase.CameraCapturer.1
        @Override // com.momo.rtcbase.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            Logging.m468d(CameraCapturer.TAG, "Create session done. Switch state: " + CameraCapturer.this.switchState);
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
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

        @Override // com.momo.rtcbase.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer.access$1610(CameraCapturer.this);
                    if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                        Logging.m472w(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
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
                        Logging.m472w(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                        CameraCapturer.this.createSessionInternal(CameraCapturer.OPEN_CAMERA_DELAY_MS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: com.momo.rtcbase.CameraCapturer.2
        @Override // com.momo.rtcbase.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                    } else {
                        Logging.m468d(CameraCapturer.TAG, "onCameraClosed from another session.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.rtcbase.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.m472w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        CameraCapturer.this.stopCapture();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.rtcbase.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession) {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                        CameraCapturer.this.stopCapture();
                    } else {
                        Logging.m472w(CameraCapturer.TAG, "onCameraError from another session: " + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.rtcbase.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        Logging.m472w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.rtcbase.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.m472w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: com.momo.rtcbase.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: com.momo.rtcbase.CameraCapturer.4
            @Override // com.momo.rtcbase.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // com.momo.rtcbase.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // com.momo.rtcbase.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
            }

            @Override // com.momo.rtcbase.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
            }

            @Override // com.momo.rtcbase.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
            }

            @Override // com.momo.rtcbase.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
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

    public static /* synthetic */ int access$1610(CameraCapturer cameraCapturer) {
        int i = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        Logging.m469e(TAG, "Check is on camera thread failed.");
        upk0.a("Not on camera thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + OPEN_CAMERA_TIMEOUT);
        this.cameraThreadHandler.postDelayed(new Runnable() { // from class: com.momo.rtcbase.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, i);
    }

    private void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m469e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m468d(TAG, "switchCamera internal");
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
                Logging.m468d(TAG, "switchCamera: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: com.momo.rtcbase.CameraCapturer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0);
                Logging.m468d(TAG, "switchCamera done");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.rtcbase.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        Logging.m468d(TAG, "changeCaptureFormat: " + i + "x" + i2 + "@" + i3);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override // com.momo.rtcbase.VideoCapturer
    public void dispose() {
        Logging.m468d(TAG, "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // com.momo.rtcbase.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper == null ? null : surfaceTextureHelper.getHandler();
    }

    @Override // com.momo.rtcbase.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.m468d(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m468d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // com.momo.rtcbase.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        Logging.m468d(TAG, "startCapture: " + i + "x" + i2 + "@" + i3);
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
                Logging.m472w(TAG, "Session already open");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.rtcbase.VideoCapturer
    public void stopCapture() {
        Logging.m468d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.m468d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.m472w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.m468d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: com.momo.rtcbase.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.m468d(TAG, "Stop capture: No session open");
            }
        }
        Logging.m468d(TAG, "Stop capture done");
    }

    @Override // com.momo.rtcbase.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m468d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable() { // from class: com.momo.rtcbase.CameraCapturer.7
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
            }
        });
    }
}
