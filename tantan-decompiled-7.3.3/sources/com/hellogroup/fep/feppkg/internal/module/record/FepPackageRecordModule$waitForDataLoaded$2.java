package com.hellogroup.fep.feppkg.internal.module.record;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule$waitForDataLoaded$2", m88263f = "FepPackageRecordModule.kt", m88264l = {HttpStatus.UNPROCESSABLE_ENTITY_422}, m88265m = "invokeSuspend")
public final class FepPackageRecordModule$waitForDataLoaded$2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11991p$;
    final /* synthetic */ FepPackageRecordModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepPackageRecordModule$waitForDataLoaded$2(FepPackageRecordModule fepPackageRecordModule, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepPackageRecordModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepPackageRecordModule$waitForDataLoaded$2 fepPackageRecordModule$waitForDataLoaded$2 = new FepPackageRecordModule$waitForDataLoaded$2(this.this$0, continuation);
        fepPackageRecordModule$waitForDataLoaded$2.f11991p$ = (drb) obj;
        return fepPackageRecordModule$waitForDataLoaded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepPackageRecordModule$waitForDataLoaded$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = this.f11991p$;
            InterfaceC15593o interfaceC15593o = this.this$0.loadJob;
            if (interfaceC15593o == null) {
                return null;
            }
            this.L$0 = drbVar;
            this.label = 1;
            if (interfaceC15593o.mo94554S(this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
