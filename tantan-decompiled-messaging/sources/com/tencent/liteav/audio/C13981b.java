package com.tencent.liteav.audio;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;

/* JADX INFO: renamed from: com.tencent.liteav.audio.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13981b {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f57987a;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C13981b f57988a = new C13981b();
    }

    private C13981b() {
        this.f57987a = TXCCommonUtil.getAppContext().getSharedPreferences("txc_audio_settings", 0);
    }

    @SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: a */
    private void m82671a(String str, Object obj) {
        SharedPreferences.Editor editorEdit = this.f57987a.edit();
        if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof String) {
            editorEdit.putString(str, obj.toString());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            editorEdit.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    private Object m82672b(String str, Object obj) {
        try {
            if (obj instanceof String) {
                return this.f57987a.getString(str, obj.toString());
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(this.f57987a.getInt(str, ((Integer) obj).intValue()));
            }
            if (obj instanceof Boolean) {
                return Boolean.valueOf(this.f57987a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (obj instanceof Long) {
                return Long.valueOf(this.f57987a.getLong(str, ((Long) obj).longValue()));
            }
            if (obj instanceof Float) {
                return Float.valueOf(this.f57987a.getFloat(str, ((Float) obj).floatValue()));
            }
            return obj instanceof Double ? Double.valueOf(Double.longBitsToDouble(this.f57987a.getLong(str, Double.doubleToLongBits(((Double) obj).doubleValue())))) : obj;
        } catch (Exception e) {
            TXCLog.m82968e("TXCAudioSettings", "get value from sharedpreference failed for key: %s", str, e);
            return obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82673a(String str, long j) {
        m82671a(str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public static C13981b m82670a() {
        return a.f57988a;
    }

    /* JADX INFO: renamed from: b */
    public long m82674b(String str, long j) {
        return ((Long) m82672b(str, Long.valueOf(j))).longValue();
    }
}
