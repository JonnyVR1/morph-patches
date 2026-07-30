package p153l;

import com.heytap.mcssdk.mode.CommandMessage;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.C15274a;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/spd;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", CommandMessage.COMMAND, "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "close", "", "toString", "()Ljava/lang/String;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "default", "Z", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class spd extends ExecutorCoroutineDispatcher implements Executor {

    @NotNull
    public static final spd INSTANCE = new spd();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineDispatcher default = fyj0.INSTANCE.limitedParallelism(dqh0.m117526e("kotlinx.coroutines.io.parallelism", C15274a.m88486b(64, bqh0.m105934a()), 0, 0, 12, null));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.dispatchYield(context, block);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        dispatch(EmptyCoroutineContext.INSTANCE, command);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        return fyj0.INSTANCE.limitedParallelism(parallelism);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    /* JADX INFO: renamed from: Z */
    public Executor getExecutor() {
        return this;
    }
}
