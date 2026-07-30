package p006l;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMFilter;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.account.AccountModule;
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

/* JADX INFO: renamed from: l.jr */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SurfaceHolderCallbackC0899jr implements InterfaceC0984lp, InterfaceC0898jp, SurfaceHolder.Callback, nnl.f {

    /* JADX INFO: renamed from: z */
    public static double f15326z;

    /* JADX INFO: renamed from: a */
    public long f15327a;

    /* JADX INFO: renamed from: c */
    public sxl f15329c;

    /* JADX INFO: renamed from: d */
    public Activity f15330d;

    /* JADX INFO: renamed from: e */
    public rlw f15331e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f15332f;

    /* JADX INFO: renamed from: i */
    public int f15335i;

    /* JADX INFO: renamed from: j */
    public int f15336j;

    /* JADX INFO: renamed from: l */
    public boolean f15338l;

    /* JADX INFO: renamed from: m */
    public boolean f15339m;

    /* JADX INFO: renamed from: n */
    public String f15340n;

    /* JADX INFO: renamed from: o */
    public String f15341o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0851ip f15342p;

    /* JADX INFO: renamed from: s */
    public MusicContent f15345s;

    /* JADX INFO: renamed from: t */
    public float[] f15346t;

    /* JADX INFO: renamed from: v */
    public boolean f15348v;

    /* JADX INFO: renamed from: b */
    public int f15328b = 0;

    /* JADX INFO: renamed from: g */
    public boolean f15333g = false;

    /* JADX INFO: renamed from: h */
    public boolean f15334h = false;

    /* JADX INFO: renamed from: q */
    public boolean f15343q = true;

    /* JADX INFO: renamed from: r */
    public boolean f15344r = false;

    /* JADX INFO: renamed from: u */
    public boolean f15347u = true;

    /* JADX INFO: renamed from: w */
    public HashMap<String, String> f15349w = new HashMap<>();

    /* JADX INFO: renamed from: x */
    public List<MMPresetFilter> f15350x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public mmw f15351y = new a();

    /* JADX INFO: renamed from: k */
    public boolean f15337k = C1063nu.m20202a();

    public SurfaceHolderCallbackC0899jr() {
        m17762Y();
    }

    /* JADX INFO: renamed from: U */
    private void m17729U() {
        m17735c0();
        this.f15342p.mo16772s(0.0f, 0);
    }

    /* JADX INFO: renamed from: Z */
    public static String m17730Z() {
        File fileM14050a;
        try {
            fileM14050a = C0645dk.m14050a("photo", "temp");
        } catch (Exception e) {
            CrashHelper.c(e);
            Log4Android.getInstance().e(e);
            fileM14050a = null;
        }
        if (fileM14050a == null) {
            return null;
        }
        File file = new File(fileM14050a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.c(e2);
                Log4Android.getInstance().e(e2);
            }
        }
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File file2 = new File(fileM14050a, str + ".png_");
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(fileM14050a, str + "_" + i + ".png_");
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: a0 */
    public static String m17732a0() {
        File fileM14050a;
        try {
            fileM14050a = C0645dk.m14050a("moment", "temp");
        } catch (Exception e) {
            CrashHelper.c(e);
            Log4Android.getInstance().e(e);
            fileM14050a = null;
        }
        if (fileM14050a == null) {
            return null;
        }
        File file = new File(fileM14050a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.c(e2);
                Log4Android.getInstance().e(e2);
            }
        }
        return new File(fileM14050a, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: c0 */
    private void m17735c0() {
        if (this.f15329c == null) {
            return;
        }
        mo17718n(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m17737e0(int i, int i2) {
        if (NullChecker.b(this.f15342p)) {
            this.f15342p.onError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m17738f0() {
        if (NullChecker.a(this.f15342p)) {
            this.f15342p.onFirstFrameRendered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m17739g0() {
        e51.G(new Runnable() { // from class: l.hr
            @Override // java.lang.Runnable
            public final void run() {
                this.f14023a.m17738f0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m17740h0(e30 e30Var, List list) {
        this.f15350x.clear();
        this.f15350x.addAll(list);
        NullChecker.b(this.f15329c);
        if (NullChecker.a(e30Var)) {
            e30Var.call(this.f15350x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m17741i0() {
        if (NullChecker.b(this.f15342p)) {
            this.f15342p.mo16771m();
            this.f15342p.mo16772s(0.0f, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m17742j0(String str, Exception exc) {
        this.f15339m = false;
        if (NullChecker.a(this.f15342p)) {
            this.f15342p.mo18236q(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m17744k0(final String str, int i, final Exception exc) {
        if (exc == null && !new File(str).exists()) {
            exc = new FileNotFoundException();
        }
        e51.M(new Runnable() { // from class: l.ir
            @Override // java.lang.Runnable
            public final void run() {
                this.f14707a.m17742j0(str, exc);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    private static void m17746m0() {
        if (f15326z != 0.0d) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) AccountModule.f24a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (NullChecker.b(activityManager)) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        f15326z = ((memoryInfo.totalMem / 1024.0d) / 1024.0d) / 1024.0d;
    }

    /* JADX INFO: renamed from: n0 */
    private void m17747n0(tif0 tif0Var) {
        tif0 tif0VarF = wb4.f(this.f15330d, tif0Var, 0, 1.7777778f);
        if (tif0VarF != null) {
            tif0Var = tif0VarF;
        }
        if (tif0Var.b() >= 1280) {
            this.f15331e.U(8388608);
        } else if (tif0Var.b() >= 960) {
            this.f15331e.U(7340032);
        } else if (tif0Var.b() >= 640) {
            this.f15331e.U(6291456);
        }
        this.f15331e.R(tif0Var);
    }

    /* JADX INFO: renamed from: o0 */
    private void m17748o0() {
        if (!TextUtils.isEmpty(this.f15340n)) {
            sxl sxlVar = this.f15329c;
            if (sxlVar == null) {
                return;
            }
            sxlVar.H(this.f15340n);
            return;
        }
        String strM17732a0 = m17732a0();
        this.f15340n = strM17732a0;
        if (TextUtils.isEmpty(strM17732a0)) {
            lsi0.y("没有找到SD卡，无法录制视频");
        }
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.H(this.f15340n);
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: C */
    public void mo17708C(boolean z) {
        this.f15329c.Q(z);
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: E */
    public void mo17751E(int i, int i2, int i3, int i4) {
        if (this.f15339m) {
            return;
        }
        if (NullChecker.b(this.f15329c)) {
            this.f15339m = true;
            InterfaceC0851ip interfaceC0851ip = this.f15342p;
            mo17772r(interfaceC0851ip == null ? -1 : interfaceC0851ip.mo18233j());
            String strM17730Z = m17730Z();
            this.f15341o = strM17730Z;
            if (TextUtils.isEmpty(strM17730Z)) {
                if (NullChecker.a(this.f15342p)) {
                    this.f15342p.mo18236q(null, new IllegalStateException("没有找到SD卡，无法拍照"));
                    return;
                }
                return;
            }
            final String str = this.f15341o;
            this.f15329c.G(str, i, i2, i3, i4, new rmw() { // from class: l.cr
                /* JADX INFO: renamed from: a */
                public final void m13613a(int i5, Exception exc) {
                    this.f9795a.m17744k0(str, i5, exc);
                }
            });
        }
        zvf0.r("e_camera_take_button", "p_camera");
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: F */
    public void mo17752F() {
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.j();
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: H */
    public boolean mo17709H() {
        return this.f15344r;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: I */
    public boolean mo17754I(boolean z) {
        boolean z2;
        try {
            mo17772r(0);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.s();
        }
        if (NullChecker.a(this.f15342p)) {
            long jMo18230b = this.f15342p.mo18230b();
            if (!this.f15338l || !z || jMo18230b <= 0 || jMo18230b >= 1000) {
                z2 = true;
            } else {
                this.f15342p.removeLast();
                if (NullChecker.a(this.f15329c) && this.f15329c.L() > this.f15342p.getCount()) {
                    this.f15329c.removeLast();
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (NullChecker.a(this.f15329c) && NullChecker.a(this.f15342p) && this.f15342p.getCount() <= 0) {
            this.f15342p.mo18232e();
        }
        this.f15338l = false;
        return z2;
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: J */
    public void mo17755J(Rect rect) {
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.k(rect, (Camera.AutoFocusCallback) null);
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: K */
    public rlw mo17756K() {
        m17746m0();
        if (this.f15331e == null) {
            if (this.f15335i == 0) {
                this.f15335i = xdl0.y0();
                this.f15336j = xdl0.w0();
            }
            int i = (!this.f15337k || this.f15348v) ? 0 : 1;
            rlw rlwVarA = rlw.A();
            this.f15331e = rlwVarA;
            rlwVarA.X(new tif0(this.f15335i, this.f15336j));
            this.f15331e.E(i);
            this.f15331e.T(true);
            this.f15331e.C(1);
            this.f15331e.V(30);
            char c = xdl0.y0() <= 720 ? (char) 2 : (char) 0;
            if (xdl0.y0() >= 1080 && f15326z >= 5.0d) {
                c = 3;
            }
            if (c == 0) {
                m17747n0(new tif0(1280, 720));
            } else if (c != 3) {
                m17747n0(new tif0(640, 480));
            } else {
                m17747n0(new tif0(1920, 1080));
            }
        }
        return this.f15331e;
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: L */
    public void mo17710L(float[] fArr) {
        if (NullChecker.b(this.f15329c)) {
            this.f15343q = true;
            this.f15329c.J(fArr[0]);
            this.f15329c.O(fArr[1]);
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: M */
    public void mo17711M(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f15329c.u(str2);
            return;
        }
        int size = this.f15349w.size();
        HashMap<String, String> map = this.f15349w;
        if (size == 0) {
            map.put(str, str2);
            this.f15329c.u(str2);
        } else {
            if (str2.equals(map.get(str))) {
                return;
            }
            this.f15349w.put(str, str2);
            this.f15329c.u(str2);
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: N */
    public void mo17712N(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        m17760W();
        this.f15347u = true;
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: O */
    public void mo17757O() {
        sxl sxlVar = this.f15329c;
        if (sxlVar == null || sxlVar.L() <= 0) {
            lsi0.j("请录制视频");
        } else if (this.f15342p.mo18237u()) {
            this.f15329c.P(this.f15351y);
            if (NullChecker.b(this.f15342p)) {
                this.f15342p.mo18235l();
            }
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: P */
    public String mo17713P(int i) {
        List<MMPresetFilter> list = this.f15350x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.a(mMPresetFilter)) {
            return ((MMFilter) mMPresetFilter).mFilterName;
        }
        return null;
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: Q */
    public boolean mo17714Q() {
        return this.f15347u;
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: R */
    public String mo17715R(int i) {
        List<MMPresetFilter> list = this.f15350x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.a(mMPresetFilter)) {
            return mMPresetFilter.mFilterId;
        }
        return null;
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: S */
    public void mo17716S(int i, int i2, boolean z, float f, float f2, float f3) {
        if (!NullChecker.b(this.f15329c) || vwb.J(this.f15350x) || i2 < 0 || i2 >= this.f15350x.size()) {
            return;
        }
        this.f15329c.y(this.f15350x.get(i2).lookupUrl, 0.0f);
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: T */
    public void mo17758T(Activity activity, InterfaceC0942kp interfaceC0942kp) {
        interfaceC0942kp.mo18231d().addCallback(this);
        this.f15330d = activity;
        this.f15342p = (InterfaceC0851ip) interfaceC0942kp;
        i620.a(this);
    }

    /* JADX INFO: renamed from: V */
    public void m17759V(Camera camera) {
        if (camera == null) {
            lsi0.y("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: renamed from: W */
    public void m17760W() {
        this.f15329c.F().B();
    }

    /* JADX INFO: renamed from: X */
    public void m17761X() {
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.a();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m17762Y() {
        if (this.f15329c == null) {
            sxl sxlVarA = n500.a();
            this.f15329c = sxlVarA;
            sxlVarA.B(new b());
            this.f15329c.N(false);
            this.f15329c.q(0.6f);
            this.f15329c.v(0.5f);
            this.f15329c.l(this);
            this.f15329c.z(new cmw() { // from class: l.dr
                public final void onError(int i, int i2) {
                    this.f10534a.m17737e0(i, i2);
                }
            });
            this.f15329c.D(new fmw() { // from class: l.er
                public final void onFirstFrameRendered() {
                    this.f11405a.m17739g0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public wlw m17763b0() {
        return new wlw.b(this.f15331e).i();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m17764d0() {
        return C0897jo.m17668b();
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: e */
    public boolean mo17765e() {
        sxl sxlVar = this.f15329c;
        return sxlVar != null && sxlVar.e();
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: f */
    public void mo17717f() {
        if (SystemClock.uptimeMillis() - this.f15327a > 1000) {
            sxl sxlVar = this.f15329c;
            if (NullChecker.b(sxlVar)) {
                if (!mo17765e() && !this.f15337k) {
                    lsi0.j("此手机不支持前置摄像头");
                    return;
                } else {
                    sxlVar.f();
                    e51.G(new Runnable() { // from class: l.fr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12858a.m17741i0();
                        }
                    });
                }
            }
            this.f15327a = SystemClock.uptimeMillis();
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: g */
    public void mo17766g() {
        if (this.f15334h) {
            m17748o0();
            if (this.f15334h) {
                this.f15329c.w(this.f15332f);
                this.f15329c.g();
                m17729U();
            }
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: h */
    public boolean mo17767h() {
        return this.f15338l;
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: i */
    public void mo17768i() {
        sxl sxlVar = this.f15329c;
        if (TextUtils.isEmpty(this.f15340n)) {
            if (NullChecker.a(this.f15342p)) {
                this.f15342p.onError(-404, 0);
            }
        } else if (NullChecker.b(sxlVar)) {
            sxlVar.H(this.f15340n);
            InterfaceC0851ip interfaceC0851ip = this.f15342p;
            mo17772r(interfaceC0851ip == null ? -1 : interfaceC0851ip.mo18233j());
            sxlVar.i();
            this.f15338l = true;
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: j */
    public void mo17769j() {
        if (NullChecker.a(this.f15329c)) {
            if (this.f15338l) {
                this.f15329c.j();
            }
            this.f15329c.removeLast();
        }
        this.f15338l = false;
        if (NullChecker.a(this.f15342p)) {
            this.f15342p.removeLast();
        }
        if (NullChecker.a(this.f15329c) && NullChecker.a(this.f15342p) && this.f15342p.getCount() <= 0) {
            this.f15342p.mo18232e();
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: m */
    public boolean mo17771m() {
        try {
            if (NullChecker.b(this.f15329c)) {
                return this.f15329c.m();
            }
            return false;
        } catch (Throwable th) {
            CrashHelper.c(th);
            return false;
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: n */
    public void mo17718n(final e30<List<MMPresetFilter>> e30Var) {
        if (this.f15350x.isEmpty() || C0526ap.m12159j().m12168o()) {
            C0526ap.m12159j().m12172s(false);
            C0526ap.m12159j().m12166m(AccountModule.f24a, new e30() { // from class: l.gr
                public final void call(Object obj) {
                    this.f13450a.m17740h0(e30Var, (List) obj);
                }
            });
        } else if (NullChecker.a(e30Var)) {
            e30Var.call(this.f15350x);
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: o */
    public void mo17719o(String str, float f) {
        this.f15329c.setFaceBeautyValue("", 0.0f);
        this.f15329c.o(str, f);
    }

    @Override // p006l.InterfaceC0984lp
    public void onPause() {
        mo17754I(true);
        if (NullChecker.a(this.f15342p)) {
            this.f15342p.mo18234k(false);
        }
        m17761X();
        m17764d0();
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: p */
    public void mo17720p(String str) {
        if (!"makeup_lut".equals(str) && !"makeup_all".equals(str)) {
            this.f15329c.p(str);
            this.f15349w.remove(str);
        } else {
            this.f15349w.remove("makeup_lut");
            this.f15349w.remove("makeup_all");
            this.f15329c.t();
        }
    }

    @Override // p006l.InterfaceC0984lp
    public boolean prepare() {
        m17762Y();
        mo17756K();
        if (dv0.a() == null) {
            CrashHelper.c(new Exception("AppContext.getContext() is null"));
            AccountModule.m28J().et();
        }
        return this.f15329c.R(this.f15330d, m17763b0());
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: r */
    public void mo17772r(int i) {
        sxl sxlVar = this.f15329c;
        if (NullChecker.b(sxlVar) && mo17771m()) {
            if (i != 2) {
                sxlVar.r(i);
            } else if (sxlVar.m()) {
                sxlVar.r(i);
            }
        }
    }

    @Override // p006l.InterfaceC0984lp
    public void release() {
        this.f15330d = null;
        this.f15342p = null;
        i620.b(this);
    }

    @Override // p006l.InterfaceC0984lp
    public void removeLast() {
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.removeLast();
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: s */
    public boolean mo17773s() {
        return this.f15337k;
    }

    @Override // p006l.InterfaceC0898jp
    public void setFaceBeautyValue(String str, float f) {
        this.f15329c.setFaceBeautyValue(str, f);
    }

    @Override // p006l.InterfaceC0898jp
    public void setIntensity(float f) {
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.x(f);
        }
    }

    @Override // p006l.InterfaceC0898jp
    public boolean setState(int i) {
        boolean z = this.f15328b != i;
        this.f15328b = i;
        return z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f15332f = surfaceHolder;
        sxl sxlVar = this.f15329c;
        if (NullChecker.b(sxlVar) && this.f15333g) {
            sxlVar.w(surfaceHolder);
            sxlVar.n(i2, i3);
            this.f15333g = false;
            mo17766g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f15332f = surfaceHolder;
        this.f15334h = true;
        this.f15333g = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f15332f = null;
        this.f15334h = false;
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: t */
    public void mo17721t() {
        this.f15349w.clear();
        this.f15329c.t();
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: u */
    public void mo17722u(String str) {
        this.f15329c.u(str);
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: v */
    public void mo17723v(Map<String, Float> map) {
        if (map != null) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                if (value != null && key != null) {
                    this.f15329c.setFaceBeautyValue(key, value.floatValue());
                }
            }
        }
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: w */
    public void mo17724w(float[] fArr) {
        if (mo17714Q()) {
            this.f15346t = fArr;
        }
        this.f15343q = true;
        m17770l0(true);
        sxl sxlVar = this.f15329c;
        if (sxlVar == null) {
            return;
        }
        sxlVar.q(fArr[1]);
        sxlVar.v(fArr[0]);
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: x */
    public void mo17725x(MusicContent musicContent) {
        this.f15345s = musicContent;
        if (NullChecker.b(this.f15329c)) {
            this.f15329c.E(musicContent.path, musicContent.startMillTime, musicContent.endMillTime, true);
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: y */
    public void mo17774y(float f) {
        this.f15329c.K(f);
    }

    @Override // p006l.InterfaceC0898jp
    /* JADX INFO: renamed from: z */
    public MusicContent mo17726z() {
        return this.f15345s;
    }

    /* JADX INFO: renamed from: G */
    public void m17753G() {
    }

    /* JADX INFO: renamed from: l.jr$a */
    public class a implements mmw {

        /* JADX INFO: renamed from: l.jr$a$a, reason: collision with other inner class name */
        public class RunnableC1549a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f15353a;

            public RunnableC1549a(String str) {
                this.f15353a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NullChecker.b(SurfaceHolderCallbackC0899jr.this.f15329c)) {
                    SurfaceHolderCallbackC0899jr.this.mo17769j();
                    if (NullChecker.b(SurfaceHolderCallbackC0899jr.this.f15342p)) {
                        SurfaceHolderCallbackC0899jr.this.f15342p.mo18234k(false);
                    }
                    SurfaceHolderCallbackC0899jr.this.f15329c.j();
                }
                if (NullChecker.b(SurfaceHolderCallbackC0899jr.this.f15342p)) {
                    SurfaceHolderCallbackC0899jr.this.f15342p.mo18898a(this.f15353a);
                }
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m17775a(String str) {
            e51.G(new RunnableC1549a(str));
        }

        /* JADX INFO: renamed from: c */
        public void m17777c() {
            if (!NullChecker.b(SurfaceHolderCallbackC0899jr.this.f15330d) || SurfaceHolderCallbackC0899jr.this.f15330d.isFinishing()) {
                return;
            }
            File file = new File(SurfaceHolderCallbackC0899jr.this.f15340n);
            boolean z = !file.exists() || file.length() <= 0;
            if (NullChecker.b(SurfaceHolderCallbackC0899jr.this.f15342p)) {
                SurfaceHolderCallbackC0899jr.this.f15342p.mo18899c(SurfaceHolderCallbackC0899jr.this.f15340n, !z);
            }
            if (z) {
                lsi0.y("视频录制错误，请重试");
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17776b(int i) {
        }
    }

    @Override // p006l.InterfaceC0984lp
    /* JADX INFO: renamed from: D */
    public void mo17750D(boolean z) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m17770l0(boolean z) {
    }

    /* JADX INFO: renamed from: l.jr$b */
    public class b implements swf0.a {
        public b() {
        }

        public void playStateChanged(int i, boolean z) {
        }
    }
}
