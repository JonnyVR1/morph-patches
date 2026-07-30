package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0334h0 {
    /* JADX INFO: renamed from: A */
    void mo1945A(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: B */
    void mo1946B(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: C */
    void mo1947C(List<String> list) throws IOException;

    /* JADX INFO: renamed from: D */
    int mo1948D() throws IOException;

    /* JADX INFO: renamed from: E */
    <T> void mo1949E(List<T> list, InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: F */
    void mo1950F(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: G */
    void mo1951G(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: H */
    int mo1952H() throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: I */
    <T> T mo1953I(Class<T> cls, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: J */
    <K, V> void mo1954J(Map<K, V> map, C0357y.a<K, V> aVar, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: K */
    long mo1955K() throws IOException;

    /* JADX INFO: renamed from: L */
    String mo1956L() throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: M */
    <T> void mo1957M(List<T> list, InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: N */
    int mo1958N() throws IOException;

    /* JADX INFO: renamed from: O */
    String mo1959O() throws IOException;

    /* JADX INFO: renamed from: a */
    void mo1970a(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: b */
    long mo1972b() throws IOException;

    /* JADX INFO: renamed from: c */
    int mo1974c() throws IOException;

    /* JADX INFO: renamed from: d */
    int mo1976d() throws IOException;

    /* JADX INFO: renamed from: e */
    int mo1978e() throws IOException;

    /* JADX INFO: renamed from: f */
    void mo1980f(List<Boolean> list) throws IOException;

    /* JADX INFO: renamed from: g */
    ByteString mo1982g() throws IOException;

    int getTag();

    @Deprecated
    /* JADX INFO: renamed from: h */
    <T> T mo1984h(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: i */
    void mo1986i(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: j */
    long mo1988j() throws IOException;

    /* JADX INFO: renamed from: k */
    <T> T mo1990k(Class<T> cls, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: l */
    void mo1992l(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: m */
    void mo1994m(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: n */
    void mo1996n(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: o */
    int mo1997o() throws IOException;

    /* JADX INFO: renamed from: p */
    void mo1998p(List<String> list) throws IOException;

    /* JADX INFO: renamed from: q */
    void mo1999q(List<Float> list) throws IOException;

    /* JADX INFO: renamed from: r */
    boolean mo2000r() throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    /* JADX INFO: renamed from: s */
    void mo2001s(List<ByteString> list) throws IOException;

    /* JADX INFO: renamed from: t */
    void mo2002t(List<Double> list) throws IOException;

    /* JADX INFO: renamed from: u */
    long mo2003u() throws IOException;

    /* JADX INFO: renamed from: v */
    <T> T mo2004v(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException;

    /* JADX INFO: renamed from: w */
    long mo2005w() throws IOException;

    /* JADX INFO: renamed from: x */
    void mo2006x(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: y */
    boolean mo2007y() throws IOException;

    /* JADX INFO: renamed from: z */
    void mo2008z(List<Long> list) throws IOException;
}
