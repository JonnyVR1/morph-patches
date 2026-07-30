package p149l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096A¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/zdc0;", j6f.GPS_DIRECTION_TRUE, "Ll/gvf0;", "", "Ll/raj;", "flow", "Lkotlinx/coroutines/o;", "job", "<init>", "(Ll/gvf0;Lkotlinx/coroutines/o;)V", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ll/eri;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/eri;", "Lkotlinx/coroutines/o;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class zdc0<T> implements gvf0<T>, eri, raj<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC15486o job;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gvf0<T> f202662b;

    /* JADX WARN: Multi-variable type inference failed */
    public zdc0(@NotNull gvf0<? extends T> gvf0Var, @Nullable InterfaceC15486o interfaceC15486o) {
        this.job = interfaceC15486o;
        this.f202662b = gvf0Var;
    }

    @Override // p149l.raj
    @NotNull
    /* JADX INFO: renamed from: a */
    public eri<T> mo94146a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return hvf0.m133166d(this, context, capacity, onBufferOverflow);
    }

    @Override // p149l.dve0, p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<?> continuation) {
        return this.f202662b.collect(friVar, continuation);
    }
}
