package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.wbr;
import p153l.yg3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0335i implements Writer {

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

    public C0335i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C0351s.m2341b(codedOutputStream, "output");
        this.f1681a = codedOutputStream2;
        codedOutputStream2.f1554a = this;
    }

    /* JADX INFO: renamed from: P */
    public static C0335i m2122P(CodedOutputStream codedOutputStream) {
        C0335i c0335i = codedOutputStream.f1554a;
        return c0335i != null ? c0335i : new C0335i(codedOutputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: A */
    public void mo1750A(int i, long j) throws IOException {
        this.f1681a.m1567P0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: B */
    public void mo1751B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1571T0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1516T = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1516T += CodedOutputStream.m1516T(list.get(i3).longValue());
        }
        this.f1681a.mo1577Z0(iM1516T);
        while (i2 < list.size()) {
            this.f1681a.m1572U0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: C */
    public void mo1752C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1595t0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1538m = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1538m += CodedOutputStream.m1538m(list.get(i3).intValue());
        }
        this.f1681a.mo1577Z0(iM1538m);
        while (i2 < list.size()) {
            this.f1681a.m1596u0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: D */
    public void mo1753D(int i, Object obj, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        this.f1681a.m1554C0(i, (InterfaceC0322b0) obj, interfaceC0336i0);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: E */
    public void mo1754E(int i, double d) throws IOException {
        this.f1681a.m1593r0(i, d);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: F */
    public void mo1755F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1567P0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1512P = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1512P += CodedOutputStream.m1512P(list.get(i3).longValue());
        }
        this.f1681a.mo1577Z0(iM1512P);
        while (i2 < list.size()) {
            this.f1681a.m1568Q0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: G */
    public Writer.FieldOrder mo1756G() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: H */
    public void mo1757H(int i, List<?> list, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo1774j(i, list.get(i2), interfaceC0336i0);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: I */
    public void mo1758I(int i, long j) throws IOException {
        this.f1681a.m1559H0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: J */
    public void mo1759J(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1565N0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1510N = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1510N += CodedOutputStream.m1510N(list.get(i3).intValue());
        }
        this.f1681a.mo1577Z0(iM1510N);
        while (i2 < list.size()) {
            this.f1681a.m1566O0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: K */
    public void mo1760K(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1587l0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1528f = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1528f += CodedOutputStream.m1528f(list.get(i3).booleanValue());
        }
        this.f1681a.mo1577Z0(iM1528f);
        while (i2 < list.size()) {
            this.f1681a.m1588m0(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: L */
    public void mo1761L(int i, float f) throws IOException {
        this.f1681a.m1601z0(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: M */
    public void mo1762M(int i, int i2) throws IOException {
        this.f1681a.m1595t0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: N */
    public void mo1763N(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1559H0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1551z = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1551z += CodedOutputStream.m1551z(list.get(i3).longValue());
        }
        this.f1681a.mo1577Z0(iM1551z);
        while (i2 < list.size()) {
            this.f1681a.m1560I0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: O */
    public void mo1764O(int i, int i2) throws IOException {
        this.f1681a.m1569R0(i, i2);
    }

    /* JADX INFO: renamed from: Q */
    public final <V> void m2123Q(int i, boolean z, V v2, C0357y.a<Boolean, V> aVar) throws IOException {
        this.f1681a.mo1575X0(i, 2);
        this.f1681a.mo1577Z0(C0357y.m2385b(aVar, Boolean.valueOf(z), v2));
        C0357y.m2387e(this.f1681a, aVar, Boolean.valueOf(z), v2);
    }

    /* JADX INFO: renamed from: R */
    public final <V> void m2124R(int i, C0357y.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
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
            this.f1681a.mo1575X0(i, 2);
            this.f1681a.mo1577Z0(C0357y.m2385b(aVar, Integer.valueOf(i4), v2));
            C0357y.m2387e(this.f1681a, aVar, Integer.valueOf(i4), v2);
        }
    }

    /* JADX INFO: renamed from: S */
    public final <V> void m2125S(int i, C0357y.a<Long, V> aVar, Map<Long, V> map) throws IOException {
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
            this.f1681a.mo1575X0(i, 2);
            this.f1681a.mo1577Z0(C0357y.m2385b(aVar, Long.valueOf(j), v2));
            C0357y.m2387e(this.f1681a, aVar, Long.valueOf(j), v2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final <K, V> void m2126T(int i, C0357y.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f1682a[aVar.f1762a.ordinal()]) {
            case 1:
                V v2 = map.get(Boolean.FALSE);
                if (v2 != null) {
                    m2123Q(i, false, v2, aVar);
                }
                V v3 = map.get(Boolean.TRUE);
                if (v3 != null) {
                    m2123Q(i, true, v3, aVar);
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m2124R(i, aVar, map);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m2125S(i, aVar, map);
                break;
            case 12:
                m2127U(i, aVar, map);
                break;
            default:
                yg3.m215829a("does not support key type: ", aVar.f1762a);
                break;
        }
    }

    /* JADX INFO: renamed from: U */
    public final <V> void m2127U(int i, C0357y.a<String, V> aVar, Map<String, V> map) throws IOException {
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
            this.f1681a.mo1575X0(i, 2);
            this.f1681a.mo1577Z0(C0357y.m2385b(aVar, str, v2));
            C0357y.m2387e(this.f1681a, aVar, str, v2);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m2128V(int i, Object obj) throws IOException {
        boolean z = obj instanceof String;
        CodedOutputStream codedOutputStream = this.f1681a;
        if (z) {
            codedOutputStream.mo1573V0(i, (String) obj);
        } else {
            codedOutputStream.mo1591p0(i, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: a */
    public void mo1765a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1601z0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1544s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1544s += CodedOutputStream.m1544s(list.get(i3).floatValue());
        }
        this.f1681a.mo1577Z0(iM1544s);
        while (i2 < list.size()) {
            this.f1681a.m1552A0(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: b */
    public final void mo1766b(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f1681a;
        if (z) {
            codedOutputStream.mo1564M0(i, (ByteString) obj);
        } else {
            codedOutputStream.mo1563L0(i, (InterfaceC0322b0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: c */
    public void mo1767c(int i, int i2) throws IOException {
        this.f1681a.mo1597v0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: d */
    public void mo1768d(int i, String str) throws IOException {
        this.f1681a.mo1573V0(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: e */
    public void mo1769e(int i, long j) throws IOException {
        this.f1681a.mo1578a1(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: f */
    public void mo1770f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1557F0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1549x = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1549x += CodedOutputStream.m1549x(list.get(i3).intValue());
        }
        this.f1681a.mo1577Z0(iM1549x);
        while (i2 < list.size()) {
            this.f1681a.mo1558G0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: g */
    public void mo1771g(int i, int i2) throws IOException {
        this.f1681a.mo1557F0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: h */
    public void mo1772h(int i, ByteString byteString) throws IOException {
        this.f1681a.mo1591p0(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: i */
    public void mo1773i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1597v0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1540o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1540o += CodedOutputStream.m1540o(list.get(i3).intValue());
        }
        this.f1681a.mo1577Z0(iM1540o);
        while (i2 < list.size()) {
            this.f1681a.mo1598w0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: j */
    public void mo1774j(int i, Object obj, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        this.f1681a.mo1561J0(i, (InterfaceC0322b0) obj, interfaceC0336i0);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: k */
    public void mo1775k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1576Y0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1521Y = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1521Y += CodedOutputStream.m1521Y(list.get(i3).intValue());
        }
        this.f1681a.mo1577Z0(iM1521Y);
        while (i2 < list.size()) {
            this.f1681a.mo1577Z0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: l */
    public void mo1776l(int i, long j) throws IOException {
        this.f1681a.m1571T0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: m */
    public <K, V> void mo1777m(int i, C0357y.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f1681a.m1584f0()) {
            m2126T(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f1681a.mo1575X0(i, 2);
            this.f1681a.mo1577Z0(C0357y.m2385b(aVar, entry.getKey(), entry.getValue()));
            C0357y.m2387e(this.f1681a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: n */
    public void mo1778n(int i, int i2) throws IOException {
        this.f1681a.mo1576Y0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: o */
    public void mo1779o(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1578a1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1523a0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1523a0 += CodedOutputStream.m1523a0(list.get(i3).longValue());
        }
        this.f1681a.mo1577Z0(iM1523a0);
        while (i2 < list.size()) {
            this.f1681a.mo1580b1(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: p */
    public void mo1780p(int i, long j) throws IOException {
        this.f1681a.mo1599x0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: q */
    public void mo1781q(int i, boolean z) throws IOException {
        this.f1681a.mo1587l0(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: r */
    public void mo1782r(int i, int i2) throws IOException {
        this.f1681a.m1565N0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: s */
    public void mo1783s(int i) throws IOException {
        this.f1681a.mo1575X0(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: t */
    public void mo1784t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.mo1599x0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1542q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1542q += CodedOutputStream.m1542q(list.get(i3).longValue());
        }
        this.f1681a.mo1577Z0(iM1542q);
        while (i2 < list.size()) {
            this.f1681a.mo1600y0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: u */
    public void mo1785u(int i) throws IOException {
        this.f1681a.mo1575X0(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: v */
    public void mo1786v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1569R0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1514R = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1514R += CodedOutputStream.m1514R(list.get(i3).intValue());
        }
        this.f1681a.mo1577Z0(iM1514R);
        while (i2 < list.size()) {
            this.f1681a.m1570S0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: w */
    public void mo1787w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f1681a.m1593r0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f1681a.mo1575X0(i, 2);
        int iM1536k = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1536k += CodedOutputStream.m1536k(list.get(i3).doubleValue());
        }
        this.f1681a.mo1577Z0(iM1536k);
        while (i2 < list.size()) {
            this.f1681a.m1594s0(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: x */
    public void mo1788x(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1681a.mo1591p0(i, list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: y */
    public void mo1789y(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof wbr)) {
            while (i2 < list.size()) {
                this.f1681a.mo1573V0(i, list.get(i2));
                i2++;
            }
        } else {
            wbr wbrVar = (wbr) list;
            while (i2 < list.size()) {
                m2128V(i, wbrVar.mo2360e0(i2));
                i2++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* JADX INFO: renamed from: z */
    public void mo1790z(int i, List<?> list, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo1753D(i, list.get(i2), interfaceC0336i0);
        }
    }
}
