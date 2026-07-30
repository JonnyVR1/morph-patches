package com.cosmos.photon.push;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PushPreferenceUtils {
    public static final String KEY_ALIAS = "p_alias";
    private static final String KEY_AP_LIST = "p_ap_address_list";
    private static final String KEY_DEVICE_ID = "p_device_id";
    private static final String KEY_HTTP_PUSH_CONFIG_PRIVETE_CHANNEL = "p_config_private_channel";
    private static final String KEY_HTTP_REG_INTERVAL = "p_http_reg_interval";
    public static final String KEY_P_TOKEN = "p_token";
    private static final String KEY_REFEREE_HTTP_IP = "p_rfh_ip_";
    private static final String KEY_REFEREE_LAST_UPDATE_TIME = "p_referee_last_update_time";
    private static final String KEY_REFEREE_UPDATE_INTERVAL = "p_referee_update_interval";
    private static final String KEY_REFEREE_VERSION = "referee_version";
    public static final String KEY_T_TOKEN = "t_token";

    @SuppressLint({"ApplySharedPref"})
    public static void clearAll() {
        if (getPrefs() != null) {
            getPrefs().edit().remove(KEY_P_TOKEN).remove(KEY_T_TOKEN).remove(KEY_ALIAS).commit();
        }
    }

    public static String getAlias() {
        return getPrefs() != null ? getPrefs().getString(KEY_ALIAS, "") : "";
    }

    public static String getDeviceId() {
        return getPrefs() != null ? getPrefs().getString(KEY_DEVICE_ID, "") : "";
    }

    public static long getHttpRegInterval(long j) {
        return getPrefs() != null ? getPrefs().getLong(KEY_HTTP_REG_INTERVAL, j) : j;
    }

    public static String getPToken() {
        return getPrefs() != null ? getPrefs().getString(KEY_P_TOKEN, "") : "";
    }

    public static SharedPreferences getPrefs() {
        if (AppContext.getContext() == null) {
            return null;
        }
        try {
            return AppContext.getContext().getSharedPreferences("pref_c_p", 4);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getThirdToken() {
        return getPrefs() != null ? getPrefs().getString(KEY_T_TOKEN, "") : "";
    }

    public static void initConfig() {
        if (getPrefs() != null) {
            ChannelBridge.pushConfigPrivateChannel = getPrefs().getBoolean(KEY_HTTP_PUSH_CONFIG_PRIVETE_CHANNEL, false);
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void removeAlias() {
        if (getPrefs() != null) {
            getPrefs().edit().remove(KEY_ALIAS).commit();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveAlias(String str) {
        if (getPrefs() != null) {
            getPrefs().edit().putString(KEY_ALIAS, str).commit();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveDeviceId(String str) {
        if (getPrefs() != null) {
            getPrefs().edit().putString(KEY_DEVICE_ID, str).commit();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveThirdToken(String str) {
        if (getPrefs() != null) {
            getPrefs().edit().putString(KEY_T_TOKEN, str).commit();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveToken(String str) {
        if (getPrefs() != null) {
            getPrefs().edit().putString(KEY_P_TOKEN, str).commit();
        }
    }

    public static void updateConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong(BannerFrequencyType.interval, 0L) * 1000;
            boolean z = jSONObject.optInt("private_channel", 0) == 1;
            ChannelBridge.pushConfigPrivateChannel = z;
            MDLog.m7450i(LogTag.API, "updateConfig: interval=%d", Long.valueOf(jOptLong));
            if (getPrefs() != null) {
                getPrefs().edit().putLong(KEY_HTTP_REG_INTERVAL, jOptLong).putBoolean(KEY_HTTP_PUSH_CONFIG_PRIVETE_CHANNEL, z).apply();
            }
        }
    }
}
