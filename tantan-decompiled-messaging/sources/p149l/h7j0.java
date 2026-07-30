package p149l;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.core.data.Active;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/h7j0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", CommandMessage.COMMAND, "", "execute", "(Ljava/lang/Runnable;)V", "c", "()V", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", "b", "Ljava/util/ArrayDeque;", "tasks", "Ljava/lang/Runnable;", Active.TYPE, "", Constants.INAPP_DATA_TAG, "Ljava/lang/Object;", "syncLock", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class h7j0 implements Executor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<Runnable> tasks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Runnable active;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Object syncLock;

    public h7j0(@NotNull Executor executor) {
        executor.getClass();
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m129743b(Runnable runnable, h7j0 h7j0Var) {
        runnable.getClass();
        h7j0Var.getClass();
        try {
            runnable.run();
        } finally {
            h7j0Var.m129744c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m129744c() {
        synchronized (this.syncLock) {
            try {
                Runnable runnablePoll = this.tasks.poll();
                Runnable runnable = runnablePoll;
                this.active = runnable;
                if (runnablePoll != null) {
                    this.executor.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull final Runnable command) {
        command.getClass();
        synchronized (this.syncLock) {
            try {
                this.tasks.offer(new Runnable() { // from class: l.g7j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h7j0.m129743b(command, this);
                    }
                });
                if (this.active == null) {
                    m129744c();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
