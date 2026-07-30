package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gcj0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f102026a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f102027b;

    /* JADX INFO: renamed from: c */
    public final boolean f102028c;

    /* JADX INFO: renamed from: d */
    public final long f102029d;

    /* JADX INFO: renamed from: e */
    public final long f102030e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final jcj0 f102031f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String[] f102032g;

    /* JADX INFO: renamed from: h */
    public final String f102033h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f102034i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final gcj0 f102035j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Integer> f102036k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, Integer> f102037l;

    /* JADX INFO: renamed from: m */
    public List<gcj0> f102038m;

    public gcj0(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable jcj0 jcj0Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable gcj0 gcj0Var) {
        this.f102026a = str;
        this.f102027b = str2;
        this.f102034i = str4;
        this.f102031f = jcj0Var;
        this.f102032g = strArr;
        this.f102028c = str2 != null;
        this.f102029d = j;
        this.f102030e = j2;
        this.f102033h = (String) p11.m167011e(str3);
        this.f102035j = gcj0Var;
        this.f102036k = new HashMap<>();
        this.f102037l = new HashMap<>();
    }

    /* JADX INFO: renamed from: c */
    public static gcj0 m125501c(@Nullable String str, long j, long j2, @Nullable jcj0 jcj0Var, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable gcj0 gcj0Var) {
        return new gcj0(str, null, j, j2, jcj0Var, strArr, str2, str3, gcj0Var);
    }

    /* JADX INFO: renamed from: d */
    public static gcj0 m125502d(String str) {
        return new gcj0(null, icj0.m135353b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m125503e(SpannableStringBuilder spannableStringBuilder) {
        for (ttd ttdVar : (ttd[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ttd.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ttdVar), spannableStringBuilder.getSpanEnd(ttdVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* JADX INFO: renamed from: k */
    public static SpannableStringBuilder m125504k(String str, Map<String, ywb.C21557b> map) {
        if (!map.containsKey(str)) {
            ywb.C21557b c21557b = new ywb.C21557b();
            c21557b.m216325o(new SpannableStringBuilder());
            map.put(str, c21557b);
        }
        return (SpannableStringBuilder) p11.m167011e(map.get(str).m216315e());
    }

    /* JADX INFO: renamed from: a */
    public void m125505a(gcj0 gcj0Var) {
        if (this.f102038m == null) {
            this.f102038m = new ArrayList();
        }
        this.f102038m.add(gcj0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m125506b(Map<String, jcj0> map, ywb.C21557b c21557b, int i, int i2, int i3) {
        jcj0 jcj0VarM135357f = icj0.m135357f(this.f102031f, this.f102032g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c21557b.m216315e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c21557b.m216325o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (jcj0VarM135357f != null) {
            icj0.m135352a(spannableStringBuilder2, i, i2, jcj0VarM135357f, this.f102035j, map, i3);
            if ("p".equals(this.f102026a)) {
                if (jcj0VarM135357f.m140964k() != Float.MAX_VALUE) {
                    c21557b.m216323m((jcj0VarM135357f.m140964k() * (-90.0f)) / 100.0f);
                }
                if (jcj0VarM135357f.m140966m() != null) {
                    c21557b.m216326p(jcj0VarM135357f.m140966m());
                }
                if (jcj0VarM135357f.m140961h() != null) {
                    c21557b.m216320j(jcj0VarM135357f.m140961h());
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public gcj0 m125507f(int i) {
        List<gcj0> list = this.f102038m;
        if (list != null) {
            return list.get(i);
        }
        zkl.m219192a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m125508g() {
        List<gcj0> list = this.f102038m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: h */
    public List<ywb> m125509h(long j, Map<String, jcj0> map, Map<String, hcj0> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m125514n(j, this.f102033h, arrayList);
        TreeMap treeMap = new TreeMap();
        m125516p(j, false, this.f102033h, treeMap);
        m125515o(j, map, map2, this.f102033h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                hcj0 hcj0Var = (hcj0) p11.m167011e(map2.get(pair.first));
                arrayList2.add(new ywb.C21557b().m216316f(bitmapDecodeByteArray).m216321k(hcj0Var.f107053b).m216322l(0).m216318h(hcj0Var.f107054c, 0).m216319i(hcj0Var.f107056e).m216324n(hcj0Var.f107057f).m216317g(hcj0Var.f107058g).m216328r(hcj0Var.f107061j).m216311a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            hcj0 hcj0Var2 = (hcj0) p11.m167011e(map2.get(entry.getKey()));
            ywb.C21557b c21557b = (ywb.C21557b) entry.getValue();
            m125503e((SpannableStringBuilder) p11.m167011e(c21557b.m216315e()));
            c21557b.m216318h(hcj0Var2.f107054c, hcj0Var2.f107055d);
            c21557b.m216319i(hcj0Var2.f107056e);
            c21557b.m216321k(hcj0Var2.f107053b);
            c21557b.m216324n(hcj0Var2.f107057f);
            c21557b.m216327q(hcj0Var2.f107060i, hcj0Var2.f107059h);
            c21557b.m216328r(hcj0Var2.f107061j);
            arrayList2.add(c21557b.m216311a());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public final void m125510i(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f102026a);
        boolean zEquals2 = "div".equals(this.f102026a);
        if (z || zEquals || (zEquals2 && this.f102034i != null)) {
            long j = this.f102029d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f102030e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f102038m == null) {
            return;
        }
        for (int i = 0; i < this.f102038m.size(); i++) {
            this.f102038m.get(i).m125510i(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: j */
    public long[] m125511j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m125510i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public String[] m125512l() {
        return this.f102032g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m125513m(long j) {
        long j2 = this.f102029d;
        if (j2 == -9223372036854775807L && this.f102030e == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.f102030e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.f102030e) {
            return j2 <= j && j < this.f102030e;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m125514n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f102033h)) {
            str = this.f102033h;
        }
        if (m125513m(j) && "div".equals(this.f102026a) && this.f102034i != null) {
            list.add(new Pair<>(str, this.f102034i));
            return;
        }
        for (int i = 0; i < m125508g(); i++) {
            m125507f(i).m125514n(j, str, list);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m125515o(long j, Map<String, jcj0> map, Map<String, hcj0> map2, String str, Map<String, ywb.C21557b> map3) {
        if (m125513m(j)) {
            String str2 = "".equals(this.f102033h) ? str : this.f102033h;
            Iterator<Map.Entry<String, Integer>> it = this.f102037l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f102036k.containsKey(key) ? this.f102036k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    m125506b(map, (ywb.C21557b) p11.m167011e(map3.get(key)), iIntValue, iIntValue2, ((hcj0) p11.m167011e(map2.get(str2))).f107061j);
                }
            }
            for (int i = 0; i < m125508g(); i++) {
                m125507f(i).m125515o(j, map, map2, str2, map3);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m125516p(long j, boolean z, String str, Map<String, ywb.C21557b> map) {
        this.f102036k.clear();
        this.f102037l.clear();
        if ("metadata".equals(this.f102026a)) {
            return;
        }
        if (!"".equals(this.f102033h)) {
            str = this.f102033h;
        }
        String str2 = str;
        if (this.f102028c && z) {
            m125504k(str2, map).append((CharSequence) p11.m167011e(this.f102027b));
            return;
        }
        if ("br".equals(this.f102026a) && z) {
            m125504k(str2, map).append('\n');
            return;
        }
        if (m125513m(j)) {
            for (Map.Entry<String, ywb.C21557b> entry : map.entrySet()) {
                this.f102036k.put(entry.getKey(), Integer.valueOf(((CharSequence) p11.m167011e(entry.getValue().m216315e())).length()));
            }
            boolean zEquals = "p".equals(this.f102026a);
            int i = 0;
            while (i < m125508g()) {
                m125507f(i).m125516p(j, z || zEquals, str2, map);
                i++;
                j = j;
                map = map;
            }
            Map<String, ywb.C21557b> map2 = map;
            if (zEquals) {
                icj0.m135354c(m125504k(str2, map2));
            }
            for (Map.Entry<String, ywb.C21557b> entry2 : map2.entrySet()) {
                this.f102037l.put(entry2.getKey(), Integer.valueOf(((CharSequence) p11.m167011e(entry2.getValue().m216315e())).length()));
            }
        }
    }
}
