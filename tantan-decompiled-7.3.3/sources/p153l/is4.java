package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "b", "(Ll/aui;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ll/bui;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", "(Ll/bui;Lkotlin/coroutines/CoroutineContext;)Ll/bui;", p7f.GPS_MEASUREMENT_INTERRUPTED, "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class is4 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> ChannelFlow<T> m141865b(@NotNull aui<? extends T> auiVar) {
        ChannelFlow<T> channelFlow = auiVar instanceof ChannelFlow ? (ChannelFlow) auiVar : null;
        if (channelFlow == null) {
            return new ks4(auiVar, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T, V> Object m141866c(@NotNull CoroutineContext coroutineContext, V v2, @NotNull Object obj, @NotNull Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object objM95110c = ThreadContextKt.m95110c(coroutineContext, obj);
        try {
            b1g0 b1g0Var = new b1g0(continuation, coroutineContext);
            Object objM88258d = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m88258d(function2, v2, b1g0Var) : ((Function2) TypeIntrinsics.m88429g(function2, 2)).invoke(v2, b1g0Var);
            ThreadContextKt.m95108a(coroutineContext, objM95110c);
            if (objM88258d == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM88258d;
        } catch (Throwable th) {
            ThreadContextKt.m95108a(coroutineContext, objM95110c);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m141867d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.m95109b(coroutineContext);
        }
        return m141866c(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final <T> bui<T> m141868e(bui<? super T> buiVar, CoroutineContext coroutineContext) {
        return buiVar instanceof xpe0 ? true : buiVar instanceof hu40 ? buiVar : new UndispatchedContextCollector(buiVar, coroutineContext);
    }
}
