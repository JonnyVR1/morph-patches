package p153l;

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
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/szi0;", "", "Ll/vqd0;", "runnableScheduler", "Ll/siq0;", "launcher", "", "timeoutMs", "<init>", "(Ll/vqd0;Ll/siq0;J)V", "Ll/e3g0;", "token", "", "c", "(Ll/e3g0;)V", "b", "a", "Ll/vqd0;", "Ll/siq0;", "J", Constants.INAPP_DATA_TAG, "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "", "Ljava/lang/Runnable;", "e", "Ljava/util/Map;", "tracked", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class szi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final vqd0 runnableScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final siq0 launcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long timeoutMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<e3g0, Runnable> tracked;

    @JvmOverloads
    public szi0(@NotNull vqd0 vqd0Var, @NotNull siq0 siq0Var, long j) {
        vqd0Var.getClass();
        siq0Var.getClass();
        this.runnableScheduler = vqd0Var;
        this.launcher = siq0Var;
        this.timeoutMs = j;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m188653a(szi0 szi0Var, e3g0 e3g0Var) {
        szi0Var.launcher.mo186033d(e3g0Var, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m188654b(@NotNull e3g0 token) {
        Runnable runnableRemove;
        token.getClass();
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(token);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.mo202376a(runnableRemove);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m188655c(@NotNull final e3g0 token) {
        token.getClass();
        Runnable runnable = new Runnable() { // from class: l.rzi0
            @Override // java.lang.Runnable
            public final void run() {
                szi0.m188653a(this.f165544a, token);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(token, runnable);
        }
        this.runnableScheduler.mo202377b(this.timeoutMs, runnable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public szi0(@NotNull vqd0 vqd0Var, @NotNull siq0 siq0Var) {
        this(vqd0Var, siq0Var, 0L, 4, null);
        vqd0Var.getClass();
        siq0Var.getClass();
    }

    public /* synthetic */ szi0(vqd0 vqd0Var, siq0 siq0Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vqd0Var, siq0Var, (i & 4) != 0 ? 5400000L : j);
    }
}
