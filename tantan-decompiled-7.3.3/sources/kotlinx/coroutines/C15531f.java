package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.fpq;
import p153l.k6f;
import p153l.mbe0;
import p153l.mpq;
import p153l.q26;
import p153l.uwj0;
import p153l.uyp;

/* JADX INFO: renamed from: kotlinx.coroutines.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aL\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u0012*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001b\u0010 \u001a\u00020\u001c*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m88121d2 = {"Ll/drb;", "Lkotlin/coroutines/CoroutineContext;", "context", "h", "(Ll/drb;Lkotlin/coroutines/CoroutineContext;)Ll/drb;", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/CoroutineContext;)Ll/drb;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "(Ll/drb;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "b", "(Ll/drb;Ljava/lang/String;Ljava/lang/Throwable;)V", "f", "(Ll/drb;)V", "", "g", "(Ll/drb;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class C15531f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final drb m94947a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC15593o.INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(JobKt__JobKt.m94507b(null, 1, null));
        }
        return new q26(coroutineContext);
    }

    /* JADX INFO: renamed from: b */
    public static final void m94948b(@NotNull drb drbVar, @NotNull String str, @Nullable Throwable th) {
        m94949c(drbVar, k6f.m148513a(str, th));
    }

    /* JADX INFO: renamed from: c */
    public static final void m94949c(@NotNull drb drbVar, @Nullable CancellationException cancellationException) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) drbVar.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o != null) {
            interfaceC15593o.mo94586n(cancellationException);
        } else {
            mpq.m159379a("Scope cannot be cancelled because it does not have a job: ", drbVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m94950d(drb drbVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m94949c(drbVar, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <R> Object m94951e(@NotNull Function2<? super drb, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        mbe0 mbe0Var = new mbe0(continuation.getContext(), continuation);
        Object objM198380b = uwj0.m198380b(mbe0Var, mbe0Var, function2);
        if (objM198380b == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM198380b;
    }

    /* JADX INFO: renamed from: f */
    public static final void m94952f(@NotNull drb drbVar) {
        fpq.m126711j(drbVar.getCoroutineContext());
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m94953g(@NotNull drb drbVar) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) drbVar.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o != null) {
            return interfaceC15593o.mo94581k();
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final drb m94954h(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext) {
        return new q26(drbVar.getCoroutineContext().plus(coroutineContext));
    }
}
