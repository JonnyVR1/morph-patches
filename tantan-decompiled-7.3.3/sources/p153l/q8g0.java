package p153l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Triple;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes10.dex */
public class q8g0 extends a9g0 {

    /* JADX INFO: renamed from: b */
    public static final DecimalFormat f156109b = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: c */
    public static final DecimalFormat f156110c = new DecimalFormat("##");

    /* JADX INFO: renamed from: d */
    public static final int[] f156111d = {-7364944, -3151144, -4800290, -69953, -3487262, -544604, -2892061, -2701082};

    /* JADX INFO: renamed from: e */
    public static final int[] f156112e = {-12692369, -15507411, -13349471, -5668592, -11448195, -4902116, -13601894, -10410317};

    /* JADX INFO: renamed from: f */
    public static final int[] f156113f = {-11508612, -15162810, -15186224, -2051276, -10395512, -2463917, -9131062, -11683768};

    /* JADX INFO: renamed from: g */
    public static final int[] f156114g = {-1250068, -1250068, -1250068, -1250068, -1250068, -1250068, -1250068, -1250068};

    /* JADX INFO: renamed from: l.q8g0$a */
    public class C19537a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f156115a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f156116b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f156117c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Typeface f156118d;

        public C19537a(Activity activity, String str, String str2, Typeface typeface) {
            this.f156115a = activity;
            this.f156116b = str;
            this.f156117c = str2;
            this.f156118d = typeface;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f156115a;
            AccountTempApi accountTempApi = uqb0.f180380L;
            String str = this.f156116b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m80585K0(activity, str, this.f156117c) : WebViewAct.m81347a2(activity, str, this.f156117c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setTypeface(this.f156118d);
        }
    }

    /* JADX INFO: renamed from: l.q8g0$b */
    public class C19538b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f156119a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f156120b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f156121c;

        public C19538b(String str, Activity activity, String str2) {
            this.f156119a = str;
            this.f156120b = activity;
            this.f156121c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (TextUtils.equals(this.f156119a, "BusinessLicenseAct")) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.f156120b, "com.p1.mobile.putong.core.ui.settings.BusinessLicenseAct"));
                this.f156120b.startActivity(intent);
            } else {
                Activity activity = this.f156120b;
                AccountTempApi accountTempApi = uqb0.f180380L;
                String str = this.f156121c;
                activity.startActivity(accountTempApi == null ? WebViewPreAct.m80585K0(activity, str, this.f156119a) : WebViewAct.m81347a2(activity, str, this.f156119a));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setTypeface(Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: l.q8g0$c */
    public class C19539c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f156122a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f156123b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f156124c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f156125d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Typeface f156126e;

        public C19539c(String str, Activity activity, String str2, int i, Typeface typeface) {
            this.f156122a = str;
            this.f156123b = activity;
            this.f156124c = str2;
            this.f156125d = i;
            this.f156126e = typeface;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            String strReplace = this.f156122a.replace("《", "").replace("》", "");
            Activity activity = this.f156123b;
            AccountTempApi accountTempApi = uqb0.f180380L;
            String str = this.f156124c;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m80585K0(activity, strReplace, str) : WebViewAct.m81347a2(activity, strReplace, str));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f156125d);
            textPaint.setTypeface(this.f156126e);
        }
    }

    /* JADX INFO: renamed from: A */
    public static SpannableStringBuilder m175769A(Activity activity, Typeface typeface, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new C19537a(activity, str2, strArr[i + 1], typeface), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: B */
    public static SpannableStringBuilder m175770B(Activity activity, String str, String... strArr) {
        return m175769A(activity, Typeface.DEFAULT, str, strArr);
    }

    /* JADX INFO: renamed from: C */
    public static SpannableStringBuilder m175771C(Activity activity, String str, Triple<String, String, Integer>... tripleArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < tripleArr.length; i++) {
            String first = tripleArr[i].getFirst();
            String second = tripleArr[i].getSecond();
            int iIntValue = tripleArr[i].getThird().intValue();
            if (iIntValue == 0) {
                iIntValue = str.indexOf(first);
            } else if (iIntValue < 0) {
                iIntValue = str.lastIndexOf(first);
            }
            spannableStringBuilder.setSpan(new C19538b(second, activity, first), iIntValue, first.length() + iIntValue, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: D */
    public static SpannableStringBuilder m175772D(Activity activity, int i, String str, String... strArr) {
        return m175773E(activity, Typeface.DEFAULT, i, str, strArr);
    }

    /* JADX INFO: renamed from: E */
    public static SpannableStringBuilder m175773E(Activity activity, Typeface typeface, int i, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str2 = strArr[i2];
            Activity activity2 = activity;
            Typeface typeface2 = typeface;
            int i3 = i;
            spannableStringBuilder.setSpan(new C19539c(str2, activity2, strArr[i2 + 1], i3, typeface2), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            i2 += 2;
            activity = activity2;
            i = i3;
            typeface = typeface2;
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: F */
    public static String m175774F(double d, int i) {
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
            return a9g0.m96569d(d);
        }
        return i == 2 ? a9g0.m96570e(d) : String.valueOf(Math.round(d));
    }

    /* JADX INFO: renamed from: G */
    public static String m175775G(int i) {
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: H */
    public static String m175776H(double d) {
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
    public static pf60<String, String> m175777I(String str) {
        String upperCase = "#";
        if (str == null) {
            return new pf60<>("#", "");
        }
        String strM198501d = uxk.m198498c().m198501d(str);
        if (strM198501d != null && strM198501d.length() > 0) {
            String strSubstring = strM198501d.substring(0, 1);
            Locale locale = Locale.CHINESE;
            String upperCase2 = strSubstring.toUpperCase(locale);
            if (upperCase2.matches("[A-Z]")) {
                upperCase = upperCase2.toUpperCase(locale);
            }
        }
        return new pf60<>(upperCase, strM198501d.toUpperCase(Locale.CHINESE));
    }

    /* JADX INFO: renamed from: J */
    public static int m175778J(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            i = a9g0.m96573h(charSequence.charAt(i2)) ? i + 2 : i + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: K */
    public static double m175779K(double d) {
        return d * 6.214E-4d;
    }

    /* JADX INFO: renamed from: L */
    public static double m175780L(double d) {
        return d * 1609.344d;
    }

    /* JADX INFO: renamed from: M */
    public static SpannableStringBuilder m175781M(String str, int i, int i2, Typeface typeface, int i3) {
        Matcher matcher = Pattern.compile("-?[0-9]\\d*").matcher(str.substring(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i2, i3), matcher.start() + i, matcher.end() + i, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: N */
    public static SpannableStringBuilder m175782N(String str, int i, Typeface typeface) {
        return m175783O(str, i, typeface, 0);
    }

    /* JADX INFO: renamed from: O */
    public static SpannableStringBuilder m175783O(String str, int i, Typeface typeface, int i2) {
        return m175781M(str, 0, i, typeface, i2);
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m175784P(Location location, boolean z, CharacterStyle characterStyle, String str) {
        String str2;
        String str3;
        String str4;
        Location locationMo225055clone = location.mo225055clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo225055clone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationMo225055clone.region.district = null;
            }
        }
        Region region = locationMo225055clone.region;
        User userMe_ = l51.m152884D() ? uqb0.f180397c0.me_() : uqb0.f180397c0.queryMe();
        if (userMe_ != null) {
            Region region2 = userMe_.location.region;
            if (TextUtils.isEmpty(region.district) || !region.equals(region2)) {
                if (!TextUtils.isEmpty(region.district) && !TextUtils.isEmpty(region.city) && region.city.equals(region2.city) && !TextUtils.isEmpty(region.country) && region.country.equals(region2.country)) {
                    String string = App.f16088e.getResources().getString(R$string.f18066L1, region.district, str);
                    if (z && (str4 = region.district) != null && !string.startsWith(str4)) {
                        string = lu6.m155848d(string);
                    }
                    return z ? hmj0.m135870f(string, region.district, characterStyle) : string;
                }
                if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.country) && region.country.equals(region2.country)) {
                    String string2 = App.f16088e.getResources().getString(R$string.f18054I1, region.city, str);
                    if (z && (str3 = region.city) != null && !string2.startsWith(str3)) {
                        string2 = lu6.m155848d(string2);
                    }
                    return z ? hmj0.m135870f(string2, region.city, characterStyle) : string2;
                }
                if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && region.city != null) {
                    String string3 = App.f16088e.getResources().getString(R$string.f18058J1, region.city, region.country);
                    if (z && (str2 = region.city) != null && !string3.startsWith(str2)) {
                        string3 = lu6.m155848d(string3);
                    }
                    return z ? hmj0.m135870f(string3, string3, characterStyle) : string3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static CharSequence m175785Q(Location location, String str) {
        Location locationMo225055clone = location.mo225055clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo225055clone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationMo225055clone.region.district = null;
            }
        }
        Region region = locationMo225055clone.region;
        User userMe_ = l51.m152884D() ? uqb0.f180397c0.me_() : uqb0.f180397c0.queryMe();
        if (userMe_ != null) {
            Region region2 = userMe_.location.region;
            if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.district) && region.city.equals(region2.city) && region.district.equals(region2.district)) {
                return location.distance <= 10000 ? App.f16088e.getResources().getString(R$string.f18066L1, region.district, str) : App.f16088e.getResources().getString(R$string.f18062K1, region.district);
            }
            if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.district) && region.city.equals(region2.city) && !region.district.equals(region2.district)) {
                return App.f16088e.getResources().getString(R$string.f18054I1, region.city, "同城");
            }
            if (!TextUtils.isEmpty(region.country) && !TextUtils.isEmpty(region.city) && region.country.equals(region2.country) && !region.city.equals(region2.city)) {
                return App.f16088e.getResources().getString(R$string.f18062K1, region.city);
            }
            if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && !TextUtils.isEmpty(region.city)) {
                return String.format("%1$s，%2$s", region.country, region.city);
            }
            if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && TextUtils.isEmpty(region.city)) {
                return App.f16088e.getResources().getString(R$string.f18062K1, region.country);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static CharSequence m175786R(Location location) {
        return m175787S(location, false, null);
    }

    /* JADX INFO: renamed from: S */
    public static CharSequence m175787S(Location location, boolean z, CharacterStyle characterStyle) {
        return m175788T(location, z, characterStyle, false);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: T */
    public static CharSequence m175788T(Location location, boolean z, CharacterStyle characterStyle, boolean z2) {
        return m175789U(location, z, characterStyle, z2, false);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: U */
    public static CharSequence m175789U(Location location, boolean z, CharacterStyle characterStyle, boolean z2, boolean z3) {
        if (location.isHideInfo() && location.isHideRegionCountry()) {
            return "";
        }
        String strM175813r = z3 ? m175813r(location.mo225055clone(), true, false) : m175812q(location.mo225055clone(), true);
        if (z2 && strM175813r.equals(m175811p(0, true))) {
            if (IntlCountryCodeController.m29109f()) {
                strM175813r = "1 " + App.f16088e.getString(R$string.f18104V);
            } else {
                strM175813r = "1" + App.f16088e.getString(R$string.f18057J0);
            }
        }
        CharSequence charSequenceM175784P = m175784P(location, z, characterStyle, strM175813r);
        return !TextUtils.isEmpty(charSequenceM175784P) ? charSequenceM175784P : String.format(App.f16088e.getString(R$string.f18062K1), strM175813r);
    }

    /* JADX INFO: renamed from: V */
    public static CharSequence m175790V(User user, Location location) {
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
            sb.append(App.f16088e.getString(R$string.f18057J0));
            return sb.toString();
        }
        Location locationMo225055clone = location.mo225055clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo225055clone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationMo225055clone.region.district = null;
            }
        }
        Region region = locationMo225055clone.region;
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
        int iM80518y = 50;
        try {
            if (!TextUtils.isEmpty(RemoteConfig.m80481x().m80485F("distance"))) {
                iM80518y = RemoteConfig.m80481x().m80518y("distance");
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str) && str.equals(str2) && !TextUtils.isEmpty(str3) && !str3.equals(str4)) {
            if (location.distance / 1000 > iM80518y) {
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
    public static CharSequence m175791W(Location location) {
        return m175792X(location, false);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: X */
    public static CharSequence m175792X(Location location, boolean z) {
        String str = "";
        if (location.isHideInfo() && location.isHideRegionCountry()) {
            return "";
        }
        User userMe_ = l51.m152884D() ? uqb0.f180397c0.me_() : uqb0.f180397c0.queryMe();
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
                        str = f156109b.format(i3 / 1000.0f) + App.f16088e.getString(R$string.f18230v0);
                    } else {
                        str = (((int) Math.ceil(i3 / 100.0f)) * 100) + App.f16088e.getString(R$string.f18057J0);
                    }
                }
            } else if (i <= 10000) {
                str = f156109b.format(location.distance / 1000.0f) + App.f16088e.getString(R$string.f18230v0);
            }
        }
        if (z && str.equals(m175811p(0, true))) {
            if (IntlCountryCodeController.m29109f()) {
                str = "1 " + App.f16088e.getString(R$string.f18104V);
            } else {
                str = "1" + App.f16088e.getString(R$string.f18057J0);
            }
        }
        if (location.distance > 1000) {
            CharSequence charSequenceM175785Q = m175785Q(location, str);
            if (!TextUtils.isEmpty(charSequenceM175785Q)) {
                return charSequenceM175785Q;
            }
        }
        return String.format(App.f16088e.getString(R$string.f18062K1), str);
    }

    /* JADX INFO: renamed from: Y */
    public static CharSequence m175793Y(Location location) {
        Settings settings;
        User userMe_ = l51.m152884D() ? uqb0.f180397c0.me_() : uqb0.f180397c0.queryMe();
        if (userMe_ == null || (settings = userMe_.settings) == null) {
            return "";
        }
        if (location.isHideInfo() && location.isHideRegionCountry()) {
            return "";
        }
        if (!nrb0.m164467c() || settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue() || location.distance <= settings.getSearchRadius().intValue()) {
            return m175790V(userMe_, location);
        }
        pf60<String, String> pf60VarM175794Z = m175794Z(userMe_, location, false);
        return pf60VarM175794Z.f152156a + pf60VarM175794Z.f152157b;
    }

    /* JADX INFO: renamed from: Z */
    public static pf60<String, String> m175794Z(User user, Location location, boolean z) {
        String str;
        Location locationMo225055clone = location.mo225055clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo225055clone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationMo225055clone.region.district = null;
            }
        }
        Region region = locationMo225055clone.region;
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
                return pf60.m172085a(str4.concat(str6), str);
            }
            if (!TextUtils.isEmpty(str2) && str2.equals(str3) && !TextUtils.isEmpty(str4) && !str4.equals(str5)) {
                if (z3 && !str4.contains(str7)) {
                    z2 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(z2 ? str7 : "");
                sb.append(str4);
                return pf60.m172085a(sb.toString(), str);
            }
        }
        if (!TextUtils.isEmpty(str4) && str4.equals(str5)) {
            return pf60.m172085a(str4.concat(str6), "");
        }
        if (!TextUtils.isEmpty(str2) && !str2.equals(str3)) {
            if (!TextUtils.isEmpty(str4)) {
                str2 = str2 + " · " + str4;
            }
            return pf60.m172085a(str2, "");
        }
        if (TextUtils.isEmpty(str4) || str4.equals(str5)) {
            return pf60.m172085a("", "");
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
        return pf60.m172085a(sb2.toString(), "");
    }

    /* JADX INFO: renamed from: a0 */
    public static SpannableStringBuilder m175795a0(String str, char c, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        int iIndexOf = str.indexOf(c);
        spannableStringBuilder.setSpan(new ImageSpan(drawable), iIndexOf, iIndexOf + 1, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b0 */
    public static SpannableStringBuilder m175796b0(String str, ArrayList<String> arrayList, final int i, Typeface typeface) {
        return m175797c0(str, arrayList, jyb.m147486Q(arrayList, new qcj() { // from class: l.p8g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(i);
            }
        }), typeface);
    }

    /* JADX INFO: renamed from: c0 */
    public static SpannableStringBuilder m175797c0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface) {
        return m175798d0(str, arrayList, arrayList2, typeface, 0);
    }

    /* JADX INFO: renamed from: d0 */
    public static SpannableStringBuilder m175798d0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, int i) {
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
    public static SpannableStringBuilder m175799e0(String str, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, Typeface typeface, ArrayList<Integer> arrayList3) {
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
    public static SpannableStringBuilder m175800f0(String str, ArrayList<String> arrayList, int i, Typeface typeface) {
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
    public static SpannableStringBuilder m175801g0(String str, ArrayList<String> arrayList, int i, ArrayList<Typeface> arrayList2) {
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
    public static String m175802h0(int i) {
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
    public static String m175803i0(int i) {
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
    public static String m175804j0(ProfileZodiac profileZodiac) {
        return m175805k0(profileZodiac, false);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m175805k0(ProfileZodiac profileZodiac, boolean z) {
        Application application = App.f16088e;
        int i = R$string.f18233v3;
        if (profileZodiac != null) {
            String string = profileZodiac.toString();
            string.getClass();
            switch (string) {
                case "aquarius":
                    i = R$string.f18178k3;
                    break;
                case "capricorn":
                    i = R$string.f18193n3;
                    break;
                case "cancer":
                    i = R$string.f18188m3;
                    break;
                case "gemini":
                    i = R$string.f18198o3;
                    break;
                case "pisces":
                    i = R$string.f18213r3;
                    break;
                case "taurus":
                    i = R$string.f18228u3;
                    break;
                case "leo":
                    i = R$string.f18203p3;
                    break;
                case "aries":
                    i = R$string.f18183l3;
                    break;
                case "libra":
                    i = R$string.f18208q3;
                    break;
                case "virgo":
                    i = R$string.f18238w3;
                    break;
                case "scorpio":
                    i = R$string.f18223t3;
                    break;
                case "sagittarius":
                    i = R$string.f18218s3;
                    break;
            }
        }
        if (z && i == R$string.f18233v3) {
            return null;
        }
        return application.getResources().getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX INFO: renamed from: l0 */
    public static int m175806l0(ProfileZodiac profileZodiac) {
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
    public static pf60<Integer, String> m175808m0(ProfileZodiac profileZodiac) {
        Application application = App.f16088e;
        int i = R$string.f18183l3;
        int i2 = cbc0.f80792r;
        if (profileZodiac != null) {
            String string = profileZodiac.toString();
            string.getClass();
            switch (string) {
                case "aquarius":
                    i = R$string.f18178k3;
                    i2 = cbc0.f80780l;
                    break;
                case "capricorn":
                    i = R$string.f18193n3;
                    i2 = cbc0.f80788p;
                    break;
                case "cancer":
                    i = R$string.f18188m3;
                    i2 = cbc0.f80784n;
                    break;
                case "gemini":
                    i = R$string.f18198o3;
                    i2 = cbc0.f80778k;
                    break;
                case "pisces":
                    i = R$string.f18213r3;
                    i2 = cbc0.f80798u;
                    break;
                case "taurus":
                    i = R$string.f18228u3;
                    i2 = cbc0.f80790q;
                    break;
                case "leo":
                    i = R$string.f18203p3;
                    i2 = cbc0.f80796t;
                    break;
                case "aries":
                    i = R$string.f18183l3;
                    i2 = cbc0.f80792r;
                    break;
                case "libra":
                    i = R$string.f18208q3;
                    i2 = cbc0.f80776j;
                    break;
                case "virgo":
                    i = R$string.f18238w3;
                    i2 = cbc0.f80786o;
                    break;
                case "scorpio":
                    i = R$string.f18223t3;
                    i2 = cbc0.f80782m;
                    break;
                case "sagittarius":
                    i = R$string.f18218s3;
                    i2 = cbc0.f80794s;
                    break;
            }
        }
        return pf60.m172085a(Integer.valueOf(i2), i == -1 ? null : application.getResources().getString(i));
    }

    /* JADX INFO: renamed from: n */
    public static void m175809n(TextView textView, Drawable drawable) {
        int iM175859d = qa00.m175859d(4.0f);
        drawable.setBounds(iM175859d, 0, drawable.getIntrinsicWidth() + iM175859d, drawable.getIntrinsicHeight());
        v9l0 v9l0Var = new v9l0(drawable);
        SpannableString spannableString = new SpannableString("icon");
        spannableString.setSpan(v9l0Var, 0, 4, 33);
        textView.append(spannableString);
    }

    /* JADX INFO: renamed from: o */
    public static int m175810o(BloodType bloodType) {
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
    public static String m175811p(int i, boolean z) {
        if (!IntlCountryCodeController.m29109f()) {
            if (i < 1000) {
                return "1" + App.f16088e.getString(R$string.f18230v0);
            }
            if (i < 10000) {
                return f156109b.format(i / 1000.0f) + App.f16088e.getString(R$string.f18230v0);
            }
            return f156110c.format(i / 1000.0f) + App.f16088e.getString(R$string.f18230v0);
        }
        double d = ((double) i) * 3.28083993d;
        if (d < 1000.0d) {
            return "1 " + App.f16088e.getString(R$string.f18065L0);
        }
        double d2 = d * 1.8939E-4d;
        if (d2 >= 2.0d) {
            return f156110c.format(d2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + App.f16088e.getString(R$string.f18061K0);
        }
        if (d2 == 1.0d) {
            return f156110c.format(d2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + App.f16088e.getString(R$string.f18065L0);
        }
        if (d2 <= 1.0d) {
            return "1 " + App.f16088e.getString(R$string.f18065L0);
        }
        return f156109b.format(d2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + App.f16088e.getString(R$string.f18061K0);
    }

    /* JADX INFO: renamed from: q */
    public static String m175812q(Location location, boolean z) {
        return (location.isHideInfo() && location.isHideDistance()) ? "" : m175811p(location.distance, z);
    }

    /* JADX INFO: renamed from: r */
    public static String m175813r(Location location, boolean z, boolean z2) {
        return (location.isHideInfo() && location.isHideDistance()) ? "" : m175814s(location.distance, z, z2);
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static String m175814s(int i, boolean z, boolean z2) {
        if (IntlCountryCodeController.m29109f()) {
            return m175811p(i, z);
        }
        if (i < 100 || i < 500 || i < 1000) {
            return "<1km";
        }
        if (!z2) {
            return (i / 1000) + App.f16088e.getString(R$string.f18230v0);
        }
        if (i < 13000) {
            return (i / 1000) + App.f16088e.getString(R$string.f18230v0);
        }
        if (i < 24000) {
            return Constants.VIA_REPORT_TYPE_JOININ_GROUP + App.f16088e.getString(R$string.f18160h0);
        }
        return Constants.VIA_REPORT_TYPE_CHAT_AIO + App.f16088e.getString(R$string.f18160h0);
    }

    /* JADX INFO: renamed from: t */
    public static String m175815t(int i) {
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
    public static String m175816u(int i) {
        if (i > 10000) {
            return new DecimalFormat("#.0").format(i / 10000.0f) + "w";
        }
        if (i <= 1000) {
            return i + "";
        }
        return new DecimalFormat("#.0").format(i / 1000.0f) + "k";
    }

    /* JADX INFO: renamed from: v */
    public static String m175817v(double d) {
        if (Network.language().startsWith("zh")) {
            return d > 9999.0d ? String.format(Locale.US, "%s万", a9g0.m96569d(Math.floor(d / 1000.0d) / 10.0d)) : a9g0.m96570e(d);
        }
        return d > 999.0d ? String.format(Locale.US, "%sk", a9g0.m96569d(Math.floor(d / 100.0d) / 10.0d)) : a9g0.m96570e(d);
    }

    /* JADX INFO: renamed from: w */
    public static String m175818w(Act act, String str) {
        try {
            int i = (int) (Long.parseLong(str) % 5);
            if (i == 0) {
                return act.getString(R$string.f18069M0);
            }
            if (i == 1) {
                return act.getString(R$string.f18073N0);
            }
            if (i == 2) {
                return act.getString(R$string.f18077O0);
            }
            if (i != 3) {
                return i != 4 ? "" : act.getString(R$string.f18085Q0);
            }
            return act.getString(R$string.f18081P0);
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m175819x(Act act, String str) {
        try {
            int i = (int) (Long.parseLong(str) % 3);
            if (i == 0) {
                return act.getString(R$string.f18089R0);
            }
            if (i != 1) {
                return i != 2 ? "" : act.getString(R$string.f18097T0);
            }
            return act.getString(R$string.f18093S0);
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m175820y() {
        String strLanguage = Network.language();
        if (strLanguage.startsWith(Network.LANGUAGE_ZH_HANT)) {
            return "zh-TW";
        }
        if (strLanguage.startsWith(Network.LANGUAGE_ZH_HANS)) {
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
    public static String m175821z(int i) {
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
