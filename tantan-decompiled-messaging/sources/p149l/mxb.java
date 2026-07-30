package p149l;

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
public class mxb {

    /* JADX INFO: renamed from: b */
    private static List<String> f136152b;

    /* JADX INFO: renamed from: c */
    public static FaceConfig f136153c = new FaceConfig();

    /* JADX INFO: renamed from: d */
    public static OCRConfig f136154d = new OCRConfig();

    /* JADX INFO: renamed from: a */
    private boolean f136155a = true;

    /* JADX INFO: renamed from: l.mxb$a */
    public static class C18583a {

        /* JADX INFO: renamed from: a */
        public int f136156a = 1;

        /* JADX INFO: renamed from: b */
        public int f136157b = 1;

        /* JADX INFO: renamed from: c */
        public int f136158c = 1;

        /* JADX INFO: renamed from: d */
        public int f136159d = 1;

        /* JADX INFO: renamed from: e */
        public float f136160e = 0.25f;
    }

    /* JADX INFO: renamed from: a */
    public static void m156848a(IdentityAlertOverlay identityAlertOverlay, C18583a c18583a) {
        int i = c18583a.f136156a;
        if (1 != i) {
            identityAlertOverlay.setTitleColor(i);
        }
        int i2 = c18583a.f136157b;
        if (1 != i2) {
            identityAlertOverlay.setMsgColor(i2);
        }
        int i3 = c18583a.f136158c;
        if (1 != i3) {
            identityAlertOverlay.setConfirmColor(i3);
        }
        int i4 = c18583a.f136159d;
        if (1 != i4) {
            identityAlertOverlay.setCancelColor(i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m156849b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m156850c(JSONObject jSONObject, String str, StringBuilder sb) {
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
    public static boolean m156851d(JSONObject jSONObject, String str, StringBuilder sb) {
        try {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                Iterator<String> it = f136152b.iterator();
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
    public static boolean m156852e(JSONObject jSONObject, String str, StringBuilder sb) {
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
    public static Bitmap m156853f() {
        return m156865r(f136153c.getExitIconBase64());
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m156854g() {
        return m156865r(f136154d.getAlbumBase64());
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m156855h() {
        return m156865r(f136154d.getAutoScanBase64());
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m156856i() {
        return m156865r(f136154d.getOcrResultTipIconBase64());
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m156857j() {
        return m156865r(f136154d.getOcrResultExitIconBase64());
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m156858k() {
        return m156865r(f136154d.getFloodLightBase64());
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m156859l() {
        return m156865r(f136154d.getOcrGuideExitIconBase64());
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m156860m() {
        return m156865r(f136154d.getExitIconBase64());
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m156861n() {
        return m156865r(f136154d.getSubmitBase64());
    }

    /* JADX INFO: renamed from: o */
    public static Bitmap m156862o() {
        return m156865r(f136154d.getTakePhotoBase64());
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m156863p() {
        return m156865r(f136154d.getTakeShootBase64());
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m156864q() {
        return m156865r(f136154d.getUnFloodLightBase64());
    }

    /* JADX INFO: renamed from: r */
    public static Bitmap m156865r(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
        if (strArrSplit.length > 1) {
            str = strArrSplit[1];
        }
        return m156849b(str);
    }

    /* JADX INFO: renamed from: s */
    public static C18583a m156866s(String str) {
        C18583a c18583a = new C18583a();
        if (ncm.f138196f.equalsIgnoreCase(str)) {
            return f136153c.getDialogExitConfig();
        }
        if (str.equalsIgnoreCase(ncm.f138202l)) {
            return f136153c.getDialogTooManyRetriesConfig();
        }
        if (str.equalsIgnoreCase("CODE_OVER_TIME")) {
            return f136153c.getDialogTimeOutConfig();
        }
        if (str.equalsIgnoreCase(ncm.f138193c) || str.equalsIgnoreCase(ncm.f138195e) || str.equalsIgnoreCase(ncm.f138194d)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "SYSTEM_ERROR", "errCode", str);
            ixq0.m138885b("TAG", "System exception  errCode+".concat(str));
            return f136153c.getDialogSDKErrConfig();
        }
        if (!ncm.f138197g.equalsIgnoreCase(str) && !ncm.f138199i.equalsIgnoreCase(str) && !ncm.f138200j.equalsIgnoreCase(str)) {
            return c18583a;
        }
        ixq0.m138885b("TAG", "The system does not support facial recognition");
        return f136153c.getDialogCamOpenFailedConfig();
    }

    /* JADX INFO: renamed from: t */
    public static C18583a m156867t(String str) {
        C18583a c18583a = new C18583a();
        if ("ocr_failed_code".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogFailConfig();
        }
        if ("ocr_over_time_code".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogTimeOutConfig();
        }
        if ("ocr_exit_code".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogExitConfig();
        }
        if ("ocr_network_error_code".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogNTErrorConfig();
        }
        if ("ocr_out_time_code".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogRestrictionConfig();
        }
        if ("ocr_msg_error_code".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogMessageErrorConfig();
        }
        if ("OCR_PERM_ERROR_CODE".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogPermissionGrantedConfig();
        }
        if ("OCR_TYPE_ERROR_CODE".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogTypeErrorConfig();
        }
        if ("ORC_RES_PAGE_EXIT_CODE".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogResultExitConfig();
        }
        if ("ORC_RES_PAGE_NET_ERROR_CODE".equalsIgnoreCase(str)) {
            return f136154d.getOcrDialogResultNetErrorConfig();
        }
        return "ORC_RES_PAGE_INFO_EMPTY_CODE".equalsIgnoreCase(str) ? f136154d.getOcrDialogResultInfoEmptyConfig() : c18583a;
    }

    /* JADX INFO: renamed from: u */
    public static CustomUIConfig m156868u(int i, String str) {
        f136152b = Arrays.asList(vwc0.m200359e(c0c0.f78127b));
        CustomUIConfig customUIConfig = new CustomUIConfig();
        try {
            if (1 == i) {
                InputStream inputStreamOpen = IdentityPlatform.getInstance().getCtx().getAssets().open(str);
                if (inputStreamOpen == null) {
                    customUIConfig.setErrMsg("under assets directory" + str + "File does not exist");
                    return customUIConfig;
                }
                str = atm.m98834a(inputStreamOpen);
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
                                f136154d = customUIConfig2.getOcrConfig();
                            }
                            if (customUIConfig2.getFaceConfig() != null) {
                                f136153c = customUIConfig2.getFaceConfig();
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
                                        m156852e(jSONObject, str2, sb);
                                    }
                                    if (str2.contains("Alpha")) {
                                        m156850c(jSONObject, str2, sb);
                                    }
                                    if (str2.contains("Base64")) {
                                        m156851d(jSONObject, str2, sb);
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
                                        m156852e(jSONObject2, str3, sb);
                                    }
                                    if (str3.contains("Alpha")) {
                                        m156850c(jSONObject2, str3, sb);
                                    }
                                    if (str3.contains("Base64")) {
                                        m156851d(jSONObject2, str3, sb);
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
