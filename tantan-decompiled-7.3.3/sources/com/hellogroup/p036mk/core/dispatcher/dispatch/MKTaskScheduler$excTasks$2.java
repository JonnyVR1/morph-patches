package com.hellogroup.p036mk.core.dispatcher.dispatch;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.ejw;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.core.dispatcher.dispatch.MKTaskScheduler$excTasks$2", m88263f = "MKTaskScheduler.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class MKTaskScheduler$excTasks$2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList $needExecute;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12497p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKTaskScheduler$excTasks$2(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.$needExecute = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKTaskScheduler$excTasks$2 mKTaskScheduler$excTasks$2 = new MKTaskScheduler$excTasks$2(this.$needExecute, continuation);
        mKTaskScheduler$excTasks$2.f12497p$ = (drb) obj;
        return mKTaskScheduler$excTasks$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKTaskScheduler$excTasks$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        Iterator it = this.$needExecute.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ejw) it.next()).mo18404b();
        }
        return Unit.INSTANCE;
    }
}
