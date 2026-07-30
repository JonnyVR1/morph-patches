package com.p069ss.android.ttvecamera.framework;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.C13323b;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TECameraSettings;
import com.p069ss.android.ttvecamera.TEFocusParameters;
import com.p069ss.android.ttvecamera.TEFocusSettings;
import com.p069ss.android.ttvecamera.TEFrameRateRange;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.ajh0;
import p149l.cjh0;
import p149l.ejh0;
import p149l.hjh0;
import p149l.ljh0;
import p149l.mjh0;
import p149l.ti3;
import p149l.tih0;
import p149l.vih0;
import p149l.vtk;
import p149l.wjh0;
import p149l.y3m;
import p149l.yih0;
import p149l.z3m;
import p149l.zih0;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public abstract class TECameraModeBase implements y3m, z3m.InterfaceC21616a {

    /* JADX INFO: renamed from: A */
    protected TEFocusSettings f55507A;

    /* JADX INFO: renamed from: C */
    protected int f55509C;

    /* JADX INFO: renamed from: F */
    private Rect f55512F;

    /* JADX INFO: renamed from: L */
    protected boolean f55518L;

    /* JADX INFO: renamed from: a */
    public CameraCharacteristics f55530a;

    /* JADX INFO: renamed from: b */
    protected vih0 f55531b;

    /* JADX INFO: renamed from: c */
    protected CaptureRequest.Builder f55532c;

    /* JADX INFO: renamed from: d */
    protected volatile CameraCaptureSession f55533d;

    /* JADX INFO: renamed from: e */
    protected CameraManager f55534e;

    /* JADX INFO: renamed from: f */
    protected AbstractC13324c.a f55535f;

    /* JADX INFO: renamed from: g */
    protected C13323b f55536g;

    /* JADX INFO: renamed from: h */
    protected TECameraSettings f55537h;

    /* JADX INFO: renamed from: i */
    protected hjh0 f55538i;

    /* JADX INFO: renamed from: j */
    protected CameraDevice f55539j;

    /* JADX INFO: renamed from: k */
    protected Handler f55540k;

    /* JADX INFO: renamed from: m */
    public CaptureRequest f55542m;

    /* JADX INFO: renamed from: o */
    protected boolean f55544o;

    /* JADX INFO: renamed from: u */
    protected AbstractC13324c.d f55550u;

    /* JADX INFO: renamed from: w */
    protected AbstractC13324c.b f55552w;

    /* JADX INFO: renamed from: x */
    protected int[] f55553x;

    /* JADX INFO: renamed from: l */
    public StreamConfigurationMap f55541l = null;

    /* JADX INFO: renamed from: n */
    protected AtomicBoolean f55543n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p */
    protected float f55545p = 0.0f;

    /* JADX INFO: renamed from: q */
    protected float f55546q = 1.0f;

    /* JADX INFO: renamed from: r */
    protected Range<Float> f55547r = null;

    /* JADX INFO: renamed from: s */
    protected int f55548s = 0;

    /* JADX INFO: renamed from: t */
    protected Rect f55549t = null;

    /* JADX INFO: renamed from: v */
    protected AbstractC13324c.e f55551v = null;

    /* JADX INFO: renamed from: y */
    protected int f55554y = 0;

    /* JADX INFO: renamed from: z */
    protected CaptureRequest.Key<?> f55555z = null;

    /* JADX INFO: renamed from: B */
    protected TEFrameRateRange f55508B = new TEFrameRateRange(7, 30);

    /* JADX INFO: renamed from: D */
    protected Handler f55510D = null;

    /* JADX INFO: renamed from: E */
    private HandlerThread f55511E = null;

    /* JADX INFO: renamed from: G */
    protected volatile boolean f55513G = false;

    /* JADX INFO: renamed from: H */
    protected long f55514H = 0;

    /* JADX INFO: renamed from: I */
    protected long f55515I = 0;

    /* JADX INFO: renamed from: J */
    protected long f55516J = 0;

    /* JADX INFO: renamed from: K */
    protected int f55517K = 0;

    /* JADX INFO: renamed from: M */
    private boolean f55519M = false;

    /* JADX INFO: renamed from: N */
    protected volatile boolean f55520N = false;

    /* JADX INFO: renamed from: O */
    private Map<String, Integer> f55521O = new HashMap<String, Integer>() { // from class: com.ss.android.ttvecamera.framework.TECameraModeBase.1
        {
            put("auto", 1);
            put("incandescent", 2);
            put("fluorescent", 3);
            put("warm-fluorescent", 4);
            put("daylight", 5);
            put("cloudy-daylight", 6);
            put("twilight", 7);
            put("shade", 8);
        }
    };

    /* JADX INFO: renamed from: P */
    protected HashMap<Integer, String> f55522P = new HashMap<>();

    /* JADX INFO: renamed from: Q */
    protected boolean f55523Q = false;

    /* JADX INFO: renamed from: R */
    protected boolean f55524R = false;

    /* JADX INFO: renamed from: S */
    protected List<OutputConfiguration> f55525S = new ArrayList();

    /* JADX INFO: renamed from: T */
    private Runnable f55526T = new RunnableC13336b();

    /* JADX INFO: renamed from: U */
    private final vtk.InterfaceC20728b f55527U = new C13337c();

    /* JADX INFO: renamed from: V */
    protected CameraCaptureSession.StateCallback f55528V = new C13338d();

    /* JADX INFO: renamed from: W */
    protected CameraCaptureSession.CaptureCallback f55529W = new C13339e();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$a */
    public class ExecutorC13335a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f55556a;

        public ExecutorC13335a(Handler handler) {
            this.f55556a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f55556a;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$b */
    public class RunnableC13336b implements Runnable {
        public RunnableC13336b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraModeBase.this.f55538i.mo102392d();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$c */
    public class C13337c implements vtk.InterfaceC20728b {
        public C13337c() {
        }

        @Override // p149l.vtk.InterfaceC20728b
        /* JADX INFO: renamed from: a */
        public void mo80810a() {
            C13323b c13323b;
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f55537h.f55353n && (c13323b = tECameraModeBase.f55536g) != null && c13323b.m80620U0() == 3) {
                C13341g.m80818e("TECameraModeBase", "gyro onChange set focus mode to continuous focus.");
                TECameraModeBase.this.mo80767d();
                TECameraModeBase.this.mo80763a();
                if (TECameraModeBase.this.f55536g.m80619T0() != null) {
                    TECameraModeBase.this.f55536g.m80619T0().m200037i(TECameraModeBase.this.f55527U);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$d */
    public class C13338d extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f55561a;

            public a(int i) {
                this.f55561a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                tECameraModeBase.f55535f.mo80495c(tECameraModeBase.f55537h.f55329b, this.f55561a, "updateCapture : something wrong.", tECameraModeBase.f55539j);
            }
        }

        public C13338d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            C13341g.m80815b("TECameraModeBase", "onConfigureFailed...");
            TECameraModeBase.this.m80753Q();
            ajh0.m96973b("te_record_camera2_create_session_ret", 0L);
            C13341g.m80819f("te_record_camera2_create_session_ret", 0);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            wjh0.m203445a("TECameraModeBase-onConfigured");
            long jCurrentTimeMillis = System.currentTimeMillis();
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            long j = jCurrentTimeMillis - tECameraModeBase.f55514H;
            tECameraModeBase.f55515I = j;
            tECameraModeBase.f55516J = jCurrentTimeMillis;
            tECameraModeBase.f55513G = false;
            TECameraModeBase.this.f55533d = cameraCaptureSession;
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f55537h.f55356o0 && Build.VERSION.SDK_INT >= 28) {
                try {
                    if (!tECameraModeBase2.f55524R && tECameraModeBase2.f55536g.m80645K() != null && TECameraModeBase.this.f55536g.m80645K().m107162d() != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(TECameraModeBase.this.f55536g.m80645K().m107162d());
                        for (int i = 0; i < arrayList.size(); i++) {
                            TECameraModeBase.this.f55525S.get(i).addSurface((Surface) arrayList.get(i));
                            TECameraModeBase.this.f55524R = true;
                        }
                    }
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    if (!tECameraModeBase3.f55523Q && tECameraModeBase3.f55524R) {
                        tECameraModeBase3.f55533d.finalizeOutputConfigurations(TECameraModeBase.this.f55525S);
                        TECameraModeBase.this.f55523Q = true;
                        C13341g.m80814a("TECameraModeBase", "finalizeOutputConfigurations in session onConfigured");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            TECameraModeBase tECameraModeBase4 = TECameraModeBase.this;
            if (!tECameraModeBase4.f55537h.f55356o0 || tECameraModeBase4.f55523Q) {
                try {
                    int iMo80800u0 = tECameraModeBase4.mo80800u0();
                    if (iMo80800u0 != 0) {
                        TECameraModeBase.this.m80753Q();
                        a aVar = new a(iMo80800u0);
                        TECameraModeBase tECameraModeBase5 = TECameraModeBase.this;
                        if (tECameraModeBase5.f55537h.f55347k) {
                            tECameraModeBase5.f55540k.post(aVar);
                        } else {
                            aVar.run();
                        }
                    }
                } catch (Exception e2) {
                    TECameraModeBase.this.m80753Q();
                    e2.printStackTrace();
                }
            }
            ajh0.m96973b("te_record_camera2_create_session_ret", 1L);
            ajh0.m96973b("te_record_camera2_create_session_cost", j);
            C13341g.m80819f("te_record_camera2_create_session_ret", 1);
            C13341g.m80819f("te_record_camera2_create_session_cost", Long.valueOf(j));
            wjh0.m203446b();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$e */
    public class C13339e extends CameraCaptureSession.CaptureCallback {
        public C13339e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (totalCaptureResult != null) {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                CaptureResult.Key key = CaptureResult.SENSOR_SENSITIVITY;
                tECameraModeBase.f55509C = totalCaptureResult.get(key) == null ? -1 : ((Integer) totalCaptureResult.get(key)).intValue();
            }
            if (!TECameraModeBase.this.f55513G) {
                TECameraModeBase.this.m80753Q();
                TECameraModeBase.this.f55513G = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - TECameraModeBase.this.f55516J;
                C13341g.m80818e("TECameraModeBase", "first preview frame callback arrived! consume = " + jCurrentTimeMillis + ", session consume: " + TECameraModeBase.this.f55515I);
                ajh0.m96973b("te_record_camera2_set_repeating_request_cost", jCurrentTimeMillis);
                C13341g.m80819f("te_record_camera2_set_repeating_request_cost", Long.valueOf(jCurrentTimeMillis));
            }
            if (TECameraModeBase.this.f55537h.f55354n0) {
                TECameraFrame.C13243d c13243d = new TECameraFrame.C13243d();
                c13243d.f55155c = System.currentTimeMillis();
                c13243d.f55156d = totalCaptureResult;
                c13243d.f55157e = TECameraModeBase.this.m80745I()[1];
                c13243d.f55158f = TECameraModeBase.this.m80745I()[0];
                TECameraModeBase.this.f55536g.m80645K().m107164f().m102180n(c13243d);
            }
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f55544o) {
                tECameraModeBase2.f55544o = C13333f.m80709k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f55537h.f55340g0 && !tECameraModeBase.f55513G && captureFailure.getReason() == 0) {
                TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
                int i = tECameraModeBase2.f55517K + 1;
                tECameraModeBase2.f55517K = i;
                tECameraModeBase2.f55537h.getClass();
                if (i >= 5) {
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    tECameraModeBase3.f55535f.mo80494b(tECameraModeBase3.f55537h.f55329b, -437, "Camera previewing failed", tECameraModeBase3.f55539j);
                }
            }
            C13341g.m80815b("TECameraModeBase", "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$f */
    public static class C13340f {

        /* JADX INFO: renamed from: a */
        boolean f55564a = false;

        /* JADX INFO: renamed from: b */
        String f55565b = "";

        /* JADX INFO: renamed from: a */
        public String m80811a() {
            return this.f55565b;
        }

        /* JADX INFO: renamed from: b */
        public Exception m80812b() {
            return new Exception(this.f55565b);
        }

        /* JADX INFO: renamed from: c */
        public boolean m80813c() {
            return this.f55564a;
        }

        public String toString() {
            return "Response{isSuccess=" + this.f55564a + ", errMsg='" + this.f55565b + "'}";
        }
    }

    public TECameraModeBase(@NonNull C13323b c13323b, @NonNull Context context, Handler handler) {
        this.f55544o = true;
        this.f55518L = false;
        this.f55536g = c13323b;
        TECameraSettings tECameraSettingsM80663u = c13323b.m80663u();
        this.f55537h = tECameraSettingsM80663u;
        this.f55531b = vih0.m198563c(context, tECameraSettingsM80663u.f55329b);
        this.f55535f = this.f55536g.m80662t();
        this.f55540k = handler;
        this.f55544o = this.f55537h.f55345j;
        this.f55518L = false;
    }

    /* JADX INFO: renamed from: b0 */
    private void m80732b0() {
        vih0 vih0Var = this.f55531b;
        CameraCharacteristics cameraCharacteristics = this.f55530a;
        TECameraSettings tECameraSettings = this.f55537h;
        TEFrameRateRange tEFrameRateRange = tECameraSettings.f55331c;
        this.f55508B = vih0Var.m198565d(cameraCharacteristics, tEFrameRateRange.min, tEFrameRateRange.max, tECameraSettings.f55315O, tECameraSettings.f55333d);
        C13341g.m80818e("TECameraModeBase", "Set Fps Range: " + this.f55508B.toString() + ", strategy: " + this.f55537h.f55315O);
    }

    /* JADX INFO: renamed from: l0 */
    private void m80734l0(CaptureRequest.Builder builder) {
        int[] iArr = this.f55553x;
        if (iArr == null) {
            C13341g.m80814a("TECameraModeBase", "FaceDetect is not supported!");
            return;
        }
        if (C13333f.m80704f(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (C13333f.m80704f(this.f55553x, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (C13333f.m80704f(this.f55553x, 0)) {
            C13341g.m80823j("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    /* JADX INFO: renamed from: v */
    private int m80735v(TEFocusSettings tEFocusSettings) {
        Rect rectM80515b;
        C13341g.m80814a("TECameraModeBase", "settings = " + tEFocusSettings);
        this.f55507A = tEFocusSettings;
        this.f55538i.m131375h(tEFocusSettings);
        this.f55538i.m131374g(this.f55537h);
        if (this.f55531b == null || this.f55533d == null || this.f55532c == null || this.f55507A == null) {
            C13341g.m80823j("TECameraModeBase", "Env is null");
            TEFocusSettings tEFocusSettings2 = this.f55507A;
            if (tEFocusSettings2 != null) {
                tEFocusSettings2.m80520g().mo80534a(-100, this.f55537h.f55333d, "Env is null");
            }
            return -100;
        }
        boolean zM198576p = this.f55531b.m198576p(this.f55530a);
        boolean zM198573m = this.f55531b.m198573m(this.f55530a);
        int i = -412;
        if (!zM198573m && !zM198576p) {
            C13341g.m80823j("TECameraModeBase", "not support focus and meter!");
            this.f55507A.m80520g().mo80534a(-412, this.f55537h.f55333d, "not support focus and meter!");
            return -412;
        }
        boolean z = this.f55543n.get();
        boolean z2 = (zM198573m && this.f55507A.m80528o()) ? false : true;
        if (z && !z2) {
            this.f55526T.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C13341g.m80818e("TECameraModeBase", "cancel previous touch af..");
        }
        boolean z3 = zM198576p && this.f55507A.m80529p();
        Object obj = null;
        if (z3) {
            TEFocusSettings tEFocusSettings3 = this.f55507A;
            TECameraSettings tECameraSettings = this.f55537h;
            rectM80515b = tEFocusSettings3.m80515b(tECameraSettings.f55335e, tECameraSettings.f55333d == 1);
            if (rectM80515b == null) {
                obj = null;
                rectM80515b = m80769e(this.f55507A.m80523j(), this.f55507A.m80522i(), this.f55507A.m80524k(), this.f55507A.m80525l(), this.f55537h.f55335e, 1, this.f55507A.m80518e());
            }
            if (!C13333f.m80720v(rectM80515b)) {
                C13341g.m80815b("TECameraModeBase", "meteringRect is not valid!");
                this.f55507A.m80520g().mo80534a(-100, this.f55537h.f55333d, "meteringRect is not valid!");
                return -100;
            }
            this.f55538i.mo121597f(this.f55532c, rectM80515b);
            if (z2) {
                CaptureRequest.Builder builder = this.f55532c;
                m80805x0(builder, this.f55538i.mo102391c(builder, false), this.f55540k);
                this.f55543n.set(false);
                return 0;
            }
        } else {
            i = -412;
            rectM80515b = null;
        }
        if (!zM198573m || !this.f55507A.m80528o()) {
            return i;
        }
        TEFocusSettings tEFocusSettings4 = this.f55507A;
        TECameraSettings tECameraSettings2 = this.f55537h;
        Rect rectM80514a = tEFocusSettings4.m80514a(tECameraSettings2.f55335e, tECameraSettings2.f55333d == 1);
        if (rectM80514a == null) {
            rectM80514a = m80769e(this.f55507A.m80523j(), this.f55507A.m80522i(), this.f55507A.m80524k(), this.f55507A.m80525l(), this.f55537h.f55335e, 0, this.f55507A.m80518e());
        }
        if (!C13333f.m80720v(rectM80514a)) {
            C13341g.m80815b("TECameraModeBase", "focusRect is not valid!");
            this.f55507A.m80520g().mo80534a(-100, this.f55537h.f55333d, "focusRect is not valid!");
            return -100;
        }
        this.f55543n.set(true);
        if (this.f55518L) {
            boolean zM80526m = tEFocusSettings.m80526m();
            CaptureRequest.Builder builder2 = this.f55532c;
            if (zM80526m) {
                builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f55532c.set(CaptureRequest.FLASH_MODE, 1);
            } else {
                builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f55532c.set(CaptureRequest.FLASH_MODE, 0);
            }
        }
        this.f55538i.mo121596e(this.f55532c, rectM80514a);
        m80780k(this.f55532c);
        this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        this.f55532c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectM80514a, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        if (rectM80515b != null) {
            this.f55532c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectM80515b, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        }
        this.f55532c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        CaptureRequest.Builder builder3 = this.f55532c;
        C13340f c13340fM80805x0 = m80805x0(builder3, this.f55538i.mo102390b(builder3, this.f55543n, tEFocusSettings.m80527n()), this.f55540k);
        if (c13340fM80805x0.f55564a) {
            return 0;
        }
        this.f55543n.set(false);
        TEFocusSettings tEFocusSettings5 = this.f55507A;
        if (tEFocusSettings5 != null) {
            tEFocusSettings5.m80520g().mo80534a(-108, this.f55537h.f55333d, c13340fM80805x0.f55565b);
        }
        this.f55535f.mo80497e(-411, -411, c13340fM80805x0.f55565b, null);
        return -108;
    }

    /* JADX INFO: renamed from: A */
    public float[] m80736A() {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-432, -432, "Capture Session is null", this.f55539j);
        }
        float[] fArr = (float[]) this.f55530a.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        return fArr == null ? new float[]{-1.0f, -1.0f} : fArr;
    }

    /* JADX INFO: renamed from: A0 */
    public void m80737A0(float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        if (this.f55533d == null || this.f55542m == null || this.f55532c == null) {
            C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f55535f.mo80495c(this.f55537h.f55329b, -420, "Camera info is null, may be you need reopen camera.", this.f55539j);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30 && this.f55519M && this.f55531b.m198575o(this.f55530a)) {
            Range<Float> range = this.f55547r;
            if (range != null) {
                Float f2 = (Float) range.getUpper();
                Float f3 = (Float) this.f55547r.getLower();
                if (this.f55546q * f >= f2.floatValue() && f > 1.0f) {
                    this.f55546q = f2.floatValue();
                } else if (this.f55546q * f > f3.floatValue() || f > 1.0f) {
                    this.f55546q *= f;
                    C13341g.m80815b("TECameraModeBase", "zoom ratio = " + this.f55546q);
                } else {
                    this.f55546q = f3.floatValue();
                }
            }
            this.f55532c.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f55546q));
            C13340f c13340fM80801v0 = m80801v0(this.f55532c);
            if (!c13340fM80801v0.f55564a) {
                C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13340fM80801v0.m80811a());
                this.f55535f.mo80497e(-420, -420, c13340fM80801v0.f55565b, this.f55539j);
                return;
            }
        } else {
            if (this.f55546q < this.f55545p || f <= 1.0f) {
                Rect rect = this.f55549t;
                if (rect == null || !rect.equals(this.f55512F) || f > 1.0f) {
                    C13341g.m80814a("TECameraModeBase", "mNowZoom = " + this.f55546q);
                    this.f55546q = this.f55546q * f;
                } else {
                    C13341g.m80814a("TECameraModeBase", "mZoomSize = " + this.f55549t + ";mActiveArraySize = " + this.f55512F + ";factor = " + f);
                    this.f55546q = 1.0f;
                }
            } else {
                C13341g.m80814a("TECameraModeBase", "mNowZoom = " + this.f55546q + ";mMaxZoom = " + this.f55545p + ";factor = " + f);
                this.f55546q = this.f55545p;
            }
            Rect rectM80776i = m80776i(this.f55546q);
            if (rectM80776i == null) {
                return;
            }
            this.f55532c.set(CaptureRequest.SCALER_CROP_REGION, rectM80776i);
            C13340f c13340fM80801v1 = m80801v0(this.f55532c);
            if (!c13340fM80801v1.f55564a) {
                C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13340fM80801v1.m80811a());
                this.f55535f.mo80497e(-420, -420, c13340fM80801v1.f55565b, this.f55539j);
                return;
            }
            this.f55549t = rectM80776i;
        }
        if (interfaceC13315p != null) {
            interfaceC13315p.onChange(this.f55537h.f55329b, this.f55546q, true);
        }
        m80806y();
    }

    /* JADX INFO: renamed from: B */
    public int[] mo80738B() {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public Object m80739C() {
        return this.f55539j;
    }

    /* JADX INFO: renamed from: D */
    public Handler m80740D() {
        if (this.f55511E == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.f55511E = handlerThread;
            handlerThread.start();
            C13341g.m80818e("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.f55510D == null) {
            this.f55510D = new Handler(this.f55511E.getLooper());
        }
        return this.f55510D;
    }

    /* JADX INFO: renamed from: E */
    public int mo80741E() {
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public float[] m80742F() {
        if (this.f55531b == null || this.f55542m == null || this.f55533d == null || this.f55532c == null) {
            C13341g.m80823j("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.f55532c.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int iAbs = StrictMath.abs(rect.right - rect.left);
        int iAbs2 = StrictMath.abs(rect.top - rect.bottom);
        TEFrameSizei tEFrameSizei = this.f55537h.f55359q;
        int i = tEFrameSizei.width;
        int i2 = tEFrameSizei.height;
        if (iAbs * i2 >= i / iAbs2) {
            dArr[0] = StrictMath.atan(((sizeF.getWidth() * iAbs) / size.getWidth()) / (f.floatValue() * 2.0f)) * 2.0d;
            dArr[1] = StrictMath.atan(((((sizeF.getHeight() * iAbs2) / size.getHeight()) * (i / i2)) / (iAbs / iAbs2)) / (f.floatValue() * 2.0f)) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan(((sizeF.getHeight() * iAbs2) / size.getHeight()) / (f.floatValue() * 2.0f)) * 2.0d;
            dArr[0] = StrictMath.atan(((((sizeF.getWidth() * iAbs) / size.getWidth()) * (i2 / i)) / (iAbs2 / iAbs)) / (f.floatValue() * 2.0f)) * 2.0d;
        }
        float[] fArr = {(float) ((dArr[1] * 180.0d) / 3.141592653589793d), (float) ((dArr[0] * 180.0d) / 3.141592653589793d)};
        C13341g.m80814a("TECameraModeBase", "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    /* JADX INFO: renamed from: G */
    public int mo80743G() {
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public int m80744H() {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-430, -430, "Capture Session is null", this.f55539j);
        }
        return this.f55509C;
    }

    /* JADX INFO: renamed from: I */
    public int[] m80745I() {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-430, -430, "Capture Session is null", this.f55539j);
        }
        Range range = (Range) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) ? new int[]{-1, -1} : new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    /* JADX INFO: renamed from: J */
    public float m80746J() {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-435, -435, "Capture Session is null", this.f55539j);
        }
        CameraCharacteristics cameraCharacteristics = this.f55530a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        float fFloatValue = cameraCharacteristics.get(key) == null ? -1.0f : ((Float) this.f55530a.get(key)).floatValue();
        if (fFloatValue >= 0.0f) {
            return fFloatValue;
        }
        this.f55535f.mo80497e(-435, -435, "can not get manual focus ability", this.f55539j);
        return -1.0f;
    }

    /* JADX INFO: renamed from: K */
    public int[] mo80747K() {
        return null;
    }

    /* JADX INFO: renamed from: L */
    public int[] m80748L() {
        Range range;
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    /* JADX INFO: renamed from: M */
    public int m80749M(List<Surface> list) {
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public long[] m80750N() {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-431, -431, "Capture Session is null", this.f55539j);
        }
        Range range = (Range) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        return range == null ? new long[]{-1, -1} : new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    /* JADX INFO: renamed from: O */
    public boolean m80751O() {
        return true;
    }

    /* JADX INFO: renamed from: P */
    public int mo80752P(String str, int i) throws CameraAccessException {
        wjh0.m203445a("TECameraModeBase-openCamera");
        CameraCharacteristics cameraCharacteristics = this.f55530a;
        if (cameraCharacteristics == null) {
            C13341g.m80814a("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -439;
        }
        if (!this.f55531b.m198574n(cameraCharacteristics, i)) {
            return WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_INVALID_STATE;
        }
        this.f55537h.f55335e = ((Integer) this.f55530a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f55530a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        this.f55541l = streamConfigurationMap;
        if (streamConfigurationMap == null) {
            return -439;
        }
        vih0 vih0Var = this.f55531b;
        CameraCharacteristics cameraCharacteristics2 = this.f55530a;
        TECameraSettings tECameraSettings = this.f55537h;
        this.f55545p = vih0Var.m198566e(cameraCharacteristics2, tECameraSettings.f55329b, tECameraSettings.f55357p);
        TECameraSettings tECameraSettings2 = this.f55537h;
        if (tECameraSettings2.f55366t0 == -1.0f || tECameraSettings2.f55368u0 == -1.0f) {
            this.f55547r = this.f55531b.m198570j(this.f55530a);
        } else {
            this.f55547r = new Range<>(Float.valueOf(this.f55537h.f55368u0), Float.valueOf(this.f55537h.f55366t0));
        }
        this.f55546q = 1.0f;
        this.f55512F = (Rect) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        m80732b0();
        this.f55554y = this.f55537h.f55305E.getInt("useCameraFaceDetect");
        this.f55553x = (int[]) this.f55530a.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.f55548s = 0;
        wjh0.m203446b();
        return 0;
    }

    /* JADX INFO: renamed from: Q */
    public void m80753Q() {
        C13323b c13323b = this.f55536g;
        if (c13323b != null) {
            c13323b.m80622X0();
            return;
        }
        C13341g.m80814a("TECameraModeBase", "openCameraLock failed, " + C13341g.m80817d());
    }

    /* JADX INFO: renamed from: R */
    public int m80754R() {
        wjh0.m203445a("TECameraModeBase-prepareProvider");
        cjh0 cjh0VarM80645K = this.f55536g.m80645K();
        if (m80739C() == null || cjh0VarM80645K == null) {
            C13341g.m80815b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f55541l == null) {
            this.f55541l = (StreamConfigurationMap) this.f55530a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (cjh0VarM80645K.m107164f().m102176j()) {
            cjh0VarM80645K.m107170l(this.f55551v);
            cjh0VarM80645K.m107167i(this.f55541l, null);
            this.f55537h.f55359q = cjh0VarM80645K.m107161c();
            TEFrameSizei tEFrameSizei = this.f55537h.f55359q;
            if (tEFrameSizei != null) {
                this.f55535f.mo80497e(50, 0, tEFrameSizei.toString(), this.f55539j);
            }
        } else {
            cjh0VarM80645K.m107167i(this.f55541l, this.f55537h.f55359q);
            this.f55537h.f55361r = cjh0VarM80645K.m107160b();
        }
        C13341g.m80818e("TECameraModeBase", "Camera provider type: " + cjh0VarM80645K.m107165g());
        if (cjh0VarM80645K.m107165g() == 1 || cjh0VarM80645K.m107165g() == 16) {
            if (cjh0VarM80645K.m107166h() == null) {
                C13341g.m80815b("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            SurfaceTexture surfaceTextureM107166h = cjh0VarM80645K.m107166h();
            TEFrameSizei tEFrameSizei2 = this.f55537h.f55359q;
            surfaceTextureM107166h.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        } else if (cjh0VarM80645K.m107165g() != 2) {
            if (cjh0VarM80645K.m107165g() != 8) {
                C13341g.m80815b("TECameraModeBase", "Unsupported camera provider type : " + cjh0VarM80645K.m107165g());
                return WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
            }
            SurfaceTexture surfaceTextureM107166h2 = cjh0VarM80645K.m107166h();
            TEFrameSizei tEFrameSizei3 = this.f55537h.f55359q;
            surfaceTextureM107166h2.setDefaultBufferSize(tEFrameSizei3.width, tEFrameSizei3.height);
        }
        wjh0.m203446b();
        return 0;
    }

    /* JADX INFO: renamed from: S */
    public void m80755S() {
        HandlerThread handlerThread = this.f55511E;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f55511E = null;
            this.f55510D = null;
            C13341g.m80818e("TECameraModeBase", "releaseCameraThread");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m80756T() {
        C13341g.m80818e("TECameraModeBase", "removeFocusSettings");
        hjh0 hjh0Var = this.f55538i;
        if (hjh0Var != null) {
            hjh0Var.m131375h(null);
            this.f55507A = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m80757U() {
        this.f55549t = null;
        this.f55517K = 0;
    }

    /* JADX INFO: renamed from: V */
    public String m80758V(int i) throws CameraAccessException {
        wjh0.m203445a("TECameraModeBase-selectCamera");
        String[] cameraIdList = this.f55534e.getCameraIdList();
        String strM116846w = null;
        if (cameraIdList == null) {
            C13341g.m80823j("TECameraModeBase", "cameraList is null");
            return null;
        }
        ajh0.m96973b("te_record_camera_size", cameraIdList.length);
        if (this.f55537h.f55305E.getBoolean("ve_enable_camera_devices_cache")) {
            C13341g.m80818e("TECameraModeBase", "Enable CameraDeviceCache");
            strM116846w = this.f55522P.get(Integer.valueOf(i));
        }
        if (strM116846w == null || strM116846w == "") {
            if (i == 2) {
                if (this.f55537h.f55310J.length() <= 0 || this.f55537h.f55310J.equals(User.ID_TEAM_ACCOUNT)) {
                    strM116846w = this.f55537h.f55329b == 8 ? this.f55536g.m80647P() : this.f55531b.m198569i(cameraIdList, this.f55534e);
                } else {
                    C13341g.m80818e("TECameraModeBase", "Wide-angle camera id: " + this.f55537h.f55310J);
                    boolean zM80705g = C13333f.m80705g(cameraIdList, this.f55537h.f55310J);
                    TECameraSettings tECameraSettings = this.f55537h;
                    if (zM80705g) {
                        strM116846w = tECameraSettings.f55310J;
                    } else {
                        C13341g.m80823j("TECameraModeBase", "Maybe this is not validate camera id: " + tECameraSettings.f55310J);
                    }
                }
                this.f55535f.mo80497e(112, 0, "enable wide angle", this.f55539j);
            } else if (i != 3) {
                if (i >= cameraIdList.length || i < 0) {
                    i = 1;
                }
                TECameraSettings tECameraSettings2 = this.f55537h;
                tECameraSettings2.f55333d = i;
                if (tECameraSettings2.f55350l0 && !TextUtils.isEmpty(tECameraSettings2.f55310J)) {
                    strM116846w = this.f55537h.f55310J;
                } else if (this.f55537h.f55349l && tih0.m189198d()) {
                    strM116846w = ((ejh0) this.f55531b).m116846w(this.f55534e, i, cameraIdList);
                }
                if (strM116846w == null) {
                    for (String str : cameraIdList) {
                        int i2 = ((Integer) this.f55534e.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1;
                        this.f55522P.put(Integer.valueOf(i2), str);
                        if (i2 == i) {
                            strM116846w = str;
                            break;
                        }
                    }
                }
            } else if (this.f55537h.f55329b == 2) {
                strM116846w = this.f55531b.m198568g(cameraIdList, this.f55534e);
            }
            if (strM116846w != null) {
                this.f55522P.put(Integer.valueOf(i), strM116846w);
            }
        }
        if (strM116846w == null) {
            C13341g.m80823j("TECameraModeBase", "selectCamera: camera tag is null, set 0 for default");
            strM116846w = "0";
        }
        C13341g.m80818e("TECameraModeBase", "selectCamera size: " + cameraIdList.length + ", mFacing: " + this.f55537h.f55333d + ", cameraTag: " + strM116846w);
        CameraCharacteristics cameraCharacteristics = this.f55534e.getCameraCharacteristics(strM116846w);
        this.f55530a = cameraCharacteristics;
        if (Build.VERSION.SDK_INT >= 28) {
            C13341g.m80814a("TECameraModeBase", "selectCamera sessionKeys: " + cameraCharacteristics.getAvailableSessionKeys());
        }
        Range range = (Range) this.f55530a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) this.f55530a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (range != null && rational != null) {
            this.f55537h.f55311K.f55386c = ((Integer) range.getLower()).intValue();
            this.f55537h.f55311K.f55384a = ((Integer) range.getUpper()).intValue();
            this.f55537h.f55311K.f55387d = (rational.getNumerator() * 1.0f) / rational.getDenominator();
            this.f55537h.f55311K.f55385b = 0;
        }
        wjh0.m203446b();
        return strM116846w;
    }

    /* JADX INFO: renamed from: W */
    public void m80759W(float f) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-432, -432, "Capture Session is null", this.f55539j);
        }
        if (m80736A().length == 1 && !Arrays.asList(m80736A()).contains(Float.valueOf(f))) {
            this.f55535f.mo80497e(-432, -432, "invalid aperture", this.f55539j);
            return;
        }
        CaptureRequest.Builder builder = this.f55532c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f55532c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f55532c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f55532c.set(key2, 0);
        }
        this.f55532c.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.f55564a) {
            return;
        }
        C13341g.m80815b("TECameraModeBase", "setAperture exception: " + c13340fM80801v0.f55565b);
        this.f55535f.mo80497e(-432, -432, c13340fM80801v0.f55565b, this.f55539j);
    }

    /* JADX INFO: renamed from: X */
    public void m80760X(boolean z) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "setExposureCompensation : Capture Session is null", this.f55539j);
            return;
        }
        try {
            this.f55532c.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
            m80801v0(this.f55532c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f55535f.mo80497e(-427, -427, e.toString(), this.f55539j);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m80761Y(boolean z) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "setAutoFocusLock : Capture Session is null", this.f55539j);
            return;
        }
        try {
            this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m80801v0(this.f55532c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f55535f.mo80497e(-434, -434, e.toString(), this.f55539j);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m80762Z(Object obj) throws ClassCastException {
        this.f55539j = (CameraDevice) obj;
    }

    @Override // p149l.z3m.InterfaceC21616a
    /* JADX INFO: renamed from: a */
    public int mo80763a() {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "rollbackNormalSessionRequest : param is null.", this.f55539j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f55532c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(mo80741E()));
        this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f55537h.f55353n) {
            CaptureRequest.Builder builder2 = this.f55532c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle[] meteringRectangleArr = z3m.f201382a;
            builder2.set(key, meteringRectangleArr);
            this.f55532c.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        m80801v0(this.f55532c);
        C13341g.m80818e("TECameraModeBase", "rollbackNormalSessionRequest");
        return 0;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m80764a0(int i) {
        this.f55548s = i;
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "setExposureCompensation : Capture Session is null", this.f55539j);
            return false;
        }
        Integer num = (Integer) this.f55532c.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null && num.intValue() == 0) {
            C13341g.m80823j("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
            return false;
        }
        if (this.f55537h.f55311K.f55385b == i) {
            C13341g.m80818e("TECameraModeBase", "setExposureCompensation return, no need to set");
            return false;
        }
        this.f55532c.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
        this.f55537h.f55311K.f55385b = i;
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (!c13340fM80801v0.f55564a) {
            C13341g.m80815b("TECameraModeBase", "setExposureCompensation failed: " + c13340fM80801v0.f55565b);
            this.f55535f.mo80497e(-413, -413, c13340fM80801v0.f55565b, this.f55539j);
        }
        return c13340fM80801v0.f55564a;
    }

    @Override // p149l.z3m.InterfaceC21616a
    /* JADX INFO: renamed from: b */
    public void mo80765b(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder) {
        if (cameraCaptureSession != this.f55533d || builder != this.f55532c) {
            C13341g.m80815b("TECameraModeBase", "updateRequestRepeating failed, session changed...");
            return;
        }
        C13340f c13340fM80801v0 = m80801v0(builder);
        if (c13340fM80801v0.f55564a) {
            return;
        }
        C13341g.m80815b("TECameraModeBase", "updateRequestRepeating failed: " + c13340fM80801v0.f55565b);
    }

    /* JADX INFO: renamed from: c0 */
    public void m80766c0(AbstractC13324c.b bVar) {
        this.f55552w = bVar;
    }

    @Override // p149l.z3m.InterfaceC21616a
    /* JADX INFO: renamed from: d */
    public int mo80767d() {
        if (this.f55532c == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "rollbackMeteringSessionRequest : param is null.", this.f55539j);
            return -100;
        }
        m80807y0(this.f55554y);
        this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f55537h.f55353n) {
            this.f55532c.set(CaptureRequest.CONTROL_AE_REGIONS, z3m.f201382a);
        }
        m80801v0(this.f55532c);
        C13341g.m80818e("TECameraModeBase", "rollbackMeteringSessionRequest");
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public void m80768d0(int i) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-430, -430, "Capture Session is null", this.f55539j);
        }
        if (i > m80745I()[1] || i < m80745I()[0]) {
            this.f55535f.mo80497e(-430, -430, "invalid iso", this.f55539j);
            return;
        }
        CaptureRequest.Builder builder = this.f55532c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f55532c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f55532c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f55532c.set(key2, 0);
        }
        this.f55532c.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.f55564a) {
            return;
        }
        C13341g.m80815b("TECameraModeBase", "setISO exception: " + c13340fM80801v0.f55565b);
        this.f55535f.mo80497e(-430, -430, c13340fM80801v0.f55565b, this.f55539j);
    }

    /* JADX INFO: renamed from: e */
    public Rect m80769e(int i, int i2, float f, float f2, int i3, int i4, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int i5;
        int i6;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i7;
        if (this.f55542m == null) {
            C13341g.m80815b("TECameraModeBase", "_calculateFocusRect, capture request is null, return");
            return null;
        }
        Rect rect = (Rect) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        C13341g.m80814a("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + Constants.AES_SUFFIX);
        Size size = (Size) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append(Constants.AES_SUFFIX);
        C13341g.m80818e("onAreaTouchEvent", sb.toString());
        TECameraSettings tECameraSettings = this.f55537h;
        TEFrameSizei tEFrameSizei = tECameraSettings.f55359q;
        int i8 = tEFrameSizei.width;
        int i9 = tEFrameSizei.height;
        TEFocusSettings.CoordinatesMode coordinatesMode2 = TEFocusSettings.CoordinatesMode.VIEW;
        if (coordinatesMode == coordinatesMode2 && (90 == (i7 = tECameraSettings.f55335e) || 270 == i7)) {
            i6 = i9;
            i5 = i8;
        } else {
            i5 = i9;
            i6 = i8;
        }
        float f8 = 0.0f;
        if (i5 * i >= i6 * i2) {
            f4 = (i * 1.0f) / i6;
            f5 = ((i5 * f4) - i2) / 2.0f;
            f3 = 0.0f;
        } else {
            float f9 = (i2 * 1.0f) / i5;
            f3 = ((i6 * f9) - i) / 2.0f;
            f4 = f9;
            f5 = 0.0f;
        }
        float f10 = (f + f3) / f4;
        float f11 = (f2 + f5) / f4;
        if (coordinatesMode == coordinatesMode2) {
            if (90 == i3) {
                float f12 = i9 - f10;
                f10 = f11;
                f11 = f12;
            } else if (270 == i3) {
                float f13 = i8 - f11;
                f11 = f10;
                f10 = f13;
            }
        }
        Rect rect2 = (Rect) this.f55542m.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            C13341g.m80823j("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        C13341g.m80814a("TECameraModeBase", "cropRegion Rect: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom);
        int iWidth = rect.width();
        int iHeight = rect.height();
        TECameraSettings tECameraSettings2 = this.f55537h;
        TEFrameSizei tEFrameSizei2 = tECameraSettings2.f55359q;
        int i10 = tEFrameSizei2.height;
        int i11 = i10 * iWidth;
        int i12 = tEFrameSizei2.width;
        if (i11 > i12 * iHeight) {
            f7 = (iHeight * 1.0f) / i10;
            f6 = 0.0f;
            f8 = (iWidth - (i12 * f7)) / 2.0f;
        } else {
            float f14 = (iWidth * 1.0f) / i12;
            f6 = (iHeight - (i10 * f14)) / 2.0f;
            f7 = f14;
        }
        float f15 = f6;
        float f16 = (f10 * f7) + f8 + rect.left;
        float fHeight = (f11 * f7) + f15 + rect.top;
        if (coordinatesMode == coordinatesMode2 && tECameraSettings2.f55333d == 1) {
            fHeight = rect.height() - fHeight;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = f16;
            rect3.left = (int) (d - (((double) rect.width()) * 0.05d));
            rect3.right = (int) (d + (((double) rect.width()) * 0.05d));
            double d2 = fHeight;
            rect3.top = (int) (d2 - (((double) rect.height()) * 0.05d));
            rect3.bottom = (int) (d2 + (0.05d * ((double) rect.height())));
        } else {
            double d3 = f16;
            rect3.left = (int) (d3 - (((double) rect.width()) * 0.1d));
            rect3.right = (int) (d3 + (((double) rect.width()) * 0.1d));
            double d4 = fHeight;
            rect3.top = (int) (d4 - (((double) rect.height()) * 0.1d));
            rect3.bottom = (int) (d4 + (((double) rect.height()) * 0.1d));
        }
        int i13 = rect3.left;
        if (i13 < 0 || i13 < rect.left) {
            rect3.left = rect.left;
        }
        int i14 = rect3.top;
        if (i14 < 0 || i14 < rect.top) {
            rect3.top = rect.top;
        }
        int i15 = rect3.right;
        if (i15 < 0 || i15 > rect.right) {
            rect3.right = rect.right;
        }
        int i16 = rect3.bottom;
        if (i16 < 0 || i16 > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        C13341g.m80818e("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "] x: " + f16 + " y: " + fHeight);
        return rect3;
    }

    /* JADX INFO: renamed from: e0 */
    public void m80770e0(float f) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-436, -436, "Capture Session is null", this.f55539j);
        }
        if (f < 0.0f) {
            this.f55535f.mo80497e(-436, -436, "invalid distance", this.f55539j);
            return;
        }
        this.f55532c.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.f55564a) {
            return;
        }
        C13341g.m80815b("TECameraModeBase", "setManualFocusDistance exception: " + c13340fM80801v0.f55565b);
        this.f55535f.mo80497e(-430, -430, c13340fM80801v0.f55565b, this.f55539j);
    }

    /* JADX INFO: renamed from: f */
    public void m80771f() {
        if (this.f55533d == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f55533d.abortCaptures();
        } catch (Exception e) {
            C13341g.m80815b("TECameraModeBase", "abort session failed, e: " + e.getMessage());
        }
        C13341g.m80818e("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: f0 */
    public int mo80772f0(int i, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: g0 */
    public void m80773g0(AbstractC13324c.d dVar) {
        this.f55550u = dVar;
    }

    /* JADX INFO: renamed from: h */
    public Rect m80774h(float f) {
        CameraCharacteristics cameraCharacteristics = this.f55530a;
        if (cameraCharacteristics == null || this.f55532c == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -420, "Camera info is null, may be you need reopen camera.", this.f55539j);
            return null;
        }
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int iWidth = (int) (rect.width() / fFloatValue);
        int iHeight = (int) (rect.height() / fFloatValue);
        int iWidth2 = rect.width() - iWidth;
        int iHeight2 = rect.height() - iHeight;
        int i = (int) ((iWidth2 / fFloatValue) * f);
        int i2 = (int) ((iHeight2 / fFloatValue) * f);
        int i3 = i - (i & 3);
        int i4 = i2 - (i2 & 3);
        return new Rect(i3, i4, rect.width() - i3, rect.height() - i4);
    }

    /* JADX INFO: renamed from: h0 */
    public void m80775h0(AbstractC13324c.e eVar) {
        this.f55551v = eVar;
    }

    /* JADX INFO: renamed from: i */
    public Rect m80776i(float f) {
        Rect rect = this.f55512F;
        if (rect == null) {
            C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C13341g.m80815b("TECameraModeBase", "ActiveArraySize == null");
            this.f55535f.mo80497e(-420, -420, "ActiveArraySize == null.", this.f55539j);
            return null;
        }
        float f2 = this.f55546q;
        if (f2 <= 0.0f || f2 > this.f55545p) {
            C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C13341g.m80815b("TECameraModeBase", "factor invalid");
            this.f55535f.mo80497e(-420, -420, "factor invalid.", this.f55539j);
            return null;
        }
        float f3 = 1.0f / f2;
        int iWidth = rect.width() - Math.round(this.f55512F.width() * f3);
        int iHeight = this.f55512F.height() - Math.round(this.f55512F.height() * f3);
        int i = iWidth / 2;
        Rect rect2 = this.f55512F;
        int iM80703e = C13333f.m80703e(i, rect2.left, rect2.right);
        int i2 = iHeight / 2;
        Rect rect3 = this.f55512F;
        int iM80703e2 = C13333f.m80703e(i2, rect3.top, rect3.bottom);
        int iWidth2 = this.f55512F.width() - i;
        Rect rect4 = this.f55512F;
        int iM80703e3 = C13333f.m80703e(iWidth2, rect4.left, rect4.right);
        int iHeight2 = this.f55512F.height() - i2;
        Rect rect5 = this.f55512F;
        Rect rect6 = new Rect(iM80703e, iM80703e2, iM80703e3, C13333f.m80703e(iHeight2, rect5.top, rect5.bottom));
        CaptureRequest captureRequest = this.f55542m;
        if (captureRequest != null && rect6.equals((Rect) captureRequest.get(CaptureRequest.SCALER_CROP_REGION))) {
            C13341g.m80818e("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
        }
        return rect6;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo80777i0(int i) {
    }

    /* JADX INFO: renamed from: j */
    public int m80778j() {
        if (this.f55532c != null) {
            return this.f55538i.mo102392d();
        }
        this.f55535f.mo80497e(-100, -100, "rollbackNormalSessionRequest : param is null.", this.f55539j);
        return -100;
    }

    /* JADX INFO: renamed from: j0 */
    public void m80779j0(long j) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-431, -431, "Capture Session is null", this.f55539j);
        }
        if (j > m80750N()[1] || j < m80750N()[0]) {
            this.f55535f.mo80497e(-431, -431, "invalid shutter time", this.f55539j);
            return;
        }
        CaptureRequest.Builder builder = this.f55532c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f55532c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f55532c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f55532c.set(key2, 0);
        }
        this.f55532c.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.f55564a) {
            return;
        }
        C13341g.m80815b("TECameraModeBase", "setShutterTime exception: " + c13340fM80801v0.f55565b);
        this.f55535f.mo80497e(-431, -431, c13340fM80801v0.f55565b, this.f55539j);
    }

    /* JADX INFO: renamed from: k */
    public C13340f m80780k(CaptureRequest.Builder builder) {
        return m80782l(builder, this.f55529W, m80740D());
    }

    /* JADX INFO: renamed from: k0 */
    public void m80781k0(boolean z, String str) {
        if (this.f55532c == null || this.f55533d == null) {
            this.f55535f.mo80497e(-424, -424, "Capture Session is null", this.f55539j);
        }
        if (!Arrays.asList((int[]) this.f55530a.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(this.f55521O.get(str) == null ? 1 : this.f55521O.get(str).intValue()))) {
            this.f55535f.mo80497e(-424, -424, "invalid white balance", this.f55539j);
            return;
        }
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.f55564a) {
            return;
        }
        C13341g.m80815b("TECameraModeBase", "setWhiteBalance exception: " + c13340fM80801v0.f55565b);
        this.f55535f.mo80497e(-424, -424, c13340fM80801v0.f55565b, this.f55539j);
    }

    /* JADX INFO: renamed from: l */
    public C13340f m80782l(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C13340f c13340f = new C13340f();
        if (builder == null) {
            c13340f.f55565b = "CaptureRequest.Builder is null";
            C13341g.m80815b("TECameraModeBase", "capture: " + c13340f.f55565b);
            return c13340f;
        }
        if (this.f55533d == null) {
            c13340f.f55565b = "Capture Session is null";
            C13341g.m80815b("TECameraModeBase", "capture: " + c13340f.f55565b);
            return c13340f;
        }
        try {
            this.f55533d.capture(builder.build(), captureCallback, handler);
            c13340f.f55564a = true;
            return c13340f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13340f.f55565b = e.getMessage();
            return c13340f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13340f.f55565b = e2.getMessage();
            return c13340f;
        }
    }

    /* JADX INFO: renamed from: m */
    public C13340f m80783m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C13340f c13340f = new C13340f();
        if (captureRequest == null) {
            c13340f.f55565b = "CaptureRequest is null";
            C13341g.m80815b("TECameraModeBase", "capture: " + c13340f.f55565b);
            return c13340f;
        }
        if (this.f55533d == null) {
            c13340f.f55565b = "Capture Session is null";
            C13341g.m80815b("TECameraModeBase", "capture: " + c13340f.f55565b);
            return c13340f;
        }
        try {
            this.f55533d.capture(captureRequest, captureCallback, handler);
            c13340f.f55564a = true;
            return c13340f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13340f.f55565b = e.getMessage();
            return c13340f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13340f.f55565b = e2.getMessage();
            return c13340f;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public abstract int mo80784m0() throws Exception;

    /* JADX INFO: renamed from: n */
    public C13340f m80785n(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C13340f c13340f = new C13340f();
        if (this.f55533d == null) {
            c13340f.f55565b = "Capture Session is null";
            C13341g.m80815b("TECameraModeBase", "capture: " + c13340f.f55565b);
            return c13340f;
        }
        try {
            this.f55533d.captureBurst(list, captureCallback, handler);
            c13340f.f55564a = true;
            return c13340f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13340f.f55565b = e.getMessage();
            return c13340f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13340f.f55565b = e2.getMessage();
            return c13340f;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int mo80786n0() {
        return 0;
    }

    /* JADX INFO: renamed from: o0 */
    public int m80788o0(float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        CaptureRequest.Builder builder;
        Rect rectM80774h = m80774h(f);
        if (this.f55531b == null || this.f55542m == null || this.f55533d == null || (builder = this.f55532c) == null) {
            C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f55535f.mo80497e(-420, -420, "startZoom : Env is null", this.f55539j);
            return -100;
        }
        if (rectM80774h == null) {
            C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.f55535f.mo80497e(-420, -420, "zoom rect is null.", this.f55539j);
            return -420;
        }
        builder.set(CaptureRequest.SCALER_CROP_REGION, rectM80774h);
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (c13340fM80801v0.f55564a) {
            if (interfaceC13315p != null) {
                interfaceC13315p.onChange(this.f55537h.f55329b, f, true);
            }
            m80806y();
            return 0;
        }
        C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13340fM80801v0.m80811a());
        this.f55535f.mo80497e(-420, -420, c13340fM80801v0.f55565b, this.f55539j);
        return -420;
    }

    /* JADX INFO: renamed from: p */
    public void m80789p() {
        if (this.f55537h.f55353n && this.f55536g.m80619T0() != null) {
            this.f55536g.m80619T0().m200037i(this.f55527U);
        }
        m80755S();
    }

    /* JADX INFO: renamed from: p0 */
    public int mo80790p0() {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void mo80791q() {
        TECameraSettings tECameraSettings;
        if (this.f55536g != null && (tECameraSettings = this.f55537h) != null && tECameraSettings.f55347k) {
            C13341g.m80818e("TECameraModeBase", "close session process...state = " + this.f55536g.m80620U0());
            if (this.f55536g.m80620U0() == 2) {
                this.f55536g.m80627b1();
            }
        }
        this.f55520N = false;
        if (m80739C() == null) {
            C13341g.m80815b("TECameraModeBase", "close session process...device is null");
            return;
        }
        if (this.f55533d == null) {
            C13341g.m80815b("TECameraModeBase", "close session process...session is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f55533d.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f55533d = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ajh0.m96973b("te_record_camera2_close_session_cost", jCurrentTimeMillis2);
        C13341g.m80819f("te_record_camera2_close_session_cost", Long.valueOf(jCurrentTimeMillis2));
        C13341g.m80818e("TECameraModeBase", "close session...consume = " + jCurrentTimeMillis2);
    }

    /* JADX INFO: renamed from: q0 */
    public C13340f m80792q0() {
        C13340f c13340f = new C13340f();
        if (this.f55533d == null) {
            c13340f.f55565b = "Capture Session is null";
            C13341g.m80815b("TECameraModeBase", "stopRepeating: " + c13340f.f55565b);
            return c13340f;
        }
        try {
            this.f55533d.stopRepeating();
            c13340f.f55564a = true;
            return c13340f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13340f.f55565b = e.getMessage();
            return c13340f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13340f.f55565b = e2.getMessage();
            return c13340f;
        }
    }

    /* JADX INFO: renamed from: r */
    public Range<Integer> mo80793r(Range<Integer> range) {
        return range;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo80794r0(int i, int i2, TECameraSettings.InterfaceC13311l interfaceC13311l) {
    }

    /* JADX INFO: renamed from: s */
    public CaptureRequest.Builder m80795s(int i) {
        if (i > 6 || i < 1) {
            C13341g.m80815b("TECameraModeBase", "createCaptureRequestBuilder, template invalid, must be [1, 6]");
            return null;
        }
        CameraDevice cameraDevice = this.f55539j;
        if (cameraDevice != null) {
            try {
                return cameraDevice.createCaptureRequest(i);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo80796s0(TECameraSettings.InterfaceC13311l interfaceC13311l, int i) {
        if (this.f55518L) {
            this.f55532c.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f55532c.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo80797t(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        List arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            C13341g.m80818e("TECameraModeBase", "createSession by normally");
            this.f55539j.createCaptureSession(list, stateCallback, handler);
            return;
        }
        if (list != null || !this.f55537h.f55356o0 || (arrayList = this.f55525S) == null) {
            arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
        }
        mjh0.m154806a();
        SessionConfiguration sessionConfigurationM149980a = ljh0.m149980a(m80749M(list), arrayList, new ExecutorC13335a(handler), stateCallback);
        sessionConfigurationM149980a.setSessionParameters(this.f55532c.build());
        C13341g.m80818e("TECameraModeBase", "createSession by sessionConfiguration");
        this.f55539j.createCaptureSession(sessionConfigurationM149980a);
    }

    /* JADX INFO: renamed from: t0 */
    public int mo80798t0(boolean z) {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "toggleTorch : CaptureRequest.Builder is null", this.f55539j);
            this.f55535f.mo80499g(this.f55537h.f55329b, -100, z ? 1 : 0, "toggleTorch : CaptureRequest.Builder is null", this.f55539j);
            return -100;
        }
        builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
        this.f55535f.mo80497e(104, 0, "camera2 will change flash mode " + z, null);
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        this.f55535f.mo80497e(105, 0, "camera2 did change flash mode " + z, null);
        if (c13340fM80801v0.f55564a) {
            this.f55535f.mo80500h(this.f55537h.f55329b, 0, z ? 1 : 0, "camera torch success", this.f55539j);
            return 0;
        }
        C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + c13340fM80801v0.m80811a());
        this.f55535f.mo80497e(-417, -417, c13340fM80801v0.f55565b, this.f55539j);
        this.f55535f.mo80499g(this.f55537h.f55329b, -417, z ? 1 : 0, c13340fM80801v0.f55565b, this.f55539j);
        return -417;
    }

    /* JADX INFO: renamed from: u */
    public void m80799u() throws Exception {
        if (Build.VERSION.SDK_INT < 28 || this.f55539j == null) {
            return;
        }
        this.f55525S.clear();
        TECameraSettings tECameraSettings = this.f55537h;
        if (tECameraSettings.f55302B == 0 && tECameraSettings.f55329b == 2) {
            List<OutputConfiguration> list = this.f55525S;
            zih0.m219025a();
            list.add(yih0.m214919a(new Size(this.f55537h.m80504a().width, this.f55537h.m80504a().height), SurfaceTexture.class));
            Handler handlerM80740D = this.f55537h.f55347k ? m80740D() : this.f55540k;
            if (this.f55539j != null) {
                if (this.f55532c == null) {
                    boolean z = this.f55537h.f55305E.getBoolean("enablePreviewTemplate");
                    CameraDevice cameraDevice = this.f55539j;
                    if (z) {
                        this.f55532c = cameraDevice.createCaptureRequest(1);
                    } else {
                        this.f55532c = cameraDevice.createCaptureRequest(3);
                    }
                }
                this.f55532c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo80793r(new Range<>(Integer.valueOf(this.f55508B.min / this.f55537h.f55331c.fpsUnitFactor), Integer.valueOf(this.f55508B.max / this.f55537h.f55331c.fpsUnitFactor))));
                mo80797t(null, this.f55528V, handlerM80740D);
            }
        }
        this.f55523Q = false;
        this.f55524R = false;
    }

    /* JADX INFO: renamed from: u0 */
    public int mo80800u0() throws CameraAccessException {
        wjh0.m203445a("TECameraModeBase-updateCapture");
        if (this.f55536g.m80645K() == null || this.f55532c == null) {
            C13341g.m80815b("TECameraModeBase", "update capture failed");
            return -100;
        }
        if (this.f55531b.m198578r(this.f55530a) && m80751O()) {
            C13341g.m80818e("TECameraModeBase", "Stabilization Supported, toggle = " + this.f55537h.f55321U);
            if (this.f55531b.m198564a(this.f55530a, this.f55532c, this.f55537h.f55321U) == 0 && this.f55537h.f55321U) {
                this.f55535f.mo80497e(113, 1, "enable stablization", this.f55539j);
            }
        }
        this.f55532c.set(CaptureRequest.CONTROL_MODE, 1);
        m80732b0();
        Range<Integer> rangeMo80793r = mo80793r(new Range<>(Integer.valueOf(this.f55508B.min / this.f55537h.f55331c.fpsUnitFactor), Integer.valueOf(this.f55508B.max / this.f55537h.f55331c.fpsUnitFactor)));
        this.f55532c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeMo80793r);
        this.f55535f.mo80497e(121, 0, rangeMo80793r.toString(), null);
        this.f55532c.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f55548s));
        m80807y0(this.f55554y);
        if (Float.compare(this.f55537h.f55374x0, this.f55546q) != 0) {
            float fMin = Math.min(this.f55537h.f55374x0, this.f55545p);
            this.f55546q = fMin;
            Rect rectM80776i = m80776i(fMin);
            if (rectM80776i == null) {
                C13341g.m80823j("TECameraModeBase", "calculate default crop_region fail!");
            } else {
                this.f55532c.set(CaptureRequest.SCALER_CROP_REGION, rectM80776i);
            }
        }
        C13340f c13340fM80801v0 = m80801v0(this.f55532c);
        if (!c13340fM80801v0.f55564a) {
            C13341g.m80815b("TECameraModeBase", "first request failed: " + c13340fM80801v0.f55565b);
        }
        this.f55537h.f55335e = ((Integer) this.f55530a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55536g.m80626a1(3);
        m80806y();
        C13341g.m80818e("TECameraModeBase", "send capture request..." + this.f55533d);
        this.f55535f.mo80493a(2, 0, 0, "TECamera2 preview", this.f55539j);
        wjh0.m203446b();
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public C13340f m80801v0(CaptureRequest.Builder builder) {
        return m80803w0(builder, this.f55529W);
    }

    /* JADX INFO: renamed from: w */
    public int m80802w() {
        CaptureRequest.Builder builder = this.f55532c;
        if (builder == null) {
            this.f55535f.mo80495c(this.f55537h.f55329b, -100, "rollbackNormalSessionRequest : param is null.", this.f55539j);
            return -100;
        }
        this.f55538i.mo102389a(builder);
        mo80765b(this.f55533d, this.f55532c);
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public C13340f m80803w0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return m80805x0(builder, captureCallback, m80740D());
    }

    /* JADX INFO: renamed from: x */
    public void m80804x(boolean z) {
        if (!z && this.f55546q != 1.0f) {
            this.f55546q = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (this.f55532c == null || this.f55533d == null) {
                    this.f55535f.mo80495c(this.f55537h.f55329b, -100, "enableMulticamZoom : Capture Session is null", this.f55539j);
                    return;
                }
                this.f55532c.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f55546q));
                C13340f c13340fM80801v0 = m80801v0(this.f55532c);
                if (!c13340fM80801v0.f55564a) {
                    C13341g.m80815b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13340fM80801v0.m80811a());
                    this.f55535f.mo80497e(-420, -420, c13340fM80801v0.f55565b, this.f55539j);
                    return;
                }
            }
            this.f55549t = m80776i(this.f55546q);
        }
        this.f55519M = z;
    }

    /* JADX INFO: renamed from: x0 */
    public C13340f m80805x0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        wjh0.m203445a("TECameraModeBase-updatePreview");
        C13340f c13340f = new C13340f();
        if (builder == null) {
            c13340f.f55565b = "CaptureRequest.Builder is null";
            C13341g.m80815b("TECameraModeBase", "updatePreview: " + c13340f.f55565b);
            return c13340f;
        }
        if (this.f55533d == null) {
            c13340f.f55565b = "Capture Session is null";
            C13341g.m80815b("TECameraModeBase", "updatePreview: " + c13340f.f55565b);
            return c13340f;
        }
        CaptureRequest captureRequestBuild = builder.build();
        this.f55542m = captureRequestBuild;
        try {
            this.f55533d.setRepeatingRequest(captureRequestBuild, captureCallback, handler);
            c13340f.f55564a = true;
            this.f55520N = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13340f.f55565b = e.getMessage();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            c13340f.f55565b = e2.getMessage();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            c13340f.f55565b = e3.getMessage();
            this.f55520N = false;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            c13340f.f55565b = e4.getMessage();
        }
        wjh0.m203446b();
        return c13340f;
    }

    /* JADX INFO: renamed from: y */
    public void m80806y() {
        Bundle bundle;
        wjh0.m203445a("TECameraModeBase-fillFeatures");
        if (this.f55536g.m80641A().containsKey(this.f55537h.f55308H)) {
            bundle = this.f55536g.m80641A().get(this.f55537h.f55308H);
        } else {
            bundle = new Bundle();
            this.f55536g.m80641A().put(this.f55537h.f55308H, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f55537h.f55359q);
        if (this.f55530a != null && this.f55542m != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.mActiveSize = (Rect) this.f55530a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.mCropSize = (Rect) this.f55542m.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.mMaxRegionsAE = ((Integer) this.f55530a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.mMaxRegionsAF = ((Integer) this.f55530a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.f55537h.f55335e);
        wjh0.m203446b();
    }

    /* JADX INFO: renamed from: y0 */
    public void m80807y0(int i) {
        if (i == 1) {
            if (this.f55537h.f55333d == 1) {
                m80734l0(this.f55532c);
                C13341g.m80818e("TECameraModeBase", "use faceae for front");
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.f55537h.f55333d == 0) {
                m80734l0(this.f55532c);
                C13341g.m80818e("TECameraModeBase", "use faceae for rear");
                return;
            }
            return;
        }
        if (i == 3) {
            m80734l0(this.f55532c);
            C13341g.m80818e("TECameraModeBase", "use faceae for all");
        }
    }

    /* JADX INFO: renamed from: z */
    public int mo80808z(TEFocusSettings tEFocusSettings) {
        if (this.f55537h.f55351m) {
            return m80735v(tEFocusSettings);
        }
        this.f55507A = tEFocusSettings;
        this.f55538i.m131375h(tEFocusSettings);
        this.f55538i.m131374g(this.f55537h);
        if (this.f55531b == null || this.f55533d == null || this.f55532c == null) {
            C13341g.m80823j("TECameraModeBase", "Env is null");
            this.f55507A.m80520g().mo80534a(-100, this.f55537h.f55333d, "Env is null");
            return -100;
        }
        boolean zM198576p = this.f55531b.m198576p(this.f55530a);
        boolean zM198573m = this.f55531b.m198573m(this.f55530a);
        if (!zM198573m && !zM198576p) {
            C13341g.m80823j("TECameraModeBase", "do not support MeteringAreaAF!");
            this.f55507A.m80520g().mo80534a(-412, this.f55537h.f55333d, "do not support MeteringAreaAF!");
            return -412;
        }
        boolean zM80527n = tEFocusSettings.m80527n();
        boolean z = this.f55543n.get();
        boolean z2 = (zM198573m && this.f55507A.m80528o()) ? false : true;
        C13341g.m80814a("TECameraModeBase", "focusAtPoint++");
        if (z && !z2) {
            this.f55526T.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C13341g.m80814a("TECameraModeBase", "cancel previous touch af..");
        }
        TEFocusSettings tEFocusSettings2 = this.f55507A;
        TECameraSettings tECameraSettings = this.f55537h;
        Rect rectM80514a = tEFocusSettings2.m80514a(tECameraSettings.f55335e, tECameraSettings.f55333d == 1);
        if (rectM80514a == null) {
            rectM80514a = m80769e(this.f55507A.m80523j(), this.f55507A.m80522i(), this.f55507A.m80524k(), this.f55507A.m80525l(), this.f55537h.f55335e, 0, this.f55507A.m80518e());
        }
        TEFocusSettings tEFocusSettings3 = this.f55507A;
        TECameraSettings tECameraSettings2 = this.f55537h;
        Rect rectM80515b = tEFocusSettings3.m80515b(tECameraSettings2.f55335e, tECameraSettings2.f55333d == 1);
        if (rectM80515b == null) {
            rectM80515b = m80769e(this.f55507A.m80523j(), this.f55507A.m80522i(), this.f55507A.m80524k(), this.f55507A.m80525l(), this.f55537h.f55335e, 1, this.f55507A.m80518e());
        }
        if (!C13333f.m80720v(rectM80514a) || !C13333f.m80720v(rectM80515b)) {
            C13341g.m80815b("TECameraModeBase", "focusRect or meteringRect is not valid!");
            this.f55507A.m80520g().mo80534a(-100, this.f55537h.f55333d, "focusRect or meteringRect is not valid!");
            return -100;
        }
        if (this.f55507A.m80529p() && zM198576p) {
            this.f55538i.mo121597f(this.f55532c, rectM80515b);
        }
        if (z2) {
            if (zM198576p && this.f55507A.m80529p()) {
                CaptureRequest.Builder builder = this.f55532c;
                m80805x0(builder, this.f55538i.mo102391c(builder, !z2), this.f55540k);
                this.f55543n.set(false);
                if (this.f55537h.f55353n) {
                    this.f55536g.m80619T0().m200036h(this.f55527U, this.f55540k);
                }
            }
            return -412;
        }
        this.f55543n.set(true);
        this.f55538i.mo121596e(this.f55532c, rectM80514a);
        if (this.f55537h.f55353n) {
            CaptureRequest.Builder builder2 = this.f55532c;
            C13341g.m80818e("TECameraModeBase", "focusAtPoint, capture to trigger focus, response = " + m80782l(builder2, this.f55538i.mo102390b(builder2, this.f55543n, zM80527n), this.f55540k).f55564a);
            this.f55532c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        CaptureRequest.Builder builder3 = this.f55532c;
        C13340f c13340fM80805x0 = m80805x0(builder3, this.f55538i.mo102390b(builder3, this.f55543n, zM80527n), this.f55540k);
        if (!c13340fM80805x0.f55564a) {
            this.f55543n.set(false);
            this.f55507A.m80520g().mo80534a(-108, this.f55537h.f55333d, c13340fM80805x0.f55565b);
            this.f55535f.mo80497e(-411, -411, c13340fM80805x0.f55565b, this.f55539j);
            return -108;
        }
        if (this.f55537h.f55353n && !zM80527n) {
            this.f55536g.m80619T0().m200036h(this.f55527U, this.f55540k);
        }
        C13341g.m80818e("TECameraModeBase", "focusAtPoint, done");
        return 0;
    }

    /* JADX INFO: renamed from: z0 */
    public void m80809z0() {
        C13323b c13323b = this.f55536g;
        if (c13323b != null) {
            c13323b.m80627b1();
            return;
        }
        C13341g.m80814a("TECameraModeBase", "waitCameraTaskDoneOrTimeout failed, " + C13341g.m80817d());
    }

    /* JADX INFO: renamed from: o */
    public void mo80787o(ti3 ti3Var, int i, TECameraSettings.InterfaceC13302c interfaceC13302c) {
    }
}
