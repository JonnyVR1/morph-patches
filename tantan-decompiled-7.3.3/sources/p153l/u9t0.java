package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class u9t0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static Uri m195117a(String str, String str2, String str3) {
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
    public static String m195118b(Uri uri, Context context) {
        if (!bxy0.m106932p().m185241p(context)) {
            return uri.toString();
        }
        String strM185226a = bxy0.m106932p().m185226a(context);
        if (strM185226a == null) {
            return uri.toString();
        }
        String str = (String) jas0.m144075c().m176505a(sgs0.f168280e0);
        String string = uri.toString();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168267d0)).booleanValue() && string.contains(str)) {
            bxy0.m106932p().m185235j(context, strM185226a);
            return m195120d(string, context).replace(str, strM185226a);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = m195117a(m195120d(string, context), "fbs_aeid", strM185226a).toString();
        bxy0.m106932p().m185235j(context, strM185226a);
        return string2;
    }

    /* JADX INFO: renamed from: c */
    public static String m195119c(String str, Context context, boolean z) {
        String strM185226a;
        if ((((Boolean) jas0.m144075c().m176505a(sgs0.f168371l0)).booleanValue() && !z) || !bxy0.m106932p().m185241p(context) || TextUtils.isEmpty(str) || (strM185226a = bxy0.m106932p().m185226a(context)) == null) {
            return str;
        }
        String str2 = (String) jas0.m144075c().m176505a(sgs0.f168280e0);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168267d0)).booleanValue() && str.contains(str2)) {
            if (bxy0.m106934r().m12393K(str)) {
                bxy0.m106932p().m185235j(context, strM185226a);
                return m195120d(str, context).replace(str2, strM185226a);
            }
            if (!bxy0.m106934r().m12394L(str)) {
                return str;
            }
            bxy0.m106932p().m185236k(context, strM185226a);
            return m195120d(str, context).replace(str2, strM185226a);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (bxy0.m106934r().m12393K(str)) {
            bxy0.m106932p().m185235j(context, strM185226a);
            return m195117a(m195120d(str, context), "fbs_aeid", strM185226a).toString();
        }
        if (!bxy0.m106934r().m12394L(str)) {
            return str;
        }
        bxy0.m106932p().m185236k(context, strM185226a);
        return m195117a(m195120d(str, context), "fbs_aeid", strM185226a).toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m195120d(String str, Context context) {
        String strM185229d = bxy0.m106932p().m185229d(context);
        String strM185227b = bxy0.m106932p().m185227b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strM185229d)) {
            str = m195117a(str, "gmp_app_id", strM185229d).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strM185227b)) ? str : m195117a(str, "fbs_aiid", strM185227b).toString();
    }
}
