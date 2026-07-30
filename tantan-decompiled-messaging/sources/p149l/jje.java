package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class jje implements pze {
    /* JADX INFO: renamed from: b */
    public static void m141797b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            j2l.m139469e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m141798c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            qkq0.m175383a("StringBuilder must not be empty");
            return null;
        }
        int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m141799e(sze szeVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                szeVar.m186775o(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                szeVar.m186776p();
                int iM218473a = szeVar.m186767g().m218473a() - szeVar.m186761a();
                int iM186766f = szeVar.m186766f();
                if (iM186766f > iM218473a) {
                    szeVar.m186777q(szeVar.m186761a() + 1);
                    iM218473a = szeVar.m186767g().m218473a() - szeVar.m186761a();
                }
                if (iM186766f <= iM218473a && iM218473a <= 2) {
                    szeVar.m186775o(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strM141798c = m141798c(charSequence, 0);
            if (szeVar.m186769i() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                szeVar.m186777q(szeVar.m186761a() + i);
                if (szeVar.m186767g().m218473a() - szeVar.m186761a() >= 3) {
                    szeVar.m186777q(szeVar.m186761a() + strM141798c.length());
                    z = false;
                }
            }
            if (z) {
                szeVar.m186771k();
                szeVar.f167052f -= i;
            } else {
                szeVar.m186779s(strM141798c);
            }
            szeVar.m186775o(0);
        } catch (Throwable th) {
            szeVar.m186775o(0);
            throw th;
        }
    }

    @Override // p149l.pze
    /* JADX INFO: renamed from: a */
    public void mo121015a(sze szeVar) {
        StringBuilder sb = new StringBuilder();
        while (szeVar.m186769i()) {
            m141797b(szeVar.m186763c(), sb);
            szeVar.f167052f++;
            if (sb.length() >= 4) {
                szeVar.m186779s(m141798c(sb, 0));
                sb.delete(0, 4);
                if (j2l.m139478n(szeVar.m186764d(), szeVar.f167052f, m141800d()) != m141800d()) {
                    szeVar.m186775o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m141799e(szeVar, sb);
    }

    /* JADX INFO: renamed from: d */
    public int m141800d() {
        return 4;
    }
}
