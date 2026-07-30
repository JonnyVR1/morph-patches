package com.tencent.could.huiyansdk.turing;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.callback.InterfaceC14048d;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.turing.e */
/* JADX INFO: loaded from: classes12.dex */
public class HandlerC14086e extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14087f f58329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14086e(C14087f c14087f, Looper looper) {
        super(looper);
        this.f58329a = c14087f;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f58329a.f58332c) {
            C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "isEndPreView is true do not need set camera data");
            return;
        }
        int i = message.what;
        if (i == 3) {
            this.f58329a.getClass();
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(213);
            Context context = CommonUtils.getContext();
            compareResult.setErrorMsg(context == null ? context.getResources().getString(C14032R.string.txy_check_get_frame_error) : "Failed to get data from camera, pleas back to the previous step and try again");
            C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "event call for first frame time out!!!");
            C14065b.b.f58281a.m83511a(AuthState.AUTH_ERROR_DIALOG, compareResult);
            return;
        }
        if (i == 4) {
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(1, "TuringSdkHelper", "wait frame image check is time out");
            C14087f c14087f = this.f58329a;
            c14087f.getClass();
            c14068e.m83520a(1, "TuringSdkHelper", "remove compare check all listener");
            InterfaceC14048d interfaceC14048d = c14087f.f58338i;
            if (interfaceC14048d == null) {
                c14068e.m83520a(1, "TuringSdkHelper", "do not need waiting turing!");
                return;
            }
            ((C14065b.a) interfaceC14048d).m83515a();
            c14087f.f58338i = null;
            if (c14087f.f58342m != null) {
                c14087f.f58342m.removeMessages(4);
                return;
            }
            return;
        }
        if (i != 5) {
            C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "error event");
            return;
        }
        C14068e.a.f58293a.m83520a(1, "TuringSdkHelper", "turing face timeout " + this.f58329a.f58330a);
        TuringResultCacheEntity turingResultCacheEntity = this.f58329a.f58335f;
        if (turingResultCacheEntity != null) {
            turingResultCacheEntity.setTuringEnvErrorStr("EnvRiskData timeout with: " + this.f58329a.f58330a + " ms");
        }
        this.f58329a.f58340k = true;
        if (C14050a.a.f58212a.f58209d) {
            InterfaceC14035b interfaceC14035b = C14043j.a.f58200a.f58196g;
            if (interfaceC14035b != null) {
                interfaceC14035b.onTuringFaceDataSuccess("");
            }
            C14065b.b.f58281a.m83511a(AuthState.START_GET_LIVE_TYPE, (Object) null);
        }
        C14087f.m83562a(this.f58329a);
        C14087f.m83563a(this.f58329a, true);
    }
}
