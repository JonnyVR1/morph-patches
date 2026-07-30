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
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.DelayKt;
import org.spongycastle.asn1.eac.EACTags;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.inapp.delay.InAppTimerManager$scheduleTimer$1$3", m87374f = "InAppTimerManager.kt", m87375l = {EACTags.HEADER_LIST}, m87376m = "invokeSuspend")
public final class InAppTimerManager$scheduleTimer$1$3 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InAppTimerManager.AbstractC1228d, Unit> $callback;
    final /* synthetic */ long $delayInMs;
    final /* synthetic */ String $id;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InAppTimerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InAppTimerManager$scheduleTimer$1$3(InAppTimerManager inAppTimerManager, long j, Function1<? super InAppTimerManager.AbstractC1228d, Unit> function1, String str, Continuation<? super InAppTimerManager$scheduleTimer$1$3> continuation) {
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
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((InAppTimerManager$scheduleTimer$1$3) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ppb ppbVar;
        long jCurrentTimeMillis;
        ppb ppbVar2;
        long j;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppbVar = (ppb) this.L$0;
                jCurrentTimeMillis = this.this$0.clock.currentTimeMillis();
                try {
                    long j2 = this.$delayInMs;
                    this.L$0 = ppbVar;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    if (DelayKt.m93611b(j2, this) == objM196133e) {
                        return objM196133e;
                    }
                    ppbVar2 = ppbVar;
                    j = jCurrentTimeMillis;
                } catch (CancellationException unused) {
                    this.this$0.logger.verbose(this.this$0.accountId, this.this$0.TAG + " Cancelled timer with id: " + this.$id);
                    this.this$0.cancelledJobs.putIfAbsent(this.$id, new InAppTimerManager.C1225a(this.$delayInMs, jCurrentTimeMillis, this.$callback));
                    C15424f.m94060f(ppbVar);
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                ppbVar2 = (ppb) this.L$0;
                try {
                    ResultKt.m87239b(obj);
                } catch (CancellationException unused2) {
                    jCurrentTimeMillis = j;
                    ppbVar = ppbVar2;
                    this.this$0.logger.verbose(this.this$0.accountId, this.this$0.TAG + " Cancelled timer with id: " + this.$id);
                    this.this$0.cancelledJobs.putIfAbsent(this.$id, new InAppTimerManager.C1225a(this.$delayInMs, jCurrentTimeMillis, this.$callback));
                    C15424f.m94060f(ppbVar);
                }
            }
            this.$callback.invoke(new InAppTimerManager.AbstractC1228d.a(this.$id, j));
            this.this$0.cancelledJobs.remove(this.$id);
        } catch (Exception e) {
            this.this$0.logger.verbose(this.this$0.accountId, this.this$0.TAG + " Error in timer with id: " + this.$id, e);
            this.$callback.invoke(new InAppTimerManager.AbstractC1228d.c(this.$id, e));
            this.this$0.cancelledJobs.remove(this.$id);
        } finally {
            this.this$0.activeJobs.remove(this.$id);
        }
        return Unit.INSTANCE;
    }
}
