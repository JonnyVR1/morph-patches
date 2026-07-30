package p153l;

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
public final class eqr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f95376a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f95377b;

    /* JADX INFO: renamed from: c */
    public final boolean f95378c;

    /* JADX INFO: renamed from: d */
    public final long f95379d;

    /* JADX INFO: renamed from: e */
    public final long f95380e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final kqr0 f95381f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String[] f95382g;

    /* JADX INFO: renamed from: h */
    public final String f95383h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f95384i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final eqr0 f95385j;

    /* JADX INFO: renamed from: k */
    public final HashMap f95386k;

    /* JADX INFO: renamed from: l */
    public final HashMap f95387l;

    /* JADX INFO: renamed from: m */
    public List f95388m;

    public eqr0(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable kqr0 kqr0Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable eqr0 eqr0Var) {
        this.f95376a = str;
        this.f95377b = str2;
        this.f95384i = str4;
        this.f95381f = kqr0Var;
        this.f95382g = strArr;
        this.f95378c = str2 != null;
        this.f95379d = j;
        this.f95380e = j2;
        str3.getClass();
        this.f95383h = str3;
        this.f95385j = eqr0Var;
        this.f95386k = new HashMap();
        this.f95387l = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static eqr0 m122051b(@Nullable String str, long j, long j2, @Nullable kqr0 kqr0Var, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable eqr0 eqr0Var) {
        return new eqr0(str, null, j, j2, kqr0Var, strArr, str2, str3, eqr0Var);
    }

    /* JADX INFO: renamed from: c */
    public static eqr0 m122052c(String str) {
        return new eqr0(null, str.replaceAll("\r\n", SignParameters.NEW_LINE).replaceAll(" *\n *", SignParameters.NEW_LINE).replaceAll(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("[ \t\\x0B\f\r]+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: i */
    public static SpannableStringBuilder m122053i(String str, Map map) {
        if (!map.containsKey(str)) {
            j2v0 j2v0Var = new j2v0();
            j2v0Var.m143277l(new SpannableStringBuilder());
            map.put(str, j2v0Var);
        }
        CharSequence charSequenceM143282q = ((j2v0) map.get(str)).m143282q();
        charSequenceM143282q.getClass();
        return (SpannableStringBuilder) charSequenceM143282q;
    }

    /* JADX INFO: renamed from: a */
    public final int m122054a() {
        List list = this.f95388m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: d */
    public final eqr0 m122055d(int i) {
        List list = this.f95388m;
        if (list != null) {
            return (eqr0) list.get(i);
        }
        onl.m168333a();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final List m122056e(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        m122061k(j, this.f95383h, arrayList);
        TreeMap treeMap = new TreeMap();
        m122063m(j, false, this.f95383h, treeMap);
        m122062l(j, map, map2, this.f95383h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                iqr0 iqr0Var = (iqr0) map2.get(pair.first);
                iqr0Var.getClass();
                j2v0 j2v0Var = new j2v0();
                j2v0Var.m143268c(bitmapDecodeByteArray);
                j2v0Var.m143273h(iqr0Var.f116451b);
                j2v0Var.m143274i(0);
                j2v0Var.m143270e(iqr0Var.f116452c, 0);
                j2v0Var.m143271f(iqr0Var.f116454e);
                j2v0Var.m143276k(iqr0Var.f116455f);
                j2v0Var.m143269d(iqr0Var.f116456g);
                j2v0Var.m143280o(iqr0Var.f116459j);
                arrayList2.add(j2v0Var.m143281p());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            iqr0 iqr0Var2 = (iqr0) map2.get(entry.getKey());
            iqr0Var2.getClass();
            j2v0 j2v0Var2 = (j2v0) entry.getValue();
            CharSequence charSequenceM143282q = j2v0Var2.m143282q();
            charSequenceM143282q.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceM143282q;
            for (cqr0 cqr0Var : (cqr0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cqr0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(cqr0Var), spannableStringBuilder.getSpanEnd(cqr0Var), (CharSequence) "");
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
            j2v0Var2.m143270e(iqr0Var2.f116452c, iqr0Var2.f116453d);
            j2v0Var2.m143271f(iqr0Var2.f116454e);
            j2v0Var2.m143273h(iqr0Var2.f116451b);
            j2v0Var2.m143276k(iqr0Var2.f116455f);
            j2v0Var2.m143279n(iqr0Var2.f116458i, iqr0Var2.f116457h);
            j2v0Var2.m143280o(iqr0Var2.f116459j);
            arrayList2.add(j2v0Var2.m143281p());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public final void m122057f(eqr0 eqr0Var) {
        if (this.f95388m == null) {
            this.f95388m = new ArrayList();
        }
        this.f95388m.add(eqr0Var);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m122058g(long j) {
        long j2 = this.f95379d;
        if (j2 == -9223372036854775807L) {
            if (this.f95380e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.f95380e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.f95380e) {
            return j2 <= j && j < this.f95380e;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final long[] m122059h() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m122060j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: j */
    public final void m122060j(TreeSet treeSet, boolean z) {
        String str = this.f95376a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f95384i != null)) {
            long j = this.f95379d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f95380e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f95388m != null) {
            for (int i = 0; i < this.f95388m.size(); i++) {
                eqr0 eqr0Var = (eqr0) this.f95388m.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                eqr0Var.m122060j(treeSet, z2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m122061k(long j, String str, List list) {
        String str2;
        if (!"".equals(this.f95383h)) {
            str = this.f95383h;
        }
        if (m122058g(j) && "div".equals(this.f95376a) && (str2 = this.f95384i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m122054a(); i++) {
            m122055d(i).m122061k(j, str, list);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m122062l(long j, Map map, Map map2, String str, Map map3) {
        eqr0 eqr0Var;
        kqr0 kqr0VarM146625a;
        int i;
        Map map4 = map;
        if (m122058g(j)) {
            String str2 = !"".equals(this.f95383h) ? this.f95383h : str;
            for (Map.Entry entry : this.f95387l.entrySet()) {
                String str3 = (String) entry.getKey();
                int iIntValue = this.f95386k.containsKey(str3) ? ((Integer) this.f95386k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    j2v0 j2v0Var = (j2v0) map3.get(str3);
                    j2v0Var.getClass();
                    iqr0 iqr0Var = (iqr0) map2.get(str2);
                    iqr0Var.getClass();
                    kqr0 kqr0VarM146625a2 = jqr0.m146625a(this.f95381f, this.f95382g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) j2v0Var.m143282q();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        j2v0Var.m143277l(spannableStringBuilder);
                    }
                    if (kqr0VarM146625a2 != null) {
                        eqr0 eqr0Var2 = this.f95385j;
                        if (kqr0VarM146625a2.m150953r() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(kqr0VarM146625a2.m150953r()), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150944i()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150945j()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150943h()) {
                            ybv0.m215115a(spannableStringBuilder, new ForegroundColorSpan(kqr0VarM146625a2.m150949n()), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150942g()) {
                            ybv0.m215115a(spannableStringBuilder, new BackgroundColorSpan(kqr0VarM146625a2.m150948m()), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150939d() != null) {
                            ybv0.m215115a(spannableStringBuilder, new TypefaceSpan(kqr0VarM146625a2.m150939d()), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150956u() != null) {
                            dqr0 dqr0VarM150956u = kqr0VarM146625a2.m150956u();
                            dqr0VarM150956u.getClass();
                            int i2 = dqr0VarM150956u.f90285a;
                            if (i2 == -1) {
                                int i3 = iqr0Var.f116459j;
                                i2 = (i3 == 2 || i3 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = dqr0VarM150956u.f90286b;
                            }
                            int i4 = dqr0VarM150956u.f90287c;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            ybv0.m215115a(spannableStringBuilder, new bdv0(i2, i, i4), iIntValue, iIntValue2, 33);
                        }
                        int iM150952q = kqr0VarM146625a2.m150952q();
                        if (iM150952q == 2) {
                            while (true) {
                                if (eqr0Var2 == null) {
                                    eqr0Var2 = null;
                                    break;
                                }
                                kqr0 kqr0VarM146625a3 = jqr0.m146625a(eqr0Var2.f95381f, eqr0Var2.f95382g, map4);
                                if (kqr0VarM146625a3 != null && kqr0VarM146625a3.m150952q() == 1) {
                                    break;
                                } else {
                                    eqr0Var2 = eqr0Var2.f95385j;
                                }
                            }
                            if (eqr0Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(eqr0Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        eqr0Var = null;
                                        break;
                                    }
                                    eqr0 eqr0Var3 = (eqr0) arrayDeque.pop();
                                    kqr0 kqr0VarM146625a4 = jqr0.m146625a(eqr0Var3.f95381f, eqr0Var3.f95382g, map4);
                                    if (kqr0VarM146625a4 != null && kqr0VarM146625a4.m150952q() == 3) {
                                        eqr0Var = eqr0Var3;
                                        break;
                                    }
                                    for (int iM122054a = eqr0Var3.m122054a() - 1; iM122054a >= 0; iM122054a--) {
                                        arrayDeque.push(eqr0Var3.m122055d(iM122054a));
                                    }
                                }
                                if (eqr0Var != null) {
                                    if (eqr0Var.m122054a() != 1 || eqr0Var.m122055d(0).f95377b == null) {
                                        y4w0.m214277e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = eqr0Var.m122055d(0).f95377b;
                                        int i5 = mpw0.f137957a;
                                        kqr0 kqr0VarM146625a5 = jqr0.m146625a(eqr0Var.f95381f, eqr0Var.f95382g, map4);
                                        int iM150951p = kqr0VarM146625a5 != null ? kqr0VarM146625a5.m150951p() : -1;
                                        if (iM150951p == -1 && (kqr0VarM146625a = jqr0.m146625a(eqr0Var2.f95381f, eqr0Var2.f95382g, map4)) != null) {
                                            iM150951p = kqr0VarM146625a.m150951p();
                                        }
                                        spannableStringBuilder.setSpan(new sav0(str4, iM150951p), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iM150952q == 3 || iM150952q == 4) {
                            spannableStringBuilder.setSpan(new cqr0(), iIntValue, iIntValue2, 33);
                        }
                        if (kqr0VarM146625a2.m150941f()) {
                            ybv0.m215115a(spannableStringBuilder, new r9v0(), iIntValue, iIntValue2, 33);
                        }
                        int iM150950o = kqr0VarM146625a2.m150950o();
                        if (iM150950o == 1) {
                            ybv0.m215115a(spannableStringBuilder, new AbsoluteSizeSpan((int) kqr0VarM146625a2.m150946k(), true), iIntValue, iIntValue2, 33);
                        } else if (iM150950o == 2) {
                            ybv0.m215115a(spannableStringBuilder, new RelativeSizeSpan(kqr0VarM146625a2.m150946k()), iIntValue, iIntValue2, 33);
                        } else if (iM150950o == 3) {
                            ybv0.m215115a(spannableStringBuilder, new RelativeSizeSpan(kqr0VarM146625a2.m150946k() / 100.0f), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f95376a)) {
                            if (kqr0VarM146625a2.m150947l() != Float.MAX_VALUE) {
                                j2v0Var.m143275j((kqr0VarM146625a2.m150947l() * (-90.0f)) / 100.0f);
                            }
                            if (kqr0VarM146625a2.m150955t() != null) {
                                j2v0Var.m143278m(kqr0VarM146625a2.m150955t());
                            }
                            if (kqr0VarM146625a2.m150954s() != null) {
                                j2v0Var.m143272g(kqr0VarM146625a2.m150954s());
                            }
                        }
                    }
                }
            }
            int i6 = 0;
            while (i6 < m122054a()) {
                m122055d(i6).m122062l(j, map4, map2, str2, map3);
                i6++;
                map4 = map;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m122063m(long j, boolean z, String str, Map map) {
        this.f95386k.clear();
        this.f95387l.clear();
        if ("metadata".equals(this.f95376a)) {
            return;
        }
        if (!"".equals(this.f95383h)) {
            str = this.f95383h;
        }
        String str2 = str;
        if (this.f95378c && z) {
            SpannableStringBuilder spannableStringBuilderM122053i = m122053i(str2, map);
            String str3 = this.f95377b;
            str3.getClass();
            spannableStringBuilderM122053i.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f95376a) && z) {
            m122053i(str2, map).append('\n');
            return;
        }
        if (m122058g(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.f95386k;
                String str4 = (String) entry.getKey();
                CharSequence charSequenceM143282q = ((j2v0) entry.getValue()).m143282q();
                charSequenceM143282q.getClass();
                map2.put(str4, Integer.valueOf(charSequenceM143282q.length()));
            }
            boolean zEquals = "p".equals(this.f95376a);
            int i = 0;
            while (i < m122054a()) {
                m122055d(i).m122063m(j, z || zEquals, str2, map);
                i++;
                j = j;
                map = map;
            }
            Map map3 = map;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM122053i2 = m122053i(str2, map3);
                int length = spannableStringBuilderM122053i2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderM122053i2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderM122053i2.charAt(length) != '\n') {
                    spannableStringBuilderM122053i2.append('\n');
                }
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                HashMap map4 = this.f95387l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequenceM143282q2 = ((j2v0) entry2.getValue()).m143282q();
                charSequenceM143282q2.getClass();
                map4.put(str5, Integer.valueOf(charSequenceM143282q2.length()));
            }
        }
    }
}
