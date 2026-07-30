package kotlinx.coroutines.android;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterfaceC15584h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.gsw;
import p153l.z5e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, m88121d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Ll/gsw;", "Lkotlinx/coroutines/h;", "<init>", "()V", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "immediate", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class HandlerDispatcher extends gsw implements InterfaceC15584h {
    public /* synthetic */ HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Deprecated
    @Nullable
    public Object delay(long j, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC15584h.a.m95079a(this, j, continuation);
    }

    @Override // p153l.gsw
    @NotNull
    public abstract HandlerDispatcher getImmediate();

    @NotNull
    public z5e invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC15584h.a.m95080b(this, j, runnable, coroutineContext);
    }

    public abstract /* synthetic */ void scheduleResumeAfterDelay(long j, @NotNull ag4 ag4Var);

    private HandlerDispatcher() {
    }
}
