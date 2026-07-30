package p149l;

import java.util.Collection;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.C15468a;
import kotlinx.coroutines.flow.FlowKt__BuildersKt;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.FlowKt__CollectKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__CountKt;
import kotlinx.coroutines.flow.FlowKt__DelayKt;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "l/vri", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/a", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, m87232d2 = {}, m87233k = 4, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class jri {
    @Nullable
    /* JADX INFO: renamed from: A */
    public static final <T> Object m142929A(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94105g(eriVar, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final <T> InterfaceC15486o m142930B(@NotNull eri<? extends T> eriVar, @NotNull ppb ppbVar) {
        return FlowKt__CollectKt.m94076d(eriVar, ppbVar);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final <T, R> eri<R> m142931C(@NotNull eri<? extends T> eriVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__MergeKt.m94097a(eriVar, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public static final <T> eri<T> m142932D(@NotNull eri<? extends T> eriVar, @NotNull Function3<? super fri<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.m94086d(eriVar, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public static final <T> eri<T> m142933E(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__TransformKt.m94109a(eriVar, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public static final <T> ReceiveChannel<T> m142934F(@NotNull eri<? extends T> eriVar, @NotNull ppb ppbVar) {
        return FlowKt__ChannelsKt.m94072d(eriVar, ppbVar);
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public static final <S, T extends S> Object m142935G(@NotNull eri<? extends T> eriVar, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) {
        return FlowKt__ReduceKt.m94106h(eriVar, function3, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public static final <T> eri<T> m142936H(@NotNull eri<? extends T> eriVar, @NotNull Function4<? super fri<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return FlowKt__ErrorsKt.m94091e(eriVar, function4);
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public static final <T> Object m142937I(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94107i(eriVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public static final <T> Object m142938J(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94108j(eriVar, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public static final <T> eri<T> m142939K(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.m94096e(eriVar, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public static final <T, C extends Collection<? super T>> Object m142940L(@NotNull eri<? extends T> eriVar, @NotNull C c, @NotNull Continuation<? super C> continuation) {
        return FlowKt__CollectionKt.m94077a(eriVar, c, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public static final <T, R> eri<R> m142941M(@NotNull eri<? extends T> eriVar, @BuilderInference @NotNull Function3<? super fri<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__MergeKt.m94098b(eriVar, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> eri<T> m142942a(@NotNull Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.m94065a(iterable);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> gvf0<T> m142943b(@NotNull mt10<T> mt10Var) {
        return C15468a.m94160a(mt10Var);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> eri<T> m142944c(@NotNull eri<? extends T> eriVar, int i, @NotNull BufferOverflow bufferOverflow) {
        return vri.m199664a(eriVar, i, bufferOverflow);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> eri<T> m142946e(@BuilderInference @NotNull Function2<? super ad90<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.m94066b(function2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> eri<T> m142947f(@NotNull eri<? extends T> eriVar, @NotNull Function3<? super fri<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__ErrorsKt.m94087a(eriVar, function3);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m142948g(@NotNull eri<? extends T> eriVar, @NotNull fri<? super T> friVar, @NotNull Continuation<? super Throwable> continuation) {
        return FlowKt__ErrorsKt.m94088b(eriVar, friVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Object m142949h(@NotNull eri<?> eriVar, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.m94073a(eriVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final <T> Object m142950i(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.m94074b(eriVar, function2, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final <T> eri<T> m142951j(@NotNull eri<? extends T> eriVar) {
        return vri.m199667d(eriVar);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final <T> Object m142952k(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.m94078a(eriVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final <T> Object m142953l(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.m94079b(eriVar, function2, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final <T> eri<T> m142954m(@NotNull eri<? extends T> eriVar) {
        return FlowKt__DistinctKt.m94081a(eriVar);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final <T> eri<T> m142955n(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.m94094c(eriVar, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final <T> Object m142956o(@NotNull fri<? super T> friVar, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__ChannelsKt.m94070b(friVar, receiveChannel, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static final <T> Object m142957p(@NotNull fri<? super T> friVar, @NotNull eri<? extends T> eriVar, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.m94075c(friVar, eriVar, continuation);
    }

    /* JADX INFO: renamed from: q */
    public static final void m142958q(@NotNull fri<?> friVar) {
        FlowKt__EmittersKt.m94084b(friVar);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static final <T> Object m142959r(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94099a(eriVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static final <T> Object m142960s(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94100b(eriVar, function2, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static final <T> Object m142961t(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94101c(eriVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static final <T> Object m142962u(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94102d(eriVar, function2, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final ReceiveChannel<Unit> m142963v(@NotNull ppb ppbVar, long j) {
        return FlowKt__DelayKt.m94080a(ppbVar, j);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final <T> eri<T> m142964w(@BuilderInference @NotNull Function2<? super fri<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.m94067c(function2);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final <T> eri<T> m142965x(T t) {
        return FlowKt__BuildersKt.m94068d(t);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final <T> eri<T> m142966y(@NotNull eri<? extends T> eriVar, @NotNull CoroutineContext coroutineContext) {
        return vri.m199668e(eriVar, coroutineContext);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public static final <T> Object m142967z(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.m94104f(eriVar, continuation);
    }
}
