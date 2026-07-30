package p149l;

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
import com.p041mm.mediasdk.bridge.EngineCommonBridge;
import com.p041mm.mediasdk.utils.NetUtil;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class tl10 implements sxl {

    /* JADX INFO: renamed from: A */
    private fmw f170936A;

    /* JADX INFO: renamed from: B */
    private cmw f170937B;

    /* JADX INFO: renamed from: C */
    private swf0.InterfaceC20050a f170938C;

    /* JADX INFO: renamed from: D */
    private rmw f170939D;

    /* JADX INFO: renamed from: E */
    private qmw f170940E;

    /* JADX INFO: renamed from: F */
    private Activity f170941F;

    /* JADX INFO: renamed from: G */
    private wlw f170942G;

    /* JADX INFO: renamed from: H */
    private boolean f170943H;

    /* JADX INFO: renamed from: I */
    private boolean f170944I;

    /* JADX INFO: renamed from: K */
    private pwf0 f170946K;

    /* JADX INFO: renamed from: L */
    private EngineCommonBridge f170947L;

    /* JADX INFO: renamed from: N */
    private boolean f170949N;

    /* JADX INFO: renamed from: P */
    private int f170951P;

    /* JADX INFO: renamed from: Q */
    private int f170952Q;

    /* JADX INFO: renamed from: b */
    private qcr f170956b;

    /* JADX INFO: renamed from: c */
    private rii f170957c;

    /* JADX INFO: renamed from: d */
    private sl10 f170958d;

    /* JADX INFO: renamed from: e */
    private rlw f170959e;

    /* JADX INFO: renamed from: f */
    private h3x f170960f;

    /* JADX INFO: renamed from: m */
    private boolean f170967m;

    /* JADX INFO: renamed from: o */
    private float f170969o;

    /* JADX INFO: renamed from: q */
    private String f170971q;

    /* JADX INFO: renamed from: r */
    private SurfaceHolder f170972r;

    /* JADX INFO: renamed from: s */
    private int f170973s;

    /* JADX INFO: renamed from: t */
    private int f170974t;

    /* JADX INFO: renamed from: u */
    private int f170975u;

    /* JADX INFO: renamed from: v */
    private int f170976v;

    /* JADX INFO: renamed from: x */
    private String f170978x;

    /* JADX INFO: renamed from: y */
    private String f170979y;

    /* JADX INFO: renamed from: z */
    private nnl.InterfaceC18741f f170980z;

    /* JADX INFO: renamed from: a */
    private List<MMPresetFilter> f170955a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    private boolean f170961g = false;

    /* JADX INFO: renamed from: h */
    private boolean f170962h = false;

    /* JADX INFO: renamed from: i */
    private boolean f170963i = false;

    /* JADX INFO: renamed from: j */
    private float f170964j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f170965k = 0.0f;

    /* JADX INFO: renamed from: l */
    private boolean f170966l = false;

    /* JADX INFO: renamed from: n */
    private boolean f170968n = false;

    /* JADX INFO: renamed from: p */
    private boolean f170970p = false;

    /* JADX INFO: renamed from: w */
    private boolean f170977w = true;

    /* JADX INFO: renamed from: J */
    private boolean f170945J = false;

    /* JADX INFO: renamed from: M */
    private NetUtil.InterfaceC4004a f170948M = new C20205b();

    /* JADX INFO: renamed from: O */
    private String f170950O = null;

    /* JADX INFO: renamed from: R */
    private t1m f170953R = new C20208e();

    /* JADX INFO: renamed from: S */
    private final C20211h f170954S = new C20211h(this, null);

    /* JADX INFO: renamed from: l.tl10$a */
    public class C20204a implements hmw {
        public C20204a() {
        }
    }

    /* JADX INFO: renamed from: l.tl10$b */
    public class C20205b implements NetUtil.InterfaceC4004a {
        public C20205b() {
        }

        @Override // com.p041mm.mediasdk.utils.NetUtil.InterfaceC4004a
        public void onNetworkChanged() {
            if (NetUtil.m19632e()) {
                tl10.this.m189566m0();
            }
        }
    }

    /* JADX INFO: renamed from: l.tl10$c */
    public class C20206c implements cmw {
        public C20206c() {
        }

        @Override // p149l.cmw
        public void onError(int i, int i2) {
            MDLog.m7392e("VideoRecord", "onError what:%d extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: l.tl10$d */
    public class C20207d implements rmw {
        public C20207d() {
        }

        @Override // p149l.rmw
        /* JADX INFO: renamed from: a */
        public void mo108309a(int i, Exception exc) {
            if (tl10.this.f170939D != null) {
                tl10.this.f170939D.mo108309a(i, exc);
            }
        }
    }

    /* JADX INFO: renamed from: l.tl10$e */
    public class C20208e implements t1m {
        public C20208e() {
        }

        @Override // p149l.t1m
        /* JADX INFO: renamed from: B */
        public void mo186915B() {
            if (tl10.this.f170956b != null) {
                sl10 sl10Var = tl10.this.f170958d;
                if (sl10Var != null) {
                    sl10Var.m184663Q(new HashMap<>());
                }
                tl10.this.f170956b.m173910d0();
                if (tl10.this.f170946K != null) {
                    tl10.this.f170946K.m171750b(tl10.this);
                }
                tl10.this.f170960f = null;
                tl10.this.f170961g = false;
                tl10.this.f170963i = false;
            }
            if (tl10.this.f170958d != null) {
                tl10.this.f170958d.m184660N(9);
                if (tl10.this.f170946K != null && tl10.this.f170956b != null) {
                    tl10 tl10Var = tl10.this;
                    tl10Var.m189573x0("beauty_thinFaceValue", tl10Var.f170946K.m171749a("beauty_thinFaceValue"), false);
                    tl10 tl10Var2 = tl10.this;
                    tl10Var2.m189573x0("beauty_bigEyeValue", tl10Var2.f170946K.m171749a("beauty_bigEyeValue"), false);
                }
            }
            tl10.this.m189606t0();
            if (tl10.this.m189598n0()) {
                tl10.this.m189570u0();
            }
            tl10.this.m189563j0();
        }
    }

    /* JADX INFO: renamed from: l.tl10$f */
    public class RunnableC20209f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ mmw f170986a;

        public RunnableC20209f(mmw mmwVar) {
            this.f170986a = mmwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tl10.this.f170958d != null) {
                tl10.this.f170958d.m184685j(tl10.this.f170958d.m184694o(), tl10.this.f170978x, "", new bf50(this.f170986a), dv0.m113757a());
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    private void m189544A0() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184691m0(this.f170975u, this.f170976v);
        }
    }

    /* JADX INFO: renamed from: B0 */
    private boolean m189545B0() {
        return this.f170958d.m184709y0();
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m189560g0(h3x h3xVar, boolean z) {
        sl10 sl10Var = this.f170958d;
        if (sl10Var == null || this.f170956b == null) {
            return false;
        }
        if (z) {
            mo189583M();
        }
        if (h3xVar == null) {
            return false;
        }
        return m189569s0(h3xVar, sl10Var);
    }

    /* JADX INFO: renamed from: h0 */
    private void m189561h0(Context context) {
        tif0 tif0VarM202510f = wb4.m202510f(context.getApplicationContext(), this.f170959e.m179925q(), 0, 1.7777778f);
        if (tif0VarM202510f == null) {
            tif0VarM202510f = new tif0(640, 480);
        }
        this.f170959e.m179902R(tif0VarM202510f);
    }

    /* JADX INFO: renamed from: i0 */
    private void m189562i0() {
        if (this.f170958d == null || !this.f170943H) {
            sl10 sl10Var = new sl10();
            this.f170958d = sl10Var;
            sl10Var.m184664R(true);
            this.f170958d.m184670X(new ze50());
            mow.m155709j().m155714d();
            this.f170943H = true;
            if (!TextUtils.isEmpty(this.f170950O)) {
                mo186444E(this.f170950O, this.f170951P, this.f170952Q, false);
            }
            SurfaceHolder surfaceHolder = this.f170972r;
            if (surfaceHolder != null) {
                MDLog.m7396i("VideoRecord", "createRecorder setHolder %s", surfaceHolder);
                this.f170958d.m184679f0(this.f170972r);
                this.f170958d.m184691m0(this.f170973s, this.f170974t);
            }
            m189573x0("beauty_thinFaceValue", 0.6f, false);
            m189573x0("beauty_bigEyeValue", 0.5f, false);
            this.f170958d.m184671Y(new C20206c());
            this.f170958d.m184681g0(null);
            this.f170958d.m184669W(this.f170980z);
            this.f170958d.m184672Z(this.f170936A);
            this.f170958d.m184659M(null);
            this.f170958d.m184671Y(this.f170937B);
            this.f170958d.m184676d0(new C20207d());
            this.f170958d.m184688k0(this.f170949N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m189563j0() {
        sl10 sl10Var;
        if (!this.f170962h || (sl10Var = this.f170958d) == null) {
            return;
        }
        this.f170962h = false;
        if (sl10Var.m184705w()) {
            return;
        }
        if (m189567o0()) {
            this.f170958d.m184707x0(this.f170941F);
            return;
        }
        this.f170959e.m179889E(1);
        this.f170958d.m184650C(this.f170941F, this.f170959e);
        m189544A0();
    }

    /* JADX INFO: renamed from: k0 */
    private String m189564k0(int i) {
        if (i != 1) {
            return i != 2 ? BLiveOperationTitleShowType.off : "auto";
        }
        return "on";
    }

    /* JADX INFO: renamed from: l0 */
    private void m189565l0() {
        qcr qcrVar = new qcr(IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE);
        this.f170956b = qcrVar;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184662P(qcrVar);
        }
        this.f170947L = new EngineCommonBridge(this.f170956b);
        rii riiVar = new rii(this.f170956b, this.f170955a);
        this.f170957c = riiVar;
        us2 us2VarM179511b = riiVar.m179511b();
        if (us2VarM179511b != null) {
            this.f170958d.m184658L(us2VarM179511b);
        }
        sl10 sl10Var2 = this.f170958d;
        if (sl10Var2 != null) {
            sl10Var2.m184684i0(this.f170954S);
        }
        this.f170956b.m173917m0(new C20210g());
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m189567o0() {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    private void m189568r0(String str) {
        RecorderDataDotUtils.getInstance().realTimeReport(awf0.m99281a(IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE, str), System.currentTimeMillis(), ReportType.COUNT);
    }

    /* JADX INFO: renamed from: s0 */
    private boolean m189569s0(h3x h3xVar, sl10 sl10Var) {
        this.f170963i = false;
        this.f170961g = false;
        this.f170960f = h3xVar;
        a90 a90VarM129179a = h3xVar.m129179a();
        boolean zM95389a = a90VarM129179a != null ? a90VarM129179a.m95389a() : false;
        if (this.f170956b != null) {
            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-use-sticker", System.currentTimeMillis(), ReportType.COUNT);
            this.f170956b.m173905Y(h3xVar);
        }
        if (zM95389a) {
            this.f170961g = true;
            this.f170962h = true;
            if (m189545B0()) {
                this.f170963i = true;
            } else if (sl10Var.m184705w()) {
                sl10Var.m184707x0(this.f170941F);
            }
        } else {
            this.f170963i = false;
            this.f170961g = false;
            if (this.f170962h) {
                this.f170962h = false;
                if (!sl10Var.m184705w()) {
                    if (m189567o0()) {
                        m189570u0();
                        sl10Var.m184707x0(this.f170941F);
                    } else {
                        this.f170959e.m179889E(1);
                        sl10Var.m184650C(this.f170941F, this.f170959e);
                        this.f170958d.m184691m0(this.f170973s, this.f170974t);
                    }
                }
            } else {
                m189570u0();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m189570u0() {
        this.f170958d.m184655I();
    }

    /* JADX INFO: renamed from: v0 */
    private void m189571v0() {
        if (this.f170950O != null) {
            try {
                float f = 1.0f / this.f170969o;
                int iM189572w0 = m189572w0();
                if (!this.f170970p) {
                    this.f170970p = true;
                    ft10.m123004r(this.f170950O, iM189572w0, this.f170952Q, f, this.f170942G.m203950b());
                } else {
                    if (iM189572w0 >= 0) {
                        ft10.m123000n(iM189572w0);
                    }
                    ft10.m122998l(f);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace("VideoRecord", e);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    private int m189572w0() {
        int iM184699r;
        if (this.f170950O == null) {
            return 0;
        }
        MDLog.m7395i("SDK_VIDEO_SDK", "seekMusic endMillTime" + this.f170952Q);
        int i = this.f170952Q;
        int i2 = this.f170951P;
        if ((i2 == 0 && i == 0) || i2 == i) {
            return 0;
        }
        try {
            sl10 sl10Var = this.f170958d;
            iM184699r = sl10Var == null ? 0 : (int) sl10Var.m184699r();
        } catch (Exception unused) {
        }
        int i3 = iM184699r + this.f170951P;
        MDLog.m7395i("SDK_VIDEO_SDK", "seekMusic seek " + i3);
        int i4 = this.f170951P;
        if (i3 < i4) {
            return 0;
        }
        if (i3 > i) {
            i3 %= i - i4;
        }
        MDLog.m7395i("SDK_VIDEO_SDK", "seekMusic real seek " + i3);
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m189573x0(String str, float f, boolean z) {
        pwf0 pwf0Var;
        m189574y0(str, f);
        if (z && (pwf0Var = this.f170946K) != null) {
            pwf0Var.m171751c(str, f);
        }
        if ("beauty_thinBodyValue".equals(str)) {
            this.f170964j = f;
            m189613z0();
        } else if ("beauty_longLegValue".equals(str)) {
            this.f170965k = f;
            m189613z0();
        }
        qcr qcrVar = this.f170956b;
        if (qcrVar != null) {
            qcrVar.m173918n0(str, f);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m189574y0(String str, float f) {
        String strM99282b = awf0.m99282b(str);
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReportType reportType = ReportType.COUNT;
        recorderDataDotUtils.realTimeReport("sdk-camera-engine-use-beauty", jCurrentTimeMillis, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-" + strM99282b, System.currentTimeMillis(), reportType);
    }

    @Override // p149l.vxl
    /* JADX INFO: renamed from: A */
    public boolean mo189575A(h3x h3xVar) {
        return m189560g0(h3xVar, true);
    }

    @Override // p149l.vxl
    /* JADX INFO: renamed from: B */
    public void mo189576B(swf0.InterfaceC20050a interfaceC20050a) {
        this.f170938C = interfaceC20050a;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: C */
    public void mo189577C(String str, boolean z, rmw rmwVar) {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            try {
                this.f170939D = rmwVar;
                sl10Var.m184647A0(str, z);
            } catch (Exception e) {
                MDLog.printErrStackTrace("SDK_VIDEO_SDK", e);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m189578C0(String str, int i, int i2, int i3, int i4, boolean z, rmw rmwVar) {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            try {
                this.f170939D = rmwVar;
                sl10Var.m184711z0(str, i, i2, i3, i4, z);
            } catch (Exception e) {
                MDLog.printErrStackTrace("SDK_VIDEO_SDK", e);
            }
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: D */
    public void mo189579D(fmw fmwVar) {
        this.f170936A = fmwVar;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184672Z(fmwVar);
        }
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: E */
    public boolean mo186444E(String str, int i, int i2, boolean z) {
        this.f170970p = false;
        this.f170950O = str;
        this.f170951P = i;
        this.f170952Q = i2;
        if (this.f170958d == null) {
            MDLog.m7391e("VideoRecord", "please prepare first");
            return false;
        }
        if (ft10.m122988b()) {
            if (z) {
                rsi0.m180678l("该机型暂不支持此功能！");
            }
            MDLog.m7391e("VideoRecord", "this device is not support music");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            upk0.m194883a("音乐路径不能设置为空");
            return false;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            MDLog.m7391e("VideoRecord", "music file not exist");
            return false;
        }
        this.f170958d.m184661O(true);
        return true;
    }

    @Override // p149l.vxl
    /* JADX INFO: renamed from: F */
    public t1m mo189580F() {
        return this.f170953R;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: G */
    public void mo189581G(String str, int i, int i2, int i3, int i4, rmw rmwVar) {
        m189578C0(str, i, i2, i3, i4, false, rmwVar);
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: H */
    public void mo186445H(String str) {
        this.f170978x = str;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184667U(str);
        }
    }

    @Override // p149l.sxl
    @Deprecated
    /* JADX INFO: renamed from: I */
    public boolean mo186446I(Activity activity, rlw rlwVar) {
        return mo186450R(activity, new wlw.C20891b(rlwVar).m203959i());
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: J */
    public void mo189582J(float f) {
        if (this.f170944I) {
            return;
        }
        setFaceBeautyValue("beauty_skinSmoothingValue", f);
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: K */
    public void mo186447K(float f) {
        this.f170969o = f;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184683h0(f);
        }
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: L */
    public int mo186448L() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var == null) {
            return -1;
        }
        return sl10Var.m184692n();
    }

    @Override // p149l.vxl
    /* JADX INFO: renamed from: M */
    public void mo189583M() {
        if (this.f170956b != null) {
            sl10 sl10Var = this.f170958d;
            if (sl10Var != null) {
                sl10Var.m184663Q(new HashMap<>());
            }
            pwf0 pwf0Var = this.f170946K;
            if (pwf0Var != null) {
                pwf0Var.m171750b(this);
            }
            this.f170956b.m173910d0();
            this.f170960f = null;
            this.f170961g = false;
            this.f170963i = false;
        }
        m189606t0();
        if (m189598n0()) {
            m189570u0();
        }
        m189563j0();
    }

    @Override // p149l.vxl
    /* JADX INFO: renamed from: N */
    public void mo189584N(boolean z) {
        this.f170977w = z;
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: O */
    public void mo189585O(float f) {
        if (this.f170944I) {
            return;
        }
        setFaceBeautyValue("beauty_skinWhitenValue", f);
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: P */
    public boolean mo186449P(mmw mmwVar) {
        if (this.f170967m) {
            mo186454s();
        }
        if (this.f170958d == null) {
            return false;
        }
        jpi0.m142740d(2, new RunnableC20209f(mmwVar));
        return true;
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: Q */
    public void mo189586Q(boolean z) {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184680g(z);
        }
        qcr qcrVar = this.f170956b;
        if (qcrVar != null) {
            qcrVar.m173913g0(z);
        }
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: R */
    public boolean mo186450R(Activity activity, wlw wlwVar) {
        this.f170941F = activity;
        this.f170942G = wlwVar;
        this.f170959e = wlwVar.m203949a();
        m189562i0();
        m189561h0(activity);
        boolean zM184650C = this.f170958d.m184650C(activity, this.f170959e);
        this.f170958d.m184664R(true);
        this.f170958d.m184666T(new C20204a());
        if (epx.m117686a()) {
            try {
                XE3DEngine.loadLuaEngineSo();
            } catch (Throwable unused) {
            }
        }
        this.f170958d.m184689l0(true);
        this.f170958d.m184686j0(this.f170945J);
        NetUtil.m19633f(this.f170948M);
        m189566m0();
        m189565l0();
        this.f170946K = new pwf0();
        return zM184650C;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: a */
    public void mo189587a() {
        MDLog.m7395i("VideoRecord", "stopPreview");
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184667U(this.f170978x);
            sl10Var.m184677e0(this.f170979y);
            sl10Var.m184648B();
            sl10Var.m184657K();
            sl10Var.m184669W(null);
            sl10Var.m184671Y(null);
            sl10Var.m184673a0(null);
            sl10Var.m184674b0(null);
            sl10Var.m184679f0(null);
        }
        this.f170943H = false;
        this.f170966l = false;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: b */
    public void mo189588b(int i) {
        sl10 sl10Var;
        if (m189603q0() && (sl10Var = this.f170958d) != null) {
            sl10Var.m184693n0(i);
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: c */
    public int mo189589c() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            return sl10Var.m184697q();
        }
        return 0;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: d */
    public int mo189590d() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            return sl10Var.m184690m();
        }
        return 0;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: e */
    public boolean mo189591e() {
        sl10 sl10Var = this.f170958d;
        return sl10Var == null || sl10Var.m184705w();
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: f */
    public void mo189592f() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var == null || this.f170941F == null || this.f170961g) {
            return;
        }
        if (sl10Var.m184705w() || m189601p0()) {
            sl10Var.m184707x0(this.f170941F);
        } else {
            rsi0.m180680n("此手机不支持前置摄像头");
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: g */
    public void mo189593g() {
        Activity activity;
        MDLog.m7395i("VideoRecord", "startPreview");
        if (this.f170972r == null) {
            MDLog.m7391e("VideoRecord", "调用startPreview前请先调用setPreviewDisplay");
            return;
        }
        if (this.f170966l) {
            MDLog.m7391e("VideoRecord", "请避免重复startPreview");
            return;
        }
        if (this.f170958d == null) {
            rlw rlwVar = this.f170959e;
            if (rlwVar == null || (activity = this.f170941F) == null) {
                MDLog.m7391e("VideoRecord", "调用startPreview之前需要先进行prepare的调用");
                return;
            }
            mo186446I(activity, rlwVar);
        }
        try {
            this.f170958d.m184695o0();
            h3x h3xVar = this.f170960f;
            if (h3xVar != null) {
                m189560g0(h3xVar, false);
            }
            rii riiVar = this.f170957c;
            if (riiVar != null) {
                riiVar.m179515f(this.f170971q, 0.0f);
            }
            this.f170966l = true;
            try {
                this.f170958d.m184656J(this.f170978x);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("VideoRecord", th);
        }
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: h */
    public boolean mo186451h() {
        return this.f170967m;
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: i */
    public void mo186452i() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var == null) {
            return;
        }
        sl10Var.m184667U(this.f170978x);
        String str = this.f170979y;
        if (str != null) {
            this.f170958d.m184677e0(str);
        }
        this.f170958d.m184696p0();
        this.f170967m = true;
        m189571v0();
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: j */
    public void mo186453j() {
        sl10 sl10Var;
        if (this.f170967m && (sl10Var = this.f170958d) != null) {
            sl10Var.m184701t0();
        }
        sl10 sl10Var2 = this.f170958d;
        if (sl10Var2 != null) {
            sl10Var2.m184678f();
        }
        this.f170967m = false;
        ft10.m122995i();
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: k */
    public void mo189594k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184687k(rect, autoFocusCallback);
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: l */
    public void mo189595l(nnl.InterfaceC18741f interfaceC18741f) {
        MDLog.m7395i("VideoRecord", "setOnCameraSetListener");
        this.f170980z = interfaceC18741f;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184669W(interfaceC18741f);
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: m */
    public boolean mo189596m() {
        try {
            sl10 sl10Var = this.f170958d;
            if (sl10Var != null) {
                return sl10Var.m184710z();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: n */
    public void mo189597n(int i, int i2) {
        this.f170975u = i;
        this.f170976v = i2;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184691m0(i, i2);
        } else {
            this.f170973s = i;
            this.f170974t = i2;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m189598n0() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var == null) {
            return false;
        }
        return sl10Var.m184703v();
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: o */
    public void mo189599o(String str, float f) {
        qcr qcrVar = this.f170956b;
        if (qcrVar != null) {
            qcrVar.m173921q0(str, f);
        }
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: p */
    public void mo189600p(String str) {
        qcr qcrVar = this.f170956b;
        if (qcrVar != null) {
            qcrVar.m173916l0(str);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m189601p0() {
        return ec4.m115659a();
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: q */
    public void mo189602q(float f) {
        MDLog.m7396i("VideoRecord", "setFaceThinScale %f", Float.valueOf(f));
        setFaceBeautyValue("beauty_thinFaceValue", f);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m189603q0() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            return sl10Var.m184646A();
        }
        return false;
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: r */
    public void mo189604r(int i) {
        sl10 sl10Var = this.f170958d;
        if (sl10Var == null || !mo189596m()) {
            return;
        }
        if (i != 2) {
            sl10Var.m184665S(m189564k0(i));
        } else if (sl10Var.m184708y()) {
            sl10Var.m184665S(m189564k0(i));
        }
    }

    @Override // p149l.sxl
    public void release() {
        NetUtil.m19633f(null);
        rii riiVar = this.f170957c;
        if (riiVar != null) {
            riiVar.m179510a();
            this.f170957c = null;
        }
        ft10.m123005s(ft10.m122989c());
        ft10.m122995i();
        this.f170955a.clear();
        this.f170943H = false;
        ric0.m179490b();
        EngineCommonBridge engineCommonBridge = this.f170947L;
        if (engineCommonBridge != null) {
            engineCommonBridge.m19627b();
            this.f170947L = null;
        }
    }

    @Override // p149l.sxl
    public void removeLast() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184653F();
        }
    }

    @Override // p149l.sxl
    /* JADX INFO: renamed from: s */
    public void mo186454s() {
        if (this.f170958d == null || !mo186451h()) {
            return;
        }
        this.f170958d.m184701t0();
        ft10.m122993g();
        this.f170967m = false;
    }

    @Override // p149l.txl
    public void setFaceBeautyValue(String str, float f) {
        m189573x0(str, f, true);
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: t */
    public void mo189605t() {
        qcr qcrVar = this.f170956b;
        if (qcrVar != null) {
            qcrVar.m173915k0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m189606t0() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184654H();
        }
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: u */
    public void mo189607u(String str) {
        m189568r0(str);
        qcr qcrVar = this.f170956b;
        if (qcrVar != null) {
            qcrVar.m173907a0(str);
        }
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: v */
    public void mo189608v(float f) {
        MDLog.m7396i("VideoRecord", "setFaceEyeScale %f", Float.valueOf(f));
        setFaceBeautyValue("beauty_bigEyeValue", f);
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: w */
    public void mo189609w(SurfaceHolder surfaceHolder) {
        this.f170972r = surfaceHolder;
        MDLog.m7396i("VideoRecord", "setPreviewDisplay delegate:%s holder: %s", this.f170958d, surfaceHolder);
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184679f0(surfaceHolder);
        }
    }

    @Override // p149l.txl
    /* JADX INFO: renamed from: x */
    public void mo189610x(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        rii riiVar = this.f170957c;
        if (riiVar != null) {
            riiVar.m179512c(f);
        }
    }

    @Override // p149l.vxl
    /* JADX INFO: renamed from: y */
    public void mo189611y(String str, float f) {
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-use-lookup", System.currentTimeMillis(), ReportType.COUNT);
        this.f170971q = str;
        rii riiVar = this.f170957c;
        if (riiVar != null) {
            riiVar.m179515f(str, f);
        }
    }

    @Override // p149l.uxl
    /* JADX INFO: renamed from: z */
    public void mo189612z(cmw cmwVar) {
        this.f170937B = cmwVar;
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            sl10Var.m184671Y(cmwVar);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m189613z0() {
        sl10 sl10Var = this.f170958d;
        if (sl10Var != null) {
            if (this.f170964j == 0.0f && this.f170965k == 0.0f) {
                sl10Var.m184668V(false);
                MDLog.m7395i("VideoRecord", "setNeedBodyWrap false");
            } else {
                sl10Var.m184668V(true);
                MDLog.m7396i("VideoRecord", "setNeedBodyWrap true %f - %f", Float.valueOf(this.f170964j), Float.valueOf(this.f170965k));
            }
        }
    }

    /* JADX INFO: renamed from: l.tl10$h */
    public class C20211h implements swf0.InterfaceC20050a {
        private C20211h() {
        }

        @Override // p149l.swf0.InterfaceC20050a
        public void playStateChanged(int i, boolean z) {
            if (tl10.this.f170938C != null) {
                tl10.this.f170938C.playStateChanged(i, z);
            }
        }

        public /* synthetic */ C20211h(tl10 tl10Var, C20204a c20204a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m189566m0() {
    }

    /* JADX INFO: renamed from: l.tl10$g */
    public class C20210g implements eg4 {
        public C20210g() {
        }

        @Override // p149l.eg4
        /* JADX INFO: renamed from: a */
        public void mo116233a(Bitmap bitmap) {
            if (tl10.this.f170940E != null) {
                tl10.this.f170940E.mo168081a(bitmap, null);
            }
        }

        @Override // p149l.eg4
        public void get3DRenderImage(Bitmap bitmap) {
        }
    }
}
