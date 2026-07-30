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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.pgi;
import p153l.uyp;
import p153l.wtq0;
import p153l.yi5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"<anonymous>", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 1, 16})
@DebugMetadata(m88262c = "com.hellogroup.fep.config.core.FepConfigManager$startPolling$1", m88263f = "FepConfigManager.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FepConfigManager$startPolling$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FepConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigManager$startPolling$1(FepConfigManager fepConfigManager, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fepConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        continuation.getClass();
        return new FepConfigManager$startPolling$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((FepConfigManager$startPolling$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        if (yi5.INSTANCE.m216011a()) {
            pgi.m172235f(FepConfigContext.INSTANCE.m17638e(), "App is in background, skip polling", null, 0, 6, null);
            return Unit.INSTANCE;
        }
        this.this$0.m17627h(FepConfigFetchType.TIMER);
        return Unit.INSTANCE;
    }
}
