package p153l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Camera;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.FloatRange;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.components.interfaces.IProcessOutput;
import com.immomo.moment.filtermanager.MMPresetFilter;
import com.immomo.moment.util.datadot.RecorderDataDotUtils;
import com.momo.xeengine.XE3DEngine;
import com.momo.xengine.mestatistics.ReportType;
import com.p046mm.mediasdk.bridge.EngineCommonBridge;
import com.p046mm.mediasdk.utils.NetUtil;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class du10 implements l0m {

    /* JADX INFO: renamed from: A */
    private epw f90666A;

    /* JADX INFO: renamed from: B */
    private bpw f90667B;

    /* JADX INFO: renamed from: C */
    private c5g0.InterfaceC16197a f90668C;

    /* JADX INFO: renamed from: D */
    private qpw f90669D;

    /* JADX INFO: renamed from: E */
    private ppw f90670E;

    /* JADX INFO: renamed from: F */
    private Activity f90671F;

    /* JADX INFO: renamed from: G */
    private vow f90672G;

    /* JADX INFO: renamed from: H */
    private boolean f90673H;

    /* JADX INFO: renamed from: I */
    private boolean f90674I;

    /* JADX INFO: renamed from: K */
    private z4g0 f90676K;

    /* JADX INFO: renamed from: L */
    private EngineCommonBridge f90677L;

    /* JADX INFO: renamed from: N */
    private boolean f90679N;

    /* JADX INFO: renamed from: P */
    private int f90681P;

    /* JADX INFO: renamed from: Q */
    private int f90682Q;

    /* JADX INFO: renamed from: b */
    private rer f90686b;

    /* JADX INFO: renamed from: c */
    private oli f90687c;

    /* JADX INFO: renamed from: d */
    private cu10 f90688d;

    /* JADX INFO: renamed from: e */
    private qow f90689e;

    /* JADX INFO: renamed from: f */
    private g6x f90690f;

    /* JADX INFO: renamed from: m */
    private boolean f90697m;

    /* JADX INFO: renamed from: o */
    private float f90699o;

    /* JADX INFO: renamed from: q */
    private String f90701q;

    /* JADX INFO: renamed from: r */
    private SurfaceHolder f90702r;

    /* JADX INFO: renamed from: s */
    private int f90703s;

    /* JADX INFO: renamed from: t */
    private int f90704t;

    /* JADX INFO: renamed from: u */
    private int f90705u;

    /* JADX INFO: renamed from: v */
    private int f90706v;

    /* JADX INFO: renamed from: x */
    private String f90708x;

    /* JADX INFO: renamed from: y */
    private String f90709y;

    /* JADX INFO: renamed from: z */
    private ypl.InterfaceC21661f f90710z;

    /* JADX INFO: renamed from: a */
    private List<MMPresetFilter> f90685a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    private boolean f90691g = false;

    /* JADX INFO: renamed from: h */
    private boolean f90692h = false;

    /* JADX INFO: renamed from: i */
    private boolean f90693i = false;

    /* JADX INFO: renamed from: j */
    private float f90694j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f90695k = 0.0f;

    /* JADX INFO: renamed from: l */
    private boolean f90696l = false;

    /* JADX INFO: renamed from: n */
    private boolean f90698n = false;

    /* JADX INFO: renamed from: p */
    private boolean f90700p = false;

    /* JADX INFO: renamed from: w */
    private boolean f90707w = true;

    /* JADX INFO: renamed from: J */
    private boolean f90675J = false;

    /* JADX INFO: renamed from: M */
    private NetUtil.InterfaceC4155a f90678M = new C16623b();

    /* JADX INFO: renamed from: O */
    private String f90680O = null;

    /* JADX INFO: renamed from: R */
    private m4m f90683R = new C16626e();

    /* JADX INFO: renamed from: S */
    private final C16629h f90684S = new C16629h(this, null);

    /* JADX INFO: renamed from: l.du10$a */
    public class C16622a implements gpw {
        public C16622a() {
        }
    }

    /* JADX INFO: renamed from: l.du10$b */
    public class C16623b implements NetUtil.InterfaceC4155a {
        public C16623b() {
        }

        @Override // com.p046mm.mediasdk.utils.NetUtil.InterfaceC4155a
        public void onNetworkChanged() {
            if (NetUtil.m20631e()) {
                du10.this.m117971m0();
            }
        }
    }

    /* JADX INFO: renamed from: l.du10$c */
    public class C16624c implements bpw {
        public C16624c() {
        }

        @Override // p153l.bpw
        public void onError(int i, int i2) {
            MDLog.m7446e("VideoRecord", "onError what:%d extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: l.du10$d */
    public class C16625d implements qpw {
        public C16625d() {
        }

        @Override // p153l.qpw
        /* JADX INFO: renamed from: a */
        public void mo118030a(int i, Exception exc) {
            if (du10.this.f90669D != null) {
                du10.this.f90669D.mo118030a(i, exc);
            }
        }
    }

    /* JADX INFO: renamed from: l.du10$e */
    public class C16626e implements m4m {
        public C16626e() {
        }

        @Override // p153l.m4m
        /* JADX INFO: renamed from: B */
        public void mo118031B() {
            if (du10.this.f90686b != null) {
                cu10 cu10Var = du10.this.f90688d;
                if (cu10Var != null) {
                    cu10Var.m112598Q(new HashMap<>());
                }
                du10.this.f90686b.m181049d0();
                if (du10.this.f90676K != null) {
                    du10.this.f90676K.m218591b(du10.this);
                }
                du10.this.f90690f = null;
                du10.this.f90691g = false;
                du10.this.f90693i = false;
            }
            if (du10.this.f90688d != null) {
                du10.this.f90688d.m112595N(9);
                if (du10.this.f90676K != null && du10.this.f90686b != null) {
                    du10 du10Var = du10.this;
                    du10Var.m117978x0("beauty_thinFaceValue", du10Var.f90676K.m218590a("beauty_thinFaceValue"), false);
                    du10 du10Var2 = du10.this;
                    du10Var2.m117978x0("beauty_bigEyeValue", du10Var2.f90676K.m218590a("beauty_bigEyeValue"), false);
                }
            }
            du10.this.m118022t0();
            if (du10.this.m118013n0()) {
                du10.this.m117975u0();
            }
            du10.this.m117968j0();
        }
    }

    /* JADX INFO: renamed from: l.du10$f */
    public class RunnableC16627f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ lpw f90716a;

        public RunnableC16627f(lpw lpwVar) {
            this.f90716a = lpwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (du10.this.f90688d != null) {
                du10.this.f90688d.m112620j(du10.this.f90688d.m112629o(), du10.this.f90708x, "", new in50(this.f90716a), kv0.m151647a());
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    private void m117949A0() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112626m0(this.f90705u, this.f90706v);
        }
    }

    /* JADX INFO: renamed from: B0 */
    private boolean m117950B0() {
        return this.f90688d.m112644y0();
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m117965g0(g6x g6xVar, boolean z) {
        cu10 cu10Var = this.f90688d;
        if (cu10Var == null || this.f90686b == null) {
            return false;
        }
        if (z) {
            mo117993M();
        }
        if (g6xVar == null) {
            return false;
        }
        return m117974s0(g6xVar, cu10Var);
    }

    /* JADX INFO: renamed from: h0 */
    private void m117966h0(Context context) {
        crf0 crf0VarM200762f = vc4.m200762f(context.getApplicationContext(), this.f90689e.m177365q(), 0, 1.7777778f);
        if (crf0VarM200762f == null) {
            crf0VarM200762f = new crf0(640, 480);
        }
        this.f90689e.m177342R(crf0VarM200762f);
    }

    /* JADX INFO: renamed from: i0 */
    private void m117967i0() {
        if (this.f90688d == null || !this.f90673H) {
            cu10 cu10Var = new cu10();
            this.f90688d = cu10Var;
            cu10Var.m112599R(true);
            this.f90688d.m112605X(new gn50());
            lrw.m155653j().m155658d();
            this.f90673H = true;
            if (!TextUtils.isEmpty(this.f90680O)) {
                mo117985E(this.f90680O, this.f90681P, this.f90682Q, false);
            }
            SurfaceHolder surfaceHolder = this.f90702r;
            if (surfaceHolder != null) {
                MDLog.m7450i("VideoRecord", "createRecorder setHolder %s", surfaceHolder);
                this.f90688d.m112614f0(this.f90702r);
                this.f90688d.m112626m0(this.f90703s, this.f90704t);
            }
            m117978x0("beauty_thinFaceValue", 0.6f, false);
            m117978x0("beauty_bigEyeValue", 0.5f, false);
            this.f90688d.m112606Y(new C16624c());
            this.f90688d.m112616g0(null);
            this.f90688d.m112604W(this.f90710z);
            this.f90688d.m112607Z(this.f90666A);
            this.f90688d.m112594M(null);
            this.f90688d.m112606Y(this.f90667B);
            this.f90688d.m112611d0(new C16625d());
            this.f90688d.m112623k0(this.f90679N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m117968j0() {
        cu10 cu10Var;
        if (!this.f90692h || (cu10Var = this.f90688d) == null) {
            return;
        }
        this.f90692h = false;
        if (cu10Var.m112640w()) {
            return;
        }
        if (m117972o0()) {
            this.f90688d.m112642x0(this.f90671F);
            return;
        }
        this.f90689e.m177329E(1);
        this.f90688d.m112585C(this.f90671F, this.f90689e);
        m117949A0();
    }

    /* JADX INFO: renamed from: k0 */
    private String m117969k0(int i) {
        if (i != 1) {
            return i != 2 ? BLiveOperationTitleShowType.off : "auto";
        }
        return "on";
    }

    /* JADX INFO: renamed from: l0 */
    private void m117970l0() {
        rer rerVar = new rer(IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE);
        this.f90686b = rerVar;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112597P(rerVar);
        }
        this.f90677L = new EngineCommonBridge(this.f90686b);
        oli oliVar = new oli(this.f90686b, this.f90685a);
        this.f90687c = oliVar;
        kt2 kt2VarM168117b = oliVar.m168117b();
        if (kt2VarM168117b != null) {
            this.f90688d.m112593L(kt2VarM168117b);
        }
        cu10 cu10Var2 = this.f90688d;
        if (cu10Var2 != null) {
            cu10Var2.m112619i0(this.f90684S);
        }
        this.f90686b.m181056m0(new C16628g());
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m117972o0() {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    private void m117973r0(String str) {
        RecorderDataDotUtils.getInstance().realTimeReport(j4g0.m143415a(IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE, str), System.currentTimeMillis(), ReportType.COUNT);
    }

    /* JADX INFO: renamed from: s0 */
    private boolean m117974s0(g6x g6xVar, cu10 cu10Var) {
        this.f90693i = false;
        this.f90691g = false;
        this.f90690f = g6xVar;
        w80 w80VarM129285a = g6xVar.m129285a();
        boolean zM205396a = w80VarM129285a != null ? w80VarM129285a.m205396a() : false;
        if (this.f90686b != null) {
            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-use-sticker", System.currentTimeMillis(), ReportType.COUNT);
            this.f90686b.m181044Y(g6xVar);
        }
        if (zM205396a) {
            this.f90691g = true;
            this.f90692h = true;
            if (m117950B0()) {
                this.f90693i = true;
            } else if (cu10Var.m112640w()) {
                cu10Var.m112642x0(this.f90671F);
            }
        } else {
            this.f90693i = false;
            this.f90691g = false;
            if (this.f90692h) {
                this.f90692h = false;
                if (!cu10Var.m112640w()) {
                    if (m117972o0()) {
                        m117975u0();
                        cu10Var.m112642x0(this.f90671F);
                    } else {
                        this.f90689e.m177329E(1);
                        cu10Var.m112585C(this.f90671F, this.f90689e);
                        this.f90688d.m112626m0(this.f90703s, this.f90704t);
                    }
                }
            } else {
                m117975u0();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m117975u0() {
        this.f90688d.m112590I();
    }

    /* JADX INFO: renamed from: v0 */
    private void m117976v0() {
        if (this.f90680O != null) {
            try {
                float f = 1.0f / this.f90699o;
                int iM117977w0 = m117977w0();
                if (!this.f90700p) {
                    this.f90700p = true;
                    n120.m161074r(this.f90680O, iM117977w0, this.f90682Q, f, this.f90672G.m202171b());
                } else {
                    if (iM117977w0 >= 0) {
                        n120.m161070n(iM117977w0);
                    }
                    n120.m161068l(f);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace("VideoRecord", e);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    private int m117977w0() {
        int iM112634r;
        if (this.f90680O == null) {
            return 0;
        }
        MDLog.m7449i("SDK_VIDEO_SDK", "seekMusic endMillTime" + this.f90682Q);
        int i = this.f90682Q;
        int i2 = this.f90681P;
        if ((i2 == 0 && i == 0) || i2 == i) {
            return 0;
        }
        try {
            cu10 cu10Var = this.f90688d;
            iM112634r = cu10Var == null ? 0 : (int) cu10Var.m112634r();
        } catch (Exception unused) {
        }
        int i3 = iM112634r + this.f90681P;
        MDLog.m7449i("SDK_VIDEO_SDK", "seekMusic seek " + i3);
        int i4 = this.f90681P;
        if (i3 < i4) {
            return 0;
        }
        if (i3 > i) {
            i3 %= i - i4;
        }
        MDLog.m7449i("SDK_VIDEO_SDK", "seekMusic real seek " + i3);
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m117978x0(String str, float f, boolean z) {
        z4g0 z4g0Var;
        m117979y0(str, f);
        if (z && (z4g0Var = this.f90676K) != null) {
            z4g0Var.m218592c(str, f);
        }
        if ("beauty_thinBodyValue".equals(str)) {
            this.f90694j = f;
            m118029z0();
        } else if ("beauty_longLegValue".equals(str)) {
            this.f90695k = f;
            m118029z0();
        }
        rer rerVar = this.f90686b;
        if (rerVar != null) {
            rerVar.m181057n0(str, f);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m117979y0(String str, float f) {
        String strM143416b = j4g0.m143416b(str);
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReportType reportType = ReportType.COUNT;
        recorderDataDotUtils.realTimeReport("sdk-camera-engine-use-beauty", jCurrentTimeMillis, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-" + strM143416b, System.currentTimeMillis(), reportType);
    }

    @Override // p153l.o0m
    /* JADX INFO: renamed from: A */
    public boolean mo117980A(g6x g6xVar) {
        return m117965g0(g6xVar, true);
    }

    @Override // p153l.o0m
    /* JADX INFO: renamed from: B */
    public void mo117981B(c5g0.InterfaceC16197a interfaceC16197a) {
        this.f90668C = interfaceC16197a;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: C */
    public void mo117982C(String str, boolean z, qpw qpwVar) {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            try {
                this.f90669D = qpwVar;
                cu10Var.m112582A0(str, z);
            } catch (Exception e) {
                MDLog.printErrStackTrace("SDK_VIDEO_SDK", e);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m117983C0(String str, int i, int i2, int i3, int i4, boolean z, qpw qpwVar) {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            try {
                this.f90669D = qpwVar;
                cu10Var.m112646z0(str, i, i2, i3, i4, z);
            } catch (Exception e) {
                MDLog.printErrStackTrace("SDK_VIDEO_SDK", e);
            }
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: D */
    public void mo117984D(epw epwVar) {
        this.f90666A = epwVar;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112607Z(epwVar);
        }
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: E */
    public boolean mo117985E(String str, int i, int i2, boolean z) {
        this.f90700p = false;
        this.f90680O = str;
        this.f90681P = i;
        this.f90682Q = i2;
        if (this.f90688d == null) {
            MDLog.m7445e("VideoRecord", "please prepare first");
            return false;
        }
        if (n120.m161058b()) {
            if (z) {
                u1j0.m193977l("该机型暂不支持此功能！");
            }
            MDLog.m7445e("VideoRecord", "this device is not support music");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            azk0.m101074a("音乐路径不能设置为空");
            return false;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            MDLog.m7445e("VideoRecord", "music file not exist");
            return false;
        }
        this.f90688d.m112596O(true);
        return true;
    }

    @Override // p153l.o0m
    /* JADX INFO: renamed from: F */
    public m4m mo117986F() {
        return this.f90683R;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: G */
    public void mo117987G(String str, int i, int i2, int i3, int i4, qpw qpwVar) {
        m117983C0(str, i, i2, i3, i4, false, qpwVar);
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: H */
    public void mo117988H(String str) {
        this.f90708x = str;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112602U(str);
        }
    }

    @Override // p153l.l0m
    @Deprecated
    /* JADX INFO: renamed from: I */
    public boolean mo117989I(Activity activity, qow qowVar) {
        return mo117998R(activity, new vow.C20896b(qowVar).m202180i());
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: J */
    public void mo117990J(float f) {
        if (this.f90674I) {
            return;
        }
        setFaceBeautyValue("beauty_skinSmoothingValue", f);
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: K */
    public void mo117991K(float f) {
        this.f90699o = f;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112618h0(f);
        }
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: L */
    public int mo117992L() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var == null) {
            return -1;
        }
        return cu10Var.m112627n();
    }

    @Override // p153l.o0m
    /* JADX INFO: renamed from: M */
    public void mo117993M() {
        if (this.f90686b != null) {
            cu10 cu10Var = this.f90688d;
            if (cu10Var != null) {
                cu10Var.m112598Q(new HashMap<>());
            }
            z4g0 z4g0Var = this.f90676K;
            if (z4g0Var != null) {
                z4g0Var.m218591b(this);
            }
            this.f90686b.m181049d0();
            this.f90690f = null;
            this.f90691g = false;
            this.f90693i = false;
        }
        m118022t0();
        if (m118013n0()) {
            m117975u0();
        }
        m117968j0();
    }

    @Override // p153l.o0m
    /* JADX INFO: renamed from: N */
    public void mo117994N(boolean z) {
        this.f90707w = z;
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: O */
    public void mo117995O(float f) {
        if (this.f90674I) {
            return;
        }
        setFaceBeautyValue("beauty_skinWhitenValue", f);
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: P */
    public boolean mo117996P(lpw lpwVar) {
        if (this.f90697m) {
            mo118020s();
        }
        if (this.f90688d == null) {
            return false;
        }
        lyi0.m156289d(2, new RunnableC16627f(lpwVar));
        return true;
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: Q */
    public void mo117997Q(boolean z) {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112615g(z);
        }
        rer rerVar = this.f90686b;
        if (rerVar != null) {
            rerVar.m181052g0(z);
        }
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: R */
    public boolean mo117998R(Activity activity, vow vowVar) {
        this.f90671F = activity;
        this.f90672G = vowVar;
        this.f90689e = vowVar.m202170a();
        m117967i0();
        m117966h0(activity);
        boolean zM112585C = this.f90688d.m112585C(activity, this.f90689e);
        this.f90688d.m112599R(true);
        this.f90688d.m112601T(new C16622a());
        if (byx.m107100a()) {
            try {
                XE3DEngine.loadLuaEngineSo();
            } catch (Throwable unused) {
            }
        }
        this.f90688d.m112624l0(true);
        this.f90688d.m112621j0(this.f90675J);
        NetUtil.m20632f(this.f90678M);
        m117971m0();
        m117970l0();
        this.f90676K = new z4g0();
        return zM112585C;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: a */
    public void mo117999a() {
        MDLog.m7449i("VideoRecord", "stopPreview");
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112602U(this.f90708x);
            cu10Var.m112612e0(this.f90709y);
            cu10Var.m112583B();
            cu10Var.m112592K();
            cu10Var.m112604W(null);
            cu10Var.m112606Y(null);
            cu10Var.m112608a0(null);
            cu10Var.m112609b0(null);
            cu10Var.m112614f0(null);
        }
        this.f90673H = false;
        this.f90696l = false;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: b */
    public void mo118000b(int i) {
        cu10 cu10Var;
        if (m118018q0() && (cu10Var = this.f90688d) != null) {
            cu10Var.m112628n0(i);
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: c */
    public int mo118001c() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            return cu10Var.m112632q();
        }
        return 0;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: d */
    public int mo118002d() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            return cu10Var.m112625m();
        }
        return 0;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: e */
    public boolean mo118003e() {
        cu10 cu10Var = this.f90688d;
        return cu10Var == null || cu10Var.m112640w();
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: f */
    public void mo118004f() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var == null || this.f90671F == null || this.f90691g) {
            return;
        }
        if (cu10Var.m112640w() || m118016p0()) {
            cu10Var.m112642x0(this.f90671F);
        } else {
            u1j0.m193979n("此手机不支持前置摄像头");
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: g */
    public void mo118005g() {
        Activity activity;
        MDLog.m7449i("VideoRecord", "startPreview");
        if (this.f90702r == null) {
            MDLog.m7445e("VideoRecord", "调用startPreview前请先调用setPreviewDisplay");
            return;
        }
        if (this.f90696l) {
            MDLog.m7445e("VideoRecord", "请避免重复startPreview");
            return;
        }
        if (this.f90688d == null) {
            qow qowVar = this.f90689e;
            if (qowVar == null || (activity = this.f90671F) == null) {
                MDLog.m7445e("VideoRecord", "调用startPreview之前需要先进行prepare的调用");
                return;
            }
            mo117989I(activity, qowVar);
        }
        try {
            this.f90688d.m112630o0();
            g6x g6xVar = this.f90690f;
            if (g6xVar != null) {
                m117965g0(g6xVar, false);
            }
            oli oliVar = this.f90687c;
            if (oliVar != null) {
                oliVar.m168121f(this.f90701q, 0.0f);
            }
            this.f90696l = true;
            try {
                this.f90688d.m112591J(this.f90708x);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("VideoRecord", th);
        }
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo118006h() {
        return this.f90697m;
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: i */
    public void mo118007i() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var == null) {
            return;
        }
        cu10Var.m112602U(this.f90708x);
        String str = this.f90709y;
        if (str != null) {
            this.f90688d.m112612e0(str);
        }
        this.f90688d.m112631p0();
        this.f90697m = true;
        m117976v0();
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: j */
    public void mo118008j() {
        cu10 cu10Var;
        if (this.f90697m && (cu10Var = this.f90688d) != null) {
            cu10Var.m112636t0();
        }
        cu10 cu10Var2 = this.f90688d;
        if (cu10Var2 != null) {
            cu10Var2.m112613f();
        }
        this.f90697m = false;
        n120.m161065i();
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: k */
    public void mo118009k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112622k(rect, autoFocusCallback);
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: l */
    public void mo118010l(ypl.InterfaceC21661f interfaceC21661f) {
        MDLog.m7449i("VideoRecord", "setOnCameraSetListener");
        this.f90710z = interfaceC21661f;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112604W(interfaceC21661f);
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: m */
    public boolean mo118011m() {
        try {
            cu10 cu10Var = this.f90688d;
            if (cu10Var != null) {
                return cu10Var.m112645z();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: n */
    public void mo118012n(int i, int i2) {
        this.f90705u = i;
        this.f90706v = i2;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112626m0(i, i2);
        } else {
            this.f90703s = i;
            this.f90704t = i2;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m118013n0() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var == null) {
            return false;
        }
        return cu10Var.m112638v();
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: o */
    public void mo118014o(String str, float f) {
        rer rerVar = this.f90686b;
        if (rerVar != null) {
            rerVar.m181060q0(str, f);
        }
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: p */
    public void mo118015p(String str) {
        rer rerVar = this.f90686b;
        if (rerVar != null) {
            rerVar.m181055l0(str);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m118016p0() {
        return dd4.m115326a();
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: q */
    public void mo118017q(float f) {
        MDLog.m7450i("VideoRecord", "setFaceThinScale %f", Float.valueOf(f));
        setFaceBeautyValue("beauty_thinFaceValue", f);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m118018q0() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            return cu10Var.m112581A();
        }
        return false;
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: r */
    public void mo118019r(int i) {
        cu10 cu10Var = this.f90688d;
        if (cu10Var == null || !mo118011m()) {
            return;
        }
        if (i != 2) {
            cu10Var.m112600S(m117969k0(i));
        } else if (cu10Var.m112643y()) {
            cu10Var.m112600S(m117969k0(i));
        }
    }

    @Override // p153l.l0m
    public void release() {
        NetUtil.m20632f(null);
        oli oliVar = this.f90687c;
        if (oliVar != null) {
            oliVar.m168116a();
            this.f90687c = null;
        }
        n120.m161075s(n120.m161059c());
        n120.m161065i();
        this.f90685a.clear();
        this.f90673H = false;
        yqc0.m217078b();
        EngineCommonBridge engineCommonBridge = this.f90677L;
        if (engineCommonBridge != null) {
            engineCommonBridge.m20626b();
            this.f90677L = null;
        }
    }

    @Override // p153l.l0m
    public void removeLast() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112588F();
        }
    }

    @Override // p153l.l0m
    /* JADX INFO: renamed from: s */
    public void mo118020s() {
        if (this.f90688d == null || !mo118006h()) {
            return;
        }
        this.f90688d.m112636t0();
        n120.m161063g();
        this.f90697m = false;
    }

    @Override // p153l.m0m
    public void setFaceBeautyValue(String str, float f) {
        m117978x0(str, f, true);
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: t */
    public void mo118021t() {
        rer rerVar = this.f90686b;
        if (rerVar != null) {
            rerVar.m181054k0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m118022t0() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112589H();
        }
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: u */
    public void mo118023u(String str) {
        m117973r0(str);
        rer rerVar = this.f90686b;
        if (rerVar != null) {
            rerVar.m181046a0(str);
        }
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: v */
    public void mo118024v(float f) {
        MDLog.m7450i("VideoRecord", "setFaceEyeScale %f", Float.valueOf(f));
        setFaceBeautyValue("beauty_bigEyeValue", f);
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: w */
    public void mo118025w(SurfaceHolder surfaceHolder) {
        this.f90702r = surfaceHolder;
        MDLog.m7450i("VideoRecord", "setPreviewDisplay delegate:%s holder: %s", this.f90688d, surfaceHolder);
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112614f0(surfaceHolder);
        }
    }

    @Override // p153l.m0m
    /* JADX INFO: renamed from: x */
    public void mo118026x(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        oli oliVar = this.f90687c;
        if (oliVar != null) {
            oliVar.m168118c(f);
        }
    }

    @Override // p153l.o0m
    /* JADX INFO: renamed from: y */
    public void mo118027y(String str, float f) {
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-use-lookup", System.currentTimeMillis(), ReportType.COUNT);
        this.f90701q = str;
        oli oliVar = this.f90687c;
        if (oliVar != null) {
            oliVar.m168121f(str, f);
        }
    }

    @Override // p153l.n0m
    /* JADX INFO: renamed from: z */
    public void mo118028z(bpw bpwVar) {
        this.f90667B = bpwVar;
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            cu10Var.m112606Y(bpwVar);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m118029z0() {
        cu10 cu10Var = this.f90688d;
        if (cu10Var != null) {
            if (this.f90694j == 0.0f && this.f90695k == 0.0f) {
                cu10Var.m112603V(false);
                MDLog.m7449i("VideoRecord", "setNeedBodyWrap false");
            } else {
                cu10Var.m112603V(true);
                MDLog.m7450i("VideoRecord", "setNeedBodyWrap true %f - %f", Float.valueOf(this.f90694j), Float.valueOf(this.f90695k));
            }
        }
    }

    /* JADX INFO: renamed from: l.du10$h */
    public class C16629h implements c5g0.InterfaceC16197a {
        private C16629h() {
        }

        @Override // p153l.c5g0.InterfaceC16197a
        public void playStateChanged(int i, boolean z) {
            if (du10.this.f90668C != null) {
                du10.this.f90668C.playStateChanged(i, z);
            }
        }

        public /* synthetic */ C16629h(du10 du10Var, C16622a c16622a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m117971m0() {
    }

    /* JADX INFO: renamed from: l.du10$g */
    public class C16628g implements dh4 {
        public C16628g() {
        }

        @Override // p153l.dh4
        /* JADX INFO: renamed from: a */
        public void mo115783a(Bitmap bitmap) {
            if (du10.this.f90670E != null) {
                du10.this.f90670E.mo167018a(bitmap, null);
            }
        }

        @Override // p153l.dh4
        public void get3DRenderImage(Bitmap bitmap) {
        }
    }
}
