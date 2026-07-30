package com.tencent.could.huiyansdk.turing;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.callback.InterfaceC13885d;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.turing.e */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC13923e extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13924f f57481a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC13923e(C13924f c13924f, Looper looper) {
        super(looper);
        this.f57481a = c13924f;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f57481a.f57484c) {
            C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "isEndPreView is true do not need set camera data");
            return;
        }
        int i = message.what;
        if (i == 3) {
            this.f57481a.getClass();
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(213);
            Context context = CommonUtils.getContext();
            compareResult.setErrorMsg(context == null ? context.getResources().getString(C13869R.string.txy_check_get_frame_error) : "Failed to get data from camera, pleas back to the previous step and try again");
            C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "event call for first frame time out!!!");
            C13902b.b.f57433a.m82328a(AuthState.AUTH_ERROR_DIALOG, compareResult);
            return;
        }
        if (i == 4) {
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(1, "TuringSdkHelper", "wait frame image check is time out");
            C13924f c13924f = this.f57481a;
            c13924f.getClass();
            c13905e.m82337a(1, "TuringSdkHelper", "remove compare check all listener");
            InterfaceC13885d interfaceC13885d = c13924f.f57490i;
            if (interfaceC13885d == null) {
                c13905e.m82337a(1, "TuringSdkHelper", "do not need waiting turing!");
                return;
            }
            ((C13902b.a) interfaceC13885d).m82332a();
            c13924f.f57490i = null;
            if (c13924f.f57494m != null) {
                c13924f.f57494m.removeMessages(4);
                return;
            }
            return;
        }
        if (i != 5) {
            C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "error event");
            return;
        }
        C13905e.a.f57445a.m82337a(1, "TuringSdkHelper", "turing face timeout " + this.f57481a.f57482a);
        TuringResultCacheEntity turingResultCacheEntity = this.f57481a.f57487f;
        if (turingResultCacheEntity != null) {
            turingResultCacheEntity.setTuringEnvErrorStr("EnvRiskData timeout with: " + this.f57481a.f57482a + " ms");
        }
        this.f57481a.f57492k = true;
        if (C13887a.a.f57364a.f57361d) {
            InterfaceC13872b interfaceC13872b = C13880j.a.f57352a.f57348g;
            if (interfaceC13872b != null) {
                interfaceC13872b.onTuringFaceDataSuccess("");
            }
            C13902b.b.f57433a.m82328a(AuthState.START_GET_LIVE_TYPE, (Object) null);
        }
        C13924f.m82379a(this.f57481a);
        C13924f.m82380a(this.f57481a, true);
    }
}
