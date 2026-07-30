package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.idv.identity.platform.IdentityAlertOverlay;
import com.idv.identity.platform.api.IdentityPlatform;
import com.idv.identity.platform.config.CustomUIConfig;
import com.idv.identity.platform.config.FaceConfig;
import com.idv.identity.platform.config.OCRConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class azb {

    /* JADX INFO: renamed from: b */
    private static List<String> f74126b;

    /* JADX INFO: renamed from: c */
    public static FaceConfig f74127c = new FaceConfig();

    /* JADX INFO: renamed from: d */
    public static OCRConfig f74128d = new OCRConfig();

    /* JADX INFO: renamed from: a */
    private boolean f74129a = true;

    /* JADX INFO: renamed from: l.azb$a */
    public static class C15866a {

        /* JADX INFO: renamed from: a */
        public int f74130a = 1;

        /* JADX INFO: renamed from: b */
        public int f74131b = 1;

        /* JADX INFO: renamed from: c */
        public int f74132c = 1;

        /* JADX INFO: renamed from: d */
        public int f74133d = 1;

        /* JADX INFO: renamed from: e */
        public float f74134e = 0.25f;
    }

    /* JADX INFO: renamed from: a */
    public static void m101041a(IdentityAlertOverlay identityAlertOverlay, C15866a c15866a) {
        int i = c15866a.f74130a;
        if (1 != i) {
            identityAlertOverlay.setTitleColor(i);
        }
        int i2 = c15866a.f74131b;
        if (1 != i2) {
            identityAlertOverlay.setMsgColor(i2);
        }
        int i3 = c15866a.f74132c;
        if (1 != i3) {
            identityAlertOverlay.setConfirmColor(i3);
        }
        int i4 = c15866a.f74133d;
        if (1 != i4) {
            identityAlertOverlay.setCancelColor(i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m101042b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m101043c(JSONObject jSONObject, String str, StringBuilder sb) {
        try {
            double d = Double.parseDouble(jSONObject.getString(str));
            if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d <= 1.0d) {
                return true;
            }
        } catch (Throwable unused) {
        }
        sb.append(str);
        sb.append("illegal.\n");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m101044d(JSONObject jSONObject, String str, StringBuilder sb) {
        try {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                Iterator<String> it = f74126b.iterator();
                while (it.hasNext()) {
                    if (string.startsWith(it.next())) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        sb.append(str);
        sb.append(" Image base64 format is not supported.\n");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m101045e(JSONObject jSONObject, String str, StringBuilder sb) {
        try {
            Color.parseColor(jSONObject.getString(str));
            return true;
        } catch (Throwable unused) {
            sb.append(str);
            sb.append("illegal.\n");
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m101046f() {
        return m101058r(f74127c.getExitIconBase64());
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m101047g() {
        return m101058r(f74128d.getAlbumBase64());
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m101048h() {
        return m101058r(f74128d.getAutoScanBase64());
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m101049i() {
        return m101058r(f74128d.getOcrResultTipIconBase64());
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m101050j() {
        return m101058r(f74128d.getOcrResultExitIconBase64());
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m101051k() {
        return m101058r(f74128d.getFloodLightBase64());
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m101052l() {
        return m101058r(f74128d.getOcrGuideExitIconBase64());
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m101053m() {
        return m101058r(f74128d.getExitIconBase64());
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m101054n() {
        return m101058r(f74128d.getSubmitBase64());
    }

    /* JADX INFO: renamed from: o */
    public static Bitmap m101055o() {
        return m101058r(f74128d.getTakePhotoBase64());
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m101056p() {
        return m101058r(f74128d.getTakeShootBase64());
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m101057q() {
        return m101058r(f74128d.getUnFloodLightBase64());
    }

    /* JADX INFO: renamed from: r */
    public static Bitmap m101058r(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
        if (strArrSplit.length > 1) {
            str = strArrSplit[1];
        }
        return m101042b(str);
    }

    /* JADX INFO: renamed from: s */
    public static C15866a m101059s(String str) {
        C15866a c15866a = new C15866a();
        if (dfm.f88185f.equalsIgnoreCase(str)) {
            return f74127c.getDialogExitConfig();
        }
        if (str.equalsIgnoreCase(dfm.f88191l)) {
            return f74127c.getDialogTooManyRetriesConfig();
        }
        if (str.equalsIgnoreCase("CODE_OVER_TIME")) {
            return f74127c.getDialogTimeOutConfig();
        }
        if (str.equalsIgnoreCase(dfm.f88182c) || str.equalsIgnoreCase(dfm.f88184e) || str.equalsIgnoreCase(dfm.f88183d)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "SYSTEM_ERROR", "errCode", str);
            o6r0.m166282b("TAG", "System exception  errCode+".concat(str));
            return f74127c.getDialogSDKErrConfig();
        }
        if (!dfm.f88186g.equalsIgnoreCase(str) && !dfm.f88188i.equalsIgnoreCase(str) && !dfm.f88189j.equalsIgnoreCase(str)) {
            return c15866a;
        }
        o6r0.m166282b("TAG", "The system does not support facial recognition");
        return f74127c.getDialogCamOpenFailedConfig();
    }

    /* JADX INFO: renamed from: t */
    public static C15866a m101060t(String str) {
        C15866a c15866a = new C15866a();
        if ("ocr_failed_code".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogFailConfig();
        }
        if ("ocr_over_time_code".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogTimeOutConfig();
        }
        if ("ocr_exit_code".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogExitConfig();
        }
        if ("ocr_network_error_code".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogNTErrorConfig();
        }
        if ("ocr_out_time_code".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogRestrictionConfig();
        }
        if ("ocr_msg_error_code".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogMessageErrorConfig();
        }
        if ("OCR_PERM_ERROR_CODE".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogPermissionGrantedConfig();
        }
        if ("OCR_TYPE_ERROR_CODE".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogTypeErrorConfig();
        }
        if ("ORC_RES_PAGE_EXIT_CODE".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogResultExitConfig();
        }
        if ("ORC_RES_PAGE_NET_ERROR_CODE".equalsIgnoreCase(str)) {
            return f74128d.getOcrDialogResultNetErrorConfig();
        }
        return "ORC_RES_PAGE_INFO_EMPTY_CODE".equalsIgnoreCase(str) ? f74128d.getOcrDialogResultInfoEmptyConfig() : c15866a;
    }

    /* JADX INFO: renamed from: u */
    public static CustomUIConfig m101061u(int i, String str) {
        f74126b = Arrays.asList(z4d0.m218577e(h8c0.f108233b));
        CustomUIConfig customUIConfig = new CustomUIConfig();
        try {
            if (1 == i) {
                InputStream inputStreamOpen = IdentityPlatform.getInstance().getCtx().getAssets().open(str);
                if (inputStreamOpen == null) {
                    customUIConfig.setErrMsg("under assets directory" + str + "File does not exist");
                    return customUIConfig;
                }
                str = bvm.m106579a(inputStreamOpen);
            } else if (i != 0) {
                customUIConfig.setErrMsg("paramType:" + i + "Parameter type is illegal");
                return customUIConfig;
            }
            StringBuilder sb = new StringBuilder();
            new JSONObject();
            try {
                JSONObject object = JSON.parseObject(str);
                try {
                    if (object != null) {
                        CustomUIConfig customUIConfig2 = (CustomUIConfig) JSON.toJavaObject(object, CustomUIConfig.class);
                        try {
                            if (customUIConfig2.getOcrConfig() != null) {
                                f74128d = customUIConfig2.getOcrConfig();
                            }
                            if (customUIConfig2.getFaceConfig() != null) {
                                f74127c = customUIConfig2.getFaceConfig();
                            }
                            JSONObject jSONObject = object.getJSONObject("faceConfig");
                            if (jSONObject != null) {
                                Field[] declaredFields = FaceConfig.class.getDeclaredFields();
                                ArrayList arrayList = new ArrayList();
                                for (Field field : declaredFields) {
                                    arrayList.add(field.getName());
                                }
                                for (String str2 : jSONObject.keySet()) {
                                    if (!arrayList.contains(str2)) {
                                        sb.append(str2 + "no match.\n");
                                    }
                                    if (str2.contains("Color")) {
                                        m101045e(jSONObject, str2, sb);
                                    }
                                    if (str2.contains("Alpha")) {
                                        m101043c(jSONObject, str2, sb);
                                    }
                                    if (str2.contains("Base64")) {
                                        m101044d(jSONObject, str2, sb);
                                    }
                                }
                            }
                            new ArrayList();
                            JSONObject jSONObject2 = object.getJSONObject("ocrConfig");
                            if (jSONObject2 != null) {
                                Field[] declaredFields2 = OCRConfig.class.getDeclaredFields();
                                ArrayList arrayList2 = new ArrayList();
                                for (Field field2 : declaredFields2) {
                                    arrayList2.add(field2.getName());
                                }
                                for (String str3 : jSONObject2.keySet()) {
                                    if (!arrayList2.contains(str3)) {
                                        sb.append(str3 + "no match.\n");
                                    }
                                    if (str3.contains("Color")) {
                                        m101045e(jSONObject2, str3, sb);
                                    }
                                    if (str3.contains("Alpha")) {
                                        m101043c(jSONObject2, str3, sb);
                                    }
                                    if (str3.contains("Base64")) {
                                        m101044d(jSONObject2, str3, sb);
                                    }
                                }
                            }
                            customUIConfig = customUIConfig2;
                        } catch (Throwable th) {
                            th = th;
                            customUIConfig = customUIConfig2;
                            sb.append(Log.getStackTraceString(th));
                            RecordService.getInstance().recordException(th);
                        }
                    } else {
                        sb.append("Illegal format.");
                        customUIConfig.setValid(false);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                customUIConfig.setErrMsg(sb.toString());
                return customUIConfig;
            } catch (Throwable th3) {
                customUIConfig.setErrMsg(Log.getStackTraceString(th3));
                customUIConfig.setValid(false);
                return customUIConfig;
            }
        } catch (Throwable th4) {
            customUIConfig.setErrMsg(Log.getStackTraceString(th4));
            return customUIConfig;
        }
    }
}
