package p009l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import java.util.Locale;
import l.mu5;
import l.qib0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class juk {
    /* JADX INFO: renamed from: a */
    public static boolean m17217a(String str) {
        return (m17226j().equals(str) || m17225i().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m17218b() {
        return "https://thetantanapp.com/child-safety-policy";
    }

    /* JADX INFO: renamed from: c */
    public static String m17219c() {
        return "https://thetantanapp.com/community-guidelines";
    }

    /* JADX INFO: renamed from: d */
    public static Context m17220d() {
        return App.e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17221e() {
        uqd0 uqd0Var = mu5.a;
        return (uqd0Var == null || uqd0Var.get() == null || !((String) mu5.a.get()).contains("staging")) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static String m17222f() {
        Locale locale = m17220d().getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: g */
    public static String m17223g() {
        return Uri.parse(a3e0.m11185a(m17221e() ? "http://m.staging2.p1staff.com/app-pages/core/doublelist/#/" : "https://m.tantanapp.com/app-pages/core/doublelist#/")).buildUpon().appendQueryParameter("lang", m17222f()).toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m17224h() {
        return Uri.parse(a3e0.m11185a(m17221e() ? "http://lp.staging2.p1staff.com/and_play/?id=21" : "https://lp.tantanapp.com/and_play/?id=21")).buildUpon().appendQueryParameter("lang", m17222f()).toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m17225i() {
        return Uri.parse(a3e0.m11185a("https://thetantanapp.com/privacy-policy")).buildUpon().appendQueryParameter("lang", m17222f()).appendQueryParameter("country", IntlCountryCodeController.d(qib0.f0)).toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m17226j() {
        return Uri.parse(a3e0.m11185a("https://thetantanapp.com/terms-of-use")).buildUpon().appendQueryParameter("lang", m17222f()).toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m17227k() {
        return Uri.parse(a3e0.m11185a(m17221e() ? "http://lp.staging2.p1staff.com/and_play/?id=23" : "https://lp.tantanapp.com/and_play/?id=23")).buildUpon().appendQueryParameter("lang", m17222f()).toString();
    }
}
