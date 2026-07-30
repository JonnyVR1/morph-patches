package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"E", "Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m87374f = "Broadcast.kt", m87375l = {52, 53}, m87376m = "invokeSuspend")
final class BroadcastKt$broadcast$2 extends SuspendLambda implements Function2<ad90<Object>, Continuation<? super Unit>, Object> {
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
    public final Object invoke(@NotNull ad90<Object> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BroadcastKt$broadcast$2) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r4.mo93787E(r7, r6) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r6.L$0
            l.ad90 r4 = (p149l.ad90) r4
            kotlin.ResultKt.m87239b(r7)
        L19:
            r7 = r4
            goto L3b
        L1b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r6)
            r6 = 0
            return r6
        L22:
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r6.L$0
            l.ad90 r4 = (p149l.ad90) r4
            kotlin.ResultKt.m87239b(r7)
            goto L4b
        L2e:
            kotlin.ResultKt.m87239b(r7)
            java.lang.Object r7 = r6.L$0
            l.ad90 r7 = (p149l.ad90) r7
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r6.$channel
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L3b:
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r4 = r1.mo93915a(r6)
            if (r4 != r0) goto L48
            goto L63
        L48:
            r5 = r4
            r4 = r7
            r7 = r5
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L64
            java.lang.Object r7 = r1.next()
            r6.L$0 = r4
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.mo93787E(r7, r6)
            if (r7 != r0) goto L19
        L63:
            return r0
        L64:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
