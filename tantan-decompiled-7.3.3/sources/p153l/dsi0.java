package p153l;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.OMSDialog;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.data.OMSLanguageContent;
import com.p051p1.mobile.putong.data.OMSLanguageInfo;
import com.p051p1.mobile.putong.data.OMSResourceContent;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class dsi0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f90486a = Pattern.compile("<(\\w+)>(.*?)</\\1>");

    /* JADX INFO: renamed from: l.dsi0$a */
    public class C16617a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f90487a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f90488b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f90489c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OMSResourceContent f90490d;

        public C16617a(String str, Activity activity, String str2, OMSResourceContent oMSResourceContent) {
            this.f90487a = str;
            this.f90488b = activity;
            this.f90489c = str2;
            this.f90490d = oMSResourceContent;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (this.f90487a.startsWith("http")) {
                Activity activity = this.f90488b;
                activity.startActivity(WebViewAct.m81347a2(activity, this.f90489c, this.f90487a));
            } else if (this.f90487a.startsWith("tantan") || this.f90487a.startsWith("tantanapp") || this.f90487a.startsWith("tantantribe")) {
                nae0.m162083m(this.f90488b, Uri.parse(this.f90487a));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            if (TextUtils.isEmpty(this.f90490d.color)) {
                textPaint.setColor(textPaint.linkColor);
            } else {
                textPaint.setColor(Color.parseColor(this.f90490d.color));
            }
            textPaint.setUnderlineText(this.f90490d.underline);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ClickableSpan m117761a(Activity activity, OMSResourceContent oMSResourceContent, String str, String str2) {
        return new C16617a(str2, activity, str, oMSResourceContent);
    }

    /* JADX INFO: renamed from: b */
    public static OMSResourceContent m117762b(OMSLanguageContent oMSLanguageContent, String str, String str2) {
        OMSResourceContent oMSResourceContent = oMSLanguageContent.style.get(str);
        if (oMSResourceContent == null) {
            return new OMSResourceContent();
        }
        OMSResourceContent oMSResourceContentMo225055clone = oMSResourceContent.mo225055clone();
        oMSResourceContentMo225055clone.value = str2;
        return oMSResourceContentMo225055clone;
    }

    /* JADX INFO: renamed from: c */
    public static Matcher m117763c(String str, int i) {
        Matcher matcher = f90486a.matcher(str);
        if (matcher.find(i)) {
            return matcher;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static List<OMSResourceContent> m117764d(OMSDialogInfo oMSDialogInfo, OMSDialog oMSDialog) {
        ArrayList arrayList = new ArrayList();
        if (oMSDialogInfo != null && oMSDialog != null && !TextUtils.isEmpty(oMSDialog.languageContent.value)) {
            String strM117765e = m117765e(oMSDialogInfo, oMSDialog.languageContent.value);
            if (!TextUtils.isEmpty(strM117765e)) {
                String strSubstring = strM117765e;
                while (true) {
                    Matcher matcherM117763c = m117763c(strSubstring, 0);
                    if (matcherM117763c == null) {
                        break;
                    }
                    String strGroup = matcherM117763c.group(1);
                    String strGroup2 = matcherM117763c.group(2);
                    int iStart = matcherM117763c.start();
                    int iEnd = matcherM117763c.end();
                    if (iStart == 0) {
                        arrayList.add(m117762b(oMSDialog.languageContent, strGroup, strGroup2));
                        strSubstring = strSubstring.substring(iEnd);
                    } else {
                        int length = strM117765e.length();
                        OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
                        if (iEnd == length) {
                            arrayList.add(m117762b(oMSLanguageContent, "base", strSubstring.substring(0, iStart)));
                            arrayList.add(m117762b(oMSDialog.languageContent, strGroup, strGroup2));
                            strSubstring = "";
                        } else {
                            arrayList.add(m117762b(oMSLanguageContent, "base", strSubstring.substring(0, iStart)));
                            arrayList.add(m117762b(oMSDialog.languageContent, strGroup, strGroup2));
                            strSubstring = strSubstring.substring(iEnd);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    arrayList.add(m117762b(oMSDialog.languageContent, "base", strSubstring));
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m117765e(OMSDialogInfo oMSDialogInfo, String str) {
        String strLanguage = Network.language();
        Map<String, String> map = oMSDialogInfo.languages.content.get(strLanguage);
        if (map == null) {
            boolean zEquals = TextUtils.equals(strLanguage, "ru");
            OMSLanguageInfo oMSLanguageInfo = oMSDialogInfo.languages;
            map = zEquals ? oMSLanguageInfo.content.get("en") : oMSLanguageInfo.content.get(oMSLanguageInfo.defaultLang);
        }
        if (map != null) {
            return map.get(str);
        }
        CrashHelper.m82480d(new RuntimeException("localLang:" + strLanguage + " defaultLang:" + oMSDialogInfo.languages.defaultLang + " contentSize:" + oMSDialogInfo.languages.content.size()), 100);
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static pf60<SpannableStringBuilder, Boolean> m117766f(Activity activity, List<OMSResourceContent> list, double d, pf60<String, String> pf60Var) {
        SpannableString spannableString;
        int i;
        boolean z;
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = false;
        for (OMSResourceContent oMSResourceContent : list) {
            String strM117768h = m117768h(oMSResourceContent.value, pf60Var);
            if (TextUtils.isEmpty(oMSResourceContent.bgColor)) {
                spannableString = new SpannableString(strM117768h);
                if (!TextUtils.isEmpty(oMSResourceContent.color)) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(oMSResourceContent.color)), 0, strM117768h.length(), 33);
                }
                int i3 = oMSResourceContent.size;
                if (i3 > 0) {
                    int iM147011a = jvd.m147011a(activity, i3);
                    if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d) {
                        iM147011a = (int) (((double) iM147011a) * d);
                    }
                    i = 33;
                    spannableString.setSpan(new AbsoluteSizeSpan(iM147011a, false), 0, strM117768h.length(), 33);
                } else {
                    i = 33;
                }
                if (oMSResourceContent.strikethrough) {
                    spannableString.setSpan(new StrikethroughSpan(), 0, strM117768h.length(), i);
                }
                if (oMSResourceContent.underline) {
                    spannableString.setSpan(new UnderlineSpan(), 0, strM117768h.length(), i);
                }
                if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold)) {
                    z = true;
                    spannableString.setSpan(new StyleSpan(1), 0, strM117768h.length(), i);
                } else {
                    z = true;
                    if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.italic)) {
                        spannableString.setSpan(new StyleSpan(2), 0, strM117768h.length(), i);
                    } else if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold_italic)) {
                        spannableString.setSpan(new StyleSpan(3), 0, strM117768h.length(), i);
                    }
                }
            } else {
                spannableString = new SpannableString(strM117768h + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold)) {
                    i2 = 1;
                } else if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.italic)) {
                    i2 = 2;
                } else {
                    i2 = TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold_italic) ? 3 : 0;
                }
                int i4 = oMSResourceContent.size;
                spannableString.setSpan(new smd0(jvd.m147011a(activity, 3.0f), Color.parseColor(oMSResourceContent.bgColor), !TextUtils.isEmpty(oMSResourceContent.color) ? Color.parseColor(oMSResourceContent.color) : -1, i2, (i4 <= 0 || d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d >= 1.0d) ? 0 : (int) (((double) i4) * d)), 0, spannableString.length() - 1, 18);
                z = true;
                i = 33;
            }
            if (!TextUtils.isEmpty(oMSResourceContent.url)) {
                spannableString.setSpan(m117761a(activity, oMSResourceContent, strM117768h, m117767g(oMSResourceContent.url)), 0, strM117768h.length(), i);
                z2 = z;
            }
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return new pf60<>(spannableStringBuilder, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: g */
    public static String m117767g(String str) {
        return m117768h(str, null);
    }

    /* JADX INFO: renamed from: h */
    public static String m117768h(String str, pf60<String, String> pf60Var) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("(\\{\\{.*?\\}\\})").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            String strReplace = strGroup.replace("{{", "").replace("}}", "");
            String strM118573b = pk50.m172568j().m172582o().m118573b(strReplace);
            if (NullChecker.m82486a(pf60Var) && pf60Var.f152156a.equals(strReplace)) {
                strM118573b = pf60Var.f152157b;
            }
            str = str.replace(strGroup, strM118573b);
        }
        return str;
    }
}
