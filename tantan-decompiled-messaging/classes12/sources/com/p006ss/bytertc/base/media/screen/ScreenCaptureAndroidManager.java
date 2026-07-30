package com.p006ss.bytertc.base.media.screen;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoFrame;
import com.p006ss.bytertc.base.media.CapturerObserver;
import com.p006ss.bytertc.base.media.SurfaceTextureHelper;
import com.p006ss.bytertc.base.media.VideoCapturer;
import com.p006ss.bytertc.base.media.VideoSink;
import com.p006ss.bytertc.base.media.camera.CameraSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ScreenCaptureAndroidManager implements VideoCapturer, VideoSink {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_MIN_FRAME_RATE = 4;
    private static final int DISPLAY_FLAGS = 11;
    private static final String TAG = "ScreenCapture";
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private static final String VIRTUAL_DISPLAY_NAME = "RTCScreenCapture";

    @Nullable
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private boolean isSurfaceDispose;
    private Context mContext;
    private DeviceOrientation mCurrentOrientation;
    private Display mDisplay;
    private boolean mEnableDoOrientation;
    private int mFrameIndex;
    private Map<Integer, CountDownLatch> mLocks;
    private boolean mPicoCapture2DTexture;
    private boolean mPicoCreateMediaProjection;
    private boolean mPicoNotCheckOrientation;
    private int mPicoVirtualDisplayDpi;
    private int mPicoVirtualDisplayFlag;
    private String mPicoVirtualDisplayName;
    private Map<Integer, VideoFrame> mVideoFrames;

    @Nullable
    private MediaProjection mediaProjection;
    private MediaProjection.Callback mediaProjectionCallback;

    @Nullable
    private MediaProjectionManager mediaProjectionManager;
    private Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;

    @Nullable
    private SurfaceTextureHelper surfaceTextureHelper;

    @Nullable
    private VirtualDisplay virtualDisplay;
    private int width;

    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    public static final class HOLDER {
        private static final ScreenCaptureAndroidManager INSTANCE = new ScreenCaptureAndroidManager();

        private HOLDER() {
        }
    }

    private ScreenCaptureAndroidManager() {
        this.mFrameIndex = 0;
        this.mEnableDoOrientation = true;
        this.mPicoNotCheckOrientation = false;
        this.mPicoCreateMediaProjection = false;
        this.mPicoVirtualDisplayName = VIRTUAL_DISPLAY_NAME;
        this.mPicoVirtualDisplayDpi = VIRTUAL_DISPLAY_DPI;
        this.mPicoVirtualDisplayFlag = DISPLAY_FLAGS;
        this.mPicoCapture2DTexture = false;
        this.mVideoFrames = new HashMap();
        this.mLocks = new HashMap();
    }

    public static ScreenCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            upk0.a("capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVirtualDisplay() {
        CapturerObserver capturerObserver;
        if (updateVirtualDisplayConfig()) {
            RXLogging.w(TAG, String.format("[ScreenCapture] call updateVirtualDisplayConfig success, width=%d, height=%d", Integer.valueOf(this.width), Integer.valueOf(this.height)));
            return;
        }
        if (this.mediaProjection == null) {
            RXLogging.e(TAG, "createVirtualDisplay failed, mediaProjection is null");
            return;
        }
        if (this.virtualDisplay != null) {
            RXLogging.e(TAG, "[ScreenCapture] release current virtualdisplay");
            this.virtualDisplay.release();
            this.virtualDisplay = null;
        }
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        try {
            RXLogging.w(TAG, String.format("[ScreenCapture] call |createVirtualDisplay|,  width=%d, height=%d", Integer.valueOf(this.width), Integer.valueOf(this.height)));
            String str = this.mPicoVirtualDisplayName;
            MediaProjection mediaProjection = this.mediaProjection;
            if (str != null) {
                this.virtualDisplay = mediaProjection.createVirtualDisplay(str, this.width, this.height, this.mPicoVirtualDisplayDpi, this.mPicoVirtualDisplayFlag, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
            } else {
                this.virtualDisplay = mediaProjection.createVirtualDisplay(VIRTUAL_DISPLAY_NAME, this.width, this.height, VIRTUAL_DISPLAY_DPI, DISPLAY_FLAGS, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
            }
            if (this.virtualDisplay != null || (capturerObserver = this.capturerObserver) == null) {
                return;
            }
            capturerObserver.onCapturerError("create virtual display failed.");
        } catch (SecurityException unused) {
            this.virtualDisplay = null;
            CapturerObserver capturerObserver2 = this.capturerObserver;
            if (capturerObserver2 != null) {
                capturerObserver2.onCapturerError("create virtual display failed.");
            }
        }
    }

    private DeviceOrientation getDeviceOrientation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        return DeviceOrientation.LANDSCAPE;
                    }
                }
            }
            return DeviceOrientation.LANDSCAPE;
        }
        return DeviceOrientation.PORTRAIT;
    }

    private int getDeviceRotation() {
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private DeviceOrientation getDisplayOrientation() {
        return this.mContext.getResources().getConfiguration().orientation == 1 ? DeviceOrientation.PORTRAIT : DeviceOrientation.LANDSCAPE;
    }

    private boolean maybeDoRotation() {
        int deviceRotation = getDeviceRotation();
        DeviceOrientation deviceOrientation = getDeviceOrientation(deviceRotation);
        DeviceOrientation displayOrientation = getDisplayOrientation();
        if (displayOrientation == this.mCurrentOrientation) {
            return false;
        }
        RXLogging.w(TAG, String.format("[ScreenCapture] call |maybeDoRotation| and orientation != mCurrentOrientation, rotation:%d, orientation:%s, orientation1:%s", Integer.valueOf(deviceRotation), displayOrientation.toString(), deviceOrientation.toString()));
        this.mCurrentOrientation = displayOrientation;
        rotateCaptureOrientation(displayOrientation);
        return true;
    }

    private void rotateCaptureOrientation(DeviceOrientation deviceOrientation) {
        if (this.mEnableDoOrientation) {
            if ((deviceOrientation != DeviceOrientation.LANDSCAPE || this.width >= this.height) && (deviceOrientation != DeviceOrientation.PORTRAIT || this.height >= this.width)) {
                return;
            }
            RXLogging.w(TAG, String.format("[ScreenCapture] call |rotateCaptureOrientation| before(orientation:%s, width:%d, height:%d)", deviceOrientation.toString(), Integer.valueOf(this.width), Integer.valueOf(this.height)));
            int i = this.width;
            int i2 = this.height;
            this.height = i;
            this.width = i + (i2 - i);
            RXLogging.w(TAG, String.format("[ScreenCapture] call |rotateCaptureOrientation| after(orientation:%s, width:%d, height:%d)", deviceOrientation.toString(), Integer.valueOf(this.width), Integer.valueOf(this.height)));
        }
    }

    private boolean updateVirtualDisplayConfig() {
        RXLogging.w(TAG, String.format("[ScreenCapture] updateVirtualDisplayConfig width=%d, height=%d", Integer.valueOf(this.width), Integer.valueOf(this.height)));
        if (this.mediaProjection == null) {
            RXLogging.e(TAG, "updateVirtualDisplayConfig failed, mediaProjection is null");
            return false;
        }
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay == null) {
            RXLogging.e(TAG, "updateVirtualDisplayConfig failed, virtualDisplay is null");
            return false;
        }
        int i = this.mPicoVirtualDisplayName != null ? this.mPicoVirtualDisplayDpi : VIRTUAL_DISPLAY_DPI;
        virtualDisplay.setSurface(null);
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay.resize(this.width, this.height, i);
        this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
        return true;
    }

    public int addFrame(VideoFrame videoFrame) {
        int i = this.mFrameIndex;
        this.mVideoFrames.put(Integer.valueOf(i), videoFrame);
        this.mFrameIndex++;
        return i;
    }

    public void addLock(int i, CountDownLatch countDownLatch) {
        this.mLocks.put(Integer.valueOf(i), countDownLatch);
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mDisplay.getRealMetrics(displayMetrics);
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        int i4 = ((i + 7) / 8) * 8;
        int i5 = ((i2 + 7) / 8) * 8;
        if (i4 == this.width && i5 == this.height) {
            RXLogging.w(TAG, "[ScreenCapture] call |changeCaptureFormat|, width & height are same as previous, ignore the request");
            return;
        }
        this.width = i4;
        this.height = i5;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.ss.bytertc.base.media.screen.ScreenCaptureAndroidManager.2
            @Override // java.lang.Runnable
            public void run() {
                ScreenCaptureAndroidManager.this.mCurrentOrientation = null;
                ScreenCaptureAndroidManager.this.createVirtualDisplay();
            }
        });
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void disableDoOrientation() {
        this.mEnableDoOrientation = false;
    }

    public synchronized void dispose(int i) {
        try {
            CountDownLatch countDownLatchRemove = this.mLocks.remove(Integer.valueOf(i));
            if (countDownLatchRemove != null) {
                countDownLatchRemove.countDown();
            }
            dispose();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public int enableFollowGravity(boolean z) {
        return -1;
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Nullable
    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    public synchronized void initialize(EglBase.Context context, Context context2, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("RXLocalCapturer", context, false, this.mPicoCapture2DTexture);
        this.surfaceTextureHelper = surfaceTextureHelperCreate;
        this.isSurfaceDispose = true;
        this.mCurrentOrientation = null;
        if (surfaceTextureHelperCreate == null) {
            capturerObserver.onCapturerError("surfaceTextureHelper is null.");
            throw new RuntimeException("surfaceTextureHelper is null.");
        }
        this.mContext = context2;
        this.mediaProjectionManager = (MediaProjectionManager) context2.getSystemService("media_projection");
        this.mDisplay = ((WindowManager) context2.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // com.p006ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.mPicoNotCheckOrientation && maybeDoRotation()) {
            createVirtualDisplay();
        } else {
            this.numCapturedFrames++;
            this.capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public VideoFrame removeFrame(int i) {
        if (this.mVideoFrames.containsKey(Integer.valueOf(i))) {
            return this.mVideoFrames.remove(Integer.valueOf(i));
        }
        return null;
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public int setCameraZoomRatio(float f) {
        return 0;
    }

    public void setData(Intent intent, MediaProjection.Callback callback) {
        this.isDisposed = false;
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
        this.mPicoNotCheckOrientation = intent.getBooleanExtra(RXScreenCaptureService.KEY_PICO_NOT_CHECK_ORIENTATION, false);
        this.mPicoCreateMediaProjection = intent.getBooleanExtra(RXScreenCaptureService.KEY_PICO_CREATE_MEDIA_PROJECTION, false);
        this.mPicoVirtualDisplayName = intent.getStringExtra(RXScreenCaptureService.KEY_PICO_VIRTUAL_DISPLAY_NAME);
        this.mPicoVirtualDisplayDpi = intent.getIntExtra(RXScreenCaptureService.KEY_PICO_VIRTUAL_DISPLAY_DPI, VIRTUAL_DISPLAY_DPI);
        this.mPicoVirtualDisplayFlag = intent.getIntExtra(RXScreenCaptureService.KEY_PICO_VIRTUAL_DISPLAY_FLAG, DISPLAY_FLAGS);
        this.mPicoCapture2DTexture = intent.getBooleanExtra(RXScreenCaptureService.KEY_PICO_NEED_CAPTURE_2D_TEXTURE, false);
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        try {
            checkNotDisposed();
            RXLogging.w(TAG, String.format("[ScreenCapture] call |startCapture|,  width=%d, height=%d", Integer.valueOf(i), Integer.valueOf(i2)));
            if (i <= 0 || i2 <= 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.mDisplay.getRealMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                this.width = i5;
                this.height = displayMetrics.heightPixels;
                RXLogging.w(TAG, String.format("[ScreenCapture] call |startCapture| , get screen real size, width=%d, height=%d", Integer.valueOf(i5), Integer.valueOf(displayMetrics.heightPixels)));
            } else {
                this.width = i;
                this.height = i2;
            }
            this.width = ((this.width + 7) / 8) * 8;
            this.height = ((this.height + 7) / 8) * 8;
            maybeDoRotation();
            try {
                this.mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
            } catch (Exception unused) {
                this.mediaProjection = null;
            }
            if (this.mediaProjection == null && this.mPicoCreateMediaProjection) {
                try {
                    this.mediaProjection = (MediaProjection) MediaProjectionManager.class.getMethod(RXScreenCaptureService.METHOD_PICO_CREATE_MEDIA_PROJECTION, null).invoke(this.mediaProjectionManager, null);
                } catch (Exception unused2) {
                    this.mediaProjection = null;
                }
            }
            MediaProjection mediaProjection = this.mediaProjection;
            if (mediaProjection == null) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("no permission to capture the screen video.");
                }
                return;
            }
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (i4 <= 0) {
                i4 = 4;
            }
            surfaceTextureHelper.setMinFps(i4);
            this.surfaceTextureHelper.startListening(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.ss.bytertc.base.media.screen.ScreenCaptureAndroidManager.1
            @Override // java.lang.Runnable
            public void run() {
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
                if (ScreenCaptureAndroidManager.this.virtualDisplay != null) {
                    ScreenCaptureAndroidManager.this.virtualDisplay.release();
                    ScreenCaptureAndroidManager.this.virtualDisplay = null;
                }
                if (ScreenCaptureAndroidManager.this.mediaProjection != null) {
                    ScreenCaptureAndroidManager.this.mediaProjection.unregisterCallback(ScreenCaptureAndroidManager.this.mediaProjectionCallback);
                    ScreenCaptureAndroidManager.this.mediaProjection = null;
                }
                ScreenCaptureAndroidManager.this.mCurrentOrientation = null;
            }
        });
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void turnOffFlashLight() {
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public void turnOnFlashLight() {
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public int getDeviceOrientation() {
        return CameraSession.getDeviceUIOrientation(ContextUtils.getApplicationContext());
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public synchronized void dispose() {
        SurfaceTextureHelper surfaceTextureHelper;
        this.isDisposed = true;
        if (this.isSurfaceDispose && (surfaceTextureHelper = this.surfaceTextureHelper) != null) {
            surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver != null) {
            this.capturerObserver = capturerObserver;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.isSurfaceDispose = false;
                this.mCurrentOrientation = null;
                this.mContext = context;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
                this.mDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            } else {
                capturerObserver.onCapturerError("surfaceTextureHelper not set.");
                throw new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    public synchronized void startCapture(int i, int i2, int i3, int i4, MediaProjection mediaProjection) {
        try {
            checkNotDisposed();
            RXLogging.w(TAG, String.format("[ScreenCapture] call |startCapture|,  width=%d, height=%d", Integer.valueOf(i), Integer.valueOf(i2)));
            if (i > 0 && i2 > 0) {
                this.width = i;
                this.height = i2;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.mDisplay.getRealMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                this.width = i5;
                this.height = displayMetrics.heightPixels;
                RXLogging.w(TAG, String.format("[ScreenCapture] call |startCapture with MediaProjection| , get screen real size, width=%d, height=%d", Integer.valueOf(i5), Integer.valueOf(displayMetrics.heightPixels)));
            }
            this.width = ((this.width + 7) / 8) * 8;
            this.height = ((this.height + 7) / 8) * 8;
            maybeDoRotation();
            this.mediaProjection = mediaProjection;
            if (mediaProjection == null) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("no permission to capture the screen video.");
                }
                return;
            }
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (i4 <= 0) {
                i4 = 4;
            }
            surfaceTextureHelper.setMinFps(i4);
            this.surfaceTextureHelper.startListening(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        startCapture(i, i2, i3, 4);
    }
}
