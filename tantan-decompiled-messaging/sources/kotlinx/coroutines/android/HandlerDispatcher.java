package kotlinx.coroutines.android;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterfaceC15477h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bf4;
import p149l.hpw;
import p149l.l4e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, m87232d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Ll/hpw;", "Lkotlinx/coroutines/h;", "<init>", "()V", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "immediate", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class HandlerDispatcher extends hpw implements InterfaceC15477h {
    public /* synthetic */ HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Deprecated
    @Nullable
    public Object delay(long j, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC15477h.a.m94186a(this, j, continuation);
    }

    @Override // p149l.hpw
    @NotNull
    public abstract HandlerDispatcher getImmediate();

    @NotNull
    public l4e invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC15477h.a.m94187b(this, j, runnable, coroutineContext);
    }

    public abstract /* synthetic */ void scheduleResumeAfterDelay(long j, @NotNull bf4 bf4Var);

    private HandlerDispatcher() {
    }
}
