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
import com.p051p1.mobile.putong.data.JSBridgeVersion;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import p153l.ac00;
import p153l.afm;
import p153l.bfm;
import p153l.dfm;
import p153l.g5g;
import p153l.g610;
import p153l.hfm;
import p153l.je00;
import p153l.o6r0;
import p153l.t0g0;
import p153l.tj20;
import p153l.xrl;

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

    private void configPopNetWorkEnv(tj20 tj20Var) {
        tj20Var.f174528b = CLOUD_AUTH_HK;
        tj20Var.f174527a = CLOUD_HOST;
    }

    private IdentityResponse errCode2ClientResponse(String str) {
        IdentityResponse identityResponse = new IdentityResponse();
        if (str == null) {
            str = "";
        }
        identityResponse.message = str;
        if (dfm.f88177H.equalsIgnoreCase(str)) {
            identityResponse.code = 1007;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_TRANSACTION_ID_ERROR;
            return identityResponse;
        }
        if (dfm.f88178I.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CONTEXT_NULL;
            return identityResponse;
        }
        if (dfm.f88171B.equalsIgnoreCase(str)) {
            identityResponse.code = 1010;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NOT_INIT;
            return identityResponse;
        }
        if (dfm.f88174E.equalsIgnoreCase(str)) {
            identityResponse.code = 1017;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_PARAM_EXCEPTION;
            return identityResponse;
        }
        if (dfm.f88202w.equalsIgnoreCase(str)) {
            identityResponse.code = 1008;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_OCR_MODULE_NOT_EXIST;
            return identityResponse;
        }
        if (dfm.f88203x.equalsIgnoreCase(str)) {
            identityResponse.code = 1008;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_FACE_MODULE_NOT_EXIST;
            return identityResponse;
        }
        if (dfm.f88201v.equalsIgnoreCase(str)) {
            identityResponse.code = 1008;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CODE_NFC_MODULE_NOT_EXIST;
            return identityResponse;
        }
        if (dfm.f88192m.equalsIgnoreCase(str)) {
            identityResponse.code = 1015;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_OS_VERSION_LOW;
            return identityResponse;
        }
        if (dfm.f88186g.equalsIgnoreCase(str)) {
            identityResponse.code = 1004;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_FRONT_CAMERA;
            return identityResponse;
        }
        if (dfm.f88187h.equalsIgnoreCase(str)) {
            identityResponse.code = 1004;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_BACK_CAMERA;
            return identityResponse;
        }
        if (dfm.f88188i.equalsIgnoreCase(str)) {
            identityResponse.code = 1004;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_OPEN_CAMERA_ERROR;
            return identityResponse;
        }
        if (dfm.f88190k.equalsIgnoreCase(str)) {
            identityResponse.code = 1016;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_CAMERA_PERMISSION;
            return identityResponse;
        }
        if (dfm.f88197r.equalsIgnoreCase(str)) {
            identityResponse.code = 1000;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_SUCCESS;
            return identityResponse;
        }
        if (dfm.f88198s.equalsIgnoreCase(str)) {
            identityResponse.code = 1001;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_FAIL;
            return identityResponse;
        }
        if (dfm.f88199t.equalsIgnoreCase(str)) {
            identityResponse.code = 1005;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NETWORK_VERIFY_ERROR;
            return identityResponse;
        }
        if (dfm.f88194o.equalsIgnoreCase(str)) {
            identityResponse.code = 1005;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NETWORK_INIT_ERROR;
            return identityResponse;
        }
        if (dfm.f88195p.equalsIgnoreCase(str)) {
            identityResponse.code = 1005;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NETWORK_VERIFY_ERROR;
            return identityResponse;
        }
        if (dfm.f88179J.equalsIgnoreCase(str)) {
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
        if (dfm.f88181b.equalsIgnoreCase(str)) {
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
        if (dfm.f88185f.equalsIgnoreCase(str)) {
            identityResponse.code = 1006;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_USER_BACK;
            return identityResponse;
        }
        if (dfm.f88176G.equalsIgnoreCase(str)) {
            identityResponse.code = 2000;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_NO_NFC_PERMISSION;
            return identityResponse;
        }
        if (dfm.f88204y.equalsIgnoreCase(str)) {
            identityResponse.code = 2002;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CLIENT_NFC_UNSUPPORTED;
            return identityResponse;
        }
        if (dfm.f88205z.equalsIgnoreCase(str)) {
            identityResponse.code = 2000;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_CLIENT_NFC_CONFIG_ERROR;
            return identityResponse;
        }
        if (dfm.f88191l.equalsIgnoreCase(str)) {
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
        if (dfm.f88173D.equalsIgnoreCase(str)) {
            identityResponse.code = 1003;
            identityResponse.subCode = IdentityResponseCode.SubCode.SUB_IDENTITY_MISS_KEY_INFO;
            return identityResponse;
        }
        if (dfm.f88172C.equalsIgnoreCase(str)) {
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
        identityMetaInfo.setAppVersion(ac00.m96786e(context));
        identityMetaInfo.setDeviceModel(Build.MODEL);
        identityMetaInfo.setDeviceType("android");
        identityMetaInfo.setOsVersion(Build.VERSION.RELEASE);
        identityMetaInfo.setBioMetaInfo("5.1.0:11501568,4");
        identityMetaInfo.setIdentityVer(JSBridgeVersion.JSBRIDGE_API_VERSION);
        identityMetaInfo.setSdkVersion("1.3.5.intl");
        identityMetaInfo.setDeviceBrand(Build.BRAND);
        identityMetaInfo.setDeviceManufacturer(Build.MANUFACTURER);
        identityMetaInfo.setFgVersion(t0g0.m188739b());
        try {
            return JSON.toJSONString(identityMetaInfo);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static tj20 getNetworkEnv() {
        return afm.m97360H().m97393K();
    }

    private void initCustomParams(Map<String, String> map) {
        int iIntValue;
        int iIntValue2;
        if (map == null || map.size() <= 0) {
            return;
        }
        hfm.f109318c = "";
        if (map.containsKey(IdentityParams.WaterMark)) {
            String str = map.get(IdentityParams.WaterMark);
            if (!TextUtils.isEmpty(str)) {
                hfm.f109318c = str;
            }
        }
        String str2 = IdentityParams.WaterMark.concat("=") + hfm.f109318c;
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
                hfm.f109325j = i;
            }
        }
        String str4 = str2.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.MaxErrorTimes).concat("=") + hfm.f109325j;
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
                hfm.f109326k = iIntValue2;
            }
        }
        String str6 = str4.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.CardOcrTimeOutPeriod).concat("=") + hfm.f109326k;
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
                hfm.f109327l = i3;
            }
        }
        String str8 = str6.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.FaceVerifyTimeOutPeriod).concat("=") + hfm.f109327l;
        if (map.containsKey(IdentityParams.OcrResultTimeOutPeriod)) {
            String str9 = map.get(IdentityParams.OcrResultTimeOutPeriod);
            if (!TextUtils.isEmpty(str9)) {
                try {
                    iIntValue = Integer.valueOf(str9).intValue();
                } catch (Exception unused4) {
                    iIntValue = 0;
                }
                hfm.f109328m = iIntValue;
            }
        }
        String str10 = str8.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.OcrResultTimeOutPeriod).concat("=") + hfm.f109328m;
        if (map.containsKey(IdentityParams.IdCardVerifyMode) && "0".equalsIgnoreCase(map.get(IdentityParams.IdCardVerifyMode))) {
            hfm.f109317b = true;
        }
        String str11 = str10.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.IdCardVerifyMode).concat("=") + String.valueOf(hfm.f109317b);
        if (map.containsKey(IdentityParams.OcrResultButtonColor)) {
            String str12 = map.get(IdentityParams.OcrResultButtonColor);
            if (!TextUtils.isEmpty(str12)) {
                hfm.f109321f = str12;
            }
        }
        if (hfm.f109321f != null) {
            str11 = str11.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.OcrResultButtonColor).concat("=") + hfm.f109321f;
        }
        hfm.f109319d = true;
        if (map.containsKey(IdentityParams.ShowOcrResult) && "0".equalsIgnoreCase(map.get(IdentityParams.ShowOcrResult))) {
            hfm.f109319d = false;
        }
        String str13 = str11.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.ShowOcrResult).concat("=") + String.valueOf(hfm.f109319d);
        hfm.f109320e = true;
        if (map.containsKey(IdentityParams.EditOcrResult) && "0".equalsIgnoreCase(map.get(IdentityParams.EditOcrResult))) {
            hfm.f109320e = false;
        }
        String str14 = str13.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.EditOcrResult).concat("=") + String.valueOf(hfm.f109320e);
        if (map.containsKey(IdentityParams.ShowBlbumIcon) && "0".equalsIgnoreCase(map.get(IdentityParams.ShowBlbumIcon))) {
            hfm.f109322g = false;
        }
        String str15 = str14.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.ShowBlbumIcon).concat("=") + String.valueOf(hfm.f109322g);
        if (map.containsKey(IdentityParams.RoundProgressColor)) {
            String str16 = map.get(IdentityParams.RoundProgressColor);
            if (!TextUtils.isEmpty(str16)) {
                hfm.f109323h = str16;
            }
        }
        if (hfm.f109323h != null) {
            str15 = str15.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.RoundProgressColor).concat("=") + hfm.f109323h;
        }
        if (map.containsKey(IdentityParams.SdkLanguage)) {
            String str17 = map.get(IdentityParams.SdkLanguage);
            if (TextUtils.isEmpty(str17)) {
                hfm.f109330o = "";
            } else {
                hfm.f109330o = str17;
            }
        }
        String str18 = str15.concat(Constants.SEPARATOR_COMMA).concat(IdentityParams.SdkLanguage).concat("=") + hfm.f109330o;
        if (map.containsKey(IdentityParams.CloseButtonLayout)) {
            String str19 = map.get(IdentityParams.CloseButtonLayout);
            if (!TextUtils.isEmpty(str19)) {
                hfm.f109324i = str19;
            }
        }
        hfm.f109316a = "";
        if (map.containsKey(IdentityParams.Protocol)) {
            hfm.f109316a = map.get(IdentityParams.Protocol);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initCustomParams", CommandMessage.PARAMS, str18.concat(IdentityParams.Protocol).concat("=") + hfm.f109316a);
    }

    private void initFaceGuard(Context context, boolean z) {
    }

    private void initLogService(Context context, String str) {
        RecordService.getInstance().init(context, "Android", "1.3.5.intl", Build.BRAND + "|" + Build.MODEL + "|" + Build.ID, str, Build.FINGERPRINT, String.valueOf(Build.VERSION.SDK_INT), je00.m144507c(context) + "|" + je00.m144508d(context), je00.m144506b(context));
    }

    private void install(Context context, boolean z, Map<String, String> map) {
        String str;
        if (afm.m97360H().m97382G()) {
            return;
        }
        afm.m97360H().m97439c();
        this.ctx = context.getApplicationContext();
        bfm.m103928c().m103931d(this.ctx);
        String str2 = null;
        if (map != null) {
            String str3 = map.containsKey("CustomUrl") ? map.get("CustomUrl") : null;
            str = map.containsKey("CustomHost") ? map.get("CustomHost") : null;
            str2 = str3;
        } else {
            str = null;
        }
        t0g0.m188741d(context, z, str2, str);
        IdentityPlatformExt.initNetworkProxy(context);
        afm.m97360H().m97453g1(true);
        g610.m129078a(context.getApplicationContext());
    }

    public static void reportCrash(String str, IdentityCrashCallback identityCrashCallback) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "appCrash", "crashInfo", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResponse(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            str = dfm.f88180a;
        }
        String str2 = ((System.currentTimeMillis() - afm.m97360H().m97467l0()) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s;
        IdentityResponse identityResponseErrCode2ClientResponse = errCode2ClientResponse(str);
        "CODE_NETWORK_ERROR_1006".equals(str);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        int i = identityResponseErrCode2ClientResponse.code;
        recordService.recordEvent(recordLevel, FINAL_RESULT, NotificationCompat.CATEGORY_STATUS, i == 1000 ? "success" : "fail", "code", String.valueOf(i), "subCode", String.valueOf(identityResponseErrCode2ClientResponse.subCode), "message", identityResponseErrCode2ClientResponse.message, "timeCost", str2);
        RecordService.getInstance().flush();
        if (this.identityCallback != null) {
            IdentityOcrInfo identityOcrInfoM97435a0 = afm.m97360H().m97435a0();
            identityResponseErrCode2ClientResponse.ocrInfo = identityOcrInfoM97435a0;
            if (identityOcrInfoM97435a0 != null) {
                Bitmap bitmapM97431Y = afm.m97360H().m97431Y();
                if (bitmapM97431Y == null) {
                    bitmapM97431Y = afm.m97360H().m97427W();
                }
                identityResponseErrCode2ClientResponse.ocrInfo.IDCardFrontImage = bitmapM97431Y;
                Bitmap bitmapM97423U = afm.m97360H().m97423U();
                if (bitmapM97423U == null) {
                    bitmapM97423U = afm.m97360H().m97417S();
                }
                identityResponseErrCode2ClientResponse.ocrInfo.IDCardBackImage = bitmapM97423U;
            }
            this.identityCallback.response(identityResponseErrCode2ClientResponse);
            this.identityCallback = null;
        }
        isBusy = false;
        afm.m97360H().m97439c();
        tj20 tj20VarM97393K = afm.m97360H().m97393K();
        if (tj20VarM97393K != null) {
            tj20VarM97393K.m191359a();
        }
        g610.m129079b();
    }

    private static boolean setNetworkEnv(String str) {
        o6r0.m166282b("setNetworkEnv", "transactionId:" + str + " env:" + afm.m97360H().m97393K());
        if (afm.m97360H().m97393K() != null) {
            return true;
        }
        tj20 tj20VarM191355c = tj20.m191355c(str);
        if (tj20VarM191355c == null) {
            return false;
        }
        tj20VarM191355c.f174531e = IdentityUtils.m19239gk();
        afm.m97360H().m97465k1(tj20VarM191355c);
        return true;
    }

    public static void updateFaceGuardSession(final String str) {
        new Thread() { // from class: com.idv.identity.platform.api.IdentityPlatform.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String strM188738a = t0g0.m188738a(str);
                if (strM188738a == null || strM188738a.isEmpty()) {
                    return;
                }
                afm.m97360H().m97412Q0(strM188738a);
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
        if (afm.m97360H().m97367B() == null) {
            afm.m97360H().m97436a1(new g5g());
        }
        this.identityCallback = identityCallback;
        if (!afm.m97360H().m97382G()) {
            isBusy = false;
            sendResponse(dfm.f88171B);
            return;
        }
        if (this.ctx == null) {
            isBusy = false;
            sendResponse(dfm.f88178I);
            return;
        }
        if (str == null || str.isEmpty()) {
            isBusy = false;
            sendResponse(dfm.f88177H);
            return;
        }
        if (!setNetworkEnv(str)) {
            sendResponse(dfm.f88177H);
            isBusy = false;
            return;
        }
        afm.m97360H().m97413Q1(this.verifyStartTime);
        initLogService(this.ctx, str);
        if (map != null && !map.isEmpty()) {
            initCustomParams(map);
        }
        RecordService.getInstance().recordEvent(recordLevel, START_INIT, "transactionId", str);
        updateFaceGuardSession(str);
        t0g0.m188742e(t0g0.f171504a, str);
        afm.m97360H().m97394K0(str);
        afm.m97360H().m97447e1(new IdentityRetCallback() { // from class: com.idv.identity.platform.api.IdentityPlatform.2
            @Override // com.idv.identity.platform.api.IdentityRetCallback
            public void onIdentityFinish(String str2) {
                o6r0.m166281a("onIdentityFinish  errorCode" + str2);
                IdentityPlatform.this.sendResponse(str2);
            }
        });
        String metaInfo = getMetaInfo(this.ctx);
        Intent intent = new Intent(this.ctx, (Class<?>) SystemLoadingActivity.class);
        intent.putExtra("toyger_meta_info", metaInfo);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.ctx.startActivity(intent);
    }

    public Context getCtx() {
        Activity activityM212839b = xrl.m212838a().m212839b();
        return (activityM212839b == null || activityM212839b.isFinishing() || activityM212839b.isDestroyed()) ? bfm.m103928c().m103930b() : activityM212839b;
    }

    public void installIPv6(Context context) {
        install(context, true);
    }

    public String setCustomUIConfig(int i, String str) {
        return bfm.m103928c().m103929a(i, str);
    }

    public void verify(String str, Map<String, String> map, IdentityCallback identityCallback) {
        verifyStart(str, map, identityCallback);
    }

    public static void setNetworkEnv(tj20 tj20Var) {
        afm.m97360H().m97465k1(tj20Var);
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
