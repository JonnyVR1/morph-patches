package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.ThreadUtil;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes8.dex */
public class l51 {

    /* JADX INFO: renamed from: a */
    public static final Handler f130056a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap<Runnable, kcg0> f130057b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public static Map<String, C22421c<Long>> f130058c = new HashMap();

    /* JADX INFO: renamed from: l.l51$a */
    public class C18348a implements qcj<C4470c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f130059a;

        public C18348a(Runnable runnable) {
            this.f130059a = runnable;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(C4470c c4470c) {
            if (c4470c == C4470c.f16271m) {
                l51.m152890J(this.f130059a);
            }
            return Boolean.valueOf(c4470c == C4470c.f16271m);
        }
    }

    /* JADX INFO: renamed from: l.l51$b */
    public class C18349b implements qcj<C4470c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f130060a;

        public C18349b(Runnable runnable) {
            this.f130060a = runnable;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(C4470c c4470c) {
            if (c4470c == C4470c.f16271m) {
                l51.m152890J(this.f130060a);
            }
            return Boolean.valueOf(c4470c == C4470c.f16271m);
        }
    }

    /* JADX INFO: renamed from: l.l51$c */
    public static abstract class AbstractRunnableC18350c implements Runnable {
    }

    /* JADX INFO: renamed from: A */
    public static boolean m152881A(Context context) {
        return Act.isAppVisible();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m152882B(String str) {
        return f130058c.get(str) != null;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m152883C() {
        return TextUtils.equals(uc60.m195380c(), App.f16088e.getPackageName());
    }

    /* JADX INFO: renamed from: D */
    public static boolean m152884D() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: E */
    public static void m152885E() {
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: F */
    public static void m152886F(Context context, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!(context instanceof Act)) {
            f130056a.post(runnable);
            return;
        }
        final C22507a c22507aM222758b = C22507a.m222758b();
        Act act = (Act) context;
        kcg0 kcg0VarSubscribe = act.duringCreated((C22421c) c22507aM222758b, false).doOnUnsubscribe(new x20() { // from class: l.x41
            @Override // p153l.x20
            public final void call() {
                l51.f130057b.remove(runnable);
            }
        }).doOnTerminate(new x20() { // from class: l.c51
            @Override // p153l.x20
            public final void call() {
                l51.f130057b.remove(runnable);
            }
        }).take(1).takeUntil(act.lifecycle().filter(new C18349b(runnable))).subscribe(new y20() { // from class: l.d51
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152896b(runnable, (Boolean) obj);
            }
        });
        f130056a.post(new Runnable() { // from class: l.e51
            @Override // java.lang.Runnable
            public final void run() {
                c22507aM222758b.onNext(Boolean.TRUE);
            }
        });
        f130057b.put(runnable, kcg0VarSubscribe);
    }

    /* JADX INFO: renamed from: G */
    public static void m152887G(Runnable runnable) {
        f130056a.post(runnable);
    }

    /* JADX INFO: renamed from: H */
    public static void m152888H(Context context, final Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (!(context instanceof Act)) {
            f130056a.postDelayed(runnable, j);
            return;
        }
        Act act = (Act) context;
        f130057b.put(runnable, act.duringCreated((C22421c) m152912r(j), false).doOnUnsubscribe(new x20() { // from class: l.f51
            @Override // p153l.x20
            public final void call() {
                l51.f130057b.remove(runnable);
            }
        }).doOnTerminate(new x20() { // from class: l.g51
            @Override // p153l.x20
            public final void call() {
                l51.f130057b.remove(runnable);
            }
        }).takeUntil(act.lifecycle().filter(new C18348a(runnable))).subscribe(new y20() { // from class: l.h51
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152905k(runnable, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static void m152889I(Frag frag, final Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (frag == null) {
            f130056a.postDelayed(runnable, j);
        } else {
            f130057b.put(runnable, frag.duringCreated(m152912r(j)).doOnUnsubscribe(new x20() { // from class: l.j51
                @Override // p153l.x20
                public final void call() {
                    l51.f130057b.remove(runnable);
                }
            }).doOnTerminate(new x20() { // from class: l.k51
                @Override // p153l.x20
                public final void call() {
                    l51.f130057b.remove(runnable);
                }
            }).takeUntil(frag.lifecycle().filter(new qcj() { // from class: l.y41
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    C4470c c4470c = (C4470c) obj;
                    return Boolean.valueOf(c4470c == C4470c.f16271m || c4470c == C4470c.f16270l);
                }
            })).subscribe(new y20() { // from class: l.z41
                @Override // p153l.y20
                public final void call(Object obj) {
                    l51.m152906l(runnable, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m152890J(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        ConcurrentHashMap<Runnable, kcg0> concurrentHashMap = f130057b;
        if (concurrentHashMap.containsKey(runnable)) {
            concurrentHashMap.remove(runnable).unsubscribe();
        } else {
            f130056a.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m152891K(String str) {
        f130058c.remove(str);
    }

    /* JADX INFO: renamed from: L */
    public static void m152892L(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null) {
            alarmManager.set(1, System.currentTimeMillis() + 500, activity);
            m152885E();
        } else {
            o1j0.m165636j("请手动启动APP");
            m152888H(context, new Runnable() { // from class: l.a51
                @Override // java.lang.Runnable
                public final void run() {
                    l51.m152885E();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m152893M(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f130056a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: N */
    public static C22421c<Long> m152894N(final String str, int i) {
        C22421c<Long> c22421c = f130058c.get(str);
        if (c22421c != null) {
            return c22421c;
        }
        C22421c<Long> c22421cCacheWithInitialCapacity = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().take(i).observeOn(fo0.m126432a()).doOnCompleted(new x20() { // from class: l.i51
            @Override // p153l.x20
            public final void call() {
                l51.f130058c.remove(str);
            }
        }).cacheWithInitialCapacity(1);
        f130058c.put(str, c22421cCacheWithInitialCapacity);
        return c22421cCacheWithInitialCapacity;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m152896b(Runnable runnable, Boolean bool) {
        f130057b.remove(runnable);
        if (bool.booleanValue()) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m152898d(Runnable runnable, gcg0 gcg0Var) {
        runnable.run();
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m152905k(Runnable runnable, Long l2) {
        f130057b.remove(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m152906l(Runnable runnable, Long l2) {
        f130057b.remove(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: n */
    public static void m152908n(final Runnable runnable) {
        C22421c.create(new C22421c.a() { // from class: l.b51
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152898d(runnable, (gcg0) obj);
            }
        }).compose(psd0.m173605P()).compose(psd0.m173603N()).subscribe();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m152909o(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return f130057b.containsKey(runnable);
    }

    /* JADX INFO: renamed from: p */
    public static void m152910p(Intent intent, Intent intent2) {
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
    public static void m152911q(String str) {
        try {
            ((ClipboardManager) App.f16088e.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Återställningskod", str));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<Long> m152912r(long j) {
        return C22421c.timer(j, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a());
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m152913s(Runnable runnable) {
        FastIoScheduler.f16348a.execute(runnable);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static void m152914t(Runnable runnable, boolean z) {
        if (m152884D() || z) {
            FastIoScheduler.f16348a.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public static File m152915u(String str) {
        File file = new File(App.f16088e.getCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: v */
    public static File m152916v(String str) {
        File file = new File(App.f16088e.getExternalCacheDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m152917w() {
        if (Build.BRAND.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
            return App.f16088e.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m152918x() {
        if (!Build.BRAND.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
            return false;
        }
        try {
            Class<?> clsLoadClass = App.f16088e.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m152919y(Runnable runnable) {
        m152920z(runnable, true);
    }

    /* JADX INFO: renamed from: z */
    public static void m152920z(Runnable runnable, boolean z) {
        ThreadUtil.m82493e(runnable, z);
    }
}
