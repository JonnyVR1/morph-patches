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
import com.core.glcore.config.Rotation;
import com.core.glcore.util.Camera2Helpler;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ciw implements xpl {

    /* JADX INFO: renamed from: C */
    private Boolean f82033C;

    /* JADX INFO: renamed from: D */
    private CaptureRequest f82034D;

    /* JADX INFO: renamed from: I */
    private row f82039I;

    /* JADX INFO: renamed from: a */
    private tow f82047a;

    /* JADX INFO: renamed from: b */
    private xpl.InterfaceC21407a f82048b;

    /* JADX INFO: renamed from: c */
    private Handler f82049c;

    /* JADX INFO: renamed from: d */
    private Handler f82050d;

    /* JADX INFO: renamed from: f */
    private ImageReader f82052f;

    /* JADX INFO: renamed from: g */
    private CameraDevice f82053g;

    /* JADX INFO: renamed from: h */
    private CameraManager f82054h;

    /* JADX INFO: renamed from: i */
    private CameraCaptureSession f82055i;

    /* JADX INFO: renamed from: l */
    private CaptureRequest.Builder f82058l;

    /* JADX INFO: renamed from: m */
    private int f82059m;

    /* JADX INFO: renamed from: r */
    private erf0 f82064r;

    /* JADX INFO: renamed from: e */
    private int f82051e = 1;

    /* JADX INFO: renamed from: j */
    public final int f82056j = 1;

    /* JADX INFO: renamed from: k */
    public final int f82057k = 2;

    /* JADX INFO: renamed from: n */
    public final int f82060n = 0;

    /* JADX INFO: renamed from: o */
    public final int f82061o = 1;

    /* JADX INFO: renamed from: p */
    int f82062p = 0;

    /* JADX INFO: renamed from: q */
    private int f82063q = 0;

    /* JADX INFO: renamed from: s */
    private Rect f82065s = new Rect(0, 0, 1, 1);

    /* JADX INFO: renamed from: t */
    private int f82066t = 0;

    /* JADX INFO: renamed from: u */
    private HandlerThread f82067u = null;

    /* JADX INFO: renamed from: v */
    InterfaceC16270h f82068v = null;

    /* JADX INFO: renamed from: w */
    private Context f82069w = null;

    /* JADX INFO: renamed from: x */
    private int f82070x = 0;

    /* JADX INFO: renamed from: y */
    private final Object f82071y = new Object();

    /* JADX INFO: renamed from: z */
    CameraDevice.StateCallback f82072z = new C16263a();

    /* JADX INFO: renamed from: A */
    byte[] f82031A = null;

    /* JADX INFO: renamed from: B */
    ImageReader.OnImageAvailableListener f82032B = new C16264b();

    /* JADX INFO: renamed from: E */
    private xpl.InterfaceC21409c f82035E = null;

    /* JADX INFO: renamed from: F */
    private Semaphore f82036F = new Semaphore(1);

    /* JADX INFO: renamed from: G */
    private boolean f82037G = false;

    /* JADX INFO: renamed from: H */
    private CameraCaptureSession.StateCallback f82038H = new C16265c();

    /* JADX INFO: renamed from: J */
    private boolean f82040J = false;

    /* JADX INFO: renamed from: K */
    private boolean f82041K = true;

    /* JADX INFO: renamed from: L */
    private Integer f82042L = null;

    /* JADX INFO: renamed from: M */
    private Runnable f82043M = new RunnableC16266d();

    /* JADX INFO: renamed from: N */
    private long f82044N = 0;

    /* JADX INFO: renamed from: O */
    private CameraCaptureSession.CaptureCallback f82045O = new C16268f();

    /* JADX INFO: renamed from: P */
    private CameraCaptureSession.CaptureCallback f82046P = new C16269g();

    /* JADX INFO: renamed from: l.ciw$a */
    public class C16263a extends CameraDevice.StateCallback {
        public C16263a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            super.onClosed(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            ciw.this.f82036F.release();
            cameraDevice.close();
            ciw.this.f82053g = null;
            ciw.this.m109994U();
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is onDisconnected !!!");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            ciw.this.f82036F.release();
            cameraDevice.close();
            ciw.this.f82053g = null;
            ciw.this.m109998a0(1, s94.f166898a.get(1));
            if (ciw.this.f82035E != null) {
                ciw.this.f82035E.onFail(4004, "Camera2 open failed !");
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 open failed !");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        @RequiresApi(api = 21)
        @TargetApi(21)
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            ciw.this.f82036F.release();
            ciw.this.f82053g = cameraDevice;
            ciw.this.m109991R();
            ciw ciwVar = ciw.this;
            ciwVar.f82041K = ciwVar.m109993T();
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is opened !!!");
        }
    }

    /* JADX INFO: renamed from: l.ciw$b */
    public class C16264b implements ImageReader.OnImageAvailableListener {
        public C16264b() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        @RequiresApi(api = 19)
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            ciw ciwVar = ciw.this;
            ciwVar.f82031A = zjm.m219977a(imageAcquireNextImage, 2, ciwVar.f82031A);
            if (ciw.this.f82048b != null && !ciw.this.f82040J) {
                ciw.this.f82048b.onData(ciw.this.f82031A);
            }
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.ciw$c */
    public class C16265c extends CameraCaptureSession.StateCallback {
        public C16265c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.close();
            ciw.this.f82055i = null;
            if (ciw.this.f82035E != null) {
                ciw.this.f82035E.onFail(4005, "Camera2 config failed !");
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config failed !");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            if (ciw.this.f82053g == null) {
                return;
            }
            ciw.this.f82055i = cameraCaptureSession;
            ciw.this.m110003g0();
        }
    }

    /* JADX INFO: renamed from: l.ciw$d */
    public class RunnableC16266d implements Runnable {
        public RunnableC16266d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ciw.this.m110021Z();
        }
    }

    /* JADX INFO: renamed from: l.ciw$e */
    public class C16267e extends CameraCaptureSession.CaptureCallback {
        public C16267e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            ciw.this.m110004i0();
        }
    }

    /* JADX INFO: renamed from: l.ciw$f */
    public class C16268f extends CameraCaptureSession.CaptureCallback {
        public C16268f() {
        }

        /* JADX INFO: renamed from: a */
        private void m110025a(CaptureResult captureResult) {
            int i = ciw.this.f82070x;
            if (i == 0) {
                ciw.this.f82044N = 0L;
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null && !num.equals(ciw.this.f82042L)) {
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
                            ciw.this.f82058l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            ciw.this.m110003g0();
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_FOCUSED_LOCKED");
                            break;
                        case 5:
                            ciw.this.f82058l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            ciw.this.m110003g0();
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_NOT_FOCUSED_LOCKED");
                            break;
                        case 6:
                            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_UNFOCUSED");
                            break;
                    }
                }
                ciw.this.f82042L = num;
                return;
            }
            if (i == 1) {
                ciw.this.f82044N = 0L;
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 == null) {
                    MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null");
                    ciw.this.m109992S();
                    return;
                }
                if (4 == num2.intValue() || 5 == num2.intValue()) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() != 2) {
                        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null stick taken");
                        ciw.this.m110000c0();
                        return;
                    } else {
                        ciw.this.f82070x = 4;
                        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.still taken");
                        ciw.this.m109992S();
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
                if (num4 == null || num4.intValue() != 5 || System.currentTimeMillis() - ciw.this.f82044N > 200) {
                    ciw.this.f82070x = 4;
                    ciw.this.m109992S();
                    return;
                }
                return;
            }
            ciw.this.f82044N = 0L;
            Integer num5 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num5 == null || num5.intValue() == 5 || num5.intValue() == 4) {
                ciw.this.f82070x = 3;
                ciw.this.f82044N = System.currentTimeMillis();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m110025a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m110025a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.ciw$g */
    public class C16269g extends CameraCaptureSession.CaptureCallback {
        public C16269g() {
        }

        /* JADX INFO: renamed from: a */
        private void m110026a(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                return;
            }
            if (4 == num.intValue() || 5 == num.intValue()) {
                ciw.this.f82058l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "camera focused ");
                ciw.this.m110003g0();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(api = 21)
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m110026a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m110026a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.ciw$h */
    public interface InterfaceC16270h {
        /* JADX INFO: renamed from: a */
        void mo110027a(int i, String str);
    }

    public ciw(tow towVar) {
        this.f82059m = 0;
        this.f82047a = towVar;
        this.f82059m = Camera2Helpler.getCameraCnt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: R */
    public void m109991R() {
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f82053g.createCaptureRequest(3);
            this.f82058l = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(this.f82052f.getSurface());
            this.f82053g.createCaptureSession(Arrays.asList(this.f82052f.getSurface()), this.f82038H, this.f82049c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.getMessage());
            m109998a0(3, s94.f166898a.get(3));
            xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4002, "Camera2 start preview failed !" + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.getMessage());
            m109998a0(3, s94.f166898a.get(3));
            xpl.InterfaceC21409c interfaceC21409c2 = this.f82035E;
            if (interfaceC21409c2 != null) {
                interfaceC21409c2.onFail(4002, "Camera2 start preview failed !" + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m109992S() {
        try {
            CameraDevice cameraDevice = this.f82053g;
            if (cameraDevice == null) {
                return;
            }
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f82052f.getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
            m110001d0(builderCreateCaptureRequest);
            C16267e c16267e = new C16267e();
            this.f82055i.stopRepeating();
            this.f82055i.abortCaptures();
            this.f82055i.capture(builderCreateCaptureRequest.build(), c16267e, null);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 take photo error!" + e.getMessage());
            xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, "Camera2 take photo error!" + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: T */
    public boolean m109993T() {
        CameraManager cameraManager = this.f82054h;
        if (cameraManager != null) {
            try {
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f82054h.getCameraCharacteristics(str);
                    if (this.f82051e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        return true;
                    }
                    if (this.f82051e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        return false;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get Camera2 is front failed !" + e.toString());
                m109998a0(6, s94.f166898a.get(6));
                xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
                if (interfaceC21409c != null) {
                    interfaceC21409c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get Camera2 is front failed !");
                }
            }
        }
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: W */
    private float m109995W() {
        Float f;
        try {
            f = (Float) this.f82054h.getCameraCharacteristics(this.f82051e + "").get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "isHardwareLevelSupported Error" + e.toString());
            f = null;
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: X */
    private boolean m109996X() {
        return m109997Y(2) || m109995W() > 0.0f;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: Y */
    private boolean m109997Y(int i) {
        try {
            int iIntValue = ((Integer) this.f82054h.getCameraCharacteristics(this.f82051e + "").get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m109998a0(int i, String str) {
        InterfaceC16270h interfaceC16270h = this.f82068v;
        if (interfaceC16270h != null) {
            interfaceC16270h.mo110027a(i, str);
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b0 */
    private void m109999b0() {
        mo104561a();
        mo104569j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m110000c0() {
        try {
            this.f82058l.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f82070x = 2;
            this.f82055i.capture(this.f82058l.build(), this.f82045O, this.f82049c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 runPrecaptureSequence failed !!!" + e.toString());
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m110001d0(CaptureRequest.Builder builder) {
        this.f82033C.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public synchronized void m110003g0() {
        try {
            CaptureRequest.Builder builder = this.f82058l;
            if (builder != null && this.f82055i != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                this.f82058l.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f82047a.f175464U), Integer.valueOf(this.f82047a.f175463T)));
                CaptureRequest captureRequestBuild = this.f82058l.build();
                this.f82034D = captureRequestBuild;
                this.f82055i.setRepeatingRequest(captureRequestBuild, this.f82045O, this.f82049c);
                this.f82040J = false;
            }
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startNormalPreview failed !" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m110004i0() {
        try {
            this.f82058l.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m110001d0(this.f82058l);
            this.f82055i.capture(this.f82058l.build(), this.f82045O, this.f82049c);
            this.f82070x = 0;
            this.f82055i.setRepeatingRequest(this.f82034D, this.f82045O, this.f82049c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4005, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: E */
    public synchronized boolean mo104552E(int i, row rowVar) {
        try {
            try {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switchCamera !!!");
                for (String str : this.f82054h.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f82054h.getCameraCharacteristics(str);
                    if (this.f82051e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        this.f82040J = true;
                        this.f82051e = 0;
                        m109999b0();
                        break;
                    }
                    if (this.f82051e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        this.f82040J = true;
                        this.f82051e = 1;
                        m109999b0();
                        break;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switch Camera failed !" + e.toString());
                m109998a0(5, s94.f166898a.get(5));
                xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
                if (interfaceC21409c != null) {
                    interfaceC21409c.onFail(ErrorCode.CAMERA_SWITCH_FAILED, "Camera2 switch Camera failed !");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: F */
    public boolean mo104553F(int i, row rowVar) {
        mo104561a();
        return mo104554G(i, rowVar);
    }

    @Override // p153l.xpl
    @RequiresApi(api = 19)
    @TargetApi(21)
    /* JADX INFO: renamed from: G */
    public synchronized boolean mo104554G(int i, row rowVar) {
        try {
            this.f82039I = rowVar;
            if (this.f82059m - 1 >= rowVar.m182463a()) {
                this.f82051e = rowVar.m182463a();
            }
            if (this.f82049c == null) {
                HandlerThread handlerThread = new HandlerThread("Camera2");
                this.f82067u = handlerThread;
                handlerThread.start();
                this.f82049c = new Handler(this.f82067u.getLooper());
            }
            if (this.f82050d == null) {
                this.f82050d = new Handler(Looper.getMainLooper());
            }
            this.f82066t = i;
            m110019Q(i);
            this.f82047a.f175478e = rowVar.m182468f().m122180b();
            this.f82047a.f175480f = rowVar.m182468f().m122179a();
            if (this.f82054h != null) {
                Size sizeSelectCameraPreviewWH = Camera2Helpler.selectCameraPreviewWH(m110020V(), this.f82047a, new Size(rowVar.m182468f().m122180b(), rowVar.m182468f().m122179a()));
                if (sizeSelectCameraPreviewWH == null) {
                    return false;
                }
                this.f82047a.f175478e = sizeSelectCameraPreviewWH.getWidth();
                this.f82047a.f175480f = sizeSelectCameraPreviewWH.getHeight();
            }
            tow towVar = this.f82047a;
            int iM182467e = towVar.f175478e;
            int iM182467e2 = towVar.f175480f;
            this.f82064r = new erf0(iM182467e, iM182467e2);
            if (this.f82052f == null) {
                tow towVar2 = this.f82047a;
                ImageReader imageReaderNewInstance = ImageReader.newInstance(towVar2.f175478e, towVar2.f175480f, 35, 3);
                this.f82052f = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(this.f82032B, this.f82049c);
            }
            if (rowVar.m182466d() == 1) {
                iM182467e = (int) (iM182467e2 * rowVar.m182467e());
                if (iM182467e != this.f82047a.f175478e) {
                    iM182467e = (iM182467e >> 4) << 4;
                }
            } else if (rowVar.m182466d() == 0 && (iM182467e2 = (int) (iM182467e / rowVar.m182467e())) != this.f82047a.f175480f) {
                iM182467e2 = (iM182467e2 >> 4) << 4;
            }
            int i2 = this.f82062p;
            erf0 erf0Var = (i2 == 1 || i2 == 3) ? new erf0(iM182467e2, iM182467e) : new erf0(iM182467e, iM182467e2);
            if (!this.f82047a.f175469Z) {
                erf0 erf0VarM182464b = rowVar.m182464b();
                if (erf0VarM182464b != null && erf0VarM182464b.m122180b() > 0 && erf0VarM182464b.m122179a() > 0) {
                    this.f82047a.f175494m = erf0VarM182464b.m122180b();
                    this.f82047a.f175496n = erf0VarM182464b.m122179a();
                }
            } else if (erf0Var.m122180b() > 0 && erf0Var.m122179a() > 0) {
                this.f82047a.f175494m = erf0Var.m122180b();
                this.f82047a.f175496n = erf0Var.m122179a();
                rowVar.m182479r(erf0Var);
            }
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 prepare mrCoreParameters.encodeWidth = " + this.f82047a.f175494m + " mrCoreParameters.encodeHeight = " + this.f82047a.f175496n);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: H */
    public synchronized void mo104555H() {
        mo104569j(null);
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: J */
    public void mo104557J(xpl.InterfaceC21409c interfaceC21409c) {
        this.f82035E = interfaceC21409c;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: K */
    public void mo104558K(xpl.InterfaceC21407a interfaceC21407a) {
        this.f82048b = interfaceC21407a;
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: L */
    public synchronized void mo104559L() {
        mo104561a();
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: Q */
    public void m110019Q(int i) {
        try {
            int iIntValue = ((Integer) this.f82054h.getCameraCharacteristics(this.f82051e + "").get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (mo104568i()) {
                this.f82063q = (360 - ((iIntValue + i) % 360)) % 360;
            } else {
                this.f82063q = ((iIntValue - i) + 360) % 360;
            }
            Rotation rotation = Rotation.NORMAL;
            int i2 = this.f82063q;
            if (i2 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i2 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i2 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f82062p = rotation.ordinal();
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config Camera Orientation failed !" + e.toString());
            m109998a0(4, s94.f166898a.get(4));
            xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4005, "Camera2 config Camera Orientation failed !");
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public CameraCharacteristics m110020V() {
        try {
            return this.f82054h.getCameraCharacteristics(String.valueOf(this.f82051e));
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m110021Z() {
        try {
            CaptureRequest.Builder builder = this.f82058l;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            CaptureRequest captureRequestBuild = this.f82058l.build();
            this.f82058l.set(key, null);
            this.f82055i.capture(captureRequestBuild, this.f82045O, this.f82049c);
        } catch (CameraAccessException e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4005, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 lockAutoFocus !!!");
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public synchronized int mo104561a() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f82055i;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f82055i = null;
            }
            CameraDevice cameraDevice = this.f82053g;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f82053g = null;
            }
            this.f82037G = false;
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 stopPreview !");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: c */
    public int mo104563c() {
        return 0;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: d */
    public int mo104564d() {
        return 0;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: e0 */
    public void m110022e0(Context context) {
        this.f82069w = context;
        if (context != null) {
            this.f82054h = (CameraManager) context.getSystemService("camera");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m110023f0(InterfaceC16270h interfaceC16270h) {
        this.f82068v = interfaceC16270h;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: g */
    public int mo104566g() {
        Range range;
        CameraCharacteristics cameraCharacteristicsM110020V = m110020V();
        if (cameraCharacteristicsM110020V == null || (range = (Range) cameraCharacteristicsM110020V.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null) {
            return 0;
        }
        return ((Integer) range.getLower()).intValue();
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: h */
    public int mo104567h() {
        Range range;
        CameraCharacteristics cameraCharacteristicsM110020V = m110020V();
        if (cameraCharacteristicsM110020V == null || (range = (Range) cameraCharacteristicsM110020V.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null) {
            return 0;
        }
        return ((Integer) range.getUpper()).intValue();
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: h0 */
    public boolean m110024h0(SurfaceTexture surfaceTexture, wje wjeVar) {
        if (!this.f82037G) {
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startPreview !!!");
            CameraManager cameraManager = (CameraManager) this.f82069w.getSystemService("camera");
            this.f82054h = cameraManager;
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(this.f82051e + "");
                this.f82065s = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.f82033C = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Camera2Helpler.selectCameraFpsRange(cameraCharacteristics, this.f82047a);
                this.f82041K = m109993T();
                Size sizeSelectCameraPreviewWH = Camera2Helpler.selectCameraPreviewWH(cameraCharacteristics, this.f82047a, new Size(this.f82039I.m182468f().m122180b(), this.f82039I.m182468f().m122179a()));
                if (sizeSelectCameraPreviewWH != null) {
                    this.f82047a.f175478e = sizeSelectCameraPreviewWH.getWidth();
                    this.f82047a.f175480f = sizeSelectCameraPreviewWH.getHeight();
                }
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "sem is " + this.f82036F);
                if (!this.f82036F.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Time out waiting to lock camera opening.");
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                this.f82054h.openCamera(this.f82051e + "", this.f82072z, this.f82049c);
                this.f82037G = true;
            } catch (CameraAccessException e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.toString());
                m109998a0(2, s94.f166898a.get(2));
                xpl.InterfaceC21409c interfaceC21409c = this.f82035E;
                if (interfaceC21409c != null) {
                    interfaceC21409c.onFail(4002, "Camera2 start preview failed !");
                }
            } catch (InterruptedException e2) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.toString());
            } catch (RuntimeException unused) {
                xpl.InterfaceC21409c interfaceC21409c2 = this.f82035E;
                if (interfaceC21409c2 != null) {
                    interfaceC21409c2.onFail(4002, "Camera2 start preview failed !");
                }
            }
        }
        return true;
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i */
    public boolean mo104568i() {
        return this.f82041K;
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: j */
    public synchronized boolean mo104569j(SurfaceTexture surfaceTexture) {
        return m110024h0(surfaceTexture, null);
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: k */
    public void mo104570k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f82055i == null) {
            return;
        }
        this.f82058l.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        CaptureRequest.Builder builder = this.f82058l;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        boolean zM109996X = m109996X();
        CaptureRequest.Builder builder2 = this.f82058l;
        if (zM109996X) {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
        this.f82058l.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest.Builder builder3 = this.f82058l;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        builder3.set(key2, 1);
        CaptureRequest captureRequestBuild = this.f82058l.build();
        this.f82058l.set(key, null);
        this.f82058l.set(CaptureRequest.CONTROL_AF_MODE, null);
        this.f82058l.set(key2, null);
        try {
            this.f82055i.setRepeatingRequest(captureRequestBuild, this.f82045O, this.f82049c);
        } catch (Exception e) {
            Log.e("ContentValues", "setRepeatingRequest failed, " + e.getMessage());
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: m */
    public int mo104571m() {
        return this.f82062p * 90;
    }

    @Override // p153l.xpl
    @RequiresApi(api = 21)
    @TargetApi(21)
    public synchronized void release() {
        try {
            ImageReader imageReader = this.f82052f;
            if (imageReader != null) {
                imageReader.close();
                this.f82052f = null;
            }
            CameraCaptureSession cameraCaptureSession = this.f82055i;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f82055i = null;
            }
            CameraDevice cameraDevice = this.f82053g;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            this.f82058l = null;
            this.f82054h = null;
            HandlerThread handlerThread = this.f82067u;
            if (handlerThread != null) {
                this.f82049c = null;
                this.f82050d = null;
                handlerThread.quitSafely();
            }
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 release !!!");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.xpl
    public void setExposureCompensation(int i) {
        try {
            CaptureRequest.Builder builder = this.f82058l;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
                this.f82055i.capture(this.f82058l.build(), null, this.f82049c);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m109994U() {
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: I */
    public void mo104556I(xpl.InterfaceC21410d interfaceC21410d) {
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: b */
    public void mo104562b(int i) {
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: e */
    public void mo104565e(Camera.ErrorCallback errorCallback) {
    }
}
