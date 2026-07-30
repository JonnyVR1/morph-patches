package p149l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/uxc0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Ll/bf4;", "", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Ll/bf4;)V", "run", "()V", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Ll/bf4;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class uxc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bf4<Unit> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public uxc0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull bf4<? super Unit> bf4Var) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = bf4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.mo93743B(this.dispatcher, Unit.INSTANCE);
    }
}
