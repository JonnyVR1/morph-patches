package com.immomo.mmutil.task;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p149l.aud0;
import p149l.z5f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001b\u0010\u000b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0007R\u001b\u0010\u0011\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007R\u001b\u0010\u0014\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0007R\u001b\u0010\u0017\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0019"}, m87232d2 = {"Lcom/immomo/mmutil/task/Executors;", "", "<init>", "()V", "Lcom/immomo/mmutil/task/Executors$ExecutorInfo;", "a", "Lkotlin/Lazy;", "()Lcom/immomo/mmutil/task/Executors$ExecutorInfo;", "userExecutorInfo", "b", "getInnerExecutorInfo", "innerExecutorInfo", "c", "getLocalExecutorInfo", "localExecutorInfo", Constants.INAPP_DATA_TAG, "getMessageExecutorInfo", "messageExecutorInfo", "e", "getStatisticsExecutorInfo", "statisticsExecutorInfo", "f", "getIsolatedExecutorInfo", "isolatedExecutorInfo", "ExecutorInfo", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
final class Executors {
    public static final Executors INSTANCE = new Executors();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy userExecutorInfo = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorInfo>() { // from class: com.immomo.mmutil.task.Executors$userExecutorInfo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Executors.ExecutorInfo invoke() {
            return new Executors.ExecutorInfo("TYPE_RIGHT_NOW", 2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy innerExecutorInfo = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorInfo>() { // from class: com.immomo.mmutil.task.Executors$innerExecutorInfo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Executors.ExecutorInfo invoke() {
            return new Executors.ExecutorInfo("TYPE_INNER", 1);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy localExecutorInfo = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorInfo>() { // from class: com.immomo.mmutil.task.Executors$localExecutorInfo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Executors.ExecutorInfo invoke() {
            return new Executors.ExecutorInfo("TYPE_RIGHT_NOW_LOCAL", 3);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy messageExecutorInfo = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorInfo>() { // from class: com.immomo.mmutil.task.Executors$messageExecutorInfo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Executors.ExecutorInfo invoke() {
            return new Executors.ExecutorInfo("TYPE_MESSAGE", 4);
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy statisticsExecutorInfo = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorInfo>() { // from class: com.immomo.mmutil.task.Executors$statisticsExecutorInfo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Executors.ExecutorInfo invoke() {
            return new Executors.ExecutorInfo("TYPE_STATISTICS", 5);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isolatedExecutorInfo = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorInfo>() { // from class: com.immomo.mmutil.task.Executors$isolatedExecutorInfo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Executors.ExecutorInfo invoke() {
            return new Executors.ExecutorInfo("TYPE_ISOLATED", -1);
        }
    });

    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Lcom/immomo/mmutil/task/Executors$ExecutorInfo;", "", "", "executorName", "", "executorType", "<init>", "(Ljava/lang/String;I)V", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "_executor", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "_dispatcher", "c", "Lkotlin/Lazy;", "getThreadExecutor", "()Ljava/lang/Object;", "threadExecutor", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "I", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class ExecutorInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Executor _executor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private CoroutineDispatcher _dispatcher;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy threadExecutor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String executorName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int executorType;

        public ExecutorInfo(@NotNull String str, int i) {
            str.getClass();
            this.executorName = str;
            this.executorType = i;
            this.threadExecutor = LazyKt__LazyJVMKt.m87229b(new Function0<aud0>() { // from class: com.immomo.mmutil.task.Executors$ExecutorInfo$threadExecutor$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final aud0 invoke() {
                    return new aud0(this.this$0.executorType);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final synchronized CoroutineDispatcher m18427b() {
            CoroutineDispatcher coroutineDispatcher;
            try {
                ScheduledExecutorService scheduledExecutorServiceM18432c = MThreadUtilsKt.m18432c(this.executorType);
                if (this._executor != scheduledExecutorServiceM18432c) {
                    this._executor = scheduledExecutorServiceM18432c;
                    this._dispatcher = z5f.m217298c(new SafeExecutor(scheduledExecutorServiceM18432c));
                }
                coroutineDispatcher = this._dispatcher;
                if (coroutineDispatcher == null) {
                    throw new IllegalStateException("Executor=" + this.executorName + " init failed");
                }
            } catch (Throwable th) {
                throw th;
            }
            return coroutineDispatcher;
        }
    }

    private Executors() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ExecutorInfo m18425a() {
        return (ExecutorInfo) userExecutorInfo.getValue();
    }
}
