package com.immomo.motracing;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.immomo.motracing.LogCleaner$cleanBeforeAsync$2", m88263f = "LogCleaner.kt", m88264l = {106, 115}, m88265m = "invokeSuspend")
final class LogCleaner$cleanBeforeAsync$2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $effectiveTime;
    final /* synthetic */ String $logPath;
    final /* synthetic */ int $maxCount;
    final /* synthetic */ String $storePrefix;
    int I$0;
    long J$0;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f14678p$;

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
        logCleaner$cleanBeforeAsync$2.f14678p$ = (drb) obj;
        return logCleaner$cleanBeforeAsync$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((LogCleaner$cleanBeforeAsync$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (kotlinx.coroutines.DelayKt.m94502b(2000, r14) == r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        drb drbVar;
        int i;
        long jM20322d;
        String str;
        LogCleaner logCleaner;
        String str2;
        long jM88490f;
        LogCleaner$cleanBeforeAsync$2 logCleaner$cleanBeforeAsync$2;
        long j;
        Object objM198688e = uyp.m198688e();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            drbVar = this.f14678p$;
            i = 0;
            jM20322d = Long.MAX_VALUE;
            if (i < 5) {
                str = this.$storePrefix;
                logCleaner = LogCleaner.INSTANCE;
                str2 = this.$logPath;
                jM88490f = C15274a.m88490f(System.currentTimeMillis() - 3600000, jM20322d);
                this.L$0 = drbVar;
                this.J$0 = jM20322d;
                this.I$0 = i;
                this.label = 2;
                logCleaner$cleanBeforeAsync$2 = this;
                if (logCleaner.m20330d(str2, str, jM88490f, logCleaner$cleanBeforeAsync$2) != objM198688e) {
                    j = jM20322d;
                }
            } else {
                str = this.$storePrefix;
                logCleaner = LogCleaner.INSTANCE;
                str2 = this.$logPath;
                jM88490f = C15274a.m88490f(System.currentTimeMillis() - 3600000, jM20322d);
                this.L$0 = drbVar;
                this.J$0 = jM20322d;
                this.I$0 = i;
                this.label = 2;
                logCleaner$cleanBeforeAsync$2 = this;
                if (logCleaner.m20330d(str2, str, jM88490f, logCleaner$cleanBeforeAsync$2) != objM198688e) {
                    j = jM20322d;
                }
            }
            return objM198688e;
        }
        if (i2 == 1) {
            i = this.I$0;
            drb drbVar2 = (drb) this.L$0;
            ResultKt.m88128b(obj);
            drbVar = drbVar2;
            jM20322d = GlobalTracer.INSTANCE.m20322d();
            i++;
            if (i < 5 || jM20322d != Long.MAX_VALUE) {
                str = this.$storePrefix;
                logCleaner = LogCleaner.INSTANCE;
                str2 = this.$logPath;
                jM88490f = C15274a.m88490f(System.currentTimeMillis() - 3600000, jM20322d);
                this.L$0 = drbVar;
                this.J$0 = jM20322d;
                this.I$0 = i;
                this.label = 2;
                logCleaner$cleanBeforeAsync$2 = this;
                if (logCleaner.m20330d(str2, str, jM88490f, logCleaner$cleanBeforeAsync$2) != objM198688e) {
                    j = jM20322d;
                }
            } else {
                this.L$0 = drbVar;
                this.J$0 = jM20322d;
                this.I$0 = i;
                this.label = 1;
            }
            return objM198688e;
        }
        if (i2 != 2) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = this.J$0;
        ResultKt.m88128b(obj);
        logCleaner$cleanBeforeAsync$2 = this;
        LogCleaner.INSTANCE.m20327c(logCleaner$cleanBeforeAsync$2.$logPath, logCleaner$cleanBeforeAsync$2.$storePrefix, C15274a.m88490f(System.currentTimeMillis() - logCleaner$cleanBeforeAsync$2.$effectiveTime, j), logCleaner$cleanBeforeAsync$2.$maxCount);
        return Unit.INSTANCE;
    }
}
