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
    void mo1750A(int i, long j) throws IOException;

    /* JADX INFO: renamed from: B */
    void mo1751B(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: C */
    void mo1752C(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: D */
    void mo1753D(int i, Object obj, InterfaceC0336i0 interfaceC0336i0) throws IOException;

    /* JADX INFO: renamed from: E */
    void mo1754E(int i, double d) throws IOException;

    /* JADX INFO: renamed from: F */
    void mo1755F(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: G */
    FieldOrder mo1756G();

    /* JADX INFO: renamed from: H */
    void mo1757H(int i, List<?> list, InterfaceC0336i0 interfaceC0336i0) throws IOException;

    /* JADX INFO: renamed from: I */
    void mo1758I(int i, long j) throws IOException;

    /* JADX INFO: renamed from: J */
    void mo1759J(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: K */
    void mo1760K(int i, List<Boolean> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: L */
    void mo1761L(int i, float f) throws IOException;

    /* JADX INFO: renamed from: M */
    void mo1762M(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: N */
    void mo1763N(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: O */
    void mo1764O(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: a */
    void mo1765a(int i, List<Float> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: b */
    void mo1766b(int i, Object obj) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo1767c(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo1768d(int i, String str) throws IOException;

    /* JADX INFO: renamed from: e */
    void mo1769e(int i, long j) throws IOException;

    /* JADX INFO: renamed from: f */
    void mo1770f(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: g */
    void mo1771g(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: h */
    void mo1772h(int i, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: i */
    void mo1773i(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: j */
    void mo1774j(int i, Object obj, InterfaceC0336i0 interfaceC0336i0) throws IOException;

    /* JADX INFO: renamed from: k */
    void mo1775k(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: l */
    void mo1776l(int i, long j) throws IOException;

    /* JADX INFO: renamed from: m */
    <K, V> void mo1777m(int i, C0357y.a<K, V> aVar, Map<K, V> map) throws IOException;

    /* JADX INFO: renamed from: n */
    void mo1778n(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: o */
    void mo1779o(int i, List<Long> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: p */
    void mo1780p(int i, long j) throws IOException;

    /* JADX INFO: renamed from: q */
    void mo1781q(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: r */
    void mo1782r(int i, int i2) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: s */
    void mo1783s(int i) throws IOException;

    /* JADX INFO: renamed from: t */
    void mo1784t(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: u */
    void mo1785u(int i) throws IOException;

    /* JADX INFO: renamed from: v */
    void mo1786v(int i, List<Integer> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: w */
    void mo1787w(int i, List<Double> list, boolean z) throws IOException;

    /* JADX INFO: renamed from: x */
    void mo1788x(int i, List<ByteString> list) throws IOException;

    /* JADX INFO: renamed from: y */
    void mo1789y(int i, List<String> list) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: z */
    void mo1790z(int i, List<?> list, InterfaceC0336i0 interfaceC0336i0) throws IOException;
}
