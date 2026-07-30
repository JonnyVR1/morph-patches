package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import p153l.iig0;
import p153l.l710;
import p153l.xpg0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0344m0 {

    /* JADX INFO: renamed from: f */
    public static final C0344m0 f1718f = new C0344m0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f1719a;

    /* JADX INFO: renamed from: b */
    public int[] f1720b;

    /* JADX INFO: renamed from: c */
    public Object[] f1721c;

    /* JADX INFO: renamed from: d */
    public int f1722d;

    /* JADX INFO: renamed from: e */
    public boolean f1723e;

    public C0344m0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f1722d = -1;
        this.f1719a = i;
        this.f1720b = iArr;
        this.f1721c = objArr;
        this.f1723e = z;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2260c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2261d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static C0344m0 m2262e() {
        return f1718f;
    }

    /* JADX INFO: renamed from: h */
    public static int m2263h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m2264i(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public static C0344m0 m2265k(C0344m0 c0344m0, C0344m0 c0344m1) {
        int i = c0344m0.f1719a + c0344m1.f1719a;
        int[] iArrCopyOf = Arrays.copyOf(c0344m0.f1720b, i);
        System.arraycopy(c0344m1.f1720b, 0, iArrCopyOf, c0344m0.f1719a, c0344m1.f1719a);
        Object[] objArrCopyOf = Arrays.copyOf(c0344m0.f1721c, i);
        System.arraycopy(c0344m1.f1721c, 0, objArrCopyOf, c0344m0.f1719a, c0344m1.f1719a);
        return new C0344m0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: l */
    public static C0344m0 m2266l() {
        return new C0344m0();
    }

    /* JADX INFO: renamed from: p */
    public static void m2267p(int i, Object obj, Writer writer) throws IOException {
        int iM1747a = WireFormat.m1747a(i);
        int iM1748b = WireFormat.m1748b(i);
        if (iM1748b == 0) {
            writer.mo1758I(iM1747a, ((Long) obj).longValue());
            return;
        }
        if (iM1748b == 1) {
            writer.mo1780p(iM1747a, ((Long) obj).longValue());
            return;
        }
        if (iM1748b == 2) {
            writer.mo1772h(iM1747a, (ByteString) obj);
            return;
        }
        if (iM1748b != 3) {
            if (iM1748b == 5) {
                writer.mo1767c(iM1747a, ((Integer) obj).intValue());
                return;
            } else {
                iig0.m140070a(InvalidProtocolBufferException.invalidWireType());
                return;
            }
        }
        if (writer.mo1756G() == Writer.FieldOrder.ASCENDING) {
            writer.mo1783s(iM1747a);
            ((C0344m0) obj).m2276q(writer);
            writer.mo1785u(iM1747a);
        } else {
            writer.mo1785u(iM1747a);
            ((C0344m0) obj).m2276q(writer);
            writer.mo1783s(iM1747a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2268a() {
        if (this.f1723e) {
            return;
        }
        l710.m153113a();
    }

    /* JADX INFO: renamed from: b */
    public final void m2269b() {
        int i = this.f1719a;
        int[] iArr = this.f1720b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f1720b = Arrays.copyOf(iArr, i2);
            this.f1721c = Arrays.copyOf(this.f1721c, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0344m0)) {
            return false;
        }
        C0344m0 c0344m0 = (C0344m0) obj;
        int i = this.f1719a;
        return i == c0344m0.f1719a && m2260c(this.f1720b, c0344m0.f1720b, i) && m2261d(this.f1721c, c0344m0.f1721c, this.f1719a);
    }

    /* JADX INFO: renamed from: f */
    public int m2270f() {
        int iM1522Z;
        int i = this.f1722d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1719a; i3++) {
            int i4 = this.f1720b[i3];
            int iM1747a = WireFormat.m1747a(i4);
            int iM1748b = WireFormat.m1748b(i4);
            if (iM1748b == 0) {
                iM1522Z = CodedOutputStream.m1522Z(iM1747a, ((Long) this.f1721c[i3]).longValue());
            } else if (iM1748b == 1) {
                iM1522Z = CodedOutputStream.m1541p(iM1747a, ((Long) this.f1721c[i3]).longValue());
            } else if (iM1748b == 2) {
                iM1522Z = CodedOutputStream.m1531h(iM1747a, (ByteString) this.f1721c[i3]);
            } else if (iM1748b == 3) {
                iM1522Z = (CodedOutputStream.m1519W(iM1747a) * 2) + ((C0344m0) this.f1721c[i3]).m2270f();
            } else {
                if (iM1748b != 5) {
                    xpg0.m212648a(InvalidProtocolBufferException.invalidWireType());
                    return 0;
                }
                iM1522Z = CodedOutputStream.m1539n(iM1747a, ((Integer) this.f1721c[i3]).intValue());
            }
            i2 += iM1522Z;
        }
        this.f1722d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public int m2271g() {
        int i = this.f1722d;
        if (i != -1) {
            return i;
        }
        int iM1507K = 0;
        for (int i2 = 0; i2 < this.f1719a; i2++) {
            iM1507K += CodedOutputStream.m1507K(WireFormat.m1747a(this.f1720b[i2]), (ByteString) this.f1721c[i2]);
        }
        this.f1722d = iM1507K;
        return iM1507K;
    }

    public int hashCode() {
        int i = this.f1719a;
        return ((((527 + i) * 31) + m2263h(this.f1720b, i)) * 31) + m2264i(this.f1721c, this.f1719a);
    }

    /* JADX INFO: renamed from: j */
    public void m2272j() {
        this.f1723e = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2273m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f1719a; i2++) {
            C0324c0.m1824c(sb, i, String.valueOf(WireFormat.m1747a(this.f1720b[i2])), this.f1721c[i2]);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2274n(int i, Object obj) {
        m2268a();
        m2269b();
        int[] iArr = this.f1720b;
        int i2 = this.f1719a;
        iArr[i2] = i;
        this.f1721c[i2] = obj;
        this.f1719a = i2 + 1;
    }

    /* JADX INFO: renamed from: o */
    public void m2275o(Writer writer) throws IOException {
        if (writer.mo1756G() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f1719a - 1; i >= 0; i--) {
                writer.mo1766b(WireFormat.m1747a(this.f1720b[i]), this.f1721c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f1719a; i2++) {
            writer.mo1766b(WireFormat.m1747a(this.f1720b[i2]), this.f1721c[i2]);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2276q(Writer writer) throws IOException {
        if (this.f1719a == 0) {
            return;
        }
        if (writer.mo1756G() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f1719a; i++) {
                m2267p(this.f1720b[i], this.f1721c[i], writer);
            }
            return;
        }
        for (int i2 = this.f1719a - 1; i2 >= 0; i2--) {
            m2267p(this.f1720b[i2], this.f1721c[i2], writer);
        }
    }

    public C0344m0() {
        this(0, new int[8], new Object[8], true);
    }
}
