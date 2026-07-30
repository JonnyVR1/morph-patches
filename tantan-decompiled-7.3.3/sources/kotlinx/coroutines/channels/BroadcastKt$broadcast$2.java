package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"E", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m88263f = "Broadcast.kt", m88264l = {52, 53}, m88265m = "invokeSuspend")
final class BroadcastKt$broadcast$2 extends SuspendLambda implements Function2<el90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastKt$broadcast$2(ReceiveChannel<Object> receiveChannel, Continuation<? super BroadcastKt$broadcast$2> continuation) {
        super(2, continuation);
        this.$channel = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.$channel, continuation);
        broadcastKt$broadcast$2.L$0 = obj;
        return broadcastKt$broadcast$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90<Object> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BroadcastKt$broadcast$2) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r4.mo94679E(r7, r6) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        el90 el90Var;
        ChannelIterator<Object> it;
        el90 el90Var2;
        Object objMo94807a;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            el90Var = (el90) this.L$0;
            it = this.$channel.iterator();
            this.L$0 = el90Var;
            this.L$1 = it;
            this.label = 1;
            objMo94807a = it.mo94807a(this);
            if (objMo94807a != objM198688e) {
                el90Var2 = el90Var;
                obj = objMo94807a;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                Object next = it.next();
                this.L$0 = el90Var2;
                this.L$1 = it;
                this.label = 2;
            }
            return objM198688e;
        }
        if (i == 1) {
            it = (ChannelIterator) this.L$1;
            el90Var2 = (el90) this.L$0;
            ResultKt.m88128b(obj);
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Object next2 = it.next();
            this.L$0 = el90Var2;
            this.L$1 = it;
            this.label = 2;
        } else {
            if (i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (ChannelIterator) this.L$1;
            el90Var2 = (el90) this.L$0;
            ResultKt.m88128b(obj);
        }
        el90Var = el90Var2;
        this.L$0 = el90Var;
        this.L$1 = it;
        this.label = 1;
        objMo94807a = it.mo94807a(this);
        if (objMo94807a != objM198688e) {
            el90Var2 = el90Var;
            obj = objMo94807a;
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Object next3 = it.next();
            this.L$0 = el90Var2;
            this.L$1 = it;
            this.label = 2;
        }
        return objM198688e;
    }
}
