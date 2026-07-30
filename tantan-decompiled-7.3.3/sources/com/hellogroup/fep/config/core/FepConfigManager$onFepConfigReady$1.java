package com.hellogroup.fep.config.core;

import com.hellogroup.fep.config.internal.FepConfigContext;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bgi;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.config.core.FepConfigManager$onFepConfigReady$1", m88263f = "FepConfigManager.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FepConfigManager$onFepConfigReady$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLocal;
    final /* synthetic */ FepConfigFetchType $type;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11924p$;
    final /* synthetic */ FepConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigManager$onFepConfigReady$1(FepConfigManager fepConfigManager, boolean z, FepConfigFetchType fepConfigFetchType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepConfigManager;
        this.$isLocal = z;
        this.$type = fepConfigFetchType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepConfigManager$onFepConfigReady$1 fepConfigManager$onFepConfigReady$1 = new FepConfigManager$onFepConfigReady$1(this.this$0, this.$isLocal, this.$type, continuation);
        fepConfigManager$onFepConfigReady$1.f11924p$ = (drb) obj;
        return fepConfigManager$onFepConfigReady$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepConfigManager$onFepConfigReady$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        FepConfigContext.INSTANCE.m17640g().m191606b(new Function1<bgi, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$onFepConfigReady$1.1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull bgi bgiVar) {
                bgiVar.getClass();
                FepConfigManager$onFepConfigReady$1 fepConfigManager$onFepConfigReady$1 = FepConfigManager$onFepConfigReady$1.this;
                bgiVar.mo17604b(fepConfigManager$onFepConfigReady$1.this$0, fepConfigManager$onFepConfigReady$1.$isLocal, fepConfigManager$onFepConfigReady$1.$type);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bgi bgiVar) {
                invoke2(bgiVar);
                return Unit.INSTANCE;
            }
        }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$onFepConfigReady$1.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                exc.getClass();
            }
        });
        return Unit.INSTANCE;
    }
}
