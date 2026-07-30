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
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"E", "R", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m87374f = "Deprecated.kt", m87375l = {517, 499, 501}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements Function2<ad90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $other;
    final /* synthetic */ ReceiveChannel<Object> $this_zip;
    final /* synthetic */ Function2<Object, Object, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel<Object> receiveChannel, ReceiveChannel<Object> receiveChannel2, Function2<Object, Object, Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$zip$2> continuation) {
        super(2, continuation);
        this.$other = receiveChannel;
        this.$this_zip = receiveChannel2;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, continuation);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90<Object> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b A[Catch: all -> 0x002a, PHI: r1 r6 r7 r8 r9 r13
      0x009b: PHI (r1v5 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>) = 
      (r1v6 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
      (r1v8 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
     binds: [B:25:0x0098, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r6v7 kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object>) = 
      (r6v9 kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object>)
      (r6v11 kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object>)
     binds: [B:25:0x0098, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r7v5 kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object>) = 
      (r7v7 kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object>)
      (r7v9 kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object>)
     binds: [B:25:0x0098, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r8v5 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>) = 
      (r8v7 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
      (r8v9 kotlinx.coroutines.channels.ChannelIterator<java.lang.Object>)
     binds: [B:25:0x0098, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r9v5 l.ad90) = (r9v7 l.ad90), (r9v9 l.ad90) binds: [B:25:0x0098, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r13v10 java.lang.Object) = (r13v15 java.lang.Object), (r13v0 java.lang.Object) binds: [B:25:0x0098, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0086, B:27:0x009b, B:29:0x00a3, B:39:0x00ed, B:20:0x0069, B:23:0x007e), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0086, B:27:0x009b, B:29:0x00a3, B:39:0x00ed, B:20:0x0069, B:23:0x007e), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:33:0x00c3, B:35:0x00cb, B:15:0x0049), top: B:46:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
