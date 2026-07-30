package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class fe2 implements pze {
    /* JADX INFO: renamed from: c */
    public static char m121014c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // p149l.pze
    /* JADX INFO: renamed from: a */
    public void mo121015a(sze szeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (szeVar.m186769i()) {
            sb.append(szeVar.m186763c());
            szeVar.f167052f++;
            if (j2l.m139478n(szeVar.m186764d(), szeVar.f167052f, m121016b()) != m121016b()) {
                szeVar.m186775o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iM186761a = szeVar.m186761a() + length + 1;
        szeVar.m186777q(iM186761a);
        boolean z = szeVar.m186767g().m218473a() - iM186761a > 0;
        if (szeVar.m186769i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length > 1555) {
                qkq0.m175383a("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            szeVar.m186778r(m121014c(sb.charAt(i), szeVar.m186761a() + 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public int m121016b() {
        return 5;
    }
}
