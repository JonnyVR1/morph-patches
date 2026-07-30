package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Ll/drb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension
public final /* synthetic */ class wh3 {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: a */
    public static final <T> T m206333a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        w4f w4fVarM203844a;
        CoroutineContext coroutineContextM94498e;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            w4fVarM203844a = vxi0.INSTANCE.m203845b();
            coroutineContextM94498e = CoroutineContextKt.m94498e(l4k.INSTANCE, coroutineContext.plus(w4fVarM203844a));
        } else {
            w4f w4fVar = continuationInterceptor instanceof w4f ? (w4f) continuationInterceptor : null;
            if (w4fVar == null) {
                w4fVarM203844a = vxi0.INSTANCE.m203844a();
            } else {
                w4f w4fVar2 = w4fVar.m204883m0() ? w4fVar : null;
                if (w4fVar2 == null) {
                    w4fVarM203844a = vxi0.INSTANCE.m203844a();
                } else {
                    w4fVarM203844a = w4fVar2;
                }
            }
            coroutineContextM94498e = CoroutineContextKt.m94498e(l4k.INSTANCE, coroutineContext);
        }
        m43 m43Var = new m43(coroutineContextM94498e, threadCurrentThread, w4fVarM203844a);
        m43Var.m94626g1(CoroutineStart.DEFAULT, m43Var, function2);
        return (T) m43Var.m156978h1();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m206334b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return vh3.m201253e(coroutineContext, function2);
    }
}
