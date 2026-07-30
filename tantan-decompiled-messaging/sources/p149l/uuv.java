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
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
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

/* JADX INFO: loaded from: classes12.dex */
public class uuv implements s1m, ixl, SurfaceHolder.Callback, nnl.InterfaceC18741f {

    /* JADX INFO: renamed from: z */
    public static double f178430z;

    /* JADX INFO: renamed from: a */
    public long f178431a;

    /* JADX INFO: renamed from: c */
    public sxl f178433c;

    /* JADX INFO: renamed from: d */
    public Activity f178434d;

    /* JADX INFO: renamed from: e */
    public rlw f178435e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f178436f;

    /* JADX INFO: renamed from: i */
    public int f178439i;

    /* JADX INFO: renamed from: j */
    public int f178440j;

    /* JADX INFO: renamed from: l */
    public boolean f178442l;

    /* JADX INFO: renamed from: m */
    public boolean f178443m;

    /* JADX INFO: renamed from: n */
    public String f178444n;

    /* JADX INFO: renamed from: o */
    public String f178445o;

    /* JADX INFO: renamed from: p */
    public hxl f178446p;

    /* JADX INFO: renamed from: s */
    public MusicContent f178449s;

    /* JADX INFO: renamed from: t */
    public float[] f178450t;

    /* JADX INFO: renamed from: v */
    public boolean f178452v;

    /* JADX INFO: renamed from: b */
    public int f178432b = 0;

    /* JADX INFO: renamed from: g */
    public boolean f178437g = false;

    /* JADX INFO: renamed from: h */
    public boolean f178438h = false;

    /* JADX INFO: renamed from: q */
    public boolean f178447q = true;

    /* JADX INFO: renamed from: r */
    public boolean f178448r = false;

    /* JADX INFO: renamed from: u */
    public boolean f178451u = true;

    /* JADX INFO: renamed from: w */
    public HashMap<String, String> f178453w = new HashMap<>();

    /* JADX INFO: renamed from: x */
    public List<MMPresetFilter> f178454x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public mmw f178455y = new C20518a();

    /* JADX INFO: renamed from: k */
    public boolean f178441k = vi00.m198489a();

    public uuv() {
        m196021b0();
    }

    /* JADX INFO: renamed from: c0 */
    public static String m196012c0() {
        File fileM161567a;
        try {
            fileM161567a = nv5.m161567a(ReminderAction.photo, "temp");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            Log4Android.getInstance().m81400e(e);
            fileM161567a = null;
        }
        if (fileM161567a == null) {
            return null;
        }
        File file = new File(fileM161567a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
                Log4Android.getInstance().m81400e(e2);
            }
        }
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File file2 = new File(fileM161567a, str + ".png_");
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(fileM161567a, str + "_" + i + ".png_");
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m196014d0() {
        File fileM161567a;
        try {
            fileM161567a = nv5.m161567a("moment", "temp");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            Log4Android.getInstance().m81400e(e);
            fileM161567a = null;
        }
        if (fileM161567a == null) {
            return null;
        }
        File file = new File(fileM161567a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
                Log4Android.getInstance().m81400e(e2);
            }
        }
        return new File(fileM161567a, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: q0 */
    public static void m196018q0() {
        if (f178430z != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) FeedModule.f38852a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (NullChecker.m81304b(activityManager)) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        f178430z = ((memoryInfo.totalMem / 1024.0d) / 1024.0d) / 1024.0d;
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: A */
    public boolean mo138851A(h3x h3xVar) {
        if (NullChecker.m81303a(this.f178450t)) {
            mo138871w(this.f178450t);
        }
        return this.f178433c.mo189575A(h3xVar);
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: B */
    public void mo138852B() {
        this.f178433c.mo189580F().mo186915B();
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: C */
    public void mo138853C(boolean z) {
        this.f178433c.mo189586Q(z);
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: E */
    public void mo181987E(int i, int i2, int i3, int i4) {
        if (this.f178443m) {
            return;
        }
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178443m = true;
            hxl hxlVar = this.f178446p;
            mo182000r(hxlVar == null ? -1 : hxlVar.mo177482j());
            String strM196012c0 = m196012c0();
            this.f178445o = strM196012c0;
            if (TextUtils.isEmpty(strM196012c0)) {
                if (NullChecker.m81303a(this.f178446p)) {
                    this.f178446p.mo177485q(null, new IllegalStateException("没有找到SD卡，无法拍照"));
                    return;
                }
                return;
            }
            final String str = this.f178445o;
            this.f178433c.mo189581G(str, i, i2, i3, i4, new rmw() { // from class: l.nuv
                @Override // p149l.rmw
                /* JADX INFO: renamed from: a */
                public final void mo108309a(int i5, Exception exc) {
                    this.f140655a.m196031n0(str, i5, exc);
                }
            });
        }
        zvf0.m220396r("e_camera_take_button", "p_camera");
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: F */
    public void mo181988F() {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo186453j();
        }
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: H */
    public boolean mo138854H() {
        return this.f178448r;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    @Override // p149l.s1m
    /* JADX INFO: renamed from: I */
    public boolean mo181989I(boolean z) {
        boolean z2;
        try {
            mo182000r(0);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo186454s();
        }
        if (NullChecker.m81303a(this.f178446p)) {
            long jMo177479b = this.f178446p.mo177479b();
            if (!this.f178442l || !z || jMo177479b <= 0 || jMo177479b >= 1000) {
                z2 = true;
            } else {
                m196032o0();
                this.f178446p.removeLast();
                if (NullChecker.m81303a(this.f178433c) && this.f178433c.mo186448L() > this.f178446p.getCount()) {
                    this.f178433c.removeLast();
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (NullChecker.m81303a(this.f178433c) && NullChecker.m81303a(this.f178446p) && this.f178446p.getCount() <= 0) {
            this.f178446p.mo177481e();
        }
        this.f178442l = false;
        return z2;
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: J */
    public void mo181990J(Rect rect) {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo189594k(rect, null);
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: K */
    public rlw mo181991K() {
        m196018q0();
        if (this.f178435e == null) {
            if (this.f178439i == 0) {
                this.f178439i = xdl0.m208412y0();
                this.f178440j = xdl0.m208408w0();
            }
            int i = (!this.f178441k || this.f178452v) ? 0 : 1;
            rlw rlwVarM179885A = rlw.m179885A();
            this.f178435e = rlwVarM179885A;
            rlwVarM179885A.m179908X(new tif0(this.f178439i, this.f178440j));
            this.f178435e.m179889E(i);
            this.f178435e.m179904T(true);
            this.f178435e.m179887C(1);
            this.f178435e.m179906V(30);
            char c = xdl0.m208412y0() <= 720 ? (char) 2 : (char) 0;
            if (xdl0.m208412y0() >= 1080 && f178430z >= 5.0d) {
                c = 3;
            }
            if (c == 0) {
                m196034r0(new tif0(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720));
            } else if (c != 3) {
                m196034r0(new tif0(640, 480));
            } else {
                m196034r0(new tif0(WBConstants.SDK_NEW_PAY_VERSION, 1080));
            }
        }
        return this.f178435e;
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: L */
    public void mo138855L(float[] fArr) {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178447q = true;
            this.f178433c.mo189582J(fArr[0]);
            this.f178433c.mo189585O(fArr[1]);
        }
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: M */
    public void mo138856M(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f178433c.mo189607u(str2);
            return;
        }
        int size = this.f178453w.size();
        HashMap<String, String> map = this.f178453w;
        if (size == 0) {
            map.put(str, str2);
            this.f178433c.mo189607u(str2);
        } else {
            if (str2.equals(map.get(str))) {
                return;
            }
            this.f178453w.put(str, str2);
            this.f178433c.mo189607u(str2);
        }
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: N */
    public void mo138857N(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        mo138852B();
        this.f178451u = true;
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: O */
    public void mo181992O() {
        sxl sxlVar = this.f178433c;
        if (sxlVar == null || sxlVar.mo186448L() <= 0) {
            lsi0.m151580j("请录制视频");
        } else if (this.f178446p.mo177486u()) {
            this.f178433c.mo186449P(this.f178455y);
            if (NullChecker.m81304b(this.f178446p)) {
                this.f178446p.mo177484l();
            }
        }
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: P */
    public String mo138858P(int i) {
        List<MMPresetFilter> list = this.f178454x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m81303a(mMPresetFilter)) {
            return mMPresetFilter.mFilterName;
        }
        return null;
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: Q */
    public boolean mo138859Q() {
        return this.f178451u;
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: R */
    public String mo138860R(int i) {
        List<MMPresetFilter> list = this.f178454x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m81303a(mMPresetFilter)) {
            return mMPresetFilter.mFilterId;
        }
        return null;
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: S */
    public void mo138861S(int i, int i2, boolean z, float f, float f2, float f3) {
        if (!NullChecker.m81304b(this.f178433c) || vwb.m200296J(this.f178454x) || i2 < 0 || i2 >= this.f178454x.size()) {
            return;
        }
        this.f178433c.mo189611y(this.f178454x.get(i2).lookupUrl, 0.0f);
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: U */
    public void mo138863U() {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo189583M();
            this.f178451u = true;
            this.f178446p.mo133345s(0.0f, 0);
        }
    }

    @Override // p149l.nnl.InterfaceC18741f
    /* JADX INFO: renamed from: V */
    public void mo142893V(Camera camera) {
        if (camera == null) {
            lsi0.m151595y("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m196019Z() {
        m196023f0();
        this.f178446p.mo133345s(0.0f, 0);
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: a */
    public void mo181993a(Activity activity, r1m r1mVar) {
        r1mVar.mo177480d().addCallback(this);
        this.f178434d = activity;
        this.f178446p = (hxl) r1mVar;
        i620.m134564a(this);
    }

    /* JADX INFO: renamed from: a0 */
    public void m196020a0() {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo189587a();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m196021b0() {
        if (this.f178433c == null) {
            sxl sxlVarM157980a = n500.m157980a();
            this.f178433c = sxlVarM157980a;
            sxlVarM157980a.mo189576B(new C20519b());
            this.f178433c.mo189584N(false);
            this.f178433c.mo189602q(0.6f);
            this.f178433c.mo189608v(0.5f);
            this.f178433c.mo189595l(this);
            this.f178433c.mo189612z(new cmw() { // from class: l.ouv
                @Override // p149l.cmw
                public final void onError(int i, int i2) {
                    this.f145741a.m196025h0(i, i2);
                }
            });
            this.f178433c.mo189579D(new fmw() { // from class: l.puv
                @Override // p149l.fmw
                public final void onFirstFrameRendered() {
                    this.f151362a.m196027j0();
                }
            });
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: e */
    public boolean mo181994e() {
        sxl sxlVar = this.f178433c;
        return sxlVar != null && sxlVar.mo189591e();
    }

    /* JADX INFO: renamed from: e0 */
    public wlw m196022e0() {
        return new wlw.C20891b(this.f178435e).m203959i();
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: f */
    public void mo138864f() {
        if (SystemClock.uptimeMillis() - this.f178431a > 1000) {
            sxl sxlVar = this.f178433c;
            if (NullChecker.m81304b(sxlVar)) {
                if (!mo181994e() && !this.f178441k) {
                    lsi0.m151580j("此手机不支持前置摄像头");
                    return;
                } else {
                    sxlVar.mo189592f();
                    e51.m114742G(new Runnable() { // from class: l.quv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f156547a.m196029l0();
                        }
                    });
                }
            }
            this.f178431a = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m196023f0() {
        if (this.f178433c == null) {
            return;
        }
        mo138865n(null);
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: g */
    public void mo181995g() {
        if (this.f178438h) {
            m196035s0();
            if (this.f178438h) {
                this.f178433c.mo189609w(this.f178436f);
                this.f178433c.mo189593g();
                m196019Z();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m196024g0() {
        return cdh.m106231d();
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: h */
    public boolean mo181996h() {
        return this.f178442l;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m196025h0(int i, int i2) {
        if (NullChecker.m81304b(this.f178446p)) {
            this.f178446p.onError(i, i2);
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: i */
    public void mo181997i() {
        sxl sxlVar = this.f178433c;
        if (TextUtils.isEmpty(this.f178444n)) {
            if (NullChecker.m81303a(this.f178446p)) {
                this.f178446p.onError(-404, 0);
            }
        } else if (NullChecker.m81304b(sxlVar)) {
            sxlVar.mo186445H(this.f178444n);
            hxl hxlVar = this.f178446p;
            mo182000r(hxlVar == null ? -1 : hxlVar.mo177482j());
            sxlVar.mo186452i();
            this.f178442l = true;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m196026i0() {
        if (NullChecker.m81303a(this.f178446p)) {
            this.f178446p.onFirstFrameRendered();
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: j */
    public void mo181998j() {
        if (NullChecker.m81303a(this.f178433c)) {
            if (this.f178442l) {
                this.f178433c.mo186453j();
            }
            this.f178433c.removeLast();
        }
        this.f178442l = false;
        if (NullChecker.m81303a(this.f178446p)) {
            this.f178446p.removeLast();
        }
        if (NullChecker.m81303a(this.f178433c) && NullChecker.m81303a(this.f178446p) && this.f178446p.getCount() <= 0) {
            this.f178446p.mo177481e();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m196027j0() {
        e51.m114742G(new Runnable() { // from class: l.suv
            @Override // java.lang.Runnable
            public final void run() {
                this.f166503a.m196026i0();
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m196028k0(e30 e30Var, List list) {
        this.f178454x.clear();
        this.f178454x.addAll(list);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f178454x);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m196029l0() {
        if (NullChecker.m81304b(this.f178446p)) {
            this.f178446p.mo133344m();
            this.f178446p.mo133345s(0.0f, 0);
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: m */
    public boolean mo181999m() {
        try {
            if (NullChecker.m81304b(this.f178433c)) {
                return this.f178433c.mo189596m();
            }
            return false;
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m196030m0(String str, Exception exc) {
        this.f178443m = false;
        if (NullChecker.m81303a(this.f178446p)) {
            this.f178446p.mo177485q(str, exc);
        }
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: n */
    public void mo138865n(final e30<List<MMPresetFilter>> e30Var) {
        if (this.f178454x.isEmpty() || hli.m131661j().m131670o()) {
            hli.m131661j().m131674s(false);
            hli.m131661j().m131668m(FeedModule.f38852a, new e30() { // from class: l.ruv
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f161143a.m196028k0(e30Var, (List) obj);
                }
            });
        } else if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f178454x);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m196031n0(final String str, int i, final Exception exc) {
        if (exc == null && !new File(str).exists()) {
            exc = new FileNotFoundException();
        }
        e51.m114748M(new Runnable() { // from class: l.tuv
            @Override // java.lang.Runnable
            public final void run() {
                this.f172222a.m196030m0(str, exc);
            }
        });
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: o */
    public void mo138866o(String str, float f) {
        this.f178433c.setFaceBeautyValue("", 0.0f);
        this.f178433c.mo189599o(str, f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m196032o0() {
        lsi0.m151580j(String.format(FeedModule.f38852a.getString(R$string.f39019a1), 1L));
    }

    @Override // p149l.s1m
    public void onPause() {
        mo181989I(true);
        if (NullChecker.m81303a(this.f178446p)) {
            this.f178446p.mo177483k(false);
        }
        m196020a0();
        m196024g0();
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: p */
    public void mo138867p(String str) {
        if (!ILightningRender.IMakeupLevel.MAKEUP_LUT.equals(str) && !ILightningRender.IMakeupLevel.MAKEUP_ALL.equals(str)) {
            this.f178433c.mo189600p(str);
            this.f178453w.remove(str);
        } else {
            this.f178453w.remove(ILightningRender.IMakeupLevel.MAKEUP_LUT);
            this.f178453w.remove(ILightningRender.IMakeupLevel.MAKEUP_ALL);
            this.f178433c.mo189605t();
        }
    }

    @Override // p149l.s1m
    public boolean prepare() {
        m196021b0();
        mo181991K();
        if (dv0.m113757a() == null) {
            CrashHelper.m81296c(new Exception("AppContext.getContext() is null"));
            vb4.m197678l();
        }
        return this.f178433c.mo186450R(this.f178434d, m196022e0());
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: r */
    public void mo182000r(int i) {
        sxl sxlVar = this.f178433c;
        if (NullChecker.m81304b(sxlVar) && mo181999m()) {
            if (i != 2) {
                sxlVar.mo189604r(i);
            } else if (sxlVar.mo189596m()) {
                sxlVar.mo189604r(i);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m196034r0(tif0 tif0Var) {
        tif0 tif0VarM202510f = wb4.m202510f(this.f178434d, tif0Var, 0, 1.7777778f);
        if (tif0VarM202510f != null) {
            tif0Var = tif0VarM202510f;
        }
        if (tif0Var.m189184b() >= 1280) {
            this.f178435e.m179905U(8388608);
        } else if (tif0Var.m189184b() >= 960) {
            this.f178435e.m179905U(7340032);
        } else if (tif0Var.m189184b() >= 640) {
            this.f178435e.m179905U(6291456);
        }
        this.f178435e.m179902R(tif0Var);
    }

    @Override // p149l.s1m
    public void release() {
        this.f178434d = null;
        this.f178446p = null;
        sxl sxlVar = this.f178433c;
        if (sxlVar != null) {
            sxlVar.release();
        }
        i620.m134565b(this);
    }

    @Override // p149l.s1m
    public void removeLast() {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.removeLast();
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: s */
    public boolean mo182001s() {
        return this.f178441k;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m196035s0() {
        if (!TextUtils.isEmpty(this.f178444n)) {
            sxl sxlVar = this.f178433c;
            if (sxlVar == null) {
                return;
            }
            sxlVar.mo186445H(this.f178444n);
            return;
        }
        String strM196014d0 = m196014d0();
        this.f178444n = strM196014d0;
        if (TextUtils.isEmpty(strM196014d0)) {
            lsi0.m151595y("没有找到SD卡，无法录制视频");
        }
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo186445H(this.f178444n);
        }
    }

    @Override // p149l.ixl
    public void setFaceBeautyValue(String str, float f) {
        this.f178433c.setFaceBeautyValue(str, f);
    }

    @Override // p149l.ixl
    public void setIntensity(float f) {
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo189610x(f);
        }
    }

    @Override // p149l.ixl
    public boolean setState(int i) {
        boolean z = this.f178432b != i;
        this.f178432b = i;
        return z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f178436f = surfaceHolder;
        sxl sxlVar = this.f178433c;
        if (NullChecker.m81304b(sxlVar) && this.f178437g) {
            sxlVar.mo189609w(surfaceHolder);
            sxlVar.mo189597n(i2, i3);
            this.f178437g = false;
            mo181995g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f178436f = surfaceHolder;
        this.f178438h = true;
        this.f178437g = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f178436f = null;
        this.f178438h = false;
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: t */
    public void mo138868t() {
        this.f178453w.clear();
        this.f178433c.mo189605t();
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: u */
    public void mo138869u(String str) {
        this.f178433c.mo189607u(str);
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: v */
    public void mo138870v(Map<String, Float> map) {
        if (map != null) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                if (value != null && key != null) {
                    this.f178433c.setFaceBeautyValue(key, value.floatValue());
                }
            }
        }
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: w */
    public void mo138871w(float[] fArr) {
        if (mo138859Q()) {
            this.f178450t = fArr;
        }
        this.f178447q = true;
        m196033p0(true);
        sxl sxlVar = this.f178433c;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo189602q(fArr[1]);
        sxlVar.mo189608v(fArr[0]);
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: x */
    public void mo138872x(MusicContent musicContent) {
        this.f178449s = musicContent;
        if (NullChecker.m81304b(this.f178433c)) {
            this.f178433c.mo186444E(musicContent.path, musicContent.startMillTime, musicContent.endMillTime, true);
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: y */
    public void mo182002y(float f) {
        this.f178433c.mo186447K(f);
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: z */
    public MusicContent mo138873z() {
        return this.f178449s;
    }

    @Override // p149l.nnl.InterfaceC18741f
    /* JADX INFO: renamed from: G */
    public void mo142887G() {
    }

    @Override // p149l.ixl
    /* JADX INFO: renamed from: T */
    public void mo138862T() {
    }

    /* JADX INFO: renamed from: l.uuv$a */
    public class C20518a implements mmw {

        /* JADX INFO: renamed from: l.uuv$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f178457a;

            public a(String str) {
                this.f178457a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NullChecker.m81304b(uuv.this.f178433c)) {
                    uuv.this.mo181998j();
                    if (NullChecker.m81304b(uuv.this.f178446p)) {
                        uuv.this.f178446p.mo177483k(false);
                    }
                    uuv.this.f178433c.mo186453j();
                }
                if (NullChecker.m81304b(uuv.this.f178446p)) {
                    uuv.this.f178446p.mo182003a(this.f178457a);
                }
            }
        }

        public C20518a() {
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: a */
        public void mo101512a(String str) {
            e51.m114742G(new a(str));
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: c */
        public void mo101514c() {
            if (!NullChecker.m81304b(uuv.this.f178434d) || uuv.this.f178434d.isFinishing()) {
                return;
            }
            File file = new File(uuv.this.f178444n);
            boolean z = !file.exists() || file.length() <= 0;
            if (NullChecker.m81304b(uuv.this.f178446p)) {
                uuv.this.f178446p.mo182004c(uuv.this.f178444n, !z);
            }
            if (z) {
                lsi0.m151595y(FeedModule.f38852a.getString(R$string.f39144s2));
            }
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: b */
        public void mo101513b(int i) {
        }
    }

    @Override // p149l.s1m
    /* JADX INFO: renamed from: D */
    public void mo181986D(boolean z) {
    }

    /* JADX INFO: renamed from: p0 */
    public void m196033p0(boolean z) {
    }

    /* JADX INFO: renamed from: l.uuv$b */
    public class C20519b implements swf0.InterfaceC20050a {
        public C20519b() {
        }

        @Override // p149l.swf0.InterfaceC20050a
        public void playStateChanged(int i, boolean z) {
        }
    }
}
