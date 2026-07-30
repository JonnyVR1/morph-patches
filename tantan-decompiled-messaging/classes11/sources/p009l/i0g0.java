package p009l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.WebViewPreAct;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Triple;
import l.ddj0;
import l.e51;
import l.evk;
import l.it6;
import l.j760;
import l.jjb0;
import l.q0l0;
import l.qib0;
import l.t0g0;
import l.t100;
import l.vwb;
import l.w2c0;
import l.w9j;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i0g0 extends t0g0 {

    /* JADX INFO: renamed from: b */
    public static final DecimalFormat f14350b = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: c */
    public static final DecimalFormat f14351c = new DecimalFormat("##");

    /* JADX INFO: renamed from: d */
    public static final int[] f14352d = {-7364944, -3151144, -4800290, -69953, -3487262, -544604, -2892061, -2701082};

    /* JADX INFO: renamed from: e */
    public static final int[] f14353e = {-12692369, -15507411, -13349471, -5668592, -11448195, -4902116, -13601894, -10410317};

    /* JADX INFO: renamed from: f */
    public static final int[] f14354f = {-11508612, -15162810, -15186224, -2051276, -10395512, -2463917, -9131062, -11683768};

    /* JADX INFO: renamed from: g */
    public static final int[] f14355g = {-1250068, -1250068, -1250068, -1250068, -1250068, -1250068, -1250068, -1250068};

    /* JADX INFO: renamed from: l.i0g0$a */
    public class C0946a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f14356a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f14357b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14358c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Typeface f14359d;

        public C0946a(Activity activity, String str, String str2, Typeface typeface) {
            this.f14356a = activity;
            this.f14357b = str;
            this.f14358c = str2;
            this.f14359d = typeface;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f14356a;
            AccountTempApi accountTempApi = qib0.L;
            String str = this.f14357b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m9723J0(activity, str, this.f14358c) : WebViewAct.m10498Z1(activity, str, this.f14358c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setTypeface(this.f14359d);
        }
    }

    /* JADX INFO: renamed from: l.i0g0$b */
    public class C0947b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f14360a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f14361b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14362c;

        public C0947b(String str, Activity activity, String str2) {
            this.f14360a = str;
            this.f14361b = activity;
            this.f14362c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (TextUtils.equals(this.f14360a, "BusinessLicenseAct")) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.f14361b, "com.p1.mobile.putong.core.ui.settings.BusinessLicenseAct"));
                this.f14361b.startActivity(intent);
            } else {
                Activity activity = this.f14361b;
                AccountTempApi accountTempApi = qib0.L;
                String str = this.f14362c;
                activity.startActivity(accountTempApi == null ? WebViewPreAct.m9723J0(activity, str, this.f14360a) : WebViewAct.m10498Z1(activity, str, this.f14360a));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setTypeface(Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: l.i0g0$c */
    public class C0948c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f14363a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f14364b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14365c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f14366d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Typeface f14367e;

        public C0948c(String str, Activity activity, String str2, int i, Typeface typeface) {
            this.f14363a = str;
            this.f14364b = activity;
            this.f14365c = str2;
            this.f14366d = i;
            this.f14367e = typeface;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            String strReplace = this.f14363a.replace("《", "").replace("》", "");
            Activity activity = this.f14364b;
            AccountTempApi accountTempApi = qib0.L;
            String str = this.f14365c;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m9723J0(activity, strReplace, str) : WebViewAct.m10498Z1(activity, strReplace, str));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f14366d);
            textPaint.setTypeface(this.f14367e);
        }
    }

    /* JADX INFO: renamed from: A */
    public static SpannableStringBuilder m16102A(Activity activity, Typeface typeface, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new C0946a(activity, str2, strArr[i + 1], typeface), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: B */
    public static SpannableStringBuilder m16103B(Activity activity, String str, String... strArr) {
        return m16102A(activity, Typeface.DEFAULT, str, strArr);
    }

    /* JADX INFO: renamed from: C */
    public static SpannableStringBuilder m16104C(Activity activity, String str, Triple<String, String, Integer>... tripleArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < tripleArr.length; i++) {
            String str2 = (String) tripleArr[i].getFirst();
            String str3 = (String) tripleArr[i].getSecond();
            int iIntValue = ((Integer) tripleArr[i].getThird()).intValue();
            if (iIntValue == 0) {
                iIntValue = str.indexOf(str2);
            } else if (iIntValue < 0) {
                iIntValue = str.lastIndexOf(str2);
            }
            spannableStringBuilder.setSpan(new C0947b(str3, activity, str2), iIntValue, str2.length() + iIntValue, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: D */
    public static SpannableStringBuilder m16105D(Activity activity, int i, String str, String... strArr) {
        return m16106E(activity, Typeface.DEFAULT, i, str, strArr);
    }

    /* JADX INFO: renamed from: E */
    public static SpannableStringBuilder m16106E(Activity activity, Typeface typeface, int i, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str2 = strArr[i2];
            Activity activity2 = activity;
            Typeface typeface2 = typeface;
            int i3 = i;
            spannableStringBuilder.setSpan(new C0948c(str2, activity2, strArr[i2 + 1], i3, typeface2), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            i2 += 2;
            activity = activity2;
            i = i3;
            typeface = typeface2;
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: F */
    public static String m16107F(double d, int i) {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (language.startsWith("en") || language.startsWith("th")) {
                    return Math.round((10.0d - d) * 10.0d) + "%";
                }
                if (language.startsWith("ko")) {
                    return Math.round(d * 10.0d) + "%";
                }
            }
        }
        if (i == 1) {
            return t0g0.d(d);
        }
        return i == 2 ? t0g0.e(d) : String.valueOf(Math.round(d));
    }

    /* JADX INFO: renamed from: G */
    public static String m16108G(int i) {
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: H */
    public static String m16109H(double d) {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (language.startsWith("zh")) {
                    return new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.ENGLISH)).format(d);
                }
                return Math.round((10.0d - d) * 10.0d) + "%";
            }
        }
        return new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.ENGLISH)).format(d);
    }

    /* JADX INFO: renamed from: I */
    public static j760<String, String> m16110I(String str) {
        String upperCase = "#";
        if (str == null) {
            return new j760<>("#", "");
        }
        String strD = evk.c().d(str);
        if (strD != null && strD.length() > 0) {
            String strSubstring = strD.substring(0, 1);
            Locale locale = Locale.CHINESE;
            String upperCase2 = strSubstring.toUpperCase(locale);
            if (upperCase2.matches("[A-Z]")) {
                upperCase = upperCase2.toUpperCase(locale);
            }
        }
        return new j760<>(upperCase, strD.toUpperCase(Locale.CHINESE));
    }

    /* JADX INFO: renamed from: J */
    public static int m16111J(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            i = t0g0.h(charSequence.charAt(i2)) ? i + 2 : i + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: K */
    public static double m16112K(double d) {
        return d * 6.214E-4d;
    }

    /* JADX INFO: renamed from: L */
    public static double m16113L(double d) {
        return d * 1609.344d;
    }

    /* JADX INFO: renamed from: M */
    public static SpannableStringBuilder m16114M(String str, int i, int i2, Typeface typeface, int i3) {
        Matcher matcher = Pattern.compile("-?[0-9]\\d*").matcher(str.substring(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i2, i3), matcher.start() + i, matcher.end() + i, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: N */
    public static SpannableStringBuilder m16115N(String str, int i, Typeface typeface) {
        return m16116O(str, i, typeface, 0);
    }

    /* JADX INFO: renamed from: O */
    public static SpannableStringBuilder m16116O(String str, int i, Typeface typeface, int i2) {
        return m16114M(str, 0, i, typeface, i2);
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m16117P(Location location, boolean z, CharacterStyle characterStyle, String str) {
        String str2;
        String str3;
        String str4;
        Location locationClone = location.clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationClone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationClone.region.district = null;
            }
        }
        Region region = locationClone.region;
        User userMe_ = e51.D() ? qib0.c0.me_() : qib0.c0.queryMe();
        if (userMe_ != null) {
            Region region2 = userMe_.location.region;
            if (TextUtils.isEmpty(region.district) || !region.equals(region2)) {
                if (!TextUtils.isEmpty(region.district) && !TextUtils.isEmpty(region.city) && region.city.equals(region2.city) && !TextUtils.isEmpty(region.country) && region.country.equals(region2.country)) {
                    String string = App.e.getResources().getString(R.string.L1, region.district, str);
                    if (z && (str4 = region.district) != null && !string.startsWith(str4)) {
                        string = it6.d(string);
                    }
                    return z ? ddj0.f(string, region.district, characterStyle) : string;
                }
                if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.country) && region.country.equals(region2.country)) {
                    String string2 = App.e.getResources().getString(R.string.I1, region.city, str);
                    if (z && (str3 = region.city) != null && !string2.startsWith(str3)) {
                        string2 = it6.d(string2);
                    }
                    return z ? ddj0.f(string2, region.city, characterStyle) : string2;
                }
                if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && region.city != null) {
                    String string3 = App.e.getResources().getString(R.string.J1, region.city, region.country);
                    if (z && (str2 = region.city) != null && !string3.startsWith(str2)) {
                        string3 = it6.d(string3);
                    }
                    return z ? ddj0.f(string3, string3, characterStyle) : string3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static CharSequence m16118Q(Location location, String str) {
        Location locationClone = location.clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationClone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationClone.region.district = null;
            }
        }
        Region region = locationClone.region;
        User userMe_ = e51.D() ? qib0.c0.me_() : qib0.c0.queryMe();
        if (userMe_ != null) {
            Region region2 = userMe_.location.region;
            if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.district) && region.city.equals(region2.city) && region.district.equals(region2.district)) {
                return location.distance <= 10000 ? App.e.getResources().getString(R.string.L1, region.district, str) : App.e.getResources().getString(R.string.K1, region.district);
            }
            if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.district) && region.city.equals(region2.city) && !region.district.equals(region2.district)) {
                return App.e.getResources().getString(R.string.I1, region.city, "同城");
            }
            if (!TextUtils.isEmpty(region.country) && !TextUtils.isEmpty(region.city) && region.country.equals(region2.country) && !region.city.equals(region2.city)) {
                return App.e.getResources().getString(R.string.K1, region.city);
            }
            if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && !TextUtils.isEmpty(region.city)) {
                return String.format("%1$s，%2$s", region.country, region.city);
            }
            if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && TextUtils.isEmpty(region.city)) {
                return App.e.getResources().getString(R.string.K1, region.country);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static CharSequence m16119R(Location location) {
        return m16120S(location, false, null);
    }

    /* JADX INFO: renamed from: S */
    public static CharSequence m16120S(Location location, boolean z, CharacterStyle characterStyle) {
        return m16121T(location, z, characterStyle, false);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: T */
    public static CharSequence m16121T(Location location, boolean z, CharacterStyle characterStyle, boolean z2) {
        return m16122U(location, z, characterStyle, z2, false);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: U */
    public static CharSequence m16122U(Location location, boolean z, CharacterStyle characterStyle, boolean z2, boolean z3) {
        if (location.isHideInfo() && location.isHideRegionCountry()) {
            return "";
        }
        String strM16146r = z3 ? m16146r(location.clone(), true, false) : m16145q(location.clone(), true);
        if (z2 && strM16146r.equals(m16144p(0, true))) {
            if (IntlCountryCodeController.f()) {
                strM16146r = "1 " + App.e.getString(R.string.V);
            } else {
                strM16146r = "1" + App.e.getString(R.string.J0);
            }
        }
        CharSequence charSequenceM16117P = m16117P(location, z, characterStyle, strM16146r);
        return !TextUtils.isEmpty(charSequenceM16117P) ? charSequenceM16117P : String.format(App.e.getString(R.string.K1), strM16146r);
    }

    /* JADX INFO: renamed from: V */
    public static CharSequence m16123V(User user, Location location) {
        int i = location.distance;
        if (i <= 1000) {
            if (i == 1000) {
                return "1km";
            }
            StringBuilder sb = new StringBuilder();
            int i2 = location.distance;
            if (i2 <= 100) {
                i2 = 100;
            }
            sb.append(i2);
            sb.append(App.e.getString(R.string.J0));
            return sb.toString();
        }
        Location locationClone = location.clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationClone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationClone.region.district = null;
            }
        }
        Region region = locationClone.region;
        Region region2 = user.location.region;
        String str = region.country;
        String str2 = region2.country;
        String str3 = region.city;
        String str4 = region2.city;
        String str5 = region.district;
        if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
            if (TextUtils.isEmpty(str3)) {
                return str;
            }
            return str + " · " + str3;
        }
        int iM9656y = 50;
        try {
            if (!TextUtils.isEmpty(RemoteConfig.m9619x().m9623F("distance"))) {
                iM9656y = RemoteConfig.m9619x().m9656y("distance");
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str) && str.equals(str2) && !TextUtils.isEmpty(str3) && !str3.equals(str4)) {
            if (location.distance / 1000 > iM9656y) {
                return str3;
            }
            return str3 + " (" + (location.distance / 1000) + "km)";
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        if (TextUtils.isEmpty(str5)) {
            str5 = "";
        }
        sb2.append(str5);
        sb2.append(" (");
        sb2.append(location.distance / 1000);
        sb2.append("km) ");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: W */
    public static CharSequence m16124W(Location location) {
        return m16125X(location, false);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: X */
    public static CharSequence m16125X(Location location, boolean z) {
        String str = "";
        if (location.isHideInfo() && location.isHideRegionCountry()) {
            return "";
        }
        User userMe_ = e51.D() ? qib0.c0.me_() : qib0.c0.queryMe();
        if (userMe_ == null) {
            return null;
        }
        if (!location.isHideInfo() || !location.isHideDistance()) {
            int i = location.distance;
            if (i <= 1000) {
                if (userMe_.isFemale()) {
                    str = "附近（1km之内）";
                } else {
                    int i2 = location.distance;
                    int i3 = location.distance;
                    if (i2 == 1000) {
                        str = f14350b.format(i3 / 1000.0f) + App.e.getString(R.string.v0);
                    } else {
                        str = (((int) Math.ceil(i3 / 100.0f)) * 100) + App.e.getString(R.string.J0);
                    }
                }
            } else if (i <= 10000) {
                str = f14350b.format(location.distance / 1000.0f) + App.e.getString(R.string.v0);
            }
        }
        if (z && str.equals(m16144p(0, true))) {
            if (IntlCountryCodeController.f()) {
                str = "1 " + App.e.getString(R.string.V);
            } else {
                str = "1" + App.e.getString(R.string.J0);
            }
        }
        if (location.distance > 1000) {
            CharSequence charSequenceM16118Q = m16118Q(location, str);
            if (!TextUtils.isEmpty(charSequenceM16118Q)) {
                return charSequenceM16118Q;
            }
        }
        return String.format(App.e.getString(R.string.K1), str);
    }

    /* JADX INFO: renamed from: Y */
    public static CharSequence m16126Y(Location location) {
        Settings settings;
        User userMe_ = e51.D() ? qib0.c0.me_() : qib0.c0.queryMe();
        if (userMe_ == null || (settings = userMe_.settings) == null) {
            return "";
        }
        if (location.isHideInfo() && location.isHideRegionCountry()) {
            return "";
        }
        if (!jjb0.c() || settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue() || location.distance <= settings.getSearchRadius().intValue()) {
            return m16123V(userMe_, location);
        }
        j760<String, String> j760VarM16127Z = m16127Z(userMe_, location, false);
        return ((String) j760VarM16127Z.a) + ((String) j760VarM16127Z.b);
    }

    /* JADX INFO: renamed from: Z */
    public static j760<String, String> m16127Z(User user, Location location, boolean z) {
        String str;
        Location locationClone = location.clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationClone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationClone.region.district = null;
            }
        }
        Region region = locationClone.region;
        Region region2 = user.location.region;
        String str2 = region.country;
        String str3 = region2.country;
        String str4 = region.city;
        String str5 = region2.city;
        String str6 = region.district;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = region.province;
        boolean z2 = false;
        boolean z3 = z && !TextUtils.isEmpty(str7);
        int i = location.distance;
        if (i <= 50000) {
            if (i < 1000) {
                str = "(" + Math.max(i, 100) + "m)";
            } else {
                str = "(" + (i / 1000) + "km)";
            }
            if (!TextUtils.isEmpty(str4) && str4.equals(str5)) {
                return j760.a(str4.concat(str6), str);
            }
            if (!TextUtils.isEmpty(str2) && str2.equals(str3) && !TextUtils.isEmpty(str4) && !str4.equals(str5)) {
                if (z3 && !str4.contains(str7)) {
                    z2 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(z2 ? str7 : "");
                sb.append(str4);
                return j760.a(sb.toString(), str);
            }
        }
        if (!TextUtils.isEmpty(str4) && str4.equals(str5)) {
            return j760.a(str4.concat(str6), "");
        }
        if (!TextUtils.isEmpty(str2) && !str2.equals(str3)) {
            if (!TextUtils.isEmpty(str4)) {
                str2 = str2 + " · " + str4;
            }
            return j760.a(str2, "");
        }
        if (TextUtils.isEmpty(str4) || str4.equals(str5)) {
            return j760.a("", "");
        }
        if (z3 && !str4.contains(str7)) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!z2) {
            str7 = "";
        }
        sb2.append(str7);
        sb2.append(str4);
        return j760.a(sb2.toString(), "");
    }

    /* JADX INFO: renamed from: a0 */
    public static SpannableStringBuilder m16128a0(String str, char c, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        int iIndexOf = str.indexOf(c);
        spannableStringBuilder.setSpan(new ImageSpan(drawable), iIndexOf, iIndexOf + 1, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b0 */
    public static SpannableStringBuilder m16129b0(String str, ArrayList<String> arrayList, final int i, Typeface typeface) {
        return m16130c0(str, arrayList, vwb.Q(arrayList, new w9j() { // from class: l.h0g0
            public final Object call(Object obj) {
                return Integer.valueOf(i);
            }
        }), typeface);
    }

    /* JADX INFO: renamed from: c0 */
    public static SpannableStringBuilder m16130c0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface) {
        return m16131d0(str, arrayList, arrayList2, typeface, 0);
    }

    /* JADX INFO: renamed from: d0 */
    public static SpannableStringBuilder m16131d0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = arrayList.get(i2);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, arrayList2.get(i2).intValue(), i), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e0 */
    public static SpannableStringBuilder m16132e0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, ArrayList<Integer> arrayList3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < arrayList.size(); i++) {
            String str2 = arrayList.get(i);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, arrayList2.get(i).intValue(), arrayList3.get(i).intValue()), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f0 */
    public static SpannableStringBuilder m16133f0(String str, ArrayList<String> arrayList, int i, Typeface typeface) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = arrayList.get(i2);
            iIndexOf = str.indexOf(str2, iIndexOf);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i), iIndexOf, str2.length() + iIndexOf, 33);
                iIndexOf += str2.length();
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    public static SpannableStringBuilder m16134g0(String str, ArrayList<String> arrayList, int i, ArrayList<Typeface> arrayList2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = arrayList.get(i2);
            iIndexOf = str.indexOf(str2, iIndexOf);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", arrayList2.get(i2), i), iIndexOf, str2.length() + iIndexOf, 33);
                iIndexOf += str2.length();
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: h0 */
    public static String m16135h0(int i) {
        if (Network.language().startsWith("zh")) {
            if (i > 10000) {
                return (i / 10000) + "万+";
            }
            return i + "";
        }
        if (i > 1000) {
            return (i / 1000) + "k+";
        }
        return i + "";
    }

    /* JADX INFO: renamed from: i0 */
    public static String m16136i0(int i) {
        if (Network.language().startsWith("zh")) {
            if (i > 10000) {
                return "1万+";
            }
            return i + "";
        }
        if (i > 10000) {
            return "10k+";
        }
        return i + "";
    }

    /* JADX INFO: renamed from: j0 */
    public static String m16137j0(ProfileZodiac profileZodiac) {
        return m16138k0(profileZodiac, false);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m16138k0(ProfileZodiac profileZodiac, boolean z) {
        Application application = App.e;
        int i = R.string.v3;
        if (profileZodiac != null) {
            String string = profileZodiac.toString();
            string.getClass();
            switch (string) {
                case "aquarius":
                    i = R.string.k3;
                    break;
                case "capricorn":
                    i = R.string.n3;
                    break;
                case "cancer":
                    i = R.string.m3;
                    break;
                case "gemini":
                    i = R.string.o3;
                    break;
                case "pisces":
                    i = R.string.r3;
                    break;
                case "taurus":
                    i = R.string.u3;
                    break;
                case "leo":
                    i = R.string.p3;
                    break;
                case "aries":
                    i = R.string.l3;
                    break;
                case "libra":
                    i = R.string.q3;
                    break;
                case "virgo":
                    i = R.string.w3;
                    break;
                case "scorpio":
                    i = R.string.t3;
                    break;
                case "sagittarius":
                    i = R.string.s3;
                    break;
            }
        }
        if (z && i == R.string.v3) {
            return null;
        }
        return application.getResources().getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX INFO: renamed from: l0 */
    public static int m16139l0(ProfileZodiac profileZodiac) {
        Integer numValueOf;
        if (profileZodiac != null) {
            String string = profileZodiac.toString();
            string.getClass();
            switch (string) {
                case "aquarius":
                    numValueOf = Integer.valueOf(Color.parseColor("#7e225b"));
                    break;
                case "capricorn":
                    numValueOf = Integer.valueOf(Color.parseColor("#7144b0"));
                    break;
                case "cancer":
                    numValueOf = Integer.valueOf(Color.parseColor("#fcca2c"));
                    break;
                case "gemini":
                    numValueOf = Integer.valueOf(Color.parseColor("#d99d42"));
                    break;
                case "pisces":
                    numValueOf = Integer.valueOf(Color.parseColor("#cf69b2"));
                    break;
                case "taurus":
                    numValueOf = Integer.valueOf(Color.parseColor("#fb7a20"));
                    break;
                case "leo":
                    numValueOf = Integer.valueOf(Color.parseColor("#a4c742"));
                    break;
                case "aries":
                    numValueOf = Integer.valueOf(Color.parseColor("#d2471c"));
                    break;
                case "libra":
                    numValueOf = Integer.valueOf(Color.parseColor("#269f7a"));
                    break;
                case "virgo":
                    numValueOf = Integer.valueOf(Color.parseColor("#14862d"));
                    break;
                case "scorpio":
                    numValueOf = Integer.valueOf(Color.parseColor("#267897"));
                    break;
                case "sagittarius":
                    numValueOf = Integer.valueOf(Color.parseColor("#364496"));
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Color.parseColor("#d2471c"));
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: m0 */
    public static j760<Integer, String> m16141m0(ProfileZodiac profileZodiac) {
        Application application = App.e;
        int i = R.string.l3;
        int i2 = w2c0.r;
        if (profileZodiac != null) {
            String string = profileZodiac.toString();
            string.getClass();
            switch (string) {
                case "aquarius":
                    i = R.string.k3;
                    i2 = w2c0.l;
                    break;
                case "capricorn":
                    i = R.string.n3;
                    i2 = w2c0.p;
                    break;
                case "cancer":
                    i = R.string.m3;
                    i2 = w2c0.n;
                    break;
                case "gemini":
                    i = R.string.o3;
                    i2 = w2c0.k;
                    break;
                case "pisces":
                    i = R.string.r3;
                    i2 = w2c0.u;
                    break;
                case "taurus":
                    i = R.string.u3;
                    i2 = w2c0.q;
                    break;
                case "leo":
                    i = R.string.p3;
                    i2 = w2c0.t;
                    break;
                case "aries":
                    i = R.string.l3;
                    i2 = w2c0.r;
                    break;
                case "libra":
                    i = R.string.q3;
                    i2 = w2c0.j;
                    break;
                case "virgo":
                    i = R.string.w3;
                    i2 = w2c0.o;
                    break;
                case "scorpio":
                    i = R.string.t3;
                    i2 = w2c0.m;
                    break;
                case "sagittarius":
                    i = R.string.s3;
                    i2 = w2c0.s;
                    break;
            }
        }
        return j760.a(Integer.valueOf(i2), i == -1 ? null : application.getResources().getString(i));
    }

    /* JADX INFO: renamed from: n */
    public static void m16142n(TextView textView, Drawable drawable) {
        int iD = t100.d(4.0f);
        drawable.setBounds(iD, 0, drawable.getIntrinsicWidth() + iD, drawable.getIntrinsicHeight());
        q0l0 q0l0Var = new q0l0(drawable);
        SpannableString spannableString = new SpannableString("icon");
        spannableString.setSpan(q0l0Var, 0, 4, 33);
        textView.append(spannableString);
    }

    /* JADX INFO: renamed from: o */
    public static int m16143o(BloodType bloodType) {
        int color = Color.parseColor("#f5a32c");
        if (bloodType != null) {
            String string = bloodType.toString();
            string.getClass();
            switch (string) {
                case "A":
                    return Color.parseColor("#f5a32c");
                case "B":
                    return Color.parseColor("#f63b4d");
                case "O":
                    return Color.parseColor("#39ad68");
                case "AB":
                    return Color.parseColor("#8639ca");
            }
        }
        return color;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static String m16144p(int i, boolean z) {
        if (!IntlCountryCodeController.f()) {
            if (i < 1000) {
                return "1" + App.e.getString(R.string.v0);
            }
            if (i < 10000) {
                return f14350b.format(i / 1000.0f) + App.e.getString(R.string.v0);
            }
            return f14351c.format(i / 1000.0f) + App.e.getString(R.string.v0);
        }
        double d = ((double) i) * 3.28083993d;
        if (d < 1000.0d) {
            return "1 " + App.e.getString(R.string.L0);
        }
        double d2 = d * 1.8939E-4d;
        if (d2 >= 2.0d) {
            return f14351c.format(d2) + " " + App.e.getString(R.string.K0);
        }
        if (d2 == 1.0d) {
            return f14351c.format(d2) + " " + App.e.getString(R.string.L0);
        }
        if (d2 <= 1.0d) {
            return "1 " + App.e.getString(R.string.L0);
        }
        return f14350b.format(d2) + " " + App.e.getString(R.string.K0);
    }

    /* JADX INFO: renamed from: q */
    public static String m16145q(Location location, boolean z) {
        return (location.isHideInfo() && location.isHideDistance()) ? "" : m16144p(location.distance, z);
    }

    /* JADX INFO: renamed from: r */
    public static String m16146r(Location location, boolean z, boolean z2) {
        return (location.isHideInfo() && location.isHideDistance()) ? "" : m16147s(location.distance, z, z2);
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static String m16147s(int i, boolean z, boolean z2) {
        if (IntlCountryCodeController.f()) {
            return m16144p(i, z);
        }
        if (i < 100 || i < 500 || i < 1000) {
            return "<1km";
        }
        if (!z2) {
            return (i / 1000) + App.e.getString(R.string.v0);
        }
        if (i < 13000) {
            return (i / 1000) + App.e.getString(R.string.v0);
        }
        if (i < 24000) {
            return "13" + App.e.getString(R.string.h0);
        }
        return "24" + App.e.getString(R.string.h0);
    }

    /* JADX INFO: renamed from: t */
    public static String m16148t(int i) {
        if (Network.language().startsWith("zh")) {
            if (i <= 10000) {
                return i + "";
            }
            return new DecimalFormat("#.0").format(i / 10000.0f) + "万";
        }
        if (i <= 1000) {
            return i + "";
        }
        return new DecimalFormat("#.0").format(i / 1000.0f) + "k";
    }

    /* JADX INFO: renamed from: u */
    public static String m16149u(int i) {
        if (i > 10000) {
            return new DecimalFormat("#.0").format(i / 10000.0f) + "w";
        }
        if (i <= 1000) {
            return i + "";
        }
        return new DecimalFormat("#.0").format(i / 1000.0f) + "k";
    }

    /* JADX INFO: renamed from: v */
    public static String m16150v(double d) {
        if (Network.language().startsWith("zh")) {
            return d > 9999.0d ? String.format(Locale.US, "%s万", t0g0.d(Math.floor(d / 1000.0d) / 10.0d)) : t0g0.e(d);
        }
        return d > 999.0d ? String.format(Locale.US, "%sk", t0g0.d(Math.floor(d / 100.0d) / 10.0d)) : t0g0.e(d);
    }

    /* JADX INFO: renamed from: w */
    public static String m16151w(Act act, String str) {
        try {
            int i = (int) (Long.parseLong(str) % 5);
            if (i == 0) {
                return act.getString(R.string.M0);
            }
            if (i == 1) {
                return act.getString(R.string.N0);
            }
            if (i == 2) {
                return act.getString(R.string.O0);
            }
            if (i != 3) {
                return i != 4 ? "" : act.getString(R.string.Q0);
            }
            return act.getString(R.string.P0);
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m16152x(Act act, String str) {
        try {
            int i = (int) (Long.parseLong(str) % 3);
            if (i == 0) {
                return act.getString(R.string.R0);
            }
            if (i != 1) {
                return i != 2 ? "" : act.getString(R.string.T0);
            }
            return act.getString(R.string.S0);
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m16153y() {
        String strLanguage = Network.language();
        if (strLanguage.startsWith("zh-Hant")) {
            return "zh-TW";
        }
        if (strLanguage.startsWith("zh-Hans")) {
            return "zh-CN";
        }
        if (strLanguage.startsWith("en")) {
            return "en-US";
        }
        if (strLanguage.startsWith("ko")) {
            return "ko-KR";
        }
        if (strLanguage.startsWith("ja")) {
            return "ja-JP";
        }
        if (strLanguage.startsWith("id")) {
            return "id-ID";
        }
        if (strLanguage.startsWith("th")) {
            return "th-TH";
        }
        return strLanguage.startsWith("ru") ? "ru-RU" : "en-US";
    }

    /* JADX INFO: renamed from: z */
    public static String m16154z(int i) {
        if (i >= 1 && i <= 2) {
            return "1+";
        }
        if (i >= 3 && i <= 9) {
            return "3+";
        }
        if (i >= 10 && i <= 98) {
            return "10+";
        }
        if (i >= 99) {
            return "99+";
        }
        return null;
    }
}
