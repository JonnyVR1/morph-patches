package p007l;

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
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.App;
import com.p003p1.mobile.android.app.C0231c;
import com.p003p1.mobile.android.app.Frag;
import com.p003p1.mobile.android.p004rx.rxthread.FastIoScheduler;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.jo0;
import l.o460;
import l.w9j;
import l.z3g0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class e51 {

    /* JADX INFO: renamed from: a */
    public static final Handler f2609a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap<Runnable, c4g0> f2610b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public static Map<String, c<Long>> f2611c = new HashMap();

    /* JADX INFO: renamed from: l.e51$a */
    public class C0529a implements w9j<C0231c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f2612a;

        public C0529a(Runnable runnable) {
            this.f2612a = runnable;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(C0231c c0231c) {
            if (c0231c == C0231c.f1251m) {
                e51.m9027J(this.f2612a);
            }
            return Boolean.valueOf(c0231c == C0231c.f1251m);
        }
    }

    /* JADX INFO: renamed from: l.e51$b */
    public class C0530b implements w9j<C0231c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f2613a;

        public C0530b(Runnable runnable) {
            this.f2613a = runnable;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(C0231c c0231c) {
            if (c0231c == C0231c.f1251m) {
                e51.m9027J(this.f2613a);
            }
            return Boolean.valueOf(c0231c == C0231c.f1251m);
        }
    }

    /* JADX INFO: renamed from: l.e51$c */
    public static abstract class AbstractRunnableC0531c implements Runnable {
    }

    /* JADX INFO: renamed from: A */
    public static boolean m9018A(Context context) {
        return Act.isAppVisible();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m9019B(String str) {
        return f2611c.get(str) != null;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m9020C() {
        return TextUtils.equals(o460.c(), App.f1068e.getPackageName());
    }

    /* JADX INFO: renamed from: D */
    public static boolean m9021D() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: E */
    public static void m9022E() {
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static void m9023F(Context context, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!(context instanceof Act)) {
            f2609a.post(runnable);
            return;
        }
        final a aVarB = a.b();
        Act act = (Act) context;
        c4g0 c4g0VarSubscribe = act.duringCreated((c) aVarB, false).doOnUnsubscribe(new d30() { // from class: l.q41
            public final void call() {
                e51.f2610b.remove(runnable);
            }
        }).doOnTerminate(new d30() { // from class: l.v41
            public final void call() {
                e51.f2610b.remove(runnable);
            }
        }).take(1).takeUntil(act.lifecycle().filter(new C0530b(runnable))).subscribe(new e30() { // from class: l.w41
            public final void call(Object obj) {
                e51.m9033b(runnable, (Boolean) obj);
            }
        });
        f2609a.post(new Runnable() { // from class: l.x41
            @Override // java.lang.Runnable
            public final void run() {
                aVarB.onNext(Boolean.TRUE);
            }
        });
        f2610b.put(runnable, c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: G */
    public static void m9024G(Runnable runnable) {
        f2609a.post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static void m9025H(Context context, final Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (!(context instanceof Act)) {
            f2609a.postDelayed(runnable, j);
            return;
        }
        Act act = (Act) context;
        f2610b.put(runnable, act.duringCreated((c) m9049r(j), false).doOnUnsubscribe(new d30() { // from class: l.y41
            public final void call() {
                e51.f2610b.remove(runnable);
            }
        }).doOnTerminate(new d30() { // from class: l.z41
            public final void call() {
                e51.f2610b.remove(runnable);
            }
        }).takeUntil(act.lifecycle().filter(new C0529a(runnable))).subscribe(new e30() { // from class: l.a51
            public final void call(Object obj) {
                e51.m9042k(runnable, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static void m9026I(Frag frag, final Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (frag == null) {
            f2609a.postDelayed(runnable, j);
        } else {
            f2610b.put(runnable, frag.duringCreated(m9049r(j)).doOnUnsubscribe(new d30() { // from class: l.c51
                public final void call() {
                    e51.f2610b.remove(runnable);
                }
            }).doOnTerminate(new d30() { // from class: l.d51
                public final void call() {
                    e51.f2610b.remove(runnable);
                }
            }).takeUntil(frag.lifecycle().filter(new w9j() { // from class: l.r41
                public final Object call(Object obj) {
                    C0231c c0231c = (C0231c) obj;
                    return Boolean.valueOf(c0231c == C0231c.f1251m || c0231c == C0231c.f1250l);
                }
            })).subscribe(new e30() { // from class: l.s41
                public final void call(Object obj) {
                    e51.m9043l(runnable, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m9027J(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        ConcurrentHashMap<Runnable, c4g0> concurrentHashMap = f2610b;
        if (concurrentHashMap.containsKey(runnable)) {
            concurrentHashMap.remove(runnable).unsubscribe();
        } else {
            f2609a.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m9028K(String str) {
        f2611c.remove(str);
    }

    /* JADX INFO: renamed from: L */
    public static void m9029L(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        intent.setFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null) {
            alarmManager.set(1, System.currentTimeMillis() + 500, activity);
            m9022E();
        } else {
            lsi0.m9836j("请手动启动APP");
            m9025H(context, new Runnable() { // from class: l.t41
                @Override // java.lang.Runnable
                public final void run() {
                    e51.m9022E();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m9030M(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f2609a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: N */
    public static c<Long> m9031N(final String str, int i) {
        c<Long> cVar = f2611c.get(str);
        if (cVar != null) {
            return cVar;
        }
        c<Long> cVarCacheWithInitialCapacity = c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().take(i).observeOn(jo0.a()).doOnCompleted(new d30() { // from class: l.b51
            public final void call() {
                e51.f2611c.remove(str);
            }
        }).cacheWithInitialCapacity(1);
        f2611c.put(str, cVarCacheWithInitialCapacity);
        return cVarCacheWithInitialCapacity;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9033b(Runnable runnable, Boolean bool) {
        f2610b.remove(runnable);
        if (bool.booleanValue()) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9035d(Runnable runnable, z3g0 z3g0Var) {
        runnable.run();
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m9042k(Runnable runnable, Long l2) {
        f2610b.remove(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m9043l(Runnable runnable, Long l2) {
        f2610b.remove(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: n */
    public static void m9045n(final Runnable runnable) {
        c.create(new c.a() { // from class: l.u41
            public final void call(Object obj) {
                e51.m9035d(runnable, (z3g0) obj);
            }
        }).compose(mkd0.m9883P()).compose(mkd0.m9881N()).subscribe();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m9046o(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return f2610b.containsKey(runnable);
    }

    /* JADX INFO: renamed from: p */
    public static void m9047p(Intent intent, Intent intent2) {
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
    public static void m9048q(String str) {
        try {
            ((ClipboardManager) App.f1068e.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Återställningskod", str));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static c<Long> m9049r(long j) {
        return c.timer(j, TimeUnit.MILLISECONDS).observeOn(jo0.a());
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m9050s(Runnable runnable) {
        FastIoScheduler.f1328a.execute(runnable);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static void m9051t(Runnable runnable, boolean z) {
        if (m9021D() || z) {
            FastIoScheduler.f1328a.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public static File m9052u(String str) {
        File file = new File(App.f1068e.getCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: v */
    public static File m9053v(String str) {
        File file = new File(App.f1068e.getExternalCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m9054w() {
        if (Build.BRAND.toLowerCase().contains("oppo")) {
            return App.f1068e.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m9055x() {
        if (!Build.BRAND.toLowerCase().contains("vivo")) {
            return false;
        }
        try {
            Class<?> clsLoadClass = App.f1068e.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m9056y(Runnable runnable) {
        m9057z(runnable, true);
    }

    /* JADX INFO: renamed from: z */
    public static void m9057z(Runnable runnable, boolean z) {
        ThreadUtil.e(runnable, z);
    }
}
