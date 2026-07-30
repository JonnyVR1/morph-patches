package com.hellogroup.p036mk.business;

import com.hellogroup.p036mk.business.webmonitor.MKWebMonitorManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.c2f;
import p153l.drb;
import p153l.gsw;
import p153l.lv0;
import p153l.mjw;
import p153l.r5e;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;
import p153l.zqw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.MKConfigSetter$Companion$initBusinessKit$1", m88263f = "MKConfigSetter.kt", m88264l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m88265m = "invokeSuspend")
public final class MKConfigSetter$Companion$initBusinessKit$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12001p$;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.MKConfigSetter$Companion$initBusinessKit$1$2 */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/drb;", "Lkotlin/Result;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
    @DebugMetadata(m88262c = "com.hellogroup.mk.business.MKConfigSetter$Companion$initBusinessKit$1$2", m88263f = "MKConfigSetter.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C35062 extends SuspendLambda implements Function2<drb, Continuation<? super Result<? extends Unit>>, Object> {
        int label;

        /* JADX INFO: renamed from: p$ */
        private drb f12002p$;

        public C35062(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C35062 c35062 = new C35062(continuation);
            c35062.f12002p$ = (drb) obj;
            return c35062;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Result<? extends Unit>> continuation) {
            return ((C35062) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM225066constructorimpl;
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                mjw.INSTANCE.m158636l();
                MKWebMonitorManager.INSTANCE.m18255j();
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            return Result.m225065boximpl(objM225066constructorimpl);
        }
    }

    public MKConfigSetter$Companion$initBusinessKit$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKConfigSetter$Companion$initBusinessKit$1 mKConfigSetter$Companion$initBusinessKit$1 = new MKConfigSetter$Companion$initBusinessKit$1(continuation);
        mKConfigSetter$Companion$initBusinessKit$1.f12001p$ = (drb) obj;
        return mKConfigSetter$Companion$initBusinessKit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKConfigSetter$Companion$initBusinessKit$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = this.f12001p$;
            try {
                Result.Companion companion = Result.INSTANCE;
                c2f.m107685f();
                zqw.m221052d(lv0.m155971a());
                Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            gsw gswVarM179862c = r5e.m179862c();
            C35062 c35062 = new C35062(null);
            this.L$0 = drbVar;
            this.label = 1;
            if (vh3.m201255g(gswVarM179862c, c35062, this) == objM198688e) {
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
