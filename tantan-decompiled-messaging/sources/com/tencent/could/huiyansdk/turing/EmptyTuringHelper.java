package com.tencent.could.huiyansdk.turing;

import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13905e;

/* JADX INFO: loaded from: classes2.dex */
public class EmptyTuringHelper extends AbstractC13920b {
    @Override // com.tencent.could.huiyansdk.turing.AbstractC13920b
    /* JADX INFO: renamed from: a */
    public int mo82377a(View view, CameraHolder cameraHolder, String str) {
        InterfaceC13921c interfaceC13921c = this.f57479a;
        if (interfaceC13921c != null) {
            C13922d c13922d = (C13922d) interfaceC13921c;
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(1, "TuringSdkHelper", "return code: 0, bytes is null");
            c13922d.f57480a.m82385d();
            C13924f.m82380a(c13922d.f57480a, false);
            C13924f c13924f = c13922d.f57480a;
            if (c13924f.f57487f != null) {
                C13924f.m82379a(c13924f);
            } else {
                HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C13881a.f57357a.f57354b;
                if (huiYanBaseCallBack != null) {
                    huiYanBaseCallBack.onOperateTimeEvent("GetTuringTokenUseTime", 2, false, "");
                }
                String strEncodeToString = Base64.encodeToString(null, 2);
                TuringResultCacheEntity turingResultCacheEntity = c13922d.f57480a.f57487f;
                if (turingResultCacheEntity != null) {
                    turingResultCacheEntity.setTuringResultDate(strEncodeToString);
                    c13905e.m82337a(1, "TuringSdkHelper", "turing result cache is not null");
                    c13905e.m82337a(1, "TuringSdkHelper", "turing result data: " + TextUtils.isEmpty(strEncodeToString));
                } else {
                    c13905e.m82337a(2, "TuringSdkHelper", "turing result cache is null");
                }
                if (c13922d.f57480a.f57492k) {
                    c13905e.m82337a(2, "TuringSdkHelper", "on get device token has timeout!");
                } else {
                    if (C13887a.a.f57364a.f57361d && !TextUtils.isEmpty(strEncodeToString)) {
                        InterfaceC13872b interfaceC13872b = C13880j.a.f57352a.f57348g;
                        if (interfaceC13872b != null) {
                            interfaceC13872b.onTuringFaceDataSuccess(strEncodeToString);
                        }
                        C13902b.b.f57433a.m82328a(AuthState.START_GET_LIVE_TYPE, (Object) null);
                    }
                    C13924f.m82379a(c13922d.f57480a);
                }
            }
        }
        return 0;
    }
}
