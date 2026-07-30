package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096A¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/gmc0;", p7f.GPS_DIRECTION_TRUE, "Ll/p3g0;", "", "Ll/ldj;", "flow", "Lkotlinx/coroutines/o;", "job", "<init>", "(Ll/p3g0;Lkotlinx/coroutines/o;)V", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ll/aui;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/aui;", "Lkotlinx/coroutines/o;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class gmc0<T> implements p3g0<T>, aui, ldj<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC15593o job;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p3g0<T> f104966b;

    /* JADX WARN: Multi-variable type inference failed */
    public gmc0(@NotNull p3g0<? extends T> p3g0Var, @Nullable InterfaceC15593o interfaceC15593o) {
        this.job = interfaceC15593o;
        this.f104966b = p3g0Var;
    }

    @Override // p153l.ldj
    @NotNull
    /* JADX INFO: renamed from: a */
    public aui<T> mo95039a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return q3g0.m175124d(this, context, capacity, onBufferOverflow);
    }

    @Override // p153l.k3f0, p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<?> continuation) {
        return this.f104966b.collect(buiVar, continuation);
    }
}
