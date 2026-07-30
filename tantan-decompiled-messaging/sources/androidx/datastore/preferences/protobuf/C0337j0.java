package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p149l.ig3;
import p149l.ipj0;
import p149l.u9r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0337j0 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f1686a = m2141B();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0341l0<?, ?> f1687b = m2142C(false);

    /* JADX INFO: renamed from: c */
    public static final AbstractC0341l0<?, ?> f1688c = m2142C(true);

    /* JADX INFO: renamed from: d */
    public static final AbstractC0341l0<?, ?> f1689d = new C0345n0();

    /* JADX INFO: renamed from: A */
    public static <UT, UB> UB m2140A(int i, List<Integer> list, C0350s.e eVar, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) {
        if (eVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.mo1619a(iIntValue)) {
                    ub = (UB) m2151L(i, iIntValue, ub, abstractC0341l0);
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
            if (eVar.mo1619a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m2151L(i, iIntValue2, ub, abstractC0341l0);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* JADX INFO: renamed from: B */
    public static Class<?> m2141B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static AbstractC0341l0<?, ?> m2142C(boolean z) {
        try {
            Class<?> clsM2143D = m2143D();
            if (clsM2143D == null) {
                return null;
            }
            return (AbstractC0341l0) clsM2143D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Class<?> m2143D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T, FT extends C0347p.b<FT>> void m2144E(AbstractC0342m<FT> abstractC0342m, T t, T t2) {
        C0347p<T> c0347pMo2251c = abstractC0342m.mo2251c(t2);
        if (c0347pMo2251c.m2310n()) {
            return;
        }
        abstractC0342m.mo2252d(t).m2315u(c0347pMo2251c);
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m2145F(InterfaceC0357z interfaceC0357z, T t, T t2, long j) {
        ipj0.m137509T(t, j, interfaceC0357z.mo1805a(ipj0.m137494E(t, j), ipj0.m137494E(t2, j)));
    }

    /* JADX INFO: renamed from: G */
    public static <T, UT, UB> void m2146G(AbstractC0341l0<UT, UB> abstractC0341l0, T t, T t2) {
        abstractC0341l0.mo2244p(t, abstractC0341l0.mo2239k(abstractC0341l0.mo2235g(t), abstractC0341l0.mo2235g(t2)));
    }

    /* JADX INFO: renamed from: H */
    public static AbstractC0341l0<?, ?> m2147H() {
        return f1687b;
    }

    /* JADX INFO: renamed from: I */
    public static AbstractC0341l0<?, ?> m2148I() {
        return f1688c;
    }

    /* JADX INFO: renamed from: J */
    public static void m2149J(Class<?> cls) {
        Class<?> cls2;
        if (GeneratedMessageLite.class.isAssignableFrom(cls) || (cls2 = f1686a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        ig3.m135964a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: renamed from: K */
    public static boolean m2150K(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static <UT, UB> UB m2151L(int i, int i2, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) {
        if (ub == null) {
            ub = abstractC0341l0.mo2242n();
        }
        abstractC0341l0.mo2233e(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: M */
    public static AbstractC0341l0<?, ?> m2152M() {
        return f1689d;
    }

    /* JADX INFO: renamed from: N */
    public static void m2153N(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1759K(i, list, z);
    }

    /* JADX INFO: renamed from: O */
    public static void m2154O(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1787x(i, list);
    }

    /* JADX INFO: renamed from: P */
    public static void m2155P(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1786w(i, list, z);
    }

    /* JADX INFO: renamed from: Q */
    public static void m2156Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1751C(i, list, z);
    }

    /* JADX INFO: renamed from: R */
    public static void m2157R(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1772i(i, list, z);
    }

    /* JADX INFO: renamed from: S */
    public static void m2158S(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1783t(i, list, z);
    }

    /* JADX INFO: renamed from: T */
    public static void m2159T(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1764a(i, list, z);
    }

    /* JADX INFO: renamed from: U */
    public static void m2160U(int i, List<?> list, Writer writer, InterfaceC0335i0 interfaceC0335i0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1789z(i, list, interfaceC0335i0);
    }

    /* JADX INFO: renamed from: V */
    public static void m2161V(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1769f(i, list, z);
    }

    /* JADX INFO: renamed from: W */
    public static void m2162W(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1762N(i, list, z);
    }

    /* JADX INFO: renamed from: X */
    public static void m2163X(int i, List<?> list, Writer writer, InterfaceC0335i0 interfaceC0335i0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1756H(i, list, interfaceC0335i0);
    }

    /* JADX INFO: renamed from: Y */
    public static void m2164Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1758J(i, list, z);
    }

    /* JADX INFO: renamed from: Z */
    public static void m2165Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1754F(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static int m2166a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(size) : size * CodedOutputStream.m1526e(i, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m2167a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1785v(i, list, z);
    }

    /* JADX INFO: renamed from: b */
    public static int m2168b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m2169b0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1750B(i, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static int m2170c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1518W = size * CodedOutputStream.m1518W(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM1518W += CodedOutputStream.m1532i(list.get(i2));
        }
        return iM1518W;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m2171c0(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1788y(i, list);
    }

    /* JADX INFO: renamed from: d */
    public static int m2172d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2174e = m2174e(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2174e) : iM2174e + (size * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m2173d0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1774k(i, list, z);
    }

    /* JADX INFO: renamed from: e */
    public static int m2174e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0349r)) {
            int iM1537m = 0;
            while (i < size) {
                iM1537m += CodedOutputStream.m1537m(list.get(i).intValue());
                i++;
            }
            return iM1537m;
        }
        C0349r c0349r = (C0349r) list;
        int iM1537m2 = 0;
        while (i < size) {
            iM1537m2 += CodedOutputStream.m1537m(c0349r.getInt(i));
            i++;
        }
        return iM1537m2;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m2175e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo1778o(i, list, z);
    }

    /* JADX INFO: renamed from: f */
    public static int m2176f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(size * 4) : size * CodedOutputStream.m1538n(i, 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m2177g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m2178h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(size * 8) : size * CodedOutputStream.m1540p(i, 0L);
    }

    /* JADX INFO: renamed from: i */
    public static int m2179i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m2180j(int i, List<InterfaceC0321b0> list, InterfaceC0335i0 interfaceC0335i0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1544t = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM1544t += CodedOutputStream.m1544t(i, list.get(i2), interfaceC0335i0);
        }
        return iM1544t;
    }

    /* JADX INFO: renamed from: k */
    public static int m2181k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2182l = m2182l(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2182l) : iM2182l + (size * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: l */
    public static int m2182l(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0349r)) {
            int iM1548x = 0;
            while (i < size) {
                iM1548x += CodedOutputStream.m1548x(list.get(i).intValue());
                i++;
            }
            return iM1548x;
        }
        C0349r c0349r = (C0349r) list;
        int iM1548x2 = 0;
        while (i < size) {
            iM1548x2 += CodedOutputStream.m1548x(c0349r.getInt(i));
            i++;
        }
        return iM1548x2;
    }

    /* JADX INFO: renamed from: m */
    public static int m2183m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iM2184n = m2184n(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2184n) : iM2184n + (list.size() * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: n */
    public static int m2184n(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x)) {
            int iM1550z = 0;
            while (i < size) {
                iM1550z += CodedOutputStream.m1550z(list.get(i).longValue());
                i++;
            }
            return iM1550z;
        }
        C0355x c0355x = (C0355x) list;
        int iM1550z2 = 0;
        while (i < size) {
            iM1550z2 += CodedOutputStream.m1550z(c0355x.getLong(i));
            i++;
        }
        return iM1550z2;
    }

    /* JADX INFO: renamed from: o */
    public static int m2185o(int i, Object obj, InterfaceC0335i0 interfaceC0335i0) {
        return obj instanceof C0352u ? CodedOutputStream.m1497B(i, (C0352u) obj) : CodedOutputStream.m1502G(i, (InterfaceC0321b0) obj, interfaceC0335i0);
    }

    /* JADX INFO: renamed from: p */
    public static int m2186p(int i, List<?> list, InterfaceC0335i0 interfaceC0335i0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1518W = CodedOutputStream.m1518W(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iM1518W += obj instanceof C0352u ? CodedOutputStream.m1498C((C0352u) obj) : CodedOutputStream.m1504I((InterfaceC0321b0) obj, interfaceC0335i0);
        }
        return iM1518W;
    }

    /* JADX INFO: renamed from: q */
    public static int m2187q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2188r = m2188r(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2188r) : iM2188r + (size * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: r */
    public static int m2188r(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0349r)) {
            int iM1513R = 0;
            while (i < size) {
                iM1513R += CodedOutputStream.m1513R(list.get(i).intValue());
                i++;
            }
            return iM1513R;
        }
        C0349r c0349r = (C0349r) list;
        int iM1513R2 = 0;
        while (i < size) {
            iM1513R2 += CodedOutputStream.m1513R(c0349r.getInt(i));
            i++;
        }
        return iM1513R2;
    }

    /* JADX INFO: renamed from: s */
    public static int m2189s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2190t = m2190t(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2190t) : iM2190t + (size * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: t */
    public static int m2190t(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x)) {
            int iM1515T = 0;
            while (i < size) {
                iM1515T += CodedOutputStream.m1515T(list.get(i).longValue());
                i++;
            }
            return iM1515T;
        }
        C0355x c0355x = (C0355x) list;
        int iM1515T2 = 0;
        while (i < size) {
            iM1515T2 += CodedOutputStream.m1515T(c0355x.getLong(i));
            i++;
        }
        return iM1515T2;
    }

    /* JADX INFO: renamed from: u */
    public static int m2191u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM1518W = CodedOutputStream.m1518W(i) * size;
        if (!(list instanceof u9r)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM1518W += obj instanceof ByteString ? CodedOutputStream.m1532i((ByteString) obj) : CodedOutputStream.m1517V((String) obj);
                i2++;
            }
            return iM1518W;
        }
        u9r u9rVar = (u9r) list;
        while (i2 < size) {
            Object objMo2359d0 = u9rVar.mo2359d0(i2);
            iM1518W += objMo2359d0 instanceof ByteString ? CodedOutputStream.m1532i((ByteString) objMo2359d0) : CodedOutputStream.m1517V((String) objMo2359d0);
            i2++;
        }
        return iM1518W;
    }

    /* JADX INFO: renamed from: v */
    public static int m2192v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2193w = m2193w(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2193w) : iM2193w + (size * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: w */
    public static int m2193w(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0349r)) {
            int iM1520Y = 0;
            while (i < size) {
                iM1520Y += CodedOutputStream.m1520Y(list.get(i).intValue());
                i++;
            }
            return iM1520Y;
        }
        C0349r c0349r = (C0349r) list;
        int iM1520Y2 = 0;
        while (i < size) {
            iM1520Y2 += CodedOutputStream.m1520Y(c0349r.getInt(i));
            i++;
        }
        return iM1520Y2;
    }

    /* JADX INFO: renamed from: x */
    public static int m2194x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2195y = m2195y(list);
        return z ? CodedOutputStream.m1518W(i) + CodedOutputStream.m1499D(iM2195y) : iM2195y + (size * CodedOutputStream.m1518W(i));
    }

    /* JADX INFO: renamed from: y */
    public static int m2195y(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0355x)) {
            int iM1522a0 = 0;
            while (i < size) {
                iM1522a0 += CodedOutputStream.m1522a0(list.get(i).longValue());
                i++;
            }
            return iM1522a0;
        }
        C0355x c0355x = (C0355x) list;
        int iM1522a1 = 0;
        while (i < size) {
            iM1522a1 += CodedOutputStream.m1522a0(c0355x.getLong(i));
            i++;
        }
        return iM1522a1;
    }

    /* JADX INFO: renamed from: z */
    public static <UT, UB> UB m2196z(int i, List<Integer> list, C0350s.d<?> dVar, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.findValueByNumber(iIntValue) == null) {
                    ub = (UB) m2151L(i, iIntValue, ub, abstractC0341l0);
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
                ub = (UB) m2151L(i, iIntValue2, ub, abstractC0341l0);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }
}
