package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"E", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m88263f = "Deprecated.kt", m88264l = {241, 242, 242}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function3 $predicate;
    final /* synthetic */ ReceiveChannel $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel receiveChannel, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.$this_filterIndexed = receiveChannel;
        this.$predicate = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, continuation);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90 el90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a A[PHI: r1 r6 r7 r12
      0x006a: PHI (r1v5 int) = (r1v9 int), (r1v10 int) binds: [B:14:0x0067, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r6v3 kotlinx.coroutines.channels.ChannelIterator) = (r6v4 kotlinx.coroutines.channels.ChannelIterator), (r6v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0067, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r7v5 l.el90) = (r7v7 l.el90), (r7v9 l.el90) binds: [B:14:0x0067, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r12v7 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:14:0x0067, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r11.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L47
            if (r1 == r5) goto L39
            if (r1 == r4) goto L26
            if (r1 != r3) goto L20
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            l.el90 r7 = (p153l.el90) r7
            kotlin.ResultKt.m88128b(r12)
            goto L59
        L20:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r11)
            return r2
        L26:
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$2
            java.lang.Object r7 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r11.L$0
            l.el90 r8 = (p153l.el90) r8
            kotlin.ResultKt.m88128b(r12)
            r10 = r7
            r7 = r6
            r6 = r10
            goto L93
        L39:
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            l.el90 r7 = (p153l.el90) r7
            kotlin.ResultKt.m88128b(r12)
            goto L6a
        L47:
            kotlin.ResultKt.m88128b(r12)
            java.lang.Object r12 = r11.L$0
            l.el90 r12 = (p153l.el90) r12
            kotlinx.coroutines.channels.ReceiveChannel r1 = r11.$this_filterIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = 0
            r7 = r6
            r6 = r1
            r1 = r7
            r7 = r12
        L59:
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r2
            r11.I$0 = r1
            r11.label = r5
            java.lang.Object r12 = r6.mo94807a(r11)
            if (r12 != r0) goto L6a
            goto Lab
        L6a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lae
            java.lang.Object r12 = r6.next()
            kotlin.jvm.functions.Function3 r8 = r11.$predicate
            int r9 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.m88260b(r1)
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r12
            r11.I$0 = r9
            r11.label = r4
            java.lang.Object r1 = r8.invoke(r1, r12, r11)
            if (r1 != r0) goto L8f
            goto Lab
        L8f:
            r8 = r7
            r7 = r12
            r12 = r1
            r1 = r9
        L93:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lac
            r11.L$0 = r8
            r11.L$1 = r6
            r11.L$2 = r2
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r12 = r8.mo94679E(r7, r11)
            if (r12 != r0) goto Lac
        Lab:
            return r0
        Lac:
            r7 = r8
            goto L59
        Lae:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
