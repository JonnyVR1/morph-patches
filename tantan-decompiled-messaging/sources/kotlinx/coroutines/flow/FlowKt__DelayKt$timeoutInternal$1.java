package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.ppb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "Ll/fri;", "downStream", "", "<anonymous>", "(Ll/ppb;Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m87374f = "Delay.kt", m87375l = {HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements Function3<ppb, fri<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, eri<Object> eriVar, Continuation<? super FlowKt__DelayKt$timeoutInternal$1> continuation) {
        super(3, continuation);
        this.$timeout = j;
        this.$this_timeoutInternal = eriVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @NotNull fri<Object> friVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, continuation);
        flowKt__DelayKt$timeoutInternal$1.L$0 = ppbVar;
        flowKt__DelayKt$timeoutInternal$1.L$1 = friVar;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0072 -> B:14:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
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
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            if (r1 != r2) goto L1a
            long r4 = r9.J$0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r6 = r9.L$0
            l.fri r6 = (p149l.fri) r6
            kotlin.ResultKt.m87239b(r10)
            goto L75
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r9)
            return r3
        L20:
            kotlin.ResultKt.m87239b(r10)
            java.lang.Object r10 = r9.L$0
            l.ppb r10 = (p149l.ppb) r10
            java.lang.Object r1 = r9.L$1
            l.fri r1 = (p149l.fri) r1
            long r4 = r9.$timeout
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.INSTANCE
            long r6 = r6.m93545c()
            int r4 = kotlin.time.Duration.m93527m(r4, r6)
            if (r4 <= 0) goto L80
            l.eri<java.lang.Object> r4 = r9.$this_timeoutInternal
            r5 = 0
            r6 = 2
            l.eri r4 = p149l.jri.m142945d(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.ReceiveChannel r10 = p149l.jri.m142934F(r4, r10)
            long r4 = r9.$timeout
            r6 = r1
            r1 = r10
        L49:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r7 = r9.getContext()
            r10.<init>(r7)
            l.uce0 r7 = r1.mo93893o()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r8.<init>(r6, r3)
            r10.mo94311e(r7, r8)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r7.<init>(r4, r3)
            p149l.rg50.m179157b(r10, r4, r7)
            r9.L$0 = r6
            r9.L$1 = r1
            r9.J$0 = r4
            r9.label = r2
            java.lang.Object r10 = r10.mo94316p(r9)
            if (r10 != r0) goto L75
            return r0
        L75:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L49
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L80:
            kotlinx.coroutines.TimeoutCancellationException r9 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r10 = "Timed out immediately"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
