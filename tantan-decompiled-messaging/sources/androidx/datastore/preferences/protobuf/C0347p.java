package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0347p.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.ig3;
import p149l.upk0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0347p<T extends b<T>> {

    /* JADX INFO: renamed from: d */
    public static final C0347p f1725d = new C0347p(true);

    /* JADX INFO: renamed from: a */
    public final C0339k0<T, Object> f1726a;

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
        WireFormat.FieldType mo1662D();

        /* JADX INFO: renamed from: E */
        WireFormat.JavaType mo1663E();

        /* JADX INFO: renamed from: G */
        InterfaceC0321b0.a mo1664G(InterfaceC0321b0.a aVar, InterfaceC0321b0 interfaceC0321b0);

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public C0347p() {
        this.f1726a = C0339k0.m2202q(16);
    }

    /* JADX INFO: renamed from: A */
    public static void m2292A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f1730b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.m1593s0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m1551A0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m1559I0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo1579b1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.mo1557G0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.mo1599y0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mo1597w0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m1587m0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m1554D0((InterfaceC0321b0) obj);
                break;
            case 10:
                codedOutputStream.mo1561K0((InterfaceC0321b0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo1573W0((String) obj);
                } else {
                    codedOutputStream.mo1591q0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.m1588n0((byte[]) obj);
                } else {
                    codedOutputStream.mo1591q0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.mo1576Z0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.m1565O0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m1567Q0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m1569S0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.m1571U0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C0350s.c)) {
                    codedOutputStream.m1595u0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m1595u0(((C0350s.c) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2293c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m2294d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iM1518W = CodedOutputStream.m1518W(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iM1518W *= 2;
        }
        return iM1518W + m2295e(fieldType, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m2295e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f1730b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m1535k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m1543s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m1550z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m1522a0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m1548x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m1541q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m1539o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m1527f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m1545u((InterfaceC0321b0) obj);
            case 10:
                return obj instanceof C0351t ? CodedOutputStream.m1498C((C0351t) obj) : CodedOutputStream.m1503H((InterfaceC0321b0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.m1532i((ByteString) obj) : CodedOutputStream.m1517V((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.m1532i((ByteString) obj) : CodedOutputStream.m1528g((byte[]) obj);
            case 13:
                return CodedOutputStream.m1520Y(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m1509N(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m1511P(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m1513R(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m1515T(((Long) obj).longValue());
            case 18:
                return obj instanceof C0350s.c ? CodedOutputStream.m1537m(((C0350s.c) obj).getNumber()) : CodedOutputStream.m1537m(((Integer) obj).intValue());
            default:
                upk0.m194883a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2296f(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeMo1662D = bVar.mo1662D();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return m2294d(fieldTypeMo1662D, number, obj);
        }
        int iM2294d = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM2294d += m2295e(fieldTypeMo1662D, it.next());
            }
            return CodedOutputStream.m1518W(number) + iM2294d + CodedOutputStream.m1507L(iM2294d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM2294d += m2294d(fieldTypeMo1662D, number, it2.next());
        }
        return iM2294d;
    }

    /* JADX INFO: renamed from: h */
    public static <T extends b<T>> C0347p<T> m2297h() {
        return f1725d;
    }

    /* JADX INFO: renamed from: m */
    public static int m2298m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: renamed from: q */
    public static <T extends b<T>> boolean m2299q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo1663E() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC0321b0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC0321b0)) {
                    if (value instanceof C0351t) {
                        return true;
                    }
                    ig3.m135964a("Wrong object type used with protocol message reflection.");
                    return false;
                }
                if (!((InterfaceC0321b0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m2300r(WireFormat.FieldType fieldType, Object obj) {
        C0350s.m2339a(obj);
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
                return (obj instanceof Integer) || (obj instanceof C0350s.c);
            case 9:
                return (obj instanceof InterfaceC0321b0) || (obj instanceof C0351t);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static <T extends b<T>> C0347p<T> m2301w() {
        return new C0347p<>();
    }

    /* JADX INFO: renamed from: z */
    public static void m2302z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.m1552B0(i, (InterfaceC0321b0) obj);
        } else {
            codedOutputStream.mo1574X0(i, m2298m(fieldType, false));
            m2292A(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2303a(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            ig3.m135964a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m2318y(t.mo1662D(), obj);
        Object objM2306i = m2306i(t);
        if (objM2306i == null) {
            arrayList = new ArrayList();
            this.f1726a.m2214r(t, arrayList);
        } else {
            arrayList = (List) objM2306i;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0347p<T> clone() {
        C0339k0<T, Object> c0339k0;
        C0347p<T> c0347pM2301w = m2301w();
        int i = 0;
        while (true) {
            int iM2208k = this.f1726a.m2208k();
            c0339k0 = this.f1726a;
            if (i >= iM2208k) {
                break;
            }
            Map.Entry<K, Object> entryM2207j = c0339k0.m2207j(i);
            c0347pM2301w.m2317x((b) entryM2207j.getKey(), entryM2207j.getValue());
            i++;
        }
        Iterator it = c0339k0.m2210m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0347pM2301w.m2317x((b) entry.getKey(), entry.getValue());
        }
        c0347pM2301w.f1728c = this.f1728c;
        return c0347pM2301w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0347p) {
            return this.f1726a.equals(((C0347p) obj).f1726a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Iterator<Map.Entry<T, Object>> m2305g() {
        boolean z = this.f1728c;
        C0339k0<T, Object> c0339k0 = this.f1726a;
        return z ? new C0351t.c(c0339k0.m2205h().iterator()) : c0339k0.m2205h().iterator();
    }

    public int hashCode() {
        return this.f1726a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m2306i(T t) {
        Object obj = this.f1726a.get(t);
        return obj instanceof C0351t ? ((C0351t) obj).m2349f() : obj;
    }

    /* JADX INFO: renamed from: j */
    public int m2307j() {
        C0339k0<T, Object> c0339k0;
        int i = 0;
        int iM2308k = 0;
        while (true) {
            int iM2208k = this.f1726a.m2208k();
            c0339k0 = this.f1726a;
            if (i >= iM2208k) {
                break;
            }
            iM2308k += m2308k(c0339k0.m2207j(i));
            i++;
        }
        Iterator it = c0339k0.m2210m().iterator();
        while (it.hasNext()) {
            iM2308k += m2308k((Map.Entry) it.next());
        }
        return iM2308k;
    }

    /* JADX INFO: renamed from: k */
    public final int m2308k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo1663E() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return m2296f(key, value);
        }
        return value instanceof C0351t ? CodedOutputStream.m1496A(entry.getKey().getNumber(), (C0351t) value) : CodedOutputStream.m1500E(entry.getKey().getNumber(), (InterfaceC0321b0) value);
    }

    /* JADX INFO: renamed from: l */
    public int m2309l() {
        C0339k0<T, Object> c0339k0;
        int i = 0;
        int iM2296f = 0;
        while (true) {
            int iM2208k = this.f1726a.m2208k();
            c0339k0 = this.f1726a;
            if (i >= iM2208k) {
                break;
            }
            Map.Entry<K, Object> entryM2207j = c0339k0.m2207j(i);
            iM2296f += m2296f((b) entryM2207j.getKey(), entryM2207j.getValue());
            i++;
        }
        Iterator it = c0339k0.m2210m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM2296f += m2296f((b) entry.getKey(), entry.getValue());
        }
        return iM2296f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m2310n() {
        return this.f1726a.isEmpty();
    }

    /* JADX INFO: renamed from: o */
    public boolean m2311o() {
        return this.f1727b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m2312p() {
        int i = 0;
        while (true) {
            int iM2208k = this.f1726a.m2208k();
            C0339k0<T, Object> c0339k0 = this.f1726a;
            if (i >= iM2208k) {
                Iterator it = c0339k0.m2210m().iterator();
                while (it.hasNext()) {
                    if (!m2299q((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m2299q(c0339k0.m2207j(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public Iterator<Map.Entry<T, Object>> m2313s() {
        boolean z = this.f1728c;
        C0339k0<T, Object> c0339k0 = this.f1726a;
        return z ? new C0351t.c(c0339k0.entrySet().iterator()) : c0339k0.entrySet().iterator();
    }

    /* JADX INFO: renamed from: t */
    public void m2314t() {
        if (this.f1727b) {
            return;
        }
        this.f1726a.mo2213p();
        this.f1727b = true;
    }

    /* JADX INFO: renamed from: u */
    public void m2315u(C0347p<T> c0347p) {
        C0339k0<T, Object> c0339k0;
        int i = 0;
        while (true) {
            int iM2208k = c0347p.f1726a.m2208k();
            c0339k0 = c0347p.f1726a;
            if (i >= iM2208k) {
                break;
            }
            m2316v(c0339k0.m2207j(i));
            i++;
        }
        Iterator it = c0339k0.m2210m().iterator();
        while (it.hasNext()) {
            m2316v((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2316v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0351t) {
            value = ((C0351t) value).m2349f();
        }
        if (key.isRepeated()) {
            Object objM2306i = m2306i(key);
            if (objM2306i == null) {
                objM2306i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM2306i).add(m2293c(it.next()));
            }
            this.f1726a.m2214r(key, objM2306i);
            return;
        }
        if (key.mo1663E() != WireFormat.JavaType.MESSAGE) {
            this.f1726a.m2214r(key, m2293c(value));
            return;
        }
        Object objM2306i2 = m2306i(key);
        if (objM2306i2 == null) {
            this.f1726a.m2214r(key, m2293c(value));
        } else {
            this.f1726a.m2214r(key, key.mo1664G(((InterfaceC0321b0) objM2306i2).toBuilder(), (InterfaceC0321b0) value).build());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2317x(T t, Object obj) {
        if (!t.isRepeated()) {
            m2318y(t.mo1662D(), obj);
        } else {
            if (!(obj instanceof List)) {
                ig3.m135964a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m2318y(t.mo1662D(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C0351t) {
            this.f1728c = true;
        }
        this.f1726a.m2214r(t, obj);
    }

    /* JADX INFO: renamed from: y */
    public final void m2318y(WireFormat.FieldType fieldType, Object obj) {
        if (m2300r(fieldType, obj)) {
            return;
        }
        ig3.m135964a("Wrong object type used with protocol message reflection.");
    }

    public C0347p(boolean z) {
        this(C0339k0.m2202q(0));
        m2314t();
    }

    public C0347p(C0339k0<T, Object> c0339k0) {
        this.f1726a = c0339k0;
        m2314t();
    }
}
