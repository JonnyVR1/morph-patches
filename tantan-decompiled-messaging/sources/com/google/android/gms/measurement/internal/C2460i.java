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
public final class C2460i {

    /* JADX INFO: renamed from: b */
    public static final String[] f10509b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f10510a;

    public C2460i(Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.f10510a = map2;
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static int m15230a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2460i m15231c(SharedPreferences sharedPreferences) {
        HashMap map = new HashMap();
        String strM15233f = m15233f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(strM15233f) && strM15233f.length() > 754) {
            map.put("GoogleConsent", String.valueOf(strM15233f.charAt(DetectDelayStopHelper.TYPE_DETECT_AR_GIFT)));
        }
        int iM15230a = m15230a(sharedPreferences, "IABTCF_gdprApplies");
        if (iM15230a != -1) {
            map.put("gdprApplies", String.valueOf(iM15230a));
        }
        int iM15230a2 = m15230a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (iM15230a2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(iM15230a2));
        }
        int iM15230a3 = m15230a(sharedPreferences, "IABTCF_PolicyVersion");
        if (iM15230a3 != -1) {
            map.put("PolicyVersion", String.valueOf(iM15230a3));
        }
        String strM15233f2 = m15233f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(strM15233f2)) {
            map.put("PurposeConsents", strM15233f2);
        }
        int iM15230a4 = m15230a(sharedPreferences, "IABTCF_CmpSdkID");
        if (iM15230a4 != -1) {
            map.put("CmpSdkID", String.valueOf(iM15230a4));
        }
        return new C2460i(map);
    }

    /* JADX INFO: renamed from: d */
    public static String m15232d(String str, boolean z) {
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
    public static String m15233f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m15234b() {
        if (!"1".equals(this.f10510a.get("GoogleConsent")) || !"1".equals(this.f10510a.get("gdprApplies")) || !"1".equals(this.f10510a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int iM15238i = m15238i();
        if (iM15238i < 0) {
            return Bundle.EMPTY;
        }
        String str = this.f10510a.get("PurposeConsents");
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
        if (str.length() > 6 && iM15238i >= 4) {
            String str3 = zzje.zza.AD_USER_DATA.zze;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public final String m15235e() {
        StringBuilder sb = new StringBuilder("1");
        int iM15237h = m15237h();
        if (iM15237h < 0 || iM15237h > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iM15237h >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM15237h & 63));
        }
        int iM15238i = m15238i();
        if (iM15238i < 0 || iM15238i > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM15238i));
        }
        Preconditions.checkArgument(true);
        int i = "1".equals(this.f10510a.get("gdprApplies")) ? 2 : 0;
        int i2 = i | 4;
        if ("1".equals(this.f10510a.get("EnableAdvertiserConsentMode"))) {
            i2 = i | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2460i) {
            return m15236g().equalsIgnoreCase(((C2460i) obj).m15236g());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m15236g() {
        StringBuilder sb = new StringBuilder();
        for (String str : f10509b) {
            if (this.f10510a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(Constants.PACKNAME_END);
                }
                sb.append(str);
                sb.append("=");
                sb.append(this.f10510a.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final int m15237h() {
        try {
            String str = this.f10510a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return m15236g().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m15238i() {
        try {
            String str = this.f10510a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String toString() {
        return m15236g();
    }
}
