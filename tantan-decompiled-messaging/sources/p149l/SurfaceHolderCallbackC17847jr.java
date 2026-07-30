package p149l;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.sina.weibo.sdk.constant.WBConstants;
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

/* JADX INFO: renamed from: l.jr */
/* JADX INFO: loaded from: classes9.dex */
public class SurfaceHolderCallbackC17847jr implements InterfaceC18275lp, InterfaceC17833jp, SurfaceHolder.Callback, nnl.InterfaceC18741f {

    /* JADX INFO: renamed from: z */
    public static double f119341z;

    /* JADX INFO: renamed from: a */
    public long f119342a;

    /* JADX INFO: renamed from: c */
    public sxl f119344c;

    /* JADX INFO: renamed from: d */
    public Activity f119345d;

    /* JADX INFO: renamed from: e */
    public rlw f119346e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f119347f;

    /* JADX INFO: renamed from: i */
    public int f119350i;

    /* JADX INFO: renamed from: j */
    public int f119351j;

    /* JADX INFO: renamed from: l */
    public boolean f119353l;

    /* JADX INFO: renamed from: m */
    public boolean f119354m;

    /* JADX INFO: renamed from: n */
    public String f119355n;

    /* JADX INFO: renamed from: o */
    public String f119356o;

    /* JADX INFO: renamed from: p */
    public InterfaceC17593ip f119357p;

    /* JADX INFO: renamed from: s */
    public MusicContent f119360s;

    /* JADX INFO: renamed from: t */
    public float[] f119361t;

    /* JADX INFO: renamed from: v */
    public boolean f119363v;

    /* JADX INFO: renamed from: b */
    public int f119343b = 0;

    /* JADX INFO: renamed from: g */
    public boolean f119348g = false;

    /* JADX INFO: renamed from: h */
    public boolean f119349h = false;

    /* JADX INFO: renamed from: q */
    public boolean f119358q = true;

    /* JADX INFO: renamed from: r */
    public boolean f119359r = false;

    /* JADX INFO: renamed from: u */
    public boolean f119362u = true;

    /* JADX INFO: renamed from: w */
    public HashMap<String, String> f119364w = new HashMap<>();

    /* JADX INFO: renamed from: x */
    public List<MMPresetFilter> f119365x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public mmw f119366y = new a();

    /* JADX INFO: renamed from: k */
    public boolean f119352k = C18775nu.m161421a();

    public SurfaceHolderCallbackC17847jr() {
        m142896Y();
    }

    /* JADX INFO: renamed from: U */
    private void m142863U() {
        m142869c0();
        this.f119357p.mo137411s(0.0f, 0);
    }

    /* JADX INFO: renamed from: Z */
    public static String m142864Z() {
        File fileM112155a;
        try {
            fileM112155a = C16395dk.m112155a(ReminderAction.photo, "temp");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            Log4Android.getInstance().m81400e(e);
            fileM112155a = null;
        }
        if (fileM112155a == null) {
            return null;
        }
        File file = new File(fileM112155a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
                Log4Android.getInstance().m81400e(e2);
            }
        }
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File file2 = new File(fileM112155a, str + ".png_");
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(fileM112155a, str + "_" + i + ".png_");
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: a0 */
    public static String m142866a0() {
        File fileM112155a;
        try {
            fileM112155a = C16395dk.m112155a("moment", "temp");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            Log4Android.getInstance().m81400e(e);
            fileM112155a = null;
        }
        if (fileM112155a == null) {
            return null;
        }
        File file = new File(fileM112155a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
                Log4Android.getInstance().m81400e(e2);
            }
        }
        return new File(fileM112155a, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: c0 */
    private void m142869c0() {
        if (this.f119344c == null) {
            return;
        }
        mo142549n(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m142871e0(int i, int i2) {
        if (NullChecker.m81304b(this.f119357p)) {
            this.f119357p.onError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m142872f0() {
        if (NullChecker.m81303a(this.f119357p)) {
            this.f119357p.onFirstFrameRendered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m142873g0() {
        e51.m114742G(new Runnable() { // from class: l.hr
            @Override // java.lang.Runnable
            public final void run() {
                this.f109171a.m142872f0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m142874h0(e30 e30Var, List list) {
        this.f119365x.clear();
        this.f119365x.addAll(list);
        NullChecker.m81304b(this.f119344c);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f119365x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m142875i0() {
        if (NullChecker.m81304b(this.f119357p)) {
            this.f119357p.mo137410m();
            this.f119357p.mo137411s(0.0f, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m142876j0(String str, Exception exc) {
        this.f119354m = false;
        if (NullChecker.m81303a(this.f119357p)) {
            this.f119357p.mo146799q(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m142878k0(final String str, int i, final Exception exc) {
        if (exc == null && !new File(str).exists()) {
            exc = new FileNotFoundException();
        }
        e51.m114748M(new Runnable() { // from class: l.ir
            @Override // java.lang.Runnable
            public final void run() {
                this.f114573a.m142876j0(str, exc);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    private static void m142880m0() {
        if (f119341z != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) AccountModule.f16035a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (NullChecker.m81304b(activityManager)) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        f119341z = ((memoryInfo.totalMem / 1024.0d) / 1024.0d) / 1024.0d;
    }

    /* JADX INFO: renamed from: n0 */
    private void m142881n0(tif0 tif0Var) {
        tif0 tif0VarM202510f = wb4.m202510f(this.f119345d, tif0Var, 0, 1.7777778f);
        if (tif0VarM202510f != null) {
            tif0Var = tif0VarM202510f;
        }
        if (tif0Var.m189184b() >= 1280) {
            this.f119346e.m179905U(8388608);
        } else if (tif0Var.m189184b() >= 960) {
            this.f119346e.m179905U(7340032);
        } else if (tif0Var.m189184b() >= 640) {
            this.f119346e.m179905U(6291456);
        }
        this.f119346e.m179902R(tif0Var);
    }

    /* JADX INFO: renamed from: o0 */
    private void m142882o0() {
        if (!TextUtils.isEmpty(this.f119355n)) {
            sxl sxlVar = this.f119344c;
            if (sxlVar == null) {
                return;
            }
            sxlVar.mo186445H(this.f119355n);
            return;
        }
        String strM142866a0 = m142866a0();
        this.f119355n = strM142866a0;
        if (TextUtils.isEmpty(strM142866a0)) {
            lsi0.m151595y("没有找到SD卡，无法录制视频");
        }
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo186445H(this.f119355n);
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: C */
    public void mo142539C(boolean z) {
        this.f119344c.mo189586Q(z);
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: E */
    public void mo142885E(int i, int i2, int i3, int i4) {
        if (this.f119354m) {
            return;
        }
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119354m = true;
            InterfaceC17593ip interfaceC17593ip = this.f119357p;
            mo142906r(interfaceC17593ip == null ? -1 : interfaceC17593ip.mo146796j());
            String strM142864Z = m142864Z();
            this.f119356o = strM142864Z;
            if (TextUtils.isEmpty(strM142864Z)) {
                if (NullChecker.m81303a(this.f119357p)) {
                    this.f119357p.mo146799q(null, new IllegalStateException("没有找到SD卡，无法拍照"));
                    return;
                }
                return;
            }
            final String str = this.f119356o;
            this.f119344c.mo189581G(str, i, i2, i3, i4, new rmw() { // from class: l.cr
                @Override // p149l.rmw
                /* JADX INFO: renamed from: a */
                public final void mo108309a(int i5, Exception exc) {
                    this.f82127a.m142878k0(str, i5, exc);
                }
            });
        }
        zvf0.m220396r("e_camera_take_button", "p_camera");
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: F */
    public void mo142886F() {
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo186453j();
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: H */
    public boolean mo142540H() {
        return this.f119359r;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: I */
    public boolean mo142888I(boolean z) {
        boolean z2;
        try {
            mo142906r(0);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo186454s();
        }
        if (NullChecker.m81303a(this.f119357p)) {
            long jMo146793b = this.f119357p.mo146793b();
            if (!this.f119353l || !z || jMo146793b <= 0 || jMo146793b >= 1000) {
                z2 = true;
            } else {
                this.f119357p.removeLast();
                if (NullChecker.m81303a(this.f119344c) && this.f119344c.mo186448L() > this.f119357p.getCount()) {
                    this.f119344c.removeLast();
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (NullChecker.m81303a(this.f119344c) && NullChecker.m81303a(this.f119357p) && this.f119357p.getCount() <= 0) {
            this.f119357p.mo146795e();
        }
        this.f119353l = false;
        return z2;
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: J */
    public void mo142889J(Rect rect) {
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo189594k(rect, null);
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: K */
    public rlw mo142890K() {
        m142880m0();
        if (this.f119346e == null) {
            if (this.f119350i == 0) {
                this.f119350i = xdl0.m208412y0();
                this.f119351j = xdl0.m208408w0();
            }
            int i = (!this.f119352k || this.f119363v) ? 0 : 1;
            rlw rlwVarM179885A = rlw.m179885A();
            this.f119346e = rlwVarM179885A;
            rlwVarM179885A.m179908X(new tif0(this.f119350i, this.f119351j));
            this.f119346e.m179889E(i);
            this.f119346e.m179904T(true);
            this.f119346e.m179887C(1);
            this.f119346e.m179906V(30);
            char c = xdl0.m208412y0() <= 720 ? (char) 2 : (char) 0;
            if (xdl0.m208412y0() >= 1080 && f119341z >= 5.0d) {
                c = 3;
            }
            if (c == 0) {
                m142881n0(new tif0(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720));
            } else if (c != 3) {
                m142881n0(new tif0(640, 480));
            } else {
                m142881n0(new tif0(WBConstants.SDK_NEW_PAY_VERSION, 1080));
            }
        }
        return this.f119346e;
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: L */
    public void mo142541L(float[] fArr) {
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119358q = true;
            this.f119344c.mo189582J(fArr[0]);
            this.f119344c.mo189585O(fArr[1]);
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: M */
    public void mo142542M(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f119344c.mo189607u(str2);
            return;
        }
        int size = this.f119364w.size();
        HashMap<String, String> map = this.f119364w;
        if (size == 0) {
            map.put(str, str2);
            this.f119344c.mo189607u(str2);
        } else {
            if (str2.equals(map.get(str))) {
                return;
            }
            this.f119364w.put(str, str2);
            this.f119344c.mo189607u(str2);
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: N */
    public void mo142543N(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        m142894W();
        this.f119362u = true;
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: O */
    public void mo142891O() {
        sxl sxlVar = this.f119344c;
        if (sxlVar == null || sxlVar.mo186448L() <= 0) {
            lsi0.m151580j("请录制视频");
        } else if (this.f119357p.mo146800u()) {
            this.f119344c.mo186449P(this.f119366y);
            if (NullChecker.m81304b(this.f119357p)) {
                this.f119357p.mo146798l();
            }
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: P */
    public String mo142544P(int i) {
        List<MMPresetFilter> list = this.f119365x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m81303a(mMPresetFilter)) {
            return mMPresetFilter.mFilterName;
        }
        return null;
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: Q */
    public boolean mo142545Q() {
        return this.f119362u;
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: R */
    public String mo142546R(int i) {
        List<MMPresetFilter> list = this.f119365x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m81303a(mMPresetFilter)) {
            return mMPresetFilter.mFilterId;
        }
        return null;
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: S */
    public void mo142547S(int i, int i2, boolean z, float f, float f2, float f3) {
        if (!NullChecker.m81304b(this.f119344c) || vwb.m200296J(this.f119365x) || i2 < 0 || i2 >= this.f119365x.size()) {
            return;
        }
        this.f119344c.mo189611y(this.f119365x.get(i2).lookupUrl, 0.0f);
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: T */
    public void mo142892T(Activity activity, InterfaceC18057kp interfaceC18057kp) {
        interfaceC18057kp.mo146794d().addCallback(this);
        this.f119345d = activity;
        this.f119357p = (InterfaceC17593ip) interfaceC18057kp;
        i620.m134564a(this);
    }

    @Override // p149l.nnl.InterfaceC18741f
    /* JADX INFO: renamed from: V */
    public void mo142893V(Camera camera) {
        if (camera == null) {
            lsi0.m151595y("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: renamed from: W */
    public void m142894W() {
        this.f119344c.mo189580F().mo186915B();
    }

    /* JADX INFO: renamed from: X */
    public void m142895X() {
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo189587a();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m142896Y() {
        if (this.f119344c == null) {
            sxl sxlVarM157980a = n500.m157980a();
            this.f119344c = sxlVarM157980a;
            sxlVarM157980a.mo189576B(new b());
            this.f119344c.mo189584N(false);
            this.f119344c.mo189602q(0.6f);
            this.f119344c.mo189608v(0.5f);
            this.f119344c.mo189595l(this);
            this.f119344c.mo189612z(new cmw() { // from class: l.dr
                @Override // p149l.cmw
                public final void onError(int i, int i2) {
                    this.f87553a.m142871e0(i, i2);
                }
            });
            this.f119344c.mo189579D(new fmw() { // from class: l.er
                @Override // p149l.fmw
                public final void onFirstFrameRendered() {
                    this.f92873a.m142873g0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public wlw m142897b0() {
        return new wlw.C20891b(this.f119346e).m203959i();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m142898d0() {
        return C17827jo.m142407b();
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: e */
    public boolean mo142899e() {
        sxl sxlVar = this.f119344c;
        return sxlVar != null && sxlVar.mo189591e();
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: f */
    public void mo142548f() {
        if (SystemClock.uptimeMillis() - this.f119342a > 1000) {
            sxl sxlVar = this.f119344c;
            if (NullChecker.m81304b(sxlVar)) {
                if (!mo142899e() && !this.f119352k) {
                    lsi0.m151580j("此手机不支持前置摄像头");
                    return;
                } else {
                    sxlVar.mo189592f();
                    e51.m114742G(new Runnable() { // from class: l.fr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f98867a.m142875i0();
                        }
                    });
                }
            }
            this.f119342a = SystemClock.uptimeMillis();
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: g */
    public void mo142900g() {
        if (this.f119349h) {
            m142882o0();
            if (this.f119349h) {
                this.f119344c.mo189609w(this.f119347f);
                this.f119344c.mo189593g();
                m142863U();
            }
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: h */
    public boolean mo142901h() {
        return this.f119353l;
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: i */
    public void mo142902i() {
        sxl sxlVar = this.f119344c;
        if (TextUtils.isEmpty(this.f119355n)) {
            if (NullChecker.m81303a(this.f119357p)) {
                this.f119357p.onError(-404, 0);
            }
        } else if (NullChecker.m81304b(sxlVar)) {
            sxlVar.mo186445H(this.f119355n);
            InterfaceC17593ip interfaceC17593ip = this.f119357p;
            mo142906r(interfaceC17593ip == null ? -1 : interfaceC17593ip.mo146796j());
            sxlVar.mo186452i();
            this.f119353l = true;
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: j */
    public void mo142903j() {
        if (NullChecker.m81303a(this.f119344c)) {
            if (this.f119353l) {
                this.f119344c.mo186453j();
            }
            this.f119344c.removeLast();
        }
        this.f119353l = false;
        if (NullChecker.m81303a(this.f119357p)) {
            this.f119357p.removeLast();
        }
        if (NullChecker.m81303a(this.f119344c) && NullChecker.m81303a(this.f119357p) && this.f119357p.getCount() <= 0) {
            this.f119357p.mo146795e();
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: m */
    public boolean mo142905m() {
        try {
            if (NullChecker.m81304b(this.f119344c)) {
                return this.f119344c.mo189596m();
            }
            return false;
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            return false;
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: n */
    public void mo142549n(final e30<List<MMPresetFilter>> e30Var) {
        if (this.f119365x.isEmpty() || C15686ap.m98009j().m98018o()) {
            C15686ap.m98009j().m98022s(false);
            C15686ap.m98009j().m98016m(AccountModule.f16035a, new e30() { // from class: l.gr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104002a.m142874h0(e30Var, (List) obj);
                }
            });
        } else if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f119365x);
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: o */
    public void mo142550o(String str, float f) {
        this.f119344c.setFaceBeautyValue("", 0.0f);
        this.f119344c.mo189599o(str, f);
    }

    @Override // p149l.InterfaceC18275lp
    public void onPause() {
        mo142888I(true);
        if (NullChecker.m81303a(this.f119357p)) {
            this.f119357p.mo146797k(false);
        }
        m142895X();
        m142898d0();
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: p */
    public void mo142551p(String str) {
        if (!ILightningRender.IMakeupLevel.MAKEUP_LUT.equals(str) && !ILightningRender.IMakeupLevel.MAKEUP_ALL.equals(str)) {
            this.f119344c.mo189600p(str);
            this.f119364w.remove(str);
        } else {
            this.f119364w.remove(ILightningRender.IMakeupLevel.MAKEUP_LUT);
            this.f119364w.remove(ILightningRender.IMakeupLevel.MAKEUP_ALL);
            this.f119344c.mo189605t();
        }
    }

    @Override // p149l.InterfaceC18275lp
    public boolean prepare() {
        m142896Y();
        mo142890K();
        if (dv0.m113757a() == null) {
            CrashHelper.m81296c(new Exception("AppContext.getContext() is null"));
            AccountModule.m28133J().mo60349et();
        }
        return this.f119344c.mo186450R(this.f119345d, m142897b0());
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: r */
    public void mo142906r(int i) {
        sxl sxlVar = this.f119344c;
        if (NullChecker.m81304b(sxlVar) && mo142905m()) {
            if (i != 2) {
                sxlVar.mo189604r(i);
            } else if (sxlVar.mo189596m()) {
                sxlVar.mo189604r(i);
            }
        }
    }

    @Override // p149l.InterfaceC18275lp
    public void release() {
        this.f119345d = null;
        this.f119357p = null;
        i620.m134565b(this);
    }

    @Override // p149l.InterfaceC18275lp
    public void removeLast() {
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.removeLast();
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: s */
    public boolean mo142907s() {
        return this.f119352k;
    }

    @Override // p149l.InterfaceC17833jp
    public void setFaceBeautyValue(String str, float f) {
        this.f119344c.setFaceBeautyValue(str, f);
    }

    @Override // p149l.InterfaceC17833jp
    public void setIntensity(float f) {
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo189610x(f);
        }
    }

    @Override // p149l.InterfaceC17833jp
    public boolean setState(int i) {
        boolean z = this.f119343b != i;
        this.f119343b = i;
        return z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f119347f = surfaceHolder;
        sxl sxlVar = this.f119344c;
        if (NullChecker.m81304b(sxlVar) && this.f119348g) {
            sxlVar.mo189609w(surfaceHolder);
            sxlVar.mo189597n(i2, i3);
            this.f119348g = false;
            mo142900g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f119347f = surfaceHolder;
        this.f119349h = true;
        this.f119348g = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f119347f = null;
        this.f119349h = false;
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: t */
    public void mo142552t() {
        this.f119364w.clear();
        this.f119344c.mo189605t();
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: u */
    public void mo142553u(String str) {
        this.f119344c.mo189607u(str);
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: v */
    public void mo142554v(Map<String, Float> map) {
        if (map != null) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                if (value != null && key != null) {
                    this.f119344c.setFaceBeautyValue(key, value.floatValue());
                }
            }
        }
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: w */
    public void mo142555w(float[] fArr) {
        if (mo142545Q()) {
            this.f119361t = fArr;
        }
        this.f119358q = true;
        m142904l0(true);
        sxl sxlVar = this.f119344c;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo189602q(fArr[1]);
        sxlVar.mo189608v(fArr[0]);
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: x */
    public void mo142556x(MusicContent musicContent) {
        this.f119360s = musicContent;
        if (NullChecker.m81304b(this.f119344c)) {
            this.f119344c.mo186444E(musicContent.path, musicContent.startMillTime, musicContent.endMillTime, true);
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: y */
    public void mo142908y(float f) {
        this.f119344c.mo186447K(f);
    }

    @Override // p149l.InterfaceC17833jp
    /* JADX INFO: renamed from: z */
    public MusicContent mo142557z() {
        return this.f119360s;
    }

    @Override // p149l.nnl.InterfaceC18741f
    /* JADX INFO: renamed from: G */
    public void mo142887G() {
    }

    /* JADX INFO: renamed from: l.jr$a */
    public class a implements mmw {

        /* JADX INFO: renamed from: l.jr$a$a, reason: collision with other inner class name */
        public class RunnableC22726a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f119368a;

            public RunnableC22726a(String str) {
                this.f119368a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NullChecker.m81304b(SurfaceHolderCallbackC17847jr.this.f119344c)) {
                    SurfaceHolderCallbackC17847jr.this.mo142903j();
                    if (NullChecker.m81304b(SurfaceHolderCallbackC17847jr.this.f119357p)) {
                        SurfaceHolderCallbackC17847jr.this.f119357p.mo146797k(false);
                    }
                    SurfaceHolderCallbackC17847jr.this.f119344c.mo186453j();
                }
                if (NullChecker.m81304b(SurfaceHolderCallbackC17847jr.this.f119357p)) {
                    SurfaceHolderCallbackC17847jr.this.f119357p.mo150816a(this.f119368a);
                }
            }
        }

        public a() {
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: a */
        public void mo101512a(String str) {
            e51.m114742G(new RunnableC22726a(str));
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: c */
        public void mo101514c() {
            if (!NullChecker.m81304b(SurfaceHolderCallbackC17847jr.this.f119345d) || SurfaceHolderCallbackC17847jr.this.f119345d.isFinishing()) {
                return;
            }
            File file = new File(SurfaceHolderCallbackC17847jr.this.f119355n);
            boolean z = !file.exists() || file.length() <= 0;
            if (NullChecker.m81304b(SurfaceHolderCallbackC17847jr.this.f119357p)) {
                SurfaceHolderCallbackC17847jr.this.f119357p.mo150817c(SurfaceHolderCallbackC17847jr.this.f119355n, !z);
            }
            if (z) {
                lsi0.m151595y("视频录制错误，请重试");
            }
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: b */
        public void mo101513b(int i) {
        }
    }

    @Override // p149l.InterfaceC18275lp
    /* JADX INFO: renamed from: D */
    public void mo142884D(boolean z) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m142904l0(boolean z) {
    }

    /* JADX INFO: renamed from: l.jr$b */
    public class b implements swf0.InterfaceC20050a {
        public b() {
        }

        @Override // p149l.swf0.InterfaceC20050a
        public void playStateChanged(int i, boolean z) {
        }
    }
}
