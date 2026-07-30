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
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"E", "Ll/el90;", "Lkotlin/collections/IndexedValue;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m88263f = "Deprecated.kt", m88264l = {400, 401}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ ReceiveChannel $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.$this_withIndex = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, continuation);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90 el90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007a -> B:7:0x001e). Please report as a decompilation issue!!! */
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
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L27
            if (r1 != r2) goto L20
            int r1 = r9.I$0
            java.lang.Object r4 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r9.L$0
            l.el90 r5 = (p153l.el90) r5
            kotlin.ResultKt.m88128b(r10)
            r10 = r4
            r4 = r1
            r1 = r10
        L1e:
            r10 = r5
            goto L43
        L20:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r9)
            r9 = 0
            return r9
        L27:
            int r1 = r9.I$0
            java.lang.Object r4 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r9.L$0
            l.el90 r5 = (p153l.el90) r5
            kotlin.ResultKt.m88128b(r10)
            goto L58
        L35:
            kotlin.ResultKt.m88128b(r10)
            java.lang.Object r10 = r9.L$0
            l.el90 r10 = (p153l.el90) r10
            kotlinx.coroutines.channels.ReceiveChannel r1 = r9.$this_withIndex
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r4 = 0
        L43:
            r9.L$0 = r10
            r9.L$1 = r1
            r9.I$0 = r4
            r9.label = r3
            java.lang.Object r5 = r1.mo94807a(r9)
            if (r5 != r0) goto L52
            goto L79
        L52:
            r8 = r5
            r5 = r10
            r10 = r8
            r8 = r4
            r4 = r1
            r1 = r8
        L58:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            java.lang.Object r10 = r4.next()
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue
            int r7 = r1 + 1
            r6.<init>(r1, r10)
            r9.L$0 = r5
            r9.L$1 = r4
            r9.I$0 = r7
            r9.label = r2
            java.lang.Object r10 = r5.mo94679E(r6, r9)
            if (r10 != r0) goto L7a
        L79:
            return r0
        L7a:
            r1 = r4
            r4 = r7
            goto L1e
        L7d:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
