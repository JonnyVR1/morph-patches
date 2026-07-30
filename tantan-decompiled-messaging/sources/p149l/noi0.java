package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/noi0;", "Ll/moi0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "runnable", "", "c", "(Ljava/lang/Runnable;)V", "b", "()V", Constants.INAPP_DATA_TAG, "a", "e", "Ljava/util/concurrent/Executor;", "", "Z", "queueing", "Ljava/util/Deque;", "Ljava/util/Deque;", "runnableList", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class noi0 implements moi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean queueing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Deque<Runnable> runnableList;

    public noi0(@NotNull Executor executor) {
        executor.getClass();
        this.executor = executor;
        this.runnableList = new ArrayDeque();
    }

    @Override // p149l.moi0
    /* JADX INFO: renamed from: a */
    public synchronized void mo155508a(@NotNull Runnable runnable) {
        runnable.getClass();
        this.runnableList.remove(runnable);
    }

    @Override // p149l.moi0
    /* JADX INFO: renamed from: b */
    public synchronized void mo155509b() {
        this.queueing = true;
    }

    @Override // p149l.moi0
    /* JADX INFO: renamed from: c */
    public synchronized void mo155510c(@NotNull Runnable runnable) {
        try {
            runnable.getClass();
            if (this.queueing) {
                this.runnableList.add(runnable);
            } else {
                this.executor.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.moi0
    /* JADX INFO: renamed from: d */
    public synchronized void mo155511d() {
        this.queueing = false;
        m160414e();
    }

    /* JADX INFO: renamed from: e */
    public final void m160414e() {
        while (!this.runnableList.isEmpty()) {
            this.executor.execute(this.runnableList.pop());
        }
        this.runnableList.clear();
    }
}
