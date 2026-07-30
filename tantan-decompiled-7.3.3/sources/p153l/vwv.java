package p153l;

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
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
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

/* JADX INFO: loaded from: classes13.dex */
public class vwv implements l4m, b0m, SurfaceHolder.Callback, ypl.InterfaceC21661f {

    /* JADX INFO: renamed from: z */
    public static double f186173z;

    /* JADX INFO: renamed from: a */
    public long f186174a;

    /* JADX INFO: renamed from: c */
    public l0m f186176c;

    /* JADX INFO: renamed from: d */
    public Activity f186177d;

    /* JADX INFO: renamed from: e */
    public qow f186178e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f186179f;

    /* JADX INFO: renamed from: i */
    public int f186182i;

    /* JADX INFO: renamed from: j */
    public int f186183j;

    /* JADX INFO: renamed from: l */
    public boolean f186185l;

    /* JADX INFO: renamed from: m */
    public boolean f186186m;

    /* JADX INFO: renamed from: n */
    public String f186187n;

    /* JADX INFO: renamed from: o */
    public String f186188o;

    /* JADX INFO: renamed from: p */
    public a0m f186189p;

    /* JADX INFO: renamed from: s */
    public MusicContent f186192s;

    /* JADX INFO: renamed from: t */
    public float[] f186193t;

    /* JADX INFO: renamed from: v */
    public boolean f186195v;

    /* JADX INFO: renamed from: b */
    public int f186175b = 0;

    /* JADX INFO: renamed from: g */
    public boolean f186180g = false;

    /* JADX INFO: renamed from: h */
    public boolean f186181h = false;

    /* JADX INFO: renamed from: q */
    public boolean f186190q = true;

    /* JADX INFO: renamed from: r */
    public boolean f186191r = false;

    /* JADX INFO: renamed from: u */
    public boolean f186194u = true;

    /* JADX INFO: renamed from: w */
    public HashMap<String, String> f186196w = new HashMap<>();

    /* JADX INFO: renamed from: x */
    public List<MMPresetFilter> f186197x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public lpw f186198y = new C20947a();

    /* JADX INFO: renamed from: k */
    public boolean f186184k = er00.m122092a();

    public vwv() {
        m203804b0();
    }

    /* JADX INFO: renamed from: c0 */
    public static String m203795c0() {
        File fileM188238a;
        try {
            fileM188238a = sw5.m188238a(ReminderAction.photo, "temp");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            Log4Android.getInstance().m82583e(e);
            fileM188238a = null;
        }
        if (fileM188238a == null) {
            return null;
        }
        File file = new File(fileM188238a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                Log4Android.getInstance().m82583e(e2);
            }
        }
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File file2 = new File(fileM188238a, str + ".png_");
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(fileM188238a, str + "_" + i + ".png_");
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m203797d0() {
        File fileM188238a;
        try {
            fileM188238a = sw5.m188238a("moment", "temp");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            Log4Android.getInstance().m82583e(e);
            fileM188238a = null;
        }
        if (fileM188238a == null) {
            return null;
        }
        File file = new File(fileM188238a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                Log4Android.getInstance().m82583e(e2);
            }
        }
        return new File(fileM188238a, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: q0 */
    public static void m203801q0() {
        if (f186173z != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) FeedModule.f39700a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (NullChecker.m82487b(activityManager)) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        f186173z = ((memoryInfo.totalMem / 1024.0d) / 1024.0d) / 1024.0d;
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: A */
    public boolean mo101306A(g6x g6xVar) {
        if (NullChecker.m82486a(this.f186193t)) {
            mo101326w(this.f186193t);
        }
        return this.f186176c.mo117980A(g6xVar);
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: B */
    public void mo101307B() {
        this.f186176c.mo117986F().mo118031B();
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: C */
    public void mo101308C(boolean z) {
        this.f186176c.mo117997Q(z);
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: E */
    public void mo152791E(int i, int i2, int i3, int i4) {
        if (this.f186186m) {
            return;
        }
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186186m = true;
            a0m a0mVar = this.f186189p;
            mo152804r(a0mVar == null ? -1 : a0mVar.mo148262j());
            String strM203795c0 = m203795c0();
            this.f186188o = strM203795c0;
            if (TextUtils.isEmpty(strM203795c0)) {
                if (NullChecker.m82486a(this.f186189p)) {
                    this.f186189p.mo148265q(null, new IllegalStateException("没有找到SD卡，无法拍照"));
                    return;
                }
                return;
            }
            final String str = this.f186188o;
            this.f186176c.mo117987G(str, i, i2, i3, i4, new qpw() { // from class: l.owv
                @Override // p153l.qpw
                /* JADX INFO: renamed from: a */
                public final void mo118030a(int i5, Exception exc) {
                    this.f149576a.m203814n0(str, i5, exc);
                }
            });
        }
        i4g0.m138520r("e_camera_take_button", "p_camera");
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: F */
    public void mo152792F() {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo118008j();
        }
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: H */
    public boolean mo101309H() {
        return this.f186191r;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    @Override // p153l.l4m
    /* JADX INFO: renamed from: I */
    public boolean mo152793I(boolean z) {
        boolean z2;
        try {
            mo152804r(0);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo118020s();
        }
        if (NullChecker.m82486a(this.f186189p)) {
            long jMo148259b = this.f186189p.mo148259b();
            if (!this.f186185l || !z || jMo148259b <= 0 || jMo148259b >= 1000) {
                z2 = true;
            } else {
                m203815o0();
                this.f186189p.removeLast();
                if (NullChecker.m82486a(this.f186176c) && this.f186176c.mo117992L() > this.f186189p.getCount()) {
                    this.f186176c.removeLast();
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (NullChecker.m82486a(this.f186176c) && NullChecker.m82486a(this.f186189p) && this.f186189p.getCount() <= 0) {
            this.f186189p.mo148261e();
        }
        this.f186185l = false;
        return z2;
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: J */
    public void mo152794J(Rect rect) {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo118009k(rect, null);
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: K */
    public qow mo152795K() {
        m203801q0();
        if (this.f186178e == null) {
            if (this.f186182i == 0) {
                this.f186182i = bnl0.m105592y0();
                this.f186183j = bnl0.m105588w0();
            }
            int i = (!this.f186184k || this.f186195v) ? 0 : 1;
            qow qowVarM177325A = qow.m177325A();
            this.f186178e = qowVarM177325A;
            qowVarM177325A.m177348X(new crf0(this.f186182i, this.f186183j));
            this.f186178e.m177329E(i);
            this.f186178e.m177344T(true);
            this.f186178e.m177327C(1);
            this.f186178e.m177346V(30);
            char c = bnl0.m105592y0() <= 720 ? (char) 2 : (char) 0;
            if (bnl0.m105592y0() >= 1080 && f186173z >= 5.0d) {
                c = 3;
            }
            if (c == 0) {
                m203817r0(new crf0(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720));
            } else if (c != 3) {
                m203817r0(new crf0(640, 480));
            } else {
                m203817r0(new crf0(WBConstants.SDK_NEW_PAY_VERSION, 1080));
            }
        }
        return this.f186178e;
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: L */
    public void mo101310L(float[] fArr) {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186190q = true;
            this.f186176c.mo117990J(fArr[0]);
            this.f186176c.mo117995O(fArr[1]);
        }
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: M */
    public void mo101311M(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f186176c.mo118023u(str2);
            return;
        }
        int size = this.f186196w.size();
        HashMap<String, String> map = this.f186196w;
        if (size == 0) {
            map.put(str, str2);
            this.f186176c.mo118023u(str2);
        } else {
            if (str2.equals(map.get(str))) {
                return;
            }
            this.f186196w.put(str, str2);
            this.f186176c.mo118023u(str2);
        }
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: N */
    public void mo101312N(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        mo101307B();
        this.f186194u = true;
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: O */
    public void mo152796O() {
        l0m l0mVar = this.f186176c;
        if (l0mVar == null || l0mVar.mo117992L() <= 0) {
            o1j0.m165636j("请录制视频");
        } else if (this.f186189p.mo148266u()) {
            this.f186176c.mo117996P(this.f186198y);
            if (NullChecker.m82487b(this.f186189p)) {
                this.f186189p.mo148264l();
            }
        }
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: P */
    public String mo101313P(int i) {
        List<MMPresetFilter> list = this.f186197x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m82486a(mMPresetFilter)) {
            return mMPresetFilter.mFilterName;
        }
        return null;
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: Q */
    public boolean mo101314Q() {
        return this.f186194u;
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: R */
    public String mo101315R(int i) {
        List<MMPresetFilter> list = this.f186197x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m82486a(mMPresetFilter)) {
            return mMPresetFilter.mFilterId;
        }
        return null;
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: S */
    public void mo101316S(int i, int i2, boolean z, float f, float f2, float f3) {
        if (!NullChecker.m82487b(this.f186176c) || jyb.m147479J(this.f186197x) || i2 < 0 || i2 >= this.f186197x.size()) {
            return;
        }
        this.f186176c.mo118027y(this.f186197x.get(i2).lookupUrl, 0.0f);
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: U */
    public void mo101318U() {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo117993M();
            this.f186194u = true;
            this.f186189p.mo95405s(0.0f, 0);
        }
    }

    @Override // p153l.ypl.InterfaceC21661f
    /* JADX INFO: renamed from: V */
    public void mo117626V(Camera camera) {
        if (camera == null) {
            o1j0.m165651y("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m203802Z() {
        m203806f0();
        this.f186189p.mo95405s(0.0f, 0);
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: a */
    public void mo152797a(Activity activity, k4m k4mVar) {
        k4mVar.mo148260d().addCallback(this);
        this.f186177d = activity;
        this.f186189p = (a0m) k4mVar;
        qe20.m176220a(this);
    }

    /* JADX INFO: renamed from: a0 */
    public void m203803a0() {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo117999a();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m203804b0() {
        if (this.f186176c == null) {
            l0m l0mVarM103674a = be00.m103674a();
            this.f186176c = l0mVarM103674a;
            l0mVarM103674a.mo117981B(new C20948b());
            this.f186176c.mo117994N(false);
            this.f186176c.mo118017q(0.6f);
            this.f186176c.mo118024v(0.5f);
            this.f186176c.mo118010l(this);
            this.f186176c.mo118028z(new bpw() { // from class: l.pwv
                @Override // p153l.bpw
                public final void onError(int i, int i2) {
                    this.f154445a.m203808h0(i, i2);
                }
            });
            this.f186176c.mo117984D(new epw() { // from class: l.qwv
                @Override // p153l.epw
                public final void onFirstFrameRendered() {
                    this.f159970a.m203810j0();
                }
            });
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: e */
    public boolean mo152798e() {
        l0m l0mVar = this.f186176c;
        return l0mVar != null && l0mVar.mo118003e();
    }

    /* JADX INFO: renamed from: e0 */
    public vow m203805e0() {
        return new vow.C20896b(this.f186178e).m202180i();
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: f */
    public void mo101319f() {
        if (SystemClock.uptimeMillis() - this.f186174a > 1000) {
            l0m l0mVar = this.f186176c;
            if (NullChecker.m82487b(l0mVar)) {
                if (!mo152798e() && !this.f186184k) {
                    o1j0.m165636j("此手机不支持前置摄像头");
                    return;
                } else {
                    l0mVar.mo118004f();
                    l51.m152887G(new Runnable() { // from class: l.rwv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f165251a.m203812l0();
                        }
                    });
                }
            }
            this.f186174a = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m203806f0() {
        if (this.f186176c == null) {
            return;
        }
        mo101320n(null);
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: g */
    public void mo152799g() {
        if (this.f186181h) {
            m203818s0();
            if (this.f186181h) {
                this.f186176c.mo118025w(this.f186179f);
                this.f186176c.mo118005g();
                m203802Z();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m203807g0() {
        return reh.m181029d();
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: h */
    public boolean mo152800h() {
        return this.f186185l;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m203808h0(int i, int i2) {
        if (NullChecker.m82487b(this.f186189p)) {
            this.f186189p.onError(i, i2);
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: i */
    public void mo152801i() {
        l0m l0mVar = this.f186176c;
        if (TextUtils.isEmpty(this.f186187n)) {
            if (NullChecker.m82486a(this.f186189p)) {
                this.f186189p.onError(-404, 0);
            }
        } else if (NullChecker.m82487b(l0mVar)) {
            l0mVar.mo117988H(this.f186187n);
            a0m a0mVar = this.f186189p;
            mo152804r(a0mVar == null ? -1 : a0mVar.mo148262j());
            l0mVar.mo118007i();
            this.f186185l = true;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m203809i0() {
        if (NullChecker.m82486a(this.f186189p)) {
            this.f186189p.onFirstFrameRendered();
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: j */
    public void mo152802j() {
        if (NullChecker.m82486a(this.f186176c)) {
            if (this.f186185l) {
                this.f186176c.mo118008j();
            }
            this.f186176c.removeLast();
        }
        this.f186185l = false;
        if (NullChecker.m82486a(this.f186189p)) {
            this.f186189p.removeLast();
        }
        if (NullChecker.m82486a(this.f186176c) && NullChecker.m82486a(this.f186189p) && this.f186189p.getCount() <= 0) {
            this.f186189p.mo148261e();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m203810j0() {
        l51.m152887G(new Runnable() { // from class: l.twv
            @Override // java.lang.Runnable
            public final void run() {
                this.f176434a.m203809i0();
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m203811k0(y20 y20Var, List list) {
        this.f186197x.clear();
        this.f186197x.addAll(list);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f186197x);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m203812l0() {
        if (NullChecker.m82487b(this.f186189p)) {
            this.f186189p.mo95404m();
            this.f186189p.mo95405s(0.0f, 0);
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: m */
    public boolean mo152803m() {
        try {
            if (NullChecker.m82487b(this.f186176c)) {
                return this.f186176c.mo118011m();
            }
            return false;
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m203813m0(String str, Exception exc) {
        this.f186186m = false;
        if (NullChecker.m82486a(this.f186189p)) {
            this.f186189p.mo148265q(str, exc);
        }
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: n */
    public void mo101320n(final y20<List<MMPresetFilter>> y20Var) {
        if (this.f186197x.isEmpty() || doi.m117277j().m117286o()) {
            doi.m117277j().m117290s(false);
            doi.m117277j().m117284m(FeedModule.f39700a, new y20() { // from class: l.swv
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171012a.m203811k0(y20Var, (List) obj);
                }
            });
        } else if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f186197x);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m203814n0(final String str, int i, final Exception exc) {
        if (exc == null && !new File(str).exists()) {
            exc = new FileNotFoundException();
        }
        l51.m152893M(new Runnable() { // from class: l.uwv
            @Override // java.lang.Runnable
            public final void run() {
                this.f181322a.m203813m0(str, exc);
            }
        });
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: o */
    public void mo101321o(String str, float f) {
        this.f186176c.setFaceBeautyValue("", 0.0f);
        this.f186176c.mo118014o(str, f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m203815o0() {
        o1j0.m165636j(String.format(FeedModule.f39700a.getString(R$string.f39867a1), 1L));
    }

    @Override // p153l.l4m
    public void onPause() {
        mo152793I(true);
        if (NullChecker.m82486a(this.f186189p)) {
            this.f186189p.mo148263k(false);
        }
        m203803a0();
        m203807g0();
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: p */
    public void mo101322p(String str) {
        if (!ILightningRender.IMakeupLevel.MAKEUP_LUT.equals(str) && !ILightningRender.IMakeupLevel.MAKEUP_ALL.equals(str)) {
            this.f186176c.mo118015p(str);
            this.f186196w.remove(str);
        } else {
            this.f186196w.remove(ILightningRender.IMakeupLevel.MAKEUP_LUT);
            this.f186196w.remove(ILightningRender.IMakeupLevel.MAKEUP_ALL);
            this.f186176c.mo118021t();
        }
    }

    @Override // p153l.l4m
    public boolean prepare() {
        m203804b0();
        mo152795K();
        if (kv0.m151647a() == null) {
            CrashHelper.m82479c(new Exception("AppContext.getContext() is null"));
            uc4.m195362l();
        }
        return this.f186176c.mo117998R(this.f186177d, m203805e0());
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: r */
    public void mo152804r(int i) {
        l0m l0mVar = this.f186176c;
        if (NullChecker.m82487b(l0mVar) && mo152803m()) {
            if (i != 2) {
                l0mVar.mo118019r(i);
            } else if (l0mVar.mo118011m()) {
                l0mVar.mo118019r(i);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m203817r0(crf0 crf0Var) {
        crf0 crf0VarM200762f = vc4.m200762f(this.f186177d, crf0Var, 0, 1.7777778f);
        if (crf0VarM200762f != null) {
            crf0Var = crf0VarM200762f;
        }
        if (crf0Var.m112050b() >= 1280) {
            this.f186178e.m177345U(8388608);
        } else if (crf0Var.m112050b() >= 960) {
            this.f186178e.m177345U(7340032);
        } else if (crf0Var.m112050b() >= 640) {
            this.f186178e.m177345U(6291456);
        }
        this.f186178e.m177342R(crf0Var);
    }

    @Override // p153l.l4m
    public void release() {
        this.f186177d = null;
        this.f186189p = null;
        l0m l0mVar = this.f186176c;
        if (l0mVar != null) {
            l0mVar.release();
        }
        qe20.m176221b(this);
    }

    @Override // p153l.l4m
    public void removeLast() {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.removeLast();
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: s */
    public boolean mo152805s() {
        return this.f186184k;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m203818s0() {
        if (!TextUtils.isEmpty(this.f186187n)) {
            l0m l0mVar = this.f186176c;
            if (l0mVar == null) {
                return;
            }
            l0mVar.mo117988H(this.f186187n);
            return;
        }
        String strM203797d0 = m203797d0();
        this.f186187n = strM203797d0;
        if (TextUtils.isEmpty(strM203797d0)) {
            o1j0.m165651y("没有找到SD卡，无法录制视频");
        }
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo117988H(this.f186187n);
        }
    }

    @Override // p153l.b0m
    public void setFaceBeautyValue(String str, float f) {
        this.f186176c.setFaceBeautyValue(str, f);
    }

    @Override // p153l.b0m
    public void setIntensity(float f) {
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo118026x(f);
        }
    }

    @Override // p153l.b0m
    public boolean setState(int i) {
        boolean z = this.f186175b != i;
        this.f186175b = i;
        return z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f186179f = surfaceHolder;
        l0m l0mVar = this.f186176c;
        if (NullChecker.m82487b(l0mVar) && this.f186180g) {
            l0mVar.mo118025w(surfaceHolder);
            l0mVar.mo118012n(i2, i3);
            this.f186180g = false;
            mo152799g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f186179f = surfaceHolder;
        this.f186181h = true;
        this.f186180g = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f186179f = null;
        this.f186181h = false;
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: t */
    public void mo101323t() {
        this.f186196w.clear();
        this.f186176c.mo118021t();
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: u */
    public void mo101324u(String str) {
        this.f186176c.mo118023u(str);
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: v */
    public void mo101325v(Map<String, Float> map) {
        if (map != null) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                if (value != null && key != null) {
                    this.f186176c.setFaceBeautyValue(key, value.floatValue());
                }
            }
        }
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: w */
    public void mo101326w(float[] fArr) {
        if (mo101314Q()) {
            this.f186193t = fArr;
        }
        this.f186190q = true;
        m203816p0(true);
        l0m l0mVar = this.f186176c;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118017q(fArr[1]);
        l0mVar.mo118024v(fArr[0]);
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: x */
    public void mo101327x(MusicContent musicContent) {
        this.f186192s = musicContent;
        if (NullChecker.m82487b(this.f186176c)) {
            this.f186176c.mo117985E(musicContent.path, musicContent.startMillTime, musicContent.endMillTime, true);
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: y */
    public void mo152806y(float f) {
        this.f186176c.mo117991K(f);
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: z */
    public MusicContent mo101328z() {
        return this.f186192s;
    }

    @Override // p153l.ypl.InterfaceC21661f
    /* JADX INFO: renamed from: G */
    public void mo117612G() {
    }

    @Override // p153l.b0m
    /* JADX INFO: renamed from: T */
    public void mo101317T() {
    }

    /* JADX INFO: renamed from: l.vwv$a */
    public class C20947a implements lpw {

        /* JADX INFO: renamed from: l.vwv$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f186200a;

            public a(String str) {
                this.f186200a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NullChecker.m82487b(vwv.this.f186176c)) {
                    vwv.this.mo152802j();
                    if (NullChecker.m82487b(vwv.this.f186189p)) {
                        vwv.this.f186189p.mo148263k(false);
                    }
                    vwv.this.f186176c.mo118008j();
                }
                if (NullChecker.m82487b(vwv.this.f186189p)) {
                    vwv.this.f186189p.mo152807a(this.f186200a);
                }
            }
        }

        public C20947a() {
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: a */
        public void mo97168a(String str) {
            l51.m152887G(new a(str));
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: c */
        public void mo97170c() {
            if (!NullChecker.m82487b(vwv.this.f186177d) || vwv.this.f186177d.isFinishing()) {
                return;
            }
            File file = new File(vwv.this.f186187n);
            boolean z = !file.exists() || file.length() <= 0;
            if (NullChecker.m82487b(vwv.this.f186189p)) {
                vwv.this.f186189p.mo152808c(vwv.this.f186187n, !z);
            }
            if (z) {
                o1j0.m165651y(FeedModule.f39700a.getString(R$string.f39992s2));
            }
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: b */
        public void mo97169b(int i) {
        }
    }

    @Override // p153l.l4m
    /* JADX INFO: renamed from: D */
    public void mo152790D(boolean z) {
    }

    /* JADX INFO: renamed from: p0 */
    public void m203816p0(boolean z) {
    }

    /* JADX INFO: renamed from: l.vwv$b */
    public class C20948b implements c5g0.InterfaceC16197a {
        public C20948b() {
        }

        @Override // p153l.c5g0.InterfaceC16197a
        public void playStateChanged(int i, boolean z) {
        }
    }
}
