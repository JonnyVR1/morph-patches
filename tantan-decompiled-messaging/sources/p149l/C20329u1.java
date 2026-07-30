package p149l;

/* JADX INFO: renamed from: l.u1 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20329u1 implements pze {
    /* JADX INFO: renamed from: b */
    public static char m191367b(char c, char c2) {
        if (j2l.m139470f(c) && j2l.m139470f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p149l.pze
    /* JADX INFO: renamed from: a */
    public void mo121015a(sze szeVar) {
        if (j2l.m139465a(szeVar.m186764d(), szeVar.f167052f) >= 2) {
            szeVar.m186778r(m191367b(szeVar.m186764d().charAt(szeVar.f167052f), szeVar.m186764d().charAt(szeVar.f167052f + 1)));
            szeVar.f167052f += 2;
            return;
        }
        char cM186763c = szeVar.m186763c();
        int iM139478n = j2l.m139478n(szeVar.m186764d(), szeVar.f167052f, m191368c());
        if (iM139478n == m191368c()) {
            if (!j2l.m139471g(cM186763c)) {
                szeVar.m186778r((char) (cM186763c + 1));
                szeVar.f167052f++;
                return;
            } else {
                szeVar.m186778r((char) 235);
                szeVar.m186778r((char) (cM186763c - 127));
                szeVar.f167052f++;
                return;
            }
        }
        if (iM139478n == 1) {
            szeVar.m186778r((char) 230);
            szeVar.m186775o(1);
            return;
        }
        if (iM139478n == 2) {
            szeVar.m186778r((char) 239);
            szeVar.m186775o(2);
            return;
        }
        if (iM139478n == 3) {
            szeVar.m186778r((char) 238);
            szeVar.m186775o(3);
        } else if (iM139478n == 4) {
            szeVar.m186778r((char) 240);
            szeVar.m186775o(4);
        } else if (iM139478n != 5) {
            qkq0.m175383a("Illegal mode: ".concat(String.valueOf(iM139478n)));
        } else {
            szeVar.m186778r((char) 231);
            szeVar.m186775o(5);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m191368c() {
        return 0;
    }
}
