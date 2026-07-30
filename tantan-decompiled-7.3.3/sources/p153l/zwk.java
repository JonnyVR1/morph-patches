package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class zwk {
    /* JADX INFO: renamed from: a */
    public static boolean m221901a(String str) {
        return (m221910j().equals(str) || m221909i().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m221902b() {
        return "https://thetantanapp.com/child-safety-policy";
    }

    /* JADX INFO: renamed from: c */
    public static String m221903c() {
        return "https://thetantanapp.com/community-guidelines";
    }

    /* JADX INFO: renamed from: d */
    public static Context m221904d() {
        return App.f16088e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m221905e() {
        wyd0 wyd0Var = qv5.f159697a;
        return (wyd0Var == null || wyd0Var.get() == null || !qv5.f159697a.get().contains("staging")) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static String m221906f() {
        Locale locale = m221904d().getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: g */
    public static String m221907g() {
        return Uri.parse(ebe0.m120159a(m221905e() ? "http://m.staging2.p1staff.com/app-pages/core/doublelist/#/" : "https://m.tantanapp.com/app-pages/core/doublelist#/")).buildUpon().appendQueryParameter("lang", m221906f()).toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m221908h() {
        return Uri.parse(ebe0.m120159a(m221905e() ? "http://lp.staging2.p1staff.com/and_play/?id=21" : "https://lp.tantantribe.com/and_play/?id=21")).buildUpon().appendQueryParameter("lang", m221906f()).toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m221909i() {
        return Uri.parse(ebe0.m120159a("https://thetantanapp.com/privacy-policy")).buildUpon().appendQueryParameter("lang", m221906f()).appendQueryParameter("country", IntlCountryCodeController.m29107d(uqb0.f180400f0)).toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m221910j() {
        return Uri.parse(ebe0.m120159a("https://thetantanapp.com/terms-of-use")).buildUpon().appendQueryParameter("lang", m221906f()).toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m221911k() {
        return Uri.parse(ebe0.m120159a(m221905e() ? "http://lp.staging2.p1staff.com/and_play/?id=23" : "https://lp.tantanapp.com/and_play/?id=23")).buildUpon().appendQueryParameter("lang", m221906f()).toString();
    }
}
