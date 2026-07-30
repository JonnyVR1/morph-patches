package com.p046p1.mobile.putong.api.api;

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
import p149l.gxc0;
import p149l.ork;
import p149l.ppb;
import p149l.qib0;
import p149l.qkq0;
import p149l.uwp;
import p149l.xc20;
import p149l.xh5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
@DebugMetadata(m87373c = "com.p1.mobile.putong.api.api.ClevertapApi$fetchProfile$1", m87374f = "ClevertapApi.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
@SourceDebugExtension
public final class ClevertapApi$fetchProfile$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((ClevertapApi$fetchProfile$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strString;
        ClevertapApi.CleverTapProfileInfo cleverTapProfileInfo;
        ClevertapApi.CleverTapProfileInfoBean data;
        uwp.m196133e();
        Unit unitInvoke = null;
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        Function2<Map<String, ? extends Object>, List<String>, Unit> function2 = this.$call;
        try {
            Result.Companion companion = Result.INSTANCE;
            gxc0 gxc0VarM118606k = qib0.f154685D.mo144849a(xc20.m208061b(qib0.f154693H.maybeUpdateRequestBeforeCall(qib0.f154693H.auth().m185898q(xh5.m208761i("/ttt/users/me/clevertap/info")).m185887f().m185883b()), NetworkTrackInfo.ReportType.API)).execute().m118606k();
            if (gxc0VarM118606k != null && (strString = gxc0VarM118606k.string()) != null) {
                if (strString.length() <= 0) {
                    strString = null;
                }
                if (strString != null && (cleverTapProfileInfo = (ClevertapApi.CleverTapProfileInfo) ork.m165670b(strString, ClevertapApi.CleverTapProfileInfo.class)) != null && (data = cleverTapProfileInfo.getData()) != null) {
                    unitInvoke = function2.invoke(data.getProfile(), data.getRemovedKeys());
                }
            }
            Result.m223820constructorimpl(unitInvoke);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        return Unit.INSTANCE;
    }
}
