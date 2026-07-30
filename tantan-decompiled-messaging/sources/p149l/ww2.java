package p149l;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes.dex */
public final class ww2 {

    /* JADX INFO: renamed from: d */
    public static final nii0 f188305d;

    /* JADX INFO: renamed from: e */
    public static final String f188306e;

    /* JADX INFO: renamed from: f */
    public static final String f188307f;

    /* JADX INFO: renamed from: g */
    public static final ww2 f188308g;

    /* JADX INFO: renamed from: h */
    public static final ww2 f188309h;

    /* JADX INFO: renamed from: a */
    public final boolean f188310a;

    /* JADX INFO: renamed from: b */
    public final int f188311b;

    /* JADX INFO: renamed from: c */
    public final nii0 f188312c;

    /* JADX INFO: renamed from: l.ww2$a */
    public static final class C20978a {

        /* JADX INFO: renamed from: a */
        public boolean f188313a;

        /* JADX INFO: renamed from: b */
        public int f188314b;

        /* JADX INFO: renamed from: c */
        public nii0 f188315c;

        public C20978a() {
            m205830c(ww2.m205822e(Locale.getDefault()));
        }

        /* JADX INFO: renamed from: b */
        public static ww2 m205828b(boolean z) {
            return z ? ww2.f188309h : ww2.f188308g;
        }

        /* JADX INFO: renamed from: a */
        public ww2 m205829a() {
            return (this.f188314b == 2 && this.f188315c == ww2.f188305d) ? m205828b(this.f188313a) : new ww2(this.f188313a, this.f188314b, this.f188315c);
        }

        /* JADX INFO: renamed from: c */
        public final void m205830c(boolean z) {
            this.f188313a = z;
            this.f188315c = ww2.f188305d;
            this.f188314b = 2;
        }
    }

    /* JADX INFO: renamed from: l.ww2$b */
    public static class C20979b {

        /* JADX INFO: renamed from: f */
        public static final byte[] f188316f = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f188317a;

        /* JADX INFO: renamed from: b */
        public final boolean f188318b;

        /* JADX INFO: renamed from: c */
        public final int f188319c;

        /* JADX INFO: renamed from: d */
        public int f188320d;

        /* JADX INFO: renamed from: e */
        public char f188321e;

        static {
            for (int i = 0; i < 1792; i++) {
                f188316f[i] = Character.getDirectionality(i);
            }
        }

        public C20979b(CharSequence charSequence, boolean z) {
            this.f188317a = charSequence;
            this.f188318b = z;
            this.f188319c = charSequence.length();
        }

        /* JADX INFO: renamed from: c */
        public static byte m205831c(char c) {
            return c < 1792 ? f188316f[c] : Character.getDirectionality(c);
        }

        /* JADX INFO: renamed from: a */
        public byte m205832a() {
            char cCharAt = this.f188317a.charAt(this.f188320d - 1);
            this.f188321e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f188317a, this.f188320d);
                this.f188320d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f188320d--;
            byte bM205831c = m205831c(this.f188321e);
            if (this.f188318b) {
                char c = this.f188321e;
                if (c == '>') {
                    return m205838h();
                }
                if (c == ';') {
                    return m205836f();
                }
            }
            return bM205831c;
        }

        /* JADX INFO: renamed from: b */
        public byte m205833b() {
            char cCharAt = this.f188317a.charAt(this.f188320d);
            this.f188321e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f188317a, this.f188320d);
                this.f188320d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f188320d++;
            byte bM205831c = m205831c(this.f188321e);
            if (this.f188318b) {
                char c = this.f188321e;
                if (c == '<') {
                    return m205839i();
                }
                if (c == '&') {
                    return m205837g();
                }
            }
            return bM205831c;
        }

        /* JADX INFO: renamed from: d */
        public int m205834d() {
            this.f188320d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f188320d < this.f188319c && i == 0) {
                byte bM205833b = m205833b();
                if (bM205833b != 0) {
                    if (bM205833b == 1 || bM205833b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bM205833b != 9) {
                        switch (bM205833b) {
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
            while (this.f188320d > 0) {
                switch (m205832a()) {
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
        public int m205835e() {
            this.f188320d = this.f188319c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f188320d > 0) {
                    byte bM205832a = m205832a();
                    if (bM205832a == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bM205832a == 1 || bM205832a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bM205832a != 9) {
                        switch (bM205832a) {
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
        public final byte m205836f() {
            char cCharAt;
            int i = this.f188320d;
            do {
                int i2 = this.f188320d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f188317a;
                int i3 = i2 - 1;
                this.f188320d = i3;
                cCharAt = charSequence.charAt(i3);
                this.f188321e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f188320d = i;
            this.f188321e = ';';
            return HttpTokens.CARRIAGE_RETURN;
        }

        /* JADX INFO: renamed from: g */
        public final byte m205837g() {
            char cCharAt;
            do {
                int i = this.f188320d;
                if (i >= this.f188319c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f188317a;
                this.f188320d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f188321e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* JADX INFO: renamed from: h */
        public final byte m205838h() {
            char cCharAt;
            int i = this.f188320d;
            while (true) {
                int i2 = this.f188320d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f188317a;
                int i3 = i2 - 1;
                this.f188320d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f188321e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f188320d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f188317a;
                        int i5 = i4 - 1;
                        this.f188320d = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.f188321e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f188320d = i;
            this.f188321e = '>';
            return HttpTokens.CARRIAGE_RETURN;
        }

        /* JADX INFO: renamed from: i */
        public final byte m205839i() {
            char cCharAt;
            int i = this.f188320d;
            while (true) {
                int i2 = this.f188320d;
                if (i2 >= this.f188319c) {
                    this.f188320d = i;
                    this.f188321e = '<';
                    return HttpTokens.CARRIAGE_RETURN;
                }
                CharSequence charSequence = this.f188317a;
                this.f188320d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f188321e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f188320d;
                        if (i3 >= this.f188319c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f188317a;
                        this.f188320d = i3 + 1;
                        cCharAt = charSequence2.charAt(i3);
                        this.f188321e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        nii0 nii0Var = oii0.f144127c;
        f188305d = nii0Var;
        f188306e = Character.toString((char) 8206);
        f188307f = Character.toString((char) 8207);
        f188308g = new ww2(false, 2, nii0Var);
        f188309h = new ww2(true, 2, nii0Var);
    }

    public ww2(boolean z, int i, nii0 nii0Var) {
        this.f188310a = z;
        this.f188311b = i;
        this.f188312c = nii0Var;
    }

    /* JADX INFO: renamed from: a */
    public static int m205819a(CharSequence charSequence) {
        return new C20979b(charSequence, false).m205834d();
    }

    /* JADX INFO: renamed from: b */
    public static int m205820b(CharSequence charSequence) {
        return new C20979b(charSequence, false).m205835e();
    }

    /* JADX INFO: renamed from: c */
    public static ww2 m205821c() {
        return new C20978a().m205829a();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m205822e(Locale locale) {
        return lji0.m149981a(locale) == 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m205823d() {
        return (this.f188311b & 2) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final String m205824f(CharSequence charSequence, nii0 nii0Var) {
        boolean zIsRtl = nii0Var.isRtl(charSequence, 0, charSequence.length());
        if (!this.f188310a && (zIsRtl || m205820b(charSequence) == 1)) {
            return f188306e;
        }
        if (this.f188310a) {
            return (!zIsRtl || m205820b(charSequence) == -1) ? f188307f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final String m205825g(CharSequence charSequence, nii0 nii0Var) {
        boolean zIsRtl = nii0Var.isRtl(charSequence, 0, charSequence.length());
        if (!this.f188310a && (zIsRtl || m205819a(charSequence) == 1)) {
            return f188306e;
        }
        if (this.f188310a) {
            return (!zIsRtl || m205819a(charSequence) == -1) ? f188307f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m205826h(CharSequence charSequence) {
        return m205827i(charSequence, this.f188312c, true);
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m205827i(CharSequence charSequence, nii0 nii0Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = nii0Var.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m205823d() && z) {
            spannableStringBuilder.append((CharSequence) m205825g(charSequence, zIsRtl ? oii0.f144126b : oii0.f144125a));
        }
        if (zIsRtl != this.f188310a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m205824f(charSequence, zIsRtl ? oii0.f144126b : oii0.f144125a));
        }
        return spannableStringBuilder;
    }
}
