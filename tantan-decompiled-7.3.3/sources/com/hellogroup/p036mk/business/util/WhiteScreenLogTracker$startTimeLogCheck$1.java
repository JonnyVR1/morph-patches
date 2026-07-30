package com.hellogroup.p036mk.business.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.drb;
import p153l.jzv;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.util.WhiteScreenLogTracker$startTimeLogCheck$1", m88263f = "WhiteScreenLogTracker.kt", m88264l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m88265m = "invokeSuspend")
public final class WhiteScreenLogTracker$startTimeLogCheck$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $logSessionKey;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12324p$;
    final /* synthetic */ WhiteScreenLogTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteScreenLogTracker$startTimeLogCheck$1(WhiteScreenLogTracker whiteScreenLogTracker, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = whiteScreenLogTracker;
        this.$logSessionKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        WhiteScreenLogTracker$startTimeLogCheck$1 whiteScreenLogTracker$startTimeLogCheck$1 = new WhiteScreenLogTracker$startTimeLogCheck$1(this.this$0, this.$logSessionKey, continuation);
        whiteScreenLogTracker$startTimeLogCheck$1.f12324p$ = (drb) obj;
        return whiteScreenLogTracker$startTimeLogCheck$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((WhiteScreenLogTracker$startTimeLogCheck$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = this.f12324p$;
            long j = ((long) this.this$0.loadingOvertime) * 1000;
            this.L$0 = drbVar;
            this.label = 1;
            if (DelayKt.m94502b(j, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        if (!this.this$0.isJobReleased.get()) {
            this.this$0.m18234p(this.$logSessionKey);
            jzv.m147732e(this.this$0.TAG, "startTimeLogCheck=" + this.$logSessionKey + '=' + Thread.currentThread());
        }
        return Unit.INSTANCE;
    }
}
