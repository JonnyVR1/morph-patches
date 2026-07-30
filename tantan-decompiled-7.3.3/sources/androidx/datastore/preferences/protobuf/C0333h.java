package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p153l.azk0;
import p153l.g7b0;
import p153l.wbr;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0333h implements InterfaceC0334h0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0331g f1676a;

    /* JADX INFO: renamed from: b */
    public int f1677b;

    /* JADX INFO: renamed from: c */
    public int f1678c;

    /* JADX INFO: renamed from: d */
    public int f1679d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1680a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1680a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1680a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1680a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1680a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1680a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1680a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1680a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1680a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1680a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1680a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1680a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1680a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1680a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1680a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1680a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1680a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1680a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0333h(AbstractC0331g abstractC0331g) {
        AbstractC0331g abstractC0331g2 = (AbstractC0331g) C0351s.m2341b(abstractC0331g, "input");
        this.f1676a = abstractC0331g2;
        abstractC0331g2.f1644d = this;
    }

    /* JADX INFO: renamed from: P */
    public static C0333h m2113P(AbstractC0331g abstractC0331g) {
        C0333h c0333h = abstractC0331g.f1644d;
        return c0333h != null ? c0333h : new C0333h(abstractC0331g);
    }

    /* JADX INFO: renamed from: Q */
    private Object m2114Q(WireFormat.FieldType fieldType, Class<?> cls, C0341l c0341l) throws IOException {
        switch (a.f1680a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo2007y());
            case 2:
                return mo1982g();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo1976d());
            case 5:
                return Integer.valueOf(mo1952H());
            case 6:
                return Long.valueOf(mo2005w());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo1948D());
            case 9:
                return Long.valueOf(mo2003u());
            case 10:
                return mo1990k(cls, c0341l);
            case 11:
                return Integer.valueOf(mo1958N());
            case 12:
                return Long.valueOf(mo1972b());
            case 13:
                return Integer.valueOf(mo1978e());
            case 14:
                return Long.valueOf(mo1955K());
            case 15:
                return mo1959O();
            case 16:
                return Integer.valueOf(mo1974c());
            case 17:
                return Long.valueOf(mo1988j());
            default:
                azk0.m101074a("unsupported field type.");
                return null;
        }
    }

    /* JADX INFO: renamed from: R */
    private <T> T m2115R(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
        int i = this.f1678c;
        this.f1678c = WireFormat.m1749c(WireFormat.m1747a(this.f1677b), 4);
        try {
            T tMo1913h = interfaceC0336i0.mo1913h();
            interfaceC0336i0.mo1907e(tMo1913h, this, c0341l);
            interfaceC0336i0.mo1909f(tMo1913h);
            if (this.f1677b != this.f1678c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f1678c = i;
            return tMo1913h;
        } catch (Throwable th) {
            this.f1678c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    private <T> T m2116S(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
        int iMo2039D = this.f1676a.mo2039D();
        AbstractC0331g abstractC0331g = this.f1676a;
        if (abstractC0331g.f1641a >= abstractC0331g.f1642b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iMo2046m = abstractC0331g.mo2046m(iMo2039D);
        T tMo1913h = interfaceC0336i0.mo1913h();
        this.f1676a.f1641a++;
        interfaceC0336i0.mo1907e(tMo1913h, this, c0341l);
        interfaceC0336i0.mo1909f(tMo1913h);
        this.f1676a.mo2042a(0);
        AbstractC0331g abstractC0331g2 = this.f1676a;
        abstractC0331g2.f1641a--;
        abstractC0331g2.mo2045l(iMo2046m);
        return tMo1913h;
    }

    /* JADX INFO: renamed from: U */
    private void m2117U(int i) throws IOException {
        if (this.f1676a.mo2043d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: V */
    private void m2118V(int i) throws IOException {
        if (WireFormat.m1748b(this.f1677b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX INFO: renamed from: W */
    private void m2119W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX INFO: renamed from: X */
    private void m2120X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: A */
    public void mo1945A(List<Long> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0356x;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2055v()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Long.valueOf(this.f1676a.mo2055v()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0356x c0356x = (C0356x) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0356x.m2384u(this.f1676a.mo2055v());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0356x.m2384u(this.f1676a.mo2055v());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: B */
    public void mo1946B(List<Integer> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0350r;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2050q()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2050q()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0350r c0350r = (C0350r) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0350r.m2332U(this.f1676a.mo2050q());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0350r.m2332U(this.f1676a.mo2050q());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: C */
    public void mo1947C(List<String> list) throws IOException {
        m2121T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: D */
    public int mo1948D() throws IOException {
        m2118V(0);
        return this.f1676a.mo2054u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: E */
    public <T> void mo1949E(List<T> list, InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
        int iMo2038C;
        if (WireFormat.m1748b(this.f1677b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f1677b;
        do {
            list.add(m2116S(interfaceC0336i0, c0341l));
            if (this.f1676a.mo2044e() || this.f1679d != 0) {
                return;
            } else {
                iMo2038C = this.f1676a.mo2038C();
            }
        } while (iMo2038C == i);
        this.f1679d = iMo2038C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: F */
    public void mo1950F(List<Long> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0356x;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 1) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2052s()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2039D = this.f1676a.mo2039D();
            m2120X(iMo2039D);
            int iMo2043d = this.f1676a.mo2043d() + iMo2039D;
            do {
                list.add(Long.valueOf(this.f1676a.mo2052s()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            return;
        }
        C0356x c0356x = (C0356x) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 1) {
            do {
                c0356x.m2384u(this.f1676a.mo2052s());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2039D2 = this.f1676a.mo2039D();
        m2120X(iMo2039D2);
        int iMo2043d2 = this.f1676a.mo2043d() + iMo2039D2;
        do {
            c0356x.m2384u(this.f1676a.mo2052s());
        } while (this.f1676a.mo2043d() < iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: G */
    public void mo1951G(List<Integer> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0350r;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2039D()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2039D()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0350r c0350r = (C0350r) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0350r.m2332U(this.f1676a.mo2039D());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0350r.m2332U(this.f1676a.mo2039D());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: H */
    public int mo1952H() throws IOException {
        m2118V(5);
        return this.f1676a.mo2051r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: I */
    public <T> T mo1953I(Class<T> cls, C0341l c0341l) throws IOException {
        m2118V(3);
        return (T) m2115R(g7b0.m129308a().m129311d(cls), c0341l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: J */
    public <K, V> void mo1954J(Map<K, V> map, C0357y.a<K, V> aVar, C0341l c0341l) throws IOException {
        m2118V(2);
        int iMo2046m = this.f1676a.mo2046m(this.f1676a.mo2039D());
        Object objM2114Q = aVar.f1763b;
        Object objM2114Q2 = aVar.f1765d;
        while (true) {
            try {
                int iMo1997o = mo1997o();
                if (iMo1997o == Integer.MAX_VALUE || this.f1676a.mo2044e()) {
                    break;
                }
                if (iMo1997o == 1) {
                    objM2114Q = m2114Q(aVar.f1762a, null, null);
                } else if (iMo1997o != 2) {
                    try {
                        if (!mo2000r()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!mo2000r()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM2114Q2 = m2114Q(aVar.f1764c, aVar.f1765d.getClass(), c0341l);
                }
            } catch (Throwable th) {
                this.f1676a.mo2045l(iMo2046m);
                throw th;
            }
        }
        map.put(objM2114Q, objM2114Q2);
        this.f1676a.mo2045l(iMo2046m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: K */
    public long mo1955K() throws IOException {
        m2118V(0);
        return this.f1676a.mo2059z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: L */
    public String mo1956L() throws IOException {
        m2118V(2);
        return this.f1676a.mo2036A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: M */
    public <T> void mo1957M(List<T> list, InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
        int iMo2038C;
        if (WireFormat.m1748b(this.f1677b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f1677b;
        do {
            list.add(m2115R(interfaceC0336i0, c0341l));
            if (this.f1676a.mo2044e() || this.f1679d != 0) {
                return;
            } else {
                iMo2038C = this.f1676a.mo2038C();
            }
        } while (iMo2038C == i);
        this.f1679d = iMo2038C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: N */
    public int mo1958N() throws IOException {
        m2118V(5);
        return this.f1676a.mo2056w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: O */
    public String mo1959O() throws IOException {
        m2118V(2);
        return this.f1676a.mo2037B();
    }

    /* JADX INFO: renamed from: T */
    public void m2121T(List<String> list, boolean z) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        if (WireFormat.m1748b(this.f1677b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof wbr) || z) {
            do {
                list.add(z ? mo1959O() : mo1956L());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C = this.f1676a.mo2038C();
                }
            } while (iMo2038C == this.f1677b);
            this.f1679d = iMo2038C;
            return;
        }
        wbr wbrVar = (wbr) list;
        do {
            wbrVar.mo2366t(mo1982g());
            if (this.f1676a.mo2044e()) {
                return;
            } else {
                iMo2038C2 = this.f1676a.mo2038C();
            }
        } while (iMo2038C2 == this.f1677b);
        this.f1679d = iMo2038C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: a */
    public void mo1970a(List<Long> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0356x;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2059z()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Long.valueOf(this.f1676a.mo2059z()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0356x c0356x = (C0356x) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0356x.m2384u(this.f1676a.mo2059z());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0356x.m2384u(this.f1676a.mo2059z());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: b */
    public long mo1972b() throws IOException {
        m2118V(1);
        return this.f1676a.mo2057x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: c */
    public int mo1974c() throws IOException {
        m2118V(0);
        return this.f1676a.mo2039D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: d */
    public int mo1976d() throws IOException {
        m2118V(0);
        return this.f1676a.mo2050q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: e */
    public int mo1978e() throws IOException {
        m2118V(0);
        return this.f1676a.mo2058y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: f */
    public void mo1980f(List<Boolean> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0329f;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f1676a.mo2047n()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Boolean.valueOf(this.f1676a.mo2047n()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0329f c0329f = (C0329f) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0329f.m2018h(this.f1676a.mo2047n());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0329f.m2018h(this.f1676a.mo2047n());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: g */
    public ByteString mo1982g() throws IOException {
        m2118V(2);
        return this.f1676a.mo2048o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    public int getTag() {
        return this.f1677b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: h */
    public <T> T mo1984h(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
        m2118V(3);
        return (T) m2115R(interfaceC0336i0, c0341l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: i */
    public void mo1986i(List<Integer> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0350r;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2058y()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2058y()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0350r c0350r = (C0350r) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0350r.m2332U(this.f1676a.mo2058y());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0350r.m2332U(this.f1676a.mo2058y());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: j */
    public long mo1988j() throws IOException {
        m2118V(0);
        return this.f1676a.mo2040E();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: k */
    public <T> T mo1990k(Class<T> cls, C0341l c0341l) throws IOException {
        m2118V(2);
        return (T) m2116S(g7b0.m129308a().m129311d(cls), c0341l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: l */
    public void mo1992l(List<Long> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0356x;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 1) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2057x()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2039D = this.f1676a.mo2039D();
            m2120X(iMo2039D);
            int iMo2043d = this.f1676a.mo2043d() + iMo2039D;
            do {
                list.add(Long.valueOf(this.f1676a.mo2057x()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            return;
        }
        C0356x c0356x = (C0356x) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 1) {
            do {
                c0356x.m2384u(this.f1676a.mo2057x());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2039D2 = this.f1676a.mo2039D();
        m2120X(iMo2039D2);
        int iMo2043d2 = this.f1676a.mo2043d() + iMo2039D2;
        do {
            c0356x.m2384u(this.f1676a.mo2057x());
        } while (this.f1676a.mo2043d() < iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: m */
    public void mo1994m(List<Integer> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0350r;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2054u()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2054u()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0350r c0350r = (C0350r) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0350r.m2332U(this.f1676a.mo2054u());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0350r.m2332U(this.f1676a.mo2054u());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: n */
    public void mo1996n(List<Integer> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0350r;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 2) {
                int iMo2039D = this.f1676a.mo2039D();
                m2119W(iMo2039D);
                int iMo2043d = this.f1676a.mo2043d() + iMo2039D;
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2051r()));
                } while (this.f1676a.mo2043d() < iMo2043d);
                return;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f1676a.mo2051r()));
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C = this.f1676a.mo2038C();
                }
            } while (iMo2038C == this.f1677b);
            this.f1679d = iMo2038C;
            return;
        }
        C0350r c0350r = (C0350r) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 2) {
            int iMo2039D2 = this.f1676a.mo2039D();
            m2119W(iMo2039D2);
            int iMo2043d2 = this.f1676a.mo2043d() + iMo2039D2;
            do {
                c0350r.m2332U(this.f1676a.mo2051r());
            } while (this.f1676a.mo2043d() < iMo2043d2);
            return;
        }
        if (iM1748b2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0350r.m2332U(this.f1676a.mo2051r());
            if (this.f1676a.mo2044e()) {
                return;
            } else {
                iMo2038C2 = this.f1676a.mo2038C();
            }
        } while (iMo2038C2 == this.f1677b);
        this.f1679d = iMo2038C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: o */
    public int mo1997o() throws IOException {
        int i = this.f1679d;
        if (i != 0) {
            this.f1677b = i;
            this.f1679d = 0;
        } else {
            this.f1677b = this.f1676a.mo2038C();
        }
        int i2 = this.f1677b;
        return (i2 == 0 || i2 == this.f1678c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : WireFormat.m1747a(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: p */
    public void mo1998p(List<String> list) throws IOException {
        m2121T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: q */
    public void mo1999q(List<Float> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0349q;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 2) {
                int iMo2039D = this.f1676a.mo2039D();
                m2119W(iMo2039D);
                int iMo2043d = this.f1676a.mo2043d() + iMo2039D;
                do {
                    list.add(Float.valueOf(this.f1676a.mo2053t()));
                } while (this.f1676a.mo2043d() < iMo2043d);
                return;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f1676a.mo2053t()));
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C = this.f1676a.mo2038C();
                }
            } while (iMo2038C == this.f1677b);
            this.f1679d = iMo2038C;
            return;
        }
        C0349q c0349q = (C0349q) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 2) {
            int iMo2039D2 = this.f1676a.mo2039D();
            m2119W(iMo2039D2);
            int iMo2043d2 = this.f1676a.mo2043d() + iMo2039D2;
            do {
                c0349q.m2322M(this.f1676a.mo2053t());
            } while (this.f1676a.mo2043d() < iMo2043d2);
            return;
        }
        if (iM1748b2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0349q.m2322M(this.f1676a.mo2053t());
            if (this.f1676a.mo2044e()) {
                return;
            } else {
                iMo2038C2 = this.f1676a.mo2038C();
            }
        } while (iMo2038C2 == this.f1677b);
        this.f1679d = iMo2038C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: r */
    public boolean mo2000r() throws IOException {
        int i;
        if (this.f1676a.mo2044e() || (i = this.f1677b) == this.f1678c) {
            return false;
        }
        return this.f1676a.mo2041F(i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    public double readDouble() throws IOException {
        m2118V(1);
        return this.f1676a.mo2049p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    public float readFloat() throws IOException {
        m2118V(5);
        return this.f1676a.mo2053t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: s */
    public void mo2001s(List<ByteString> list) throws IOException {
        int iMo2038C;
        if (WireFormat.m1748b(this.f1677b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(mo1982g());
            if (this.f1676a.mo2044e()) {
                return;
            } else {
                iMo2038C = this.f1676a.mo2038C();
            }
        } while (iMo2038C == this.f1677b);
        this.f1679d = iMo2038C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: t */
    public void mo2002t(List<Double> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0337j;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 1) {
                do {
                    list.add(Double.valueOf(this.f1676a.mo2049p()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2039D = this.f1676a.mo2039D();
            m2120X(iMo2039D);
            int iMo2043d = this.f1676a.mo2043d() + iMo2039D;
            do {
                list.add(Double.valueOf(this.f1676a.mo2049p()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            return;
        }
        C0337j c0337j = (C0337j) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 1) {
            do {
                c0337j.m2133g(this.f1676a.mo2049p());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2039D2 = this.f1676a.mo2039D();
        m2120X(iMo2039D2);
        int iMo2043d2 = this.f1676a.mo2043d() + iMo2039D2;
        do {
            c0337j.m2133g(this.f1676a.mo2049p());
        } while (this.f1676a.mo2043d() < iMo2043d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: u */
    public long mo2003u() throws IOException {
        m2118V(0);
        return this.f1676a.mo2055v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: v */
    public <T> T mo2004v(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
        m2118V(2);
        return (T) m2116S(interfaceC0336i0, c0341l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: w */
    public long mo2005w() throws IOException {
        m2118V(1);
        return this.f1676a.mo2052s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: x */
    public void mo2006x(List<Integer> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0350r;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 2) {
                int iMo2039D = this.f1676a.mo2039D();
                m2119W(iMo2039D);
                int iMo2043d = this.f1676a.mo2043d() + iMo2039D;
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2056w()));
                } while (this.f1676a.mo2043d() < iMo2043d);
                return;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f1676a.mo2056w()));
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C = this.f1676a.mo2038C();
                }
            } while (iMo2038C == this.f1677b);
            this.f1679d = iMo2038C;
            return;
        }
        C0350r c0350r = (C0350r) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 2) {
            int iMo2039D2 = this.f1676a.mo2039D();
            m2119W(iMo2039D2);
            int iMo2043d2 = this.f1676a.mo2043d() + iMo2039D2;
            do {
                c0350r.m2332U(this.f1676a.mo2056w());
            } while (this.f1676a.mo2043d() < iMo2043d2);
            return;
        }
        if (iM1748b2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0350r.m2332U(this.f1676a.mo2056w());
            if (this.f1676a.mo2044e()) {
                return;
            } else {
                iMo2038C2 = this.f1676a.mo2038C();
            }
        } while (iMo2038C2 == this.f1677b);
        this.f1679d = iMo2038C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: y */
    public boolean mo2007y() throws IOException {
        m2118V(0);
        return this.f1676a.mo2047n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
    /* JADX INFO: renamed from: z */
    public void mo2008z(List<Long> list) throws IOException {
        int iMo2038C;
        int iMo2038C2;
        boolean z = list instanceof C0356x;
        int i = this.f1677b;
        if (!z) {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2040E()));
                    if (this.f1676a.mo2044e()) {
                        return;
                    } else {
                        iMo2038C = this.f1676a.mo2038C();
                    }
                } while (iMo2038C == this.f1677b);
                this.f1679d = iMo2038C;
                return;
            }
            if (iM1748b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2043d = this.f1676a.mo2043d() + this.f1676a.mo2039D();
            do {
                list.add(Long.valueOf(this.f1676a.mo2040E()));
            } while (this.f1676a.mo2043d() < iMo2043d);
            m2117U(iMo2043d);
            return;
        }
        C0356x c0356x = (C0356x) list;
        int iM1748b2 = WireFormat.m1748b(i);
        if (iM1748b2 == 0) {
            do {
                c0356x.m2384u(this.f1676a.mo2040E());
                if (this.f1676a.mo2044e()) {
                    return;
                } else {
                    iMo2038C2 = this.f1676a.mo2038C();
                }
            } while (iMo2038C2 == this.f1677b);
            this.f1679d = iMo2038C2;
            return;
        }
        if (iM1748b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2043d2 = this.f1676a.mo2043d() + this.f1676a.mo2039D();
        do {
            c0356x.m2384u(this.f1676a.mo2040E());
        } while (this.f1676a.mo2043d() < iMo2043d2);
        m2117U(iMo2043d2);
    }
}
