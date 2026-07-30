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
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.core.data.ReminderAction;
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

/* JADX INFO: renamed from: l.dr */
/* JADX INFO: loaded from: classes9.dex */
public class SurfaceHolderCallbackC16606dr implements InterfaceC17269gp, InterfaceC16801ep, SurfaceHolder.Callback, ypl.InterfaceC21661f {

    /* JADX INFO: renamed from: z */
    public static double f90301z;

    /* JADX INFO: renamed from: a */
    public long f90302a;

    /* JADX INFO: renamed from: c */
    public l0m f90304c;

    /* JADX INFO: renamed from: d */
    public Activity f90305d;

    /* JADX INFO: renamed from: e */
    public qow f90306e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f90307f;

    /* JADX INFO: renamed from: i */
    public int f90310i;

    /* JADX INFO: renamed from: j */
    public int f90311j;

    /* JADX INFO: renamed from: l */
    public boolean f90313l;

    /* JADX INFO: renamed from: m */
    public boolean f90314m;

    /* JADX INFO: renamed from: n */
    public String f90315n;

    /* JADX INFO: renamed from: o */
    public String f90316o;

    /* JADX INFO: renamed from: p */
    public InterfaceC16595dp f90317p;

    /* JADX INFO: renamed from: s */
    public MusicContent f90320s;

    /* JADX INFO: renamed from: t */
    public float[] f90321t;

    /* JADX INFO: renamed from: v */
    public boolean f90323v;

    /* JADX INFO: renamed from: b */
    public int f90303b = 0;

    /* JADX INFO: renamed from: g */
    public boolean f90308g = false;

    /* JADX INFO: renamed from: h */
    public boolean f90309h = false;

    /* JADX INFO: renamed from: q */
    public boolean f90318q = true;

    /* JADX INFO: renamed from: r */
    public boolean f90319r = false;

    /* JADX INFO: renamed from: u */
    public boolean f90322u = true;

    /* JADX INFO: renamed from: w */
    public HashMap<String, String> f90324w = new HashMap<>();

    /* JADX INFO: renamed from: x */
    public List<MMPresetFilter> f90325x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public lpw f90326y = new a();

    /* JADX INFO: renamed from: k */
    public boolean f90312k = C17578hu.m137104a();

    public SurfaceHolderCallbackC16606dr() {
        m117629Y();
    }

    /* JADX INFO: renamed from: U */
    private void m117587U() {
        m117593c0();
        this.f90317p.mo117369s(0.0f, 0);
    }

    /* JADX INFO: renamed from: Z */
    public static String m117588Z() {
        File fileM216354a;
        try {
            fileM216354a = C21612yj.m216354a(ReminderAction.photo, "temp");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            Log4Android.getInstance().m82583e(e);
            fileM216354a = null;
        }
        if (fileM216354a == null) {
            return null;
        }
        File file = new File(fileM216354a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                Log4Android.getInstance().m82583e(e2);
            }
        }
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        File file2 = new File(fileM216354a, str + ".png_");
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(fileM216354a, str + "_" + i + ".png_");
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: a0 */
    public static String m117590a0() {
        File fileM216354a;
        try {
            fileM216354a = C21612yj.m216354a("moment", "temp");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            Log4Android.getInstance().m82583e(e);
            fileM216354a = null;
        }
        if (fileM216354a == null) {
            return null;
        }
        File file = new File(fileM216354a, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                Log4Android.getInstance().m82583e(e2);
            }
        }
        return new File(fileM216354a, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: c0 */
    private void m117593c0() {
        if (this.f90304c == null) {
            return;
        }
        mo117640n(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m117595e0(int i, int i2) {
        if (NullChecker.m82487b(this.f90317p)) {
            this.f90317p.onError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m117596f0() {
        if (NullChecker.m82486a(this.f90317p)) {
            this.f90317p.onFirstFrameRendered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m117597g0() {
        l51.m152887G(new Runnable() { // from class: l.br
            @Override // java.lang.Runnable
            public final void run() {
                this.f77967a.m117596f0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m117598h0(y20 y20Var, List list) {
        this.f90325x.clear();
        this.f90325x.addAll(list);
        NullChecker.m82487b(this.f90304c);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f90325x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m117599i0() {
        if (NullChecker.m82487b(this.f90317p)) {
            this.f90317p.mo117368m();
            this.f90317p.mo117369s(0.0f, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m117600j0(String str, Exception exc) {
        this.f90314m = false;
        if (NullChecker.m82486a(this.f90317p)) {
            this.f90317p.mo126512q(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m117602k0(final String str, int i, final Exception exc) {
        if (exc == null && !new File(str).exists()) {
            exc = new FileNotFoundException();
        }
        l51.m152893M(new Runnable() { // from class: l.cr
            @Override // java.lang.Runnable
            public final void run() {
                this.f83264a.m117600j0(str, exc);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    private static void m117604m0() {
        if (f90301z != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) AccountModule.f16754a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (NullChecker.m82487b(activityManager)) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        f90301z = ((memoryInfo.totalMem / 1024.0d) / 1024.0d) / 1024.0d;
    }

    /* JADX INFO: renamed from: n0 */
    private void m117605n0(crf0 crf0Var) {
        crf0 crf0VarM200762f = vc4.m200762f(this.f90305d, crf0Var, 0, 1.7777778f);
        if (crf0VarM200762f != null) {
            crf0Var = crf0VarM200762f;
        }
        if (crf0Var.m112050b() >= 1280) {
            this.f90306e.m177345U(8388608);
        } else if (crf0Var.m112050b() >= 960) {
            this.f90306e.m177345U(7340032);
        } else if (crf0Var.m112050b() >= 640) {
            this.f90306e.m177345U(6291456);
        }
        this.f90306e.m177342R(crf0Var);
    }

    /* JADX INFO: renamed from: o0 */
    private void m117606o0() {
        if (!TextUtils.isEmpty(this.f90315n)) {
            l0m l0mVar = this.f90304c;
            if (l0mVar == null) {
                return;
            }
            l0mVar.mo117988H(this.f90315n);
            return;
        }
        String strM117590a0 = m117590a0();
        this.f90315n = strM117590a0;
        if (TextUtils.isEmpty(strM117590a0)) {
            o1j0.m165651y("没有找到SD卡，无法录制视频");
        }
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo117988H(this.f90315n);
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: C */
    public void mo117608C(boolean z) {
        this.f90304c.mo117997Q(z);
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: E */
    public void mo117610E(int i, int i2, int i3, int i4) {
        if (this.f90314m) {
            return;
        }
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90314m = true;
            InterfaceC16595dp interfaceC16595dp = this.f90317p;
            mo117643r(interfaceC16595dp == null ? -1 : interfaceC16595dp.mo126509j());
            String strM117588Z = m117588Z();
            this.f90316o = strM117588Z;
            if (TextUtils.isEmpty(strM117588Z)) {
                if (NullChecker.m82486a(this.f90317p)) {
                    this.f90317p.mo126512q(null, new IllegalStateException("没有找到SD卡，无法拍照"));
                    return;
                }
                return;
            }
            final String str = this.f90316o;
            this.f90304c.mo117987G(str, i, i2, i3, i4, new qpw() { // from class: l.wq
                @Override // p153l.qpw
                /* JADX INFO: renamed from: a */
                public final void mo118030a(int i5, Exception exc) {
                    this.f190375a.m117602k0(str, i5, exc);
                }
            });
        }
        i4g0.m138520r("e_camera_take_button", "p_camera");
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: F */
    public void mo117611F() {
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo118008j();
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: H */
    public boolean mo117613H() {
        return this.f90319r;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: I */
    public boolean mo117614I(boolean z) {
        boolean z2;
        try {
            mo117643r(0);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo118020s();
        }
        if (NullChecker.m82486a(this.f90317p)) {
            long jMo126506b = this.f90317p.mo126506b();
            if (!this.f90313l || !z || jMo126506b <= 0 || jMo126506b >= 1000) {
                z2 = true;
            } else {
                this.f90317p.removeLast();
                if (NullChecker.m82486a(this.f90304c) && this.f90304c.mo117992L() > this.f90317p.getCount()) {
                    this.f90304c.removeLast();
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (NullChecker.m82486a(this.f90304c) && NullChecker.m82486a(this.f90317p) && this.f90317p.getCount() <= 0) {
            this.f90317p.mo126508e();
        }
        this.f90313l = false;
        return z2;
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: J */
    public void mo117615J(Rect rect) {
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo118009k(rect, null);
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: K */
    public qow mo117616K() {
        m117604m0();
        if (this.f90306e == null) {
            if (this.f90310i == 0) {
                this.f90310i = bnl0.m105592y0();
                this.f90311j = bnl0.m105588w0();
            }
            int i = (!this.f90312k || this.f90323v) ? 0 : 1;
            qow qowVarM177325A = qow.m177325A();
            this.f90306e = qowVarM177325A;
            qowVarM177325A.m177348X(new crf0(this.f90310i, this.f90311j));
            this.f90306e.m177329E(i);
            this.f90306e.m177344T(true);
            this.f90306e.m177327C(1);
            this.f90306e.m177346V(30);
            char c = bnl0.m105592y0() <= 720 ? (char) 2 : (char) 0;
            if (bnl0.m105592y0() >= 1080 && f90301z >= 5.0d) {
                c = 3;
            }
            if (c == 0) {
                m117605n0(new crf0(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720));
            } else if (c != 3) {
                m117605n0(new crf0(640, 480));
            } else {
                m117605n0(new crf0(WBConstants.SDK_NEW_PAY_VERSION, 1080));
            }
        }
        return this.f90306e;
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: L */
    public void mo117617L(float[] fArr) {
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90318q = true;
            this.f90304c.mo117990J(fArr[0]);
            this.f90304c.mo117995O(fArr[1]);
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: M */
    public void mo117618M(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f90304c.mo118023u(str2);
            return;
        }
        int size = this.f90324w.size();
        HashMap<String, String> map = this.f90324w;
        if (size == 0) {
            map.put(str, str2);
            this.f90304c.mo118023u(str2);
        } else {
            if (str2.equals(map.get(str))) {
                return;
            }
            this.f90324w.put(str, str2);
            this.f90304c.mo118023u(str2);
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: N */
    public void mo117619N(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        m117627W();
        this.f90322u = true;
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: O */
    public void mo117620O() {
        l0m l0mVar = this.f90304c;
        if (l0mVar == null || l0mVar.mo117992L() <= 0) {
            o1j0.m165636j("请录制视频");
        } else if (this.f90317p.mo126513u()) {
            this.f90304c.mo117996P(this.f90326y);
            if (NullChecker.m82487b(this.f90317p)) {
                this.f90317p.mo126511l();
            }
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: P */
    public String mo117621P(int i) {
        List<MMPresetFilter> list = this.f90325x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m82486a(mMPresetFilter)) {
            return mMPresetFilter.mFilterName;
        }
        return null;
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: Q */
    public boolean mo117622Q() {
        return this.f90322u;
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: R */
    public String mo117623R(int i) {
        List<MMPresetFilter> list = this.f90325x;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        MMPresetFilter mMPresetFilter = list.get(i);
        if (NullChecker.m82486a(mMPresetFilter)) {
            return mMPresetFilter.mFilterId;
        }
        return null;
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: S */
    public void mo117624S(int i, int i2, boolean z, float f, float f2, float f3) {
        if (!NullChecker.m82487b(this.f90304c) || jyb.m147479J(this.f90325x) || i2 < 0 || i2 >= this.f90325x.size()) {
            return;
        }
        this.f90304c.mo118027y(this.f90325x.get(i2).lookupUrl, 0.0f);
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: T */
    public void mo117625T(Activity activity, InterfaceC17026fp interfaceC17026fp) {
        interfaceC17026fp.mo126507d().addCallback(this);
        this.f90305d = activity;
        this.f90317p = (InterfaceC16595dp) interfaceC17026fp;
        qe20.m176220a(this);
    }

    @Override // p153l.ypl.InterfaceC21661f
    /* JADX INFO: renamed from: V */
    public void mo117626V(Camera camera) {
        if (camera == null) {
            o1j0.m165651y("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: renamed from: W */
    public void m117627W() {
        this.f90304c.mo117986F().mo118031B();
    }

    /* JADX INFO: renamed from: X */
    public void m117628X() {
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo117999a();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m117629Y() {
        if (this.f90304c == null) {
            l0m l0mVarM103674a = be00.m103674a();
            this.f90304c = l0mVarM103674a;
            l0mVarM103674a.mo117981B(new b());
            this.f90304c.mo117994N(false);
            this.f90304c.mo118017q(0.6f);
            this.f90304c.mo118024v(0.5f);
            this.f90304c.mo118010l(this);
            this.f90304c.mo118028z(new bpw() { // from class: l.xq
                @Override // p153l.bpw
                public final void onError(int i, int i2) {
                    this.f195764a.m117595e0(i, i2);
                }
            });
            this.f90304c.mo117984D(new epw() { // from class: l.yq
                @Override // p153l.epw
                public final void onFirstFrameRendered() {
                    this.f201146a.m117597g0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public vow m117630b0() {
        return new vow.C20896b(this.f90306e).m202180i();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m117631d0() {
        return C16800eo.m121690b();
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: e */
    public boolean mo117632e() {
        l0m l0mVar = this.f90304c;
        return l0mVar != null && l0mVar.mo118003e();
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: f */
    public void mo117633f() {
        if (SystemClock.uptimeMillis() - this.f90302a > 1000) {
            l0m l0mVar = this.f90304c;
            if (NullChecker.m82487b(l0mVar)) {
                if (!mo117632e() && !this.f90312k) {
                    o1j0.m165636j("此手机不支持前置摄像头");
                    return;
                } else {
                    l0mVar.mo118004f();
                    l51.m152887G(new Runnable() { // from class: l.zq
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f205551a.m117599i0();
                        }
                    });
                }
            }
            this.f90302a = SystemClock.uptimeMillis();
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: g */
    public void mo117634g() {
        if (this.f90309h) {
            m117606o0();
            if (this.f90309h) {
                this.f90304c.mo118025w(this.f90307f);
                this.f90304c.mo118005g();
                m117587U();
            }
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: h */
    public boolean mo117635h() {
        return this.f90313l;
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: i */
    public void mo117636i() {
        l0m l0mVar = this.f90304c;
        if (TextUtils.isEmpty(this.f90315n)) {
            if (NullChecker.m82486a(this.f90317p)) {
                this.f90317p.onError(-404, 0);
            }
        } else if (NullChecker.m82487b(l0mVar)) {
            l0mVar.mo117988H(this.f90315n);
            InterfaceC16595dp interfaceC16595dp = this.f90317p;
            mo117643r(interfaceC16595dp == null ? -1 : interfaceC16595dp.mo126509j());
            l0mVar.mo118007i();
            this.f90313l = true;
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: j */
    public void mo117637j() {
        if (NullChecker.m82486a(this.f90304c)) {
            if (this.f90313l) {
                this.f90304c.mo118008j();
            }
            this.f90304c.removeLast();
        }
        this.f90313l = false;
        if (NullChecker.m82486a(this.f90317p)) {
            this.f90317p.removeLast();
        }
        if (NullChecker.m82486a(this.f90304c) && NullChecker.m82486a(this.f90317p) && this.f90317p.getCount() <= 0) {
            this.f90317p.mo126508e();
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: m */
    public boolean mo117639m() {
        try {
            if (NullChecker.m82487b(this.f90304c)) {
                return this.f90304c.mo118011m();
            }
            return false;
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            return false;
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: n */
    public void mo117640n(final y20<List<MMPresetFilter>> y20Var) {
        if (this.f90325x.isEmpty() || C20870vo.m202031j().m202040o()) {
            C20870vo.m202031j().m202044s(false);
            C20870vo.m202031j().m202038m(AccountModule.f16754a, new y20() { // from class: l.ar
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72887a.m117598h0(y20Var, (List) obj);
                }
            });
        } else if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f90325x);
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: o */
    public void mo117641o(String str, float f) {
        this.f90304c.setFaceBeautyValue("", 0.0f);
        this.f90304c.mo118014o(str, f);
    }

    @Override // p153l.InterfaceC17269gp
    public void onPause() {
        mo117614I(true);
        if (NullChecker.m82486a(this.f90317p)) {
            this.f90317p.mo126510k(false);
        }
        m117628X();
        m117631d0();
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: p */
    public void mo117642p(String str) {
        if (!ILightningRender.IMakeupLevel.MAKEUP_LUT.equals(str) && !ILightningRender.IMakeupLevel.MAKEUP_ALL.equals(str)) {
            this.f90304c.mo118015p(str);
            this.f90324w.remove(str);
        } else {
            this.f90324w.remove(ILightningRender.IMakeupLevel.MAKEUP_LUT);
            this.f90324w.remove(ILightningRender.IMakeupLevel.MAKEUP_ALL);
            this.f90304c.mo118021t();
        }
    }

    @Override // p153l.InterfaceC17269gp
    public boolean prepare() {
        m117629Y();
        mo117616K();
        if (kv0.m151647a() == null) {
            CrashHelper.m82479c(new Exception("AppContext.getContext() is null"));
            AccountModule.m29132J().mo61533et();
        }
        return this.f90304c.mo117998R(this.f90305d, m117630b0());
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: r */
    public void mo117643r(int i) {
        l0m l0mVar = this.f90304c;
        if (NullChecker.m82487b(l0mVar) && mo117639m()) {
            if (i != 2) {
                l0mVar.mo118019r(i);
            } else if (l0mVar.mo118011m()) {
                l0mVar.mo118019r(i);
            }
        }
    }

    @Override // p153l.InterfaceC17269gp
    public void release() {
        this.f90305d = null;
        this.f90317p = null;
        qe20.m176221b(this);
    }

    @Override // p153l.InterfaceC17269gp
    public void removeLast() {
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.removeLast();
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: s */
    public boolean mo117644s() {
        return this.f90312k;
    }

    @Override // p153l.InterfaceC16801ep
    public void setFaceBeautyValue(String str, float f) {
        this.f90304c.setFaceBeautyValue(str, f);
    }

    @Override // p153l.InterfaceC16801ep
    public void setIntensity(float f) {
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo118026x(f);
        }
    }

    @Override // p153l.InterfaceC16801ep
    public boolean setState(int i) {
        boolean z = this.f90303b != i;
        this.f90303b = i;
        return z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f90307f = surfaceHolder;
        l0m l0mVar = this.f90304c;
        if (NullChecker.m82487b(l0mVar) && this.f90308g) {
            l0mVar.mo118025w(surfaceHolder);
            l0mVar.mo118012n(i2, i3);
            this.f90308g = false;
            mo117634g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f90307f = surfaceHolder;
        this.f90309h = true;
        this.f90308g = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f90307f = null;
        this.f90309h = false;
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: t */
    public void mo117645t() {
        this.f90324w.clear();
        this.f90304c.mo118021t();
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: u */
    public void mo117646u(String str) {
        this.f90304c.mo118023u(str);
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: v */
    public void mo117647v(Map<String, Float> map) {
        if (map != null) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                Float value = entry.getValue();
                if (value != null && key != null) {
                    this.f90304c.setFaceBeautyValue(key, value.floatValue());
                }
            }
        }
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: w */
    public void mo117648w(float[] fArr) {
        if (mo117622Q()) {
            this.f90321t = fArr;
        }
        this.f90318q = true;
        m117638l0(true);
        l0m l0mVar = this.f90304c;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118017q(fArr[1]);
        l0mVar.mo118024v(fArr[0]);
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: x */
    public void mo117649x(MusicContent musicContent) {
        this.f90320s = musicContent;
        if (NullChecker.m82487b(this.f90304c)) {
            this.f90304c.mo117985E(musicContent.path, musicContent.startMillTime, musicContent.endMillTime, true);
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: y */
    public void mo117650y(float f) {
        this.f90304c.mo117991K(f);
    }

    @Override // p153l.InterfaceC16801ep
    /* JADX INFO: renamed from: z */
    public MusicContent mo117651z() {
        return this.f90320s;
    }

    @Override // p153l.ypl.InterfaceC21661f
    /* JADX INFO: renamed from: G */
    public void mo117612G() {
    }

    /* JADX INFO: renamed from: l.dr$a */
    public class a implements lpw {

        /* JADX INFO: renamed from: l.dr$a$a, reason: collision with other inner class name */
        public class RunnableC22836a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f90328a;

            public RunnableC22836a(String str) {
                this.f90328a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NullChecker.m82487b(SurfaceHolderCallbackC16606dr.this.f90304c)) {
                    SurfaceHolderCallbackC16606dr.this.mo117637j();
                    if (NullChecker.m82487b(SurfaceHolderCallbackC16606dr.this.f90317p)) {
                        SurfaceHolderCallbackC16606dr.this.f90317p.mo126510k(false);
                    }
                    SurfaceHolderCallbackC16606dr.this.f90304c.mo118008j();
                }
                if (NullChecker.m82487b(SurfaceHolderCallbackC16606dr.this.f90317p)) {
                    SurfaceHolderCallbackC16606dr.this.f90317p.mo131195a(this.f90328a);
                }
            }
        }

        public a() {
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: a */
        public void mo97168a(String str) {
            l51.m152887G(new RunnableC22836a(str));
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: c */
        public void mo97170c() {
            if (!NullChecker.m82487b(SurfaceHolderCallbackC16606dr.this.f90305d) || SurfaceHolderCallbackC16606dr.this.f90305d.isFinishing()) {
                return;
            }
            File file = new File(SurfaceHolderCallbackC16606dr.this.f90315n);
            boolean z = !file.exists() || file.length() <= 0;
            if (NullChecker.m82487b(SurfaceHolderCallbackC16606dr.this.f90317p)) {
                SurfaceHolderCallbackC16606dr.this.f90317p.mo131196c(SurfaceHolderCallbackC16606dr.this.f90315n, !z);
            }
            if (z) {
                o1j0.m165651y("视频录制错误，请重试");
            }
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: b */
        public void mo97169b(int i) {
        }
    }

    @Override // p153l.InterfaceC17269gp
    /* JADX INFO: renamed from: D */
    public void mo117609D(boolean z) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m117638l0(boolean z) {
    }

    /* JADX INFO: renamed from: l.dr$b */
    public class b implements c5g0.InterfaceC16197a {
        public b() {
        }

        @Override // p153l.c5g0.InterfaceC16197a
        public void playStateChanged(int i, boolean z) {
        }
    }
}
