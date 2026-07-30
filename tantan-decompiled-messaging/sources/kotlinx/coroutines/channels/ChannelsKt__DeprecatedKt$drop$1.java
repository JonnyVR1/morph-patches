package kotlinx.coroutines.channels;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.ad90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"E", "Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m87374f = "Deprecated.kt", m87375l = {CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNONNULL, 200}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: $n */
    final /* synthetic */ int f66747$n;
    final /* synthetic */ ReceiveChannel $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f66747$n = i;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f66747$n, this.$this_drop, continuation);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90 ad90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r9 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r2.mo93787E(r9, r8) == r0) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a3 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r8.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L31
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1f
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r2 = r8.L$0
            l.ad90 r2 = (p149l.ad90) r2
            kotlin.ResultKt.m87239b(r9)
        L1d:
            r9 = r2
            goto L7d
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r8)
            return r2
        L25:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r2 = r8.L$0
            l.ad90 r2 = (p149l.ad90) r2
            kotlin.ResultKt.m87239b(r9)
            goto L8d
        L31:
            int r1 = r8.I$0
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r8.L$0
            l.ad90 r6 = (p149l.ad90) r6
            kotlin.ResultKt.m87239b(r9)
            goto L67
        L3f:
            kotlin.ResultKt.m87239b(r9)
            java.lang.Object r9 = r8.L$0
            l.ad90 r9 = (p149l.ad90) r9
            int r1 = r8.f66747$n
            if (r1 < 0) goto L4c
            r6 = r5
            goto L4d
        L4c:
            r6 = 0
        L4d:
            if (r6 == 0) goto La9
            if (r1 <= 0) goto L77
            kotlinx.coroutines.channels.ReceiveChannel r2 = r8.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()
            r6 = r9
        L58:
            r8.L$0 = r6
            r8.L$1 = r2
            r8.I$0 = r1
            r8.label = r5
            java.lang.Object r9 = r2.mo93915a(r8)
            if (r9 != r0) goto L67
            goto La5
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L76
            r2.next()
            int r1 = r1 + (-1)
            if (r1 != 0) goto L58
        L76:
            r9 = r6
        L77:
            kotlinx.coroutines.channels.ReceiveChannel r1 = r8.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L7d:
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r4
            java.lang.Object r2 = r1.mo93915a(r8)
            if (r2 != r0) goto L8a
            goto La5
        L8a:
            r7 = r2
            r2 = r9
            r9 = r7
        L8d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La6
            java.lang.Object r9 = r1.next()
            r8.L$0 = r2
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r9 = r2.mo93787E(r9, r8)
            if (r9 != r0) goto L1d
        La5:
            return r0
        La6:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        La9:
            java.lang.String r8 = "Requested element count "
            java.lang.String r9 = " is less than zero."
            p149l.pce0.m168340a(r8, r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
