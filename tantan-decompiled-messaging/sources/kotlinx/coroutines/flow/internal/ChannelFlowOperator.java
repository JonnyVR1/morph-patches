package kotlinx.coroutines.flow.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.jr4;
import p149l.she0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ll/eri;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ll/eri;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ll/fri;", "collector", "", "o", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ad90;", "scope", "f", "(Ll/ad90;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "newContext", "n", "(Ll/fri;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Ll/eri;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final eri<S> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@NotNull eri<? extends S> eriVar, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = eriVar;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ <S, T> Object m94168l(ChannelFlowOperator<S, T> channelFlowOperator, fri<? super T> friVar, Continuation<? super Unit> continuation) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext coroutineContextM93606d = CoroutineContextKt.m93606d(context, channelFlowOperator.context);
            if (Intrinsics.m87488d(coroutineContextM93606d, context)) {
                Object objMo94171o = channelFlowOperator.mo94171o(friVar, continuation);
                return objMo94171o == uwp.m196133e() ? objMo94171o : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.m87488d(coroutineContextM93606d.get(companion), context.get(companion))) {
                Object objM94170n = channelFlowOperator.m94170n(friVar, coroutineContextM93606d, continuation);
                return objM94170n == uwp.m196133e() ? objM94170n : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(friVar, continuation);
        return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ <S, T> Object m94169m(ChannelFlowOperator<S, T> channelFlowOperator, ad90<? super T> ad90Var, Continuation<? super Unit> continuation) {
        Object objMo94171o = channelFlowOperator.mo94171o(new she0(ad90Var), continuation);
        return objMo94171o == uwp.m196133e() ? objMo94171o : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) {
        return m94168l(this, friVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo94063f(@NotNull ad90<? super T> ad90Var, @NotNull Continuation<? super Unit> continuation) {
        return m94169m(this, ad90Var, continuation);
    }

    /* JADX INFO: renamed from: n */
    public final Object m94170n(fri<? super T> friVar, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        return jr4.m142921d(coroutineContext, jr4.m142922e(friVar, continuation.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public abstract Object mo94171o(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
