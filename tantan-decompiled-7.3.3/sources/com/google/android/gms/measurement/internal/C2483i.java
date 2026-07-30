package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.core.glcore.util.DetectDelayStopHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.meituan.robust.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C2483i {

    /* JADX INFO: renamed from: b */
    public static final String[] f10546b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f10547a;

    public C2483i(Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.f10547a = map2;
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static int m15284a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2483i m15285c(SharedPreferences sharedPreferences) {
        HashMap map = new HashMap();
        String strM15287f = m15287f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(strM15287f) && strM15287f.length() > 754) {
            map.put("GoogleConsent", String.valueOf(strM15287f.charAt(DetectDelayStopHelper.TYPE_DETECT_AR_GIFT)));
        }
        int iM15284a = m15284a(sharedPreferences, "IABTCF_gdprApplies");
        if (iM15284a != -1) {
            map.put("gdprApplies", String.valueOf(iM15284a));
        }
        int iM15284a2 = m15284a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (iM15284a2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(iM15284a2));
        }
        int iM15284a3 = m15284a(sharedPreferences, "IABTCF_PolicyVersion");
        if (iM15284a3 != -1) {
            map.put("PolicyVersion", String.valueOf(iM15284a3));
        }
        String strM15287f2 = m15287f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(strM15287f2)) {
            map.put("PurposeConsents", strM15287f2);
        }
        int iM15284a4 = m15284a(sharedPreferences, "IABTCF_CmpSdkID");
        if (iM15284a4 != -1) {
            map.put("CmpSdkID", String.valueOf(iM15284a4));
        }
        return new C2483i(map);
    }

    /* JADX INFO: renamed from: d */
    public static String m15286d(String str, boolean z) {
        if (!z || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 1;
        while (i < 64) {
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i)) {
                charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
                return String.valueOf(charArray);
            }
            i++;
        }
        i = 0;
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
        return String.valueOf(charArray);
    }

    /* JADX INFO: renamed from: f */
    public static String m15287f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m15288b() {
        if (!"1".equals(this.f10547a.get("GoogleConsent")) || !"1".equals(this.f10547a.get("gdprApplies")) || !"1".equals(this.f10547a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int iM15292i = m15292i();
        if (iM15292i < 0) {
            return Bundle.EMPTY;
        }
        String str = this.f10547a.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(zzje.zza.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(zzje.zza.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && iM15292i >= 4) {
            String str3 = zzje.zza.AD_USER_DATA.zze;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public final String m15289e() {
        StringBuilder sb = new StringBuilder("1");
        int iM15291h = m15291h();
        if (iM15291h < 0 || iM15291h > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iM15291h >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM15291h & 63));
        }
        int iM15292i = m15292i();
        if (iM15292i < 0 || iM15292i > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM15292i));
        }
        Preconditions.checkArgument(true);
        int i = "1".equals(this.f10547a.get("gdprApplies")) ? 2 : 0;
        int i2 = i | 4;
        if ("1".equals(this.f10547a.get("EnableAdvertiserConsentMode"))) {
            i2 = i | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2483i) {
            return m15290g().equalsIgnoreCase(((C2483i) obj).m15290g());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m15290g() {
        StringBuilder sb = new StringBuilder();
        for (String str : f10546b) {
            if (this.f10547a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(Constants.PACKNAME_END);
                }
                sb.append(str);
                sb.append("=");
                sb.append(this.f10547a.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final int m15291h() {
        try {
            String str = this.f10547a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return m15290g().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m15292i() {
        try {
            String str = this.f10547a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String toString() {
        return m15290g();
    }
}
