package p153l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/x5d0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Ll/ag4;", "", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Ll/ag4;)V", "run", "()V", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Ll/ag4;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class x5d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ag4<Unit> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public x5d0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull ag4<? super Unit> ag4Var) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = ag4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.mo94635B(this.dispatcher, Unit.INSTANCE);
    }
}
