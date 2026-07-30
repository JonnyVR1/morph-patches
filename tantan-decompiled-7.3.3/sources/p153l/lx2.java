package p153l;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes.dex */
public final class lx2 {

    /* JADX INFO: renamed from: d */
    public static final nri0 f133879d;

    /* JADX INFO: renamed from: e */
    public static final String f133880e;

    /* JADX INFO: renamed from: f */
    public static final String f133881f;

    /* JADX INFO: renamed from: g */
    public static final lx2 f133882g;

    /* JADX INFO: renamed from: h */
    public static final lx2 f133883h;

    /* JADX INFO: renamed from: a */
    public final boolean f133884a;

    /* JADX INFO: renamed from: b */
    public final int f133885b;

    /* JADX INFO: renamed from: c */
    public final nri0 f133886c;

    /* JADX INFO: renamed from: l.lx2$a */
    public static final class C18480a {

        /* JADX INFO: renamed from: a */
        public boolean f133887a;

        /* JADX INFO: renamed from: b */
        public int f133888b;

        /* JADX INFO: renamed from: c */
        public nri0 f133889c;

        public C18480a() {
            m156141c(lx2.m156133e(Locale.getDefault()));
        }

        /* JADX INFO: renamed from: b */
        public static lx2 m156139b(boolean z) {
            return z ? lx2.f133883h : lx2.f133882g;
        }

        /* JADX INFO: renamed from: a */
        public lx2 m156140a() {
            return (this.f133888b == 2 && this.f133889c == lx2.f133879d) ? m156139b(this.f133887a) : new lx2(this.f133887a, this.f133888b, this.f133889c);
        }

        /* JADX INFO: renamed from: c */
        public final void m156141c(boolean z) {
            this.f133887a = z;
            this.f133889c = lx2.f133879d;
            this.f133888b = 2;
        }
    }

    /* JADX INFO: renamed from: l.lx2$b */
    public static class C18481b {

        /* JADX INFO: renamed from: f */
        public static final byte[] f133890f = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f133891a;

        /* JADX INFO: renamed from: b */
        public final boolean f133892b;

        /* JADX INFO: renamed from: c */
        public final int f133893c;

        /* JADX INFO: renamed from: d */
        public int f133894d;

        /* JADX INFO: renamed from: e */
        public char f133895e;

        static {
            for (int i = 0; i < 1792; i++) {
                f133890f[i] = Character.getDirectionality(i);
            }
        }

        public C18481b(CharSequence charSequence, boolean z) {
            this.f133891a = charSequence;
            this.f133892b = z;
            this.f133893c = charSequence.length();
        }

        /* JADX INFO: renamed from: c */
        public static byte m156142c(char c) {
            return c < 1792 ? f133890f[c] : Character.getDirectionality(c);
        }

        /* JADX INFO: renamed from: a */
        public byte m156143a() {
            char cCharAt = this.f133891a.charAt(this.f133894d - 1);
            this.f133895e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f133891a, this.f133894d);
                this.f133894d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f133894d--;
            byte bM156142c = m156142c(this.f133895e);
            if (this.f133892b) {
                char c = this.f133895e;
                if (c == '>') {
                    return m156149h();
                }
                if (c == ';') {
                    return m156147f();
                }
            }
            return bM156142c;
        }

        /* JADX INFO: renamed from: b */
        public byte m156144b() {
            char cCharAt = this.f133891a.charAt(this.f133894d);
            this.f133895e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f133891a, this.f133894d);
                this.f133894d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f133894d++;
            byte bM156142c = m156142c(this.f133895e);
            if (this.f133892b) {
                char c = this.f133895e;
                if (c == '<') {
                    return m156150i();
                }
                if (c == '&') {
                    return m156148g();
                }
            }
            return bM156142c;
        }

        /* JADX INFO: renamed from: d */
        public int m156145d() {
            this.f133894d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f133894d < this.f133893c && i == 0) {
                byte bM156144b = m156144b();
                if (bM156144b != 0) {
                    if (bM156144b == 1 || bM156144b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bM156144b != 9) {
                        switch (bM156144b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f133894d > 0) {
                switch (m156143a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                    default:
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public int m156146e() {
            this.f133894d = this.f133893c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f133894d > 0) {
                    byte bM156143a = m156143a();
                    if (bM156143a == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bM156143a == 1 || bM156143a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bM156143a != 9) {
                        switch (bM156143a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        /* JADX INFO: renamed from: f */
        public final byte m156147f() {
            char cCharAt;
            int i = this.f133894d;
            do {
                int i2 = this.f133894d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f133891a;
                int i3 = i2 - 1;
                this.f133894d = i3;
                cCharAt = charSequence.charAt(i3);
                this.f133895e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f133894d = i;
            this.f133895e = ';';
            return HttpTokens.CARRIAGE_RETURN;
        }

        /* JADX INFO: renamed from: g */
        public final byte m156148g() {
            char cCharAt;
            do {
                int i = this.f133894d;
                if (i >= this.f133893c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f133891a;
                this.f133894d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f133895e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* JADX INFO: renamed from: h */
        public final byte m156149h() {
            char cCharAt;
            int i = this.f133894d;
            while (true) {
                int i2 = this.f133894d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f133891a;
                int i3 = i2 - 1;
                this.f133894d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f133895e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f133894d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f133891a;
                        int i5 = i4 - 1;
                        this.f133894d = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.f133895e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f133894d = i;
            this.f133895e = '>';
            return HttpTokens.CARRIAGE_RETURN;
        }

        /* JADX INFO: renamed from: i */
        public final byte m156150i() {
            char cCharAt;
            int i = this.f133894d;
            while (true) {
                int i2 = this.f133894d;
                if (i2 >= this.f133893c) {
                    this.f133894d = i;
                    this.f133895e = '<';
                    return HttpTokens.CARRIAGE_RETURN;
                }
                CharSequence charSequence = this.f133891a;
                this.f133894d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f133895e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f133894d;
                        if (i3 >= this.f133893c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f133891a;
                        this.f133894d = i3 + 1;
                        cCharAt = charSequence2.charAt(i3);
                        this.f133895e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        nri0 nri0Var = ori0.f148710c;
        f133879d = nri0Var;
        f133880e = Character.toString((char) 8206);
        f133881f = Character.toString((char) 8207);
        f133882g = new lx2(false, 2, nri0Var);
        f133883h = new lx2(true, 2, nri0Var);
    }

    public lx2(boolean z, int i, nri0 nri0Var) {
        this.f133884a = z;
        this.f133885b = i;
        this.f133886c = nri0Var;
    }

    /* JADX INFO: renamed from: a */
    public static int m156130a(CharSequence charSequence) {
        return new C18481b(charSequence, false).m156145d();
    }

    /* JADX INFO: renamed from: b */
    public static int m156131b(CharSequence charSequence) {
        return new C18481b(charSequence, false).m156146e();
    }

    /* JADX INFO: renamed from: c */
    public static lx2 m156132c() {
        return new C18480a().m156140a();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m156133e(Locale locale) {
        return lsi0.m155697a(locale) == 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m156134d() {
        return (this.f133885b & 2) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final String m156135f(CharSequence charSequence, nri0 nri0Var) {
        boolean zIsRtl = nri0Var.isRtl(charSequence, 0, charSequence.length());
        if (!this.f133884a && (zIsRtl || m156131b(charSequence) == 1)) {
            return f133880e;
        }
        if (this.f133884a) {
            return (!zIsRtl || m156131b(charSequence) == -1) ? f133881f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final String m156136g(CharSequence charSequence, nri0 nri0Var) {
        boolean zIsRtl = nri0Var.isRtl(charSequence, 0, charSequence.length());
        if (!this.f133884a && (zIsRtl || m156130a(charSequence) == 1)) {
            return f133880e;
        }
        if (this.f133884a) {
            return (!zIsRtl || m156130a(charSequence) == -1) ? f133881f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m156137h(CharSequence charSequence) {
        return m156138i(charSequence, this.f133886c, true);
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m156138i(CharSequence charSequence, nri0 nri0Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = nri0Var.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m156134d() && z) {
            spannableStringBuilder.append((CharSequence) m156136g(charSequence, zIsRtl ? ori0.f148709b : ori0.f148708a));
        }
        if (zIsRtl != this.f133884a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m156135f(charSequence, zIsRtl ? ori0.f148709b : ori0.f148708a));
        }
        return spannableStringBuilder;
    }
}
