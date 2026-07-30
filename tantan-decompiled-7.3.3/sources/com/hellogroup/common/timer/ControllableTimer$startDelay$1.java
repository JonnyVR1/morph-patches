package com.hellogroup.common.timer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.common.timer.ControllableTimer$startDelay$1", m88263f = "ControllableTimer.kt", m88264l = {24, 25}, m88265m = "invokeSuspend")
final class ControllableTimer$startDelay$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $action;
    final /* synthetic */ long $delayMillis;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11894p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllableTimer$startDelay$1(long j, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$delayMillis = j;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        ControllableTimer$startDelay$1 controllableTimer$startDelay$1 = new ControllableTimer$startDelay$1(this.$delayMillis, this.$action, continuation);
        controllableTimer$startDelay$1.f11894p$ = (drb) obj;
        return controllableTimer$startDelay$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((ControllableTimer$startDelay$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r7.invoke(r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        drb drbVar;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drbVar = this.f11894p$;
            long j = this.$delayMillis;
            this.L$0 = drbVar;
            this.label = 1;
            if (DelayKt.m94502b(j, this) != objM198688e) {
            }
            return objM198688e;
        }
        if (i == 1) {
            drbVar = (drb) this.L$0;
            ResultKt.m88128b(obj);
        } else {
            if (i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
        Function1 function1 = this.$action;
        this.L$0 = drbVar;
        this.label = 2;
    }
}
