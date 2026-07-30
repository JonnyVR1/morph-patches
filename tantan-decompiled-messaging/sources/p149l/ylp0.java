package p149l;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ylp0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f198908a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f198909b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map<String, Integer> f198910c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, Integer> f198911d;

    /* JADX INFO: renamed from: l.ylp0$b */
    public static class C21431b {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C21431b> f198912c = new Comparator() { // from class: l.zlp0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((ylp0.C21431b) obj).f198913a.f198916b, ((ylp0.C21431b) obj2).f198913a.f198916b);
            }
        };

        /* JADX INFO: renamed from: a */
        public final C21432c f198913a;

        /* JADX INFO: renamed from: b */
        public final int f198914b;

        public C21431b(C21432c c21432c, int i) {
            this.f198913a = c21432c;
            this.f198914b = i;
        }
    }

    /* JADX INFO: renamed from: l.ylp0$c */
    public static final class C21432c {

        /* JADX INFO: renamed from: a */
        public final String f198915a;

        /* JADX INFO: renamed from: b */
        public final int f198916b;

        /* JADX INFO: renamed from: c */
        public final String f198917c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f198918d;

        public C21432c(String str, int i, String str2, Set<String> set) {
            this.f198916b = i;
            this.f198915a = str;
            this.f198917c = str2;
            this.f198918d = set;
        }

        /* JADX INFO: renamed from: a */
        public static C21432c m215296a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            p11.m167007a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrM197841a1 = vck0.m197841a1(strTrim, "\\.");
            String str3 = strArrM197841a1[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrM197841a1.length; i2++) {
                hashSet.add(strArrM197841a1[i2]);
            }
            return new C21432c(str3, i, str2, hashSet);
        }

        /* JADX INFO: renamed from: b */
        public static C21432c m215297b() {
            return new C21432c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* JADX INFO: renamed from: l.ylp0$d */
    public static final class C21433d implements Comparable<C21433d> {

        /* JADX INFO: renamed from: a */
        public final int f198919a;

        /* JADX INFO: renamed from: b */
        public final wlp0 f198920b;

        public C21433d(int i, wlp0 wlp0Var) {
            this.f198919a = i;
            this.f198920b = wlp0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C21433d c21433d) {
            return Integer.compare(this.f198919a, c21433d.f198919a);
        }
    }

    /* JADX INFO: renamed from: l.ylp0$e */
    public static final class C21434e {

        /* JADX INFO: renamed from: c */
        public CharSequence f198923c;

        /* JADX INFO: renamed from: a */
        public long f198921a = 0;

        /* JADX INFO: renamed from: b */
        public long f198922b = 0;

        /* JADX INFO: renamed from: d */
        public int f198924d = 2;

        /* JADX INFO: renamed from: e */
        public float f198925e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f198926f = 1;

        /* JADX INFO: renamed from: g */
        public int f198927g = 0;

        /* JADX INFO: renamed from: h */
        public float f198928h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f198929i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f198930j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f198931k = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b */
        public static float m215299b(float f, int i) {
            if (f != -3.4028235E38f && i == 0 && (f < 0.0f || f > 1.0f)) {
                return 1.0f;
            }
            if (f != -3.4028235E38f) {
                return f;
            }
            return i == 0 ? 1.0f : -3.4028235E38f;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static Layout.Alignment m215300c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            jwv.m143689i("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* JADX INFO: renamed from: d */
        public static float m215301d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            qkq0.m175383a(String.valueOf(i));
            return 0.0f;
        }

        /* JADX INFO: renamed from: e */
        public static float m215302e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public static int m215303f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public xlp0 m215304a() {
            return new xlp0(m215305g().m216311a(), this.f198921a, this.f198922b);
        }

        /* JADX INFO: renamed from: g */
        public ywb.C21557b m215305g() {
            float fM215302e = this.f198928h;
            if (fM215302e == -3.4028235E38f) {
                fM215302e = m215302e(this.f198924d);
            }
            int iM215303f = this.f198929i;
            if (iM215303f == Integer.MIN_VALUE) {
                iM215303f = m215303f(this.f198924d);
            }
            ywb.C21557b c21557bM216328r = new ywb.C21557b().m216326p(m215300c(this.f198924d)).m216318h(m215299b(this.f198925e, this.f198926f), this.f198926f).m216319i(this.f198927g).m216321k(fM215302e).m216322l(iM215303f).m216324n(Math.min(this.f198930j, m215301d(iM215303f, fM215302e))).m216328r(this.f198931k);
            CharSequence charSequence = this.f198923c;
            if (charSequence != null) {
                c21557bM216328r.m216325o(charSequence);
            }
            return c21557bM216328r;
        }
    }

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
        f198910c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f198911d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m215269a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f198910c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f198911d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m215270b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                jwv.m143689i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m215271c(SpannableStringBuilder spannableStringBuilder, @Nullable String str, C21432c c21432c, List<C21431b> list, List<wlp0> list2) {
        int iM215277i = m215277i(list2, str, c21432c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C21431b.f198912c);
        int i = c21432c.f198916b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((C21431b) arrayList.get(i2)).f198913a.f198915a)) {
                C21431b c21431b = (C21431b) arrayList.get(i2);
                int iM215275g = m215275g(m215277i(list2, str, c21431b.f198913a), iM215277i, 1);
                int i3 = c21431b.f198913a.f198916b - length;
                int i4 = c21431b.f198914b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new rid0(charSequenceSubSequence.toString(), iM215275g), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m215272d(@Nullable String str, C21432c c21432c, List<C21431b> list, SpannableStringBuilder spannableStringBuilder, List<wlp0> list2) {
        int i = c21432c.f198916b;
        int length = spannableStringBuilder.length();
        String str2 = c21432c.f198915a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                m215269a(spannableStringBuilder, c21432c.f198918d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                m215271c(spannableStringBuilder, str, c21432c, list, list2);
                break;
            default:
                return;
        }
        List<C21433d> listM215276h = m215276h(list2, str, c21432c);
        for (int i2 = 0; i2 < listM215276h.size(); i2++) {
            m215273e(spannableStringBuilder, listM215276h.get(i2).f198920b, i, length);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m215273e(SpannableStringBuilder spannableStringBuilder, wlp0 wlp0Var, int i, int i2) {
        if (wlp0Var == null) {
            return;
        }
        if (wlp0Var.m203855i() != -1) {
            kmf0.m146530a(spannableStringBuilder, new StyleSpan(wlp0Var.m203855i()), i, i2, 33);
        }
        if (wlp0Var.m203858l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (wlp0Var.m203859m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (wlp0Var.m203857k()) {
            kmf0.m146530a(spannableStringBuilder, new ForegroundColorSpan(wlp0Var.m203849c()), i, i2, 33);
        }
        if (wlp0Var.m203856j()) {
            kmf0.m146530a(spannableStringBuilder, new BackgroundColorSpan(wlp0Var.m203847a()), i, i2, 33);
        }
        if (wlp0Var.m203850d() != null) {
            kmf0.m146530a(spannableStringBuilder, new TypefaceSpan(wlp0Var.m203850d()), i, i2, 33);
        }
        int iM203852f = wlp0Var.m203852f();
        if (iM203852f == 1) {
            kmf0.m146530a(spannableStringBuilder, new AbsoluteSizeSpan((int) wlp0Var.m203851e(), true), i, i2, 33);
        } else if (iM203852f == 2) {
            kmf0.m146530a(spannableStringBuilder, new RelativeSizeSpan(wlp0Var.m203851e()), i, i2, 33);
        } else if (iM203852f == 3) {
            kmf0.m146530a(spannableStringBuilder, new RelativeSizeSpan(wlp0Var.m203851e() / 100.0f), i, i2, 33);
        }
        if (wlp0Var.m203848b()) {
            spannableStringBuilder.setSpan(new pel(), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m215274f(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m215275g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        x9g0.m207497a();
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static List<C21433d> m215276h(List<wlp0> list, @Nullable String str, C21432c c21432c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            wlp0 wlp0Var = list.get(i);
            int iM203854h = wlp0Var.m203854h(str, c21432c.f198915a, c21432c.f198918d, c21432c.f198917c);
            if (iM203854h > 0) {
                arrayList.add(new C21433d(iM203854h, wlp0Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static int m215277i(List<wlp0> list, @Nullable String str, C21432c c21432c) {
        List<C21433d> listM215276h = m215276h(list, str, c21432c);
        for (int i = 0; i < listM215276h.size(); i++) {
            wlp0 wlp0Var = listM215276h.get(i).f198920b;
            if (wlp0Var.m203853g() != -1) {
                return wlp0Var.m203853g();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static String m215278j(String str) {
        String strTrim = str.trim();
        p11.m167007a(!strTrim.isEmpty());
        return vck0.m197844b1(strTrim, "[ \\.]")[0];
    }

    /* JADX INFO: renamed from: k */
    public static boolean m215279k(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static ywb m215280l(CharSequence charSequence) {
        C21434e c21434e = new C21434e();
        c21434e.f198923c = charSequence;
        return c21434e.m215305g().m216311a();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static xlp0 m215281m(@Nullable String str, Matcher matcher, d860 d860Var, List<wlp0> list) {
        C21434e c21434e = new C21434e();
        try {
            c21434e.f198921a = cmp0.m107690d((String) p11.m167011e(matcher.group(1)));
            c21434e.f198922b = cmp0.m107690d((String) p11.m167011e(matcher.group(2)));
            m215284p((String) p11.m167011e(matcher.group(3)), c21434e);
            StringBuilder sb = new StringBuilder();
            String strM110313s = d860Var.m110313s();
            while (!TextUtils.isEmpty(strM110313s)) {
                if (sb.length() > 0) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(strM110313s.trim());
                strM110313s = d860Var.m110313s();
            }
            c21434e.f198923c = m215285q(str, sb.toString(), list);
            return c21434e.m215304a();
        } catch (NumberFormatException unused) {
            jwv.m143689i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static xlp0 m215282n(d860 d860Var, List<wlp0> list) {
        String strM110313s = d860Var.m110313s();
        if (strM110313s == null) {
            return null;
        }
        Pattern pattern = f198908a;
        Matcher matcher = pattern.matcher(strM110313s);
        if (matcher.matches()) {
            return m215281m(null, matcher, d860Var, list);
        }
        String strM110313s2 = d860Var.m110313s();
        if (strM110313s2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strM110313s2);
        if (matcher2.matches()) {
            return m215281m(strM110313s.trim(), matcher2, d860Var, list);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static ywb.C21557b m215283o(String str) {
        C21434e c21434e = new C21434e();
        m215284p(str, c21434e);
        return c21434e.m215305g();
    }

    /* JADX INFO: renamed from: p */
    public static void m215284p(String str, C21434e c21434e) {
        Matcher matcher = f198909b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) p11.m167011e(matcher.group(1));
            String str3 = (String) p11.m167011e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m215287s(str3, c21434e);
                } else if ("align".equals(str2)) {
                    c21434e.f198924d = m215290v(str3);
                } else if ("position".equals(str2)) {
                    m215289u(str3, c21434e);
                } else if ("size".equals(str2)) {
                    c21434e.f198930j = cmp0.m107689c(str3);
                } else if ("vertical".equals(str2)) {
                    c21434e.f198931k = m215291w(str3);
                } else {
                    jwv.m143689i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                jwv.m143689i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static SpannedString m215285q(@Nullable String str, String str2, List<wlp0> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    m215270b(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iM215274f = i + 1;
                if (iM215274f < str2.length()) {
                    boolean z = str2.charAt(iM215274f) == '/';
                    iM215274f = m215274f(str2, iM215274f);
                    int i2 = iM215274f - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iM215274f - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strM215278j = m215278j(strSubstring);
                        if (m215279k(strM215278j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C21432c c21432c = (C21432c) arrayDeque.pop();
                                    m215272d(str, c21432c, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new C21431b(c21432c, spannableStringBuilder.length()));
                                    }
                                    if (c21432c.f198915a.equals(strM215278j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C21432c.m215296a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iM215274f;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m215272d(str, (C21432c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m215272d(str, C21432c.m215297b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: r */
    public static int m215286r(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                jwv.m143689i("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m215287s(String str, C21434e c21434e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c21434e.f198927g = m215286r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c21434e.f198925e = cmp0.m107689c(str);
            c21434e.f198926f = 0;
        } else {
            c21434e.f198925e = Integer.parseInt(str);
            c21434e.f198926f = 1;
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m215288t(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                jwv.m143689i("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m215289u(String str, C21434e c21434e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c21434e.f198929i = m215288t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c21434e.f198928h = cmp0.m107689c(str);
    }

    /* JADX INFO: renamed from: v */
    public static int m215290v(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                jwv.m143689i("WebvttCueParser", "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m215291w(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        jwv.m143689i("WebvttCueParser", "Invalid 'vertical' value: ".concat(str));
        return Integer.MIN_VALUE;
    }
}
