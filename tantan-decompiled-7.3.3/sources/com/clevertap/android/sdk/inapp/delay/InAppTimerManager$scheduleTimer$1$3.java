package com.clevertap.android.sdk.inapp.delay;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.DelayKt;
import org.spongycastle.asn1.eac.EACTags;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$scheduleTimer$1$3", m88263f = "InAppTimerManager.kt", m88264l = {EACTags.HEADER_LIST}, m88265m = "invokeSuspend")
public final class InAppTimerManager$scheduleTimer$1$3 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InAppTimerManager.AbstractC1251d, Unit> $callback;
    final /* synthetic */ long $delayInMs;
    final /* synthetic */ String $id;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InAppTimerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InAppTimerManager$scheduleTimer$1$3(InAppTimerManager inAppTimerManager, long j, Function1<? super InAppTimerManager.AbstractC1251d, Unit> function1, String str, Continuation<? super InAppTimerManager$scheduleTimer$1$3> continuation) {
        super(2, continuation);
        this.this$0 = inAppTimerManager;
        this.$delayInMs = j;
        this.$callback = function1;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InAppTimerManager$scheduleTimer$1$3 inAppTimerManager$scheduleTimer$1$3 = new InAppTimerManager$scheduleTimer$1$3(this.this$0, this.$delayInMs, this.$callback, this.$id, continuation);
        inAppTimerManager$scheduleTimer$1$3.L$0 = obj;
        return inAppTimerManager$scheduleTimer$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((InAppTimerManager$scheduleTimer$1$3) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        drb drbVar;
        long jCurrentTimeMillis;
        drb drbVar2;
        long j;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                drbVar = (drb) this.L$0;
                jCurrentTimeMillis = this.this$0.clock.currentTimeMillis();
                try {
                    long j2 = this.$delayInMs;
                    this.L$0 = drbVar;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    if (DelayKt.m94502b(j2, this) == objM198688e) {
                        return objM198688e;
                    }
                    drbVar2 = drbVar;
                    j = jCurrentTimeMillis;
                } catch (CancellationException unused) {
                    this.this$0.logger.verbose(this.this$0.accountId, this.this$0.TAG + " Cancelled timer with id: " + this.$id);
                    this.this$0.cancelledJobs.putIfAbsent(this.$id, new InAppTimerManager.C1248a(this.$delayInMs, jCurrentTimeMillis, this.$callback));
                    C15531f.m94952f(drbVar);
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                drbVar2 = (drb) this.L$0;
                try {
                    ResultKt.m88128b(obj);
                } catch (CancellationException unused2) {
                    jCurrentTimeMillis = j;
                    drbVar = drbVar2;
                    this.this$0.logger.verbose(this.this$0.accountId, this.this$0.TAG + " Cancelled timer with id: " + this.$id);
                    this.this$0.cancelledJobs.putIfAbsent(this.$id, new InAppTimerManager.C1248a(this.$delayInMs, jCurrentTimeMillis, this.$callback));
                    C15531f.m94952f(drbVar);
                }
            }
            this.$callback.invoke(new InAppTimerManager.AbstractC1251d.a(this.$id, j));
            this.this$0.cancelledJobs.remove(this.$id);
        } catch (Exception e) {
            this.this$0.logger.verbose(this.this$0.accountId, this.this$0.TAG + " Error in timer with id: " + this.$id, e);
            this.$callback.invoke(new InAppTimerManager.AbstractC1251d.c(this.$id, e));
            this.this$0.cancelledJobs.remove(this.$id);
        } finally {
            this.this$0.activeJobs.remove(this.$id);
        }
        return Unit.INSTANCE;
    }
}
