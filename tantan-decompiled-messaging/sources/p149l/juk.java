package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class juk {
    /* JADX INFO: renamed from: a */
    public static boolean m143319a(String str) {
        return (m143328j().equals(str) || m143327i().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m143320b() {
        return "https://thetantanapp.com/child-safety-policy";
    }

    /* JADX INFO: renamed from: c */
    public static String m143321c() {
        return "https://thetantanapp.com/community-guidelines";
    }

    /* JADX INFO: renamed from: d */
    public static Context m143322d() {
        return App.f15369e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m143323e() {
        uqd0 uqd0Var = mu5.f135733a;
        return (uqd0Var == null || uqd0Var.get() == null || !mu5.f135733a.get().contains("staging")) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static String m143324f() {
        Locale locale = m143322d().getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: g */
    public static String m143325g() {
        return Uri.parse(a3e0.m94685a(m143323e() ? "http://m.staging2.p1staff.com/app-pages/core/doublelist/#/" : "https://m.tantanapp.com/app-pages/core/doublelist#/")).buildUpon().appendQueryParameter("lang", m143324f()).toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m143326h() {
        return Uri.parse(a3e0.m94685a(m143323e() ? "http://lp.staging2.p1staff.com/and_play/?id=21" : "https://lp.tantanapp.com/and_play/?id=21")).buildUpon().appendQueryParameter("lang", m143324f()).toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m143327i() {
        return Uri.parse(a3e0.m94685a("https://thetantanapp.com/privacy-policy")).buildUpon().appendQueryParameter("lang", m143324f()).appendQueryParameter("country", IntlCountryCodeController.m28108d(qib0.f154717f0)).toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m143328j() {
        return Uri.parse(a3e0.m94685a("https://thetantanapp.com/terms-of-use")).buildUpon().appendQueryParameter("lang", m143324f()).toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m143329k() {
        return Uri.parse(a3e0.m94685a(m143323e() ? "http://lp.staging2.p1staff.com/and_play/?id=23" : "https://lp.tantanapp.com/and_play/?id=23")).buildUpon().appendQueryParameter("lang", m143324f()).toString();
    }
}
