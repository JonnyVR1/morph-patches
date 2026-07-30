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
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"E", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m88263f = "Deprecated.kt", m88264l = {228, 229, 229}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements Function2<el90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Object, Continuation<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<Object> $this_filter;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$filter$1> continuation) {
        super(2, continuation);
        this.$this_filter = receiveChannel;
        this.$predicate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, continuation);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90<Object> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005e A[PHI: r1 r6 r10
      0x005e: PHI (r1v4 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>) = 
      (r1v5 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
      (r1v7 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
     binds: [B:14:0x005b, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r6v4 l.el90) = (r6v6 l.el90), (r6v8 l.el90) binds: [B:14:0x005b, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r10v7 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x005b, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
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
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L41
            if (r1 == r5) goto L35
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r9.L$0
            l.el90 r6 = (p153l.el90) r6
            kotlin.ResultKt.m88128b(r10)
            goto L4f
        L1e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r9)
            return r2
        L24:
            java.lang.Object r1 = r9.L$2
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r9.L$0
            l.el90 r7 = (p153l.el90) r7
            kotlin.ResultKt.m88128b(r10)
            r8 = r6
            r6 = r1
            r1 = r8
            goto L7f
        L35:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r9.L$0
            l.el90 r6 = (p153l.el90) r6
            kotlin.ResultKt.m88128b(r10)
            goto L5e
        L41:
            kotlin.ResultKt.m88128b(r10)
            java.lang.Object r10 = r9.L$0
            l.el90 r10 = (p153l.el90) r10
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r9.$this_filter
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r10
        L4f:
            r9.L$0 = r6
            r9.L$1 = r1
            r9.L$2 = r2
            r9.label = r5
            java.lang.Object r10 = r1.mo94807a(r9)
            if (r10 != r0) goto L5e
            goto L95
        L5e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r1.next()
            kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r7 = r9.$predicate
            r9.L$0 = r6
            r9.L$1 = r1
            r9.L$2 = r10
            r9.label = r4
            java.lang.Object r7 = r7.invoke(r10, r9)
            if (r7 != r0) goto L7b
            goto L95
        L7b:
            r8 = r6
            r6 = r10
            r10 = r7
            r7 = r8
        L7f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            r9.L$0 = r7
            r9.L$1 = r1
            r9.L$2 = r2
            r9.label = r3
            java.lang.Object r10 = r7.mo94679E(r6, r9)
            if (r10 != r0) goto L96
        L95:
            return r0
        L96:
            r6 = r7
            goto L4f
        L98:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
