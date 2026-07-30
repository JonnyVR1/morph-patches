package com.hellogroup.fep.feppkg.internal.module.record;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.khi;
import p153l.mhi;
import p153l.uyp;
import p153l.wtq0;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule$recordPkgVisit$1", m88263f = "FepPackageRecordModule.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FepPackageRecordModule$recordPkgVisit$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ zgi $info;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11989p$;
    final /* synthetic */ FepPackageRecordModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepPackageRecordModule$recordPkgVisit$1(FepPackageRecordModule fepPackageRecordModule, zgi zgiVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepPackageRecordModule;
        this.$info = zgiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepPackageRecordModule$recordPkgVisit$1 fepPackageRecordModule$recordPkgVisit$1 = new FepPackageRecordModule$recordPkgVisit$1(this.this$0, this.$info, continuation);
        fepPackageRecordModule$recordPkgVisit$1.f11989p$ = (drb) obj;
        return fepPackageRecordModule$recordPkgVisit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepPackageRecordModule$recordPkgVisit$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Long lM88261c;
        Map<String, mhi> mapM149790a;
        uyp.m198688e();
        mhi mhiVar = null;
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            long jM219624g = this.$info.m219624g();
            long jLongValue = 0;
            if (jM219624g == 0) {
                return Unit.INSTANCE;
            }
            khi khiVar = this.this$0.m17716x(this.$info.getBid()).m154205c().get(this.$info.getBaseVersion());
            if (khiVar != null && (mapM149790a = khiVar.m149790a()) != null) {
                mhiVar = mapM149790a.get(String.valueOf(jM219624g));
            }
            if (mhiVar != null && (lM88261c = Boxing.m88261c(mhiVar.getLastVisitT())) != null) {
                jLongValue = lM88261c.longValue();
            }
            if (System.currentTimeMillis() - jLongValue > 7200000) {
                this.this$0.m17720B(this.$info.getBid(), this.$info.getBaseVersion(), this.$info.m219624g());
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }
}
