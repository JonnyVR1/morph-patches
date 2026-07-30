package com.hellogroup.fep.config.internal.fetch;

import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.util.Map;
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
import p153l.uyp;
import p153l.wgi;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"Ll/drb;", "", "", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.config.internal.fetch.FepConfigFetchModule$fetchConfig$newestPackageConfig$1", m88263f = "FepConfigFetchModule.kt", m88264l = {31}, m88265m = "invokeSuspend")
public final class FepConfigFetchModule$fetchConfig$newestPackageConfig$1 extends SuspendLambda implements Function2<drb, Continuation<? super Map<String, ? extends Long>>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11937p$;

    public FepConfigFetchModule$fetchConfig$newestPackageConfig$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepConfigFetchModule$fetchConfig$newestPackageConfig$1 fepConfigFetchModule$fetchConfig$newestPackageConfig$1 = new FepConfigFetchModule$fetchConfig$newestPackageConfig$1(continuation);
        fepConfigFetchModule$fetchConfig$newestPackageConfig$1.f11937p$ = (drb) obj;
        return fepConfigFetchModule$fetchConfig$newestPackageConfig$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Map<String, ? extends Long>> continuation) {
        return ((FepConfigFetchModule$fetchConfig$newestPackageConfig$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            return obj;
        }
        ResultKt.m88128b(obj);
        drb drbVar = this.f11937p$;
        wgi wgiVarM17681h = FepPackageContext.INSTANCE.m17681h();
        this.L$0 = drbVar;
        this.label = 1;
        Object objM206195a = wgiVarM17681h.m206195a(this);
        return objM206195a == objM198688e ? objM198688e : objM206195a;
    }
}
