package com.tencent.youtu.sdkkitframework.common;

import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class YtSdkConfig {

    public static class ActionDetectConfig {
        public static String actionSeqData;
    }

    public static class CommonConfig {
        public static int screenOrientation;
        public static int threadPriority;
    }

    public static class FaceDetectConfig {
    }

    public static class FaceQualityConfig {
    }

    public static class NetFetch {
        public static String appId = null;
        public static int backendProtoType = 0;
        public static int changePointNum = 2;
        public static String configUrl;
        public static String controlConfig;
        public static String extraConfig;
        public static boolean needActionlLocalConfig;
        public static boolean needBuglyShared;
        public static boolean needLocalConfig;
        public static int netRequestTimeoutMS;
        public static String resourceDownloadPath;
        public static boolean resourceOnline;
        public static JSONObject selectData;
    }

    public static class ReflectConfig {
        public static String colorData;
    }

    public int updateSDKConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject) {
        try {
            if (jSONObject.has(Constants.JumpUrlConstants.URL_KEY_APPID)) {
                NetFetch.appId = jSONObject.getString(Constants.JumpUrlConstants.URL_KEY_APPID);
            }
            if (jSONObject.has("config_api_url")) {
                NetFetch.configUrl = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                ReflectConfig.colorData = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                NetFetch.needLocalConfig = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ActionDetectConfig.actionSeqData += jSONArray.getString(i);
                    if (i < jSONArray.length() - 1) {
                        ActionDetectConfig.actionSeqData += com.clevertap.android.sdk.Constants.SEPARATOR_COMMA;
                    }
                }
            } else {
                ActionDetectConfig.actionSeqData = "0";
            }
            if (jSONObject.has("extra_config")) {
                NetFetch.extraConfig = jSONObject.getString("extra_config");
            } else {
                NetFetch.extraConfig = " version 2";
            }
            if (jSONObject.has("control_config")) {
                NetFetch.controlConfig = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                NetFetch.changePointNum = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("select_data")) {
                NetFetch.selectData = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                NetFetch.backendProtoType = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                NetFetch.netRequestTimeoutMS = jSONObject.getInt("net_request_timeout_ms");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                NetFetch.needActionlLocalConfig = jSONObject.getBoolean("action_local_config_flag");
            }
            if (jSONObject.has("resource_online")) {
                NetFetch.resourceOnline = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                NetFetch.resourceDownloadPath = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_bugly_shared")) {
                NetFetch.needBuglyShared = jSONObject.getBoolean("need_bugly_shared");
            }
            if (jSONObject.has("screen_orientation")) {
                CommonConfig.screenOrientation = jSONObject.getInt("screen_orientation");
            }
            if (jSONObject.has("thread_priority")) {
                CommonConfig.threadPriority = jSONObject.getInt("thread_priority");
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }
}
