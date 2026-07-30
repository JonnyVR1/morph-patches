package p153l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15510a;
import kotlinx.coroutines.C15585i;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001aZ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/drb;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/o;", "c", "(Ll/drb;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/o;", p7f.GPS_DIRECTION_TRUE, "Ll/utd;", "a", "(Ll/drb;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ll/utd;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension
public final /* synthetic */ class xh3 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> utd<T> m210977a(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextM94498e = CoroutineContextKt.m94498e(drbVar, coroutineContext);
        vtd t9rVar = coroutineStart.isLazy() ? new t9r(coroutineContextM94498e, function2) : new vtd(coroutineContextM94498e, true);
        ((AbstractC15510a) t9rVar).m94626g1(coroutineStart, t9rVar, function2);
        return (utd<T>) t9rVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ utd m210978b(drb drbVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return vh3.m201249a(drbVar, coroutineContext, coroutineStart, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15593o m210979c(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextM94498e = CoroutineContextKt.m94498e(drbVar, coroutineContext);
        AbstractC15510a ubrVar = coroutineStart.isLazy() ? new ubr(coroutineContextM94498e, function2) : new m1g0(coroutineContextM94498e, true);
        ubrVar.m94626g1(coroutineStart, ubrVar, function2);
        return ubrVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC15593o m210980d(drb drbVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return vh3.m201251c(drbVar, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m210981e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        Object objM95084h1;
        CoroutineContext context = continuation.getContext();
        CoroutineContext coroutineContextM94497d = CoroutineContextKt.m94497d(context, coroutineContext);
        fpq.m126711j(coroutineContextM94497d);
        if (coroutineContextM94497d == context) {
            mbe0 mbe0Var = new mbe0(coroutineContextM94497d, continuation);
            objM95084h1 = uwj0.m198380b(mbe0Var, mbe0Var, function2);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.m88377d(coroutineContextM94497d.get(key), context.get(key))) {
                twj0 twj0Var = new twj0(coroutineContextM94497d, continuation);
                CoroutineContext context2 = twj0Var.getContext();
                Object objM95110c = ThreadContextKt.m95110c(context2, null);
                try {
                    Object objM198380b = uwj0.m198380b(twj0Var, twj0Var, function2);
                    ThreadContextKt.m95108a(context2, objM95110c);
                    objM95084h1 = objM198380b;
                } catch (Throwable th) {
                    ThreadContextKt.m95108a(context2, objM95110c);
                    throw th;
                }
            } else {
                C15585i c15585i = new C15585i(coroutineContextM94497d, continuation);
                eg4.m120756d(function2, c15585i, c15585i, null, 4, null);
                objM95084h1 = c15585i.m95084h1();
            }
        }
        if (objM95084h1 == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM95084h1;
    }
}
