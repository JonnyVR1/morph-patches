package com.cosmos.photon.push;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.cosmos.photon.push.util.AppContext;

/* JADX INFO: loaded from: classes.dex */
class ApiCacheUtil {
    private static final long CACHE_EXPIRE_TIME = 0;
    private static volatile SharedPreferences preferences;

    private static void checkInit() {
        if (preferences == null) {
            try {
                preferences = AppContext.getContext().getSharedPreferences("mmpush_pref_c_p_t", 4);
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void clearAll() {
        checkInit();
        try {
            preferences.edit().clear().apply();
        } catch (Throwable unused) {
        }
    }

    public static String getRegisterData(String str, String str2, String str3) {
        checkInit();
        try {
            return preferences.getString("register_" + str + str2 + str3, null);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isRegVendorExpired(String str, String str2, String str3, String str4) {
        checkInit();
        StringBuilder sb = new StringBuilder("reg_vendor_expire_");
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        try {
            return Math.abs(System.currentTimeMillis() - preferences.getLong(sb.toString(), 0L)) > 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean isRegisterExpired(String str, String str2, String str3) {
        checkInit();
        try {
            StringBuilder sb = new StringBuilder("register_expire");
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return Math.abs(System.currentTimeMillis() - preferences.getLong(sb.toString(), 0L)) > PushPreferenceUtils.getHttpRegInterval(0L);
        } catch (Throwable unused) {
            return true;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveRegVendorCurrentTimeMillis(String str, String str2, String str3, String str4) {
        checkInit();
        try {
            preferences.edit().putLong("reg_vendor_expire_" + str + str2 + str3 + str4, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveRegisterCurrentTimeMillis(String str, String str2, String str3) {
        checkInit();
        try {
            preferences.edit().putLong("register_expire" + str + str2 + str3, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void saveRegisterData(String str, String str2, String str3, String str4) {
        checkInit();
        String str5 = "register_" + str + str2 + str3;
        try {
            SharedPreferences.Editor editorEdit = preferences.edit();
            editorEdit.putString(str5, str4);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }
}
