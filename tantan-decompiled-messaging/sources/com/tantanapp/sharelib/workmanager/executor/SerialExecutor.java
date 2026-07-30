package com.tantanapp.sharelib.workmanager.executor;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.core.data.Active;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/executor/SerialExecutor;", "Ljava/util/concurrent/Executor;", "", "c", "()V", "Ljava/lang/Runnable;", CommandMessage.COMMAND, "execute", "(Ljava/lang/Runnable;)V", "E", "Ljava/util/ArrayDeque;", "dequeue", "b", "(Ljava/util/ArrayDeque;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Lcom/tantanapp/sharelib/workmanager/executor/Task;", "Ljava/util/ArrayDeque;", "tasks", "Ljava/lang/Object;", "Ljava/lang/Object;", "LOCK", Constants.INAPP_DATA_TAG, "Ljava/lang/Runnable;", Active.TYPE, "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class SerialExecutor implements Executor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<Task> tasks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object LOCK;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public volatile Runnable active;

    /* JADX INFO: renamed from: b */
    public final <E> E m81562b(ArrayDeque<E> dequeue) {
        if (dequeue.isEmpty()) {
            return null;
        }
        return dequeue.removeFirst();
    }

    /* JADX INFO: renamed from: c */
    public final void m81563c() {
        synchronized (this.LOCK) {
            Task task = (Task) m81562b(this.tasks);
            if (task != null) {
                this.active = task;
                this.executor.execute(task);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Nullable Runnable command) {
        synchronized (this.LOCK) {
            try {
                this.tasks.addLast(new Task(this, command));
                if (this.active == null) {
                    m81563c();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
