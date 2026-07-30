package com.p069ss.android.ttvecamera;

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
import com.p069ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.p069ss.android.ttvecamera.framework.TECameraModeBase;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
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
import p149l.ajh0;
import p149l.akh0;
import p149l.iih0;
import p149l.njh0;
import p149l.pih0;
import p149l.ti3;
import p149l.vih0;
import p149l.vtk;
import p149l.wjh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.b */
/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class C13323b extends AbstractC13324c {

    /* JADX INFO: renamed from: A */
    protected CameraCharacteristics f55427A;

    /* JADX INFO: renamed from: B */
    protected CaptureRequest f55428B;

    /* JADX INFO: renamed from: C */
    protected CameraManager f55429C;

    /* JADX INFO: renamed from: D */
    protected volatile CameraDevice f55430D;

    /* JADX INFO: renamed from: E */
    protected int f55431E;

    /* JADX INFO: renamed from: F */
    protected boolean f55432F;

    /* JADX INFO: renamed from: G */
    protected TECameraModeBase f55433G;

    /* JADX INFO: renamed from: H */
    private final vtk f55434H;

    /* JADX INFO: renamed from: I */
    protected boolean f55435I;

    /* JADX INFO: renamed from: J */
    protected boolean f55436J;

    /* JADX INFO: renamed from: K */
    private List<TEFrameSizei> f55437K;

    /* JADX INFO: renamed from: L */
    private List<TEFrameSizei> f55438L;

    /* JADX INFO: renamed from: M */
    protected ConditionVariable f55439M;

    /* JADX INFO: renamed from: N */
    protected CameraDevice.StateCallback f55440N;

    /* JADX INFO: renamed from: y */
    protected vih0 f55441y;

    /* JADX INFO: renamed from: z */
    protected volatile int f55442z;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$a */
    public class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        b<CameraDevice> f55443a;

        public a() {
            this.f55443a = new b<>(C13323b.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            TECameraModeBase tECameraModeBase = C13323b.this.f55433G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m136396D0(cameraDevice, 4, -1);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            C13341g.m80818e("TECamera2", "onDisconnected: OpenCameraCallBack");
            TECameraModeBase tECameraModeBase = C13323b.this.f55433G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m136396D0(cameraDevice, 1, -1);
            }
            C13323b.this.m80622X0();
            b<CameraDevice> bVar = this.f55443a;
            if (bVar != null) {
                bVar.m80638a(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            C13341g.m80818e("TECamera2", "onError: " + i);
            TECameraModeBase tECameraModeBase = C13323b.this.f55433G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m136396D0(cameraDevice, 3, i);
            }
            C13323b.this.m80622X0();
            b<CameraDevice> bVar = this.f55443a;
            if (bVar == null) {
                C13341g.m80815b("TECamera2", "had called onError");
            } else {
                bVar.m80639b(cameraDevice, i);
                this.f55443a = null;
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            C13341g.m80818e("TECamera2", "onOpened: OpenCameraCallBack");
            C13323b.this.f55458d.mo80497e(107, 0, "did start camera2", null);
            TECameraModeBase tECameraModeBase = C13323b.this.f55433G;
            if (tECameraModeBase instanceof iih0) {
                ((iih0) tECameraModeBase).m136396D0(cameraDevice, 0, -1);
            }
            C13323b.this.f55430D = cameraDevice;
            C13323b.this.f55433G.m80762Z(cameraDevice);
            C13323b.this.m80622X0();
            b<CameraDevice> bVar = this.f55443a;
            if (bVar == null || !bVar.m80640c(cameraDevice)) {
                pih0.m169601b(C13323b.this.f55474t, cameraDevice);
                C13341g.m80823j("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                return;
            }
            C13323b c13323b = C13323b.this;
            if (c13323b.f55436J && c13323b.f55435I) {
                pih0.m169601b(c13323b.f55474t, cameraDevice);
                C13341g.m80823j("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                C13323b.this.f55435I = false;
            } else if (c13323b.f55456b.f55356o0) {
                try {
                    c13323b.f55433G.m80799u();
                } catch (Exception e) {
                    C13341g.m80823j("TECamera2", "onOpened: createSessionByDeferredSurface, some bad case occur, close camera! exception msg: " + e.getMessage());
                    C13323b c13323b2 = C13323b.this;
                    c13323b2.f55456b.f55356o0 = false;
                    if (c13323b2.f55442z != 3) {
                        C13323b.this.mo80598u0();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        WeakReference<C13323b> f55445a;

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13323b f55446a;

            public a(C13323b c13323b) {
                this.f55446a = c13323b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13323b c13323b = this.f55446a;
                AbstractC13324c.a aVar = c13323b.f55458d;
                if (aVar != null) {
                    aVar.mo80498f(c13323b.f55456b.f55329b, 0, null, c13323b.f55430D);
                } else {
                    C13341g.m80815b("TECamera2", "mCameraEvents is null!");
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$b, reason: collision with other inner class name */
        public class RunnableC22702b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13323b f55448a;

            public RunnableC22702b(C13323b c13323b) {
                this.f55448a = c13323b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13323b c13323b = this.f55448a;
                c13323b.m80612K0(c13323b.f55474t);
                C13323b c13323b2 = this.f55448a;
                AbstractC13324c.a aVar = c13323b2.f55458d;
                if (aVar != null) {
                    aVar.mo80495c(c13323b2.f55456b.f55329b, -409, "Camera onDisconnected", c13323b2.f55430D);
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.b$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13323b f55450a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f55451b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f55452c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f55453d;

            public c(C13323b c13323b, int i, int i2, String str) {
                this.f55450a = c13323b;
                this.f55451b = i;
                this.f55452c = i2;
                this.f55453d = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                C13323b c13323b = this.f55450a;
                c13323b.m80612K0(c13323b.f55474t);
                C13323b c13323b2 = this.f55450a;
                AbstractC13324c.a aVar = c13323b2.f55458d;
                if (aVar != null) {
                    if (this.f55451b == 3 && (i = this.f55452c) == 3) {
                        aVar.mo80495c(c13323b2.f55456b.f55329b, i, this.f55453d, c13323b2.f55430D);
                    } else {
                        aVar.mo80498f(c13323b2.f55456b.f55329b, this.f55452c, null, c13323b2.f55430D);
                    }
                }
            }
        }

        public b(C13323b c13323b) {
            this.f55445a = new WeakReference<>(c13323b);
        }

        /* JADX INFO: renamed from: a */
        public boolean m80638a(@NonNull T t) {
            C13341g.m80815b("TECamera2", "StateCallback::onDisconnected...");
            C13323b c13323b = this.f55445a.get();
            if (c13323b == null) {
                return false;
            }
            if (c13323b.f55456b.f55352m0) {
                C13341g.m80815b("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                c13323b.f55456b.f55352m0 = false;
                return false;
            }
            RunnableC22702b runnableC22702b = new RunnableC22702b(c13323b);
            if (c13323b.f55456b.f55347k) {
                c13323b.f55459e.post(runnableC22702b);
                return true;
            }
            runnableC22702b.run();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m80639b(@NonNull T t, int i) {
            C13323b c13323b = this.f55445a.get();
            if (c13323b == null) {
                C13341g.m80815b("TECamera2", "onError...no camera holder");
                return false;
            }
            int iM80620U0 = c13323b.m80620U0();
            String str = "StateCallback::onError..." + i + ", session code: " + iM80620U0;
            C13341g.m80818e("TECamera2", str);
            c cVar = new c(c13323b, iM80620U0, i, str);
            if (c13323b.f55456b.f55347k) {
                c13323b.f55459e.post(cVar);
            } else {
                cVar.run();
            }
            c13323b.m80626a1(4);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m80640c(@NonNull T t) {
            C13341g.m80818e("TECamera2", "StateCallback::onOpened...");
            C13323b c13323b = this.f55445a.get();
            if (c13323b == null) {
                return false;
            }
            c13323b.f55456b.f55352m0 = false;
            c13323b.m80626a1(2);
            a aVar = new a(c13323b);
            if (c13323b.f55456b.f55347k) {
                c13323b.f55459e.post(aVar);
            } else {
                aVar.run();
            }
            c13323b.f55432F = false;
            return true;
        }
    }

    public C13323b(int i, Context context, AbstractC13324c.a aVar, Handler handler, AbstractC13324c.d dVar) {
        super(context, aVar, handler, dVar);
        this.f55442z = 0;
        this.f55431E = -1;
        this.f55432F = true;
        this.f55435I = false;
        this.f55436J = false;
        this.f55437K = null;
        this.f55438L = null;
        this.f55439M = new ConditionVariable();
        this.f55440N = new a();
        this.f55456b = new TECameraSettings(context, i);
        this.f55434H = new vtk(context);
        this.f55441y = vih0.m198563c(context, i);
    }

    /* JADX INFO: renamed from: P0 */
    private int m80603P0(CameraAccessException cameraAccessException) {
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
    public static C13323b m80604Q0(int i, Context context, AbstractC13324c.a aVar, Handler handler, AbstractC13324c.d dVar) {
        return new C13323b(i, context, aVar, handler, dVar);
    }

    /* JADX INFO: renamed from: S0 */
    private void m80605S0(int i, CameraManager cameraManager) {
        wjh0.m203445a("TECamera2-fillWideCameraID");
        vih0 vih0Var = this.f55441y;
        if (vih0Var != null) {
            vih0Var.mo179507b(this.f55456b.f55329b, this.f55429C);
        }
        wjh0.m203446b();
    }

    /* JADX INFO: renamed from: V0 */
    private List<TEFrameRateRange> m80606V0() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f55530a) != null) {
            return C13333f.m80706h((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        }
        C13341g.m80815b("TECamera2", "getSupportedFpsRanges: camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getSupportedFpsRanges: camera is null.", this.f55430D);
        return null;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: A0 */
    public void mo80558A0(TECameraSettings.InterfaceC13315p interfaceC13315p) {
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: B */
    public int mo80559B() {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            return -1;
        }
        return tECameraModeBase.mo80743G();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: B0 */
    public void mo80560B0(int i) {
        if (this.f55442z == 3) {
            m80616N0(i);
            return;
        }
        C13341g.m80823j("TECamera2", "Invalid state: " + this.f55442z);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: C */
    public int mo80561C() {
        int iM80715q = this.f55465k;
        if (iM80715q < 0) {
            iM80715q = C13333f.m80715q(this.f55460f);
        }
        this.f55462h = this.f55463i;
        CameraCharacteristics cameraCharacteristics = this.f55427A;
        int iIntValue = cameraCharacteristics != null ? ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() : this.f55456b.f55335e;
        if (this.f55462h == 1) {
            this.f55464j = (540 - ((iIntValue + iM80715q) % 360)) % 360;
        } else {
            this.f55464j = ((iIntValue - iM80715q) + 360) % 360;
        }
        return this.f55464j;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: C0 */
    public void mo80562C0(int i) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "switchFlashMode: " + i);
        if (this.f55442z == 1) {
            TECameraModeBase tECameraModeBase2 = this.f55433G;
            if (tECameraModeBase2 != null && (tECameraModeBase2 instanceof njh0)) {
                ((njh0) tECameraModeBase2).m159739b2(i);
                return;
            }
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C13341g.m80823j("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f55458d.mo80499g(this.f55456b.f55329b, -439, i == 0 ? 0 : 1, "Camera is opening, ignore toggleTorch operation.", this.f55430D);
            return;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.mo97150c(i);
            return;
        }
        C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
        C13341g.m80815b("TECamera2", "switch flash mode  failed, you must open camera first.");
        this.f55458d.mo80499g(this.f55456b.f55329b, -439, i == 0 ? 0 : 1, "switch flash mode  failed, you must open camera first.", this.f55430D);
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "switch flash mode  failed, you must open camera first.", this.f55430D);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: D0 */
    public void mo80563D0(int i, int i2, TECameraSettings.InterfaceC13311l interfaceC13311l) {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.f55442z == 2) {
            C13341g.m80814a("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.mo80794r0(i, i2, interfaceC13311l);
        } else {
            C13341g.m80815b("TECamera2", "takePicture : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "takePicture : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: E0 */
    public void mo80564E0(TECameraSettings.InterfaceC13311l interfaceC13311l) {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.f55442z == 2) {
            C13341g.m80814a("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.mo80796s0(interfaceC13311l, this.f55463i);
        } else {
            C13341g.m80815b("TECamera2", "takePicture : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "takePicture : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: F */
    public int mo80607F() {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "getISO...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            return tECameraModeBase.m80744H();
        }
        C13341g.m80823j("TECamera2", "getISO : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getISO : camera is null.", this.f55430D);
        return -1;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: F0 */
    public void mo80565F0(boolean z) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "toggleTorch: " + z);
        if (this.f55442z == 1) {
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C13341g.m80814a("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f55458d.mo80499g(this.f55456b.f55329b, -439, z ? 1 : 0, "Camera is opening, ignore toggleTorch operation.", this.f55430D);
        } else {
            if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
                tECameraModeBase.mo80798t0(z);
                return;
            }
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            C13341g.m80823j("TECamera2", "Toggle torch failed, you must open camera first.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "Toggle torch failed, you must open camera first.", this.f55430D);
            this.f55458d.mo80499g(this.f55456b.f55329b, -439, z ? 1 : 0, "Toggle torch failed, you must open camera first.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: G */
    public int[] mo80608G() {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "getISORange...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            return tECameraModeBase.m80745I();
        }
        C13341g.m80823j("TECamera2", "setWhileBalance : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setWhileBalance : camera is null.", this.f55430D);
        return new int[]{-1, -1};
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: H */
    public float mo80609H() {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            return tECameraModeBase.m80746J();
        }
        C13341g.m80815b("TECamera2", "getManualFocusAbility : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getManualFocusAbility : camera is null.", this.f55430D);
        return -1.0f;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: H0 */
    public void mo80566H0(float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z != 3) {
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f55458d.mo80495c(this.f55456b.f55329b, -420, "Invalid state, state = " + this.f55442z, this.f55430D);
            return;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80737A0(f, interfaceC13315p);
        } else {
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "zoomV2 : Camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: I */
    public int[] mo80567I() {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase != null) {
            return tECameraModeBase.mo80747K();
        }
        C13341g.m80815b("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m80610I0() {
        return this.f55430D != null;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: J */
    public int[] mo80568J() {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.m80748L();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: J0 */
    public int m80611J0(Cert cert) throws Exception {
        wjh0.m203445a("TECamera2-_open");
        if (this.f55429C == null) {
            CameraManager cameraManager = (CameraManager) this.f55460f.getSystemService("camera");
            this.f55429C = cameraManager;
            if (cameraManager == null) {
                return -407;
            }
        }
        int i = this.f55456b.f55302B;
        if (i == 0) {
            m80618R0();
        } else if (i == 1) {
            njh0 njh0Var = new njh0(this, this.f55460f, this.f55429C, this.f55459e);
            this.f55433G = njh0Var;
            njh0Var.m80773g0(this.f55468n);
            this.f55433G.m80766c0(this.f55470p);
        } else {
            this.f55433G = new iih0(this, this.f55460f, this.f55429C, this.f55459e);
            this.f55458d.mo80497e(117, 0, "enable arcore", this.f55430D);
        }
        this.f55433G.m80775h0(this.f55469o);
        Handler handlerM80740D = this.f55456b.f55347k ? this.f55433G.m80740D() : this.f55459e;
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase instanceof iih0) {
            ((iih0) tECameraModeBase).m136395C0(this.f55460f, handlerM80740D);
        }
        TECameraSettings tECameraSettings = this.f55456b;
        tECameraSettings.f55308H = m80624Z0(tECameraSettings.f55333d);
        TECameraSettings tECameraSettings2 = this.f55456b;
        String str = tECameraSettings2.f55308H;
        if (str == null) {
            C13341g.m80815b("TECamera2", "Invalid CameraID");
            return -405;
        }
        int iMo80752P = this.f55433G.mo80752P(str, this.f55432F ? tECameraSettings2.f55304D : 0);
        if (iMo80752P != 0) {
            return iMo80752P;
        }
        m80617O0();
        mo80588l();
        m80605S0(this.f55456b.f55329b, this.f55429C);
        this.f55458d.mo80497e(1, 0, "TECamera2 features is ready", this.f55430D);
        if (this.f55456b.f55347k) {
            try {
                this.f55430D = null;
                pih0.m169602c(cert, this.f55429C, this.f55456b.f55308H, this.f55440N, handlerM80740D);
                if (this.f55430D == null) {
                    m80627b1();
                }
            } catch (CameraAccessException e) {
                int iM80603P0 = m80603P0(e);
                e.printStackTrace();
                m80622X0();
                return iM80603P0;
            }
        } else {
            try {
                this.f55458d.mo80497e(106, 0, "will start camera2", null);
                pih0.m169602c(cert, this.f55429C, this.f55456b.f55308H, this.f55440N, handlerM80740D);
            } catch (CameraAccessException e2) {
                int iM80603P1 = m80603P0(e2);
                e2.printStackTrace();
                return iM80603P1;
            }
        }
        wjh0.m203446b();
        return 0;
    }

    /* JADX INFO: renamed from: K0 */
    public void m80612K0(Cert cert) {
        try {
            this.f55433G.m80757U();
            this.f55433G.mo80791q();
            if (this.f55430D != null) {
                this.f55458d.mo80497e(108, 0, "will close camera2", null);
                pih0.m169601b(cert, this.f55430D);
                this.f55458d.mo80497e(109, 0, "did close camera2", null);
                this.f55430D = null;
                this.f55458d.mo80501i(2, this, this.f55430D);
            }
        } catch (Throwable th) {
            C13341g.m80815b("TECamera2", th.getMessage());
        }
        m80626a1(0);
        this.f55427A = null;
        this.f55428B = null;
        this.f55474t = null;
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null || this.f55456b.f55302B != 2) {
            return;
        }
        ((iih0) tECameraModeBase).m136394B0();
    }

    /* JADX INFO: renamed from: L0 */
    public int m80613L0() {
        int i;
        wjh0.m203445a("TECamera2-_startCapture");
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            m80667z0();
            this.f55458d.mo80494b(this.f55456b.f55329b, -439, "_startCapture : mode is null", this.f55430D);
            return -1;
        }
        try {
            int iMo80784m0 = tECameraModeBase.mo80784m0();
            if (iMo80784m0 != 0) {
                m80622X0();
                this.f55458d.mo80494b(this.f55456b.f55329b, iMo80784m0, "_startCapture : something wrong", this.f55430D);
            }
            wjh0.m203446b();
            return iMo80784m0;
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                i = -410;
            } else if (e instanceof IllegalArgumentException) {
                i = WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL;
            } else {
                i = e instanceof IllegalStateException ? -409 : -425;
            }
            m80622X0();
            e.printStackTrace();
            C13332e.m80698a(e);
            this.f55458d.mo80494b(this.f55456b.f55329b, i, "_startCapture : mode is null, err msg: " + e.getMessage(), this.f55430D);
            return i;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: M */
    public long[] mo80614M() {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "getShutterTimeRange...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            return tECameraModeBase.m80750N();
        }
        C13341g.m80823j("TECamera2", "getShutterTimeRange : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getShutterTimeRange : camera is null.", this.f55430D);
        return new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: M0 */
    public int m80615M0() {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "_stopCapture : mode is null", this.f55430D);
            return -1;
        }
        try {
            tECameraModeBase.mo80791q();
            this.f55458d.mo80496d(2, 4, 0, "TECamera2 preview stoped", this.f55430D);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            this.f55458d.mo80495c(this.f55456b.f55329b, -425, "Error:_stopCapture : mode is null", this.f55430D);
            return -1;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo80569N() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f55530a) == null) {
            C13341g.m80815b("TECamera2", "getSupportedPictureSizes: camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getSupportedPictureSizes: camera is null.", this.f55430D);
            return null;
        }
        if (this.f55438L == null) {
            if (tECameraModeBase.f55541l == null) {
                tECameraModeBase.f55541l = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.f55438L = C13333f.m80707i(this.f55433G.f55541l.getOutputSizes(256));
        }
        return this.f55438L;
    }

    /* JADX INFO: renamed from: N0 */
    public void m80616N0(int i) {
        if (this.f55433G == null) {
            return;
        }
        m80615M0();
        if (i == 0) {
            m80618R0();
        } else if (i == 1) {
            njh0 njh0Var = new njh0(this, this.f55460f, this.f55429C, this.f55459e);
            this.f55433G = njh0Var;
            njh0Var.m80773g0(this.f55468n);
            this.f55433G.m80775h0(this.f55469o);
            this.f55433G.m80766c0(this.f55470p);
        } else {
            this.f55433G = new iih0(this, this.f55460f, this.f55429C, this.f55459e);
        }
        Handler handlerM80740D = this.f55456b.f55347k ? this.f55433G.m80740D() : this.f55459e;
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase instanceof iih0) {
            ((iih0) tECameraModeBase).m136395C0(this.f55460f, handlerM80740D);
        }
        try {
            TECameraSettings tECameraSettings = this.f55456b;
            tECameraSettings.f55308H = m80624Z0(tECameraSettings.f55333d);
            TECameraSettings tECameraSettings2 = this.f55456b;
            String str = tECameraSettings2.f55308H;
            if (str == null || this.f55433G.mo80752P(str, tECameraSettings2.f55304D) != 0) {
                return;
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
        this.f55433G.m80762Z(this.f55430D);
        m80613L0();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo80570O() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f55530a) == null) {
            C13341g.m80815b("TECamera2", "getSupportedPreviewSizes: camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getSupportedPreviewSizes: camera is null.", this.f55430D);
            return null;
        }
        if (this.f55437K == null) {
            if (tECameraModeBase.f55541l == null) {
                tECameraModeBase.f55541l = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.f55437K = C13333f.m80707i(this.f55433G.f55541l.getOutputSizes(SurfaceTexture.class));
        }
        return this.f55437K;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX INFO: renamed from: O0 */
    public void m80617O0() {
        boolean z;
        TECameraSettings tECameraSettings = this.f55456b;
        if (tECameraSettings.f55356o0 && tECameraSettings.f55329b == 2 && tECameraSettings.f55302B == 0) {
            z = this.f55441y.m198574n(this.f55433G.f55530a, 1);
        }
        tECameraSettings.f55356o0 = z;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: Q */
    public boolean mo80571Q() {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        C13341g.m80818e("TECamera2", "isAutoExposureLockSupported...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        }
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null || (cameraCharacteristics = tECameraModeBase.f55530a) == null) {
            C13341g.m80815b("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "isAutoExposureLockSupported : camera is null.", this.f55430D);
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: R */
    public boolean mo80572R() {
        return true;
    }

    /* JADX INFO: renamed from: R0 */
    public void m80618R0() {
        C13341g.m80814a("TECamera2", "create TEVideo2Mode");
        this.f55433G = new akh0(this, this.f55460f, this.f55429C, this.f55459e);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: T */
    public boolean mo80573T() {
        return true;
    }

    /* JADX INFO: renamed from: T0 */
    public vtk m80619T0() {
        return this.f55434H;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: U */
    public boolean mo80575U() {
        TECameraModeBase tECameraModeBase;
        C13341g.m80818e("TECamera2", "isSupportedExposureCompensation...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null && tECameraModeBase.f55530a != null) {
            return this.f55456b.f55311K.m80506a();
        }
        C13341g.m80815b("TECamera2", "isSupportedExposureCompensation : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "isSupportedExposureCompensation : camera is null.", this.f55430D);
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public int m80620U0() {
        return this.f55442z;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: V */
    public boolean mo80576V() {
        TECameraModeBase tECameraModeBase;
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null || tECameraModeBase.f55530a == null) {
            C13341g.m80823j("TECamera2", "Query torch info failed, you must open camera first.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "Query torch info failed, you must open camera first.", this.f55430D);
            return false;
        }
        if (this.f55441y == null) {
            C13341g.m80815b("TECamera2", "DeviceProxy is null!");
            this.f55458d.mo80495c(this.f55456b.f55329b, -417, "", this.f55430D);
            return false;
        }
        Bundle bundle = m80641A().get(this.f55456b.f55308H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: W */
    public int mo80577W(TECameraSettings tECameraSettings, Cert cert) {
        int iM80603P0;
        wjh0.m203445a("TECamera2-open");
        super.mo80577W(tECameraSettings, cert);
        this.f55474t = cert;
        this.f55456b = tECameraSettings;
        if (this.f55442z == 4) {
            m80612K0(cert);
        }
        try {
            m80626a1(1);
            int iM80611J0 = m80611J0(cert);
            this.f55463i = tECameraSettings.f55333d;
            C13341g.m80818e("TECamera2", "open: camera face = " + this.f55463i + ", ret: " + iM80611J0);
            if (iM80611J0 == 0) {
                this.f55436J = tECameraSettings.f55317Q;
                wjh0.m203446b();
                return 0;
            }
            m80626a1(0);
            m80612K0(cert);
            AbstractC13324c.a aVar = this.f55458d;
            if (aVar == null) {
                return -1;
            }
            aVar.mo80498f(tECameraSettings.f55329b, iM80611J0, null, this.f55430D);
            return -1;
        } catch (Throwable th) {
            C13341g.m80815b("TECamera2", "open: camera face = " + this.f55463i + " failed: " + th.getMessage());
            if (th instanceof CameraAccessException) {
                iM80603P0 = m80603P0(th);
            } else if (th instanceof IllegalArgumentException) {
                iM80603P0 = -405;
            } else {
                iM80603P0 = th instanceof SecurityException ? -408 : WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
            }
            m80626a1(4);
            m80612K0(cert);
            AbstractC13324c.a aVar2 = this.f55458d;
            if (aVar2 != null) {
                aVar2.mo80498f(tECameraSettings.f55329b, iM80603P0, null, this.f55430D);
            }
            return iM80603P0;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m80621W0() {
        vih0 vih0Var = this.f55441y;
        return vih0Var != null && vih0Var.mo179509s();
    }

    /* JADX INFO: renamed from: X0 */
    public void m80622X0() {
        if (this.f55456b.f55347k) {
            this.f55439M.open();
            C13341g.m80818e("TECamera2", "open camera-operation lock");
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m80623Y0() {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase != null) {
            tECameraModeBase.m80756T();
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: Z */
    public void mo80578Z(TECameraSettings.InterfaceC13313n interfaceC13313n) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null || (cameraCharacteristics = tECameraModeBase.f55530a) == null) {
            C13341g.m80815b("TECamera2", "queryShaderZoomStep: camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "queryShaderZoomStep: camera is null.", this.f55430D);
            return;
        }
        vih0 vih0Var = this.f55441y;
        if (vih0Var == null) {
            C13341g.m80815b("TECamera2", "DeviceProxy is null!");
            this.f55458d.mo80495c(this.f55456b.f55329b, -420, "", this.f55430D);
        } else {
            float fM198567f = vih0Var.m198567f(cameraCharacteristics);
            if (interfaceC13313n != null) {
                interfaceC13313n.m80511a(fM198567f);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public String m80624Z0(int i) throws CameraAccessException {
        return this.f55433G.m80758V(this.f55456b.f55333d);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: a */
    public void mo80625a() {
        if (!m80610I0()) {
            C13341g.m80815b("TECamera2", "Device is not ready.");
            return;
        }
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase != null) {
            tECameraModeBase.m80771f();
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: a0 */
    public void mo80579a0(TECameraSettings.InterfaceC13315p interfaceC13315p, boolean z) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null || (cameraCharacteristics = tECameraModeBase.f55530a) == null) {
            C13341g.m80815b("TECamera2", "queryZoomAbility: camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "queryZoomAbility: camera is null.", this.f55430D);
            return;
        }
        vih0 vih0Var = this.f55441y;
        if (vih0Var == null) {
            C13341g.m80815b("TECamera2", "DeviceProxy is null!");
            this.f55458d.mo80495c(this.f55456b.f55329b, -420, "", this.f55430D);
            return;
        }
        TECameraSettings tECameraSettings = this.f55456b;
        float fM198566e = vih0Var.m198566e(cameraCharacteristics, tECameraSettings.f55329b, tECameraSettings.f55357p);
        this.f55466l = fM198566e;
        C13341g.m80814a("TECamera2", "zoom: " + fM198566e + ", factor = " + this.f55456b.f55357p);
        if (interfaceC13315p != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * fM198566e)));
            interfaceC13315p.onZoomSupport(this.f55456b.f55329b, fM198566e > 0.0f, false, fM198566e, arrayList);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m80626a1(int i) {
        if (this.f55442z == i) {
            C13341g.m80823j("TECamera2", "No need update state: " + i);
        } else {
            C13341g.m80818e("TECamera2", "[updateSessionState]: " + this.f55442z + " -> " + i);
            this.f55442z = i;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m80627b1() {
        if (this.f55456b.f55347k) {
            this.f55439M.close();
            C13341g.m80818e("TECamera2", "block camera-operation start...");
            C13341g.m80818e("TECamera2", "block camera-operation end...result = " + this.f55439M.block(1000L));
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: c */
    public void mo80580c() {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80778j();
        } else {
            C13341g.m80815b("TECamera2", "cancelFocus : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "cancelFocus : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: d */
    public void mo80628d(ti3 ti3Var, TECameraSettings.InterfaceC13302c interfaceC13302c) {
        this.f55433G.mo80787o(ti3Var, this.f55463i, interfaceC13302c);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: f */
    public void mo80581f(Cert cert) {
        C13341g.m80814a("TECamera2", "close...");
        if (this.f55442z == 1) {
            if (this.f55436J) {
                this.f55435I = true;
            }
        } else {
            m80612K0(cert);
            TECameraModeBase tECameraModeBase = this.f55433G;
            if (tECameraModeBase != null) {
                tECameraModeBase.m80789p();
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: f0 */
    public void mo80629f0(float f) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "setAperture : " + f);
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setAperture operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80759W(f);
        } else {
            C13341g.m80823j("TECamera2", "setAperture : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setAperture : camera is null.", this.f55430D);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03df A[LOOP:0: B:153:0x03d9->B:155:0x03df, LOOP_END] */
    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: g */
    public void mo80582g() {
        String[] strArr;
        int i;
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        Iterator<Integer> it;
        wjh0.m203445a("TECamera2-collectCameraCapabilities");
        if (!m80648S()) {
            wjh0.m203446b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        int i2 = 1;
        if (this.f55429C != null) {
            try {
                this.f55476v.putOpt("camera_id", this.f55456b.f55308H);
                vih0 vih0Var = this.f55441y;
                if (vih0Var != null) {
                    CameraCharacteristics cameraCharacteristics = this.f55433G.f55530a;
                    TECameraSettings tECameraSettings = this.f55456b;
                    this.f55476v.putOpt("camera_zoom_max_ability", Float.valueOf(vih0Var.m198566e(cameraCharacteristics, tECameraSettings.f55329b, tECameraSettings.f55357p)));
                }
                JSONArray jSONArray = new JSONArray();
                String[] cameraIdList = this.f55429C.getCameraIdList();
                int length = cameraIdList.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = cameraIdList[i3];
                    JSONObject jSONObject = new JSONObject();
                    CameraCharacteristics cameraCharacteristics2 = this.f55429C.getCameraCharacteristics(str);
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
                            Iterator<Integer> it2 = TECameraCapabilityCollector.f55481d.keySet().iterator();
                            while (it2.hasNext()) {
                                Integer next = it2.next();
                                TECameraCapabilityCollector.Capability capability = TECameraCapabilityCollector.f55481d.get(next);
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
                        if (Build.VERSION.SDK_INT >= 31 && (cameraExtensionCharacteristics = this.f55429C.getCameraExtensionCharacteristics(str)) != null) {
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
                        C13341g.m80823j("TECamera2", "Get Camera Capbilities failed!");
                        e.printStackTrace();
                        for (Map.Entry entry : map.entrySet()) {
                            TECameraCapabilityCollector.Capability capability7 = (TECameraCapabilityCollector.Capability) entry.getKey();
                            Object value = entry.getValue();
                            TECameraCapabilityCollector tECameraCapabilityCollector = this.f55475u;
                            tECameraCapabilityCollector.m80668a(new TECameraCapabilityCollector.C13328a(capability7, tECameraCapabilityCollector.m80669b(capability7), value.toString()));
                        }
                        this.f55475u.m80671d();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C13341g.m80818e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
                        ajh0.m96973b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis2);
                        this.f55477w = true;
                        wjh0.m203446b();
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        while (r0.hasNext()) {
                            TECameraCapabilityCollector.Capability capability8 = (TECameraCapabilityCollector.Capability) entry.getKey();
                            Object value2 = entry.getValue();
                            TECameraCapabilityCollector tECameraCapabilityCollector2 = this.f55475u;
                            tECameraCapabilityCollector2.m80668a(new TECameraCapabilityCollector.C13328a(capability8, tECameraCapabilityCollector2.m80669b(capability8), value2.toString()));
                        }
                        this.f55475u.m80671d();
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C13341g.m80818e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis3);
                        ajh0.m96973b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis3);
                        this.f55477w = true;
                        wjh0.m203446b();
                    }
                }
                jCurrentTimeMillis = jCurrentTimeMillis;
                this.f55476v.putOpt("camera_feature", jSONArray);
                if (Build.VERSION.SDK_INT >= 30) {
                    Set<Set> concurrentCameraIds = this.f55429C.getConcurrentCameraIds();
                    ArrayList arrayList2 = new ArrayList();
                    if (concurrentCameraIds != null) {
                        for (Set set : concurrentCameraIds) {
                            Iterator it4 = set.iterator();
                            boolean z = false;
                            boolean z2 = false;
                            while (it4.hasNext()) {
                                CameraCharacteristics cameraCharacteristics3 = this.f55429C.getCameraCharacteristics((String) it4.next());
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
                        TECameraCapabilityCollector tECameraCapabilityCollector3 = this.f55475u;
                        tECameraCapabilityCollector3.m80668a(new TECameraCapabilityCollector.C13328a(capability9, tECameraCapabilityCollector3.m80669b(capability9), arrayList2.toString()));
                        JSONArray jSONArray7 = new JSONArray();
                        if (arrayList2.size() > 0) {
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                jSONArray7.put((Set) it5.next());
                            }
                            this.f55476v.putOpt("camera_front_back_multicam_combos", jSONArray7);
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
            TECameraCapabilityCollector tECameraCapabilityCollector4 = this.f55475u;
            tECameraCapabilityCollector4.m80668a(new TECameraCapabilityCollector.C13328a(capability10, tECameraCapabilityCollector4.m80669b(capability10), value3.toString()));
        }
        this.f55475u.m80671d();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
        C13341g.m80818e("TECamera2", "collectCameraCapabilities consume: " + jCurrentTimeMillis4);
        ajh0.m96973b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis4);
        this.f55477w = true;
        wjh0.m203446b();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: g0 */
    public void mo80583g0(boolean z) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        C13341g.m80818e("TECamera2", "setAutoExposureLock...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
            return;
        }
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null || (cameraCharacteristics = tECameraModeBase.f55530a) == null) {
            C13341g.m80815b("TECamera2", "setAutoExposureLock : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setAutoExposureLock : camera is null.", this.f55430D);
            return;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            this.f55433G.m80760X(z);
        } else {
            C13341g.m80823j("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.f55458d.mo80497e(-426, -426, "Current camera doesn't support auto exposure lock.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: h0 */
    public void mo80584h0(boolean z) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80818e("TECamera2", "setAutoFocusLock...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
            return;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null && tECameraModeBase.f55530a != null) {
            tECameraModeBase.m80761Y(z);
        } else {
            C13341g.m80815b("TECamera2", "setAutoFocusLock : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setAutoFocusLock : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: i */
    public void mo80630i() {
        super.mo80630i();
        m80623Y0();
        this.f55434H.m200035g();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: j */
    public void mo80585j() {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80802w();
        } else {
            C13341g.m80815b("TECamera2", "enableCaf : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "enableCaf : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: j0 */
    public boolean mo80586j0(int i) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80818e("TECamera2", "setExposureCompensation... value: " + i);
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null || tECameraModeBase.f55530a == null) {
            C13341g.m80815b("TECamera2", "setExposureCompensation : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, "setExposureCompensation : camera is null.", this.f55430D);
            return false;
        }
        if (!this.f55456b.f55311K.m80506a()) {
            C13341g.m80823j("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.f55458d.mo80497e(-414, -414, "Current camera doesn't support setting exposure compensation.", this.f55430D);
            return false;
        }
        TECameraSettings.C13303d c13303d = this.f55456b.f55311K;
        if (i <= c13303d.f55384a && i >= c13303d.f55386c) {
            return this.f55433G.m80764a0(i);
        }
        String str = "Invalid exposure compensation value: " + i + ", it must between [" + this.f55456b.f55311K.f55386c + ", " + this.f55456b.f55311K.f55384a + "].";
        C13341g.m80823j("TECamera2", str);
        this.f55458d.mo80497e(-415, -415, str, this.f55430D);
        return false;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: k */
    public void mo80631k(boolean z) {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            C13341g.m80815b("TECamera2", "enableMulticamZoom failed, mode is null...");
        } else {
            tECameraModeBase.m80804x(z);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: k0 */
    public void mo80587k0(Bundle bundle) {
        super.mo80587k0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f55472r.get(this.f55456b.f55308H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.C13310k.m80509a(str, bundle.get(str)) && "support_light_soft".equalsIgnoreCase(str)) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: l */
    public Bundle mo80588l() {
        CameraCharacteristics cameraCharacteristics;
        vih0 vih0Var;
        wjh0.m203445a("TECamera2-fillFeatures");
        Bundle bundleMo80588l = super.mo80588l();
        if (bundleMo80588l != null) {
            bundleMo80588l.putParcelableArrayList("support_preview_sizes", (ArrayList) mo80570O());
            bundleMo80588l.putParcelableArrayList("support_picture_sizes", (ArrayList) mo80569N());
            bundleMo80588l.putParcelableArrayList("camera_support_fps_range", (ArrayList) m80606V0());
            TECameraModeBase tECameraModeBase = this.f55433G;
            if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f55530a) != null && (vih0Var = this.f55441y) != null) {
                bundleMo80588l.putBoolean("device_support_multicamera_zoom", vih0Var.m198575o(cameraCharacteristics) && Build.VERSION.SDK_INT >= 30);
                bundleMo80588l.putBoolean("camera_torch_supported", this.f55441y.m198579t(this.f55433G.f55530a));
            }
            bundleMo80588l.putInt("device_support_wide_angle_mode", m80621W0() ? 1 : 0);
        }
        wjh0.m203446b();
        return bundleMo80588l;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: l0 */
    public void mo80632l0(int i) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "setISO : " + i);
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setISO operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80768d0(i);
        } else {
            C13341g.m80823j("TECamera2", "setISO : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setISO : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: m */
    public void mo80589m(TEFocusSettings tEFocusSettings) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "setFocusAreas...");
        if (this.f55442z != 3) {
            C13341g.m80823j("TECamera2", "Camera is not previewing, ignore setFocusAreas operation.");
            tEFocusSettings.m80520g().mo80534a(0, this.f55456b.f55333d, "Camera is not previewing, ignore setFocusAreas operation.");
            return;
        }
        if (!m80610I0() || (tECameraModeBase = this.f55433G) == null) {
            C13341g.m80815b("TECamera2", "focusAtPoint : camera is null.");
            tEFocusSettings.m80520g().mo80534a(-439, this.f55456b.f55333d, "focusAtPoint : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "focusAtPoint : camera is null.", this.f55430D);
        } else {
            int iMo80808z = tECameraModeBase.mo80808z(tEFocusSettings);
            if (iMo80808z != 0) {
                C13341g.m80815b("TECamera2", "focusAtPoint : something wrong.");
                this.f55458d.mo80497e(-411, iMo80808z, "focusAtPoint : something wrong.", this.f55430D);
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: m0 */
    public void mo80633m0(float f) {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80770e0(f);
        } else {
            C13341g.m80815b("TECamera2", "setManualFocusDistance : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setManualFocusDistance : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: n */
    public void mo80590n(Cert cert) {
        super.mo80590n(cert);
        C13341g.m80818e("TECamera2", "force close camera: " + this.f55430D);
        if (this.f55430D != null) {
            pih0.m169601b(cert, this.f55430D);
            this.f55430D = null;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: n0 */
    public void mo80591n0(int i, int i2) {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            C13341g.m80815b("TECamera2", "set picture size failed, no mode...");
        } else {
            tECameraModeBase.mo80772f0(i, i2);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: o */
    public float[] mo80634o() {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "getApertureRange...");
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            return tECameraModeBase.m80736A();
        }
        C13341g.m80823j("TECamera2", "getApertureRange : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getApertureRange : camera is null.", this.f55430D);
        return new float[]{-1.0f, -1.0f};
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: p */
    public TEFrameSizei mo80593p(float f, TEFrameSizei tEFrameSizei) {
        if (this.f55442z == 0 || this.f55442z == 1) {
            C13341g.m80815b("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase.f55541l == null) {
            tECameraModeBase.f55541l = (StreamConfigurationMap) tECameraModeBase.f55530a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f55433G.f55541l;
        if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            C13341g.m80815b("TECamera2", "Output is not supported, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        AbstractC13324c.e eVar = this.f55469o;
        TEFrameSizei previewSize = eVar != null ? eVar.getPreviewSize(arrayList) : null;
        if (previewSize == null) {
            return tEFrameSizei != null ? C13333f.m80700b(arrayList, tEFrameSizei) : C13333f.m80701c(arrayList, f);
        }
        return previewSize;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: q */
    public JSONObject mo80594q() {
        return this.f55476v;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: r */
    public int[] mo80595r() {
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.mo80738B();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: r0 */
    public void mo80596r0(int i) {
        super.mo80596r0(i);
        TECameraModeBase tECameraModeBase = this.f55433G;
        if (tECameraModeBase == null) {
            C13341g.m80815b("TECamera2", "set scene failed, no mode...");
        } else {
            tECameraModeBase.mo80777i0(i);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: s0 */
    public void mo80635s0(long j) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "setShutterTime : " + j);
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setShutterTime operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80779j0(j);
        } else {
            C13341g.m80823j("TECamera2", "setISO : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setISO : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: t0 */
    public void mo80597t0(boolean z, String str) {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "setWhileBalance: " + str);
        if (this.f55442z == 1) {
            C13341g.m80823j("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80781k0(z, str);
        } else {
            C13341g.m80823j("TECamera2", "setWhileBalance : camera is null.");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "setWhileBalance : camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: u0 */
    public void mo80598u0() {
        wjh0.m203445a("TECamera2-startCapture");
        C13341g.m80814a("TECamera2", "startCapture...");
        if (!m80610I0() || this.f55461g == null) {
            C13341g.m80815b("TECamera2", "startCapture, Device is not ready.");
            return;
        }
        if (this.f55442z != 2 && this.f55442z != 3) {
            C13341g.m80815b("TECamera2", "startCapture, Invalid state: " + this.f55442z);
            return;
        }
        try {
            this.f55456b.f55335e = mo80561C();
            C13341g.m80818e("TECamera2", "Camera rotation = " + this.f55456b.f55335e);
        } catch (Exception e) {
            C13332e.m80698a(e);
            m80612K0(this.f55474t);
            AbstractC13324c.a aVar = this.f55458d;
            if (aVar != null) {
                aVar.mo80498f(this.f55456b.f55329b, -425, null, this.f55430D);
            }
        }
        m80613L0();
        wjh0.m203446b();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: v */
    public int mo80599v() {
        return 2;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: v0 */
    public int mo80636v0() {
        return this.f55433G.mo80786n0();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: w0 */
    public void mo80600w0(float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        TECameraModeBase tECameraModeBase;
        if (this.f55442z != 3) {
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f55458d.mo80497e(-420, -420, "Invalid state, state = " + this.f55442z, this.f55430D);
            return;
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            tECameraModeBase.m80788o0(f, interfaceC13315p);
        } else {
            C13341g.m80815b("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f55458d.mo80495c(this.f55456b.f55329b, -439, "startZoom : Camera is null.", this.f55430D);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: x */
    public float[] mo80601x() {
        TECameraModeBase tECameraModeBase;
        C13341g.m80814a("TECamera2", "getVFOV...");
        if (this.f55442z == 1) {
            C13341g.m80814a("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        }
        if (m80610I0() && (tECameraModeBase = this.f55433G) != null) {
            return tECameraModeBase.m80742F();
        }
        C13341g.m80815b("TECamera2", "getFOV : camera is null.");
        this.f55458d.mo80495c(this.f55456b.f55329b, -439, "getFOV : camera is null.", this.f55430D);
        return new float[]{-2.0f, -2.0f};
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: x0 */
    public void mo80602x0() {
        C13341g.m80818e("TECamera2", "stopCapture...");
        if (!m80610I0()) {
            C13341g.m80815b("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f55442z != 3) {
            C13341g.m80815b("TECamera2", "Invalid state: " + this.f55442z);
        }
        m80615M0();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: y0 */
    public int mo80637y0() {
        return this.f55433G.mo80790p0();
    }
}
