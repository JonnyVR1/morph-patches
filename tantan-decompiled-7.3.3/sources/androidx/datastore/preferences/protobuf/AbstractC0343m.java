package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0348p.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0343m<T extends C0348p.b<T>> {
    /* JADX INFO: renamed from: a */
    public abstract int mo2250a(Map.Entry<?, ?> entry);

    /* JADX INFO: renamed from: b */
    public abstract Object mo2251b(C0341l c0341l, InterfaceC0322b0 interfaceC0322b0, int i);

    /* JADX INFO: renamed from: c */
    public abstract C0348p<T> mo2252c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract C0348p<T> mo2253d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2254e(InterfaceC0322b0 interfaceC0322b0);

    /* JADX INFO: renamed from: f */
    public abstract void mo2255f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract <UT, UB> UB mo2256g(InterfaceC0334h0 interfaceC0334h0, Object obj, C0341l c0341l, C0348p<T> c0348p, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo2257h(InterfaceC0334h0 interfaceC0334h0, Object obj, C0341l c0341l, C0348p<T> c0348p) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo2258i(ByteString byteString, Object obj, C0341l c0341l, C0348p<T> c0348p) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo2259j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}
