package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class me2 implements t0f {
    /* JADX INFO: renamed from: c */
    public static char m158009c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // p153l.t0f
    /* JADX INFO: renamed from: a */
    public void mo158010a(w0f w0fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (w0fVar.m204151i()) {
            sb.append(w0fVar.m204145c());
            w0fVar.f186568f++;
            if (z4l.m218606n(w0fVar.m204146d(), w0fVar.f186568f, m158011b()) != m158011b()) {
                w0fVar.m204157o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iM204143a = w0fVar.m204143a() + length + 1;
        w0fVar.m204159q(iM204143a);
        boolean z = w0fVar.m204149g().m136421a() - iM204143a > 0;
        if (w0fVar.m204151i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length > 1555) {
                wtq0.m207906a("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            w0fVar.m204160r(m158009c(sb.charAt(i), w0fVar.m204143a() + 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public int m158011b() {
        return 5;
    }
}
