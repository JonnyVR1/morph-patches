package com.hellogroup.common.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.common.timer.ControllableTimer$startPeriodic$1", m88263f = "ControllableTimer.kt", m88264l = {43, 46, 47}, m88265m = "invokeSuspend")
public final class ControllableTimer$startPeriodic$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $action;
    final /* synthetic */ long $initialDelayMillis;
    final /* synthetic */ long $periodMillis;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11895p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllableTimer$startPeriodic$1(long j, Function1 function1, long j2, Continuation continuation) {
        super(2, continuation);
        this.$initialDelayMillis = j;
        this.$action = function1;
        this.$periodMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        ControllableTimer$startPeriodic$1 controllableTimer$startPeriodic$1 = new ControllableTimer$startPeriodic$1(this.$initialDelayMillis, this.$action, this.$periodMillis, continuation);
        controllableTimer$startPeriodic$1.f11895p$ = (drb) obj;
        return controllableTimer$startPeriodic$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((ControllableTimer$startPeriodic$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[PHI: r1
      0x0041: PHI (r1v2 l.drb) = (r1v1 l.drb), (r1v1 l.drb), (r1v3 l.drb), (r1v5 l.drb) binds: [B:13:0x0034, B:15:0x003e, B:23:0x005e, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[PHI: r1
      0x0054: PHI (r1v3 l.drb) = (r1v2 l.drb), (r1v7 l.drb) binds: [B:20:0x0051, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:17:0x0041). Please report as a decompilation issue!!! */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            goto L21
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r9)
            r9 = 0
            return r9
        L19:
            java.lang.Object r1 = r9.L$0
            l.drb r1 = (p153l.drb) r1
            kotlin.ResultKt.m88128b(r10)
            goto L54
        L21:
            java.lang.Object r1 = r9.L$0
            l.drb r1 = (p153l.drb) r1
            kotlin.ResultKt.m88128b(r10)
            goto L41
        L29:
            kotlin.ResultKt.m88128b(r10)
            l.drb r1 = r9.f11895p$
            long r5 = r9.$initialDelayMillis
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L41
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m94502b(r5, r9)
            if (r10 != r0) goto L41
            goto L60
        L41:
            boolean r10 = kotlinx.coroutines.C15531f.m94953g(r1)
            if (r10 == 0) goto L61
            kotlin.jvm.functions.Function1 r10 = r9.$action
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = r10.invoke(r9)
            if (r10 != r0) goto L54
            goto L60
        L54:
            long r4 = r9.$periodMillis
            r9.L$0 = r1
            r9.label = r2
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m94502b(r4, r9)
            if (r10 != r0) goto L41
        L60:
            return r0
        L61:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hellogroup.common.timer.ControllableTimer$startPeriodic$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
