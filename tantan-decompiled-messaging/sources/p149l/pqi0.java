package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/pqi0;", "", "Ll/sid0;", "runnableScheduler", "Ll/n9q0;", "launcher", "", "timeoutMs", "<init>", "(Ll/sid0;Ll/n9q0;J)V", "Ll/vuf0;", "token", "", "c", "(Ll/vuf0;)V", "b", "a", "Ll/sid0;", "Ll/n9q0;", "J", Constants.INAPP_DATA_TAG, "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "", "Ljava/lang/Runnable;", "e", "Ljava/util/Map;", "tracked", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pqi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sid0 runnableScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n9q0 launcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long timeoutMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<vuf0, Runnable> tracked;

    @JvmOverloads
    public pqi0(@NotNull sid0 sid0Var, @NotNull n9q0 n9q0Var, long j) {
        sid0Var.getClass();
        n9q0Var.getClass();
        this.runnableScheduler = sid0Var;
        this.launcher = n9q0Var;
        this.timeoutMs = j;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m170921a(pqi0 pqi0Var, vuf0 vuf0Var) {
        pqi0Var.launcher.mo158562d(vuf0Var, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m170922b(@NotNull vuf0 token) {
        Runnable runnableRemove;
        token.getClass();
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(token);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.mo142786a(runnableRemove);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m170923c(@NotNull final vuf0 token) {
        token.getClass();
        Runnable runnable = new Runnable() { // from class: l.oqi0
            @Override // java.lang.Runnable
            public final void run() {
                pqi0.m170921a(this.f145160a, token);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(token, runnable);
        }
        this.runnableScheduler.mo142787b(this.timeoutMs, runnable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public pqi0(@NotNull sid0 sid0Var, @NotNull n9q0 n9q0Var) {
        this(sid0Var, n9q0Var, 0L, 4, null);
        sid0Var.getClass();
        n9q0Var.getClass();
    }

    public /* synthetic */ pqi0(sid0 sid0Var, n9q0 n9q0Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sid0Var, n9q0Var, (i & 4) != 0 ? 5400000L : j);
    }
}
