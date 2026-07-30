package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class nke implements t0f {
    /* JADX INFO: renamed from: b */
    public static void m163597b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            z4l.m218597e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m163598c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            wtq0.m207906a("StringBuilder must not be empty");
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
    public static void m163599e(w0f w0fVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                w0fVar.m204157o(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                w0fVar.m204158p();
                int iM136421a = w0fVar.m204149g().m136421a() - w0fVar.m204143a();
                int iM204148f = w0fVar.m204148f();
                if (iM204148f > iM136421a) {
                    w0fVar.m204159q(w0fVar.m204143a() + 1);
                    iM136421a = w0fVar.m204149g().m136421a() - w0fVar.m204143a();
                }
                if (iM204148f <= iM136421a && iM136421a <= 2) {
                    w0fVar.m204157o(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strM163598c = m163598c(charSequence, 0);
            if (w0fVar.m204151i() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                w0fVar.m204159q(w0fVar.m204143a() + i);
                if (w0fVar.m204149g().m136421a() - w0fVar.m204143a() >= 3) {
                    w0fVar.m204159q(w0fVar.m204143a() + strM163598c.length());
                    z = false;
                }
            }
            if (z) {
                w0fVar.m204153k();
                w0fVar.f186568f -= i;
            } else {
                w0fVar.m204161s(strM163598c);
            }
            w0fVar.m204157o(0);
        } catch (Throwable th) {
            w0fVar.m204157o(0);
            throw th;
        }
    }

    @Override // p153l.t0f
    /* JADX INFO: renamed from: a */
    public void mo158010a(w0f w0fVar) {
        StringBuilder sb = new StringBuilder();
        while (w0fVar.m204151i()) {
            m163597b(w0fVar.m204145c(), sb);
            w0fVar.f186568f++;
            if (sb.length() >= 4) {
                w0fVar.m204161s(m163598c(sb, 0));
                sb.delete(0, 4);
                if (z4l.m218606n(w0fVar.m204146d(), w0fVar.f186568f, m163600d()) != m163600d()) {
                    w0fVar.m204157o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m163599e(w0fVar, sb);
    }

    /* JADX INFO: renamed from: d */
    public int m163600d() {
        return 4;
    }
}
