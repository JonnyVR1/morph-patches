package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p149l.cza0;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0327e0<T> implements InterfaceC0335i0<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0321b0 f1634a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0341l0<?, ?> f1635b;

    /* JADX INFO: renamed from: c */
    public final boolean f1636c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0342m<?> f1637d;

    public C0327e0(AbstractC0341l0<?, ?> abstractC0341l0, AbstractC0342m<?> abstractC0342m, InterfaceC0321b0 interfaceC0321b0) {
        this.f1635b = abstractC0341l0;
        this.f1636c = abstractC0342m.mo2253e(interfaceC0321b0);
        this.f1637d = abstractC0342m;
        this.f1634a = interfaceC0321b0;
    }

    /* JADX INFO: renamed from: k */
    private <UT, UB> int m2008k(AbstractC0341l0<UT, UB> abstractC0341l0, T t) {
        return abstractC0341l0.mo2237i(abstractC0341l0.mo2235g(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private <UT, UB, ET extends C0347p.b<ET>> void m2009l(AbstractC0341l0<UT, UB> abstractC0341l0, AbstractC0342m<ET> abstractC0342m, T t, InterfaceC0333h0 interfaceC0333h0, C0340l c0340l) throws Throwable {
        AbstractC0341l0<UT, UB> abstractC0341l1;
        UB ubMo2234f = abstractC0341l0.mo2234f(t);
        Object objMo2252d = abstractC0342m.mo2252d(t);
        while (interfaceC0333h0.mo1996o() != Integer.MAX_VALUE) {
            try {
                C0327e0 c0327e0 = this;
                abstractC0341l1 = abstractC0341l0;
                AbstractC0342m<ET> abstractC0342m2 = abstractC0342m;
                InterfaceC0333h0 interfaceC0333h1 = interfaceC0333h0;
                C0340l c0340l2 = c0340l;
                try {
                    if (!c0327e0.m2011n(interfaceC0333h1, c0340l2, abstractC0342m2, objMo2252d, abstractC0341l1, ubMo2234f)) {
                        abstractC0341l1.mo2243o(t, ubMo2234f);
                        return;
                    }
                    this = (C0327e0<T>) c0327e0;
                    interfaceC0333h0 = interfaceC0333h1;
                    c0340l = c0340l2;
                    abstractC0342m = abstractC0342m2;
                    abstractC0341l0 = abstractC0341l1;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    abstractC0341l1.mo2243o(t, ubMo2234f);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                abstractC0341l1 = abstractC0341l0;
            }
        }
        abstractC0341l0.mo2243o(t, ubMo2234f);
    }

    /* JADX INFO: renamed from: m */
    public static <T> C0327e0<T> m2010m(AbstractC0341l0<?, ?> abstractC0341l0, AbstractC0342m<?> abstractC0342m, InterfaceC0321b0 interfaceC0321b0) {
        return new C0327e0<>(abstractC0341l0, abstractC0342m, interfaceC0321b0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: a */
    public void mo1899a(T t, T t2) {
        C0337j0.m2146G(this.f1635b, t, t2);
        if (this.f1636c) {
            C0337j0.m2144E(this.f1637d, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: b */
    public final boolean mo1900b(T t) {
        return this.f1637d.mo2251c(t).m2312p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: c */
    public void mo1902c(T t, Writer writer) throws IOException {
        Iterator itM2313s = this.f1637d.mo2251c(t).m2313s();
        while (itM2313s.hasNext()) {
            Map.Entry entry = (Map.Entry) itM2313s.next();
            C0347p.b bVar = (C0347p.b) entry.getKey();
            if (bVar.mo1663E() != WireFormat.JavaType.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                qkq0.m175383a("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof C0351t.b) {
                writer.mo1765b(bVar.getNumber(), ((C0351t.b) entry).m2350a().m2356e());
            } else {
                writer.mo1765b(bVar.getNumber(), entry.getValue());
            }
        }
        m2012o(this.f1635b, t, writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: d */
    public boolean mo1904d(T t, T t2) {
        if (!this.f1635b.mo2235g(t).equals(this.f1635b.mo2235g(t2))) {
            return false;
        }
        if (this.f1636c) {
            return this.f1637d.mo2251c(t).equals(this.f1637d.mo2251c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: e */
    public void mo1906e(T t, InterfaceC0333h0 interfaceC0333h0, C0340l c0340l) throws Throwable {
        m2009l(this.f1635b, this.f1637d, t, interfaceC0333h0, c0340l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: f */
    public void mo1908f(T t) {
        this.f1635b.mo2238j(t);
        this.f1637d.mo2254f(t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: g */
    public int mo1910g(T t) {
        int iM2008k = m2008k(this.f1635b, t);
        return this.f1636c ? iM2008k + this.f1637d.mo2251c(t).m2307j() : iM2008k;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: h */
    public T mo1912h() {
        return (T) this.f1634a.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: i */
    public int mo1914i(T t) {
        int iHashCode = this.f1635b.mo2235g(t).hashCode();
        return this.f1636c ? (iHashCode * 53) + this.f1637d.mo2251c(t).hashCode() : iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: j */
    public void mo1916j(T t, byte[] bArr, int i, int i2, C0324d.b bVar) throws IOException {
        int iM1834I;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        C0343m0 c0343m0M2265l = generatedMessageLite.unknownFields;
        if (c0343m0M2265l == C0343m0.m2261e()) {
            c0343m0M2265l = C0343m0.m2265l();
            generatedMessageLite.unknownFields = c0343m0M2265l;
        }
        C0343m0 c0343m0 = c0343m0M2265l;
        C0347p<GeneratedMessageLite.C0295d> c0347pM1661C = ((GeneratedMessageLite.AbstractC0294c) t).m1661C();
        GeneratedMessageLite.C0296e c0296e = null;
        while (i < i2) {
            int iM1834I2 = C0324d.m1834I(bArr, i, bVar);
            int i3 = bVar.f1602a;
            if (i3 == WireFormat.f1595a) {
                int i4 = i2;
                C0324d.b bVar2 = bVar;
                int i5 = 0;
                ByteString byteString = null;
                while (true) {
                    if (iM1834I2 >= i4) {
                        iM1834I = iM1834I2;
                        break;
                    }
                    iM1834I = C0324d.m1834I(bArr, iM1834I2, bVar2);
                    int i6 = bVar2.f1602a;
                    int iM1746a = WireFormat.m1746a(i6);
                    int iM1747b = WireFormat.m1747b(i6);
                    if (iM1746a != 2) {
                        if (iM1746a == 3) {
                            if (c0296e != null) {
                                iM1834I2 = C0324d.m1855p(cza0.m109400a().m109403d(c0296e.m1668b().getClass()), bArr, iM1834I, i4, bVar2);
                                c0347pM1661C.m2317x(c0296e.f1578b, bVar2.f1604c);
                            } else if (iM1747b == 2) {
                                iM1834I2 = C0324d.m1841b(bArr, iM1834I, bVar2);
                                byteString = (ByteString) bVar2.f1604c;
                            }
                        }
                        if (i6 == WireFormat.f1596b) {
                            break;
                        } else {
                            iM1834I2 = C0324d.m1839N(i6, bArr, iM1834I, i4, bVar2);
                        }
                    } else if (iM1747b == 0) {
                        iM1834I2 = C0324d.m1834I(bArr, iM1834I, bVar2);
                        i5 = bVar2.f1602a;
                        c0296e = (GeneratedMessageLite.C0296e) this.f1637d.mo2250b(bVar2.f1605d, this.f1634a, i5);
                    } else {
                        if (i6 == WireFormat.f1596b) {
                            break;
                            break;
                        }
                        iM1834I2 = C0324d.m1839N(i6, bArr, iM1834I, i4, bVar2);
                    }
                }
                if (byteString != null) {
                    c0343m0.m2273n(WireFormat.m1748c(i5, 2), byteString);
                }
                i = iM1834I;
                i2 = i4;
                bVar = bVar2;
            } else if (WireFormat.m1747b(i3) == 2) {
                c0296e = (GeneratedMessageLite.C0296e) this.f1637d.mo2250b(bVar.f1605d, this.f1634a, WireFormat.m1746a(i3));
                if (c0296e != null) {
                    i = C0324d.m1855p(cza0.m109400a().m109403d(c0296e.m1668b().getClass()), bArr, iM1834I2, i2, bVar);
                    c0347pM1661C.m2317x(c0296e.f1578b, bVar.f1604c);
                } else {
                    i = C0324d.m1832G(i3, bArr, iM1834I2, i2, c0343m0, bVar);
                }
            } else {
                i = C0324d.m1839N(i3, bArr, iM1834I2, i2, bVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final <UT, UB, ET extends C0347p.b<ET>> boolean m2011n(InterfaceC0333h0 interfaceC0333h0, C0340l c0340l, AbstractC0342m<ET> abstractC0342m, C0347p<ET> c0347p, AbstractC0341l0<UT, UB> abstractC0341l0, UB ub) throws IOException {
        int tag = interfaceC0333h0.getTag();
        if (tag != WireFormat.f1595a) {
            if (WireFormat.m1747b(tag) != 2) {
                return interfaceC0333h0.mo1999r();
            }
            Object objMo2250b = abstractC0342m.mo2250b(c0340l, this.f1634a, WireFormat.m1746a(tag));
            if (objMo2250b == null) {
                return abstractC0341l0.m2241m(ub, interfaceC0333h0);
            }
            abstractC0342m.mo2256h(interfaceC0333h0, objMo2250b, c0340l, c0347p);
            return true;
        }
        Object objMo2250b2 = null;
        int iMo1973c = 0;
        ByteString byteStringMo1981g = null;
        while (interfaceC0333h0.mo1996o() != Integer.MAX_VALUE) {
            int tag2 = interfaceC0333h0.getTag();
            if (tag2 == WireFormat.f1597c) {
                iMo1973c = interfaceC0333h0.mo1973c();
                objMo2250b2 = abstractC0342m.mo2250b(c0340l, this.f1634a, iMo1973c);
            } else if (tag2 == WireFormat.f1598d) {
                if (objMo2250b2 != null) {
                    abstractC0342m.mo2256h(interfaceC0333h0, objMo2250b2, c0340l, c0347p);
                } else {
                    byteStringMo1981g = interfaceC0333h0.mo1981g();
                }
            } else if (!interfaceC0333h0.mo1999r()) {
                break;
            }
        }
        if (interfaceC0333h0.getTag() != WireFormat.f1596b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringMo1981g != null) {
            if (objMo2250b2 != null) {
                abstractC0342m.mo2257i(byteStringMo1981g, objMo2250b2, c0340l, c0347p);
            } else {
                abstractC0341l0.mo2232d(ub, iMo1973c, byteStringMo1981g);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final <UT, UB> void m2012o(AbstractC0341l0<UT, UB> abstractC0341l0, T t, Writer writer) throws IOException {
        abstractC0341l0.mo2247s(abstractC0341l0.mo2235g(t), writer);
    }
}
