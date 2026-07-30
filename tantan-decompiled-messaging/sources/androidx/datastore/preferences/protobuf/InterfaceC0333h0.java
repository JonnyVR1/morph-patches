package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0333h0 {
    /* JADX INFO: renamed from: A */
    void mo1944A(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: B */
    void mo1945B(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: C */
    void mo1946C(List<String> list) throws IOException;

    /* JADX INFO: renamed from: D */
    int mo1947D() throws IOException;

    /* JADX INFO: renamed from: E */
    <T> void mo1948E(List<T> list, InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: F */
    void mo1949F(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: G */
    void mo1950G(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: H */
    int mo1951H() throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: I */
    <T> T mo1952I(Class<T> cls, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: J */
    <K, V> void mo1953J(Map<K, V> map, C0356y.a<K, V> aVar, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: K */
    long mo1954K() throws IOException;

    /* JADX INFO: renamed from: L */
    String mo1955L() throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: M */
    <T> void mo1956M(List<T> list, InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: N */
    int mo1957N() throws IOException;

    /* JADX INFO: renamed from: O */
    String mo1958O() throws IOException;

    /* JADX INFO: renamed from: a */
    void mo1969a(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: b */
    long mo1971b() throws IOException;

    /* JADX INFO: renamed from: c */
    int mo1973c() throws IOException;

    /* JADX INFO: renamed from: d */
    int mo1975d() throws IOException;

    /* JADX INFO: renamed from: e */
    int mo1977e() throws IOException;

    /* JADX INFO: renamed from: f */
    void mo1979f(List<Boolean> list) throws IOException;

    /* JADX INFO: renamed from: g */
    ByteString mo1981g() throws IOException;

    int getTag();

    @Deprecated
    /* JADX INFO: renamed from: h */
    <T> T mo1983h(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: i */
    void mo1985i(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: j */
    long mo1987j() throws IOException;

    /* JADX INFO: renamed from: k */
    <T> T mo1989k(Class<T> cls, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: l */
    void mo1991l(List<Long> list) throws IOException;

    /* JADX INFO: renamed from: m */
    void mo1993m(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: n */
    void mo1995n(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: o */
    int mo1996o() throws IOException;

    /* JADX INFO: renamed from: p */
    void mo1997p(List<String> list) throws IOException;

    /* JADX INFO: renamed from: q */
    void mo1998q(List<Float> list) throws IOException;

    /* JADX INFO: renamed from: r */
    boolean mo1999r() throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    /* JADX INFO: renamed from: s */
    void mo2000s(List<ByteString> list) throws IOException;

    /* JADX INFO: renamed from: t */
    void mo2001t(List<Double> list) throws IOException;

    /* JADX INFO: renamed from: u */
    long mo2002u() throws IOException;

    /* JADX INFO: renamed from: v */
    <T> T mo2003v(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException;

    /* JADX INFO: renamed from: w */
    long mo2004w() throws IOException;

    /* JADX INFO: renamed from: x */
    void mo2005x(List<Integer> list) throws IOException;

    /* JADX INFO: renamed from: y */
    boolean mo2006y() throws IOException;

    /* JADX INFO: renamed from: z */
    void mo2007z(List<Long> list) throws IOException;
}
