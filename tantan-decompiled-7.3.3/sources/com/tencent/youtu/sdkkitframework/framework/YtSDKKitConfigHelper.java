package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class YtSDKKitConfigHelper {
    public static final String TAG = "YtSDKKitConfigHelper";
    public static final HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String> SDK_SETTINGS = new HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.1
        {
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE, "ocr_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE, "silent_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE, "action_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE, "reflect_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE, "action+reflect_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE, "detectonly_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE, "ocr_video_ident_settings");
        }
    };
    public static final HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String> UI_SETTINGS = new HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.2
        {
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE, "ocr_card_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE, "silent_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE, "action_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE, "reflect_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE, "action+reflect_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE, "detectonly_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE, "ocr_video_ident_ui");
        }
    };

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper$9 */
    public static /* synthetic */ class C146159 {

        /* JADX INFO: renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        public static final /* synthetic */ int[] f61420x75f35c10;

        static {
            int[] iArr = new int[YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values().length];
            f61420x75f35c10 = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f61420x75f35c10;
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f61420x75f35c10;
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode2 = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f61420x75f35c10;
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode3 = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f61420x75f35c10;
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode4 = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
                iArr5[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f61420x75f35c10;
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode5 = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
                iArr6[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f61420x75f35c10;
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode6 = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
                iArr7[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static String getConfigStringBy(JSONObject jSONObject, String str, boolean z) {
        String string;
        try {
            string = jSONObject.getString(str);
        } catch (JSONException e) {
            YtLogger.m85809e(TAG, "Parse json object failed ", e);
            string = null;
        }
        if (z && (string == null || string.equals(""))) {
            YtLogger.m85809e(TAG, "Parse json object failed " + str + "参数解析失败, 不存在或者不能为空", null);
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_JSON_PARAM_ERROR, StringCode.MSG_PARAM_ERROR);
            HashMap<String, Object> map = new HashMap<>();
            map.put(StateEvent.Name.PROCESS_RESULT, "failed");
            map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_JSON_PARAM_ERROR));
            map.put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_JSON_PARAM_ERROR, StringCode.MSG_PARAM_ERROR, str + "参数解析失败, 不存在或者不能为空"));
            YtFSM.getInstance().sendFSMEvent(map);
        }
        return string;
    }

    public static ArrayList<String> getPipleStateNames(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode) {
        switch (ytSDKKitFrameworkWorkMode.ordinal()) {
            case 1:
                return new ArrayList<String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.3
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.OCR_AUTO_DETECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.OCR_MANUAL_DETECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 2:
            case 3:
                return new ArrayList<String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.4
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 4:
                return new ArrayList<String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.5
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 5:
                return new ArrayList<String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.6
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 6:
                return new ArrayList<String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.7
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.DETECTONLY_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                    }
                };
            case 7:
                return new ArrayList<String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.8
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.OCR_VIID_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_VIID_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                    }
                };
            default:
                return null;
        }
    }

    public static JSONObject getSDKConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(SDK_SETTINGS.get(ytSDKKitFrameworkWorkMode));
        } catch (NullPointerException | JSONException e) {
            YtLogger.m85809e(TAG, "getSDKConfig error", e);
            return null;
        }
    }

    public static JSONObject getUIConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(UI_SETTINGS.get(ytSDKKitFrameworkWorkMode));
        } catch (JSONException e) {
            YtLogger.m85809e(TAG, "getUIConfig error", e);
            return null;
        }
    }

    public static void setSDKConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(SDK_SETTINGS.get(ytSDKKitFrameworkWorkMode), jSONObject2);
        } catch (JSONException e) {
            YtLogger.m85809e(TAG, "setSDKConfig error", e);
        }
    }

    public static void setUIConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(UI_SETTINGS.get(ytSDKKitFrameworkWorkMode), jSONObject2);
        } catch (JSONException e) {
            YtLogger.m85809e(TAG, "setUIConfig error", e);
        }
    }
}
