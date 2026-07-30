package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p153l.lyj0;
import p153l.wbr;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0338j0 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f1686a = m2142B();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0342l0<?, ?> f1687b = m2143C(false);

    /* JADX INFO: renamed from: c */
    public static final AbstractC0342l0<?, ?> f1688c = m2143C(true);

    /* JADX INFO: renamed from: d */
    public static final AbstractC0342l0<?, ?> f1689d = new C0346n0();

    /* JADX INFO: renamed from: A */
    public static <UT, UB> UB m2141A(int i, List<Integer> list, C0351s.e eVar, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) {
        if (eVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.mo1620a(iIntValue)) {
                    ub = (UB) m2152L(i, iIntValue, ub, abstractC0342l0);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (eVar.mo1620a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m2152L(i, iIntValue2, ub, abstractC0342l0);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* JADX INFO: renamed from: B */
    public static Class<?> m2142B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static AbstractC0342l0<?, ?> m2143C(boolean z) {
        try {
            Class<?> clsM2144D = m2144D();
            if (clsM2144D == null) {
                return null;
            }
            return (AbstractC0342l0) clsM2144D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Class<?> m2144D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T, FT extends C0348p.b<FT>> void m2145E(AbstractC0343m<FT> abstractC0343m, T t, T t2) {
        C0348p<T> c0348pMo2252c = abstractC0343m.mo2252c(t2);
        if (c0348pMo2252c.m2311n()) {
            return;
        }
        abstractC0343m.mo2253d(t).m2316u(c0348pMo2252c);
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m2146F(InterfaceC0358z interfaceC0358z, T t, T t2, long j) {
        lyj0.m156314T(t, j, interfaceC0358z.mo1806a(lyj0.m156299E(t, j), lyj0.m156299E(t2, j)));
    }

    /* JADX INFO: renamed from: G */
    public static <T, UT, UB> void m2147G(AbstractC0342l0<UT, UB> abstractC0342l0, T t, T t2) {
        abstractC0342l0.mo2245p(t, abstractC0342l0.mo2240k(abstractC0342l0.mo2236g(t), abstractC0342l0.mo2236g(t2)));
    }

    /* JADX INFO: renamed from: H */
    public static AbstractC0342l0<?, ?> m2148H() {
        return f1687b;
    }

    /* JADX INFO: renamed from: I */
    public static AbstractC0342l0<?, ?> m2149I() {
        return f1688c;
    }

    /* JADX INFO: renamed from: J */
    public static void m2150J(Class<?> cls) {
        Class<?> cls2;
        if (GeneratedMessageLite.class.isAssignableFrom(cls) || (cls2 = f1686a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        wg3.m206174a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: renamed from: K */
    public static boolean m2151K(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static <UT, UB> UB m2152L(int i, int i2, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) {
        if (ub == null) {
            ub = abstractC0342l0.mo2243n();
        }
        abstractC0342l0.mo2234e(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: M */
    public static AbstractC0342l0<?, ?> m2153M() {
        return f1689d;
    }

    /* JADX INFO: renamed from: N */
    public static void m2154N(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1760K(i, list, z);
    }

    /* JADX INFO: renamed from: O */
    public static void m2155O(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1788x(i, list);
    }

    /* JADX INFO: renamed from: P */
    public static void m2156P(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1787w(i, list, z);
    }

    /* JADX INFO: renamed from: Q */
    public static void m2157Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1752C(i, list, z);
    }

    /* JADX INFO: renamed from: R */
    public static void m2158R(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1773i(i, list, z);
    }

    /* JADX INFO: renamed from: S */
    public static void m2159S(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1784t(i, list, z);
    }

    /* JADX INFO: renamed from: T */
    public static void m2160T(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1765a(i, list, z);
    }

    /* JADX INFO: renamed from: U */
    public static void m2161U(int i, List<?> list, Writer writer, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1790z(i, list, interfaceC0336i0);
    }

    /* JADX INFO: renamed from: V */
    public static void m2162V(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1770f(i, list, z);
    }

    /* JADX INFO: renamed from: W */
    public static void m2163W(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1763N(i, list, z);
    }

    /* JADX INFO: renamed from: X */
    public static void m2164X(int i, List<?> list, Writer writer, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1757H(i, list, interfaceC0336i0);
    }

    /* JADX INFO: renamed from: Y */
    public static void m2165Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1759J(i, list, z);
    }

    /* JADX INFO: renamed from: Z */
    public static void m2166Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1755F(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static int m2167a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(size) : size * CodedOutputStream.m1527e(i, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m2168a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1786v(i, list, z);
    }

    /* JADX INFO: renamed from: b */
    public static int m2169b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m2170b0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1751B(i, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static int m2171c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1519W = size * CodedOutputStream.m1519W(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM1519W += CodedOutputStream.m1533i(list.get(i2));
        }
        return iM1519W;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m2172c0(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1789y(i, list);
    }

    /* JADX INFO: renamed from: d */
    public static int m2173d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2175e = m2175e(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2175e) : iM2175e + (size * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m2174d0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1775k(i, list, z);
    }

    /* JADX INFO: renamed from: e */
    public static int m2175e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0350r)) {
            int iM1538m = 0;
            while (i < size) {
                iM1538m += CodedOutputStream.m1538m(list.get(i).intValue());
                i++;
            }
            return iM1538m;
        }
        C0350r c0350r = (C0350r) list;
        int iM1538m2 = 0;
        while (i < size) {
            iM1538m2 += CodedOutputStream.m1538m(c0350r.getInt(i));
            i++;
        }
        return iM1538m2;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m2176e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1779o(i, list, z);
    }

    /* JADX INFO: renamed from: f */
    public static int m2177f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(size * 4) : size * CodedOutputStream.m1539n(i, 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m2178g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m2179h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(size * 8) : size * CodedOutputStream.m1541p(i, 0L);
    }

    /* JADX INFO: renamed from: i */
    public static int m2180i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m2181j(int i, List<InterfaceC0322b0> list, InterfaceC0336i0 interfaceC0336i0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1545t = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM1545t += CodedOutputStream.m1545t(i, list.get(i2), interfaceC0336i0);
        }
        return iM1545t;
    }

    /* JADX INFO: renamed from: k */
    public static int m2182k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2183l = m2183l(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2183l) : iM2183l + (size * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: l */
    public static int m2183l(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0350r)) {
            int iM1549x = 0;
            while (i < size) {
                iM1549x += CodedOutputStream.m1549x(list.get(i).intValue());
                i++;
            }
            return iM1549x;
        }
        C0350r c0350r = (C0350r) list;
        int iM1549x2 = 0;
        while (i < size) {
            iM1549x2 += CodedOutputStream.m1549x(c0350r.getInt(i));
            i++;
        }
        return iM1549x2;
    }

    /* JADX INFO: renamed from: m */
    public static int m2184m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iM2185n = m2185n(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2185n) : iM2185n + (list.size() * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: n */
    public static int m2185n(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0356x)) {
            int iM1551z = 0;
            while (i < size) {
                iM1551z += CodedOutputStream.m1551z(list.get(i).longValue());
                i++;
            }
            return iM1551z;
        }
        C0356x c0356x = (C0356x) list;
        int iM1551z2 = 0;
        while (i < size) {
            iM1551z2 += CodedOutputStream.m1551z(c0356x.getLong(i));
            i++;
        }
        return iM1551z2;
    }

    /* JADX INFO: renamed from: o */
    public static int m2186o(int i, Object obj, InterfaceC0336i0 interfaceC0336i0) {
        return obj instanceof C0353u ? CodedOutputStream.m1498B(i, (C0353u) obj) : CodedOutputStream.m1503G(i, (InterfaceC0322b0) obj, interfaceC0336i0);
    }

    /* JADX INFO: renamed from: p */
    public static int m2187p(int i, List<?> list, InterfaceC0336i0 interfaceC0336i0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1519W = CodedOutputStream.m1519W(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iM1519W += obj instanceof C0353u ? CodedOutputStream.m1499C((C0353u) obj) : CodedOutputStream.m1505I((InterfaceC0322b0) obj, interfaceC0336i0);
        }
        return iM1519W;
    }

    /* JADX INFO: renamed from: q */
    public static int m2188q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2189r = m2189r(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2189r) : iM2189r + (size * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: r */
    public static int m2189r(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0350r)) {
            int iM1514R = 0;
            while (i < size) {
                iM1514R += CodedOutputStream.m1514R(list.get(i).intValue());
                i++;
            }
            return iM1514R;
        }
        C0350r c0350r = (C0350r) list;
        int iM1514R2 = 0;
        while (i < size) {
            iM1514R2 += CodedOutputStream.m1514R(c0350r.getInt(i));
            i++;
        }
        return iM1514R2;
    }

    /* JADX INFO: renamed from: s */
    public static int m2190s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2191t = m2191t(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2191t) : iM2191t + (size * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: t */
    public static int m2191t(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0356x)) {
            int iM1516T = 0;
            while (i < size) {
                iM1516T += CodedOutputStream.m1516T(list.get(i).longValue());
                i++;
            }
            return iM1516T;
        }
        C0356x c0356x = (C0356x) list;
        int iM1516T2 = 0;
        while (i < size) {
            iM1516T2 += CodedOutputStream.m1516T(c0356x.getLong(i));
            i++;
        }
        return iM1516T2;
    }

    /* JADX INFO: renamed from: u */
    public static int m2192u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM1519W = CodedOutputStream.m1519W(i) * size;
        if (!(list instanceof wbr)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM1519W += obj instanceof ByteString ? CodedOutputStream.m1533i((ByteString) obj) : CodedOutputStream.m1518V((String) obj);
                i2++;
            }
            return iM1519W;
        }
        wbr wbrVar = (wbr) list;
        while (i2 < size) {
            Object objMo2360e0 = wbrVar.mo2360e0(i2);
            iM1519W += objMo2360e0 instanceof ByteString ? CodedOutputStream.m1533i((ByteString) objMo2360e0) : CodedOutputStream.m1518V((String) objMo2360e0);
            i2++;
        }
        return iM1519W;
    }

    /* JADX INFO: renamed from: v */
    public static int m2193v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2194w = m2194w(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2194w) : iM2194w + (size * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: w */
    public static int m2194w(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0350r)) {
            int iM1521Y = 0;
            while (i < size) {
                iM1521Y += CodedOutputStream.m1521Y(list.get(i).intValue());
                i++;
            }
            return iM1521Y;
        }
        C0350r c0350r = (C0350r) list;
        int iM1521Y2 = 0;
        while (i < size) {
            iM1521Y2 += CodedOutputStream.m1521Y(c0350r.getInt(i));
            i++;
        }
        return iM1521Y2;
    }

    /* JADX INFO: renamed from: x */
    public static int m2195x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2196y = m2196y(list);
        return z ? CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(iM2196y) : iM2196y + (size * CodedOutputStream.m1519W(i));
    }

    /* JADX INFO: renamed from: y */
    public static int m2196y(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0356x)) {
            int iM1523a0 = 0;
            while (i < size) {
                iM1523a0 += CodedOutputStream.m1523a0(list.get(i).longValue());
                i++;
            }
            return iM1523a0;
        }
        C0356x c0356x = (C0356x) list;
        int iM1523a1 = 0;
        while (i < size) {
            iM1523a1 += CodedOutputStream.m1523a0(c0356x.getLong(i));
            i++;
        }
        return iM1523a1;
    }

    /* JADX INFO: renamed from: z */
    public static <UT, UB> UB m2197z(int i, List<Integer> list, C0351s.d<?> dVar, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.findValueByNumber(iIntValue) == null) {
                    ub = (UB) m2152L(i, iIntValue, ub, abstractC0342l0);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (dVar.findValueByNumber(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m2152L(i, iIntValue2, ub, abstractC0342l0);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }
}
