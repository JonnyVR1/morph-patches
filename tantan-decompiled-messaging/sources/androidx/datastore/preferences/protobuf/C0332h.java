package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p149l.cza0;
import p149l.u9r;
import p149l.upk0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0332h implements InterfaceC0333h0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0330g f1676a;

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

    public C0332h(AbstractC0330g abstractC0330g) {
        AbstractC0330g abstractC0330g2 = (AbstractC0330g) C0350s.m2340b(abstractC0330g, "input");
        this.f1676a = abstractC0330g2;
        abstractC0330g2.f1644d = this;
    }

    /* JADX INFO: renamed from: P */
    public static C0332h m2112P(AbstractC0330g abstractC0330g) {
        C0332h c0332h = abstractC0330g.f1644d;
        return c0332h != null ? c0332h : new C0332h(abstractC0330g);
    }

    /* JADX INFO: renamed from: Q */
    private Object m2113Q(WireFormat.FieldType fieldType, Class<?> cls, C0340l c0340l) throws IOException {
        switch (a.f1680a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo2006y());
            case 2:
                return mo1981g();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo1975d());
            case 5:
                return Integer.valueOf(mo1951H());
            case 6:
                return Long.valueOf(mo2004w());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo1947D());
            case 9:
                return Long.valueOf(mo2002u());
            case 10:
                return mo1989k(cls, c0340l);
            case 11:
                return Integer.valueOf(mo1957N());
            case 12:
                return Long.valueOf(mo1971b());
            case 13:
                return Integer.valueOf(mo1977e());
            case 14:
                return Long.valueOf(mo1954K());
            case 15:
                return mo1958O();
            case 16:
                return Integer.valueOf(mo1973c());
            case 17:
                return Long.valueOf(mo1987j());
            default:
                upk0.m194883a("unsupported field type.");
                return null;
        }
    }

    /* JADX INFO: renamed from: R */
    private <T> T m2114R(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
        int i = this.f1678c;
        this.f1678c = WireFormat.m1748c(WireFormat.m1746a(this.f1677b), 4);
        try {
            T tMo1912h = interfaceC0335i0.mo1912h();
            interfaceC0335i0.mo1906e(tMo1912h, this, c0340l);
            interfaceC0335i0.mo1908f(tMo1912h);
            if (this.f1677b != this.f1678c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f1678c = i;
            return tMo1912h;
        } catch (Throwable th) {
            this.f1678c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    private <T> T m2115S(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
        int iMo2038D = this.f1676a.mo2038D();
        AbstractC0330g abstractC0330g = this.f1676a;
        if (abstractC0330g.f1641a >= abstractC0330g.f1642b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iMo2045m = abstractC0330g.mo2045m(iMo2038D);
        T tMo1912h = interfaceC0335i0.mo1912h();
        this.f1676a.f1641a++;
        interfaceC0335i0.mo1906e(tMo1912h, this, c0340l);
        interfaceC0335i0.mo1908f(tMo1912h);
        this.f1676a.mo2041a(0);
        AbstractC0330g abstractC0330g2 = this.f1676a;
        abstractC0330g2.f1641a--;
        abstractC0330g2.mo2044l(iMo2045m);
        return tMo1912h;
    }

    /* JADX INFO: renamed from: U */
    private void m2116U(int i) throws IOException {
        if (this.f1676a.mo2042d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: V */
    private void m2117V(int i) throws IOException {
        if (WireFormat.m1747b(this.f1677b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX INFO: renamed from: W */
    private void m2118W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX INFO: renamed from: X */
    private void m2119X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: A */
    public void mo1944A(List<Long> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0355x;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2054v()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Long.valueOf(this.f1676a.mo2054v()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0355x c0355x = (C0355x) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0355x.m2383u(this.f1676a.mo2054v());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0355x.m2383u(this.f1676a.mo2054v());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: B */
    public void mo1945B(List<Integer> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0349r;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2049q()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2049q()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0349r c0349r = (C0349r) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0349r.m2331T(this.f1676a.mo2049q());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0349r.m2331T(this.f1676a.mo2049q());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: C */
    public void mo1946C(List<String> list) throws IOException {
        m2120T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: D */
    public int mo1947D() throws IOException {
        m2117V(0);
        return this.f1676a.mo2053u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: E */
    public <T> void mo1948E(List<T> list, InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
        int iMo2037C;
        if (WireFormat.m1747b(this.f1677b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f1677b;
        do {
            list.add(m2115S(interfaceC0335i0, c0340l));
            if (this.f1676a.mo2043e() || this.f1679d != 0) {
                return;
            } else {
                iMo2037C = this.f1676a.mo2037C();
            }
        } while (iMo2037C == i);
        this.f1679d = iMo2037C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: F */
    public void mo1949F(List<Long> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0355x;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 1) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2051s()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2038D = this.f1676a.mo2038D();
            m2119X(iMo2038D);
            int iMo2042d = this.f1676a.mo2042d() + iMo2038D;
            do {
                list.add(Long.valueOf(this.f1676a.mo2051s()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            return;
        }
        C0355x c0355x = (C0355x) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 1) {
            do {
                c0355x.m2383u(this.f1676a.mo2051s());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2038D2 = this.f1676a.mo2038D();
        m2119X(iMo2038D2);
        int iMo2042d2 = this.f1676a.mo2042d() + iMo2038D2;
        do {
            c0355x.m2383u(this.f1676a.mo2051s());
        } while (this.f1676a.mo2042d() < iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: G */
    public void mo1950G(List<Integer> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0349r;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2038D()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2038D()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0349r c0349r = (C0349r) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0349r.m2331T(this.f1676a.mo2038D());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0349r.m2331T(this.f1676a.mo2038D());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: H */
    public int mo1951H() throws IOException {
        m2117V(5);
        return this.f1676a.mo2050r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: I */
    public <T> T mo1952I(Class<T> cls, C0340l c0340l) throws IOException {
        m2117V(3);
        return (T) m2114R(cza0.m109400a().m109403d(cls), c0340l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: J */
    public <K, V> void mo1953J(Map<K, V> map, C0356y.a<K, V> aVar, C0340l c0340l) throws IOException {
        m2117V(2);
        int iMo2045m = this.f1676a.mo2045m(this.f1676a.mo2038D());
        Object objM2113Q = aVar.f1763b;
        Object objM2113Q2 = aVar.f1765d;
        while (true) {
            try {
                int iMo1996o = mo1996o();
                if (iMo1996o == Integer.MAX_VALUE || this.f1676a.mo2043e()) {
                    break;
                }
                if (iMo1996o == 1) {
                    objM2113Q = m2113Q(aVar.f1762a, null, null);
                } else if (iMo1996o != 2) {
                    try {
                        if (!mo1999r()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!mo1999r()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM2113Q2 = m2113Q(aVar.f1764c, aVar.f1765d.getClass(), c0340l);
                }
            } catch (Throwable th) {
                this.f1676a.mo2044l(iMo2045m);
                throw th;
            }
        }
        map.put(objM2113Q, objM2113Q2);
        this.f1676a.mo2044l(iMo2045m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: K */
    public long mo1954K() throws IOException {
        m2117V(0);
        return this.f1676a.mo2058z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: L */
    public String mo1955L() throws IOException {
        m2117V(2);
        return this.f1676a.mo2035A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: M */
    public <T> void mo1956M(List<T> list, InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
        int iMo2037C;
        if (WireFormat.m1747b(this.f1677b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f1677b;
        do {
            list.add(m2114R(interfaceC0335i0, c0340l));
            if (this.f1676a.mo2043e() || this.f1679d != 0) {
                return;
            } else {
                iMo2037C = this.f1676a.mo2037C();
            }
        } while (iMo2037C == i);
        this.f1679d = iMo2037C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: N */
    public int mo1957N() throws IOException {
        m2117V(5);
        return this.f1676a.mo2055w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: O */
    public String mo1958O() throws IOException {
        m2117V(2);
        return this.f1676a.mo2036B();
    }

    /* JADX INFO: renamed from: T */
    public void m2120T(List<String> list, boolean z) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        if (WireFormat.m1747b(this.f1677b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof u9r) || z) {
            do {
                list.add(z ? mo1958O() : mo1955L());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C = this.f1676a.mo2037C();
                }
            } while (iMo2037C == this.f1677b);
            this.f1679d = iMo2037C;
            return;
        }
        u9r u9rVar = (u9r) list;
        do {
            u9rVar.mo2365t(mo1981g());
            if (this.f1676a.mo2043e()) {
                return;
            } else {
                iMo2037C2 = this.f1676a.mo2037C();
            }
        } while (iMo2037C2 == this.f1677b);
        this.f1679d = iMo2037C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: a */
    public void mo1969a(List<Long> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0355x;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2058z()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Long.valueOf(this.f1676a.mo2058z()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0355x c0355x = (C0355x) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0355x.m2383u(this.f1676a.mo2058z());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0355x.m2383u(this.f1676a.mo2058z());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: b */
    public long mo1971b() throws IOException {
        m2117V(1);
        return this.f1676a.mo2056x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: c */
    public int mo1973c() throws IOException {
        m2117V(0);
        return this.f1676a.mo2038D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: d */
    public int mo1975d() throws IOException {
        m2117V(0);
        return this.f1676a.mo2049q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: e */
    public int mo1977e() throws IOException {
        m2117V(0);
        return this.f1676a.mo2057y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: f */
    public void mo1979f(List<Boolean> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0328f;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f1676a.mo2046n()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Boolean.valueOf(this.f1676a.mo2046n()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0328f c0328f = (C0328f) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0328f.m2017h(this.f1676a.mo2046n());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0328f.m2017h(this.f1676a.mo2046n());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: g */
    public ByteString mo1981g() throws IOException {
        m2117V(2);
        return this.f1676a.mo2047o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    public int getTag() {
        return this.f1677b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: h */
    public <T> T mo1983h(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
        m2117V(3);
        return (T) m2114R(interfaceC0335i0, c0340l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: i */
    public void mo1985i(List<Integer> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0349r;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2057y()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2057y()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0349r c0349r = (C0349r) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0349r.m2331T(this.f1676a.mo2057y());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0349r.m2331T(this.f1676a.mo2057y());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: j */
    public long mo1987j() throws IOException {
        m2117V(0);
        return this.f1676a.mo2039E();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: k */
    public <T> T mo1989k(Class<T> cls, C0340l c0340l) throws IOException {
        m2117V(2);
        return (T) m2115S(cza0.m109400a().m109403d(cls), c0340l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: l */
    public void mo1991l(List<Long> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0355x;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 1) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2056x()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2038D = this.f1676a.mo2038D();
            m2119X(iMo2038D);
            int iMo2042d = this.f1676a.mo2042d() + iMo2038D;
            do {
                list.add(Long.valueOf(this.f1676a.mo2056x()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            return;
        }
        C0355x c0355x = (C0355x) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 1) {
            do {
                c0355x.m2383u(this.f1676a.mo2056x());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2038D2 = this.f1676a.mo2038D();
        m2119X(iMo2038D2);
        int iMo2042d2 = this.f1676a.mo2042d() + iMo2038D2;
        do {
            c0355x.m2383u(this.f1676a.mo2056x());
        } while (this.f1676a.mo2042d() < iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: m */
    public void mo1993m(List<Integer> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0349r;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2053u()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Integer.valueOf(this.f1676a.mo2053u()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0349r c0349r = (C0349r) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0349r.m2331T(this.f1676a.mo2053u());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0349r.m2331T(this.f1676a.mo2053u());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: n */
    public void mo1995n(List<Integer> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0349r;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 2) {
                int iMo2038D = this.f1676a.mo2038D();
                m2118W(iMo2038D);
                int iMo2042d = this.f1676a.mo2042d() + iMo2038D;
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2050r()));
                } while (this.f1676a.mo2042d() < iMo2042d);
                return;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f1676a.mo2050r()));
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C = this.f1676a.mo2037C();
                }
            } while (iMo2037C == this.f1677b);
            this.f1679d = iMo2037C;
            return;
        }
        C0349r c0349r = (C0349r) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 2) {
            int iMo2038D2 = this.f1676a.mo2038D();
            m2118W(iMo2038D2);
            int iMo2042d2 = this.f1676a.mo2042d() + iMo2038D2;
            do {
                c0349r.m2331T(this.f1676a.mo2050r());
            } while (this.f1676a.mo2042d() < iMo2042d2);
            return;
        }
        if (iM1747b2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0349r.m2331T(this.f1676a.mo2050r());
            if (this.f1676a.mo2043e()) {
                return;
            } else {
                iMo2037C2 = this.f1676a.mo2037C();
            }
        } while (iMo2037C2 == this.f1677b);
        this.f1679d = iMo2037C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: o */
    public int mo1996o() throws IOException {
        int i = this.f1679d;
        if (i != 0) {
            this.f1677b = i;
            this.f1679d = 0;
        } else {
            this.f1677b = this.f1676a.mo2037C();
        }
        int i2 = this.f1677b;
        return (i2 == 0 || i2 == this.f1678c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : WireFormat.m1746a(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: p */
    public void mo1997p(List<String> list) throws IOException {
        m2120T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: q */
    public void mo1998q(List<Float> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0348q;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 2) {
                int iMo2038D = this.f1676a.mo2038D();
                m2118W(iMo2038D);
                int iMo2042d = this.f1676a.mo2042d() + iMo2038D;
                do {
                    list.add(Float.valueOf(this.f1676a.mo2052t()));
                } while (this.f1676a.mo2042d() < iMo2042d);
                return;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f1676a.mo2052t()));
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C = this.f1676a.mo2037C();
                }
            } while (iMo2037C == this.f1677b);
            this.f1679d = iMo2037C;
            return;
        }
        C0348q c0348q = (C0348q) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 2) {
            int iMo2038D2 = this.f1676a.mo2038D();
            m2118W(iMo2038D2);
            int iMo2042d2 = this.f1676a.mo2042d() + iMo2038D2;
            do {
                c0348q.m2321M(this.f1676a.mo2052t());
            } while (this.f1676a.mo2042d() < iMo2042d2);
            return;
        }
        if (iM1747b2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0348q.m2321M(this.f1676a.mo2052t());
            if (this.f1676a.mo2043e()) {
                return;
            } else {
                iMo2037C2 = this.f1676a.mo2037C();
            }
        } while (iMo2037C2 == this.f1677b);
        this.f1679d = iMo2037C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: r */
    public boolean mo1999r() throws IOException {
        int i;
        if (this.f1676a.mo2043e() || (i = this.f1677b) == this.f1678c) {
            return false;
        }
        return this.f1676a.mo2040F(i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    public double readDouble() throws IOException {
        m2117V(1);
        return this.f1676a.mo2048p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    public float readFloat() throws IOException {
        m2117V(5);
        return this.f1676a.mo2052t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: s */
    public void mo2000s(List<ByteString> list) throws IOException {
        int iMo2037C;
        if (WireFormat.m1747b(this.f1677b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(mo1981g());
            if (this.f1676a.mo2043e()) {
                return;
            } else {
                iMo2037C = this.f1676a.mo2037C();
            }
        } while (iMo2037C == this.f1677b);
        this.f1679d = iMo2037C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: t */
    public void mo2001t(List<Double> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0336j;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 1) {
                do {
                    list.add(Double.valueOf(this.f1676a.mo2048p()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2038D = this.f1676a.mo2038D();
            m2119X(iMo2038D);
            int iMo2042d = this.f1676a.mo2042d() + iMo2038D;
            do {
                list.add(Double.valueOf(this.f1676a.mo2048p()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            return;
        }
        C0336j c0336j = (C0336j) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 1) {
            do {
                c0336j.m2132g(this.f1676a.mo2048p());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2038D2 = this.f1676a.mo2038D();
        m2119X(iMo2038D2);
        int iMo2042d2 = this.f1676a.mo2042d() + iMo2038D2;
        do {
            c0336j.m2132g(this.f1676a.mo2048p());
        } while (this.f1676a.mo2042d() < iMo2042d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: u */
    public long mo2002u() throws IOException {
        m2117V(0);
        return this.f1676a.mo2054v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: v */
    public <T> T mo2003v(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
        m2117V(2);
        return (T) m2115S(interfaceC0335i0, c0340l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: w */
    public long mo2004w() throws IOException {
        m2117V(1);
        return this.f1676a.mo2051s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: x */
    public void mo2005x(List<Integer> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0349r;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 2) {
                int iMo2038D = this.f1676a.mo2038D();
                m2118W(iMo2038D);
                int iMo2042d = this.f1676a.mo2042d() + iMo2038D;
                do {
                    list.add(Integer.valueOf(this.f1676a.mo2055w()));
                } while (this.f1676a.mo2042d() < iMo2042d);
                return;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f1676a.mo2055w()));
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C = this.f1676a.mo2037C();
                }
            } while (iMo2037C == this.f1677b);
            this.f1679d = iMo2037C;
            return;
        }
        C0349r c0349r = (C0349r) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 2) {
            int iMo2038D2 = this.f1676a.mo2038D();
            m2118W(iMo2038D2);
            int iMo2042d2 = this.f1676a.mo2042d() + iMo2038D2;
            do {
                c0349r.m2331T(this.f1676a.mo2055w());
            } while (this.f1676a.mo2042d() < iMo2042d2);
            return;
        }
        if (iM1747b2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0349r.m2331T(this.f1676a.mo2055w());
            if (this.f1676a.mo2043e()) {
                return;
            } else {
                iMo2037C2 = this.f1676a.mo2037C();
            }
        } while (iMo2037C2 == this.f1677b);
        this.f1679d = iMo2037C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: y */
    public boolean mo2006y() throws IOException {
        m2117V(0);
        return this.f1676a.mo2046n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
    /* JADX INFO: renamed from: z */
    public void mo2007z(List<Long> list) throws IOException {
        int iMo2037C;
        int iMo2037C2;
        boolean z = list instanceof C0355x;
        int i = this.f1677b;
        if (!z) {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                do {
                    list.add(Long.valueOf(this.f1676a.mo2039E()));
                    if (this.f1676a.mo2043e()) {
                        return;
                    } else {
                        iMo2037C = this.f1676a.mo2037C();
                    }
                } while (iMo2037C == this.f1677b);
                this.f1679d = iMo2037C;
                return;
            }
            if (iM1747b != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo2042d = this.f1676a.mo2042d() + this.f1676a.mo2038D();
            do {
                list.add(Long.valueOf(this.f1676a.mo2039E()));
            } while (this.f1676a.mo2042d() < iMo2042d);
            m2116U(iMo2042d);
            return;
        }
        C0355x c0355x = (C0355x) list;
        int iM1747b2 = WireFormat.m1747b(i);
        if (iM1747b2 == 0) {
            do {
                c0355x.m2383u(this.f1676a.mo2039E());
                if (this.f1676a.mo2043e()) {
                    return;
                } else {
                    iMo2037C2 = this.f1676a.mo2037C();
                }
            } while (iMo2037C2 == this.f1677b);
            this.f1679d = iMo2037C2;
            return;
        }
        if (iM1747b2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo2042d2 = this.f1676a.mo2042d() + this.f1676a.mo2038D();
        do {
            c0355x.m2383u(this.f1676a.mo2039E());
        } while (this.f1676a.mo2042d() < iMo2042d2);
        m2116U(iMo2042d2);
    }
}
