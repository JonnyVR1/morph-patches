package com.p000p1.mobile.putong.api.api;

import com.p000p1.mobile.putong.account.data.CameraSticker;
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
import l.gxc0;
import l.ork;
import l.ppb;
import l.qkq0;
import l.uwp;
import p006l.qib0;
import p006l.xc20;
import p006l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.api.api.ClevertapApi$fetchProfile$1", f = "ClevertapApi.kt", l = {}, m = "invokeSuspend", v = 1)
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

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClevertapApi$fetchProfile$1(this.$call, continuation);
    }

    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String strString;
        ClevertapApi.CleverTapProfileInfo cleverTapProfileInfo;
        ClevertapApi.CleverTapProfileInfoBean data;
        uwp.e();
        Unit unit = null;
        if (this.label != 0) {
            qkq0.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.b(obj);
        Function2<Map<String, ? extends Object>, List<String>, Unit> function2 = this.$call;
        try {
            Result.Companion companion = Result.Companion;
            gxc0 gxc0VarK = qib0.f19776D.a(xc20.m27194b(qib0.f19784H.maybeUpdateRequestBeforeCall(qib0.f19784H.auth().q(xh5.m27250i("/ttt/users/me/clevertap/info")).f().b()), NetworkTrackInfo.ReportType.API)).execute().k();
            if (gxc0VarK != null && (strString = gxc0VarK.string()) != null) {
                if (strString.length() <= 0) {
                    strString = null;
                }
                if (strString != null && (cleverTapProfileInfo = (ClevertapApi.CleverTapProfileInfo) ork.b(strString, ClevertapApi.CleverTapProfileInfo.class)) != null && (data = cleverTapProfileInfo.getData()) != null) {
                    unit = (Unit) function2.invoke(data.getProfile(), data.getRemovedKeys());
                }
            }
            Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
        return Unit.INSTANCE;
    }
}
