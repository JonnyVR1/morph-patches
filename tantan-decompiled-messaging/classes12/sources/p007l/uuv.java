package p007l;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMFilter;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.cmw;
import l.dv0;
import l.e30;
import l.e51;
import l.fmw;
import l.h3x;
import l.i620;
import l.lsi0;
import l.mmw;
import l.n500;
import l.nnl;
import l.rlw;
import l.rmw;
import l.swf0;
import l.sxl;
import l.tif0;
import l.vwb;
import l.wb4;
import l.wlw;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uuv implements s1m, ixl, SurfaceHolder.Callback, nnl.f {

    /* JADX INFO: renamed from: z */
    public static double f13933z;

    /* JADX INFO: renamed from: a */
    public long f13934a;

    /* JADX INFO: renamed from: c */
    public sxl f13936c;

    /* JADX INFO: renamed from: d */
    public Activity f13937d;

    /* JADX INFO: renamed from: e */
    public rlw f13938e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f13939f;

    /* JADX INFO: renamed from: i */
    public int f13942i;

    /* JADX INFO: renamed from: j */
    public int f13943j;

    /* JADX INFO: renamed from: l */
    public boolean f13945l;

    /* JADX INFO: renamed from: m */
    public boolean f13946m;

    /* JADX INFO: renamed from: n */
    public String f13947n;

    /* JADX INFO: renamed from: o */
    public String f13948o;

    /* JADX INFO: renamed from: p */
    public hxl f13949p;

    /* JADX INFO: renamed from: s */
    public MusicContent f13952s;

    /* JADX INFO: renamed from: t */
    public float[] f13953t;

    /* JADX INFO: renamed from: v */
    public boolean f13955v;

    /* JADX INFO: renamed from: b */
    public int f13935b = 0;

    /* JADX INFO: renamed from: g */
    public boolean f13940g = false;

    /* JADX INFO: renamed from: h */
    public boolean f13941h = false;

    /* JADX INFO: renamed from: q */
    public boolean f13950q = true;

    /* JADX INFO: renamed from: r */
    public boolean f13951r = false;

    /* JADX INFO: renamed from: u */
    public boolean f13954u = true;

    /* JADX INFO: renamed from: w */
    public HashMap<String, String> f13956w = new HashMap<>();

    /* JADX INFO: renamed from: x */
    public List<MMPresetFilter> f13957x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public mmw f13958y = new C2517a();

    /* JADX INFO: renamed from: k */
    public boolean f13944k = vi00.m15427a();

    public uuv() {
        m15157b0();
    }

    /* JADX INFO: renamed from: c0 */
    public static String m15146c0() {
        File fileM12335a;
        try {
            fileM12335a = nv5.m12335a("photo", "temp");
        } catch (Exception e) {
            CrashHelper.c(e);
            Log4Android.getInstance().e(e);
            fileM12335a = null;
        }
        if (fileM12335a == null) {
            return null;
        }
        File file = new File(fileM12335a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.c(e2);
                Log4Android.getInstance().e(e2);
            }
        }
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File file2 = new File(fileM12335a, str + ".png_");
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(fileM12335a, str + "_" + i + ".png_");
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m15148d0() {
        File fileM12335a;
        try {
            fileM12335a = nv5.m12335a("moment", "temp");
        } catch (Exception e) {
            CrashHelper.c(e);
            Log4Android.getInstance().e(e);
            fileM12335a = null;
        }
        if (fileM12335a == null) {
            return null;
        }
        File file = new File(fileM12335a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.c(e2);
                Log4Android.getInstance().e(e2);
            }
        }
        return new File(fileM12335a, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: q0 */
    public static void m15152q0() {
        if (f13933z != 0.0d) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) FeedModule.f313a.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (NullChecker.b(activityManager)) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        f13933z = ((memoryInfo.totalMem / 1024.0d) / 1024.0d) / 1024.0d;
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: A */
    public boolean mo11037A(h3x h3xVar) {
        if (NullChecker.a(this.f13953t)) {
            mo11057w(this.f13953t);
        }
        return this.f13936c.A(h3xVar);
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: B */
    public void mo11038B() {
        this.f13936c.F().B();
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: C */
    public void mo11039C(boolean z) {
        this.f13936c.Q(z);
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: E */
    public void mo13985E(int i, int i2, int i3, int i4) {
        if (this.f13946m) {
            return;
        }
        if (NullChecker.b(this.f13936c)) {
            this.f13946m = true;
            hxl hxlVar = this.f13949p;
            mo13998r(hxlVar == null ? -1 : hxlVar.mo13822j());
            String strM15146c0 = m15146c0();
            this.f13948o = strM15146c0;
            if (TextUtils.isEmpty(strM15146c0)) {
                if (NullChecker.a(this.f13949p)) {
                    this.f13949p.mo13825q(null, new IllegalStateException("没有找到SD卡，无法拍照"));
                    return;
                }
                return;
            }
            final String str = this.f13948o;
            this.f13936c.G(str, i, i2, i3, i4, new rmw() { // from class: l.nuv
                /* JADX INFO: renamed from: a */
                public final void m12334a(int i5, Exception exc) {
                    this.f10890a.m15167n0(str, i5, exc);
                }
            });
        }
        zvf0.r("e_camera_take_button", "p_camera");
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: F */
    public void mo13986F() {
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.j();
        }
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: H */
    public boolean mo11040H() {
        return this.f13951r;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    @Override // p007l.s1m
    /* JADX INFO: renamed from: I */
    public boolean mo13987I(boolean z) {
        boolean z2;
        try {
            mo13998r(0);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.s();
        }
        if (NullChecker.a(this.f13949p)) {
            long jMo13819b = this.f13949p.mo13819b();
            if (!this.f13945l || !z || jMo13819b <= 0 || jMo13819b >= 1000) {
                z2 = true;
            } else {
                m15168o0();
                this.f13949p.removeLast();
                if (NullChecker.a(this.f13936c) && this.f13936c.L() > this.f13949p.getCount()) {
                    this.f13936c.removeLast();
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (NullChecker.a(this.f13936c) && NullChecker.a(this.f13949p) && this.f13949p.getCount() <= 0) {
            this.f13949p.mo13821e();
        }
        this.f13945l = false;
        return z2;
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: J */
    public void mo13988J(Rect rect) {
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.k(rect, (Camera.AutoFocusCallback) null);
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: K */
    public rlw mo13989K() {
        m15152q0();
        if (this.f13938e == null) {
            if (this.f13942i == 0) {
                this.f13942i = xdl0.y0();
                this.f13943j = xdl0.w0();
            }
            int i = (!this.f13944k || this.f13955v) ? 0 : 1;
            rlw rlwVarA = rlw.A();
            this.f13938e = rlwVarA;
            rlwVarA.X(new tif0(this.f13942i, this.f13943j));
            this.f13938e.E(i);
            this.f13938e.T(true);
            this.f13938e.C(1);
            this.f13938e.V(30);
            char c = xdl0.y0() <= 720 ? (char) 2 : (char) 0;
            if (xdl0.y0() >= 1080 && f13933z >= 5.0d) {
                c = 3;
            }
            if (c == 0) {
                m15170r0(new tif0(1280, 720));
            } else if (c != 3) {
                m15170r0(new tif0(640, 480));
            } else {
                m15170r0(new tif0(1920, 1080));
            }
        }
        return this.f13938e;
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: L */
    public void mo11041L(float[] fArr) {
        if (NullChecker.b(this.f13936c)) {
            this.f13950q = true;
            this.f13936c.J(fArr[0]);
            this.f13936c.O(fArr[1]);
        }
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: M */
    public void mo11042M(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f13936c.u(str2);
            return;
        }
        int size = this.f13956w.size();
        HashMap<String, String> map = this.f13956w;
        if (size == 0) {
            map.put(str, str2);
            this.f13936c.u(str2);
        } else {
            if (str2.equals(map.get(str))) {
                return;
            }
            this.f13956w.put(str, str2);
            this.f13936c.u(str2);
        }
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: N */
    public void mo11043N(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        mo11038B();
        this.f13954u = true;
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: O */
    public void mo13990O() {
        sxl sxlVar = this.f13936c;
        if (sxlVar == null || sxlVar.L() <= 0) {
            lsi0.j("请录制视频");
        } else if (this.f13949p.mo13826u()) {
            this.f13936c.P(this.f13958y);
            if (NullChecker.b(this.f13949p)) {
                this.f13949p.mo13824l();
            }
        }
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: P */
    public String mo11044P(int i) {
        List<MMPresetFilter> list = this.f13957x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.a(mMPresetFilter)) {
            return ((MMFilter) mMPresetFilter).mFilterName;
        }
        return null;
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: Q */
    public boolean mo11045Q() {
        return this.f13954u;
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: R */
    public String mo11046R(int i) {
        List<MMPresetFilter> list = this.f13957x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.a(mMPresetFilter)) {
            return mMPresetFilter.mFilterId;
        }
        return null;
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: S */
    public void mo11047S(int i, int i2, boolean z, float f, float f2, float f3) {
        if (!NullChecker.b(this.f13936c) || vwb.J(this.f13957x) || i2 < 0 || i2 >= this.f13957x.size()) {
            return;
        }
        this.f13936c.y(this.f13957x.get(i2).lookupUrl, 0.0f);
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: U */
    public void mo11049U() {
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.M();
            this.f13954u = true;
            this.f13949p.mo10754s(0.0f, 0);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m15154V(Camera camera) {
        if (camera == null) {
            lsi0.y("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m15155Z() {
        m15159f0();
        this.f13949p.mo10754s(0.0f, 0);
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: a */
    public void mo13991a(Activity activity, r1m r1mVar) {
        r1mVar.mo13820d().addCallback(this);
        this.f13937d = activity;
        this.f13949p = (hxl) r1mVar;
        i620.a(this);
    }

    /* JADX INFO: renamed from: a0 */
    public void m15156a0() {
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.a();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m15157b0() {
        if (this.f13936c == null) {
            sxl sxlVarA = n500.a();
            this.f13936c = sxlVarA;
            sxlVarA.B(new C2518b());
            this.f13936c.N(false);
            this.f13936c.q(0.6f);
            this.f13936c.v(0.5f);
            this.f13936c.l(this);
            this.f13936c.z(new cmw() { // from class: l.ouv
                public final void onError(int i, int i2) {
                    this.f11622a.m15161h0(i, i2);
                }
            });
            this.f13936c.D(new fmw() { // from class: l.puv
                public final void onFirstFrameRendered() {
                    this.f11989a.m15163j0();
                }
            });
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: e */
    public boolean mo13992e() {
        sxl sxlVar = this.f13936c;
        return sxlVar != null && sxlVar.e();
    }

    /* JADX INFO: renamed from: e0 */
    public wlw m15158e0() {
        return new wlw.b(this.f13938e).i();
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: f */
    public void mo11050f() {
        if (SystemClock.uptimeMillis() - this.f13934a > 1000) {
            sxl sxlVar = this.f13936c;
            if (NullChecker.b(sxlVar)) {
                if (!mo13992e() && !this.f13944k) {
                    lsi0.j("此手机不支持前置摄像头");
                    return;
                } else {
                    sxlVar.f();
                    e51.G(new Runnable() { // from class: l.quv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12398a.m15165l0();
                        }
                    });
                }
            }
            this.f13934a = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m15159f0() {
        if (this.f13936c == null) {
            return;
        }
        mo11051n(null);
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: g */
    public void mo13993g() {
        if (this.f13941h) {
            m15171s0();
            if (this.f13941h) {
                this.f13936c.w(this.f13939f);
                this.f13936c.g();
                m15155Z();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m15160g0() {
        return cdh.m9125d();
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: h */
    public boolean mo13994h() {
        return this.f13945l;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m15161h0(int i, int i2) {
        if (NullChecker.b(this.f13949p)) {
            this.f13949p.onError(i, i2);
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: i */
    public void mo13995i() {
        sxl sxlVar = this.f13936c;
        if (TextUtils.isEmpty(this.f13947n)) {
            if (NullChecker.a(this.f13949p)) {
                this.f13949p.onError(-404, 0);
            }
        } else if (NullChecker.b(sxlVar)) {
            sxlVar.H(this.f13947n);
            hxl hxlVar = this.f13949p;
            mo13998r(hxlVar == null ? -1 : hxlVar.mo13822j());
            sxlVar.i();
            this.f13945l = true;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m15162i0() {
        if (NullChecker.a(this.f13949p)) {
            this.f13949p.onFirstFrameRendered();
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: j */
    public void mo13996j() {
        if (NullChecker.a(this.f13936c)) {
            if (this.f13945l) {
                this.f13936c.j();
            }
            this.f13936c.removeLast();
        }
        this.f13945l = false;
        if (NullChecker.a(this.f13949p)) {
            this.f13949p.removeLast();
        }
        if (NullChecker.a(this.f13936c) && NullChecker.a(this.f13949p) && this.f13949p.getCount() <= 0) {
            this.f13949p.mo13821e();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m15163j0() {
        e51.G(new Runnable() { // from class: l.suv
            @Override // java.lang.Runnable
            public final void run() {
                this.f13093a.m15162i0();
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m15164k0(e30 e30Var, List list) {
        this.f13957x.clear();
        this.f13957x.addAll(list);
        if (NullChecker.a(e30Var)) {
            e30Var.call(this.f13957x);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m15165l0() {
        if (NullChecker.b(this.f13949p)) {
            this.f13949p.mo10753m();
            this.f13949p.mo10754s(0.0f, 0);
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: m */
    public boolean mo13997m() {
        try {
            if (NullChecker.b(this.f13936c)) {
                return this.f13936c.m();
            }
            return false;
        } catch (Throwable th) {
            CrashHelper.c(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m15166m0(String str, Exception exc) {
        this.f13946m = false;
        if (NullChecker.a(this.f13949p)) {
            this.f13949p.mo13825q(str, exc);
        }
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: n */
    public void mo11051n(final e30<List<MMPresetFilter>> e30Var) {
        if (this.f13957x.isEmpty() || hli.m10655j().m10664o()) {
            hli.m10655j().m10668s(false);
            hli.m10655j().m10662m(FeedModule.f313a, new e30() { // from class: l.ruv
                public final void call(Object obj) {
                    this.f12738a.m15164k0(e30Var, (List) obj);
                }
            });
        } else if (NullChecker.a(e30Var)) {
            e30Var.call(this.f13957x);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m15167n0(final String str, int i, final Exception exc) {
        if (exc == null && !new File(str).exists()) {
            exc = new FileNotFoundException();
        }
        e51.M(new Runnable() { // from class: l.tuv
            @Override // java.lang.Runnable
            public final void run() {
                this.f13424a.m15166m0(str, exc);
            }
        });
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: o */
    public void mo11052o(String str, float f) {
        this.f13936c.setFaceBeautyValue("", 0.0f);
        this.f13936c.o(str, f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m15168o0() {
        lsi0.j(String.format(FeedModule.f313a.getString(R$string.f480a1), 1L));
    }

    @Override // p007l.s1m
    public void onPause() {
        mo13987I(true);
        if (NullChecker.a(this.f13949p)) {
            this.f13949p.mo13823k(false);
        }
        m15156a0();
        m15160g0();
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: p */
    public void mo11053p(String str) {
        if (!"makeup_lut".equals(str) && !"makeup_all".equals(str)) {
            this.f13936c.p(str);
            this.f13956w.remove(str);
        } else {
            this.f13956w.remove("makeup_lut");
            this.f13956w.remove("makeup_all");
            this.f13936c.t();
        }
    }

    @Override // p007l.s1m
    public boolean prepare() {
        m15157b0();
        mo13989K();
        if (dv0.a() == null) {
            CrashHelper.c(new Exception("AppContext.getContext() is null"));
            vb4.m15413l();
        }
        return this.f13936c.R(this.f13937d, m15158e0());
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: r */
    public void mo13998r(int i) {
        sxl sxlVar = this.f13936c;
        if (NullChecker.b(sxlVar) && mo13997m()) {
            if (i != 2) {
                sxlVar.r(i);
            } else if (sxlVar.m()) {
                sxlVar.r(i);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m15170r0(tif0 tif0Var) {
        tif0 tif0VarF = wb4.f(this.f13937d, tif0Var, 0, 1.7777778f);
        if (tif0VarF != null) {
            tif0Var = tif0VarF;
        }
        if (tif0Var.b() >= 1280) {
            this.f13938e.U(8388608);
        } else if (tif0Var.b() >= 960) {
            this.f13938e.U(7340032);
        } else if (tif0Var.b() >= 640) {
            this.f13938e.U(6291456);
        }
        this.f13938e.R(tif0Var);
    }

    @Override // p007l.s1m
    public void release() {
        this.f13937d = null;
        this.f13949p = null;
        sxl sxlVar = this.f13936c;
        if (sxlVar != null) {
            sxlVar.release();
        }
        i620.b(this);
    }

    @Override // p007l.s1m
    public void removeLast() {
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.removeLast();
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: s */
    public boolean mo13999s() {
        return this.f13944k;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m15171s0() {
        if (!TextUtils.isEmpty(this.f13947n)) {
            sxl sxlVar = this.f13936c;
            if (sxlVar == null) {
                return;
            }
            sxlVar.H(this.f13947n);
            return;
        }
        String strM15148d0 = m15148d0();
        this.f13947n = strM15148d0;
        if (TextUtils.isEmpty(strM15148d0)) {
            lsi0.y("没有找到SD卡，无法录制视频");
        }
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.H(this.f13947n);
        }
    }

    @Override // p007l.ixl
    public void setFaceBeautyValue(String str, float f) {
        this.f13936c.setFaceBeautyValue(str, f);
    }

    @Override // p007l.ixl
    public void setIntensity(float f) {
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.x(f);
        }
    }

    @Override // p007l.ixl
    public boolean setState(int i) {
        boolean z = this.f13935b != i;
        this.f13935b = i;
        return z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f13939f = surfaceHolder;
        sxl sxlVar = this.f13936c;
        if (NullChecker.b(sxlVar) && this.f13940g) {
            sxlVar.w(surfaceHolder);
            sxlVar.n(i2, i3);
            this.f13940g = false;
            mo13993g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f13939f = surfaceHolder;
        this.f13941h = true;
        this.f13940g = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f13939f = null;
        this.f13941h = false;
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: t */
    public void mo11054t() {
        this.f13956w.clear();
        this.f13936c.t();
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: u */
    public void mo11055u(String str) {
        this.f13936c.u(str);
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: v */
    public void mo11056v(Map<String, Float> map) {
        if (map != null) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                if (value != null && key != null) {
                    this.f13936c.setFaceBeautyValue(key, value.floatValue());
                }
            }
        }
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: w */
    public void mo11057w(float[] fArr) {
        if (mo11045Q()) {
            this.f13953t = fArr;
        }
        this.f13950q = true;
        m15169p0(true);
        sxl sxlVar = this.f13936c;
        if (sxlVar == null) {
            return;
        }
        sxlVar.q(fArr[1]);
        sxlVar.v(fArr[0]);
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: x */
    public void mo11058x(MusicContent musicContent) {
        this.f13952s = musicContent;
        if (NullChecker.b(this.f13936c)) {
            this.f13936c.E(musicContent.path, musicContent.startMillTime, musicContent.endMillTime, true);
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: y */
    public void mo14000y(float f) {
        this.f13936c.K(f);
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: z */
    public MusicContent mo11059z() {
        return this.f13952s;
    }

    /* JADX INFO: renamed from: G */
    public void m15153G() {
    }

    @Override // p007l.ixl
    /* JADX INFO: renamed from: T */
    public void mo11048T() {
    }

    /* JADX INFO: renamed from: l.uuv$a */
    public class C2517a implements mmw {

        /* JADX INFO: renamed from: l.uuv$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f13960a;

            public a(String str) {
                this.f13960a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NullChecker.b(uuv.this.f13936c)) {
                    uuv.this.mo13996j();
                    if (NullChecker.b(uuv.this.f13949p)) {
                        uuv.this.f13949p.mo13823k(false);
                    }
                    uuv.this.f13936c.j();
                }
                if (NullChecker.b(uuv.this.f13949p)) {
                    uuv.this.f13949p.mo14001a(this.f13960a);
                }
            }
        }

        public C2517a() {
        }

        /* JADX INFO: renamed from: a */
        public void m15172a(String str) {
            e51.G(new a(str));
        }

        /* JADX INFO: renamed from: c */
        public void m15174c() {
            if (!NullChecker.b(uuv.this.f13937d) || uuv.this.f13937d.isFinishing()) {
                return;
            }
            File file = new File(uuv.this.f13947n);
            boolean z = !file.exists() || file.length() <= 0;
            if (NullChecker.b(uuv.this.f13949p)) {
                uuv.this.f13949p.mo14002c(uuv.this.f13947n, !z);
            }
            if (z) {
                lsi0.y(FeedModule.f313a.getString(R$string.f605s2));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m15173b(int i) {
        }
    }

    @Override // p007l.s1m
    /* JADX INFO: renamed from: D */
    public void mo13984D(boolean z) {
    }

    /* JADX INFO: renamed from: p0 */
    public void m15169p0(boolean z) {
    }

    /* JADX INFO: renamed from: l.uuv$b */
    public class C2518b implements swf0.a {
        public C2518b() {
        }

        public void playStateChanged(int i, boolean z) {
        }
    }
}
