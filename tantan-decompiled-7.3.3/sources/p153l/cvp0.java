package p153l;

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
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
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
public final class cvp0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f84023a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f84024b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map<String, Integer> f84025c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, Integer> f84026d;

    /* JADX INFO: renamed from: l.cvp0$b */
    public static class C16377b {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C16377b> f84027c = new Comparator() { // from class: l.dvp0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((cvp0.C16377b) obj).f84028a.f84031b, ((cvp0.C16377b) obj2).f84028a.f84031b);
            }
        };

        /* JADX INFO: renamed from: a */
        public final C16378c f84028a;

        /* JADX INFO: renamed from: b */
        public final int f84029b;

        public C16377b(C16378c c16378c, int i) {
            this.f84028a = c16378c;
            this.f84029b = i;
        }
    }

    /* JADX INFO: renamed from: l.cvp0$c */
    public static final class C16378c {

        /* JADX INFO: renamed from: a */
        public final String f84030a;

        /* JADX INFO: renamed from: b */
        public final int f84031b;

        /* JADX INFO: renamed from: c */
        public final String f84032c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f84033d;

        public C16378c(String str, int i, String str2, Set<String> set) {
            this.f84031b = i;
            this.f84030a = str;
            this.f84032c = str2;
            this.f84033d = set;
        }

        /* JADX INFO: renamed from: a */
        public static C16378c m112847a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            w11.m204365a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrM105119a1 = bmk0.m105119a1(strTrim, "\\.");
            String str3 = strArrM105119a1[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrM105119a1.length; i2++) {
                hashSet.add(strArrM105119a1[i2]);
            }
            return new C16378c(str3, i, str2, hashSet);
        }

        /* JADX INFO: renamed from: b */
        public static C16378c m112848b() {
            return new C16378c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* JADX INFO: renamed from: l.cvp0$d */
    public static final class C16379d implements Comparable<C16379d> {

        /* JADX INFO: renamed from: a */
        public final int f84034a;

        /* JADX INFO: renamed from: b */
        public final avp0 f84035b;

        public C16379d(int i, avp0 avp0Var) {
            this.f84034a = i;
            this.f84035b = avp0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C16379d c16379d) {
            return Integer.compare(this.f84034a, c16379d.f84034a);
        }
    }

    /* JADX INFO: renamed from: l.cvp0$e */
    public static final class C16380e {

        /* JADX INFO: renamed from: c */
        public CharSequence f84038c;

        /* JADX INFO: renamed from: a */
        public long f84036a = 0;

        /* JADX INFO: renamed from: b */
        public long f84037b = 0;

        /* JADX INFO: renamed from: d */
        public int f84039d = 2;

        /* JADX INFO: renamed from: e */
        public float f84040e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f84041f = 1;

        /* JADX INFO: renamed from: g */
        public int f84042g = 0;

        /* JADX INFO: renamed from: h */
        public float f84043h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f84044i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f84045j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f84046k = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b */
        public static float m112850b(float f, int i) {
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
        public static Layout.Alignment m112851c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            kyv.m152151i("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* JADX INFO: renamed from: d */
        public static float m112852d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            wtq0.m207906a(String.valueOf(i));
            return 0.0f;
        }

        /* JADX INFO: renamed from: e */
        public static float m112853e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public static int m112854f(int i) {
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
        public bvp0 m112855a() {
            return new bvp0(m112856g().m160754a(), this.f84036a, this.f84037b);
        }

        /* JADX INFO: renamed from: g */
        public myb.C18746b m112856g() {
            float fM112853e = this.f84043h;
            if (fM112853e == -3.4028235E38f) {
                fM112853e = m112853e(this.f84039d);
            }
            int iM112854f = this.f84044i;
            if (iM112854f == Integer.MIN_VALUE) {
                iM112854f = m112854f(this.f84039d);
            }
            myb.C18746b c18746bM160771r = new myb.C18746b().m160769p(m112851c(this.f84039d)).m160761h(m112850b(this.f84040e, this.f84041f), this.f84041f).m160762i(this.f84042g).m160764k(fM112853e).m160765l(iM112854f).m160767n(Math.min(this.f84045j, m112852d(iM112854f, fM112853e))).m160771r(this.f84046k);
            CharSequence charSequence = this.f84038c;
            if (charSequence != null) {
                c18746bM160771r.m160768o(charSequence);
            }
            return c18746bM160771r;
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
        f84025c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f84026d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m112820a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f84025c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f84026d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m112821b(String str, SpannableStringBuilder spannableStringBuilder) {
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
                kyv.m152151i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m112822c(SpannableStringBuilder spannableStringBuilder, @Nullable String str, C16378c c16378c, List<C16377b> list, List<avp0> list2) {
        int iM112828i = m112828i(list2, str, c16378c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C16377b.f84027c);
        int i = c16378c.f84031b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((C16377b) arrayList.get(i2)).f84028a.f84030a)) {
                C16377b c16377b = (C16377b) arrayList.get(i2);
                int iM112826g = m112826g(m112828i(list2, str, c16377b.f84028a), iM112828i, 1);
                int i3 = c16377b.f84028a.f84031b - length;
                int i4 = c16377b.f84029b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new uqd0(charSequenceSubSequence.toString(), iM112826g), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m112823d(@Nullable String str, C16378c c16378c, List<C16377b> list, SpannableStringBuilder spannableStringBuilder, List<avp0> list2) {
        int i = c16378c.f84031b;
        int length = spannableStringBuilder.length();
        String str2 = c16378c.f84030a;
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
                m112820a(spannableStringBuilder, c16378c.f84033d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                m112822c(spannableStringBuilder, str, c16378c, list, list2);
                break;
            default:
                return;
        }
        List<C16379d> listM112827h = m112827h(list2, str, c16378c);
        for (int i2 = 0; i2 < listM112827h.size(); i2++) {
            m112824e(spannableStringBuilder, listM112827h.get(i2).f84035b, i, length);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m112824e(SpannableStringBuilder spannableStringBuilder, avp0 avp0Var, int i, int i2) {
        if (avp0Var == null) {
            return;
        }
        if (avp0Var.m100489i() != -1) {
            tuf0.m192748a(spannableStringBuilder, new StyleSpan(avp0Var.m100489i()), i, i2, 33);
        }
        if (avp0Var.m100492l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (avp0Var.m100493m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (avp0Var.m100491k()) {
            tuf0.m192748a(spannableStringBuilder, new ForegroundColorSpan(avp0Var.m100483c()), i, i2, 33);
        }
        if (avp0Var.m100490j()) {
            tuf0.m192748a(spannableStringBuilder, new BackgroundColorSpan(avp0Var.m100481a()), i, i2, 33);
        }
        if (avp0Var.m100484d() != null) {
            tuf0.m192748a(spannableStringBuilder, new TypefaceSpan(avp0Var.m100484d()), i, i2, 33);
        }
        int iM100486f = avp0Var.m100486f();
        if (iM100486f == 1) {
            tuf0.m192748a(spannableStringBuilder, new AbsoluteSizeSpan((int) avp0Var.m100485e(), true), i, i2, 33);
        } else if (iM100486f == 2) {
            tuf0.m192748a(spannableStringBuilder, new RelativeSizeSpan(avp0Var.m100485e()), i, i2, 33);
        } else if (iM100486f == 3) {
            tuf0.m192748a(spannableStringBuilder, new RelativeSizeSpan(avp0Var.m100485e() / 100.0f), i, i2, 33);
        }
        if (avp0Var.m100482b()) {
            spannableStringBuilder.setSpan(new fhl(), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m112825f(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m112826g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        fig0.m125680a();
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static List<C16379d> m112827h(List<avp0> list, @Nullable String str, C16378c c16378c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            avp0 avp0Var = list.get(i);
            int iM100488h = avp0Var.m100488h(str, c16378c.f84030a, c16378c.f84033d, c16378c.f84032c);
            if (iM100488h > 0) {
                arrayList.add(new C16379d(iM100488h, avp0Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static int m112828i(List<avp0> list, @Nullable String str, C16378c c16378c) {
        List<C16379d> listM112827h = m112827h(list, str, c16378c);
        for (int i = 0; i < listM112827h.size(); i++) {
            avp0 avp0Var = listM112827h.get(i).f84035b;
            if (avp0Var.m100487g() != -1) {
                return avp0Var.m100487g();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static String m112829j(String str) {
        String strTrim = str.trim();
        w11.m204365a(!strTrim.isEmpty());
        return bmk0.m105122b1(strTrim, "[ \\.]")[0];
    }

    /* JADX INFO: renamed from: k */
    public static boolean m112830k(String str) {
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
    public static myb m112831l(CharSequence charSequence) {
        C16380e c16380e = new C16380e();
        c16380e.f84038c = charSequence;
        return c16380e.m112856g().m160754a();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static bvp0 m112832m(@Nullable String str, Matcher matcher, ig60 ig60Var, List<avp0> list) {
        C16380e c16380e = new C16380e();
        try {
            c16380e.f84036a = gvp0.m132577d((String) w11.m204369e(matcher.group(1)));
            c16380e.f84037b = gvp0.m132577d((String) w11.m204369e(matcher.group(2)));
            m112835p((String) w11.m204369e(matcher.group(3)), c16380e);
            StringBuilder sb = new StringBuilder();
            String strM139829s = ig60Var.m139829s();
            while (!TextUtils.isEmpty(strM139829s)) {
                if (sb.length() > 0) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(strM139829s.trim());
                strM139829s = ig60Var.m139829s();
            }
            c16380e.f84038c = m112836q(str, sb.toString(), list);
            return c16380e.m112855a();
        } catch (NumberFormatException unused) {
            kyv.m152151i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static bvp0 m112833n(ig60 ig60Var, List<avp0> list) {
        String strM139829s = ig60Var.m139829s();
        if (strM139829s == null) {
            return null;
        }
        Pattern pattern = f84023a;
        Matcher matcher = pattern.matcher(strM139829s);
        if (matcher.matches()) {
            return m112832m(null, matcher, ig60Var, list);
        }
        String strM139829s2 = ig60Var.m139829s();
        if (strM139829s2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strM139829s2);
        if (matcher2.matches()) {
            return m112832m(strM139829s.trim(), matcher2, ig60Var, list);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static myb.C18746b m112834o(String str) {
        C16380e c16380e = new C16380e();
        m112835p(str, c16380e);
        return c16380e.m112856g();
    }

    /* JADX INFO: renamed from: p */
    public static void m112835p(String str, C16380e c16380e) {
        Matcher matcher = f84024b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) w11.m204369e(matcher.group(1));
            String str3 = (String) w11.m204369e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m112838s(str3, c16380e);
                } else if ("align".equals(str2)) {
                    c16380e.f84039d = m112841v(str3);
                } else if ("position".equals(str2)) {
                    m112840u(str3, c16380e);
                } else if ("size".equals(str2)) {
                    c16380e.f84045j = gvp0.m132576c(str3);
                } else if ("vertical".equals(str2)) {
                    c16380e.f84046k = m112842w(str3);
                } else {
                    kyv.m152151i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                kyv.m152151i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static SpannedString m112836q(@Nullable String str, String str2, List<avp0> list) {
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
                    m112821b(str2.substring(i, iIndexOf), spannableStringBuilder);
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
                int iM112825f = i + 1;
                if (iM112825f < str2.length()) {
                    boolean z = str2.charAt(iM112825f) == '/';
                    iM112825f = m112825f(str2, iM112825f);
                    int i2 = iM112825f - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iM112825f - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strM112829j = m112829j(strSubstring);
                        if (m112830k(strM112829j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C16378c c16378c = (C16378c) arrayDeque.pop();
                                    m112823d(str, c16378c, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new C16377b(c16378c, spannableStringBuilder.length()));
                                    }
                                    if (c16378c.f84030a.equals(strM112829j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C16378c.m112847a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iM112825f;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m112823d(str, (C16378c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m112823d(str, C16378c.m112848b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: r */
    public static int m112837r(String str) {
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
                kyv.m152151i("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m112838s(String str, C16380e c16380e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c16380e.f84042g = m112837r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c16380e.f84040e = gvp0.m132576c(str);
            c16380e.f84041f = 0;
        } else {
            c16380e.f84040e = Integer.parseInt(str);
            c16380e.f84041f = 1;
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m112839t(String str) {
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
                kyv.m152151i("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m112840u(String str, C16380e c16380e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c16380e.f84044i = m112839t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c16380e.f84043h = gvp0.m132576c(str);
    }

    /* JADX INFO: renamed from: v */
    public static int m112841v(String str) {
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
                kyv.m152151i("WebvttCueParser", "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m112842w(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        kyv.m152151i("WebvttCueParser", "Invalid 'vertical' value: ".concat(str));
        return Integer.MIN_VALUE;
    }
}
