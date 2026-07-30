package p149l;

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
import kotlinx.coroutines.AbstractC15403a;
import kotlinx.coroutines.C15478i;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001aZ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/ppb;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/o;", "c", "(Ll/ppb;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/o;", j6f.GPS_DIRECTION_TRUE, "Ll/gsd;", "a", "(Ll/ppb;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ll/gsd;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension
public final /* synthetic */ class jh3 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> gsd<T> m141364a(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextM93607e = CoroutineContextKt.m93607e(ppbVar, coroutineContext);
        hsd r7rVar = coroutineStart.isLazy() ? new r7r(coroutineContextM93607e, function2) : new hsd(coroutineContextM93607e, true);
        ((AbstractC15403a) r7rVar).m93734g1(coroutineStart, r7rVar, function2);
        return (gsd<T>) r7rVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ gsd m141365b(ppb ppbVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return hh3.m130932a(ppbVar, coroutineContext, coroutineStart, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15486o m141366c(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextM93607e = CoroutineContextKt.m93607e(ppbVar, coroutineContext);
        AbstractC15403a s9rVar = coroutineStart.isLazy() ? new s9r(coroutineContextM93607e, function2) : new dtf0(coroutineContextM93607e, true);
        s9rVar.m93734g1(coroutineStart, s9rVar, function2);
        return s9rVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC15486o m141367d(ppb ppbVar, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return hh3.m130934c(ppbVar, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m141368e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        Object objM94191h1;
        CoroutineContext context = continuation.getContext();
        CoroutineContext coroutineContextM93606d = CoroutineContextKt.m93606d(context, coroutineContext);
        gnq.m127169j(coroutineContextM93606d);
        if (coroutineContextM93606d == context) {
            i3e0 i3e0Var = new i3e0(coroutineContextM93606d, continuation);
            objM94191h1 = rnj0.m180070b(i3e0Var, i3e0Var, function2);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.m87488d(coroutineContextM93606d.get(key), context.get(key))) {
                qnj0 qnj0Var = new qnj0(coroutineContextM93606d, continuation);
                CoroutineContext context2 = qnj0Var.getContext();
                Object objM94217c = ThreadContextKt.m94217c(context2, null);
                try {
                    Object objM180070b = rnj0.m180070b(qnj0Var, qnj0Var, function2);
                    ThreadContextKt.m94215a(context2, objM94217c);
                    objM94191h1 = objM180070b;
                } catch (Throwable th) {
                    ThreadContextKt.m94215a(context2, objM94217c);
                    throw th;
                }
            } else {
                C15478i c15478i = new C15478i(coroutineContextM93606d, continuation);
                ff4.m121108d(function2, c15478i, c15478i, null, 4, null);
                objM94191h1 = c15478i.m94191h1();
            }
        }
        if (objM94191h1 == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM94191h1;
    }
}
