package kotlinx.coroutines.flow.internal;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.el90;
import p153l.fui;
import p153l.ldj;
import p153l.p7f;
import p153l.u9c;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H¤@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R6\u0010+\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'\u0012\u0006\u0012\u0004\u0018\u00010(0&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", p7f.GPS_DIRECTION_TRUE, "Ll/ldj;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Ll/aui;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/aui;", "h", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Ll/el90;", "scope", "", "f", "(Ll/el90;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/drb;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "k", "(Ll/drb;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Ll/bui;", "collector", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/CoroutineContext;", "b", "I", "c", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/jvm/functions/Function2;", "collectToFun", "j", "()I", "produceCapacity", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class ChannelFlow<T> implements ldj<T> {

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
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m88263f = "ChannelFlow.kt", m88264l = {119}, m88265m = "invokeSuspend")
    public static final class C155772 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ bui<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C155772(bui<? super T> buiVar, ChannelFlow<T> channelFlow, Continuation<? super C155772> continuation) {
            super(2, continuation);
            this.$collector = buiVar;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C155772 c155772 = new C155772(this.$collector, this.this$0, continuation);
            c155772.L$0 = obj;
            return c155772;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C155772) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = (drb) this.L$0;
                bui<T> buiVar = this.$collector;
                ReceiveChannel<T> receiveChannelM95060k = this.this$0.m95060k(drbVar);
                this.label = 1;
                if (fui.m127491o(buiVar, receiveChannelM95060k, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
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
    public static /* synthetic */ <T> Object m95056e(ChannelFlow<T> channelFlow, bui<? super T> buiVar, Continuation<? super Unit> continuation) {
        Object objM94951e = C15531f.m94951e(new C155772(buiVar, channelFlow, null), continuation);
        return objM94951e == uyp.m198688e() ? objM94951e : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p153l.ldj
    @NotNull
    /* JADX INFO: renamed from: a */
    public aui<T> mo95039a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
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
        return (Intrinsics.m88377d(coroutineContextPlus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : mo94957h(coroutineContextPlus, capacity, onBufferOverflow);
    }

    @Override // p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) {
        return m95056e(this, buiVar, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m95057d() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Object mo94956f(@NotNull el90<? super T> el90Var, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract ChannelFlow<T> mo94957h(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow);

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Function2<el90<? super T>, Continuation<? super Unit>, Object> m95058i() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    /* JADX INFO: renamed from: j */
    public final int m95059j() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public ReceiveChannel<T> m95060k(@NotNull drb scope) {
        return ProduceKt.m94875e(scope, this.context, m95059j(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, m95058i(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strM95057d = m95057d();
        if (strM95057d != null) {
            arrayList.add(strM95057d);
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
        return u9c.m195086a(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
