package p149l;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.bpea.entry.common.DataType;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.ThreadUtil;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class e51 {

    /* JADX INFO: renamed from: a */
    public static final Handler f89339a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap<Runnable, c4g0> f89340b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public static Map<String, C22306c<Long>> f89341c = new HashMap();

    /* JADX INFO: renamed from: l.e51$a */
    public class C16539a implements w9j<C4319c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f89342a;

        public C16539a(Runnable runnable) {
            this.f89342a = runnable;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(C4319c c4319c) {
            if (c4319c == C4319c.f15552m) {
                e51.m114745J(this.f89342a);
            }
            return Boolean.valueOf(c4319c == C4319c.f15552m);
        }
    }

    /* JADX INFO: renamed from: l.e51$b */
    public class C16540b implements w9j<C4319c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f89343a;

        public C16540b(Runnable runnable) {
            this.f89343a = runnable;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(C4319c c4319c) {
            if (c4319c == C4319c.f15552m) {
                e51.m114745J(this.f89343a);
            }
            return Boolean.valueOf(c4319c == C4319c.f15552m);
        }
    }

    /* JADX INFO: renamed from: l.e51$c */
    public static abstract class AbstractRunnableC16541c implements Runnable {
    }

    /* JADX INFO: renamed from: A */
    public static boolean m114736A(Context context) {
        return Act.isAppVisible();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m114737B(String str) {
        return f89341c.get(str) != null;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m114738C() {
        return TextUtils.equals(o460.m162550c(), App.f15369e.getPackageName());
    }

    /* JADX INFO: renamed from: D */
    public static boolean m114739D() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: E */
    public static void m114740E() {
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: F */
    public static void m114741F(Context context, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!(context instanceof Act)) {
            f89339a.post(runnable);
            return;
        }
        final C22392a c22392aM221512b = C22392a.m221512b();
        Act act = (Act) context;
        c4g0 c4g0VarSubscribe = act.duringCreated((C22306c) c22392aM221512b, false).doOnUnsubscribe(new d30() { // from class: l.q41
            @Override // p149l.d30
            public final void call() {
                e51.f89340b.remove(runnable);
            }
        }).doOnTerminate(new d30() { // from class: l.v41
            @Override // p149l.d30
            public final void call() {
                e51.f89340b.remove(runnable);
            }
        }).take(1).takeUntil(act.lifecycle().filter(new C16540b(runnable))).subscribe(new e30() { // from class: l.w41
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114751b(runnable, (Boolean) obj);
            }
        });
        f89339a.post(new Runnable() { // from class: l.x41
            @Override // java.lang.Runnable
            public final void run() {
                c22392aM221512b.onNext(Boolean.TRUE);
            }
        });
        f89340b.put(runnable, c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: G */
    public static void m114742G(Runnable runnable) {
        f89339a.post(runnable);
    }

    /* JADX INFO: renamed from: H */
    public static void m114743H(Context context, final Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (!(context instanceof Act)) {
            f89339a.postDelayed(runnable, j);
            return;
        }
        Act act = (Act) context;
        f89340b.put(runnable, act.duringCreated((C22306c) m114767r(j), false).doOnUnsubscribe(new d30() { // from class: l.y41
            @Override // p149l.d30
            public final void call() {
                e51.f89340b.remove(runnable);
            }
        }).doOnTerminate(new d30() { // from class: l.z41
            @Override // p149l.d30
            public final void call() {
                e51.f89340b.remove(runnable);
            }
        }).takeUntil(act.lifecycle().filter(new C16539a(runnable))).subscribe(new e30() { // from class: l.a51
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114760k(runnable, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static void m114744I(Frag frag, final Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (frag == null) {
            f89339a.postDelayed(runnable, j);
        } else {
            f89340b.put(runnable, frag.duringCreated(m114767r(j)).doOnUnsubscribe(new d30() { // from class: l.c51
                @Override // p149l.d30
                public final void call() {
                    e51.f89340b.remove(runnable);
                }
            }).doOnTerminate(new d30() { // from class: l.d51
                @Override // p149l.d30
                public final void call() {
                    e51.f89340b.remove(runnable);
                }
            }).takeUntil(frag.lifecycle().filter(new w9j() { // from class: l.r41
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    C4319c c4319c = (C4319c) obj;
                    return Boolean.valueOf(c4319c == C4319c.f15552m || c4319c == C4319c.f15551l);
                }
            })).subscribe(new e30() { // from class: l.s41
                @Override // p149l.e30
                public final void call(Object obj) {
                    e51.m114761l(runnable, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m114745J(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        ConcurrentHashMap<Runnable, c4g0> concurrentHashMap = f89340b;
        if (concurrentHashMap.containsKey(runnable)) {
            concurrentHashMap.remove(runnable).unsubscribe();
        } else {
            f89339a.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m114746K(String str) {
        f89341c.remove(str);
    }

    /* JADX INFO: renamed from: L */
    public static void m114747L(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        intent.setFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null) {
            alarmManager.set(1, System.currentTimeMillis() + 500, activity);
            m114740E();
        } else {
            lsi0.m151580j("请手动启动APP");
            m114743H(context, new Runnable() { // from class: l.t41
                @Override // java.lang.Runnable
                public final void run() {
                    e51.m114740E();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m114748M(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f89339a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: N */
    public static C22306c<Long> m114749N(final String str, int i) {
        C22306c<Long> c22306c = f89341c.get(str);
        if (c22306c != null) {
            return c22306c;
        }
        C22306c<Long> c22306cCacheWithInitialCapacity = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().take(i).observeOn(jo0.m142408a()).doOnCompleted(new d30() { // from class: l.b51
            @Override // p149l.d30
            public final void call() {
                e51.f89341c.remove(str);
            }
        }).cacheWithInitialCapacity(1);
        f89341c.put(str, c22306cCacheWithInitialCapacity);
        return c22306cCacheWithInitialCapacity;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m114751b(Runnable runnable, Boolean bool) {
        f89340b.remove(runnable);
        if (bool.booleanValue()) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m114753d(Runnable runnable, z3g0 z3g0Var) {
        runnable.run();
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m114760k(Runnable runnable, Long l2) {
        f89340b.remove(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m114761l(Runnable runnable, Long l2) {
        f89340b.remove(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: n */
    public static void m114763n(final Runnable runnable) {
        C22306c.create(new C22306c.a() { // from class: l.u41
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114753d(runnable, (z3g0) obj);
            }
        }).compose(mkd0.m154964P()).compose(mkd0.m154962N()).subscribe();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m114764o(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return f89340b.containsKey(runnable);
    }

    /* JADX INFO: renamed from: p */
    public static void m114765p(Intent intent, Intent intent2) {
        if (intent2 != null) {
            if (intent2.getExtras() != null) {
                intent.putExtras(intent2.getExtras());
            }
            intent.setAction(intent2.getAction());
            intent.setDataAndType(intent2.getData(), intent2.getType());
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: q */
    public static void m114766q(String str) {
        try {
            ((ClipboardManager) App.f15369e.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Återställningskod", str));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<Long> m114767r(long j) {
        return C22306c.timer(j, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a());
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m114768s(Runnable runnable) {
        FastIoScheduler.f15629a.execute(runnable);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static void m114769t(Runnable runnable, boolean z) {
        if (m114739D() || z) {
            FastIoScheduler.f15629a.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public static File m114770u(String str) {
        File file = new File(App.f15369e.getCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: v */
    public static File m114771v(String str) {
        File file = new File(App.f15369e.getExternalCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m114772w() {
        if (Build.BRAND.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
            return App.f15369e.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m114773x() {
        if (!Build.BRAND.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
            return false;
        }
        try {
            Class<?> clsLoadClass = App.f15369e.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m114774y(Runnable runnable) {
        m114775z(runnable, true);
    }

    /* JADX INFO: renamed from: z */
    public static void m114775z(Runnable runnable, boolean z) {
        ThreadUtil.m81310e(runnable, z);
    }
}
