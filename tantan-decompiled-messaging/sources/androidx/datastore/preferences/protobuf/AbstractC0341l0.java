package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0341l0<T, B> {
    /* JADX INFO: renamed from: a */
    public abstract void mo2229a(B b, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo2230b(B b, int i, long j);

    /* JADX INFO: renamed from: c */
    public abstract void mo2231c(B b, int i, T t);

    /* JADX INFO: renamed from: d */
    public abstract void mo2232d(B b, int i, ByteString byteString);

    /* JADX INFO: renamed from: e */
    public abstract void mo2233e(B b, int i, long j);

    /* JADX INFO: renamed from: f */
    public abstract B mo2234f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract T mo2235g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo2236h(T t);

    /* JADX INFO: renamed from: i */
    public abstract int mo2237i(T t);

    /* JADX INFO: renamed from: j */
    public abstract void mo2238j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract T mo2239k(T t, T t2);

    /* JADX INFO: renamed from: l */
    public final void m2240l(B b, InterfaceC0333h0 interfaceC0333h0) throws IOException {
        while (interfaceC0333h0.mo1996o() != Integer.MAX_VALUE && m2241m(b, interfaceC0333h0)) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2241m(B b, InterfaceC0333h0 interfaceC0333h0) throws IOException {
        int tag = interfaceC0333h0.getTag();
        int iM1746a = WireFormat.m1746a(tag);
        int iM1747b = WireFormat.m1747b(tag);
        if (iM1747b == 0) {
            mo2233e(b, iM1746a, interfaceC0333h0.mo2002u());
            return true;
        }
        if (iM1747b == 1) {
            mo2230b(b, iM1746a, interfaceC0333h0.mo2004w());
            return true;
        }
        if (iM1747b == 2) {
            mo2232d(b, iM1746a, interfaceC0333h0.mo1981g());
            return true;
        }
        if (iM1747b != 3) {
            if (iM1747b == 4) {
                return false;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            mo2229a(b, iM1746a, interfaceC0333h0.mo1951H());
            return true;
        }
        B bMo2242n = mo2242n();
        int iM1748c = WireFormat.m1748c(iM1746a, 4);
        m2240l(bMo2242n, interfaceC0333h0);
        if (iM1748c != interfaceC0333h0.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        mo2231c(b, iM1746a, mo2246r(bMo2242n));
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract B mo2242n();

    /* JADX INFO: renamed from: o */
    public abstract void mo2243o(Object obj, B b);

    /* JADX INFO: renamed from: p */
    public abstract void mo2244p(Object obj, T t);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo2245q(InterfaceC0333h0 interfaceC0333h0);

    /* JADX INFO: renamed from: r */
    public abstract T mo2246r(B b);

    /* JADX INFO: renamed from: s */
    public abstract void mo2247s(T t, Writer writer) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo2248t(T t, Writer writer) throws IOException;
}
