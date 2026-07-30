package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001dR\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b \u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010>\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010.\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010B\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010?\u001a\u0004\b0\u0010\u0016\"\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010H\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0011\u0010J\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010I¨\u0006L"}, m88121d2 = {"Ll/re1;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Ll/o7h0;", "delegateOpenHelper", "", RXScreenCaptureService.KEY_INDEX, "(Ll/o7h0;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Ll/n7h0;", "block", "e", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "h", "()Ll/n7h0;", Constants.INAPP_DATA_TAG, "()V", "c", "Ljava/lang/Runnable;", "onAutoClose", "k", "(Ljava/lang/Runnable;)V", "a", "Ll/o7h0;", "g", "()Ll/o7h0;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "onAutoCloseCallback", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "J", "autoCloseTimeoutInMs", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "Ll/n7h0;", "setDelegateDatabase$room_runtime_release", "(Ll/n7h0;)V", "delegateDatabase", "", "j", "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "()Z", "isActive", "Companion", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class re1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public o7h0 delegateOpenHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Runnable onAutoCloseCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long autoCloseTimeoutInMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public int refCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long lastDecrementRefCountTimeStamp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    @Nullable
    public n7h0 delegateDatabase;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean manuallyClosed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Runnable executeAutoCloser;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Runnable autoCloser;

    public re1(long j, @NotNull TimeUnit timeUnit, @NotNull Executor executor) {
        timeUnit.getClass();
        executor.getClass();
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.executor = executor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: l.pe1
            @Override // java.lang.Runnable
            public final void run() {
                re1.m180946a(this.f151858a);
            }
        };
        this.autoCloser = new Runnable() { // from class: l.qe1
            @Override // java.lang.Runnable
            public final void run() {
                re1.m180947b(this.f156781a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m180946a(re1 re1Var) {
        re1Var.getClass();
        re1Var.executor.execute(re1Var.autoCloser);
    }

    /* JADX INFO: renamed from: b */
    public static void m180947b(re1 re1Var) {
        Unit unit;
        re1Var.getClass();
        synchronized (re1Var.lock) {
            try {
                if (SystemClock.uptimeMillis() - re1Var.lastDecrementRefCountTimeStamp < re1Var.autoCloseTimeoutInMs) {
                    return;
                }
                if (re1Var.refCount != 0) {
                    return;
                }
                Runnable runnable = re1Var.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                n7h0 n7h0Var = re1Var.delegateDatabase;
                if (n7h0Var != null && n7h0Var.isOpen()) {
                    n7h0Var.close();
                }
                re1Var.delegateDatabase = null;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m180948c() throws IOException {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                n7h0 n7h0Var = this.delegateDatabase;
                if (n7h0Var != null) {
                    n7h0Var.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m180949d() {
        synchronized (this.lock) {
            try {
                int i = this.refCount;
                if (i <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i2 = i - 1;
                this.refCount = i2;
                if (i2 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final <V> V m180950e(@NotNull Function1<? super n7h0, ? extends V> block) {
        block.getClass();
        try {
            return block.invoke(m180953h());
        } finally {
            m180949d();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final n7h0 getDelegateDatabase() {
        return this.delegateDatabase;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final o7h0 m180952g() {
        o7h0 o7h0Var = this.delegateOpenHelper;
        if (o7h0Var != null) {
            return o7h0Var;
        }
        Intrinsics.m88391r("delegateOpenHelper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final n7h0 m180953h() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (this.manuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            n7h0 n7h0Var = this.delegateDatabase;
            if (n7h0Var != null && n7h0Var.isOpen()) {
                return n7h0Var;
            }
            n7h0 n7h0VarMo3892C = m180952g().mo3892C();
            this.delegateDatabase = n7h0VarMo3892C;
            return n7h0VarMo3892C;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m180954i(@NotNull o7h0 delegateOpenHelper) {
        delegateOpenHelper.getClass();
        m180957l(delegateOpenHelper);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m180955j() {
        return !this.manuallyClosed;
    }

    /* JADX INFO: renamed from: k */
    public final void m180956k(@NotNull Runnable onAutoClose) {
        onAutoClose.getClass();
        this.onAutoCloseCallback = onAutoClose;
    }

    /* JADX INFO: renamed from: l */
    public final void m180957l(@NotNull o7h0 o7h0Var) {
        o7h0Var.getClass();
        this.delegateOpenHelper = o7h0Var;
    }
}
