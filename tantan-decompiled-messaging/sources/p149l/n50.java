package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.iap.C1564g;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001cR\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010G\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Ll/n50;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "u", "(Landroid/app/Application;Ljava/lang/String;)V", "", "p", "()Z", "Ljava/util/UUID;", "n", "()Ljava/util/UUID;", "Landroid/app/Activity;", "activity", "q", "(Landroid/app/Activity;)V", Constants.KEY_T, "m", "()Landroid/app/Activity;", BLiveStormDanmakuGiftResourceType.f44446s, "r", BLiveStormDanmakuGiftResourceType.f44444l, "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "c", "iapExecutor", "Ljava/util/concurrent/ScheduledFuture;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", "e", "Ljava/lang/Object;", "currentFutureLock", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Ll/oke0;", "g", "Ll/oke0;", "currentSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", RXScreenCaptureService.KEY_INDEX, "", "j", "J", "currentActivityAppearTime", "", "k", "I", "activityReferences", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "currActivity", "previousActivityName", "o", "()I", "sessionTimeoutInSeconds", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class n50 {

    @NotNull
    public static final n50 INSTANCE = new n50();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final ScheduledExecutorService iapExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static volatile ScheduledFuture<?> currentFuture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Object currentFutureLock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger foregroundActivityCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static volatile oke0 currentSession;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean tracking;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static String appId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static long currentActivityAppearTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static int activityReferences;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<Activity> currActivity;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public static String previousActivityName;

    /* JADX INFO: renamed from: l.n50$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m87232d2 = {"l/n50$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C18624a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            activity.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivityCreated");
            nv0.m161518a();
            n50.m157973q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            activity.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivityDestroyed");
            n50.INSTANCE.m157978r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            activity.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivityPaused");
            nv0.m161518a();
            n50.INSTANCE.m157979s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            activity.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivityResumed");
            nv0.m161518a();
            n50.m157974t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            activity.getClass();
            outState.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            activity.getClass();
            n50.activityReferences++;
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            activity.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, n50.TAG, "onActivityStopped");
            AppEventsLogger.INSTANCE.m7653h();
            n50.activityReferences--;
        }
    }

    static {
        String canonicalName = n50.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        iapExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m157959a() {
        if (currentSession == null) {
            currentSession = oke0.INSTANCE.m164855b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m157960b(long j, String str, Context context) {
        oke0 oke0Var;
        str.getClass();
        oke0 oke0Var2 = currentSession;
        Long lM164845e = oke0Var2 != null ? oke0Var2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new oke0(Long.valueOf(j), null, null, 4, null);
            String str2 = appId;
            context.getClass();
            qke0.m175370b(str, null, str2, context);
        } else if (lM164845e != null) {
            long jLongValue = j - lM164845e.longValue();
            if (jLongValue > INSTANCE.m157977o() * 1000) {
                qke0.m175371d(str, currentSession, appId);
                String str3 = appId;
                context.getClass();
                qke0.m175370b(str, null, str3, context);
                currentSession = new oke0(Long.valueOf(j), null, null, 4, null);
            } else if (jLongValue > 1000 && (oke0Var = currentSession) != null) {
                oke0Var.m164848h();
            }
        }
        oke0 oke0Var3 = currentSession;
        if (oke0Var3 != null) {
            oke0Var3.m164851k(Long.valueOf(j));
        }
        oke0 oke0Var4 = currentSession;
        if (oke0Var4 != null) {
            oke0Var4.m164853m();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m157961c(boolean z) {
        if (z) {
            tb5.m187800e();
        } else {
            tb5.m187799d();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m157962d(long j, String str) {
        str.getClass();
        if (currentSession == null) {
            currentSession = new oke0(Long.valueOf(j), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            qke0.m175371d(str, currentSession, appId);
            oke0.INSTANCE.m164854a();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m157963e() {
        C1564g.m7908h();
    }

    /* JADX INFO: renamed from: f */
    public static void m157964f(final long j, final String str) {
        str.getClass();
        if (currentSession == null) {
            currentSession = new oke0(Long.valueOf(j), null, null, 4, null);
        }
        oke0 oke0Var = currentSession;
        if (oke0Var != null) {
            oke0Var.m164851k(Long.valueOf(j));
        }
        if (foregroundActivityCount.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: l.m50
                @Override // java.lang.Runnable
                public final void run() {
                    n50.m157962d(j, str);
                }
            };
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(runnable, INSTANCE.m157977o(), TimeUnit.SECONDS);
                Unit unit = Unit.INSTANCE;
            }
        }
        long j2 = currentActivityAppearTime;
        oj1.m164593i(str, j2 > 0 ? (j - j2) / 1000 : 0L);
        oke0 oke0Var2 = currentSession;
        if (oke0Var2 != null) {
            oke0Var2.m164853m();
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: m */
    public static final Activity m157970m() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final UUID m157971n() {
        oke0 oke0Var;
        if (currentSession == null || (oke0Var = currentSession) == null) {
            return null;
        }
        return oke0Var.getSessionId();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p */
    public static final boolean m157972p() {
        return activityReferences == 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m157973q(@Nullable Activity activity) {
        singleThreadExecutor.execute(new Runnable() { // from class: l.l50
            @Override // java.lang.Runnable
            public final void run() {
                n50.m157959a();
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m157974t(@NotNull Activity activity) {
        activity.getClass();
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.m157976l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        final String strM8863u = C1657e.m8863u(activity);
        tb5.m187805k(activity);
        d100.m109563c(activity);
        aug0.m98990g(activity);
        String str = previousActivityName;
        if (str != null && StringsKt.m93412P(str, "ProxyBillingActivity", false, 2, null) && !Intrinsics.m87488d(strM8863u, "ProxyBillingActivity")) {
            iapExecutor.execute(new Runnable() { // from class: l.i50
                @Override // java.lang.Runnable
                public final void run() {
                    n50.m157963e();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: l.j50
            @Override // java.lang.Runnable
            public final void run() {
                n50.m157960b(jCurrentTimeMillis, strM8863u, applicationContext);
            }
        });
        previousActivityName = strM8863u;
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m157975u(@NotNull Application application, @Nullable String appId2) {
        application.getClass();
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.m8676a(FeatureManager.Feature.CodelessEvents, new FeatureManager.InterfaceC1642a() { // from class: l.h50
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    n50.m157961c(z);
                }
            });
            appId = appId2;
            application.registerActivityLifecycleCallbacks(new C18624a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m157976l() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            try {
                if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                    scheduledFuture.cancel(false);
                }
                currentFuture = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m157977o() {
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        return c1656dM8689f == null ? dx5.m113971a() : c1656dM8689f.getSessionTimeoutInSeconds();
    }

    /* JADX INFO: renamed from: r */
    public final void m157978r(Activity activity) {
        tb5.m187803i(activity);
    }

    /* JADX INFO: renamed from: s */
    public final void m157979s(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        m157976l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strM8863u = C1657e.m8863u(activity);
        tb5.m187804j(activity);
        singleThreadExecutor.execute(new Runnable() { // from class: l.k50
            @Override // java.lang.Runnable
            public final void run() {
                n50.m157964f(jCurrentTimeMillis, strM8863u);
            }
        });
    }
}
