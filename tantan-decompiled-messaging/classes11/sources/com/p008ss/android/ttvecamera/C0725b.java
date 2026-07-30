package com.p008ss.android.ttvecamera;

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
import com.p008ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.p008ss.android.ttvecamera.framework.TECameraModeBase;
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
import p009l.ajh0;
import p009l.akh0;
import p009l.iih0;
import p009l.njh0;
import p009l.pih0;
import p009l.ti3;
import p009l.vih0;
import p009l.vtk;
import p009l.wjh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class C0725b extends AbstractC0726c {

    /* JADX INFO: renamed from: A */
    protected CameraCharacteristics f9033A;

    /* JADX INFO: renamed from: B */
    protected CaptureRequest f9034B;

    /* JADX INFO: renamed from: C */
    protected CameraManager f9035C;

    /* JADX INFO: renamed from: D */
    protected volatile CameraDevice f9036D;

    /* JADX INFO: renamed from: E */
    protected int f9037E;

    /* JADX INFO: renamed from: F */
    protected boolean f9038F;

    /* JADX INFO: renamed from: G */
    protected TECameraModeBase f9039G;

    /* JADX INFO: renamed from: H */
    private final vtk f9040H;

    /* JADX INFO: renamed from: I */
    protected boolean f9041I;

    /* JADX INFO: renamed from: J */
    protected boolean f9042J;

    /* JADX INFO: renamed from: K */
    private List<TEFrameSizei> f9043K;

    /* JADX INFO: renamed from: L */
    private List<TEFrameSizei> f9044L;

    /* JADX INFO: renamed from: M */
    protected ConditionVariable f9045M;

    /* JADX INFO: renamed from: N */
    protected CameraDevice.StateCallback f9046N;

    /* JADX INFO: renamed from: y */
    protected vih0 f9047y;

    /* JADX INFO: renamed from: z */
    protected volatile int f9048z;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$a */
    public class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        b<CameraDevice> f9049a;

        public a() {
            this.f9049a = new b<>(C0725b.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            TECameraModeBase tECameraModeBase = C0725b.this.f9039G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m16572D0(cameraDevice, 4, -1);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            C0743g.m11169e("TECamera2", "onDisconnected: OpenCameraCallBack");
            TECameraModeBase tECameraModeBase = C0725b.this.f9039G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m16572D0(cameraDevice, 1, -1);
            }
            C0725b.this.m10973X0();
            b<CameraDevice> bVar = this.f9049a;
            if (bVar != null) {
                bVar.m10989a(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            C0743g.m11169e("TECamera2", "onError: " + i);
            TECameraModeBase tECameraModeBase = C0725b.this.f9039G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m16572D0(cameraDevice, 3, i);
            }
            C0725b.this.m10973X0();
            b<CameraDevice> bVar = this.f9049a;
            if (bVar == null) {
                C0743g.m11166b("TECamera2", "had called onError");
            } else {
                bVar.m10990b(cameraDevice, i);
                this.f9049a = null;
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            C0743g.m11169e("TECamera2", "onOpened: OpenCameraCallBack");
            C0725b.this.f9064d.mo10848e(107, 0, "did start camera2", null);
            TECameraModeBase tECameraModeBase = C0725b.this.f9039G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m16572D0(cameraDevice, 0, -1);
            }
            C0725b.this.f9036D = cameraDevice;
            C0725b.this.f9039G.m11113Z(cameraDevice);
            C0725b.this.m10973X0();
            b<CameraDevice> bVar = this.f9049a;
            if (bVar == null || !bVar.m10991c(cameraDevice)) {
                pih0.m20300b(C0725b.this.f9080t, cameraDevice);
                C0743g.m11174j("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                return;
            }
            C0725b c0725b = C0725b.this;
            if (c0725b.f9042J && c0725b.f9041I) {
                pih0.m20300b(c0725b.f9080t, cameraDevice);
                C0743g.m11174j("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                C0725b.this.f9041I = false;
            } else if (c0725b.f9062b.f8962o0) {
                try {
                    c0725b.f9039G.m11150u();
                } catch (Exception e) {
                    C0743g.m11174j("TECamera2", "onOpened: createSessionByDeferredSurface, some bad case occur, close camera! exception msg: " + e.getMessage());
                    C0725b c0725b2 = C0725b.this;
                    c0725b2.f9062b.f8962o0 = false;
                    if (c0725b2.f9048z != 3) {
                        C0725b.this.mo10949u0();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        WeakReference<C0725b> f9051a;

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0725b f9052a;

            public a(C0725b c0725b) {
                this.f9052a = c0725b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0725b c0725b = this.f9052a;
                AbstractC0726c.a aVar = c0725b.f9064d;
                if (aVar != null) {
                    aVar.mo10849f(c0725b.f9062b.f8935b, 0, null, c0725b.f9036D);
                } else {
                    C0743g.m11166b("TECamera2", "mCameraEvents is null!");
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$b, reason: collision with other inner class name */
        public class RunnableC1383b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0725b f9054a;

            public RunnableC1383b(C0725b c0725b) {
                this.f9054a = c0725b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0725b c0725b = this.f9054a;
                c0725b.m10963K0(c0725b.f9080t);
                C0725b c0725b2 = this.f9054a;
                AbstractC0726c.a aVar = c0725b2.f9064d;
                if (aVar != null) {
                    aVar.mo10846c(c0725b2.f9062b.f8935b, -409, "Camera onDisconnected", c0725b2.f9036D);
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0725b f9056a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f9057b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f9058c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f9059d;

            public c(C0725b c0725b, int i, int i2, String str) {
                this.f9056a = c0725b;
                this.f9057b = i;
                this.f9058c = i2;
                this.f9059d = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                C0725b c0725b = this.f9056a;
                c0725b.m10963K0(c0725b.f9080t);
                C0725b c0725b2 = this.f9056a;
                AbstractC0726c.a aVar = c0725b2.f9064d;
                if (aVar != null) {
                    if (this.f9057b == 3 && (i = this.f9058c) == 3) {
                        aVar.mo10846c(c0725b2.f9062b.f8935b, i, this.f9059d, c0725b2.f9036D);
                    } else {
                        aVar.mo10849f(c0725b2.f9062b.f8935b, this.f9058c, null, c0725b2.f9036D);
                    }
                }
            }
        }

        public b(C0725b c0725b) {
            this.f9051a = new WeakReference<>(c0725b);
        }

        /* JADX INFO: renamed from: a */
        public boolean m10989a(@NonNull T t) {
            C0743g.m11166b("TECamera2", "StateCallback::onDisconnected...");
            C0725b c0725b = this.f9051a.get();
            if (c0725b == null) {
                return false;
            }
            if (c0725b.f9062b.f8958m0) {
                C0743g.m11166b("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                c0725b.f9062b.f8958m0 = false;
                return false;
            }
            RunnableC1383b runnableC1383b = new RunnableC1383b(c0725b);
            if (c0725b.f9062b.f8953k) {
                c0725b.f9065e.post(runnableC1383b);
                return true;
            }
            runnableC1383b.run();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m10990b(@NonNull T t, int i) {
            C0725b c0725b = this.f9051a.get();
            if (c0725b == null) {
                C0743g.m11166b("TECamera2", "onError...no camera holder");
                return false;
            }
            int iM10971U0 = c0725b.m10971U0();
            String str = "StateCallback::onError..." + i + ", session code: " + iM10971U0;
            C0743g.m11169e("TECamera2", str);
            c cVar = new c(c0725b, iM10971U0, i, str);
            if (c0725b.f9062b.f8953k) {
                c0725b.f9065e.post(cVar);
            } else {
                cVar.run();
            }
            c0725b.m10977a1(4);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m10991c(@NonNull T t) {
            C0743g.m11169e("TECamera2", "StateCallback::onOpened...");
            C0725b c0725b = this.f9051a.get();
            if (c0725b == null) {
                return false;
            }
            c0725b.f9062b.f8958m0 = false;
            c0725b.m10977a1(2);
            a aVar = new a(c0725b);
            if (c0725b.f9062b.f8953k) {
                c0725b.f9065e.post(aVar);
            } else {
                aVar.run();
            }
            c0725b.f9038F = false;
            return true;
        }
    }

    public C0725b(int i, Context context, AbstractC0726c.a aVar, Handler handler, AbstractC0726c.d dVar) {
        super(context, aVar, handler, dVar);
        this.f9048z = 0;
        this.f9037E = -1;
        this.f9038F = true;
        this.f9041I = false;
        this.f9042J = false;
        this.f9043K = null;
        this.f9044L = null;
        this.f9045M = new ConditionVariable();
        this.f9046N = new a();
        this.f9062b = new TECameraSettings(context, i);
        this.f9040H = new vtk(context);
        this.f9047y = vih0.m23382c(context, i);
    }

    /* JADX INFO: renamed from: P0 */
    private int m10954P0(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return -408;
        }
        if (reason == 2) {
            return -409;
        }
        if (reason != 3) {
            return (reason == 4 || reason == 5) ? -406 : -401;
        }
        return -410;
    }

    /* JADX INFO: renamed from: Q0 */
    public static C0725b m10955Q0(int i, Context context, AbstractC0726c.a aVar, Handler handler, AbstractC0726c.d dVar) {
        return new C0725b(i, context, aVar, handler, dVar);
    }

    /* JADX INFO: renamed from: S0 */
    private void m10956S0(int i, CameraManager cameraManager) {
        wjh0.m24289a("TECamera2-fillWideCameraID");
        vih0 vih0Var = this.f9047y;
        if (vih0Var != null) {
            vih0Var.mo21668b(this.f9062b.f8935b, this.f9035C);
        }
        wjh0.m24290b();
    }

    /* JADX INFO: renamed from: V0 */
    private List<TEFrameRateRange> m10957V0() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f9136a) != null) {
            return C0735f.m11057h((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        }
        C0743g.m11166b("TECamera2", "getSupportedFpsRanges: camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getSupportedFpsRanges: camera is null.", this.f9036D);
        return null;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: A0 */
    public void mo10909A0(TECameraSettings.InterfaceC0717p interfaceC0717p) {
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: B */
    public int mo10910B() {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            return -1;
        }
        return tECameraModeBase.mo11094G();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: B0 */
    public void mo10911B0(int i) {
        if (this.f9048z == 3) {
            m10967N0(i);
            return;
        }
        C0743g.m11174j("TECamera2", "Invalid state: " + this.f9048z);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: C */
    public int mo10912C() {
        int iM11066q = this.f9071k;
        if (iM11066q < 0) {
            iM11066q = C0735f.m11066q(this.f9066f);
        }
        this.f9068h = this.f9069i;
        CameraCharacteristics cameraCharacteristics = this.f9033A;
        int iIntValue = cameraCharacteristics != null ? ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() : this.f9062b.f8941e;
        if (this.f9068h == 1) {
            this.f9070j = (540 - ((iIntValue + iM11066q) % 360)) % 360;
        } else {
            this.f9070j = ((iIntValue - iM11066q) + 360) % 360;
        }
        return this.f9070j;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: C0 */
    public void mo10913C0(int i) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "switchFlashMode: " + i);
        if (this.f9048z == 1) {
            TECameraModeBase tECameraModeBase2 = this.f9039G;
            if (tECameraModeBase2 != null && (tECameraModeBase2 instanceof njh0)) {
                ((njh0) tECameraModeBase2).m18987b2(i);
                return;
            }
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C0743g.m11174j("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f9064d.mo10850g(this.f9062b.f8935b, -439, i == 0 ? 0 : 1, "Camera is opening, ignore toggleTorch operation.", this.f9036D);
            return;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.mo11499c(i);
            return;
        }
        C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
        C0743g.m11166b("TECamera2", "switch flash mode  failed, you must open camera first.");
        this.f9064d.mo10850g(this.f9062b.f8935b, -439, i == 0 ? 0 : 1, "switch flash mode  failed, you must open camera first.", this.f9036D);
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "switch flash mode  failed, you must open camera first.", this.f9036D);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: D0 */
    public void mo10914D0(int i, int i2, TECameraSettings.InterfaceC0713l interfaceC0713l) {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.f9048z == 2) {
            C0743g.m11165a("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.mo11145r0(i, i2, interfaceC0713l);
        } else {
            C0743g.m11166b("TECamera2", "takePicture : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "takePicture : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: E0 */
    public void mo10915E0(TECameraSettings.InterfaceC0713l interfaceC0713l) {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.f9048z == 2) {
            C0743g.m11165a("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.mo11147s0(interfaceC0713l, this.f9069i);
        } else {
            C0743g.m11166b("TECamera2", "takePicture : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "takePicture : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: F */
    public int mo10958F() {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "getISO...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            return tECameraModeBase.m11095H();
        }
        C0743g.m11174j("TECamera2", "getISO : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getISO : camera is null.", this.f9036D);
        return -1;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: F0 */
    public void mo10916F0(boolean z) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "toggleTorch: " + z);
        if (this.f9048z == 1) {
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C0743g.m11165a("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f9064d.mo10850g(this.f9062b.f8935b, -439, z ? 1 : 0, "Camera is opening, ignore toggleTorch operation.", this.f9036D);
        } else {
            if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
                tECameraModeBase.mo11149t0(z);
                return;
            }
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            C0743g.m11174j("TECamera2", "Toggle torch failed, you must open camera first.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "Toggle torch failed, you must open camera first.", this.f9036D);
            this.f9064d.mo10850g(this.f9062b.f8935b, -439, z ? 1 : 0, "Toggle torch failed, you must open camera first.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: G */
    public int[] mo10959G() {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "getISORange...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            return tECameraModeBase.m11096I();
        }
        C0743g.m11174j("TECamera2", "setWhileBalance : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setWhileBalance : camera is null.", this.f9036D);
        return new int[]{-1, -1};
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: H */
    public float mo10960H() {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            return tECameraModeBase.m11097J();
        }
        C0743g.m11166b("TECamera2", "getManualFocusAbility : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getManualFocusAbility : camera is null.", this.f9036D);
        return -1.0f;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: H0 */
    public void mo10917H0(float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z != 3) {
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f9064d.mo10846c(this.f9062b.f8935b, -420, "Invalid state, state = " + this.f9048z, this.f9036D);
            return;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11088A0(f, interfaceC0717p);
        } else {
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "zoomV2 : Camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: I */
    public int[] mo10918I() {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase != null) {
            return tECameraModeBase.mo11098K();
        }
        C0743g.m11166b("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m10961I0() {
        return this.f9036D != null;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: J */
    public int[] mo10919J() {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.m11099L();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: J0 */
    public int m10962J0(Cert cert) throws Exception {
        wjh0.m24289a("TECamera2-_open");
        if (this.f9035C == null) {
            CameraManager cameraManager = (CameraManager) this.f9066f.getSystemService("camera");
            this.f9035C = cameraManager;
            if (cameraManager == null) {
                return -407;
            }
        }
        int i = this.f9062b.f8908B;
        if (i == 0) {
            m10969R0();
        } else if (i == 1) {
            njh0 njh0Var = new njh0(this, this.f9066f, this.f9035C, this.f9065e);
            this.f9039G = njh0Var;
            njh0Var.m11124g0(this.f9074n);
            this.f9039G.m11117c0(this.f9076p);
        } else {
            this.f9039G = new iih0(this, this.f9066f, this.f9035C, this.f9065e);
            this.f9064d.mo10848e(117, 0, "enable arcore", this.f9036D);
        }
        this.f9039G.m11126h0(this.f9075o);
        Handler handlerM11091D = this.f9062b.f8953k ? this.f9039G.m11091D() : this.f9065e;
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase instanceof iih0) {
            ((iih0) tECameraModeBase).m16571C0(this.f9066f, handlerM11091D);
        }
        TECameraSettings tECameraSettings = this.f9062b;
        tECameraSettings.f8914H = m10975Z0(tECameraSettings.f8939d);
        TECameraSettings tECameraSettings2 = this.f9062b;
        String str = tECameraSettings2.f8914H;
        if (str == null) {
            C0743g.m11166b("TECamera2", "Invalid CameraID");
            return -405;
        }
        int iMo11103P = this.f9039G.mo11103P(str, this.f9038F ? tECameraSettings2.f8910D : 0);
        if (iMo11103P != 0) {
            return iMo11103P;
        }
        m10968O0();
        mo10939l();
        m10956S0(this.f9062b.f8935b, this.f9035C);
        this.f9064d.mo10848e(1, 0, "TECamera2 features is ready", this.f9036D);
        if (this.f9062b.f8953k) {
            try {
                this.f9036D = null;
                pih0.m20301c(cert, this.f9035C, this.f9062b.f8914H, this.f9046N, handlerM11091D);
                if (this.f9036D == null) {
                    m10978b1();
                }
            } catch (CameraAccessException e) {
                int iM10954P0 = m10954P0(e);
                e.printStackTrace();
                m10973X0();
                return iM10954P0;
            }
        } else {
            try {
                this.f9064d.mo10848e(106, 0, "will start camera2", null);
                pih0.m20301c(cert, this.f9035C, this.f9062b.f8914H, this.f9046N, handlerM11091D);
            } catch (CameraAccessException e2) {
                int iM10954P1 = m10954P0(e2);
                e2.printStackTrace();
                return iM10954P1;
            }
        }
        wjh0.m24290b();
        return 0;
    }

    /* JADX INFO: renamed from: K0 */
    public void m10963K0(Cert cert) {
        try {
            this.f9039G.m11108U();
            this.f9039G.mo11142q();
            if (this.f9036D != null) {
                this.f9064d.mo10848e(108, 0, "will close camera2", null);
                pih0.m20300b(cert, this.f9036D);
                this.f9064d.mo10848e(109, 0, "did close camera2", null);
                this.f9036D = null;
                this.f9064d.mo10852i(2, this, this.f9036D);
            }
        } catch (Throwable th) {
            C0743g.m11166b("TECamera2", th.getMessage());
        }
        m10977a1(0);
        this.f9033A = null;
        this.f9034B = null;
        this.f9080t = null;
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null || this.f9062b.f8908B != 2) {
            return;
        }
        ((iih0) tECameraModeBase).m16570B0();
    }

    /* JADX INFO: renamed from: L0 */
    public int m10964L0() {
        int i;
        wjh0.m24289a("TECamera2-_startCapture");
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            m11018z0();
            this.f9064d.mo10845b(this.f9062b.f8935b, -439, "_startCapture : mode is null", this.f9036D);
            return -1;
        }
        try {
            int iMo11135m0 = tECameraModeBase.mo11135m0();
            if (iMo11135m0 != 0) {
                m10973X0();
                this.f9064d.mo10845b(this.f9062b.f8935b, iMo11135m0, "_startCapture : something wrong", this.f9036D);
            }
            wjh0.m24290b();
            return iMo11135m0;
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                i = -410;
            } else if (e instanceof IllegalArgumentException) {
                i = -402;
            } else {
                i = e instanceof IllegalStateException ? -409 : -425;
            }
            m10973X0();
            e.printStackTrace();
            C0734e.m11049a(e);
            this.f9064d.mo10845b(this.f9062b.f8935b, i, "_startCapture : mode is null, err msg: " + e.getMessage(), this.f9036D);
            return i;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: M */
    public long[] mo10965M() {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "getShutterTimeRange...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            return tECameraModeBase.m11101N();
        }
        C0743g.m11174j("TECamera2", "getShutterTimeRange : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getShutterTimeRange : camera is null.", this.f9036D);
        return new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: M0 */
    public int m10966M0() {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "_stopCapture : mode is null", this.f9036D);
            return -1;
        }
        try {
            tECameraModeBase.mo11142q();
            this.f9064d.mo10847d(2, 4, 0, "TECamera2 preview stoped", this.f9036D);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            this.f9064d.mo10846c(this.f9062b.f8935b, -425, "Error:_stopCapture : mode is null", this.f9036D);
            return -1;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo10920N() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f9136a) == null) {
            C0743g.m11166b("TECamera2", "getSupportedPictureSizes: camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getSupportedPictureSizes: camera is null.", this.f9036D);
            return null;
        }
        if (this.f9044L == null) {
            if (tECameraModeBase.f9147l == null) {
                tECameraModeBase.f9147l = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.f9044L = C0735f.m11058i(this.f9039G.f9147l.getOutputSizes(256));
        }
        return this.f9044L;
    }

    /* JADX INFO: renamed from: N0 */
    public void m10967N0(int i) {
        if (this.f9039G == null) {
            return;
        }
        m10966M0();
        if (i == 0) {
            m10969R0();
        } else if (i == 1) {
            njh0 njh0Var = new njh0(this, this.f9066f, this.f9035C, this.f9065e);
            this.f9039G = njh0Var;
            njh0Var.m11124g0(this.f9074n);
            this.f9039G.m11126h0(this.f9075o);
            this.f9039G.m11117c0(this.f9076p);
        } else {
            this.f9039G = new iih0(this, this.f9066f, this.f9035C, this.f9065e);
        }
        Handler handlerM11091D = this.f9062b.f8953k ? this.f9039G.m11091D() : this.f9065e;
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase instanceof iih0) {
            ((iih0) tECameraModeBase).m16571C0(this.f9066f, handlerM11091D);
        }
        try {
            TECameraSettings tECameraSettings = this.f9062b;
            tECameraSettings.f8914H = m10975Z0(tECameraSettings.f8939d);
            TECameraSettings tECameraSettings2 = this.f9062b;
            String str = tECameraSettings2.f8914H;
            if (str == null || this.f9039G.mo11103P(str, tECameraSettings2.f8910D) != 0) {
                return;
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
        this.f9039G.m11113Z(this.f9036D);
        m10964L0();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo10921O() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f9136a) == null) {
            C0743g.m11166b("TECamera2", "getSupportedPreviewSizes: camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getSupportedPreviewSizes: camera is null.", this.f9036D);
            return null;
        }
        if (this.f9043K == null) {
            if (tECameraModeBase.f9147l == null) {
                tECameraModeBase.f9147l = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.f9043K = C0735f.m11058i(this.f9039G.f9147l.getOutputSizes(SurfaceTexture.class));
        }
        return this.f9043K;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX INFO: renamed from: O0 */
    public void m10968O0() {
        boolean z;
        TECameraSettings tECameraSettings = this.f9062b;
        if (tECameraSettings.f8962o0 && tECameraSettings.f8935b == 2 && tECameraSettings.f8908B == 0) {
            z = this.f9047y.m23393n(this.f9039G.f9136a, 1);
        }
        tECameraSettings.f8962o0 = z;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: Q */
    public boolean mo10922Q() {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        C0743g.m11169e("TECamera2", "isAutoExposureLockSupported...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        }
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null || (cameraCharacteristics = tECameraModeBase.f9136a) == null) {
            C0743g.m11166b("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "isAutoExposureLockSupported : camera is null.", this.f9036D);
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: R */
    public boolean mo10923R() {
        return true;
    }

    /* JADX INFO: renamed from: R0 */
    public void m10969R0() {
        C0743g.m11165a("TECamera2", "create TEVideo2Mode");
        this.f9039G = new akh0(this, this.f9066f, this.f9035C, this.f9065e);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: T */
    public boolean mo10924T() {
        return true;
    }

    /* JADX INFO: renamed from: T0 */
    public vtk m10970T0() {
        return this.f9040H;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: U */
    public boolean mo10926U() {
        TECameraModeBase tECameraModeBase;
        C0743g.m11169e("TECamera2", "isSupportedExposureCompensation...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null && tECameraModeBase.f9136a != null) {
            return this.f9062b.f8917K.m10857a();
        }
        C0743g.m11166b("TECamera2", "isSupportedExposureCompensation : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "isSupportedExposureCompensation : camera is null.", this.f9036D);
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public int m10971U0() {
        return this.f9048z;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: V */
    public boolean mo10927V() {
        TECameraModeBase tECameraModeBase;
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null || tECameraModeBase.f9136a == null) {
            C0743g.m11174j("TECamera2", "Query torch info failed, you must open camera first.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "Query torch info failed, you must open camera first.", this.f9036D);
            return false;
        }
        if (this.f9047y == null) {
            C0743g.m11166b("TECamera2", "DeviceProxy is null!");
            this.f9064d.mo10846c(this.f9062b.f8935b, -417, "", this.f9036D);
            return false;
        }
        Bundle bundle = m10992A().get(this.f9062b.f8914H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: W */
    public int mo10928W(TECameraSettings tECameraSettings, Cert cert) {
        int iM10954P0;
        wjh0.m24289a("TECamera2-open");
        super.mo10928W(tECameraSettings, cert);
        this.f9080t = cert;
        this.f9062b = tECameraSettings;
        if (this.f9048z == 4) {
            m10963K0(cert);
        }
        try {
            m10977a1(1);
            int iM10962J0 = m10962J0(cert);
            this.f9069i = tECameraSettings.f8939d;
            C0743g.m11169e("TECamera2", "open: camera face = " + this.f9069i + ", ret: " + iM10962J0);
            if (iM10962J0 == 0) {
                this.f9042J = tECameraSettings.f8923Q;
                wjh0.m24290b();
                return 0;
            }
            m10977a1(0);
            m10963K0(cert);
            AbstractC0726c.a aVar = this.f9064d;
            if (aVar == null) {
                return -1;
            }
            aVar.mo10849f(tECameraSettings.f8935b, iM10962J0, null, this.f9036D);
            return -1;
        } catch (Throwable th) {
            C0743g.m11166b("TECamera2", "open: camera face = " + this.f9069i + " failed: " + th.getMessage());
            if (th instanceof CameraAccessException) {
                iM10954P0 = m10954P0(th);
            } else if (th instanceof IllegalArgumentException) {
                iM10954P0 = -405;
            } else {
                iM10954P0 = th instanceof SecurityException ? -408 : -401;
            }
            m10977a1(4);
            m10963K0(cert);
            AbstractC0726c.a aVar2 = this.f9064d;
            if (aVar2 != null) {
                aVar2.mo10849f(tECameraSettings.f8935b, iM10954P0, null, this.f9036D);
            }
            return iM10954P0;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m10972W0() {
        vih0 vih0Var = this.f9047y;
        return vih0Var != null && vih0Var.mo21670s();
    }

    /* JADX INFO: renamed from: X0 */
    public void m10973X0() {
        if (this.f9062b.f8953k) {
            this.f9045M.open();
            C0743g.m11169e("TECamera2", "open camera-operation lock");
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m10974Y0() {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase != null) {
            tECameraModeBase.m11107T();
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: Z */
    public void mo10929Z(TECameraSettings.InterfaceC0715n interfaceC0715n) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null || (cameraCharacteristics = tECameraModeBase.f9136a) == null) {
            C0743g.m11166b("TECamera2", "queryShaderZoomStep: camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "queryShaderZoomStep: camera is null.", this.f9036D);
            return;
        }
        vih0 vih0Var = this.f9047y;
        if (vih0Var == null) {
            C0743g.m11166b("TECamera2", "DeviceProxy is null!");
            this.f9064d.mo10846c(this.f9062b.f8935b, -420, "", this.f9036D);
        } else {
            float fM23386f = vih0Var.m23386f(cameraCharacteristics);
            if (interfaceC0715n != null) {
                interfaceC0715n.m10862a(fM23386f);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public String m10975Z0(int i) throws CameraAccessException {
        return this.f9039G.m11109V(this.f9062b.f8939d);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: a */
    public void mo10976a() {
        if (!m10961I0()) {
            C0743g.m11166b("TECamera2", "Device is not ready.");
            return;
        }
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase != null) {
            tECameraModeBase.m11122f();
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: a0 */
    public void mo10930a0(TECameraSettings.InterfaceC0717p interfaceC0717p, boolean z) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null || (cameraCharacteristics = tECameraModeBase.f9136a) == null) {
            C0743g.m11166b("TECamera2", "queryZoomAbility: camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "queryZoomAbility: camera is null.", this.f9036D);
            return;
        }
        vih0 vih0Var = this.f9047y;
        if (vih0Var == null) {
            C0743g.m11166b("TECamera2", "DeviceProxy is null!");
            this.f9064d.mo10846c(this.f9062b.f8935b, -420, "", this.f9036D);
            return;
        }
        TECameraSettings tECameraSettings = this.f9062b;
        float fM23385e = vih0Var.m23385e(cameraCharacteristics, tECameraSettings.f8935b, tECameraSettings.f8963p);
        this.f9072l = fM23385e;
        C0743g.m11165a("TECamera2", "zoom: " + fM23385e + ", factor = " + this.f9062b.f8963p);
        if (interfaceC0717p != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * fM23385e)));
            interfaceC0717p.onZoomSupport(this.f9062b.f8935b, fM23385e > 0.0f, false, fM23385e, arrayList);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m10977a1(int i) {
        if (this.f9048z == i) {
            C0743g.m11174j("TECamera2", "No need update state: " + i);
        } else {
            C0743g.m11169e("TECamera2", "[updateSessionState]: " + this.f9048z + " -> " + i);
            this.f9048z = i;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m10978b1() {
        if (this.f9062b.f8953k) {
            this.f9045M.close();
            C0743g.m11169e("TECamera2", "block camera-operation start...");
            C0743g.m11169e("TECamera2", "block camera-operation end...result = " + this.f9045M.block(1000L));
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: c */
    public void mo10931c() {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11129j();
        } else {
            C0743g.m11166b("TECamera2", "cancelFocus : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "cancelFocus : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: d */
    public void mo10979d(ti3 ti3Var, TECameraSettings.InterfaceC0704c interfaceC0704c) {
        this.f9039G.mo11138o(ti3Var, this.f9069i, interfaceC0704c);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: f */
    public void mo10932f(Cert cert) {
        C0743g.m11165a("TECamera2", "close...");
        if (this.f9048z == 1) {
            if (this.f9042J) {
                this.f9041I = true;
            }
        } else {
            m10963K0(cert);
            TECameraModeBase tECameraModeBase = this.f9039G;
            if (tECameraModeBase != null) {
                tECameraModeBase.m11140p();
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: f0 */
    public void mo10980f0(float f) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "setAperture : " + f);
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setAperture operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11110W(f);
        } else {
            C0743g.m11174j("TECamera2", "setAperture : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setAperture : camera is null.", this.f9036D);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03df A[LOOP:0: B:153:0x03d9->B:155:0x03df, LOOP_END] */
    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: g */
    public void mo10933g() {
        String[] strArr;
        int i;
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        Iterator<Integer> it;
        wjh0.m24289a("TECamera2-collectCameraCapabilities");
        if (!m10999S()) {
            wjh0.m24290b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        int i2 = 1;
        if (this.f9035C != null) {
            try {
                this.f9082v.putOpt("camera_id", this.f9062b.f8914H);
                vih0 vih0Var = this.f9047y;
                if (vih0Var != null) {
                    CameraCharacteristics cameraCharacteristics = this.f9039G.f9136a;
                    TECameraSettings tECameraSettings = this.f9062b;
                    this.f9082v.putOpt("camera_zoom_max_ability", Float.valueOf(vih0Var.m23385e(cameraCharacteristics, tECameraSettings.f8935b, tECameraSettings.f8963p)));
                }
                JSONArray jSONArray = new JSONArray();
                String[] cameraIdList = this.f9035C.getCameraIdList();
                int length = cameraIdList.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = cameraIdList[i3];
                    JSONObject jSONObject = new JSONObject();
                    CameraCharacteristics cameraCharacteristics2 = this.f9035C.getCameraCharacteristics(str);
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
                            Iterator<Integer> it2 = TECameraCapabilityCollector.f9087d.keySet().iterator();
                            while (it2.hasNext()) {
                                Integer next = it2.next();
                                TECameraCapabilityCollector.Capability capability = TECameraCapabilityCollector.f9087d.get(next);
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
                        if (Build.VERSION.SDK_INT >= 31 && (cameraExtensionCharacteristics = this.f9035C.getCameraExtensionCharacteristics(str)) != null) {
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
                        C0743g.m11174j("TECamera2", "Get Camera Capbilities failed!");
                        e.printStackTrace();
                        for (Map.Entry entry : map.entrySet()) {
                            TECameraCapabilityCollector.Capability capability7 = (TECameraCapabilityCollector.Capability) entry.getKey();
                            Object value = entry.getValue();
                            TECameraCapabilityCollector tECameraCapabilityCollector = this.f9081u;
                            tECameraCapabilityCollector.m11019a(new TECameraCapabilityCollector.C0730a(capability7, tECameraCapabilityCollector.m11020b(capability7), value.toString()));
                        }
                        this.f9081u.m11022d();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C0743g.m11169e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
                        ajh0.m11494b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis2);
                        this.f9083w = true;
                        wjh0.m24290b();
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        while (r0.hasNext()) {
                            TECameraCapabilityCollector.Capability capability8 = (TECameraCapabilityCollector.Capability) entry.getKey();
                            Object value2 = entry.getValue();
                            TECameraCapabilityCollector tECameraCapabilityCollector2 = this.f9081u;
                            tECameraCapabilityCollector2.m11019a(new TECameraCapabilityCollector.C0730a(capability8, tECameraCapabilityCollector2.m11020b(capability8), value2.toString()));
                        }
                        this.f9081u.m11022d();
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C0743g.m11169e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis3);
                        ajh0.m11494b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis3);
                        this.f9083w = true;
                        wjh0.m24290b();
                    }
                }
                jCurrentTimeMillis = jCurrentTimeMillis;
                this.f9082v.putOpt("camera_feature", jSONArray);
                if (Build.VERSION.SDK_INT >= 30) {
                    Set<Set> concurrentCameraIds = this.f9035C.getConcurrentCameraIds();
                    ArrayList arrayList2 = new ArrayList();
                    if (concurrentCameraIds != null) {
                        for (Set set : concurrentCameraIds) {
                            Iterator it4 = set.iterator();
                            boolean z = false;
                            boolean z2 = false;
                            while (it4.hasNext()) {
                                CameraCharacteristics cameraCharacteristics3 = this.f9035C.getCameraCharacteristics((String) it4.next());
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
                        TECameraCapabilityCollector tECameraCapabilityCollector3 = this.f9081u;
                        tECameraCapabilityCollector3.m11019a(new TECameraCapabilityCollector.C0730a(capability9, tECameraCapabilityCollector3.m11020b(capability9), arrayList2.toString()));
                        JSONArray jSONArray7 = new JSONArray();
                        if (arrayList2.size() > 0) {
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                jSONArray7.put((Set) it5.next());
                            }
                            this.f9082v.putOpt("camera_front_back_multicam_combos", jSONArray7);
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
            TECameraCapabilityCollector tECameraCapabilityCollector4 = this.f9081u;
            tECameraCapabilityCollector4.m11019a(new TECameraCapabilityCollector.C0730a(capability10, tECameraCapabilityCollector4.m11020b(capability10), value3.toString()));
        }
        this.f9081u.m11022d();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0743g.m11169e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis4);
        ajh0.m11494b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis4);
        this.f9083w = true;
        wjh0.m24290b();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: g0 */
    public void mo10934g0(boolean z) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        C0743g.m11169e("TECamera2", "setAutoExposureLock...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
            return;
        }
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null || (cameraCharacteristics = tECameraModeBase.f9136a) == null) {
            C0743g.m11166b("TECamera2", "setAutoExposureLock : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setAutoExposureLock : camera is null.", this.f9036D);
            return;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            this.f9039G.m11111X(z);
        } else {
            C0743g.m11174j("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.f9064d.mo10848e(-426, -426, "Current camera doesn't support auto exposure lock.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: h0 */
    public void mo10935h0(boolean z) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11169e("TECamera2", "setAutoFocusLock...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
            return;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null && tECameraModeBase.f9136a != null) {
            tECameraModeBase.m11112Y(z);
        } else {
            C0743g.m11166b("TECamera2", "setAutoFocusLock : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setAutoFocusLock : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: i */
    public void mo10981i() {
        super.mo10981i();
        m10974Y0();
        this.f9040H.m23727g();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: j */
    public void mo10936j() {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11153w();
        } else {
            C0743g.m11166b("TECamera2", "enableCaf : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "enableCaf : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: j0 */
    public boolean mo10937j0(int i) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11169e("TECamera2", "setExposureCompensation... value: " + i);
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null || tECameraModeBase.f9136a == null) {
            C0743g.m11166b("TECamera2", "setExposureCompensation : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -401, "setExposureCompensation : camera is null.", this.f9036D);
            return false;
        }
        if (!this.f9062b.f8917K.m10857a()) {
            C0743g.m11174j("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.f9064d.mo10848e(-414, -414, "Current camera doesn't support setting exposure compensation.", this.f9036D);
            return false;
        }
        TECameraSettings.C0705d c0705d = this.f9062b.f8917K;
        if (i <= c0705d.f8990a && i >= c0705d.f8992c) {
            return this.f9039G.m11115a0(i);
        }
        String str = "Invalid exposure compensation value: " + i + ", it must between [" + this.f9062b.f8917K.f8992c + ", " + this.f9062b.f8917K.f8990a + "].";
        C0743g.m11174j("TECamera2", str);
        this.f9064d.mo10848e(-415, -415, str, this.f9036D);
        return false;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: k */
    public void mo10982k(boolean z) {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            C0743g.m11166b("TECamera2", "enableMulticamZoom failed, mode is null...");
        } else {
            tECameraModeBase.m11155x(z);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: k0 */
    public void mo10938k0(Bundle bundle) {
        super.mo10938k0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f9078r.get(this.f9062b.f8914H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.C0712k.m10860a(str, bundle.get(str)) && "support_light_soft".equalsIgnoreCase(str)) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: l */
    public Bundle mo10939l() {
        CameraCharacteristics cameraCharacteristics;
        vih0 vih0Var;
        wjh0.m24289a("TECamera2-fillFeatures");
        Bundle bundleMo10939l = super.mo10939l();
        if (bundleMo10939l != null) {
            bundleMo10939l.putParcelableArrayList("support_preview_sizes", (ArrayList) mo10921O());
            bundleMo10939l.putParcelableArrayList("support_picture_sizes", (ArrayList) mo10920N());
            bundleMo10939l.putParcelableArrayList("camera_support_fps_range", (ArrayList) m10957V0());
            TECameraModeBase tECameraModeBase = this.f9039G;
            if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f9136a) != null && (vih0Var = this.f9047y) != null) {
                bundleMo10939l.putBoolean("device_support_multicamera_zoom", vih0Var.m23394o(cameraCharacteristics) && Build.VERSION.SDK_INT >= 30);
                bundleMo10939l.putBoolean("camera_torch_supported", this.f9047y.m23398t(this.f9039G.f9136a));
            }
            bundleMo10939l.putInt("device_support_wide_angle_mode", m10972W0() ? 1 : 0);
        }
        wjh0.m24290b();
        return bundleMo10939l;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: l0 */
    public void mo10983l0(int i) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "setISO : " + i);
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setISO operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11119d0(i);
        } else {
            C0743g.m11174j("TECamera2", "setISO : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setISO : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: m */
    public void mo10940m(TEFocusSettings tEFocusSettings) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "setFocusAreas...");
        if (this.f9048z != 3) {
            C0743g.m11174j("TECamera2", "Camera is not previewing, ignore setFocusAreas operation.");
            tEFocusSettings.m10871g().mo10885a(0, this.f9062b.f8939d, "Camera is not previewing, ignore setFocusAreas operation.");
            return;
        }
        if (!m10961I0() || (tECameraModeBase = this.f9039G) == null) {
            C0743g.m11166b("TECamera2", "focusAtPoint : camera is null.");
            tEFocusSettings.m10871g().mo10885a(-439, this.f9062b.f8939d, "focusAtPoint : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "focusAtPoint : camera is null.", this.f9036D);
        } else {
            int iMo11159z = tECameraModeBase.mo11159z(tEFocusSettings);
            if (iMo11159z != 0) {
                C0743g.m11166b("TECamera2", "focusAtPoint : something wrong.");
                this.f9064d.mo10848e(-411, iMo11159z, "focusAtPoint : something wrong.", this.f9036D);
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: m0 */
    public void mo10984m0(float f) {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11121e0(f);
        } else {
            C0743g.m11166b("TECamera2", "setManualFocusDistance : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setManualFocusDistance : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: n */
    public void mo10941n(Cert cert) {
        super.mo10941n(cert);
        C0743g.m11169e("TECamera2", "force close camera: " + this.f9036D);
        if (this.f9036D != null) {
            pih0.m20300b(cert, this.f9036D);
            this.f9036D = null;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: n0 */
    public void mo10942n0(int i, int i2) {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            C0743g.m11166b("TECamera2", "set picture size failed, no mode...");
        } else {
            tECameraModeBase.mo11123f0(i, i2);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: o */
    public float[] mo10985o() {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "getApertureRange...");
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            return tECameraModeBase.m11087A();
        }
        C0743g.m11174j("TECamera2", "getApertureRange : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getApertureRange : camera is null.", this.f9036D);
        return new float[]{-1.0f, -1.0f};
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: p */
    public TEFrameSizei mo10944p(float f, TEFrameSizei tEFrameSizei) {
        if (this.f9048z == 0 || this.f9048z == 1) {
            C0743g.m11166b("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase.f9147l == null) {
            tECameraModeBase.f9147l = (StreamConfigurationMap) tECameraModeBase.f9136a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f9039G.f9147l;
        if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            C0743g.m11166b("TECamera2", "Output is not supported, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        AbstractC0726c.e eVar = this.f9075o;
        TEFrameSizei previewSize = eVar != null ? eVar.getPreviewSize(arrayList) : null;
        if (previewSize == null) {
            return tEFrameSizei != null ? C0735f.m11051b(arrayList, tEFrameSizei) : C0735f.m11052c(arrayList, f);
        }
        return previewSize;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: q */
    public JSONObject mo10945q() {
        return this.f9082v;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: r */
    public int[] mo10946r() {
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.mo11089B();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: r0 */
    public void mo10947r0(int i) {
        super.mo10947r0(i);
        TECameraModeBase tECameraModeBase = this.f9039G;
        if (tECameraModeBase == null) {
            C0743g.m11166b("TECamera2", "set scene failed, no mode...");
        } else {
            tECameraModeBase.mo11128i0(i);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: s0 */
    public void mo10986s0(long j) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "setShutterTime : " + j);
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setShutterTime operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11130j0(j);
        } else {
            C0743g.m11174j("TECamera2", "setISO : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setISO : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: t0 */
    public void mo10948t0(boolean z, String str) {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "setWhileBalance: " + str);
        if (this.f9048z == 1) {
            C0743g.m11174j("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11132k0(z, str);
        } else {
            C0743g.m11174j("TECamera2", "setWhileBalance : camera is null.");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "setWhileBalance : camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: u0 */
    public void mo10949u0() {
        wjh0.m24289a("TECamera2-startCapture");
        C0743g.m11165a("TECamera2", "startCapture...");
        if (!m10961I0() || this.f9067g == null) {
            C0743g.m11166b("TECamera2", "startCapture, Device is not ready.");
            return;
        }
        if (this.f9048z != 2 && this.f9048z != 3) {
            C0743g.m11166b("TECamera2", "startCapture, Invalid state: " + this.f9048z);
            return;
        }
        try {
            this.f9062b.f8941e = mo10912C();
            C0743g.m11169e("TECamera2", "Camera rotation = " + this.f9062b.f8941e);
        } catch (Exception e) {
            C0734e.m11049a(e);
            m10963K0(this.f9080t);
            AbstractC0726c.a aVar = this.f9064d;
            if (aVar != null) {
                aVar.mo10849f(this.f9062b.f8935b, -425, null, this.f9036D);
            }
        }
        m10964L0();
        wjh0.m24290b();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: v */
    public int mo10950v() {
        return 2;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: v0 */
    public int mo10987v0() {
        return this.f9039G.mo11137n0();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: w0 */
    public void mo10951w0(float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        TECameraModeBase tECameraModeBase;
        if (this.f9048z != 3) {
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f9064d.mo10848e(-420, -420, "Invalid state, state = " + this.f9048z, this.f9036D);
            return;
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            tECameraModeBase.m11139o0(f, interfaceC0717p);
        } else {
            C0743g.m11166b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f9064d.mo10846c(this.f9062b.f8935b, -439, "startZoom : Camera is null.", this.f9036D);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: x */
    public float[] mo10952x() {
        TECameraModeBase tECameraModeBase;
        C0743g.m11165a("TECamera2", "getVFOV...");
        if (this.f9048z == 1) {
            C0743g.m11165a("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        }
        if (m10961I0() && (tECameraModeBase = this.f9039G) != null) {
            return tECameraModeBase.m11093F();
        }
        C0743g.m11166b("TECamera2", "getFOV : camera is null.");
        this.f9064d.mo10846c(this.f9062b.f8935b, -439, "getFOV : camera is null.", this.f9036D);
        return new float[]{-2.0f, -2.0f};
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: x0 */
    public void mo10953x0() {
        C0743g.m11169e("TECamera2", "stopCapture...");
        if (!m10961I0()) {
            C0743g.m11166b("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f9048z != 3) {
            C0743g.m11166b("TECamera2", "Invalid state: " + this.f9048z);
        }
        m10966M0();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: y0 */
    public int mo10988y0() {
        return this.f9039G.mo11141p0();
    }
}
