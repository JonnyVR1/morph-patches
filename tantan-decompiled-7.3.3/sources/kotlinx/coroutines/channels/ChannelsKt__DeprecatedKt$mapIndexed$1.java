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
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"E", "R", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m88263f = "Deprecated.kt", m88264l = {374, 375, 375}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements Function2<el90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $this_mapIndexed;
    final /* synthetic */ Function3<Integer, Object, Continuation<Object>, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<Object> receiveChannel, Function3<? super Integer, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super ChannelsKt__DeprecatedKt$mapIndexed$1> continuation) {
        super(2, continuation);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90<Object> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a4 -> B:13:0x0058). Please report as a decompilation issue!!! */
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
            if (r1 == r4) goto L27
            if (r1 != r3) goto L21
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            l.el90 r7 = (p153l.el90) r7
            kotlin.ResultKt.m88128b(r12)
            r12 = r7
            goto L58
        L21:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r11)
            return r2
        L27:
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$2
            l.el90 r6 = (p153l.el90) r6
            java.lang.Object r7 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r11.L$0
            l.el90 r8 = (p153l.el90) r8
            kotlin.ResultKt.m88128b(r12)
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
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r11.$this_mapIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = 0
            r10 = r6
            r6 = r1
            r1 = r10
        L58:
            r11.L$0 = r12
            r11.L$1 = r6
            r11.I$0 = r1
            r11.label = r5
            java.lang.Object r7 = r6.mo94807a(r11)
            if (r7 != r0) goto L67
            goto La3
        L67:
            r10 = r7
            r7 = r12
            r12 = r10
        L6a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La7
            java.lang.Object r12 = r6.next()
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r8 = r11.$transform
            int r9 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.m88260b(r1)
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r7
            r11.I$0 = r9
            r11.label = r4
            java.lang.Object r12 = r8.invoke(r1, r12, r11)
            if (r12 != r0) goto L8f
            goto La3
        L8f:
            r8 = r7
            r1 = r9
            r7 = r6
            r6 = r8
        L93:
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r2
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r12 = r6.mo94679E(r12, r11)
            if (r12 != r0) goto La4
        La3:
            return r0
        La4:
            r6 = r7
            r12 = r8
            goto L58
        La7:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
