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
import com.tencent.cloud.overseas.C13963R;
import com.tencent.could.component.common.p084ai.eventreport.utils.DeviceInfoUtil;
import com.tencent.could.component.common.p084ai.log.AiLog;
import com.tencent.could.component.common.p084ai.log.AiLogConfig;
import com.tencent.could.component.common.p084ai.log.AiLogger;
import com.tencent.could.component.common.p084ai.utils.CloudCrashHandler;
import com.tencent.could.huiyansdk.activitys.LandMainAuthActivity;
import com.tencent.could.huiyansdk.activitys.MainAuthActivity;
import com.tencent.could.huiyansdk.api.C14038e;
import com.tencent.could.huiyansdk.api.C14041h;
import com.tencent.could.huiyansdk.api.C14042i;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.api.InterfaceC14036c;
import com.tencent.could.huiyansdk.api.InterfaceC14037d;
import com.tencent.could.huiyansdk.api.InterfaceC14039f;
import com.tencent.could.huiyansdk.api.InterfaceC14040g;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C14050a;
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
import com.tencent.could.huiyansdk.exception.C14053a;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14064a;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.operate.C14070a;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.turing.C14087f;
import com.tencent.could.huiyansdk.turing.EmptyTuringHelper;
import com.tencent.could.huiyansdk.utils.C14092d;
import com.tencent.could.huiyansdk.utils.C14093e;
import com.tencent.could.huiyansdk.utils.C14094f;
import com.tencent.could.huiyansdk.utils.C14102n;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanOsApiImp {
    public static final String PRE_PAGE_ClASS_NAME = "com.tencent.could.huiyansdk.overseas.fragment.GuideFragment";
    public static final String TAG = "HuiYanOsApiImp";
    public HuiYanAuthEventCallBack huiYanAuthEventCallBack;
    public HuiYanOsConfig osConfig;
    public String currentToken = "";
    public boolean isNeedCleanListener = true;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp$6 */
    public static /* synthetic */ class C140766 {
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
            C14068e.a.f58293a.m83520a(2, TAG, "");
            return null;
        }
    }

    private HuiYanSdkConfig createHuiYanConfig(HuiYanOsConfig huiYanOsConfig) {
        C14068e.a.f58293a.m83520a(1, TAG, "create HuiYanSdkConfig by startConfig:" + huiYanOsConfig);
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
        huiYanSdkConfig.setPolicyDialogResId(C13963R.string.txy_huiyan_pro_confirm_tips);
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
            C14064a.a.f58257a.f58254a = PRE_PAGE_ClASS_NAME;
        } else {
            C14064a.a.f58257a.f58254a = "";
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
            C14068e.a.f58293a.m83520a(2, TAG, "do request content error!");
        }
    }

    private void realStartGetAuthConfigData(boolean z, HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        int iM83495a;
        Context startActivityContext;
        HuiYanResultSender.getInstance().setConfigCallback(huiYanConfigCallback);
        C14070a c14070a = C14070a.b.f58321a;
        Map<String, Long> map = c14070a.f58318b;
        if (map != null) {
            map.clear();
        }
        HuiYanOperateBody huiYanOperateBody = c14070a.f58317a;
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
            C14043j.a.f58200a.f58192c = huiYanOsConfig.getAuthUiConfig();
        }
        this.osConfig = huiYanOsConfig;
        HuiYanSdkConfig huiYanSdkConfigCreateHuiYanConfig = createHuiYanConfig(huiYanOsConfig);
        huiYanSdkConfigCreateHuiYanConfig.setWaitingUserCompare(z);
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        Context contextM83423a = huiYanBaseApi.m83423a();
        HuiYanOperateBody huiYanOperateBody2 = c14070a.f58317a;
        if (huiYanOperateBody2 != null) {
            huiYanOperateBody2.setNetWorkType(C14092d.m83583a(contextM83423a));
        }
        String str = this.currentToken;
        HuiYanOperateBody huiYanOperateBody3 = c14070a.f58317a;
        if (huiYanOperateBody3 != null) {
            huiYanOperateBody3.setToken(str);
        }
        InterfaceC14035b interfaceC14035b = new InterfaceC14035b() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.1
            @Override // com.tencent.could.huiyansdk.api.InterfaceC14035b
            public void onBuriedPointCallBack(String str2, String str3, String str4) {
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14035b
            public void onOperateTimeEvent(String str2, int i, boolean z2, String str3) {
                C14070a.b.f58321a.m83552a(str2, i, z2, str3);
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14035b
            public void onPrepare(InterfaceC14037d interfaceC14037d) {
                C14068e.a.f58293a.m83520a(2, HuiYanOsApiImp.TAG, "onPrepare!");
            }

            public void onStreamRiskDataSuccess(String str2) {
                C14068e.a.f58293a.m83520a(2, HuiYanOsApiImp.TAG, "onStreamRiskDataSuccess!");
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14035b
            public void onTuringFaceDataSuccess(String str2) {
                C14068e.a.f58293a.m83520a(2, HuiYanOsApiImp.TAG, "onTuringFaceDataSuccess!");
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14035b
            public void updateOperateInfo(String str2, int i, long j, String str3) {
                C14070a.b.f58321a.m83551a(str2, i, j, str3);
            }
        };
        C14043j c14043j = C14043j.a.f58200a;
        c14043j.f58196g = interfaceC14035b;
        InterfaceC14039f interfaceC14039f = new InterfaceC14039f() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.2
            @Override // com.tencent.could.huiyansdk.api.InterfaceC14039f
            public void onCompareSuccess(String str2, String str3) throws Throwable {
                HuiYanOperateBody huiYanOperateBody4 = C14070a.b.f58321a.f58317a;
                if (huiYanOperateBody4 != null) {
                    huiYanOperateBody4.updateInfo("LocalCheck", 1, 1L, System.currentTimeMillis());
                }
                HuiYanResultSender.getInstance().sendResultSuccess(str2, str3);
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14039f
            public void onFail(int i, String str2) {
                C14070a.b.f58321a.m83551a("LocalCheck", 1, 0L, "code: " + i + " msg: " + str2);
                HuiYanResultSender.getInstance().sendFailBackCall(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14039f
            public void onSelectSuccess(String str2) {
                C14068e.a.f58293a.m83520a(2, HuiYanOsApiImp.TAG, "on select success!");
                HuiYanOsApiImp.this.getLiveTypeRequest(str2);
            }
        };
        c14043j.f58191b = huiYanSdkConfigCreateHuiYanConfig;
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "HuiYanSdkImp", "sdkConfig getAuthTimeOutMs:" + c14043j.f58191b.getAuthTimeOutMs() + " longCheckTimeOutMs:" + c14043j.f58191b.getLongCheckTimeOutMs() + " prepareFaceTimeOutMs:" + c14043j.f58191b.getPrepareFaceTimeOutMs());
        boolean z2 = false;
        c14043j.f58193d = false;
        c14043j.f58199j = HuiYanAuthTipsEvent.NONE;
        c14043j.f58195f = interfaceC14039f;
        c14043j.f58194e = false;
        if (huiYanBaseApi.m83423a() == null) {
            c14043j.m83414a(233, "context is illegal!");
            return;
        }
        huiYanBaseApi.f58202b = new C14042i(c14043j);
        C14093e.a.f58356a.f58354a = c14043j.f58191b.isOpenLog();
        HuiYanBaseConfig huiYanBaseConfig = new HuiYanBaseConfig();
        huiYanBaseConfig.setLicense(c14043j.f58191b.getAuthLicense());
        huiYanBaseConfig.setLicenseStr(c14043j.f58191b.getAuthLicenseStr());
        huiYanBaseConfig.setModelPath(c14043j.f58191b.getUseCustomerModelPath());
        huiYanBaseConfig.setOpenCheckRiskMode(c14043j.f58191b.isOpenCheckRiskMode());
        huiYanBaseConfig.setHuiYanLiveMode(c14043j.f58191b.getHuiYanLiveMode());
        if (!c14043j.f58191b.isOpenCheckRiskMode()) {
            C14087f c14087f = C14087f.a.f58344a;
            huiYanBaseApi.m83423a();
            if (c14087f.f58336g == null || !c14087f.f58339j) {
                c14068e.m83520a(2, "TuringSdkHelper", "init turing module with auth not get instance");
            } else {
                c14087f.f58332c = false;
                ((EmptyTuringHelper) c14087f.f58336g).getClass();
            }
        }
        InterfaceC14035b interfaceC14035b2 = c14043j.f58196g;
        if (interfaceC14035b2 != null) {
            interfaceC14035b2.onOperateTimeEvent("StartYTAuthUseTime", 1, false, "");
        }
        huiYanBaseApi.f58203c = huiYanBaseConfig;
        String license = huiYanBaseConfig.getLicense();
        String licenseStr = huiYanBaseConfig.getLicenseStr();
        try {
            if (TextUtils.isEmpty(license)) {
                iM83495a = !TextUtils.isEmpty(licenseStr) ? C14063b.a.f58253a.m83495a(licenseStr, true) : C14063b.a.f58253a.m83495a("", false);
            } else {
                iM83495a = C14063b.a.f58253a.m83495a(license, false);
            }
        } catch (C14053a e) {
            C14068e.a.f58293a.m83520a(2, "HuiYanBaseApi", "init error:" + e.f58214b);
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f58202b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.onFail(e.f58213a, e.f58214b);
            }
            iM83495a = -1;
        }
        if (iM83495a != 0) {
            String str2 = "error code: " + iM83495a;
            InterfaceC14035b interfaceC14035b3 = c14043j.f58196g;
            if (interfaceC14035b3 != null) {
                interfaceC14035b3.onBuriedPointCallBack("InitSDKStage", "YouTuInitError", str2);
                return;
            }
            return;
        }
        InterfaceC14035b interfaceC14035b4 = c14043j.f58196g;
        if (interfaceC14035b4 != null) {
            interfaceC14035b4.onBuriedPointCallBack("InitSDKStage", "YouTuInitSuccess", "");
        }
        Context contextM83423a2 = HuiYanBaseApi.C14044a.f58205a.m83423a();
        if (contextM83423a2 == null) {
            c14043j.m83414a(216, "please call init() function first!");
            return;
        }
        HuiYanSdkConfig huiYanSdkConfig = c14043j.f58191b;
        if (huiYanSdkConfig == null || (startActivityContext = huiYanSdkConfig.getStartActivityContext()) == null || !(startActivityContext instanceof Activity)) {
            z2 = true;
        } else {
            contextM83423a2 = startActivityContext;
        }
        Intent intent = c14043j.f58191b.isLandMode() ? new Intent(contextM83423a2, (Class<?>) LandMainAuthActivity.class) : new Intent(contextM83423a2, (Class<?>) MainAuthActivity.class);
        C14068e.a.f58293a.m83520a(1, "HuiYanSdkImp", "useAppContext: " + z2);
        if (z2) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        contextM83423a2.startActivity(intent);
        InterfaceC14035b interfaceC14035b5 = c14043j.f58196g;
        if (interfaceC14035b5 != null) {
            interfaceC14035b5.onBuriedPointCallBack("InitSDKStage", "HuiYanInitSuccess", "");
        }
    }

    private void sendLiveData(String str) {
        LiveTypeResult liveTypeResultCheckLiveData = checkLiveData(str);
        if (liveTypeResultCheckLiveData == null) {
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(220);
            compareResult.setErrorMsg("check liveData string error!");
            C14038e.m83404a(compareResult);
            return;
        }
        try {
            C14038e.m83405a(createLiveResultString(liveTypeResultCheckLiveData));
        } catch (JSONException unused) {
            C14068e.a.f58293a.m83520a(2, TAG, "create lightData json error!");
            CompareResult compareResult2 = new CompareResult();
            compareResult2.setErrorCode(220);
            compareResult2.setErrorMsg("check liveData string error!");
            C14038e.m83404a(compareResult2);
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
        C14043j c14043j = C14043j.a.f58200a;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        huiYanBaseApi.getClass();
        if (context != null) {
            huiYanBaseApi.f58201a = new WeakReference<>(context.getApplicationContext());
            Context contextM83423a = huiYanBaseApi.m83423a();
            huiYanBaseApi.f58204d = contextM83423a == null ? false : C14094f.m83586a(contextM83423a, C14094f.f58358b);
            C14093e c14093e = C14093e.a.f58356a;
            if (!c14093e.f58355b) {
                c14093e.f58355b = true;
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
            C14068e.a.f58293a.m83520a(1, "HuiYanBaseApi", "call huiyan init");
            C14050a.a.f58212a.f58208c = "v1.0.8.16";
            System.loadLibrary("YTLiveness");
        }
        C14087f c14087f = C14087f.a.f58344a;
        try {
            c14087f.f58335f = new TuringResultCacheEntity();
            c14087f.m83567c();
            c14087f.f58331b = false;
            if (((EmptyTuringHelper) c14087f.f58336g) == null) {
                throw null;
            }
            C14068e.a.f58293a.m83520a(1, "TuringSdkHelper", "call turing interface init finish");
            CloudCrashHandler.instance().init(context, "huiyan", true, "com.tencent.could", false);
            CloudCrashHandler.instance().addCrashListener(new C14041h(c14043j));
            C14050a.a.f58212a.f58208c = "v1.0.9.36";
            C14070a c14070a = C14070a.b.f58321a;
            c14070a.getClass();
            HuiYanOperateBody huiYanOperateBody = new HuiYanOperateBody();
            c14070a.f58317a = huiYanOperateBody;
            huiYanOperateBody.setDeviceModel(DeviceInfoUtil.getDeviceModel());
            c14070a.f58317a.setOsVersion("android-" + Build.VERSION.SDK_INT);
            c14070a.f58317a.setSdkName("HuiYanSDK_Overseas");
            c14070a.f58317a.setSdkVersion("v1.0.9.36");
            HuiYanOperateBody huiYanOperateBody2 = c14070a.f58317a;
            HuiYanBaseApi.C14044a.f58205a.getClass();
            C14063b.a.f58253a.getClass();
            huiYanOperateBody2.setYouTuVersion(YtSDKKitFramework.getInstance().version());
            c14070a.f58317a.setTuringVersion(C14087f.a.f58344a.m83565a());
            c14070a.f58317a.setDeviceToken(DeviceInfoUtil.getDeviceUuid(context));
            c14070a.f58317a.setPackageName(context.getPackageName());
            String packageName = context.getPackageName();
            c14070a.f58317a.setPackageName(packageName);
            try {
                c14070a.f58317a.setPackageVersion(context.getPackageManager().getPackageInfo(packageName, 0).versionName);
            } catch (PackageManager.NameNotFoundException e) {
                C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "get package info error: " + e.getLocalizedMessage());
            }
            c14070a.m83549a();
        } catch (ClassNotFoundException e2) {
            e = e2;
            C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            c14087f.f58336g = null;
            c14087f.f58339j = false;
            c14087f.f58332c = false;
        } catch (IllegalAccessException e3) {
            e = e3;
            C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            c14087f.f58336g = null;
            c14087f.f58339j = false;
            c14087f.f58332c = false;
        } catch (InstantiationException e4) {
            e = e4;
            C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            c14087f.f58336g = null;
            c14087f.f58339j = false;
            c14087f.f58332c = false;
        }
    }

    public boolean isNeedCleanListener() {
        return this.isNeedCleanListener;
    }

    public void release() {
        C14043j c14043j = C14043j.a.f58200a;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        if (huiYanBaseApi.f58202b != null) {
            huiYanBaseApi.f58202b = null;
        }
        C14093e.a.f58356a.f58355b = false;
        AiLog.release();
        C14068e c14068e = C14068e.a.f58293a;
        synchronized (c14068e.f58290b) {
            try {
                Log.e("LoggerManager", "release");
                c14068e.f58291c = null;
                C14050a.a.f58212a.f58211f = false;
                Map<String, Integer> map = c14068e.f58289a;
                if (map != null) {
                    map.clear();
                }
                if (c14068e.f58292d != null) {
                    c14068e.f58292d.removeCallbacksAndMessages(null);
                    c14068e.f58292d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C14087f c14087f = C14087f.a.f58344a;
        c14068e.m83520a(1, "TuringSdkHelper", "call release.");
        c14087f.f58339j = false;
        if (c14087f.f58336g != null) {
            ((EmptyTuringHelper) c14087f.f58336g).getClass();
            c14087f.f58336g = null;
        }
        if (c14043j.f58195f != null) {
            c14043j.f58195f = null;
        }
        if (c14043j.f58190a != null) {
            c14043j.f58190a = null;
        }
        c14043j.f58194e = false;
        C14102n c14102nM83595a = C14102n.m83595a();
        if (c14102nM83595a.f58377b == null) {
            return;
        }
        c14102nM83595a.f58377b.removeCallbacksAndMessages(null);
        c14102nM83595a.f58377b = null;
        HandlerThread handlerThread = c14102nM83595a.f58376a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        c14102nM83595a.f58376a.quitSafely();
    }

    public void setAuthEventCallBack(HuiYanAuthEventCallBack huiYanAuthEventCallBack) {
        if (huiYanAuthEventCallBack == null) {
            C14068e.a.f58293a.m83520a(2, TAG, "error set HuiYanAuthEventCallBack is null!");
        } else {
            this.huiYanAuthEventCallBack = huiYanAuthEventCallBack;
            C14043j.a.f58200a.f58190a = new InterfaceC14040g() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.5
                @Override // com.tencent.could.huiyansdk.api.InterfaceC14040g
                public void onAuthEvent(HuiYanAuthEvent huiYanAuthEvent) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onAuthEvent(huiYanAuthEvent);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC14040g
                public void onAuthTipsEvent(HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onAuthTipsEvent(huiYanAuthTipsEvent);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC14040g
                public void onBeginTransition() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onBeginTransition();
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC14040g
                public void onEndTransition() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onEndTransition();
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC14040g
                public void onMainViewCreate(View view) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onMainViewCreate(view);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.InterfaceC14040g
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
        if (C14043j.a.f58200a.f58194e) {
            C14068e.a.f58293a.m83520a(2, TAG, "current process is stopped！");
            return;
        }
        HuiYanResultSender.getInstance().setResultCallBack(huiYanResultCallBack);
        if (str != null) {
            sendLiveData(CommonUtils.base64DecodeToString(str));
            return;
        }
        C14068e.a.f58293a.m83520a(2, TAG, "lightData == null");
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(219);
        compareResult.setErrorMsg("app stop auth!");
        C14038e.m83404a(compareResult);
    }

    public void startGetAuthConfigData(HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        realStartGetAuthConfigData(false, huiYanOsConfig, huiYanConfigCallback);
    }

    public void startHuiYanAuth(String str, HuiYanOsConfig huiYanOsConfig, HuiYanOsAuthCallBack huiYanOsAuthCallBack) {
        this.currentToken = str;
        C14068e.a.f58293a.m83520a(1, TAG, "startHuiYanAuth with: " + this.currentToken);
        HuiYanResultSender.getInstance().setAuthCallBack(huiYanOsAuthCallBack);
        C14043j.a.f58200a.f58197h = new InterfaceC14036c() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.3
            @Override // com.tencent.could.huiyansdk.api.InterfaceC14036c
            public String getCurrentToken() {
                return HuiYanOsApiImp.this.currentToken;
            }

            @Override // com.tencent.could.huiyansdk.api.InterfaceC14036c
            public AnimationDrawable getWaitingAnimation() {
                return C14092d.m83581a(HuiYanBaseApi.C14044a.f58205a.m83423a().getResources());
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
