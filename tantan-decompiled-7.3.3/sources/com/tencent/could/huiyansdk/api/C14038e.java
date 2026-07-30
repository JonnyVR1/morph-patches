package com.tencent.could.huiyansdk.api;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSWidgeAnimationType;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LiveDataCheckResult;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14064a;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.e */
/* JADX INFO: loaded from: classes12.dex */
public class C14038e {
    /* JADX INFO: renamed from: a */
    public static void m83405a(String str) {
        C14043j c14043j = C14043j.a.f58200a;
        c14043j.f58193d = false;
        HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
        LiveDataCheckResult liveDataCheckResultCheckHaveColorData = CommonUtils.checkHaveColorData(str);
        if (huiYanSdkConfigM83418b.isUseBackCamera() && liveDataCheckResultCheckHaveColorData.isHaveColorData()) {
            C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "have color data!");
            InterfaceC14035b interfaceC14035b = c14043j.f58196g;
            if (interfaceC14035b != null) {
                interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", "back camera have color data!");
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(227);
            compareResult.setErrorMsg(c14043j.m83413a().getResources().getString(C14032R.string.txy_use_back_camera_with_reflective));
            m83404a(compareResult);
            return;
        }
        try {
            C14063b.a.f58253a.m83504b("check_eye_open", liveDataCheckResultCheckHaveColorData.isNoAction());
        } catch (JSONException e) {
            C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "update sdk config error: " + e.getLocalizedMessage());
        }
        C14063b c14063b = C14063b.a.f58253a;
        if (c14063b.f58250a == null) {
            C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "sdk config json is null!");
        } else {
            YtSDKKitFramework.getInstance().updateSDKSetting(YtSDKKitConfigHelper.getSDKConfig(c14063b.m83501b(), c14063b.f58250a));
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        huiYanBaseApi.getClass();
        c14063b.getClass();
        if (TextUtils.isEmpty(str)) {
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f58202b;
            if (huiYanBaseCallBack == null) {
                Log.e("HuiYanBaseApi", "send error callback, but callback is null!");
            } else {
                huiYanBaseCallBack.onFail(226, "");
            }
        } else if (c14063b.f58251b == null) {
            HuiYanBaseCallBack huiYanBaseCallBack2 = huiYanBaseApi.f58202b;
            if (huiYanBaseCallBack2 == null) {
                Log.e("HuiYanBaseApi", "send error callback, but callback is null!");
            } else {
                huiYanBaseCallBack2.onFail(221, "");
            }
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put("response", str);
            c14063b.f58251b.onNetworkResponseEvent(map, null);
        }
        c14043j.m83421e();
    }

    /* JADX INFO: renamed from: a */
    public static void m83404a(CompareResult compareResult) {
        BaseFragment baseFragmentM83505a = C14064a.a.f58257a.m83505a();
        if (baseFragmentM83505a instanceof AuthingFragment) {
            ((AuthingFragment) baseFragmentM83505a).m83456a((Object) compareResult);
        } else {
            C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "current fragment is null!");
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m83403a(String[] strArr) {
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
