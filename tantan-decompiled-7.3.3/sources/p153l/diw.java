package p153l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.camera.config.Rotation;
import com.momo.mcamera.util.MDLogTag;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class diw implements ypl {

    /* JADX INFO: renamed from: B */
    private Boolean f88718B;

    /* JADX INFO: renamed from: C */
    private CaptureRequest f88719C;

    /* JADX INFO: renamed from: H */
    private qow f88724H;

    /* JADX INFO: renamed from: a */
    private sow f88732a;

    /* JADX INFO: renamed from: b */
    private ypl.InterfaceC21656a f88733b;

    /* JADX INFO: renamed from: c */
    private Handler f88734c;

    /* JADX INFO: renamed from: d */
    private Handler f88735d;

    /* JADX INFO: renamed from: f */
    private ImageReader f88737f;

    /* JADX INFO: renamed from: g */
    private CameraDevice f88738g;

    /* JADX INFO: renamed from: h */
    private CameraManager f88739h;

    /* JADX INFO: renamed from: i */
    private CameraCaptureSession f88740i;

    /* JADX INFO: renamed from: l */
    private CaptureRequest.Builder f88743l;

    /* JADX INFO: renamed from: m */
    private int f88744m;

    /* JADX INFO: renamed from: r */
    private crf0 f88749r;

    /* JADX INFO: renamed from: e */
    private int f88736e = 1;

    /* JADX INFO: renamed from: j */
    public final int f88741j = 1;

    /* JADX INFO: renamed from: k */
    public final int f88742k = 2;

    /* JADX INFO: renamed from: n */
    public final int f88745n = 0;

    /* JADX INFO: renamed from: o */
    public final int f88746o = 1;

    /* JADX INFO: renamed from: p */
    int f88747p = 0;

    /* JADX INFO: renamed from: q */
    private int f88748q = 0;

    /* JADX INFO: renamed from: s */
    private Rect f88750s = new Rect(0, 0, 1, 1);

    /* JADX INFO: renamed from: t */
    private int f88751t = 0;

    /* JADX INFO: renamed from: u */
    private HandlerThread f88752u = null;

    /* JADX INFO: renamed from: v */
    InterfaceC16546h f88753v = null;

    /* JADX INFO: renamed from: w */
    private Context f88754w = null;

    /* JADX INFO: renamed from: x */
    private int f88755x = 0;

    /* JADX INFO: renamed from: y */
    CameraDevice.StateCallback f88756y = new C16540b();

    /* JADX INFO: renamed from: z */
    byte[] f88757z = null;

    /* JADX INFO: renamed from: A */
    ImageReader.OnImageAvailableListener f88717A = new C16541c();

    /* JADX INFO: renamed from: D */
    private ypl.InterfaceC21660e f88720D = null;

    /* JADX INFO: renamed from: E */
    private Semaphore f88721E = new Semaphore(1);

    /* JADX INFO: renamed from: F */
    private boolean f88722F = false;

    /* JADX INFO: renamed from: G */
    private CameraCaptureSession.StateCallback f88723G = new C16542d();

    /* JADX INFO: renamed from: I */
    private boolean f88725I = false;

    /* JADX INFO: renamed from: J */
    private boolean f88726J = true;

    /* JADX INFO: renamed from: K */
    private Integer f88727K = null;

    /* JADX INFO: renamed from: L */
    private Runnable f88728L = new RunnableC16543e();

    /* JADX INFO: renamed from: M */
    private long f88729M = 0;

    /* JADX INFO: renamed from: N */
    private CameraCaptureSession.CaptureCallback f88730N = new C16544f();

    /* JADX INFO: renamed from: O */
    private CameraCaptureSession.CaptureCallback f88731O = new C16545g();

    /* JADX INFO: renamed from: l.diw$a */
    public class C16539a extends CameraCaptureSession.CaptureCallback {
        public C16539a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            diw.this.m115995s0();
        }
    }

    /* JADX INFO: renamed from: l.diw$b */
    public class C16540b extends CameraDevice.StateCallback {
        public C16540b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            super.onClosed(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            diw.this.f88721E.release();
            cameraDevice.close();
            diw.this.f88738g = null;
            diw.this.m115982d0();
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is onDisconnected !!!");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            diw.this.f88721E.release();
            cameraDevice.close();
            diw.this.f88738g = null;
            diw.this.m115990l0(1, r94.f161790a.get(1));
            if (diw.this.f88720D != null) {
                diw.this.f88720D.onFail(4004, "Camera2 open failed !");
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 open failed !");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            diw.this.f88721E.release();
            diw.this.f88738g = cameraDevice;
            diw.this.m115979a0();
            diw diwVar = diw.this;
            diwVar.f88726J = diwVar.m115981c0();
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is opened !!!");
        }
    }

    /* JADX INFO: renamed from: l.diw$c */
    public class C16541c implements ImageReader.OnImageAvailableListener {
        public C16541c() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            diw diwVar = diw.this;
            diwVar.f88757z = yjm.m216413a(imageAcquireNextImage, 2, diwVar.f88757z);
            if (diw.this.f88733b != null && !diw.this.f88725I) {
                diw.this.f88733b.onData(diw.this.f88757z);
            }
            diw.m115996z(diw.this);
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.diw$d */
    public class C16542d extends CameraCaptureSession.StateCallback {
        public C16542d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.close();
            diw.this.f88740i = null;
            if (diw.this.f88720D != null) {
                diw.this.f88720D.onFail(4005, "Camera2 config failed !");
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config failed !");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            if (diw.this.f88738g == null) {
                return;
            }
            diw.this.f88740i = cameraCaptureSession;
            diw.this.m115994r0();
        }
    }

    /* JADX INFO: renamed from: l.diw$e */
    public class RunnableC16543e implements Runnable {
        public RunnableC16543e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            diw.this.m115999j0();
        }
    }

    /* JADX INFO: renamed from: l.diw$f */
    public class C16544f extends CameraCaptureSession.CaptureCallback {
        public C16544f() {
        }

        /* JADX INFO: renamed from: a */
        private void m116002a(CaptureResult captureResult) {
            int i = diw.this.f88755x;
            if (i == 0) {
                diw.this.f88729M = 0L;
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null && !num.equals(diw.this.f88727K)) {
                    switch (num.intValue()) {
                        case 0:
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_INACTIVE");
                            break;
                        case 1:
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_SCAN");
                            break;
                        case 2:
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_FOCUSED");
                            break;
                        case 3:
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_ACTIVE_SCAN");
                            break;
                        case 4:
                            diw.this.f88743l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            diw.this.m115994r0();
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_FOCUSED_LOCKED");
                            break;
                        case 5:
                            diw.this.f88743l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            diw.this.m115994r0();
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_NOT_FOCUSED_LOCKED");
                            break;
                        case 6:
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_UNFOCUSED");
                            break;
                    }
                }
                diw.this.f88727K = num;
                return;
            }
            if (i == 1) {
                diw.this.f88729M = 0L;
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 == null) {
                    MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null");
                    diw.this.m115980b0();
                    return;
                }
                if (4 == num2.intValue() || 5 == num2.intValue()) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() != 2) {
                        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null stick taken");
                        diw.this.m115992n0();
                        return;
                    } else {
                        diw.this.f88755x = 4;
                        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.still taken");
                        diw.this.m115980b0();
                        return;
                    }
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5 || System.currentTimeMillis() - diw.this.f88729M > 200) {
                    diw.this.f88755x = 4;
                    diw.this.m115980b0();
                    return;
                }
                return;
            }
            diw.this.f88729M = 0L;
            Integer num5 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num5 == null || num5.intValue() == 5 || num5.intValue() == 4) {
                diw.this.f88755x = 3;
                diw.this.f88729M = System.currentTimeMillis();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m116002a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m116002a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.diw$g */
    public class C16545g extends CameraCaptureSession.CaptureCallback {
        public C16545g() {
        }

        /* JADX INFO: renamed from: a */
        private void m116003a(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                return;
            }
            if (4 == num.intValue() || 5 == num.intValue()) {
                diw.this.f88743l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "camera focused ");
                diw.this.m115994r0();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(api = 21)
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m116003a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m116003a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.diw$h */
    public interface InterfaceC16546h {
        /* JADX INFO: renamed from: a */
        void mo116004a(int i, String str);
    }

    public diw(sow sowVar) {
        this.f88744m = 0;
        this.f88732a = sowVar;
        this.f88744m = j94.m143929b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a0 */
    public void m115979a0() {
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f88738g.createCaptureRequest(3);
            this.f88743l = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(this.f88737f.getSurface());
            this.f88738g.createCaptureSession(Arrays.asList(this.f88737f.getSurface()), this.f88723G, this.f88734c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.getMessage());
            m115990l0(3, r94.f161790a.get(3));
            ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4002, "Camera2 start preview failed !" + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.getMessage());
            m115990l0(3, r94.f161790a.get(3));
            ypl.InterfaceC21660e interfaceC21660e2 = this.f88720D;
            if (interfaceC21660e2 != null) {
                interfaceC21660e2.onFail(4002, "Camera2 start preview failed !" + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m115980b0() {
        try {
            CameraDevice cameraDevice = this.f88738g;
            if (cameraDevice == null) {
                return;
            }
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f88737f.getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
            m115993o0(builderCreateCaptureRequest);
            C16539a c16539a = new C16539a();
            this.f88740i.stopRepeating();
            this.f88740i.abortCaptures();
            this.f88740i.capture(builderCreateCaptureRequest.build(), c16539a, null);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 take photo error!" + e.getMessage());
            ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, "Camera2 take photo error!" + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: c0 */
    public boolean m115981c0() {
        CameraManager cameraManager = this.f88739h;
        if (cameraManager != null) {
            try {
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f88739h.getCameraCharacteristics(str);
                    if (this.f88736e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        return true;
                    }
                    if (this.f88736e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        return false;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get Camera2 is front failed !" + e.toString());
                m115990l0(6, r94.f161790a.get(6));
                ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
                if (interfaceC21660e != null) {
                    interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get Camera2 is front failed !");
                }
            }
        }
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: f0 */
    private float m115983f0() {
        Float f;
        try {
            f = (Float) this.f88739h.getCameraCharacteristics(this.f88736e + "").get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "isHardwareLevelSupported Error" + e.toString());
            f = null;
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m115985g0() {
        return m115987h0(2) || m115983f0() > 0.0f;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: h0 */
    private boolean m115987h0(int i) {
        try {
            int iIntValue = ((Integer) this.f88739h.getCameraCharacteristics(this.f88736e + "").get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
            if (iIntValue == 0) {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
            } else if (iIntValue == 1) {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_FULL");
            } else if (iIntValue == 2) {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY");
            } else if (iIntValue != 3) {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Unknown INFO_SUPPORTED_HARDWARE_LEVEL: " + iIntValue);
            } else {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_3");
            }
            if (iIntValue == 2) {
                return i == iIntValue;
            }
            return i <= iIntValue;
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "isHardwareLevelSupported Error" + e.toString());
            return false;
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i0 */
    private boolean m115988i0(int i) {
        try {
            CameraManager cameraManager = this.f88739h;
            if (cameraManager != null) {
                for (int i2 : (int[]) cameraManager.getCameraCharacteristics(String.valueOf(this.f88736e)).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                    if (i2 == i) {
                        return true;
                    }
                }
            }
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get Camera2 is support flash AE mode error!" + e.getMessage());
            m115990l0(10, r94.f161790a.get(10));
            ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get Camera2 is support flash AE mode error!" + e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    private void m115989k0() {
        try {
            CaptureRequest.Builder builder = this.f88743l;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            builder.set(key, 4);
            CaptureRequest.Builder builder2 = this.f88743l;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
            builder2.set(key2, 1);
            this.f88755x = 1;
            this.f88740i.capture(this.f88743l.build(), this.f88730N, this.f88734c);
            this.f88743l.set(key2, null);
            this.f88743l.set(key, null);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 lockFocus failed !!!" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m115990l0(int i, String str) {
        InterfaceC16546h interfaceC16546h = this.f88753v;
        if (interfaceC16546h != null) {
            interfaceC16546h.mo116004a(i, str);
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: m0 */
    private void m115991m0() {
        mo98187a();
        mo98194j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m115992n0() {
        try {
            this.f88743l.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f88755x = 2;
            this.f88740i.capture(this.f88743l.build(), this.f88730N, this.f88734c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 runPrecaptureSequence failed !!!" + e.toString());
        }
    }

    /* JADX INFO: renamed from: o0 */
    private void m115993o0(CaptureRequest.Builder builder) {
        this.f88718B.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public synchronized void m115994r0() {
        try {
            CaptureRequest.Builder builder = this.f88743l;
            if (builder != null && this.f88740i != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                this.f88743l.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f88732a.f169934H), Integer.valueOf(this.f88732a.f169933G)));
                CaptureRequest captureRequestBuild = this.f88743l.build();
                this.f88719C = captureRequestBuild;
                this.f88740i.setRepeatingRequest(captureRequestBuild, this.f88730N, this.f88734c);
                this.f88725I = false;
            }
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startNormalPreview failed !" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m115995s0() {
        try {
            this.f88743l.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m115993o0(this.f88743l);
            this.f88740i.capture(this.f88743l.build(), this.f88730N, this.f88734c);
            this.f88755x = 0;
            this.f88740i.setRepeatingRequest(this.f88719C, this.f88730N, this.f88734c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4005, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ gql m115996z(diw diwVar) {
        diwVar.getClass();
        return null;
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: A */
    public synchronized boolean mo98181A(int i, qow qowVar) {
        try {
            try {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switchCamera !!!");
                for (String str : this.f88739h.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f88739h.getCameraCharacteristics(str);
                    if (this.f88736e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        this.f88725I = true;
                        this.f88736e = 0;
                        m115991m0();
                        break;
                    }
                    if (this.f88736e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        this.f88725I = true;
                        this.f88736e = 1;
                        m115991m0();
                        break;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switch Camera failed !" + e.toString());
                m115990l0(5, r94.f161790a.get(5));
                ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
                if (interfaceC21660e != null) {
                    interfaceC21660e.onFail(ErrorCode.CAMERA_SWITCH_FAILED, "Camera2 switch Camera failed !");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: C */
    public synchronized boolean mo98182C(int i, qow qowVar) {
        try {
            this.f88724H = qowVar;
            if (this.f88744m - 1 >= qowVar.m177352d()) {
                this.f88736e = qowVar.m177352d();
            }
            if (this.f88734c == null) {
                HandlerThread handlerThread = new HandlerThread("Camera2");
                this.f88752u = handlerThread;
                handlerThread.start();
                this.f88734c = new Handler(this.f88752u.getLooper());
            }
            if (this.f88735d == null) {
                this.f88735d = new Handler(Looper.getMainLooper());
            }
            this.f88751t = i;
            m115997Z(i);
            this.f88732a.f169955b = qowVar.m177365q().m112050b();
            this.f88732a.f169957c = qowVar.m177365q().m112049a();
            if (this.f88739h != null) {
                Size sizeM143931d = j94.m143931d(m115998e0(), this.f88732a, new Size(qowVar.m177365q().m112050b(), qowVar.m177365q().m112049a()));
                if (sizeM143931d == null) {
                    return false;
                }
                this.f88732a.f169955b = sizeM143931d.getWidth();
                this.f88732a.f169957c = sizeM143931d.getHeight();
            }
            sow sowVar = this.f88732a;
            int iM177364p = sowVar.f169955b;
            int iM177364p2 = sowVar.f169957c;
            this.f88749r = new crf0(iM177364p, iM177364p2);
            if (this.f88737f == null) {
                sow sowVar2 = this.f88732a;
                ImageReader imageReaderNewInstance = ImageReader.newInstance(sowVar2.f169955b, sowVar2.f169957c, 35, 3);
                this.f88737f = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(this.f88717A, this.f88734c);
            }
            if (qowVar.m177363o() == 1) {
                iM177364p = (int) (iM177364p2 * qowVar.m177364p());
                if (iM177364p != this.f88732a.f169955b) {
                    iM177364p = (iM177364p >> 4) << 4;
                }
            } else if (qowVar.m177363o() == 0 && (iM177364p2 = (int) (iM177364p / qowVar.m177364p())) != this.f88732a.f169957c) {
                iM177364p2 = (iM177364p2 >> 4) << 4;
            }
            int i2 = this.f88747p;
            crf0 crf0Var = (i2 == 1 || i2 == 3) ? new crf0(iM177364p2, iM177364p) : new crf0(iM177364p, iM177364p2);
            if (!this.f88732a.f169939M) {
                crf0 crf0VarM177353e = qowVar.m177353e();
                if (crf0VarM177353e != null && crf0VarM177353e.m112050b() > 0 && crf0VarM177353e.m112049a() > 0) {
                    this.f88732a.f169967h = crf0VarM177353e.m112050b();
                    this.f88732a.f169969i = crf0VarM177353e.m112049a();
                }
            } else if (crf0Var.m112050b() > 0 && crf0Var.m112049a() > 0) {
                this.f88732a.f169967h = crf0Var.m112050b();
                this.f88732a.f169969i = crf0Var.m112049a();
                qowVar.m177330F(crf0Var);
            }
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 prepare mrCoreParameters.encodeWidth = " + this.f88732a.f169967h + " mrCoreParameters.encodeHeight = " + this.f88732a.f169969i);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: E */
    public void mo98183E(String str) {
        if (this.f88718B.booleanValue()) {
            if (str.equals("on")) {
                this.f88743l.set(CaptureRequest.FLASH_MODE, 2);
            } else if (str.equals(BLiveOperationTitleShowType.off)) {
                this.f88743l.set(CaptureRequest.FLASH_MODE, 0);
            } else if (str.equals("auto")) {
                this.f88743l.set(CaptureRequest.CONTROL_MODE, 1);
            }
            try {
                CaptureRequest captureRequestBuild = this.f88743l.build();
                CameraCaptureSession cameraCaptureSession = this.f88740i;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.setRepeatingRequest(captureRequestBuild, null, this.f88734c);
                }
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 is flash mode error!" + e.getMessage());
                m115990l0(11, r94.f161790a.get(11));
                ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
                if (interfaceC21660e != null) {
                    interfaceC21660e.onFail(4005, "Set Camera2 is flash mode error!" + e.getMessage());
                }
            } catch (IllegalStateException e2) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 is flash mode error!" + e2.getMessage());
                m115990l0(11, r94.f161790a.get(11));
            }
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: F */
    public boolean mo98184F() {
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: Z */
    public void m115997Z(int i) {
        try {
            int iIntValue = ((Integer) this.f88739h.getCameraCharacteristics(this.f88736e + "").get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (mo98193i()) {
                this.f88748q = (360 - ((iIntValue + i) % 360)) % 360;
            } else {
                this.f88748q = ((iIntValue - i) + 360) % 360;
            }
            Rotation rotation = Rotation.NORMAL;
            int i2 = this.f88748q;
            if (i2 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i2 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i2 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f88747p = rotation.ordinal();
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config Camera Orientation failed !" + e.toString());
            m115990l0(4, r94.f161790a.get(4));
            ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4005, "Camera2 config Camera Orientation failed !");
            }
        }
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public synchronized int mo98187a() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f88740i;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f88740i = null;
            }
            CameraDevice cameraDevice = this.f88738g;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f88738g = null;
            }
            this.f88722F = false;
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 stopPreview !");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: c */
    public int mo98189c() {
        return 0;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: d */
    public int mo98190d() {
        return 0;
    }

    /* JADX INFO: renamed from: e0 */
    public CameraCharacteristics m115998e0() {
        try {
            return this.f88739h.getCameraCharacteristics(String.valueOf(this.f88736e));
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p153l.ypl
    public crf0 getTextureSize() {
        return null;
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i */
    public boolean mo98193i() {
        return this.f88726J;
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: j */
    public synchronized boolean mo98194j(SurfaceTexture surfaceTexture) {
        return mo98199o(surfaceTexture, null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m115999j0() {
        try {
            CaptureRequest.Builder builder = this.f88743l;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            CaptureRequest captureRequestBuild = this.f88743l.build();
            this.f88743l.set(key, null);
            this.f88740i.capture(captureRequestBuild, this.f88730N, this.f88734c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4005, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 lockAutoFocus !!!");
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: k */
    public void mo98195k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f88740i == null) {
            return;
        }
        this.f88743l.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        CaptureRequest.Builder builder = this.f88743l;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        boolean zM115985g0 = m115985g0();
        CaptureRequest.Builder builder2 = this.f88743l;
        if (zM115985g0) {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
        this.f88743l.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest.Builder builder3 = this.f88743l;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        builder3.set(key2, 1);
        CaptureRequest captureRequestBuild = this.f88743l.build();
        this.f88743l.set(key, null);
        this.f88743l.set(CaptureRequest.CONTROL_AF_MODE, null);
        this.f88743l.set(key2, null);
        try {
            this.f88740i.setRepeatingRequest(captureRequestBuild, this.f88730N, this.f88734c);
        } catch (Exception e) {
            Log.e("ContentValues", "setRepeatingRequest failed, " + e.getMessage());
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: m */
    public int mo98197m() {
        return this.f88747p * 90;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: n */
    public int[] mo98198n() {
        return null;
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: o */
    public boolean mo98199o(SurfaceTexture surfaceTexture, uje ujeVar) {
        if (!this.f88722F) {
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startPreview !!!");
            CameraManager cameraManager = (CameraManager) this.f88754w.getSystemService("camera");
            this.f88739h = cameraManager;
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(this.f88736e + "");
                this.f88750s = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.f88718B = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                j94.m143930c(cameraCharacteristics, this.f88732a);
                this.f88726J = m115981c0();
                Size sizeM143931d = j94.m143931d(cameraCharacteristics, this.f88732a, new Size(this.f88724H.m177365q().m112050b(), this.f88724H.m177365q().m112049a()));
                if (sizeM143931d != null) {
                    this.f88732a.f169955b = sizeM143931d.getWidth();
                    this.f88732a.f169957c = sizeM143931d.getHeight();
                }
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "sem is " + this.f88721E);
                if (!this.f88721E.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Time out waiting to lock camera opening.");
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                this.f88739h.openCamera(this.f88736e + "", this.f88756y, this.f88734c);
                this.f88722F = true;
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.toString());
                m115990l0(2, r94.f161790a.get(2));
                ypl.InterfaceC21660e interfaceC21660e = this.f88720D;
                if (interfaceC21660e != null) {
                    interfaceC21660e.onFail(4002, "Camera2 start preview failed !");
                }
            } catch (InterruptedException e2) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.toString());
            }
        }
        return true;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: p */
    public void mo98200p(ypl.InterfaceC21660e interfaceC21660e) {
        this.f88720D = interfaceC21660e;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: p0 */
    public void m116000p0(Context context) {
        this.f88754w = context;
        if (context != null) {
            this.f88739h = (CameraManager) context.getSystemService("camera");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m116001q0(InterfaceC16546h interfaceC16546h) {
        this.f88753v = interfaceC16546h;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: s */
    public boolean mo98203s(int i) {
        return false;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: t */
    public void mo98204t(String str) {
        m115989k0();
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: u */
    public boolean mo98205u(int i, qow qowVar) {
        mo98187a();
        return mo98182C(i, qowVar);
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: v */
    public boolean mo98206v() {
        return this.f88718B.booleanValue();
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: w */
    public void mo98207w(ypl.InterfaceC21656a interfaceC21656a) {
        this.f88733b = interfaceC21656a;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: x */
    public crf0 mo98208x() {
        sow sowVar = this.f88732a;
        return new crf0(sowVar.f169955b, sowVar.f169957c);
    }

    @Override // p153l.ypl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: y */
    public boolean mo98209y() {
        return m115988i0(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m115982d0() {
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: b */
    public void mo98188b(int i) {
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: e */
    public void mo98191e(Camera.ErrorCallback errorCallback) {
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: l */
    public void mo98196l(ypl.InterfaceC21661f interfaceC21661f) {
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: q */
    public void mo98201q(ypl.InterfaceC21659d interfaceC21659d) {
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: r */
    public void mo98202r(ypl.InterfaceC21658c interfaceC21658c) {
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: f */
    public void mo98192f(int i, int i2, Rect rect, boolean z) {
    }
}
