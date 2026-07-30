package p153l;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes7.dex */
public final class w0f {

    /* JADX INFO: renamed from: a */
    public final String f186563a;

    /* JADX INFO: renamed from: b */
    public SymbolShapeHint f186564b;

    /* JADX INFO: renamed from: c */
    public s2e f186565c;

    /* JADX INFO: renamed from: d */
    public s2e f186566d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f186567e;

    /* JADX INFO: renamed from: f */
    public int f186568f;

    /* JADX INFO: renamed from: g */
    public int f186569g;

    /* JADX INFO: renamed from: h */
    public hoh0 f186570h;

    /* JADX INFO: renamed from: i */
    public int f186571i;

    public w0f(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                wg3.m206174a("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.f186563a = sb.toString();
        this.f186564b = SymbolShapeHint.FORCE_NONE;
        this.f186567e = new StringBuilder(str.length());
        this.f186569g = -1;
    }

    /* JADX INFO: renamed from: a */
    public int m204143a() {
        return this.f186567e.length();
    }

    /* JADX INFO: renamed from: b */
    public StringBuilder m204144b() {
        return this.f186567e;
    }

    /* JADX INFO: renamed from: c */
    public char m204145c() {
        return this.f186563a.charAt(this.f186568f);
    }

    /* JADX INFO: renamed from: d */
    public String m204146d() {
        return this.f186563a;
    }

    /* JADX INFO: renamed from: e */
    public int m204147e() {
        return this.f186569g;
    }

    /* JADX INFO: renamed from: f */
    public int m204148f() {
        return m204150h() - this.f186568f;
    }

    /* JADX INFO: renamed from: g */
    public hoh0 m204149g() {
        return this.f186570h;
    }

    /* JADX INFO: renamed from: h */
    public final int m204150h() {
        return this.f186563a.length() - this.f186571i;
    }

    /* JADX INFO: renamed from: i */
    public boolean m204151i() {
        return this.f186568f < m204150h();
    }

    /* JADX INFO: renamed from: j */
    public void m204152j() {
        this.f186569g = -1;
    }

    /* JADX INFO: renamed from: k */
    public void m204153k() {
        this.f186570h = null;
    }

    /* JADX INFO: renamed from: l */
    public void m204154l(s2e s2eVar, s2e s2eVar2) {
        this.f186565c = s2eVar;
        this.f186566d = s2eVar2;
    }

    /* JADX INFO: renamed from: m */
    public void m204155m(int i) {
        this.f186571i = i;
    }

    /* JADX INFO: renamed from: n */
    public void m204156n(SymbolShapeHint symbolShapeHint) {
        this.f186564b = symbolShapeHint;
    }

    /* JADX INFO: renamed from: o */
    public void m204157o(int i) {
        this.f186569g = i;
    }

    /* JADX INFO: renamed from: p */
    public void m204158p() {
        m204159q(m204143a());
    }

    /* JADX INFO: renamed from: q */
    public void m204159q(int i) {
        hoh0 hoh0Var = this.f186570h;
        if (hoh0Var == null || i > hoh0Var.m136421a()) {
            this.f186570h = hoh0.m136420l(i, this.f186564b, this.f186565c, this.f186566d, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m204160r(char c) {
        this.f186567e.append(c);
    }

    /* JADX INFO: renamed from: s */
    public void m204161s(String str) {
        this.f186567e.append(str);
    }
}
