package com.p069ss.bytertc.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.WindowManager;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.NV21Buffer;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.TimestampAligner;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p069ss.android.ttvecamera.C13331d;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TECameraSettings;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import com.p069ss.android.ttvecamera.TEFrameRateRange;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import com.p069ss.bytertc.engine.UIDeviceOrientation;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.bjh0;
import p149l.cjh0;
import p149l.e16;

/* JADX INFO: loaded from: classes13.dex */
public class VECameraWrapper {
    private long mNativeObj;
    CamParam mParam;
    private EglBase.Context mSharedCtx;
    private Context mContext = null;
    private C13331d mCamera = null;
    private Object mCameraLock = new Object();
    private TECameraSettings mVESettings = null;
    private int mLastDeviceOrientation = 0;
    private int mLastUIOrientation = 0;
    private long mLastDeviceOrientationTS = 0;
    private EventObserver mEventObserver = null;
    private FrameListener mFrameListener = null;
    private int mActWidth = 0;
    private int mActHeight = 0;
    private final int STA_STOPPED = 0;
    private final int STA_STARTING = 1;
    private final int STA_STARTED = 2;
    AtomicInteger mCamState = new AtomicInteger(0);
    private volatile LogCallback mLogger = new LogCallback();
    private final String TAG2SVR = "toSvr";
    private final int CAMERA_BLOCK_THRESHOLD_MS = 2000;
    private boolean mIsExposurePointSupported = true;
    private boolean mIsFocusPointSupported = true;
    private boolean mUseGravitySensor = false;
    private AtomicInteger mGravityOrientation = new AtomicInteger(UIDeviceOrientation.Portrait.value());
    private Camera.CameraInfo mCamInfo = null;
    private Camera.CameraInfo[] mCamInfoList = null;
    private final SensorEventListener mSensorListener = new SensorEventListener() { // from class: com.ss.bytertc.media.VECameraWrapper.2
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
            if (Math.abs(fAbs - fAbs2) < 6.0d) {
                return;
            }
            if (fAbs >= fAbs2) {
                VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                if (f >= 0.0f) {
                    vECameraWrapper.mGravityOrientation.set(UIDeviceOrientation.LandscapeRight.value());
                    return;
                } else {
                    vECameraWrapper.mGravityOrientation.set(UIDeviceOrientation.LandscapeLeft.value());
                    return;
                }
            }
            VECameraWrapper vECameraWrapper2 = VECameraWrapper.this;
            if (f2 >= 0.0f) {
                vECameraWrapper2.mGravityOrientation.set(UIDeviceOrientation.Portrait.value());
            } else {
                vECameraWrapper2.mGravityOrientation.set(UIDeviceOrientation.PortraitUpsidedown.value());
            }
        }
    };

    public static class CamDevInfo {

        /* JADX INFO: renamed from: id */
        private String f55648id;
        private String name;
        private int pos;

        public CamDevInfo(String str, String str2, int i) {
            this.f55648id = str;
            this.name = str2;
            this.pos = i;
        }

        @CalledByNative("CamDevInfo")
        public String getID() {
            return this.f55648id;
        }

        @CalledByNative("CamDevInfo")
        public String getName() {
            return this.name;
        }

        @CalledByNative("CamDevInfo")
        public int getPosition() {
            return this.pos;
        }
    }

    public static class CamParam {
        public boolean antiShake;
        public boolean camera2;
        public String camid;
        public boolean enable_dynamic_fps;
        public boolean faceAE;
        public int fps;
        public int height;
        public int min_dynamic_fps;
        public int pos;
        public boolean useTexture;
        public boolean wideAngle;
        public int width;

        @CalledByNative("CamParam")
        public CamParam(int i, int i2, int i3, int i4, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i5) {
            this.width = i;
            this.height = i2;
            this.fps = i3;
            this.pos = i4;
            this.camid = str;
            this.useTexture = z;
            this.camera2 = z2;
            this.faceAE = z3;
            this.wideAngle = z4;
            this.antiShake = z5;
            this.enable_dynamic_fps = z6;
            this.min_dynamic_fps = i5;
        }
    }

    public class EventObserver implements C13331d.b {
        public EventObserver() {
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onCaptureStarted(int i, int i2) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "CameraObserver.onCaptureStarted ret = " + i2);
            if (i2 == 0) {
                CamParam camParam = VECameraWrapper.this.mParam;
                TEFrameSizei tEFrameSizei = new TEFrameSizei(camParam.width, camParam.height);
                VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                int iM80676a = VECameraWrapper.this.mCamera.m80676a(vECameraWrapper.mParam.useTexture ? new cjh0.C16167a(tEFrameSizei, (bjh0.InterfaceC15877c) vECameraWrapper.mFrameListener, true, VECameraWrapper.this.mFrameListener.mSurfaceTexture, VECameraWrapper.this.mFrameListener.mTexId) : new cjh0.C16167a(tEFrameSizei, (bjh0.InterfaceC15877c) vECameraWrapper.mFrameListener, false, new SurfaceTexture(0), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21));
                VECameraWrapper.this.mLogger.Log((byte) 8, "", "addCameraProvider rst =" + String.valueOf(iM80676a));
                VECameraWrapper.this.mCamera.m80692r();
                VECameraWrapper.this.mCamState.set(2);
            }
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onCaptureStopped(int i) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "CameraObserver.onCaptureStopped");
            VECameraWrapper.this.safeNativeOnCaptureStopped();
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onError(int i, String str) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "CameraObserver.onError, err=" + Integer.toString(i) + " msg=" + str);
            VECameraWrapper.this.safeNativeOnCaptureError(i, str);
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onInfo(int i, int i2, String str) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "", "CameraObserver.onInfo, type=" + Integer.toString(i) + " msg=" + str);
            if (i != 1 || VECameraWrapper.this.mCamera == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("camera_support_fps_range", null);
            VECameraWrapper.this.mCamera.m80686k(bundle);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("camera_support_fps_range");
            if (parcelableArrayList != null) {
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", parcelableArrayList.toString());
            }
        }
    }

    public class FrameListener implements bjh0.InterfaceC15877c {
        boolean mIsFirstFrame = true;
        boolean mStopped = false;
        private SurfaceTexture mSurfaceTexture = null;
        private int mTexId = -1;
        private YuvConverter mYuvConverter = null;
        EglBase mEglBase = null;
        private HandlerThread mThread = null;
        private Handler mHandler = null;
        private Matrix mTexMat = null;
        private TimestampAligner mTimestampAligner = new TimestampAligner();
        private Semaphore mFreeTexSema = null;
        private long mSendTexFrameStart = 0;
        private long frameCountReturned = 0;
        private long frameCountSent = 0;
        private final AtomicInteger mISO = new AtomicInteger(-1);
        private final int mISOPeriodMillis = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        private Runnable updateISO = new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.6
            @Override // java.lang.Runnable
            public void run() {
                synchronized (VECameraWrapper.this.mCameraLock) {
                    try {
                        if (VECameraWrapper.this.mCamera != null) {
                            C13331d c13331d = VECameraWrapper.this.mCamera;
                            final AtomicInteger atomicInteger = FrameListener.this.mISO;
                            Objects.requireNonNull(atomicInteger);
                            c13331d.m80683h(new TECameraSettings.InterfaceC13306g() { // from class: l.iok0
                                @Override // com.p069ss.android.ttvecamera.TECameraSettings.InterfaceC13306g
                                /* JADX INFO: renamed from: a */
                                public final void mo80508a(int i) {
                                    atomicInteger.set(i);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                FrameListener.this.mHandler.postDelayed(this, 1500L);
            }
        };

        public FrameListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void doCleanup() {
            YuvConverter yuvConverter = this.mYuvConverter;
            if (yuvConverter != null) {
                yuvConverter.release();
            }
            int i = this.mTexId;
            if (i > 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            EglBase eglBase = this.mEglBase;
            if (eglBase != null) {
                eglBase.release();
            }
            this.mYuvConverter = null;
            this.mTexId = 0;
            this.mSurfaceTexture = null;
            this.mEglBase = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void returnRawFrame() {
            this.frameCountReturned++;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void returnTextureFrame() {
            this.frameCountReturned++;
            this.mFreeTexSema.release();
        }

        private void sendRawFrame(TECameraFrame tECameraFrame) {
            VideoFrame videoFrame = new VideoFrame((VideoFrame.Buffer) new NV21Buffer(tECameraFrame.m80484a(), tECameraFrame.m80485b().width, tECameraFrame.m80485b().height, new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener.this.returnRawFrame();
                }
            }), VECameraWrapper.this.getFrameOrientation(), System.nanoTime(), false);
            videoFrame.setIso(this.mISO.get());
            VECameraWrapper.this.safeNativeOnFrameCaptured(videoFrame);
            this.frameCountSent++;
            videoFrame.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendTexFrame(final TECameraFrame tECameraFrame) {
            boolean zTryAcquire;
            if (this.mStopped) {
                return;
            }
            if (this.mSendTexFrameStart != 0 && SystemClock.elapsedRealtime() - this.mSendTexFrameStart > 2000) {
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "block by other node");
            }
            if (this.mSendTexFrameStart == 0) {
                this.mSendTexFrameStart = SystemClock.elapsedRealtime();
            }
            try {
                zTryAcquire = this.mFreeTexSema.tryAcquire(1, 2000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "semaphore interrupted");
                e.printStackTrace();
                zTryAcquire = false;
            }
            if (!zTryAcquire) {
                this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55649a.sendTexFrame(tECameraFrame);
                    }
                });
                return;
            }
            this.mSendTexFrameStart = 0L;
            synchronized (EglBase.lock) {
                try {
                    this.mSurfaceTexture.updateTexImage();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    VECameraWrapper.this.mLogger.Log((byte) 8, "", "updateTexImage failed(could be caused by fd leak)");
                }
            }
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(tECameraFrame.m80485b().width, tECameraFrame.m80485b().height, VideoFrame.TextureBuffer.Type.OES, tECameraFrame.m80486c(), matrix, this.mHandler, this.mYuvConverter, new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.2
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener.this.returnTextureFrame();
                }
            }), VECameraWrapper.this.getFrameOrientation(), this.mTimestampAligner.translateTimestamp(this.mSurfaceTexture.getTimestamp()));
            videoFrame.setIso(this.mISO.get());
            VECameraWrapper.this.safeNativeOnFrameCaptured(videoFrame);
            this.frameCountSent++;
            videoFrame.release();
        }

        @Override // p149l.bjh0.InterfaceC15877c
        public void onFrameCaptured(final TECameraFrame tECameraFrame) {
            VECameraWrapper.this.mActWidth = tECameraFrame.m80485b().width;
            VECameraWrapper.this.mActHeight = tECameraFrame.m80485b().height;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - VECameraWrapper.this.mLastDeviceOrientationTS) > 500) {
                VECameraWrapper.this.mLastDeviceOrientationTS = jCurrentTimeMillis;
                int iUpdateUIOrientation = VECameraWrapper.this.updateUIOrientation();
                int deviceOrientation = VECameraWrapper.this.getDeviceOrientation();
                if (iUpdateUIOrientation != VECameraWrapper.this.mLastUIOrientation || deviceOrientation != VECameraWrapper.this.mLastDeviceOrientation) {
                    VECameraWrapper.this.mLastUIOrientation = iUpdateUIOrientation;
                    VECameraWrapper.this.mLastDeviceOrientation = deviceOrientation;
                    RXLogging.m5692w("CameInfo", " startCapture mLastUIOrientation: " + VECameraWrapper.this.mLastUIOrientation + ", mLastDeviceOrientation: " + VECameraWrapper.this.mLastDeviceOrientation + ", mUseGravitySensor:" + Boolean.toString(VECameraWrapper.this.mUseGravitySensor));
                }
            }
            if (this.mIsFirstFrame) {
                VECameraWrapper.this.safeNativeOnCaptureStarted();
                this.mIsFirstFrame = false;
            }
            if (VECameraWrapper.this.mParam.useTexture) {
                this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        FrameListener.this.sendTexFrame(tECameraFrame);
                    }
                });
            } else {
                sendRawFrame(tECameraFrame);
            }
        }

        @Override // p149l.bjh0.InterfaceC15877c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "", "IFrameListener.onNewSurfaceTexture");
        }

        public void shutdown() {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mHandler.removeCallbacks(this.updateISO);
            this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.5
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener frameListener = FrameListener.this;
                    if (VECameraWrapper.this.mParam.useTexture) {
                        if (frameListener.mFreeTexSema.availablePermits() == 0) {
                            try {
                                FrameListener.this.mFreeTexSema.acquire();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        FrameListener.this.doCleanup();
                    }
                    countDownLatch.countDown();
                    FrameListener.this.mStopped = true;
                }
            });
            try {
                countDownLatch.await();
                this.mHandler.getLooper().quit();
                this.mThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void startup() {
            HandlerThread handlerThread = new HandlerThread("vecam_handler");
            this.mThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mThread.getLooper());
            this.mFreeTexSema = new Semaphore(1);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.4
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener frameListener = FrameListener.this;
                    VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                    if (vECameraWrapper.mParam.useTexture) {
                        try {
                            frameListener.mEglBase = EglBase.create(vECameraWrapper.mSharedCtx, EglBase.CONFIG_PIXEL_BUFFER);
                            FrameListener.this.mEglBase.createDummyPbufferSurface();
                            FrameListener.this.mEglBase.makeCurrent();
                            FrameListener.this.mTexId = GlUtil.generateTexture(36197);
                            FrameListener.this.mSurfaceTexture = new SurfaceTexture(FrameListener.this.mTexId);
                            FrameListener.this.mYuvConverter = new YuvConverter();
                        } catch (RuntimeException unused) {
                            FrameListener.this.doCleanup();
                            VECameraWrapper.this.mParam.useTexture = false;
                        }
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.mHandler.postDelayed(this.updateISO, 1500L);
        }
    }

    public class LogCallback implements C13341g.b {
        public LogCallback() {
        }

        @Override // com.p069ss.android.ttvecamera.C13341g.b
        public void Log(byte b, String str, String str2) {
            byte[] bArr = {1, 2, 4, 8, Tnaf.POW_2_WIDTH};
            int i = 0;
            int[] iArr = {4, 3, 2, 1, 0};
            for (int i2 = 0; i2 < 5; i2++) {
                if (b == bArr[i2]) {
                    i = iArr[i2];
                    break;
                }
            }
            VECameraWrapper.this.safeNativeOnCaptureLog(i, "VECAM-" + str2, str.endsWith("toSvr"));
        }
    }

    public class ZoomCallback implements TECameraSettings.InterfaceC13315p {
        CountDownLatch mSigFinish;
        public boolean mSupportZoom = false;
        public float mMaxZoom = 1.0f;

        public ZoomCallback(CountDownLatch countDownLatch) {
            this.mSigFinish = countDownLatch;
        }

        @Override // com.p069ss.android.ttvecamera.TECameraSettings.InterfaceC13315p
        public boolean enableSmooth() {
            return true;
        }

        @Override // com.p069ss.android.ttvecamera.TECameraSettings.InterfaceC13315p
        public void onChange(int i, float f, boolean z) {
        }

        @Override // com.p069ss.android.ttvecamera.TECameraSettings.InterfaceC13315p
        public void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
            this.mSupportZoom = z;
            this.mMaxZoom = f;
            CountDownLatch countDownLatch = this.mSigFinish;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    @CalledByNative
    public VECameraWrapper(long j, EglBase.Context context) {
        this.mNativeObj = 0L;
        this.mSharedCtx = null;
        this.mNativeObj = j;
        this.mSharedCtx = context;
    }

    private static boolean DeviceSupportCamera2() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return true;
        }
        return !str.equals("CVTE");
    }

    private int focusAtPointImpl(float f, float f2, boolean z, boolean z2) {
        int i;
        int i2;
        if (this.mCamState.get() != 2 || (i = this.mActWidth) == 0 || (i2 = this.mActHeight) == 0) {
            return -1;
        }
        TEFocusSettings tEFocusSettings = new TEFocusSettings(i, i2, (int) (i * f), (int) (i2 * f2), 1.0f);
        tEFocusSettings.m80531r(TEFocusSettings.CoordinatesMode.ORIGINAL_FRAME);
        tEFocusSettings.m80532s(z);
        tEFocusSettings.m80533t(z2);
        this.mCamera.m80681f(tEFocusSettings);
        return 0;
    }

    @SuppressLint({"DefaultLocale"})
    private String formatParams() {
        return String.format("[w:%d h:%d fr:%d pos:%d tex:%b cam2:%b faceae:%b wideangle:%b antishake:%b vp_dyfps:%b minfps:%d]", Integer.valueOf(this.mParam.width), Integer.valueOf(this.mParam.height), Integer.valueOf(this.mParam.fps), Integer.valueOf(this.mParam.pos), Boolean.valueOf(this.mParam.useTexture), Boolean.valueOf(this.mParam.camera2), Boolean.valueOf(this.mParam.faceAE), Boolean.valueOf(this.mParam.wideAngle), Boolean.valueOf(this.mParam.antiShake), Boolean.valueOf(this.mParam.enable_dynamic_fps), Integer.valueOf(this.mParam.min_dynamic_fps));
    }

    @CalledByNative
    public static CamDevInfo[] getCameraList() {
        if (DeviceSupportCamera2()) {
            return getCameraListByCamera2();
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        CamDevInfo[] camDevInfoArr = new CamDevInfo[numberOfCameras];
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                String str = "back";
                int i2 = 1;
                if (cameraInfo.facing == 1) {
                    str = "front";
                    i2 = 0;
                }
                String str2 = "Camera " + i + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
                camDevInfoArr[i] = new CamDevInfo(Integer.toString(i), str2, i2);
                RXLogging.m5692w("CameInfo", " camera name: " + str2 + ", camera id: " + i);
            } catch (Exception e) {
                RXLogging.m5688e("CameInfo", "exception: " + e.toString());
                return null;
            }
        }
        return camDevInfoArr;
    }

    private static CamDevInfo[] getCameraListByCamera2() {
        int iIntValue;
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        CamDevInfo[] camDevInfoArr = null;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            camDevInfoArr = new CamDevInfo[cameraIdList.length];
            for (int i = 0; i < cameraIdList.length; i++) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[i]);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                if (num == null) {
                    RXLogging.m5688e("CameInfo", "facing is null");
                } else {
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        RXLogging.m5688e("CameInfo", "orientation is null");
                        iIntValue = 0;
                    }
                    int iIntValue2 = num.intValue();
                    String str = "Camera " + i + ", Facing " + iIntValue2 + ", Orientation " + iIntValue;
                    camDevInfoArr[i] = new CamDevInfo(cameraIdList[i], str, iIntValue2);
                    RXLogging.m5692w("CameInfo", " camera name: " + str + ", camera id: " + cameraIdList[i] + ",Facing: " + num);
                }
            }
            return camDevInfoArr;
        } catch (Exception e) {
            RXLogging.m5688e("CameInfo", "exception: " + e.toString());
            return camDevInfoArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int i = this.mLastDeviceOrientation;
        if (this.mUseGravitySensor) {
            i = this.mGravityOrientation.get();
        }
        Camera.CameraInfo cameraInfo = this.mCamInfo;
        if (cameraInfo.facing == 1) {
            i = 360 - i;
        }
        return (cameraInfo.orientation + i) % 360;
    }

    public static boolean isMTKandAndroid12() {
        return Build.HARDWARE.toLowerCase().matches("mt[0-9]*") && Build.VERSION.SDK_INT == 31;
    }

    public static native void nativeOnCaptureError(long j, int i, String str);

    public static native void nativeOnCaptureFormatSelected(long j, int i, int i2, int i3, int i4, int i5);

    public static native void nativeOnCaptureLog(long j, int i, String str, boolean z);

    public static native void nativeOnCaptureStarted(long j);

    public static native void nativeOnCaptureStopped(long j);

    public static native void nativeOnFrameCaptured(long j, VideoFrame videoFrame);

    private ZoomCallback queryZoomAbility() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ZoomCallback zoomCallback = new ZoomCallback(countDownLatch);
        this.mCamera.m80688m(zoomCallback, false);
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            return zoomCallback;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return zoomCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureError(int i, String str) {
        synchronized (this) {
            try {
                long j = this.mNativeObj;
                if (j != 0) {
                    nativeOnCaptureError(j, i, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureFormatSelected(int i, int i2, int i3, int i4, int i5) {
        synchronized (this) {
            try {
                long j = this.mNativeObj;
                if (j != 0) {
                    nativeOnCaptureFormatSelected(j, i, i2, i3, i4, i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureLog(int i, String str, boolean z) {
        synchronized (this) {
            try {
                long j = this.mNativeObj;
                if (j != 0) {
                    nativeOnCaptureLog(j, i, str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureStarted() {
        synchronized (this) {
            try {
                long j = this.mNativeObj;
                if (j != 0) {
                    nativeOnCaptureStarted(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureStopped() {
        synchronized (this) {
            try {
                long j = this.mNativeObj;
                if (j != 0) {
                    nativeOnCaptureStopped(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnFrameCaptured(VideoFrame videoFrame) {
        synchronized (this) {
            try {
                long j = this.mNativeObj;
                if (j != 0) {
                    nativeOnFrameCaptured(j, videoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void updateCameraCharacteristics() {
        int iCamera1FaceingToCamera2 = camera1FaceingToCamera2(this.mParam.pos);
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == iCamera1FaceingToCamera2) {
                    int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
                    int iIntValue2 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                    this.mIsExposurePointSupported = iIntValue > 0;
                    this.mIsFocusPointSupported = iIntValue2 > 0;
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int camera1FaceingToCamera2(int i) {
        return i == 0 ? 1 : 0;
    }

    @CalledByNative
    public int enableCameraTorch(boolean z) {
        if (this.mCamState.get() != 2) {
            return 0;
        }
        this.mCamera.m80696v(z);
        return 0;
    }

    @CalledByNative
    public int enableGravitySensor(boolean z) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(9)) == null) {
            return -1;
        }
        SensorEventListener sensorEventListener = this.mSensorListener;
        if (z) {
            sensorManager.registerListener(sensorEventListener, defaultSensor, 2);
            this.mUseGravitySensor = true;
        } else {
            sensorManager.unregisterListener(sensorEventListener);
            this.mUseGravitySensor = false;
        }
        return 0;
    }

    @CalledByNative
    public int getCameraSensorOrientation() {
        return 0;
    }

    @CalledByNative
    public int getCameraSensorOrientations(boolean z) {
        int i = z ? 270 : 90;
        Camera.CameraInfo[] cameraInfoArr = this.mCamInfoList;
        if (cameraInfoArr != null) {
            for (Camera.CameraInfo cameraInfo : cameraInfoArr) {
                int i2 = cameraInfo.facing;
                if ((i2 == 1 && z) || (i2 == 0 && !z)) {
                    return cameraInfo.orientation;
                }
            }
        }
        return i;
    }

    @CalledByNative
    public float getCameraZoomMaxRatio() {
        if (this.mCamState.get() != 2) {
            return 1.0f;
        }
        return queryZoomAbility().mMaxZoom;
    }

    @CalledByNative
    public int getDeviceOrientation() {
        return this.mUseGravitySensor ? this.mGravityOrientation.get() : getUIOrientation();
    }

    @CalledByNative
    public int getUIOrientation() {
        return this.mLastUIOrientation;
    }

    @CalledByNative
    public boolean isCameraExposurePointSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return this.mIsExposurePointSupported;
    }

    @CalledByNative
    public boolean isCameraFocusPointSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return this.mIsFocusPointSupported;
    }

    @CalledByNative
    public boolean isCameraTorchSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return this.mCamera.m80685j();
    }

    @CalledByNative
    public boolean isCameraZoomSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return queryZoomAbility().mSupportZoom;
    }

    @CalledByNative
    public int setCameraZoomRatio(float f) {
        if (this.mCamState.get() != 2) {
            return -1;
        }
        this.mCamera.m80693s(f, new ZoomCallback(null));
        return 0;
    }

    @CalledByNative
    public int setExposureCompensation(float f) {
        if (f < -1.0f || f > 1.0f || this.mCamState.get() != 2 || !this.mCamera.m80684i()) {
            return -1;
        }
        TECameraSettings.C13303d c13303dM80682g = this.mCamera.m80682g();
        int iCeil = f < 0.0f ? (int) Math.ceil(-Math.abs(c13303dM80682g.f55386c * f)) : 0;
        if (f > 0.0f) {
            iCeil = (int) Math.floor(Math.abs(f * c13303dM80682g.f55384a));
        }
        this.mCamera.m80691q(iCeil);
        return 0;
    }

    @CalledByNative
    public int setExposurePoint(float f, float f2) {
        if (this.mCamState.get() == 2 && this.mIsExposurePointSupported) {
            return focusAtPointImpl(f, f2, false, true);
        }
        return -1;
    }

    @CalledByNative
    public int setFocusPoint(float f, float f2) {
        if (this.mCamState.get() == 2 && this.mIsFocusPointSupported) {
            return focusAtPointImpl(f, f2, true, true);
        }
        return -1;
    }

    @CalledByNative
    public void startCapture(CamParam camParam) {
        if (isMTKandAndroid12()) {
            camParam.useTexture = false;
        }
        if (this.mCamState.get() != 0) {
            return;
        }
        this.mCamState.set(1);
        this.mParam = camParam;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (e16.m114373a(applicationContext, "android.permission.CAMERA") != 0) {
            safeNativeOnCaptureError(-408, "camera disabled");
            return;
        }
        this.mLogger.Log((byte) 8, "toSvr", "startCapture - input params " + formatParams());
        this.mLastDeviceOrientationTS = System.currentTimeMillis();
        this.mLastUIOrientation = updateUIOrientation();
        this.mLastDeviceOrientation = getDeviceOrientation();
        RXLogging.m5692w("CameInfo", " startCapture mLastUIOrientation: " + this.mLastUIOrientation + ", mLastDeviceOrientation: " + this.mLastDeviceOrientation);
        RXLogging.m5692w("CameInfo", "mParam width: " + this.mParam.width + ", height: " + this.mParam.height + ", fps: " + this.mParam.fps + ", camid: " + this.mParam.camid + ", useTexture: " + this.mParam.useTexture + ", pos: " + this.mParam.pos + ", camera2: " + this.mParam.camera2 + ", faceAE: " + this.mParam.faceAE + ", wideAngle: " + this.mParam.wideAngle + ", antiShake: " + this.mParam.antiShake + ", enable_dynamic_fps: " + this.mParam.enable_dynamic_fps + ", min_dynamic_fps: " + this.mParam.min_dynamic_fps);
        this.mCamInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        this.mCamInfoList = new Camera.CameraInfo[numberOfCameras];
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                this.mCamInfoList[i] = new Camera.CameraInfo();
                Camera.getCameraInfo(i, this.mCamInfoList[i]);
                RXLogging.m5692w("CameInfo", "CamInfoList " + i + " = facing: " + this.mCamInfoList[i].facing + ", orientation: " + this.mCamInfoList[i].orientation);
                Camera.CameraInfo cameraInfo = this.mCamInfoList[i];
                if (cameraInfo.facing == this.mParam.pos) {
                    this.mCamInfo = cameraInfo;
                    RXLogging.m5692w("CameInfo", "update mCamInfo is " + i);
                    break;
                }
                continue;
            } catch (Exception e) {
                e.toString();
            }
        }
        RXLogging.m5692w("CameInfo", "current select mCamInfo facing: " + this.mCamInfo.facing + ", orientation: " + this.mCamInfo.orientation);
        updateCameraCharacteristics();
        this.mFrameListener = new FrameListener();
        this.mEventObserver = new EventObserver();
        this.mFrameListener.startup();
        CamParam camParam2 = this.mParam;
        if (!camParam2.useTexture) {
            camParam2.camera2 = false;
        }
        RXLogging.m5692w("CameInfo", "current select mParam.camera2: " + this.mParam.camera2);
        this.mLogger.Log((byte) 8, "toSvr", "startCapture - actual params " + formatParams());
        int i2 = this.mParam.camera2 ? 2 : 1;
        Context context = this.mContext;
        CamParam camParam3 = this.mParam;
        TECameraSettings tECameraSettings = new TECameraSettings(context, i2, camParam3.width, camParam3.height);
        this.mVESettings = tECameraSettings;
        CamParam camParam4 = this.mParam;
        tECameraSettings.f55333d = camParam4.pos;
        tECameraSettings.f55369v = 30;
        tECameraSettings.f55350l0 = true;
        int i3 = camParam4.min_dynamic_fps;
        if (i3 <= 0) {
            i3 = 7;
        }
        int iMin = camParam4.enable_dynamic_fps ? Math.min(i3, camParam4.fps) : camParam4.fps;
        TECameraSettings tECameraSettings2 = this.mVESettings;
        tECameraSettings2.f55310J = this.mParam.camid;
        tECameraSettings2.f55331c = new TEFrameRateRange(iMin, this.mParam.fps);
        this.mLogger.Log((byte) 8, "toSvr", "enable_dynamic_fps:" + this.mParam.enable_dynamic_fps + " fpsRange min:" + iMin + " max:" + this.mParam.fps);
        TECameraSettings tECameraSettings3 = this.mVESettings;
        tECameraSettings3.f55345j = false;
        if (this.mParam.faceAE) {
            tECameraSettings3.f55305E.putInt("useCameraFaceDetect", 3);
        }
        TECameraSettings tECameraSettings4 = this.mVESettings;
        tECameraSettings4.f55353n = true;
        tECameraSettings4.f55317Q = true;
        this.mCamera = new C13331d(this.mEventObserver, null);
        C13331d.m80675n((byte) 31, this.mLogger);
        this.mCamera.m80689o(new C13331d.e() { // from class: com.ss.bytertc.media.VECameraWrapper.1
            @Override // com.p069ss.android.ttvecamera.C13331d.e
            public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
                if (list.size() == 0) {
                    return null;
                }
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "supportPreviewSizes:" + list.toString());
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    TEFrameSizei tEFrameSizei = list.get(i4);
                    if (tEFrameSizei.width >= VECameraWrapper.this.mParam.width) {
                        arrayList.add(tEFrameSizei);
                    }
                }
                if (arrayList.size() != 0) {
                    list = arrayList;
                }
                TEFrameSizei tEFrameSizei2 = list.get(0);
                int iAbs = Math.abs(VECameraWrapper.this.mParam.width - tEFrameSizei2.width) + Math.abs(VECameraWrapper.this.mParam.height - tEFrameSizei2.height);
                for (int i5 = 1; i5 < list.size(); i5++) {
                    TEFrameSizei tEFrameSizei3 = list.get(i5);
                    int iAbs2 = Math.abs(VECameraWrapper.this.mParam.width - tEFrameSizei3.width) + Math.abs(VECameraWrapper.this.mParam.height - tEFrameSizei3.height);
                    if (iAbs2 < iAbs) {
                        tEFrameSizei2 = tEFrameSizei3;
                        iAbs = iAbs2;
                    }
                }
                VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                vECameraWrapper.safeNativeOnCaptureFormatSelected(tEFrameSizei2.width, tEFrameSizei2.height, vECameraWrapper.mVESettings.f55331c.min, VECameraWrapper.this.mVESettings.f55331c.max, (VECameraWrapper.this.mParam.useTexture ? RXPixelFormat.kTextureOES : RXPixelFormat.kNv21).value());
                return tEFrameSizei2;
            }
        });
        this.mCamera.m80677b(this.mVESettings);
    }

    @CalledByNative
    public void stopCapture() {
        SensorManager sensorManager;
        this.mLogger.Log((byte) 8, "toSvr", "stopCapture...");
        if (this.mCamState.get() == 0) {
            this.mLogger.Log((byte) 8, "toSvr", "stopCapture have stopped.");
            return;
        }
        if (this.mUseGravitySensor && (sensorManager = (SensorManager) this.mContext.getSystemService("sensor")) != null) {
            sensorManager.unregisterListener(this.mSensorListener);
        }
        C13331d c13331d = this.mCamera;
        if (c13331d != null) {
            c13331d.m80690p();
            this.mCamera.m80694t();
            this.mCamera.m80679d();
        }
        FrameListener frameListener = this.mFrameListener;
        if (frameListener != null) {
            frameListener.shutdown();
            this.mFrameListener = null;
        }
        this.mCamState.set(0);
        this.mLogger.Log((byte) 8, "toSvr", "stopCapture done.");
    }

    @CalledByNative
    public int uninitVideoCapture() {
        if (this.mCamera != null) {
            this.mVESettings = null;
            C13331d.m80675n((byte) 31, null);
            synchronized (this.mCameraLock) {
                this.mCamera = null;
            }
        }
        this.mEventObserver = null;
        this.mLogger.Log((byte) 8, "toSvr", "uninitVideoCapture done.");
        synchronized (this) {
            this.mNativeObj = 0L;
        }
        return 0;
    }

    public int updateUIOrientation() {
        int rotation = ((WindowManager) this.mContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return UIDeviceOrientation.LandscapeRight.value();
        }
        if (rotation != 2) {
            return rotation != 3 ? UIDeviceOrientation.Portrait.value() : UIDeviceOrientation.LandscapeLeft.value();
        }
        return UIDeviceOrientation.PortraitUpsidedown.value();
    }
}
