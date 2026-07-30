package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.ppb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "Ll/fri;", "downstream", "", "<anonymous>", "(Ll/ppb;Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m87374f = "Delay.kt", m87375l = {215, 418}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<ppb, fri<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $this_debounceInternal;
    final /* synthetic */ Function1<Object, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(Function1<Object, Long> function1, eri<Object> eriVar, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = eriVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @NotNull fri<Object> friVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = ppbVar;
        flowKt__DelayKt$debounceInternal$1.L$1 = friVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[PHI: r1 r5 r6 r7
      0x00a2: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = 
      (r6v4 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
     binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r7v2 l.fri) = (r7v4 l.fri), (r7v5 l.fri), (r7v5 l.fri) binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        if (r7.mo94316p(r14) == r0) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00de -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
