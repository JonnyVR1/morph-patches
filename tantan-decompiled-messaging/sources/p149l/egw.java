package p149l;

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
public class egw implements mnl {

    /* JADX INFO: renamed from: C */
    private Boolean f91217C;

    /* JADX INFO: renamed from: D */
    private CaptureRequest f91218D;

    /* JADX INFO: renamed from: I */
    private slw f91223I;

    /* JADX INFO: renamed from: a */
    private ulw f91231a;

    /* JADX INFO: renamed from: b */
    private mnl.InterfaceC18510a f91232b;

    /* JADX INFO: renamed from: c */
    private Handler f91233c;

    /* JADX INFO: renamed from: d */
    private Handler f91234d;

    /* JADX INFO: renamed from: f */
    private ImageReader f91236f;

    /* JADX INFO: renamed from: g */
    private CameraDevice f91237g;

    /* JADX INFO: renamed from: h */
    private CameraManager f91238h;

    /* JADX INFO: renamed from: i */
    private CameraCaptureSession f91239i;

    /* JADX INFO: renamed from: l */
    private CaptureRequest.Builder f91242l;

    /* JADX INFO: renamed from: m */
    private int f91243m;

    /* JADX INFO: renamed from: r */
    private vif0 f91248r;

    /* JADX INFO: renamed from: e */
    private int f91235e = 1;

    /* JADX INFO: renamed from: j */
    public final int f91240j = 1;

    /* JADX INFO: renamed from: k */
    public final int f91241k = 2;

    /* JADX INFO: renamed from: n */
    public final int f91244n = 0;

    /* JADX INFO: renamed from: o */
    public final int f91245o = 1;

    /* JADX INFO: renamed from: p */
    int f91246p = 0;

    /* JADX INFO: renamed from: q */
    private int f91247q = 0;

    /* JADX INFO: renamed from: s */
    private Rect f91249s = new Rect(0, 0, 1, 1);

    /* JADX INFO: renamed from: t */
    private int f91250t = 0;

    /* JADX INFO: renamed from: u */
    private HandlerThread f91251u = null;

    /* JADX INFO: renamed from: v */
    InterfaceC16606h f91252v = null;

    /* JADX INFO: renamed from: w */
    private Context f91253w = null;

    /* JADX INFO: renamed from: x */
    private int f91254x = 0;

    /* JADX INFO: renamed from: y */
    private final Object f91255y = new Object();

    /* JADX INFO: renamed from: z */
    CameraDevice.StateCallback f91256z = new C16599a();

    /* JADX INFO: renamed from: A */
    byte[] f91215A = null;

    /* JADX INFO: renamed from: B */
    ImageReader.OnImageAvailableListener f91216B = new C16600b();

    /* JADX INFO: renamed from: E */
    private mnl.InterfaceC18512c f91219E = null;

    /* JADX INFO: renamed from: F */
    private Semaphore f91220F = new Semaphore(1);

    /* JADX INFO: renamed from: G */
    private boolean f91221G = false;

    /* JADX INFO: renamed from: H */
    private CameraCaptureSession.StateCallback f91222H = new C16601c();

    /* JADX INFO: renamed from: J */
    private boolean f91224J = false;

    /* JADX INFO: renamed from: K */
    private boolean f91225K = true;

    /* JADX INFO: renamed from: L */
    private Integer f91226L = null;

    /* JADX INFO: renamed from: M */
    private Runnable f91227M = new RunnableC16602d();

    /* JADX INFO: renamed from: N */
    private long f91228N = 0;

    /* JADX INFO: renamed from: O */
    private CameraCaptureSession.CaptureCallback f91229O = new C16604f();

    /* JADX INFO: renamed from: P */
    private CameraCaptureSession.CaptureCallback f91230P = new C16605g();

    /* JADX INFO: renamed from: l.egw$a */
    public class C16599a extends CameraDevice.StateCallback {
        public C16599a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            super.onClosed(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            egw.this.f91220F.release();
            cameraDevice.close();
            egw.this.f91237g = null;
            egw.this.m116379U();
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is onDisconnected !!!");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            egw.this.f91220F.release();
            cameraDevice.close();
            egw.this.f91237g = null;
            egw.this.m116383a0(1, t84.f168800a.get(1));
            if (egw.this.f91219E != null) {
                egw.this.f91219E.onFail(4004, "Camera2 open failed !");
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 open failed !");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        @RequiresApi(api = 21)
        @TargetApi(21)
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            egw.this.f91220F.release();
            egw.this.f91237g = cameraDevice;
            egw.this.m116376R();
            egw egwVar = egw.this;
            egwVar.f91225K = egwVar.m116378T();
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is opened !!!");
        }
    }

    /* JADX INFO: renamed from: l.egw$b */
    public class C16600b implements ImageReader.OnImageAvailableListener {
        public C16600b() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        @RequiresApi(api = 19)
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            egw egwVar = egw.this;
            egwVar.f91215A = whm.m203222a(imageAcquireNextImage, 2, egwVar.f91215A);
            if (egw.this.f91232b != null && !egw.this.f91224J) {
                egw.this.f91232b.onData(egw.this.f91215A);
            }
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.egw$c */
    public class C16601c extends CameraCaptureSession.StateCallback {
        public C16601c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.close();
            egw.this.f91239i = null;
            if (egw.this.f91219E != null) {
                egw.this.f91219E.onFail(4005, "Camera2 config failed !");
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config failed !");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            if (egw.this.f91237g == null) {
                return;
            }
            egw.this.f91239i = cameraCaptureSession;
            egw.this.m116388g0();
        }
    }

    /* JADX INFO: renamed from: l.egw$d */
    public class RunnableC16602d implements Runnable {
        public RunnableC16602d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            egw.this.m116406Z();
        }
    }

    /* JADX INFO: renamed from: l.egw$e */
    public class C16603e extends CameraCaptureSession.CaptureCallback {
        public C16603e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            egw.this.m116389i0();
        }
    }

    /* JADX INFO: renamed from: l.egw$f */
    public class C16604f extends CameraCaptureSession.CaptureCallback {
        public C16604f() {
        }

        /* JADX INFO: renamed from: a */
        private void m116410a(CaptureResult captureResult) {
            int i = egw.this.f91254x;
            if (i == 0) {
                egw.this.f91228N = 0L;
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null && !num.equals(egw.this.f91226L)) {
                    switch (num.intValue()) {
                        case 0:
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_INACTIVE");
                            break;
                        case 1:
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_SCAN");
                            break;
                        case 2:
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_FOCUSED");
                            break;
                        case 3:
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_ACTIVE_SCAN");
                            break;
                        case 4:
                            egw.this.f91242l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            egw.this.m116388g0();
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_FOCUSED_LOCKED");
                            break;
                        case 5:
                            egw.this.f91242l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            egw.this.m116388g0();
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_NOT_FOCUSED_LOCKED");
                            break;
                        case 6:
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_UNFOCUSED");
                            break;
                    }
                }
                egw.this.f91226L = num;
                return;
            }
            if (i == 1) {
                egw.this.f91228N = 0L;
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 == null) {
                    MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null");
                    egw.this.m116377S();
                    return;
                }
                if (4 == num2.intValue() || 5 == num2.intValue()) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() != 2) {
                        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null stick taken");
                        egw.this.m116385c0();
                        return;
                    } else {
                        egw.this.f91254x = 4;
                        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.still taken");
                        egw.this.m116377S();
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
                if (num4 == null || num4.intValue() != 5 || System.currentTimeMillis() - egw.this.f91228N > 200) {
                    egw.this.f91254x = 4;
                    egw.this.m116377S();
                    return;
                }
                return;
            }
            egw.this.f91228N = 0L;
            Integer num5 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num5 == null || num5.intValue() == 5 || num5.intValue() == 4) {
                egw.this.f91254x = 3;
                egw.this.f91228N = System.currentTimeMillis();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m116410a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m116410a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.egw$g */
    public class C16605g extends CameraCaptureSession.CaptureCallback {
        public C16605g() {
        }

        /* JADX INFO: renamed from: a */
        private void m116411a(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                return;
            }
            if (4 == num.intValue() || 5 == num.intValue()) {
                egw.this.f91242l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "camera focused ");
                egw.this.m116388g0();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(api = 21)
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m116411a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m116411a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.egw$h */
    public interface InterfaceC16606h {
        /* JADX INFO: renamed from: a */
        void mo116412a(int i, String str);
    }

    public egw(ulw ulwVar) {
        this.f91243m = 0;
        this.f91231a = ulwVar;
        this.f91243m = Camera2Helpler.getCameraCnt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: R */
    public void m116376R() {
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f91237g.createCaptureRequest(3);
            this.f91242l = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(this.f91236f.getSurface());
            this.f91237g.createCaptureSession(Arrays.asList(this.f91236f.getSurface()), this.f91222H, this.f91233c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.getMessage());
            m116383a0(3, t84.f168800a.get(3));
            mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4002, "Camera2 start preview failed !" + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.getMessage());
            m116383a0(3, t84.f168800a.get(3));
            mnl.InterfaceC18512c interfaceC18512c2 = this.f91219E;
            if (interfaceC18512c2 != null) {
                interfaceC18512c2.onFail(4002, "Camera2 start preview failed !" + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m116377S() {
        try {
            CameraDevice cameraDevice = this.f91237g;
            if (cameraDevice == null) {
                return;
            }
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f91236f.getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
            m116386d0(builderCreateCaptureRequest);
            C16603e c16603e = new C16603e();
            this.f91239i.stopRepeating();
            this.f91239i.abortCaptures();
            this.f91239i.capture(builderCreateCaptureRequest.build(), c16603e, null);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 take photo error!" + e.getMessage());
            mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, "Camera2 take photo error!" + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: T */
    public boolean m116378T() {
        CameraManager cameraManager = this.f91238h;
        if (cameraManager != null) {
            try {
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f91238h.getCameraCharacteristics(str);
                    if (this.f91235e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        return true;
                    }
                    if (this.f91235e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        return false;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get Camera2 is front failed !" + e.toString());
                m116383a0(6, t84.f168800a.get(6));
                mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
                if (interfaceC18512c != null) {
                    interfaceC18512c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get Camera2 is front failed !");
                }
            }
        }
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: W */
    private float m116380W() {
        Float f;
        try {
            f = (Float) this.f91238h.getCameraCharacteristics(this.f91235e + "").get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "isHardwareLevelSupported Error" + e.toString());
            f = null;
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: X */
    private boolean m116381X() {
        return m116382Y(2) || m116380W() > 0.0f;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: Y */
    private boolean m116382Y(int i) {
        try {
            int iIntValue = ((Integer) this.f91238h.getCameraCharacteristics(this.f91235e + "").get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
            if (iIntValue == 0) {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
            } else if (iIntValue == 1) {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_FULL");
            } else if (iIntValue == 2) {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY");
            } else if (iIntValue != 3) {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Unknown INFO_SUPPORTED_HARDWARE_LEVEL: " + iIntValue);
            } else {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera support level: INFO_SUPPORTED_HARDWARE_LEVEL_3");
            }
            if (iIntValue == 2) {
                return i == iIntValue;
            }
            return i <= iIntValue;
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "isHardwareLevelSupported Error" + e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m116383a0(int i, String str) {
        InterfaceC16606h interfaceC16606h = this.f91252v;
        if (interfaceC16606h != null) {
            interfaceC16606h.mo116412a(i, str);
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b0 */
    private void m116384b0() {
        mo111764a();
        mo111772j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m116385c0() {
        try {
            this.f91242l.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f91254x = 2;
            this.f91239i.capture(this.f91242l.build(), this.f91229O, this.f91233c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 runPrecaptureSequence failed !!!" + e.toString());
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m116386d0(CaptureRequest.Builder builder) {
        this.f91217C.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public synchronized void m116388g0() {
        try {
            CaptureRequest.Builder builder = this.f91242l;
            if (builder != null && this.f91239i != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                this.f91242l.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f91231a.f177122U), Integer.valueOf(this.f91231a.f177121T)));
                CaptureRequest captureRequestBuild = this.f91242l.build();
                this.f91218D = captureRequestBuild;
                this.f91239i.setRepeatingRequest(captureRequestBuild, this.f91229O, this.f91233c);
                this.f91224J = false;
            }
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startNormalPreview failed !" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m116389i0() {
        try {
            this.f91242l.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m116386d0(this.f91242l);
            this.f91239i.capture(this.f91242l.build(), this.f91229O, this.f91233c);
            this.f91254x = 0;
            this.f91239i.setRepeatingRequest(this.f91218D, this.f91229O, this.f91233c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4005, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: E */
    public synchronized boolean mo111755E(int i, slw slwVar) {
        try {
            try {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switchCamera !!!");
                for (String str : this.f91238h.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f91238h.getCameraCharacteristics(str);
                    if (this.f91235e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        this.f91224J = true;
                        this.f91235e = 0;
                        m116384b0();
                        break;
                    }
                    if (this.f91235e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        this.f91224J = true;
                        this.f91235e = 1;
                        m116384b0();
                        break;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switch Camera failed !" + e.toString());
                m116383a0(5, t84.f168800a.get(5));
                mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
                if (interfaceC18512c != null) {
                    interfaceC18512c.onFail(ErrorCode.CAMERA_SWITCH_FAILED, "Camera2 switch Camera failed !");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: F */
    public boolean mo111756F(int i, slw slwVar) {
        mo111764a();
        return mo111757G(i, slwVar);
    }

    @Override // p149l.mnl
    @RequiresApi(api = 19)
    @TargetApi(21)
    /* JADX INFO: renamed from: G */
    public synchronized boolean mo111757G(int i, slw slwVar) {
        try {
            this.f91223I = slwVar;
            if (this.f91243m - 1 >= slwVar.m184872a()) {
                this.f91235e = slwVar.m184872a();
            }
            if (this.f91233c == null) {
                HandlerThread handlerThread = new HandlerThread("Camera2");
                this.f91251u = handlerThread;
                handlerThread.start();
                this.f91233c = new Handler(this.f91251u.getLooper());
            }
            if (this.f91234d == null) {
                this.f91234d = new Handler(Looper.getMainLooper());
            }
            this.f91250t = i;
            m116404Q(i);
            this.f91231a.f177136e = slwVar.m184877f().m198562b();
            this.f91231a.f177138f = slwVar.m184877f().m198561a();
            if (this.f91238h != null) {
                Size sizeSelectCameraPreviewWH = Camera2Helpler.selectCameraPreviewWH(m116405V(), this.f91231a, new Size(slwVar.m184877f().m198562b(), slwVar.m184877f().m198561a()));
                if (sizeSelectCameraPreviewWH == null) {
                    return false;
                }
                this.f91231a.f177136e = sizeSelectCameraPreviewWH.getWidth();
                this.f91231a.f177138f = sizeSelectCameraPreviewWH.getHeight();
            }
            ulw ulwVar = this.f91231a;
            int iM184876e = ulwVar.f177136e;
            int iM184876e2 = ulwVar.f177138f;
            this.f91248r = new vif0(iM184876e, iM184876e2);
            if (this.f91236f == null) {
                ulw ulwVar2 = this.f91231a;
                ImageReader imageReaderNewInstance = ImageReader.newInstance(ulwVar2.f177136e, ulwVar2.f177138f, 35, 3);
                this.f91236f = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(this.f91216B, this.f91233c);
            }
            if (slwVar.m184875d() == 1) {
                iM184876e = (int) (iM184876e2 * slwVar.m184876e());
                if (iM184876e != this.f91231a.f177136e) {
                    iM184876e = (iM184876e >> 4) << 4;
                }
            } else if (slwVar.m184875d() == 0 && (iM184876e2 = (int) (iM184876e / slwVar.m184876e())) != this.f91231a.f177138f) {
                iM184876e2 = (iM184876e2 >> 4) << 4;
            }
            int i2 = this.f91246p;
            vif0 vif0Var = (i2 == 1 || i2 == 3) ? new vif0(iM184876e2, iM184876e) : new vif0(iM184876e, iM184876e2);
            if (!this.f91231a.f177127Z) {
                vif0 vif0VarM184873b = slwVar.m184873b();
                if (vif0VarM184873b != null && vif0VarM184873b.m198562b() > 0 && vif0VarM184873b.m198561a() > 0) {
                    this.f91231a.f177152m = vif0VarM184873b.m198562b();
                    this.f91231a.f177154n = vif0VarM184873b.m198561a();
                }
            } else if (vif0Var.m198562b() > 0 && vif0Var.m198561a() > 0) {
                this.f91231a.f177152m = vif0Var.m198562b();
                this.f91231a.f177154n = vif0Var.m198561a();
                slwVar.m184888r(vif0Var);
            }
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 prepare mrCoreParameters.encodeWidth = " + this.f91231a.f177152m + " mrCoreParameters.encodeHeight = " + this.f91231a.f177154n);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: H */
    public synchronized void mo111758H() {
        mo111772j(null);
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: J */
    public void mo111760J(mnl.InterfaceC18512c interfaceC18512c) {
        this.f91219E = interfaceC18512c;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: K */
    public void mo111761K(mnl.InterfaceC18510a interfaceC18510a) {
        this.f91232b = interfaceC18510a;
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: L */
    public synchronized void mo111762L() {
        mo111764a();
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: Q */
    public void m116404Q(int i) {
        try {
            int iIntValue = ((Integer) this.f91238h.getCameraCharacteristics(this.f91235e + "").get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (mo111771i()) {
                this.f91247q = (360 - ((iIntValue + i) % 360)) % 360;
            } else {
                this.f91247q = ((iIntValue - i) + 360) % 360;
            }
            Rotation rotation = Rotation.NORMAL;
            int i2 = this.f91247q;
            if (i2 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i2 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i2 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f91246p = rotation.ordinal();
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config Camera Orientation failed !" + e.toString());
            m116383a0(4, t84.f168800a.get(4));
            mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4005, "Camera2 config Camera Orientation failed !");
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public CameraCharacteristics m116405V() {
        try {
            return this.f91238h.getCameraCharacteristics(String.valueOf(this.f91235e));
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m116406Z() {
        try {
            CaptureRequest.Builder builder = this.f91242l;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            CaptureRequest captureRequestBuild = this.f91242l.build();
            this.f91242l.set(key, null);
            this.f91239i.capture(captureRequestBuild, this.f91229O, this.f91233c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4005, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 lockAutoFocus !!!");
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public synchronized int mo111764a() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f91239i;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f91239i = null;
            }
            CameraDevice cameraDevice = this.f91237g;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f91237g = null;
            }
            this.f91221G = false;
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 stopPreview !");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: c */
    public int mo111766c() {
        return 0;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: d */
    public int mo111767d() {
        return 0;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: e0 */
    public void m116407e0(Context context) {
        this.f91253w = context;
        if (context != null) {
            this.f91238h = (CameraManager) context.getSystemService("camera");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m116408f0(InterfaceC16606h interfaceC16606h) {
        this.f91252v = interfaceC16606h;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: g */
    public int mo111769g() {
        Range range;
        CameraCharacteristics cameraCharacteristicsM116405V = m116405V();
        if (cameraCharacteristicsM116405V == null || (range = (Range) cameraCharacteristicsM116405V.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null) {
            return 0;
        }
        return ((Integer) range.getLower()).intValue();
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: h */
    public int mo111770h() {
        Range range;
        CameraCharacteristics cameraCharacteristicsM116405V = m116405V();
        if (cameraCharacteristicsM116405V == null || (range = (Range) cameraCharacteristicsM116405V.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)) == null) {
            return 0;
        }
        return ((Integer) range.getUpper()).intValue();
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: h0 */
    public boolean m116409h0(SurfaceTexture surfaceTexture, sie sieVar) {
        if (!this.f91221G) {
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startPreview !!!");
            CameraManager cameraManager = (CameraManager) this.f91253w.getSystemService("camera");
            this.f91238h = cameraManager;
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(this.f91235e + "");
                this.f91249s = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.f91217C = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Camera2Helpler.selectCameraFpsRange(cameraCharacteristics, this.f91231a);
                this.f91225K = m116378T();
                Size sizeSelectCameraPreviewWH = Camera2Helpler.selectCameraPreviewWH(cameraCharacteristics, this.f91231a, new Size(this.f91223I.m184877f().m198562b(), this.f91223I.m184877f().m198561a()));
                if (sizeSelectCameraPreviewWH != null) {
                    this.f91231a.f177136e = sizeSelectCameraPreviewWH.getWidth();
                    this.f91231a.f177138f = sizeSelectCameraPreviewWH.getHeight();
                }
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "sem is " + this.f91220F);
                if (!this.f91220F.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Time out waiting to lock camera opening.");
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                this.f91238h.openCamera(this.f91235e + "", this.f91256z, this.f91233c);
                this.f91221G = true;
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.toString());
                m116383a0(2, t84.f168800a.get(2));
                mnl.InterfaceC18512c interfaceC18512c = this.f91219E;
                if (interfaceC18512c != null) {
                    interfaceC18512c.onFail(4002, "Camera2 start preview failed !");
                }
            } catch (InterruptedException e2) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.toString());
            } catch (RuntimeException unused) {
                mnl.InterfaceC18512c interfaceC18512c2 = this.f91219E;
                if (interfaceC18512c2 != null) {
                    interfaceC18512c2.onFail(4002, "Camera2 start preview failed !");
                }
            }
        }
        return true;
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i */
    public boolean mo111771i() {
        return this.f91225K;
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: j */
    public synchronized boolean mo111772j(SurfaceTexture surfaceTexture) {
        return m116409h0(surfaceTexture, null);
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: k */
    public void mo111773k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f91239i == null) {
            return;
        }
        this.f91242l.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        CaptureRequest.Builder builder = this.f91242l;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        boolean zM116381X = m116381X();
        CaptureRequest.Builder builder2 = this.f91242l;
        if (zM116381X) {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
        this.f91242l.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest.Builder builder3 = this.f91242l;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        builder3.set(key2, 1);
        CaptureRequest captureRequestBuild = this.f91242l.build();
        this.f91242l.set(key, null);
        this.f91242l.set(CaptureRequest.CONTROL_AF_MODE, null);
        this.f91242l.set(key2, null);
        try {
            this.f91239i.setRepeatingRequest(captureRequestBuild, this.f91229O, this.f91233c);
        } catch (Exception e) {
            Log.e("ContentValues", "setRepeatingRequest failed, " + e.getMessage());
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: m */
    public int mo111774m() {
        return this.f91246p * 90;
    }

    @Override // p149l.mnl
    @RequiresApi(api = 21)
    @TargetApi(21)
    public synchronized void release() {
        try {
            ImageReader imageReader = this.f91236f;
            if (imageReader != null) {
                imageReader.close();
                this.f91236f = null;
            }
            CameraCaptureSession cameraCaptureSession = this.f91239i;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f91239i = null;
            }
            CameraDevice cameraDevice = this.f91237g;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            this.f91242l = null;
            this.f91238h = null;
            HandlerThread handlerThread = this.f91251u;
            if (handlerThread != null) {
                this.f91233c = null;
                this.f91234d = null;
                handlerThread.quitSafely();
            }
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 release !!!");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.mnl
    public void setExposureCompensation(int i) {
        try {
            CaptureRequest.Builder builder = this.f91242l;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
                this.f91239i.capture(this.f91242l.build(), null, this.f91233c);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m116379U() {
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: I */
    public void mo111759I(mnl.InterfaceC18513d interfaceC18513d) {
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: b */
    public void mo111765b(int i) {
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: e */
    public void mo111768e(Camera.ErrorCallback errorCallback) {
    }
}
