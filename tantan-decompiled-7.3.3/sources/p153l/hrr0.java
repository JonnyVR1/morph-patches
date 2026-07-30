package p153l;

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
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
public final class hrr0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f111380a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f111381b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f111382c;

    /* JADX INFO: renamed from: d */
    public static final Map f111383d;

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
        f111382c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f111383d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x01b8, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static SpannedString m136922a(@Nullable String str, String str2, List list) {
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
                                    y4w0.m214278f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                y4w0.m214278f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            y4w0.m214278f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        y4w0.m214278f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
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
                    lev0.m153956d(true ^ strTrim.isEmpty());
                    int i4 = mpw0.f137957a;
                    String str3 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 98 ? str3.equals("b") : !(iHashCode2 == 99 ? !str3.equals("c") : iHashCode2 == 105 ? !str3.equals(RXScreenCaptureService.KEY_INDEX) : iHashCode2 == 3650 ? !str3.equals("rt") : iHashCode2 == 3314158 ? !str3.equals("lang") : iHashCode2 == 3511770 ? !str3.equals("ruby") : iHashCode2 == 117 ? !str3.equals("u") : iHashCode2 != 118 || !str3.equals(ResourceDirection.f39656v))) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                err0 err0Var = (err0) arrayDeque.pop();
                                m136928g(str, err0Var, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new drr0(err0Var, spannableStringBuilder.length(), null));
                                }
                                if (err0Var.f95535a.equals(str3)) {
                                    break;
                                }
                            }
                        } else if (!z) {
                            arrayDeque.push(err0.m122286a(strSubstring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i = length;
        }
        while (!arrayDeque.isEmpty()) {
            m136928g(str, (err0) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m136928g(str, err0.m122287b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: b */
    public static j2v0 m136923b(String str) {
        grr0 grr0Var = new grr0();
        m136929h(str, grr0Var);
        return grr0Var.m131868a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static arr0 m136924c(bgw0 bgw0Var, List list) {
        Charset charset = cow0.f82931c;
        String strM104257N = bgw0Var.m104257N(charset);
        if (strM104257N != null) {
            Pattern pattern = f111380a;
            Matcher matcher = pattern.matcher(strM104257N);
            if (matcher.matches()) {
                return m136926e(null, matcher, bgw0Var, list);
            }
            String strM104257N2 = bgw0Var.m104257N(charset);
            if (strM104257N2 != null) {
                Matcher matcher2 = pattern.matcher(strM104257N2);
                if (matcher2.matches()) {
                    return m136926e(strM104257N.trim(), matcher2, bgw0Var, list);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m136925d(List list, @Nullable String str, err0 err0Var) {
        List listM136927f = m136927f(list, str, err0Var);
        for (int i = 0; i < listM136927f.size(); i++) {
            pqr0 pqr0Var = ((frr0) listM136927f.get(i)).f100473b;
            if (pqr0Var.m173399f() != -1) {
                return pqr0Var.m173399f();
            }
        }
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static arr0 m136926e(@Nullable String str, Matcher matcher, bgw0 bgw0Var, List list) {
        grr0 grr0Var = new grr0();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            grr0Var.f106133a = jrr0.m146819b(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            grr0Var.f106134b = jrr0.m146819b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m136929h(strGroup3, grr0Var);
            StringBuilder sb = new StringBuilder();
            String strM104257N = bgw0Var.m104257N(cow0.f82931c);
            while (!TextUtils.isEmpty(strM104257N)) {
                if (sb.length() > 0) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(strM104257N.trim());
                strM104257N = bgw0Var.m104257N(cow0.f82931c);
            }
            grr0Var.f106135c = m136922a(str, sb.toString(), list);
            return new arr0(grr0Var.m131868a().m143281p(), grr0Var.f106133a, grr0Var.f106134b);
        } catch (NumberFormatException unused) {
            y4w0.m214278f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static List m136927f(List list, @Nullable String str, err0 err0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            pqr0 pqr0Var = (pqr0) list.get(i);
            int iM173400g = pqr0Var.m173400g(str, err0Var.f95535a, err0Var.f95538d, err0Var.f95537c);
            if (iM173400g > 0) {
                arrayList.add(new frr0(iM173400g, pqr0Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static void m136928g(@Nullable String str, err0 err0Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = err0Var.f95536b;
        int length = spannableStringBuilder.length();
        String str2 = err0Var.f95535a;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iM136925d = m136925d(list2, str, err0Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, drr0.f90420c);
                        int i3 = err0Var.f95536b;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((drr0) arrayList.get(i4)).f90421a.f95535a)) {
                                drr0 drr0Var = (drr0) arrayList.get(i4);
                                int iM136925d2 = m136925d(list2, str, drr0Var.f90421a);
                                if (iM136925d2 == i2) {
                                    iM136925d2 = iM136925d != i2 ? iM136925d : 1;
                                }
                                int i5 = drr0Var.f90421a.f95536b - length2;
                                int i6 = drr0Var.f90422b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                                spannableStringBuilder.delete(i5, i6);
                                spannableStringBuilder.setSpan(new sav0(charSequenceSubSequence.toString(), iM136925d2), i3, i5, 33);
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
                            for (String str3 : err0Var.f95538d) {
                                Map map = f111382c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = f111383d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals(ResourceDirection.f39656v)) {
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
        List listM136927f = m136927f(list2, str, err0Var);
        for (int i7 = 0; i7 < listM136927f.size(); i7++) {
            pqr0 pqr0Var = ((frr0) listM136927f.get(i7)).f100473b;
            if (pqr0Var != null) {
                if (pqr0Var.m173401h() != -1) {
                    ybv0.m215115a(spannableStringBuilder, new StyleSpan(pqr0Var.m173401h()), i, length, 33);
                }
                if (pqr0Var.m173394A()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (pqr0Var.m173419z()) {
                    ybv0.m215115a(spannableStringBuilder, new ForegroundColorSpan(pqr0Var.m173397d()), i, length, 33);
                }
                if (pqr0Var.m173418y()) {
                    ybv0.m215115a(spannableStringBuilder, new BackgroundColorSpan(pqr0Var.m173396c()), i, length, 33);
                }
                if (pqr0Var.m173412s() != null) {
                    ybv0.m215115a(spannableStringBuilder, new TypefaceSpan(pqr0Var.m173412s()), i, length, 33);
                }
                int iM173398e = pqr0Var.m173398e();
                if (iM173398e == 1) {
                    ybv0.m215115a(spannableStringBuilder, new AbsoluteSizeSpan((int) pqr0Var.m173395b(), true), i, length, 33);
                } else if (iM173398e == 2) {
                    ybv0.m215115a(spannableStringBuilder, new RelativeSizeSpan(pqr0Var.m173395b()), i, length, 33);
                } else if (iM173398e == 3) {
                    ybv0.m215115a(spannableStringBuilder, new RelativeSizeSpan(pqr0Var.m173395b() / 100.0f), i, length, 33);
                }
                if (pqr0Var.m173417x()) {
                    spannableStringBuilder.setSpan(new r9v0(), i, length, 33);
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
    */
    public static void m136929h(String str, grr0 grr0Var) {
        Matcher matcher = f111381b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                int i2 = Integer.MIN_VALUE;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring) {
                            case "center":
                            case "middle":
                                i2 = 1;
                                break;
                            case "end":
                                i2 = 2;
                                break;
                            case "start":
                                i2 = 0;
                                break;
                            default:
                                y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                break;
                        }
                        grr0Var.f106139g = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        grr0Var.f106137e = jrr0.m146818a(strGroup2);
                        grr0Var.f106138f = 0;
                    } else {
                        grr0Var.f106137e = Integer.parseInt(strGroup2);
                        grr0Var.f106138f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (!strGroup2.equals("center")) {
                                y4w0.m214278f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            }
                            i = 2;
                            break;
                        case -1074341483:
                            if (!strGroup2.equals(BLiveGiftBubblePopupTitlePosition.middle)) {
                                y4w0.m214278f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            }
                            i = 2;
                            break;
                        case 100571:
                            if (!strGroup2.equals("end")) {
                                y4w0.m214278f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            } else {
                                i = 3;
                            }
                            break;
                        case 3317767:
                            if (!strGroup2.equals(BLiveGiftBubblePopupTitlePosition.left)) {
                                y4w0.m214278f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            } else {
                                i = 4;
                            }
                            break;
                        case 108511772:
                            if (!strGroup2.equals("right")) {
                                y4w0.m214278f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            } else {
                                i = 5;
                            }
                            break;
                        case 109757538:
                            break;
                        default:
                            y4w0.m214278f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                            break;
                    }
                    grr0Var.f106136d = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (!strSubstring2.equals("line-left")) {
                                    y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i = Integer.MIN_VALUE;
                                } else {
                                    i = 0;
                                }
                                break;
                            case -1364013995:
                                if (!strSubstring2.equals("center")) {
                                    y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i = Integer.MIN_VALUE;
                                }
                                break;
                            case -1276788989:
                                if (!strSubstring2.equals("line-right")) {
                                    y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i = Integer.MIN_VALUE;
                                } else {
                                    i = 2;
                                }
                                break;
                            case -1074341483:
                                if (!strSubstring2.equals(BLiveGiftBubblePopupTitlePosition.middle)) {
                                    y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i = Integer.MIN_VALUE;
                                }
                                break;
                            case 100571:
                                if (!strSubstring2.equals("end")) {
                                    y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i = Integer.MIN_VALUE;
                                } else {
                                    i = 2;
                                }
                                break;
                            case 109757538:
                                if (!strSubstring2.equals("start")) {
                                    y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i = Integer.MIN_VALUE;
                                } else {
                                    i = 0;
                                }
                                break;
                            default:
                                y4w0.m214278f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i = Integer.MIN_VALUE;
                                break;
                        }
                        grr0Var.f106141i = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    grr0Var.f106140h = jrr0.m146818a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    grr0Var.f106142j = jrr0.m146818a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode != 3642 || !strGroup2.equals("rl")) {
                            y4w0.m214278f("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        }
                    } else if (strGroup2.equals("lr")) {
                        i = 2;
                    } else {
                        y4w0.m214278f("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i = Integer.MIN_VALUE;
                    }
                    grr0Var.f106143k = i;
                } else {
                    y4w0.m214278f("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                y4w0.m214278f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
