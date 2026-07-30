package com.p074ss.android.ttvecamera;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import com.p074ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.p074ss.android.ttvecamera.framework.TECameraModeBase;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.crh0;
import p153l.dsh0;
import p153l.hj3;
import p153l.hrh0;
import p153l.hsh0;
import p153l.lwk;
import p153l.pqh0;
import p153l.urh0;
import p153l.wqh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.b */
/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class C13486b extends AbstractC13487c {

    /* JADX INFO: renamed from: A */
    protected CameraCharacteristics f56275A;

    /* JADX INFO: renamed from: B */
    protected CaptureRequest f56276B;

    /* JADX INFO: renamed from: C */
    protected CameraManager f56277C;

    /* JADX INFO: renamed from: D */
    protected volatile CameraDevice f56278D;

    /* JADX INFO: renamed from: E */
    protected int f56279E;

    /* JADX INFO: renamed from: F */
    protected boolean f56280F;

    /* JADX INFO: renamed from: G */
    protected TECameraModeBase f56281G;

    /* JADX INFO: renamed from: H */
    private final lwk f56282H;

    /* JADX INFO: renamed from: I */
    protected boolean f56283I;

    /* JADX INFO: renamed from: J */
    protected boolean f56284J;

    /* JADX INFO: renamed from: K */
    private List<TEFrameSizei> f56285K;

    /* JADX INFO: renamed from: L */
    private List<TEFrameSizei> f56286L;

    /* JADX INFO: renamed from: M */
    protected ConditionVariable f56287M;

    /* JADX INFO: renamed from: N */
    protected CameraDevice.StateCallback f56288N;

    /* JADX INFO: renamed from: y */
    protected crh0 f56289y;

    /* JADX INFO: renamed from: z */
    protected volatile int f56290z;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$a */
    public class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        b<CameraDevice> f56291a;

        public a() {
            this.f56291a = new b<>(C13486b.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            TECameraModeBase tECameraModeBase = C13486b.this.f56281G;
            if (tECameraModeBase instanceof pqh0) {
                ((pqh0) tECameraModeBase).m173354D0(cameraDevice, 4, -1);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            C13504g.m82001e("TECamera2", "onDisconnected: OpenCameraCallBack");
            TECameraModeBase tECameraModeBase = C13486b.this.f56281G;
            if (tECameraModeBase instanceof pqh0) {
                ((pqh0) tECameraModeBase).m173354D0(cameraDevice, 1, -1);
            }
            C13486b.this.m81805X0();
            b<CameraDevice> bVar = this.f56291a;
            if (bVar != null) {
                bVar.m81821a(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            C13504g.m82001e("TECamera2", "onError: " + i);
            TECameraModeBase tECameraModeBase = C13486b.this.f56281G;
            if (tECameraModeBase instanceof pqh0) {
                ((pqh0) tECameraModeBase).m173354D0(cameraDevice, 3, i);
            }
            C13486b.this.m81805X0();
            b<CameraDevice> bVar = this.f56291a;
            if (bVar == null) {
                C13504g.m81998b("TECamera2", "had called onError");
            } else {
                bVar.m81822b(cameraDevice, i);
                this.f56291a = null;
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            C13504g.m82001e("TECamera2", "onOpened: OpenCameraCallBack");
            C13486b.this.f56306d.mo81680e(107, 0, "did start camera2", null);
            TECameraModeBase tECameraModeBase = C13486b.this.f56281G;
            if (tECameraModeBase instanceof pqh0) {
                ((pqh0) tECameraModeBase).m173354D0(cameraDevice, 0, -1);
            }
            C13486b.this.f56278D = cameraDevice;
            C13486b.this.f56281G.m81945Z(cameraDevice);
            C13486b.this.m81805X0();
            b<CameraDevice> bVar = this.f56291a;
            if (bVar == null || !bVar.m81823c(cameraDevice)) {
                wqh0.m207519b(C13486b.this.f56322t, cameraDevice);
                C13504g.m82006j("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                return;
            }
            C13486b c13486b = C13486b.this;
            if (c13486b.f56284J && c13486b.f56283I) {
                wqh0.m207519b(c13486b.f56322t, cameraDevice);
                C13504g.m82006j("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                C13486b.this.f56283I = false;
            } else if (c13486b.f56304b.f56204o0) {
                try {
                    c13486b.f56281G.m81982u();
                } catch (Exception e) {
                    C13504g.m82006j("TECamera2", "onOpened: createSessionByDeferredSurface, some bad case occur, close camera! exception msg: " + e.getMessage());
                    C13486b c13486b2 = C13486b.this;
                    c13486b2.f56304b.f56204o0 = false;
                    if (c13486b2.f56290z != 3) {
                        C13486b.this.mo81781u0();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        WeakReference<C13486b> f56293a;

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13486b f56294a;

            public a(C13486b c13486b) {
                this.f56294a = c13486b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13486b c13486b = this.f56294a;
                AbstractC13487c.a aVar = c13486b.f56306d;
                if (aVar != null) {
                    aVar.mo81681f(c13486b.f56304b.f56177b, 0, null, c13486b.f56278D);
                } else {
                    C13504g.m81998b("TECamera2", "mCameraEvents is null!");
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$b, reason: collision with other inner class name */
        public class RunnableC22818b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13486b f56296a;

            public RunnableC22818b(C13486b c13486b) {
                this.f56296a = c13486b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13486b c13486b = this.f56296a;
                c13486b.m81795K0(c13486b.f56322t);
                C13486b c13486b2 = this.f56296a;
                AbstractC13487c.a aVar = c13486b2.f56306d;
                if (aVar != null) {
                    aVar.mo81678c(c13486b2.f56304b.f56177b, -409, "Camera onDisconnected", c13486b2.f56278D);
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13486b f56298a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f56299b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f56300c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f56301d;

            public c(C13486b c13486b, int i, int i2, String str) {
                this.f56298a = c13486b;
                this.f56299b = i;
                this.f56300c = i2;
                this.f56301d = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                C13486b c13486b = this.f56298a;
                c13486b.m81795K0(c13486b.f56322t);
                C13486b c13486b2 = this.f56298a;
                AbstractC13487c.a aVar = c13486b2.f56306d;
                if (aVar != null) {
                    if (this.f56299b == 3 && (i = this.f56300c) == 3) {
                        aVar.mo81678c(c13486b2.f56304b.f56177b, i, this.f56301d, c13486b2.f56278D);
                    } else {
                        aVar.mo81681f(c13486b2.f56304b.f56177b, this.f56300c, null, c13486b2.f56278D);
                    }
                }
            }
        }

        public b(C13486b c13486b) {
            this.f56293a = new WeakReference<>(c13486b);
        }

        /* JADX INFO: renamed from: a */
        public boolean m81821a(@NonNull T t) {
            C13504g.m81998b("TECamera2", "StateCallback::onDisconnected...");
            C13486b c13486b = this.f56293a.get();
            if (c13486b == null) {
                return false;
            }
            if (c13486b.f56304b.f56200m0) {
                C13504g.m81998b("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                c13486b.f56304b.f56200m0 = false;
                return false;
            }
            RunnableC22818b runnableC22818b = new RunnableC22818b(c13486b);
            if (c13486b.f56304b.f56195k) {
                c13486b.f56307e.post(runnableC22818b);
                return true;
            }
            runnableC22818b.run();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m81822b(@NonNull T t, int i) {
            C13486b c13486b = this.f56293a.get();
            if (c13486b == null) {
                C13504g.m81998b("TECamera2", "onError...no camera holder");
                return false;
            }
            int iM81803U0 = c13486b.m81803U0();
            String str = "StateCallback::onError..." + i + ", session code: " + iM81803U0;
            C13504g.m82001e("TECamera2", str);
            c cVar = new c(c13486b, iM81803U0, i, str);
            if (c13486b.f56304b.f56195k) {
                c13486b.f56307e.post(cVar);
            } else {
                cVar.run();
            }
            c13486b.m81809a1(4);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m81823c(@NonNull T t) {
            C13504g.m82001e("TECamera2", "StateCallback::onOpened...");
            C13486b c13486b = this.f56293a.get();
            if (c13486b == null) {
                return false;
            }
            c13486b.f56304b.f56200m0 = false;
            c13486b.m81809a1(2);
            a aVar = new a(c13486b);
            if (c13486b.f56304b.f56195k) {
                c13486b.f56307e.post(aVar);
            } else {
                aVar.run();
            }
            c13486b.f56280F = false;
            return true;
        }
    }

    public C13486b(int i, Context context, AbstractC13487c.a aVar, Handler handler, AbstractC13487c.d dVar) {
        super(context, aVar, handler, dVar);
        this.f56290z = 0;
        this.f56279E = -1;
        this.f56280F = true;
        this.f56283I = false;
        this.f56284J = false;
        this.f56285K = null;
        this.f56286L = null;
        this.f56287M = new ConditionVariable();
        this.f56288N = new a();
        this.f56304b = new TECameraSettings(context, i);
        this.f56282H = new lwk(context);
        this.f56289y = crh0.m112051c(context, i);
    }

    /* JADX INFO: renamed from: P0 */
    private int m81786P0(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return -408;
        }
        if (reason == 2) {
            return -409;
        }
        if (reason == 3) {
            return -410;
        }
        if (reason == 4 || reason == 5) {
            return -406;
        }
        return WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
    }

    /* JADX INFO: renamed from: Q0 */
    public static C13486b m81787Q0(int i, Context context, AbstractC13487c.a aVar, Handler handler, AbstractC13487c.d dVar) {
        return new C13486b(i, context, aVar, handler, dVar);
    }

    /* JADX INFO: renamed from: S0 */
    private void m81788S0(int i, CameraManager cameraManager) {
        dsh0.m117758a("TECamera2-fillWideCameraID");
        crh0 crh0Var = this.f56289y;
        if (crh0Var != null) {
            crh0Var.mo112053b(this.f56304b.f56177b, this.f56277C);
        }
        dsh0.m117759b();
    }

    /* JADX INFO: renamed from: V0 */
    private List<TEFrameRateRange> m81789V0() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f56378a) != null) {
            return C13496f.m81889h((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        }
        C13504g.m81998b("TECamera2", "getSupportedFpsRanges: camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getSupportedFpsRanges: camera is null.", this.f56278D);
        return null;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: A0 */
    public void mo81741A0(TECameraSettings.InterfaceC13478p interfaceC13478p) {
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: B */
    public int mo81742B() {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            return -1;
        }
        return tECameraModeBase.mo81926G();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: B0 */
    public void mo81743B0(int i) {
        if (this.f56290z == 3) {
            m81799N0(i);
            return;
        }
        C13504g.m82006j("TECamera2", "Invalid state: " + this.f56290z);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: C */
    public int mo81744C() {
        int iM81898q = this.f56313k;
        if (iM81898q < 0) {
            iM81898q = C13496f.m81898q(this.f56308f);
        }
        this.f56310h = this.f56311i;
        CameraCharacteristics cameraCharacteristics = this.f56275A;
        int iIntValue = cameraCharacteristics != null ? ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() : this.f56304b.f56183e;
        if (this.f56310h == 1) {
            this.f56312j = (540 - ((iIntValue + iM81898q) % 360)) % 360;
        } else {
            this.f56312j = ((iIntValue - iM81898q) + 360) % 360;
        }
        return this.f56312j;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: C0 */
    public void mo81745C0(int i) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "switchFlashMode: " + i);
        if (this.f56290z == 1) {
            TECameraModeBase tECameraModeBase2 = this.f56281G;
            if (tECameraModeBase2 != null && (tECameraModeBase2 instanceof urh0)) {
                ((urh0) tECameraModeBase2).m197599b2(i);
                return;
            }
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C13504g.m82006j("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f56306d.mo81682g(this.f56304b.f56177b, -439, i == 0 ? 0 : 1, "Camera is opening, ignore toggleTorch operation.", this.f56278D);
            return;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.mo136976c(i);
            return;
        }
        C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
        C13504g.m81998b("TECamera2", "switch flash mode  failed, you must open camera first.");
        this.f56306d.mo81682g(this.f56304b.f56177b, -439, i == 0 ? 0 : 1, "switch flash mode  failed, you must open camera first.", this.f56278D);
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "switch flash mode  failed, you must open camera first.", this.f56278D);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: D0 */
    public void mo81746D0(int i, int i2, TECameraSettings.InterfaceC13474l interfaceC13474l) {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.f56290z == 2) {
            C13504g.m81997a("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.mo81977r0(i, i2, interfaceC13474l);
        } else {
            C13504g.m81998b("TECamera2", "takePicture : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "takePicture : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: E0 */
    public void mo81747E0(TECameraSettings.InterfaceC13474l interfaceC13474l) {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.f56290z == 2) {
            C13504g.m81997a("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.mo81979s0(interfaceC13474l, this.f56311i);
        } else {
            C13504g.m81998b("TECamera2", "takePicture : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "takePicture : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: F */
    public int mo81790F() {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "getISO...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            return tECameraModeBase.m81927H();
        }
        C13504g.m82006j("TECamera2", "getISO : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getISO : camera is null.", this.f56278D);
        return -1;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: F0 */
    public void mo81748F0(boolean z) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "toggleTorch: " + z);
        if (this.f56290z == 1) {
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C13504g.m81997a("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f56306d.mo81682g(this.f56304b.f56177b, -439, z ? 1 : 0, "Camera is opening, ignore toggleTorch operation.", this.f56278D);
        } else {
            if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
                tECameraModeBase.mo81981t0(z);
                return;
            }
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            C13504g.m82006j("TECamera2", "Toggle torch failed, you must open camera first.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "Toggle torch failed, you must open camera first.", this.f56278D);
            this.f56306d.mo81682g(this.f56304b.f56177b, -439, z ? 1 : 0, "Toggle torch failed, you must open camera first.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: G */
    public int[] mo81791G() {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "getISORange...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            return tECameraModeBase.m81928I();
        }
        C13504g.m82006j("TECamera2", "setWhileBalance : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setWhileBalance : camera is null.", this.f56278D);
        return new int[]{-1, -1};
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: H */
    public float mo81792H() {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            return tECameraModeBase.m81929J();
        }
        C13504g.m81998b("TECamera2", "getManualFocusAbility : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getManualFocusAbility : camera is null.", this.f56278D);
        return -1.0f;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: H0 */
    public void mo81749H0(float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z != 3) {
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f56306d.mo81678c(this.f56304b.f56177b, -420, "Invalid state, state = " + this.f56290z, this.f56278D);
            return;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81920A0(f, interfaceC13478p);
        } else {
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "zoomV2 : Camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: I */
    public int[] mo81750I() {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase != null) {
            return tECameraModeBase.mo81930K();
        }
        C13504g.m81998b("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m81793I0() {
        return this.f56278D != null;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: J */
    public int[] mo81751J() {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.m81931L();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: J0 */
    public int m81794J0(Cert cert) throws Exception {
        dsh0.m117758a("TECamera2-_open");
        if (this.f56277C == null) {
            CameraManager cameraManager = (CameraManager) this.f56308f.getSystemService("camera");
            this.f56277C = cameraManager;
            if (cameraManager == null) {
                return -407;
            }
        }
        int i = this.f56304b.f56150B;
        if (i == 0) {
            m81801R0();
        } else if (i == 1) {
            urh0 urh0Var = new urh0(this, this.f56308f, this.f56277C, this.f56307e);
            this.f56281G = urh0Var;
            urh0Var.m81956g0(this.f56316n);
            this.f56281G.m81949c0(this.f56318p);
        } else {
            this.f56281G = new pqh0(this, this.f56308f, this.f56277C, this.f56307e);
            this.f56306d.mo81680e(117, 0, "enable arcore", this.f56278D);
        }
        this.f56281G.m81958h0(this.f56317o);
        Handler handlerM81923D = this.f56304b.f56195k ? this.f56281G.m81923D() : this.f56307e;
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase instanceof pqh0) {
            ((pqh0) tECameraModeBase).m173353C0(this.f56308f, handlerM81923D);
        }
        TECameraSettings tECameraSettings = this.f56304b;
        tECameraSettings.f56156H = m81807Z0(tECameraSettings.f56181d);
        TECameraSettings tECameraSettings2 = this.f56304b;
        String str = tECameraSettings2.f56156H;
        if (str == null) {
            C13504g.m81998b("TECamera2", "Invalid CameraID");
            return -405;
        }
        int iMo81935P = this.f56281G.mo81935P(str, this.f56280F ? tECameraSettings2.f56152D : 0);
        if (iMo81935P != 0) {
            return iMo81935P;
        }
        m81800O0();
        mo81771l();
        m81788S0(this.f56304b.f56177b, this.f56277C);
        this.f56306d.mo81680e(1, 0, "TECamera2 features is ready", this.f56278D);
        if (this.f56304b.f56195k) {
            try {
                this.f56278D = null;
                wqh0.m207520c(cert, this.f56277C, this.f56304b.f56156H, this.f56288N, handlerM81923D);
                if (this.f56278D == null) {
                    m81810b1();
                }
            } catch (CameraAccessException e) {
                int iM81786P0 = m81786P0(e);
                e.printStackTrace();
                m81805X0();
                return iM81786P0;
            }
        } else {
            try {
                this.f56306d.mo81680e(106, 0, "will start camera2", null);
                wqh0.m207520c(cert, this.f56277C, this.f56304b.f56156H, this.f56288N, handlerM81923D);
            } catch (CameraAccessException e2) {
                int iM81786P1 = m81786P0(e2);
                e2.printStackTrace();
                return iM81786P1;
            }
        }
        dsh0.m117759b();
        return 0;
    }

    /* JADX INFO: renamed from: K0 */
    public void m81795K0(Cert cert) {
        try {
            this.f56281G.m81940U();
            this.f56281G.mo81974q();
            if (this.f56278D != null) {
                this.f56306d.mo81680e(108, 0, "will close camera2", null);
                wqh0.m207519b(cert, this.f56278D);
                this.f56306d.mo81680e(109, 0, "did close camera2", null);
                this.f56278D = null;
                this.f56306d.mo81684i(2, this, this.f56278D);
            }
        } catch (Throwable th) {
            C13504g.m81998b("TECamera2", th.getMessage());
        }
        m81809a1(0);
        this.f56275A = null;
        this.f56276B = null;
        this.f56322t = null;
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null || this.f56304b.f56150B != 2) {
            return;
        }
        ((pqh0) tECameraModeBase).m173352B0();
    }

    /* JADX INFO: renamed from: L0 */
    public int m81796L0() {
        int i;
        dsh0.m117758a("TECamera2-_startCapture");
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            m81850z0();
            this.f56306d.mo81677b(this.f56304b.f56177b, -439, "_startCapture : mode is null", this.f56278D);
            return -1;
        }
        try {
            int iMo81967m0 = tECameraModeBase.mo81967m0();
            if (iMo81967m0 != 0) {
                m81805X0();
                this.f56306d.mo81677b(this.f56304b.f56177b, iMo81967m0, "_startCapture : something wrong", this.f56278D);
            }
            dsh0.m117759b();
            return iMo81967m0;
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                i = -410;
            } else if (e instanceof IllegalArgumentException) {
                i = WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL;
            } else {
                i = e instanceof IllegalStateException ? -409 : -425;
            }
            m81805X0();
            e.printStackTrace();
            C13495e.m81881a(e);
            this.f56306d.mo81677b(this.f56304b.f56177b, i, "_startCapture : mode is null, err msg: " + e.getMessage(), this.f56278D);
            return i;
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: M */
    public long[] mo81797M() {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "getShutterTimeRange...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            return tECameraModeBase.m81933N();
        }
        C13504g.m82006j("TECamera2", "getShutterTimeRange : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getShutterTimeRange : camera is null.", this.f56278D);
        return new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: M0 */
    public int m81798M0() {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "_stopCapture : mode is null", this.f56278D);
            return -1;
        }
        try {
            tECameraModeBase.mo81974q();
            this.f56306d.mo81679d(2, 4, 0, "TECamera2 preview stoped", this.f56278D);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            this.f56306d.mo81678c(this.f56304b.f56177b, -425, "Error:_stopCapture : mode is null", this.f56278D);
            return -1;
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo81752N() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f56378a) == null) {
            C13504g.m81998b("TECamera2", "getSupportedPictureSizes: camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getSupportedPictureSizes: camera is null.", this.f56278D);
            return null;
        }
        if (this.f56286L == null) {
            if (tECameraModeBase.f56389l == null) {
                tECameraModeBase.f56389l = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.f56286L = C13496f.m81890i(this.f56281G.f56389l.getOutputSizes(256));
        }
        return this.f56286L;
    }

    /* JADX INFO: renamed from: N0 */
    public void m81799N0(int i) {
        if (this.f56281G == null) {
            return;
        }
        m81798M0();
        if (i == 0) {
            m81801R0();
        } else if (i == 1) {
            urh0 urh0Var = new urh0(this, this.f56308f, this.f56277C, this.f56307e);
            this.f56281G = urh0Var;
            urh0Var.m81956g0(this.f56316n);
            this.f56281G.m81958h0(this.f56317o);
            this.f56281G.m81949c0(this.f56318p);
        } else {
            this.f56281G = new pqh0(this, this.f56308f, this.f56277C, this.f56307e);
        }
        Handler handlerM81923D = this.f56304b.f56195k ? this.f56281G.m81923D() : this.f56307e;
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase instanceof pqh0) {
            ((pqh0) tECameraModeBase).m173353C0(this.f56308f, handlerM81923D);
        }
        try {
            TECameraSettings tECameraSettings = this.f56304b;
            tECameraSettings.f56156H = m81807Z0(tECameraSettings.f56181d);
            TECameraSettings tECameraSettings2 = this.f56304b;
            String str = tECameraSettings2.f56156H;
            if (str == null || this.f56281G.mo81935P(str, tECameraSettings2.f56152D) != 0) {
                return;
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
        this.f56281G.m81945Z(this.f56278D);
        m81796L0();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo81753O() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f56378a) == null) {
            C13504g.m81998b("TECamera2", "getSupportedPreviewSizes: camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getSupportedPreviewSizes: camera is null.", this.f56278D);
            return null;
        }
        if (this.f56285K == null) {
            if (tECameraModeBase.f56389l == null) {
                tECameraModeBase.f56389l = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.f56285K = C13496f.m81890i(this.f56281G.f56389l.getOutputSizes(SurfaceTexture.class));
        }
        return this.f56285K;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX INFO: renamed from: O0 */
    public void m81800O0() {
        boolean z;
        TECameraSettings tECameraSettings = this.f56304b;
        if (tECameraSettings.f56204o0 && tECameraSettings.f56177b == 2 && tECameraSettings.f56150B == 0) {
            z = this.f56289y.m112064n(this.f56281G.f56378a, 1);
        }
        tECameraSettings.f56204o0 = z;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: Q */
    public boolean mo81754Q() {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        C13504g.m82001e("TECamera2", "isAutoExposureLockSupported...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        }
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null || (cameraCharacteristics = tECameraModeBase.f56378a) == null) {
            C13504g.m81998b("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "isAutoExposureLockSupported : camera is null.", this.f56278D);
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: R */
    public boolean mo81755R() {
        return true;
    }

    /* JADX INFO: renamed from: R0 */
    public void m81801R0() {
        C13504g.m81997a("TECamera2", "create TEVideo2Mode");
        this.f56281G = new hsh0(this, this.f56308f, this.f56277C, this.f56307e);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: T */
    public boolean mo81756T() {
        return true;
    }

    /* JADX INFO: renamed from: T0 */
    public lwk m81802T0() {
        return this.f56282H;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: U */
    public boolean mo81758U() {
        TECameraModeBase tECameraModeBase;
        C13504g.m82001e("TECamera2", "isSupportedExposureCompensation...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null && tECameraModeBase.f56378a != null) {
            return this.f56304b.f56159K.m81689a();
        }
        C13504g.m81998b("TECamera2", "isSupportedExposureCompensation : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "isSupportedExposureCompensation : camera is null.", this.f56278D);
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public int m81803U0() {
        return this.f56290z;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: V */
    public boolean mo81759V() {
        TECameraModeBase tECameraModeBase;
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null || tECameraModeBase.f56378a == null) {
            C13504g.m82006j("TECamera2", "Query torch info failed, you must open camera first.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "Query torch info failed, you must open camera first.", this.f56278D);
            return false;
        }
        if (this.f56289y == null) {
            C13504g.m81998b("TECamera2", "DeviceProxy is null!");
            this.f56306d.mo81678c(this.f56304b.f56177b, -417, "", this.f56278D);
            return false;
        }
        Bundle bundle = m81824A().get(this.f56304b.f56156H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: W */
    public int mo81760W(TECameraSettings tECameraSettings, Cert cert) {
        int iM81786P0;
        dsh0.m117758a("TECamera2-open");
        super.mo81760W(tECameraSettings, cert);
        this.f56322t = cert;
        this.f56304b = tECameraSettings;
        if (this.f56290z == 4) {
            m81795K0(cert);
        }
        try {
            m81809a1(1);
            int iM81794J0 = m81794J0(cert);
            this.f56311i = tECameraSettings.f56181d;
            C13504g.m82001e("TECamera2", "open: camera face = " + this.f56311i + ", ret: " + iM81794J0);
            if (iM81794J0 == 0) {
                this.f56284J = tECameraSettings.f56165Q;
                dsh0.m117759b();
                return 0;
            }
            m81809a1(0);
            m81795K0(cert);
            AbstractC13487c.a aVar = this.f56306d;
            if (aVar == null) {
                return -1;
            }
            aVar.mo81681f(tECameraSettings.f56177b, iM81794J0, null, this.f56278D);
            return -1;
        } catch (Throwable th) {
            C13504g.m81998b("TECamera2", "open: camera face = " + this.f56311i + " failed: " + th.getMessage());
            if (th instanceof CameraAccessException) {
                iM81786P0 = m81786P0(th);
            } else if (th instanceof IllegalArgumentException) {
                iM81786P0 = -405;
            } else {
                iM81786P0 = th instanceof SecurityException ? -408 : WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
            }
            m81809a1(4);
            m81795K0(cert);
            AbstractC13487c.a aVar2 = this.f56306d;
            if (aVar2 != null) {
                aVar2.mo81681f(tECameraSettings.f56177b, iM81786P0, null, this.f56278D);
            }
            return iM81786P0;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m81804W0() {
        crh0 crh0Var = this.f56289y;
        return crh0Var != null && crh0Var.mo112069s();
    }

    /* JADX INFO: renamed from: X0 */
    public void m81805X0() {
        if (this.f56304b.f56195k) {
            this.f56287M.open();
            C13504g.m82001e("TECamera2", "open camera-operation lock");
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m81806Y0() {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase != null) {
            tECameraModeBase.m81939T();
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: Z */
    public void mo81761Z(TECameraSettings.InterfaceC13476n interfaceC13476n) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null || (cameraCharacteristics = tECameraModeBase.f56378a) == null) {
            C13504g.m81998b("TECamera2", "queryShaderZoomStep: camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "queryShaderZoomStep: camera is null.", this.f56278D);
            return;
        }
        crh0 crh0Var = this.f56289y;
        if (crh0Var == null) {
            C13504g.m81998b("TECamera2", "DeviceProxy is null!");
            this.f56306d.mo81678c(this.f56304b.f56177b, -420, "", this.f56278D);
        } else {
            float fM112056f = crh0Var.m112056f(cameraCharacteristics);
            if (interfaceC13476n != null) {
                interfaceC13476n.m81694a(fM112056f);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public String m81807Z0(int i) throws CameraAccessException {
        return this.f56281G.m81941V(this.f56304b.f56181d);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: a */
    public void mo81808a() {
        if (!m81793I0()) {
            C13504g.m81998b("TECamera2", "Device is not ready.");
            return;
        }
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase != null) {
            tECameraModeBase.m81954f();
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: a0 */
    public void mo81762a0(TECameraSettings.InterfaceC13478p interfaceC13478p, boolean z) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null || (cameraCharacteristics = tECameraModeBase.f56378a) == null) {
            C13504g.m81998b("TECamera2", "queryZoomAbility: camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "queryZoomAbility: camera is null.", this.f56278D);
            return;
        }
        crh0 crh0Var = this.f56289y;
        if (crh0Var == null) {
            C13504g.m81998b("TECamera2", "DeviceProxy is null!");
            this.f56306d.mo81678c(this.f56304b.f56177b, -420, "", this.f56278D);
            return;
        }
        TECameraSettings tECameraSettings = this.f56304b;
        float fM112055e = crh0Var.m112055e(cameraCharacteristics, tECameraSettings.f56177b, tECameraSettings.f56205p);
        this.f56314l = fM112055e;
        C13504g.m81997a("TECamera2", "zoom: " + fM112055e + ", factor = " + this.f56304b.f56205p);
        if (interfaceC13478p != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * fM112055e)));
            interfaceC13478p.onZoomSupport(this.f56304b.f56177b, fM112055e > 0.0f, false, fM112055e, arrayList);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m81809a1(int i) {
        if (this.f56290z == i) {
            C13504g.m82006j("TECamera2", "No need update state: " + i);
        } else {
            C13504g.m82001e("TECamera2", "[updateSessionState]: " + this.f56290z + " -> " + i);
            this.f56290z = i;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m81810b1() {
        if (this.f56304b.f56195k) {
            this.f56287M.close();
            C13504g.m82001e("TECamera2", "block camera-operation start...");
            C13504g.m82001e("TECamera2", "block camera-operation end...result = " + this.f56287M.block(1000L));
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: c */
    public void mo81763c() {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81961j();
        } else {
            C13504g.m81998b("TECamera2", "cancelFocus : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "cancelFocus : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: d */
    public void mo81811d(hj3 hj3Var, TECameraSettings.InterfaceC13465c interfaceC13465c) {
        this.f56281G.mo81970o(hj3Var, this.f56311i, interfaceC13465c);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: f */
    public void mo81764f(Cert cert) {
        C13504g.m81997a("TECamera2", "close...");
        if (this.f56290z == 1) {
            if (this.f56284J) {
                this.f56283I = true;
            }
        } else {
            m81795K0(cert);
            TECameraModeBase tECameraModeBase = this.f56281G;
            if (tECameraModeBase != null) {
                tECameraModeBase.m81972p();
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: f0 */
    public void mo81812f0(float f) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "setAperture : " + f);
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setAperture operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81942W(f);
        } else {
            C13504g.m82006j("TECamera2", "setAperture : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setAperture : camera is null.", this.f56278D);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03df A[LOOP:0: B:153:0x03d9->B:155:0x03df, LOOP_END] */
    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: g */
    public void mo81765g() {
        String[] strArr;
        int i;
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        Iterator<Integer> it;
        dsh0.m117758a("TECamera2-collectCameraCapabilities");
        if (!m81831S()) {
            dsh0.m117759b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        int i2 = 1;
        if (this.f56277C != null) {
            try {
                this.f56324v.putOpt("camera_id", this.f56304b.f56156H);
                crh0 crh0Var = this.f56289y;
                if (crh0Var != null) {
                    CameraCharacteristics cameraCharacteristics = this.f56281G.f56378a;
                    TECameraSettings tECameraSettings = this.f56304b;
                    this.f56324v.putOpt("camera_zoom_max_ability", Float.valueOf(crh0Var.m112055e(cameraCharacteristics, tECameraSettings.f56177b, tECameraSettings.f56205p)));
                }
                JSONArray jSONArray = new JSONArray();
                String[] cameraIdList = this.f56277C.getCameraIdList();
                int length = cameraIdList.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = cameraIdList[i3];
                    JSONObject jSONObject = new JSONObject();
                    CameraCharacteristics cameraCharacteristics2 = this.f56277C.getCameraCharacteristics(str);
                    if (cameraCharacteristics2 == null) {
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        strArr = cameraIdList;
                        i = length;
                    } else {
                        jSONObject.putOpt("camera_id", str);
                        jSONObject.putOpt("camera_facing", Integer.valueOf(((Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING)).intValue() == i2 ? 0 : i2));
                        int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        if (iArr != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i4 : iArr) {
                                arrayList.add(Integer.valueOf(i4));
                            }
                            Iterator<Integer> it2 = TECameraCapabilityCollector.f56329d.keySet().iterator();
                            while (it2.hasNext()) {
                                Integer next = it2.next();
                                TECameraCapabilityCollector.Capability capability = TECameraCapabilityCollector.f56329d.get(next);
                                if (capability != null) {
                                    if (map.get(capability) == null) {
                                        map.put(capability, new HashMap());
                                    }
                                    it = it2;
                                    ((Map) map.get(capability)).put(str, Boolean.valueOf(arrayList.contains(next)));
                                    if (capability.equals(TECameraCapabilityCollector.Capability.DEPTH_OUTPUT)) {
                                        jSONObject.putOpt("depth_out_put", Boolean.valueOf(arrayList.contains(next)));
                                    }
                                    if (capability.equals(TECameraCapabilityCollector.Capability.MANUAL_3A)) {
                                        jSONObject.put("manual_3A", arrayList.contains(next));
                                    }
                                    if (capability.equals(TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA)) {
                                        jSONObject.put("logical_multi_Camera", arrayList.contains(next));
                                    }
                                } else {
                                    it = it2;
                                }
                                it2 = it;
                            }
                        }
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            Range<Integer>[] highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges();
                            if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.length == 0) {
                                strArr = cameraIdList;
                                i = length;
                            } else {
                                TECameraCapabilityCollector.Capability capability2 = TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE;
                                if (map.get(capability2) == null) {
                                    map.put(capability2, new HashMap());
                                }
                                ((Map) map.get(capability2)).put(str, Arrays.toString(highSpeedVideoFpsRanges));
                                JSONArray jSONArray2 = new JSONArray();
                                int length2 = highSpeedVideoFpsRanges.length;
                                int i5 = 0;
                                while (i5 < length2) {
                                    Range<Integer> range = highSpeedVideoFpsRanges[i5];
                                    Range<Integer>[] rangeArr = highSpeedVideoFpsRanges;
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.putOpt("high_fps_min", range.getLower());
                                    jSONObject2.putOpt("high_fps_max", range.getUpper());
                                    jSONArray2.put(jSONObject2);
                                    i5++;
                                    highSpeedVideoFpsRanges = rangeArr;
                                    cameraIdList = cameraIdList;
                                    length = length;
                                }
                                strArr = cameraIdList;
                                i = length;
                                jSONObject.putOpt("high_speed_fps_range", jSONArray2);
                            }
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                            TECameraCapabilityCollector.Capability capability3 = TECameraCapabilityCollector.Capability.PREVIEW_SIZE;
                            if (map.get(capability3) == null) {
                                map.put(capability3, new HashMap());
                            }
                            ((Map) map.get(capability3)).put(str, Arrays.toString(outputSizes));
                            JSONArray jSONArray3 = new JSONArray();
                            if (outputSizes != null && outputSizes.length > 0) {
                                int length3 = outputSizes.length;
                                int i6 = 0;
                                while (i6 < length3) {
                                    Size size = outputSizes[i6];
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.putOpt("width", Integer.valueOf(size.getWidth()));
                                    jSONObject3.putOpt("height", Integer.valueOf(size.getHeight()));
                                    jSONArray3.put(jSONObject3);
                                    i6++;
                                    outputSizes = outputSizes;
                                }
                                jSONObject.putOpt("preview_size_list", jSONArray3);
                            }
                        } else {
                            strArr = cameraIdList;
                            i = length;
                        }
                        Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        TECameraCapabilityCollector.Capability capability4 = TECameraCapabilityCollector.Capability.FPS_RANGE;
                        if (map.get(capability4) == null) {
                            map.put(capability4, new HashMap());
                        }
                        ((Map) map.get(capability4)).put(str, Arrays.toString(rangeArr2));
                        JSONArray jSONArray4 = new JSONArray();
                        if (rangeArr2 != null && rangeArr2.length > 0) {
                            int length4 = rangeArr2.length;
                            int i7 = 0;
                            while (i7 < length4) {
                                Range range2 = rangeArr2[i7];
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.putOpt("fps_min", range2.getLower());
                                jSONObject4.putOpt("fps_high", range2.getUpper());
                                jSONArray4.put(jSONObject4);
                                i7++;
                                rangeArr2 = rangeArr2;
                            }
                            jSONObject.putOpt("fps_range_List", jSONArray4);
                        }
                        float[] fArr = (float[]) cameraCharacteristics2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                        TECameraCapabilityCollector.Capability capability5 = TECameraCapabilityCollector.Capability.SUPPORT_APERTURES;
                        if (map.get(capability5) == null) {
                            map.put(capability5, new HashMap());
                        }
                        ((Map) map.get(capability5)).put(str, Arrays.toString(fArr));
                        JSONArray jSONArray5 = new JSONArray();
                        if (fArr != null && fArr.length > 0) {
                            for (float f : fArr) {
                                jSONArray5.put(f);
                            }
                            jSONObject.putOpt("support_apertures", jSONArray5);
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (cameraExtensionCharacteristics = this.f56277C.getCameraExtensionCharacteristics(str)) != null) {
                            List supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
                            TECameraCapabilityCollector.Capability capability6 = TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS;
                            if (map.get(capability6) == null) {
                                map.put(capability6, new HashMap());
                            }
                            if (supportedExtensions != null) {
                                ((Map) map.get(capability6)).put(str, supportedExtensions.toString());
                                JSONArray jSONArray6 = new JSONArray();
                                if (supportedExtensions.size() > 0) {
                                    Iterator it3 = supportedExtensions.iterator();
                                    while (it3.hasNext()) {
                                        jSONArray6.put(((Integer) it3.next()).intValue());
                                    }
                                    jSONObject.putOpt("support_extensions", jSONArray6);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                    try {
                        i3++;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        cameraIdList = strArr;
                        length = i;
                        i2 = 1;
                    } catch (CameraAccessException e) {
                        e = e;
                        C13504g.m82006j("TECamera2", "Get Camera Capbilities failed!");
                        e.printStackTrace();
                        for (Map.Entry entry : map.entrySet()) {
                            TECameraCapabilityCollector.Capability capability7 = (TECameraCapabilityCollector.Capability) entry.getKey();
                            Object value = entry.getValue();
                            TECameraCapabilityCollector tECameraCapabilityCollector = this.f56323u;
                            tECameraCapabilityCollector.m81851a(new TECameraCapabilityCollector.C13491a(capability7, tECameraCapabilityCollector.m81852b(capability7), value.toString()));
                        }
                        this.f56323u.m81854d();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C13504g.m82001e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
                        hrh0.m136853b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis2);
                        this.f56325w = true;
                        dsh0.m117759b();
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        while (r0.hasNext()) {
                            TECameraCapabilityCollector.Capability capability8 = (TECameraCapabilityCollector.Capability) entry.getKey();
                            Object value2 = entry.getValue();
                            TECameraCapabilityCollector tECameraCapabilityCollector2 = this.f56323u;
                            tECameraCapabilityCollector2.m81851a(new TECameraCapabilityCollector.C13491a(capability8, tECameraCapabilityCollector2.m81852b(capability8), value2.toString()));
                        }
                        this.f56323u.m81854d();
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C13504g.m82001e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis3);
                        hrh0.m136853b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis3);
                        this.f56325w = true;
                        dsh0.m117759b();
                    }
                }
                jCurrentTimeMillis = jCurrentTimeMillis;
                this.f56324v.putOpt("camera_feature", jSONArray);
                if (Build.VERSION.SDK_INT >= 30) {
                    Set<Set> concurrentCameraIds = this.f56277C.getConcurrentCameraIds();
                    ArrayList arrayList2 = new ArrayList();
                    if (concurrentCameraIds != null) {
                        for (Set set : concurrentCameraIds) {
                            Iterator it4 = set.iterator();
                            boolean z = false;
                            boolean z2 = false;
                            while (it4.hasNext()) {
                                CameraCharacteristics cameraCharacteristics3 = this.f56277C.getCameraCharacteristics((String) it4.next());
                                if (cameraCharacteristics3 != null) {
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics3.get(key)).intValue() == 1) {
                                        z2 = true;
                                    } else if (((Integer) cameraCharacteristics3.get(key)).intValue() == 0) {
                                        z = true;
                                    }
                                }
                            }
                            if (z && z2) {
                                arrayList2.add(set);
                            }
                        }
                        TECameraCapabilityCollector.Capability capability9 = TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS;
                        TECameraCapabilityCollector tECameraCapabilityCollector3 = this.f56323u;
                        tECameraCapabilityCollector3.m81851a(new TECameraCapabilityCollector.C13491a(capability9, tECameraCapabilityCollector3.m81852b(capability9), arrayList2.toString()));
                        JSONArray jSONArray7 = new JSONArray();
                        if (arrayList2.size() > 0) {
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                jSONArray7.put((Set) it5.next());
                            }
                            this.f56324v.putOpt("camera_front_back_multicam_combos", jSONArray7);
                        }
                    }
                }
            } catch (CameraAccessException e3) {
                e = e3;
                jCurrentTimeMillis = jCurrentTimeMillis;
            } catch (JSONException e4) {
                e = e4;
                jCurrentTimeMillis = jCurrentTimeMillis;
            }
        } else {
            jCurrentTimeMillis = jCurrentTimeMillis;
        }
        while (r0.hasNext()) {
            TECameraCapabilityCollector.Capability capability10 = (TECameraCapabilityCollector.Capability) entry.getKey();
            Object value3 = entry.getValue();
            TECameraCapabilityCollector tECameraCapabilityCollector4 = this.f56323u;
            tECameraCapabilityCollector4.m81851a(new TECameraCapabilityCollector.C13491a(capability10, tECameraCapabilityCollector4.m81852b(capability10), value3.toString()));
        }
        this.f56323u.m81854d();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
        C13504g.m82001e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis4);
        hrh0.m136853b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis4);
        this.f56325w = true;
        dsh0.m117759b();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: g0 */
    public void mo81766g0(boolean z) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        C13504g.m82001e("TECamera2", "setAutoExposureLock...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
            return;
        }
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null || (cameraCharacteristics = tECameraModeBase.f56378a) == null) {
            C13504g.m81998b("TECamera2", "setAutoExposureLock : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setAutoExposureLock : camera is null.", this.f56278D);
            return;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            this.f56281G.m81943X(z);
        } else {
            C13504g.m82006j("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.f56306d.mo81680e(-426, -426, "Current camera doesn't support auto exposure lock.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: h0 */
    public void mo81767h0(boolean z) {
        TECameraModeBase tECameraModeBase;
        C13504g.m82001e("TECamera2", "setAutoFocusLock...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
            return;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null && tECameraModeBase.f56378a != null) {
            tECameraModeBase.m81944Y(z);
        } else {
            C13504g.m81998b("TECamera2", "setAutoFocusLock : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setAutoFocusLock : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: i */
    public void mo81813i() {
        super.mo81813i();
        m81806Y0();
        this.f56282H.m156063g();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: j */
    public void mo81768j() {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81985w();
        } else {
            C13504g.m81998b("TECamera2", "enableCaf : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "enableCaf : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: j0 */
    public boolean mo81769j0(int i) {
        TECameraModeBase tECameraModeBase;
        C13504g.m82001e("TECamera2", "setExposureCompensation... value: " + i);
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null || tECameraModeBase.f56378a == null) {
            C13504g.m81998b("TECamera2", "setExposureCompensation : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, "setExposureCompensation : camera is null.", this.f56278D);
            return false;
        }
        if (!this.f56304b.f56159K.m81689a()) {
            C13504g.m82006j("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.f56306d.mo81680e(-414, -414, "Current camera doesn't support setting exposure compensation.", this.f56278D);
            return false;
        }
        TECameraSettings.C13466d c13466d = this.f56304b.f56159K;
        if (i <= c13466d.f56232a && i >= c13466d.f56234c) {
            return this.f56281G.m81947a0(i);
        }
        String str = "Invalid exposure compensation value: " + i + ", it must between [" + this.f56304b.f56159K.f56234c + ", " + this.f56304b.f56159K.f56232a + "].";
        C13504g.m82006j("TECamera2", str);
        this.f56306d.mo81680e(-415, -415, str, this.f56278D);
        return false;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: k */
    public void mo81814k(boolean z) {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            C13504g.m81998b("TECamera2", "enableMulticamZoom failed, mode is null...");
        } else {
            tECameraModeBase.m81987x(z);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: k0 */
    public void mo81770k0(Bundle bundle) {
        super.mo81770k0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f56320r.get(this.f56304b.f56156H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.C13473k.m81692a(str, bundle.get(str)) && "support_light_soft".equalsIgnoreCase(str)) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: l */
    public Bundle mo81771l() {
        CameraCharacteristics cameraCharacteristics;
        crh0 crh0Var;
        dsh0.m117758a("TECamera2-fillFeatures");
        Bundle bundleMo81771l = super.mo81771l();
        if (bundleMo81771l != null) {
            bundleMo81771l.putParcelableArrayList("support_preview_sizes", (ArrayList) mo81753O());
            bundleMo81771l.putParcelableArrayList("support_picture_sizes", (ArrayList) mo81752N());
            bundleMo81771l.putParcelableArrayList("camera_support_fps_range", (ArrayList) m81789V0());
            TECameraModeBase tECameraModeBase = this.f56281G;
            if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f56378a) != null && (crh0Var = this.f56289y) != null) {
                bundleMo81771l.putBoolean("device_support_multicamera_zoom", crh0Var.m112065o(cameraCharacteristics) && Build.VERSION.SDK_INT >= 30);
                bundleMo81771l.putBoolean("camera_torch_supported", this.f56289y.m112070t(this.f56281G.f56378a));
            }
            bundleMo81771l.putInt("device_support_wide_angle_mode", m81804W0() ? 1 : 0);
        }
        dsh0.m117759b();
        return bundleMo81771l;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: l0 */
    public void mo81815l0(int i) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "setISO : " + i);
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setISO operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81951d0(i);
        } else {
            C13504g.m82006j("TECamera2", "setISO : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setISO : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: m */
    public void mo81772m(TEFocusSettings tEFocusSettings) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "setFocusAreas...");
        if (this.f56290z != 3) {
            C13504g.m82006j("TECamera2", "Camera is not previewing, ignore setFocusAreas operation.");
            tEFocusSettings.m81703g().mo81717a(0, this.f56304b.f56181d, "Camera is not previewing, ignore setFocusAreas operation.");
            return;
        }
        if (!m81793I0() || (tECameraModeBase = this.f56281G) == null) {
            C13504g.m81998b("TECamera2", "focusAtPoint : camera is null.");
            tEFocusSettings.m81703g().mo81717a(-439, this.f56304b.f56181d, "focusAtPoint : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "focusAtPoint : camera is null.", this.f56278D);
        } else {
            int iMo81991z = tECameraModeBase.mo81991z(tEFocusSettings);
            if (iMo81991z != 0) {
                C13504g.m81998b("TECamera2", "focusAtPoint : something wrong.");
                this.f56306d.mo81680e(-411, iMo81991z, "focusAtPoint : something wrong.", this.f56278D);
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: m0 */
    public void mo81816m0(float f) {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81953e0(f);
        } else {
            C13504g.m81998b("TECamera2", "setManualFocusDistance : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setManualFocusDistance : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: n */
    public void mo81773n(Cert cert) {
        super.mo81773n(cert);
        C13504g.m82001e("TECamera2", "force close camera: " + this.f56278D);
        if (this.f56278D != null) {
            wqh0.m207519b(cert, this.f56278D);
            this.f56278D = null;
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: n0 */
    public void mo81774n0(int i, int i2) {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            C13504g.m81998b("TECamera2", "set picture size failed, no mode...");
        } else {
            tECameraModeBase.mo81955f0(i, i2);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: o */
    public float[] mo81817o() {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "getApertureRange...");
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            return tECameraModeBase.m81919A();
        }
        C13504g.m82006j("TECamera2", "getApertureRange : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getApertureRange : camera is null.", this.f56278D);
        return new float[]{-1.0f, -1.0f};
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: p */
    public TEFrameSizei mo81776p(float f, TEFrameSizei tEFrameSizei) {
        if (this.f56290z == 0 || this.f56290z == 1) {
            C13504g.m81998b("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase.f56389l == null) {
            tECameraModeBase.f56389l = (StreamConfigurationMap) tECameraModeBase.f56378a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f56281G.f56389l;
        if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            C13504g.m81998b("TECamera2", "Output is not supported, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        AbstractC13487c.e eVar = this.f56317o;
        TEFrameSizei previewSize = eVar != null ? eVar.getPreviewSize(arrayList) : null;
        if (previewSize == null) {
            return tEFrameSizei != null ? C13496f.m81883b(arrayList, tEFrameSizei) : C13496f.m81884c(arrayList, f);
        }
        return previewSize;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: q */
    public JSONObject mo81777q() {
        return this.f56324v;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: r */
    public int[] mo81778r() {
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.mo81921B();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: r0 */
    public void mo81779r0(int i) {
        super.mo81779r0(i);
        TECameraModeBase tECameraModeBase = this.f56281G;
        if (tECameraModeBase == null) {
            C13504g.m81998b("TECamera2", "set scene failed, no mode...");
        } else {
            tECameraModeBase.mo81960i0(i);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: s0 */
    public void mo81818s0(long j) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "setShutterTime : " + j);
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setShutterTime operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81962j0(j);
        } else {
            C13504g.m82006j("TECamera2", "setISO : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setISO : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: t0 */
    public void mo81780t0(boolean z, String str) {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "setWhileBalance: " + str);
        if (this.f56290z == 1) {
            C13504g.m82006j("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81964k0(z, str);
        } else {
            C13504g.m82006j("TECamera2", "setWhileBalance : camera is null.");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "setWhileBalance : camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: u0 */
    public void mo81781u0() {
        dsh0.m117758a("TECamera2-startCapture");
        C13504g.m81997a("TECamera2", "startCapture...");
        if (!m81793I0() || this.f56309g == null) {
            C13504g.m81998b("TECamera2", "startCapture, Device is not ready.");
            return;
        }
        if (this.f56290z != 2 && this.f56290z != 3) {
            C13504g.m81998b("TECamera2", "startCapture, Invalid state: " + this.f56290z);
            return;
        }
        try {
            this.f56304b.f56183e = mo81744C();
            C13504g.m82001e("TECamera2", "Camera rotation = " + this.f56304b.f56183e);
        } catch (Exception e) {
            C13495e.m81881a(e);
            m81795K0(this.f56322t);
            AbstractC13487c.a aVar = this.f56306d;
            if (aVar != null) {
                aVar.mo81681f(this.f56304b.f56177b, -425, null, this.f56278D);
            }
        }
        m81796L0();
        dsh0.m117759b();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: v */
    public int mo81782v() {
        return 2;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: v0 */
    public int mo81819v0() {
        return this.f56281G.mo81969n0();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: w0 */
    public void mo81783w0(float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        TECameraModeBase tECameraModeBase;
        if (this.f56290z != 3) {
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f56306d.mo81680e(-420, -420, "Invalid state, state = " + this.f56290z, this.f56278D);
            return;
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            tECameraModeBase.m81971o0(f, interfaceC13478p);
        } else {
            C13504g.m81998b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f56306d.mo81678c(this.f56304b.f56177b, -439, "startZoom : Camera is null.", this.f56278D);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: x */
    public float[] mo81784x() {
        TECameraModeBase tECameraModeBase;
        C13504g.m81997a("TECamera2", "getVFOV...");
        if (this.f56290z == 1) {
            C13504g.m81997a("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        }
        if (m81793I0() && (tECameraModeBase = this.f56281G) != null) {
            return tECameraModeBase.m81925F();
        }
        C13504g.m81998b("TECamera2", "getFOV : camera is null.");
        this.f56306d.mo81678c(this.f56304b.f56177b, -439, "getFOV : camera is null.", this.f56278D);
        return new float[]{-2.0f, -2.0f};
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: x0 */
    public void mo81785x0() {
        C13504g.m82001e("TECamera2", "stopCapture...");
        if (!m81793I0()) {
            C13504g.m81998b("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f56290z != 3) {
            C13504g.m81998b("TECamera2", "Invalid state: " + this.f56290z);
        }
        m81798M0();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: y0 */
    public int mo81820y0() {
        return this.f56281G.mo81973p0();
    }
}
