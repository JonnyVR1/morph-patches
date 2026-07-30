package com.hellogroup.fep.feppkg.internal.module.record;

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
import p153l.khi;
import p153l.pgi;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule$updateLastCheckUpdateTime$1", m88263f = "FepPackageRecordModule.kt", m88264l = {476}, m88265m = "invokeSuspend")
public final class FepPackageRecordModule$updateLastCheckUpdateTime$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseVersion;
    final /* synthetic */ String $bid;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11990p$;
    final /* synthetic */ FepPackageRecordModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepPackageRecordModule$updateLastCheckUpdateTime$1(FepPackageRecordModule fepPackageRecordModule, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepPackageRecordModule;
        this.$bid = str;
        this.$baseVersion = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepPackageRecordModule$updateLastCheckUpdateTime$1 fepPackageRecordModule$updateLastCheckUpdateTime$1 = new FepPackageRecordModule$updateLastCheckUpdateTime$1(this.this$0, this.$bid, this.$baseVersion, continuation);
        fepPackageRecordModule$updateLastCheckUpdateTime$1.f11990p$ = (drb) obj;
        return fepPackageRecordModule$updateLastCheckUpdateTime$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepPackageRecordModule$updateLastCheckUpdateTime$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = this.f11990p$;
            FepPackageRecordModule fepPackageRecordModule = this.this$0;
            this.L$0 = drbVar;
            this.label = 1;
            if (fepPackageRecordModule.m17723G(this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        Map<String, khi> mapM154205c = this.this$0.m17716x(this.$bid).m154205c();
        String str = this.$baseVersion;
        khi khiVar = mapM154205c.get(str);
        if (khiVar == null) {
            khi khiVar2 = new khi(0L, null, 3, null);
            mapM154205c.put(str, khiVar2);
            khiVar = khiVar2;
        }
        khiVar.m149792c(System.currentTimeMillis());
        this.this$0.m17718z(this.$bid);
        pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Updated check update time for " + this.$bid + '/' + this.$baseVersion, null, 2, null);
        return Unit.INSTANCE;
    }
}
