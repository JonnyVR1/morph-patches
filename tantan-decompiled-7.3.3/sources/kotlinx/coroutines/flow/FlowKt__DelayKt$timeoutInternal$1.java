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
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "Ll/bui;", "downStream", "", "<anonymous>", "(Ll/drb;Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m88263f = "Delay.kt", m88264l = {HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416}, m88265m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements Function3<drb, bui<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, aui<Object> auiVar, Continuation<? super FlowKt__DelayKt$timeoutInternal$1> continuation) {
        super(3, continuation);
        this.$timeout = j;
        this.$this_timeoutInternal = auiVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @NotNull bui<Object> buiVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, continuation);
        flowKt__DelayKt$timeoutInternal$1.L$0 = drbVar;
        flowKt__DelayKt$timeoutInternal$1.L$1 = buiVar;
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
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            if (r1 != r2) goto L1a
            long r4 = r9.J$0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r6 = r9.L$0
            l.bui r6 = (p153l.bui) r6
            kotlin.ResultKt.m88128b(r10)
            goto L75
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r9)
            return r3
        L20:
            kotlin.ResultKt.m88128b(r10)
            java.lang.Object r10 = r9.L$0
            l.drb r10 = (p153l.drb) r10
            java.lang.Object r1 = r9.L$1
            l.bui r1 = (p153l.bui) r1
            long r4 = r9.$timeout
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.INSTANCE
            long r6 = r6.m94436c()
            int r4 = kotlin.time.Duration.m94418m(r4, r6)
            if (r4 <= 0) goto L80
            l.aui<java.lang.Object> r4 = r9.$this_timeoutInternal
            r5 = 0
            r6 = 2
            l.aui r4 = p153l.fui.m127480d(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.ReceiveChannel r10 = p153l.fui.m127469F(r4, r10)
            long r4 = r9.$timeout
            r6 = r1
            r1 = r10
        L49:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r7 = r9.getContext()
            r10.<init>(r7)
            l.zke0 r7 = r1.mo94785o()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r8.<init>(r6, r3)
            r10.mo95204e(r7, r8)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r7.<init>(r4, r3)
            p153l.xo50.m212462b(r10, r4, r7)
            r9.L$0 = r6
            r9.L$1 = r1
            r9.J$0 = r4
            r9.label = r2
            java.lang.Object r10 = r10.mo95209p(r9)
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
