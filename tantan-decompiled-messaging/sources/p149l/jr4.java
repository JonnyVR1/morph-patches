package p149l;

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
@Metadata(m87231d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "b", "(Ll/eri;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ll/fri;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", "(Ll/fri;Lkotlin/coroutines/CoroutineContext;)Ll/fri;", j6f.GPS_MEASUREMENT_INTERRUPTED, "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class jr4 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> ChannelFlow<T> m142919b(@NotNull eri<? extends T> eriVar) {
        ChannelFlow<T> channelFlow = eriVar instanceof ChannelFlow ? (ChannelFlow) eriVar : null;
        if (channelFlow == null) {
            return new lr4(eriVar, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T, V> Object m142920c(@NotNull CoroutineContext coroutineContext, V v2, @NotNull Object obj, @NotNull Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object objM94217c = ThreadContextKt.m94217c(coroutineContext, obj);
        try {
            ssf0 ssf0Var = new ssf0(continuation, coroutineContext);
            Object objM87369d = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m87369d(function2, v2, ssf0Var) : ((Function2) TypeIntrinsics.m87540g(function2, 2)).invoke(v2, ssf0Var);
            ThreadContextKt.m94215a(coroutineContext, objM94217c);
            if (objM87369d == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM87369d;
        } catch (Throwable th) {
            ThreadContextKt.m94215a(coroutineContext, objM94217c);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m142921d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.m94216b(coroutineContext);
        }
        return m142920c(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final <T> fri<T> m142922e(fri<? super T> friVar, CoroutineContext coroutineContext) {
        return friVar instanceof she0 ? true : friVar instanceof tl40 ? friVar : new UndispatchedContextCollector(friVar, coroutineContext);
    }
}
