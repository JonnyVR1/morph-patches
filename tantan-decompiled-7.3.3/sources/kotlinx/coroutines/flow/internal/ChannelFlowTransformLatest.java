package kotlinx.coroutines.flow.internal;

import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bw\u0012B\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u001c\u0010\u001dRP\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", p7f.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlin/Function3;", "Ll/bui;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "Ll/aui;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function3;Ll/aui;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "h", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "collector", "o", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/jvm/functions/Function3;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function3<bui<? super R>, T, Continuation<? super Unit>, Object> transform;

    public /* synthetic */ ChannelFlowTransformLatest(Function3 function3, aui auiVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, auiVar, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* JADX INFO: renamed from: h */
    public ChannelFlow<R> mo94957h(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return new ChannelFlowTransformLatest(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @Nullable
    /* JADX INFO: renamed from: o */
    public Object mo95064o(@NotNull bui<? super R> buiVar, @NotNull Continuation<? super Unit> continuation) {
        Object objM94951e = C15531f.m94951e(new ChannelFlowTransformLatest$flowCollect$3(this, buiVar, null), continuation);
        return objM94951e == uyp.m198688e() ? objM94951e : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(@NotNull Function3<? super bui<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull aui<? extends T> auiVar, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        super(auiVar, coroutineContext, i, bufferOverflow);
        this.transform = function3;
    }
}
