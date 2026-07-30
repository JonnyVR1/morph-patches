package com.p074ss.android.ttvecamera.framework;

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
import com.p051p1.mobile.putong.data.User;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.C13486b;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TECameraSettings;
import com.p074ss.android.ttvecamera.TEFocusParameters;
import com.p074ss.android.ttvecamera.TEFocusSettings;
import com.p074ss.android.ttvecamera.TEFrameRateRange;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.arh0;
import p153l.crh0;
import p153l.dsh0;
import p153l.frh0;
import p153l.grh0;
import p153l.hj3;
import p153l.hrh0;
import p153l.jrh0;
import p153l.lrh0;
import p153l.lwk;
import p153l.o6m;
import p153l.orh0;
import p153l.p6m;
import p153l.srh0;
import p153l.trh0;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public abstract class TECameraModeBase implements o6m, p6m.InterfaceC19309a {

    /* JADX INFO: renamed from: A */
    protected TEFocusSettings f56355A;

    /* JADX INFO: renamed from: C */
    protected int f56357C;

    /* JADX INFO: renamed from: F */
    private Rect f56360F;

    /* JADX INFO: renamed from: L */
    protected boolean f56366L;

    /* JADX INFO: renamed from: a */
    public CameraCharacteristics f56378a;

    /* JADX INFO: renamed from: b */
    protected crh0 f56379b;

    /* JADX INFO: renamed from: c */
    protected CaptureRequest.Builder f56380c;

    /* JADX INFO: renamed from: d */
    protected volatile CameraCaptureSession f56381d;

    /* JADX INFO: renamed from: e */
    protected CameraManager f56382e;

    /* JADX INFO: renamed from: f */
    protected AbstractC13487c.a f56383f;

    /* JADX INFO: renamed from: g */
    protected C13486b f56384g;

    /* JADX INFO: renamed from: h */
    protected TECameraSettings f56385h;

    /* JADX INFO: renamed from: i */
    protected orh0 f56386i;

    /* JADX INFO: renamed from: j */
    protected CameraDevice f56387j;

    /* JADX INFO: renamed from: k */
    protected Handler f56388k;

    /* JADX INFO: renamed from: m */
    public CaptureRequest f56390m;

    /* JADX INFO: renamed from: o */
    protected boolean f56392o;

    /* JADX INFO: renamed from: u */
    protected AbstractC13487c.d f56398u;

    /* JADX INFO: renamed from: w */
    protected AbstractC13487c.b f56400w;

    /* JADX INFO: renamed from: x */
    protected int[] f56401x;

    /* JADX INFO: renamed from: l */
    public StreamConfigurationMap f56389l = null;

    /* JADX INFO: renamed from: n */
    protected AtomicBoolean f56391n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p */
    protected float f56393p = 0.0f;

    /* JADX INFO: renamed from: q */
    protected float f56394q = 1.0f;

    /* JADX INFO: renamed from: r */
    protected Range<Float> f56395r = null;

    /* JADX INFO: renamed from: s */
    protected int f56396s = 0;

    /* JADX INFO: renamed from: t */
    protected Rect f56397t = null;

    /* JADX INFO: renamed from: v */
    protected AbstractC13487c.e f56399v = null;

    /* JADX INFO: renamed from: y */
    protected int f56402y = 0;

    /* JADX INFO: renamed from: z */
    protected CaptureRequest.Key<?> f56403z = null;

    /* JADX INFO: renamed from: B */
    protected TEFrameRateRange f56356B = new TEFrameRateRange(7, 30);

    /* JADX INFO: renamed from: D */
    protected Handler f56358D = null;

    /* JADX INFO: renamed from: E */
    private HandlerThread f56359E = null;

    /* JADX INFO: renamed from: G */
    protected volatile boolean f56361G = false;

    /* JADX INFO: renamed from: H */
    protected long f56362H = 0;

    /* JADX INFO: renamed from: I */
    protected long f56363I = 0;

    /* JADX INFO: renamed from: J */
    protected long f56364J = 0;

    /* JADX INFO: renamed from: K */
    protected int f56365K = 0;

    /* JADX INFO: renamed from: M */
    private boolean f56367M = false;

    /* JADX INFO: renamed from: N */
    protected volatile boolean f56368N = false;

    /* JADX INFO: renamed from: O */
    private Map<String, Integer> f56369O = new HashMap<String, Integer>() { // from class: com.ss.android.ttvecamera.framework.TECameraModeBase.1
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
    protected HashMap<Integer, String> f56370P = new HashMap<>();

    /* JADX INFO: renamed from: Q */
    protected boolean f56371Q = false;

    /* JADX INFO: renamed from: R */
    protected boolean f56372R = false;

    /* JADX INFO: renamed from: S */
    protected List<OutputConfiguration> f56373S = new ArrayList();

    /* JADX INFO: renamed from: T */
    private Runnable f56374T = new RunnableC13499b();

    /* JADX INFO: renamed from: U */
    private final lwk.InterfaceC18472b f56375U = new C13500c();

    /* JADX INFO: renamed from: V */
    protected CameraCaptureSession.StateCallback f56376V = new C13501d();

    /* JADX INFO: renamed from: W */
    protected CameraCaptureSession.CaptureCallback f56377W = new C13502e();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$a */
    public class ExecutorC13498a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f56404a;

        public ExecutorC13498a(Handler handler) {
            this.f56404a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f56404a;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$b */
    public class RunnableC13499b implements Runnable {
        public RunnableC13499b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraModeBase.this.f56386i.mo141883d();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$c */
    public class C13500c implements lwk.InterfaceC18472b {
        public C13500c() {
        }

        @Override // p153l.lwk.InterfaceC18472b
        /* JADX INFO: renamed from: a */
        public void mo81993a() {
            C13486b c13486b;
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f56385h.f56201n && (c13486b = tECameraModeBase.f56384g) != null && c13486b.m81803U0() == 3) {
                C13504g.m82001e("TECameraModeBase", "gyro onChange set focus mode to continuous focus.");
                TECameraModeBase.this.mo81950d();
                TECameraModeBase.this.mo81946a();
                if (TECameraModeBase.this.f56384g.m81802T0() != null) {
                    TECameraModeBase.this.f56384g.m81802T0().m156065i(TECameraModeBase.this.f56375U);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$d */
    public class C13501d extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f56409a;

            public a(int i) {
                this.f56409a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                tECameraModeBase.f56383f.mo81678c(tECameraModeBase.f56385h.f56177b, this.f56409a, "updateCapture : something wrong.", tECameraModeBase.f56387j);
            }
        }

        public C13501d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            C13504g.m81998b("TECameraModeBase", "onConfigureFailed...");
            TECameraModeBase.this.m81936Q();
            hrh0.m136853b("te_record_camera2_create_session_ret", 0L);
            C13504g.m82002f("te_record_camera2_create_session_ret", 0);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            dsh0.m117758a("TECameraModeBase-onConfigured");
            long jCurrentTimeMillis = System.currentTimeMillis();
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            long j = jCurrentTimeMillis - tECameraModeBase.f56362H;
            tECameraModeBase.f56363I = j;
            tECameraModeBase.f56364J = jCurrentTimeMillis;
            tECameraModeBase.f56361G = false;
            TECameraModeBase.this.f56381d = cameraCaptureSession;
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f56385h.f56204o0 && Build.VERSION.SDK_INT >= 28) {
                try {
                    if (!tECameraModeBase2.f56372R && tECameraModeBase2.f56384g.m81828K() != null && TECameraModeBase.this.f56384g.m81828K().m146740d() != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(TECameraModeBase.this.f56384g.m81828K().m146740d());
                        for (int i = 0; i < arrayList.size(); i++) {
                            TECameraModeBase.this.f56373S.get(i).addSurface((Surface) arrayList.get(i));
                            TECameraModeBase.this.f56372R = true;
                        }
                    }
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    if (!tECameraModeBase3.f56371Q && tECameraModeBase3.f56372R) {
                        tECameraModeBase3.f56381d.finalizeOutputConfigurations(TECameraModeBase.this.f56373S);
                        TECameraModeBase.this.f56371Q = true;
                        C13504g.m81997a("TECameraModeBase", "finalizeOutputConfigurations in session onConfigured");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            TECameraModeBase tECameraModeBase4 = TECameraModeBase.this;
            if (!tECameraModeBase4.f56385h.f56204o0 || tECameraModeBase4.f56371Q) {
                try {
                    int iMo81983u0 = tECameraModeBase4.mo81983u0();
                    if (iMo81983u0 != 0) {
                        TECameraModeBase.this.m81936Q();
                        a aVar = new a(iMo81983u0);
                        TECameraModeBase tECameraModeBase5 = TECameraModeBase.this;
                        if (tECameraModeBase5.f56385h.f56195k) {
                            tECameraModeBase5.f56388k.post(aVar);
                        } else {
                            aVar.run();
                        }
                    }
                } catch (Exception e2) {
                    TECameraModeBase.this.m81936Q();
                    e2.printStackTrace();
                }
            }
            hrh0.m136853b("te_record_camera2_create_session_ret", 1L);
            hrh0.m136853b("te_record_camera2_create_session_cost", j);
            C13504g.m82002f("te_record_camera2_create_session_ret", 1);
            C13504g.m82002f("te_record_camera2_create_session_cost", Long.valueOf(j));
            dsh0.m117759b();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$e */
    public class C13502e extends CameraCaptureSession.CaptureCallback {
        public C13502e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (totalCaptureResult != null) {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                CaptureResult.Key key = CaptureResult.SENSOR_SENSITIVITY;
                tECameraModeBase.f56357C = totalCaptureResult.get(key) == null ? -1 : ((Integer) totalCaptureResult.get(key)).intValue();
            }
            if (!TECameraModeBase.this.f56361G) {
                TECameraModeBase.this.m81936Q();
                TECameraModeBase.this.f56361G = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - TECameraModeBase.this.f56364J;
                C13504g.m82001e("TECameraModeBase", "first preview frame callback arrived! consume = " + jCurrentTimeMillis + ", session consume: " + TECameraModeBase.this.f56363I);
                hrh0.m136853b("te_record_camera2_set_repeating_request_cost", jCurrentTimeMillis);
                C13504g.m82002f("te_record_camera2_set_repeating_request_cost", Long.valueOf(jCurrentTimeMillis));
            }
            if (TECameraModeBase.this.f56385h.f56202n0) {
                TECameraFrame.C13406d c13406d = new TECameraFrame.C13406d();
                c13406d.f56003c = System.currentTimeMillis();
                c13406d.f56004d = totalCaptureResult;
                c13406d.f56005e = TECameraModeBase.this.m81928I()[1];
                c13406d.f56006f = TECameraModeBase.this.m81928I()[0];
                TECameraModeBase.this.f56384g.m81828K().m146742f().m141826n(c13406d);
            }
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f56392o) {
                tECameraModeBase2.f56392o = C13496f.m81892k(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f56385h.f56188g0 && !tECameraModeBase.f56361G && captureFailure.getReason() == 0) {
                TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
                int i = tECameraModeBase2.f56365K + 1;
                tECameraModeBase2.f56365K = i;
                tECameraModeBase2.f56385h.getClass();
                if (i >= 5) {
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    tECameraModeBase3.f56383f.mo81677b(tECameraModeBase3.f56385h.f56177b, -437, "Camera previewing failed", tECameraModeBase3.f56387j);
                }
            }
            C13504g.m81998b("TECameraModeBase", "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.framework.TECameraModeBase$f */
    public static class C13503f {

        /* JADX INFO: renamed from: a */
        boolean f56412a = false;

        /* JADX INFO: renamed from: b */
        String f56413b = "";

        /* JADX INFO: renamed from: a */
        public String m81994a() {
            return this.f56413b;
        }

        /* JADX INFO: renamed from: b */
        public Exception m81995b() {
            return new Exception(this.f56413b);
        }

        /* JADX INFO: renamed from: c */
        public boolean m81996c() {
            return this.f56412a;
        }

        public String toString() {
            return "Response{isSuccess=" + this.f56412a + ", errMsg='" + this.f56413b + "'}";
        }
    }

    public TECameraModeBase(@NonNull C13486b c13486b, @NonNull Context context, Handler handler) {
        this.f56392o = true;
        this.f56366L = false;
        this.f56384g = c13486b;
        TECameraSettings tECameraSettingsM81846u = c13486b.m81846u();
        this.f56385h = tECameraSettingsM81846u;
        this.f56379b = crh0.m112051c(context, tECameraSettingsM81846u.f56177b);
        this.f56383f = this.f56384g.m81845t();
        this.f56388k = handler;
        this.f56392o = this.f56385h.f56193j;
        this.f56366L = false;
    }

    /* JADX INFO: renamed from: b0 */
    private void m81915b0() {
        crh0 crh0Var = this.f56379b;
        CameraCharacteristics cameraCharacteristics = this.f56378a;
        TECameraSettings tECameraSettings = this.f56385h;
        TEFrameRateRange tEFrameRateRange = tECameraSettings.f56179c;
        this.f56356B = crh0Var.m112054d(cameraCharacteristics, tEFrameRateRange.min, tEFrameRateRange.max, tECameraSettings.f56163O, tECameraSettings.f56181d);
        C13504g.m82001e("TECameraModeBase", "Set Fps Range: " + this.f56356B.toString() + ", strategy: " + this.f56385h.f56163O);
    }

    /* JADX INFO: renamed from: l0 */
    private void m81917l0(CaptureRequest.Builder builder) {
        int[] iArr = this.f56401x;
        if (iArr == null) {
            C13504g.m81997a("TECameraModeBase", "FaceDetect is not supported!");
            return;
        }
        if (C13496f.m81887f(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (C13496f.m81887f(this.f56401x, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (C13496f.m81887f(this.f56401x, 0)) {
            C13504g.m82006j("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    /* JADX INFO: renamed from: v */
    private int m81918v(TEFocusSettings tEFocusSettings) {
        Rect rectM81698b;
        C13504g.m81997a("TECameraModeBase", "settings = " + tEFocusSettings);
        this.f56355A = tEFocusSettings;
        this.f56386i.m168922h(tEFocusSettings);
        this.f56386i.m168921g(this.f56385h);
        if (this.f56379b == null || this.f56381d == null || this.f56380c == null || this.f56355A == null) {
            C13504g.m82006j("TECameraModeBase", "Env is null");
            TEFocusSettings tEFocusSettings2 = this.f56355A;
            if (tEFocusSettings2 != null) {
                tEFocusSettings2.m81703g().mo81717a(-100, this.f56385h.f56181d, "Env is null");
            }
            return -100;
        }
        boolean zM112066p = this.f56379b.m112066p(this.f56378a);
        boolean zM112063m = this.f56379b.m112063m(this.f56378a);
        int i = -412;
        if (!zM112063m && !zM112066p) {
            C13504g.m82006j("TECameraModeBase", "not support focus and meter!");
            this.f56355A.m81703g().mo81717a(-412, this.f56385h.f56181d, "not support focus and meter!");
            return -412;
        }
        boolean z = this.f56391n.get();
        boolean z2 = (zM112063m && this.f56355A.m81711o()) ? false : true;
        if (z && !z2) {
            this.f56374T.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C13504g.m82001e("TECameraModeBase", "cancel previous touch af..");
        }
        boolean z3 = zM112066p && this.f56355A.m81712p();
        Object obj = null;
        if (z3) {
            TEFocusSettings tEFocusSettings3 = this.f56355A;
            TECameraSettings tECameraSettings = this.f56385h;
            rectM81698b = tEFocusSettings3.m81698b(tECameraSettings.f56183e, tECameraSettings.f56181d == 1);
            if (rectM81698b == null) {
                obj = null;
                rectM81698b = m81952e(this.f56355A.m81706j(), this.f56355A.m81705i(), this.f56355A.m81707k(), this.f56355A.m81708l(), this.f56385h.f56183e, 1, this.f56355A.m81701e());
            }
            if (!C13496f.m81903v(rectM81698b)) {
                C13504g.m81998b("TECameraModeBase", "meteringRect is not valid!");
                this.f56355A.m81703g().mo81717a(-100, this.f56385h.f56181d, "meteringRect is not valid!");
                return -100;
            }
            this.f56386i.mo159704f(this.f56380c, rectM81698b);
            if (z2) {
                CaptureRequest.Builder builder = this.f56380c;
                m81988x0(builder, this.f56386i.mo141882c(builder, false), this.f56388k);
                this.f56391n.set(false);
                return 0;
            }
        } else {
            i = -412;
            rectM81698b = null;
        }
        if (!zM112063m || !this.f56355A.m81711o()) {
            return i;
        }
        TEFocusSettings tEFocusSettings4 = this.f56355A;
        TECameraSettings tECameraSettings2 = this.f56385h;
        Rect rectM81697a = tEFocusSettings4.m81697a(tECameraSettings2.f56183e, tECameraSettings2.f56181d == 1);
        if (rectM81697a == null) {
            rectM81697a = m81952e(this.f56355A.m81706j(), this.f56355A.m81705i(), this.f56355A.m81707k(), this.f56355A.m81708l(), this.f56385h.f56183e, 0, this.f56355A.m81701e());
        }
        if (!C13496f.m81903v(rectM81697a)) {
            C13504g.m81998b("TECameraModeBase", "focusRect is not valid!");
            this.f56355A.m81703g().mo81717a(-100, this.f56385h.f56181d, "focusRect is not valid!");
            return -100;
        }
        this.f56391n.set(true);
        if (this.f56366L) {
            boolean zM81709m = tEFocusSettings.m81709m();
            CaptureRequest.Builder builder2 = this.f56380c;
            if (zM81709m) {
                builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f56380c.set(CaptureRequest.FLASH_MODE, 1);
            } else {
                builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f56380c.set(CaptureRequest.FLASH_MODE, 0);
            }
        }
        this.f56386i.mo159703e(this.f56380c, rectM81697a);
        m81963k(this.f56380c);
        this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        this.f56380c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectM81697a, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        if (rectM81698b != null) {
            this.f56380c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rectM81698b, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
        }
        this.f56380c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        CaptureRequest.Builder builder3 = this.f56380c;
        C13503f c13503fM81988x0 = m81988x0(builder3, this.f56386i.mo141881b(builder3, this.f56391n, tEFocusSettings.m81710n()), this.f56388k);
        if (c13503fM81988x0.f56412a) {
            return 0;
        }
        this.f56391n.set(false);
        TEFocusSettings tEFocusSettings5 = this.f56355A;
        if (tEFocusSettings5 != null) {
            tEFocusSettings5.m81703g().mo81717a(-108, this.f56385h.f56181d, c13503fM81988x0.f56413b);
        }
        this.f56383f.mo81680e(-411, -411, c13503fM81988x0.f56413b, null);
        return -108;
    }

    /* JADX INFO: renamed from: A */
    public float[] m81919A() {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-432, -432, "Capture Session is null", this.f56387j);
        }
        float[] fArr = (float[]) this.f56378a.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        return fArr == null ? new float[]{-1.0f, -1.0f} : fArr;
    }

    /* JADX INFO: renamed from: A0 */
    public void m81920A0(float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        if (this.f56381d == null || this.f56390m == null || this.f56380c == null) {
            C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f56383f.mo81678c(this.f56385h.f56177b, -420, "Camera info is null, may be you need reopen camera.", this.f56387j);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30 && this.f56367M && this.f56379b.m112065o(this.f56378a)) {
            Range<Float> range = this.f56395r;
            if (range != null) {
                Float f2 = (Float) range.getUpper();
                Float f3 = (Float) this.f56395r.getLower();
                if (this.f56394q * f >= f2.floatValue() && f > 1.0f) {
                    this.f56394q = f2.floatValue();
                } else if (this.f56394q * f > f3.floatValue() || f > 1.0f) {
                    this.f56394q *= f;
                    C13504g.m81998b("TECameraModeBase", "zoom ratio = " + this.f56394q);
                } else {
                    this.f56394q = f3.floatValue();
                }
            }
            this.f56380c.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f56394q));
            C13503f c13503fM81984v0 = m81984v0(this.f56380c);
            if (!c13503fM81984v0.f56412a) {
                C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13503fM81984v0.m81994a());
                this.f56383f.mo81680e(-420, -420, c13503fM81984v0.f56413b, this.f56387j);
                return;
            }
        } else {
            if (this.f56394q < this.f56393p || f <= 1.0f) {
                Rect rect = this.f56397t;
                if (rect == null || !rect.equals(this.f56360F) || f > 1.0f) {
                    C13504g.m81997a("TECameraModeBase", "mNowZoom = " + this.f56394q);
                    this.f56394q = this.f56394q * f;
                } else {
                    C13504g.m81997a("TECameraModeBase", "mZoomSize = " + this.f56397t + ";mActiveArraySize = " + this.f56360F + ";factor = " + f);
                    this.f56394q = 1.0f;
                }
            } else {
                C13504g.m81997a("TECameraModeBase", "mNowZoom = " + this.f56394q + ";mMaxZoom = " + this.f56393p + ";factor = " + f);
                this.f56394q = this.f56393p;
            }
            Rect rectM81959i = m81959i(this.f56394q);
            if (rectM81959i == null) {
                return;
            }
            this.f56380c.set(CaptureRequest.SCALER_CROP_REGION, rectM81959i);
            C13503f c13503fM81984v1 = m81984v0(this.f56380c);
            if (!c13503fM81984v1.f56412a) {
                C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13503fM81984v1.m81994a());
                this.f56383f.mo81680e(-420, -420, c13503fM81984v1.f56413b, this.f56387j);
                return;
            }
            this.f56397t = rectM81959i;
        }
        if (interfaceC13478p != null) {
            interfaceC13478p.onChange(this.f56385h.f56177b, this.f56394q, true);
        }
        m81989y();
    }

    /* JADX INFO: renamed from: B */
    public int[] mo81921B() {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public Object m81922C() {
        return this.f56387j;
    }

    /* JADX INFO: renamed from: D */
    public Handler m81923D() {
        if (this.f56359E == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.f56359E = handlerThread;
            handlerThread.start();
            C13504g.m82001e("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.f56358D == null) {
            this.f56358D = new Handler(this.f56359E.getLooper());
        }
        return this.f56358D;
    }

    /* JADX INFO: renamed from: E */
    public int mo81924E() {
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public float[] m81925F() {
        if (this.f56379b == null || this.f56390m == null || this.f56381d == null || this.f56380c == null) {
            C13504g.m82006j("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.f56380c.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int iAbs = StrictMath.abs(rect.right - rect.left);
        int iAbs2 = StrictMath.abs(rect.top - rect.bottom);
        TEFrameSizei tEFrameSizei = this.f56385h.f56207q;
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
        C13504g.m81997a("TECameraModeBase", "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    /* JADX INFO: renamed from: G */
    public int mo81926G() {
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public int m81927H() {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-430, -430, "Capture Session is null", this.f56387j);
        }
        return this.f56357C;
    }

    /* JADX INFO: renamed from: I */
    public int[] m81928I() {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-430, -430, "Capture Session is null", this.f56387j);
        }
        Range range = (Range) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) ? new int[]{-1, -1} : new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    /* JADX INFO: renamed from: J */
    public float m81929J() {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-435, -435, "Capture Session is null", this.f56387j);
        }
        CameraCharacteristics cameraCharacteristics = this.f56378a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        float fFloatValue = cameraCharacteristics.get(key) == null ? -1.0f : ((Float) this.f56378a.get(key)).floatValue();
        if (fFloatValue >= 0.0f) {
            return fFloatValue;
        }
        this.f56383f.mo81680e(-435, -435, "can not get manual focus ability", this.f56387j);
        return -1.0f;
    }

    /* JADX INFO: renamed from: K */
    public int[] mo81930K() {
        return null;
    }

    /* JADX INFO: renamed from: L */
    public int[] m81931L() {
        Range range;
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    /* JADX INFO: renamed from: M */
    public int m81932M(List<Surface> list) {
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public long[] m81933N() {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-431, -431, "Capture Session is null", this.f56387j);
        }
        Range range = (Range) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        return range == null ? new long[]{-1, -1} : new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    /* JADX INFO: renamed from: O */
    public boolean m81934O() {
        return true;
    }

    /* JADX INFO: renamed from: P */
    public int mo81935P(String str, int i) throws CameraAccessException {
        dsh0.m117758a("TECameraModeBase-openCamera");
        CameraCharacteristics cameraCharacteristics = this.f56378a;
        if (cameraCharacteristics == null) {
            C13504g.m81997a("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -439;
        }
        if (!this.f56379b.m112064n(cameraCharacteristics, i)) {
            return WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_INVALID_STATE;
        }
        this.f56385h.f56183e = ((Integer) this.f56378a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f56378a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        this.f56389l = streamConfigurationMap;
        if (streamConfigurationMap == null) {
            return -439;
        }
        crh0 crh0Var = this.f56379b;
        CameraCharacteristics cameraCharacteristics2 = this.f56378a;
        TECameraSettings tECameraSettings = this.f56385h;
        this.f56393p = crh0Var.m112055e(cameraCharacteristics2, tECameraSettings.f56177b, tECameraSettings.f56205p);
        TECameraSettings tECameraSettings2 = this.f56385h;
        if (tECameraSettings2.f56214t0 == -1.0f || tECameraSettings2.f56216u0 == -1.0f) {
            this.f56395r = this.f56379b.m112060j(this.f56378a);
        } else {
            this.f56395r = new Range<>(Float.valueOf(this.f56385h.f56216u0), Float.valueOf(this.f56385h.f56214t0));
        }
        this.f56394q = 1.0f;
        this.f56360F = (Rect) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        m81915b0();
        this.f56402y = this.f56385h.f56153E.getInt("useCameraFaceDetect");
        this.f56401x = (int[]) this.f56378a.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.f56396s = 0;
        dsh0.m117759b();
        return 0;
    }

    /* JADX INFO: renamed from: Q */
    public void m81936Q() {
        C13486b c13486b = this.f56384g;
        if (c13486b != null) {
            c13486b.m81805X0();
            return;
        }
        C13504g.m81997a("TECameraModeBase", "openCameraLock failed, " + C13504g.m82000d());
    }

    /* JADX INFO: renamed from: R */
    public int m81937R() {
        dsh0.m117758a("TECameraModeBase-prepareProvider");
        jrh0 jrh0VarM81828K = this.f56384g.m81828K();
        if (m81922C() == null || jrh0VarM81828K == null) {
            C13504g.m81998b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f56389l == null) {
            this.f56389l = (StreamConfigurationMap) this.f56378a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (jrh0VarM81828K.m146742f().m141824j()) {
            jrh0VarM81828K.m146748l(this.f56399v);
            jrh0VarM81828K.m146745i(this.f56389l, null);
            this.f56385h.f56207q = jrh0VarM81828K.m146739c();
            TEFrameSizei tEFrameSizei = this.f56385h.f56207q;
            if (tEFrameSizei != null) {
                this.f56383f.mo81680e(50, 0, tEFrameSizei.toString(), this.f56387j);
            }
        } else {
            jrh0VarM81828K.m146745i(this.f56389l, this.f56385h.f56207q);
            this.f56385h.f56209r = jrh0VarM81828K.m146738b();
        }
        C13504g.m82001e("TECameraModeBase", "Camera provider type: " + jrh0VarM81828K.m146743g());
        if (jrh0VarM81828K.m146743g() == 1 || jrh0VarM81828K.m146743g() == 16) {
            if (jrh0VarM81828K.m146744h() == null) {
                C13504g.m81998b("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            SurfaceTexture surfaceTextureM146744h = jrh0VarM81828K.m146744h();
            TEFrameSizei tEFrameSizei2 = this.f56385h.f56207q;
            surfaceTextureM146744h.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        } else if (jrh0VarM81828K.m146743g() != 2) {
            if (jrh0VarM81828K.m146743g() != 8) {
                C13504g.m81998b("TECameraModeBase", "Unsupported camera provider type : " + jrh0VarM81828K.m146743g());
                return WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
            }
            SurfaceTexture surfaceTextureM146744h2 = jrh0VarM81828K.m146744h();
            TEFrameSizei tEFrameSizei3 = this.f56385h.f56207q;
            surfaceTextureM146744h2.setDefaultBufferSize(tEFrameSizei3.width, tEFrameSizei3.height);
        }
        dsh0.m117759b();
        return 0;
    }

    /* JADX INFO: renamed from: S */
    public void m81938S() {
        HandlerThread handlerThread = this.f56359E;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f56359E = null;
            this.f56358D = null;
            C13504g.m82001e("TECameraModeBase", "releaseCameraThread");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m81939T() {
        C13504g.m82001e("TECameraModeBase", "removeFocusSettings");
        orh0 orh0Var = this.f56386i;
        if (orh0Var != null) {
            orh0Var.m168922h(null);
            this.f56355A = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m81940U() {
        this.f56397t = null;
        this.f56365K = 0;
    }

    /* JADX INFO: renamed from: V */
    public String m81941V(int i) throws CameraAccessException {
        dsh0.m117758a("TECameraModeBase-selectCamera");
        String[] cameraIdList = this.f56382e.getCameraIdList();
        String strM155628w = null;
        if (cameraIdList == null) {
            C13504g.m82006j("TECameraModeBase", "cameraList is null");
            return null;
        }
        hrh0.m136853b("te_record_camera_size", cameraIdList.length);
        if (this.f56385h.f56153E.getBoolean("ve_enable_camera_devices_cache")) {
            C13504g.m82001e("TECameraModeBase", "Enable CameraDeviceCache");
            strM155628w = this.f56370P.get(Integer.valueOf(i));
        }
        if (strM155628w == null || strM155628w == "") {
            if (i == 2) {
                if (this.f56385h.f56158J.length() <= 0 || this.f56385h.f56158J.equals(User.ID_TEAM_ACCOUNT)) {
                    strM155628w = this.f56385h.f56177b == 8 ? this.f56384g.m81830P() : this.f56379b.m112059i(cameraIdList, this.f56382e);
                } else {
                    C13504g.m82001e("TECameraModeBase", "Wide-angle camera id: " + this.f56385h.f56158J);
                    boolean zM81888g = C13496f.m81888g(cameraIdList, this.f56385h.f56158J);
                    TECameraSettings tECameraSettings = this.f56385h;
                    if (zM81888g) {
                        strM155628w = tECameraSettings.f56158J;
                    } else {
                        C13504g.m82006j("TECameraModeBase", "Maybe this is not validate camera id: " + tECameraSettings.f56158J);
                    }
                }
                this.f56383f.mo81680e(112, 0, "enable wide angle", this.f56387j);
            } else if (i != 3) {
                if (i >= cameraIdList.length || i < 0) {
                    i = 1;
                }
                TECameraSettings tECameraSettings2 = this.f56385h;
                tECameraSettings2.f56181d = i;
                if (tECameraSettings2.f56198l0 && !TextUtils.isEmpty(tECameraSettings2.f56158J)) {
                    strM155628w = this.f56385h.f56158J;
                } else if (this.f56385h.f56197l && arh0.m99705d()) {
                    strM155628w = ((lrh0) this.f56379b).m155628w(this.f56382e, i, cameraIdList);
                }
                if (strM155628w == null) {
                    for (String str : cameraIdList) {
                        int i2 = ((Integer) this.f56382e.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1;
                        this.f56370P.put(Integer.valueOf(i2), str);
                        if (i2 == i) {
                            strM155628w = str;
                            break;
                        }
                    }
                }
            } else if (this.f56385h.f56177b == 2) {
                strM155628w = this.f56379b.m112057g(cameraIdList, this.f56382e);
            }
            if (strM155628w != null) {
                this.f56370P.put(Integer.valueOf(i), strM155628w);
            }
        }
        if (strM155628w == null) {
            C13504g.m82006j("TECameraModeBase", "selectCamera: camera tag is null, set 0 for default");
            strM155628w = "0";
        }
        C13504g.m82001e("TECameraModeBase", "selectCamera size: " + cameraIdList.length + ", mFacing: " + this.f56385h.f56181d + ", cameraTag: " + strM155628w);
        CameraCharacteristics cameraCharacteristics = this.f56382e.getCameraCharacteristics(strM155628w);
        this.f56378a = cameraCharacteristics;
        if (Build.VERSION.SDK_INT >= 28) {
            C13504g.m81997a("TECameraModeBase", "selectCamera sessionKeys: " + cameraCharacteristics.getAvailableSessionKeys());
        }
        Range range = (Range) this.f56378a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) this.f56378a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (range != null && rational != null) {
            this.f56385h.f56159K.f56234c = ((Integer) range.getLower()).intValue();
            this.f56385h.f56159K.f56232a = ((Integer) range.getUpper()).intValue();
            this.f56385h.f56159K.f56235d = (rational.getNumerator() * 1.0f) / rational.getDenominator();
            this.f56385h.f56159K.f56233b = 0;
        }
        dsh0.m117759b();
        return strM155628w;
    }

    /* JADX INFO: renamed from: W */
    public void m81942W(float f) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-432, -432, "Capture Session is null", this.f56387j);
        }
        if (m81919A().length == 1 && !Arrays.asList(m81919A()).contains(Float.valueOf(f))) {
            this.f56383f.mo81680e(-432, -432, "invalid aperture", this.f56387j);
            return;
        }
        CaptureRequest.Builder builder = this.f56380c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f56380c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f56380c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f56380c.set(key2, 0);
        }
        this.f56380c.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.f56412a) {
            return;
        }
        C13504g.m81998b("TECameraModeBase", "setAperture exception: " + c13503fM81984v0.f56413b);
        this.f56383f.mo81680e(-432, -432, c13503fM81984v0.f56413b, this.f56387j);
    }

    /* JADX INFO: renamed from: X */
    public void m81943X(boolean z) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "setExposureCompensation : Capture Session is null", this.f56387j);
            return;
        }
        try {
            this.f56380c.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
            m81984v0(this.f56380c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f56383f.mo81680e(-427, -427, e.toString(), this.f56387j);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m81944Y(boolean z) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "setAutoFocusLock : Capture Session is null", this.f56387j);
            return;
        }
        try {
            this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            m81984v0(this.f56380c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f56383f.mo81680e(-434, -434, e.toString(), this.f56387j);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m81945Z(Object obj) throws ClassCastException {
        this.f56387j = (CameraDevice) obj;
    }

    @Override // p153l.p6m.InterfaceC19309a
    /* JADX INFO: renamed from: a */
    public int mo81946a() {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "rollbackNormalSessionRequest : param is null.", this.f56387j);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f56380c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(mo81924E()));
        this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f56385h.f56201n) {
            CaptureRequest.Builder builder2 = this.f56380c;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle[] meteringRectangleArr = p6m.f150864a;
            builder2.set(key, meteringRectangleArr);
            this.f56380c.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        m81984v0(this.f56380c);
        C13504g.m82001e("TECameraModeBase", "rollbackNormalSessionRequest");
        return 0;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m81947a0(int i) {
        this.f56396s = i;
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "setExposureCompensation : Capture Session is null", this.f56387j);
            return false;
        }
        Integer num = (Integer) this.f56380c.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null && num.intValue() == 0) {
            C13504g.m82006j("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
            return false;
        }
        if (this.f56385h.f56159K.f56233b == i) {
            C13504g.m82001e("TECameraModeBase", "setExposureCompensation return, no need to set");
            return false;
        }
        this.f56380c.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
        this.f56385h.f56159K.f56233b = i;
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (!c13503fM81984v0.f56412a) {
            C13504g.m81998b("TECameraModeBase", "setExposureCompensation failed: " + c13503fM81984v0.f56413b);
            this.f56383f.mo81680e(-413, -413, c13503fM81984v0.f56413b, this.f56387j);
        }
        return c13503fM81984v0.f56412a;
    }

    @Override // p153l.p6m.InterfaceC19309a
    /* JADX INFO: renamed from: b */
    public void mo81948b(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder) {
        if (cameraCaptureSession != this.f56381d || builder != this.f56380c) {
            C13504g.m81998b("TECameraModeBase", "updateRequestRepeating failed, session changed...");
            return;
        }
        C13503f c13503fM81984v0 = m81984v0(builder);
        if (c13503fM81984v0.f56412a) {
            return;
        }
        C13504g.m81998b("TECameraModeBase", "updateRequestRepeating failed: " + c13503fM81984v0.f56413b);
    }

    /* JADX INFO: renamed from: c0 */
    public void m81949c0(AbstractC13487c.b bVar) {
        this.f56400w = bVar;
    }

    @Override // p153l.p6m.InterfaceC19309a
    /* JADX INFO: renamed from: d */
    public int mo81950d() {
        if (this.f56380c == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "rollbackMeteringSessionRequest : param is null.", this.f56387j);
            return -100;
        }
        m81990y0(this.f56402y);
        this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f56385h.f56201n) {
            this.f56380c.set(CaptureRequest.CONTROL_AE_REGIONS, p6m.f150864a);
        }
        m81984v0(this.f56380c);
        C13504g.m82001e("TECameraModeBase", "rollbackMeteringSessionRequest");
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public void m81951d0(int i) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-430, -430, "Capture Session is null", this.f56387j);
        }
        if (i > m81928I()[1] || i < m81928I()[0]) {
            this.f56383f.mo81680e(-430, -430, "invalid iso", this.f56387j);
            return;
        }
        CaptureRequest.Builder builder = this.f56380c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f56380c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f56380c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f56380c.set(key2, 0);
        }
        this.f56380c.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.f56412a) {
            return;
        }
        C13504g.m81998b("TECameraModeBase", "setISO exception: " + c13503fM81984v0.f56413b);
        this.f56383f.mo81680e(-430, -430, c13503fM81984v0.f56413b, this.f56387j);
    }

    /* JADX INFO: renamed from: e */
    public Rect m81952e(int i, int i2, float f, float f2, int i3, int i4, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int i5;
        int i6;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i7;
        if (this.f56390m == null) {
            C13504g.m81998b("TECameraModeBase", "_calculateFocusRect, capture request is null, return");
            return null;
        }
        Rect rect = (Rect) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        C13504g.m81997a("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + Constants.AES_SUFFIX);
        Size size = (Size) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append(Constants.AES_SUFFIX);
        C13504g.m82001e("onAreaTouchEvent", sb.toString());
        TECameraSettings tECameraSettings = this.f56385h;
        TEFrameSizei tEFrameSizei = tECameraSettings.f56207q;
        int i8 = tEFrameSizei.width;
        int i9 = tEFrameSizei.height;
        TEFocusSettings.CoordinatesMode coordinatesMode2 = TEFocusSettings.CoordinatesMode.VIEW;
        if (coordinatesMode == coordinatesMode2 && (90 == (i7 = tECameraSettings.f56183e) || 270 == i7)) {
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
        Rect rect2 = (Rect) this.f56390m.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            C13504g.m82006j("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        C13504g.m81997a("TECameraModeBase", "cropRegion Rect: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom);
        int iWidth = rect.width();
        int iHeight = rect.height();
        TECameraSettings tECameraSettings2 = this.f56385h;
        TEFrameSizei tEFrameSizei2 = tECameraSettings2.f56207q;
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
        if (coordinatesMode == coordinatesMode2 && tECameraSettings2.f56181d == 1) {
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
        C13504g.m82001e("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "] x: " + f16 + " y: " + fHeight);
        return rect3;
    }

    /* JADX INFO: renamed from: e0 */
    public void m81953e0(float f) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-436, -436, "Capture Session is null", this.f56387j);
        }
        if (f < 0.0f) {
            this.f56383f.mo81680e(-436, -436, "invalid distance", this.f56387j);
            return;
        }
        this.f56380c.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.f56412a) {
            return;
        }
        C13504g.m81998b("TECameraModeBase", "setManualFocusDistance exception: " + c13503fM81984v0.f56413b);
        this.f56383f.mo81680e(-430, -430, c13503fM81984v0.f56413b, this.f56387j);
    }

    /* JADX INFO: renamed from: f */
    public void m81954f() {
        if (this.f56381d == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f56381d.abortCaptures();
        } catch (Exception e) {
            C13504g.m81998b("TECameraModeBase", "abort session failed, e: " + e.getMessage());
        }
        C13504g.m82001e("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: f0 */
    public int mo81955f0(int i, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: g0 */
    public void m81956g0(AbstractC13487c.d dVar) {
        this.f56398u = dVar;
    }

    /* JADX INFO: renamed from: h */
    public Rect m81957h(float f) {
        CameraCharacteristics cameraCharacteristics = this.f56378a;
        if (cameraCharacteristics == null || this.f56380c == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -420, "Camera info is null, may be you need reopen camera.", this.f56387j);
            return null;
        }
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
    public void m81958h0(AbstractC13487c.e eVar) {
        this.f56399v = eVar;
    }

    /* JADX INFO: renamed from: i */
    public Rect m81959i(float f) {
        Rect rect = this.f56360F;
        if (rect == null) {
            C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C13504g.m81998b("TECameraModeBase", "ActiveArraySize == null");
            this.f56383f.mo81680e(-420, -420, "ActiveArraySize == null.", this.f56387j);
            return null;
        }
        float f2 = this.f56394q;
        if (f2 <= 0.0f || f2 > this.f56393p) {
            C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C13504g.m81998b("TECameraModeBase", "factor invalid");
            this.f56383f.mo81680e(-420, -420, "factor invalid.", this.f56387j);
            return null;
        }
        float f3 = 1.0f / f2;
        int iWidth = rect.width() - Math.round(this.f56360F.width() * f3);
        int iHeight = this.f56360F.height() - Math.round(this.f56360F.height() * f3);
        int i = iWidth / 2;
        Rect rect2 = this.f56360F;
        int iM81886e = C13496f.m81886e(i, rect2.left, rect2.right);
        int i2 = iHeight / 2;
        Rect rect3 = this.f56360F;
        int iM81886e2 = C13496f.m81886e(i2, rect3.top, rect3.bottom);
        int iWidth2 = this.f56360F.width() - i;
        Rect rect4 = this.f56360F;
        int iM81886e3 = C13496f.m81886e(iWidth2, rect4.left, rect4.right);
        int iHeight2 = this.f56360F.height() - i2;
        Rect rect5 = this.f56360F;
        Rect rect6 = new Rect(iM81886e, iM81886e2, iM81886e3, C13496f.m81886e(iHeight2, rect5.top, rect5.bottom));
        CaptureRequest captureRequest = this.f56390m;
        if (captureRequest != null && rect6.equals((Rect) captureRequest.get(CaptureRequest.SCALER_CROP_REGION))) {
            C13504g.m82001e("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
        }
        return rect6;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo81960i0(int i) {
    }

    /* JADX INFO: renamed from: j */
    public int m81961j() {
        if (this.f56380c != null) {
            return this.f56386i.mo141883d();
        }
        this.f56383f.mo81680e(-100, -100, "rollbackNormalSessionRequest : param is null.", this.f56387j);
        return -100;
    }

    /* JADX INFO: renamed from: j0 */
    public void m81962j0(long j) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-431, -431, "Capture Session is null", this.f56387j);
        }
        if (j > m81933N()[1] || j < m81933N()[0]) {
            this.f56383f.mo81680e(-431, -431, "invalid shutter time", this.f56387j);
            return;
        }
        CaptureRequest.Builder builder = this.f56380c;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (!((Integer) builder.get(key)).equals(0)) {
            this.f56380c.set(key, 0);
        }
        CaptureRequest.Builder builder2 = this.f56380c;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_MODE;
        if (!((Integer) builder2.get(key2)).equals(0)) {
            this.f56380c.set(key2, 0);
        }
        this.f56380c.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.f56412a) {
            return;
        }
        C13504g.m81998b("TECameraModeBase", "setShutterTime exception: " + c13503fM81984v0.f56413b);
        this.f56383f.mo81680e(-431, -431, c13503fM81984v0.f56413b, this.f56387j);
    }

    /* JADX INFO: renamed from: k */
    public C13503f m81963k(CaptureRequest.Builder builder) {
        return m81965l(builder, this.f56377W, m81923D());
    }

    /* JADX INFO: renamed from: k0 */
    public void m81964k0(boolean z, String str) {
        if (this.f56380c == null || this.f56381d == null) {
            this.f56383f.mo81680e(-424, -424, "Capture Session is null", this.f56387j);
        }
        if (!Arrays.asList((int[]) this.f56378a.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(this.f56369O.get(str) == null ? 1 : this.f56369O.get(str).intValue()))) {
            this.f56383f.mo81680e(-424, -424, "invalid white balance", this.f56387j);
            return;
        }
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.f56412a) {
            return;
        }
        C13504g.m81998b("TECameraModeBase", "setWhiteBalance exception: " + c13503fM81984v0.f56413b);
        this.f56383f.mo81680e(-424, -424, c13503fM81984v0.f56413b, this.f56387j);
    }

    /* JADX INFO: renamed from: l */
    public C13503f m81965l(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C13503f c13503f = new C13503f();
        if (builder == null) {
            c13503f.f56413b = "CaptureRequest.Builder is null";
            C13504g.m81998b("TECameraModeBase", "capture: " + c13503f.f56413b);
            return c13503f;
        }
        if (this.f56381d == null) {
            c13503f.f56413b = "Capture Session is null";
            C13504g.m81998b("TECameraModeBase", "capture: " + c13503f.f56413b);
            return c13503f;
        }
        try {
            this.f56381d.capture(builder.build(), captureCallback, handler);
            c13503f.f56412a = true;
            return c13503f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13503f.f56413b = e.getMessage();
            return c13503f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13503f.f56413b = e2.getMessage();
            return c13503f;
        }
    }

    /* JADX INFO: renamed from: m */
    public C13503f m81966m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C13503f c13503f = new C13503f();
        if (captureRequest == null) {
            c13503f.f56413b = "CaptureRequest is null";
            C13504g.m81998b("TECameraModeBase", "capture: " + c13503f.f56413b);
            return c13503f;
        }
        if (this.f56381d == null) {
            c13503f.f56413b = "Capture Session is null";
            C13504g.m81998b("TECameraModeBase", "capture: " + c13503f.f56413b);
            return c13503f;
        }
        try {
            this.f56381d.capture(captureRequest, captureCallback, handler);
            c13503f.f56412a = true;
            return c13503f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13503f.f56413b = e.getMessage();
            return c13503f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13503f.f56413b = e2.getMessage();
            return c13503f;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public abstract int mo81967m0() throws Exception;

    /* JADX INFO: renamed from: n */
    public C13503f m81968n(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C13503f c13503f = new C13503f();
        if (this.f56381d == null) {
            c13503f.f56413b = "Capture Session is null";
            C13504g.m81998b("TECameraModeBase", "capture: " + c13503f.f56413b);
            return c13503f;
        }
        try {
            this.f56381d.captureBurst(list, captureCallback, handler);
            c13503f.f56412a = true;
            return c13503f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13503f.f56413b = e.getMessage();
            return c13503f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13503f.f56413b = e2.getMessage();
            return c13503f;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int mo81969n0() {
        return 0;
    }

    /* JADX INFO: renamed from: o0 */
    public int m81971o0(float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        CaptureRequest.Builder builder;
        Rect rectM81957h = m81957h(f);
        if (this.f56379b == null || this.f56390m == null || this.f56381d == null || (builder = this.f56380c) == null) {
            C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f56383f.mo81680e(-420, -420, "startZoom : Env is null", this.f56387j);
            return -100;
        }
        if (rectM81957h == null) {
            C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.f56383f.mo81680e(-420, -420, "zoom rect is null.", this.f56387j);
            return -420;
        }
        builder.set(CaptureRequest.SCALER_CROP_REGION, rectM81957h);
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (c13503fM81984v0.f56412a) {
            if (interfaceC13478p != null) {
                interfaceC13478p.onChange(this.f56385h.f56177b, f, true);
            }
            m81989y();
            return 0;
        }
        C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13503fM81984v0.m81994a());
        this.f56383f.mo81680e(-420, -420, c13503fM81984v0.f56413b, this.f56387j);
        return -420;
    }

    /* JADX INFO: renamed from: p */
    public void m81972p() {
        if (this.f56385h.f56201n && this.f56384g.m81802T0() != null) {
            this.f56384g.m81802T0().m156065i(this.f56375U);
        }
        m81938S();
    }

    /* JADX INFO: renamed from: p0 */
    public int mo81973p0() {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void mo81974q() {
        TECameraSettings tECameraSettings;
        if (this.f56384g != null && (tECameraSettings = this.f56385h) != null && tECameraSettings.f56195k) {
            C13504g.m82001e("TECameraModeBase", "close session process...state = " + this.f56384g.m81803U0());
            if (this.f56384g.m81803U0() == 2) {
                this.f56384g.m81810b1();
            }
        }
        this.f56368N = false;
        if (m81922C() == null) {
            C13504g.m81998b("TECameraModeBase", "close session process...device is null");
            return;
        }
        if (this.f56381d == null) {
            C13504g.m81998b("TECameraModeBase", "close session process...session is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f56381d.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f56381d = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        hrh0.m136853b("te_record_camera2_close_session_cost", jCurrentTimeMillis2);
        C13504g.m82002f("te_record_camera2_close_session_cost", Long.valueOf(jCurrentTimeMillis2));
        C13504g.m82001e("TECameraModeBase", "close session...consume = " + jCurrentTimeMillis2);
    }

    /* JADX INFO: renamed from: q0 */
    public C13503f m81975q0() {
        C13503f c13503f = new C13503f();
        if (this.f56381d == null) {
            c13503f.f56413b = "Capture Session is null";
            C13504g.m81998b("TECameraModeBase", "stopRepeating: " + c13503f.f56413b);
            return c13503f;
        }
        try {
            this.f56381d.stopRepeating();
            c13503f.f56412a = true;
            return c13503f;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13503f.f56413b = e.getMessage();
            return c13503f;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            c13503f.f56413b = e2.getMessage();
            return c13503f;
        }
    }

    /* JADX INFO: renamed from: r */
    public Range<Integer> mo81976r(Range<Integer> range) {
        return range;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo81977r0(int i, int i2, TECameraSettings.InterfaceC13474l interfaceC13474l) {
    }

    /* JADX INFO: renamed from: s */
    public CaptureRequest.Builder m81978s(int i) {
        if (i > 6 || i < 1) {
            C13504g.m81998b("TECameraModeBase", "createCaptureRequestBuilder, template invalid, must be [1, 6]");
            return null;
        }
        CameraDevice cameraDevice = this.f56387j;
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
    public void mo81979s0(TECameraSettings.InterfaceC13474l interfaceC13474l, int i) {
        if (this.f56366L) {
            this.f56380c.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f56380c.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo81980t(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        List arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            C13504g.m82001e("TECameraModeBase", "createSession by normally");
            this.f56387j.createCaptureSession(list, stateCallback, handler);
            return;
        }
        if (list != null || !this.f56385h.f56204o0 || (arrayList = this.f56373S) == null) {
            arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
        }
        trh0.m192500a();
        SessionConfiguration sessionConfigurationM187617a = srh0.m187617a(m81932M(list), arrayList, new ExecutorC13498a(handler), stateCallback);
        sessionConfigurationM187617a.setSessionParameters(this.f56380c.build());
        C13504g.m82001e("TECameraModeBase", "createSession by sessionConfiguration");
        this.f56387j.createCaptureSession(sessionConfigurationM187617a);
    }

    /* JADX INFO: renamed from: t0 */
    public int mo81981t0(boolean z) {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "toggleTorch : CaptureRequest.Builder is null", this.f56387j);
            this.f56383f.mo81682g(this.f56385h.f56177b, -100, z ? 1 : 0, "toggleTorch : CaptureRequest.Builder is null", this.f56387j);
            return -100;
        }
        builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
        this.f56383f.mo81680e(104, 0, "camera2 will change flash mode " + z, null);
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        this.f56383f.mo81680e(105, 0, "camera2 did change flash mode " + z, null);
        if (c13503fM81984v0.f56412a) {
            this.f56383f.mo81683h(this.f56385h.f56177b, 0, z ? 1 : 0, "camera torch success", this.f56387j);
            return 0;
        }
        C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + c13503fM81984v0.m81994a());
        this.f56383f.mo81680e(-417, -417, c13503fM81984v0.f56413b, this.f56387j);
        this.f56383f.mo81682g(this.f56385h.f56177b, -417, z ? 1 : 0, c13503fM81984v0.f56413b, this.f56387j);
        return -417;
    }

    /* JADX INFO: renamed from: u */
    public void m81982u() throws Exception {
        if (Build.VERSION.SDK_INT < 28 || this.f56387j == null) {
            return;
        }
        this.f56373S.clear();
        TECameraSettings tECameraSettings = this.f56385h;
        if (tECameraSettings.f56150B == 0 && tECameraSettings.f56177b == 2) {
            List<OutputConfiguration> list = this.f56373S;
            grh0.m131801a();
            list.add(frh0.m126927a(new Size(this.f56385h.m81687a().width, this.f56385h.m81687a().height), SurfaceTexture.class));
            Handler handlerM81923D = this.f56385h.f56195k ? m81923D() : this.f56388k;
            if (this.f56387j != null) {
                if (this.f56380c == null) {
                    boolean z = this.f56385h.f56153E.getBoolean("enablePreviewTemplate");
                    CameraDevice cameraDevice = this.f56387j;
                    if (z) {
                        this.f56380c = cameraDevice.createCaptureRequest(1);
                    } else {
                        this.f56380c = cameraDevice.createCaptureRequest(3);
                    }
                }
                this.f56380c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo81976r(new Range<>(Integer.valueOf(this.f56356B.min / this.f56385h.f56179c.fpsUnitFactor), Integer.valueOf(this.f56356B.max / this.f56385h.f56179c.fpsUnitFactor))));
                mo81980t(null, this.f56376V, handlerM81923D);
            }
        }
        this.f56371Q = false;
        this.f56372R = false;
    }

    /* JADX INFO: renamed from: u0 */
    public int mo81983u0() throws CameraAccessException {
        dsh0.m117758a("TECameraModeBase-updateCapture");
        if (this.f56384g.m81828K() == null || this.f56380c == null) {
            C13504g.m81998b("TECameraModeBase", "update capture failed");
            return -100;
        }
        if (this.f56379b.m112068r(this.f56378a) && m81934O()) {
            C13504g.m82001e("TECameraModeBase", "Stabilization Supported, toggle = " + this.f56385h.f56169U);
            if (this.f56379b.m112052a(this.f56378a, this.f56380c, this.f56385h.f56169U) == 0 && this.f56385h.f56169U) {
                this.f56383f.mo81680e(113, 1, "enable stablization", this.f56387j);
            }
        }
        this.f56380c.set(CaptureRequest.CONTROL_MODE, 1);
        m81915b0();
        Range<Integer> rangeMo81976r = mo81976r(new Range<>(Integer.valueOf(this.f56356B.min / this.f56385h.f56179c.fpsUnitFactor), Integer.valueOf(this.f56356B.max / this.f56385h.f56179c.fpsUnitFactor)));
        this.f56380c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeMo81976r);
        this.f56383f.mo81680e(121, 0, rangeMo81976r.toString(), null);
        this.f56380c.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f56396s));
        m81990y0(this.f56402y);
        if (Float.compare(this.f56385h.f56222x0, this.f56394q) != 0) {
            float fMin = Math.min(this.f56385h.f56222x0, this.f56393p);
            this.f56394q = fMin;
            Rect rectM81959i = m81959i(fMin);
            if (rectM81959i == null) {
                C13504g.m82006j("TECameraModeBase", "calculate default crop_region fail!");
            } else {
                this.f56380c.set(CaptureRequest.SCALER_CROP_REGION, rectM81959i);
            }
        }
        C13503f c13503fM81984v0 = m81984v0(this.f56380c);
        if (!c13503fM81984v0.f56412a) {
            C13504g.m81998b("TECameraModeBase", "first request failed: " + c13503fM81984v0.f56413b);
        }
        this.f56385h.f56183e = ((Integer) this.f56378a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f56384g.m81809a1(3);
        m81989y();
        C13504g.m82001e("TECameraModeBase", "send capture request..." + this.f56381d);
        this.f56383f.mo81676a(2, 0, 0, "TECamera2 preview", this.f56387j);
        dsh0.m117759b();
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public C13503f m81984v0(CaptureRequest.Builder builder) {
        return m81986w0(builder, this.f56377W);
    }

    /* JADX INFO: renamed from: w */
    public int m81985w() {
        CaptureRequest.Builder builder = this.f56380c;
        if (builder == null) {
            this.f56383f.mo81678c(this.f56385h.f56177b, -100, "rollbackNormalSessionRequest : param is null.", this.f56387j);
            return -100;
        }
        this.f56386i.mo141880a(builder);
        mo81948b(this.f56381d, this.f56380c);
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public C13503f m81986w0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return m81988x0(builder, captureCallback, m81923D());
    }

    /* JADX INFO: renamed from: x */
    public void m81987x(boolean z) {
        if (!z && this.f56394q != 1.0f) {
            this.f56394q = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (this.f56380c == null || this.f56381d == null) {
                    this.f56383f.mo81678c(this.f56385h.f56177b, -100, "enableMulticamZoom : Capture Session is null", this.f56387j);
                    return;
                }
                this.f56380c.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f56394q));
                C13503f c13503fM81984v0 = m81984v0(this.f56380c);
                if (!c13503fM81984v0.f56412a) {
                    C13504g.m81998b("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + c13503fM81984v0.m81994a());
                    this.f56383f.mo81680e(-420, -420, c13503fM81984v0.f56413b, this.f56387j);
                    return;
                }
            }
            this.f56397t = m81959i(this.f56394q);
        }
        this.f56367M = z;
    }

    /* JADX INFO: renamed from: x0 */
    public C13503f m81988x0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        dsh0.m117758a("TECameraModeBase-updatePreview");
        C13503f c13503f = new C13503f();
        if (builder == null) {
            c13503f.f56413b = "CaptureRequest.Builder is null";
            C13504g.m81998b("TECameraModeBase", "updatePreview: " + c13503f.f56413b);
            return c13503f;
        }
        if (this.f56381d == null) {
            c13503f.f56413b = "Capture Session is null";
            C13504g.m81998b("TECameraModeBase", "updatePreview: " + c13503f.f56413b);
            return c13503f;
        }
        CaptureRequest captureRequestBuild = builder.build();
        this.f56390m = captureRequestBuild;
        try {
            this.f56381d.setRepeatingRequest(captureRequestBuild, captureCallback, handler);
            c13503f.f56412a = true;
            this.f56368N = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            c13503f.f56413b = e.getMessage();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            c13503f.f56413b = e2.getMessage();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            c13503f.f56413b = e3.getMessage();
            this.f56368N = false;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            c13503f.f56413b = e4.getMessage();
        }
        dsh0.m117759b();
        return c13503f;
    }

    /* JADX INFO: renamed from: y */
    public void m81989y() {
        Bundle bundle;
        dsh0.m117758a("TECameraModeBase-fillFeatures");
        if (this.f56384g.m81824A().containsKey(this.f56385h.f56156H)) {
            bundle = this.f56384g.m81824A().get(this.f56385h.f56156H);
        } else {
            bundle = new Bundle();
            this.f56384g.m81824A().put(this.f56385h.f56156H, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f56385h.f56207q);
        if (this.f56378a != null && this.f56390m != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.mActiveSize = (Rect) this.f56378a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.mCropSize = (Rect) this.f56390m.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.mMaxRegionsAE = ((Integer) this.f56378a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.mMaxRegionsAF = ((Integer) this.f56378a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.f56385h.f56183e);
        dsh0.m117759b();
    }

    /* JADX INFO: renamed from: y0 */
    public void m81990y0(int i) {
        if (i == 1) {
            if (this.f56385h.f56181d == 1) {
                m81917l0(this.f56380c);
                C13504g.m82001e("TECameraModeBase", "use faceae for front");
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.f56385h.f56181d == 0) {
                m81917l0(this.f56380c);
                C13504g.m82001e("TECameraModeBase", "use faceae for rear");
                return;
            }
            return;
        }
        if (i == 3) {
            m81917l0(this.f56380c);
            C13504g.m82001e("TECameraModeBase", "use faceae for all");
        }
    }

    /* JADX INFO: renamed from: z */
    public int mo81991z(TEFocusSettings tEFocusSettings) {
        if (this.f56385h.f56199m) {
            return m81918v(tEFocusSettings);
        }
        this.f56355A = tEFocusSettings;
        this.f56386i.m168922h(tEFocusSettings);
        this.f56386i.m168921g(this.f56385h);
        if (this.f56379b == null || this.f56381d == null || this.f56380c == null) {
            C13504g.m82006j("TECameraModeBase", "Env is null");
            this.f56355A.m81703g().mo81717a(-100, this.f56385h.f56181d, "Env is null");
            return -100;
        }
        boolean zM112066p = this.f56379b.m112066p(this.f56378a);
        boolean zM112063m = this.f56379b.m112063m(this.f56378a);
        if (!zM112063m && !zM112066p) {
            C13504g.m82006j("TECameraModeBase", "do not support MeteringAreaAF!");
            this.f56355A.m81703g().mo81717a(-412, this.f56385h.f56181d, "do not support MeteringAreaAF!");
            return -412;
        }
        boolean zM81710n = tEFocusSettings.m81710n();
        boolean z = this.f56391n.get();
        boolean z2 = (zM112063m && this.f56355A.m81711o()) ? false : true;
        C13504g.m81997a("TECameraModeBase", "focusAtPoint++");
        if (z && !z2) {
            this.f56374T.run();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C13504g.m81997a("TECameraModeBase", "cancel previous touch af..");
        }
        TEFocusSettings tEFocusSettings2 = this.f56355A;
        TECameraSettings tECameraSettings = this.f56385h;
        Rect rectM81697a = tEFocusSettings2.m81697a(tECameraSettings.f56183e, tECameraSettings.f56181d == 1);
        if (rectM81697a == null) {
            rectM81697a = m81952e(this.f56355A.m81706j(), this.f56355A.m81705i(), this.f56355A.m81707k(), this.f56355A.m81708l(), this.f56385h.f56183e, 0, this.f56355A.m81701e());
        }
        TEFocusSettings tEFocusSettings3 = this.f56355A;
        TECameraSettings tECameraSettings2 = this.f56385h;
        Rect rectM81698b = tEFocusSettings3.m81698b(tECameraSettings2.f56183e, tECameraSettings2.f56181d == 1);
        if (rectM81698b == null) {
            rectM81698b = m81952e(this.f56355A.m81706j(), this.f56355A.m81705i(), this.f56355A.m81707k(), this.f56355A.m81708l(), this.f56385h.f56183e, 1, this.f56355A.m81701e());
        }
        if (!C13496f.m81903v(rectM81697a) || !C13496f.m81903v(rectM81698b)) {
            C13504g.m81998b("TECameraModeBase", "focusRect or meteringRect is not valid!");
            this.f56355A.m81703g().mo81717a(-100, this.f56385h.f56181d, "focusRect or meteringRect is not valid!");
            return -100;
        }
        if (this.f56355A.m81712p() && zM112066p) {
            this.f56386i.mo159704f(this.f56380c, rectM81698b);
        }
        if (z2) {
            if (zM112066p && this.f56355A.m81712p()) {
                CaptureRequest.Builder builder = this.f56380c;
                m81988x0(builder, this.f56386i.mo141882c(builder, !z2), this.f56388k);
                this.f56391n.set(false);
                if (this.f56385h.f56201n) {
                    this.f56384g.m81802T0().m156064h(this.f56375U, this.f56388k);
                }
            }
            return -412;
        }
        this.f56391n.set(true);
        this.f56386i.mo159703e(this.f56380c, rectM81697a);
        if (this.f56385h.f56201n) {
            CaptureRequest.Builder builder2 = this.f56380c;
            C13504g.m82001e("TECameraModeBase", "focusAtPoint, capture to trigger focus, response = " + m81965l(builder2, this.f56386i.mo141881b(builder2, this.f56391n, zM81710n), this.f56388k).f56412a);
            this.f56380c.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        CaptureRequest.Builder builder3 = this.f56380c;
        C13503f c13503fM81988x0 = m81988x0(builder3, this.f56386i.mo141881b(builder3, this.f56391n, zM81710n), this.f56388k);
        if (!c13503fM81988x0.f56412a) {
            this.f56391n.set(false);
            this.f56355A.m81703g().mo81717a(-108, this.f56385h.f56181d, c13503fM81988x0.f56413b);
            this.f56383f.mo81680e(-411, -411, c13503fM81988x0.f56413b, this.f56387j);
            return -108;
        }
        if (this.f56385h.f56201n && !zM81710n) {
            this.f56384g.m81802T0().m156064h(this.f56375U, this.f56388k);
        }
        C13504g.m82001e("TECameraModeBase", "focusAtPoint, done");
        return 0;
    }

    /* JADX INFO: renamed from: z0 */
    public void m81992z0() {
        C13486b c13486b = this.f56384g;
        if (c13486b != null) {
            c13486b.m81810b1();
            return;
        }
        C13504g.m81997a("TECameraModeBase", "waitCameraTaskDoneOrTimeout failed, " + C13504g.m82000d());
    }

    /* JADX INFO: renamed from: o */
    public void mo81970o(hj3 hj3Var, int i, TECameraSettings.InterfaceC13465c interfaceC13465c) {
    }
}
