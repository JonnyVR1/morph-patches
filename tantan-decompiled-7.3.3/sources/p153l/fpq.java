package p153l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC15592n;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"l/gpq", "kotlinx/coroutines/JobKt__JobKt"}, m88121d2 = {}, m88122k = 4, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class fpq {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final po5 m126702a(@Nullable InterfaceC15593o interfaceC15593o) {
        return JobKt__JobKt.m94506a(interfaceC15593o);
    }

    /* JADX INFO: renamed from: c */
    public static final void m126704c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        JobKt__JobKt.m94508c(coroutineContext, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m126706e(@NotNull InterfaceC15593o interfaceC15593o, @NotNull Continuation<? super Unit> continuation) {
        return JobKt__JobKt.m94510e(interfaceC15593o, continuation);
    }

    /* JADX INFO: renamed from: f */
    public static final void m126707f(@NotNull InterfaceC15593o interfaceC15593o, @Nullable CancellationException cancellationException) {
        JobKt__JobKt.m94511f(interfaceC15593o, cancellationException);
    }

    /* JADX INFO: renamed from: h */
    public static final void m126709h(@NotNull ag4<?> ag4Var, @NotNull Future<?> future) {
        gpq.m131282a(ag4Var, future);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final z5e m126710i(@NotNull InterfaceC15593o interfaceC15593o, @NotNull z5e z5eVar) {
        return JobKt__JobKt.m94513h(interfaceC15593o, z5eVar);
    }

    /* JADX INFO: renamed from: j */
    public static final void m126711j(@NotNull CoroutineContext coroutineContext) {
        JobKt__JobKt.m94514i(coroutineContext);
    }

    /* JADX INFO: renamed from: k */
    public static final void m126712k(@NotNull InterfaceC15593o interfaceC15593o) {
        JobKt__JobKt.m94515j(interfaceC15593o);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final InterfaceC15593o m126713l(@NotNull CoroutineContext coroutineContext) {
        return JobKt__JobKt.m94516k(coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final z5e m126714m(@NotNull InterfaceC15593o interfaceC15593o, boolean z, boolean z2, @NotNull InterfaceC15592n interfaceC15592n) {
        return JobKt__JobKt.m94517l(interfaceC15593o, z, z2, interfaceC15592n);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m126716o(@NotNull CoroutineContext coroutineContext) {
        return JobKt__JobKt.m94519n(coroutineContext);
    }
}
