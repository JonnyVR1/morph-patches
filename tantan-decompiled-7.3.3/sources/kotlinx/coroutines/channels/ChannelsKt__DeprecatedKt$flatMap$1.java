package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"E", "R", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m88263f = "Deprecated.kt", m88264l = {351, 352, 352}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ ReceiveChannel $this_flatMap;
    final /* synthetic */ Function2 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_flatMap = receiveChannel;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, continuation);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90 el90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a A[PHI: r1 r5
      0x004a: PHI (r1v5 kotlinx.coroutines.channels.ChannelIterator) = 
      (r1v2 kotlinx.coroutines.channels.ChannelIterator)
      (r1v3 kotlinx.coroutines.channels.ChannelIterator)
      (r1v11 kotlinx.coroutines.channels.ChannelIterator)
     binds: [B:12:0x003c, B:22:0x007e, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r5v3 l.el90) = (r5v0 l.el90), (r5v1 l.el90), (r5v9 l.el90) binds: [B:12:0x003c, B:22:0x007e, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[PHI: r1 r5 r8
      0x0057: PHI (r1v4 kotlinx.coroutines.channels.ChannelIterator) = (r1v5 kotlinx.coroutines.channels.ChannelIterator), (r1v7 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0054, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r5v2 l.el90) = (r5v3 l.el90), (r5v5 l.el90) binds: [B:14:0x0054, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r8v6 java.lang.Object) = (r8v11 java.lang.Object), (r8v0 java.lang.Object) binds: [B:14:0x0054, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[PHI: r1 r5 r8
      0x0072: PHI (r1v3 kotlinx.coroutines.channels.ChannelIterator) = (r1v4 kotlinx.coroutines.channels.ChannelIterator), (r1v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:19:0x006f, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r5v1 l.el90) = (r5v2 l.el90), (r5v7 l.el90) binds: [B:19:0x006f, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r8v3 java.lang.Object) = (r8v10 java.lang.Object), (r8v0 java.lang.Object) binds: [B:19:0x006f, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007e -> B:13:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L30
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.L$0
            l.el90 r5 = (p153l.el90) r5
            kotlin.ResultKt.m88128b(r8)
            goto L4a
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r7)
            r7 = 0
            return r7
        L24:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.L$0
            l.el90 r5 = (p153l.el90) r5
            kotlin.ResultKt.m88128b(r8)
            goto L72
        L30:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.L$0
            l.el90 r5 = (p153l.el90) r5
            kotlin.ResultKt.m88128b(r8)
            goto L57
        L3c:
            kotlin.ResultKt.m88128b(r8)
            java.lang.Object r8 = r7.L$0
            l.el90 r8 = (p153l.el90) r8
            kotlinx.coroutines.channels.ReceiveChannel r1 = r7.$this_flatMap
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r8
        L4a:
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r4
            java.lang.Object r8 = r1.mo94807a(r7)
            if (r8 != r0) goto L57
            goto L80
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L81
            java.lang.Object r8 = r1.next()
            kotlin.jvm.functions.Function2 r6 = r7.$transform
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r8 = r6.invoke(r8, r7)
            if (r8 != r0) goto L72
            goto L80
        L72:
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = p153l.us4.m197692s(r8, r5, r7)
            if (r8 != r0) goto L4a
        L80:
            return r0
        L81:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
