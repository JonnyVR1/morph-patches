package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"E", "K", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m88263f = "Deprecated.kt", m88264l = {HttpStatus.EXPECTATION_FAILED_417, 418, UnixStat.DEFAULT_FILE_PERM}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements Function2<el90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Object, Continuation<Object>, Object> $selector;
    final /* synthetic */ ReceiveChannel<Object> $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$distinctBy$1> continuation) {
        super(2, continuation);
        this.$this_distinctBy = receiveChannel;
        this.$selector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, continuation);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90<Object> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0077 A[PHI: r1 r6 r7 r12
      0x0077: PHI (r1v5 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>) = 
      (r1v6 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
      (r1v11 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
     binds: [B:14:0x0074, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r6v6 java.util.HashSet) = (r6v8 java.util.HashSet), (r6v12 java.util.HashSet) binds: [B:14:0x0074, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r7v3 l.el90) = (r7v5 l.el90), (r7v10 l.el90) binds: [B:14:0x0074, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r12v4 java.lang.Object) = (r12v9 java.lang.Object), (r12v0 java.lang.Object) binds: [B:14:0x0074, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[PHI: r1 r7 r8
      0x00b8: PHI (r1v7 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>) = 
      (r1v3 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
      (r1v9 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
     binds: [B:23:0x009f, B:28:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r7v6 java.util.HashSet) = (r7v2 java.util.HashSet), (r7v8 java.util.HashSet) binds: [B:23:0x009f, B:28:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r8v4 l.el90) = (r8v0 l.el90), (r8v5 l.el90) binds: [B:23:0x009f, B:28:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009f -> B:29:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b2 -> B:28:0x00b4). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L50
            if (r1 == r5) goto L40
            if (r1 == r4) goto L2b
            if (r1 != r3) goto L25
            java.lang.Object r1 = r11.L$3
            java.lang.Object r6 = r11.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$1
            java.util.HashSet r7 = (java.util.HashSet) r7
            java.lang.Object r8 = r11.L$0
            l.el90 r8 = (p153l.el90) r8
            kotlin.ResultKt.m88128b(r12)
            goto Lb4
        L25:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r11)
            return r2
        L2b:
            java.lang.Object r1 = r11.L$3
            java.lang.Object r6 = r11.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$1
            java.util.HashSet r7 = (java.util.HashSet) r7
            java.lang.Object r8 = r11.L$0
            l.el90 r8 = (p153l.el90) r8
            kotlin.ResultKt.m88128b(r12)
            r10 = r6
            r6 = r1
            r1 = r10
            goto L9b
        L40:
            java.lang.Object r1 = r11.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r11.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r11.L$0
            l.el90 r7 = (p153l.el90) r7
            kotlin.ResultKt.m88128b(r12)
            goto L77
        L50:
            kotlin.ResultKt.m88128b(r12)
            java.lang.Object r12 = r11.L$0
            l.el90 r12 = (p153l.el90) r12
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r11.$this_distinctBy
            kotlinx.coroutines.channels.ChannelIterator r6 = r6.iterator()
            r7 = r6
            r6 = r1
            r1 = r7
            r7 = r12
        L66:
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r1
            r11.L$3 = r2
            r11.label = r5
            java.lang.Object r12 = r1.mo94807a(r11)
            if (r12 != r0) goto L77
            goto Lb1
        L77:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lbb
            java.lang.Object r12 = r1.next()
            kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r8 = r11.$selector
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r1
            r11.L$3 = r12
            r11.label = r4
            java.lang.Object r8 = r8.invoke(r12, r11)
            if (r8 != r0) goto L96
            goto Lb1
        L96:
            r10 = r6
            r6 = r12
            r12 = r8
            r8 = r7
            r7 = r10
        L9b:
            boolean r9 = r7.contains(r12)
            if (r9 != 0) goto Lb8
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r1
            r11.L$3 = r12
            r11.label = r3
            java.lang.Object r6 = r8.mo94679E(r6, r11)
            if (r6 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            r6 = r1
            r1 = r12
        Lb4:
            r7.add(r1)
            r1 = r6
        Lb8:
            r6 = r7
            r7 = r8
            goto L66
        Lbb:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
