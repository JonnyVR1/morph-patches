package kotlinx.coroutines.flow.internal;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.jri;
import p149l.o8c;
import p149l.ppb;
import p149l.qkq0;
import p149l.raj;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H¤@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R6\u0010+\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'\u0012\u0006\u0012\u0004\u0018\u00010(0&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", j6f.GPS_DIRECTION_TRUE, "Ll/raj;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ll/eri;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/eri;", "h", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ll/ad90;", "scope", "", "f", "(Ll/ad90;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ppb;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "k", "(Ll/ppb;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Ll/fri;", "collector", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/CoroutineContext;", "b", "I", "c", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/jvm/functions/Function2;", "collectToFun", "j", "()I", "produceCapacity", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class ChannelFlow<T> implements raj<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int capacity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m87374f = "ChannelFlow.kt", m87375l = {119}, m87376m = "invokeSuspend")
    public static final class C154702 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ fri<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C154702(fri<? super T> friVar, ChannelFlow<T> channelFlow, Continuation<? super C154702> continuation) {
            super(2, continuation);
            this.$collector = friVar;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C154702 c154702 = new C154702(this.$collector, this.this$0, continuation);
            c154702.L$0 = obj;
            return c154702;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C154702) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = (ppb) this.L$0;
                fri<T> friVar = this.$collector;
                ReceiveChannel<T> receiveChannelM94167k = this.this$0.m94167k(ppbVar);
                this.label = 1;
                if (jri.m142956o(friVar, receiveChannelM94167k, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public ChannelFlow(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ <T> Object m94163e(ChannelFlow<T> channelFlow, fri<? super T> friVar, Continuation<? super Unit> continuation) {
        Object objM94059e = C15424f.m94059e(new C154702(friVar, channelFlow, null), continuation);
        return objM94059e == uwp.m196133e() ? objM94059e : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p149l.raj
    @NotNull
    /* JADX INFO: renamed from: a */
    public eri<T> mo94146a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        CoroutineContext coroutineContextPlus = context.plus(this.context);
        if (onBufferOverflow == BufferOverflow.SUSPEND) {
            int i = this.capacity;
            if (i != -3) {
                if (capacity == -3) {
                    capacity = i;
                } else if (i != -2) {
                    if (capacity == -2) {
                        capacity = i;
                    } else {
                        capacity += i;
                        if (capacity < 0) {
                            capacity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (Intrinsics.m87488d(coroutineContextPlus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : mo94064h(coroutineContextPlus, capacity, onBufferOverflow);
    }

    @Override // p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) {
        return m94163e(this, friVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m94164d() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Object mo94063f(@NotNull ad90<? super T> ad90Var, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract ChannelFlow<T> mo94064h(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow);

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Function2<ad90<? super T>, Continuation<? super Unit>, Object> m94165i() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    /* JADX INFO: renamed from: j */
    public final int m94166j() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public ReceiveChannel<T> m94167k(@NotNull ppb scope) {
        return ProduceKt.m93983e(scope, this.context, m94166j(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, m94165i(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strM94164d = m94164d();
        if (strM94164d != null) {
            arrayList.add(strM94164d);
        }
        if (this.context != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return o8c.m163111a(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
