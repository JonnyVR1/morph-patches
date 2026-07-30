package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface SimpleLock {

    @NotNull
    public static final Companion Companion = Companion.f66186a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66186a = new Companion();

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final DefaultSimpleLock m92483a(@Nullable Runnable runnable, @Nullable Function1<? super InterruptedException, Unit> function1) {
            return (runnable == null || function1 == null) ? new DefaultSimpleLock(null, 1, null) : new CancellableSimpleLock(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
