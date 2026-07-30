package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", m87374f = "Delay.kt", m87375l = {HttpStatus.TEMPORARY_REDIRECT_307, 309, 310}, m87376m = "invokeSuspend")
public final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements Function2<ad90<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j, Continuation<? super FlowKt__DelayKt$fixedPeriodTicker$1> continuation) {
        super(2, continuation);
        this.$delayMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.$delayMillis, continuation);
        flowKt__DelayKt$fixedPeriodTicker$1.L$0 = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ad90<? super Unit> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[PHI: r1
      0x003e: PHI (r1v3 l.ad90) = (r1v2 l.ad90), (r1v4 l.ad90), (r1v6 l.ad90) binds: [B:13:0x003b, B:19:0x0059, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[PHI: r1
      0x004f: PHI (r1v4 l.ad90) = (r1v3 l.ad90), (r1v8 l.ad90) binds: [B:16:0x004c, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            goto L21
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            r7 = 0
            return r7
        L19:
            java.lang.Object r1 = r7.L$0
            l.ad90 r1 = (p149l.ad90) r1
            kotlin.ResultKt.m87239b(r8)
            goto L4f
        L21:
            java.lang.Object r1 = r7.L$0
            l.ad90 r1 = (p149l.ad90) r1
            kotlin.ResultKt.m87239b(r8)
            goto L3e
        L29:
            kotlin.ResultKt.m87239b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            l.ad90 r1 = (p149l.ad90) r1
            long r5 = r7.$delayMillis
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m93611b(r5, r7)
            if (r8 != r0) goto L3e
            goto L5b
        L3e:
            l.nee0 r8 = r1.getChannel()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.mo93787E(r4, r7)
            if (r8 != r0) goto L4f
            goto L5b
        L4f:
            long r4 = r7.$delayMillis
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m93611b(r4, r7)
            if (r8 != r0) goto L3e
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
