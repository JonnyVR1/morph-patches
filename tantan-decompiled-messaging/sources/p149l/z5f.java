package p149l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlinx.coroutines.C15484m;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, m87232d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "c", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/CoroutineDispatcher;", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class z5f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Executor m217296a(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Executor executor;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getExecutor()) == null) ? new b4e(coroutineDispatcher) : executor;
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CoroutineDispatcher m217297b(@NotNull Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        b4e b4eVar = executor instanceof b4e ? (b4e) executor : null;
        return (b4eVar == null || (coroutineDispatcher = b4eVar.dispatcher) == null) ? new C15484m(executor) : coroutineDispatcher;
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ExecutorCoroutineDispatcher m217298c(@NotNull ExecutorService executorService) {
        return new C15484m(executorService);
    }
}
