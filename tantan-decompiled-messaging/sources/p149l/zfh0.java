package p149l;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public class zfh0 {

    /* JADX INFO: renamed from: i */
    public static final zfh0[] f202942i;

    /* JADX INFO: renamed from: j */
    public static zfh0[] f202943j;

    /* JADX INFO: renamed from: a */
    public final boolean f202944a;

    /* JADX INFO: renamed from: b */
    public final int f202945b;

    /* JADX INFO: renamed from: c */
    public final int f202946c;

    /* JADX INFO: renamed from: d */
    public final int f202947d;

    /* JADX INFO: renamed from: e */
    public final int f202948e;

    /* JADX INFO: renamed from: f */
    public final int f202949f;

    /* JADX INFO: renamed from: g */
    public final int f202950g;

    /* JADX INFO: renamed from: h */
    public final int f202951h;

    static {
        zfh0[] zfh0VarArr = {new zfh0(false, 3, 5, 8, 8, 1), new zfh0(false, 5, 7, 10, 10, 1), new zfh0(true, 5, 7, 16, 6, 1), new zfh0(false, 8, 10, 12, 12, 1), new zfh0(true, 10, 11, 14, 6, 2), new zfh0(false, 12, 12, 14, 14, 1), new zfh0(true, 16, 14, 24, 10, 1), new zfh0(false, 18, 14, 16, 16, 1), new zfh0(false, 22, 18, 18, 18, 1), new zfh0(true, 22, 18, 16, 10, 2), new zfh0(false, 30, 20, 20, 20, 1), new zfh0(true, 32, 24, 16, 14, 2), new zfh0(false, 36, 24, 22, 22, 1), new zfh0(false, 44, 28, 24, 24, 1), new zfh0(true, 49, 28, 22, 14, 2), new zfh0(false, 62, 36, 14, 14, 4), new zfh0(false, 86, 42, 16, 16, 4), new zfh0(false, 114, 48, 18, 18, 4), new zfh0(false, 144, 56, 20, 20, 4), new zfh0(false, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 68, 22, 22, 4), new zfh0(false, 204, 84, 24, 24, 4, 102, 42), new zfh0(false, 280, 112, 14, 14, 16, 140, 56), new zfh0(false, 368, 144, 16, 16, 16, 92, 36), new zfh0(false, 456, 192, 18, 18, 16, 114, 48), new zfh0(false, 576, 224, 20, 20, 16, 144, 56), new zfh0(false, 696, 272, 22, 22, 16, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 68), new zfh0(false, 816, 336, 24, 24, 16, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 56), new zfh0(false, 1050, HttpStatus.REQUEST_TIMEOUT_408, 18, 18, 36, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 68), new zfh0(false, 1304, 496, 20, 20, 36, 163, 62), new p4c()};
        f202942i = zfh0VarArr;
        f202943j = zfh0VarArr;
    }

    public zfh0(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f202944a = z;
        this.f202945b = i;
        this.f202946c = i2;
        this.f202947d = i3;
        this.f202948e = i4;
        this.f202949f = i5;
        this.f202950g = i6;
        this.f202951h = i7;
    }

    /* JADX INFO: renamed from: l */
    public static zfh0 m218472l(int i, SymbolShapeHint symbolShapeHint, e1e e1eVar, e1e e1eVar2, boolean z) {
        for (zfh0 zfh0Var : f202943j) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && zfh0Var.f202944a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || zfh0Var.f202944a) && ((e1eVar == null || (zfh0Var.m218480j() >= e1eVar.m114407b() && zfh0Var.m218479i() >= e1eVar.m114406a())) && ((e1eVar2 == null || (zfh0Var.m218480j() <= e1eVar2.m114407b() && zfh0Var.m218479i() <= e1eVar2.m114406a())) && i <= zfh0Var.f202945b)))) {
                return zfh0Var;
            }
        }
        if (!z) {
            return null;
        }
        ig3.m135964a("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m218473a() {
        return this.f202945b;
    }

    /* JADX INFO: renamed from: b */
    public int mo167384b(int i) {
        return this.f202950g;
    }

    /* JADX INFO: renamed from: c */
    public final int m218474c() {
        return this.f202946c;
    }

    /* JADX INFO: renamed from: d */
    public final int m218475d(int i) {
        return this.f202951h;
    }

    /* JADX INFO: renamed from: e */
    public final int m218476e() {
        int i = this.f202949f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                qkq0.m175383a("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public int mo167385f() {
        return this.f202945b / this.f202950g;
    }

    /* JADX INFO: renamed from: g */
    public final int m218477g() {
        return m218481k() * this.f202948e;
    }

    /* JADX INFO: renamed from: h */
    public final int m218478h() {
        return m218476e() * this.f202947d;
    }

    /* JADX INFO: renamed from: i */
    public final int m218479i() {
        return m218477g() + (m218481k() << 1);
    }

    /* JADX INFO: renamed from: j */
    public final int m218480j() {
        return m218478h() + (m218476e() << 1);
    }

    /* JADX INFO: renamed from: k */
    public final int m218481k() {
        int i = this.f202949f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        qkq0.m175383a("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f202944a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f202947d);
        sb.append('x');
        sb.append(this.f202948e);
        sb.append(", symbol size ");
        sb.append(m218480j());
        sb.append('x');
        sb.append(m218479i());
        sb.append(", symbol data size ");
        sb.append(m218478h());
        sb.append('x');
        sb.append(m218477g());
        sb.append(", codewords ");
        sb.append(this.f202945b);
        sb.append('+');
        sb.append(this.f202946c);
        return sb.toString();
    }

    public zfh0(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }
}
