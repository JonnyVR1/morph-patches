package p149l;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/cpj0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatchYield", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatch", "", "parallelism", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class cpj0 extends CoroutineDispatcher {

    @NotNull
    public static final cpj0 INSTANCE = new cpj0();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        oqd.INSTANCE.m118164c0(block, ufi0.f176264h, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        oqd.INSTANCE.m118164c0(block, ufi0.f176264h, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        cmr.m107694a(parallelism);
        return parallelism >= ufi0.f176260d ? this : super.limitedParallelism(parallelism);
    }
}
