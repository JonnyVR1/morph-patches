package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.g5f;
import p149l.gnq;
import p149l.i3e0;
import p149l.l16;
import p149l.nnq;
import p149l.ppb;
import p149l.rnj0;
import p149l.uwp;

/* JADX INFO: renamed from: kotlinx.coroutines.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aL\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u0012*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/ppb;", "Lkotlin/coroutines/CoroutineContext;", "context", "g", "(Ll/ppb;Lkotlin/coroutines/CoroutineContext;)Ll/ppb;", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/CoroutineContext;)Ll/ppb;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "(Ll/ppb;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "b", "(Ll/ppb;Ljava/lang/String;Ljava/lang/Throwable;)V", "f", "(Ll/ppb;)V", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class C15424f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ppb m94055a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC15486o.INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(JobKt__JobKt.m93616b(null, 1, null));
        }
        return new l16(coroutineContext);
    }

    /* JADX INFO: renamed from: b */
    public static final void m94056b(@NotNull ppb ppbVar, @NotNull String str, @Nullable Throwable th) {
        m94057c(ppbVar, g5f.m124517a(str, th));
    }

    /* JADX INFO: renamed from: c */
    public static final void m94057c(@NotNull ppb ppbVar, @Nullable CancellationException cancellationException) {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) ppbVar.getCoroutineContext().get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o != null) {
            interfaceC15486o.mo93695n(cancellationException);
        } else {
            nnq.m160357a("Scope cannot be cancelled because it does not have a job: ", ppbVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m94058d(ppb ppbVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m94057c(ppbVar, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <R> Object m94059e(@NotNull Function2<? super ppb, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        i3e0 i3e0Var = new i3e0(continuation.getContext(), continuation);
        Object objM180070b = rnj0.m180070b(i3e0Var, i3e0Var, function2);
        if (objM180070b == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM180070b;
    }

    /* JADX INFO: renamed from: f */
    public static final void m94060f(@NotNull ppb ppbVar) {
        gnq.m127169j(ppbVar.getCoroutineContext());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final ppb m94061g(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext) {
        return new l16(ppbVar.getCoroutineContext().plus(coroutineContext));
    }
}
