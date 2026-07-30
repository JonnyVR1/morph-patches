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
import p153l.aui;
import p153l.bui;
import p153l.el90;
import p153l.is4;
import p153l.p7f;
import p153l.uyp;
import p153l.xpe0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ll/aui;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ll/aui;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ll/bui;", "collector", "", "o", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/el90;", "scope", "f", "(Ll/el90;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "newContext", "n", "(Ll/bui;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Ll/aui;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final aui<S> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@NotNull aui<? extends S> auiVar, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = auiVar;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ <S, T> Object m95061l(ChannelFlowOperator<S, T> channelFlowOperator, bui<? super T> buiVar, Continuation<? super Unit> continuation) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext coroutineContextM94497d = CoroutineContextKt.m94497d(context, channelFlowOperator.context);
            if (Intrinsics.m88377d(coroutineContextM94497d, context)) {
                Object objMo95064o = channelFlowOperator.mo95064o(buiVar, continuation);
                return objMo95064o == uyp.m198688e() ? objMo95064o : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.m88377d(coroutineContextM94497d.get(companion), context.get(companion))) {
                Object objM95063n = channelFlowOperator.m95063n(buiVar, coroutineContextM94497d, continuation);
                return objM95063n == uyp.m198688e() ? objM95063n : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(buiVar, continuation);
        return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ <S, T> Object m95062m(ChannelFlowOperator<S, T> channelFlowOperator, el90<? super T> el90Var, Continuation<? super Unit> continuation) {
        Object objMo95064o = channelFlowOperator.mo95064o(new xpe0(el90Var), continuation);
        return objMo95064o == uyp.m198688e() ? objMo95064o : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) {
        return m95061l(this, buiVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo94956f(@NotNull el90<? super T> el90Var, @NotNull Continuation<? super Unit> continuation) {
        return m95062m(this, el90Var, continuation);
    }

    /* JADX INFO: renamed from: n */
    public final Object m95063n(bui<? super T> buiVar, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        return is4.m141867d(coroutineContext, is4.m141868e(buiVar, continuation.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public abstract Object mo95064o(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
