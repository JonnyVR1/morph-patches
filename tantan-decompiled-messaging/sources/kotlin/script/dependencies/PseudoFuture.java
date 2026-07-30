package kotlin.script.dependencies;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Lkotlin/script/dependencies/PseudoFuture;", j6f.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Future;", "get", "()Ljava/lang/Object;", "", "p0", "Ljava/util/concurrent/TimeUnit;", "p1", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "", "cancel", "(Z)Z", "isDone", "()Z", "isCancelled", "a", "Ljava/lang/Object;", "value", "kotlin-script-runtime"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class PseudoFuture<T> implements Future<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final T value;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean p0) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long p0, @NotNull TimeUnit p1) {
        p1.getClass();
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.value;
    }
}
