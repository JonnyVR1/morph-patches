package com.tencent.could.huiyansdk.turing;

import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14068e;

/* JADX INFO: loaded from: classes12.dex */
public class EmptyTuringHelper extends AbstractC14083b {
    @Override // com.tencent.could.huiyansdk.turing.AbstractC14083b
    /* JADX INFO: renamed from: a */
    public int mo83560a(View view, CameraHolder cameraHolder, String str) {
        InterfaceC14084c interfaceC14084c = this.f58327a;
        if (interfaceC14084c != null) {
            C14085d c14085d = (C14085d) interfaceC14084c;
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(1, "TuringSdkHelper", "return code: 0, bytes is null");
            c14085d.f58328a.m83568d();
            C14087f.m83563a(c14085d.f58328a, false);
            C14087f c14087f = c14085d.f58328a;
            if (c14087f.f58335f != null) {
                C14087f.m83562a(c14087f);
            } else {
                HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C14044a.f58205a.f58202b;
                if (huiYanBaseCallBack != null) {
                    huiYanBaseCallBack.onOperateTimeEvent("GetTuringTokenUseTime", 2, false, "");
                }
                String strEncodeToString = Base64.encodeToString(null, 2);
                TuringResultCacheEntity turingResultCacheEntity = c14085d.f58328a.f58335f;
                if (turingResultCacheEntity != null) {
                    turingResultCacheEntity.setTuringResultDate(strEncodeToString);
                    c14068e.m83520a(1, "TuringSdkHelper", "turing result cache is not null");
                    c14068e.m83520a(1, "TuringSdkHelper", "turing result data: " + TextUtils.isEmpty(strEncodeToString));
                } else {
                    c14068e.m83520a(2, "TuringSdkHelper", "turing result cache is null");
                }
                if (c14085d.f58328a.f58340k) {
                    c14068e.m83520a(2, "TuringSdkHelper", "on get device token has timeout!");
                } else {
                    if (C14050a.a.f58212a.f58209d && !TextUtils.isEmpty(strEncodeToString)) {
                        InterfaceC14035b interfaceC14035b = C14043j.a.f58200a.f58196g;
                        if (interfaceC14035b != null) {
                            interfaceC14035b.onTuringFaceDataSuccess(strEncodeToString);
                        }
                        C14065b.b.f58281a.m83511a(AuthState.START_GET_LIVE_TYPE, (Object) null);
                    }
                    C14087f.m83562a(c14085d.f58328a);
                }
            }
        }
        return 0;
    }
}
