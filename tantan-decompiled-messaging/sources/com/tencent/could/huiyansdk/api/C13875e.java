package com.tencent.could.huiyansdk.api;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSWidgeAnimationType;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LiveDataCheckResult;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13901a;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13875e {
    /* JADX INFO: renamed from: a */
    public static void m82222a(String str) {
        C13880j c13880j = C13880j.a.f57352a;
        c13880j.f57345d = false;
        HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
        LiveDataCheckResult liveDataCheckResultCheckHaveColorData = CommonUtils.checkHaveColorData(str);
        if (huiYanSdkConfigM82235b.isUseBackCamera() && liveDataCheckResultCheckHaveColorData.isHaveColorData()) {
            C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "have color data!");
            InterfaceC13872b interfaceC13872b = c13880j.f57348g;
            if (interfaceC13872b != null) {
                interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", "back camera have color data!");
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(227);
            compareResult.setErrorMsg(c13880j.m82230a().getResources().getString(C13869R.string.txy_use_back_camera_with_reflective));
            m82221a(compareResult);
            return;
        }
        try {
            C13900b.a.f57405a.m82321b("check_eye_open", liveDataCheckResultCheckHaveColorData.isNoAction());
        } catch (JSONException e) {
            C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "update sdk config error: " + e.getLocalizedMessage());
        }
        C13900b c13900b = C13900b.a.f57405a;
        if (c13900b.f57402a == null) {
            C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "sdk config json is null!");
        } else {
            YtSDKKitFramework.getInstance().updateSDKSetting(YtSDKKitConfigHelper.getSDKConfig(c13900b.m82318b(), c13900b.f57402a));
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        huiYanBaseApi.getClass();
        c13900b.getClass();
        if (TextUtils.isEmpty(str)) {
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f57354b;
            if (huiYanBaseCallBack == null) {
                Log.e("HuiYanBaseApi", "send error callback, but callback is null!");
            } else {
                huiYanBaseCallBack.onFail(226, "");
            }
        } else if (c13900b.f57403b == null) {
            HuiYanBaseCallBack huiYanBaseCallBack2 = huiYanBaseApi.f57354b;
            if (huiYanBaseCallBack2 == null) {
                Log.e("HuiYanBaseApi", "send error callback, but callback is null!");
            } else {
                huiYanBaseCallBack2.onFail(221, "");
            }
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put("response", str);
            c13900b.f57403b.onNetworkResponseEvent(map, null);
        }
        c13880j.m82238e();
    }

    /* JADX INFO: renamed from: a */
    public static void m82221a(CompareResult compareResult) {
        BaseFragment baseFragmentM82322a = C13901a.a.f57409a.m82322a();
        if (baseFragmentM82322a instanceof AuthingFragment) {
            ((AuthingFragment) baseFragmentM82322a).m82273a((Object) compareResult);
        } else {
            C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "current fragment is null!");
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m82220a(String[] strArr) {
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            int i2 = Integer.parseInt(strArr[i]);
            if (i2 == 0 || i2 == 1) {
                str = str + "blink";
            } else if (i2 == 2) {
                str = str + "mouth";
            } else if (i2 == 3) {
                str = str + "node";
            } else if (i2 == 4) {
                str = str + OMSWidgeAnimationType.shake;
            } else if (i2 == 5) {
                str = str + "silence";
            }
            if (i != strArr.length - 1) {
                str = str + Constants.SEPARATOR_COMMA;
            }
        }
        return str;
    }
}
