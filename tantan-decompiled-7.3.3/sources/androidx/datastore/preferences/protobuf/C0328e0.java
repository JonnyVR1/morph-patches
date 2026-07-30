package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p153l.g7b0;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0328e0<T> implements InterfaceC0336i0<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0322b0 f1634a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0342l0<?, ?> f1635b;

    /* JADX INFO: renamed from: c */
    public final boolean f1636c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0343m<?> f1637d;

    public C0328e0(AbstractC0342l0<?, ?> abstractC0342l0, AbstractC0343m<?> abstractC0343m, InterfaceC0322b0 interfaceC0322b0) {
        this.f1635b = abstractC0342l0;
        this.f1636c = abstractC0343m.mo2254e(interfaceC0322b0);
        this.f1637d = abstractC0343m;
        this.f1634a = interfaceC0322b0;
    }

    /* JADX INFO: renamed from: k */
    private <UT, UB> int m2009k(AbstractC0342l0<UT, UB> abstractC0342l0, T t) {
        return abstractC0342l0.mo2238i(abstractC0342l0.mo2236g(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private <UT, UB, ET extends C0348p.b<ET>> void m2010l(AbstractC0342l0<UT, UB> abstractC0342l0, AbstractC0343m<ET> abstractC0343m, T t, InterfaceC0334h0 interfaceC0334h0, C0341l c0341l) throws Throwable {
        AbstractC0342l0<UT, UB> abstractC0342l1;
        UB ubMo2235f = abstractC0342l0.mo2235f(t);
        Object objMo2253d = abstractC0343m.mo2253d(t);
        while (interfaceC0334h0.mo1997o() != Integer.MAX_VALUE) {
            try {
                C0328e0 c0328e0 = this;
                abstractC0342l1 = abstractC0342l0;
                AbstractC0343m<ET> abstractC0343m2 = abstractC0343m;
                InterfaceC0334h0 interfaceC0334h1 = interfaceC0334h0;
                C0341l c0341l2 = c0341l;
                try {
                    if (!c0328e0.m2012n(interfaceC0334h1, c0341l2, abstractC0343m2, objMo2253d, abstractC0342l1, ubMo2235f)) {
                        abstractC0342l1.mo2244o(t, ubMo2235f);
                        return;
                    }
                    this = (C0328e0<T>) c0328e0;
                    interfaceC0334h0 = interfaceC0334h1;
                    c0341l = c0341l2;
                    abstractC0343m = abstractC0343m2;
                    abstractC0342l0 = abstractC0342l1;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    abstractC0342l1.mo2244o(t, ubMo2235f);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                abstractC0342l1 = abstractC0342l0;
            }
        }
        abstractC0342l0.mo2244o(t, ubMo2235f);
    }

    /* JADX INFO: renamed from: m */
    public static <T> C0328e0<T> m2011m(AbstractC0342l0<?, ?> abstractC0342l0, AbstractC0343m<?> abstractC0343m, InterfaceC0322b0 interfaceC0322b0) {
        return new C0328e0<>(abstractC0342l0, abstractC0343m, interfaceC0322b0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: a */
    public void mo1900a(T t, T t2) {
        C0338j0.m2147G(this.f1635b, t, t2);
        if (this.f1636c) {
            C0338j0.m2145E(this.f1637d, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: b */
    public final boolean mo1901b(T t) {
        return this.f1637d.mo2252c(t).m2313p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: c */
    public void mo1903c(T t, Writer writer) throws IOException {
        Iterator itM2314s = this.f1637d.mo2252c(t).m2314s();
        while (itM2314s.hasNext()) {
            Map.Entry entry = (Map.Entry) itM2314s.next();
            C0348p.b bVar = (C0348p.b) entry.getKey();
            if (bVar.mo1664E() != WireFormat.JavaType.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                wtq0.m207906a("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof C0352t.b) {
                writer.mo1766b(bVar.getNumber(), ((C0352t.b) entry).m2351a().m2357e());
            } else {
                writer.mo1766b(bVar.getNumber(), entry.getValue());
            }
        }
        m2013o(this.f1635b, t, writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: d */
    public boolean mo1905d(T t, T t2) {
        if (!this.f1635b.mo2236g(t).equals(this.f1635b.mo2236g(t2))) {
            return false;
        }
        if (this.f1636c) {
            return this.f1637d.mo2252c(t).equals(this.f1637d.mo2252c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: e */
    public void mo1907e(T t, InterfaceC0334h0 interfaceC0334h0, C0341l c0341l) throws Throwable {
        m2010l(this.f1635b, this.f1637d, t, interfaceC0334h0, c0341l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: f */
    public void mo1909f(T t) {
        this.f1635b.mo2239j(t);
        this.f1637d.mo2255f(t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: g */
    public int mo1911g(T t) {
        int iM2009k = m2009k(this.f1635b, t);
        return this.f1636c ? iM2009k + this.f1637d.mo2252c(t).m2308j() : iM2009k;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: h */
    public T mo1913h() {
        return (T) this.f1634a.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: i */
    public int mo1915i(T t) {
        int iHashCode = this.f1635b.mo2236g(t).hashCode();
        return this.f1636c ? (iHashCode * 53) + this.f1637d.mo2252c(t).hashCode() : iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: j */
    public void mo1917j(T t, byte[] bArr, int i, int i2, C0325d.b bVar) throws IOException {
        int iM1835I;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        C0344m0 c0344m0M2266l = generatedMessageLite.unknownFields;
        if (c0344m0M2266l == C0344m0.m2262e()) {
            c0344m0M2266l = C0344m0.m2266l();
            generatedMessageLite.unknownFields = c0344m0M2266l;
        }
        C0344m0 c0344m0 = c0344m0M2266l;
        C0348p<GeneratedMessageLite.C0296d> c0348pM1662C = ((GeneratedMessageLite.AbstractC0295c) t).m1662C();
        GeneratedMessageLite.C0297e c0297e = null;
        while (i < i2) {
            int iM1835I2 = C0325d.m1835I(bArr, i, bVar);
            int i3 = bVar.f1602a;
            if (i3 == WireFormat.f1595a) {
                int i4 = i2;
                C0325d.b bVar2 = bVar;
                int i5 = 0;
                ByteString byteString = null;
                while (true) {
                    if (iM1835I2 >= i4) {
                        iM1835I = iM1835I2;
                        break;
                    }
                    iM1835I = C0325d.m1835I(bArr, iM1835I2, bVar2);
                    int i6 = bVar2.f1602a;
                    int iM1747a = WireFormat.m1747a(i6);
                    int iM1748b = WireFormat.m1748b(i6);
                    if (iM1747a != 2) {
                        if (iM1747a == 3) {
                            if (c0297e != null) {
                                iM1835I2 = C0325d.m1856p(g7b0.m129308a().m129311d(c0297e.m1669b().getClass()), bArr, iM1835I, i4, bVar2);
                                c0348pM1662C.m2318x(c0297e.f1578b, bVar2.f1604c);
                            } else if (iM1748b == 2) {
                                iM1835I2 = C0325d.m1842b(bArr, iM1835I, bVar2);
                                byteString = (ByteString) bVar2.f1604c;
                            }
                        }
                        if (i6 == WireFormat.f1596b) {
                            break;
                        } else {
                            iM1835I2 = C0325d.m1840N(i6, bArr, iM1835I, i4, bVar2);
                        }
                    } else if (iM1748b == 0) {
                        iM1835I2 = C0325d.m1835I(bArr, iM1835I, bVar2);
                        i5 = bVar2.f1602a;
                        c0297e = (GeneratedMessageLite.C0297e) this.f1637d.mo2251b(bVar2.f1605d, this.f1634a, i5);
                    } else {
                        if (i6 == WireFormat.f1596b) {
                            break;
                            break;
                        }
                        iM1835I2 = C0325d.m1840N(i6, bArr, iM1835I, i4, bVar2);
                    }
                }
                if (byteString != null) {
                    c0344m0.m2274n(WireFormat.m1749c(i5, 2), byteString);
                }
                i = iM1835I;
                i2 = i4;
                bVar = bVar2;
            } else if (WireFormat.m1748b(i3) == 2) {
                c0297e = (GeneratedMessageLite.C0297e) this.f1637d.mo2251b(bVar.f1605d, this.f1634a, WireFormat.m1747a(i3));
                if (c0297e != null) {
                    i = C0325d.m1856p(g7b0.m129308a().m129311d(c0297e.m1669b().getClass()), bArr, iM1835I2, i2, bVar);
                    c0348pM1662C.m2318x(c0297e.f1578b, bVar.f1604c);
                } else {
                    i = C0325d.m1833G(i3, bArr, iM1835I2, i2, c0344m0, bVar);
                }
            } else {
                i = C0325d.m1840N(i3, bArr, iM1835I2, i2, bVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final <UT, UB, ET extends C0348p.b<ET>> boolean m2012n(InterfaceC0334h0 interfaceC0334h0, C0341l c0341l, AbstractC0343m<ET> abstractC0343m, C0348p<ET> c0348p, AbstractC0342l0<UT, UB> abstractC0342l0, UB ub) throws IOException {
        int tag = interfaceC0334h0.getTag();
        if (tag != WireFormat.f1595a) {
            if (WireFormat.m1748b(tag) != 2) {
                return interfaceC0334h0.mo2000r();
            }
            Object objMo2251b = abstractC0343m.mo2251b(c0341l, this.f1634a, WireFormat.m1747a(tag));
            if (objMo2251b == null) {
                return abstractC0342l0.m2242m(ub, interfaceC0334h0);
            }
            abstractC0343m.mo2257h(interfaceC0334h0, objMo2251b, c0341l, c0348p);
            return true;
        }
        Object objMo2251b2 = null;
        int iMo1974c = 0;
        ByteString byteStringMo1982g = null;
        while (interfaceC0334h0.mo1997o() != Integer.MAX_VALUE) {
            int tag2 = interfaceC0334h0.getTag();
            if (tag2 == WireFormat.f1597c) {
                iMo1974c = interfaceC0334h0.mo1974c();
                objMo2251b2 = abstractC0343m.mo2251b(c0341l, this.f1634a, iMo1974c);
            } else if (tag2 == WireFormat.f1598d) {
                if (objMo2251b2 != null) {
                    abstractC0343m.mo2257h(interfaceC0334h0, objMo2251b2, c0341l, c0348p);
                } else {
                    byteStringMo1982g = interfaceC0334h0.mo1982g();
                }
            } else if (!interfaceC0334h0.mo2000r()) {
                break;
            }
        }
        if (interfaceC0334h0.getTag() != WireFormat.f1596b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringMo1982g != null) {
            if (objMo2251b2 != null) {
                abstractC0343m.mo2258i(byteStringMo1982g, objMo2251b2, c0341l, c0348p);
            } else {
                abstractC0342l0.mo2233d(ub, iMo1974c, byteStringMo1982g);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final <UT, UB> void m2013o(AbstractC0342l0<UT, UB> abstractC0342l0, T t, Writer writer) throws IOException {
        abstractC0342l0.mo2248s(abstractC0342l0.mo2236g(t), writer);
    }
}
