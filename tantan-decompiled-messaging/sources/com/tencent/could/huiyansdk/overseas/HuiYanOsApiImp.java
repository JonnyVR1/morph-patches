package com.tencent.could.huiyansdk.overseas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tencent.cloud.overseas.C13800R;
import com.tencent.could.component.common.p079ai.eventreport.utils.DeviceInfoUtil;
import com.tencent.could.component.common.p079ai.log.AiLog;
import com.tencent.could.component.common.p079ai.log.AiLogConfig;
import com.tencent.could.component.common.p079ai.log.AiLogger;
import com.tencent.could.component.common.p079ai.utils.CloudCrashHandler;
import com.tencent.could.huiyansdk.activitys.LandMainAuthActivity;
import com.tencent.could.huiyansdk.activitys.MainAuthActivity;
import com.tencent.could.huiyansdk.api.C13875e;
import com.tencent.could.huiyansdk.api.C13878h;
import com.tencent.could.huiyansdk.api.C13879i;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.api.InterfaceC13873c;
import com.tencent.could.huiyansdk.api.InterfaceC13874d;
import com.tencent.could.huiyansdk.api.InterfaceC13876f;
import com.tencent.could.huiyansdk.api.InterfaceC13877g;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LiveTypeResult;
import com.tencent.could.huiyansdk.entity.OverSeaLiveRequest;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.FaceAngleValidation;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.VideoSize;
import com.tencent.could.huiyansdk.exception.C13890a;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13901a;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.operate.C13907a;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.turing.C13924f;
import com.tencent.could.huiyansdk.turing.EmptyTuringHelper;
import com.tencent.could.huiyansdk.utils.C13929d;
import com.tencent.could.huiyansdk.utils.C13930e;
import com.tencent.could.huiyansdk.utils.C13931f;
import com.tencent.could.huiyansdk.utils.C13939n;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HuiYanOsApiImp {
    public static final String PRE_PAGE_ClASS_NAME = "com.tencent.could.huiyansdk.overseas.fragment.GuideFragment";
    public static final String TAG = "HuiYanOsApiImp";
    public HuiYanAuthEventCallBack huiYanAuthEventCallBack;
    public HuiYanOsConfig osConfig;
    public String currentToken = "";
    public boolean isNeedCleanListener = true;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp$6 */
    public static /* synthetic */ class C139136 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation;

        static {
            int[] iArr = new int[FaceAngleValidation.values().length];
            $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation;
                FaceAngleValidation faceAngleValidation = FaceAngleValidation.LevelLoose;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation;
                FaceAngleValidation faceAngleValidation2 = FaceAngleValidation.LevelLoose;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class HuiYanOsApiImpHolder {
        public static final HuiYanOsApiImp INSTANCE = new HuiYanOsApiImp();
    }

    private HuiYanSdkConfig changeFaceAngleValidation(HuiYanSdkConfig huiYanSdkConfig, HuiYanOsConfig huiYanOsConfig) {
        int iOrdinal = huiYanOsConfig.getFaceAngleValidation().ordinal();
        if (iOrdinal == 0) {
            huiYanSdkConfig.setOpenAngleDetect(false);
            huiYanSdkConfig.setBestImageYaw(30.0f);
            huiYanSdkConfig.setBestImageRoll(30.0f);
            return huiYanSdkConfig;
        }
        if (iOrdinal == 1) {
            huiYanSdkConfig.setOpenAngleDetect(true);
            huiYanSdkConfig.setBestImageYaw(20.0f);
            huiYanSdkConfig.setBestImageRoll(20.0f);
            return huiYanSdkConfig;
        }
        if (iOrdinal != 2) {
            return huiYanSdkConfig;
        }
        huiYanSdkConfig.setOpenAngleDetect(true);
        huiYanSdkConfig.setBestImageYaw(10.0f);
        huiYanSdkConfig.setBestImageRoll(10.0f);
        return huiYanSdkConfig;
    }

    private LiveTypeResult checkLiveData(String str) {
        try {
            return (LiveTypeResult) new Gson().fromJson(str, LiveTypeResult.class);
        } catch (JsonSyntaxException unused) {
            C13905e.a.f57445a.m82337a(2, TAG, "");
            return null;
        }
    }

    private HuiYanSdkConfig createHuiYanConfig(HuiYanOsConfig huiYanOsConfig) {
        C13905e.a.f57445a.m82337a(1, TAG, "create HuiYanSdkConfig by startConfig:" + huiYanOsConfig);
        HuiYanSdkConfig huiYanSdkConfig = new HuiYanSdkConfig();
        huiYanSdkConfig.setDeleteVideoCache(huiYanOsConfig.isDeleteVideoCache());
        huiYanSdkConfig.setAuthLicense(huiYanOsConfig.getAuthLicense());
        huiYanSdkConfig.setPageColorStyle(huiYanOsConfig.getPageColorStyle());
        huiYanSdkConfig.setPrepareFaceTimeOutMs(huiYanOsConfig.getAuthTimeOutMs());
        huiYanSdkConfig.setAuthTimeOutMs(huiYanOsConfig.getAuthTimeOutMs());
        huiYanSdkConfig.setLanguageStyle(huiYanOsConfig.getLanguageStyle());
        huiYanSdkConfig.setLanguageCode(huiYanOsConfig.getLanguageCode());
        huiYanSdkConfig.setCloseEncrypt(true);
        huiYanSdkConfig.setUseBackCamera(huiYanOsConfig.isUseBackCamera());
        huiYanSdkConfig.setStartActivityContext(huiYanOsConfig.getStartActivityContext());
        huiYanSdkConfig.setOpenLog(huiYanOsConfig.isOpenLog());
        huiYanSdkConfig.setOpenFullLog(huiYanOsConfig.isOpenFullLog());
        huiYanSdkConfig.setLongCheckTimeOutMs(huiYanOsConfig.getLongCheckTimeOutMs());
        huiYanSdkConfig.setOpenCheckRiskMode(false);
        if (huiYanOsConfig.isOpenBOTCheck()) {
            huiYanSdkConfig.setOpenLongCheck(huiYanOsConfig.isOpenBOTCheck());
            huiYanSdkConfig.setNeedCropBestImageMode(huiYanOsConfig.isOpenBOTCheck());
        }
        huiYanSdkConfig.setPolicyDialogResId(C13800R.string.txy_huiyan_pro_confirm_tips);
        huiYanSdkConfig.setShowPrivacyPolicyDialog(huiYanOsConfig.isShowPrivacyPolicyDialog());
        huiYanSdkConfig.setSmallFaceRatioThreshold(huiYanOsConfig.getSmallFaceRatioThreshold());
        huiYanSdkConfig.setBigFaceRatioThreshold(huiYanOsConfig.getBigFaceRatioThreshold());
        huiYanSdkConfig.setDisableSystemRecordScreen(huiYanOsConfig.isDisableSystemRecordScreen());
        huiYanSdkConfig.setZoomLevel(huiYanOsConfig.getZoomLevel());
        huiYanSdkConfig.setDelayTimeMsOfLoadFragment(huiYanOsConfig.getDelayTimeMsOfLoadFragment());
        huiYanSdkConfig.setRelaxed(true);
        huiYanSdkConfig.setFaceOcclusionLevel(huiYanOsConfig.getFaceOcclusionLevel());
        huiYanSdkConfig.setOtherActionCheckMouthOpen(huiYanOsConfig.isOtherActionCheckMouthOpen());
        if (huiYanOsConfig.isShowGuidePage()) {
            C13901a.a.f57409a.f57406a = PRE_PAGE_ClASS_NAME;
        } else {
            C13901a.a.f57409a.f57406a = "";
        }
        return changeFaceAngleValidation(huiYanSdkConfig, huiYanOsConfig);
    }

    private String createLiveResultString(LiveTypeResult liveTypeResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorcode", 0);
        jSONObject.put("type", 2);
        jSONObject.put("data", "0");
        jSONObject.put("errormsg", "OK");
        jSONObject.put("action_data", liveTypeResult.getActionData());
        jSONObject.put("color_data", liveTypeResult.getColorData());
        jSONObject.put("select_data", new JSONObject(liveTypeResult.getSelectData()));
        return jSONObject.toString();
    }

    public static HuiYanOsApiImp getInstance() {
        return HuiYanOsApiImpHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLiveTypeRequest(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("select_data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("select_data");
                OverSeaLiveRequest overSeaLiveRequest = new OverSeaLiveRequest();
                overSeaLiveRequest.setSelectData(jSONObject2.toString());
                HuiYanResultSender.getInstance().sendConfigSuccess(new Gson().toJson(overSeaLiveRequest));
            }
        } catch (JSONException unused) {
            C13905e.a.f57445a.m82337a(2, TAG, "do request content error!");
        }
    }

    private void realStartGetAuthConfigData(boolean z, HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        int iM82312a;
        Context startActivityContext;
        HuiYanResultSender.getInstance().setConfigCallback(huiYanConfigCallback);
        C13907a c13907a = C13907a.b.f57473a;
        Map<String, Long> map = c13907a.f57470b;
        if (map != null) {
            map.clear();
        }
        HuiYanOperateBody huiYanOperateBody = c13907a.f57469a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.reset();
        }
        this.isNeedCleanListener = true;
        if (huiYanOsConfig != null) {
            if (huiYanOsConfig.isOpenBOTCheck()) {
                AuthUiConfig authUiConfig = huiYanOsConfig.getAuthUiConfig();
                if (authUiConfig == null) {
                    authUiConfig = new AuthUiConfig();
                }
                authUiConfig.setVideoSize(VideoSize.SIZE_720P);
                huiYanOsConfig.setAuthUiConfig(authUiConfig);
            }
            C13880j.a.f57352a.f57344c = huiYanOsConfig.getAuthUiConfig();
        }
        this.osConfig = huiYanOsConfig;
        HuiYanSdkConfig huiYanSdkConfigCreateHuiYanConfig = createHuiYanConfig(huiYanOsConfig);
        huiYanSdkConfigCreateHuiYanConfig.setWaitingUserCompare(z);
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        Context contextM82240a = huiYanBaseApi.m82240a();
        HuiYanOperateBody huiYanOperateBody2 = c13907a.f57469a;
        if (huiYanOperateBody2 != null) {
            huiYanOperateBody2.setNetWorkType(C13929d.m82400a(contextM82240a));
        }
        String str = this.currentToken;
        HuiYanOperateBody huiYanOperateBody3 = c13907a.f57469a;
        if (huiYanOperateBody3 != null) {
            huiYanOperateBody3.setToken(str);
        }
        InterfaceC13872b interfaceC13872b = new InterfaceC13872b() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.1
            @Override // com.tencent.could.huiyansdk.api.InterfaceC13872b
            public void onBuriedPointCallBack(String str2, String str3, String str4) {
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13872b
            public void onOperateTimeEvent(String str2, int i, boolean z2, String str3) {
                C13907a.b.f57473a.m82369a(str2, i, z2, str3);
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13872b
            public void onPrepare(InterfaceC13874d interfaceC13874d) {
                C13905e.a.f57445a.m82337a(2, HuiYanOsApiImp.TAG, "onPrepare!");
            }

            public void onStreamRiskDataSuccess(String str2) {
                C13905e.a.f57445a.m82337a(2, HuiYanOsApiImp.TAG, "onStreamRiskDataSuccess!");
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13872b
            public void onTuringFaceDataSuccess(String str2) {
                C13905e.a.f57445a.m82337a(2, HuiYanOsApiImp.TAG, "onTuringFaceDataSuccess!");
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13872b
            public void updateOperateInfo(String str2, int i, long j, String str3) {
                C13907a.b.f57473a.m82368a(str2, i, j, str3);
            }
        };
        C13880j c13880j = C13880j.a.f57352a;
        c13880j.f57348g = interfaceC13872b;
        InterfaceC13876f interfaceC13876f = new InterfaceC13876f() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.2
            @Override // com.tencent.could.huiyansdk.api.InterfaceC13876f
            public void onCompareSuccess(String str2, String str3) throws Throwable {
                HuiYanOperateBody huiYanOperateBody4 = C13907a.b.f57473a.f57469a;
                if (huiYanOperateBody4 != null) {
                    huiYanOperateBody4.updateInfo("LocalCheck", 1, 1L, System.currentTimeMillis());
                }
                HuiYanResultSender.getInstance().sendResultSuccess(str2, str3);
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13876f
            public void onFail(int i, String str2) {
                C13907a.b.f57473a.m82368a("LocalCheck", 1, 0L, "code: " + i + " msg: " + str2);
                HuiYanResultSender.getInstance().sendFailBackCall(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13876f
            public void onSelectSuccess(String str2) {
                C13905e.a.f57445a.m82337a(2, HuiYanOsApiImp.TAG, "on select success!");
                HuiYanOsApiImp.this.getLiveTypeRequest(str2);
            }
        };
        c13880j.f57343b = huiYanSdkConfigCreateHuiYanConfig;
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "HuiYanSdkImp", "sdkConfig getAuthTimeOutMs:" + c13880j.f57343b.getAuthTimeOutMs() + " longCheckTimeOutMs:" + c13880j.f57343b.getLongCheckTimeOutMs() + " prepareFaceTimeOutMs:" + c13880j.f57343b.getPrepareFaceTimeOutMs());
        boolean z2 = false;
        c13880j.f57345d = false;
        c13880j.f57351j = HuiYanAuthTipsEvent.NONE;
        c13880j.f57347f = interfaceC13876f;
        c13880j.f57346e = false;
        if (huiYanBaseApi.m82240a() == null) {
            c13880j.m82231a(233, "context is illegal!");
            return;
        }
        huiYanBaseApi.f57354b = new C13879i(c13880j);
        C13930e.a.f57508a.f57506a = c13880j.f57343b.isOpenLog();
        HuiYanBaseConfig huiYanBaseConfig = new HuiYanBaseConfig();
        huiYanBaseConfig.setLicense(c13880j.f57343b.getAuthLicense());
        huiYanBaseConfig.setLicenseStr(c13880j.f57343b.getAuthLicenseStr());
        huiYanBaseConfig.setModelPath(c13880j.f57343b.getUseCustomerModelPath());
        huiYanBaseConfig.setOpenCheckRiskMode(c13880j.f57343b.isOpenCheckRiskMode());
        huiYanBaseConfig.setHuiYanLiveMode(c13880j.f57343b.getHuiYanLiveMode());
        if (!c13880j.f57343b.isOpenCheckRiskMode()) {
            C13924f c13924f = C13924f.a.f57496a;
            huiYanBaseApi.m82240a();
            if (c13924f.f57488g == null || !c13924f.f57491j) {
                c13905e.m82337a(2, "TuringSdkHelper", "init turing module with auth not get instance");
            } else {
                c13924f.f57484c = false;
                ((EmptyTuringHelper) c13924f.f57488g).getClass();
            }
        }
        InterfaceC13872b interfaceC13872b2 = c13880j.f57348g;
        if (interfaceC13872b2 != null) {
            interfaceC13872b2.onOperateTimeEvent("StartYTAuthUseTime", 1, false, "");
        }
        huiYanBaseApi.f57355c = huiYanBaseConfig;
        String license = huiYanBaseConfig.getLicense();
        String licenseStr = huiYanBaseConfig.getLicenseStr();
        try {
            if (TextUtils.isEmpty(license)) {
                iM82312a = !TextUtils.isEmpty(licenseStr) ? C13900b.a.f57405a.m82312a(licenseStr, true) : C13900b.a.f57405a.m82312a("", false);
            } else {
                iM82312a = C13900b.a.f57405a.m82312a(license, false);
            }
        } catch (C13890a e) {
            C13905e.a.f57445a.m82337a(2, "HuiYanBaseApi", "init error:" + e.f57366b);
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f57354b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.onFail(e.f57365a, e.f57366b);
            }
            iM82312a = -1;
        }
        if (iM82312a != 0) {
            String str2 = "error code: " + iM82312a;
            InterfaceC13872b interfaceC13872b3 = c13880j.f57348g;
            if (interfaceC13872b3 != null) {
                interfaceC13872b3.onBuriedPointCallBack("InitSDKStage", "YouTuInitError", str2);
                return;
            }
            return;
        }
        InterfaceC13872b interfaceC13872b4 = c13880j.f57348g;
        if (interfaceC13872b4 != null) {
            interfaceC13872b4.onBuriedPointCallBack("InitSDKStage", "YouTuInitSuccess", "");
        }
        Context contextM82240a2 = HuiYanBaseApi.C13881a.f57357a.m82240a();
        if (contextM82240a2 == null) {
            c13880j.m82231a(216, "please call init() function first!");
            return;
        }
        HuiYanSdkConfig huiYanSdkConfig = c13880j.f57343b;
        if (huiYanSdkConfig == null || (startActivityContext = huiYanSdkConfig.getStartActivityContext()) == null || !(startActivityContext instanceof Activity)) {
            z2 = true;
        } else {
            contextM82240a2 = startActivityContext;
        }
        Intent intent = c13880j.f57343b.isLandMode() ? new Intent(contextM82240a2, (Class<?>) LandMainAuthActivity.class) : new Intent(contextM82240a2, (Class<?>) MainAuthActivity.class);
        C13905e.a.f57445a.m82337a(1, "HuiYanSdkImp", "useAppContext: " + z2);
        if (z2) {
            intent.addFlags(268435456);
        }
        contextM82240a2.startActivity(intent);
        InterfaceC13872b interfaceC13872b5 = c13880j.f57348g;
        if (interfaceC13872b5 != null) {
            interfaceC13872b5.onBuriedPointCallBack("InitSDKStage", "HuiYanInitSuccess", "");
        }
    }

    private void sendLiveData(String str) {
        LiveTypeResult liveTypeResultCheckLiveData = checkLiveData(str);
        if (liveTypeResultCheckLiveData == null) {
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(220);
            compareResult.setErrorMsg("check liveData string error!");
            C13875e.m82221a(compareResult);
            return;
        }
        try {
            C13875e.m82222a(createLiveResultString(liveTypeResultCheckLiveData));
        } catch (JSONException unused) {
            C13905e.a.f57445a.m82337a(2, TAG, "create lightData json error!");
            CompareResult compareResult2 = new CompareResult();
            compareResult2.setErrorCode(220);
            compareResult2.setErrorMsg("check liveData string error!");
            C13875e.m82221a(compareResult2);
        }
    }

    public String getCurrentToken() {
        return this.currentToken;
    }

    public HuiYanOsConfig getOsConfig() {
        return this.osConfig;
    }

    public void init(Context context) {
        String string;
        C13880j c13880j = C13880j.a.f57352a;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        huiYanBaseApi.getClass();
        if (context != null) {
            huiYanBaseApi.f57353a = new WeakReference<>(context.getApplicationContext());
            Context contextM82240a = huiYanBaseApi.m82240a();
            huiYanBaseApi.f57356d = contextM82240a == null ? false : C13931f.m82403a(contextM82240a, C13931f.f57510b);
            C13930e c13930e = C13930e.a.f57508a;
            if (!c13930e.f57507b) {
                c13930e.f57507b = true;
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(externalFilesDir);
                    String str = File.separator;
                    sb.append(str);
                    sb.append("cloud-huiyan");
                    sb.append(str);
                    sb.append("log");
                    string = sb.toString();
                } else {
                    string = "";
                }
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(context.getFilesDir());
                    String str2 = File.separator;
                    sb2.append(str2);
                    sb2.append("cloud-huiyan");
                    sb2.append(str2);
                    sb2.append("log");
                    string = sb2.toString();
                }
                AiLog.init(new AiLogger(context, new AiLogConfig.AiLogConfigBuilder().setDirLog(string).setLogCat(true).setLogName("huiyan-log").setMinLevel(3).setDefaultTag("[hy-sdk-log]").setOpen(true).setFileOutTime(259200000L).create()));
            }
            C13905e.a.f57445a.m82337a(1, "HuiYanBaseApi", "call huiyan init");
            C13887a.a.f57364a.f57360c = "v1.0.8.16";
            System.loadLibrary("YTLiveness");
        }
        C13924f c13924f = C13924f.a.f57496a;
        try {
            c13924f.f57487f = new TuringResultCacheEntity();
            c13924f.m82384c();
            c13924f.f57483b = false;
            if (((EmptyTuringHelper) c13924f.f57488g) == null) {
                throw null;
            }
            C13905e.a.f57445a.m82337a(1, "TuringSdkHelper", "call turing interface init finish");
            CloudCrashHandler.instance().init(context, "huiyan", true, "com.tencent.could", false);
            CloudCrashHandler.instance().addCrashListener(new C13878h(c13880j));
            C13887a.a.f57364a.f57360c = "v1.0.9.36";
            C13907a c13907a = C13907a.b.f57473a;
            c13907a.getClass();
            HuiYanOperateBody huiYanOperateBody = new HuiYanOperateBody();
            c13907a.f57469a = huiYanOperateBody;
            huiYanOperateBody.setDeviceModel(DeviceInfoUtil.getDeviceModel());
            c13907a.f57469a.setOsVersion("android-" + Build.VERSION.SDK_INT);
            c13907a.f57469a.setSdkName("HuiYanSDK_Overseas");
            c13907a.f57469a.setSdkVersion("v1.0.9.36");
            HuiYanOperateBody huiYanOperateBody2 = c13907a.f57469a;
            HuiYanBaseApi.C13881a.f57357a.getClass();
            C13900b.a.f57405a.getClass();
            huiYanOperateBody2.setYouTuVersion(YtSDKKitFramework.getInstance().version());
            c13907a.f57469a.setTuringVersion(C13924f.a.f57496a.m82382a());
            c13907a.f57469a.setDeviceToken(DeviceInfoUtil.getDeviceUuid(context));
            c13907a.f57469a.setPackageName(context.getPackageName());
            String packageName = context.getPackageName();
            c13907a.f57469a.setPackageName(packageName);
            try {
                c13907a.f57469a.setPackageVersion(context.getPackageManager().getPackageInfo(packageName, 0).versionName);
            } catch (PackageManager.NameNotFoundException e) {
                C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "get package info error: " + e.getLocalizedMessage());
            }
            c13907a.m82366a();
        } catch (ClassNotFoundException e2) {
            e = e2;
            C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            c13924f.f57488g = null;
            c13924f.f57491j = false;
            c13924f.f57484c = false;
        } catch (IllegalAccessException e3) {
            e = e3;
            C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            c13924f.f57488g = null;
            c13924f.f57491j = false;
            c13924f.f57484c = false;
        } catch (InstantiationException e4) {
            e = e4;
            C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            c13924f.f57488g = null;
            c13924f.f57491j = false;
            c13924f.f57484c = false;
        }
    }

    public boolean isNeedCleanListener() {
        return this.isNeedCleanListener;
    }

    public void release() {
        C13880j c13880j = C13880j.a.f57352a;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        if (huiYanBaseApi.f57354b != null) {
            huiYanBaseApi.f57354b = null;
        }
        C13930e.a.f57508a.f57507b = false;
        AiLog.release();
        C13905e c13905e = C13905e.a.f57445a;
        synchronized (c13905e.f57442b) {
            try {
                Log.e("LoggerManager", "release");
                c13905e.f57443c = null;
                C13887a.a.f57364a.f57363f = false;
                Map<String, Integer> map = c13905e.f57441a;
                if (map != null) {
                    map.clear();
                }
                if (c13905e.f57444d != null) {
                    c13905e.f57444d.removeCallbacksAndMessages(null);
                    c13905e.f57444d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C13924f c13924f = C13924f.a.f57496a;
        c13905e.m82337a(1, "TuringSdkHelper", "call release.");
        c13924f.f57491j = false;
        if (c13924f.f57488g != null) {
            ((EmptyTuringHelper) c13924f.f57488g).getClass();
            c13924f.f57488g = null;
        }
        if (c13880j.f57347f != null) {
            c13880j.f57347f = null;
        }
        if (c13880j.f57342a != null) {
            c13880j.f57342a = null;
        }
        c13880j.f57346e = false;
        C13939n c13939nM82412a = C13939n.m82412a();
        if (c13939nM82412a.f57529b == null) {
            return;
        }
        c13939nM82412a.f57529b.removeCallbacksAndMessages(null);
        c13939nM82412a.f57529b = null;
        HandlerThread handlerThread = c13939nM82412a.f57528a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        c13939nM82412a.f57528a.quitSafely();
    }

    public void setAuthEventCallBack(HuiYanAuthEventCallBack huiYanAuthEventCallBack) {
        if (huiYanAuthEventCallBack == null) {
            C13905e.a.f57445a.m82337a(2, TAG, "error set HuiYanAuthEventCallBack is null!");
        } else {
            this.huiYanAuthEventCallBack = huiYanAuthEventCallBack;
            C13880j.a.f57352a.f57342a = new InterfaceC13877g() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.5
                @Override // com.tencent.could.huiyansdk.api.InterfaceC13877g
                public void onAuthEvent(HuiYanAuthEvent huiYanAuthEvent) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onAuthEvent(huiYanAuthEvent);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC13877g
                public void onAuthTipsEvent(HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onAuthTipsEvent(huiYanAuthTipsEvent);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC13877g
                public void onBeginTransition() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onBeginTransition();
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC13877g
                public void onEndTransition() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onEndTransition();
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC13877g
                public void onMainViewCreate(View view) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onMainViewCreate(view);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC13877g
                public void onMainViewDestroy() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onMainViewDestroy();
                    }
                }
            };
        }
    }

    public void setCurrentToken(String str) {
        this.currentToken = str;
    }

    public void setResultDataCallBack(HuiYanResultDataCallBack huiYanResultDataCallBack) {
        HuiYanResultSender.getInstance().setResultDataCallBack(huiYanResultDataCallBack);
    }

    public void startAuthByLightData(String str, HuiYanResultCallBack huiYanResultCallBack) {
        if (C13880j.a.f57352a.f57346e) {
            C13905e.a.f57445a.m82337a(2, TAG, "current process is stopped！");
            return;
        }
        HuiYanResultSender.getInstance().setResultCallBack(huiYanResultCallBack);
        if (str != null) {
            sendLiveData(CommonUtils.base64DecodeToString(str));
            return;
        }
        C13905e.a.f57445a.m82337a(2, TAG, "lightData == null");
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(219);
        compareResult.setErrorMsg("app stop auth!");
        C13875e.m82221a(compareResult);
    }

    public void startGetAuthConfigData(HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        realStartGetAuthConfigData(false, huiYanOsConfig, huiYanConfigCallback);
    }

    public void startHuiYanAuth(String str, HuiYanOsConfig huiYanOsConfig, HuiYanOsAuthCallBack huiYanOsAuthCallBack) {
        this.currentToken = str;
        C13905e.a.f57445a.m82337a(1, TAG, "startHuiYanAuth with: " + this.currentToken);
        HuiYanResultSender.getInstance().setAuthCallBack(huiYanOsAuthCallBack);
        C13880j.a.f57352a.f57349h = new InterfaceC13873c() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.3
            @Override // com.tencent.could.huiyansdk.api.InterfaceC13873c
            public String getCurrentToken() {
                return HuiYanOsApiImp.this.currentToken;
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC13873c
            public AnimationDrawable getWaitingAnimation() {
                return C13929d.m82398a(HuiYanBaseApi.C13881a.f57357a.m82240a().getResources());
            }
        };
        realStartGetAuthConfigData(true, huiYanOsConfig, new HuiYanConfigCallback() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.4
            @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
            public void onFail(int i, String str2) {
                HuiYanResultSender.getInstance().sendAuthOnFail(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
            public void onSuccess(String str2) {
                HuiYanResultSender.getInstance().sendAuthGetLive(str2);
            }
        });
        this.isNeedCleanListener = false;
    }
}
