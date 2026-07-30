package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"E", "Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m87374f = "Deprecated.kt", m87375l = {284, 285}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: $n */
    final /* synthetic */ int f66748$n;
    final /* synthetic */ ReceiveChannel $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f66748$n = i;
        this.$this_take = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f66748$n, this.$this_take, continuation);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90 ad90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r5.mo93787E(r8, r7) == r0) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1e
            int r1 = r7.I$0
            java.lang.Object r2 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r7.L$0
            l.ad90 r5 = (p149l.ad90) r5
            kotlin.ResultKt.m87239b(r8)
        L1c:
            r8 = r5
            goto L7a
        L1e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            return r2
        L24:
            int r1 = r7.I$0
            java.lang.Object r2 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r7.L$0
            l.ad90 r5 = (p149l.ad90) r5
            kotlin.ResultKt.m87239b(r8)
            goto L5f
        L32:
            kotlin.ResultKt.m87239b(r8)
            java.lang.Object r8 = r7.L$0
            l.ad90 r8 = (p149l.ad90) r8
            int r1 = r7.f66748$n
            if (r1 != 0) goto L40
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L40:
            if (r1 < 0) goto L44
            r5 = r4
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L84
            kotlinx.coroutines.channels.ReceiveChannel r2 = r7.$this_take
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()
        L4d:
            r7.L$0 = r8
            r7.L$1 = r2
            r7.I$0 = r1
            r7.label = r4
            java.lang.Object r5 = r2.mo93915a(r7)
            if (r5 != r0) goto L5c
            goto L79
        L5c:
            r6 = r5
            r5 = r8
            r8 = r6
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L81
            java.lang.Object r8 = r2.next()
            r7.L$0 = r5
            r7.L$1 = r2
            r7.I$0 = r1
            r7.label = r3
            java.lang.Object r8 = r5.mo93787E(r8, r7)
            if (r8 != r0) goto L1c
        L79:
            return r0
        L7a:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L4d
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L81:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L84:
            java.lang.String r7 = "Requested element count "
            java.lang.String r8 = " is less than zero."
            p149l.pce0.m168340a(r7, r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
