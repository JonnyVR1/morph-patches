package p149l;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/ba5;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ll/ppb;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineScope", "(Ll/ppb;)V", "", "close", "()V", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ba5 implements AutoCloseable, ppb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ba5(@NotNull ppb ppbVar) {
        this(ppbVar.getCoroutineContext());
        ppbVar.getClass();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m93618d(getCoroutineContext(), null, 1, null);
    }

    @Override // p149l.ppb
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public ba5(@NotNull CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.coroutineContext = coroutineContext;
    }
}
