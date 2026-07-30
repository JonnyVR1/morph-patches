package com.hellogroup.fep.config.core;

import com.hellogroup.fep.config.internal.FepConfigContext;
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
import p153l.pgi;
import p153l.uyp;
import p153l.wtq0;
import p153l.zfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.config.core.FepConfigManager$setup$1", m88263f = "FepConfigManager.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FepConfigManager$setup$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11925p$;
    final /* synthetic */ FepConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigManager$setup$1(FepConfigManager fepConfigManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepConfigManager$setup$1 fepConfigManager$setup$1 = new FepConfigManager$setup$1(this.this$0, continuation);
        fepConfigManager$setup$1.f11925p$ = (drb) obj;
        return fepConfigManager$setup$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepConfigManager$setup$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        if (!this.this$0.isCacheDataLoaded.get()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
            zfi zfiVarM120768c = fepConfigContext.m17641h().m120768c();
            if (zfiVarM120768c != null) {
                fepConfigContext.m17635b().set(zfiVarM120768c);
                FepConfigManager.m17623n(this.this$0, true, null, 2, null);
                pgi.m172235f(fepConfigContext.m17638e(), "Config loaded from disk, hash: " + zfiVarM120768c.getHashStr(), null, 0, 6, null);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            this.this$0.isCacheDataLoaded.set(true);
            pgi.m172235f(fepConfigContext.m17638e(), "loadConfigFromDisk cost: " + jCurrentTimeMillis2 + "ms", null, 0, 6, null);
        }
        return Unit.INSTANCE;
    }
}
