package p153l;

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
import com.facebook.C1600c;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.OtherApi;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.app.SQLDBDamagedException;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p051p1.mobile.putong.app.web.WebViewClientX;
import com.p051p1.mobile.putong.data.CommonAssetsSettings;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignOutParams;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.IntlLocationProvider;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.C13313a;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import com.tantanapp.beatles.safety.spwaitfix.C13723a;
import com.tantanapp.common.data.orm.DatabaseStore;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.DBCorruptException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.C13825a;
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
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class uqb0 extends App {

    /* JADX INFO: renamed from: A */
    public static boolean f180362A = false;

    /* JADX INFO: renamed from: A0 */
    public static C22507a<pf60<Boolean, Boolean>> f180363A0 = null;

    /* JADX INFO: renamed from: B */
    public static jxd0 f180364B = null;

    /* JADX INFO: renamed from: B0 */
    public static bbm f180365B0 = null;

    /* JADX INFO: renamed from: C */
    public static rg50.C19837b f180366C = null;

    /* JADX INFO: renamed from: C0 */
    public static boolean f180367C0 = false;

    /* JADX INFO: renamed from: D */
    public static rg50 f180368D = null;

    /* JADX INFO: renamed from: D0 */
    public static String f180369D0 = null;

    /* JADX INFO: renamed from: E */
    public static AbstractC13226a f180370E = null;

    /* JADX INFO: renamed from: E0 */
    public static jxd0 f180371E0 = null;

    /* JADX INFO: renamed from: F */
    public static uc80 f180372F = null;

    /* JADX INFO: renamed from: F0 */
    public static final og3<Integer> f180373F0;

    /* JADX INFO: renamed from: G */
    public static fsb0 f180374G = null;

    /* JADX INFO: renamed from: G0 */
    public static final boolean[] f180375G0;

    /* JADX INFO: renamed from: H */
    public static Network f180376H = null;

    /* JADX INFO: renamed from: I */
    public static xi5 f180377I = null;

    /* JADX INFO: renamed from: J */
    public static ja5 f180378J = null;

    /* JADX INFO: renamed from: K */
    public static hfj0 f180379K = null;

    /* JADX INFO: renamed from: L */
    public static AccountTempApi f180380L = null;

    /* JADX INFO: renamed from: M */
    public static yb5 f180381M = null;

    /* JADX INFO: renamed from: N */
    public static OtherApi f180382N = null;

    /* JADX INFO: renamed from: O */
    public static tl8 f180383O = null;

    /* JADX INFO: renamed from: P */
    public static xk9 f180384P = null;

    /* JADX INFO: renamed from: Q */
    public static C18334l2 f180385Q = null;

    /* JADX INFO: renamed from: R */
    public static s5m f180386R = null;

    /* JADX INFO: renamed from: S */
    public static a70 f180387S = null;

    /* JADX INFO: renamed from: T */
    public static PaymentApi f180388T = null;

    /* JADX INFO: renamed from: U */
    public static w1w f180389U = null;

    /* JADX INFO: renamed from: V */
    public static mk5 f180390V = null;

    /* JADX INFO: renamed from: W */
    public static dk50 f180391W = null;

    /* JADX INFO: renamed from: X */
    public static hj5 f180392X = null;

    /* JADX INFO: renamed from: Y */
    public static AssetsSettingsBaseApi f180393Y = null;

    /* JADX INFO: renamed from: Z */
    public static a4j f180394Z = null;

    /* JADX INFO: renamed from: a0 */
    public static FacebookApi f180395a0 = null;

    /* JADX INFO: renamed from: b0 */
    public static sre0 f180396b0 = null;

    /* JADX INFO: renamed from: c0 */
    public static bn5 f180397c0 = null;

    /* JADX INFO: renamed from: d0 */
    public static volatile File f180398d0 = null;

    /* JADX INFO: renamed from: e0 */
    public static final Integer f180399e0;

    /* JADX INFO: renamed from: f0 */
    public static int f180400f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public static long f180401g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public static LiveRegionTag f180402h0 = null;

    /* JADX INFO: renamed from: i0 */
    public static z1f f180403i0 = null;

    /* JADX INFO: renamed from: j0 */
    public static dg00 f180404j0 = null;

    /* JADX INFO: renamed from: k0 */
    public static vj5 f180405k0 = null;

    /* JADX INFO: renamed from: l0 */
    public static final C22507a<uxj0> f180406l0;

    /* JADX INFO: renamed from: m0 */
    public static jxd0 f180407m0 = null;

    /* JADX INFO: renamed from: n0 */
    public static boolean f180408n0 = false;

    /* JADX INFO: renamed from: o0 */
    public static boolean f180409o0 = false;

    /* JADX INFO: renamed from: p0 */
    public static d07 f180410p0 = null;

    /* JADX INFO: renamed from: q0 */
    public static C22507a<Long> f180411q0 = null;

    /* JADX INFO: renamed from: r0 */
    public static C22507a<Long> f180412r0 = null;

    /* JADX INFO: renamed from: s */
    public static String f180413s = "7.3.3";

    /* JADX INFO: renamed from: s0 */
    public static C22507a<uxj0> f180414s0 = null;

    /* JADX INFO: renamed from: t */
    public static int f180415t = 3733000;

    /* JADX INFO: renamed from: t0 */
    public static boolean f180416t0 = false;

    /* JADX INFO: renamed from: u */
    public static boolean f180417u = true;

    /* JADX INFO: renamed from: u0 */
    public static boolean f180418u0 = false;

    /* JADX INFO: renamed from: v */
    public static boolean f180419v = true;

    /* JADX INFO: renamed from: v0 */
    public static C22507a<uxj0> f180420v0;

    /* JADX INFO: renamed from: w0 */
    public static final C22507a<Integer> f180422w0;

    /* JADX INFO: renamed from: x0 */
    public static long f180424x0;

    /* JADX INFO: renamed from: y0 */
    public static String f180426y0;

    /* JADX INFO: renamed from: z0 */
    public static C22507a<uxj0> f180428z0;

    /* JADX INFO: renamed from: r */
    public rg50 f180429r;

    /* JADX INFO: renamed from: w */
    public static byd0 f180421w = new byd0("app_install_time", 0L);

    /* JADX INFO: renamed from: x */
    public static wyd0 f180423x = new wyd0("debug_version_", "7.3.3", false);

    /* JADX INFO: renamed from: y */
    public static vxd0 f180425y = new vxd0("debug_plugin_version", -1, false);

    /* JADX INFO: renamed from: z */
    public static wyd0 f180427z = new wyd0("debug_x_tantan_dev_env", "", false);

    /* JADX INFO: renamed from: l.uqb0$a */
    public class C20625a implements gvl {

        /* JADX INFO: renamed from: a */
        public rg50 f180430a;

        public C20625a() {
        }

        @Override // p153l.gvl
        /* JADX INFO: renamed from: a */
        public rg50 mo132559a() {
            rg50.C19837b c19837b;
            if (this.f180430a == null && (c19837b = uqb0.f180366C) != null) {
                this.f180430a = c19837b.m181365c();
            }
            return this.f180430a;
        }
    }

    /* JADX INFO: renamed from: l.uqb0$b */
    public class C20626b implements f5e {
        public C20626b() {
        }

        @Override // p153l.f5e
        /* JADX INFO: renamed from: a */
        public void mo124121a(long j, WarningLevel warningLevel) {
            if (warningLevel == WarningLevel.URGENT_ALERT) {
                new u4e().m194485j(Act.foreground_() == null ? null : Act.foreground_().f16062a.get());
            }
        }
    }

    /* JADX INFO: renamed from: l.uqb0$c */
    public class C20627c implements SVGALoader.SvgaGlobalCall {
        public C20627c() {
        }

        @Override // com.tantan.library.svga.SVGALoader.SvgaGlobalCall
        @NonNull
        public String replaceSource(@NonNull String str) {
            return lhl.INSTANCE.m154220m(str);
        }
    }

    /* JADX INFO: renamed from: l.uqb0$d */
    public class C20628d implements MessageQueue.IdleHandler {
        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            if (Act.foreground_() == null) {
                return true;
            }
            Objects.toString(Act.foreground_());
            uqb0.m197285s0();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.uqb0$e */
    public class C20629e implements C13825a.e {
        @Override // com.tantanapp.media.proxy.api.C13825a.e
        /* JADX INFO: renamed from: a */
        public void mo82570a(String str, long j, PreloadTaskInfo preloadTaskInfo) {
            kl20.m150342b().mo119562a(C21488y1.m213911g(preloadTaskInfo));
        }

        @Override // com.tantanapp.media.proxy.api.C13825a.e
        /* JADX INFO: renamed from: b */
        public void mo82571b(String str, long j, PreloadTaskInfo preloadTaskInfo) {
            kl20.m150342b().mo119562a(C21488y1.m213911g(preloadTaskInfo));
        }
    }

    /* JADX INFO: renamed from: l.uqb0$f */
    public class C20630f implements y20<uxj0> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            User userMe_ = uqb0.f180397c0.me_();
            if (!NullChecker.m82487b(userMe_)) {
                tu2.m192703a("[putong-common][userMeState]", "userMeCallPrepareNewSignIn but me still null");
                uqb0.f180422w0.onNext(2);
            } else {
                uqb0.m197240O0(userMe_);
                uqb0.f180422w0.onNext(1);
                tu2.m192703a("[putong-common][userMeState]", "USER_ME_STATE_SUCCESS from userMeCallPrepareNewSignIn");
            }
        }
    }

    /* JADX INFO: renamed from: l.uqb0$g */
    public class C20631g implements y20<Throwable> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            tu2.m192703a("[putong-common][userMeState]", "userMeCallPrepareNewSignIn with error: " + th);
            uqb0.f180422w0.onNext(2);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f180364B = new jxd0("has_show_privacy_policy_dlg", bool);
        f180399e0 = 0;
        f180402h0 = LiveRegionTag.get("unknown_");
        f180406l0 = C22507a.m222758b();
        f180407m0 = new jxd0("has_pre_load_when_sign_in", bool);
        f180411q0 = C22507a.m222758b();
        f180412r0 = C22507a.m222758b();
        f180414s0 = C22507a.m222758b();
        f180416t0 = false;
        f180418u0 = false;
        f180420v0 = C22507a.m222758b();
        f180422w0 = C22507a.m222758b();
        f180424x0 = -1L;
        f180426y0 = "";
        f180428z0 = C22507a.m222758b();
        f180363A0 = C22507a.m222759c(pf60.m172085a(bool, bool));
        f180365B0 = null;
        f180367C0 = false;
        f180369D0 = "";
        f180371E0 = new jxd0("android_network_metrics", bool);
        f180373F0 = new og3.C19128d(0, 500);
        f180375G0 = new boolean[]{false};
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m197220B(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Boolean m197221C(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public static void m197222C0() {
        pk50.m172568j().m172570b();
        ABManager.m30356q().first().subscribe(psd0.m173596G(new y20() { // from class: l.xpb0
            @Override // p153l.y20
            public final void call(Object obj) {
                pk50.m172568j().m172583p(uqb0.f180362A);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m197224D0() {
        if (f180409o0) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.ypb0
            @Override // java.lang.Runnable
            public final void run() {
                uqb0.m197232J();
            }
        });
        f180409o0 = true;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m197226E0() {
        RemoteConfig.m80467Y().filter(new qcj() { // from class: l.npb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ppb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197258Z((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ x1d0 m197227F(boolean z) {
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("clientId", "100032");
            jsonObject.add(Device.TYPE, new JsonParser().parse(tl8.m191616M().toJson()).getAsJsonObject());
            jsonObject.addProperty("type", z ? "switch-account" : "default");
        } catch (Exception unused) {
        }
        return f180376H.auth().m209043q(xi5.m211100b("/signout")).m209038l(z1d0.create(Network.JSON, jsonObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: G0 */
    public static void m197229G0() {
        RemoteConfig.m80467Y().filter(new qcj() { // from class: l.vpb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((RemoteConfig.ConfigStep) obj) == RemoteConfig.ConfigStep.USER);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wpb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197230H((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m197230H(RemoteConfig.ConfigStep configStep) {
        if (RemoteConfig.m80481x().m80513s("hook_sp_wait_apply")) {
            try {
                new C13723a(App.f16088e).m82365a();
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
                th.getMessage();
            }
        }
        l51.m152887G(new Runnable() { // from class: l.lqb0
            @Override // java.lang.Runnable
            public final void run() {
                fu2.m127432j();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m197232J() {
        Iterator<String> it = k9i0.f124550c.iterator();
        while (it.hasNext()) {
            f180404j0.m115596t(it.next());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: J0 */
    public static boolean m197233J0() {
        dg00 dg00Var = f180404j0;
        return (dg00Var == null || dg00Var.f88244b.m222761e() == null) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m197234K(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            f180367C0 = RemoteConfig.m80481x().m80513s("android_sign_out_keep_db");
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static void m197237M0(final boolean z) {
        f180377I.now(qi20.m176654a(new pcj() { // from class: l.sqb0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.m197227F(z);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m197239O() {
        i5d0 i5d0VarExecute = null;
        try {
            try {
                try {
                    i5d0VarExecute = f180368D.mo181341a(f180376H.basic().m209043q("https://client-tracking.tantanapp.com/?deviceToken=" + qzd.m178768a() + "&channel=" + ls4.f133389a).m209033g().m209028b()).execute();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        } finally {
            ua5.m195158b(i5d0VarExecute);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static void m197240O0(User user) {
        nsb0.m164589w(user);
        ABManager.m30332a0();
        f180407m0.put(Boolean.TRUE);
        m197265c1();
        qzd.f160242a.first().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.qpb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197241P(obj);
            }
        }));
        LaunchStep launchStep = LaunchStep.OmsParse;
        uqi.m197339f(launchStep);
        pk50.m172568j().m172569a();
        uqi.m197337d(launchStep);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m197241P(Object obj) {
        if (f180397c0.signedIn_()) {
            m197252V0();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m197243R(Notification notification) {
        if (notification.m222544i()) {
            m197281q0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static void m197244R0() {
        l51.m152919y(new Runnable() { // from class: l.cqb0
            @Override // java.lang.Runnable
            public final void run() {
                uqb0.m197239O();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ uxj0 m197245S(Class cls, SignOutParams signOutParams) {
        ABManager.m30338d0();
        o560.m166092b().m166093a();
        if (NullChecker.m82486a(cls)) {
            Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Iterator<Act.C4450r> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    Activity activity = it2.next().f16062a.get();
                    if (NullChecker.m82486a(activity) && (activity instanceof Act) && f180397c0.getSignOutJumpAct().isInstance(activity)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                Intent intent = new Intent(App.f16088e, (Class<?>) cls);
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
                App.f16088e.startActivity(intent);
            }
            HashMap<Integer, ArrayList<Act.C4450r>> mapGlobalLifeCycle_ = Act.globalLifeCycle_();
            ArrayList arrayList = new ArrayList();
            Iterator<ArrayList<Act.C4450r>> it3 = mapGlobalLifeCycle_.values().iterator();
            while (it3.hasNext()) {
                Iterator<Act.C4450r> it4 = it3.next().iterator();
                while (it4.hasNext()) {
                    final Activity activity2 = it4.next().f16062a.get();
                    if (NullChecker.m82486a(activity2) && (activity2 instanceof Act) && !f180397c0.getSignOutJumpAct().isInstance(activity2)) {
                        arrayList.add(((Act) activity2).lifecycle().filter(new qcj() { // from class: l.gqb0
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
                            }
                        }).timeout(10L, TimeUnit.SECONDS).materialize().map(new qcj() { // from class: l.hqb0
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return uqb0.m197256Y(activity2, (Notification) obj);
                            }
                        }).first());
                    }
                }
            }
            if (arrayList.size() > 0) {
                psd0.m173623p(arrayList, new zcj() { // from class: l.iqb0
                    @Override // p153l.zcj
                    public final Object call(Object[] objArr) {
                        return uxj0.f181467a;
                    }
                }).materialize().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.jqb0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.m197243R((Notification) obj);
                    }
                }));
            } else {
                m197281q0();
            }
        } else {
            m197281q0();
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: S0 */
    public static void m197246S0(@NonNull String str) {
        if (ConnectivityReceiver.m82472l()) {
            m197279p0();
            C13825a.m82554p().m82566w(Uri.parse(str), C13825a.f56991l);
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m197247T(zw0 zw0Var) {
        try {
            if (NullChecker.m82486a(zw0Var) && NullChecker.m82486a(zw0Var.m221850g())) {
                Uri uriM221850g = zw0Var.m221850g();
                String queryParameter = uriM221850g.getQueryParameter("liveId");
                if (!TextUtils.isEmpty(queryParameter) || "/square".equals(uriM221850g.getPath())) {
                    wtd.f190738a.put(queryParameter);
                    wtd.f190739b.put(Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m197248T0(List<String> list) {
        if (ConnectivityReceiver.m82472l()) {
            m197279p0();
            C13825a.m82554p().m82567x(list);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ C22421c m197249U(boolean z, uxj0 uxj0Var) {
        kxd0 kxd0Var = f180380L.f17862a;
        Boolean bool = Boolean.TRUE;
        kxd0Var.mo107146h(bool);
        m197268e0(true, true);
        m197252V0();
        User userMe_ = f180397c0.me_();
        f180382N.tryMarkAsDAU();
        nsb0.m164589w(userMe_);
        m197265c1();
        f180407m0.put(bool);
        pk50.m172568j().m172569a();
        if (z) {
            wiw.m206613n(userMe_.f56859id);
        } else {
            wiw.m206610k(userMe_.f56859id);
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m197250U0(@NonNull String str) {
        m197279p0();
        C13825a.m82554p().m82566w(Uri.parse(str), C13825a.f56991l);
    }

    /* JADX INFO: renamed from: V0 */
    public static void m197252V0() {
        l51.m152919y(new Runnable() { // from class: l.rpb0
            @Override // java.lang.Runnable
            public final void run() {
                TantanApp.f17899c.m111138Y().flatMap(new qcj() { // from class: l.dqb0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uqb0.f180383O.m191627Q(TantanApp.f17899c.m111151y()).compose(psd0.m173592C()).materialize().take(1);
                    }
                }).compose(psd0.m173603N()).subscribe();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C22421c m197254X(boolean z, final Class cls, final boolean z2, final boolean z3, uxj0 uxj0Var) {
        return z ? m197277m0(new pcj() { // from class: l.gpb0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.m197263b1(cls, z2, AccountTempApi.InactiveType.None, z3);
            }
        }) : m197263b1(cls, z2, AccountTempApi.InactiveType.None, z3);
    }

    /* JADX INFO: renamed from: X0 */
    public static void m197255X0(String str, String str2) {
        w3n.m204771c(App.f16088e).mo178318a(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Notification m197256Y(Activity activity, Notification notification) {
        if (notification.m222545j()) {
            CrashHelper.m82479c(new RuntimeException("activity did not Destroy in 10:" + activity));
        }
        return notification;
    }

    /* JADX INFO: renamed from: Y0 */
    public static C22421c<uxj0> m197257Y0(final boolean z, final Class cls, final boolean z2, boolean z3, final boolean z4) {
        m197237M0(z3);
        return f180377I.now(f180404j0.m115587E().flatMap(new qcj() { // from class: l.opb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197254X(z, cls, z2, z4, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m197258Z(RemoteConfig.ConfigStep configStep) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (RemoteConfig.m80481x().m80513s("del_or_hidden_entrance_switch") || !f180397c0.signedIn_()) {
            return;
        }
        CrashHelper.m82479c(new RuntimeException("RemoteConfig del_or_hidden_entrance_switch =false, cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime)));
    }

    /* JADX INFO: renamed from: Z0 */
    public static C22421c<uxj0> m197259Z0(boolean z, boolean z2) {
        return m197257Y0(z, f180397c0.getSignOutJumpAct(), false, false, z2);
    }

    /* JADX INFO: renamed from: a1 */
    public static C22421c<uxj0> m197261a1(final Class cls, final SignOutParams signOutParams) {
        return C22421c.fromCallable(new Callable() { // from class: l.hpb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return uqb0.m197245S(cls, signOutParams);
            }
        }).compose(psd0.m173607R());
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m197262b0(CommonAssetsSettings commonAssetsSettings) {
        m197279p0();
        cbl0.m108642n().m108652v();
    }

    /* JADX INFO: renamed from: b1 */
    public static C22421c<uxj0> m197263b1(Class cls, boolean z, AccountTempApi.InactiveType inactiveType, boolean z2) {
        return m197261a1(cls, new SignOutParams(z, inactiveType, false, z2));
    }

    /* JADX INFO: renamed from: c1 */
    public static void m197265c1() {
        WebSocketManager.m30421Q().m30479o0();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m197266d0(String str) {
        if (!str.startsWith("http")) {
            return str;
        }
        m197279p0();
        return C13825a.m82554p().m82560q(str);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m197267d1() {
        TantanApp.f17899c.m111144e0();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m197268e0(boolean z, boolean z2) {
        f180362A = z;
        LaunchStep launchStep = LaunchStep.InitCommonInfo;
        uqi.m197339f(launchStep);
        m197297z0(z);
        LaunchStep launchStep2 = LaunchStep.NotifySignIn;
        uqi.m197338e(launchStep, launchStep2);
        f180404j0.m115592o(z2);
        uc00.m195350b();
        LaunchStep launchStep3 = LaunchStep.NotifyAllSignIn;
        uqi.m197338e(launchStep2, launchStep3);
        f180404j0.m115590m();
        f180420v0.observeOn(Schedulers.m222739io()).subscribe(psd0.m173596G(new y20() { // from class: l.tpb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180404j0.m115593p();
            }
        }));
        LaunchStep launchStep4 = LaunchStep.WebpCall;
        uqi.m197338e(launchStep3, launchStep4);
        sim.m186023i(new pcj() { // from class: l.upb0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(kl40.m150345c());
            }
        });
        uqi.m197337d(launchStep4);
    }

    /* JADX INFO: renamed from: e1 */
    public static void m197269e1(String str, Object... objArr) {
        w3n.m204771c(App.f16088e).mo178319b(str, objArr);
    }

    /* JADX INFO: renamed from: f0 */
    public static C22421c<uxj0> m197270f0() {
        return m197272g0(false);
    }

    /* JADX INFO: renamed from: f1 */
    public static void m197271f1() {
        m197270f0().take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new C20630f(), new C20631g()));
    }

    /* JADX INFO: renamed from: g0 */
    public static C22421c<uxj0> m197272g0(final boolean z) {
        if (f180411q0.m222761e() == null) {
            f180411q0.onNext(Long.valueOf(SystemClock.elapsedRealtime()));
        }
        m197267d1();
        f180376H.resetNetworkControlParams();
        m197222C0();
        m197224D0();
        tu2.m192703a("[putong-common][userMeState]", "callPrepareNewSignIn:isSignUp " + z);
        return f180404j0.f88248f.take(1).observeOn(FastIoScheduler.f16349b).flatMap(new qcj() { // from class: l.tqb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197276l0(true);
            }
        }).observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.epb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180404j0.m115586D();
            }
        }).flatMap(new qcj() { // from class: l.fpb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197249U(z, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static void m197273h0() {
        if (f180416t0) {
            return;
        }
        f180416t0 = true;
        Looper.getMainLooper().getQueue().addIdleHandler(new C20628d());
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m197274i0() {
        int iIsGooglePlayServicesAvailable;
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(App.f16088e);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            iIsGooglePlayServicesAvailable = 1;
        }
        return iIsGooglePlayServicesAvailable == 0;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m197275k0() {
        WebSocketManager.m30421Q().m30448H();
    }

    /* JADX INFO: renamed from: l0 */
    public static C22421c<uxj0> m197276l0(final boolean z) {
        uqi.m197339f(LaunchStep.InitOtherDb);
        tu2.m192703a(DatabaseStore.TAG, "dbInit");
        return C22421c.just(uxj0.f181467a).map(new qcj() { // from class: l.jpb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(uqb0.m197291v0(z, new x20() { // from class: l.nqb0
                    @Override // p153l.x20
                    public final void call() {
                        uqb0.m197278p();
                    }
                }));
            }
        }).filter(new qcj() { // from class: l.kpb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197221C((Boolean) obj);
            }
        }).map(new qcj() { // from class: l.lpb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static C22421c<uxj0> m197277m0(final pcj<C22421c<uxj0>> pcjVar) {
        return f180377I.now(f180383O.m191625O().materialize().first().compose(psd0.m173592C())).flatMap(new qcj() { // from class: l.mpb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197293x(pcjVar, (Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m197278p() {
        m197295y0();
        f180404j0.m115594q();
        uqi.m197337d(LaunchStep.InitOtherDb);
        tu2.m192703a(DatabaseStore.TAG, "dbInit done");
    }

    /* JADX INFO: renamed from: p0 */
    public static void m197279p0() {
        File fileM197287t0 = m197287t0();
        if (App.f16089f) {
            boolean[] zArr = f180375G0;
            if (zArr[0]) {
                return;
            }
            synchronized (zArr) {
                try {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        TTMediaProxy.setAppContext(App.f16088e);
                        C13825a.m82553n(-1, 200L, -1L, -1L, true);
                        C13825a.m82554p().m82569z(fileM197287t0.getPath(), 500L);
                        C13825a.m82554p().m82556k(new C20629e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m197280q() {
        try {
            qzd.m178769b();
        } catch (Exception e) {
            CrashHelper.m82483g(e);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m197281q0() {
        m197275k0();
        TantanApp.f17899c.m111142c0();
        f180404j0.m115584B();
        jxd0 jxd0Var = f180388T.retryRestore;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        l9c.m153394o().m153405k(false);
        ABManager.m30325U();
        tg50.m191018g().m191021f(true);
        f180397c0.signOut();
        f180380L.f17862a.mo107146h(bool);
        f180407m0.put(bool);
        IntlCountryCodeController.m29127x();
        IntlCountryCodeController.m29126w();
        f180388T.retryRestore.put(bool);
        ABManager.m30324T();
        f180376H.resetNetworkControlParams();
        ABManager.m30328X(false);
        ABManager.m30329Y(false);
        f180376H.invalidHashAccount();
        ABManager.m30340e0(0);
        f180385Q.m152540T();
        f180424x0 = -1L;
        asx.m99990h().m99998i();
        rsh0.m182976g();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m197283r0(final Runnable runnable, boolean z) {
        f180420v0.take(1).observeOn(z ? fo0.m126432a() : Schedulers.m222739io()).subscribe(psd0.m173596G(new y20() { // from class: l.zpb0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static void m197285s0() {
        if (f180418u0) {
            return;
        }
        f180418u0 = true;
        f180420v0.onNext(uxj0.f181467a);
        if (f180416t0) {
            return;
        }
        CrashHelper.m82479c(new RuntimeException("finishColdStart with checkFinishColdStart = false"));
    }

    /* JADX INFO: renamed from: t0 */
    public static File m197287t0() {
        if (f180398d0 == null) {
            synchronized (f180399e0) {
                try {
                    if (f180398d0 == null) {
                        f180398d0 = l51.m152915u("media");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f180398d0;
    }

    /* JADX INFO: renamed from: u0 */
    public static long m197289u0() {
        return Math.max(0L, a2j0.m95705h() - f180401g0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m197290v(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            asx.m99990h().m100000k(RemoteConfig.m80481x().m80485F("community_optimization_long_graphic"));
            asx.m99990h().m99999j(RemoteConfig.m80481x().m80485F("post_video_config"));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m197291v0(boolean z, x20 x20Var) {
        try {
            x20Var.call();
            return true;
        } catch (SQLDBDamagedException | DBCorruptException e) {
            CrashHelper.m82479c(new RuntimeException("DBCorruptException on onAllModuleLoadedWhenAlreadySignedIn: " + z, e));
            tu2.m192703a("[putong-common][userMeState]", "Catch DBCorruptException and callPrepareNewSignIn");
            if (z || (e instanceof SQLDBDamagedException)) {
                try {
                    l9c.m153394o().m153404j();
                } catch (Exception e2) {
                    CrashHelper.m82479c(e2);
                }
                throw e;
            }
            if (TextUtils.isEmpty(f180397c0.userId())) {
                m197259Z0(false, false);
            } else {
                m197271f1();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ C22421c m197293x(pcj pcjVar, Notification notification) {
        return (C22421c) pcjVar.call();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m197295y0() {
        l9c.m153394o().m153411s();
        vj5 vj5Var = f180405k0;
        if (vj5Var != null) {
            vj5Var.mo133950i();
        }
        vj5 vj5Var2 = new vj5();
        l9c.m153394o().m153417y(vj5Var2);
        f180405k0 = vj5Var2;
        f180406l0.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m197297z0(boolean z) {
        String strUserId = f180397c0.userId();
        if (!TextUtils.isEmpty(strUserId)) {
            byd0 byd0Var = new byd0("use_first_login_local_time_" + strUserId, -1L);
            if (!z) {
                if (byd0Var.get().longValue() == -1) {
                    byd0Var.put(-1000L);
                }
                f180424x0 = byd0Var.get().longValue();
            } else if (byd0Var.get().longValue() > 0 || byd0Var.get().longValue() == -1000) {
                f180424x0 = byd0Var.get().longValue();
            } else {
                long jM174454o = pzi0.m174454o();
                f180424x0 = jM174454o;
                byd0Var.put(Long.valueOf(jM174454o));
            }
        }
        t8r.m189686a().m189689d(new wk5());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m197298A0() {
        RemoteConfig.m80467Y().subscribe(psd0.m173596G(new y20() { // from class: l.ipb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197290v((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m197299B0() {
        if (v1c.m198996a()) {
            v1c.m199000e(App.f16088e, v1c.m198999d());
        }
        WebViewClientX.setEnableWebViewDNS(v1c.m198997b());
    }

    /* JADX INFO: renamed from: F0 */
    public final void m197300F0() {
        RemoteConfig.m80467Y().subscribe(psd0.m173596G(new y20() { // from class: l.spb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197234K((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m197301H0() {
        try {
            i4g0.m138496E(new C20625a());
            String str = ls4.f133392d;
            if (str == null) {
                str = "";
            }
            i4g0.m138512j(App.f16088e, "putong", "release", true, str, "7.3.3");
        } catch (Throwable th) {
            CrashHelper.m82483g(th);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m197302I0() {
        LaunchStep launchStep = LaunchStep.FbSdk;
        uqi.m197339f(launchStep);
        C1600c.m8088N("518254421109380");
        C1600c.m8086L(App.f16088e.getApplicationContext());
        AppEventsLogger.m7695a(App.f16088e);
        AppsFlyerLib.getInstance().init("dmfeSDkpVxP8m6Ys6yJCpn", null, App.f16088e);
        if (IntlCountryCodeController.m29114k()) {
            AppsFlyerLib.getInstance().setOutOfStore("hms_store_source");
        }
        AppsFlyerLib.getInstance().start(App.f16088e);
        f180395a0 = new FacebookApi();
        C1600c.m8089O(true);
        C1600c.m8099j();
        zw0.m221846d(App.f16088e, new zw0.InterfaceC21910b() { // from class: l.aqb0
            @Override // p153l.zw0.InterfaceC21910b
            /* JADX INFO: renamed from: a */
            public final void mo99443a(zw0 zw0Var) {
                uqb0.m197247T(zw0Var);
            }
        });
        uqi.m197337d(launchStep);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m197303K0(uxj0 uxj0Var) {
        m197305N0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m197304L0() {
        LaunchStep launchStep = LaunchStep.InitAccountModule;
        LaunchStep launchStep2 = LaunchStep.AccountModuleInject;
        uqi.m197338e(launchStep, launchStep2);
        f180404j0.m115596t(SchemeKey.account);
        LaunchStep launchStep3 = LaunchStep.DoAccountInit;
        uqi.m197338e(launchStep2, launchStep3);
        m197310n0();
        uqi.m197337d(launchStep3);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m197305N0() {
        LaunchStep launchStep = LaunchStep.InitSignData;
        LaunchStep launchStep2 = LaunchStep.SignedStep;
        uqi.m197338e(launchStep, launchStep2);
        this.f16101a = f180397c0.userId();
        try {
            m197268e0(false, !f180407m0.get().booleanValue());
            uqi.m197337d(launchStep2);
            LaunchStep launchStep3 = LaunchStep.InitMe;
            uqi.m197339f(launchStep3);
            User userMe_ = f180397c0.me_();
            LaunchStep launchStep4 = LaunchStep.InitMeSuccess;
            uqi.m197338e(launchStep3, launchStep4);
            m197240O0(userMe_);
            LaunchStep launchStep5 = LaunchStep.NotifyMeSuccess;
            uqi.m197338e(launchStep4, launchStep5);
            f180422w0.onNext(1);
            uqi.m197337d(launchStep5);
        } catch (SQLDBDamagedException e) {
            CrashHelper.m82479c(e);
            try {
                l9c.m153394o().m153404j();
            } catch (Exception e2) {
                CrashHelper.m82479c(e2);
            }
            m197271f1();
        } catch (DBCorruptException e3) {
            CrashHelper.m82479c(new RuntimeException("DBCorruptException on onAllModuleLoadedWhenAlreadySignedIn", e3));
            tu2.m192703a("[putong-common][userMeState]", "Catch DBCorruptException and callPrepareNewSignIn");
            m197271f1();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m197306P0() {
        tu2.m192703a("[putong-common]", "onLowMemory");
        if (NullChecker.m82486a(f180374G)) {
            f180374G.m98788d(80);
        }
        f180404j0.m115583A();
        MKConfigSetter.INSTANCE.m17767j();
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m197307Q0(int i) {
        tu2.m192703a("[putong-common]", "onTrimMemory level=" + i);
        if (NullChecker.m82486a(f180374G)) {
            f180374G.m98788d(i);
        }
        f180404j0.m115585C(i);
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m197308W0() {
        f180370E = new IntlLocationProvider();
    }

    @Override // com.p051p1.mobile.android.app.App
    /* JADX INFO: renamed from: d */
    public void mo21430d() {
        super.mo21430d();
        xhi0.m211045a(new Runnable() { // from class: l.eqb0
            @Override // java.lang.Runnable
            public final void run() {
                uqb0.m197280q();
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m197309j0() {
        try {
            oki.m168014b(l51.m152916v(".media_cache"));
        } catch (IOException | IllegalArgumentException unused) {
        }
        try {
            oki.m168014b(l51.m152915u(".media"));
        } catch (IOException | IllegalArgumentException unused2) {
        }
    }

    @Override // com.p051p1.mobile.android.app.App
    /* JADX INFO: renamed from: m */
    public void mo21434m() {
        uqi.m197342i();
        uqi.m197339f(LaunchStep.PutongCreate, LaunchStep.PuginInit, LaunchStep.PutongArriveImgload, LaunchStep.PutongArriveImgloadNoAd);
        TantanApp.f17899c = new cmb0();
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                ZipPathValidator.clearCallback();
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }
        uqi.m197337d(LaunchStep.PuginInit);
        LaunchStep launchStep = LaunchStep.BaseAppInit;
        uqi.m197339f(launchStep);
        super.mo21434m();
        LaunchStep launchStep2 = LaunchStep.OneIdInit;
        uqi.m197338e(launchStep, launchStep2);
        yp50.m217000c();
        qu2.m178126u();
        rrq.m182815b().m182819e(CommonData.JSON_ADAPTER, null);
        uqi.m197338e(launchStep2, LaunchStep.NetworkInit);
        if (!App.f16089f) {
            m197301H0();
            return;
        }
        num.m164811a(App.f16088e);
        f180396b0 = new sre0();
        f180397c0 = new dn5();
        f180404j0 = dg00.m115582r();
        z1f z1fVar = new z1f();
        f180403i0 = z1fVar;
        z1fVar.m218283b();
        try {
            ja5.m143991B();
        } catch (Exception e) {
            CrashHelper.m82483g(e);
        }
        try {
            ConnectivityReceiver.m82474n(App.f16088e);
        } catch (Exception e2) {
            CrashHelper.m82483g(e2);
        }
        m197313x0();
        if (f180371E0.get().booleanValue()) {
            NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
            networkMetricsStatistics.m19256g(App.f16088e, new vv5("Tantantribe", f180413s, new Function0() { // from class: l.kqb0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return uqb0.f180397c0.userId();
                }
            }, null, null, null));
            networkMetricsStatistics.m19251b();
        }
        rg50.C19837b c19837b = new rg50.C19837b();
        f180366C = c19837b;
        c19837b.m181363a(new mhl());
        f180366C.m181372j(tg50.m191018g());
        try {
            m197311o0();
            rg50.C19837b c19837bM107617a = c1j0.m107617a(f180366C);
            f180366C = c19837bM107617a;
            rg50.C19837b c19837bM30341f = ABManager.m30341f(c19837bM107617a);
            f180366C = c19837bM30341f;
            f180366C = hfj0.m134807a(c19837bM30341f);
            f180379K = new hfj0();
            f180366C = qu2.m178117l(f180366C);
        } catch (Exception e3) {
            CrashHelper.m82483g(e3);
        }
        if (f180371E0.get().booleanValue()) {
            f180366C.m181374l(new nk20(new oyv.C19250b(), null));
        } else {
            f180366C.m181374l(new oyv.C19250b());
        }
        this.f180429r = f180366C.m181365c();
        f180368D = f180366C.m181365c();
        Network network = new Network(f180368D.m181359v());
        f180376H = network;
        xi5.network = network;
        if (App.f16092i.get().intValue() == 1 && f180421w.get().longValue() == 0) {
            f180421w.put(Long.valueOf(pzi0.m174454o()));
        }
        m197301H0();
        i4g0.m138505c();
        i4g0.m138501J();
        qu2.m178130y();
        uqi.m197338e(LaunchStep.NetworkInit, LaunchStep.BaseApi);
        try {
            b4f0.m102456e(App.f16088e);
        } catch (Exception e4) {
            CrashHelper.m82483g(e4);
        }
        f180377I = new xi5();
        f180380L = new AccountTempApi();
        f180417u = !f180397c0.signedIn_();
        f180378J = new ja5();
        f180381M = new yb5();
        f180382N = new OtherApi();
        f180385Q = new C18334l2();
        f180388T = new PaymentApi();
        f180389U = new w1w(f180377I);
        f180390V = new mk5(f180377I);
        f180383O = new tl8(f180377I);
        f180384P = new xk9(f180377I);
        f180410p0 = new d07(f180377I);
        f180391W = new dk50();
        f180392X = new hj5();
        AssetsSettingsBaseApi.m30400H(AssetsSettingsBaseApi.Module.COMMON, 2);
        f180393Y = new AssetsSettingsBaseApi();
        f180394Z = new a4j();
        f180386R = new aqe0();
        f180387S = new a70();
        uqi.m197338e(LaunchStep.BaseApi, LaunchStep.BaseApiV2);
        rsh0.m182974e();
        rsh0.m182975f(App.f16088e);
        f180372F = new uc80();
        m197308W0();
        try {
            m197302I0();
        } catch (Exception e5) {
            CrashHelper.m82483g(e5);
        }
        if (App.m21427h()) {
            l51.m152888H(App.f16088e, new Runnable() { // from class: l.oqb0
                @Override // java.lang.Runnable
                public final void run() {
                    uqb0.m197244R0();
                }
            }, 100L);
        }
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.pqb0
            @Override // java.lang.Runnable
            public final void run() {
                uqb0.f180378J.m143996C();
            }
        }, 1000L);
        LaunchStep launchStep3 = LaunchStep.BaseApiV2;
        LaunchStep launchStep4 = LaunchStep.ImageLoad;
        uqi.m197338e(launchStep3, launchStep4);
        f180374G = new fsb0(this.f180429r.m181359v());
        LaunchStep launchStep5 = LaunchStep.LocationMap;
        uqi.m197338e(launchStep4, launchStep5);
        m197267d1();
        yp50.m217003f();
        nsb0.m164576j();
        NotificationCheckerCommon.m80404b();
        tcn.m190489f();
        uqi.m197338e(launchStep5, LaunchStep.AbLocalInit);
        f180392X.m144642d().observeOn(Schedulers.m222739io()).subscribe(psd0.m173597H(new y20() { // from class: l.qqb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197262b0((CommonAssetsSettings) obj);
            }
        }, new y20() { // from class: l.rqb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197220B((Throwable) obj);
            }
        }));
        ABManager.m30361x();
        m197299B0();
        if (f180397c0.signedIn_()) {
            f180408n0 = false;
            nsb0.m164588v(f180397c0.userId(), nsb0.m164579m().get().intValue());
            wiw.m206608i();
            f180385Q.m152544a0();
        } else {
            f180408n0 = true;
            f180385Q.m152540T();
            wiw.m206608i();
        }
        f180401g0 = a2j0.m95705h();
        i4g0.m138495D("e_backend_application_create", "", new pf60(Device.IMEI, PermissionHelper.m81064b("android.permission.READ_PHONE_STATE") ? qzd.m178772e() : ""), new pf60("imei2", PermissionHelper.m81064b("android.permission.READ_PHONE_STATE") ? qzd.m178773f() : ""), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, PermissionHelper.m81064b("android.permission.READ_PHONE_STATE") ? qzd.m178774g() : ""), new pf60("androidid", qzd.m178769b()));
        umq0.m196793b();
        i4g0.m138495D("e_dark_mode_auth_status", "", new pf60("dark_mode_status", (App.f16088e.getResources().getConfiguration().uiMode & 48) == 32 ? "on" : BLiveOperationTitleShowType.off));
        na00.m162053b("fonts/Roboto-Medium.ttf");
        nqp0.m164340h().m164342f();
        nsb0.m164582p();
        try {
            qu2.m178124s(App.f16088e);
        } catch (Exception e6) {
            CrashHelper.m82483g(e6);
        }
        LaunchStep launchStep6 = LaunchStep.AbLocalInit;
        LaunchStep launchStep7 = LaunchStep.RemoteLocalInit;
        uqi.m197338e(launchStep6, launchStep7);
        m197229G0();
        m197226E0();
        ze60.m219404c();
        LaunchStep launchStep8 = LaunchStep.PrivacyConfig;
        uqi.m197338e(launchStep7, launchStep8);
        LaunchStep launchStep9 = LaunchStep.MkParse;
        uqi.m197338e(launchStep8, launchStep9);
        uc00.m195349a(App.f16088e);
        LaunchStep launchStep10 = LaunchStep.AccountPluginInit;
        uqi.m197338e(launchStep9, launchStep10);
        m197312w0();
        LaunchStep launchStep11 = LaunchStep.PutongOnNext;
        uqi.m197338e(launchStep10, launchStep11);
        f180414s0.onNext(uxj0.f181467a);
        LaunchStep launchStep12 = LaunchStep.DiskCheck;
        uqi.m197338e(launchStep11, launchStep12);
        new g5e.C17158b().m129048c(204800L, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m129046a(new C20626b()).m129047b().m129045c();
        uqi.m197337d(launchStep12);
        m197298A0();
        m197300F0();
        bbm bbmVar = new bbm(null);
        f180365B0 = bbmVar;
        bbmVar.m103297k(App.f16088e);
        SurveySparrowHelper.INSTANCE.m30690n();
        SVGALoader.INSTANCE.setSvgaGlobalCall(new C20627c());
        uqi.m197341h();
        uqi.m197337d(LaunchStep.PutongCreate);
    }

    @Override // com.p051p1.mobile.android.app.App
    /* JADX INFO: renamed from: n */
    public void mo21435n() throws Throwable {
        uqi.m197339f(LaunchStep.PutongAsyncCreate);
        super.mo21435n();
        qxi0.m178602a(App.f16088e);
        hb00.m134334c(App.f16088e);
        qzd.m178768a();
        m197309j0();
        q9c.m175836b(App.f16088e);
        if (Build.VERSION.SDK_INT < 28 && hve0.m137320v()) {
            stv.m187933a(App.f16088e);
        }
        C13313a.m81518a();
        gk60.m130568a();
        vyc0.m203967m();
        bn5 bn5Var = f180397c0;
        if (bn5Var != null && !bn5Var.signedIn_()) {
            r8f0.m180187f().m180192i(App.f16088e);
        }
        try {
            Integer num = (Integer) puc0.m173842k(UserHandle.class).m173850b("myUserId").m173855h();
            if (num.intValue() != 0) {
                i4g0.m138493B("e_double_tantan_app", "", pf60.m172085a("my_user_handler", num));
            }
        } catch (Throwable unused) {
        }
        uqi.m197337d(LaunchStep.PutongAsyncCreate);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m197310n0() {
        LaunchStep launchStep = LaunchStep.AccountAfterCreate;
        uqi.m197339f(launchStep, LaunchStep.InitSignData);
        f180404j0.m115591n(SchemeKey.account);
        uqi.m197337d(launchStep);
        if (!f180397c0.signedIn_()) {
            f180422w0.onNext(0);
            return;
        }
        LaunchStep launchStep2 = LaunchStep.InitOms;
        uqi.m197339f(launchStep2);
        m197222C0();
        LaunchStep launchStep3 = LaunchStep.InitOtherModule;
        uqi.m197338e(launchStep2, launchStep3);
        m197224D0();
        uqi.m197337d(launchStep3);
        m197276l0(false).toBlocking().m165966f(psd0.m173596G(new y20() { // from class: l.fqb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100261a.m197303K0((uxj0) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.App
    /* JADX INFO: renamed from: o */
    public void mo21436o() {
        duj0.m118149d().m118154h(OutOfMemoryError.class);
        duj0.m118149d().m118153g(new bmq() { // from class: l.mqb0
            @Override // p153l.bmq
            /* JADX INFO: renamed from: a */
            public final boolean mo105250a(Thread thread, Throwable th, boolean z) {
                return cxj0.m113041f(thread, th, z);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m197312w0() {
        uqi.m197339f(LaunchStep.InitAccountModule);
        l51.m152893M(new Runnable() { // from class: l.bqb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f77869a.m197304L0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m197311o0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void m197313x0() {
    }
}
