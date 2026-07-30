package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class zq3 implements pze {
    /* JADX INFO: renamed from: d */
    public static String m219841d(CharSequence charSequence, int i) {
        int iCharAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    /* JADX INFO: renamed from: g */
    public static void m219842g(sze szeVar, StringBuilder sb) {
        szeVar.m186779s(m219841d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // p149l.pze
    /* JADX INFO: renamed from: a */
    public void mo121015a(sze szeVar) {
        StringBuilder sb = new StringBuilder();
        while (szeVar.m186769i()) {
            char cM186763c = szeVar.m186763c();
            szeVar.f167052f++;
            int iMo168249c = mo168249c(cM186763c, sb);
            int iM186761a = szeVar.m186761a() + ((sb.length() / 3) << 1);
            szeVar.m186777q(iM186761a);
            int iM218473a = szeVar.m186767g().m218473a() - iM186761a;
            if (!szeVar.m186769i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iM218473a < 2 || iM218473a > 2)) {
                    iMo168249c = m219843b(szeVar, sb, sb2, iMo168249c);
                }
                while (sb.length() % 3 == 1 && ((iMo168249c <= 3 && iM218473a != 1) || iMo168249c > 3)) {
                    iMo168249c = m219843b(szeVar, sb, sb2, iMo168249c);
                }
                break;
            }
            if (sb.length() % 3 == 0 && j2l.m139478n(szeVar.m186764d(), szeVar.f167052f, mo168250e()) != mo168250e()) {
                szeVar.m186775o(0);
                break;
            }
        }
        mo168251f(szeVar, sb);
    }

    /* JADX INFO: renamed from: b */
    public final int m219843b(sze szeVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        szeVar.f167052f--;
        int iMo168249c = mo168249c(szeVar.m186763c(), sb2);
        szeVar.m186771k();
        return iMo168249c;
    }

    /* JADX INFO: renamed from: c */
    public int mo168249c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo168249c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    /* JADX INFO: renamed from: e */
    public int mo168250e() {
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public void mo168251f(sze szeVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iM186761a = szeVar.m186761a() + length;
        szeVar.m186777q(iM186761a);
        int iM218473a = szeVar.m186767g().m218473a() - iM186761a;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m219842g(szeVar, sb);
            }
            if (szeVar.m186769i()) {
                szeVar.m186778r((char) 254);
            }
        } else if (iM218473a == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m219842g(szeVar, sb);
            }
            if (szeVar.m186769i()) {
                szeVar.m186778r((char) 254);
            }
            szeVar.f167052f--;
        } else {
            if (length2 != 0) {
                qkq0.m175383a("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                m219842g(szeVar, sb);
            }
            if (iM218473a > 0 || szeVar.m186769i()) {
                szeVar.m186778r((char) 254);
            }
        }
        szeVar.m186775o(0);
    }
}
