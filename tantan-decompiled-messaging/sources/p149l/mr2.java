package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.tol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/mr2;", "Ll/tol;", j6f.GPS_DIRECTION_TRUE, "", "Ll/vh2;", Constants.KEY_CONFIG, "<init>", "(Ll/vh2;)V", "", "f", "()V", Constants.INAPP_DATA_TAG, "c", "()Ll/tol;", "a", "g", "", "Z", "b", "()Z", "setStarted", "(Z)V", "isStarted", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "getWorkFuture", "()Ljava/util/concurrent/Future;", "setWorkFuture", "(Ljava/util/concurrent/Future;)V", "workFuture", "Ll/tol;", "getLastResult", "e", "(Ll/tol;)V", "lastResult", "Ll/vh2;", "getConfig", "()Ll/vh2;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public abstract class mr2<T extends tol<T>> {

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
    private final vh2 config;

    /* JADX INFO: renamed from: l.mr2$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/mr2$a;", "Ljava/lang/Runnable;", "<init>", "(Ll/mr2;)V", "", "run", "()V", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public final class RunnableC18540a implements Runnable {
        public RunnableC18540a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (mr2.this.getIsStarted()) {
                mr2 mr2Var = mr2.this;
                mr2Var.m156013e(mr2Var.mo18567c());
            }
        }
    }

    public mr2(@NotNull vh2 vh2Var) {
        vh2Var.getClass();
        this.config = vh2Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m156010a() {
        return this.lastResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsStarted() {
        return this.isStarted;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract T mo18567c();

    /* JADX INFO: renamed from: d */
    public final void m156012d() {
        this.lastResult = (T) mo18567c().clone();
    }

    /* JADX INFO: renamed from: e */
    public final void m156013e(@Nullable T t) {
        this.lastResult = t;
    }

    /* JADX INFO: renamed from: f */
    public void mo18568f() {
        if (this.isStarted) {
            return;
        }
        this.isStarted = true;
        ScheduledExecutorService scheduler = this.config.getScheduler();
        if (scheduler != null) {
            scheduler.scheduleAtFixedRate(new RunnableC18540a(), 0L, this.config.getSampleIntervalMs(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo18569g() {
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
