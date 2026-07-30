package p149l;

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
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.OMSDialog;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import com.p046p1.mobile.putong.data.OMSLanguageContent;
import com.p046p1.mobile.putong.data.OMSLanguageInfo;
import com.p046p1.mobile.putong.data.OMSResourceContent;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class dji0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f86543a = Pattern.compile("<(\\w+)>(.*?)</\\1>");

    /* JADX INFO: renamed from: l.dji0$a */
    public class C16392a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f86544a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f86545b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f86546c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OMSResourceContent f86547d;

        public C16392a(String str, Activity activity, String str2, OMSResourceContent oMSResourceContent) {
            this.f86544a = str;
            this.f86545b = activity;
            this.f86546c = str2;
            this.f86547d = oMSResourceContent;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (this.f86544a.startsWith("http")) {
                Activity activity = this.f86545b;
                activity.startActivity(WebViewAct.m80164Z1(activity, this.f86546c, this.f86544a));
            } else if (this.f86544a.startsWith("tantan") || this.f86544a.startsWith("tantanapp") || this.f86544a.startsWith("tantantribe")) {
                j2e0.m139446m(this.f86545b, Uri.parse(this.f86544a));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            if (TextUtils.isEmpty(this.f86547d.color)) {
                textPaint.setColor(textPaint.linkColor);
            } else {
                textPaint.setColor(Color.parseColor(this.f86547d.color));
            }
            textPaint.setUnderlineText(this.f86547d.underline);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ClickableSpan m112038a(Activity activity, OMSResourceContent oMSResourceContent, String str, String str2) {
        return new C16392a(str2, activity, str, oMSResourceContent);
    }

    /* JADX INFO: renamed from: b */
    public static OMSResourceContent m112039b(OMSLanguageContent oMSLanguageContent, String str, String str2) {
        OMSResourceContent oMSResourceContent = oMSLanguageContent.style.get(str);
        if (oMSResourceContent == null) {
            return new OMSResourceContent();
        }
        OMSResourceContent oMSResourceContentMo223809clone = oMSResourceContent.mo223809clone();
        oMSResourceContentMo223809clone.value = str2;
        return oMSResourceContentMo223809clone;
    }

    /* JADX INFO: renamed from: c */
    public static Matcher m112040c(String str, int i) {
        Matcher matcher = f86543a.matcher(str);
        if (matcher.find(i)) {
            return matcher;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static List<OMSResourceContent> m112041d(OMSDialogInfo oMSDialogInfo, OMSDialog oMSDialog) {
        ArrayList arrayList = new ArrayList();
        if (oMSDialogInfo != null && oMSDialog != null && !TextUtils.isEmpty(oMSDialog.languageContent.value)) {
            String strM112042e = m112042e(oMSDialogInfo, oMSDialog.languageContent.value);
            if (!TextUtils.isEmpty(strM112042e)) {
                String strSubstring = strM112042e;
                while (true) {
                    Matcher matcherM112040c = m112040c(strSubstring, 0);
                    if (matcherM112040c == null) {
                        break;
                    }
                    String strGroup = matcherM112040c.group(1);
                    String strGroup2 = matcherM112040c.group(2);
                    int iStart = matcherM112040c.start();
                    int iEnd = matcherM112040c.end();
                    if (iStart == 0) {
                        arrayList.add(m112039b(oMSDialog.languageContent, strGroup, strGroup2));
                        strSubstring = strSubstring.substring(iEnd);
                    } else {
                        int length = strM112042e.length();
                        OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
                        if (iEnd == length) {
                            arrayList.add(m112039b(oMSLanguageContent, "base", strSubstring.substring(0, iStart)));
                            arrayList.add(m112039b(oMSDialog.languageContent, strGroup, strGroup2));
                            strSubstring = "";
                        } else {
                            arrayList.add(m112039b(oMSLanguageContent, "base", strSubstring.substring(0, iStart)));
                            arrayList.add(m112039b(oMSDialog.languageContent, strGroup, strGroup2));
                            strSubstring = strSubstring.substring(iEnd);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    arrayList.add(m112039b(oMSDialog.languageContent, "base", strSubstring));
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m112042e(OMSDialogInfo oMSDialogInfo, String str) {
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
        CrashHelper.m81297d(new RuntimeException("localLang:" + strLanguage + " defaultLang:" + oMSDialogInfo.languages.defaultLang + " contentSize:" + oMSDialogInfo.languages.content.size()), 100);
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static j760<SpannableStringBuilder, Boolean> m112043f(Activity activity, List<OMSResourceContent> list, double d, j760<String, String> j760Var) {
        SpannableString spannableString;
        int i;
        boolean z;
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = false;
        for (OMSResourceContent oMSResourceContent : list) {
            String strM112045h = m112045h(oMSResourceContent.value, j760Var);
            if (TextUtils.isEmpty(oMSResourceContent.bgColor)) {
                spannableString = new SpannableString(strM112045h);
                if (!TextUtils.isEmpty(oMSResourceContent.color)) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(oMSResourceContent.color)), 0, strM112045h.length(), 33);
                }
                int i3 = oMSResourceContent.size;
                if (i3 > 0) {
                    int iM199996a = vtd.m199996a(activity, i3);
                    if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d) {
                        iM199996a = (int) (((double) iM199996a) * d);
                    }
                    i = 33;
                    spannableString.setSpan(new AbsoluteSizeSpan(iM199996a, false), 0, strM112045h.length(), 33);
                } else {
                    i = 33;
                }
                if (oMSResourceContent.strikethrough) {
                    spannableString.setSpan(new StrikethroughSpan(), 0, strM112045h.length(), i);
                }
                if (oMSResourceContent.underline) {
                    spannableString.setSpan(new UnderlineSpan(), 0, strM112045h.length(), i);
                }
                if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold)) {
                    z = true;
                    spannableString.setSpan(new StyleSpan(1), 0, strM112045h.length(), i);
                } else {
                    z = true;
                    if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.italic)) {
                        spannableString.setSpan(new StyleSpan(2), 0, strM112045h.length(), i);
                    } else if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold_italic)) {
                        spannableString.setSpan(new StyleSpan(3), 0, strM112045h.length(), i);
                    }
                }
            } else {
                spannableString = new SpannableString(strM112045h + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold)) {
                    i2 = 1;
                } else if (TEnum.equals(oMSResourceContent.font, OMSFontStyle.italic)) {
                    i2 = 2;
                } else {
                    i2 = TEnum.equals(oMSResourceContent.font, OMSFontStyle.bold_italic) ? 3 : 0;
                }
                int i4 = oMSResourceContent.size;
                spannableString.setSpan(new qed0(vtd.m199996a(activity, 3.0f), Color.parseColor(oMSResourceContent.bgColor), !TextUtils.isEmpty(oMSResourceContent.color) ? Color.parseColor(oMSResourceContent.color) : -1, i2, (i4 <= 0 || d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d >= 1.0d) ? 0 : (int) (((double) i4) * d)), 0, spannableString.length() - 1, 18);
                z = true;
                i = 33;
            }
            if (!TextUtils.isEmpty(oMSResourceContent.url)) {
                spannableString.setSpan(m112038a(activity, oMSResourceContent, strM112045h, m112044g(oMSResourceContent.url)), 0, strM112045h.length(), i);
                z2 = z;
            }
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return new j760<>(spannableStringBuilder, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: g */
    public static String m112044g(String str) {
        return m112045h(str, null);
    }

    /* JADX INFO: renamed from: h */
    public static String m112045h(String str, j760<String, String> j760Var) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("(\\{\\{.*?\\}\\})").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            String strReplace = strGroup.replace("{{", "").replace("}}", "");
            String strM108956b = ic50.m135327j().m135341o().m108956b(strReplace);
            if (NullChecker.m81303a(j760Var) && j760Var.f116564a.equals(strReplace)) {
                strM108956b = j760Var.f116565b;
            }
            str = str.replace(strGroup, strM108956b);
        }
        return str;
    }
}
