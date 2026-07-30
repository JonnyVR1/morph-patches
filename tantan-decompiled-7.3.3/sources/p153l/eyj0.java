package p153l;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3443r;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class eyj0 {

    /* JADX INFO: renamed from: f */
    public static final eyj0 f96442f = new eyj0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f96443a;

    /* JADX INFO: renamed from: b */
    public int[] f96444b;

    /* JADX INFO: renamed from: c */
    public Object[] f96445c;

    /* JADX INFO: renamed from: d */
    public int f96446d;

    /* JADX INFO: renamed from: e */
    public boolean f96447e;

    public eyj0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f96446d = -1;
        this.f96443a = i;
        this.f96444b = iArr;
        this.f96445c = objArr;
        this.f96447e = z;
    }

    /* JADX INFO: renamed from: c */
    public static eyj0 m123201c() {
        return f96442f;
    }

    /* JADX INFO: renamed from: i */
    public static eyj0 m123202i(eyj0 eyj0Var, eyj0 eyj0Var2) {
        int i = eyj0Var.f96443a + eyj0Var2.f96443a;
        int[] iArrCopyOf = Arrays.copyOf(eyj0Var.f96444b, i);
        System.arraycopy(eyj0Var2.f96444b, 0, iArrCopyOf, eyj0Var.f96443a, eyj0Var2.f96443a);
        Object[] objArrCopyOf = Arrays.copyOf(eyj0Var.f96445c, i);
        System.arraycopy(eyj0Var2.f96445c, 0, objArrCopyOf, eyj0Var.f96443a, eyj0Var2.f96443a);
        return new eyj0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: j */
    public static eyj0 m123203j() {
        return new eyj0();
    }

    /* JADX INFO: renamed from: a */
    public void m123204a() {
        if (this.f96447e) {
            return;
        }
        l710.m153113a();
    }

    /* JADX INFO: renamed from: b */
    public final void m123205b() {
        int i = this.f96443a;
        int[] iArr = this.f96444b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f96444b = Arrays.copyOf(iArr, i2);
            this.f96445c = Arrays.copyOf(this.f96445c, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m123206d() {
        this.f96447e = false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m123207e(int i, C3430e c3430e) throws IOException {
        m123204a();
        int iM17127a = WireFormat.m17127a(i);
        int iM17128b = WireFormat.m17128b(i);
        if (iM17128b == 0) {
            m123212l(i, Long.valueOf(c3430e.m17197v()));
            return true;
        }
        if (iM17128b == 1) {
            m123212l(i, Long.valueOf(c3430e.m17193r()));
            return true;
        }
        if (iM17128b == 2) {
            m123212l(i, c3430e.m17189n());
            return true;
        }
        if (iM17128b == 3) {
            eyj0 eyj0Var = new eyj0();
            eyj0Var.m123208f(c3430e);
            c3430e.m17183a(WireFormat.m17129c(iM17127a, 4));
            m123212l(i, eyj0Var);
            return true;
        }
        if (iM17128b == 4) {
            return false;
        }
        if (iM17128b != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        m123212l(i, Integer.valueOf(c3430e.m17192q()));
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eyj0)) {
            return false;
        }
        eyj0 eyj0Var = (eyj0) obj;
        return this.f96443a == eyj0Var.f96443a && Arrays.equals(this.f96444b, eyj0Var.f96444b) && Arrays.deepEquals(this.f96445c, eyj0Var.f96445c);
    }

    /* JADX INFO: renamed from: f */
    public final eyj0 m123208f(C3430e c3430e) throws IOException {
        int iM17171M;
        do {
            iM17171M = c3430e.m17171M();
            if (iM17171M == 0) {
                break;
            }
        } while (m123207e(iM17171M, c3430e));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public eyj0 m123209g(int i, ByteString byteString) {
        m123204a();
        if (i != 0) {
            m123212l(WireFormat.m17129c(i, 2), byteString);
            return this;
        }
        wg3.m206174a("Zero is not a valid field number.");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public eyj0 m123210h(int i, int i2) {
        m123204a();
        if (i != 0) {
            m123212l(WireFormat.m17129c(i, 0), Long.valueOf(i2));
            return this;
        }
        wg3.m206174a("Zero is not a valid field number.");
        return null;
    }

    public int hashCode() {
        return ((((527 + this.f96443a) * 31) + Arrays.hashCode(this.f96444b)) * 31) + Arrays.deepHashCode(this.f96445c);
    }

    /* JADX INFO: renamed from: k */
    public final void m123211k(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f96443a; i2++) {
            C3443r.m17339c(sb, i, String.valueOf(WireFormat.m17127a(this.f96444b[i2])), this.f96445c[i2]);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m123212l(int i, Object obj) {
        m123205b();
        int[] iArr = this.f96444b;
        int i2 = this.f96443a;
        iArr[i2] = i;
        this.f96445c[i2] = obj;
        this.f96443a = i2 + 1;
    }

    public eyj0() {
        this(0, new int[8], new Object[8], true);
    }
}
