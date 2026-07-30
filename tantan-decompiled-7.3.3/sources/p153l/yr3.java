package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class yr3 implements t0f {
    /* JADX INFO: renamed from: d */
    public static String m217148d(CharSequence charSequence, int i) {
        int iCharAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    /* JADX INFO: renamed from: g */
    public static void m217149g(w0f w0fVar, StringBuilder sb) {
        w0fVar.m204161s(m217148d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // p153l.t0f
    /* JADX INFO: renamed from: a */
    public void mo158010a(w0f w0fVar) {
        StringBuilder sb = new StringBuilder();
        while (w0fVar.m204151i()) {
            char cM204145c = w0fVar.m204145c();
            w0fVar.f186568f++;
            int iMo187628c = mo187628c(cM204145c, sb);
            int iM204143a = w0fVar.m204143a() + ((sb.length() / 3) << 1);
            w0fVar.m204159q(iM204143a);
            int iM136421a = w0fVar.m204149g().m136421a() - iM204143a;
            if (!w0fVar.m204151i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iM136421a < 2 || iM136421a > 2)) {
                    iMo187628c = m217150b(w0fVar, sb, sb2, iMo187628c);
                }
                while (sb.length() % 3 == 1 && ((iMo187628c <= 3 && iM136421a != 1) || iMo187628c > 3)) {
                    iMo187628c = m217150b(w0fVar, sb, sb2, iMo187628c);
                }
                break;
            }
            if (sb.length() % 3 == 0 && z4l.m218606n(w0fVar.m204146d(), w0fVar.f186568f, mo187629e()) != mo187629e()) {
                w0fVar.m204157o(0);
                break;
            }
        }
        mo196513f(w0fVar, sb);
    }

    /* JADX INFO: renamed from: b */
    public final int m217150b(w0f w0fVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        w0fVar.f186568f--;
        int iMo187628c = mo187628c(w0fVar.m204145c(), sb2);
        w0fVar.m204153k();
        return iMo187628c;
    }

    /* JADX INFO: renamed from: c */
    public int mo187628c(char c, StringBuilder sb) {
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
            return mo187628c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    /* JADX INFO: renamed from: e */
    public int mo187629e() {
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public void mo196513f(w0f w0fVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iM204143a = w0fVar.m204143a() + length;
        w0fVar.m204159q(iM204143a);
        int iM136421a = w0fVar.m204149g().m136421a() - iM204143a;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m217149g(w0fVar, sb);
            }
            if (w0fVar.m204151i()) {
                w0fVar.m204160r((char) 254);
            }
        } else if (iM136421a == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m217149g(w0fVar, sb);
            }
            if (w0fVar.m204151i()) {
                w0fVar.m204160r((char) 254);
            }
            w0fVar.f186568f--;
        } else {
            if (length2 != 0) {
                wtq0.m207906a("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                m217149g(w0fVar, sb);
            }
            if (iM136421a > 0 || w0fVar.m204151i()) {
                w0fVar.m204160r((char) 254);
            }
        }
        w0fVar.m204157o(0);
    }
}
