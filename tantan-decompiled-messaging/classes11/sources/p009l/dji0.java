package p009l;

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
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.OMSDialog;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.OMSLanguageContent;
import com.p1.mobile.putong.data.OMSLanguageInfo;
import com.p1.mobile.putong.data.OMSResourceContent;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.j2e0;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dji0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f11857a = Pattern.compile("<(\\w+)>(.*?)</\\1>");

    /* JADX INFO: renamed from: l.dji0$a */
    public class C0851a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11858a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f11859b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f11860c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OMSResourceContent f11861d;

        public C0851a(String str, Activity activity, String str2, OMSResourceContent oMSResourceContent) {
            this.f11858a = str;
            this.f11859b = activity;
            this.f11860c = str2;
            this.f11861d = oMSResourceContent;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (this.f11858a.startsWith("http")) {
                Activity activity = this.f11859b;
                activity.startActivity(WebViewAct.m10498Z1(activity, this.f11860c, this.f11858a));
            } else if (this.f11858a.startsWith("tantan") || this.f11858a.startsWith("tantanapp") || this.f11858a.startsWith("tantantribe")) {
                j2e0.m(this.f11859b, Uri.parse(this.f11858a));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            if (TextUtils.isEmpty(this.f11861d.color)) {
                textPaint.setColor(textPaint.linkColor);
            } else {
                textPaint.setColor(Color.parseColor(this.f11861d.color));
            }
            textPaint.setUnderlineText(this.f11861d.underline);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ClickableSpan m13354a(Activity activity, OMSResourceContent oMSResourceContent, String str, String str2) {
        return new C0851a(str2, activity, str, oMSResourceContent);
    }

    /* JADX INFO: renamed from: b */
    public static OMSResourceContent m13355b(OMSLanguageContent oMSLanguageContent, String str, String str2) {
        OMSResourceContent oMSResourceContent = (OMSResourceContent) oMSLanguageContent.style.get(str);
        if (oMSResourceContent == null) {
            return new OMSResourceContent();
        }
        OMSResourceContent oMSResourceContentClone = oMSResourceContent.clone();
        oMSResourceContentClone.value = str2;
        return oMSResourceContentClone;
    }

    /* JADX INFO: renamed from: c */
    public static Matcher m13356c(String str, int i) {
        Matcher matcher = f11857a.matcher(str);
        if (matcher.find(i)) {
            return matcher;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static List<OMSResourceContent> m13357d(OMSDialogInfo oMSDialogInfo, OMSDialog oMSDialog) {
        ArrayList arrayList = new ArrayList();
        if (oMSDialogInfo != null && oMSDialog != null && !TextUtils.isEmpty(oMSDialog.languageContent.value)) {
            String strM13358e = m13358e(oMSDialogInfo, oMSDialog.languageContent.value);
            if (!TextUtils.isEmpty(strM13358e)) {
                String strSubstring = strM13358e;
                while (true) {
                    Matcher matcherM13356c = m13356c(strSubstring, 0);
                    if (matcherM13356c == null) {
                        break;
                    }
                    String strGroup = matcherM13356c.group(1);
                    String strGroup2 = matcherM13356c.group(2);
                    int iStart = matcherM13356c.start();
                    int iEnd = matcherM13356c.end();
                    if (iStart == 0) {
                        arrayList.add(m13355b(oMSDialog.languageContent, strGroup, strGroup2));
                        strSubstring = strSubstring.substring(iEnd);
                    } else {
                        int length = strM13358e.length();
                        OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
                        if (iEnd == length) {
                            arrayList.add(m13355b(oMSLanguageContent, "base", strSubstring.substring(0, iStart)));
                            arrayList.add(m13355b(oMSDialog.languageContent, strGroup, strGroup2));
                            strSubstring = "";
                        } else {
                            arrayList.add(m13355b(oMSLanguageContent, "base", strSubstring.substring(0, iStart)));
                            arrayList.add(m13355b(oMSDialog.languageContent, strGroup, strGroup2));
                            strSubstring = strSubstring.substring(iEnd);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    arrayList.add(m13355b(oMSDialog.languageContent, "base", strSubstring));
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m13358e(OMSDialogInfo oMSDialogInfo, String str) {
        String strLanguage = Network.language();
        Map map = (Map) oMSDialogInfo.languages.content.get(strLanguage);
        if (map == null) {
            boolean zEquals = TextUtils.equals(strLanguage, "ru");
            OMSLanguageInfo oMSLanguageInfo = oMSDialogInfo.languages;
            map = zEquals ? (Map) oMSLanguageInfo.content.get("en") : (Map) oMSLanguageInfo.content.get(oMSLanguageInfo.defaultLang);
        }
        if (map != null) {
            return (String) map.get(str);
        }
        CrashHelper.d(new RuntimeException("localLang:" + strLanguage + " defaultLang:" + oMSDialogInfo.languages.defaultLang + " contentSize:" + oMSDialogInfo.languages.content.size()), 100);
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static j760<SpannableStringBuilder, Boolean> m13359f(Activity activity, List<OMSResourceContent> list, double d, j760<String, String> j760Var) {
        SpannableString spannableString;
        int i;
        boolean z;
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = false;
        for (OMSResourceContent oMSResourceContent : list) {
            String strM13361h = m13361h(oMSResourceContent.value, j760Var);
            if (TextUtils.isEmpty(oMSResourceContent.bgColor)) {
                spannableString = new SpannableString(strM13361h);
                if (!TextUtils.isEmpty(oMSResourceContent.color)) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(oMSResourceContent.color)), 0, strM13361h.length(), 33);
                }
                int i3 = oMSResourceContent.size;
                if (i3 > 0) {
                    int iM23720a = vtd.m23720a(activity, i3);
                    if (d > 0.0d && d < 1.0d) {
                        iM23720a = (int) (((double) iM23720a) * d);
                    }
                    i = 33;
                    spannableString.setSpan(new AbsoluteSizeSpan(iM23720a, false), 0, strM13361h.length(), 33);
                } else {
                    i = 33;
                }
                if (oMSResourceContent.strikethrough) {
                    spannableString.setSpan(new StrikethroughSpan(), 0, strM13361h.length(), i);
                }
                if (oMSResourceContent.underline) {
                    spannableString.setSpan(new UnderlineSpan(), 0, strM13361h.length(), i);
                }
                if (TEnum.equals(oMSResourceContent.font, "bold")) {
                    z = true;
                    spannableString.setSpan(new StyleSpan(1), 0, strM13361h.length(), i);
                } else {
                    z = true;
                    if (TEnum.equals(oMSResourceContent.font, "italic")) {
                        spannableString.setSpan(new StyleSpan(2), 0, strM13361h.length(), i);
                    } else if (TEnum.equals(oMSResourceContent.font, "bold_italic")) {
                        spannableString.setSpan(new StyleSpan(3), 0, strM13361h.length(), i);
                    }
                }
            } else {
                spannableString = new SpannableString(strM13361h + " ");
                if (TEnum.equals(oMSResourceContent.font, "bold")) {
                    i2 = 1;
                } else if (TEnum.equals(oMSResourceContent.font, "italic")) {
                    i2 = 2;
                } else {
                    i2 = TEnum.equals(oMSResourceContent.font, "bold_italic") ? 3 : 0;
                }
                int i4 = oMSResourceContent.size;
                spannableString.setSpan(new qed0(vtd.m23720a(activity, 3.0f), Color.parseColor(oMSResourceContent.bgColor), !TextUtils.isEmpty(oMSResourceContent.color) ? Color.parseColor(oMSResourceContent.color) : -1, i2, (i4 <= 0 || d <= 0.0d || d >= 1.0d) ? 0 : (int) (((double) i4) * d)), 0, spannableString.length() - 1, 18);
                z = true;
                i = 33;
            }
            if (!TextUtils.isEmpty(oMSResourceContent.url)) {
                spannableString.setSpan(m13354a(activity, oMSResourceContent, strM13361h, m13360g(oMSResourceContent.url)), 0, strM13361h.length(), i);
                z2 = z;
            }
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return new j760<>(spannableStringBuilder, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: g */
    public static String m13360g(String str) {
        return m13361h(str, null);
    }

    /* JADX INFO: renamed from: h */
    public static String m13361h(String str, j760<String, String> j760Var) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("(\\{\\{.*?\\}\\})").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            String strReplace = strGroup.replace("{{", "").replace("}}", "");
            String strM12853b = ic50.m16316j().m16330o().m12853b(strReplace);
            if (NullChecker.a(j760Var) && ((String) j760Var.a).equals(strReplace)) {
                strM12853b = (String) j760Var.b;
            }
            str = str.replace(strGroup, strM12853b);
        }
        return str;
    }
}
