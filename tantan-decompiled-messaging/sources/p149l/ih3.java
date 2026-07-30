package p149l;

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
@Metadata(m87231d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Ll/ppb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension
public final /* synthetic */ class ih3 {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: a */
    public static final <T> T m136183a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        s3f s3fVarM189885a;
        CoroutineContext coroutineContextM93607e;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            s3fVarM189885a = toi0.INSTANCE.m189886b();
            coroutineContextM93607e = CoroutineContextKt.m93607e(t1k.INSTANCE, coroutineContext.plus(s3fVarM189885a));
        } else {
            s3f s3fVar = continuationInterceptor instanceof s3f ? (s3f) continuationInterceptor : null;
            if (s3fVar == null) {
                s3fVarM189885a = toi0.INSTANCE.m189885a();
            } else {
                s3f s3fVar2 = s3fVar.m182159l0() ? s3fVar : null;
                if (s3fVar2 == null) {
                    s3fVarM189885a = toi0.INSTANCE.m189885a();
                } else {
                    s3fVarM189885a = s3fVar2;
                }
            }
            coroutineContextM93607e = CoroutineContextKt.m93607e(t1k.INSTANCE, coroutineContext);
        }
        w33 w33Var = new w33(coroutineContextM93607e, threadCurrentThread, s3fVarM189885a);
        w33Var.m93734g1(CoroutineStart.DEFAULT, w33Var, function2);
        return (T) w33Var.m201250h1();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m136184b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return hh3.m130936e(coroutineContext, function2);
    }
}
