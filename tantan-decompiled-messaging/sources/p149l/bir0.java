package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class bir0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f75829a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f75830b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f75831c;

    /* JADX INFO: renamed from: d */
    public static final Map f75832d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put(LiveVoiceInternalEntryBean.TYPE_BG_STYLE_BLUE, Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f75831c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f75832d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x01b8, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static SpannedString m102112a(@Nullable String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    svv0.m186111f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                svv0.m186111f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            svv0.m186111f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        svv0.m186111f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i2 = length - 2;
                boolean z = str2.charAt(i2) == '/';
                int i3 = i + (cCharAt2 == '/' ? 2 : 1);
                if (!z) {
                    i2 = length - 1;
                }
                String strSubstring2 = str2.substring(i3, i2);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    f5v0.m119533d(true ^ strTrim.isEmpty());
                    int i4 = ggw0.f102568a;
                    String str3 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 98 ? str3.equals("b") : !(iHashCode2 == 99 ? !str3.equals("c") : iHashCode2 == 105 ? !str3.equals(RXScreenCaptureService.KEY_INDEX) : iHashCode2 == 3650 ? !str3.equals("rt") : iHashCode2 == 3314158 ? !str3.equals("lang") : iHashCode2 == 3511770 ? !str3.equals("ruby") : iHashCode2 == 117 ? !str3.equals("u") : iHashCode2 != 118 || !str3.equals(ResourceDirection.f38808v))) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                yhr0 yhr0Var = (yhr0) arrayDeque.pop();
                                m102118g(str, yhr0Var, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new xhr0(yhr0Var, spannableStringBuilder.length(), null));
                                }
                                if (yhr0Var.f198389a.equals(str3)) {
                                    break;
                                }
                            }
                        } else if (!z) {
                            arrayDeque.push(yhr0.m214841a(strSubstring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i = length;
        }
        while (!arrayDeque.isEmpty()) {
            m102118g(str, (yhr0) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m102118g(str, yhr0.m214842b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: b */
    public static dtu0 m102113b(String str) {
        air0 air0Var = new air0();
        m102119h(str, air0Var);
        return air0Var.m96921a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static uhr0 m102114c(v6w0 v6w0Var, List list) {
        Charset charset = wew0.f185990c;
        String strM197250N = v6w0Var.m197250N(charset);
        if (strM197250N != null) {
            Pattern pattern = f75829a;
            Matcher matcher = pattern.matcher(strM197250N);
            if (matcher.matches()) {
                return m102116e(null, matcher, v6w0Var, list);
            }
            String strM197250N2 = v6w0Var.m197250N(charset);
            if (strM197250N2 != null) {
                Matcher matcher2 = pattern.matcher(strM197250N2);
                if (matcher2.matches()) {
                    return m102116e(strM197250N.trim(), matcher2, v6w0Var, list);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m102115d(List list, @Nullable String str, yhr0 yhr0Var) {
        List listM102117f = m102117f(list, str, yhr0Var);
        for (int i = 0; i < listM102117f.size(); i++) {
            jhr0 jhr0Var = ((zhr0) listM102117f.get(i)).f203228b;
            if (jhr0Var.m141575f() != -1) {
                return jhr0Var.m141575f();
            }
        }
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static uhr0 m102116e(@Nullable String str, Matcher matcher, v6w0 v6w0Var, List list) {
        air0 air0Var = new air0();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            air0Var.f70045a = dir0.m111910b(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            air0Var.f70046b = dir0.m111910b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m102119h(strGroup3, air0Var);
            StringBuilder sb = new StringBuilder();
            String strM197250N = v6w0Var.m197250N(wew0.f185990c);
            while (!TextUtils.isEmpty(strM197250N)) {
                if (sb.length() > 0) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(strM197250N.trim());
                strM197250N = v6w0Var.m197250N(wew0.f185990c);
            }
            air0Var.f70047c = m102112a(str, sb.toString(), list);
            return new uhr0(air0Var.m96921a().m113598p(), air0Var.f70045a, air0Var.f70046b);
        } catch (NumberFormatException unused) {
            svv0.m186111f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static List m102117f(List list, @Nullable String str, yhr0 yhr0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            jhr0 jhr0Var = (jhr0) list.get(i);
            int iM141576g = jhr0Var.m141576g(str, yhr0Var.f198389a, yhr0Var.f198392d, yhr0Var.f198391c);
            if (iM141576g > 0) {
                arrayList.add(new zhr0(iM141576g, jhr0Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static void m102118g(@Nullable String str, yhr0 yhr0Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = yhr0Var.f198390b;
        int length = spannableStringBuilder.length();
        String str2 = yhr0Var.f198389a;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iM102115d = m102115d(list2, str, yhr0Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, xhr0.f192910c);
                        int i3 = yhr0Var.f198390b;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((xhr0) arrayList.get(i4)).f192911a.f198389a)) {
                                xhr0 xhr0Var = (xhr0) arrayList.get(i4);
                                int iM102115d2 = m102115d(list2, str, xhr0Var.f192911a);
                                if (iM102115d2 == i2) {
                                    iM102115d2 = iM102115d != i2 ? iM102115d : 1;
                                }
                                int i5 = xhr0Var.f192911a.f198390b - length2;
                                int i6 = xhr0Var.f192912b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                                spannableStringBuilder.delete(i5, i6);
                                spannableStringBuilder.setSpan(new m1v0(charSequenceSubSequence.toString(), iM102115d2), i3, i5, 33);
                                length2 += charSequenceSubSequence.length();
                                i3 = i5;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : yhr0Var.f198392d) {
                                Map map = f75831c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = f75832d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals(ResourceDirection.f38808v)) {
                                return;
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals(RXScreenCaptureService.KEY_INDEX)) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listM102117f = m102117f(list2, str, yhr0Var);
        for (int i7 = 0; i7 < listM102117f.size(); i7++) {
            jhr0 jhr0Var = ((zhr0) listM102117f.get(i7)).f203228b;
            if (jhr0Var != null) {
                if (jhr0Var.m141577h() != -1) {
                    s2v0.m182087a(spannableStringBuilder, new StyleSpan(jhr0Var.m141577h()), i, length, 33);
                }
                if (jhr0Var.m141570A()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (jhr0Var.m141595z()) {
                    s2v0.m182087a(spannableStringBuilder, new ForegroundColorSpan(jhr0Var.m141573d()), i, length, 33);
                }
                if (jhr0Var.m141594y()) {
                    s2v0.m182087a(spannableStringBuilder, new BackgroundColorSpan(jhr0Var.m141572c()), i, length, 33);
                }
                if (jhr0Var.m141588s() != null) {
                    s2v0.m182087a(spannableStringBuilder, new TypefaceSpan(jhr0Var.m141588s()), i, length, 33);
                }
                int iM141574e = jhr0Var.m141574e();
                if (iM141574e == 1) {
                    s2v0.m182087a(spannableStringBuilder, new AbsoluteSizeSpan((int) jhr0Var.m141571b(), true), i, length, 33);
                } else if (iM141574e == 2) {
                    s2v0.m182087a(spannableStringBuilder, new RelativeSizeSpan(jhr0Var.m141571b()), i, length, 33);
                } else if (iM141574e == 3) {
                    s2v0.m182087a(spannableStringBuilder, new RelativeSizeSpan(jhr0Var.m141571b() / 100.0f), i, length, 33);
                }
                if (jhr0Var.m141593x()) {
                    spannableStringBuilder.setSpan(new l0v0(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0140 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m102119h(java.lang.String r16, p149l.air0 r17) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.bir0.m102119h(java.lang.String, l.air0):void");
    }
}
