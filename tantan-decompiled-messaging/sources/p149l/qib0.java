package p149l;

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
import com.appsflyer.AppsFlyerLib;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.OtherApi;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.app.SQLDBDamagedException;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p046p1.mobile.putong.app.web.WebViewClientX;
import com.p046p1.mobile.putong.data.CommonAssetsSettings;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignOutParams;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.location.IntlLocationProvider;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.C13150a;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import com.tantanapp.beatles.safety.spwaitfix.C13560a;
import com.tantanapp.common.data.orm.DatabaseStore;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.C13662a;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class qib0 extends App {

    /* JADX INFO: renamed from: A */
    public static boolean f154679A = false;

    /* JADX INFO: renamed from: A0 */
    public static C22392a<j760<Boolean, Boolean>> f154680A0 = null;

    /* JADX INFO: renamed from: B */
    public static hpd0 f154681B = null;

    /* JADX INFO: renamed from: B0 */
    public static l8m f154682B0 = null;

    /* JADX INFO: renamed from: C */
    public static k850.C17954b f154683C = null;

    /* JADX INFO: renamed from: C0 */
    public static boolean f154684C0 = false;

    /* JADX INFO: renamed from: D */
    public static k850 f154685D = null;

    /* JADX INFO: renamed from: D0 */
    public static String f154686D0 = null;

    /* JADX INFO: renamed from: E */
    public static AbstractC13063a f154687E = null;

    /* JADX INFO: renamed from: E0 */
    public static hpd0 f154688E0 = null;

    /* JADX INFO: renamed from: F */
    public static o480 f154689F = null;

    /* JADX INFO: renamed from: F0 */
    public static final ag3<Integer> f154690F0;

    /* JADX INFO: renamed from: G */
    public static bkb0 f154691G = null;

    /* JADX INFO: renamed from: G0 */
    public static final boolean[] f154692G0;

    /* JADX INFO: renamed from: H */
    public static Network f154693H = null;

    /* JADX INFO: renamed from: I */
    public static xh5 f154694I = null;

    /* JADX INFO: renamed from: J */
    public static i95 f154695J = null;

    /* JADX INFO: renamed from: K */
    public static d6j0 f154696K = null;

    /* JADX INFO: renamed from: L */
    public static AccountTempApi f154697L = null;

    /* JADX INFO: renamed from: M */
    public static ya5 f154698M = null;

    /* JADX INFO: renamed from: N */
    public static OtherApi f154699N = null;

    /* JADX INFO: renamed from: O */
    public static pk8 f154700O = null;

    /* JADX INFO: renamed from: P */
    public static oj9 f154701P = null;

    /* JADX INFO: renamed from: Q */
    public static C18133l2 f154702Q = null;

    /* JADX INFO: renamed from: R */
    public static a3m f154703R = null;

    /* JADX INFO: renamed from: S */
    public static e70 f154704S = null;

    /* JADX INFO: renamed from: T */
    public static PaymentApi f154705T = null;

    /* JADX INFO: renamed from: U */
    public static yzv f154706U = null;

    /* JADX INFO: renamed from: V */
    public static lj5 f154707V = null;

    /* JADX INFO: renamed from: W */
    public static wb50 f154708W = null;

    /* JADX INFO: renamed from: X */
    public static gi5 f154709X = null;

    /* JADX INFO: renamed from: Y */
    public static AssetsSettingsBaseApi f154710Y = null;

    /* JADX INFO: renamed from: Z */
    public static f1j f154711Z = null;

    /* JADX INFO: renamed from: a0 */
    public static FacebookApi f154712a0 = null;

    /* JADX INFO: renamed from: b0 */
    public static nje0 f154713b0 = null;

    /* JADX INFO: renamed from: c0 */
    public static yl5 f154714c0 = null;

    /* JADX INFO: renamed from: d0 */
    public static volatile File f154715d0 = null;

    /* JADX INFO: renamed from: e0 */
    public static final Integer f154716e0;

    /* JADX INFO: renamed from: f0 */
    public static int f154717f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public static long f154718g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public static LiveRegionTag f154719h0 = null;

    /* JADX INFO: renamed from: i0 */
    public static v0f f154720i0 = null;

    /* JADX INFO: renamed from: j0 */
    public static u700 f154721j0 = null;

    /* JADX INFO: renamed from: k0 */
    public static ui5 f154722k0 = null;

    /* JADX INFO: renamed from: l0 */
    public static final C22392a<roj0> f154723l0;

    /* JADX INFO: renamed from: m0 */
    public static hpd0 f154724m0 = null;

    /* JADX INFO: renamed from: n0 */
    public static boolean f154725n0 = false;

    /* JADX INFO: renamed from: o0 */
    public static boolean f154726o0 = false;

    /* JADX INFO: renamed from: p0 */
    public static az6 f154727p0 = null;

    /* JADX INFO: renamed from: q0 */
    public static C22392a<Long> f154728q0 = null;

    /* JADX INFO: renamed from: r0 */
    public static C22392a<Long> f154729r0 = null;

    /* JADX INFO: renamed from: s */
    public static String f154730s = "7.2.7";

    /* JADX INFO: renamed from: s0 */
    public static C22392a<roj0> f154731s0 = null;

    /* JADX INFO: renamed from: t */
    public static int f154732t = 3727000;

    /* JADX INFO: renamed from: t0 */
    public static boolean f154733t0 = false;

    /* JADX INFO: renamed from: u */
    public static boolean f154734u = true;

    /* JADX INFO: renamed from: u0 */
    public static boolean f154735u0 = false;

    /* JADX INFO: renamed from: v */
    public static boolean f154736v = true;

    /* JADX INFO: renamed from: v0 */
    public static C22392a<roj0> f154737v0;

    /* JADX INFO: renamed from: w0 */
    public static final C22392a<Integer> f154739w0;

    /* JADX INFO: renamed from: x0 */
    public static long f154741x0;

    /* JADX INFO: renamed from: y0 */
    public static String f154743y0;

    /* JADX INFO: renamed from: z0 */
    public static C22392a<roj0> f154745z0;

    /* JADX INFO: renamed from: r */
    public k850 f154746r;

    /* JADX INFO: renamed from: w */
    public static zpd0 f154738w = new zpd0("app_install_time", 0L);

    /* JADX INFO: renamed from: x */
    public static uqd0 f154740x = new uqd0("debug_version_", "7.2.7", false);

    /* JADX INFO: renamed from: y */
    public static tpd0 f154742y = new tpd0("debug_plugin_version", -1, false);

    /* JADX INFO: renamed from: z */
    public static uqd0 f154744z = new uqd0("debug_x_tantan_dev_env", "", false);

    /* JADX INFO: renamed from: l.qib0$a */
    public class C19508a implements tsl {

        /* JADX INFO: renamed from: a */
        public k850 f154747a;

        public C19508a() {
        }

        @Override // p149l.tsl
        /* JADX INFO: renamed from: a */
        public k850 mo174860a() {
            k850.C17954b c17954b;
            if (this.f154747a == null && (c17954b = qib0.f154683C) != null) {
                this.f154747a = c17954b.m144882c();
            }
            return this.f154747a;
        }
    }

    /* JADX INFO: renamed from: l.qib0$b */
    public class C19509b implements r3e {
        public C19509b() {
        }

        @Override // p149l.r3e
        /* JADX INFO: renamed from: a */
        public void mo174861a(long j, WarningLevel warningLevel) {
            if (warningLevel == WarningLevel.URGENT_ALERT) {
                new g3e().m124254j(Act.foreground_() == null ? null : Act.foreground_().f15343a.get());
            }
        }
    }

    /* JADX INFO: renamed from: l.qib0$c */
    public class C19510c implements SVGALoader.SvgaGlobalCall {
        public C19510c() {
        }

        @Override // com.tantan.library.svga.SVGALoader.SvgaGlobalCall
        @NonNull
        public String replaceSource(@NonNull String str) {
            return uel.INSTANCE.m193267c(str);
        }
    }

    /* JADX INFO: renamed from: l.qib0$d */
    public class C19511d implements MessageQueue.IdleHandler {
        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            if (Act.foreground_() == null) {
                return true;
            }
            Objects.toString(Act.foreground_());
            qib0.m174831s0();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.qib0$e */
    public class C19512e implements C13662a.e {
        @Override // com.tantanapp.media.proxy.api.C13662a.e
        /* JADX INFO: renamed from: a */
        public void mo81387a(String str, long j, PreloadTaskInfo preloadTaskInfo) {
            ad20.m95853b().mo95854a(C21276y1.m212127g(preloadTaskInfo));
        }

        @Override // com.tantanapp.media.proxy.api.C13662a.e
        /* JADX INFO: renamed from: b */
        public void mo81388b(String str, long j, PreloadTaskInfo preloadTaskInfo) {
            ad20.m95853b().mo95854a(C21276y1.m212127g(preloadTaskInfo));
        }
    }

    /* JADX INFO: renamed from: l.qib0$f */
    public class C19513f implements e30<roj0> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            User userMe_ = qib0.f154714c0.me_();
            if (!NullChecker.m81304b(userMe_)) {
                du2.m113670a("[putong-common][userMeState]", "userMeCallPrepareNewSignIn but me still null");
                qib0.f154739w0.onNext(2);
            } else {
                qib0.m174786O0(userMe_);
                qib0.f154739w0.onNext(1);
                du2.m113670a("[putong-common][userMeState]", "USER_ME_STATE_SUCCESS from userMeCallPrepareNewSignIn");
            }
        }
    }

    /* JADX INFO: renamed from: l.qib0$g */
    public class C19514g implements e30<Throwable> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            du2.m113670a("[putong-common][userMeState]", "userMeCallPrepareNewSignIn with error: " + th);
            qib0.f154739w0.onNext(2);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f154681B = new hpd0("has_show_privacy_policy_dlg", bool);
        f154716e0 = 0;
        f154719h0 = LiveRegionTag.get("unknown_");
        f154723l0 = C22392a.m221512b();
        f154724m0 = new hpd0("has_pre_load_when_sign_in", bool);
        f154728q0 = C22392a.m221512b();
        f154729r0 = C22392a.m221512b();
        f154731s0 = C22392a.m221512b();
        f154733t0 = false;
        f154735u0 = false;
        f154737v0 = C22392a.m221512b();
        f154739w0 = C22392a.m221512b();
        f154741x0 = -1L;
        f154743y0 = "";
        f154745z0 = C22392a.m221512b();
        f154680A0 = C22392a.m221513c(j760.m140076a(bool, bool));
        f154682B0 = null;
        f154684C0 = false;
        f154686D0 = "";
        f154688E0 = new hpd0("android_network_metrics", bool);
        f154690F0 = new ag3.C15608d(0, 500);
        f154692G0 = new boolean[]{false};
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m174766B(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Boolean m174767C(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public static void m174768C0() {
        ic50.m135327j().m135329b();
        ABManager.m29358q().first().subscribe(mkd0.m154955G(new e30() { // from class: l.thb0
            @Override // p149l.e30
            public final void call(Object obj) {
                ic50.m135327j().m135342p(qib0.f154679A);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m174770D0() {
        if (f154726o0) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.uhb0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.m174778J();
            }
        });
        f154726o0 = true;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m174772E0() {
        RemoteConfig.m79284Y().filter(new w9j() { // from class: l.jhb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.lhb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174804Z((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ stc0 m174773F(boolean z) {
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("clientId", "100032");
            jsonObject.add(Device.TYPE, new JsonParser().parse(pk8.m169980M().toJson()).getAsJsonObject());
            jsonObject.addProperty("type", z ? "switch-account" : "default");
        } catch (Exception unused) {
        }
        return f154693H.auth().m185898q(xh5.m208754b("/signout")).m185893l(utc0.create(Network.JSON, jsonObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: G0 */
    public static void m174775G0() {
        RemoteConfig.m79284Y().filter(new w9j() { // from class: l.rhb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.shb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174776H((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m174776H(RemoteConfig.ConfigStep configStep) {
        if (RemoteConfig.m79298x().m79330s("hook_sp_wait_apply")) {
            try {
                new C13560a(App.f15369e).m81182a();
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
                th.getMessage();
            }
        }
        e51.m114742G(new Runnable() { // from class: l.hib0
            @Override // java.lang.Runnable
            public final void run() {
                pt2.m171276j();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m174778J() {
        Iterator<String> it = c1i0.f78277c.iterator();
        while (it.hasNext()) {
            f154721j0.m192066t(it.next());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: J0 */
    public static boolean m174779J0() {
        u700 u700Var = f154721j0;
        return (u700Var == null || u700Var.f174908b.m221515e() == null) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m174780K(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            f154684C0 = RemoteConfig.m79298x().m79330s("android_sign_out_keep_db");
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static void m174783M0(final boolean z) {
        f154694I.now(ia20.m135117a(new v9j() { // from class: l.oib0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.m174773F(z);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m174785O() {
        exc0 exc0VarExecute = null;
        try {
            try {
                try {
                    exc0VarExecute = f154685D.mo144849a(f154693H.basic().m185898q("https://client-tracking.tantanapp.com/?deviceToken=" + dyd.m114055a() + "&channel=" + mr4.f135329a).m185888g().m185883b()).execute();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        } finally {
            t95.m187604b(exc0VarExecute);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static void m174786O0(User user) {
        jkb0.m141853w(user);
        ABManager.m29334a0();
        f154724m0.put(Boolean.TRUE);
        m174811c1();
        dyd.f88364a.first().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.mhb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174787P(obj);
            }
        }));
        LaunchStep launchStep = LaunchStep.OmsParse;
        yni.m215417f(launchStep);
        ic50.m135327j().m135328a();
        yni.m215415d(launchStep);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m174787P(Object obj) {
        if (f154714c0.signedIn_()) {
            m174798V0();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m174789R(Notification notification) {
        if (notification.m221298i()) {
            m174827q0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static void m174790R0() {
        e51.m114774y(new Runnable() { // from class: l.yhb0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.m174785O();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ roj0 m174791S(Class cls, SignOutParams signOutParams) {
        ABManager.m29340d0();
        ix50.m138790b().m138791a();
        if (NullChecker.m81303a(cls)) {
            Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Iterator<Act.C4299r> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    Activity activity = it2.next().f15343a.get();
                    if (NullChecker.m81303a(activity) && (activity instanceof Act) && f154714c0.getSignOutJumpAct().isInstance(activity)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                Intent intent = new Intent(App.f15369e, (Class<?>) cls);
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
                App.f15369e.startActivity(intent);
            }
            HashMap<Integer, ArrayList<Act.C4299r>> mapGlobalLifeCycle_ = Act.globalLifeCycle_();
            ArrayList arrayList = new ArrayList();
            Iterator<ArrayList<Act.C4299r>> it3 = mapGlobalLifeCycle_.values().iterator();
            while (it3.hasNext()) {
                Iterator<Act.C4299r> it4 = it3.next().iterator();
                while (it4.hasNext()) {
                    final Activity activity2 = it4.next().f15343a.get();
                    if (NullChecker.m81303a(activity2) && (activity2 instanceof Act) && !f154714c0.getSignOutJumpAct().isInstance(activity2)) {
                        arrayList.add(((Act) activity2).lifecycle().filter(new w9j() { // from class: l.cib0
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
                            }
                        }).timeout(10L, TimeUnit.SECONDS).materialize().map(new w9j() { // from class: l.dib0
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return qib0.m174802Y(activity2, (Notification) obj);
                            }
                        }).first());
                    }
                }
            }
            if (arrayList.size() > 0) {
                mkd0.m154982p(arrayList, new faj() { // from class: l.eib0
                    @Override // p149l.faj
                    public final Object call(Object[] objArr) {
                        return roj0.f160388a;
                    }
                }).materialize().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.fib0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.m174789R((Notification) obj);
                    }
                }));
            } else {
                m174827q0();
            }
        } else {
            m174827q0();
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: S0 */
    public static void m174792S0(@NonNull String str) {
        if (ConnectivityReceiver.m81289l()) {
            m174825p0();
            C13662a.m81371p().m81383w(Uri.parse(str), C13662a.f56143l);
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m174793T(sw0 sw0Var) {
        try {
            if (NullChecker.m81303a(sw0Var) && NullChecker.m81303a(sw0Var.m186121g())) {
                Uri uriM186121g = sw0Var.m186121g();
                String queryParameter = uriM186121g.getQueryParameter("liveId");
                if (!TextUtils.isEmpty(queryParameter) || "/square".equals(uriM186121g.getPath())) {
                    isd.f114750a.put(queryParameter);
                    isd.f114751b.put(Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m174794T0(List<String> list) {
        if (ConnectivityReceiver.m81289l()) {
            m174825p0();
            C13662a.m81371p().m81384x(list);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ C22306c m174795U(boolean z, roj0 roj0Var) {
        ipd0 ipd0Var = f154697L.f17143a;
        Boolean bool = Boolean.TRUE;
        ipd0Var.mo137472h(bool);
        m174814e0(true, true);
        m174798V0();
        User userMe_ = f154714c0.me_();
        f154699N.tryMarkAsDAU();
        jkb0.m141853w(userMe_);
        m174811c1();
        f154724m0.put(bool);
        ic50.m135327j().m135328a();
        if (z) {
            xgw.m208712n(userMe_.f56011id);
        } else {
            xgw.m208709k(userMe_.f56011id);
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m174796U0(@NonNull String str) {
        m174825p0();
        C13662a.m81371p().m81383w(Uri.parse(str), C13662a.f56143l);
    }

    /* JADX INFO: renamed from: V0 */
    public static void m174798V0() {
        e51.m114774y(new Runnable() { // from class: l.nhb0
            @Override // java.lang.Runnable
            public final void run() {
                TantanApp.f17180c.m214260Y().flatMap(new w9j() { // from class: l.zhb0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return qib0.f154700O.m169991Q(TantanApp.f17180c.m214273y()).compose(mkd0.m154951C()).materialize().take(1);
                    }
                }).compose(mkd0.m154962N()).subscribe();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C22306c m174800X(boolean z, final Class cls, final boolean z2, final boolean z3, roj0 roj0Var) {
        return z ? m174823m0(new v9j() { // from class: l.chb0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.m174809b1(cls, z2, AccountTempApi.InactiveType.None, z3);
            }
        }) : m174809b1(cls, z2, AccountTempApi.InactiveType.None, z3);
    }

    /* JADX INFO: renamed from: X0 */
    public static void m174801X0(String str, String str2) {
        w1n.m200938c(App.f15369e).mo108691a(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Notification m174802Y(Activity activity, Notification notification) {
        if (notification.m221299j()) {
            CrashHelper.m81296c(new RuntimeException("activity did not Destroy in 10:" + activity));
        }
        return notification;
    }

    /* JADX INFO: renamed from: Y0 */
    public static C22306c<roj0> m174803Y0(final boolean z, final Class cls, final boolean z2, boolean z3, final boolean z4) {
        m174783M0(z3);
        return f154694I.now(f154721j0.m192057E().flatMap(new w9j() { // from class: l.khb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174800X(z, cls, z2, z4, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m174804Z(RemoteConfig.ConfigStep configStep) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (RemoteConfig.m79298x().m79330s("del_or_hidden_entrance_switch") || !f154714c0.signedIn_()) {
            return;
        }
        CrashHelper.m81296c(new RuntimeException("RemoteConfig del_or_hidden_entrance_switch =false, cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime)));
    }

    /* JADX INFO: renamed from: Z0 */
    public static C22306c<roj0> m174805Z0(boolean z, boolean z2) {
        return m174803Y0(z, f154714c0.getSignOutJumpAct(), false, false, z2);
    }

    /* JADX INFO: renamed from: a1 */
    public static C22306c<roj0> m174807a1(final Class cls, final SignOutParams signOutParams) {
        return C22306c.fromCallable(new Callable() { // from class: l.dhb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qib0.m174791S(cls, signOutParams);
            }
        }).compose(mkd0.m154966R());
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m174808b0(CommonAssetsSettings commonAssetsSettings) {
        m174825p0();
        x1l0.m206744n().m206754v();
    }

    /* JADX INFO: renamed from: b1 */
    public static C22306c<roj0> m174809b1(Class cls, boolean z, AccountTempApi.InactiveType inactiveType, boolean z2) {
        return m174807a1(cls, new SignOutParams(z, inactiveType, false, z2));
    }

    /* JADX INFO: renamed from: c1 */
    public static void m174811c1() {
        WebSocketManager.m29423Q().m29481o0();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m174812d0(String str) {
        if (!str.startsWith("http")) {
            return str;
        }
        m174825p0();
        return C13662a.m81371p().m81377q(str);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m174813d1() {
        TantanApp.f17180c.m214266e0();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m174814e0(boolean z, boolean z2) {
        f154679A = z;
        LaunchStep launchStep = LaunchStep.InitCommonInfo;
        yni.m215417f(launchStep);
        m174843z0(z);
        LaunchStep launchStep2 = LaunchStep.NotifySignIn;
        yni.m215416e(launchStep, launchStep2);
        f154721j0.m192062o(z2);
        LaunchStep launchStep3 = LaunchStep.NotifyAllSignIn;
        yni.m215416e(launchStep2, launchStep3);
        f154721j0.m192060m();
        f154737v0.observeOn(Schedulers.m221493io()).subscribe(mkd0.m154955G(new e30() { // from class: l.phb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154721j0.m192063p();
            }
        }));
        LaunchStep launchStep4 = LaunchStep.WebpCall;
        yni.m215416e(launchStep3, launchStep4);
        pgm.m168762i(new v9j() { // from class: l.qhb0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(wc40.m202626c());
            }
        });
        yni.m215415d(launchStep4);
    }

    /* JADX INFO: renamed from: e1 */
    public static void m174815e1(String str, Object... objArr) {
        w1n.m200938c(App.f15369e).mo108692b(str, objArr);
    }

    /* JADX INFO: renamed from: f0 */
    public static C22306c<roj0> m174816f0() {
        return m174818g0(false);
    }

    /* JADX INFO: renamed from: f1 */
    public static void m174817f1() {
        m174816f0().take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new C19513f(), new C19514g()));
    }

    /* JADX INFO: renamed from: g0 */
    public static C22306c<roj0> m174818g0(final boolean z) {
        if (f154728q0.m221515e() == null) {
            f154728q0.onNext(Long.valueOf(SystemClock.elapsedRealtime()));
        }
        m174813d1();
        f154693H.resetNetworkControlParams();
        m174768C0();
        m174770D0();
        du2.m113670a("[putong-common][userMeState]", "callPrepareNewSignIn:isSignUp " + z);
        return f154721j0.f174912f.take(1).observeOn(FastIoScheduler.f15630b).flatMap(new w9j() { // from class: l.pib0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174822l0(true);
            }
        }).observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.ahb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154721j0.m192056D();
            }
        }).flatMap(new w9j() { // from class: l.bhb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174795U(z, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static void m174819h0() {
        if (f154733t0) {
            return;
        }
        f154733t0 = true;
        Looper.getMainLooper().getQueue().addIdleHandler(new C19511d());
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m174820i0() {
        int iIsGooglePlayServicesAvailable;
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(App.f15369e);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            iIsGooglePlayServicesAvailable = 1;
        }
        return iIsGooglePlayServicesAvailable == 0;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m174821k0() {
        WebSocketManager.m29423Q().m29450H();
    }

    /* JADX INFO: renamed from: l0 */
    public static C22306c<roj0> m174822l0(final boolean z) {
        yni.m215417f(LaunchStep.InitOtherDb);
        du2.m113670a(DatabaseStore.TAG, "dbInit");
        return C22306c.just(roj0.f160388a).map(new w9j() { // from class: l.fhb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(qib0.m174837v0(z, new d30() { // from class: l.jib0
                    @Override // p149l.d30
                    public final void call() {
                        qib0.m174824p();
                    }
                }));
            }
        }).filter(new w9j() { // from class: l.ghb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174767C((Boolean) obj);
            }
        }).map(new w9j() { // from class: l.hhb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static C22306c<roj0> m174823m0(final v9j<C22306c<roj0>> v9jVar) {
        return f154694I.now(f154700O.m169989O().materialize().first().compose(mkd0.m154951C())).flatMap(new w9j() { // from class: l.ihb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174839x(v9jVar, (Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m174824p() {
        m174841y0();
        f154721j0.m192064q();
        yni.m215415d(LaunchStep.InitOtherDb);
        du2.m113670a(DatabaseStore.TAG, "dbInit done");
    }

    /* JADX INFO: renamed from: p0 */
    public static void m174825p0() {
        File fileM174833t0 = m174833t0();
        if (App.f15370f) {
            boolean[] zArr = f154692G0;
            if (zArr[0]) {
                return;
            }
            synchronized (zArr) {
                try {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        TTMediaProxy.setAppContext(App.f15369e);
                        C13662a.m81370n(-1, 200L, -1L, -1L, true);
                        C13662a.m81371p().m81386z(fileM174833t0.getPath(), 500L);
                        C13662a.m81371p().m81373k(new C19512e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m174826q() {
        try {
            dyd.m114056b();
        } catch (Exception e) {
            CrashHelper.m81300g(e);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m174827q0() {
        m174821k0();
        TantanApp.f17180c.m214264c0();
        f154721j0.m192054B();
        hpd0 hpd0Var = f154705T.retryRestore;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        f8c.m119878o().m119889k(false);
        ABManager.m29327U();
        m850.m153455i().m153458f(true);
        f154714c0.signOut();
        f154697L.f17143a.mo137472h(bool);
        f154724m0.put(bool);
        IntlCountryCodeController.m28128x();
        IntlCountryCodeController.m28127w();
        f154705T.retryRestore.put(bool);
        ABManager.m29326T();
        f154693H.resetNetworkControlParams();
        ABManager.m29330X(false);
        ABManager.m29331Y(false);
        f154693H.invalidHashAccount();
        ABManager.m29342e0(0);
        f154702Q.m148246T();
        f154741x0 = -1L;
        djx.m112144h().m112152i();
        kkh0.m146327g();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m174829r0(final Runnable runnable, boolean z) {
        f154737v0.take(1).observeOn(z ? jo0.m142408a() : Schedulers.m221493io()).subscribe(mkd0.m154955G(new e30() { // from class: l.vhb0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static void m174831s0() {
        if (f154735u0) {
            return;
        }
        f154735u0 = true;
        f154737v0.onNext(roj0.f160388a);
        if (f154733t0) {
            return;
        }
        CrashHelper.m81296c(new RuntimeException("finishColdStart with checkFinishColdStart = false"));
    }

    /* JADX INFO: renamed from: t0 */
    public static File m174833t0() {
        if (f154715d0 == null) {
            synchronized (f154716e0) {
                try {
                    if (f154715d0 == null) {
                        f154715d0 = e51.m114770u("media");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f154715d0;
    }

    /* JADX INFO: renamed from: u0 */
    public static long m174835u0() {
        return Math.max(0L, xsi0.m210767h() - f154718g0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m174836v(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            djx.m112144h().m112154k(RemoteConfig.m79298x().m79302F("community_optimization_long_graphic"));
            djx.m112144h().m112153j(RemoteConfig.m79298x().m79302F("post_video_config"));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m174837v0(boolean z, d30 d30Var) {
        try {
            d30Var.call();
            return true;
        } catch (SQLDBDamagedException | DBCorruptException e) {
            CrashHelper.m81296c(new RuntimeException("DBCorruptException on onAllModuleLoadedWhenAlreadySignedIn: " + z, e));
            du2.m113670a("[putong-common][userMeState]", "Catch DBCorruptException and callPrepareNewSignIn");
            if (z || (e instanceof SQLDBDamagedException)) {
                try {
                    f8c.m119878o().m119888j();
                } catch (Exception e2) {
                    CrashHelper.m81296c(e2);
                }
                throw e;
            }
            if (TextUtils.isEmpty(f154714c0.userId())) {
                m174805Z0(false, false);
            } else {
                m174817f1();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ C22306c m174839x(v9j v9jVar, Notification notification) {
        return (C22306c) v9jVar.call();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m174841y0() {
        f8c.m119878o().m119895s();
        ui5 ui5Var = f154722k0;
        if (ui5Var != null) {
            ui5Var.mo100767i();
        }
        ui5 ui5Var2 = new ui5();
        f8c.m119878o().m119901y(ui5Var2);
        f154722k0 = ui5Var2;
        f154723l0.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m174843z0(boolean z) {
        String strUserId = f154714c0.userId();
        if (!TextUtils.isEmpty(strUserId)) {
            zpd0 zpd0Var = new zpd0("use_first_login_local_time_" + strUserId, -1L);
            if (!z) {
                if (zpd0Var.get().longValue() == -1) {
                    zpd0Var.put(-1000L);
                }
                f154741x0 = zpd0Var.get().longValue();
            } else if (zpd0Var.get().longValue() > 0 || zpd0Var.get().longValue() == -1000) {
                f154741x0 = zpd0Var.get().longValue();
            } else {
                long jM155944o = mqi0.m155944o();
                f154741x0 = jM155944o;
                zpd0Var.put(Long.valueOf(jM155944o));
            }
        }
        s6r.m182454a().m182457d(new vj5());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m174844A0() {
        RemoteConfig.m79284Y().subscribe(mkd0.m154955G(new e30() { // from class: l.ehb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174836v((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m174845B0() {
        if (i0c.m133754a()) {
            i0c.m133758e(App.f15369e, i0c.m133757d());
        }
        WebViewClientX.setEnableWebViewDNS(i0c.m133755b());
    }

    /* JADX INFO: renamed from: F0 */
    public final void m174846F0() {
        RemoteConfig.m79284Y().subscribe(mkd0.m154955G(new e30() { // from class: l.ohb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174780K((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m174847H0() {
        try {
            zvf0.m220372E(new C19508a());
            String str = mr4.f135332d;
            if (str == null) {
                str = "";
            }
            zvf0.m220388j(App.f15369e, "putong", "release", true, str, "7.2.7");
        } catch (Throwable th) {
            CrashHelper.m81300g(th);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m174848I0() {
        LaunchStep launchStep = LaunchStep.FbSdk;
        yni.m215417f(launchStep);
        C1577c.m8034N("518254421109380");
        C1577c.m8032L(App.f15369e.getApplicationContext());
        AppEventsLogger.m7641a(App.f15369e);
        AppsFlyerLib.getInstance().init("dmfeSDkpVxP8m6Ys6yJCpn", null, App.f15369e);
        if (IntlCountryCodeController.m28115k()) {
            AppsFlyerLib.getInstance().setOutOfStore("hms_store_source");
        }
        AppsFlyerLib.getInstance().start(App.f15369e);
        f154712a0 = new FacebookApi();
        C1577c.m8035O(true);
        C1577c.m8045j();
        sw0.m186117d(App.f15369e, new sw0.InterfaceC20042b() { // from class: l.whb0
            @Override // p149l.sw0.InterfaceC20042b
            /* JADX INFO: renamed from: a */
            public final void mo186122a(sw0 sw0Var) {
                qib0.m174793T(sw0Var);
            }
        });
        yni.m215415d(launchStep);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m174849K0(roj0 roj0Var) {
        m174851N0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m174850L0() {
        LaunchStep launchStep = LaunchStep.InitAccountModule;
        LaunchStep launchStep2 = LaunchStep.AccountModuleInject;
        yni.m215416e(launchStep, launchStep2);
        f154721j0.m192066t(SchemeKey.account);
        LaunchStep launchStep3 = LaunchStep.DoAccountInit;
        yni.m215416e(launchStep2, launchStep3);
        m174856n0();
        yni.m215415d(launchStep3);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m174851N0() {
        LaunchStep launchStep = LaunchStep.InitSignData;
        LaunchStep launchStep2 = LaunchStep.SignedStep;
        yni.m215416e(launchStep, launchStep2);
        this.f15382a = f154714c0.userId();
        try {
            m174814e0(false, !f154724m0.get().booleanValue());
            yni.m215415d(launchStep2);
            LaunchStep launchStep3 = LaunchStep.InitMe;
            yni.m215417f(launchStep3);
            User userMe_ = f154714c0.me_();
            LaunchStep launchStep4 = LaunchStep.InitMeSuccess;
            yni.m215416e(launchStep3, launchStep4);
            m174786O0(userMe_);
            LaunchStep launchStep5 = LaunchStep.NotifyMeSuccess;
            yni.m215416e(launchStep4, launchStep5);
            f154739w0.onNext(1);
            yni.m215415d(launchStep5);
        } catch (SQLDBDamagedException e) {
            CrashHelper.m81296c(e);
            try {
                f8c.m119878o().m119888j();
            } catch (Exception e2) {
                CrashHelper.m81296c(e2);
            }
            m174817f1();
        } catch (DBCorruptException e3) {
            CrashHelper.m81296c(new RuntimeException("DBCorruptException on onAllModuleLoadedWhenAlreadySignedIn", e3));
            du2.m113670a("[putong-common][userMeState]", "Catch DBCorruptException and callPrepareNewSignIn");
            m174817f1();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m174852P0() {
        du2.m113670a("[putong-common]", "onLowMemory");
        if (NullChecker.m81303a(f154691G)) {
            f154691G.m184716d(80);
        }
        f154721j0.m192053A();
        shw.m184305y();
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m174853Q0(int i) {
        du2.m113670a("[putong-common]", "onTrimMemory level=" + i);
        if (NullChecker.m81303a(f154691G)) {
            f154691G.m184716d(i);
        }
        f154721j0.m192055C(i);
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m174854W0() {
        f154687E = new IntlLocationProvider();
    }

    @Override // com.p046p1.mobile.android.app.App
    /* JADX INFO: renamed from: d */
    public void mo20431d() {
        super.mo20431d();
        x8i0.m207417a(new Runnable() { // from class: l.aib0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.m174826q();
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m174855j0() {
        try {
            rhi.m179358b(e51.m114771v(".media_cache"));
        } catch (IOException | IllegalArgumentException unused) {
        }
        try {
            rhi.m179358b(e51.m114770u(".media"));
        } catch (IOException | IllegalArgumentException unused2) {
        }
    }

    @Override // com.p046p1.mobile.android.app.App
    /* JADX INFO: renamed from: m */
    public void mo20435m() {
        yni.m215420i();
        yni.m215417f(LaunchStep.PutongCreate, LaunchStep.PuginInit, LaunchStep.PutongArriveImgload, LaunchStep.PutongArriveImgloadNoAd);
        TantanApp.f17180c = new ydb0();
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                ZipPathValidator.clearCallback();
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }
        yni.m215415d(LaunchStep.PuginInit);
        LaunchStep launchStep = LaunchStep.BaseAppInit;
        yni.m215417f(launchStep);
        super.mo20435m();
        LaunchStep launchStep2 = LaunchStep.OneIdInit;
        yni.m215416e(launchStep, launchStep2);
        sh50.m184158c();
        au2.m98933u();
        rpq.m180387b().m180391e(CommonData.JSON_ADAPTER, null);
        yni.m215416e(launchStep2, LaunchStep.NetworkInit);
        if (!App.f15370f) {
            m174847H0();
            return;
        }
        lsm.m151597a(App.f15369e);
        f154713b0 = new nje0();
        f154714c0 = new am5();
        f154721j0 = u700.m192052r();
        v0f v0fVar = new v0f();
        f154720i0 = v0fVar;
        v0fVar.m196494b();
        try {
            i95.m135006B();
        } catch (Exception e) {
            CrashHelper.m81300g(e);
        }
        try {
            ConnectivityReceiver.m81291n(App.f15369e);
        } catch (Exception e2) {
            CrashHelper.m81300g(e2);
        }
        m174859x0();
        if (f154688E0.get().booleanValue()) {
            NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
            networkMetricsStatistics.m18179g(App.f15369e, new ru5("Tantantribe", f154730s, new Function0() { // from class: l.gib0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qib0.f154714c0.userId();
                }
            }, null, null, null));
            networkMetricsStatistics.m18174b();
        }
        k850.C17954b c17954b = new k850.C17954b();
        f154683C = c17954b;
        c17954b.m144880a(new vel());
        f154683C.m144889j(m850.m153455i());
        try {
            m174857o0();
            k850.C17954b c17954bM219951a = zri0.m219951a(f154683C);
            f154683C = c17954bM219951a;
            k850.C17954b c17954bM29343f = ABManager.m29343f(c17954bM219951a);
            f154683C = c17954bM29343f;
            f154683C = d6j0.m110168a(c17954bM29343f);
            f154696K = new d6j0();
            f154683C = au2.m98924l(f154683C);
        } catch (Exception e3) {
            CrashHelper.m81300g(e3);
        }
        if (f154688E0.get().booleanValue()) {
            f154683C.m144891l(new ec20(new owv.C19064b(), null));
        } else {
            f154683C.m144891l(new owv.C19064b());
        }
        this.f154746r = f154683C.m144882c();
        f154685D = f154683C.m144882c();
        Network network = new Network(f154685D.m144867v());
        f154693H = network;
        xh5.network = network;
        if (App.f15373i.get().intValue() == 1 && f154738w.get().longValue() == 0) {
            f154738w.put(Long.valueOf(mqi0.m155944o()));
        }
        m174847H0();
        zvf0.m220381c();
        zvf0.m220377J();
        au2.m98937y();
        yni.m215416e(LaunchStep.NetworkInit, LaunchStep.BaseApi);
        try {
            uve0.m196064e(App.f15369e);
        } catch (Exception e4) {
            CrashHelper.m81300g(e4);
        }
        f154694I = new xh5();
        f154697L = new AccountTempApi();
        f154734u = !f154714c0.signedIn_();
        f154695J = new i95();
        f154698M = new ya5();
        f154699N = new OtherApi();
        f154702Q = new C18133l2();
        f154705T = new PaymentApi();
        f154706U = new yzv(f154694I);
        f154707V = new lj5(f154694I);
        f154700O = new pk8(f154694I);
        f154701P = new oj9(f154694I);
        f154727p0 = new az6(f154694I);
        f154708W = new wb50();
        f154709X = new gi5();
        AssetsSettingsBaseApi.m29402H(AssetsSettingsBaseApi.Module.COMMON, 2);
        f154710Y = new AssetsSettingsBaseApi();
        f154711Z = new f1j();
        f154703R = new vhe0();
        f154704S = new e70();
        yni.m215416e(LaunchStep.BaseApi, LaunchStep.BaseApiV2);
        kkh0.m146325e();
        kkh0.m146326f(App.f15369e);
        f154689F = new o480();
        m174854W0();
        try {
            m174848I0();
        } catch (Exception e5) {
            CrashHelper.m81300g(e5);
        }
        if (App.m20428h()) {
            e51.m114743H(App.f15369e, new Runnable() { // from class: l.kib0
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.m174790R0();
                }
            }, 100L);
        }
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.lib0
            @Override // java.lang.Runnable
            public final void run() {
                qib0.f154695J.m135011C();
            }
        }, 1000L);
        LaunchStep launchStep3 = LaunchStep.BaseApiV2;
        LaunchStep launchStep4 = LaunchStep.ImageLoad;
        yni.m215416e(launchStep3, launchStep4);
        f154691G = new bkb0(this.f154746r.m144867v());
        LaunchStep launchStep5 = LaunchStep.LocationMap;
        yni.m215416e(launchStep4, launchStep5);
        m174813d1();
        sh50.m184161f();
        jkb0.m141840j();
        NotificationCheckerCommon.m79221b();
        tan.m187745f();
        yni.m215416e(launchStep5, LaunchStep.AbLocalInit);
        f154709X.m95174d().observeOn(Schedulers.m221493io()).subscribe(mkd0.m154956H(new e30() { // from class: l.mib0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174808b0((CommonAssetsSettings) obj);
            }
        }, new e30() { // from class: l.nib0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174766B((Throwable) obj);
            }
        }));
        ABManager.m29363x();
        m174845B0();
        if (f154714c0.signedIn_()) {
            f154725n0 = false;
            jkb0.m141852v(f154714c0.userId(), jkb0.m141843m().get().intValue());
            xgw.m208707i();
            f154702Q.m148250a0();
        } else {
            f154725n0 = true;
            f154702Q.m148246T();
            xgw.m208707i();
        }
        f154718g0 = xsi0.m210767h();
        zvf0.m220371D("e_backend_application_create", "", new j760(Device.IMEI, PermissionHelper.m79881b("android.permission.READ_PHONE_STATE") ? dyd.m114059e() : ""), new j760("imei2", PermissionHelper.m79881b("android.permission.READ_PHONE_STATE") ? dyd.m114060f() : ""), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, PermissionHelper.m79881b("android.permission.READ_PHONE_STATE") ? dyd.m114061g() : ""), new j760("androidid", dyd.m114056b()));
        pdq0.m168391b();
        zvf0.m220371D("e_dark_mode_auth_status", "", new j760("dark_mode_status", (App.f15369e.getResources().getConfiguration().uiMode & 48) == 32 ? "on" : BLiveOperationTitleShowType.off));
        q100.m172367b("fonts/Roboto-Medium.ttf");
        jhp0.m141544h().m141546f();
        jkb0.m141846p();
        try {
            au2.m98931s(App.f15369e);
        } catch (Exception e6) {
            CrashHelper.m81300g(e6);
        }
        LaunchStep launchStep6 = LaunchStep.AbLocalInit;
        LaunchStep launchStep7 = LaunchStep.RemoteLocalInit;
        yni.m215416e(launchStep6, launchStep7);
        m174775G0();
        m174772E0();
        t660.m187361c();
        LaunchStep launchStep8 = LaunchStep.PrivacyConfig;
        yni.m215416e(launchStep7, launchStep8);
        LaunchStep launchStep9 = LaunchStep.MkParse;
        yni.m215416e(launchStep8, launchStep9);
        c400.m105182j(App.f15369e);
        LaunchStep launchStep10 = LaunchStep.AccountPluginInit;
        yni.m215416e(launchStep9, launchStep10);
        m174858w0();
        LaunchStep launchStep11 = LaunchStep.PutongOnNext;
        yni.m215416e(launchStep10, launchStep11);
        f154731s0.onNext(roj0.f160388a);
        LaunchStep launchStep12 = LaunchStep.DiskCheck;
        yni.m215416e(launchStep11, launchStep12);
        new s3e.C19842b().m182149c(204800L, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m182147a(new C19509b()).m182148b().m182146c();
        yni.m215415d(launchStep12);
        m174844A0();
        m174846F0();
        l8m l8mVar = new l8m(null);
        f154682B0 = l8mVar;
        l8mVar.m148935k(App.f15369e);
        SurveySparrowHelper.INSTANCE.m29692n();
        SVGALoader.INSTANCE.setSvgaGlobalCall(new C19510c());
        yni.m215419h();
        yni.m215415d(LaunchStep.PutongCreate);
    }

    @Override // com.p046p1.mobile.android.app.App
    /* JADX INFO: renamed from: n */
    public void mo20436n() throws Throwable {
        yni.m215417f(LaunchStep.PutongAsyncCreate);
        super.mo20436n();
        ooi0.m165272a(App.f15369e);
        k200.m144242c(App.f15369e);
        dyd.m114055a();
        m174855j0();
        k8c.m144926b(App.f15369e);
        if (Build.VERSION.SDK_INT < 28 && ane0.m97750v()) {
            rrv.m180608a(App.f15369e);
        }
        C13150a.m80335a();
        bc60.m101046a();
        qqc0.m175901m();
        yl5 yl5Var = f154714c0;
        if (yl5Var != null && !yl5Var.signedIn_()) {
            k0f0.m144032f().m144037i(App.f15369e);
        }
        try {
            Integer num = (Integer) kmc0.m146493k(UserHandle.class).m146501b("myUserId").m146506h();
            if (num.intValue() != 0) {
                zvf0.m220369B("e_double_tantan_app", "", j760.m140076a("my_user_handler", num));
            }
        } catch (Throwable unused) {
        }
        yni.m215415d(LaunchStep.PutongAsyncCreate);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m174856n0() {
        LaunchStep launchStep = LaunchStep.AccountAfterCreate;
        yni.m215417f(launchStep, LaunchStep.InitSignData);
        f154721j0.m192061n(SchemeKey.account);
        yni.m215415d(launchStep);
        if (!f154714c0.signedIn_()) {
            f154739w0.onNext(0);
            return;
        }
        LaunchStep launchStep2 = LaunchStep.InitOms;
        yni.m215417f(launchStep2);
        m174768C0();
        LaunchStep launchStep3 = LaunchStep.InitOtherModule;
        yni.m215416e(launchStep2, launchStep3);
        m174770D0();
        yni.m215415d(launchStep3);
        m174822l0(false).toBlocking().m212773f(mkd0.m154955G(new e30() { // from class: l.bib0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75716a.m174849K0((roj0) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.App
    /* JADX INFO: renamed from: o */
    public void mo20437o() {
        alj0.m97291d().m97296h(OutOfMemoryError.class);
        alj0.m97291d().m97295g(new ckq() { // from class: l.iib0
            @Override // p149l.ckq
            /* JADX INFO: renamed from: a */
            public final boolean mo107425a(Thread thread, Throwable th, boolean z) {
                return znj0.m219456f(thread, th, z);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m174858w0() {
        yni.m215417f(LaunchStep.InitAccountModule);
        e51.m114748M(new Runnable() { // from class: l.xhb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192869a.m174850L0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m174857o0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void m174859x0() {
    }
}
