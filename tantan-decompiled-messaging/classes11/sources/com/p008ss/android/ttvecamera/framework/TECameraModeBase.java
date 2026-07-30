package com.p008ss.android.ttvecamera.framework;

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
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.C0725b;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TECameraSettings;
import com.p008ss.android.ttvecamera.TEFocusParameters;
import com.p008ss.android.ttvecamera.TEFocusSettings;
import com.p008ss.android.ttvecamera.TEFrameRateRange;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p009l.ajh0;
import p009l.cjh0;
import p009l.ejh0;
import p009l.hjh0;
import p009l.ljh0;
import p009l.mjh0;
import p009l.ti3;
import p009l.tih0;
import p009l.vih0;
import p009l.vtk;
import p009l.wjh0;
import p009l.y3m;
import p009l.yih0;
import p009l.z3m;
import p009l.zih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 21)
public abstract class TECameraModeBase implements y3m, z3m.InterfaceC1341a {

    /* JADX INFO: renamed from: A */
    protected TEFocusSettings f9113A;

    /* JADX INFO: renamed from: C */
    protected int f9115C;

    /* JADX INFO: renamed from: F */
    private Rect f9118F;

    /* JADX INFO: renamed from: L */
    protected boolean f9124L;

    /* JADX INFO: renamed from: a */
    public CameraCharacteristics f9136a;

    /* JADX INFO: renamed from: b */
    protected vih0 f9137b;

    /* JADX INFO: renamed from: c */
    protected CaptureRequest.Builder f9138c;

    /* JADX INFO: renamed from: d */
    protected volatile CameraCaptureSession f9139d;

    /* JADX INFO: renamed from: e */
    protected CameraManager f9140e;

    /* JADX INFO: renamed from: f */
    protected AbstractC0726c.a f9141f;

    /* JADX INFO: renamed from: g */
    protected C0725b f9142g;

    /* JADX INFO: renamed from: h */
    protected TECameraSettings f9143h;

    /* JADX INFO: renamed from: i */
    protected hjh0 f9144i;

    /* JADX INFO: renamed from: j */
    protected CameraDevice f9145j;

    /* JADX INFO: renamed from: k */
    protected Handler f9146k;

    /* JADX INFO: renamed from: m */
    public CaptureRequest f9148m;

    /* JADX INFO: renamed from: o */
    protected boolean f9150o;

    /* JADX INFO: renamed from: u */
    protected AbstractC0726c.d f9156u;

    /* JADX INFO: renamed from: w */
    protected AbstractC0726c.b f9158w;

    /* JADX INFO: renamed from: x */
    protected int[] f9159x;

    /* JADX INFO: renamed from: l */
    public StreamConfigurationMap f9147l = null;

    /* JADX INFO: renamed from: n */
    protected AtomicBoolean f9149n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p */
    protected float f9151p = 0.0f;

    /* JADX INFO: renamed from: q */
    protected float f9152q = 1.0f;

    /* JADX INFO: renamed from: r */
    protected Range<Float> f9153r = null;

    /* JADX INFO: renamed from: s */
    protected int f9154s = 0;

    /* JADX INFO: renamed from: t */
    protected Rect f9155t = null;

    /* JADX INFO: renamed from: v */
    protected AbstractC0726c.e f9157v = null;

    /* JADX INFO: renamed from: y */
    protected int f9160y = 0;

    /* JADX INFO: renamed from: z */
    protected CaptureRequest.Key<?> f9161z = null;

    /* JADX INFO: renamed from: B */
    protected TEFrameRateRange f9114B = new TEFrameRateRange(7, 30);

    /* JADX INFO: renamed from: D */
    protected Handler f9116D = null;

    /* JADX INFO: renamed from: E */
    private HandlerThread f9117E = null;

    /* JADX INFO: renamed from: G */
    protected volatile boolean f9119G = false;

    /* JADX INFO: renamed from: H */
    protected long f9120H = 0;

    /* JADX INFO: renamed from: I */
    protected long f9121I = 0;

    /* JADX INFO: renamed from: J */
    protected long f9122J = 0;

    /* JADX INFO: renamed from: K */
    protected int f9123K = 0;

    /* JADX INFO: renamed from: M */
    private boolean f9125M = false;

    /* JADX INFO: renamed from: N */
    protected volatile boolean f9126N = false;

    /* JADX INFO: renamed from: O */
    private Map<String, Integer> f9127O = new HashMap<String, Integer>() { // from class: com.ss.android.ttvecamera.framework.TECameraModeBase.1
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
    protected HashMap<Integer, String> f9128P = new HashMap<>();

    /* JADX INFO: renamed from: Q */
    protected boolean f9129Q = false;

    /* JADX INFO: renamed from: R */
    protected boolean f9130R = false;

    /* JADX INFO: renamed from: S */
    protected List<OutputConfiguration> f9131S = new ArrayList();

    /* JADX INFO: renamed from: T */
    private Runnable f9132T = new RunnableC0738b();

    /* JADX INFO: renamed from: U */
    private final vtk.InterfaceC1275b f9133U = new C0739c();

    /* JADX INFO: renamed from: V */
    protected CameraCaptureSession.StateCallback f9134V = new C0740d();

    /* JADX INFO: renamed from: W */
    protected CameraCaptureSession.CaptureCallback f9135W = new C0741e();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$a */
    public class ExecutorC0737a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f9162a;

        public ExecutorC0737a(Handler handler) {
            this.f9162a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f9162a;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$b */
    public class RunnableC0738b implements Runnable {
        public RunnableC0738b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraModeBase.this.f9144i.mo12079d();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$c */
    public class C0739c implements vtk.InterfaceC1275b {
        public C0739c() {
        }

        @Override // p009l.vtk.InterfaceC1275b
        /* JADX INFO: renamed from: a */
        public void mo11161a() {
            C0725b c0725b;
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f9143h.f8959n && (c0725b = tECameraModeBase.f9142g) != null && c0725b.m10971U0() == 3) {
                C0743g.m11169e("TECameraModeBase", "gyro onChange set focus mode to continuous focus.");
                TECameraModeBase.this.mo11118d();
                TECameraModeBase.this.mo11114a();
                if (TECameraModeBase.this.f9142g.m10970T0() != null) {
                    TECameraModeBase.this.f9142g.m10970T0().m23729i(TECameraModeBase.this.f9133U);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$d */
    public class C0740d extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f9167a;

            public a(int i) {
                this.f9167a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                tECameraModeBase.f9141f.mo10846c(tECameraModeBase.f9143h.f8935b, this.f9167a, "updateCapture : something wrong.", tECameraModeBase.f9145j);
            }
        }

        public C0740d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            C0743g.m11166b("TECameraModeBase", "onConfigureFailed...");
            TECameraModeBase.this.m11104Q();
            ajh0.m11494b("te_record_camera2_create_session_ret", 0L);
            C0743g.m11170f("te_record_camera2_create_session_ret", 0);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            wjh0.m24289a("TECameraModeBase-onConfigured");
            long jCurrentTimeMillis = System.currentTimeMillis();
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            long j = jCurrentTimeMillis - tECameraModeBase.f9120H;
            tECameraModeBase.f9121I = j;
            tECameraModeBase.f9122J = jCurrentTimeMillis;
            tECameraModeBase.f9119G = false;
            TECameraModeBase.this.f9139d = cameraCaptureSession;
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f9143h.f8962o0 && Build.VERSION.SDK_INT >= 28) {
                try {
                    if (!tECameraModeBase2.f9130R && tECameraModeBase2.f9142g.m10996K() != null && TECameraModeBase.this.f9142g.m10996K().m12617d() != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(TECameraModeBase.this.f9142g.m10996K().m12617d());
                        for (int i = 0; i < arrayList.size(); i++) {
                            TECameraModeBase.this.f9131S.get(i).addSurface((Surface) arrayList.get(i));
                            TECameraModeBase.this.f9130R = true;
                        }
                    }
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    if (!tECameraModeBase3.f9129Q && tECameraModeBase3.f9130R) {
                        tECameraModeBase3.f9139d.finalizeOutputConfigurations(TECameraModeBase.this.f9131S);
                        TECameraModeBase.this.f9129Q = true;
                        C0743g.m11165a("TECameraModeBase", "finalizeOutputConfigurations in session onConfigured");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            TECameraModeBase tECameraModeBase4 = TECameraModeBase.this;
            if (!tECameraModeBase4.f9143h.f8962o0 || tECameraModeBase4.f9129Q) {
                try {
                    int iMo11151u0 = tECameraModeBase4.mo11151u0();
                    if (iMo11151u0 != 0) {
                        TECameraModeBase.this.m11104Q();
                        a aVar = new a(iMo11151u0);
                        TECameraModeBase tECameraModeBase5 = TECameraModeBase.this;
                        if (tECameraModeBase5.f9143h.f8953k) {
                            tECameraModeBase5.f9146k.post(aVar);
                        } else {
                            aVar.run();
                        }
                    }
                } catch (Exception e2) {
                    TECameraModeBase.this.m11104Q();
                    e2.printStackTrace();
                }
            }
            ajh0.m11494b("te_record_camera2_create_session_ret", 1L);
            ajh0.m11494b("te_record_camera2_create_session_cost", j);
            C0743g.m11170f("te_record_camera2_create_session_ret", 1);
            C0743g.m11170f("te_record_camera2_create_session_cost", Long.valueOf(j));
            wjh0.m24290b();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$e */
    public class C0741e extends CameraCaptureSession.CaptureCallback {
        public C0741e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (totalCaptureResult != null) {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                CaptureResult.Key key = CaptureResult.SENSOR_SENSITIVITY;
                tECameraModeBase.f9115C = totalCaptureResult.get(key) == null ? -1 : ((Integer) totalCaptureResult.get(key)).intValue();
            }
            if (!TECameraModeBase.this.f9119G) {
                TECameraModeBase.this.m11104Q();
                TECameraModeBase.this.f9119G = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - TECameraModeBase.this.f9122J;
                C0743g.m11169e("TECameraModeBase", "first preview frame callback arrived! consume = " + jCurrentTimeMillis + ", session consume: " + TECameraModeBase.this.f9121I);
                ajh0.m11494b("te_record_camera2_set_repeating_request_cost", jCurrentTimeMillis);
                C0743g.m11170f("te_record_camera2_set_repeating_request_cost", Long.valueOf(jCurrentTimeMillis));
            }
            if (TECameraModeBase.this.f9143h.f8960n0) {
                TECameraFrame.C0645d c0645d = new TECameraFrame.C0645d();
                c0645d.f8761c = System.currentTimeMillis();
                c0645d.f8762d = totalCaptureResult;
                c0645d.f8763e = TECameraModeBase.this.m11096I()[1];
                c0645d.f8764f = TECameraModeBase.this.m11096I()[0];
                TECameraModeBase.this.f9142g.m10996K().m12619f().m12049n(c0645d);
            }
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f9150o) {
                tECameraModeBase2.f9150o = C0735f.m11060k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f9143h.f8946g0 && !tECameraModeBase.f9119G && captureFailure.getReason() == 0) {
                TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
                int i = tECameraModeBase2.f9123K + 1;
                tECameraModeBase2.f9123K = i;
                tECameraModeBase2.f9143h.getClass();
                if (i >= 5) {
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    tECameraModeBase3.f9141f.mo10845b(tECameraModeBase3.f9143h.f8935b, -437, "Camera previewing failed", tECameraModeBase3.f9145j);
                }
            }
            C0743g.m11166b("TECameraModeBase", "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$f */
    public static class C0742f {

        /* JADX INFO: renamed from: a */
        boolean f9170a = false;

        /* JADX INFO: renamed from: b */
        String f9171b = "";

        /* JADX INFO: renamed from: a */
        public String m11162a() {
            return this.f9171b;
        }

        /* JADX INFO: renamed from: b */
        public Exception m11163b() {
            return new Exception(this.f9171b);
        }

        /* JADX INFO: renamed from: c */
        public boolean m11164c() {
            return this.f9170a;
        }

        public String toString() {
            return "Response{isSuccess=" + this.f9170a + ", errMsg='" + this.f9171b + "'}";
        }
    }

    public TECameraModeBase(@NonNull C0725b c0725b, @NonNull Context context, Handler handler) {
        this.f9150o = true;
        this.f9124L = false;
        this.f9142g = c0725b;
        TECameraSettings tECameraSettingsM11014u = c0725b.m11014u();
        this.f9143h = tECameraSettingsM11014u;
        this.f9137b = vih0.m23382c(context, tECameraSettingsM11014u.f8935b);
        this.f9141f = this.f9142g.m11013t();
        this.f9146k = handler;
        this.f9150o = this.f9143h.f8951j;
        this.f9124L = false;
    }

    /* JADX INFO: renamed from: b0 */
    private void m11083b0() {
        vih0 vih0Var = this.f9137b;
        CameraCharacteristics cameraCharacteristics = this.f9136a;
        TECameraSettings tECameraSettings = this.f9143h;
        TEFrameRateRange tEFrameRateRange = tECameraSettings.f8937c;
        this.f9114B = vih0Var.m23384d(cameraCharacteristics, tEFrameRateRange.min, tEFrameRateRange.max, tECameraSettings.f8921O, tECameraSettings.f8939d);
        C0743g.m11169e("TECameraModeBase", "Set Fps Range: " + this.f9114B.toString() + ", strategy: " + this.f9143h.f8921O);
    }

    /* JADX INFO: renamed from: l0 */
    private void m11085l0(CaptureRequest.Builder builder) {
        int[] iArr = this.f9159x;
        if (iArr == null) {
            C0743g.m11165a("TECameraModeBase", "FaceDetect is not supported!");
            return;
        }
        if (C0735f.m11055f(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (C0735f.m11055f(this.f9159x, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (C0735f.m11055f(this.f9159x, 0)) {
            C0743g.m11174j("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    /* JADX INFO: renamed from: v */
    private int m11086v(TEFocusSettings tEFocusSettings) {
        Rect rectM10866b;
        C0743g.m11165a("TECameraModeBase", "settings = " + tEFocusSettings);
        this.f9113A = tEFocusSettings;
        this.f9144i.m15862h(tEFocusSettings);
        this.f9144i.m15861g(this.f9143h);
        if (this.f9137b == null || this.f9139d == null || this.f9138c == null || this.f9113A == null) {
            C0743g.m11174j("TECameraModeBase", "Env is null");
            TEFocusSettings tEFocusSettings2 = this.f9113A;
            if (tEFocusSettings2 != null) {
                tEFocusSettings2.m10871g().mo10885a(-100, this.f9143h.f8939d, "Env is null");
            }
            return -100;
        }
        boolean zM23395p = this.f9137b.m23395p(this.f9136a);
        boolean zM23392m = this.f9137b.m23392m(this.f9136a);
        int i = -412;
        if (!zM23392m && !zM23395p) {
            C0743g.m11174j("TECameraModeBase", "not support focus and meter!");
            this.f9113A.m10871g().mo10885a(-412, this.f9143h.f8939d, "not support focus and meter!");
            return -412;
        }
        boolean z = this.f9149n.get();
        boolean z2 = (zM23392m && this.f9113A.m10879o()) ? false : true;
        if (z && !z2) {
            this.f9132T.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C0743g.m11169e("TECameraModeBase", "cancel previous touch af..");
        }
        boolean z3 = zM23395p && this.f9113A.m10880p();
        Object obj = null;
        if (z3) {
            TEFocusSettings tEFocusSettings3 = this.f9113A;
            TECameraSettings tECameraSettings = this.f9143h;
            rectM10866b = tEFocusSettings3.m10866b(tECameraSettings.f8941e, tECameraSettings.f8939d == 1);
            if (rectM10866b == null) {
                obj = null;
                rectM10866b = m11120e(this.f9113A.m10874j(), this.f9113A.m10873i(), this.f9113A.m10875k(), this.f9113A.m10876l(), this.f9143h.f8941e, 1, this.f9113A.m10869e());
            }
            if (!C0735f.m11071v(rectM10866b)) {
                C0743g.m11166b("TECameraModeBase", "meteringRect is not valid!");
                this.f9113A.m10871g().mo10885a(-100, this.f9143h.f8939d, "meteringRect is not valid!");
                return -100;
            }
            this.f9144i.mo14484f(this.f9138c, rectM10866b);
            if (z2) {
                CaptureRequest.Builder builder = this.f9138c;
                m11156x0(builder, this.f9144i.mo12078c(builder, false), this.f9146k);
                this.f9149n.set(false);
                return 0;
            }
        } else {
            i = -412;
            rectM10866b = null;
        }
        if (!zM23392m || !this.f9113A.m10879o()) {
            return i;
        }
        TEFocusSettings tEFocusSettings4 = this.f9113A;
        TECameraSettings tECameraSettings2 = this.f9143h;
        Rect rectM10865a = tEFocusSettings4.m10865a(tECameraSettings2.f8941e, tECameraSettings2.f8939d == 1);
        if (rectM10865a == null) {
            rectM10865a = m11120e(this.f9113A.m10874j(), this.f9113A.m10873i(), this.f9113A.m10875k(), this.f9113A.m10876l(), this.f9143h.f8941e, 0, this.f9113A.m10869e());
        }
        if (!C0735f.m11071v(rectM10865a)) {
            C0743g.m11166b("TECameraModeBase", "focusRect is not valid!");
            this.f9113A.m10871g().mo10885a(-100, this.f9143h.f8939d, "focusRect is not valid!");
            return -100;
        }
        this.f9149n.set(true);
        if (this.f9124L) {
            boolean zM10877m = tEFocusSettings.m10877m();
            CaptureRequest.Builder builder2 = this.f9138c;
            if (zM10877m) {
                builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f9138c.set(CaptureRequest.FLASH_MODE, 1);
            } else {
                builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f9138c.set(CaptureRequest.FLASH_MODE, 0);
            }
        }
        this.f9144i.mo14483e(this.f9138c, rectM10865a);
        m11131k(this.f9138c);
        this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        this.f9138c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectM10865a, 999)});
        if (rectM10866b != null) {
            this.f9138c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectM10866b, 999)});
        }
        this.f9138c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        CaptureRequest.Builder builder3 = this.f9138c;
        C0742f c0742fM11156x0 = m11156x0(builder3, this.f9144i.mo12077b(builder3, this.f9149n, tEFocusSettings.m10878n()), this.f9146k);
        if (c0742fM11156x0.f9170a) {
            return 0;
        }
        this.f9149n.set(false);
        TEFocusSettings tEFocusSettings5 = this.f9113A;
        if (tEFocusSettings5 != null) {
            tEFocusSettings5.m10871g().mo10885a(-108, this.f9143h.f8939d, c0742fM11156x0.f9171b);
        }
        this.f9141f.mo10848e(-411, -411, c0742fM11156x0.f9171b, null);
        return -108;
    }

    /* JADX INFO: renamed from: A */
    public float[] m11087A() {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-432, -432, "Capture Session is null", this.f9145j);
        }
        float[] fArr = (float[]) this.f9136a.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        return fArr == null ? new float[]{-1.0f, -1.0f} : fArr;
    }

    /* JADX INFO: renamed from: A0 */
    public void m11088A0(float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        if (this.f9139d == null || this.f9148m == null || this.f9138c == null) {
            C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f9141f.mo10846c(this.f9143h.f8935b, -420, "Camera info is null, may be you need reopen camera.", this.f9145j);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30 && this.f9125M && this.f9137b.m23394o(this.f9136a)) {
            Range<Float> range = this.f9153r;
            if (range != null) {
                Float f2 = (Float) range.getUpper();
                Float f3 = (Float) this.f9153r.getLower();
                if (this.f9152q * f >= f2.floatValue() && f > 1.0f) {
                    this.f9152q = f2.floatValue();
                } else if (this.f9152q * f > f3.floatValue() || f > 1.0f) {
                    this.f9152q *= f;
                    C0743g.m11166b("TECameraModeBase", "zoom ratio = " + this.f9152q);
                } else {
                    this.f9152q = f3.floatValue();
                }
            }
            this.f9138c.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f9152q));
            C0742f c0742fM11152v0 = m11152v0(this.f9138c);
            if (!c0742fM11152v0.f9170a) {
                C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c0742fM11152v0.m11162a());
                this.f9141f.mo10848e(-420, -420, c0742fM11152v0.f9171b, this.f9145j);
                return;
            }
        } else {
            if (this.f9152q < this.f9151p || f <= 1.0f) {
                Rect rect = this.f9155t;
                if (rect == null || !rect.equals(this.f9118F) || f > 1.0f) {
                    C0743g.m11165a("TECameraModeBase", "mNowZoom = " + this.f9152q);
                    this.f9152q = this.f9152q * f;
                } else {
                    C0743g.m11165a("TECameraModeBase", "mZoomSize = " + this.f9155t + ";mActiveArraySize = " + this.f9118F + ";factor = " + f);
                    this.f9152q = 1.0f;
                }
            } else {
                C0743g.m11165a("TECameraModeBase", "mNowZoom = " + this.f9152q + ";mMaxZoom = " + this.f9151p + ";factor = " + f);
                this.f9152q = this.f9151p;
            }
            Rect rectM11127i = m11127i(this.f9152q);
            if (rectM11127i == null) {
                return;
            }
            this.f9138c.set(CaptureRequest.SCALER_CROP_REGION, rectM11127i);
            C0742f c0742fM11152v1 = m11152v0(this.f9138c);
            if (!c0742fM11152v1.f9170a) {
                C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c0742fM11152v1.m11162a());
                this.f9141f.mo10848e(-420, -420, c0742fM11152v1.f9171b, this.f9145j);
                return;
            }
            this.f9155t = rectM11127i;
        }
        if (interfaceC0717p != null) {
            interfaceC0717p.onChange(this.f9143h.f8935b, this.f9152q, true);
        }
        m11157y();
    }

    /* JADX INFO: renamed from: B */
    public int[] mo11089B() {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public Object m11090C() {
        return this.f9145j;
    }

    /* JADX INFO: renamed from: D */
    public Handler m11091D() {
        if (this.f9117E == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.f9117E = handlerThread;
            handlerThread.start();
            C0743g.m11169e("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.f9116D == null) {
            this.f9116D = new Handler(this.f9117E.getLooper());
        }
        return this.f9116D;
    }

    /* JADX INFO: renamed from: E */
    public int mo11092E() {
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public float[] m11093F() {
        if (this.f9137b == null || this.f9148m == null || this.f9139d == null || this.f9138c == null) {
            C0743g.m11174j("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.f9138c.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int iAbs = StrictMath.abs(rect.right - rect.left);
        int iAbs2 = StrictMath.abs(rect.top - rect.bottom);
        TEFrameSizei tEFrameSizei = this.f9143h.f8965q;
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
        C0743g.m11165a("TECameraModeBase", "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    /* JADX INFO: renamed from: G */
    public int mo11094G() {
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public int m11095H() {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-430, -430, "Capture Session is null", this.f9145j);
        }
        return this.f9115C;
    }

    /* JADX INFO: renamed from: I */
    public int[] m11096I() {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-430, -430, "Capture Session is null", this.f9145j);
        }
        Range range = (Range) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) ? new int[]{-1, -1} : new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    /* JADX INFO: renamed from: J */
    public float m11097J() {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-435, -435, "Capture Session is null", this.f9145j);
        }
        CameraCharacteristics cameraCharacteristics = this.f9136a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        float fFloatValue = cameraCharacteristics.get(key) == null ? -1.0f : ((Float) this.f9136a.get(key)).floatValue();
        if (fFloatValue >= 0.0f) {
            return fFloatValue;
        }
        this.f9141f.mo10848e(-435, -435, "can not get manual focus ability", this.f9145j);
        return -1.0f;
    }

    /* JADX INFO: renamed from: K */
    public int[] mo11098K() {
        return null;
    }

    /* JADX INFO: renamed from: L */
    public int[] m11099L() {
        Range range;
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    /* JADX INFO: renamed from: M */
    public int m11100M(List<Surface> list) {
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public long[] m11101N() {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-431, -431, "Capture Session is null", this.f9145j);
        }
        Range range = (Range) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        return range == null ? new long[]{-1, -1} : new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    /* JADX INFO: renamed from: O */
    public boolean m11102O() {
        return true;
    }

    /* JADX INFO: renamed from: P */
    public int mo11103P(String str, int i) throws CameraAccessException {
        wjh0.m24289a("TECameraModeBase-openCamera");
        CameraCharacteristics cameraCharacteristics = this.f9136a;
        if (cameraCharacteristics == null) {
            C0743g.m11165a("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -439;
        }
        if (!this.f9137b.m23393n(cameraCharacteristics, i)) {
            return -403;
        }
        this.f9143h.f8941e = ((Integer) this.f9136a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f9136a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        this.f9147l = streamConfigurationMap;
        if (streamConfigurationMap == null) {
            return -439;
        }
        vih0 vih0Var = this.f9137b;
        CameraCharacteristics cameraCharacteristics2 = this.f9136a;
        TECameraSettings tECameraSettings = this.f9143h;
        this.f9151p = vih0Var.m23385e(cameraCharacteristics2, tECameraSettings.f8935b, tECameraSettings.f8963p);
        TECameraSettings tECameraSettings2 = this.f9143h;
        if (tECameraSettings2.f8972t0 == -1.0f || tECameraSettings2.f8974u0 == -1.0f) {
            this.f9153r = this.f9137b.m23389j(this.f9136a);
        } else {
            this.f9153r = new Range<>(Float.valueOf(this.f9143h.f8974u0), Float.valueOf(this.f9143h.f8972t0));
        }
        this.f9152q = 1.0f;
        this.f9118F = (Rect) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        m11083b0();
        this.f9160y = this.f9143h.f8911E.getInt("useCameraFaceDetect");
        this.f9159x = (int[]) this.f9136a.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.f9154s = 0;
        wjh0.m24290b();
        return 0;
    }

    /* JADX INFO: renamed from: Q */
    public void m11104Q() {
        C0725b c0725b = this.f9142g;
        if (c0725b != null) {
            c0725b.m10973X0();
            return;
        }
        C0743g.m11165a("TECameraModeBase", "openCameraLock failed, " + C0743g.m11168d());
    }

    /* JADX INFO: renamed from: R */
    public int m11105R() {
        wjh0.m24289a("TECameraModeBase-prepareProvider");
        cjh0 cjh0VarM10996K = this.f9142g.m10996K();
        if (m11090C() == null || cjh0VarM10996K == null) {
            C0743g.m11166b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f9147l == null) {
            this.f9147l = (StreamConfigurationMap) this.f9136a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (cjh0VarM10996K.m12619f().m12045j()) {
            cjh0VarM10996K.m12625l(this.f9157v);
            cjh0VarM10996K.m12622i(this.f9147l, null);
            this.f9143h.f8965q = cjh0VarM10996K.m12616c();
            TEFrameSizei tEFrameSizei = this.f9143h.f8965q;
            if (tEFrameSizei != null) {
                this.f9141f.mo10848e(50, 0, tEFrameSizei.toString(), this.f9145j);
            }
        } else {
            cjh0VarM10996K.m12622i(this.f9147l, this.f9143h.f8965q);
            this.f9143h.f8967r = cjh0VarM10996K.m12615b();
        }
        C0743g.m11169e("TECameraModeBase", "Camera provider type: " + cjh0VarM10996K.m12620g());
        if (cjh0VarM10996K.m12620g() == 1 || cjh0VarM10996K.m12620g() == 16) {
            if (cjh0VarM10996K.m12621h() == null) {
                C0743g.m11166b("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            SurfaceTexture surfaceTextureM12621h = cjh0VarM10996K.m12621h();
            TEFrameSizei tEFrameSizei2 = this.f9143h.f8965q;
            surfaceTextureM12621h.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        } else if (cjh0VarM10996K.m12620g() != 2) {
            if (cjh0VarM10996K.m12620g() != 8) {
                C0743g.m11166b("TECameraModeBase", "Unsupported camera provider type : " + cjh0VarM10996K.m12620g());
                return -200;
            }
            SurfaceTexture surfaceTextureM12621h2 = cjh0VarM10996K.m12621h();
            TEFrameSizei tEFrameSizei3 = this.f9143h.f8965q;
            surfaceTextureM12621h2.setDefaultBufferSize(tEFrameSizei3.width, tEFrameSizei3.height);
        }
        wjh0.m24290b();
        return 0;
    }

    /* JADX INFO: renamed from: S */
    public void m11106S() {
        HandlerThread handlerThread = this.f9117E;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f9117E = null;
            this.f9116D = null;
            C0743g.m11169e("TECameraModeBase", "releaseCameraThread");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m11107T() {
        C0743g.m11169e("TECameraModeBase", "removeFocusSettings");
        hjh0 hjh0Var = this.f9144i;
        if (hjh0Var != null) {
            hjh0Var.m15862h(null);
            this.f9113A = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m11108U() {
        this.f9155t = null;
        this.f9123K = 0;
    }

    /* JADX INFO: renamed from: V */
    public String m11109V(int i) throws CameraAccessException {
        wjh0.m24289a("TECameraModeBase-selectCamera");
        String[] cameraIdList = this.f9140e.getCameraIdList();
        String strM13963w = null;
        if (cameraIdList == null) {
            C0743g.m11174j("TECameraModeBase", "cameraList is null");
            return null;
        }
        ajh0.m11494b("te_record_camera_size", cameraIdList.length);
        if (this.f9143h.f8911E.getBoolean("ve_enable_camera_devices_cache")) {
            C0743g.m11169e("TECameraModeBase", "Enable CameraDeviceCache");
            strM13963w = this.f9128P.get(Integer.valueOf(i));
        }
        if (strM13963w == null || strM13963w == "") {
            if (i == 2) {
                if (this.f9143h.f8916J.length() <= 0 || this.f9143h.f8916J.equals("-1")) {
                    strM13963w = this.f9143h.f8935b == 8 ? this.f9142g.m10998P() : this.f9137b.m23388i(cameraIdList, this.f9140e);
                } else {
                    C0743g.m11169e("TECameraModeBase", "Wide-angle camera id: " + this.f9143h.f8916J);
                    boolean zM11056g = C0735f.m11056g(cameraIdList, this.f9143h.f8916J);
                    TECameraSettings tECameraSettings = this.f9143h;
                    if (zM11056g) {
                        strM13963w = tECameraSettings.f8916J;
                    } else {
                        C0743g.m11174j("TECameraModeBase", "Maybe this is not validate camera id: " + tECameraSettings.f8916J);
                    }
                }
                this.f9141f.mo10848e(112, 0, "enable wide angle", this.f9145j);
            } else if (i != 3) {
                if (i >= cameraIdList.length || i < 0) {
                    i = 1;
                }
                TECameraSettings tECameraSettings2 = this.f9143h;
                tECameraSettings2.f8939d = i;
                if (tECameraSettings2.f8956l0 && !TextUtils.isEmpty(tECameraSettings2.f8916J)) {
                    strM13963w = this.f9143h.f8916J;
                } else if (this.f9143h.f8955l && tih0.m22546d()) {
                    strM13963w = ((ejh0) this.f9137b).m13963w(this.f9140e, i, cameraIdList);
                }
                if (strM13963w == null) {
                    for (String str : cameraIdList) {
                        int i2 = ((Integer) this.f9140e.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1;
                        this.f9128P.put(Integer.valueOf(i2), str);
                        if (i2 == i) {
                            strM13963w = str;
                            break;
                        }
                    }
                }
            } else if (this.f9143h.f8935b == 2) {
                strM13963w = this.f9137b.m23387g(cameraIdList, this.f9140e);
            }
            if (strM13963w != null) {
                this.f9128P.put(Integer.valueOf(i), strM13963w);
            }
        }
        if (strM13963w == null) {
            C0743g.m11174j("TECameraModeBase", "selectCamera: camera tag is null, set 0 for default");
            strM13963w = "0";
        }
        C0743g.m11169e("TECameraModeBase", "selectCamera size: " + cameraIdList.length + ", mFacing: " + this.f9143h.f8939d + ", cameraTag: " + strM13963w);
        CameraCharacteristics cameraCharacteristics = this.f9140e.getCameraCharacteristics(strM13963w);
        this.f9136a = cameraCharacteristics;
        if (Build.VERSION.SDK_INT >= 28) {
            C0743g.m11165a("TECameraModeBase", "selectCamera sessionKeys: " + cameraCharacteristics.getAvailableSessionKeys());
        }
        Range range = (Range) this.f9136a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) this.f9136a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (range != null && rational != null) {
            this.f9143h.f8917K.f8992c = ((Integer) range.getLower()).intValue();
            this.f9143h.f8917K.f8990a = ((Integer) range.getUpper()).intValue();
            this.f9143h.f8917K.f8993d = (rational.getNumerator() * 1.0f) / rational.getDenominator();
            this.f9143h.f8917K.f8991b = 0;
        }
        wjh0.m24290b();
        return strM13963w;
    }

    /* JADX INFO: renamed from: W */
    public void m11110W(float f) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-432, -432, "Capture Session is null", this.f9145j);
        }
        if (m11087A().length == 1 && !Arrays.asList(m11087A()).contains(Float.valueOf(f))) {
            this.f9141f.mo10848e(-432, -432, "invalid aperture", this.f9145j);
            return;
        }
        CaptureRequest.Builder builder = this.f9138c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f9138c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f9138c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f9138c.set(key2, 0);
        }
        this.f9138c.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.f9170a) {
            return;
        }
        C0743g.m11166b("TECameraModeBase", "setAperture exception: " + c0742fM11152v0.f9171b);
        this.f9141f.mo10848e(-432, -432, c0742fM11152v0.f9171b, this.f9145j);
    }

    /* JADX INFO: renamed from: X */
    public void m11111X(boolean z) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "setExposureCompensation : Capture Session is null", this.f9145j);
            return;
        }
        try {
            this.f9138c.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
            m11152v0(this.f9138c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f9141f.mo10848e(-427, -427, e.toString(), this.f9145j);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m11112Y(boolean z) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "setAutoFocusLock : Capture Session is null", this.f9145j);
            return;
        }
        try {
            this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m11152v0(this.f9138c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f9141f.mo10848e(-434, -434, e.toString(), this.f9145j);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m11113Z(Object obj) throws ClassCastException {
        this.f9145j = (CameraDevice) obj;
    }

    @Override // p009l.z3m.InterfaceC1341a
    /* JADX INFO: renamed from: a */
    public int mo11114a() {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "rollbackNormalSessionRequest : param is null.", this.f9145j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f9138c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(mo11092E()));
        this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f9143h.f8959n) {
            CaptureRequest.Builder builder2 = this.f9138c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle[] meteringRectangleArr = z3m.f23333a;
            builder2.set(key, meteringRectangleArr);
            this.f9138c.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        m11152v0(this.f9138c);
        C0743g.m11169e("TECameraModeBase", "rollbackNormalSessionRequest");
        return 0;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m11115a0(int i) {
        this.f9154s = i;
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "setExposureCompensation : Capture Session is null", this.f9145j);
            return false;
        }
        Integer num = (Integer) this.f9138c.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null && num.intValue() == 0) {
            C0743g.m11174j("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
            return false;
        }
        if (this.f9143h.f8917K.f8991b == i) {
            C0743g.m11169e("TECameraModeBase", "setExposureCompensation return, no need to set");
            return false;
        }
        this.f9138c.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
        this.f9143h.f8917K.f8991b = i;
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (!c0742fM11152v0.f9170a) {
            C0743g.m11166b("TECameraModeBase", "setExposureCompensation failed: " + c0742fM11152v0.f9171b);
            this.f9141f.mo10848e(-413, -413, c0742fM11152v0.f9171b, this.f9145j);
        }
        return c0742fM11152v0.f9170a;
    }

    @Override // p009l.z3m.InterfaceC1341a
    /* JADX INFO: renamed from: b */
    public void mo11116b(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder) {
        if (cameraCaptureSession != this.f9139d || builder != this.f9138c) {
            C0743g.m11166b("TECameraModeBase", "updateRequestRepeating failed, session changed...");
            return;
        }
        C0742f c0742fM11152v0 = m11152v0(builder);
        if (c0742fM11152v0.f9170a) {
            return;
        }
        C0743g.m11166b("TECameraModeBase", "updateRequestRepeating failed: " + c0742fM11152v0.f9171b);
    }

    /* JADX INFO: renamed from: c0 */
    public void m11117c0(AbstractC0726c.b bVar) {
        this.f9158w = bVar;
    }

    @Override // p009l.z3m.InterfaceC1341a
    /* JADX INFO: renamed from: d */
    public int mo11118d() {
        if (this.f9138c == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "rollbackMeteringSessionRequest : param is null.", this.f9145j);
            return -100;
        }
        m11158y0(this.f9160y);
        this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f9143h.f8959n) {
            this.f9138c.set(CaptureRequest.CONTROL_AE_REGIONS, z3m.f23333a);
        }
        m11152v0(this.f9138c);
        C0743g.m11169e("TECameraModeBase", "rollbackMeteringSessionRequest");
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public void m11119d0(int i) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-430, -430, "Capture Session is null", this.f9145j);
        }
        if (i > m11096I()[1] || i < m11096I()[0]) {
            this.f9141f.mo10848e(-430, -430, "invalid iso", this.f9145j);
            return;
        }
        CaptureRequest.Builder builder = this.f9138c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f9138c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f9138c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f9138c.set(key2, 0);
        }
        this.f9138c.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.f9170a) {
            return;
        }
        C0743g.m11166b("TECameraModeBase", "setISO exception: " + c0742fM11152v0.f9171b);
        this.f9141f.mo10848e(-430, -430, c0742fM11152v0.f9171b, this.f9145j);
    }

    /* JADX INFO: renamed from: e */
    public Rect m11120e(int i, int i2, float f, float f2, int i3, int i4, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int i5;
        int i6;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i7;
        if (this.f9148m == null) {
            C0743g.m11166b("TECameraModeBase", "_calculateFocusRect, capture request is null, return");
            return null;
        }
        Rect rect = (Rect) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        C0743g.m11165a("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append("]");
        C0743g.m11169e("onAreaTouchEvent", sb.toString());
        TECameraSettings tECameraSettings = this.f9143h;
        TEFrameSizei tEFrameSizei = tECameraSettings.f8965q;
        int i8 = tEFrameSizei.width;
        int i9 = tEFrameSizei.height;
        TEFocusSettings.CoordinatesMode coordinatesMode2 = TEFocusSettings.CoordinatesMode.VIEW;
        if (coordinatesMode == coordinatesMode2 && (90 == (i7 = tECameraSettings.f8941e) || 270 == i7)) {
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
        Rect rect2 = (Rect) this.f9148m.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            C0743g.m11174j("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        C0743g.m11165a("TECameraModeBase", "cropRegion Rect: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom);
        int iWidth = rect.width();
        int iHeight = rect.height();
        TECameraSettings tECameraSettings2 = this.f9143h;
        TEFrameSizei tEFrameSizei2 = tECameraSettings2.f8965q;
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
        if (coordinatesMode == coordinatesMode2 && tECameraSettings2.f8939d == 1) {
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
        C0743g.m11169e("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "] x: " + f16 + " y: " + fHeight);
        return rect3;
    }

    /* JADX INFO: renamed from: e0 */
    public void m11121e0(float f) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-436, -436, "Capture Session is null", this.f9145j);
        }
        if (f < 0.0f) {
            this.f9141f.mo10848e(-436, -436, "invalid distance", this.f9145j);
            return;
        }
        this.f9138c.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.f9170a) {
            return;
        }
        C0743g.m11166b("TECameraModeBase", "setManualFocusDistance exception: " + c0742fM11152v0.f9171b);
        this.f9141f.mo10848e(-430, -430, c0742fM11152v0.f9171b, this.f9145j);
    }

    /* JADX INFO: renamed from: f */
    public void m11122f() {
        if (this.f9139d == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f9139d.abortCaptures();
        } catch (Exception e) {
            C0743g.m11166b("TECameraModeBase", "abort session failed, e: " + e.getMessage());
        }
        C0743g.m11169e("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: f0 */
    public int mo11123f0(int i, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: g0 */
    public void m11124g0(AbstractC0726c.d dVar) {
        this.f9156u = dVar;
    }

    /* JADX INFO: renamed from: h */
    public Rect m11125h(float f) {
        CameraCharacteristics cameraCharacteristics = this.f9136a;
        if (cameraCharacteristics == null || this.f9138c == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -420, "Camera info is null, may be you need reopen camera.", this.f9145j);
            return null;
        }
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
    public void m11126h0(AbstractC0726c.e eVar) {
        this.f9157v = eVar;
    }

    /* JADX INFO: renamed from: i */
    public Rect m11127i(float f) {
        Rect rect = this.f9118F;
        if (rect == null) {
            C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C0743g.m11166b("TECameraModeBase", "ActiveArraySize == null");
            this.f9141f.mo10848e(-420, -420, "ActiveArraySize == null.", this.f9145j);
            return null;
        }
        float f2 = this.f9152q;
        if (f2 <= 0.0f || f2 > this.f9151p) {
            C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C0743g.m11166b("TECameraModeBase", "factor invalid");
            this.f9141f.mo10848e(-420, -420, "factor invalid.", this.f9145j);
            return null;
        }
        float f3 = 1.0f / f2;
        int iWidth = rect.width() - Math.round(this.f9118F.width() * f3);
        int iHeight = this.f9118F.height() - Math.round(this.f9118F.height() * f3);
        int i = iWidth / 2;
        Rect rect2 = this.f9118F;
        int iM11054e = C0735f.m11054e(i, rect2.left, rect2.right);
        int i2 = iHeight / 2;
        Rect rect3 = this.f9118F;
        int iM11054e2 = C0735f.m11054e(i2, rect3.top, rect3.bottom);
        int iWidth2 = this.f9118F.width() - i;
        Rect rect4 = this.f9118F;
        int iM11054e3 = C0735f.m11054e(iWidth2, rect4.left, rect4.right);
        int iHeight2 = this.f9118F.height() - i2;
        Rect rect5 = this.f9118F;
        Rect rect6 = new Rect(iM11054e, iM11054e2, iM11054e3, C0735f.m11054e(iHeight2, rect5.top, rect5.bottom));
        CaptureRequest captureRequest = this.f9148m;
        if (captureRequest != null && rect6.equals((Rect) captureRequest.get(CaptureRequest.SCALER_CROP_REGION))) {
            C0743g.m11169e("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
        }
        return rect6;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo11128i0(int i) {
    }

    /* JADX INFO: renamed from: j */
    public int m11129j() {
        if (this.f9138c != null) {
            return this.f9144i.mo12079d();
        }
        this.f9141f.mo10848e(-100, -100, "rollbackNormalSessionRequest : param is null.", this.f9145j);
        return -100;
    }

    /* JADX INFO: renamed from: j0 */
    public void m11130j0(long j) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-431, -431, "Capture Session is null", this.f9145j);
        }
        if (j > m11101N()[1] || j < m11101N()[0]) {
            this.f9141f.mo10848e(-431, -431, "invalid shutter time", this.f9145j);
            return;
        }
        CaptureRequest.Builder builder = this.f9138c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f9138c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f9138c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f9138c.set(key2, 0);
        }
        this.f9138c.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.f9170a) {
            return;
        }
        C0743g.m11166b("TECameraModeBase", "setShutterTime exception: " + c0742fM11152v0.f9171b);
        this.f9141f.mo10848e(-431, -431, c0742fM11152v0.f9171b, this.f9145j);
    }

    /* JADX INFO: renamed from: k */
    public C0742f m11131k(CaptureRequest.Builder builder) {
        return m11133l(builder, this.f9135W, m11091D());
    }

    /* JADX INFO: renamed from: k0 */
    public void m11132k0(boolean z, String str) {
        if (this.f9138c == null || this.f9139d == null) {
            this.f9141f.mo10848e(-424, -424, "Capture Session is null", this.f9145j);
        }
        if (!Arrays.asList((int[]) this.f9136a.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(this.f9127O.get(str) == null ? 1 : this.f9127O.get(str).intValue()))) {
            this.f9141f.mo10848e(-424, -424, "invalid white balance", this.f9145j);
            return;
        }
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.f9170a) {
            return;
        }
        C0743g.m11166b("TECameraModeBase", "setWhiteBalance exception: " + c0742fM11152v0.f9171b);
        this.f9141f.mo10848e(-424, -424, c0742fM11152v0.f9171b, this.f9145j);
    }

    /* JADX INFO: renamed from: l */
    public C0742f m11133l(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C0742f c0742f = new C0742f();
        if (builder == null) {
            c0742f.f9171b = "CaptureRequest.Builder is null";
            C0743g.m11166b("TECameraModeBase", "capture: " + c0742f.f9171b);
            return c0742f;
        }
        if (this.f9139d == null) {
            c0742f.f9171b = "Capture Session is null";
            C0743g.m11166b("TECameraModeBase", "capture: " + c0742f.f9171b);
            return c0742f;
        }
        try {
            this.f9139d.capture(builder.build(), captureCallback, handler);
            c0742f.f9170a = true;
            return c0742f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c0742f.f9171b = e.getMessage();
            return c0742f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c0742f.f9171b = e2.getMessage();
            return c0742f;
        }
    }

    /* JADX INFO: renamed from: m */
    public C0742f m11134m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C0742f c0742f = new C0742f();
        if (captureRequest == null) {
            c0742f.f9171b = "CaptureRequest is null";
            C0743g.m11166b("TECameraModeBase", "capture: " + c0742f.f9171b);
            return c0742f;
        }
        if (this.f9139d == null) {
            c0742f.f9171b = "Capture Session is null";
            C0743g.m11166b("TECameraModeBase", "capture: " + c0742f.f9171b);
            return c0742f;
        }
        try {
            this.f9139d.capture(captureRequest, captureCallback, handler);
            c0742f.f9170a = true;
            return c0742f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c0742f.f9171b = e.getMessage();
            return c0742f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c0742f.f9171b = e2.getMessage();
            return c0742f;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public abstract int mo11135m0() throws Exception;

    /* JADX INFO: renamed from: n */
    public C0742f m11136n(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C0742f c0742f = new C0742f();
        if (this.f9139d == null) {
            c0742f.f9171b = "Capture Session is null";
            C0743g.m11166b("TECameraModeBase", "capture: " + c0742f.f9171b);
            return c0742f;
        }
        try {
            this.f9139d.captureBurst(list, captureCallback, handler);
            c0742f.f9170a = true;
            return c0742f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c0742f.f9171b = e.getMessage();
            return c0742f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c0742f.f9171b = e2.getMessage();
            return c0742f;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int mo11137n0() {
        return 0;
    }

    /* JADX INFO: renamed from: o0 */
    public int m11139o0(float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        CaptureRequest.Builder builder;
        Rect rectM11125h = m11125h(f);
        if (this.f9137b == null || this.f9148m == null || this.f9139d == null || (builder = this.f9138c) == null) {
            C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f9141f.mo10848e(-420, -420, "startZoom : Env is null", this.f9145j);
            return -100;
        }
        if (rectM11125h == null) {
            C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.f9141f.mo10848e(-420, -420, "zoom rect is null.", this.f9145j);
            return -420;
        }
        builder.set(CaptureRequest.SCALER_CROP_REGION, rectM11125h);
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (c0742fM11152v0.f9170a) {
            if (interfaceC0717p != null) {
                interfaceC0717p.onChange(this.f9143h.f8935b, f, true);
            }
            m11157y();
            return 0;
        }
        C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c0742fM11152v0.m11162a());
        this.f9141f.mo10848e(-420, -420, c0742fM11152v0.f9171b, this.f9145j);
        return -420;
    }

    /* JADX INFO: renamed from: p */
    public void m11140p() {
        if (this.f9143h.f8959n && this.f9142g.m10970T0() != null) {
            this.f9142g.m10970T0().m23729i(this.f9133U);
        }
        m11106S();
    }

    /* JADX INFO: renamed from: p0 */
    public int mo11141p0() {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void mo11142q() {
        TECameraSettings tECameraSettings;
        if (this.f9142g != null && (tECameraSettings = this.f9143h) != null && tECameraSettings.f8953k) {
            C0743g.m11169e("TECameraModeBase", "close session process...state = " + this.f9142g.m10971U0());
            if (this.f9142g.m10971U0() == 2) {
                this.f9142g.m10978b1();
            }
        }
        this.f9126N = false;
        if (m11090C() == null) {
            C0743g.m11166b("TECameraModeBase", "close session process...device is null");
            return;
        }
        if (this.f9139d == null) {
            C0743g.m11166b("TECameraModeBase", "close session process...session is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f9139d.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f9139d = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ajh0.m11494b("te_record_camera2_close_session_cost", jCurrentTimeMillis2);
        C0743g.m11170f("te_record_camera2_close_session_cost", Long.valueOf(jCurrentTimeMillis2));
        C0743g.m11169e("TECameraModeBase", "close session...consume = " + jCurrentTimeMillis2);
    }

    /* JADX INFO: renamed from: q0 */
    public C0742f m11143q0() {
        C0742f c0742f = new C0742f();
        if (this.f9139d == null) {
            c0742f.f9171b = "Capture Session is null";
            C0743g.m11166b("TECameraModeBase", "stopRepeating: " + c0742f.f9171b);
            return c0742f;
        }
        try {
            this.f9139d.stopRepeating();
            c0742f.f9170a = true;
            return c0742f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c0742f.f9171b = e.getMessage();
            return c0742f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c0742f.f9171b = e2.getMessage();
            return c0742f;
        }
    }

    /* JADX INFO: renamed from: r */
    public Range<Integer> mo11144r(Range<Integer> range) {
        return range;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo11145r0(int i, int i2, TECameraSettings.InterfaceC0713l interfaceC0713l) {
    }

    /* JADX INFO: renamed from: s */
    public CaptureRequest.Builder m11146s(int i) {
        if (i > 6 || i < 1) {
            C0743g.m11166b("TECameraModeBase", "createCaptureRequestBuilder, template invalid, must be [1, 6]");
            return null;
        }
        CameraDevice cameraDevice = this.f9145j;
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
    public void mo11147s0(TECameraSettings.InterfaceC0713l interfaceC0713l, int i) {
        if (this.f9124L) {
            this.f9138c.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f9138c.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo11148t(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        List arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            C0743g.m11169e("TECameraModeBase", "createSession by normally");
            this.f9145j.createCaptureSession(list, stateCallback, handler);
            return;
        }
        if (list != null || !this.f9143h.f8962o0 || (arrayList = this.f9131S) == null) {
            arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
        }
        mjh0.m18513a();
        SessionConfiguration sessionConfigurationM17895a = ljh0.m17895a(m11100M(list), arrayList, new ExecutorC0737a(handler), stateCallback);
        sessionConfigurationM17895a.setSessionParameters(this.f9138c.build());
        C0743g.m11169e("TECameraModeBase", "createSession by sessionConfiguration");
        this.f9145j.createCaptureSession(sessionConfigurationM17895a);
    }

    /* JADX INFO: renamed from: t0 */
    public int mo11149t0(boolean z) {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "toggleTorch : CaptureRequest.Builder is null", this.f9145j);
            this.f9141f.mo10850g(this.f9143h.f8935b, -100, z ? 1 : 0, "toggleTorch : CaptureRequest.Builder is null", this.f9145j);
            return -100;
        }
        builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
        this.f9141f.mo10848e(104, 0, "camera2 will change flash mode " + z, null);
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        this.f9141f.mo10848e(105, 0, "camera2 did change flash mode " + z, null);
        if (c0742fM11152v0.f9170a) {
            this.f9141f.mo10851h(this.f9143h.f8935b, 0, z ? 1 : 0, "camera torch success", this.f9145j);
            return 0;
        }
        C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + c0742fM11152v0.m11162a());
        this.f9141f.mo10848e(-417, -417, c0742fM11152v0.f9171b, this.f9145j);
        this.f9141f.mo10850g(this.f9143h.f8935b, -417, z ? 1 : 0, c0742fM11152v0.f9171b, this.f9145j);
        return -417;
    }

    /* JADX INFO: renamed from: u */
    public void m11150u() throws Exception {
        if (Build.VERSION.SDK_INT < 28 || this.f9145j == null) {
            return;
        }
        this.f9131S.clear();
        TECameraSettings tECameraSettings = this.f9143h;
        if (tECameraSettings.f8908B == 0 && tECameraSettings.f8935b == 2) {
            List<OutputConfiguration> list = this.f9131S;
            zih0.m25825a();
            list.add(yih0.m25378a(new Size(this.f9143h.m10855a().width, this.f9143h.m10855a().height), SurfaceTexture.class));
            Handler handlerM11091D = this.f9143h.f8953k ? m11091D() : this.f9146k;
            if (this.f9145j != null) {
                if (this.f9138c == null) {
                    boolean z = this.f9143h.f8911E.getBoolean("enablePreviewTemplate");
                    CameraDevice cameraDevice = this.f9145j;
                    if (z) {
                        this.f9138c = cameraDevice.createCaptureRequest(1);
                    } else {
                        this.f9138c = cameraDevice.createCaptureRequest(3);
                    }
                }
                this.f9138c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo11144r(new Range<>(Integer.valueOf(this.f9114B.min / this.f9143h.f8937c.fpsUnitFactor), Integer.valueOf(this.f9114B.max / this.f9143h.f8937c.fpsUnitFactor))));
                mo11148t(null, this.f9134V, handlerM11091D);
            }
        }
        this.f9129Q = false;
        this.f9130R = false;
    }

    /* JADX INFO: renamed from: u0 */
    public int mo11151u0() throws CameraAccessException {
        wjh0.m24289a("TECameraModeBase-updateCapture");
        if (this.f9142g.m10996K() == null || this.f9138c == null) {
            C0743g.m11166b("TECameraModeBase", "update capture failed");
            return -100;
        }
        if (this.f9137b.m23397r(this.f9136a) && m11102O()) {
            C0743g.m11169e("TECameraModeBase", "Stabilization Supported, toggle = " + this.f9143h.f8927U);
            if (this.f9137b.m23383a(this.f9136a, this.f9138c, this.f9143h.f8927U) == 0 && this.f9143h.f8927U) {
                this.f9141f.mo10848e(113, 1, "enable stablization", this.f9145j);
            }
        }
        this.f9138c.set(CaptureRequest.CONTROL_MODE, 1);
        m11083b0();
        Range<Integer> rangeMo11144r = mo11144r(new Range<>(Integer.valueOf(this.f9114B.min / this.f9143h.f8937c.fpsUnitFactor), Integer.valueOf(this.f9114B.max / this.f9143h.f8937c.fpsUnitFactor)));
        this.f9138c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeMo11144r);
        this.f9141f.mo10848e(121, 0, rangeMo11144r.toString(), null);
        this.f9138c.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f9154s));
        m11158y0(this.f9160y);
        if (Float.compare(this.f9143h.f8980x0, this.f9152q) != 0) {
            float fMin = Math.min(this.f9143h.f8980x0, this.f9151p);
            this.f9152q = fMin;
            Rect rectM11127i = m11127i(fMin);
            if (rectM11127i == null) {
                C0743g.m11174j("TECameraModeBase", "calculate default crop_region fail!");
            } else {
                this.f9138c.set(CaptureRequest.SCALER_CROP_REGION, rectM11127i);
            }
        }
        C0742f c0742fM11152v0 = m11152v0(this.f9138c);
        if (!c0742fM11152v0.f9170a) {
            C0743g.m11166b("TECameraModeBase", "first request failed: " + c0742fM11152v0.f9171b);
        }
        this.f9143h.f8941e = ((Integer) this.f9136a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f9142g.m10977a1(3);
        m11157y();
        C0743g.m11169e("TECameraModeBase", "send capture request..." + this.f9139d);
        this.f9141f.mo10844a(2, 0, 0, "TECamera2 preview", this.f9145j);
        wjh0.m24290b();
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public C0742f m11152v0(CaptureRequest.Builder builder) {
        return m11154w0(builder, this.f9135W);
    }

    /* JADX INFO: renamed from: w */
    public int m11153w() {
        CaptureRequest.Builder builder = this.f9138c;
        if (builder == null) {
            this.f9141f.mo10846c(this.f9143h.f8935b, -100, "rollbackNormalSessionRequest : param is null.", this.f9145j);
            return -100;
        }
        this.f9144i.mo12076a(builder);
        mo11116b(this.f9139d, this.f9138c);
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public C0742f m11154w0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return m11156x0(builder, captureCallback, m11091D());
    }

    /* JADX INFO: renamed from: x */
    public void m11155x(boolean z) {
        if (!z && this.f9152q != 1.0f) {
            this.f9152q = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (this.f9138c == null || this.f9139d == null) {
                    this.f9141f.mo10846c(this.f9143h.f8935b, -100, "enableMulticamZoom : Capture Session is null", this.f9145j);
                    return;
                }
                this.f9138c.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f9152q));
                C0742f c0742fM11152v0 = m11152v0(this.f9138c);
                if (!c0742fM11152v0.f9170a) {
                    C0743g.m11166b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c0742fM11152v0.m11162a());
                    this.f9141f.mo10848e(-420, -420, c0742fM11152v0.f9171b, this.f9145j);
                    return;
                }
            }
            this.f9155t = m11127i(this.f9152q);
        }
        this.f9125M = z;
    }

    /* JADX INFO: renamed from: x0 */
    public C0742f m11156x0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        wjh0.m24289a("TECameraModeBase-updatePreview");
        C0742f c0742f = new C0742f();
        if (builder == null) {
            c0742f.f9171b = "CaptureRequest.Builder is null";
            C0743g.m11166b("TECameraModeBase", "updatePreview: " + c0742f.f9171b);
            return c0742f;
        }
        if (this.f9139d == null) {
            c0742f.f9171b = "Capture Session is null";
            C0743g.m11166b("TECameraModeBase", "updatePreview: " + c0742f.f9171b);
            return c0742f;
        }
        CaptureRequest captureRequestBuild = builder.build();
        this.f9148m = captureRequestBuild;
        try {
            this.f9139d.setRepeatingRequest(captureRequestBuild, captureCallback, handler);
            c0742f.f9170a = true;
            this.f9126N = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c0742f.f9171b = e.getMessage();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            c0742f.f9171b = e2.getMessage();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            c0742f.f9171b = e3.getMessage();
            this.f9126N = false;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            c0742f.f9171b = e4.getMessage();
        }
        wjh0.m24290b();
        return c0742f;
    }

    /* JADX INFO: renamed from: y */
    public void m11157y() {
        Bundle bundle;
        wjh0.m24289a("TECameraModeBase-fillFeatures");
        if (this.f9142g.m10992A().containsKey(this.f9143h.f8914H)) {
            bundle = this.f9142g.m10992A().get(this.f9143h.f8914H);
        } else {
            bundle = new Bundle();
            this.f9142g.m10992A().put(this.f9143h.f8914H, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f9143h.f8965q);
        if (this.f9136a != null && this.f9148m != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.mActiveSize = (Rect) this.f9136a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.mCropSize = (Rect) this.f9148m.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.mMaxRegionsAE = ((Integer) this.f9136a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.mMaxRegionsAF = ((Integer) this.f9136a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.f9143h.f8941e);
        wjh0.m24290b();
    }

    /* JADX INFO: renamed from: y0 */
    public void m11158y0(int i) {
        if (i == 1) {
            if (this.f9143h.f8939d == 1) {
                m11085l0(this.f9138c);
                C0743g.m11169e("TECameraModeBase", "use faceae for front");
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.f9143h.f8939d == 0) {
                m11085l0(this.f9138c);
                C0743g.m11169e("TECameraModeBase", "use faceae for rear");
                return;
            }
            return;
        }
        if (i == 3) {
            m11085l0(this.f9138c);
            C0743g.m11169e("TECameraModeBase", "use faceae for all");
        }
    }

    /* JADX INFO: renamed from: z */
    public int mo11159z(TEFocusSettings tEFocusSettings) {
        if (this.f9143h.f8957m) {
            return m11086v(tEFocusSettings);
        }
        this.f9113A = tEFocusSettings;
        this.f9144i.m15862h(tEFocusSettings);
        this.f9144i.m15861g(this.f9143h);
        if (this.f9137b == null || this.f9139d == null || this.f9138c == null) {
            C0743g.m11174j("TECameraModeBase", "Env is null");
            this.f9113A.m10871g().mo10885a(-100, this.f9143h.f8939d, "Env is null");
            return -100;
        }
        boolean zM23395p = this.f9137b.m23395p(this.f9136a);
        boolean zM23392m = this.f9137b.m23392m(this.f9136a);
        if (!zM23392m && !zM23395p) {
            C0743g.m11174j("TECameraModeBase", "do not support MeteringAreaAF!");
            this.f9113A.m10871g().mo10885a(-412, this.f9143h.f8939d, "do not support MeteringAreaAF!");
            return -412;
        }
        boolean zM10878n = tEFocusSettings.m10878n();
        boolean z = this.f9149n.get();
        boolean z2 = (zM23392m && this.f9113A.m10879o()) ? false : true;
        C0743g.m11165a("TECameraModeBase", "focusAtPoint++");
        if (z && !z2) {
            this.f9132T.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C0743g.m11165a("TECameraModeBase", "cancel previous touch af..");
        }
        TEFocusSettings tEFocusSettings2 = this.f9113A;
        TECameraSettings tECameraSettings = this.f9143h;
        Rect rectM10865a = tEFocusSettings2.m10865a(tECameraSettings.f8941e, tECameraSettings.f8939d == 1);
        if (rectM10865a == null) {
            rectM10865a = m11120e(this.f9113A.m10874j(), this.f9113A.m10873i(), this.f9113A.m10875k(), this.f9113A.m10876l(), this.f9143h.f8941e, 0, this.f9113A.m10869e());
        }
        TEFocusSettings tEFocusSettings3 = this.f9113A;
        TECameraSettings tECameraSettings2 = this.f9143h;
        Rect rectM10866b = tEFocusSettings3.m10866b(tECameraSettings2.f8941e, tECameraSettings2.f8939d == 1);
        if (rectM10866b == null) {
            rectM10866b = m11120e(this.f9113A.m10874j(), this.f9113A.m10873i(), this.f9113A.m10875k(), this.f9113A.m10876l(), this.f9143h.f8941e, 1, this.f9113A.m10869e());
        }
        if (!C0735f.m11071v(rectM10865a) || !C0735f.m11071v(rectM10866b)) {
            C0743g.m11166b("TECameraModeBase", "focusRect or meteringRect is not valid!");
            this.f9113A.m10871g().mo10885a(-100, this.f9143h.f8939d, "focusRect or meteringRect is not valid!");
            return -100;
        }
        if (this.f9113A.m10880p() && zM23395p) {
            this.f9144i.mo14484f(this.f9138c, rectM10866b);
        }
        if (z2) {
            if (zM23395p && this.f9113A.m10880p()) {
                CaptureRequest.Builder builder = this.f9138c;
                m11156x0(builder, this.f9144i.mo12078c(builder, !z2), this.f9146k);
                this.f9149n.set(false);
                if (this.f9143h.f8959n) {
                    this.f9142g.m10970T0().m23728h(this.f9133U, this.f9146k);
                }
            }
            return -412;
        }
        this.f9149n.set(true);
        this.f9144i.mo14483e(this.f9138c, rectM10865a);
        if (this.f9143h.f8959n) {
            CaptureRequest.Builder builder2 = this.f9138c;
            C0743g.m11169e("TECameraModeBase", "focusAtPoint, capture to trigger focus, response = " + m11133l(builder2, this.f9144i.mo12077b(builder2, this.f9149n, zM10878n), this.f9146k).f9170a);
            this.f9138c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        CaptureRequest.Builder builder3 = this.f9138c;
        C0742f c0742fM11156x0 = m11156x0(builder3, this.f9144i.mo12077b(builder3, this.f9149n, zM10878n), this.f9146k);
        if (!c0742fM11156x0.f9170a) {
            this.f9149n.set(false);
            this.f9113A.m10871g().mo10885a(-108, this.f9143h.f8939d, c0742fM11156x0.f9171b);
            this.f9141f.mo10848e(-411, -411, c0742fM11156x0.f9171b, this.f9145j);
            return -108;
        }
        if (this.f9143h.f8959n && !zM10878n) {
            this.f9142g.m10970T0().m23728h(this.f9133U, this.f9146k);
        }
        C0743g.m11169e("TECameraModeBase", "focusAtPoint, done");
        return 0;
    }

    /* JADX INFO: renamed from: z0 */
    public void m11160z0() {
        C0725b c0725b = this.f9142g;
        if (c0725b != null) {
            c0725b.m10978b1();
            return;
        }
        C0743g.m11165a("TECameraModeBase", "waitCameraTaskDoneOrTimeout failed, " + C0743g.m11168d());
    }

    /* JADX INFO: renamed from: o */
    public void mo11138o(ti3 ti3Var, int i, TECameraSettings.InterfaceC0704c interfaceC0704c) {
    }
}
