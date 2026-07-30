package com.hellogroup.fep.config.core;

import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.config.internal.FepConfigContext;
import com.hellogroup.fep.config.internal.fetch.FepConfigError;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.drb;
import p153l.pgi;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;
import p153l.zfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.config.core.FepConfigManager$fetchConfig$1", m88263f = "FepConfigManager.kt", m88264l = {CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m88265m = "invokeSuspend")
public final class FepConfigManager$fetchConfig$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ FepConfigFetchType $type;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11918p$;
    final /* synthetic */ FepConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigManager$fetchConfig$1(FepConfigManager fepConfigManager, FepConfigFetchType fepConfigFetchType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepConfigManager;
        this.$type = fepConfigFetchType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepConfigManager$fetchConfig$1 fepConfigManager$fetchConfig$1 = new FepConfigManager$fetchConfig$1(this.this$0, this.$type, continuation);
        fepConfigManager$fetchConfig$1.f11918p$ = (drb) obj;
        return fepConfigManager$fetchConfig$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepConfigManager$fetchConfig$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String hashStr;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = this.f11918p$;
            FepConfigManager fepConfigManager = this.this$0;
            this.L$0 = drbVar;
            this.label = 1;
            if (fepConfigManager.m17632t(this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        zfi zfiVar = fepConfigContext.m17635b().get();
        if (zfiVar == null || (hashStr = zfiVar.getHashStr()) == null) {
            hashStr = "";
        }
        fepConfigContext.m17637d().m17646a(this.$type, hashStr, new Function2<zfi, FepConfigError, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$fetchConfig$1.1

            /* JADX INFO: renamed from: com.hellogroup.fep.config.core.FepConfigManager$fetchConfig$1$1$1, reason: invalid class name */
            @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
            @DebugMetadata(m88262c = "com.hellogroup.fep.config.core.FepConfigManager$fetchConfig$1$1$1", m88263f = "FepConfigManager.kt", m88264l = {}, m88265m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
                final /* synthetic */ zfi $configData;
                int label;

                /* JADX INFO: renamed from: p$ */
                private drb f11919p$;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(zfi zfiVar, Continuation continuation) {
                    super(2, continuation);
                    this.$configData = zfiVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    continuation.getClass();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$configData, continuation);
                    anonymousClass1.f11919p$ = (drb) obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    FepConfigContext.INSTANCE.m17641h().m120770e(this.$configData);
                    return Unit.INSTANCE;
                }
            }

            {
                super(2);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable zfi zfiVar2, @Nullable FepConfigError fepConfigError) {
                FepConfigManager$fetchConfig$1.this.this$0.isFetching.set(false);
                if (fepConfigError != null) {
                    FepConfigContext.INSTANCE.m17638e().m172241c(fepConfigError.getCode(), fepConfigError.getMessage(), fepConfigError.getThrowable(), fepConfigError.getParams());
                    FepConfigManager$fetchConfig$1.this.this$0.m17626s();
                    return;
                }
                if (zfiVar2 != null && (FepConfigManager$fetchConfig$1.this.$type == FepConfigFetchType.LAUNCH || zfiVar2.getNeedUpdate())) {
                    FepConfigContext fepConfigContext2 = FepConfigContext.INSTANCE;
                    fepConfigContext2.m17635b().set(zfiVar2);
                    xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new AnonymousClass1(zfiVar2, null), 3, null);
                    FepConfigManager$fetchConfig$1 fepConfigManager$fetchConfig$1 = FepConfigManager$fetchConfig$1.this;
                    FepConfigManager.m17623n(fepConfigManager$fetchConfig$1.this$0, false, fepConfigManager$fetchConfig$1.$type, 1, null);
                    pgi.m172235f(fepConfigContext2.m17638e(), "Config fetched and updated successfully, hash: " + zfiVar2.getHashStr(), null, 0, 6, null);
                }
                FepConfigManager$fetchConfig$1.this.this$0.m17626s();
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(zfi zfiVar2, FepConfigError fepConfigError) {
                invoke2(zfiVar2, fepConfigError);
                return Unit.INSTANCE;
            }
        });
        return Unit.INSTANCE;
    }
}
