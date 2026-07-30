package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.iap.C1587g;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001cR\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010G\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Ll/i50;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "u", "(Landroid/app/Application;Ljava/lang/String;)V", "", "p", "()Z", "Ljava/util/UUID;", "n", "()Ljava/util/UUID;", "Landroid/app/Activity;", "activity", "q", "(Landroid/app/Activity;)V", Constants.KEY_T, "m", "()Landroid/app/Activity;", BLiveStormDanmakuGiftResourceType.f45294s, "r", BLiveStormDanmakuGiftResourceType.f45292l, "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "c", "iapExecutor", "Ljava/util/concurrent/ScheduledFuture;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", "e", "Ljava/lang/Object;", "currentFutureLock", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Ll/tse0;", "g", "Ll/tse0;", "currentSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", RXScreenCaptureService.KEY_INDEX, "", "j", "J", "currentActivityAppearTime", "", "k", "I", "activityReferences", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "currActivity", "previousActivityName", "o", "()I", "sessionTimeoutInSeconds", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class i50 {

    @NotNull
    public static final i50 INSTANCE = new i50();

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
    public static volatile tse0 currentSession;

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

    /* JADX INFO: renamed from: l.i50$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m88121d2 = {"l/i50$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C17644a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            activity.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivityCreated");
            uv0.m198217a();
            i50.m138598q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            activity.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivityDestroyed");
            i50.INSTANCE.m138603r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            activity.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivityPaused");
            uv0.m198217a();
            i50.INSTANCE.m138604s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            activity.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivityResumed");
            uv0.m198217a();
            i50.m138599t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            activity.getClass();
            outState.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            activity.getClass();
            i50.activityReferences++;
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            activity.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, i50.TAG, "onActivityStopped");
            AppEventsLogger.INSTANCE.m7707h();
            i50.activityReferences--;
        }
    }

    static {
        String canonicalName = i50.class.getCanonicalName();
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
    public static void m138584a() {
        if (currentSession == null) {
            currentSession = tse0.INSTANCE.m192602b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m138585b(long j, String str, Context context) {
        tse0 tse0Var;
        str.getClass();
        tse0 tse0Var2 = currentSession;
        Long lM192592e = tse0Var2 != null ? tse0Var2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new tse0(Long.valueOf(j), null, null, 4, null);
            String str2 = appId;
            context.getClass();
            vse0.m202607b(str, null, str2, context);
        } else if (lM192592e != null) {
            long jLongValue = j - lM192592e.longValue();
            if (jLongValue > INSTANCE.m138602o() * 1000) {
                vse0.m202608d(str, currentSession, appId);
                String str3 = appId;
                context.getClass();
                vse0.m202607b(str, null, str3, context);
                currentSession = new tse0(Long.valueOf(j), null, null, 4, null);
            } else if (jLongValue > 1000 && (tse0Var = currentSession) != null) {
                tse0Var.m192595h();
            }
        }
        tse0 tse0Var3 = currentSession;
        if (tse0Var3 != null) {
            tse0Var3.m192598k(Long.valueOf(j));
        }
        tse0 tse0Var4 = currentSession;
        if (tse0Var4 != null) {
            tse0Var4.m192600m();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m138586c(boolean z) {
        if (z) {
            tc5.m190425e();
        } else {
            tc5.m190424d();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m138587d(long j, String str) {
        str.getClass();
        if (currentSession == null) {
            currentSession = new tse0(Long.valueOf(j), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            vse0.m202608d(str, currentSession, appId);
            tse0.INSTANCE.m192601a();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m138588e() {
        C1587g.m7962h();
    }

    /* JADX INFO: renamed from: f */
    public static void m138589f(final long j, final String str) {
        str.getClass();
        if (currentSession == null) {
            currentSession = new tse0(Long.valueOf(j), null, null, 4, null);
        }
        tse0 tse0Var = currentSession;
        if (tse0Var != null) {
            tse0Var.m192598k(Long.valueOf(j));
        }
        if (foregroundActivityCount.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: l.h50
                @Override // java.lang.Runnable
                public final void run() {
                    i50.m138587d(j, str);
                }
            };
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(runnable, INSTANCE.m138602o(), TimeUnit.SECONDS);
                Unit unit = Unit.INSTANCE;
            }
        }
        long j2 = currentActivityAppearTime;
        vj1.m201433i(str, j2 > 0 ? (j - j2) / 1000 : 0L);
        tse0 tse0Var2 = currentSession;
        if (tse0Var2 != null) {
            tse0Var2.m192600m();
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: m */
    public static final Activity m138595m() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final UUID m138596n() {
        tse0 tse0Var;
        if (currentSession == null || (tse0Var = currentSession) == null) {
            return null;
        }
        return tse0Var.getSessionId();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p */
    public static final boolean m138597p() {
        return activityReferences == 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m138598q(@Nullable Activity activity) {
        singleThreadExecutor.execute(new Runnable() { // from class: l.g50
            @Override // java.lang.Runnable
            public final void run() {
                i50.m138584a();
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m138599t(@NotNull Activity activity) {
        activity.getClass();
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.m138601l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        final String strM8917u = C1680e.m8917u(activity);
        tc5.m190430k(activity);
        aa00.m96619c(activity);
        i2h0.m138195g(activity);
        String str = previousActivityName;
        if (str != null && StringsKt.m94303P(str, "ProxyBillingActivity", false, 2, null) && !Intrinsics.m88377d(strM8917u, "ProxyBillingActivity")) {
            iapExecutor.execute(new Runnable() { // from class: l.d50
                @Override // java.lang.Runnable
                public final void run() {
                    i50.m138588e();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: l.e50
            @Override // java.lang.Runnable
            public final void run() {
                i50.m138585b(jCurrentTimeMillis, strM8917u, applicationContext);
            }
        });
        previousActivityName = strM8917u;
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m138600u(@NotNull Application application, @Nullable String appId2) {
        application.getClass();
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.m8730a(FeatureManager.Feature.CodelessEvents, new FeatureManager.InterfaceC1665a() { // from class: l.c50
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    i50.m138586c(z);
                }
            });
            appId = appId2;
            application.registerActivityLifecycleCallbacks(new C17644a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m138601l() {
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
    public final int m138602o() {
        C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
        return c1679dM8743f == null ? iy5.m142609a() : c1679dM8743f.getSessionTimeoutInSeconds();
    }

    /* JADX INFO: renamed from: r */
    public final void m138603r(Activity activity) {
        tc5.m190428i(activity);
    }

    /* JADX INFO: renamed from: s */
    public final void m138604s(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        m138601l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strM8917u = C1680e.m8917u(activity);
        tc5.m190429j(activity);
        singleThreadExecutor.execute(new Runnable() { // from class: l.f50
            @Override // java.lang.Runnable
            public final void run() {
                i50.m138589f(jCurrentTimeMillis, strM8917u);
            }
        });
    }
}
