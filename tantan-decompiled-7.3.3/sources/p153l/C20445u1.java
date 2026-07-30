package p153l;

/* JADX INFO: renamed from: l.u1 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20445u1 implements t0f {
    /* JADX INFO: renamed from: b */
    public static char m193885b(char c, char c2) {
        if (z4l.m218598f(c) && z4l.m218598f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p153l.t0f
    /* JADX INFO: renamed from: a */
    public void mo158010a(w0f w0fVar) {
        if (z4l.m218593a(w0fVar.m204146d(), w0fVar.f186568f) >= 2) {
            w0fVar.m204160r(m193885b(w0fVar.m204146d().charAt(w0fVar.f186568f), w0fVar.m204146d().charAt(w0fVar.f186568f + 1)));
            w0fVar.f186568f += 2;
            return;
        }
        char cM204145c = w0fVar.m204145c();
        int iM218606n = z4l.m218606n(w0fVar.m204146d(), w0fVar.f186568f, m193886c());
        if (iM218606n == m193886c()) {
            if (!z4l.m218599g(cM204145c)) {
                w0fVar.m204160r((char) (cM204145c + 1));
                w0fVar.f186568f++;
                return;
            } else {
                w0fVar.m204160r((char) 235);
                w0fVar.m204160r((char) (cM204145c - 127));
                w0fVar.f186568f++;
                return;
            }
        }
        if (iM218606n == 1) {
            w0fVar.m204160r((char) 230);
            w0fVar.m204157o(1);
            return;
        }
        if (iM218606n == 2) {
            w0fVar.m204160r((char) 239);
            w0fVar.m204157o(2);
            return;
        }
        if (iM218606n == 3) {
            w0fVar.m204160r((char) 238);
            w0fVar.m204157o(3);
        } else if (iM218606n == 4) {
            w0fVar.m204160r((char) 240);
            w0fVar.m204157o(4);
        } else if (iM218606n != 5) {
            wtq0.m207906a("Illegal mode: ".concat(String.valueOf(iM218606n)));
        } else {
            w0fVar.m204160r((char) 231);
            w0fVar.m204157o(5);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m193886c() {
        return 0;
    }
}
