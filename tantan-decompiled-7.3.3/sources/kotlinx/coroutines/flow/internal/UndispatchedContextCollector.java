package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.is4;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", p7f.GPS_DIRECTION_TRUE, "Ll/bui;", "downstream", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "<init>", "(Ll/bui;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/CoroutineContext;", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "c", "Lkotlin/jvm/functions/Function2;", "emitRef", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class UndispatchedContextCollector<T> implements bui<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext emitContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, Continuation<? super Unit>, Object> emitRef;

    public UndispatchedContextCollector(@NotNull bui<? super T> buiVar, @NotNull CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = ThreadContextKt.m95109b(coroutineContext);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(buiVar, null);
    }

    @Override // p153l.bui
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objM141866c = is4.m141866c(this.emitContext, t, this.countOrElement, this.emitRef, continuation);
        return objM141866c == uyp.m198688e() ? objM141866c : Unit.INSTANCE;
    }
}
