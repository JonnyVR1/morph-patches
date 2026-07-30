package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342l0<T, B> {
    /* JADX INFO: renamed from: a */
    public abstract void mo2230a(B b, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo2231b(B b, int i, long j);

    /* JADX INFO: renamed from: c */
    public abstract void mo2232c(B b, int i, T t);

    /* JADX INFO: renamed from: d */
    public abstract void mo2233d(B b, int i, ByteString byteString);

    /* JADX INFO: renamed from: e */
    public abstract void mo2234e(B b, int i, long j);

    /* JADX INFO: renamed from: f */
    public abstract B mo2235f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract T mo2236g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo2237h(T t);

    /* JADX INFO: renamed from: i */
    public abstract int mo2238i(T t);

    /* JADX INFO: renamed from: j */
    public abstract void mo2239j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract T mo2240k(T t, T t2);

    /* JADX INFO: renamed from: l */
    public final void m2241l(B b, InterfaceC0334h0 interfaceC0334h0) throws IOException {
        while (interfaceC0334h0.mo1997o() != Integer.MAX_VALUE && m2242m(b, interfaceC0334h0)) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2242m(B b, InterfaceC0334h0 interfaceC0334h0) throws IOException {
        int tag = interfaceC0334h0.getTag();
        int iM1747a = WireFormat.m1747a(tag);
        int iM1748b = WireFormat.m1748b(tag);
        if (iM1748b == 0) {
            mo2234e(b, iM1747a, interfaceC0334h0.mo2003u());
            return true;
        }
        if (iM1748b == 1) {
            mo2231b(b, iM1747a, interfaceC0334h0.mo2005w());
            return true;
        }
        if (iM1748b == 2) {
            mo2233d(b, iM1747a, interfaceC0334h0.mo1982g());
            return true;
        }
        if (iM1748b != 3) {
            if (iM1748b == 4) {
                return false;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            mo2230a(b, iM1747a, interfaceC0334h0.mo1952H());
            return true;
        }
        B bMo2243n = mo2243n();
        int iM1749c = WireFormat.m1749c(iM1747a, 4);
        m2241l(bMo2243n, interfaceC0334h0);
        if (iM1749c != interfaceC0334h0.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        mo2232c(b, iM1747a, mo2247r(bMo2243n));
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract B mo2243n();

    /* JADX INFO: renamed from: o */
    public abstract void mo2244o(Object obj, B b);

    /* JADX INFO: renamed from: p */
    public abstract void mo2245p(Object obj, T t);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo2246q(InterfaceC0334h0 interfaceC0334h0);

    /* JADX INFO: renamed from: r */
    public abstract T mo2247r(B b);

    /* JADX INFO: renamed from: s */
    public abstract void mo2248s(T t, Writer writer) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo2249t(T t, Writer writer) throws IOException;
}
