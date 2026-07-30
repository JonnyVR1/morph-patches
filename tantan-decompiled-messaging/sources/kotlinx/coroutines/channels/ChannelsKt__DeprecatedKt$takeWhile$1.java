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
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m87374f = "Deprecated.kt", m87375l = {299, 300, 301}, m87376m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $predicate;
    final /* synthetic */ ReceiveChannel $this_takeWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_takeWhile = receiveChannel;
        this.$predicate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.$this_takeWhile, this.$predicate, continuation);
        channelsKt__DeprecatedKt$takeWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90 ad90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[PHI: r1 r6 r10
      0x0059: PHI (r1v5 kotlinx.coroutines.channels.ChannelIterator) = (r1v7 kotlinx.coroutines.channels.ChannelIterator), (r1v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r6v3 l.ad90) = (r6v5 l.ad90), (r6v7 l.ad90) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r10v7 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0095 -> B:13:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r9.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3e
            if (r1 == r5) goto L32
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r9.L$0
            l.ad90 r6 = (p149l.ad90) r6
            kotlin.ResultKt.m87239b(r10)
            goto L4c
        L1e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r9)
            return r2
        L24:
            java.lang.Object r1 = r9.L$2
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r9.L$0
            l.ad90 r7 = (p149l.ad90) r7
            kotlin.ResultKt.m87239b(r10)
            goto L7b
        L32:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r9.L$0
            l.ad90 r6 = (p149l.ad90) r6
            kotlin.ResultKt.m87239b(r10)
            goto L59
        L3e:
            kotlin.ResultKt.m87239b(r10)
            java.lang.Object r10 = r9.L$0
            l.ad90 r10 = (p149l.ad90) r10
            kotlinx.coroutines.channels.ReceiveChannel r1 = r9.$this_takeWhile
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r10
        L4c:
            r9.L$0 = r6
            r9.L$1 = r1
            r9.label = r5
            java.lang.Object r10 = r1.mo93915a(r9)
            if (r10 != r0) goto L59
            goto L94
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r1.next()
            kotlin.jvm.functions.Function2 r7 = r9.$predicate
            r9.L$0 = r6
            r9.L$1 = r1
            r9.L$2 = r10
            r9.label = r4
            java.lang.Object r7 = r7.invoke(r10, r9)
            if (r7 != r0) goto L76
            goto L94
        L76:
            r8 = r1
            r1 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L7b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L86
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L86:
            r9.L$0 = r7
            r9.L$1 = r6
            r9.L$2 = r2
            r9.label = r3
            java.lang.Object r10 = r7.mo93787E(r1, r9)
            if (r10 != r0) goto L95
        L94:
            return r0
        L95:
            r1 = r6
            r6 = r7
            goto L4c
        L98:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
