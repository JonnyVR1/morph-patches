package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class ukq0 extends yr3 {
    @Override // p153l.yr3, p153l.t0f
    /* JADX INFO: renamed from: a */
    public void mo158010a(w0f w0fVar) {
        StringBuilder sb = new StringBuilder();
        while (w0fVar.m204151i()) {
            char cM204145c = w0fVar.m204145c();
            w0fVar.f186568f++;
            mo187628c(cM204145c, sb);
            if (sb.length() % 3 == 0) {
                yr3.m217149g(w0fVar, sb);
                if (z4l.m218606n(w0fVar.m204146d(), w0fVar.f186568f, mo187629e()) != mo187629e()) {
                    w0fVar.m204157o(0);
                    break;
                }
            }
        }
        mo196513f(w0fVar, sb);
    }

    @Override // p153l.yr3
    /* JADX INFO: renamed from: c */
    public int mo187628c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c < 'A' || c > 'Z') {
            z4l.m218597e(c);
        } else {
            sb.append((char) (c - '3'));
        }
        return 1;
    }

    @Override // p153l.yr3
    /* JADX INFO: renamed from: e */
    public int mo187629e() {
        return 3;
    }

    @Override // p153l.yr3
    /* JADX INFO: renamed from: f */
    public void mo196513f(w0f w0fVar, StringBuilder sb) {
        w0fVar.m204158p();
        int iM136421a = w0fVar.m204149g().m136421a() - w0fVar.m204143a();
        w0fVar.f186568f -= sb.length();
        if (w0fVar.m204148f() > 1 || iM136421a > 1 || w0fVar.m204148f() != iM136421a) {
            w0fVar.m204160r((char) 254);
        }
        if (w0fVar.m204147e() < 0) {
            w0fVar.m204157o(0);
        }
    }
}
