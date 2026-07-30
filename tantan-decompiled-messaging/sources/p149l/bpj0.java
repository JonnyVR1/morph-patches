package p149l;

import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3420r;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class bpj0 {

    /* JADX INFO: renamed from: f */
    public static final bpj0 f76643f = new bpj0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f76644a;

    /* JADX INFO: renamed from: b */
    public int[] f76645b;

    /* JADX INFO: renamed from: c */
    public Object[] f76646c;

    /* JADX INFO: renamed from: d */
    public int f76647d;

    /* JADX INFO: renamed from: e */
    public boolean f76648e;

    public bpj0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f76647d = -1;
        this.f76644a = i;
        this.f76645b = iArr;
        this.f76646c = objArr;
        this.f76648e = z;
    }

    /* JADX INFO: renamed from: c */
    public static bpj0 m103067c() {
        return f76643f;
    }

    /* JADX INFO: renamed from: i */
    public static bpj0 m103068i(bpj0 bpj0Var, bpj0 bpj0Var2) {
        int i = bpj0Var.f76644a + bpj0Var2.f76644a;
        int[] iArrCopyOf = Arrays.copyOf(bpj0Var.f76645b, i);
        System.arraycopy(bpj0Var2.f76645b, 0, iArrCopyOf, bpj0Var.f76644a, bpj0Var2.f76644a);
        Object[] objArrCopyOf = Arrays.copyOf(bpj0Var.f76646c, i);
        System.arraycopy(bpj0Var2.f76646c, 0, objArrCopyOf, bpj0Var.f76644a, bpj0Var2.f76644a);
        return new bpj0(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: j */
    public static bpj0 m103069j() {
        return new bpj0();
    }

    /* JADX INFO: renamed from: a */
    public void m103070a() {
        if (this.f76648e) {
            return;
        }
        bz00.m104536a();
    }

    /* JADX INFO: renamed from: b */
    public final void m103071b() {
        int i = this.f76644a;
        int[] iArr = this.f76645b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f76645b = Arrays.copyOf(iArr, i2);
            this.f76646c = Arrays.copyOf(this.f76646c, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m103072d() {
        this.f76648e = false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m103073e(int i, C3407e c3407e) throws IOException {
        m103070a();
        int iM17072a = WireFormat.m17072a(i);
        int iM17073b = WireFormat.m17073b(i);
        if (iM17073b == 0) {
            m103078l(i, Long.valueOf(c3407e.m17142v()));
            return true;
        }
        if (iM17073b == 1) {
            m103078l(i, Long.valueOf(c3407e.m17138r()));
            return true;
        }
        if (iM17073b == 2) {
            m103078l(i, c3407e.m17134n());
            return true;
        }
        if (iM17073b == 3) {
            bpj0 bpj0Var = new bpj0();
            bpj0Var.m103074f(c3407e);
            c3407e.m17128a(WireFormat.m17074c(iM17072a, 4));
            m103078l(i, bpj0Var);
            return true;
        }
        if (iM17073b == 4) {
            return false;
        }
        if (iM17073b != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        m103078l(i, Integer.valueOf(c3407e.m17137q()));
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpj0)) {
            return false;
        }
        bpj0 bpj0Var = (bpj0) obj;
        return this.f76644a == bpj0Var.f76644a && Arrays.equals(this.f76645b, bpj0Var.f76645b) && Arrays.deepEquals(this.f76646c, bpj0Var.f76646c);
    }

    /* JADX INFO: renamed from: f */
    public final bpj0 m103074f(C3407e c3407e) throws IOException {
        int iM17116M;
        do {
            iM17116M = c3407e.m17116M();
            if (iM17116M == 0) {
                break;
            }
        } while (m103073e(iM17116M, c3407e));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public bpj0 m103075g(int i, ByteString byteString) {
        m103070a();
        if (i != 0) {
            m103078l(WireFormat.m17074c(i, 2), byteString);
            return this;
        }
        ig3.m135964a("Zero is not a valid field number.");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public bpj0 m103076h(int i, int i2) {
        m103070a();
        if (i != 0) {
            m103078l(WireFormat.m17074c(i, 0), Long.valueOf(i2));
            return this;
        }
        ig3.m135964a("Zero is not a valid field number.");
        return null;
    }

    public int hashCode() {
        return ((((527 + this.f76644a) * 31) + Arrays.hashCode(this.f76645b)) * 31) + Arrays.deepHashCode(this.f76646c);
    }

    /* JADX INFO: renamed from: k */
    public final void m103077k(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f76644a; i2++) {
            C3420r.m17284c(sb, i, String.valueOf(WireFormat.m17072a(this.f76645b[i2])), this.f76646c[i2]);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m103078l(int i, Object obj) {
        m103071b();
        int[] iArr = this.f76645b;
        int i2 = this.f76644a;
        iArr[i2] = i;
        this.f76646c[i2] = obj;
        this.f76644a = i2 + 1;
    }

    public bpj0() {
        this(0, new int[8], new Object[8], true);
    }
}
