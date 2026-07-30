package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C0346n0 extends AbstractC0342l0<C0344m0, C0344m0> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0344m0 mo2236g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo2237h(C0344m0 c0344m0) {
        return c0344m0.m2270f();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo2238i(C0344m0 c0344m0) {
        return c0344m0.m2271g();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0344m0 mo2240k(C0344m0 c0344m0, C0344m0 c0344m1) {
        return c0344m1.equals(C0344m0.m2262e()) ? c0344m0 : C0344m0.m2265k(c0344m0, c0344m1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0344m0 mo2243n() {
        return C0344m0.m2266l();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo2244o(Object obj, C0344m0 c0344m0) {
        mo2245p(obj, c0344m0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo2245p(Object obj, C0344m0 c0344m0) {
        ((GeneratedMessageLite) obj).unknownFields = c0344m0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C0344m0 mo2247r(C0344m0 c0344m0) {
        c0344m0.m2272j();
        return c0344m0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo2248s(C0344m0 c0344m0, Writer writer) throws IOException {
        c0344m0.m2275o(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo2249t(C0344m0 c0344m0, Writer writer) throws IOException {
        c0344m0.m2276q(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: j */
    public void mo2239j(Object obj) {
        mo2236g(obj).m2272j();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: q */
    public boolean mo2246q(InterfaceC0334h0 interfaceC0334h0) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo2230a(C0344m0 c0344m0, int i, int i2) {
        c0344m0.m2274n(WireFormat.m1749c(i, 5), Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo2231b(C0344m0 c0344m0, int i, long j) {
        c0344m0.m2274n(WireFormat.m1749c(i, 1), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo2232c(C0344m0 c0344m0, int i, C0344m0 c0344m1) {
        c0344m0.m2274n(WireFormat.m1749c(i, 3), c0344m1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo2233d(C0344m0 c0344m0, int i, ByteString byteString) {
        c0344m0.m2274n(WireFormat.m1749c(i, 2), byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo2234e(C0344m0 c0344m0, int i, long j) {
        c0344m0.m2274n(WireFormat.m1749c(i, 0), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342l0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C0344m0 mo2235f(Object obj) {
        C0344m0 c0344m0Mo2236g = mo2236g(obj);
        if (c0344m0Mo2236g != C0344m0.m2262e()) {
            return c0344m0Mo2236g;
        }
        C0344m0 c0344m0M2266l = C0344m0.m2266l();
        mo2245p(obj, c0344m0M2266l);
        return c0344m0M2266l;
    }
}
