package com.hellogroup.fep.feppkg.core;

import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.util.List;
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
import p153l.phi;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.core.FepPackageManager$installPreEmbedded$1", m88263f = "FepPackageManager.kt", m88264l = {}, m88265m = "invokeSuspend")
final class FepPackageManager$installPreEmbedded$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ phi $listener;
    final /* synthetic */ List $zipPaths;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11951p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepPackageManager$installPreEmbedded$1(List list, phi phiVar, Continuation continuation) {
        super(2, continuation);
        this.$zipPaths = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepPackageManager$installPreEmbedded$1 fepPackageManager$installPreEmbedded$1 = new FepPackageManager$installPreEmbedded$1(this.$zipPaths, null, continuation);
        fepPackageManager$installPreEmbedded$1.f11951p$ = (drb) obj;
        return fepPackageManager$installPreEmbedded$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepPackageManager$installPreEmbedded$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        FepPackageContext.INSTANCE.m17688o().m135068b(this.$zipPaths, null);
        return Unit.INSTANCE;
    }
}
