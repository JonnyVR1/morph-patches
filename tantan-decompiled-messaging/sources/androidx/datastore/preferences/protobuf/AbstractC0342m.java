package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0347p.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342m<T extends C0347p.b<T>> {
    /* JADX INFO: renamed from: a */
    public abstract int mo2249a(Map.Entry<?, ?> entry);

    /* JADX INFO: renamed from: b */
    public abstract Object mo2250b(C0340l c0340l, InterfaceC0321b0 interfaceC0321b0, int i);

    /* JADX INFO: renamed from: c */
    public abstract C0347p<T> mo2251c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract C0347p<T> mo2252d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2253e(InterfaceC0321b0 interfaceC0321b0);

    /* JADX INFO: renamed from: f */
    public abstract void mo2254f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract <UT, UB> UB mo2255g(InterfaceC0333h0 interfaceC0333h0, Object obj, C0340l c0340l, C0347p<T> c0347p, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo2256h(InterfaceC0333h0 interfaceC0333h0, Object obj, C0340l c0340l, C0347p<T> c0347p) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo2257i(ByteString byteString, Object obj, C0340l c0340l, C0347p<T> c0347p) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo2258j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}
