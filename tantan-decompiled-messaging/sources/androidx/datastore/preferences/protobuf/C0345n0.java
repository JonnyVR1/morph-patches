package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C0345n0 extends AbstractC0341l0<C0343m0, C0343m0> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0343m0 mo2235g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo2236h(C0343m0 c0343m0) {
        return c0343m0.m2269f();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo2237i(C0343m0 c0343m0) {
        return c0343m0.m2270g();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0343m0 mo2239k(C0343m0 c0343m0, C0343m0 c0343m1) {
        return c0343m1.equals(C0343m0.m2261e()) ? c0343m0 : C0343m0.m2264k(c0343m0, c0343m1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0343m0 mo2242n() {
        return C0343m0.m2265l();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo2243o(Object obj, C0343m0 c0343m0) {
        mo2244p(obj, c0343m0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo2244p(Object obj, C0343m0 c0343m0) {
        ((GeneratedMessageLite) obj).unknownFields = c0343m0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C0343m0 mo2246r(C0343m0 c0343m0) {
        c0343m0.m2271j();
        return c0343m0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo2247s(C0343m0 c0343m0, Writer writer) throws IOException {
        c0343m0.m2274o(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo2248t(C0343m0 c0343m0, Writer writer) throws IOException {
        c0343m0.m2275q(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: j */
    public void mo2238j(Object obj) {
        mo2235g(obj).m2271j();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: q */
    public boolean mo2245q(InterfaceC0333h0 interfaceC0333h0) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo2229a(C0343m0 c0343m0, int i, int i2) {
        c0343m0.m2273n(WireFormat.m1748c(i, 5), Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo2230b(C0343m0 c0343m0, int i, long j) {
        c0343m0.m2273n(WireFormat.m1748c(i, 1), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo2231c(C0343m0 c0343m0, int i, C0343m0 c0343m1) {
        c0343m0.m2273n(WireFormat.m1748c(i, 3), c0343m1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo2232d(C0343m0 c0343m0, int i, ByteString byteString) {
        c0343m0.m2273n(WireFormat.m1748c(i, 2), byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo2233e(C0343m0 c0343m0, int i, long j) {
        c0343m0.m2273n(WireFormat.m1748c(i, 0), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0341l0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C0343m0 mo2234f(Object obj) {
        C0343m0 c0343m0Mo2235g = mo2235g(obj);
        if (c0343m0Mo2235g != C0343m0.m2261e()) {
            return c0343m0Mo2235g;
        }
        C0343m0 c0343m0M2265l = C0343m0.m2265l();
        mo2244p(obj, c0343m0M2265l);
        return c0343m0M2265l;
    }
}
