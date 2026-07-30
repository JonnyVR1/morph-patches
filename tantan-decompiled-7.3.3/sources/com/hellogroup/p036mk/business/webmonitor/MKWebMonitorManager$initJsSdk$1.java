package com.hellogroup.p036mk.business.webmonitor;

import android.text.TextUtils;
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
import p153l.jlw;
import p153l.jzv;
import p153l.rs8;
import p153l.uyp;
import p153l.wi20;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.webmonitor.MKWebMonitorManager$initJsSdk$1", m88263f = "MKWebMonitorManager.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class MKWebMonitorManager$initJsSdk$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12336p$;

    public MKWebMonitorManager$initJsSdk$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKWebMonitorManager$initJsSdk$1 mKWebMonitorManager$initJsSdk$1 = new MKWebMonitorManager$initJsSdk$1(continuation);
        mKWebMonitorManager$initJsSdk$1.f12336p$ = (drb) obj;
        return mKWebMonitorManager$initJsSdk$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKWebMonitorManager$initJsSdk$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            MKWebMonitorManager mKWebMonitorManager = MKWebMonitorManager.INSTANCE;
            MKWebMonitorManager.m18248c(mKWebMonitorManager).set(rs8.m182933x());
            if (MKWebMonitorManager.m18248c(mKWebMonitorManager).get()) {
                String strM146115b = jlw.m146115b();
                MKWebMonitorManager.m18246a(mKWebMonitorManager).set(strM146115b);
                MKWebMonitorManager.mIsPrepared.set(!TextUtils.isEmpty(strM146115b));
            }
            mKWebMonitorManager.m18256k(wi20.m206538b());
            MKWebMonitorManager.m18251h(" monitorEnable:" + MKWebMonitorManager.m18248c(mKWebMonitorManager) + "  mInjectContent:" + MKWebMonitorManager.m18246a(mKWebMonitorManager) + " prepare cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        } catch (Throwable th) {
            jzv.m147730c(MKWebMonitorManager.WEB_APM, "", th);
        }
        return Unit.INSTANCE;
    }
}
