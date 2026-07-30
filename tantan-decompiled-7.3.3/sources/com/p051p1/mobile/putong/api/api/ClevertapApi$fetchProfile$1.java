package com.p051p1.mobile.putong.api.api;

import com.tantanapp.common.network.NetworkTrackInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.drb;
import p153l.euk;
import p153l.hl20;
import p153l.k5d0;
import p153l.uqb0;
import p153l.uyp;
import p153l.wtq0;
import p153l.xi5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.api.api.ClevertapApi$fetchProfile$1", m88263f = "ClevertapApi.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
@SourceDebugExtension
public final class ClevertapApi$fetchProfile$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, List<String>, Unit> $call;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClevertapApi$fetchProfile$1(Function2<? super Map<String, ? extends Object>, ? super List<String>, Unit> function2, Continuation<? super ClevertapApi$fetchProfile$1> continuation) {
        super(2, continuation);
        this.$call = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClevertapApi$fetchProfile$1(this.$call, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((ClevertapApi$fetchProfile$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strString;
        ClevertapApi.CleverTapProfileInfo cleverTapProfileInfo;
        ClevertapApi.CleverTapProfileInfoBean data;
        uyp.m198688e();
        Unit unitInvoke = null;
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        Function2<Map<String, ? extends Object>, List<String>, Unit> function2 = this.$call;
        try {
            Result.Companion companion = Result.INSTANCE;
            k5d0 k5d0VarM138670k = uqb0.f180368D.mo181341a(hl20.m135655b(uqb0.f180376H.maybeUpdateRequestBeforeCall(uqb0.f180376H.auth().m209043q(xi5.m211107i("/ttt/users/me/clevertap/info")).m209032f().m209028b()), NetworkTrackInfo.ReportType.API)).execute().m138670k();
            if (k5d0VarM138670k != null && (strString = k5d0VarM138670k.string()) != null) {
                if (strString.length() <= 0) {
                    strString = null;
                }
                if (strString != null && (cleverTapProfileInfo = (ClevertapApi.CleverTapProfileInfo) euk.m122576b(strString, ClevertapApi.CleverTapProfileInfo.class)) != null && (data = cleverTapProfileInfo.getData()) != null) {
                    unitInvoke = function2.invoke(data.getProfile(), data.getRemovedKeys());
                }
            }
            Result.m225066constructorimpl(unitInvoke);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        return Unit.INSTANCE;
    }
}
