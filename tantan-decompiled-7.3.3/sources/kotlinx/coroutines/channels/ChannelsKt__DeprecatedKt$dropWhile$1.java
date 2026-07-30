package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.math.Primes;
import p153l.el90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"E", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m88263f = "Deprecated.kt", m88264l = {Primes.SMALL_FACTOR_LIMIT, 212, 213, 217, 218}, m88265m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $predicate;
    final /* synthetic */ ReceiveChannel $this_dropWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_dropWhile = receiveChannel;
        this.$predicate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90 el90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f A[PHI: r1 r8 r12
      0x005f: PHI (r1v3 kotlinx.coroutines.channels.ChannelIterator) = (r1v5 kotlinx.coroutines.channels.ChannelIterator), (r1v15 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x007d, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r8v1 l.el90) = (r8v4 l.el90), (r8v8 l.el90) binds: [B:21:0x007d, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r12v3 java.lang.Object) = (r12v8 java.lang.Object), (r12v0 java.lang.Object) binds: [B:21:0x007d, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009e -> B:16:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00eb -> B:10:0x0023). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
