package com.idv.identity.platform.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.idv.identity.platform.SystemLoadingActivity;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.util.IdentityUtils;
import com.p046p1.mobile.putong.data.JSBridgeVersion;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Map;
import p149l.d300;
import p149l.ixq0;
import p149l.kb20;
import p149l.kcm;
import p149l.kpl;
import p149l.ksf0;
import p149l.lcm;
import p149l.ncm;
import p149l.rcm;
import p149l.s3g;
import p149l.wx00;
import p149l.z500;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityPlatform {
    public static final String CLOUD_AUTH_HK = "https://cloudauth-intl.cn-hongkong.aliyuncs.com";
    public static final String CLOUD_HOST = "cloudauth-intl.cn-hongkong.aliyuncs.com";
    private static final String FINAL_RESULT = "FINAL_RESULT";
    private static final String START_INIT = "START_INIT";
    private static boolean isBusy = false;
    private static IdentityPlatform s_instance = new IdentityPlatform();
    private Context ctx;
    private IdentityCallback identityCallback = null;
    private long verifyStartTime = System.currentTimeMillis();

    private IdentityPlatform() {
    }

    private void configPopNetWorkEnv(kb20 kb20Var) {
        kb20Var.f122187b = CLOUD_AUTH_HK;
        kb20Var.f122186a = CLOUD_HOST;
    }

    private IdentityResponse errCode2ClientResponse(String str) {
        IdentityResponse identityResponse = new IdentityResponse();
        if (str == null) {
            str = "";
        }
        identityResponse.message = str;
        if (ncm.f138188H.equalsIgnoreCase(str)) {
            identityResponse.code = 1007;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_TRANSACTION_ID_ERROR;
            return identityResponse;
        }
        if (ncm.f138189I.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CONTEXT_NULL;
            return identityResponse;
        }
        if (ncm.f138182B.equalsIgnoreCase(str)) {
            identityResponse.code = 1010;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NOT_INIT;
            return identityResponse;
        }
        if (ncm.f138185E.equalsIgnoreCase(str)) {
            identityResponse.code = 1017;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_PARAM_EXCEPTION;
            return identityResponse;
        }
        if (ncm.f138213w.equalsIgnoreCase(str)) {
            identityResponse.code = 1008;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_OCR_MODULE_NOT_EXIST;
            return identityResponse;
        }
        if (ncm.f138214x.equalsIgnoreCase(str)) {
            identityResponse.code = 1008;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_FACE_MODULE_NOT_EXIST;
            return identityResponse;
        }
        if (ncm.f138212v.equalsIgnoreCase(str)) {
            identityResponse.code = 1008;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_NFC_MODULE_NOT_EXIST;
            return identityResponse;
        }
        if (ncm.f138203m.equalsIgnoreCase(str)) {
            identityResponse.code = 1015;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_OS_VERSION_LOW;
            return identityResponse;
        }
        if (ncm.f138197g.equalsIgnoreCase(str)) {
            identityResponse.code = 1004;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_FRONT_CAMERA;
            return identityResponse;
        }
        if (ncm.f138198h.equalsIgnoreCase(str)) {
            identityResponse.code = 1004;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_BACK_CAMERA;
            return identityResponse;
        }
        if (ncm.f138199i.equalsIgnoreCase(str)) {
            identityResponse.code = 1004;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_OPEN_CAMERA_ERROR;
            return identityResponse;
        }
        if (ncm.f138201k.equalsIgnoreCase(str)) {
            identityResponse.code = 1016;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_CAMERA_PERMISSION;
            return identityResponse;
        }
        if (ncm.f138208r.equalsIgnoreCase(str)) {
            identityResponse.code = 1000;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_SUCCESS;
            return identityResponse;
        }
        if (ncm.f138209s.equalsIgnoreCase(str)) {
            identityResponse.code = 1001;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_FAIL;
            return identityResponse;
        }
        if (ncm.f138210t.equalsIgnoreCase(str)) {
            identityResponse.code = 1005;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NETWORK_VERIFY_ERROR;
            return identityResponse;
        }
        if (ncm.f138205o.equalsIgnoreCase(str)) {
            identityResponse.code = 1005;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NETWORK_INIT_ERROR;
            return identityResponse;
        }
        if (ncm.f138206p.equalsIgnoreCase(str)) {
            identityResponse.code = 1005;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NETWORK_VERIFY_ERROR;
            return identityResponse;
        }
        if (ncm.f138190J.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_RESPONSE_NULL;
            return identityResponse;
        }
        if ("INIT_RESPONSE_FORMAT_ERROR".equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_RESPONSE_FORMAT_ERROR;
            return identityResponse;
        }
        if ("INIT_CONTENT_FORMAT_ERROR".equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_RESPONSE_PARSING_FAILED;
            return identityResponse;
        }
        if (ncm.f138192b.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_OSS_ERROR;
            return identityResponse;
        }
        if ("INIT_RESPONSE_ERROR".equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_RESPONSE_ERROR;
            return identityResponse;
        }
        if ("INIT_CONTENT_DECRYPT_ERROR".equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_RESPONSE_CONTENT_DECRYPTION_FAILED;
            return identityResponse;
        }
        if (ncm.f138196f.equalsIgnoreCase(str)) {
            identityResponse.code = 1006;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_USER_BACK;
            return identityResponse;
        }
        if (ncm.f138187G.equalsIgnoreCase(str)) {
            identityResponse.code = 2000;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_NFC_PERMISSION;
            return identityResponse;
        }
        if (ncm.f138215y.equalsIgnoreCase(str)) {
            identityResponse.code = 2002;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CLIENT_NFC_UNSUPPORTED;
            return identityResponse;
        }
        if (ncm.f138216z.equalsIgnoreCase(str)) {
            identityResponse.code = 2000;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CLIENT_NFC_CONFIG_ERROR;
            return identityResponse;
        }
        if (ncm.f138202l.equalsIgnoreCase(str)) {
            identityResponse.code = 1014;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_OUT_TIME;
            return identityResponse;
        }
        if ("INIT_LOAD_MODEL_ERROR".equalsIgnoreCase(str)) {
            identityResponse.code = 1002;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_LOAD_MODEL_ERROR;
            return identityResponse;
        }
        if ("INIT_LOAD_SO_ERROR".equalsIgnoreCase(str)) {
            identityResponse.code = 1002;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_INIT_LOAD_SO_ERROR;
            return identityResponse;
        }
        if (ncm.f138184D.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_MISS_KEY_INFO;
            return identityResponse;
        }
        if (ncm.f138183C.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_MISS_KEY_INFO;
            return identityResponse;
        }
        if ("CODE_VERIFY_INTERRUPT".equalsIgnoreCase(str)) {
            identityResponse.code = 1002;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_HOME_EXIT;
        }
        return identityResponse;
    }

    private static String getApDidToken(Context context) {
        return "";
    }

    public static IdentityPlatform getInstance() {
        return s_instance;
    }

    public static String getMetaInfo(Context context) {
        IdentityMetaInfo identityMetaInfo = new IdentityMetaInfo();
        identityMetaInfo.setApdidToken(getApDidToken(context));
        identityMetaInfo.setAppName(context.getPackageName());
        identityMetaInfo.setAppVersion(d300.m109841e(context));
        identityMetaInfo.setDeviceModel(Build.MODEL);
        identityMetaInfo.setDeviceType("android");
        identityMetaInfo.setOsVersion(Build.VERSION.RELEASE);
        identityMetaInfo.setBioMetaInfo("5.1.0:11501568,4");
        identityMetaInfo.setIdentityVer(JSBridgeVersion.JSBRIDGE_API_VERSION);
        identityMetaInfo.setSdkVersion("1.3.5.intl");
        identityMetaInfo.setDeviceBrand(Build.BRAND);
        identityMetaInfo.setDeviceManufacturer(Build.MANUFACTURER);
        identityMetaInfo.setFgVersion(ksf0.m147068b());
        try {
            return JSON.toJSONString(identityMetaInfo);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static kb20 getNetworkEnv() {
        return kcm.m145452H().m145485K();
    }

    private void initCustomParams(Map<String, String> map) {
        int iIntValue;
        int iIntValue2;
        if (map == null || map.size() <= 0) {
            return;
        }
        rcm.f158788c = "";
        if (map.containsKey(IdentityParams.WaterMark)) {
            String str = map.get(IdentityParams.WaterMark);
            if (!TextUtils.isEmpty(str)) {
                rcm.f158788c = str;
            }
        }
        String str2 = IdentityParams.WaterMark.concat("=") + rcm.f158788c;
        if (map.containsKey(IdentityParams.MaxErrorTimes)) {
            String str3 = map.get(IdentityParams.MaxErrorTimes);
            if (!TextUtils.isEmpty(str3)) {
                int i = 10;
                try {
                    int iIntValue3 = Integer.valueOf(str3).intValue();
                    if (iIntValue3 <= 3) {
                        i = 3;
                    } else if (iIntValue3 < 10) {
                        i = iIntValue3;
                    }
                } catch (Exception unused) {
                }
                rcm.f158795j = i;
            }
        }
        String str4 = str2.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.MaxErrorTimes).concat("=") + rcm.f158795j;
        int i2 = 60;
        int i3 = 20;
        if (map.containsKey(IdentityParams.CardOcrTimeOutPeriod)) {
            String str5 = map.get(IdentityParams.CardOcrTimeOutPeriod);
            if (!TextUtils.isEmpty(str5)) {
                try {
                    iIntValue2 = Integer.valueOf(str5).intValue();
                    if (iIntValue2 <= 20) {
                        iIntValue2 = 20;
                    } else if (iIntValue2 >= 60) {
                        iIntValue2 = 60;
                    }
                } catch (Exception unused2) {
                }
                rcm.f158796k = iIntValue2;
            }
        }
        String str6 = str4.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.CardOcrTimeOutPeriod).concat("=") + rcm.f158796k;
        if (map.containsKey(IdentityParams.FaceVerifyTimeOutPeriod)) {
            String str7 = map.get(IdentityParams.FaceVerifyTimeOutPeriod);
            if (!TextUtils.isEmpty(str7)) {
                try {
                    int iIntValue4 = Integer.valueOf(str7).intValue();
                    if (iIntValue4 <= 20) {
                        i2 = 20;
                    } else if (iIntValue4 < 60) {
                        i2 = iIntValue4;
                    }
                    i3 = i2;
                } catch (Exception unused3) {
                }
                rcm.f158797l = i3;
            }
        }
        String str8 = str6.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.FaceVerifyTimeOutPeriod).concat("=") + rcm.f158797l;
        if (map.containsKey(IdentityParams.OcrResultTimeOutPeriod)) {
            String str9 = map.get(IdentityParams.OcrResultTimeOutPeriod);
            if (!TextUtils.isEmpty(str9)) {
                try {
                    iIntValue = Integer.valueOf(str9).intValue();
                } catch (Exception unused4) {
                    iIntValue = 0;
                }
                rcm.f158798m = iIntValue;
            }
        }
        String str10 = str8.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.OcrResultTimeOutPeriod).concat("=") + rcm.f158798m;
        if (map.containsKey(IdentityParams.IdCardVerifyMode) && "0".equalsIgnoreCase(map.get(IdentityParams.IdCardVerifyMode))) {
            rcm.f158787b = true;
        }
        String str11 = str10.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.IdCardVerifyMode).concat("=") + String.valueOf(rcm.f158787b);
        if (map.containsKey(IdentityParams.OcrResultButtonColor)) {
            String str12 = map.get(IdentityParams.OcrResultButtonColor);
            if (!TextUtils.isEmpty(str12)) {
                rcm.f158791f = str12;
            }
        }
        if (rcm.f158791f != null) {
            str11 = str11.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.OcrResultButtonColor).concat("=") + rcm.f158791f;
        }
        rcm.f158789d = true;
        if (map.containsKey(IdentityParams.ShowOcrResult) && "0".equalsIgnoreCase(map.get(IdentityParams.ShowOcrResult))) {
            rcm.f158789d = false;
        }
        String str13 = str11.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.ShowOcrResult).concat("=") + String.valueOf(rcm.f158789d);
        rcm.f158790e = true;
        if (map.containsKey(IdentityParams.EditOcrResult) && "0".equalsIgnoreCase(map.get(IdentityParams.EditOcrResult))) {
            rcm.f158790e = false;
        }
        String str14 = str13.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.EditOcrResult).concat("=") + String.valueOf(rcm.f158790e);
        if (map.containsKey(IdentityParams.ShowBlbumIcon) && "0".equalsIgnoreCase(map.get(IdentityParams.ShowBlbumIcon))) {
            rcm.f158792g = false;
        }
        String str15 = str14.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.ShowBlbumIcon).concat("=") + String.valueOf(rcm.f158792g);
        if (map.containsKey(IdentityParams.RoundProgressColor)) {
            String str16 = map.get(IdentityParams.RoundProgressColor);
            if (!TextUtils.isEmpty(str16)) {
                rcm.f158793h = str16;
            }
        }
        if (rcm.f158793h != null) {
            str15 = str15.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.RoundProgressColor).concat("=") + rcm.f158793h;
        }
        if (map.containsKey(IdentityParams.SdkLanguage)) {
            String str17 = map.get(IdentityParams.SdkLanguage);
            if (TextUtils.isEmpty(str17)) {
                rcm.f158800o = "";
            } else {
                rcm.f158800o = str17;
            }
        }
        String str18 = str15.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.SdkLanguage).concat("=") + rcm.f158800o;
        if (map.containsKey(IdentityParams.CloseButtonLayout)) {
            String str19 = map.get(IdentityParams.CloseButtonLayout);
            if (!TextUtils.isEmpty(str19)) {
                rcm.f158794i = str19;
            }
        }
        rcm.f158786a = "";
        if (map.containsKey(IdentityParams.Protocol)) {
            rcm.f158786a = map.get(IdentityParams.Protocol);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initCustomParams", CommandMessage.PARAMS, str18.concat(IdentityParams.Protocol).concat("=") + rcm.f158786a);
    }

    private void initFaceGuard(Context context, boolean z) {
    }

    private void initLogService(Context context, String str) {
        RecordService.getInstance().init(context, "Android", "1.3.5.intl", Build.BRAND + "|" + Build.MODEL + "|" + Build.ID, str, Build.FINGERPRINT, String.valueOf(Build.VERSION.SDK_INT), z500.m217271c(context) + "|" + z500.m217272d(context), z500.m217270b(context));
    }

    private void install(Context context, boolean z, Map<String, String> map) {
        String str;
        if (kcm.m145452H().m145474G()) {
            return;
        }
        kcm.m145452H().m145531c();
        this.ctx = context.getApplicationContext();
        lcm.m149335c().m149338d(this.ctx);
        String str2 = null;
        if (map != null) {
            String str3 = map.containsKey("CustomUrl") ? map.get("CustomUrl") : null;
            str = map.containsKey("CustomHost") ? map.get("CustomHost") : null;
            str2 = str3;
        } else {
            str = null;
        }
        ksf0.m147070d(context, z, str2, str);
        IdentityPlatformExt.initNetworkProxy(context);
        kcm.m145452H().m145545g1(true);
        wx00.m205895a(context.getApplicationContext());
    }

    public static void reportCrash(String str, IdentityCrashCallback identityCrashCallback) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "appCrash", "crashInfo", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResponse(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            str = ncm.f138191a;
        }
        String str2 = ((System.currentTimeMillis() - kcm.m145452H().m145559l0()) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s;
        IdentityResponse identityResponseErrCode2ClientResponse = errCode2ClientResponse(str);
        "CODE_NETWORK_ERROR_1006".equals(str);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        int i = identityResponseErrCode2ClientResponse.code;
        recordService.recordEvent(recordLevel, FINAL_RESULT, NotificationCompat.CATEGORY_STATUS, i == 1000 ? "success" : "fail", "code", String.valueOf(i), "subCode", String.valueOf(identityResponseErrCode2ClientResponse.subCode), "message", identityResponseErrCode2ClientResponse.message, "timeCost", str2);
        RecordService.getInstance().flush();
        if (this.identityCallback != null) {
            IdentityOcrInfo identityOcrInfoM145527a0 = kcm.m145452H().m145527a0();
            identityResponseErrCode2ClientResponse.ocrInfo = identityOcrInfoM145527a0;
            if (identityOcrInfoM145527a0 != null) {
                Bitmap bitmapM145523Y = kcm.m145452H().m145523Y();
                if (bitmapM145523Y == null) {
                    bitmapM145523Y = kcm.m145452H().m145519W();
                }
                identityResponseErrCode2ClientResponse.ocrInfo.IDCardFrontImage = bitmapM145523Y;
                Bitmap bitmapM145515U = kcm.m145452H().m145515U();
                if (bitmapM145515U == null) {
                    bitmapM145515U = kcm.m145452H().m145509S();
                }
                identityResponseErrCode2ClientResponse.ocrInfo.IDCardBackImage = bitmapM145515U;
            }
            this.identityCallback.response(identityResponseErrCode2ClientResponse);
            this.identityCallback = null;
        }
        isBusy = false;
        kcm.m145452H().m145531c();
        kb20 kb20VarM145485K = kcm.m145452H().m145485K();
        if (kb20VarM145485K != null) {
            kb20VarM145485K.m145202a();
        }
        wx00.m205896b();
    }

    private static boolean setNetworkEnv(String str) {
        ixq0.m138885b("setNetworkEnv", "transactionId:" + str + " env:" + kcm.m145452H().m145485K());
        if (kcm.m145452H().m145485K() != null) {
            return true;
        }
        kb20 kb20VarM145198c = kb20.m145198c(str);
        if (kb20VarM145198c == null) {
            return false;
        }
        kb20VarM145198c.f122190e = IdentityUtils.m18162gk();
        kcm.m145452H().m145557k1(kb20VarM145198c);
        return true;
    }

    public static void updateFaceGuardSession(final String str) {
        new Thread() { // from class: com.idv.identity.platform.api.IdentityPlatform.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String strM147067a = ksf0.m147067a(str);
                if (strM147067a == null || strM147067a.isEmpty()) {
                    return;
                }
                kcm.m145452H().m145504Q0(strM147067a);
            }
        }.start();
    }

    private void verifyStart(String str, Map<String, String> map, IdentityCallback identityCallback) {
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, START_INIT, "message", "start enter IDV transactionId:" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (isBusy && jCurrentTimeMillis - this.verifyStartTime < 1000) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, START_INIT, "errMsg", "start enter IDV isBusy");
            return;
        }
        this.verifyStartTime = System.currentTimeMillis();
        isBusy = true;
        if (kcm.m145452H().m145459B() == null) {
            kcm.m145452H().m145528a1(new s3g());
        }
        this.identityCallback = identityCallback;
        if (!kcm.m145452H().m145474G()) {
            isBusy = false;
            sendResponse(ncm.f138182B);
            return;
        }
        if (this.ctx == null) {
            isBusy = false;
            sendResponse(ncm.f138189I);
            return;
        }
        if (str == null || str.isEmpty()) {
            isBusy = false;
            sendResponse(ncm.f138188H);
            return;
        }
        if (!setNetworkEnv(str)) {
            sendResponse(ncm.f138188H);
            isBusy = false;
            return;
        }
        kcm.m145452H().m145505Q1(this.verifyStartTime);
        initLogService(this.ctx, str);
        if (map != null && !map.isEmpty()) {
            initCustomParams(map);
        }
        RecordService.getInstance().recordEvent(recordLevel, START_INIT, "transactionId", str);
        updateFaceGuardSession(str);
        ksf0.m147071e(ksf0.f124454a, str);
        kcm.m145452H().m145486K0(str);
        kcm.m145452H().m145539e1(new IdentityRetCallback() { // from class: com.idv.identity.platform.api.IdentityPlatform.2
            @Override // com.idv.identity.platform.api.IdentityRetCallback
            public void onIdentityFinish(String str2) {
                ixq0.m138884a("onIdentityFinish  errorCode" + str2);
                IdentityPlatform.this.sendResponse(str2);
            }
        });
        String metaInfo = getMetaInfo(this.ctx);
        Intent intent = new Intent(this.ctx, (Class<?>) SystemLoadingActivity.class);
        intent.putExtra("toyger_meta_info", metaInfo);
        intent.addFlags(268435456);
        this.ctx.startActivity(intent);
    }

    public Context getCtx() {
        Activity activityM146873b = kpl.m146872a().m146873b();
        return (activityM146873b == null || activityM146873b.isFinishing() || activityM146873b.isDestroyed()) ? lcm.m149335c().m149337b() : activityM146873b;
    }

    public void installIPv6(Context context) {
        install(context, true);
    }

    public String setCustomUIConfig(int i, String str) {
        return lcm.m149335c().m149336a(i, str);
    }

    public void verify(String str, Map<String, String> map, IdentityCallback identityCallback) {
        verifyStart(str, map, identityCallback);
    }

    public static void setNetworkEnv(kb20 kb20Var) {
        kcm.m145452H().m145557k1(kb20Var);
    }

    private void install(Context context, boolean z) {
        install(context, z, null);
    }

    public void install(Context context) {
        install(context, false);
    }

    public void install(Context context, Map<String, String> map) {
        install(context, false, map);
    }
}
