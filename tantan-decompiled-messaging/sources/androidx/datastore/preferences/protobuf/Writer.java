package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* JADX INFO: renamed from: A */
    void mo1749A(int i, long j) throws IOException;

    /* JADX INFO: renamed from: B */
    void mo1750B(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: C */
    void mo1751C(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: D */
    void mo1752D(int i, Object obj, InterfaceC0335i0 interfaceC0335i0) throws IOException;

    /* JADX INFO: renamed from: E */
    void mo1753E(int i, double d) throws IOException;

    /* JADX INFO: renamed from: F */
    void mo1754F(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: G */
    FieldOrder mo1755G();

    /* JADX INFO: renamed from: H */
    void mo1756H(int i, List<?> list, InterfaceC0335i0 interfaceC0335i0) throws IOException;

    /* JADX INFO: renamed from: I */
    void mo1757I(int i, long j) throws IOException;

    /* JADX INFO: renamed from: J */
    void mo1758J(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: K */
    void mo1759K(int i, List<Boolean> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: L */
    void mo1760L(int i, float f) throws IOException;

    /* JADX INFO: renamed from: M */
    void mo1761M(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: N */
    void mo1762N(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: O */
    void mo1763O(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: a */
    void mo1764a(int i, List<Float> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: b */
    void mo1765b(int i, Object obj) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo1766c(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo1767d(int i, String str) throws IOException;

    /* JADX INFO: renamed from: e */
    void mo1768e(int i, long j) throws IOException;

    /* JADX INFO: renamed from: f */
    void mo1769f(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: g */
    void mo1770g(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: h */
    void mo1771h(int i, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: i */
    void mo1772i(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: j */
    void mo1773j(int i, Object obj, InterfaceC0335i0 interfaceC0335i0) throws IOException;

    /* JADX INFO: renamed from: k */
    void mo1774k(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: l */
    void mo1775l(int i, long j) throws IOException;

    /* JADX INFO: renamed from: m */
    <K, V> void mo1776m(int i, C0356y.a<K, V> aVar, Map<K, V> map) throws IOException;

    /* JADX INFO: renamed from: n */
    void mo1777n(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: o */
    void mo1778o(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: p */
    void mo1779p(int i, long j) throws IOException;

    /* JADX INFO: renamed from: q */
    void mo1780q(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: r */
    void mo1781r(int i, int i2) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: s */
    void mo1782s(int i) throws IOException;

    /* JADX INFO: renamed from: t */
    void mo1783t(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: u */
    void mo1784u(int i) throws IOException;

    /* JADX INFO: renamed from: v */
    void mo1785v(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: w */
    void mo1786w(int i, List<Double> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: x */
    void mo1787x(int i, List<ByteString> list) throws IOException;

    /* JADX INFO: renamed from: y */
    void mo1788y(int i, List<String> list) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: z */
    void mo1789z(int i, List<?> list, InterfaceC0335i0 interfaceC0335i0) throws IOException;
}
