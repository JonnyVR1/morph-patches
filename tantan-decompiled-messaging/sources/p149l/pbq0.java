package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class pbq0 extends zq3 {
    @Override // p149l.zq3, p149l.pze
    /* JADX INFO: renamed from: a */
    public void mo121015a(sze szeVar) {
        StringBuilder sb = new StringBuilder();
        while (szeVar.m186769i()) {
            char cM186763c = szeVar.m186763c();
            szeVar.f167052f++;
            mo168249c(cM186763c, sb);
            if (sb.length() % 3 == 0) {
                zq3.m219842g(szeVar, sb);
                if (j2l.m139478n(szeVar.m186764d(), szeVar.f167052f, mo168250e()) != mo168250e()) {
                    szeVar.m186775o(0);
                    break;
                }
            }
        }
        mo168251f(szeVar, sb);
    }

    @Override // p149l.zq3
    /* JADX INFO: renamed from: c */
    public int mo168249c(char c, StringBuilder sb) {
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
            j2l.m139469e(c);
        } else {
            sb.append((char) (c - '3'));
        }
        return 1;
    }

    @Override // p149l.zq3
    /* JADX INFO: renamed from: e */
    public int mo168250e() {
        return 3;
    }

    @Override // p149l.zq3
    /* JADX INFO: renamed from: f */
    public void mo168251f(sze szeVar, StringBuilder sb) {
        szeVar.m186776p();
        int iM218473a = szeVar.m186767g().m218473a() - szeVar.m186761a();
        szeVar.f167052f -= sb.length();
        if (szeVar.m186766f() > 1 || iM218473a > 1 || szeVar.m186766f() != iM218473a) {
            szeVar.m186778r((char) 254);
        }
        if (szeVar.m186765e() < 0) {
            szeVar.m186775o(0);
        }
    }
}
