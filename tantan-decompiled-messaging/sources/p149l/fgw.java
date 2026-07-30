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
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.camera.config.Rotation;
import com.momo.mcamera.util.MDLogTag;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class fgw implements nnl {

    /* JADX INFO: renamed from: B */
    private Boolean f97404B;

    /* JADX INFO: renamed from: C */
    private CaptureRequest f97405C;

    /* JADX INFO: renamed from: H */
    private rlw f97410H;

    /* JADX INFO: renamed from: a */
    private tlw f97418a;

    /* JADX INFO: renamed from: b */
    private nnl.InterfaceC18736a f97419b;

    /* JADX INFO: renamed from: c */
    private Handler f97420c;

    /* JADX INFO: renamed from: d */
    private Handler f97421d;

    /* JADX INFO: renamed from: f */
    private ImageReader f97423f;

    /* JADX INFO: renamed from: g */
    private CameraDevice f97424g;

    /* JADX INFO: renamed from: h */
    private CameraManager f97425h;

    /* JADX INFO: renamed from: i */
    private CameraCaptureSession f97426i;

    /* JADX INFO: renamed from: l */
    private CaptureRequest.Builder f97429l;

    /* JADX INFO: renamed from: m */
    private int f97430m;

    /* JADX INFO: renamed from: r */
    private tif0 f97435r;

    /* JADX INFO: renamed from: e */
    private int f97422e = 1;

    /* JADX INFO: renamed from: j */
    public final int f97427j = 1;

    /* JADX INFO: renamed from: k */
    public final int f97428k = 2;

    /* JADX INFO: renamed from: n */
    public final int f97431n = 0;

    /* JADX INFO: renamed from: o */
    public final int f97432o = 1;

    /* JADX INFO: renamed from: p */
    int f97433p = 0;

    /* JADX INFO: renamed from: q */
    private int f97434q = 0;

    /* JADX INFO: renamed from: s */
    private Rect f97436s = new Rect(0, 0, 1, 1);

    /* JADX INFO: renamed from: t */
    private int f97437t = 0;

    /* JADX INFO: renamed from: u */
    private HandlerThread f97438u = null;

    /* JADX INFO: renamed from: v */
    InterfaceC16828h f97439v = null;

    /* JADX INFO: renamed from: w */
    private Context f97440w = null;

    /* JADX INFO: renamed from: x */
    private int f97441x = 0;

    /* JADX INFO: renamed from: y */
    CameraDevice.StateCallback f97442y = new C16822b();

    /* JADX INFO: renamed from: z */
    byte[] f97443z = null;

    /* JADX INFO: renamed from: A */
    ImageReader.OnImageAvailableListener f97403A = new C16823c();

    /* JADX INFO: renamed from: D */
    private nnl.InterfaceC18740e f97406D = null;

    /* JADX INFO: renamed from: E */
    private Semaphore f97407E = new Semaphore(1);

    /* JADX INFO: renamed from: F */
    private boolean f97408F = false;

    /* JADX INFO: renamed from: G */
    private CameraCaptureSession.StateCallback f97409G = new C16824d();

    /* JADX INFO: renamed from: I */
    private boolean f97411I = false;

    /* JADX INFO: renamed from: J */
    private boolean f97412J = true;

    /* JADX INFO: renamed from: K */
    private Integer f97413K = null;

    /* JADX INFO: renamed from: L */
    private Runnable f97414L = new RunnableC16825e();

    /* JADX INFO: renamed from: M */
    private long f97415M = 0;

    /* JADX INFO: renamed from: N */
    private CameraCaptureSession.CaptureCallback f97416N = new C16826f();

    /* JADX INFO: renamed from: O */
    private CameraCaptureSession.CaptureCallback f97417O = new C16827g();

    /* JADX INFO: renamed from: l.fgw$a */
    public class C16821a extends CameraCaptureSession.CaptureCallback {
        public C16821a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            fgw.this.m121307s0();
        }
    }

    /* JADX INFO: renamed from: l.fgw$b */
    public class C16822b extends CameraDevice.StateCallback {
        public C16822b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            super.onClosed(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            fgw.this.f97407E.release();
            cameraDevice.close();
            fgw.this.f97424g = null;
            fgw.this.m121294d0();
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is onDisconnected !!!");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            fgw.this.f97407E.release();
            cameraDevice.close();
            fgw.this.f97424g = null;
            fgw.this.m121302l0(1, s84.f162993a.get(1));
            if (fgw.this.f97406D != null) {
                fgw.this.f97406D.onFail(4004, "Camera2 open failed !");
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 open failed !");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            fgw.this.f97407E.release();
            fgw.this.f97424g = cameraDevice;
            fgw.this.m121291a0();
            fgw fgwVar = fgw.this;
            fgwVar.f97412J = fgwVar.m121293c0();
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 CameraDevice is opened !!!");
        }
    }

    /* JADX INFO: renamed from: l.fgw$c */
    public class C16823c implements ImageReader.OnImageAvailableListener {
        public C16823c() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            fgw fgwVar = fgw.this;
            fgwVar.f97443z = vhm.m198467a(imageAcquireNextImage, 2, fgwVar.f97443z);
            if (fgw.this.f97419b != null && !fgw.this.f97411I) {
                fgw.this.f97419b.onData(fgw.this.f97443z);
            }
            fgw.m121308z(fgw.this);
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: renamed from: l.fgw$d */
    public class C16824d extends CameraCaptureSession.StateCallback {
        public C16824d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.close();
            fgw.this.f97426i = null;
            if (fgw.this.f97406D != null) {
                fgw.this.f97406D.onFail(4005, "Camera2 config failed !");
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config failed !");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            if (fgw.this.f97424g == null) {
                return;
            }
            fgw.this.f97426i = cameraCaptureSession;
            fgw.this.m121306r0();
        }
    }

    /* JADX INFO: renamed from: l.fgw$e */
    public class RunnableC16825e implements Runnable {
        public RunnableC16825e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fgw.this.m121311j0();
        }
    }

    /* JADX INFO: renamed from: l.fgw$f */
    public class C16826f extends CameraCaptureSession.CaptureCallback {
        public C16826f() {
        }

        /* JADX INFO: renamed from: a */
        private void m121314a(CaptureResult captureResult) {
            int i = fgw.this.f97441x;
            if (i == 0) {
                fgw.this.f97415M = 0L;
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null && !num.equals(fgw.this.f97413K)) {
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
                            fgw.this.f97429l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            fgw.this.m121306r0();
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_FOCUSED_LOCKED");
                            break;
                        case 5:
                            fgw.this.f97429l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            fgw.this.m121306r0();
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_NOT_FOCUSED_LOCKED");
                            break;
                        case 6:
                            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.CONTROL_AF_STATE_PASSIVE_UNFOCUSED");
                            break;
                    }
                }
                fgw.this.f97413K = num;
                return;
            }
            if (i == 1) {
                fgw.this.f97415M = 0L;
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 == null) {
                    MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null");
                    fgw.this.m121292b0();
                    return;
                }
                if (4 == num2.intValue() || 5 == num2.intValue()) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() != 2) {
                        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.null stick taken");
                        fgw.this.m121304n0();
                        return;
                    } else {
                        fgw.this.f97441x = 4;
                        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CaptureResult.still taken");
                        fgw.this.m121292b0();
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
                if (num4 == null || num4.intValue() != 5 || System.currentTimeMillis() - fgw.this.f97415M > 200) {
                    fgw.this.f97441x = 4;
                    fgw.this.m121292b0();
                    return;
                }
                return;
            }
            fgw.this.f97415M = 0L;
            Integer num5 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num5 == null || num5.intValue() == 5 || num5.intValue() == 4) {
                fgw.this.f97441x = 3;
                fgw.this.f97415M = System.currentTimeMillis();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m121314a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m121314a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.fgw$g */
    public class C16827g extends CameraCaptureSession.CaptureCallback {
        public C16827g() {
        }

        /* JADX INFO: renamed from: a */
        private void m121315a(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                return;
            }
            if (4 == num.intValue() || 5 == num.intValue()) {
                fgw.this.f97429l.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "camera focused ");
                fgw.this.m121306r0();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(api = 21)
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            m121315a(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            m121315a(captureResult);
        }
    }

    /* JADX INFO: renamed from: l.fgw$h */
    public interface InterfaceC16828h {
        /* JADX INFO: renamed from: a */
        void mo121316a(int i, String str);
    }

    public fgw(tlw tlwVar) {
        this.f97430m = 0;
        this.f97418a = tlwVar;
        this.f97430m = k84.m144835b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a0 */
    public void m121291a0() {
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f97424g.createCaptureRequest(3);
            this.f97429l = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(this.f97423f.getSurface());
            this.f97424g.createCaptureSession(Arrays.asList(this.f97423f.getSurface()), this.f97409G, this.f97420c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.getMessage());
            m121302l0(3, s84.f162993a.get(3));
            nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4002, "Camera2 start preview failed !" + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.getMessage());
            m121302l0(3, s84.f162993a.get(3));
            nnl.InterfaceC18740e interfaceC18740e2 = this.f97406D;
            if (interfaceC18740e2 != null) {
                interfaceC18740e2.onFail(4002, "Camera2 start preview failed !" + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m121292b0() {
        try {
            CameraDevice cameraDevice = this.f97424g;
            if (cameraDevice == null) {
                return;
            }
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f97423f.getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
            m121305o0(builderCreateCaptureRequest);
            C16821a c16821a = new C16821a();
            this.f97426i.stopRepeating();
            this.f97426i.abortCaptures();
            this.f97426i.capture(builderCreateCaptureRequest.build(), c16821a, null);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 take photo error!" + e.getMessage());
            nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, "Camera2 take photo error!" + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: c0 */
    public boolean m121293c0() {
        CameraManager cameraManager = this.f97425h;
        if (cameraManager != null) {
            try {
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f97425h.getCameraCharacteristics(str);
                    if (this.f97422e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        return true;
                    }
                    if (this.f97422e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        return false;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get Camera2 is front failed !" + e.toString());
                m121302l0(6, s84.f162993a.get(6));
                nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
                if (interfaceC18740e != null) {
                    interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get Camera2 is front failed !");
                }
            }
        }
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: f0 */
    private float m121295f0() {
        Float f;
        try {
            f = (Float) this.f97425h.getCameraCharacteristics(this.f97422e + "").get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "isHardwareLevelSupported Error" + e.toString());
            f = null;
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m121297g0() {
        return m121299h0(2) || m121295f0() > 0.0f;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: h0 */
    private boolean m121299h0(int i) {
        try {
            int iIntValue = ((Integer) this.f97425h.getCameraCharacteristics(this.f97422e + "").get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
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

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i0 */
    private boolean m121300i0(int i) {
        try {
            CameraManager cameraManager = this.f97425h;
            if (cameraManager != null) {
                for (int i2 : (int[]) cameraManager.getCameraCharacteristics(String.valueOf(this.f97422e)).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                    if (i2 == i) {
                        return true;
                    }
                }
            }
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get Camera2 is support flash AE mode error!" + e.getMessage());
            m121302l0(10, s84.f162993a.get(10));
            nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get Camera2 is support flash AE mode error!" + e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    private void m121301k0() {
        try {
            CaptureRequest.Builder builder = this.f97429l;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            builder.set(key, 4);
            CaptureRequest.Builder builder2 = this.f97429l;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
            builder2.set(key2, 1);
            this.f97441x = 1;
            this.f97426i.capture(this.f97429l.build(), this.f97416N, this.f97420c);
            this.f97429l.set(key2, null);
            this.f97429l.set(key, null);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 lockFocus failed !!!" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m121302l0(int i, String str) {
        InterfaceC16828h interfaceC16828h = this.f97439v;
        if (interfaceC16828h != null) {
            interfaceC16828h.mo121316a(i, str);
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: m0 */
    private void m121303m0() {
        mo106816a();
        mo106823j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m121304n0() {
        try {
            this.f97429l.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f97441x = 2;
            this.f97426i.capture(this.f97429l.build(), this.f97416N, this.f97420c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 runPrecaptureSequence failed !!!" + e.toString());
        }
    }

    /* JADX INFO: renamed from: o0 */
    private void m121305o0(CaptureRequest.Builder builder) {
        this.f97404B.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public synchronized void m121306r0() {
        try {
            CaptureRequest.Builder builder = this.f97429l;
            if (builder != null && this.f97426i != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                this.f97429l.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f97418a.f171064H), Integer.valueOf(this.f97418a.f171063G)));
                CaptureRequest captureRequestBuild = this.f97429l.build();
                this.f97405C = captureRequestBuild;
                this.f97426i.setRepeatingRequest(captureRequestBuild, this.f97416N, this.f97420c);
                this.f97411I = false;
            }
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startNormalPreview failed !" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m121307s0() {
        try {
            this.f97429l.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m121305o0(this.f97429l);
            this.f97426i.capture(this.f97429l.build(), this.f97416N, this.f97420c);
            this.f97441x = 0;
            this.f97426i.setRepeatingRequest(this.f97405C, this.f97416N, this.f97420c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4005, "Cancel Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ vnl m121308z(fgw fgwVar) {
        fgwVar.getClass();
        return null;
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: A */
    public synchronized boolean mo106810A(int i, rlw rlwVar) {
        try {
            try {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switchCamera !!!");
                for (String str : this.f97425h.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = this.f97425h.getCameraCharacteristics(str);
                    if (this.f97422e == 1 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        this.f97411I = true;
                        this.f97422e = 0;
                        m121303m0();
                        break;
                    }
                    if (this.f97422e == 0 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        this.f97411I = true;
                        this.f97422e = 1;
                        m121303m0();
                        break;
                    }
                }
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 switch Camera failed !" + e.toString());
                m121302l0(5, s84.f162993a.get(5));
                nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
                if (interfaceC18740e != null) {
                    interfaceC18740e.onFail(ErrorCode.CAMERA_SWITCH_FAILED, "Camera2 switch Camera failed !");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: C */
    public synchronized boolean mo106811C(int i, rlw rlwVar) {
        try {
            this.f97410H = rlwVar;
            if (this.f97430m - 1 >= rlwVar.m179912d()) {
                this.f97422e = rlwVar.m179912d();
            }
            if (this.f97420c == null) {
                HandlerThread handlerThread = new HandlerThread("Camera2");
                this.f97438u = handlerThread;
                handlerThread.start();
                this.f97420c = new Handler(this.f97438u.getLooper());
            }
            if (this.f97421d == null) {
                this.f97421d = new Handler(Looper.getMainLooper());
            }
            this.f97437t = i;
            m121309Z(i);
            this.f97418a.f171085b = rlwVar.m179925q().m189184b();
            this.f97418a.f171087c = rlwVar.m179925q().m189183a();
            if (this.f97425h != null) {
                Size sizeM144837d = k84.m144837d(m121310e0(), this.f97418a, new Size(rlwVar.m179925q().m189184b(), rlwVar.m179925q().m189183a()));
                if (sizeM144837d == null) {
                    return false;
                }
                this.f97418a.f171085b = sizeM144837d.getWidth();
                this.f97418a.f171087c = sizeM144837d.getHeight();
            }
            tlw tlwVar = this.f97418a;
            int iM179924p = tlwVar.f171085b;
            int iM179924p2 = tlwVar.f171087c;
            this.f97435r = new tif0(iM179924p, iM179924p2);
            if (this.f97423f == null) {
                tlw tlwVar2 = this.f97418a;
                ImageReader imageReaderNewInstance = ImageReader.newInstance(tlwVar2.f171085b, tlwVar2.f171087c, 35, 3);
                this.f97423f = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(this.f97403A, this.f97420c);
            }
            if (rlwVar.m179923o() == 1) {
                iM179924p = (int) (iM179924p2 * rlwVar.m179924p());
                if (iM179924p != this.f97418a.f171085b) {
                    iM179924p = (iM179924p >> 4) << 4;
                }
            } else if (rlwVar.m179923o() == 0 && (iM179924p2 = (int) (iM179924p / rlwVar.m179924p())) != this.f97418a.f171087c) {
                iM179924p2 = (iM179924p2 >> 4) << 4;
            }
            int i2 = this.f97433p;
            tif0 tif0Var = (i2 == 1 || i2 == 3) ? new tif0(iM179924p2, iM179924p) : new tif0(iM179924p, iM179924p2);
            if (!this.f97418a.f171069M) {
                tif0 tif0VarM179913e = rlwVar.m179913e();
                if (tif0VarM179913e != null && tif0VarM179913e.m189184b() > 0 && tif0VarM179913e.m189183a() > 0) {
                    this.f97418a.f171097h = tif0VarM179913e.m189184b();
                    this.f97418a.f171099i = tif0VarM179913e.m189183a();
                }
            } else if (tif0Var.m189184b() > 0 && tif0Var.m189183a() > 0) {
                this.f97418a.f171097h = tif0Var.m189184b();
                this.f97418a.f171099i = tif0Var.m189183a();
                rlwVar.m179890F(tif0Var);
            }
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 prepare mrCoreParameters.encodeWidth = " + this.f97418a.f171097h + " mrCoreParameters.encodeHeight = " + this.f97418a.f171099i);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: E */
    public void mo106812E(String str) {
        if (this.f97404B.booleanValue()) {
            if (str.equals("on")) {
                this.f97429l.set(CaptureRequest.FLASH_MODE, 2);
            } else if (str.equals(BLiveOperationTitleShowType.off)) {
                this.f97429l.set(CaptureRequest.FLASH_MODE, 0);
            } else if (str.equals("auto")) {
                this.f97429l.set(CaptureRequest.CONTROL_MODE, 1);
            }
            try {
                CaptureRequest captureRequestBuild = this.f97429l.build();
                CameraCaptureSession cameraCaptureSession = this.f97426i;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.setRepeatingRequest(captureRequestBuild, null, this.f97420c);
                }
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 is flash mode error!" + e.getMessage());
                m121302l0(11, s84.f162993a.get(11));
                nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
                if (interfaceC18740e != null) {
                    interfaceC18740e.onFail(4005, "Set Camera2 is flash mode error!" + e.getMessage());
                }
            } catch (IllegalStateException e2) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 is flash mode error!" + e2.getMessage());
                m121302l0(11, s84.f162993a.get(11));
            }
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: F */
    public boolean mo106813F() {
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: Z */
    public void m121309Z(int i) {
        try {
            int iIntValue = ((Integer) this.f97425h.getCameraCharacteristics(this.f97422e + "").get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (mo106822i()) {
                this.f97434q = (360 - ((iIntValue + i) % 360)) % 360;
            } else {
                this.f97434q = ((iIntValue - i) + 360) % 360;
            }
            Rotation rotation = Rotation.NORMAL;
            int i2 = this.f97434q;
            if (i2 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i2 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i2 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f97433p = rotation.ordinal();
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 config Camera Orientation failed !" + e.toString());
            m121302l0(4, s84.f162993a.get(4));
            nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4005, "Camera2 config Camera Orientation failed !");
            }
        }
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public synchronized int mo106816a() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f97426i;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f97426i = null;
            }
            CameraDevice cameraDevice = this.f97424g;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f97424g = null;
            }
            this.f97408F = false;
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 stopPreview !");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: c */
    public int mo106818c() {
        return 0;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: d */
    public int mo106819d() {
        return 0;
    }

    /* JADX INFO: renamed from: e0 */
    public CameraCharacteristics m121310e0() {
        try {
            return this.f97425h.getCameraCharacteristics(String.valueOf(this.f97422e));
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p149l.nnl
    public tif0 getTextureSize() {
        return null;
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i */
    public boolean mo106822i() {
        return this.f97412J;
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: j */
    public synchronized boolean mo106823j(SurfaceTexture surfaceTexture) {
        return mo106828o(surfaceTexture, null);
    }

    /* JADX INFO: renamed from: j0 */
    public void m121311j0() {
        try {
            CaptureRequest.Builder builder = this.f97429l;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 1);
            CaptureRequest captureRequestBuild = this.f97429l.build();
            this.f97429l.set(key, null);
            this.f97426i.capture(captureRequestBuild, this.f97416N, this.f97420c);
        } catch (CameraAccessException e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4005, "Set Camera2 lock auto focus mode error!" + e.getMessage());
            }
        }
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 lockAutoFocus !!!");
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: k */
    public void mo106824k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f97426i == null) {
            return;
        }
        this.f97429l.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        CaptureRequest.Builder builder = this.f97429l;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
        boolean zM121297g0 = m121297g0();
        CaptureRequest.Builder builder2 = this.f97429l;
        if (zM121297g0) {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else {
            builder2.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
        this.f97429l.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest.Builder builder3 = this.f97429l;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        builder3.set(key2, 1);
        CaptureRequest captureRequestBuild = this.f97429l.build();
        this.f97429l.set(key, null);
        this.f97429l.set(CaptureRequest.CONTROL_AF_MODE, null);
        this.f97429l.set(key2, null);
        try {
            this.f97426i.setRepeatingRequest(captureRequestBuild, this.f97416N, this.f97420c);
        } catch (Exception e) {
            Log.e("ContentValues", "setRepeatingRequest failed, " + e.getMessage());
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: m */
    public int mo106826m() {
        return this.f97433p * 90;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: n */
    public int[] mo106827n() {
        return null;
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    @TargetApi(21)
    /* JADX INFO: renamed from: o */
    public boolean mo106828o(SurfaceTexture surfaceTexture, qie qieVar) {
        if (!this.f97408F) {
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 startPreview !!!");
            CameraManager cameraManager = (CameraManager) this.f97440w.getSystemService("camera");
            this.f97425h = cameraManager;
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(this.f97422e + "");
                this.f97436s = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.f97404B = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                k84.m144836c(cameraCharacteristics, this.f97418a);
                this.f97412J = m121293c0();
                Size sizeM144837d = k84.m144837d(cameraCharacteristics, this.f97418a, new Size(this.f97410H.m179925q().m189184b(), this.f97410H.m179925q().m189183a()));
                if (sizeM144837d != null) {
                    this.f97418a.f171085b = sizeM144837d.getWidth();
                    this.f97418a.f171087c = sizeM144837d.getHeight();
                }
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "sem is " + this.f97407E);
                if (!this.f97407E.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Time out waiting to lock camera opening.");
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                this.f97425h.openCamera(this.f97422e + "", this.f97442y, this.f97420c);
                this.f97408F = true;
            } catch (CameraAccessException e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e.toString());
                m121302l0(2, s84.f162993a.get(2));
                nnl.InterfaceC18740e interfaceC18740e = this.f97406D;
                if (interfaceC18740e != null) {
                    interfaceC18740e.onFail(4002, "Camera2 start preview failed !");
                }
            } catch (InterruptedException e2) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera2 start preview failed !" + e2.toString());
            }
        }
        return true;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: p */
    public void mo106829p(nnl.InterfaceC18740e interfaceC18740e) {
        this.f97406D = interfaceC18740e;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: p0 */
    public void m121312p0(Context context) {
        this.f97440w = context;
        if (context != null) {
            this.f97425h = (CameraManager) context.getSystemService("camera");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m121313q0(InterfaceC16828h interfaceC16828h) {
        this.f97439v = interfaceC16828h;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: s */
    public boolean mo106832s(int i) {
        return false;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: t */
    public void mo106833t(String str) {
        m121301k0();
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: u */
    public boolean mo106834u(int i, rlw rlwVar) {
        mo106816a();
        return mo106811C(i, rlwVar);
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: v */
    public boolean mo106835v() {
        return this.f97404B.booleanValue();
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: w */
    public void mo106836w(nnl.InterfaceC18736a interfaceC18736a) {
        this.f97419b = interfaceC18736a;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: x */
    public tif0 mo106837x() {
        tlw tlwVar = this.f97418a;
        return new tif0(tlwVar.f171085b, tlwVar.f171087c);
    }

    @Override // p149l.nnl
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: y */
    public boolean mo106838y() {
        return m121300i0(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m121294d0() {
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: b */
    public void mo106817b(int i) {
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: e */
    public void mo106820e(Camera.ErrorCallback errorCallback) {
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: l */
    public void mo106825l(nnl.InterfaceC18741f interfaceC18741f) {
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: q */
    public void mo106830q(nnl.InterfaceC18739d interfaceC18739d) {
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: r */
    public void mo106831r(nnl.InterfaceC18738c interfaceC18738c) {
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: f */
    public void mo106821f(int i, int i2, Rect rect, boolean z) {
    }
}
