package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0348p.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.azk0;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0348p<T extends b<T>> {

    /* JADX INFO: renamed from: d */
    public static final C0348p f1725d = new C0348p(true);

    /* JADX INFO: renamed from: a */
    public final C0340k0<T, Object> f1726a;

    /* JADX INFO: renamed from: b */
    public boolean f1727b;

    /* JADX INFO: renamed from: c */
    public boolean f1728c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1729a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f1730b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1730b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1730b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1730b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1730b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1730b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1730b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1730b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1730b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1730b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1730b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1730b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1730b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1730b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1730b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1730b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1730b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1730b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1730b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f1729a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f1729a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f1729a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f1729a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f1729a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f1729a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f1729a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f1729a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f1729a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: D */
        WireFormat.FieldType mo1663D();

        /* JADX INFO: renamed from: E */
        WireFormat.JavaType mo1664E();

        /* JADX INFO: renamed from: G */
        InterfaceC0322b0.a mo1665G(InterfaceC0322b0.a aVar, InterfaceC0322b0 interfaceC0322b0);

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public C0348p() {
        this.f1726a = C0340k0.m2203q(16);
    }

    /* JADX INFO: renamed from: A */
    public static void m2293A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f1730b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.m1594s0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m1552A0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m1560I0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo1580b1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.mo1558G0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.mo1600y0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mo1598w0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m1588m0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m1555D0((InterfaceC0322b0) obj);
                break;
            case 10:
                codedOutputStream.mo1562K0((InterfaceC0322b0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo1574W0((String) obj);
                } else {
                    codedOutputStream.mo1592q0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.m1589n0((byte[]) obj);
                } else {
                    codedOutputStream.mo1592q0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.mo1577Z0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.m1566O0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m1568Q0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m1570S0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.m1572U0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C0351s.c)) {
                    codedOutputStream.m1596u0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m1596u0(((C0351s.c) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2294c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m2295d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iM1519W = CodedOutputStream.m1519W(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iM1519W *= 2;
        }
        return iM1519W + m2296e(fieldType, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m2296e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f1730b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m1536k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m1544s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m1551z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m1523a0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m1549x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m1542q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m1540o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m1528f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m1546u((InterfaceC0322b0) obj);
            case 10:
                return obj instanceof C0352t ? CodedOutputStream.m1499C((C0352t) obj) : CodedOutputStream.m1504H((InterfaceC0322b0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.m1533i((ByteString) obj) : CodedOutputStream.m1518V((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.m1533i((ByteString) obj) : CodedOutputStream.m1529g((byte[]) obj);
            case 13:
                return CodedOutputStream.m1521Y(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m1510N(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m1512P(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m1514R(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m1516T(((Long) obj).longValue());
            case 18:
                return obj instanceof C0351s.c ? CodedOutputStream.m1538m(((C0351s.c) obj).getNumber()) : CodedOutputStream.m1538m(((Integer) obj).intValue());
            default:
                azk0.m101074a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2297f(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeMo1663D = bVar.mo1663D();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return m2295d(fieldTypeMo1663D, number, obj);
        }
        int iM2295d = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM2295d += m2296e(fieldTypeMo1663D, it.next());
            }
            return CodedOutputStream.m1519W(number) + iM2295d + CodedOutputStream.m1508L(iM2295d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM2295d += m2295d(fieldTypeMo1663D, number, it2.next());
        }
        return iM2295d;
    }

    /* JADX INFO: renamed from: h */
    public static <T extends b<T>> C0348p<T> m2298h() {
        return f1725d;
    }

    /* JADX INFO: renamed from: m */
    public static int m2299m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: renamed from: q */
    public static <T extends b<T>> boolean m2300q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo1664E() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC0322b0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC0322b0)) {
                    if (value instanceof C0352t) {
                        return true;
                    }
                    wg3.m206174a("Wrong object type used with protocol message reflection.");
                    return false;
                }
                if (!((InterfaceC0322b0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m2301r(WireFormat.FieldType fieldType, Object obj) {
        C0351s.m2340a(obj);
        switch (a.f1729a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C0351s.c);
            case 9:
                return (obj instanceof InterfaceC0322b0) || (obj instanceof C0352t);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static <T extends b<T>> C0348p<T> m2302w() {
        return new C0348p<>();
    }

    /* JADX INFO: renamed from: z */
    public static void m2303z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.m1553B0(i, (InterfaceC0322b0) obj);
        } else {
            codedOutputStream.mo1575X0(i, m2299m(fieldType, false));
            m2293A(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2304a(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            wg3.m206174a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m2319y(t.mo1663D(), obj);
        Object objM2307i = m2307i(t);
        if (objM2307i == null) {
            arrayList = new ArrayList();
            this.f1726a.m2215r(t, arrayList);
        } else {
            arrayList = (List) objM2307i;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0348p<T> clone() {
        C0340k0<T, Object> c0340k0;
        C0348p<T> c0348pM2302w = m2302w();
        int i = 0;
        while (true) {
            int iM2209k = this.f1726a.m2209k();
            c0340k0 = this.f1726a;
            if (i >= iM2209k) {
                break;
            }
            Map.Entry<K, Object> entryM2208j = c0340k0.m2208j(i);
            c0348pM2302w.m2318x((b) entryM2208j.getKey(), entryM2208j.getValue());
            i++;
        }
        Iterator it = c0340k0.m2211m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0348pM2302w.m2318x((b) entry.getKey(), entry.getValue());
        }
        c0348pM2302w.f1728c = this.f1728c;
        return c0348pM2302w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0348p) {
            return this.f1726a.equals(((C0348p) obj).f1726a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Iterator<Map.Entry<T, Object>> m2306g() {
        boolean z = this.f1728c;
        C0340k0<T, Object> c0340k0 = this.f1726a;
        return z ? new C0352t.c(c0340k0.m2206h().iterator()) : c0340k0.m2206h().iterator();
    }

    public int hashCode() {
        return this.f1726a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m2307i(T t) {
        Object obj = this.f1726a.get(t);
        return obj instanceof C0352t ? ((C0352t) obj).m2350f() : obj;
    }

    /* JADX INFO: renamed from: j */
    public int m2308j() {
        C0340k0<T, Object> c0340k0;
        int i = 0;
        int iM2309k = 0;
        while (true) {
            int iM2209k = this.f1726a.m2209k();
            c0340k0 = this.f1726a;
            if (i >= iM2209k) {
                break;
            }
            iM2309k += m2309k(c0340k0.m2208j(i));
            i++;
        }
        Iterator it = c0340k0.m2211m().iterator();
        while (it.hasNext()) {
            iM2309k += m2309k((Map.Entry) it.next());
        }
        return iM2309k;
    }

    /* JADX INFO: renamed from: k */
    public final int m2309k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo1664E() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return m2297f(key, value);
        }
        return value instanceof C0352t ? CodedOutputStream.m1497A(entry.getKey().getNumber(), (C0352t) value) : CodedOutputStream.m1501E(entry.getKey().getNumber(), (InterfaceC0322b0) value);
    }

    /* JADX INFO: renamed from: l */
    public int m2310l() {
        C0340k0<T, Object> c0340k0;
        int i = 0;
        int iM2297f = 0;
        while (true) {
            int iM2209k = this.f1726a.m2209k();
            c0340k0 = this.f1726a;
            if (i >= iM2209k) {
                break;
            }
            Map.Entry<K, Object> entryM2208j = c0340k0.m2208j(i);
            iM2297f += m2297f((b) entryM2208j.getKey(), entryM2208j.getValue());
            i++;
        }
        Iterator it = c0340k0.m2211m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM2297f += m2297f((b) entry.getKey(), entry.getValue());
        }
        return iM2297f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m2311n() {
        return this.f1726a.isEmpty();
    }

    /* JADX INFO: renamed from: o */
    public boolean m2312o() {
        return this.f1727b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m2313p() {
        int i = 0;
        while (true) {
            int iM2209k = this.f1726a.m2209k();
            C0340k0<T, Object> c0340k0 = this.f1726a;
            if (i >= iM2209k) {
                Iterator it = c0340k0.m2211m().iterator();
                while (it.hasNext()) {
                    if (!m2300q((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m2300q(c0340k0.m2208j(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public Iterator<Map.Entry<T, Object>> m2314s() {
        boolean z = this.f1728c;
        C0340k0<T, Object> c0340k0 = this.f1726a;
        return z ? new C0352t.c(c0340k0.entrySet().iterator()) : c0340k0.entrySet().iterator();
    }

    /* JADX INFO: renamed from: t */
    public void m2315t() {
        if (this.f1727b) {
            return;
        }
        this.f1726a.mo2214p();
        this.f1727b = true;
    }

    /* JADX INFO: renamed from: u */
    public void m2316u(C0348p<T> c0348p) {
        C0340k0<T, Object> c0340k0;
        int i = 0;
        while (true) {
            int iM2209k = c0348p.f1726a.m2209k();
            c0340k0 = c0348p.f1726a;
            if (i >= iM2209k) {
                break;
            }
            m2317v(c0340k0.m2208j(i));
            i++;
        }
        Iterator it = c0340k0.m2211m().iterator();
        while (it.hasNext()) {
            m2317v((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2317v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0352t) {
            value = ((C0352t) value).m2350f();
        }
        if (key.isRepeated()) {
            Object objM2307i = m2307i(key);
            if (objM2307i == null) {
                objM2307i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM2307i).add(m2294c(it.next()));
            }
            this.f1726a.m2215r(key, objM2307i);
            return;
        }
        if (key.mo1664E() != WireFormat.JavaType.MESSAGE) {
            this.f1726a.m2215r(key, m2294c(value));
            return;
        }
        Object objM2307i2 = m2307i(key);
        if (objM2307i2 == null) {
            this.f1726a.m2215r(key, m2294c(value));
        } else {
            this.f1726a.m2215r(key, key.mo1665G(((InterfaceC0322b0) objM2307i2).toBuilder(), (InterfaceC0322b0) value).build());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2318x(T t, Object obj) {
        if (!t.isRepeated()) {
            m2319y(t.mo1663D(), obj);
        } else {
            if (!(obj instanceof List)) {
                wg3.m206174a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m2319y(t.mo1663D(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C0352t) {
            this.f1728c = true;
        }
        this.f1726a.m2215r(t, obj);
    }

    /* JADX INFO: renamed from: y */
    public final void m2319y(WireFormat.FieldType fieldType, Object obj) {
        if (m2301r(fieldType, obj)) {
            return;
        }
        wg3.m206174a("Wrong object type used with protocol message reflection.");
    }

    public C0348p(boolean z) {
        this(C0340k0.m2203q(0));
        m2315t();
    }

    public C0348p(C0340k0<T, Object> c0340k0) {
        this.f1726a = c0340k0;
        m2315t();
    }
}
