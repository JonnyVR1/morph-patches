package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.os.Handler;
import android.os.HandlerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1601a;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;
import p149l.she;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\u001c\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$¨\u0006'"}, m87232d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/a;", "", "<init>", "()V", "Ll/she;", "animation", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "frameResult", "", "e", "(Ll/she;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;)V", "", "g", "()Z", "f", "", "delta", "h", "(Ll/she;I)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "successCounter", "b", "failuresCounter", "c", "criticalCounter", "Ljava/util/concurrent/ConcurrentHashMap;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ConcurrentHashMap;", "runningAnimations", "Landroid/os/Handler;", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "calculatePerformance", "clearUnusedFrameLoaders", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1601a {

    @NotNull
    public static final C1601a INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger successCounter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger failuresCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger criticalCounter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<she, Integer> runningAnimations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Lazy handler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Runnable calculatePerformance;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Runnable clearUnusedFrameLoaders;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6378a;

        static {
            int[] iArr = new int[FrameResult.FrameType.values().length];
            try {
                iArr[FrameResult.FrameType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameResult.FrameType.NEAREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameResult.FrameType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6378a = iArr;
        }
    }

    static {
        C1601a c1601a = new C1601a();
        INSTANCE = c1601a;
        successCounter = new AtomicInteger(0);
        failuresCounter = new AtomicInteger(0);
        criticalCounter = new AtomicInteger(0);
        runningAnimations = new ConcurrentHashMap<>();
        handler = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.yq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1601a.m8332b();
            }
        });
        Runnable runnable = new Runnable() { // from class: l.zq0
            @Override // java.lang.Runnable
            public final void run() {
                C1601a.m8331a();
            }
        };
        calculatePerformance = runnable;
        Runnable runnable2 = new Runnable() { // from class: l.ar0
            @Override // java.lang.Runnable
            public final void run() {
                C1601a.m8333c();
            }
        };
        clearUnusedFrameLoaders = runnable2;
        c1601a.m8334d().post(runnable);
        c1601a.m8334d().post(runnable2);
    }

    /* JADX INFO: renamed from: a */
    public static void m8331a() {
        float andSet = successCounter.getAndSet(0);
        float andSet2 = failuresCounter.getAndSet(0);
        float andSet3 = criticalCounter.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f > 0.25f || f3 > 0.1f) {
                for (Map.Entry<she, Integer> entry : runningAnimations.entrySet()) {
                    INSTANCE.m8338h(entry.getKey(), -entry.getValue().intValue());
                }
            } else if (f2 > 0.98f) {
                for (Map.Entry<she, Integer> entry2 : runningAnimations.entrySet()) {
                    INSTANCE.m8338h(entry2.getKey(), entry2.getValue().intValue());
                }
            }
            runningAnimations.clear();
        }
        INSTANCE.m8337g();
    }

    /* JADX INFO: renamed from: b */
    public static Handler m8332b() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: c */
    public static void m8333c() {
        C1604d.INSTANCE.m8361a(new Date(System.currentTimeMillis() - 10000));
        INSTANCE.m8336f();
    }

    /* JADX INFO: renamed from: d */
    public final Handler m8334d() {
        return (Handler) handler.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m8335e(@NotNull she animation, @NotNull FrameResult frameResult) {
        animation.getClass();
        frameResult.getClass();
        ConcurrentHashMap<she, Integer> concurrentHashMap = runningAnimations;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.mo134364c() * 0.2f)));
        }
        int i = a.f6378a[frameResult.getType().ordinal()];
        if (i == 1) {
            successCounter.incrementAndGet();
            return;
        }
        if (i == 2) {
            failuresCounter.incrementAndGet();
        } else if (i == 3) {
            criticalCounter.incrementAndGet();
        } else {
            l9r.m149037a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8336f() {
        return m8334d().postDelayed(clearUnusedFrameLoaders, 10000L);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8337g() {
        return m8334d().postDelayed(calculatePerformance, 2000L);
    }

    /* JADX INFO: renamed from: h */
    public final void m8338h(she animation, int delta) {
        int iM87601g = C15167a.m87601g(animation.mo134363b() + delta, (int) C15167a.m87595a(animation.mo134364c() * 0.5f, 1.0f), animation.mo134364c());
        if (iM87601g != animation.mo134363b()) {
            animation.mo134362a(iM87601g);
        }
    }
}
