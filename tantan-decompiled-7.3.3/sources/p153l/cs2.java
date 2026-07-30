package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.erl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/cs2;", "Ll/erl;", p7f.GPS_DIRECTION_TRUE, "", "Ll/ci2;", Constants.KEY_CONFIG, "<init>", "(Ll/ci2;)V", "", "f", "()V", Constants.INAPP_DATA_TAG, "c", "()Ll/erl;", "a", "g", "", "Z", "b", "()Z", "setStarted", "(Z)V", "isStarted", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "getWorkFuture", "()Ljava/util/concurrent/Future;", "setWorkFuture", "(Ljava/util/concurrent/Future;)V", "workFuture", "Ll/erl;", "getLastResult", "e", "(Ll/erl;)V", "lastResult", "Ll/ci2;", "getConfig", "()Ll/ci2;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public abstract class cs2<T extends erl<T>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private volatile boolean isStarted;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Future<?> workFuture;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private T lastResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ci2 config;

    /* JADX INFO: renamed from: l.cs2$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/cs2$a;", "Ljava/lang/Runnable;", "<init>", "(Ll/cs2;)V", "", "run", "()V", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public final class RunnableC16345a implements Runnable {
        public RunnableC16345a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (cs2.this.getIsStarted()) {
                cs2 cs2Var = cs2.this;
                cs2Var.m112112e(cs2Var.mo19547c());
            }
        }
    }

    public cs2(@NotNull ci2 ci2Var) {
        ci2Var.getClass();
        this.config = ci2Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m112109a() {
        return this.lastResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsStarted() {
        return this.isStarted;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract T mo19547c();

    /* JADX INFO: renamed from: d */
    public final void m112111d() {
        this.lastResult = (T) mo19547c().clone();
    }

    /* JADX INFO: renamed from: e */
    public final void m112112e(@Nullable T t) {
        this.lastResult = t;
    }

    /* JADX INFO: renamed from: f */
    public void mo19548f() {
        if (this.isStarted) {
            return;
        }
        this.isStarted = true;
        ScheduledExecutorService scheduler = this.config.getScheduler();
        if (scheduler != null) {
            scheduler.scheduleAtFixedRate(new RunnableC16345a(), 0L, this.config.getSampleIntervalMs(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo19549g() {
        if (this.isStarted) {
            Future<?> future = this.workFuture;
            if (future != null) {
                future.cancel(true);
            }
            this.isStarted = false;
        }
        this.lastResult = null;
    }
}
