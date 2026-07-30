package p153l;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public class hoh0 {

    /* JADX INFO: renamed from: i */
    public static final hoh0[] f110907i;

    /* JADX INFO: renamed from: j */
    public static hoh0[] f110908j;

    /* JADX INFO: renamed from: a */
    public final boolean f110909a;

    /* JADX INFO: renamed from: b */
    public final int f110910b;

    /* JADX INFO: renamed from: c */
    public final int f110911c;

    /* JADX INFO: renamed from: d */
    public final int f110912d;

    /* JADX INFO: renamed from: e */
    public final int f110913e;

    /* JADX INFO: renamed from: f */
    public final int f110914f;

    /* JADX INFO: renamed from: g */
    public final int f110915g;

    /* JADX INFO: renamed from: h */
    public final int f110916h;

    static {
        hoh0[] hoh0VarArr = {new hoh0(false, 3, 5, 8, 8, 1), new hoh0(false, 5, 7, 10, 10, 1), new hoh0(true, 5, 7, 16, 6, 1), new hoh0(false, 8, 10, 12, 12, 1), new hoh0(true, 10, 11, 14, 6, 2), new hoh0(false, 12, 12, 14, 14, 1), new hoh0(true, 16, 14, 24, 10, 1), new hoh0(false, 18, 14, 16, 16, 1), new hoh0(false, 22, 18, 18, 18, 1), new hoh0(true, 22, 18, 16, 10, 2), new hoh0(false, 30, 20, 20, 20, 1), new hoh0(true, 32, 24, 16, 14, 2), new hoh0(false, 36, 24, 22, 22, 1), new hoh0(false, 44, 28, 24, 24, 1), new hoh0(true, 49, 28, 22, 14, 2), new hoh0(false, 62, 36, 14, 14, 4), new hoh0(false, 86, 42, 16, 16, 4), new hoh0(false, 114, 48, 18, 18, 4), new hoh0(false, 144, 56, 20, 20, 4), new hoh0(false, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 68, 22, 22, 4), new hoh0(false, 204, 84, 24, 24, 4, 102, 42), new hoh0(false, 280, 112, 14, 14, 16, 140, 56), new hoh0(false, 368, 144, 16, 16, 16, 92, 36), new hoh0(false, 456, 192, 18, 18, 16, 114, 48), new hoh0(false, 576, 224, 20, 20, 16, 144, 56), new hoh0(false, 696, 272, 22, 22, 16, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 68), new hoh0(false, 816, 336, 24, 24, 16, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 56), new hoh0(false, 1050, HttpStatus.REQUEST_TIMEOUT_408, 18, 18, 36, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 68), new hoh0(false, 1304, 496, 20, 20, 36, 163, 62), new x5c()};
        f110907i = hoh0VarArr;
        f110908j = hoh0VarArr;
    }

    public hoh0(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f110909a = z;
        this.f110910b = i;
        this.f110911c = i2;
        this.f110912d = i3;
        this.f110913e = i4;
        this.f110914f = i5;
        this.f110915g = i6;
        this.f110916h = i7;
    }

    /* JADX INFO: renamed from: l */
    public static hoh0 m136420l(int i, SymbolShapeHint symbolShapeHint, s2e s2eVar, s2e s2eVar2, boolean z) {
        for (hoh0 hoh0Var : f110908j) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && hoh0Var.f110909a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || hoh0Var.f110909a) && ((s2eVar == null || (hoh0Var.m136430j() >= s2eVar.m184117b() && hoh0Var.m136429i() >= s2eVar.m184116a())) && ((s2eVar2 == null || (hoh0Var.m136430j() <= s2eVar2.m184117b() && hoh0Var.m136429i() <= s2eVar2.m184116a())) && i <= hoh0Var.f110910b)))) {
                return hoh0Var;
            }
        }
        if (!z) {
            return null;
        }
        wg3.m206174a("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m136421a() {
        return this.f110910b;
    }

    /* JADX INFO: renamed from: b */
    public int mo136422b(int i) {
        return this.f110915g;
    }

    /* JADX INFO: renamed from: c */
    public final int m136423c() {
        return this.f110911c;
    }

    /* JADX INFO: renamed from: d */
    public final int m136424d(int i) {
        return this.f110916h;
    }

    /* JADX INFO: renamed from: e */
    public final int m136425e() {
        int i = this.f110914f;
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
                wtq0.m207906a("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public int mo136426f() {
        return this.f110910b / this.f110915g;
    }

    /* JADX INFO: renamed from: g */
    public final int m136427g() {
        return m136431k() * this.f110913e;
    }

    /* JADX INFO: renamed from: h */
    public final int m136428h() {
        return m136425e() * this.f110912d;
    }

    /* JADX INFO: renamed from: i */
    public final int m136429i() {
        return m136427g() + (m136431k() << 1);
    }

    /* JADX INFO: renamed from: j */
    public final int m136430j() {
        return m136428h() + (m136425e() << 1);
    }

    /* JADX INFO: renamed from: k */
    public final int m136431k() {
        int i = this.f110914f;
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
        wtq0.m207906a("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110909a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f110912d);
        sb.append('x');
        sb.append(this.f110913e);
        sb.append(", symbol size ");
        sb.append(m136430j());
        sb.append('x');
        sb.append(m136429i());
        sb.append(", symbol data size ");
        sb.append(m136428h());
        sb.append('x');
        sb.append(m136427g());
        sb.append(", codewords ");
        sb.append(this.f110910b);
        sb.append('+');
        sb.append(this.f110911c);
        return sb.toString();
    }

    public hoh0(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }
}
