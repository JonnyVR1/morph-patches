package p149l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC15485n;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"l/hnq", "kotlinx/coroutines/JobKt__JobKt"}, m87232d2 = {}, m87233k = 4, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class gnq {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ln5 m127160a(@Nullable InterfaceC15486o interfaceC15486o) {
        return JobKt__JobKt.m93615a(interfaceC15486o);
    }

    /* JADX INFO: renamed from: c */
    public static final void m127162c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        JobKt__JobKt.m93617c(coroutineContext, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m127164e(@NotNull InterfaceC15486o interfaceC15486o, @NotNull Continuation<? super Unit> continuation) {
        return JobKt__JobKt.m93619e(interfaceC15486o, continuation);
    }

    /* JADX INFO: renamed from: f */
    public static final void m127165f(@NotNull InterfaceC15486o interfaceC15486o, @Nullable CancellationException cancellationException) {
        JobKt__JobKt.m93620f(interfaceC15486o, cancellationException);
    }

    /* JADX INFO: renamed from: h */
    public static final void m127167h(@NotNull bf4<?> bf4Var, @NotNull Future<?> future) {
        hnq.m131973a(bf4Var, future);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final l4e m127168i(@NotNull InterfaceC15486o interfaceC15486o, @NotNull l4e l4eVar) {
        return JobKt__JobKt.m93622h(interfaceC15486o, l4eVar);
    }

    /* JADX INFO: renamed from: j */
    public static final void m127169j(@NotNull CoroutineContext coroutineContext) {
        JobKt__JobKt.m93623i(coroutineContext);
    }

    /* JADX INFO: renamed from: k */
    public static final void m127170k(@NotNull InterfaceC15486o interfaceC15486o) {
        JobKt__JobKt.m93624j(interfaceC15486o);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final InterfaceC15486o m127171l(@NotNull CoroutineContext coroutineContext) {
        return JobKt__JobKt.m93625k(coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final l4e m127172m(@NotNull InterfaceC15486o interfaceC15486o, boolean z, boolean z2, @NotNull InterfaceC15485n interfaceC15485n) {
        return JobKt__JobKt.m93626l(interfaceC15486o, z, z2, interfaceC15485n);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m127174o(@NotNull CoroutineContext coroutineContext) {
        return JobKt__JobKt.m93628n(coroutineContext);
    }
}
