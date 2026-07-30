package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001dR\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b \u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010>\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010.\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010B\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010?\u001a\u0004\b0\u0010\u0016\"\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010H\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0011\u0010J\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010I¨\u0006L"}, m87232d2 = {"Ll/ke1;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Ll/gzg0;", "delegateOpenHelper", "", RXScreenCaptureService.KEY_INDEX, "(Ll/gzg0;)V", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Ll/fzg0;", "block", "e", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "h", "()Ll/fzg0;", Constants.INAPP_DATA_TAG, "()V", "c", "Ljava/lang/Runnable;", "onAutoClose", "k", "(Ljava/lang/Runnable;)V", "a", "Ll/gzg0;", "g", "()Ll/gzg0;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "onAutoCloseCallback", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "J", "autoCloseTimeoutInMs", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "Ll/fzg0;", "setDelegateDatabase$room_runtime_release", "(Ll/fzg0;)V", "delegateDatabase", "", "j", "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "()Z", "isActive", "Companion", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ke1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public gzg0 delegateOpenHelper;

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
    public fzg0 delegateDatabase;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean manuallyClosed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Runnable executeAutoCloser;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Runnable autoCloser;

    public ke1(long j, @NotNull TimeUnit timeUnit, @NotNull Executor executor) {
        timeUnit.getClass();
        executor.getClass();
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.executor = executor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: l.ie1
            @Override // java.lang.Runnable
            public final void run() {
                ke1.m145700a(this.f112702a);
            }
        };
        this.autoCloser = new Runnable() { // from class: l.je1
            @Override // java.lang.Runnable
            public final void run() {
                ke1.m145701b(this.f117455a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m145700a(ke1 ke1Var) {
        ke1Var.getClass();
        ke1Var.executor.execute(ke1Var.autoCloser);
    }

    /* JADX INFO: renamed from: b */
    public static void m145701b(ke1 ke1Var) {
        Unit unit;
        ke1Var.getClass();
        synchronized (ke1Var.lock) {
            try {
                if (SystemClock.uptimeMillis() - ke1Var.lastDecrementRefCountTimeStamp < ke1Var.autoCloseTimeoutInMs) {
                    return;
                }
                if (ke1Var.refCount != 0) {
                    return;
                }
                Runnable runnable = ke1Var.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                fzg0 fzg0Var = ke1Var.delegateDatabase;
                if (fzg0Var != null && fzg0Var.isOpen()) {
                    fzg0Var.close();
                }
                ke1Var.delegateDatabase = null;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m145702c() throws IOException {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                fzg0 fzg0Var = this.delegateDatabase;
                if (fzg0Var != null) {
                    fzg0Var.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m145703d() {
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
    public final <V> V m145704e(@NotNull Function1<? super fzg0, ? extends V> block) {
        block.getClass();
        try {
            return block.invoke(m145707h());
        } finally {
            m145703d();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final fzg0 getDelegateDatabase() {
        return this.delegateDatabase;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final gzg0 m145706g() {
        gzg0 gzg0Var = this.delegateOpenHelper;
        if (gzg0Var != null) {
            return gzg0Var;
        }
        Intrinsics.m87502r("delegateOpenHelper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final fzg0 m145707h() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (this.manuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            fzg0 fzg0Var = this.delegateDatabase;
            if (fzg0Var != null && fzg0Var.isOpen()) {
                return fzg0Var;
            }
            fzg0 fzg0VarMo3891C = m145706g().mo3891C();
            this.delegateDatabase = fzg0VarMo3891C;
            return fzg0VarMo3891C;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m145708i(@NotNull gzg0 delegateOpenHelper) {
        delegateOpenHelper.getClass();
        m145711l(delegateOpenHelper);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m145709j() {
        return !this.manuallyClosed;
    }

    /* JADX INFO: renamed from: k */
    public final void m145710k(@NotNull Runnable onAutoClose) {
        onAutoClose.getClass();
        this.onAutoCloseCallback = onAutoClose;
    }

    /* JADX INFO: renamed from: l */
    public final void m145711l(@NotNull gzg0 gzg0Var) {
        gzg0Var.getClass();
        this.delegateOpenHelper = gzg0Var;
    }
}
