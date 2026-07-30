package com.immomo.motracing;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ppb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "com.immomo.motracing.LogCleaner$cleanBeforeAsync$2", m87374f = "LogCleaner.kt", m87375l = {106, 115}, m87376m = "invokeSuspend")
final class LogCleaner$cleanBeforeAsync$2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $effectiveTime;
    final /* synthetic */ String $logPath;
    final /* synthetic */ int $maxCount;
    final /* synthetic */ String $storePrefix;
    int I$0;
    long J$0;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f13984p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogCleaner$cleanBeforeAsync$2(String str, String str2, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.$storePrefix = str;
        this.$logPath = str2;
        this.$effectiveTime = j;
        this.$maxCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        LogCleaner$cleanBeforeAsync$2 logCleaner$cleanBeforeAsync$2 = new LogCleaner$cleanBeforeAsync$2(this.$storePrefix, this.$logPath, this.$effectiveTime, this.$maxCount, continuation);
        logCleaner$cleanBeforeAsync$2.f13984p$ = (ppb) obj;
        return logCleaner$cleanBeforeAsync$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((LogCleaner$cleanBeforeAsync$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (kotlinx.coroutines.DelayKt.m93611b(2000, r14) == r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r14.label
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1e
            long r0 = r14.J$0
            java.lang.Object r2 = r14.L$0
            l.ppb r2 = (p149l.ppb) r2
            kotlin.ResultKt.m87239b(r15)
            r13 = r14
            goto L7a
        L1e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r14)
            r14 = 0
            return r14
        L25:
            int r1 = r14.I$0
            java.lang.Object r6 = r14.L$0
            l.ppb r6 = (p149l.ppb) r6
            kotlin.ResultKt.m87239b(r15)
            r15 = r6
            goto L4f
        L30:
            kotlin.ResultKt.m87239b(r15)
            l.ppb r15 = r14.f13984p$
            r1 = 0
            r6 = r2
        L37:
            r8 = 5
            if (r1 >= r8) goto L57
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L57
            r14.L$0 = r15
            r14.J$0 = r6
            r14.I$0 = r1
            r14.label = r5
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.m93611b(r6, r14)
            if (r6 != r0) goto L4f
            goto L78
        L4f:
            com.immomo.motracing.GlobalTracer r6 = com.immomo.motracing.GlobalTracer.INSTANCE
            long r6 = r6.m19342d()
            int r1 = r1 + r5
            goto L37
        L57:
            java.lang.String r10 = r14.$storePrefix
            com.immomo.motracing.LogCleaner r8 = com.immomo.motracing.LogCleaner.INSTANCE
            java.lang.String r9 = r14.$logPath
            long r2 = java.lang.System.currentTimeMillis()
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 - r11
            long r11 = kotlin.ranges.C15167a.m87600f(r2, r6)
            r14.L$0 = r15
            r14.J$0 = r6
            r14.I$0 = r1
            r14.label = r4
            r13 = r14
            java.lang.Object r14 = r8.m19350d(r9, r10, r11, r13)
            if (r14 != r0) goto L79
        L78:
            return r0
        L79:
            r0 = r6
        L7a:
            long r14 = java.lang.System.currentTimeMillis()
            long r2 = r13.$effectiveTime
            long r14 = r14 - r2
            com.immomo.motracing.LogCleaner r2 = com.immomo.motracing.LogCleaner.INSTANCE
            java.lang.String r3 = r13.$logPath
            java.lang.String r4 = r13.$storePrefix
            long r5 = kotlin.ranges.C15167a.m87600f(r14, r0)
            int r7 = r13.$maxCount
            com.immomo.motracing.LogCleaner.m19345a(r2, r3, r4, r5, r7)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.immomo.motracing.LogCleaner$cleanBeforeAsync$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
