package p006l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p000p1.mobile.putong.api.WebSocketManager;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.FacebookApi;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.OtherApi;
import com.p000p1.mobile.putong.api.api.PaymentApi;
import com.p000p1.mobile.putong.app.SQLDBDamagedException;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p000p1.mobile.putong.app.web.WebViewClientX;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.rx.rxthread.FastIoScheduler;
import com.p1.mobile.putong.data.CommonAssetsSettings;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.data.SignOutParams;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.location.IntlLocationProvider;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.PreloadTaskInfo;
import com.tantanapp.media.proxy.api.TTMediaProxy;
import dalvik.system.ZipPathValidator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l.ag3;
import l.alj0;
import l.ane0;
import l.bc60;
import l.ckq;
import l.d30;
import l.djx;
import l.du2;
import l.dyd;
import l.e30;
import l.e51;
import l.ec20;
import l.exc0;
import l.f8c;
import l.faj;
import l.g3e;
import l.hpd0;
import l.ic50;
import l.ipd0;
import l.ix50;
import l.j760;
import l.jo0;
import l.k850;
import l.kmc0;
import l.l8m;
import l.mkd0;
import l.mqi0;
import l.o480;
import l.oml;
import l.ooi0;
import l.pdq0;
import l.pgm;
import l.pp2;
import l.q100;
import l.qqc0;
import l.r3e;
import l.rhi;
import l.roj0;
import l.rpq;
import l.rrv;
import l.ru5;
import l.s3e;
import l.s6r;
import l.shw;
import l.stc0;
import l.sw0;
import l.t95;
import l.tan;
import l.tpd0;
import l.tsl;
import l.u700;
import l.uqd0;
import l.utc0;
import l.uve0;
import l.v0f;
import l.v9j;
import l.vj5;
import l.w1n;
import l.w9j;
import l.x1l0;
import l.x8i0;
import l.xsi0;
import l.yni;
import l.znj0;
import l.zpd0;
import l.zri0;
import l.zvf0;
import rx.Notification;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qib0 extends App {

    /* JADX INFO: renamed from: A */
    public static boolean f19770A = false;

    /* JADX INFO: renamed from: A0 */
    public static a<j760<Boolean, Boolean>> f19771A0 = null;

    /* JADX INFO: renamed from: B */
    public static hpd0 f19772B = null;

    /* JADX INFO: renamed from: B0 */
    public static l8m f19773B0 = null;

    /* JADX INFO: renamed from: C */
    public static k850.b f19774C = null;

    /* JADX INFO: renamed from: C0 */
    public static boolean f19775C0 = false;

    /* JADX INFO: renamed from: D */
    public static k850 f19776D = null;

    /* JADX INFO: renamed from: D0 */
    public static String f19777D0 = null;

    /* JADX INFO: renamed from: E */
    public static com.p1.mobile.putong.location.a f19778E = null;

    /* JADX INFO: renamed from: E0 */
    public static hpd0 f19779E0 = null;

    /* JADX INFO: renamed from: F */
    public static o480 f19780F = null;

    /* JADX INFO: renamed from: F0 */
    public static final ag3<Integer> f19781F0;

    /* JADX INFO: renamed from: G */
    public static bkb0 f19782G = null;

    /* JADX INFO: renamed from: G0 */
    public static final boolean[] f19783G0;

    /* JADX INFO: renamed from: H */
    public static Network f19784H = null;

    /* JADX INFO: renamed from: I */
    public static xh5 f19785I = null;

    /* JADX INFO: renamed from: J */
    public static i95 f19786J = null;

    /* JADX INFO: renamed from: K */
    public static d6j0 f19787K = null;

    /* JADX INFO: renamed from: L */
    public static AccountTempApi f19788L = null;

    /* JADX INFO: renamed from: M */
    public static ya5 f19789M = null;

    /* JADX INFO: renamed from: N */
    public static OtherApi f19790N = null;

    /* JADX INFO: renamed from: O */
    public static pk8 f19791O = null;

    /* JADX INFO: renamed from: P */
    public static oj9 f19792P = null;

    /* JADX INFO: renamed from: Q */
    public static C0959l2 f19793Q = null;

    /* JADX INFO: renamed from: R */
    public static a3m f19794R = null;

    /* JADX INFO: renamed from: S */
    public static e70 f19795S = null;

    /* JADX INFO: renamed from: T */
    public static PaymentApi f19796T = null;

    /* JADX INFO: renamed from: U */
    public static yzv f19797U = null;

    /* JADX INFO: renamed from: V */
    public static lj5 f19798V = null;

    /* JADX INFO: renamed from: W */
    public static wb50 f19799W = null;

    /* JADX INFO: renamed from: X */
    public static gi5 f19800X = null;

    /* JADX INFO: renamed from: Y */
    public static AssetsSettingsBaseApi f19801Y = null;

    /* JADX INFO: renamed from: Z */
    public static f1j f19802Z = null;

    /* JADX INFO: renamed from: a0 */
    public static FacebookApi f19803a0 = null;

    /* JADX INFO: renamed from: b0 */
    public static nje0 f19804b0 = null;

    /* JADX INFO: renamed from: c0 */
    public static yl5 f19805c0 = null;

    /* JADX INFO: renamed from: d0 */
    public static volatile File f19806d0 = null;

    /* JADX INFO: renamed from: e0 */
    public static final Integer f19807e0;

    /* JADX INFO: renamed from: f0 */
    public static int f19808f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public static long f19809g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public static LiveRegionTag f19810h0 = null;

    /* JADX INFO: renamed from: i0 */
    public static v0f f19811i0 = null;

    /* JADX INFO: renamed from: j0 */
    public static u700 f19812j0 = null;

    /* JADX INFO: renamed from: k0 */
    public static ui5 f19813k0 = null;

    /* JADX INFO: renamed from: l0 */
    public static final a<roj0> f19814l0;

    /* JADX INFO: renamed from: m0 */
    public static hpd0 f19815m0 = null;

    /* JADX INFO: renamed from: n0 */
    public static boolean f19816n0 = false;

    /* JADX INFO: renamed from: o0 */
    public static boolean f19817o0 = false;

    /* JADX INFO: renamed from: p0 */
    public static az6 f19818p0 = null;

    /* JADX INFO: renamed from: q0 */
    public static a<Long> f19819q0 = null;

    /* JADX INFO: renamed from: r0 */
    public static a<Long> f19820r0 = null;

    /* JADX INFO: renamed from: s */
    public static String f19821s = "7.2.7";

    /* JADX INFO: renamed from: s0 */
    public static a<roj0> f19822s0 = null;

    /* JADX INFO: renamed from: t */
    public static int f19823t = 3727000;

    /* JADX INFO: renamed from: t0 */
    public static boolean f19824t0 = false;

    /* JADX INFO: renamed from: u */
    public static boolean f19825u = true;

    /* JADX INFO: renamed from: u0 */
    public static boolean f19826u0 = false;

    /* JADX INFO: renamed from: v */
    public static boolean f19827v = true;

    /* JADX INFO: renamed from: v0 */
    public static a<roj0> f19828v0;

    /* JADX INFO: renamed from: w0 */
    public static final a<Integer> f19830w0;

    /* JADX INFO: renamed from: x0 */
    public static long f19832x0;

    /* JADX INFO: renamed from: y0 */
    public static String f19834y0;

    /* JADX INFO: renamed from: z0 */
    public static a<roj0> f19836z0;

    /* JADX INFO: renamed from: r */
    public k850 f19837r;

    /* JADX INFO: renamed from: w */
    public static zpd0 f19829w = new zpd0("app_install_time", 0L);

    /* JADX INFO: renamed from: x */
    public static uqd0 f19831x = new uqd0("debug_version_", "7.2.7", false);

    /* JADX INFO: renamed from: y */
    public static tpd0 f19833y = new tpd0("debug_plugin_version", -1, false);

    /* JADX INFO: renamed from: z */
    public static uqd0 f19835z = new uqd0("debug_x_tantan_dev_env", "", false);

    /* JADX INFO: renamed from: l.qib0$a */
    public class C1170a implements tsl {

        /* JADX INFO: renamed from: a */
        public k850 f19838a;

        public C1170a() {
        }

        /* JADX INFO: renamed from: a */
        public k850 m22208a() {
            k850.b bVar;
            if (this.f19838a == null && (bVar = qib0.f19774C) != null) {
                this.f19838a = bVar.c();
            }
            return this.f19838a;
        }
    }

    /* JADX INFO: renamed from: l.qib0$b */
    public class C1171b implements r3e {
        public C1171b() {
        }

        /* JADX INFO: renamed from: a */
        public void m22209a(long j, WarningLevel warningLevel) {
            if (warningLevel == WarningLevel.URGENT_ALERT) {
                new g3e().j(Act.foreground_() == null ? null : (Activity) Act.foreground_().a.get());
            }
        }
    }

    /* JADX INFO: renamed from: l.qib0$c */
    public class C1172c implements SVGALoader.SvgaGlobalCall {
        public C1172c() {
        }

        @NonNull
        public String replaceSource(@NonNull String str) {
            return uel.INSTANCE.m25200c(str);
        }
    }

    /* JADX INFO: renamed from: l.qib0$d */
    public class C1173d implements MessageQueue.IdleHandler {
        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            if (Act.foreground_() == null) {
                return true;
            }
            Objects.toString(Act.foreground_());
            qib0.m22175s0();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.qib0$e */
    public class C1174e implements com.tantanapp.media.proxy.api.a.e {
        /* JADX INFO: renamed from: a */
        public void m22210a(String str, long j, PreloadTaskInfo preloadTaskInfo) {
            ad20.m11809b().mo11810a(C1458y1.m27736g(preloadTaskInfo));
        }

        /* JADX INFO: renamed from: b */
        public void m22211b(String str, long j, PreloadTaskInfo preloadTaskInfo) {
            ad20.m11809b().mo11810a(C1458y1.m27736g(preloadTaskInfo));
        }
    }

    /* JADX INFO: renamed from: l.qib0$f */
    public class C1175f implements e30<roj0> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            User userMe_ = qib0.f19805c0.me_();
            if (!NullChecker.b(userMe_)) {
                du2.a("[putong-common][userMeState]", "userMeCallPrepareNewSignIn but me still null");
                qib0.f19830w0.onNext(2);
            } else {
                qib0.m22130O0(userMe_);
                qib0.f19830w0.onNext(1);
                du2.a("[putong-common][userMeState]", "USER_ME_STATE_SUCCESS from userMeCallPrepareNewSignIn");
            }
        }
    }

    /* JADX INFO: renamed from: l.qib0$g */
    public class C1176g implements e30<Throwable> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            du2.a("[putong-common][userMeState]", "userMeCallPrepareNewSignIn with error: " + th);
            qib0.f19830w0.onNext(2);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f19772B = new hpd0("has_show_privacy_policy_dlg", bool);
        f19807e0 = 0;
        f19810h0 = LiveRegionTag.get("unknown_");
        f19814l0 = a.b();
        f19815m0 = new hpd0("has_pre_load_when_sign_in", bool);
        f19819q0 = a.b();
        f19820r0 = a.b();
        f19822s0 = a.b();
        f19824t0 = false;
        f19826u0 = false;
        f19828v0 = a.b();
        f19830w0 = a.b();
        f19832x0 = -1L;
        f19834y0 = "";
        f19836z0 = a.b();
        f19771A0 = a.c(j760.a(bool, bool));
        f19773B0 = null;
        f19775C0 = false;
        f19777D0 = "";
        f19779E0 = new hpd0("android_network_metrics", bool);
        f19781F0 = new ag3.d(0, 500);
        f19783G0 = new boolean[]{false};
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m22110B(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Boolean m22111C(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public static void m22112C0() {
        ic50.j().b();
        ABManager.m1264q().first().subscribe(mkd0.G(new e30() { // from class: l.thb0
            public final void call(Object obj) {
                ic50.j().p(qib0.f19770A);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m22114D0() {
        if (f19817o0) {
            return;
        }
        e51.M(new Runnable() { // from class: l.uhb0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.m22122J();
            }
        });
        f19817o0 = true;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m22116E0() {
        RemoteConfig.Y().filter(new w9j() { // from class: l.jhb0
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.lhb0
            public final void call(Object obj) {
                qib0.m22148Z((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ stc0 m22117F(boolean z) {
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("clientId", "100032");
            jsonObject.add("device", new JsonParser().parse(pk8.m21562M().toJson()).getAsJsonObject());
            jsonObject.addProperty("type", z ? "switch-account" : CameraSticker.CATEGORY_DEFAULT_FILTER);
        } catch (Exception unused) {
        }
        return f19784H.auth().q(xh5.m27243b("/signout")).l(utc0.create(Network.JSON, jsonObject.toString())).b();
    }

    /* JADX INFO: renamed from: G0 */
    public static void m22119G0() {
        RemoteConfig.Y().filter(new w9j() { // from class: l.rhb0
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.shb0
            public final void call(Object obj) {
                qib0.m22120H((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m22120H(RemoteConfig.ConfigStep configStep) {
        if (RemoteConfig.x().s("hook_sp_wait_apply")) {
            try {
                new com.tantanapp.beatles.safety.spwaitfix.a(App.e).a();
            } catch (Throwable th) {
                CrashHelper.c(th);
                th.getMessage();
            }
        }
        e51.G(new Runnable() { // from class: l.hib0
            @Override // java.lang.Runnable
            public final void run() {
                pt2.m21684j();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m22122J() {
        Iterator<String> it = c1i0.f9282c.iterator();
        while (it.hasNext()) {
            f19812j0.t(it.next());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: J0 */
    public static boolean m22123J0() {
        u700 u700Var = f19812j0;
        return (u700Var == null || u700Var.b.e() == null) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m22124K(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            f19775C0 = RemoteConfig.x().s("android_sign_out_keep_db");
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static void m22127M0(final boolean z) {
        f19785I.now(ia20.m16567a(new v9j() { // from class: l.oib0
            public final Object call() {
                return qib0.m22117F(z);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m22129O() {
        exc0 exc0VarExecute = null;
        try {
            try {
                try {
                    exc0VarExecute = f19776D.a(f19784H.basic().q("https://client-tracking.tantanapp.com/?deviceToken=" + dyd.a() + "&channel=" + mr4.f17192a).g().b()).execute();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        } finally {
            t95.b(exc0VarExecute);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static void m22130O0(User user) {
        jkb0.m17514w(user);
        ABManager.m1240a0();
        f19815m0.put(Boolean.TRUE);
        m22155c1();
        dyd.a.first().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.mhb0
            public final void call(Object obj) {
                qib0.m22131P(obj);
            }
        }));
        LaunchStep launchStep = LaunchStep.OmsParse;
        yni.f(new LaunchStep[]{launchStep});
        ic50.j().a();
        yni.d(launchStep);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m22131P(Object obj) {
        if (f19805c0.signedIn_()) {
            m22142V0();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m22133R(Notification notification) {
        if (notification.i()) {
            m22171q0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static void m22134R0() {
        e51.y(new Runnable() { // from class: l.yhb0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.m22129O();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ roj0 m22135S(Class cls, SignOutParams signOutParams) {
        ABManager.m1246d0();
        ix50.b().a();
        if (NullChecker.a(cls)) {
            Iterator it = Act.globalLifeCycle_().values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    Activity activity = (Activity) ((Act.r) it2.next()).a.get();
                    if (NullChecker.a(activity) && (activity instanceof Act) && f19805c0.getSignOutJumpAct().isInstance(activity)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                Intent intent = new Intent(App.e, (Class<?>) cls);
                intent.addFlags(268468224);
                intent.putExtra("show_update_dialog", signOutParams.isShowUpdateDialog());
                if (signOutParams.isLogOutAb()) {
                    intent.putExtra("delete_account_popup", true);
                }
                intent.putExtra("isFromSignOut", true);
                intent.putExtra("is_clear_task", true);
                intent.putExtra("inactive_type", signOutParams.getInactiveType());
                intent.putExtra("hasContract", signOutParams.isHasContract());
                intent.putExtra("inactive_category", signOutParams.getInactiveCategory());
                App.e.startActivity(intent);
            }
            HashMap mapGlobalLifeCycle_ = Act.globalLifeCycle_();
            ArrayList arrayList = new ArrayList();
            Iterator it3 = mapGlobalLifeCycle_.values().iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((List) it3.next()).iterator();
                while (it4.hasNext()) {
                    final Act act = (Activity) ((Act.r) it4.next()).a.get();
                    if (NullChecker.a(act) && (act instanceof Act) && !f19805c0.getSignOutJumpAct().isInstance(act)) {
                        arrayList.add(act.lifecycle().filter(new w9j() { // from class: l.cib0
                            public final Object call(Object obj) {
                                return Boolean.valueOf(((c) obj) == c.m);
                            }
                        }).timeout(10L, TimeUnit.SECONDS).materialize().map(new w9j() { // from class: l.dib0
                            public final Object call(Object obj) {
                                return qib0.m22146Y(act, (Notification) obj);
                            }
                        }).first());
                    }
                }
            }
            if (arrayList.size() > 0) {
                mkd0.p(arrayList, new faj() { // from class: l.eib0
                    public final Object call(Object[] objArr) {
                        return roj0.a;
                    }
                }).materialize().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.fib0
                    public final void call(Object obj) {
                        qib0.m22133R((Notification) obj);
                    }
                }));
            } else {
                m22171q0();
            }
        } else {
            m22171q0();
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: S0 */
    public static void m22136S0(@NonNull String str) {
        if (ConnectivityReceiver.l()) {
            m22169p0();
            com.tantanapp.media.proxy.api.a.p().w(Uri.parse(str), com.tantanapp.media.proxy.api.a.l);
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m22137T(sw0 sw0Var) {
        try {
            if (NullChecker.a(sw0Var) && NullChecker.a(sw0Var.g())) {
                Uri uriG = sw0Var.g();
                String queryParameter = uriG.getQueryParameter("liveId");
                if (!TextUtils.isEmpty(queryParameter) || "/square".equals(uriG.getPath())) {
                    isd.f14739a.put(queryParameter);
                    isd.f14740b.put(Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m22138T0(List<String> list) {
        if (ConnectivityReceiver.l()) {
            m22169p0();
            com.tantanapp.media.proxy.api.a.p().x(list);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ rx.c m22139U(boolean z, roj0 roj0Var) {
        ipd0 ipd0Var = f19788L.f1132a;
        Boolean bool = Boolean.TRUE;
        ipd0Var.h(bool);
        m22158e0(true, true);
        m22142V0();
        User userMe_ = f19805c0.me_();
        f19790N.tryMarkAsDAU();
        jkb0.m17514w(userMe_);
        m22155c1();
        f19815m0.put(bool);
        ic50.j().a();
        if (z) {
            xgw.m27238n(((DbObject) userMe_).id);
        } else {
            xgw.m27235k(((DbObject) userMe_).id);
        }
        return rx.c.just(roj0.a);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m22140U0(@NonNull String str) {
        m22169p0();
        com.tantanapp.media.proxy.api.a.p().w(Uri.parse(str), com.tantanapp.media.proxy.api.a.l);
    }

    /* JADX INFO: renamed from: V0 */
    public static void m22142V0() {
        e51.y(new Runnable() { // from class: l.nhb0
            @Override // java.lang.Runnable
            public final void run() {
                TantanApp.f1169c.m28207Y().flatMap(new w9j() { // from class: l.zhb0
                    public final Object call(Object obj) {
                        return qib0.f19791O.m21573Q(TantanApp.f1169c.m28220y()).compose(mkd0.C()).materialize().take(1);
                    }
                }).compose(mkd0.N()).subscribe();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ rx.c m22144X(boolean z, final Class cls, final boolean z2, final boolean z3, roj0 roj0Var) {
        return z ? m22167m0(new v9j() { // from class: l.chb0
            public final Object call() {
                return qib0.m22153b1(cls, z2, AccountTempApi.InactiveType.None, z3);
            }
        }) : m22153b1(cls, z2, AccountTempApi.InactiveType.None, z3);
    }

    /* JADX INFO: renamed from: X0 */
    public static void m22145X0(String str, String str2) {
        w1n.c(App.e).a(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Notification m22146Y(Activity activity, Notification notification) {
        if (notification.j()) {
            CrashHelper.c(new RuntimeException("activity did not Destroy in 10:" + activity));
        }
        return notification;
    }

    /* JADX INFO: renamed from: Y0 */
    public static rx.c<roj0> m22147Y0(final boolean z, final Class cls, final boolean z2, boolean z3, final boolean z4) {
        m22127M0(z3);
        return f19785I.now(f19812j0.E().flatMap(new w9j() { // from class: l.khb0
            public final Object call(Object obj) {
                return qib0.m22144X(z, cls, z2, z4, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m22148Z(RemoteConfig.ConfigStep configStep) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (RemoteConfig.x().s("del_or_hidden_entrance_switch") || !f19805c0.signedIn_()) {
            return;
        }
        CrashHelper.c(new RuntimeException("RemoteConfig del_or_hidden_entrance_switch =false, cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime)));
    }

    /* JADX INFO: renamed from: Z0 */
    public static rx.c<roj0> m22149Z0(boolean z, boolean z2) {
        return m22147Y0(z, f19805c0.getSignOutJumpAct(), false, false, z2);
    }

    /* JADX INFO: renamed from: a1 */
    public static rx.c<roj0> m22151a1(final Class cls, final SignOutParams signOutParams) {
        return rx.c.fromCallable(new Callable() { // from class: l.dhb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qib0.m22135S(cls, signOutParams);
            }
        }).compose(mkd0.R());
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m22152b0(CommonAssetsSettings commonAssetsSettings) {
        m22169p0();
        x1l0.n().v();
    }

    /* JADX INFO: renamed from: b1 */
    public static rx.c<roj0> m22153b1(Class cls, boolean z, AccountTempApi.InactiveType inactiveType, boolean z2) {
        return m22151a1(cls, new SignOutParams(z, inactiveType, false, z2));
    }

    /* JADX INFO: renamed from: c1 */
    public static void m22155c1() {
        WebSocketManager.m1329Q().m1387o0();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m22156d0(String str) {
        if (!str.startsWith("http")) {
            return str;
        }
        m22169p0();
        return com.tantanapp.media.proxy.api.a.p().q(str);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m22157d1() {
        TantanApp.f1169c.m28213e0();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m22158e0(boolean z, boolean z2) {
        f19770A = z;
        LaunchStep launchStep = LaunchStep.InitCommonInfo;
        yni.f(new LaunchStep[]{launchStep});
        m22187z0(z);
        LaunchStep launchStep2 = LaunchStep.NotifySignIn;
        yni.e(launchStep, launchStep2);
        f19812j0.o(z2);
        LaunchStep launchStep3 = LaunchStep.NotifyAllSignIn;
        yni.e(launchStep2, launchStep3);
        f19812j0.m();
        f19828v0.observeOn(Schedulers.io()).subscribe(mkd0.G(new e30() { // from class: l.phb0
            public final void call(Object obj) {
                qib0.f19812j0.p();
            }
        }));
        LaunchStep launchStep4 = LaunchStep.WebpCall;
        yni.e(launchStep3, launchStep4);
        pgm.i(new v9j() { // from class: l.qhb0
            public final Object call() {
                return Boolean.valueOf(wc40.m26351c());
            }
        });
        yni.d(launchStep4);
    }

    /* JADX INFO: renamed from: e1 */
    public static void m22159e1(String str, Object... objArr) {
        w1n.c(App.e).b(str, objArr);
    }

    /* JADX INFO: renamed from: f0 */
    public static rx.c<roj0> m22160f0() {
        return m22162g0(false);
    }

    /* JADX INFO: renamed from: f1 */
    public static void m22161f1() {
        m22160f0().take(1).observeOn(jo0.a()).subscribe(mkd0.H(new C1175f(), new C1176g()));
    }

    /* JADX INFO: renamed from: g0 */
    public static rx.c<roj0> m22162g0(final boolean z) {
        if (f19819q0.e() == null) {
            f19819q0.onNext(Long.valueOf(SystemClock.elapsedRealtime()));
        }
        m22157d1();
        f19784H.resetNetworkControlParams();
        m22112C0();
        m22114D0();
        du2.a("[putong-common][userMeState]", "callPrepareNewSignIn:isSignUp " + z);
        return f19812j0.f.take(1).observeOn(FastIoScheduler.b).flatMap(new w9j() { // from class: l.pib0
            public final Object call(Object obj) {
                return qib0.m22166l0(true);
            }
        }).observeOn(jo0.a()).flatMap(new w9j() { // from class: l.ahb0
            public final Object call(Object obj) {
                return qib0.f19812j0.D();
            }
        }).flatMap(new w9j() { // from class: l.bhb0
            public final Object call(Object obj) {
                return qib0.m22139U(z, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static void m22163h0() {
        if (f19824t0) {
            return;
        }
        f19824t0 = true;
        Looper.getMainLooper().getQueue().addIdleHandler(new C1173d());
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m22164i0() {
        int iIsGooglePlayServicesAvailable;
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(App.e);
        } catch (Throwable th) {
            CrashHelper.c(th);
            iIsGooglePlayServicesAvailable = 1;
        }
        return iIsGooglePlayServicesAvailable == 0;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m22165k0() {
        WebSocketManager.m1329Q().m1356H();
    }

    /* JADX INFO: renamed from: l0 */
    public static rx.c<roj0> m22166l0(final boolean z) {
        yni.f(new LaunchStep[]{LaunchStep.InitOtherDb});
        du2.a("DatabaseStore", "dbInit");
        return rx.c.just(roj0.a).map(new w9j() { // from class: l.fhb0
            public final Object call(Object obj) {
                return Boolean.valueOf(qib0.m22181v0(z, new d30() { // from class: l.jib0
                    public final void call() {
                        qib0.m22168p();
                    }
                }));
            }
        }).filter(new w9j() { // from class: l.ghb0
            public final Object call(Object obj) {
                return qib0.m22111C((Boolean) obj);
            }
        }).map(new w9j() { // from class: l.hhb0
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static rx.c<roj0> m22167m0(final v9j<rx.c<roj0>> v9jVar) {
        return f19785I.now(f19791O.m21571O().materialize().first().compose(mkd0.C())).flatMap(new w9j() { // from class: l.ihb0
            public final Object call(Object obj) {
                return qib0.m22183x(v9jVar, (Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m22168p() {
        m22185y0();
        f19812j0.q();
        yni.d(LaunchStep.InitOtherDb);
        du2.a("DatabaseStore", "dbInit done");
    }

    /* JADX INFO: renamed from: p0 */
    public static void m22169p0() {
        File fileM22177t0 = m22177t0();
        if (App.f) {
            boolean[] zArr = f19783G0;
            if (zArr[0]) {
                return;
            }
            synchronized (zArr) {
                try {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        TTMediaProxy.setAppContext(App.e);
                        com.tantanapp.media.proxy.api.a.n(-1, 200L, -1L, -1L, true);
                        com.tantanapp.media.proxy.api.a.p().z(fileM22177t0.getPath(), 500L);
                        com.tantanapp.media.proxy.api.a.p().k(new C1174e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m22170q() {
        try {
            dyd.b();
        } catch (Exception e) {
            CrashHelper.g(e);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m22171q0() {
        m22165k0();
        TantanApp.f1169c.m28211c0();
        f19812j0.B();
        hpd0 hpd0Var = f19796T.retryRestore;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        f8c.o().k(false);
        ABManager.m1233U();
        m850.m19158i().m19161f(true);
        f19805c0.signOut();
        f19788L.f1132a.h(bool);
        f19815m0.put(bool);
        IntlCountryCodeController.m23x();
        IntlCountryCodeController.m22w();
        f19796T.retryRestore.put(bool);
        ABManager.m1232T();
        f19784H.resetNetworkControlParams();
        ABManager.m1236X(false);
        ABManager.m1237Y(false);
        f19784H.invalidHashAccount();
        ABManager.m1248e0(0);
        f19793Q.m18518T();
        f19832x0 = -1L;
        djx.h().i();
        kkh0.m18154g();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m22173r0(final Runnable runnable, boolean z) {
        f19828v0.take(1).observeOn(z ? jo0.a() : Schedulers.io()).subscribe(mkd0.G(new e30() { // from class: l.vhb0
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static void m22175s0() {
        if (f19826u0) {
            return;
        }
        f19826u0 = true;
        f19828v0.onNext(roj0.a);
        if (f19824t0) {
            return;
        }
        CrashHelper.c(new RuntimeException("finishColdStart with checkFinishColdStart = false"));
    }

    /* JADX INFO: renamed from: t0 */
    public static File m22177t0() {
        if (f19806d0 == null) {
            synchronized (f19807e0) {
                try {
                    if (f19806d0 == null) {
                        f19806d0 = e51.u("media");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19806d0;
    }

    /* JADX INFO: renamed from: u0 */
    public static long m22179u0() {
        return Math.max(0L, xsi0.h() - f19809g0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m22180v(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            djx.h().k(RemoteConfig.x().F("community_optimization_long_graphic"));
            djx.h().j(RemoteConfig.x().F("post_video_config"));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m22181v0(boolean z, d30 d30Var) {
        try {
            d30Var.call();
            return true;
        } catch (SQLDBDamagedException | DBCorruptException e) {
            CrashHelper.c(new RuntimeException("DBCorruptException on onAllModuleLoadedWhenAlreadySignedIn: " + z, e));
            du2.a("[putong-common][userMeState]", "Catch DBCorruptException and callPrepareNewSignIn");
            if (z || (e instanceof SQLDBDamagedException)) {
                try {
                    f8c.o().j();
                } catch (Exception e2) {
                    CrashHelper.c(e2);
                }
                throw e;
            }
            if (TextUtils.isEmpty(f19805c0.userId())) {
                m22149Z0(false, false);
            } else {
                m22161f1();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ rx.c m22183x(v9j v9jVar, Notification notification) {
        return (rx.c) v9jVar.call();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m22185y0() {
        f8c.o().s();
        ui5 ui5Var = f19813k0;
        if (ui5Var != null) {
            ui5Var.m25227i();
        }
        ui5 ui5Var2 = new ui5();
        f8c.o().y(ui5Var2);
        f19813k0 = ui5Var2;
        f19814l0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m22187z0(boolean z) {
        String strUserId = f19805c0.userId();
        if (!TextUtils.isEmpty(strUserId)) {
            zpd0 zpd0Var = new zpd0("use_first_login_local_time_" + strUserId, -1L);
            if (!z) {
                if (((Long) zpd0Var.get()).longValue() == -1) {
                    zpd0Var.put(-1000L);
                }
                f19832x0 = ((Long) zpd0Var.get()).longValue();
            } else if (((Long) zpd0Var.get()).longValue() > 0 || ((Long) zpd0Var.get()).longValue() == -1000) {
                f19832x0 = ((Long) zpd0Var.get()).longValue();
            } else {
                long jO = mqi0.o();
                f19832x0 = jO;
                zpd0Var.put(Long.valueOf(jO));
            }
        }
        s6r.a().d(new vj5());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m22188A0() {
        RemoteConfig.Y().subscribe(mkd0.G(new e30() { // from class: l.ehb0
            public final void call(Object obj) {
                qib0.m22180v((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m22189B0() {
        if (i0c.m16414a()) {
            i0c.m16418e(App.e, i0c.m16417d());
        }
        WebViewClientX.setEnableWebViewDNS(i0c.m16415b());
    }

    /* JADX INFO: renamed from: F0 */
    public final void m22190F0() {
        RemoteConfig.Y().subscribe(mkd0.G(new e30() { // from class: l.ohb0
            public final void call(Object obj) {
                qib0.m22124K((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m22191H0() {
        try {
            zvf0.E(new C1170a());
            String str = mr4.f17195d;
            if (str == null) {
                str = "";
            }
            zvf0.j(App.e, "putong", "release", true, str, "7.2.7");
        } catch (Throwable th) {
            CrashHelper.g(th);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m22192I0() {
        LaunchStep launchStep = LaunchStep.FbSdk;
        yni.f(new LaunchStep[]{launchStep});
        com.facebook.c.N("518254421109380");
        com.facebook.c.L(App.e.getApplicationContext());
        AppEventsLogger.a(App.e);
        AppsFlyerLib.getInstance().init("dmfeSDkpVxP8m6Ys6yJCpn", (AppsFlyerConversionListener) null, App.e);
        if (IntlCountryCodeController.m10k()) {
            AppsFlyerLib.getInstance().setOutOfStore("hms_store_source");
        }
        AppsFlyerLib.getInstance().start(App.e);
        f19803a0 = new FacebookApi();
        com.facebook.c.O(true);
        com.facebook.c.j();
        sw0.d(App.e, new sw0.b() { // from class: l.whb0
            /* JADX INFO: renamed from: a */
            public final void m26378a(sw0 sw0Var) {
                qib0.m22137T(sw0Var);
            }
        });
        yni.d(launchStep);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m22193K0(roj0 roj0Var) {
        m22195N0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m22194L0() {
        LaunchStep launchStep = LaunchStep.InitAccountModule;
        LaunchStep launchStep2 = LaunchStep.AccountModuleInject;
        yni.e(launchStep, launchStep2);
        f19812j0.t("account");
        LaunchStep launchStep3 = LaunchStep.DoAccountInit;
        yni.e(launchStep2, launchStep3);
        m22203n0();
        yni.d(launchStep3);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m22195N0() {
        LaunchStep launchStep = LaunchStep.InitSignData;
        LaunchStep launchStep2 = LaunchStep.SignedStep;
        yni.e(launchStep, launchStep2);
        ((App) this).a = f19805c0.userId();
        try {
            m22158e0(false, !((Boolean) f19815m0.get()).booleanValue());
            yni.d(launchStep2);
            LaunchStep launchStep3 = LaunchStep.InitMe;
            yni.f(new LaunchStep[]{launchStep3});
            User userMe_ = f19805c0.me_();
            LaunchStep launchStep4 = LaunchStep.InitMeSuccess;
            yni.e(launchStep3, launchStep4);
            m22130O0(userMe_);
            LaunchStep launchStep5 = LaunchStep.NotifyMeSuccess;
            yni.e(launchStep4, launchStep5);
            f19830w0.onNext(1);
            yni.d(launchStep5);
        } catch (DBCorruptException e) {
            CrashHelper.c(new RuntimeException("DBCorruptException on onAllModuleLoadedWhenAlreadySignedIn", e));
            du2.a("[putong-common][userMeState]", "Catch DBCorruptException and callPrepareNewSignIn");
            m22161f1();
        } catch (SQLDBDamagedException e2) {
            CrashHelper.c(e2);
            try {
                f8c.o().j();
            } catch (Exception e3) {
                CrashHelper.c(e3);
            }
            m22161f1();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m22196P0() {
        du2.a("[putong-common]", "onLowMemory");
        if (NullChecker.a(f19782G)) {
            f19782G.d(80);
        }
        f19812j0.A();
        shw.y();
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m22197Q0(int i) {
        du2.a("[putong-common]", "onTrimMemory level=" + i);
        if (NullChecker.a(f19782G)) {
            f19782G.d(i);
        }
        f19812j0.C(i);
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m22198W0() {
        f19778E = new IntlLocationProvider();
    }

    /* JADX INFO: renamed from: d */
    public void m22199d() {
        super.d();
        x8i0.a(new Runnable() { // from class: l.aib0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.m22170q();
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m22200j0() {
        try {
            rhi.b(e51.v(".media_cache"));
        } catch (IOException | IllegalArgumentException unused) {
        }
        try {
            rhi.b(e51.u(".media"));
        } catch (IOException | IllegalArgumentException unused2) {
        }
    }

    /* JADX INFO: renamed from: m */
    public void m22201m() {
        yni.i();
        yni.f(new LaunchStep[]{LaunchStep.PutongCreate, LaunchStep.PuginInit, LaunchStep.PutongArriveImgload, LaunchStep.PutongArriveImgloadNoAd});
        TantanApp.f1169c = new ydb0();
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                ZipPathValidator.clearCallback();
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }
        yni.d(LaunchStep.PuginInit);
        LaunchStep launchStep = LaunchStep.BaseAppInit;
        yni.f(new LaunchStep[]{launchStep});
        super.m();
        LaunchStep launchStep2 = LaunchStep.OneIdInit;
        yni.e(launchStep, launchStep2);
        sh50.m23744c();
        au2.m12236u();
        rpq.b().e(CommonData.JSON_ADAPTER, (pp2) null);
        yni.e(launchStep2, LaunchStep.NetworkInit);
        if (!App.f) {
            m22191H0();
            return;
        }
        lsm.m19011a(App.e);
        f19804b0 = new nje0();
        f19805c0 = new am5();
        f19812j0 = u700.r();
        v0f v0fVar = new v0f();
        f19811i0 = v0fVar;
        v0fVar.b();
        try {
            i95.m16523B();
        } catch (Exception e) {
            CrashHelper.g(e);
        }
        try {
            ConnectivityReceiver.n(App.e);
        } catch (Exception e2) {
            CrashHelper.g(e2);
        }
        m22207x0();
        if (((Boolean) f19779E0.get()).booleanValue()) {
            NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
            networkMetricsStatistics.g(App.e, new ru5("Tantantribe", f19821s, new Function0() { // from class: l.gib0
                public final Object invoke() {
                    return qib0.f19805c0.userId();
                }
            }, (oml) null, (String) null, (Function1) null));
            networkMetricsStatistics.b();
        }
        k850.b bVar = new k850.b();
        f19774C = bVar;
        bVar.a(new vel());
        f19774C.j(m850.m19158i());
        try {
            m22205o0();
            k850.b bVarA = zri0.a(f19774C);
            f19774C = bVarA;
            k850.b bVarM1249f = ABManager.m1249f(bVarA);
            f19774C = bVarM1249f;
            f19774C = d6j0.m13804a(bVarM1249f);
            f19787K = new d6j0();
            f19774C = au2.m12227l(f19774C);
        } catch (Exception e3) {
            CrashHelper.g(e3);
        }
        if (((Boolean) f19779E0.get()).booleanValue()) {
            f19774C.l(new ec20(new owv.C1109b(), (List) null));
        } else {
            f19774C.l(new owv.C1109b());
        }
        this.f19837r = f19774C.c();
        f19776D = f19774C.c();
        Network network = new Network(f19776D.v());
        f19784H = network;
        xh5.network = network;
        if (((Integer) App.i.get()).intValue() == 1 && ((Long) f19829w.get()).longValue() == 0) {
            f19829w.put(Long.valueOf(mqi0.o()));
        }
        m22191H0();
        zvf0.c();
        zvf0.J();
        au2.m12240y();
        yni.e(LaunchStep.NetworkInit, LaunchStep.BaseApi);
        try {
            uve0.e(App.e);
        } catch (Exception e4) {
            CrashHelper.g(e4);
        }
        f19785I = new xh5();
        f19788L = new AccountTempApi();
        f19825u = !f19805c0.signedIn_();
        f19786J = new i95();
        f19789M = new ya5();
        f19790N = new OtherApi();
        f19793Q = new C0959l2();
        f19796T = new PaymentApi();
        f19797U = new yzv(f19785I);
        f19798V = new lj5(f19785I);
        f19791O = new pk8(f19785I);
        f19792P = new oj9(f19785I);
        f19818p0 = new az6(f19785I);
        f19799W = new wb50();
        f19800X = new gi5();
        AssetsSettingsBaseApi.m1308H(AssetsSettingsBaseApi.Module.COMMON, 2);
        f19801Y = new AssetsSettingsBaseApi();
        f19802Z = new f1j();
        f19794R = new vhe0();
        f19795S = new e70();
        yni.e(LaunchStep.BaseApi, LaunchStep.BaseApiV2);
        kkh0.m18152e();
        kkh0.m18153f(App.e);
        f19780F = new o480();
        m22198W0();
        try {
            m22192I0();
        } catch (Exception e5) {
            CrashHelper.g(e5);
        }
        if (App.h()) {
            e51.H(App.e, new Runnable() { // from class: l.kib0
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.m22134R0();
                }
            }, 100L);
        }
        e51.H(App.e, new Runnable() { // from class: l.lib0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.f19786J.m16528C();
            }
        }, 1000L);
        LaunchStep launchStep3 = LaunchStep.BaseApiV2;
        LaunchStep launchStep4 = LaunchStep.ImageLoad;
        yni.e(launchStep3, launchStep4);
        f19782G = new bkb0(this.f19837r.v());
        LaunchStep launchStep5 = LaunchStep.LocationMap;
        yni.e(launchStep4, launchStep5);
        m22157d1();
        sh50.m23747f();
        jkb0.m17501j();
        NotificationCheckerCommon.b();
        tan.f();
        yni.e(launchStep5, LaunchStep.AbLocalInit);
        f19800X.m11764d().observeOn(Schedulers.io()).subscribe(mkd0.H(new e30() { // from class: l.mib0
            public final void call(Object obj) {
                qib0.m22152b0((CommonAssetsSettings) obj);
            }
        }, new e30() { // from class: l.nib0
            public final void call(Object obj) {
                qib0.m22110B((Throwable) obj);
            }
        }));
        ABManager.m1269x();
        m22189B0();
        if (f19805c0.signedIn_()) {
            f19816n0 = false;
            jkb0.m17513v(f19805c0.userId(), ((Integer) jkb0.m17504m().get()).intValue());
            xgw.m27233i();
            f19793Q.m18522a0();
        } else {
            f19816n0 = true;
            f19793Q.m18518T();
            xgw.m27233i();
        }
        f19809g0 = xsi0.h();
        zvf0.D("e_backend_application_create", "", new j760[]{new j760("imei", PermissionHelper.b(new String[]{"android.permission.READ_PHONE_STATE"}) ? dyd.e() : ""), new j760("imei2", PermissionHelper.b(new String[]{"android.permission.READ_PHONE_STATE"}) ? dyd.f() : ""), new j760("oaid", k200.m17914b()), new j760("meid", PermissionHelper.b(new String[]{"android.permission.READ_PHONE_STATE"}) ? dyd.g() : ""), new j760("androidid", dyd.b())});
        pdq0.b();
        zvf0.D("e_dark_mode_auth_status", "", new j760[]{new j760("dark_mode_status", (App.e.getResources().getConfiguration().uiMode & 48) == 32 ? "on" : "off")});
        q100.b("fonts/Roboto-Medium.ttf");
        jhp0.m17443h().m17445f();
        jkb0.m17507p();
        try {
            au2.m12234s(App.e);
        } catch (Exception e6) {
            CrashHelper.g(e6);
        }
        LaunchStep launchStep6 = LaunchStep.AbLocalInit;
        LaunchStep launchStep7 = LaunchStep.RemoteLocalInit;
        yni.e(launchStep6, launchStep7);
        m22119G0();
        m22116E0();
        t660.m24482c();
        LaunchStep launchStep8 = LaunchStep.PrivacyConfig;
        yni.e(launchStep7, launchStep8);
        LaunchStep launchStep9 = LaunchStep.MkParse;
        yni.e(launchStep8, launchStep9);
        c400.m13133j(App.e);
        LaunchStep launchStep10 = LaunchStep.AccountPluginInit;
        yni.e(launchStep9, launchStep10);
        m22206w0();
        LaunchStep launchStep11 = LaunchStep.PutongOnNext;
        yni.e(launchStep10, launchStep11);
        f19822s0.onNext(roj0.a);
        LaunchStep launchStep12 = LaunchStep.DiskCheck;
        yni.e(launchStep11, launchStep12);
        new s3e.b().c(204800L, 5000L).a(new C1171b()).b().c();
        yni.d(launchStep12);
        m22188A0();
        m22190F0();
        l8m l8mVar = new l8m((Act) null);
        f19773B0 = l8mVar;
        l8mVar.k(App.e);
        SurveySparrowHelper.INSTANCE.m1602n();
        SVGALoader.INSTANCE.setSvgaGlobalCall(new C1172c());
        yni.h();
        yni.d(LaunchStep.PutongCreate);
    }

    /* JADX INFO: renamed from: n */
    public void m22202n() {
        yni.f(new LaunchStep[]{LaunchStep.PutongAsyncCreate});
        super.n();
        ooi0.a(App.e);
        k200.m17915c(App.e);
        dyd.a();
        m22200j0();
        k8c.m17989b(App.e);
        if (Build.VERSION.SDK_INT < 28 && ane0.v()) {
            rrv.a(App.e);
        }
        com.p1.mobile.putong.util.a.a();
        bc60.a();
        qqc0.m();
        yl5 yl5Var = f19805c0;
        if (yl5Var != null && !yl5Var.signedIn_()) {
            k0f0.m17882f().m17887i(App.e);
        }
        try {
            Integer num = (Integer) kmc0.k(UserHandle.class).b("myUserId").h();
            if (num.intValue() != 0) {
                zvf0.B("e_double_tantan_app", "", new j760[]{j760.a("my_user_handler", num)});
            }
        } catch (Throwable unused) {
        }
        yni.d(LaunchStep.PutongAsyncCreate);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m22203n0() {
        LaunchStep launchStep = LaunchStep.AccountAfterCreate;
        yni.f(new LaunchStep[]{launchStep, LaunchStep.InitSignData});
        f19812j0.n("account");
        yni.d(launchStep);
        if (!f19805c0.signedIn_()) {
            f19830w0.onNext(0);
            return;
        }
        LaunchStep launchStep2 = LaunchStep.InitOms;
        yni.f(new LaunchStep[]{launchStep2});
        m22112C0();
        LaunchStep launchStep3 = LaunchStep.InitOtherModule;
        yni.e(launchStep2, launchStep3);
        m22114D0();
        yni.d(launchStep3);
        m22166l0(false).toBlocking().f(mkd0.G(new e30() { // from class: l.bib0
            public final void call(Object obj) {
                this.f8921a.m22193K0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public void m22204o() {
        alj0.d().h(new Class[]{OutOfMemoryError.class});
        alj0.d().g(new ckq() { // from class: l.iib0
            /* JADX INFO: renamed from: a */
            public final boolean m16692a(Thread thread, Throwable th, boolean z) {
                return znj0.f(thread, th, z);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m22206w0() {
        yni.f(new LaunchStep[]{LaunchStep.InitAccountModule});
        e51.M(new Runnable() { // from class: l.xhb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27519a.m22194L0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m22205o0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void m22207x0() {
    }
}
