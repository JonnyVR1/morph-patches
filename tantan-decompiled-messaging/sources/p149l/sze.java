package p149l;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes7.dex */
public final class sze {

    /* JADX INFO: renamed from: a */
    public final String f167047a;

    /* JADX INFO: renamed from: b */
    public SymbolShapeHint f167048b;

    /* JADX INFO: renamed from: c */
    public e1e f167049c;

    /* JADX INFO: renamed from: d */
    public e1e f167050d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f167051e;

    /* JADX INFO: renamed from: f */
    public int f167052f;

    /* JADX INFO: renamed from: g */
    public int f167053g;

    /* JADX INFO: renamed from: h */
    public zfh0 f167054h;

    /* JADX INFO: renamed from: i */
    public int f167055i;

    public sze(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                ig3.m135964a("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.f167047a = sb.toString();
        this.f167048b = SymbolShapeHint.FORCE_NONE;
        this.f167051e = new StringBuilder(str.length());
        this.f167053g = -1;
    }

    /* JADX INFO: renamed from: a */
    public int m186761a() {
        return this.f167051e.length();
    }

    /* JADX INFO: renamed from: b */
    public StringBuilder m186762b() {
        return this.f167051e;
    }

    /* JADX INFO: renamed from: c */
    public char m186763c() {
        return this.f167047a.charAt(this.f167052f);
    }

    /* JADX INFO: renamed from: d */
    public String m186764d() {
        return this.f167047a;
    }

    /* JADX INFO: renamed from: e */
    public int m186765e() {
        return this.f167053g;
    }

    /* JADX INFO: renamed from: f */
    public int m186766f() {
        return m186768h() - this.f167052f;
    }

    /* JADX INFO: renamed from: g */
    public zfh0 m186767g() {
        return this.f167054h;
    }

    /* JADX INFO: renamed from: h */
    public final int m186768h() {
        return this.f167047a.length() - this.f167055i;
    }

    /* JADX INFO: renamed from: i */
    public boolean m186769i() {
        return this.f167052f < m186768h();
    }

    /* JADX INFO: renamed from: j */
    public void m186770j() {
        this.f167053g = -1;
    }

    /* JADX INFO: renamed from: k */
    public void m186771k() {
        this.f167054h = null;
    }

    /* JADX INFO: renamed from: l */
    public void m186772l(e1e e1eVar, e1e e1eVar2) {
        this.f167049c = e1eVar;
        this.f167050d = e1eVar2;
    }

    /* JADX INFO: renamed from: m */
    public void m186773m(int i) {
        this.f167055i = i;
    }

    /* JADX INFO: renamed from: n */
    public void m186774n(SymbolShapeHint symbolShapeHint) {
        this.f167048b = symbolShapeHint;
    }

    /* JADX INFO: renamed from: o */
    public void m186775o(int i) {
        this.f167053g = i;
    }

    /* JADX INFO: renamed from: p */
    public void m186776p() {
        m186777q(m186761a());
    }

    /* JADX INFO: renamed from: q */
    public void m186777q(int i) {
        zfh0 zfh0Var = this.f167054h;
        if (zfh0Var == null || i > zfh0Var.m218473a()) {
            this.f167054h = zfh0.m218472l(i, this.f167048b, this.f167049c, this.f167050d, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m186778r(char c) {
        this.f167051e.append(c);
    }

    /* JADX INFO: renamed from: s */
    public void m186779s(String str) {
        this.f167051e.append(str);
    }
}
