package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class o0t0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static Uri m162167a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* JADX INFO: renamed from: b */
    public static String m162168b(Uri uri, Context context) {
        if (!vny0.m199078p().m152537p(context)) {
            return uri.toString();
        }
        String strM152522a = vny0.m199078p().m152522a(context);
        if (strM152522a == null) {
            return uri.toString();
        }
        String str = (String) d1s0.m109677c().m144697a(m7s0.f132209e0);
        String string = uri.toString();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132196d0)).booleanValue() && string.contains(str)) {
            vny0.m199078p().m152531j(context, strM152522a);
            return m162170d(string, context).replace(str, strM152522a);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = m162167a(m162170d(string, context), "fbs_aeid", strM152522a).toString();
        vny0.m199078p().m152531j(context, strM152522a);
        return string2;
    }

    /* JADX INFO: renamed from: c */
    public static String m162169c(String str, Context context, boolean z) {
        String strM152522a;
        if ((((Boolean) d1s0.m109677c().m144697a(m7s0.f132300l0)).booleanValue() && !z) || !vny0.m199078p().m152537p(context) || TextUtils.isEmpty(str) || (strM152522a = vny0.m199078p().m152522a(context)) == null) {
            return str;
        }
        String str2 = (String) d1s0.m109677c().m144697a(m7s0.f132209e0);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132196d0)).booleanValue() && str.contains(str2)) {
            if (vny0.m199080r().m12339K(str)) {
                vny0.m199078p().m152531j(context, strM152522a);
                return m162170d(str, context).replace(str2, strM152522a);
            }
            if (!vny0.m199080r().m12340L(str)) {
                return str;
            }
            vny0.m199078p().m152532k(context, strM152522a);
            return m162170d(str, context).replace(str2, strM152522a);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (vny0.m199080r().m12339K(str)) {
            vny0.m199078p().m152531j(context, strM152522a);
            return m162167a(m162170d(str, context), "fbs_aeid", strM152522a).toString();
        }
        if (!vny0.m199080r().m12340L(str)) {
            return str;
        }
        vny0.m199078p().m152532k(context, strM152522a);
        return m162167a(m162170d(str, context), "fbs_aeid", strM152522a).toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m162170d(String str, Context context) {
        String strM152525d = vny0.m199078p().m152525d(context);
        String strM152523b = vny0.m199078p().m152523b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strM152525d)) {
            str = m162167a(str, "gmp_app_id", strM152525d).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strM152523b)) ? str : m162167a(str, "fbs_aiid", strM152523b).toString();
    }
}
