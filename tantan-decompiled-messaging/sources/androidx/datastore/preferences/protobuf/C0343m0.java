package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import p149l.aag0;
import p149l.bz00;
import p149l.phg0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0343m0 {

    /* JADX INFO: renamed from: f */
    public static final C0343m0 f1718f = new C0343m0(0, new int[0], new Object[0], false);

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

    public C0343m0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f1722d = -1;
        this.f1719a = i;
        this.f1720b = iArr;
        this.f1721c = objArr;
        this.f1723e = z;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2259c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2260d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static C0343m0 m2261e() {
        return f1718f;
    }

    /* JADX INFO: renamed from: h */
    public static int m2262h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m2263i(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public static C0343m0 m2264k(C0343m0 c0343m0, C0343m0 c0343m1) {
        int i = c0343m0.f1719a + c0343m1.f1719a;
        int[] iArrCopyOf = Arrays.copyOf(c0343m0.f1720b, i);
        System.arraycopy(c0343m1.f1720b, 0, iArrCopyOf, c0343m0.f1719a, c0343m1.f1719a);
        Object[] objArrCopyOf = Arrays.copyOf(c0343m0.f1721c, i);
        System.arraycopy(c0343m1.f1721c, 0, objArrCopyOf, c0343m0.f1719a, c0343m1.f1719a);
        return new C0343m0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: l */
    public static C0343m0 m2265l() {
        return new C0343m0();
    }

    /* JADX INFO: renamed from: p */
    public static void m2266p(int i, Object obj, Writer writer) throws IOException {
        int iM1746a = WireFormat.m1746a(i);
        int iM1747b = WireFormat.m1747b(i);
        if (iM1747b == 0) {
            writer.mo1757I(iM1746a, ((Long) obj).longValue());
            return;
        }
        if (iM1747b == 1) {
            writer.mo1779p(iM1746a, ((Long) obj).longValue());
            return;
        }
        if (iM1747b == 2) {
            writer.mo1771h(iM1746a, (ByteString) obj);
            return;
        }
        if (iM1747b != 3) {
            if (iM1747b == 5) {
                writer.mo1766c(iM1746a, ((Integer) obj).intValue());
                return;
            } else {
                aag0.m95543a(InvalidProtocolBufferException.invalidWireType());
                return;
            }
        }
        if (writer.mo1755G() == Writer.FieldOrder.ASCENDING) {
            writer.mo1782s(iM1746a);
            ((C0343m0) obj).m2275q(writer);
            writer.mo1784u(iM1746a);
        } else {
            writer.mo1784u(iM1746a);
            ((C0343m0) obj).m2275q(writer);
            writer.mo1782s(iM1746a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2267a() {
        if (this.f1723e) {
            return;
        }
        bz00.m104536a();
    }

    /* JADX INFO: renamed from: b */
    public final void m2268b() {
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
        if (obj == null || !(obj instanceof C0343m0)) {
            return false;
        }
        C0343m0 c0343m0 = (C0343m0) obj;
        int i = this.f1719a;
        return i == c0343m0.f1719a && m2259c(this.f1720b, c0343m0.f1720b, i) && m2260d(this.f1721c, c0343m0.f1721c, this.f1719a);
    }

    /* JADX INFO: renamed from: f */
    public int m2269f() {
        int iM1521Z;
        int i = this.f1722d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1719a; i3++) {
            int i4 = this.f1720b[i3];
            int iM1746a = WireFormat.m1746a(i4);
            int iM1747b = WireFormat.m1747b(i4);
            if (iM1747b == 0) {
                iM1521Z = CodedOutputStream.m1521Z(iM1746a, ((Long) this.f1721c[i3]).longValue());
            } else if (iM1747b == 1) {
                iM1521Z = CodedOutputStream.m1540p(iM1746a, ((Long) this.f1721c[i3]).longValue());
            } else if (iM1747b == 2) {
                iM1521Z = CodedOutputStream.m1530h(iM1746a, (ByteString) this.f1721c[i3]);
            } else if (iM1747b == 3) {
                iM1521Z = (CodedOutputStream.m1518W(iM1746a) * 2) + ((C0343m0) this.f1721c[i3]).m2269f();
            } else {
                if (iM1747b != 5) {
                    phg0.m168968a(InvalidProtocolBufferException.invalidWireType());
                    return 0;
                }
                iM1521Z = CodedOutputStream.m1538n(iM1746a, ((Integer) this.f1721c[i3]).intValue());
            }
            i2 += iM1521Z;
        }
        this.f1722d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public int m2270g() {
        int i = this.f1722d;
        if (i != -1) {
            return i;
        }
        int iM1506K = 0;
        for (int i2 = 0; i2 < this.f1719a; i2++) {
            iM1506K += CodedOutputStream.m1506K(WireFormat.m1746a(this.f1720b[i2]), (ByteString) this.f1721c[i2]);
        }
        this.f1722d = iM1506K;
        return iM1506K;
    }

    public int hashCode() {
        int i = this.f1719a;
        return ((((527 + i) * 31) + m2262h(this.f1720b, i)) * 31) + m2263i(this.f1721c, this.f1719a);
    }

    /* JADX INFO: renamed from: j */
    public void m2271j() {
        this.f1723e = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2272m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f1719a; i2++) {
            C0323c0.m1823c(sb, i, String.valueOf(WireFormat.m1746a(this.f1720b[i2])), this.f1721c[i2]);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2273n(int i, Object obj) {
        m2267a();
        m2268b();
        int[] iArr = this.f1720b;
        int i2 = this.f1719a;
        iArr[i2] = i;
        this.f1721c[i2] = obj;
        this.f1719a = i2 + 1;
    }

    /* JADX INFO: renamed from: o */
    public void m2274o(Writer writer) throws IOException {
        if (writer.mo1755G() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f1719a - 1; i >= 0; i--) {
                writer.mo1765b(WireFormat.m1746a(this.f1720b[i]), this.f1721c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f1719a; i2++) {
            writer.mo1765b(WireFormat.m1746a(this.f1720b[i2]), this.f1721c[i2]);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2275q(Writer writer) throws IOException {
        if (this.f1719a == 0) {
            return;
        }
        if (writer.mo1755G() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f1719a; i++) {
                m2266p(this.f1720b[i], this.f1721c[i], writer);
            }
            return;
        }
        for (int i2 = this.f1719a - 1; i2 >= 0; i2--) {
            m2266p(this.f1720b[i2], this.f1721c[i2], writer);
        }
    }

    public C0343m0() {
        this(0, new int[8], new Object[8], true);
    }
}
