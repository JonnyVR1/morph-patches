package p153l;

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
public final class klj0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f127376a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f127377b;

    /* JADX INFO: renamed from: c */
    public final boolean f127378c;

    /* JADX INFO: renamed from: d */
    public final long f127379d;

    /* JADX INFO: renamed from: e */
    public final long f127380e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final nlj0 f127381f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String[] f127382g;

    /* JADX INFO: renamed from: h */
    public final String f127383h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f127384i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final klj0 f127385j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Integer> f127386k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, Integer> f127387l;

    /* JADX INFO: renamed from: m */
    public List<klj0> f127388m;

    public klj0(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable nlj0 nlj0Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable klj0 klj0Var) {
        this.f127376a = str;
        this.f127377b = str2;
        this.f127384i = str4;
        this.f127381f = nlj0Var;
        this.f127382g = strArr;
        this.f127378c = str2 != null;
        this.f127379d = j;
        this.f127380e = j2;
        this.f127383h = (String) w11.m204369e(str3);
        this.f127385j = klj0Var;
        this.f127386k = new HashMap<>();
        this.f127387l = new HashMap<>();
    }

    /* JADX INFO: renamed from: c */
    public static klj0 m150370c(@Nullable String str, long j, long j2, @Nullable nlj0 nlj0Var, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable klj0 klj0Var) {
        return new klj0(str, null, j, j2, nlj0Var, strArr, str2, str3, klj0Var);
    }

    /* JADX INFO: renamed from: d */
    public static klj0 m150371d(String str) {
        return new klj0(null, mlj0.m158898b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m150372e(SpannableStringBuilder spannableStringBuilder) {
        for (hvd hvdVar : (hvd[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hvd.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(hvdVar), spannableStringBuilder.getSpanEnd(hvdVar), "");
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
    public static SpannableStringBuilder m150373k(String str, Map<String, myb.C18746b> map) {
        if (!map.containsKey(str)) {
            myb.C18746b c18746b = new myb.C18746b();
            c18746b.m160768o(new SpannableStringBuilder());
            map.put(str, c18746b);
        }
        return (SpannableStringBuilder) w11.m204369e(map.get(str).m160758e());
    }

    /* JADX INFO: renamed from: a */
    public void m150374a(klj0 klj0Var) {
        if (this.f127388m == null) {
            this.f127388m = new ArrayList();
        }
        this.f127388m.add(klj0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m150375b(Map<String, nlj0> map, myb.C18746b c18746b, int i, int i2, int i3) {
        nlj0 nlj0VarM158902f = mlj0.m158902f(this.f127381f, this.f127382g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c18746b.m160758e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c18746b.m160768o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (nlj0VarM158902f != null) {
            mlj0.m158897a(spannableStringBuilder2, i, i2, nlj0VarM158902f, this.f127385j, map, i3);
            if ("p".equals(this.f127376a)) {
                if (nlj0VarM158902f.m163710k() != Float.MAX_VALUE) {
                    c18746b.m160766m((nlj0VarM158902f.m163710k() * (-90.0f)) / 100.0f);
                }
                if (nlj0VarM158902f.m163712m() != null) {
                    c18746b.m160769p(nlj0VarM158902f.m163712m());
                }
                if (nlj0VarM158902f.m163707h() != null) {
                    c18746b.m160763j(nlj0VarM158902f.m163707h());
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public klj0 m150376f(int i) {
        List<klj0> list = this.f127388m;
        if (list != null) {
            return list.get(i);
        }
        onl.m168333a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m150377g() {
        List<klj0> list = this.f127388m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: h */
    public List<myb> m150378h(long j, Map<String, nlj0> map, Map<String, llj0> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m150383n(j, this.f127383h, arrayList);
        TreeMap treeMap = new TreeMap();
        m150385p(j, false, this.f127383h, treeMap);
        m150384o(j, map, map2, this.f127383h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                llj0 llj0Var = (llj0) w11.m204369e(map2.get(pair.first));
                arrayList2.add(new myb.C18746b().m160759f(bitmapDecodeByteArray).m160764k(llj0Var.f132557b).m160765l(0).m160761h(llj0Var.f132558c, 0).m160762i(llj0Var.f132560e).m160767n(llj0Var.f132561f).m160760g(llj0Var.f132562g).m160771r(llj0Var.f132565j).m160754a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            llj0 llj0Var2 = (llj0) w11.m204369e(map2.get(entry.getKey()));
            myb.C18746b c18746b = (myb.C18746b) entry.getValue();
            m150372e((SpannableStringBuilder) w11.m204369e(c18746b.m160758e()));
            c18746b.m160761h(llj0Var2.f132558c, llj0Var2.f132559d);
            c18746b.m160762i(llj0Var2.f132560e);
            c18746b.m160764k(llj0Var2.f132557b);
            c18746b.m160767n(llj0Var2.f132561f);
            c18746b.m160770q(llj0Var2.f132564i, llj0Var2.f132563h);
            c18746b.m160771r(llj0Var2.f132565j);
            arrayList2.add(c18746b.m160754a());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public final void m150379i(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f127376a);
        boolean zEquals2 = "div".equals(this.f127376a);
        if (z || zEquals || (zEquals2 && this.f127384i != null)) {
            long j = this.f127379d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f127380e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f127388m == null) {
            return;
        }
        for (int i = 0; i < this.f127388m.size(); i++) {
            this.f127388m.get(i).m150379i(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: j */
    public long[] m150380j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m150379i(treeSet, false);
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
    public String[] m150381l() {
        return this.f127382g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m150382m(long j) {
        long j2 = this.f127379d;
        if (j2 == -9223372036854775807L && this.f127380e == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.f127380e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.f127380e) {
            return j2 <= j && j < this.f127380e;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m150383n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f127383h)) {
            str = this.f127383h;
        }
        if (m150382m(j) && "div".equals(this.f127376a) && this.f127384i != null) {
            list.add(new Pair<>(str, this.f127384i));
            return;
        }
        for (int i = 0; i < m150377g(); i++) {
            m150376f(i).m150383n(j, str, list);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m150384o(long j, Map<String, nlj0> map, Map<String, llj0> map2, String str, Map<String, myb.C18746b> map3) {
        if (m150382m(j)) {
            String str2 = "".equals(this.f127383h) ? str : this.f127383h;
            Iterator<Map.Entry<String, Integer>> it = this.f127387l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f127386k.containsKey(key) ? this.f127386k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    m150375b(map, (myb.C18746b) w11.m204369e(map3.get(key)), iIntValue, iIntValue2, ((llj0) w11.m204369e(map2.get(str2))).f132565j);
                }
            }
            for (int i = 0; i < m150377g(); i++) {
                m150376f(i).m150384o(j, map, map2, str2, map3);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m150385p(long j, boolean z, String str, Map<String, myb.C18746b> map) {
        this.f127386k.clear();
        this.f127387l.clear();
        if ("metadata".equals(this.f127376a)) {
            return;
        }
        if (!"".equals(this.f127383h)) {
            str = this.f127383h;
        }
        String str2 = str;
        if (this.f127378c && z) {
            m150373k(str2, map).append((CharSequence) w11.m204369e(this.f127377b));
            return;
        }
        if ("br".equals(this.f127376a) && z) {
            m150373k(str2, map).append('\n');
            return;
        }
        if (m150382m(j)) {
            for (Map.Entry<String, myb.C18746b> entry : map.entrySet()) {
                this.f127386k.put(entry.getKey(), Integer.valueOf(((CharSequence) w11.m204369e(entry.getValue().m160758e())).length()));
            }
            boolean zEquals = "p".equals(this.f127376a);
            int i = 0;
            while (i < m150377g()) {
                m150376f(i).m150385p(j, z || zEquals, str2, map);
                i++;
                j = j;
                map = map;
            }
            Map<String, myb.C18746b> map2 = map;
            if (zEquals) {
                mlj0.m158899c(m150373k(str2, map2));
            }
            for (Map.Entry<String, myb.C18746b> entry2 : map2.entrySet()) {
                this.f127387l.put(entry2.getKey(), Integer.valueOf(((CharSequence) w11.m204369e(entry2.getValue().m160758e())).length()));
            }
        }
    }
}
