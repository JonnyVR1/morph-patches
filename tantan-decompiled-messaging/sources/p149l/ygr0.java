package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class ygr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f198224a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f198225b;

    /* JADX INFO: renamed from: c */
    public final boolean f198226c;

    /* JADX INFO: renamed from: d */
    public final long f198227d;

    /* JADX INFO: renamed from: e */
    public final long f198228e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ehr0 f198229f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String[] f198230g;

    /* JADX INFO: renamed from: h */
    public final String f198231h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f198232i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final ygr0 f198233j;

    /* JADX INFO: renamed from: k */
    public final HashMap f198234k;

    /* JADX INFO: renamed from: l */
    public final HashMap f198235l;

    /* JADX INFO: renamed from: m */
    public List f198236m;

    public ygr0(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable ehr0 ehr0Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable ygr0 ygr0Var) {
        this.f198224a = str;
        this.f198225b = str2;
        this.f198232i = str4;
        this.f198229f = ehr0Var;
        this.f198230g = strArr;
        this.f198226c = str2 != null;
        this.f198227d = j;
        this.f198228e = j2;
        str3.getClass();
        this.f198231h = str3;
        this.f198233j = ygr0Var;
        this.f198234k = new HashMap();
        this.f198235l = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static ygr0 m214749b(@Nullable String str, long j, long j2, @Nullable ehr0 ehr0Var, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable ygr0 ygr0Var) {
        return new ygr0(str, null, j, j2, ehr0Var, strArr, str2, str3, ygr0Var);
    }

    /* JADX INFO: renamed from: c */
    public static ygr0 m214750c(String str) {
        return new ygr0(null, str.replaceAll("\r\n", SignParameters.NEW_LINE).replaceAll(" *\n *", SignParameters.NEW_LINE).replaceAll(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("[ \t\\x0B\f\r]+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: i */
    public static SpannableStringBuilder m214751i(String str, Map map) {
        if (!map.containsKey(str)) {
            dtu0 dtu0Var = new dtu0();
            dtu0Var.m113594l(new SpannableStringBuilder());
            map.put(str, dtu0Var);
        }
        CharSequence charSequenceM113599q = ((dtu0) map.get(str)).m113599q();
        charSequenceM113599q.getClass();
        return (SpannableStringBuilder) charSequenceM113599q;
    }

    /* JADX INFO: renamed from: a */
    public final int m214752a() {
        List list = this.f198236m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: d */
    public final ygr0 m214753d(int i) {
        List list = this.f198236m;
        if (list != null) {
            return (ygr0) list.get(i);
        }
        zkl.m219192a();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final List m214754e(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        m214759k(j, this.f198231h, arrayList);
        TreeMap treeMap = new TreeMap();
        m214761m(j, false, this.f198231h, treeMap);
        m214760l(j, map, map2, this.f198231h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                chr0 chr0Var = (chr0) map2.get(pair.first);
                chr0Var.getClass();
                dtu0 dtu0Var = new dtu0();
                dtu0Var.m113585c(bitmapDecodeByteArray);
                dtu0Var.m113590h(chr0Var.f80998b);
                dtu0Var.m113591i(0);
                dtu0Var.m113587e(chr0Var.f80999c, 0);
                dtu0Var.m113588f(chr0Var.f81001e);
                dtu0Var.m113593k(chr0Var.f81002f);
                dtu0Var.m113586d(chr0Var.f81003g);
                dtu0Var.m113597o(chr0Var.f81006j);
                arrayList2.add(dtu0Var.m113598p());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            chr0 chr0Var2 = (chr0) map2.get(entry.getKey());
            chr0Var2.getClass();
            dtu0 dtu0Var2 = (dtu0) entry.getValue();
            CharSequence charSequenceM113599q = dtu0Var2.m113599q();
            charSequenceM113599q.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceM113599q;
            for (wgr0 wgr0Var : (wgr0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wgr0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(wgr0Var), spannableStringBuilder.getSpanEnd(wgr0Var), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            dtu0Var2.m113587e(chr0Var2.f80999c, chr0Var2.f81000d);
            dtu0Var2.m113588f(chr0Var2.f81001e);
            dtu0Var2.m113590h(chr0Var2.f80998b);
            dtu0Var2.m113593k(chr0Var2.f81002f);
            dtu0Var2.m113596n(chr0Var2.f81005i, chr0Var2.f81004h);
            dtu0Var2.m113597o(chr0Var2.f81006j);
            arrayList2.add(dtu0Var2.m113598p());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public final void m214755f(ygr0 ygr0Var) {
        if (this.f198236m == null) {
            this.f198236m = new ArrayList();
        }
        this.f198236m.add(ygr0Var);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m214756g(long j) {
        long j2 = this.f198227d;
        if (j2 == -9223372036854775807L) {
            if (this.f198228e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.f198228e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.f198228e) {
            return j2 <= j && j < this.f198228e;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final long[] m214757h() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m214758j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: j */
    public final void m214758j(TreeSet treeSet, boolean z) {
        String str = this.f198224a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f198232i != null)) {
            long j = this.f198227d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f198228e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f198236m != null) {
            for (int i = 0; i < this.f198236m.size(); i++) {
                ygr0 ygr0Var = (ygr0) this.f198236m.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                ygr0Var.m214758j(treeSet, z2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m214759k(long j, String str, List list) {
        String str2;
        if (!"".equals(this.f198231h)) {
            str = this.f198231h;
        }
        if (m214756g(j) && "div".equals(this.f198224a) && (str2 = this.f198232i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m214752a(); i++) {
            m214753d(i).m214759k(j, str, list);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m214760l(long j, Map map, Map map2, String str, Map map3) {
        ygr0 ygr0Var;
        ehr0 ehr0VarM111828a;
        int i;
        Map map4 = map;
        if (m214756g(j)) {
            String str2 = !"".equals(this.f198231h) ? this.f198231h : str;
            for (Map.Entry entry : this.f198235l.entrySet()) {
                String str3 = (String) entry.getKey();
                int iIntValue = this.f198234k.containsKey(str3) ? ((Integer) this.f198234k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    dtu0 dtu0Var = (dtu0) map3.get(str3);
                    dtu0Var.getClass();
                    chr0 chr0Var = (chr0) map2.get(str2);
                    chr0Var.getClass();
                    ehr0 ehr0VarM111828a2 = dhr0.m111828a(this.f198229f, this.f198230g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) dtu0Var.m113599q();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        dtu0Var.m113594l(spannableStringBuilder);
                    }
                    if (ehr0VarM111828a2 != null) {
                        ygr0 ygr0Var2 = this.f198233j;
                        if (ehr0VarM111828a2.m116586r() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(ehr0VarM111828a2.m116586r()), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116577i()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116578j()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116576h()) {
                            s2v0.m182087a(spannableStringBuilder, new ForegroundColorSpan(ehr0VarM111828a2.m116582n()), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116575g()) {
                            s2v0.m182087a(spannableStringBuilder, new BackgroundColorSpan(ehr0VarM111828a2.m116581m()), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116572d() != null) {
                            s2v0.m182087a(spannableStringBuilder, new TypefaceSpan(ehr0VarM111828a2.m116572d()), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116589u() != null) {
                            xgr0 xgr0VarM116589u = ehr0VarM111828a2.m116589u();
                            xgr0VarM116589u.getClass();
                            int i2 = xgr0VarM116589u.f192790a;
                            if (i2 == -1) {
                                int i3 = chr0Var.f81006j;
                                i2 = (i3 == 2 || i3 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = xgr0VarM116589u.f192791b;
                            }
                            int i4 = xgr0VarM116589u.f192792c;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            s2v0.m182087a(spannableStringBuilder, new v3v0(i2, i, i4), iIntValue, iIntValue2, 33);
                        }
                        int iM116585q = ehr0VarM111828a2.m116585q();
                        if (iM116585q == 2) {
                            while (true) {
                                if (ygr0Var2 == null) {
                                    ygr0Var2 = null;
                                    break;
                                }
                                ehr0 ehr0VarM111828a3 = dhr0.m111828a(ygr0Var2.f198229f, ygr0Var2.f198230g, map4);
                                if (ehr0VarM111828a3 != null && ehr0VarM111828a3.m116585q() == 1) {
                                    break;
                                } else {
                                    ygr0Var2 = ygr0Var2.f198233j;
                                }
                            }
                            if (ygr0Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ygr0Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ygr0Var = null;
                                        break;
                                    }
                                    ygr0 ygr0Var3 = (ygr0) arrayDeque.pop();
                                    ehr0 ehr0VarM111828a4 = dhr0.m111828a(ygr0Var3.f198229f, ygr0Var3.f198230g, map4);
                                    if (ehr0VarM111828a4 != null && ehr0VarM111828a4.m116585q() == 3) {
                                        ygr0Var = ygr0Var3;
                                        break;
                                    }
                                    for (int iM214752a = ygr0Var3.m214752a() - 1; iM214752a >= 0; iM214752a--) {
                                        arrayDeque.push(ygr0Var3.m214753d(iM214752a));
                                    }
                                }
                                if (ygr0Var != null) {
                                    if (ygr0Var.m214752a() != 1 || ygr0Var.m214753d(0).f198225b == null) {
                                        svv0.m186110e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = ygr0Var.m214753d(0).f198225b;
                                        int i5 = ggw0.f102568a;
                                        ehr0 ehr0VarM111828a5 = dhr0.m111828a(ygr0Var.f198229f, ygr0Var.f198230g, map4);
                                        int iM116584p = ehr0VarM111828a5 != null ? ehr0VarM111828a5.m116584p() : -1;
                                        if (iM116584p == -1 && (ehr0VarM111828a = dhr0.m111828a(ygr0Var2.f198229f, ygr0Var2.f198230g, map4)) != null) {
                                            iM116584p = ehr0VarM111828a.m116584p();
                                        }
                                        spannableStringBuilder.setSpan(new m1v0(str4, iM116584p), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iM116585q == 3 || iM116585q == 4) {
                            spannableStringBuilder.setSpan(new wgr0(), iIntValue, iIntValue2, 33);
                        }
                        if (ehr0VarM111828a2.m116574f()) {
                            s2v0.m182087a(spannableStringBuilder, new l0v0(), iIntValue, iIntValue2, 33);
                        }
                        int iM116583o = ehr0VarM111828a2.m116583o();
                        if (iM116583o == 1) {
                            s2v0.m182087a(spannableStringBuilder, new AbsoluteSizeSpan((int) ehr0VarM111828a2.m116579k(), true), iIntValue, iIntValue2, 33);
                        } else if (iM116583o == 2) {
                            s2v0.m182087a(spannableStringBuilder, new RelativeSizeSpan(ehr0VarM111828a2.m116579k()), iIntValue, iIntValue2, 33);
                        } else if (iM116583o == 3) {
                            s2v0.m182087a(spannableStringBuilder, new RelativeSizeSpan(ehr0VarM111828a2.m116579k() / 100.0f), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f198224a)) {
                            if (ehr0VarM111828a2.m116580l() != Float.MAX_VALUE) {
                                dtu0Var.m113592j((ehr0VarM111828a2.m116580l() * (-90.0f)) / 100.0f);
                            }
                            if (ehr0VarM111828a2.m116588t() != null) {
                                dtu0Var.m113595m(ehr0VarM111828a2.m116588t());
                            }
                            if (ehr0VarM111828a2.m116587s() != null) {
                                dtu0Var.m113589g(ehr0VarM111828a2.m116587s());
                            }
                        }
                    }
                }
            }
            int i6 = 0;
            while (i6 < m214752a()) {
                m214753d(i6).m214760l(j, map4, map2, str2, map3);
                i6++;
                map4 = map;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m214761m(long j, boolean z, String str, Map map) {
        this.f198234k.clear();
        this.f198235l.clear();
        if ("metadata".equals(this.f198224a)) {
            return;
        }
        if (!"".equals(this.f198231h)) {
            str = this.f198231h;
        }
        String str2 = str;
        if (this.f198226c && z) {
            SpannableStringBuilder spannableStringBuilderM214751i = m214751i(str2, map);
            String str3 = this.f198225b;
            str3.getClass();
            spannableStringBuilderM214751i.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f198224a) && z) {
            m214751i(str2, map).append('\n');
            return;
        }
        if (m214756g(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.f198234k;
                String str4 = (String) entry.getKey();
                CharSequence charSequenceM113599q = ((dtu0) entry.getValue()).m113599q();
                charSequenceM113599q.getClass();
                map2.put(str4, Integer.valueOf(charSequenceM113599q.length()));
            }
            boolean zEquals = "p".equals(this.f198224a);
            int i = 0;
            while (i < m214752a()) {
                m214753d(i).m214761m(j, z || zEquals, str2, map);
                i++;
                j = j;
                map = map;
            }
            Map map3 = map;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM214751i2 = m214751i(str2, map3);
                int length = spannableStringBuilderM214751i2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderM214751i2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderM214751i2.charAt(length) != '\n') {
                    spannableStringBuilderM214751i2.append('\n');
                }
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                HashMap map4 = this.f198235l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequenceM113599q2 = ((dtu0) entry2.getValue()).m113599q();
                charSequenceM113599q2.getClass();
                map4.put(str5, Integer.valueOf(charSequenceM113599q2.length()));
            }
        }
    }
}
