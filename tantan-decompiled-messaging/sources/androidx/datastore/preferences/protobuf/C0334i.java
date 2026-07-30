package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.kg3;
import p149l.u9r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0334i implements Writer {

    /* JADX INFO: renamed from: a */
    public final CodedOutputStream f1681a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1682a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1682a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1682a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1682a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1682a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1682a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1682a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1682a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1682a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1682a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1682a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1682a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1682a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0334i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C0350s.m2340b(codedOutputStream, "output");
        this.f1681a = codedOutputStream2;
        codedOutputStream2.f1554a = this;
    }

    /* JADX INFO: renamed from: P */
    public static C0334i m2121P(CodedOutputStream codedOutputStream) {
        C0334i c0334i = codedOutputStream.f1554a;
        return c0334i != null ? c0334i : new C0334i(codedOutputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: A */
    public void mo1749A(int i, long j) throws IOException {
        this.f1681a.m1566P0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: B */
    public void mo1750B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1570T0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1515T = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1515T += CodedOutputStream.m1515T(list.get(i3).longValue());
        }
        this.f1681a.mo1576Z0(iM1515T);
        while (i2 < list.size()) {
            this.f1681a.m1571U0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: C */
    public void mo1751C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1594t0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1537m = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1537m += CodedOutputStream.m1537m(list.get(i3).intValue());
        }
        this.f1681a.mo1576Z0(iM1537m);
        while (i2 < list.size()) {
            this.f1681a.m1595u0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: D */
    public void mo1752D(int i, Object obj, InterfaceC0335i0 interfaceC0335i0) throws IOException {
        this.f1681a.m1553C0(i, (InterfaceC0321b0) obj, interfaceC0335i0);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: E */
    public void mo1753E(int i, double d) throws IOException {
        this.f1681a.m1592r0(i, d);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: F */
    public void mo1754F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1566P0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1511P = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1511P += CodedOutputStream.m1511P(list.get(i3).longValue());
        }
        this.f1681a.mo1576Z0(iM1511P);
        while (i2 < list.size()) {
            this.f1681a.m1567Q0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: G */
    public Writer.FieldOrder mo1755G() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: H */
    public void mo1756H(int i, List<?> list, InterfaceC0335i0 interfaceC0335i0) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo1773j(i, list.get(i2), interfaceC0335i0);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: I */
    public void mo1757I(int i, long j) throws IOException {
        this.f1681a.m1558H0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: J */
    public void mo1758J(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1564N0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1509N = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1509N += CodedOutputStream.m1509N(list.get(i3).intValue());
        }
        this.f1681a.mo1576Z0(iM1509N);
        while (i2 < list.size()) {
            this.f1681a.m1565O0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: K */
    public void mo1759K(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1586l0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1527f = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1527f += CodedOutputStream.m1527f(list.get(i3).booleanValue());
        }
        this.f1681a.mo1576Z0(iM1527f);
        while (i2 < list.size()) {
            this.f1681a.m1587m0(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: L */
    public void mo1760L(int i, float f) throws IOException {
        this.f1681a.m1600z0(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: M */
    public void mo1761M(int i, int i2) throws IOException {
        this.f1681a.m1594t0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: N */
    public void mo1762N(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1558H0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1550z = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1550z += CodedOutputStream.m1550z(list.get(i3).longValue());
        }
        this.f1681a.mo1576Z0(iM1550z);
        while (i2 < list.size()) {
            this.f1681a.m1559I0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: O */
    public void mo1763O(int i, int i2) throws IOException {
        this.f1681a.m1568R0(i, i2);
    }

    /* JADX INFO: renamed from: Q */
    public final <V> void m2122Q(int i, boolean z, V v2, C0356y.a<Boolean, V> aVar) throws IOException {
        this.f1681a.mo1574X0(i, 2);
        this.f1681a.mo1576Z0(C0356y.m2384b(aVar, Boolean.valueOf(z), v2));
        C0356y.m2386e(this.f1681a, aVar, Boolean.valueOf(z), v2);
    }

    /* JADX INFO: renamed from: R */
    public final <V> void m2123R(int i, C0356y.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v2 = map.get(Integer.valueOf(i4));
            this.f1681a.mo1574X0(i, 2);
            this.f1681a.mo1576Z0(C0356y.m2384b(aVar, Integer.valueOf(i4), v2));
            C0356y.m2386e(this.f1681a, aVar, Integer.valueOf(i4), v2);
        }
    }

    /* JADX INFO: renamed from: S */
    public final <V> void m2124S(int i, C0356y.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v2 = map.get(Long.valueOf(j));
            this.f1681a.mo1574X0(i, 2);
            this.f1681a.mo1576Z0(C0356y.m2384b(aVar, Long.valueOf(j), v2));
            C0356y.m2386e(this.f1681a, aVar, Long.valueOf(j), v2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final <K, V> void m2125T(int i, C0356y.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f1682a[aVar.f1762a.ordinal()]) {
            case 1:
                V v2 = map.get(Boolean.FALSE);
                if (v2 != null) {
                    m2122Q(i, false, v2, aVar);
                }
                V v3 = map.get(Boolean.TRUE);
                if (v3 != null) {
                    m2122Q(i, true, v3, aVar);
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m2123R(i, aVar, map);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m2124S(i, aVar, map);
                break;
            case 12:
                m2126U(i, aVar, map);
                break;
            default:
                kg3.m145878a("does not support key type: ", aVar.f1762a);
                break;
        }
    }

    /* JADX INFO: renamed from: U */
    public final <V> void m2126U(int i, C0356y.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v2 = map.get(str);
            this.f1681a.mo1574X0(i, 2);
            this.f1681a.mo1576Z0(C0356y.m2384b(aVar, str, v2));
            C0356y.m2386e(this.f1681a, aVar, str, v2);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m2127V(int i, Object obj) throws IOException {
        boolean z = obj instanceof String;
        CodedOutputStream codedOutputStream = this.f1681a;
        if (z) {
            codedOutputStream.mo1572V0(i, (String) obj);
        } else {
            codedOutputStream.mo1590p0(i, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: a */
    public void mo1764a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1600z0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1543s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1543s += CodedOutputStream.m1543s(list.get(i3).floatValue());
        }
        this.f1681a.mo1576Z0(iM1543s);
        while (i2 < list.size()) {
            this.f1681a.m1551A0(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: b */
    public final void mo1765b(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f1681a;
        if (z) {
            codedOutputStream.mo1563M0(i, (ByteString) obj);
        } else {
            codedOutputStream.mo1562L0(i, (InterfaceC0321b0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: c */
    public void mo1766c(int i, int i2) throws IOException {
        this.f1681a.mo1596v0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: d */
    public void mo1767d(int i, String str) throws IOException {
        this.f1681a.mo1572V0(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: e */
    public void mo1768e(int i, long j) throws IOException {
        this.f1681a.mo1577a1(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: f */
    public void mo1769f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1556F0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1548x = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1548x += CodedOutputStream.m1548x(list.get(i3).intValue());
        }
        this.f1681a.mo1576Z0(iM1548x);
        while (i2 < list.size()) {
            this.f1681a.mo1557G0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: g */
    public void mo1770g(int i, int i2) throws IOException {
        this.f1681a.mo1556F0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: h */
    public void mo1771h(int i, ByteString byteString) throws IOException {
        this.f1681a.mo1590p0(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: i */
    public void mo1772i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1596v0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1539o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1539o += CodedOutputStream.m1539o(list.get(i3).intValue());
        }
        this.f1681a.mo1576Z0(iM1539o);
        while (i2 < list.size()) {
            this.f1681a.mo1597w0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: j */
    public void mo1773j(int i, Object obj, InterfaceC0335i0 interfaceC0335i0) throws IOException {
        this.f1681a.mo1560J0(i, (InterfaceC0321b0) obj, interfaceC0335i0);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: k */
    public void mo1774k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1575Y0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1520Y = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1520Y += CodedOutputStream.m1520Y(list.get(i3).intValue());
        }
        this.f1681a.mo1576Z0(iM1520Y);
        while (i2 < list.size()) {
            this.f1681a.mo1576Z0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: l */
    public void mo1775l(int i, long j) throws IOException {
        this.f1681a.m1570T0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: m */
    public <K, V> void mo1776m(int i, C0356y.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f1681a.m1583f0()) {
            m2125T(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f1681a.mo1574X0(i, 2);
            this.f1681a.mo1576Z0(C0356y.m2384b(aVar, entry.getKey(), entry.getValue()));
            C0356y.m2386e(this.f1681a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: n */
    public void mo1777n(int i, int i2) throws IOException {
        this.f1681a.mo1575Y0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: o */
    public void mo1778o(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1577a1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1522a0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1522a0 += CodedOutputStream.m1522a0(list.get(i3).longValue());
        }
        this.f1681a.mo1576Z0(iM1522a0);
        while (i2 < list.size()) {
            this.f1681a.mo1579b1(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: p */
    public void mo1779p(int i, long j) throws IOException {
        this.f1681a.mo1598x0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: q */
    public void mo1780q(int i, boolean z) throws IOException {
        this.f1681a.mo1586l0(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: r */
    public void mo1781r(int i, int i2) throws IOException {
        this.f1681a.m1564N0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: s */
    public void mo1782s(int i) throws IOException {
        this.f1681a.mo1574X0(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: t */
    public void mo1783t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1598x0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1541q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1541q += CodedOutputStream.m1541q(list.get(i3).longValue());
        }
        this.f1681a.mo1576Z0(iM1541q);
        while (i2 < list.size()) {
            this.f1681a.mo1599y0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: u */
    public void mo1784u(int i) throws IOException {
        this.f1681a.mo1574X0(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: v */
    public void mo1785v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1568R0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1513R = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1513R += CodedOutputStream.m1513R(list.get(i3).intValue());
        }
        this.f1681a.mo1576Z0(iM1513R);
        while (i2 < list.size()) {
            this.f1681a.m1569S0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: w */
    public void mo1786w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1592r0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1574X0(i, 2);
        int iM1535k = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1535k += CodedOutputStream.m1535k(list.get(i3).doubleValue());
        }
        this.f1681a.mo1576Z0(iM1535k);
        while (i2 < list.size()) {
            this.f1681a.m1593s0(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: x */
    public void mo1787x(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1681a.mo1590p0(i, list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: y */
    public void mo1788y(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof u9r)) {
            while (i2 < list.size()) {
                this.f1681a.mo1572V0(i, list.get(i2));
                i2++;
            }
        } else {
            u9r u9rVar = (u9r) list;
            while (i2 < list.size()) {
                m2127V(i, u9rVar.mo2359d0(i2));
                i2++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: z */
    public void mo1789z(int i, List<?> list, InterfaceC0335i0 interfaceC0335i0) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo1752D(i, list.get(i2), interfaceC0335i0);
        }
    }
}
